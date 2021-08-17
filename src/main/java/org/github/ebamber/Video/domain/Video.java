package org.github.ebamber.Video.domain;

import lombok.Getter;

import org.springframework.lang.Nullable;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Getter
public class Video {

    private final UUID id;
    private final String name;
    private final VideoType videoType;
    @Nullable
    private final Date outDate;
    @Nullable
    private final Date returnDate;

    public Video(final String id, final String name, final String videoType, final long outDate, final long returnDate){
        this.id = UUID.fromString(id);
        this.name = name;
        this.videoType = VideoType.fromShortName(videoType);
        this.outDate = outDate != 0 ? Date.from(Instant.ofEpochSecond(outDate)) : Date.from(Instant.now());
        this.returnDate = returnDate != 0 ? Date.from(Instant.ofEpochSecond(returnDate)) : Date.from(Instant.now());

    }

}
