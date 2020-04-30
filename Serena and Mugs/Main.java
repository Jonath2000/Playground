#include<iostream>
using namespace std;
int printresult(int *a, int size, int vol){
  int sum = 0;
  for(int i = 0; i<size; i++)
    sum += a[i];
  if(sum <= vol)
    cout<<"YES";
  else 
    cout<<"NO";
  return 0;
}
int main()
{
  int n, s;
  cin>>n>>s;
  int arr[n];
  for(int i = 0; i<n; i++)
    cin>>arr[i];
  n = sizeof(arr)/sizeof(arr[0]);
  int result = printresult(arr, n, s);
}