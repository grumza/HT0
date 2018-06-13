package houseprojector;

public class Lamp {
	private int intensity;

    public Lamp(int intensity) {
        this.intensity = intensity;
    }

    public int getIntensity() {
        return intensity;
    } 

    @Override
    public String toString() {
        return intensity + " lm";
    }    
}
