#include<iostream>
using namespace std;
int main()
{
  int n, even, odd, i = 0;
  cin>>n;
  while(n){
    int rem = n%10;
    if(i %2 == 0)
      even += rem;
    else
      odd += rem;
    i++;
    n /= 10;
  }
  if(even == odd)
    cout<<"Yes";
  else
    cout<<"No";
}