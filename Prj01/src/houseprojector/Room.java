package houseprojector;
import java.util.ArrayList;
import java.util.List;
//the class forms the room
class Room {
    private String name;
    private int area;
    private int windowNum;
    private final static int ILLUMINATION_PER_WINDOW = 700;
     
    private List <Lamp> lamps = new ArrayList <Lamp> ();
    private List <Furniture> furniture = new ArrayList <Furniture> ();

    public Room(String name, int area, int windowNum) {
        this.name = name;
        this.area = area;
        this.windowNum = windowNum;
    }
  //method  adds and checks Lamp
    public void addLamp(Lamp lamp) throws IlluminanceTooMuchException {
        lamps.add(lamp);
        if ((calcIllumination() + lamp.getIntensity()) > 4000)
        	
        	throw new IlluminanceTooMuchException();
    }
    //method  adds and checks Furniture
    public void addFurniture(Furniture item) throws SpaceUsageTooMuchException{
        furniture.add(item);
        if(calcAreaMin()+calcAreaMax()>70){
        	throw new SpaceUsageTooMuchException();
        	}
    }
    //method that calculates light
    private int calcIllumination() {
        int sum = 0;
        sum = ILLUMINATION_PER_WINDOW * windowNum;
        for (Lamp l: lamps) {
            sum += l.getIntensity();
        }
        return sum;
    }
    //method  calculates min Area
    private int calcAreaMin() {
        int sum = 0;
        for (Furniture f: furniture) {
            sum += f.getArea();
        }
        return sum;
    }
    //method  calculates max Area
    private int calcAreaMax() {
        int sum = calcAreaMin();
        for (Furniture f: furniture) {
            sum += f.getAreaExtra();
        }
        return sum;
    }
    
    public void describe() {
        System.out.println("  Room <" + name + ">");
        System.out.println("    Illumination = " + calcIllumination() + " (" +
               windowNum + " windows, lamps " + lamps +")");
        System.out.println("    Area = " + area + " m^2 (" + "occupied " + 
               calcAreaMin() + "-" + calcAreaMax() + " m^2, guaranteed free " + 
               (area - calcAreaMax()) + " or " + (1.0*area - calcAreaMax())/area*100 +
               "% of area)"); 
        
        System.out.println("    Furniture:");
        if (furniture.isEmpty()) 
            System.out.println("      no ferniture");
        else {
            for (Furniture f: furniture) {
                System.out.println("      " + f.toString());
            }
        }
               
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getWindowNum() {
        return windowNum;

    }
  //method adds and checks Windows
    public void setWindowNum(int windowNum)throws IlluminanceTooMuchException {
        this.windowNum = windowNum;
if ((calcIllumination() + windowNum) > 4000)
        	
        	throw new IlluminanceTooMuchException();
    }   
}

