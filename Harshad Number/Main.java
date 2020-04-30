#include<iostream>
using namespace std;
int main()
{
  int n, sum = 0;
  cin>>n;
  int temp = n;
  while(n){
    sum += n%10;
    n/=10;
  }
  if(temp%sum == 0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}