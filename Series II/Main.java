#include <iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  for(int i = 0; i<n; i++){
	int val = (11+(4*i))*(11+(4*i));
      cout<<val<<" ";
  }
}