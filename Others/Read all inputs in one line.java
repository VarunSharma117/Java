/* 
 * Read all inputs in one line from STDIN, separated by space and print them.
*/

import java.io.*;
import java.util.*;
class multi_input {
    public static void main(String args[] ) throws Exception {

    	Scanner sc = new Scanner(System.in);
        String inp1[]=sc.nextLine().split(" ");
		int intinp1 [] = new int[inp1.length];
		for (int i=0; i<inp1.length;i++){
			intinp1[i] = Integer.parseInt(inp1[i]);
			System.out.println(intinp1[i]);
		}
		

   }
}
