#include<iostream>
using namespace std;
int main()
{
  string str1;
  string str2;
  cin>>str1;
  cout<<str1<<"\n";
  while(str1 != "####"){
    cin>>str2;
    int len = str1.length();
    if(str1[len-1] == str2[0])
      cout<<str2<<"\n";
    str1 = str2;
  }
}