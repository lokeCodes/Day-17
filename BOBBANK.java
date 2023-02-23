// https://www.codechef.com/problems/BOBBANK
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		    int t = s.nextInt();
		    while(t-- > 0){
		        int w = s.nextInt();
		        int x = s.nextInt();
		        int y = s.nextInt();
		        int z = s.nextInt();
		        int res = ((x-y)*z)+w;
		        System.out.println(res);
		    }
	}
}

