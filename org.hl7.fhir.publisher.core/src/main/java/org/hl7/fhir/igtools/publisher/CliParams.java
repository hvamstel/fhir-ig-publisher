package org.hl7.fhir.igtools.publisher;

public class CliParams {
	public static String getNamedParam(String[] args, String param) {
	  boolean found = false;
	  for (String a : args) {
		if (found)
		  return a;
		if (a.equals(param)) {
		  found = true;
		}
	  }
	  return null;
	}

	public static boolean hasNamedParam(String[] args, String param) {
	  for (String a : args) {
		if (a.equals(param)) {
		  return true;
		}
	  }
	  return false;
	}
}
