#include<iostream>
using namespace std;
int main()
{
  int n, flag = 0, target;
  cin>>n;
  int arr[n];
  for(int i = 0; i<n; i++)
    cin>>arr[i];
  cin>>target;
  for(int i = 0; i<n; i++)
    if(arr[i] == target){
      flag = 1;
      break;
    }
  if(flag)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}