package object;

/**
 * Created by Selim on 23/04/2017.
 */
public class EggStack extends Element {
    //This object is a score objects in the game
    public int eggsNb = 0;

    public EggStack(int posX, int posY, int eggsNb) {
        this.posX = posX;
        this.posY = posY;
        this.eggsNb = eggsNb;
    }

    public int getEggsNb() {
        return eggsNb;
    }

    public void setEggsNb(int eggsNb) {
        this.eggsNb = eggsNb;
    }
}
