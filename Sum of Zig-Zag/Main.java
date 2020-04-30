#include<iostream>
using namespace std;
int main()
{
  int r, c;
  cin>>r>>c;
  int arr[r][c];
  for(int i = 0; i<r; i++){
    for(int j = 0; j<c; j++){
      cin>>arr[i][j];
    }
  }
  int sum = 0;
  for(int i = 0; i<c; i++){
    sum += arr[0][i];
    sum+= arr[r-1][i];
  }
  for(int i = 1; i<r-1; i++){
    for(int j = 0; j<c; j++){
      if(r-i-1 == j)
        sum+= arr[i][j];
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}