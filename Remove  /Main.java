#include<iostream>
#include <string.h>
using namespace std;
int main()
{
  string str;
  getline(cin, str);
  int pos = 0;
  char temp[20];
  for(signed int i = 0; i<str.length(); i++){
    if(str[i]!= ' ')
      temp[pos++] = str[i];
    else{
      temp[pos] = '\0';
      int len1 = pos;
      pos = 0;
      string strtemp(temp);
      size_t found = str.find(strtemp);
      size_t found1 = str.find(strtemp, found+1); 
        if(found1 != std::string::npos){
          while(found1 != std::string::npos) {
            str.erase(found1, len1+1);
            found1 = str.find(strtemp, found1+1);
          }
          str.erase(found, len1+1);
        }     
    }
  }
    cout<<str;
}