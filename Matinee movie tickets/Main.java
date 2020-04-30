#include<iostream>
using namespace std;
int main()
{
  float age, time;
  cin>>age>>time;
  if(int(time) == 13 || int(time) == 22){
    if(age>13)
      cout<<"$5.00";
    else
      cout<<"$2.00";
  }
  else{
    if(age>13)
      cout<<"$8.00";
    else
      cout<<"$4.00";
  }
}