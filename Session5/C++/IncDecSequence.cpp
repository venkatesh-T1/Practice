#include<bits/stdc++.h>
using namespace std;
// 5, 4, 3, 2, 1
void dec(int n)
{
    // base case
    if(n==0)
    {
        return;
    }
    cout<<n<<", ";
    dec(n-1);
}

// 1, 2, 3, 4, 5
void inc(int n)
{
    // base case
    if(n==0)
    {
        return;
    }
    inc(n-1);
    cout<<n<<", ";
}

int main(){
    int n;
    cin>>n;
    //dec(n);
    inc(n);
    return 0;
}