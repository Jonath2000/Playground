#include <iostream>
using namespace std;
int sumofdigit(int n){
  if(n<=9)
    return n;
  else{
    int sum = 0;
    while(n){
      sum += n%10;
      n/=10;
    }
    return sumofdigit(sum);
  }
}
int main(){
  int n;
  cin>>n;
  int ans = sumofdigit(n);
  cout<<ans;
}