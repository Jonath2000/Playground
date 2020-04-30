#include <iostream>
using namespace std;
int main(){
  int val = 6;
  int n;
  cin>>n;
  for(int i = 0; i<n; i++){
    val += (5*i);
    cout<<val<<" ";
  }
}