import java.util.HashMap;
import java.util.Map;

class Room {
    int beds;
    int size;
    double price;

    Room(int beds, int size, double price) {
        this.beds = beds;
        this.size = size;
        this.price = price;
    }
}

class RoomInventory {
    Map<String, Integer> availability = new HashMap<>();

    RoomInventory() {
        availability.put("Single", 5);
        availability.put("Double", 3);
        availability.put("Suite", 2);
    }

    Map<String, Integer> getRoomAvailability() {
        return availability;
    }
}

class RoomSearchService {

    void searchAvailableRooms(RoomInventory inventory,
                              Room single,
                              Room doubleRoom,
                              Room suite) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (availability.get("Single") > 0) {
            System.out.println("Single Room:");
            System.out.println("Beds: " + single.beds);
            System.out.println("Size: " + single.size + " sqft");
            System.out.println("Price per night: " + single.price);
            System.out.println("Available Rooms: " + availability.get("Single") + "\n");
        }

        if (availability.get("Double") > 0) {
            System.out.println("Double Room:");
            System.out.println("Beds: " + doubleRoom.beds);
            System.out.println("Size: " + doubleRoom.size + " sqft");
            System.out.println("Price per night: " + doubleRoom.price);
            System.out.println("Available Rooms: " + availability.get("Double") + "\n");
        }

        if (availability.get("Suite") > 0) {
            System.out.println("Suite Room:");
            System.out.println("Beds: " + suite.beds);
            System.out.println("Size: " + suite.size + " sqft");
            System.out.println("Price per night: " + suite.price);
            System.out.println("Available Rooms: " + availability.get("Suite"));
        }
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        Room single = new Room(1, 250, 1500.0);
        Room doubleRoom = new Room(2, 400, 2500.0);
        Room suite = new Room(3, 750, 5000.0);

        RoomInventory inventory = new RoomInventory();

        RoomSearchService service = new RoomSearchService();
        service.searchAvailableRooms(inventory, single, doubleRoom, suite);
    }
}