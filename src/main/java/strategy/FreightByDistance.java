package strategy;

public class FreightByDistance implements Operation {
    public float calculate(float distance, float weight, float volume) {
        return (distance)/7.8f ;
    }
}
