import java.util.Scanner;
class SingleElement{  

    public static int findElement(int arr[])
    {
        int n = arr.length;
        if(n==1 || arr[0]!=arr[1])
        {
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2])
        {
            return arr[n-1];
        }
        
        int s = 0;
        int e = n-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
            {
                return arr[mid];
            }
            // index is even
            else if(mid%2==0)
            {
                if(arr[mid]==arr[mid+1])
                {
                    s = mid+1;
                }
                else
                {
                    e = mid-1;
                }
            }
            // odd index
            else
            {
                if(arr[mid]==arr[mid-1])
                {
                    s = mid+1;
                }
                else
                {
                    e = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(findElement(arr));
    }  
}  