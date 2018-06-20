/**
 * This class is a subclass of Circle.
 * it has its own Hight value thogh.
 *
 * @author (Yonatan Orozko -Yonor-)
 * @version (1.1)
 */
public class Cylinder extends Circle {
    protected int hight;
    public Cylinder(){
        this.hight = (int)((Math.random()*10)+100);
        super.coorCir.setX((int)(Math.random()*10)+100);
        super.coorCir.setY((int)(Math.random()*10)+100);

    }
    public Cylinder(int x_ini, int y_ini, int tempHight){
        this.hight = tempHight;
        super.coorCir.setX(x_ini);
        super.coorCir.setY(y_ini);

    }
    public Cylinder(Cylinder temCyli){
        this.hight = temCyli.hight;
        super.coorCir.setX(temCyli.coorCir.getX());
        super.coorCir.setY(temCyli.coorCir.getY());
    }
    /**
     *    Its returns the  Cylinder's area.
     *
     *
     *
     */
    public float area(){

        return 2*(super.area()+((super.radius* super.area())/super.radius));
    }
    /**
     *      It returns the Volume.
     *
     *
     */
    public float volume(){
        return super.area()*this.hight;
    }
    /**
     *toSrting prints out the objects info.
     *
     *
     *
     */
    public String toString(){
        return ("The cylinder center is ("+super.coorCir.getX()+"),("+super.coorCir.getY()+"), its base's radii are ("+super.radius+"), and its height is: "+this.hight);
    }
}
