import java.util.ArrayList;
import java.util.List;

public class ComputerSystem {
    private String name;
    private List<Hardware> components;
    private double totalCost;

    public ComputerSystem(String name) {
        this.name = name;
        this.components = new ArrayList<>();
        this.totalCost = 0;
    }

    // Bileşen ekleme metodu
    public void addComponent(Hardware hardware) {
        components.add(hardware);
        totalCost += hardware.getPrice();
    }

    // Getter ve setter metodları
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Hardware> getComponents() {
        return components;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "ComputerSystem [name=" + name + ", components=" + components + ", totalCost=" + totalCost + "]";
    }
}
