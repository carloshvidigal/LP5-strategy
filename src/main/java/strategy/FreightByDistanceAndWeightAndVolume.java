package strategy;

public class FreightByDistanceAndWeightAndVolume implements Operation{

    public float calculate(float distance, float weight, float volume) {
        return (distance + (weight*3) + (50*volume))/8;
    }
}
