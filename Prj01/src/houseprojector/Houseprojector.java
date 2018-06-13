package houseprojector;

public class Houseprojector {

	public static void main(String[] args) throws Exception {
		House h = new House("Baker Street", "Sherloc Holms");
        Room r1 = new Room ("kitchen", 100, 1);
        r1.addLamp(new Lamp(100));
        r1.addLamp(new Lamp(250));
        r1.addFurniture(new Table("writing table (black)", 0));
        r1.addFurniture(new Sofa("soft and fluffy sofa ", 1, 0));
        h.addRoom(r1);
        Room r2 = new Room ("living room", 30, 4);
        h.addRoom(r2);
        h.describe();       

	}

}
