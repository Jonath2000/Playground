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
  int rowsum[r];
  int columnsum[c];
  for(int i = 0; i<r; i++){
    int sum = 0;
    for(int j = 0; j<c; j++){
        sum += arr[i][j];
    }
    rowsum[i] = sum;
  }
  int max = 0;
  cout<<"Sum of rows is ";
  for(int i = 0; i<r; i++){
    if(rowsum[i]>max)
      max = rowsum[i];
    cout<<rowsum[i]<<" ";
  }
  cout<<endl;
  for(int i = 0; i<r; i++){
    if(rowsum[i] == max){
      cout<<"Row "<< (i+1) << " has maximum sum";
      break;
    }
  }
  for(int i = 0; i<c; i++){
    int sum = 0;
    for(int j = 0; j<r; j++){
        sum += arr[j][i];
    }
    columnsum[i] = sum;
  }
  cout<<endl;
  max = 0;
  cout<<"Sum of columns is ";
  for(int i = 0; i<r; i++){
    if(columnsum[i]>max)
      max = columnsum[i];
    cout<<columnsum[i]<<" ";
  }
  cout<<endl;
  for(int i = 0; i<r; i++){
    if(columnsum[i] == max){
      cout<<"Column "<< (i+1) << " has maximum sum";
      break;
    }
  }
}