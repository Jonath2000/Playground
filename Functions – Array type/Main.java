#include<iostream>
using namespace std;
int main()
{
  int a = -1,i = 0,odd=0,even=0;
  cout << "Enter the number of elements in the array\n";
  cin>>a;
    if(a!= -1){
  int ar[a];
    cout<<"Enter the elements in the array\n";
  for(i=0;i<a;i++)
    cin>>ar[i];
  for(i=0;i<a;i++)
  {
    if(ar[i]%2==0)
      even+=1;
    else
      odd+=1;
  }
  if(odd>0 && even==0)
    printf("The array is Odd");
  else if(odd==0 && even>0)
    printf("The array is Even");
  else
    printf("The array is Mixed");
    }
}