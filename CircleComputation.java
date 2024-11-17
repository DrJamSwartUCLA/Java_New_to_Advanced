package hus.oop.lab1;
public class CircleComputation{
    public static void main(String args[]){
        double radius=2.0;
        double diameter=Diameter(radius);
        System.out.printf("%.2f%n",diameter);
        double area=Area(radius);
        System.out.printf("%.2f%n",area);
        double circumference=Circumference(radius);
        System.out.printf("%.2f%n",circumference);
    }
    public static double Diameter(double radius){
        return radius*2.0;
    }
    public static double Area(double radius){
        return Math.PI*radius*radius;
    }
    public static double Circumference(double radius){
        return 2.0*Math.PI*radius;
    }
}
