#include<iostream>
using namespace std;
void print(int x){
  if(x)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}
int main()
{
  int r, count = 0,c, flag = 0;
  cin>>r>>c;
  while(r>=0 && c>=0){
    r--; c--; flag = !flag;
  }
  print(flag);
}