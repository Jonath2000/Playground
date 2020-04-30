#include<iostream>
using namespace std;
int main()
{
  int p,r,n;
  float interest, amount, discount, finalamount;
  std::cin>>p>>r>>n;
  p = float(p);
  r = float(r);
  n = float(n);
  interest = p*r*n/100;
  amount = p+interest;
  discount = interest*2/100;
  finalamount = amount - discount;
  std::cout<<interest<<"\n"<<amount<<"\n"<<discount<<"\n"<<finalamount;
}