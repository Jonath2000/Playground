#include<iostream>
using namespace std;
int main()
{
  int x,y,distx,disty,dist;
  std::cin>>x>>y;
  distx = (x-3);
  disty = (y-4);
  if(!distx || !disty)
    dist = distx+disty;
  else if(distx>disty)
    dist = distx;
  else if(disty>distx)
    dist = disty;
  std::cout<<dist;
}