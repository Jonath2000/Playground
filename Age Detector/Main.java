#include<iostream>
using namespace std;
int main()
{
  int birth, present;
  cin>>birth>>present;
  if(present<birth)
    present += 100;
  cout<<(present-birth);
}