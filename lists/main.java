import java.util.*;

public class main {
    public static void main(String argc[]) {
        ShelterList<Integer> linkedList;
        
        
        Location firstShelter = new Location("12 Tobey Rd, Bloomfield, CT, 06002, USA" , (float) -72.71006115734929, (float) 41.8087767833991);
        Location secondShelter = new Location("39 Sunrise Terrace, Monroe, CT 06468, USA", (float) -73.18441599290092, (float) 41.380725997211755);
        Location thirdShelter = new Location("3120 Hale Rd #1, Manchester, CT 06042, USA", (float) -72.53010996269533, (float) 41.8096299943559);
        
        Shelter.setLocation( (float) -72.71006115734929, (float) 41.8087767833991);
        Shelter.setLocation( (float) -73.18441599290092, (float) 41.380725997211755);
        Shelter.setLocation( (float) -72.53010996269533, (float) 41.8096299943559);
        
        Shelter dsr = new Shelter("DogStarRescue", "12 Tobey Rd, Bloomfield, CT, 06002, USA" , 12, 8);
        Shelter fffr = new Shelter("Furry Friends Foster & Rescue", "39 Sunrise Terrace, Monroe, CT 06468, USA", 4, 16);
        Shelter sadr = new Shelter("Save All Dogs Rescue", "120 Hale Rd #1, Manchester, CT 06042", 2, 48);
        
        
        
        //dog rescue connecticut (do three), make from shelter
        //first: DogStarRescue
        //second: Furry Friends Foster & Rescue
        //third: Save All Dogs Rescue
        
        
    }
    
    public Shelter[] findAvailable(ShelterList shelterList, Shelter userShelter, int dist) {
        Shelter[] available;
        
        Location userLocation = userShelter.getLocation();
        int[][] bounds = userLocation.getBounds(dist);
        for (int i = 0; i < shelterList.length(); i++) {
            Shelter currShelter = shelterList.get(i);
            Location currLocation = currShelter.getLocation();
            
            if (inBounds(bounds, currLocation)) {
                available.append(currShelter);
            }
        }
        
        return available;
    }
    
    private boolean inBounds(int[][] target, Location shelterLocation) {
        int shelterLat = shelterLocation.getLat();
        int shelterLon = shelterLocation.getLon();
        
        boolean inRange = shelterLat > target[0][0] && shelterLat < target[3][0];
        boolean inHeight = shelterLon > target[0][1] && shelterLat < target[1][1];
        
        if (inRange && inHeight) {
            return true;
        }
        
        return false;
    }
    
}

