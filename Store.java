import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Hardware> availableHardware;
    private List<ComputerSystem> assembledSystems;
    private double balance;

    public Store() {
        this.availableHardware = new ArrayList<>();
        this.assembledSystems = new ArrayList<>();
        this.balance = 0;
    }

    public void addHardware(Hardware hardware) {
        availableHardware.add(hardware);
    }

    public void listHardware() {
        for (Hardware hardware : availableHardware) {
            System.out.println("Marka: " + hardware.getBrand() + ", Model: " + hardware.getName() + ", Fiyat: " + hardware.getPriceInTL());
        }
    }

    public void listHardwareByType(String type) {
        for (Hardware hardware : availableHardware) {
            if (hardware.getType().equalsIgnoreCase(type)) {
                System.out.println("Marka: " + hardware.getBrand() + ", Model: " + hardware.getName() + ", Fiyat: " + hardware.getPriceInTL());
            }
        }
    }

    public void addComputerSystem(ComputerSystem system) {
        assembledSystems.add(system);
    }

    public void listComputerSystems() {
        for (ComputerSystem system : assembledSystems) {
            System.out.println(system);
        }
    }

    public void sellComputerSystem(String systemName) {
        for (ComputerSystem system : assembledSystems) {
            if (system.getName().equals(systemName)) {
                balance += system.getTotalCost();
                assembledSystems.remove(system);
                System.out.println(systemName + " başarıyla satıldı. Kazanılan para: " + system.getTotalCost());
                return;
            }
        }
        System.out.println("Sistem bulunamadı.");
    }

    public double getBalance() {
        return balance;
    }

    public List<Hardware> getAvailableHardware() {
        return availableHardware;
    }
}
