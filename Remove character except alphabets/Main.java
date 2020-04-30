#include<iostream>
using namespace std;
int main()
{
  string str;
  cin>>str;
  for(int i = 0; str[i]!='\0'; i++){
    if((str[i]>='a' && str[i]<='z')||(str[i]>='A' && str[i]<='Z'))
      continue;
    else{
      str.erase(str.begin()+i);
      i--;
    }
  }
  cout<<str;
}