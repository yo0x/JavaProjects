/**
 * This class is an extentions of Cylinder.
 * It also prints out all the Object's info.
 *
 * @author (Yonatan Orozko -Yonor-)
 * @version (1.1)
 */
public class Cone extends Cylinder {

    public Cone(){

        this.hight = (int)((Math.random()*10)+100);
        super.coorCir.setX((int)(Math.random()*10)+100);
        super.coorCir.setY((int)(Math.random()*10)+100);

    }
    public Cone(int x_in, int y_in, int tempHight){

        this.hight = tempHight;
        super.coorCir.setX(x_in);
        super.coorCir.setY(y_in);

    }
    public Cone(Cone temCyli){
        this.hight = temCyli.hight;
        super.coorCir.setX(temCyli.coorCir.getX());
        super.coorCir.setY(temCyli.coorCir.getY());
    }
    /**
     * Its returns the  Cone's area.
     *
     *
     *
     */
    public float area(){

        return (float) (super.area()+(super.area()/super.radius)*Math.sqrt(Math.pow(this.radius, 2)+Math.pow(this.hight,2)));
    }
    /**
     * It returns the Volume.
     *
     *
     *
     */
    public float volume(){
        return (float) (0.333*(super.area()*this.hight));
    }
    /**
     * toSrting prints out the objects info.
     *
     *
     *
     */
    public String toString(){
        return ("The Cone's center is ("+super.coorCir.getX()+"),("+super.coorCir.getY()+"), its base's radii are ("+super.radius+"), and its height is: "+this.hight);
    }
}
