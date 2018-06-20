/**
 * This class tests out all the methods and creates some shapes required by DAN.
 *
 * @author (Yonatan Orozko -Yonor-)
 * @version (1.1)
 */
public class Main {
    public static void main(String[] args){
        Cylinder newCyli = new Cylinder();
        Cylinder newCyliCopy = new Cylinder(newCyli);
        newCyliCopy.coorCir.setX(newCyliCopy.coorCir.getX()+4);
        newCyliCopy.coorCir.setY(newCyli.coorCir.getY()-3);
        Cylinder myCyli = new Cylinder(12,32, 20);
        Cone alCone = new Cone();
        Cone copCone = new Cone(alCone);
        copCone.hight = 7;
        System.out.println("                               ");
        System.out.println("                               ");
        System.out.println("   == Welcome to TAMA 7 ==  ");
        System.out.println("                               ");
        System.out.println(" +Here are some shapes we've created: ==>  ");
        System.out.println("                               ");
        System.out.println(newCyli.toString());
        System.out.println(newCyliCopy.toString());
        System.out.println(myCyli.toString());
        System.out.println(alCone.toString());
        System.out.println(copCone.toString());

    }
}
