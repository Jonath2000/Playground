#include <iostream>
using namespace std;
int main(){
  int n1, n2;
  cin>>n1>>n2;
  for(int i = n1+1; i< n2; i++){
    int a = i, sum = 0;
    for(int j = 1; j<a; j++){
      if(a%j == 0)
        sum+= j;
  	}
  	if(sum == a)
  		cout<<a<<" ";
  }
}