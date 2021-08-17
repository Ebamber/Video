package org.github.ebamber.Video.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum VideoType implements Calculable {

    NEW_RELEASES("NR", PriceType.PREMIUM) {
        @Override
        public Double calculatePrice(final long days){
            Double priceVariable = getPriceType().getPrice();
            return priceVariable * days;
        }
    },
    REGULAR_FILMS("RF", PriceType.BASIC) {
        @Override
        public Double calculatePrice(final long days){
            Double priceVariable = getPriceType().getPrice();
            return priceVariable + (priceVariable * getDaysCalculable(days));
        }

        private long getDaysCalculable(long days) {
            return days > 3 ? days - 3 : 0;
        }
    },
    OLD_FILMS("OF", PriceType.BASIC) {
        @Override
        public Double calculatePrice(final long days){
            Double priceVariable = getPriceType().getPrice();
            return priceVariable + (priceVariable * getDaysCalculable(days));
        }

        private long getDaysCalculable(long days) {
            return days > 5 ? days - 5 : 0;
        }
    },
    BAD_RECORD("", PriceType.BASIC) {
        @Override
        public Double calculatePrice(final long days){
           return 0.0;
        }
    };

    private final String shortName;
    private final PriceType priceType;

    public static VideoType fromShortName(String shortName) {
        switch(shortName) {
            case "NR": return NEW_RELEASES;
            case "RF": return REGULAR_FILMS;
            case "OF": return OLD_FILMS;
            default: return BAD_RECORD;
        }
    }
}
