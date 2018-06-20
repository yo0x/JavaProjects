
/**
 * This class Circle is the base and super class of the other shapes.
 * @author (Yonatan Orozko -Yonor-)
 * @version (1.1)
 */
public class Circle {
    protected Point coorCir;
    protected int radius;
    private Circle stamC;
    public Circle(){
        coorCir = new Point();
        this.radius = (int) (Math.random()*100);

    }
    public Circle(int x_in, int y_in, int radius_in){
        coorCir = new Point(x_in, y_in);
        this.radius = radius_in;

    }
    public Circle(Circle myCircle){
        coorCir = new Point(myCircle.coorCir.getX(), myCircle.coorCir.getY());
        this.radius = myCircle.radius;

    }
    /**
     * It returns the circle's area.
     *
     *
     *
     */
    public float area(){
        return (float) Math.PI*this.radius*this.radius;
    }
    /**
     * It returns the circle's circunference.
     *
     *
     */
    public float circunference(){
        return (float) (2*Math.PI*this.radius);
    }
    /**
     * Prints out the object's info.
     *
     *
     *
     */
    public String toString(){
        return ("The circle's center is ("+this.coorCir.getX()+"),("+this.coorCir.getY()+"), and the radius: ("+this.radius+")");
    }

}


