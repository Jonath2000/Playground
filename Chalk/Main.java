#include<iostream>
#include <iomanip> 
#include<math.h>
using namespace std;
int main()
{
  float n, days = 0;
  cin>>n;
  float chalk = n;
  float temp = 1-(1/sqrt(n));
  while(int(n)>1){
    n = n*temp;   
    days+=chalk;
    n = chalk - n;
    chalk = n;
  }
  cout<<floor(days+1);
}