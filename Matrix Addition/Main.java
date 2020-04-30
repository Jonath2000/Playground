#include<iostream>
using namespace std;
int addMatrix(int* arr,int* arr1,int* out,int r,int c){
  for(int i = 0; i<r; i++){
    for(int j = 0; j<c; j++){
        *((out+i*c)+j) = *((arr+i*c)+j) + *((arr1+i*c)+j);
    }
  }
    return 0;
}
int getElement(int *arr, int r, int c){
  for(int i = 0; i<r; i++){
    for(int j = 0; j<c; j++){
        cin>>*((arr+i*c)+j);
    }
  }
    return 0;
}

void printElement(int *arr, int r,int c){
  for(int i = 0; i<r; i++){
    for(int j = 0; j<c; j++){
      cout<<*((arr+i*c)+j)<<" ";
    }
    cout<<"\n";
  }
}
int main()
{
  static int r,c;
  cin>>r>>c;
  int arr[r][c];
  int arr1[r][c];
  int out[r][c];
  int status = getElement((int *)arr, r,c);
  if(status){}
  status = getElement((int *)arr1, r,c);
  if(status){}
  status = addMatrix((int *)arr,(int *)arr1,(int *)out,r,c);
  if(!status)
      printElement((int *)out, r,c);
}