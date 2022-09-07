https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1/

    int findPlatform(int arr[], int dep[], int n)
    {
    	// Your code here
    	sort(arr, arr+n);
    	sort(dep, dep+n);
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
    	    minPf=max(minPf, curr);
    	}
    	
    	return minPf;
    }