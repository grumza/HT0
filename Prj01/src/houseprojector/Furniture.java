package houseprojector;

public abstract class Furniture {
	protected int area;
    protected int areaExtra;
    
    Furniture(int area){
        this.area = area;
        this.areaExtra = 0;
    }
    Furniture(int area, int areaExtra){
        this.area = area;
        this.areaExtra = areaExtra;
    }
    public abstract String getType();

    public int getArea() {
        return area;
    }

    public int getAreaExtra() {
        return areaExtra;
    }    

}
