package Task_07;

import java.lang.reflect.Constructor;

public class Cylinder extends Circle {
    private double height;

//    Constructor
    public Cylinder(){
        super();
        this.height = 1.0;
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }
    public Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height = height;
    }

//    Getter ans Setter
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }

//    Return the volume of this Cylinder
//    public double getVolume(){
//        return getArea()*height;  //Use Circle's getArea()
//    }
    public String toString(){
        return "This is a Cylinder";
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }
    @Override
    public double getArea() {
        return  2*Math.PI*getRadius()*height + 2*super.getArea();
    }
    public double getVolume(){
        return getArea()*height;
    }
}
