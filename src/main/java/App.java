import models.Vehicle;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
//        Console myConsole = System.console();
        boolean programRunning = true;

        Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
        Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
        Vehicle sedan = new Vehicle(2015, "Toyota", "Camry", 50000, 30000);
        Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
        Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);

        // models.Vehicle[] allVehicles = { hatchback, suv, sedan, truck, crossover };

        ArrayList<Vehicle> allVehicles = new ArrayList <Vehicle>();

        allVehicles.add(hatchback);
        allVehicles.add(suv);
        allVehicles.add(sedan);
        allVehicles.add(truck);
        allVehicles.add(crossover);

//        boolean programRunning = true;

        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to our car dealership. What would you like to do? Enter one of the following options: All Vehicles, Search Price, Add Vehicle, or Exit");


//            System.out.println(
//                    "Welcome to our car dealership. What would you like to do? Enter one of the following options: All Vehicles, Search Price or Add models.Vehicle");
//            String navigationChoice = myConsole.readLine();

            try{
                String navigationChoice = bufferedReader.readLine();
                if (navigationChoice.equals("All Vehicles")) {
                    for (Vehicle individualVehicle : allVehicles) {
                        System.out.println("----------------------");
                        System.out.println(individualVehicle.getmYear());
                        System.out.println(individualVehicle.getmBrand());
                        System.out.println(individualVehicle.getmModel());
                        System.out.println(individualVehicle.getmMiles());
                        System.out.println(individualVehicle.getPrice());
                    }
                } else if (navigationChoice.equals("Search Price")) {
                    System.out.println("What is your maximum budget for a vehicle?");
                    String stringUserMaxBudget = bufferedReader.readLine();
                    int userMaxBudget = Integer.parseInt(stringUserMaxBudget);
                    System.out.println("Alright, here's what we have in your price range:");
                    for (Vehicle individualVehicle : allVehicles) {
                        if (individualVehicle.worthBuying(userMaxBudget)) {
                            System.out.println("----------------------");
                            System.out.println(individualVehicle.getmYear());
                            System.out.println(individualVehicle.getmBrand());
                            System.out.println(individualVehicle.getmModel());
                            System.out.println(individualVehicle.getmMiles());
                            System.out.println(individualVehicle.getPrice());
                        }
                    }
                } else if (navigationChoice.equals("Add models.Vehicle")) {
                    System.out.println("Alright, let's add a vehicle! What year was this vehicle made?");
                    int userVehicleYear = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Great! What make or getmBrand() is the vehicle?");
                    String userVehicleBrand = bufferedReader.readLine();
                    System.out.println("Got it! What getmModel() is it?");
                    String userVehicleModel = bufferedReader.readLine();
                    System.out.println("And how many getmMiles() does it have on it?");
                    int userVehicleMiles = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Finally, what's its price?");
                    int userVehiclePrice = Integer.parseInt(bufferedReader.readLine());
                    Vehicle userVehicle = new Vehicle(userVehicleYear, userVehicleBrand, userVehicleModel, userVehicleMiles,
                            userVehiclePrice);
                    allVehicles.add(userVehicle);
                    System.out.println("Alright, here's your new vehicle:");
                    System.out.println("----------------------");
                    System.out.println(userVehicle.getmYear());
                    System.out.println(userVehicle.getmBrand());
                    System.out.println(userVehicle.getmModel());
                    System.out.println(userVehicle.getmMiles());
                    System.out.println(userVehicle.getPrice());
                } else if (navigationChoice.equals("Exit")) {
                    programRunning = false;
                }

                else {
                    System.out.println("I'm sorry, we don't recognize your input");
                }
            } catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
