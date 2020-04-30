#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int arr1[r][c], arr2[r][c];
  for(int i = 0; i<r; i++)
    for(int j = 0; j<c; j++)
      cin>>arr1[i][j];
  for(int i = 0; i<r; i++){
    for(int j = 0; j<c; j++){
      cin>>arr2[i][j];
      cout<<(arr1[i][j] + arr2[i][j])<<" ";
    }
  cout<<"\n";
  }
}