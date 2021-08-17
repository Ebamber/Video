package org.github.ebamber.Video.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private final long DAYS = 10;

    @Test
    public void shouldCalculateNewReleaseCost() {
        final Double estimatedCost = 400.0;
        VideoType video = VideoType.NEW_RELEASES;

        assertEquals(estimatedCost, video.calculatePrice(DAYS));
    }

    @Test
    public void shouldCalculateRegularFilmsCost() {
        final Double estimatedCost = 240.0;
        VideoType video = VideoType.REGULAR_FILMS;

        assertEquals(estimatedCost, video.calculatePrice(DAYS));
    }

    @Test
    public void shouldCalculateOldFilmsCost() {
        final Double estimatedCost = 180.0;
        VideoType video = VideoType.OLD_FILMS;

        assertEquals(estimatedCost, video.calculatePrice(DAYS));
    }

    @Test
    public void shouldCalculateInvalidRecordCost() {
        final Double estimatedCost = 0.0;
        VideoType video = VideoType.BAD_RECORD;

        assertEquals(estimatedCost, video.calculatePrice(DAYS));
    }
}
