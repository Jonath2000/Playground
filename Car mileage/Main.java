#include<iostream>
using namespace std;
int main()
{
  float mileage, petrol, dist;
  cin>>mileage>>petrol>>dist;
  if(dist>mileage*petrol)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
    
}