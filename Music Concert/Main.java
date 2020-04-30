#include<iostream>
#include <cstdlib>
using namespace std;
int main(){
  int n1, male = 0, female = 0;
  cin>>n1;
  int *a = (int *)malloc(n1*sizeof(int));
  for(int i = 0; i<n1; i++)
    cin>>*(a+i);
  for(int i = 0; i<n1; i++)
    if(*(a+i) % 2 == 0)
      female++;
    else
      male++;
  cout<<male<<"\n"<<female;
  return 0;
}