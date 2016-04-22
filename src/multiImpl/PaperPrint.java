package multiImpl;

import java.io.Serializable;

import javax.enterprise.inject.Alternative;

@Alternative
public class PaperPrint implements Printer,Serializable{

	public PaperPrint(){}
	
	@Override
	public void printIt(String msg) {
		System.out.println("Paper Printing : "+msg);
		
	}
	
	

}
