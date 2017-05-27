import java.io.*;
import java.math.*;
class SOLUTION_Tower_of_Hanoi
{
    int i;
    SOLUTION_Tower_of_Hanoi()throws IOException
    { i=1;
    }    
   
     void toh(char pA,char pB,char pC,int n)
    {
        if(n<=0)
        {
            System.out.println("WRONG INPUT !!!");
        }
            if(n==1)
            {
                System.out.println("STEP "+(i++)+": Move from "+pA+" to "+pC);
                
            }
            if(n>=2)
            {
                toh(pA,pC,pB,n-1);
                toh(pA,pB,pC,1);
                toh(pB,pA,pC,n-1);
                
            }
            
        }
    
    void main()throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of disks : ");
        int m=Integer.parseInt(in.readLine());
        double s=Math.pow(2,m)-1;
        System.out.println("Number of steps involved : "+(int)(s));
                toh('A','B','C',m);
       
    }
    
}