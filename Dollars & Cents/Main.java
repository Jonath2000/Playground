#include<iostream>
using namespace std;
int main()
{
  int d1, c1, d2, c2;
  cin>>d1>>c1>>d2>>c2;
  d1 += d2;
  c1+= c2;
  while(c1>100){
    c1-=100;
    d1++;
  }
  cout<<d1<<"\n"<<c1;
}