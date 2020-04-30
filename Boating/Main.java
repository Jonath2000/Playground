#include<iostream>
using namespace std;
int main()
{
  int weightmax, weight, adult, child;
  std::cin>>weightmax>>adult>>child;
  weight = (adult*75)+(child*30);
  if(weight<weightmax)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}