package task9;

public class Circle {
    private double length;
    private double area;

    public Circle(double length, double area){
        this.length = length;
        this.area = area;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Length = "+length+"\t Area = "+area;
    }
}
