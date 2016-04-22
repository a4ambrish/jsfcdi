package jsfcdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped

public class Generator implements Serializable {


   private java.util.Random random = new java.util.Random(System.currentTimeMillis());

   

   private int maxNumber = 100;

   

   java.util.Random getRandom() {

      return random;

   }

   

   @Produces @Random int next() { 
System.out.println("Default random generator");
      return getRandom().nextInt(maxNumber); 

   }

   

   @Produces @MaxNumber int getMaxNumber() {
	   System.out.println("Default Max Number");

      return maxNumber;

   }


}