package Tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class TreeConstruct {

	  static void add(int k, int v, Map<Integer, Set<Integer>> m) {
	    Set<Integer> s = m.get(k);
	    if (s == null) { s = new HashSet(); m.put(k, s); }
	    s.add(v);
	  }

	  public static String TreeConstructor(String[] strArr) {
	    int pc = 0;
	    Map<Integer, Set<Integer>> csm = new HashMap(), psm = new HashMap();

	    for (String s : strArr) {
	      String [] sa = s.substring(1, s.length() - 1).split(",");
	      int c = Integer.parseInt(sa[0]), p = Integer.parseInt(sa[1]);
	      add(c, p, psm);
	      add(p, c, csm);
	    }

	    for (Set<Integer> s : csm.values()) {
	      if (s.size() > 2) {
	        return "false";
	      }
	    }

	    for (Set<Integer> s : psm.values()) {
	      if (s.size() > 1) {
	        return "false";
	      } else {
	        pc += s.size();
	      }
	    }

	    return ("" + (pc == psm.size()));
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    String [] arr = {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
	    System.out.print(TreeConstructor(arr)); 
	  }

	}

