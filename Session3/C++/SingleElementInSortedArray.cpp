#include<iostream>
using namespace std;

int singleNonDuplicate(int arr[], int n) 
{
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

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    cout<<singleNonDuplicate(arr, n);
    return 0;
}
    