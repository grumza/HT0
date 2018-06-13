package houseprojector;

public class Sofa extends Furniture{
	private final String type = "sofa";
    String desc;

    public Sofa (String desc, int areaMin, int areaMax) {
        super(areaMin, areaMax-areaMin);
        this.desc = desc;
    }
    
    @Override
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return desc + "(area from " + area + " to " + (area + areaExtra) + " m^2)";
    }
}
