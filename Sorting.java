import java.util.*;

class Sorting
{
    static Scanner sc=new Scanner(System.in);
    
    void Sort(int arr[],int n)
    {
        int i,temp,j;
        
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array : ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
            
    
    public static void main(String args[])
    {
        int n,i;
        
        System.out.print("Enter no of Elements : ");
        n=sc.nextInt();
        
        int[] arr= new int[n];
        
        Sorting s=new Sorting();
        
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        
        s.Sort(arr,n);
    }
}