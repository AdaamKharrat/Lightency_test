package MyWork;
import java.util.List;
import java.util.ArrayList;
public class EnergyManager {
    List<Component> manager = new ArrayList<>();

    public void addComponent(Component component) {
        manager.add(component);
    }

    public void removeComponent(Component component) {
        manager.remove(component);


    }

    public int CalculateTotalCapacity() {
        int totalCapacity = 0;
        for (Object item : manager) {
            if (item instanceof Battery) {
                Battery battery = (Battery) item;
                totalCapacity += battery.getCapacity();

            }



        }

return totalCapacity;
    }
}