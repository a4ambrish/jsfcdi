package multiImpl;

import java.io.Serializable;

import javax.enterprise.inject.Alternative;


@Alternative
public class ConsolePrint implements Printer,Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = -7523015431268272262L;
public ConsolePrint(){}
	@Override
	public void printIt(String msg) {
		System.out.println("Console Printing : "+msg);
		
	}
	
	

}
