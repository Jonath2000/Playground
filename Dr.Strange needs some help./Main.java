#include <iostream>
using namespace std;
int exp(int a, int b);
int main(){
  int a,b, req;
  cin>>a>>b>>req;
  int ans = exp(a,b);
  if(ans>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
int exp(int a, int b){
  int ans = 1;
  for(int i = 0; i<b; i++){
    ans *= a;
  }
  return ans;
}