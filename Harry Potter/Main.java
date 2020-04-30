#include<iostream>
using namespace std;
int main()
{
  int n, out=0;
  std::cin>>n;
  out = n%10;
  n /= 1000;
  out+= n;
  std::cout<<out;
}