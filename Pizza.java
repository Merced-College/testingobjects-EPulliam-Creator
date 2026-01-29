public class Pizza {

    // Instance variables (fields)
    private String size;
    private String crustType;
    private int slices;
    private double price;
    private boolean extraCheese;

    // No-argument (default) constructor
    public Pizza() {
        size = "Medium";
        crustType = "Regular";
        slices = 8;
        price = 0.0;
        extraCheese = false;
    }

    // Parameterized constructor
    public Pizza(String size, String crustType, int slices, double price, boolean extraCheese) {
        this.size = size;
        this.crustType = crustType;
        this.slices = slices;
        this.price = price;
        this.extraCheese = extraCheese;
    }

    // Getters and setters
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrustType() {
        return crustType;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public int getSlices() {
        return slices;
    }

    public void setSlices(int slices) {
        if (slices > 0) {
            this.slices = slices;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public boolean hasExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Pizza{size='" + size +
               "', crustType='" + crustType +
               "', slices=" + slices +
               ", price=" + price +
               ", extraCheese=" + extraCheese + "}";
    }
}