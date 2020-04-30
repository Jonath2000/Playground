#include<iostream>
using namespace std;
int main()
{
  int n, even = 0, odd = 0;
  cin>>n;
  int arr[n];
  for(int i = 0; i<n; i++){
    cin>>arr[i];
    if(arr[i]%2 == 0)
      even+= arr[i];
    else
      odd+= arr[i];
  }
  cout<<"The sum of the even numbers in the array is "<<even<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<odd;
}