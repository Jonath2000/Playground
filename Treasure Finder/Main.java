#include<iostream>
using namespace std;
int main()
{
  int n1, n2, n3;
  cin>>n1>>n2>>n3;
  int arr[3] = {n1, n2, n3};
  for(int i = 0; i<2; i++){
    for(int j = 0; j<2-i; j++){
      if(arr[j]>arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }
  }
  cout<<"The treasure is in box which has number "<<arr[1]<<"\n";
  for(int i = arr[2]; i>0; i--){
    if((arr[2]%i == 0)&&(arr[1]%i == 0)&&(arr[0]%i == 0)){
      cout<<"The code to open the box is "<<i;
      break;
    }
  }
}