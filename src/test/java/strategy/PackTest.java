package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PackTest {

    @Test
    void shouldCalculateFreightByDistance() {
        Pack pack = new Pack();
        pack.calculateFreightByDistance(234);
        assertEquals(30.0f, pack.getFreightCost());
    }

    @Test
    void shouldCalculateFreightByDistanceAndVolume() {
        Pack pack = new Pack();
        pack.calculateFreightByDistanceAndVolume(234, 1.2f);
        assertEquals(36.75f, pack.getFreightCost());
    }

    @Test
    void shouldCalculateFreightByDistanceAndWeightAndVolume() {
        Pack pack = new Pack();
        pack.calculateFreightByDistanceAndWeightAndVolume(234, 30.00f, 1.2f);
        assertEquals(48.00f, pack.getFreightCost());
    }
}
