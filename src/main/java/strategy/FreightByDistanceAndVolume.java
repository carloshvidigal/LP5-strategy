package strategy;

public class FreightByDistanceAndVolume implements Operation{

    public float calculate(float distance, float volume, float weight) {
        return (distance + (volume*50))/8;
    }
}
