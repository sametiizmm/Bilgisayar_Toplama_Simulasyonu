import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();

        // Varsayılan donanımlar
                                    //KASALAR
        store.addHardware(new Hardware("Cooler Master", "MasterCase H500", "Bilgisayar Kasası", 119.99));
        store.addHardware(new Hardware("Cooler Master", "MasterBox MB511", "Bilgisayar Kasası", 79.99));
        store.addHardware(new Hardware("ASUS", "ROG Strix Helios", "Bilgisayar Kasası", 299.99));
        store.addHardware(new Hardware("ASUS", "TUF Gaming GT501", "Bilgisayar Kasası", 179.99));
        store.addHardware(new Hardware("MSI", "MPG SEKIRA 500X", "Bilgisayar Kasası", 279.99));
        store.addHardware(new Hardware("MSI", "MAG FORGE 100R", "Bilgisayar Kasası", 89.99));
                                    //ANAKARTLAR
        store.addHardware(new Hardware("ASUS", "ROG Strix B550-F", "Anakart", 200.00));
        store.addHardware(new Hardware("ASUS", "Prime X570-Pro", "Anakart", 229.99));
        store.addHardware(new Hardware("MSI", "MPG X570 Gaming Pro Carbon WiFi", "Anakart", 259.99));
        store.addHardware(new Hardware("MSI", "MAG B550 Tomahawk", "Anakart", 179.99));
        store.addHardware(new Hardware("Gigabyte", "Z490 Aorus Ultra", "Anakart", 269.99));
        store.addHardware(new Hardware("Gigabyte", "Z590 Aorus Master", "Anakart", 399.99));
        store.addHardware(new Hardware("ASRock", "X570 Phantom Gaming 4", "Anakart", 159.90));
        store.addHardware(new Hardware("ASRock", "Z490 Extreme4", "Anakart", 189.90));
                                    //iŞLEMCİLER
        store.addHardware(new Hardware("AMD", "Ryzen 5 5600X", "İşlemci", 299.99));
        store.addHardware(new Hardware("AMD", "Ryzen 7 5800X", "İşlemci", 449.99));
        store.addHardware(new Hardware("AMD", "Ryzen 9 5900X", "İşlemci", 549.99));
        store.addHardware(new Hardware("AMD", "Ryzen 9 5950X", "İşlemci", 799.99));
        store.addHardware(new Hardware("Intel", "Core i5-11600K", "İşlemci", 269.99));
        store.addHardware(new Hardware("Intel", "Core i7-11700K", "İşlemci", 399.99));
        store.addHardware(new Hardware("Intel", "Core i9-11900K", "İşlemci", 549.99));
        store.addHardware(new Hardware("Intel", "Core i9-12900K", "İşlemci", 649.99));
                                    //BELLEKLER
        store.addHardware(new Hardware("Corsair", "Vengeance LPX 64GB (2x32GB) DDR4-3200MHz", "Bellek", 329.99));
        store.addHardware(new Hardware("Corsair", "Vengeance LPX 16GB (2x8GB) DDR4-3200MHz", "Bellek", 79.99));
        store.addHardware(new Hardware("G.Skill", "Ripjaws V 16GB (2x8GB) DDR4-3200MHz", "Bellek", 139.99));
        store.addHardware(new Hardware("G.Skill", "Trident Z RGB 32GB (2x16GB) DDR4-3600MHz", "Bellek", 189.99));
        store.addHardware(new Hardware("XPG (ADATA)", "Spectrix D60G RGB 64GB (2x32GB) DDR4-3600MHz", "Bellek", 299.99));
        store.addHardware(new Hardware("XPG (ADATA)", "Spectrix D50 Xtreme 32GB (2x16GB) DDR4-3600MHz", "Bellek", 149.99));
        store.addHardware(new Hardware("Kingston", "HyperX Fury 16GB (2x8GB) DDR4-3200MHz", "Bellek", 74.99));
        store.addHardware(new Hardware("Kingston", "HyperX Fury RGB 32GB (2x16GB) DDR4-3200MHz", "Bellek", 139.99));
                                    //GRAFİK KARTI
        store.addHardware(new Hardware("NVIDIA", "GeForce RTX 3060", "Grafik Kartı", 329.99));
        store.addHardware(new Hardware("NVIDIA", "GeForce RTX 3090", "Grafik Kartı", 1499.99));
        store.addHardware(new Hardware("AMD", "Radeon RX 6600 XT", "Grafik Kartı", 399.99));
        store.addHardware(new Hardware("AMD", "Radeon RX 6800", "Grafik Kartı", 579.99));
        store.addHardware(new Hardware("Gigabyte", "GeForce RTX 3090 Aorus Xtreme", "Grafik Kartı", 1699.99));
        store.addHardware(new Hardware("Gigabyte", "GeForce RTX 3080 Gaming OC ", "Grafik Kartı", 799.99));
        store.addHardware(new Hardware("MSI", "Radeon RX 6900 XT Gaming Z Trio", "Grafik Kartı", 1199.99));
        store.addHardware(new Hardware("MSI", "Radeon RX 6800 Gaming X Trio", "Grafik Kartı", 649.99));
                                    //DEPOLAMA
        store.addHardware(new Hardware("Samsung", "970 EVO Plus 1TB NVMe SSD", "Depolama Birimi", 150.0));
        store.addHardware(new Hardware("WD", "Black SN750 500GB NVMe SSD", "Depolama Birimi", 79.99));
        store.addHardware(new Hardware("Crucial", "P2 1TB NVMe SSD", "Depolama Birimi", 99.99));
        store.addHardware(new Hardware("Sabrent", "Rocket Q 2TB NVMe SSD", "Depolama Birimi", 299.99));
        store.addHardware(new Hardware("Seagate", "BarraCuda 2TB 7200RPM HDD", "Depolama Birimi", 54.99));
        store.addHardware(new Hardware("WD", "Blue 4TB 5400RPM HDD", "Depolama Birimi", 89.99));
        store.addHardware(new Hardware("Toshiba", "X300 6TB 7200RPM HDD", "Depolama Birimi", 149.99));
        store.addHardware(new Hardware("Seagate", "IronWolf 8TB NAS HDD", "Depolama Birimi", 229.99));
                                    //GÜÇ KAYNAĞI
        store.addHardware(new Hardware("EVGA", "SuperNOVA 650 G5 650W 80+ Gold Fully Modular PSU", "Güç Kaynağı", 109.99));
        store.addHardware(new Hardware("EVGA", "SuperNOVA 750 G3 750W 80+ Gold Fully Modular PSU", "Güç Kaynağı", 129.99));
        store.addHardware(new Hardware("EVGA", "SuperNOVA 850 G5 850W 80+ Gold Fully Modular PSU", "Güç Kaynağı", 159.99));
        store.addHardware(new Hardware("Seasonic", "Prime TX-1000 1000W 80+ Titanium Fully Modular PSU", "Güç Kaynağı", 299.99));
        store.addHardware(new Hardware("Seasonic", "Focus GX-750 750W 80+ Gold Fully Modular PSU", "Güç Kaynağı", 139.99));
        store.addHardware(new Hardware("Cooler Master", "MWE Gold 650 650W 80+ Gold Fully Modular PSU", "Güç Kaynağı", 89.99));
        store.addHardware(new Hardware("Cooler Master", "MWE Bronze 550 550W 80+ Bronze Non-Modular PSU", "Güç Kaynağı", 59.99));
        store.addHardware(new Hardware("Cooler Master", "V850 Gold V2 850W 80+ Gold Fully Modular PSU", "Güç Kaynağı", 139.99));

        String[] hardwareTypes = {
                "Bilgisayar Kasası",
                "Anakart",
                "İşlemci",
                "Bellek",
                "Grafik Kartı",
                "Depolama Birimi",
                "Güç Kaynağı"
        };

        while (true) {
            System.out.println("1. Donanım Ekle");
            System.out.println("2. Donanımları Görüntüle");
            System.out.println("3. Yeni Sistem Topla");
            System.out.println("4. Toplanan Sistemleri Görüntüle");
            System.out.println("5. Sistem Sat");
            System.out.println("6. Bakiye Görüntüle");
            System.out.println("7. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // newline karakterini tüketmek için

            switch (choice) {
                case 1:
                    System.out.println("Donanım Türü Seçin:");
                    for (int i = 0; i < hardwareTypes.length; i++) {
                        System.out.println((i + 1) + ". " + hardwareTypes[i]);
                    }
                    int typeChoice = scanner.nextInt();
                    scanner.nextLine();  // newline karakterini tüketmek için

                    if (typeChoice < 1 || typeChoice > hardwareTypes.length) {
                        System.out.println("Geçersiz seçim. Tekrar deneyin.");
                        break;
                    }

                    String type = hardwareTypes[typeChoice - 1];
                    System.out.print("Marka: ");
                    String brand = scanner.nextLine();
                    System.out.print("Donanım Adı: ");
                    String name = scanner.nextLine();
                    System.out.print("Fiyat: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();  // newline karakterini tüketmek için

                    Hardware hardware = new Hardware(brand, name, type, price);
                    store.addHardware(hardware);
                    break;
                case 2:
                    System.out.println("Görüntülemek istediğiniz donanım türünü seçin:");
                    for (int i = 0; i < hardwareTypes.length; i++) {
                        System.out.println((i + 1) + ". " + hardwareTypes[i]);
                    }
                    int viewTypeChoice = scanner.nextInt();
                    scanner.nextLine();  // newline karakterini tüketmek için

                    if (viewTypeChoice < 1 || viewTypeChoice > hardwareTypes.length) {
                        System.out.println("Geçersiz seçim. Tekrar deneyin.");
                        break;
                    }

                    String viewType = hardwareTypes[viewTypeChoice - 1];
                    store.listHardwareByType(viewType);
                    break;
                case 3:
                    System.out.print("Sisteme İsim Verin: ");
                    String systemName = scanner.nextLine();
                    ComputerSystem system = new ComputerSystem(systemName);

                    for (String compType : hardwareTypes) {
                        System.out.println("Bir " + compType + " seçin:");
                        List<Hardware> hardwareOfType = new ArrayList<>();
                        int index = 1;
                        for (Hardware h : store.getAvailableHardware()) {
                            if (h.getType().equalsIgnoreCase(compType)) {
                                System.out.println(index + ". " + "Marka: " + h.getBrand() + ", Model: " + h.getName() + ", Fiyat: " + h.getPriceInTL());
                                hardwareOfType.add(h);
                                index++;
                            }
                        }
                        System.out.print("Ürün numarasını girin: ");
                        int compNumber = scanner.nextInt();
                        scanner.nextLine();  // newline karakterini tüketmek için

                        if (compNumber < 1 || compNumber > hardwareOfType.size()) {
                            System.out.println("Geçersiz numara. Tekrar deneyin.");
                            break;
                        }

                        Hardware selectedHardware = hardwareOfType.get(compNumber - 1);
                        system.addComponent(selectedHardware);
                    }

                    store.addComputerSystem(system);
                    break;
                case 4:
                    store.listComputerSystems();
                    break;
                case 5:
                    System.out.print("Satmak istediğiniz sistemin adını girin: ");
                    String systemToSell = scanner.nextLine();
                    store.sellComputerSystem(systemToSell);
                    break;
                case 6:
                    System.out.println("Mevcut Bakiye: " + store.getBalance());
                    break;
                case 7:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        }
    }
}
