import java.util.*;
import java.lang.*;
import java.io.*;
class Longest_common_subsequence_problem
 {
	  //function that finds the length of the common subsequence
    static void lcs(String a,String b)
    {
        int arr[][]=new int[a.length()+1][b.length()+1];

        for(int i=0;i<=a.length();i++)
        {
            arr[i][0]=0;

        }

        for(int j=1;j<=b.length();j++)
        {
            arr[0][j]=0;    
        }

        for(int i=1;i<=a.length();i++)
        {
            for(int j=1;j<=b.length();j++)
            {   
                      char c1=a.charAt(i-1);
                      char c2=b.charAt(j-1);
                if(c1!=c2)
                {
                    int m=Math.max(arr[i-1][j],arr[i][j-1]);
                    if(m<=i)arr[i][j]=m;
                    else arr[i][j]=i;
                }

                else
                {
                    int m=1+arr[i-1][j-1];
                    if(m<=i)arr[i][j]=m;
                    else arr[i][j]=i;
                }
            }
        }
        
        //uncomment to print array.    
        /*for(int i=0;i<=a.length();i++)
	    {
	        for(int j=0;j<=b.length();j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }*/
            
	    System.out.print(arr[a.length()][b.length()]+"\n");
	    return;
	}
	
	public static void main (String[] args)
	 {
	    String a;
	    String b;
      Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
            sc.nextLine();
	    while(t-->0)
	    {
	        a=sc.nextLine();
	        b=sc.nextLine();
	        
	        lcs(a,b);
	    }
	 }
}
