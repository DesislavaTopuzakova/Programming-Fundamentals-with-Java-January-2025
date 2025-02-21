package VehicleCatalogue_05;

public class Vehicle {
    //1. харектеристики - Fields - type, model, color, horsepower
    private String type;
    private String model;
    private String color;
    private int horsepower;

    //2. Constructor
    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    //3. Methods
    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
