#include<iostream>
using namespace std;
int main()
{
  int w,x,y, profit;
  std::cin>>w>>x>>y;
  profit = w*(x-y)-100;
  std::cout<<profit;
}