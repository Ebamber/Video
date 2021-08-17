package org.github.ebamber.Video.service;

import org.github.ebamber.Video.domain.Video;
import org.github.ebamber.Video.generated.db.public_.Tables;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class VideoRepository {

    public static final org.github.ebamber.Video.generated.db.public_.tables.Video VIDEO = Tables.VIDEO;

    @Autowired
    DSLContext context;

    public Video getVideoById(final UUID id) {
        return context.select()
                .from(VIDEO)
                .where(VIDEO.ID.eq(id.toString()))
                .fetchSingleInto(Video.class);
    }

    public List<Video> getVideosByName(final String name) {
        return context.select()
                        .from(VIDEO)
                        .where(VIDEO.NAME.eq(name))
                        .fetchInto(Video.class);
    }

    public List<Video> getVideos() {
        return context.select()
                .from(Tables.VIDEO)
                .fetchInto(Video.class);
    }

    public Video upsertVideo(final Video video) {
        context.insertInto(VIDEO,
                        VIDEO.ID,
                        VIDEO.NAME,
                        VIDEO.TYPE,
                        VIDEO.OUTDATE,
                        VIDEO.RETURNDATE)
                .values(video.getId().toString(),
                        video.getName(),
                        video.getVideoType().getShortName(),
                        video.getOutDate().toInstant().getEpochSecond(),
                        video.getReturnDate().toInstant().getEpochSecond())
                .onDuplicateKeyUpdate()
                .set(VIDEO.NAME, video.getName())
                .set(VIDEO.TYPE, video.getVideoType().getShortName())
                .set(VIDEO.OUTDATE, video.getOutDate().toInstant().getEpochSecond())
                .set(VIDEO.RETURNDATE, video.getReturnDate().toInstant().getEpochSecond())
                .execute();

        return video;
    }

}
