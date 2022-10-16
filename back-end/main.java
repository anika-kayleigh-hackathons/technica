import java.util.*;

public class main {
    public static void main(String argc[]) {
        ShelterList<Shelter> linkedList = new ShelterList<>();
        
        Location firstShelter = new Location("12 Tobey Rd, Bloomfield, CT, 06002, USA" , (float) -72.71006115734929, (float) 41.8087767833991);
        Location secondShelter = new Location("39 Sunrise Terrace, Monroe, CT 06468, USA", (float) -73.18441599290092, (float) 41.380725997211755);
        Location thirdShelter = new Location("3120 Hale Rd #1, Manchester, CT 06042, USA", (float) -72.53010996269533, (float) 41.8096299943559);
        
        Shelter dsr = new Shelter("DogStarRescue", "12 Tobey Rd, Bloomfield, CT, 06002, USA" , 12, 8);
        Shelter fffr = new Shelter("Furry Friends Foster & Rescue", "39 Sunrise Terrace, Monroe, CT 06468, USA", 4, 16);
        Shelter sadr = new Shelter("Save All Dogs Rescue", "120 Hale Rd #1, Manchester, CT 06042", 48, 48);
        
        linkedList.addLast(dsr);
        linkedList.addLast(fffr);
        linkedList.addLast(sadr);
        
        dsr.setLocation(firstShelter.getAddress(), firstShelter.getLat(), firstShelter.getLon());
        fffr.setLocation(secondShelter.getAddress(), secondShelter.getLat(), secondShelter.getLon());
        sadr.setLocation(thirdShelter.getAddress(), thirdShelter.getLat(), thirdShelter.getLon());
        
        ArrayList<Shelter> availableToDSR = findAvailable(linkedList, dsr, 30);
        
        for (int i = 0; i < availableToDSR.size(); i++) {
            System.out.println(availableToDSR.get(i));
        }
        
        
        
        //dog rescue connecticut (do three), make from shelter
        //first: DogStarRescue
        //second: Furry Friends Foster & Rescue
        //third: Save All Dogs Rescue
        
        
    }
    
    public static ArrayList<Shelter> findAvailable(ShelterList<Shelter> shelterList, Shelter userShelter, int dist) {
        ArrayList<Shelter> available = new ArrayList<>();

        Location userLocation = userShelter.getLocation();
        float[][] bounds = userLocation.getBounds(dist);
        for (int i = 0; i < shelterList.length(); i++) {
            Shelter currShelter = shelterList.get(i);
            Location currLocation = currShelter.getLocation();

            if (inBounds(bounds, currLocation)) {
                if (currShelter.hasAvailable()) {
                    available.add(currShelter);
                }
            }
        }

        return available;
    }

    private static boolean inBounds(float[][] target, Location shelterLocation) {
        float shelterLat = shelterLocation.getLat();
        float shelterLon = shelterLocation.getLon();

        boolean inRange = shelterLat > target[0][0] && shelterLat < target[3][0];
        boolean inHeight = shelterLon > target[0][1] && shelterLat < target[1][1];

        return inRange && inHeight;
    }
    
}

