import java.util.*;

public class main {
    public static void main(String argc[]) {
        ShelterList<Integer> linkedList;
        
        
        Location firstShelter = new Location("12 Tobey Rd, Bloomfield, CT, 06002, USA" , -72.71006115734929, 41.8087767833991);
        Location secondShelter = new Location("39 Sunrise Terrace, Monroe, CT 06468, USA", -73.18441599290092, 41.380725997211755);
        Location thirdShelter = new Location("3120 Hale Rd #1, Manchester, CT 06042, USA", -72.53010996269533, 41.8096299943559);
        
        Shelter.setLocation( -72.71006115734929, 41.8087767833991);
        Shelter.setLocation( -73.18441599290092, 41.380725997211755);
        Shelter.setLocation(-72.53010996269533, 41.8096299943559);
        
        Shelter dsr = new Shelter("DogStarRescue", "12 Tobey Rd, Bloomfield, CT, 06002, USA" , 12, 8);
        Shelter fffr = new Shelter("Furry Friends Foster & Rescue", "39 Sunrise Terrace, Monroe, CT 06468, USA", 4, 16);
        Shelter sadr = new Shelter("Save All Dogs Rescue", "120 Hale Rd #1, Manchester, CT 06042", 2, 48);
        
        
        
        //dog rescue connecticut (do three), make from shelter
        //first: DogStarRescue
        //second: Furry Friends Foster & Rescue
        //third: Save All Dogs Rescue
        
        
    }
    
    public Shelter[] findAvailable() {
        for (int i = 0; i < )
    }
    

}

