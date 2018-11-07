package DropDown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import com.gargoylesoftware.htmlunit.javascript.host.Map;
import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class hashmapprint {
public static void main(String[] args)
{
	HashMap<String,String> map=new HashMap<String,String>();
	map.put("Name", "Bhanu");
	map.put("City", "Bangalore");
	map.put("Area", "Basavanagudi");
	//name is a key stored in v
	String v = map.get("Name");
	System.out.println(v);
	//keys are case sensitive
	System.out.println(map.get("city"));//null
	map.put("City", "Mysore");
	System.out.println(map.get("City"));
	System.out.println(map.containsKey("Area"));
	System.out.println(map.containsKey("Road"));
	System.out.println(map.keySet());
	java.util.Set<String> s1= map.keySet();
	System.out.println(s1);
 Collection<String> allValues = map.values();
	System.out.println(allValues);
	
	ArrayList<String> ls= new ArrayList(s1);
	System.out.println(ls);
	System.out.println("__________ keys____________");
	for(String s:ls)
	{
		System.out.println(s);
		
	}
	System.out.println("__________ Values____________");
	for(String s:allValues)
	{
		System.out.println(s);
		
	}
	
	
}
}
