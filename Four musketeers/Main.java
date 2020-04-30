#include<iostream>
using namespace std;
int main()
{
  float x1,y1,x2,y2,x3,y3;
  float x4,y4;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  x4 = (x1+x2+x3)/3;
  y4 = (y1+y2+y3)/3;
  std::cout<<x4<<"\n"<<y4;
}