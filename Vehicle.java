public class Vehicle {
    private int passengers = 5;
    private String make = "ACME make";
    private String model = "ACME model";
    private float price = 10000.0f;
    private int numWheels = 5;

    public Vehicle(){
        this.passengers = 5;
        this.make = "ACME model";
        this.model = "ACME make";
        this.price = 10000.0f;
        this.numWheels = 5;
    }

    public Vehicle(int passengers, String make, String model, float price, int numWheels){
        this.passengers = passengers;
        this.make = make;
        this.model = model;
        this.price = price;
        this.numWheels = numWheels;
    }

    public int getPassengers(){
        return this.passengers;
    }

    public void setPassengers(int passengers){
        this.passengers = passengers;
    }

    public String getMake(){
        return this.make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public void display(){
        System.out.println("Vehicle Details:");
        System.out.print("Make: "+getMake()+",");
        System.out.print("Model: "+getModel()+",");
        System.out.print("Price: "+getPrice()+",");
        System.out.print("Passengers: "+getPassengers()+",");
        System.out.println("Number of Wheels: "+getNumWheels());
    }
}

