#include<iostream>
using namespace std;
int main()
{
  int n = -1, pos=-1, val=-1;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int arr[n+1];
  cout<<"Enter the elements in the array\n";
  for(int i = 0; i<n; i++)
    cin>>arr[i];
  arr[n] = 0;
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>pos;
  cin>>val;
  if(n==-1 || pos== -1|| val == -1)
    cout<<"Invalid Input";
  else	{
  	cout<<"Enter the value to insert\n";
  	for(int i = n; i>=pos; i--){
   	 arr[i] = arr[i-1];
  	}
  	arr[pos-1] = val;
  	cout<<"Array after insertion is\n";
  	for(int i = 0; i<=n; i++)
   	 cout<<arr[i]<<"\n";
  }
}