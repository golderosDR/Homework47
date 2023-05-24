package de.golderosDR;

import static de.golderosDR.WindCorrelationEnum.GENTLE_BREEZE;

public abstract class WeatherTools {
    private static final String GUSTY_PREFIX_TEXT = "Gusty";
    private static final String SPEED_OF_ENDING_TEXT = "with speed of %.1f km.";
    private static final String DELIMITER_TEXT = " ";


    public static String getWindDescription(double speed, boolean isGusty) {
        StringBuilder output = new StringBuilder();
        if (speed < 0) {
            throw new IllegalArgumentException("Speed is less than zero!");
        }
            if (isGusty && speed > GENTLE_BREEZE.getMaxValue()) {
                output.append(GUSTY_PREFIX_TEXT).append(DELIMITER_TEXT);
            }
            for (WindCorrelationEnum correlation : WindCorrelationEnum.values()) {
                if (speed >= correlation.getMinValue() && speed < correlation.getMaxValue()) {
                    output.append(correlation.getTitle()).append(DELIMITER_TEXT);
                }
            }
            output.append(String.format(SPEED_OF_ENDING_TEXT, speed));


        return output.toString();
    }


}
