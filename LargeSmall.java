import java.util.Scanner;
class LargeSmall
{
int great(int[] arr,int n)
{
    int max=arr[0];
    
    for(int i=1;i<n;i++)     
    {   
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }
    
        return max;    
           
}

int least(int[] arr,int n)
{
    int min=arr[0];
    
    for(int i=1;i<n;i++)     
    {   
        if(arr[i]<min)
        {
            min=arr[i];
        }
    } 
    
    return min;   
           
}
    public static void main(String args[])
    {
        int n,i,r1,r2;
        
        Scanner sc=new Scanner(System.in);
        
        LargeSmall max=new LargeSmall();
        LargeSmall min=new LargeSmall();
        
        System.out.print("Enter n : ");
        n=sc.nextInt();
        
        int[] arr=new int[n];
        
        for(i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" no : ");
            arr[i]=sc.nextInt();
           
        }
        
        r1=max.great(arr,n);
        r2=min.least(arr,n);
        
        System.out.println("Largest Number = "+r1);
        System.out.println("Smallest Number = "+r2);
        
    }    
}        
        
                
            