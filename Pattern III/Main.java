#include <iostream>
using namespace std;
int main(){
  int val, n = 1; 
  cin>>val;
  cout<<n++<<"\n";
  for(int i = 1; i<val; i++){
    for(int j = 0; j<=i; j++){
      cout<<n;
      if(j>=0 && j<n-1)
        cout<<"*";
    }
    cout<<"\n";
    n++;
  }
    for(int i = val; i>0; i--){
      n--;
    for(int j = 0; j<i; j++){
      cout<<n;
      if(j>=0 && j<n-1)
        cout<<"*";
    }
    cout<<"\n";
  }
}