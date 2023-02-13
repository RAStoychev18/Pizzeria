public class Dought {
    public String type;
    public String texture;

    public Dought() {
        this.type = "White or whole grain";
        this.texture = "crunchy, chewy or homemade";
    }

    public Dought(String type, String texture) {
        this.type = type;
        this.texture = texture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "Dought{" +
                "type='" + type + '\'' +
                ", texture='" + texture + '\'' +
                '}';
    }
}


