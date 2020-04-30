#include<iostream>
using namespace std;
int main()
{
  int n, count = 0;
  cin>>n;
  do{
    n = n/10;
    count++;
  }while(n);
  cout<<count;
}