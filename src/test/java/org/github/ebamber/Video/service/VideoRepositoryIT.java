package org.github.ebamber.Video.service;

import org.github.ebamber.Video.domain.Video;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jooq.JooqTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

//make sure to build the project before running these tests as it's using the live h2 database for its data
@JooqTest(properties = {"spring.datasource.url=jdbc:h2:~/video", "spring.datasource.driver=org.h2.Driver",
        "spring.datasource.username=root", "spring.datasource.password=root"})
@RunWith(SpringRunner.class)
@ContextConfiguration(loader= AnnotationConfigContextLoader.class)
public class VideoRepositoryIT {

    @Configuration
    static class ContextConfiguration {

        @Bean
        public VideoRepository videoRepository() {
            return new VideoRepository();
        }
    }

    @Autowired
    private VideoRepository videoRepository;

    @Test
    public void shouldReturnInitialData() throws Exception {
        Video expected1 = new Video("2f9a2d9c-ea44-458b-ba3d-378b2b5aa4fa",
                "Placeholder", "NR", 1628200181, 1629064181);
        Video expected2 = new Video("467edcb0-7984-4873-bb06-15b0c6dd8980",
                "Placeholder2", "RF", 1628200181, 1629064181);
        Video expected3 = new Video("9c2755ea-f734-4798-a66c-5287eefaabe8",
                "Placeholder3", "OF", 1628200181, 1629064181);

        List<Video> actualList = videoRepository.getVideos();

        assertTrue(contains(expected1, actualList));
        assertTrue(contains(expected2, actualList));
        assertTrue(contains(expected3, actualList));
    }

    @Test
    public void shouldReturnById() throws Exception {
        Video expected = new Video("2f9a2d9c-ea44-458b-ba3d-378b2b5aa4fa",
                "Placeholder", "NR", 1628200181, 1629064181);

        Video actual = videoRepository.getVideoById(expected.getId());

        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getName(), actual.getName());
        assertEquals(expected.getVideoType(), actual.getVideoType());
        assertEquals(expected.getOutDate(), actual.getOutDate());
        assertEquals(expected.getReturnDate(), actual.getReturnDate());
    }

    @Test
    public void shouldReturnByName() throws Exception {
        Video expected = new Video("2f9a2d9c-ea44-458b-ba3d-378b2b5aa4fa",
                "Placeholder", "NR", 1628200181, 1629064181);

        List<Video> actualList = videoRepository.getVideosByName(expected.getName());

        assertTrue(contains(expected, actualList));
    }

    @Test
    public void shouldInsertAndReturnNewRecord() throws Exception {
        Video expected4 = new Video("c38f5967-780b-4978-925c-cd317c344023",
                "Placeholder4", "NR", 1628200181, 1629064181);

        videoRepository.upsertVideo(expected4);
        List<Video> actualList = videoRepository.getVideos();

        assertTrue(contains(expected4, actualList));
    }

    @Test
    public void shouldInsertThenUpdateAndReturnNewRecord() throws Exception {
        Video expected4 = new Video("c38f5967-780b-4978-925c-cd317c344023",
                "Placeholder4", "NR", 1628200181, 1629064181);

        videoRepository.upsertVideo(expected4);
        List<Video> actualList = videoRepository.getVideos();

        assertTrue(contains(expected4, actualList));

        Video expected5 = new Video("c38f5967-780b-4978-925c-cd317c344023",
                "Updated", "NR", 1628200181, 1629064181);

        videoRepository.upsertVideo(expected5);
        actualList = videoRepository.getVideos();

        assertTrue(contains(expected5, actualList));
        assertFalse(contains(expected4, actualList));
    }

    private boolean contains(Video expected, List<Video> actual) {
        return actual.stream()
                .anyMatch(a -> expected.getId().equals(a.getId()) && expected.getName().equals(a.getName()) && expected.getVideoType().equals(a.getVideoType())
                        && expected.getOutDate().equals(a.getOutDate()) && expected.getReturnDate().equals(a.getReturnDate()));
    }
}
