package ex2;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

public class test {
    public static void main (String args[]){
        Enumeration names;
        
        Hashtable <String, Double> balance = new Hashtable<>();
        
        balance.put("BNA",812794.0);
        balance.put("TEC",245450.);
        balance.put("SEMAC",5341.50);
        balance.put("INSE",1298.50);
        balance.put("ROOTME",2458.50);
        balance.put("Ron",5341.50);
        
        // to fetch the keys
        names = balance.keys();
        System.out.println("Keys are :");
        while(names.hasMoreElements()){
            System.out.print(names.nextElement() + " ");
        }
        System.out.println();
        // to fetch only the values using Enumeration
        names = balance.elements();
        System.out.println("Values are :");
        while(names.hasMoreElements()){
            System.out.print(names.nextElement() + " ");
        }
        
        System.out.println();        
        System.out.println("Hashtable contains a key Jack? : "+balance.containsKey("Jack"));
        System.out.println("Hashtable contains a value 3234.50? : "+balance.containsValue(3234.50));
        System.out.println("Value for key Jack : "+balance.get("Jack"));
        balance.putIfAbsent("Stan",4400.00);

        // to fetch a set view of mappings contained in map
        Set<Map.Entry<String, Double>> balSet = balance.entrySet();
        Iterator iter = balSet.iterator();
        System.out.println();
        System.out.println("Values in Set are:");
        while (iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
                
    }
}
