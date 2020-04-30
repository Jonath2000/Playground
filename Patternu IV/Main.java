#include <iostream>
using namespace std;
int main() {
  int n, val = 1;
  cin>>n;
  for(int i = 0; i<n; i++){
    if(i%2 == 0){
      for(int j = 0; j<n-1; j++){
        cout<<val;
      }
      cout<<++val<<"\n";
      val++;
    }
    else{
      cout<<val--;
      for(int j = 0; j<n-1; j++){
        cout<<val;
      }
      val++;
      cout<<"\n";
    }
  }
}