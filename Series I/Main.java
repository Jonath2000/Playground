#include <iostream>
#include <iomanip>
using namespace std;
int main(){
  int n;
  cin>>n;
  float val = 0.5;
  for(int i = 0; i<n; i++){
    cout<<fixed<<setprecision(1)<<val<<" ";
    val *= 3;
  }
}