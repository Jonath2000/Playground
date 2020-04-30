#include <iostream>
using namespace std;
int main(){
  int n; 
  cin>>n;
  for(int i = 0; i<4; i++){
    for(int j = 0; j<=i; j++){
      cout<<n;
    }
    cout<<"\n";
    n++;
  }
    for(int i = 3; i>=0; i--){
      n--;
    for(int j = 0; j<=i; j++){
      cout<<n;
    }
    cout<<"\n";
  }
}