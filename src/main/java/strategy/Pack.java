package strategy;

public class Pack {

    private float freightCost;

    public float getFreightCost(){
        return freightCost;
    }

    public void calculateFreightByDistance(float distance) {
        CalculateShipping calculateShipping = new CalculateShipping(distance);
        this.freightCost = calculateShipping.calculate(new FreightByDistance());
    }

    public void calculateFreightByDistanceAndVolume(float distance, float volume) {
        CalculateShipping calculateShipping = new CalculateShipping(distance, volume);
        this.freightCost = calculateShipping.calculate(new FreightByDistanceAndVolume());
    }

    public void calculateFreightByDistanceAndWeightAndVolume(float distance, float weight, float volume) {
        CalculateShipping calculateShipping = new CalculateShipping(distance, weight, volume);
        this.freightCost = calculateShipping.calculate(new FreightByDistanceAndWeightAndVolume());
    }
}
