package org.github.ebamber.Video.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.github.ebamber.Video.domain.Video;
import org.github.ebamber.Video.service.VideoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(VideoRentalController.class)
public class VideoRentalControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private VideoRepository service;

    @Test
    public void shouldReturnEntriesGivenAName() throws Exception {
        String NAME = "Placeholder";
        Video expected = new Video("2f9a2d9c-ea44-458b-ba3d-378b2b5aa4fa",
                NAME, "NR", 1628200181, 1629064181);

        List<Video> expectedList = Arrays.asList(expected);

        given(service.getVideosByName(NAME)).willReturn(expectedList);

        mvc.perform(get("/video/" + NAME)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].id", is(expected.getId().toString())))
                .andExpect(jsonPath("$[0].name", is(expected.getName())))
                .andExpect(jsonPath("$[0].videoType", is(expected.getVideoType().toString())));
    }

    @Test
    public void shouldReturnAllEntries() throws Exception {
        Video expected1 = new Video("2f9a2d9c-ea44-458b-ba3d-378b2b5aa4fa",
                "Placeholder", "NR", 1628200181, 1629064181);
        Video expected2 = new Video("467edcb0-7984-4873-bb06-15b0c6dd8980",
                "Placeholder2", "RF", 1628200181, 1629064181);
        Video expected3 = new Video("9c2755ea-f734-4798-a66c-5287eefaabe8",
                "Placeholder3", "OF", 1628200181, 1629064181);

        List<Video> expectedList = Arrays.asList(expected1, expected2, expected3);

        given(service.getVideos()).willReturn(expectedList);

        mvc.perform(get("/video/")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[0].id", is(expected1.getId().toString())))
                .andExpect(jsonPath("$[1].id", is(expected2.getId().toString())))
                .andExpect(jsonPath("$[2].id", is(expected3.getId().toString())));
    }

    @Test
    public void shouldReturnCalculatedRentCosts() throws Exception {
        String ID = "2f9a2d9c-ea44-458b-ba3d-378b2b5aa4fa";

        //the epochs are 10 days apart, we're calculating 10 days at 40 per day
        final Double estimatedCost = 400.0;

        Video expected = new Video(ID,
                "Placeholder", "NR", 1628200181, 1629064181);

        given(service.getVideoById(UUID.fromString(ID))).willReturn(expected);

        mvc.perform(get("/video/calculate/" + ID)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", is(estimatedCost)));
    }

    @Test
    public void shouldUpdateDatabaseWithNewRecord() throws Exception {
        Video expected = new Video("2f9a2d9c-ea44-458b-ba3d-378b2b5aa4fa",
                "Placeholder", "NR", 1628200181, 1629064181);

        given(service.upsertVideo(expected)).willReturn(expected);

        mvc.perform(post("/video/")
                .content(asJsonString(expected))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    private static String asJsonString(final Video video) {
        try {
            return new ObjectMapper().writeValueAsString(video);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
