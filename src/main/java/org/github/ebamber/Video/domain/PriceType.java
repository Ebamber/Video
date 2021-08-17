package org.github.ebamber.Video.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PriceType {

    PREMIUM(40.0),
    BASIC(30.0);

    private final Double price;
}
