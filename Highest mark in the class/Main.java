#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int arr[n];
  for(int i = 0; i<n; i++)
    cin>>arr[i];
  int greatest = arr[0];
  for(int i = 1; i<n; i++)
    if(arr[i] > greatest)
      greatest = arr[i];
  cout<<greatest;
}