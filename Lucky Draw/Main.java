#include <iostream>
using namespace std;
int main(){
  int n, flag = 0;
  cin>>n;
  if(n>0){
    if(n == 1)
      flag = 1;
    for(int i = 2; i<n; i++){
      if(n%i == 0){
        flag = 1;
        break;
      }
    }
    if(flag == 0)
      cout<<"Eligible";
    else
      cout<<"Not eligible";
  }
}