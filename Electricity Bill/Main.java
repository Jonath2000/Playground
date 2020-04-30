#include<iostream>
using namespace std;
int main()
{
  int unit, amount;
  std::cin>>unit;
  if(unit<=200)
    amount = unit*0.5;
  else if(unit<=400)
    amount = unit*0.65 + 100;
  else if(unit<=600)
    amount = unit*0.8 +200;
  else
    amount = unit*1.25 + 425;
  std::cout<<"Rs."<<amount;
}