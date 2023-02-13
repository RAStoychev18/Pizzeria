public class Pizza extends Topping {
    public String name;
    public String dought;
    public String topping;

    public Pizza() {
        this.name = "Margaritta";
        this.dought = "White";
        this.topping = "meat";
    }

    public Pizza(String name, String dought, String topping) {
        this.name = name;
        this.dought = dought;
        this.topping = topping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDought() {
        return dought;
    }

    public void setDought(String dought) {
        this.dought = dought;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dought='" + dought + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}
