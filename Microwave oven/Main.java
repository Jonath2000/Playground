#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
  float n, time;
  cin>>n>>time;
  cout << std::fixed;
  cout << std::setprecision(2);
  if(n == 1)
    cout<<time;
  else if(n == 2)
    cout<<(time+time/2);
  else if(n==3)
    cout<<(time*2);
  else
    cout<<"Number of items is more";
}