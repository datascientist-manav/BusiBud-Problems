package string_problems;

import java.util.LinkedList;
import java.util.Queue;

public class MatchingStrings {

	public static void main(String[] args) {
		
	String str = "ghececgkaem";
    int count = 0;
    for(int i=0;i<str.length();i++){
      char temp = str.charAt(i);
      int start = i;
      int end = start;

      for(int j = i+1;j<str.length();j++){
        if(str.charAt(j) ==temp){
          end = j;
        }
      }

      String unique = "";
      for(int k =start+1;k<end;k++){
    	  final int s = k;
    	  System.out.println(unique);
        if(unique.chars().filter(ch -> ch == str.charAt(s)).count() ==0){

            unique = unique + str.charAt(s);
            
        }
        
      }
      if(unique.length() > count){
        count = unique.length();
      }
    }
    System.out.println(count);

	
	}
}
