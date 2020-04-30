#include<iostream>
using namespace std;
int rowSum(int* arr, int n, int size){
  int sum = 0;
  for(int i = 0; i<size; i++){
    sum += *((arr+n*size)+i);
  }
  return sum;
}
int columnSum(int* arr, int n, int size){
  int sum = 0;
  for(int i = 0; i<size; i++){
    sum += *((arr+i*size)+n);
  }
  return sum;
}
int mdiaSum(int* arr, int n){
    int sum = 0;
  for(int i = 0; i<n; i++){
    for(int j = 0; j<n; j++){
      if(i == j)
        sum += *((arr+i*n)+j);
    }
  }
  return sum;
}
int bdiaSum(int* arr, int n){
    int sum = 0;
  for(int i = 0; i<n; i++){
    for(int j = 0; j<n; j++){
      if(j == (n-i-1))
        sum += *((arr+i*n)+j);
    }
  }
  return sum;
}
int main()
{
  int n;
  cin>>n;
  int arr[n][n];
  int rowsum[n], columnsum[n];
  for(int i = 0; i<n; i++){
    for(int j = 0; j<n; j++){
        cin>>arr[i][j];
    }
  }
  for(int i = 0; i<n; i++){
    rowsum[i] = rowSum((int *)arr ,i, n);
    columnsum[i] = columnSum((int *)arr ,i, n);
  }
  int mdiasum = mdiaSum((int *)arr ,n);
  int bdiasum = bdiaSum((int *)arr ,n);
  for(int i = 1; i<n; i++){
    rowsum[0] += rowsum[i];
    columnsum[0] += columnsum[i];
  }
  rowsum[0]/=n; columnsum[0]/=n;
  if(rowsum[0] == columnsum[0] && rowsum[0] == mdiasum && rowsum[0] == bdiasum)
    cout<<"Yes";
  else
    cout<<"No";
}