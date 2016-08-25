import java.security.SecureRandom;
import java.math.BigInteger;
/**
 * Write a description of class IDgenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDgenerator
{

      private SecureRandom random = new SecureRandom();
  

       private String nextSessionID() {
            return new BigInteger(40,random).toString(4);
      }
      
       public String shortID() {
           return nextSessionID().substring(0,4);
           
        }
      
  }
    

