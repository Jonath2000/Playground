#include<iostream>
using namespace std;
int power(int a, int n){
  if(n == 0)
    return 1;
  else
    return a*power(a,n-1);
}
int main()
{
  int a, n;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  int ans = power(a, n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<ans;
}