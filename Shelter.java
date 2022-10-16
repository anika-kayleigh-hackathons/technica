public class Shelter extends ShelterList<Shelter>{
    private String name;
    private String address;
    private final int maxCapacity;
    private int currCapacity;
    private Location location;
    
    public Shelter(String name, String address, int maxCapacity, int currCapacity) {
        this.name = name;
        this.address = address;
        this.maxCapacity = maxCapacity;
        this.currCapacity = currCapacity;
        
    }
    
    //getters
    public String getName() {
        return name;
    }
    
    public int getCurrCapacity() {
        return currCapacity;
    }
    
    public int getMaxCapacity() {
        return maxCapacity;
    }
    
    
    //setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCurrCapacity(int currCapacity) {
        this.currCapacity = currCapacity;
    }
    
    public void setLocation(int lat, int lon) {
        this.location = new Location(lat, lon);
    }
    
    //method
    public Shelter
    
}