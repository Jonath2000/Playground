#include <iostream>
using namespace std;
int main(){
  int n, val1 = 1, count = 0;
  cin>>n;
  int val2 = n*(n+1) - (n-1);
  for(int i = n; i>0; i--){
    for(int j = 0; j<count; j++)
      cout<<"--";
    for(int j = 0; j<i; j++){
      cout<<val1++;
      if(j>=0&&j<n)
        cout<<"*";
    }
    for(int j = 0; j<i; j++){
      cout<<val2++;
      if(j>=0&&j<i-1)
        cout<<"*";
    }
    val2 = val2 - 2*(i)+1;
    cout<<"\n";
    count++;
  }
}