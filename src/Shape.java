public class Shape {
    // Fields/attributes
    private String color;
    private boolean filled;

    // Constructors
    public Shape() {
        this("red", true);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Modifiers and accessors
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Returns a string with all attributes
    @Override
    public String toString() {
        return "color: " + this.color + ", filled: " + this.filled;
    }
}
