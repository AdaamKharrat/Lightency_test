package MyWork;  // Declares that the code belongs to the MyWork package

import MyWork.SolarPanel;  // Imports classes needed for the program
import MyWork.Battery;
import MyWork.Component;
import MyWork.EnergyManager;
public class Main {  // Main class where execution begins
    public static void main(String[] args) {  // Main method

        // Create instances of SolarPanel and Battery objects
        SolarPanel solar1 = new SolarPanel(50);
        System.out.println(solar1.generatePower());  // Print generated power
        System.out.println(solar1.getDetails());  // Print solar panel details
        SolarPanel solar2 = new SolarPanel(70);
        Battery battery1 = new Battery(79);
        System.out.println(battery1.getCapacity());
        System.out.println(battery1.getDetails());
        Battery battery2 = new Battery(20);
        Battery battery3 = new Battery(44);

        // Create an EnergyManager object
        EnergyManager newManager = new EnergyManager();

        // Add components to the EnergyManager
        newManager.addComponent(solar1);
        newManager.addComponent(solar2);
        newManager.addComponent(battery2);
        newManager.addComponent(battery1);
        newManager.addComponent(battery3);

        // Print total capacity
        System.out.println(newManager.CalculateTotalCapacity());

        // Remove a battery
        newManager.removeComponent(battery3);

        // Print updated total capacity
        System.out.println(newManager.CalculateTotalCapacity());
    }
}
