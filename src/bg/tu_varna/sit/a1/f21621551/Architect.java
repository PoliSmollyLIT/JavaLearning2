package bg.tu_varna.sit.a1.f21621551;

public class Architect {
    private final String firstName;
    private final String lastName;
    public Architect(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Architect " + firstName + " " + lastName;
    }
    
    
}
