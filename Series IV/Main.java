#include<iostream>
using namespace std;
int main()
{
  int n, val;
  cin>>n;
  for(int i = 1; i<=n; i++){
    if(i%2 != 0)
      val = (i*i)-1;
    else
      val = (i*i)-2;
    cout<<val<<" ";
}
}