package Projects.ShapesArea;

public class Triangle extends Shape{
    double height;
    double base;

    public Triangle(double height,double base){
        this.base=base;
        this.height=height;
    }

    @Override
    public double area() {

        return height*base/2 ;
    }
}
