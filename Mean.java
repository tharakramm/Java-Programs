import java.util.*;

class Mean
{
    int sum(int arr[],int n)
    {
        int add=0,i;
    
        for(i=0;i<n;i++)
        {
            add=add+arr[i];
        }
    
        System.out.println("Sum= "+add);
        return add;
    }  

    void avg(int res,int n)
    {
        float a;
        
        
        a=(float)res/n;
    
        System.out.println("Mean= "+a);
    
    }    
    public static void main(String args[])
    {
        int n,i,res;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter n : ");
        n=sc.nextInt();
        
        Mean s=new Mean();
        
        int[] arr=new int[n];
        
        for(i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+"no : ");
            arr[i]=sc.nextInt();
            
        }
        
        res=s.sum(arr,n);
        s.avg(res,n);
        
    }
    
}                      
        
        