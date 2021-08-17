package org.github.ebamber.Video.controller;

import org.github.ebamber.Video.domain.Video;
import org.github.ebamber.Video.service.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/video")
public class VideoRentalController {

    @Autowired
    private VideoRepository videoRepository;

    @PostMapping
    public Video updateEntry(@RequestBody final Video video) {
        return videoRepository.upsertVideo(video);
    }

    //This one returns a list because it's possible (though unlikely) for a name to not be unique,
    // but I still want this endpoint as opposed to an ID based one as String name is a friendlier parameter to input than UUID
    @GetMapping("/{name}")
    public List<Video> getEntriesWithName(@PathVariable final String name){
        return videoRepository.getVideosByName(name);
    }

    @GetMapping("/calculate/{id}")
    public Double getEntriesWithName(@PathVariable final UUID id){
        Video video = videoRepository.getVideoById(id);
        return video.getVideoType()
                .calculatePrice(ChronoUnit.DAYS.between(video.getOutDate().toInstant(),video.getReturnDate().toInstant()));
    }

    @GetMapping()
    public List<Video> getAllEntries(){
        return videoRepository.getVideos();
    }

}
