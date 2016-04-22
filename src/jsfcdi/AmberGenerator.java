package jsfcdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
@ApplicationScoped

public class AmberGenerator implements Serializable {


   private java.util.Random random = new java.util.Random(System.currentTimeMillis());

   

   private int maxNumber = 50;

   

   java.util.Random getRandom() {
System.out.println("getting pre initialized random number "+random);
      return random;

   }

   

   @Produces @AmberRandom int next() { 
	   System.out.println("this is amber generated random number");

      return getRandom().nextInt(maxNumber); 

   }

   

   @Produces @AmberMaxNumber int getMaxNumber() {
	   System.out.println("this is max number from amber genarator");

      return maxNumber;

   }


}