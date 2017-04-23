package easteregg;

/**
 * Created by Selim on 22/04/2017.
 */
public class Kid extends Element{

    char startDirection;
    String sequence;
    public Egg[] sac = null;
    String name;

    public Kid() {
    }

    public Kid(int posX, int posY, char startDirection, String sequence, String name) {
        this.posX = posX;
        this.posY = posY;
        this.startDirection = startDirection;
        this.sequence = sequence;
        this.name = name;
    }

    public char getStartDirection() {
        return startDirection;
    }

    public void setStartDirection(char startDirection) {
        this.startDirection = startDirection;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Egg[] getSac() {
        return sac;
    }

    public void setSac(Egg[] sac) {
        this.sac = sac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.print("X = " + this.posX + ", ");
        System.out.print("Y = " + this.posY + ", ");
        System.out.print("Direction de Départ = " + this.startDirection + ", ");
        System.out.print("Séquence = " + this.sequence + ", ");
        System.out.println("Nom = " + this.name + ", ");
    }
}
