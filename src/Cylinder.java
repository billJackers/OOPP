class Cylinder extends Circle {
    // Attributes/fields
    private double height;
    
    // Constructors
    public Cylinder() {
        super();
        this.height = 1.0;
    }
    
    public Cylinder(double height) {
        super();
        this.height = height;
    }
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume() {
        return super.getArea() * this.height;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", height: " + this.height;
}
