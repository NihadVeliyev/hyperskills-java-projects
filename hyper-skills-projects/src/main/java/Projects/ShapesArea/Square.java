package Projects.ShapesArea;

public class Square extends Shape{
    double side;

    @Override
    public double area(){
        return side*side;

    }

    public Square(double side) {
        this.side = side;
    }
}
