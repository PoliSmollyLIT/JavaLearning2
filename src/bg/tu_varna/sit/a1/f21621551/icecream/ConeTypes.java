package bg.tu_varna.sit.a1.f21621551.icecream;

public enum ConeTypes {
    MILK_CHOCOLATE("milk chocolate"),
    DARK_CHOCOLATE("dark chocolate"),
    WHITE_CHOCOLATE("white chocolate"),
    NORMAL("normal"),
    PLASTIC("plasstic");

    private String flavour;
    private ConeTypes(String cone){
        this.flavour = cone;
    }

    public String getCone(){
        return this.flavour;
    }
}