public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        checkInput(sideA, sideB, sideC);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }
    @Override
    public double area() {
        double halfPerimeter = perimeter()/2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter- sideA)* (halfPerimeter- sideB)* (halfPerimeter- sideC));
        return area;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void print() {
        System.out.println("Triangle \t" +"area: "+area()+"\tperimeter: " +perimeter());
    }

    private static void checkInput(double a, double b, double c) {
        if(a<= 0 || b<= 0 || c<= 0){
            throw new IllegalArgumentException("Side must be greater than 0");
        }
    }
}
