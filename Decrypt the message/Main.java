#include <iostream>
using namespace std;
int main(){
  int a, b, sum = 0;
  cin>>a>>b;
  a+=b;
  for(int i = 1; i<a; i++){
    if(a%i == 0)
      sum += i;
  }
  if(sum == a)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}