public class Topping {
    public String meat;
    public String vegetables;
    public String cheese;
    public String sauce;

    public Topping() {
        this.meat = "Pork";
        this.vegetables = "Tomato";
        this.cheese = "Sirene";
        this.sauce = "Barbeque";
    }

    public Topping(String meat, String vegetables, String cheese, String sauce) {
        this.meat = meat;
        this.vegetables = vegetables;
        this.cheese = cheese;
        this.sauce = sauce;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "meat='" + meat + '\'' +
                ", vegetables='" + vegetables + '\'' +
                ", cheese='" + cheese + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
