package Inheritance;

public class Daging extends Food{
    private String type;

    public Daging(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
