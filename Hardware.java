public class Hardware {
    private String brand;
    private String name;
    private String type;
    private double price;

    public Hardware(String brand, String name, String type, double price) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Fiyatı TL cinsinden göstermek için
    public String getPriceInTL() {
        return price + " TL";
    }

    // toString metodu güncellendi
    @Override
    public String toString() {
        return "Marka: " + brand + ", Model: " + name + ", Fiyat: " + getPriceInTL();
    }
}
