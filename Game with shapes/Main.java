#include<iostream>
using namespace std;
int main()
{
  int dia, rad, length;
  cin>>rad>>length;
  dia = rad*2;
  if(dia>length)
    cout<<"circle cannot be inside a square";
  else
    cout<<"circle can be inside a square";
}