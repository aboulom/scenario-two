package com.opensourcearchitect;

import java.util.*;

public class HashmapProcessor {

	// Create a hash map
    HashMap hm = new HashMap();

	public void store (String tripID, String comment) {
      // Put elements to the map
      hm.put(tripID, comment);
	}
	
	public String check (String ID, String tripID) {
		if (hm.get(tripID) == null)
			return "SUCCESS: Trip ID [" + tripID + "] not found for Traveler ID [" + ID + "]";
		else
			return "FAILED: Trip ID [" + tripID + "] found for Traveler ID [" + ID + "]";
	}
}