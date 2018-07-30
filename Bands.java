
import java.util.*;

/**
 * 
 */
public class Bands extends Music {

   
	public void showBand() {
        System.out.println("Le groupe " + getName() + " est composé de " + getMembers() + " membres " 
    + "qui sont " + getGuitar() + ", " + getSing() + ", " + getBass() + ", " + getDrum() + ".");
    }

}