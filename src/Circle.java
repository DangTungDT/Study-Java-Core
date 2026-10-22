public class Circle extends Shape{
    private double radius;
    private final double PI = 3.14159;

    public Circle(double radius) {
        checkRadius(radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.pow(radius, 2)*PI;
    }

    @Override
    public double perimeter() {
        return radius*2*PI;
    }

    @Override
    public void print(){
        System.out.println("Cirle \t" +"area: "+area()+"\tperimeter: " +perimeter());
    }

    private static void checkRadius(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
    }
}
