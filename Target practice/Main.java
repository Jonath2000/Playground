#include<iostream>
using namespace std;
int main()
{
  int target, sum = 0, count = 0;
  cin >> target;
  while(sum<target){
    int n;
    cin>>n;
    sum+=n;
    count++;
  }
  cout<<"The number of turns is "<<count;
}