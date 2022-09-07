https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1/

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr); 
        Arrays.sort(dep); 
    	int curr=1;
    	int minPf=1;
    	int i=1;
    	int j=0;
    	
    	while(i<n)
    	{
    	    if(arr[i] <= dep[j])
    	    {
    	        i++;
    	        curr++;
    	    }
    	    else
    	    {
    	        j++;
    	        curr--;
    	    }
    	    minPf=Math.max(minPf, curr);
    	}
    	
    	return minPf;
    }
    
}