package DropDown;

import java.util.ArrayList;
import java.util.HashMap;

public class hashMap {
	public static void main(String[] args) throws InterruptedException
	{
	HashMap<String,String>hs=new HashMap<String,String>();
	hs.put("city", "Bangalore");
	hs.put("naveen", "hubli");
	hs.put("slv", "btr");
	System.out.println(hs);
	System.out.println(hs.get("city"));
	}

}
