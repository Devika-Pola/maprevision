package MapEg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapClass {
 
	public static void main(String args[])throws Exception
	{
		
	    ArrayList<String> al=new ArrayList<String>();
	    	al.add("Audi");
	    	al.add("BMW");
	    	al.add("Mercedes");
	    	al.add("Ford");
	    	al.add("Audi");
	    	al.add("BMW");
	    Map<String,Integer> mp=new HashMap<String,Integer>();
	    Iterator<String> it=al.iterator();
	    String keys;
	    while(it.hasNext())
	    {
	    	keys=it.next();
	    	mp.put(keys,Collections.frequency(al,keys));
	    	
	    }
	    Set<Map.Entry<String, Integer>> set=mp.entrySet();
	    Iterator<Map.Entry<String, Integer>> itt=set.iterator();
	    while(itt.hasNext())
	    {
	    	Map.Entry<String, Integer> iterator=itt.next();
	    	System.out.println(iterator.getKey()+":::"+iterator.getValue());
	    	
	    }
	  
	}
	
}
