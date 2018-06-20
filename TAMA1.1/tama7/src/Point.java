/**
 * This class point makes a xy reference on the canvas we are working on.
 * it returns a <x,y> point.
 *
 * @author (Yonatan Orozko -Yonor-)
 * @version (1.1)
 */
public class Point {
    private int x_co = 0;
    private int y_co = 0;

    public Point(){
        this.x_co = (int) (Math.random()*100);
        this.y_co = (int) (Math.random()*100);
    }
    public Point(int x_in, int y_in){
        this.x_co = x_in;
        this.y_co = y_in;
    }
    /**
     * toSrting prints out the objects info.
     *
     *
     *
     */
    public String toString(){
        return ("("+this.x_co+","+this.y_co+")");
    }
    public int getX(){
        return this.x_co;
    }
    public int getY(){
        return this.y_co;
    }
    public void setX(int x_in){
        this.x_co = x_in;
    }
    public void setY(int y_in){
        this.y_co = y_in;
    }
}
