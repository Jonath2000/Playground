#include <iostream>
using namespace std;
int main()    {
  int val = 1;
  int n;
  cin>>n;
  for(int i = 0; i<n; i++){
    if(i%2 != 0){
      for(int j = 0; j<=i; j++){
        cout<<val--;
        if(j>=0 && j<i){
          cout<<"*";
        }
      }
      cout<<"\n";
      val += i + 2;
    }
    else{
          for(int j = 0; j<=i; j++){
        cout<<val++;
        if(j>=0 && j<i){
          cout<<"*";
        }
      }
      cout<<"\n";
      val += i+1;
    }
  }
}