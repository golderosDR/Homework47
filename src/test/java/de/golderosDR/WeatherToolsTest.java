package de.golderosDR;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class WeatherToolsTest {
    @Nested
    class ForGetWindDescription {
        @ParameterizedTest
        @CsvSource({
                "10, true, 'Light Breeze with speed of 10,0 km.'",
                "0.5, true, 'Calm with speed of 0,5 km.'",
                "73, true, 'Gusty Gale with speed of 73,0 km.'",
                "73, false, 'Gale with speed of 73,0 km.'",
                "105, true, 'Gusty Violent Storm with speed of 105,0 km.'",
                "105, false, 'Violent Storm with speed of 105,0 km.'",
        })
        public void getWindDescription_Successful_Tests(double speed, boolean isGusty, String outputtedText) {
            assertEquals(outputtedText, WeatherTools.getWindDescription(speed, isGusty));
        }
        @ParameterizedTest
        @CsvSource({
                "-10, true, 'Light Breeze with speed of 10,0 km.'",
                "55, false, 'Calm with speed of 0,5 km.'",
                "73, false, 'Gusty Gale with speed of 73,0 km.'",
                "127, true, 'Gusty Violent Storm with speed of 105,0 km.'",
                "105, true, 'Violent Storm with speed of 105,0 km.'",
        })
        public void getWindDescription_Failed_Tests(double speed, boolean isGusty, String outputtedText) {
            assertNotEquals(outputtedText, WeatherTools.getWindDescription(speed, isGusty));
        }

    }

}