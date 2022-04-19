import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle radius to create new circle: ");
        int radius = scanner.nextInt();
        Circle c = new Circle(radius);
        System.out.println(c);

        System.out.print("\nEnter cylinder height: ");
        int height = scanner.nextInt();
        System.out.print("\nEnter cylinder radius: ");
        radius = scanner.nextInt();
        Cylinder cyl = new Cylinder(radius, height);
        System.out.println(cyl);

        System.out.print("\nEnter rectangle length: ");
        int length = scanner.nextInt();
        System.out.print("\nEnter rectangle width: ");
        int width = scanner.nextInt();
        Rectangle r = new Rectangle(width, length);
        System.out.println(r);

        System.out.println("\nEnter square side length: ");
        int side = scanner.nextInt();
        Square s = new Square(side);
        System.out.println(s);
    }
}
