package strategy;

public class CalculateShipping {

    private float distance;
    private float weight;
    private float volume;

    public CalculateShipping(float distance, float weight) {
        this.distance = distance;
        this.weight = weight;
    }

    public CalculateShipping(float distance, float weight, float volume) {
        this.distance = distance;
        this.volume = volume;
        this.weight = weight;
    }

    public CalculateShipping(float distance) {
        this.distance = distance;
    }

    public float calculate(Operation operation){
        return operation.calculate(distance, weight, volume);
    }
}
