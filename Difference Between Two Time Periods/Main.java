#include<iostream>
using namespace std;
int main()
{
  int hour1, min1, sec1;
  int hour2, min2, sec2;
  cin>>hour1>>min1>>sec1;
  cin>>hour2>>min2>>sec2;
  if(sec1<sec2){
    sec1 += 60;
    min1--;
  }
  sec1 -= sec2;
  if(min1<min2){
    min1 += 60;
    hour1--;
  }
  min1 -= min2;
  hour1 -= hour2;
    cout<<hour1<<":"<<min1<<":"<<sec1;
}