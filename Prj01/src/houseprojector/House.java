package houseprojector;


import java.util.HashMap;

import java.util.Map;


 public class House {
    private String address;
    private String owner;
    private Map <String, Room> rooms = new HashMap <String, Room> ();
    

    public House(String address, String owner) {
        this.address = address;
        this.owner = owner;
    }

    public void addRoom(Room room) {
        rooms.put(room.getName(), room);
    }
    
    public Room getRoom(String name) {
        return rooms.get(name);
    }
    
    public void describe() {
        System.out.println ("Building");
        System.out.println ("Address: " + address);
        System.out.println ("Owner: " + owner);
        for (Map.Entry<String, Room> entry: rooms.entrySet()){
            entry.getValue().describe();
        }  
    }
}

