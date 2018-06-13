package houseprojector;

class Table extends Furniture{
    private final String type = "table";
    private String desc;
 public Table(String desc, int area) {
        super(area);
        this.desc = desc;
        this.area = area;
    }
    
    @Override
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return desc + " (area " + area + " m^2)";
    }
    
}
