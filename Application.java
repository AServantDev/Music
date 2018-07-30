
import java.util.*;

/**
 * 
 */
public class Application {

    
    /**
     * 
     */
	public static void main(String[] args){
       
    	Bands myBand = new Bands();
    	
    	myBand.setSing("George Clarke");
    	myBand.setGuitar("Kerry McCoy, Shiv Mehra");
    	myBand.setDrum("Daniel Tracy");
    	myBand.setBass("Stephen Clarke");
    	myBand.setName("Deafheaven");
    	myBand.setMembers(5);
    	
    	myBand.showBand();
    	
    	Solo mySolo = new Solo();
    	
    	mySolo.setSing("Andrew Bird");
    	
    	mySolo.showArtist();
    	
    	
    }

}