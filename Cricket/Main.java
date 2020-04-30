#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
  float totalballs, totalruns, runsscored, ballsbowled;
  float totalovers, oversplayed, currentrr, totalrr;
  cin>>totalballs>>totalruns>>runsscored>>ballsbowled;
  totalovers = totalballs/6;
  int balls = int(ballsbowled)%6;
  int overs = int(ballsbowled)/6;
  oversplayed = float(overs) + float(balls)/10;
  currentrr = runsscored/oversplayed;
  totalrr = totalruns/totalovers;
  cout<<totalovers<<"\n";
  cout << std::fixed;
  cout << std::setprecision(1);
  cout<<oversplayed<<"\n"<<currentrr<<"\n"<<totalrr<<"\n";
  if(currentrr>totalrr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}