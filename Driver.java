import java.util.Scanner;

public class Driver {

    Vehicle car;
    Vehicle bus;
    Vehicle eBike;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vehicle App V1.0");
        new Driver();
    }

    public Driver() {
        car = new Vehicle(5, "BYD", "PLUS", 40000, 4);
        car.display();
        bus = new Vehicle(20, "FORD", "GTX", 140000, 8);
        bus.display();
        eBike = new Vehicle(2   , "VW", "PRO", 5000, 2);
        eBike.display();
        howMuchVehicleYouNeed();
    }

    public void howMuchVehicleYouNeed() {
        System.out.println("Enter the number of passengers here:");
        int numPassengers = input.nextInt();
        int afterDivision1 = numPassengers / bus.getPassengers();//得到bus数量
        if (afterDivision1 >= 1) {
            int afterRemainder1 = numPassengers % bus.getPassengers();//上bus后还剩的人数
            if (afterRemainder1 > 0) {
                int afterDivision2 = afterRemainder1 / car.getPassengers();//得到car数量
                int afterRemainder2 = afterRemainder1 % car.getPassengers();//上car后还剩的人数
                if (afterRemainder2 > 0) {
                    int afterDivision3 = afterRemainder2 / eBike.getPassengers();//得到eBike数量
                    int afterRemainder3 = afterRemainder2 % eBike.getPassengers();//上eBike后还剩的人数
                    if (afterRemainder3 == 1) {
                        afterDivision3 = afterDivision3 + 1;
                        System.out.println("You need " + afterDivision1 + " buses, " + afterDivision2 + " cars and " + afterDivision3 + " eBikes.");
                    }
                    else {
                        System.out.println("You need " + afterDivision1 + " buses, " + afterDivision2 + " cars and " + afterDivision3 + " eBikes.");
                    }
                } else {
                    System.out.println("You need " + afterDivision1 + " buses and " + afterDivision2 + " cars.");
                }

            }
            else {
                System.out.println("You need " + afterDivision1 + " buses.");
            }

        }
        else {//不需要bus
            int afterDivision4 = numPassengers / car.getPassengers();//得到car数量
            int afterRemainder4 = numPassengers % car.getPassengers();//上car后还剩的人数
            if (afterDivision4 > 0) {
                int afterDivision5 = afterRemainder4 / eBike.getPassengers();//得到eBike数量
                int afterRemainder5 = afterRemainder4 % eBike.getPassengers();//上eBike后还剩的人数
                if (afterRemainder5 == 1) {
                    afterDivision5 = afterDivision5 + 1;
                    System.out.println("You need " + afterDivision4 + " cars and" + afterDivision5 + " eBikes.");
                }
                else {
                    System.out.println("You need " + afterDivision4 + " cars and" + afterDivision5 + " eBikes.");
                }
            }
            else {//不需要car
                int afterDivision6 = numPassengers / eBike.getPassengers();//得到eBike数量
                int afterRemainder6 = numPassengers % eBike.getPassengers();
                if (afterRemainder6 == 1) {
                    afterDivision6 = afterDivision6 + 1;
                    System.out.println("You need " + afterDivision6 + " eBikes.");
                }
                else {
                    System.out.println("You need " + afterDivision6 + " eBikes.");
                }
            }
        }
    }
}