
package workspace;

import java.util.Scanner;

public class Spiral {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements : ");
            int n = sc.nextInt();
 
            int A[][] = new int[n][n];
            int k=1, c1=0, c2=n-1, r1=0, r2=n-1;
 
            while(k<=n*n)
                {
                    for(int i=c1;i<=c2;i++)
                    {
                        A[r1][i]=k++;
                        System.out.println("first :" + k);
                    }
 
                    for(int j=r1+1;j<=r2;j++)
                    {
                        A[j][c2]=k++;
                        System.out.println("secont :" + k);
                    }
 
                    for(int i=c2-1;i>=c1;i--)
                    {
                        A[r2][i]=k++;
                        System.out.println("third :" + k);
                    }
 
                    for(int j=r2-1;j>=r1+1;j--)
                    {
                        A[j][c1]=k++;
                        System.out.println("fourth :" + k);
                    }
 
                 c1++;
                 c2--;
                 r1++;
                 r2--;
                }
   
            /* Printing the Circular matrix */
            System.out.println("The Circular Matrix is:");
            for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                        {
                            System.out.print(A[i][j]+ "\t");
                        }
                 System.out.println();
                }
        
    }
    
    
}
