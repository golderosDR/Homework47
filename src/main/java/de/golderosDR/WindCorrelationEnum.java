package de.golderosDR;
/*      0-1 == Calm
        1-5 == Light Air
        6-11 == Light Breeze
        12-19 == Gentle Breeze
        20-28 == Moderate Breeze
        29-38 == Fresh Breeze
        39-49 == Strong Breeze
        50-61 == Near Gale
        62-74 == Gale
        75-88 == Strong Gale
        89-102 == Storm
        103-117 == Violent Storm
        118+ == Hurricane */
public enum WindCorrelationEnum {
    CALM("Calm", 0,1),
    LIGHT_AIR("Light Air",1,6),
    LIGHT_BREEZE("Light Breeze",6,12),
    GENTLE_BREEZE("Gentle Breeze", 12,20),
    MODERATE_BREEZE("Moderate Breeze",20,29),
    FRESH_BREEZE("Fresh Breeze",29,39),
    STRONG_BREEZE("Strong Breeze",39,50),
    NEAR_GALE("Near Gale",50,62),
    GALE("Gale",62,75),
    STRONG_GALE("Strong Gale",75,89),
    STORM("Storm",89,103),
    VIOLENT_STORM("Violent Storm",103,118),
    HURRICANE("Hurricane",118,999);
private final String title;
private final int minValue;
private final int maxValue;

    WindCorrelationEnum(String title, int minValue, int maxValue) {
        this.title = title;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public String getTitle() {
        return title;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}
