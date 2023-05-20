package bg.tu_varna.sit.a1.f21621551.icecream;

public enum IceCreamFlavours {
    VANILLA("vanilla "),
    CHOCOLATE("chocolate"),
    MELON("melon"),
    CREAM("cream");    

    private String flavour;
    private IceCreamFlavours(String flav){
        this.flavour = flav;
    }

    public String getFlavour(){
        return this.flavour;
    }
}