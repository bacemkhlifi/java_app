package ex2;
import java.util.*;
public class chiffre_affaire {
	Enumeration names;
	
	
	Hashtable<String, Double> table = new Hashtable<>();
	

	public void ajout_CA(String arg0 , Double arg1) {
		table.put(arg0, arg1);
		} 
	public void suppression(String arg3) {
		table.remove(arg3);
		
	}
	public void CA_max(){
	
	System.out.println("\nle max CA est "+Collections.max(table.values()));
	}
	public void affiche() {
		
		 names = table.keys();
	     System.out.println("Keys are :");
	     while(names.hasMoreElements()){
	    	 System.out.print(names.nextElement() + " |");

	     }
	     names = table.elements();
	     System.out.println("\n value are :");
	     while(names.hasMoreElements()){
	    	 System.out.print(names.nextElement() + " |");
		
	}
}
	}
