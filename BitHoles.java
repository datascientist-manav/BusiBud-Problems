package BitMap;

public class BitHoles {
	public static void main (String [] args) {
		
		String [] strArr =new String[] {"10111", "00101","11111","11111"};
		for(int i=0;i<strArr.length;i++) {
			strArr[i] = strArr[i]+"1";
			System.out.println(strArr[i]);
			
		}
		for(int i = 0;i<strArr.length;i++){
		      strArr[i] = strArr[i] +"1";
		    }
		    String [] arr = new String [strArr.length + 2];
		    for(int i=0;i<strArr.length;i++){
		        arr[i] = strArr[i];
		    }
		    
		    String s = "1".repeat(strArr[0].length());
		    arr[strArr.length] = s;
		    arr[strArr.length +1] = s;
//		    for(String i : arr) {
//		    	System.out.println(s);
//		    }
//		
		char [][] number = new char[arr.length][arr[0].length()];
		for(int i =0;i<arr.length;i++) {
			number[i] = arr[i].toCharArray();
		}
//		
//		
		int column = arr[0].length();
		int row = arr.length;
		int [][] vertical = new int [row][column];
		int [] horizontal = new int [column];
		int count=0;
		
		for(int i = 0;i<column-1;i++){
			for(int j = 0;j<row-1;j++){
		        if(vertical[i][j]==0 && number[i][j]=="0".charAt(0) && number[i+1][j]=="0".charAt(0) && number[i][j+1]=="0".charAt(0)) {
		        	count++;
		        	vertical[i][j]=1;
		        	vertical[i+1][j]=1;
		        	vertical[i][j+1]=1;
		        	
		        }
		        if(vertical[i][j]==0 && number[i][j]=="0".charAt(0) && number[i+1][j]!="0".charAt(0) && number[i][j+1]!="0".charAt(0)) {
		        	count++;
		        	vertical[i][j]=1;
		        	
		        }
		        if(vertical[i][j]==0 && number[i][j]=="0".charAt(0) && number[i+1][j]=="0".charAt(0) && number[i][j+1]!="0".charAt(0)) {
		        	count++;
		        	vertical[i][j]=1;
		        	vertical[i+1][j]=1;	
		        }
		        if(vertical[i][j]==0 && number[i][j]=="0".charAt(0) && number[i+1][j]!="0".charAt(0) && number[i][j+1]=="0".charAt(0)) {
		        	count++;
		        	vertical[i][j]=1;
		        	vertical[i][j+1]=1;	
		        }
		        if(vertical[i][j]==1 && number[i][j]=="0".charAt(0) && number[i+1][j]=="0".charAt(0) && number[i][j+1]=="0".charAt(0)) {
		        	vertical[i][j]=1;
		        	vertical[i][j+1]=1;
		        	vertical[i+1][j]=1;
		        }
		        if(vertical[i][j]==1 && number[i][j]=="0".charAt(0) && number[i+1][j]!="0".charAt(0) && number[i][j+1]=="0".charAt(0)) {
		        	vertical[i][j]=1;
		        	vertical[i][j+1]=1;
		        }
		        if(vertical[i][j]==1 && number[i][j]=="0".charAt(0) && number[i+1][j]=="0".charAt(0) && number[i][j]=="0".charAt(0)) {
		        	vertical[i][j]=1;
		        	vertical[i+1][j]=1;
		        }
		        else {
		        	continue;
		        }
		        
		      }
		    }
		
				
//		for(int i = 0;i<column;i++){
//		      for(int j = 0;j<row-1;j++){
//		        if(horizontal[i] ==0 && number[j][i]=="0".charAt(0)){
//		            if(number[j+1][i] =="0".charAt(0)){
//		              horizontal[i] = horizontal[i] +1;
//		              count++;
//		            }
//		            else{
//		              horizontal[i] = 0;
//		            }
//		        }
//		        if(horizontal[i] >0 && number[j][i]=="0".charAt(0)){
//		            if(number[j+1][i] =="0".charAt(0)){
//		              horizontal[i] = horizontal[i] +1;
//		              count++;
//		            }
//		            else{
//		              horizontal[i] = 0;
//		            }
//		        }
//		        if(number[j][i] =="1".charAt(0)){
//		          horizontal[i] = 0;
//		        }
//		        else {
//		        	continue;
//		        }
//		      }
//		    }
		System.out.println(count);

	}

}
