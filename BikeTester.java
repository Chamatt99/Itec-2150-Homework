import java.util.ArrayList;

	public class BikeTester {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        System.out.println(bike1);

        //name of bike 2
        Bike bike2 = new Bike();
        bike2.setNumberOfWheels(2);
        bike2.setManufacturer("Kawasaki");
        bike2.setYear(2025);
        System.out.println(bike2);

        //makes the array list
        ArrayList<Bike> bikeList = new ArrayList<>();
        bikeList.add(bike1);
        bikeList.add(bike2);

        //prints the bike array
        System.out.println("Bike List: " + bikeList);

        //init the value of total wheels
        int totalWheels = 0;
        for (Bike bike : bikeList) {
            totalWheels += bike.getNumberOfWheels();
        }
        System.out.println("Total number of wheels on all bikes: " + totalWheels);

        //gets and prints the oldest bike in the array
        int oldestYear = bikeList.get(0).getYear();
        for (Bike bike : bikeList) {
            if (bike.getYear() < oldestYear) {
                oldestYear = bike.getYear();
            }
        }
        System.out.println("Year of the oldest bike: " + oldestYear);
    }
}