public class Square extends Rectangle {
    // Constructors
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    public void setWidth(double side) {
        this.setSide(side);
    }
    
    @Override
    public void setLength(double side) {
        this.setSide(side);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
