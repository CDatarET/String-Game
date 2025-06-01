import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		scan.nextLine();
		for(int c = 0; c < cases; c++){
		    int l = scan.nextInt();
		    scan.nextLine();
		    String str = scan.nextLine();
		    char[] chars = str.toCharArray();
		    //ArrayList<Character> list = new ArrayList<Character>();
		    Arrays.sort(chars);
		    int check = 0;
		    char checkChar = chars[0];
		    boolean broken = false;
		    
		    for(int i = 0; i < l; i++){
		        if(l % 2 != 0){
		            System.out.println("NO");
		            broken = true;
		            break;
		        }
		        if(checkChar != chars[i]){
		            if(check % 2 != 0){
		                System.out.println("NO");
		                broken = true;
		                break;
		            }
		        }
		        checkChar = chars[i];
		        check++;
		    }
		    if(!broken){
		        System.out.println("YES");
		    }
		}
	}
}
