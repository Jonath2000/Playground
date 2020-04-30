#include<iostream>
using namespace std;
int main()
{
  string str;
  int vowel = 0, consonant=0, whitespace=0, digit=0, symbol=0;
  getline(cin, str);
  for(int i = 0; i<str.length(); i++){
    if((str[i]>='a' && str[i]<='z')||(str[i]>='A' && str[i]<='Z')){
      if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U' )
        vowel++;
      else
        consonant++;
    }
    else if(str[i] == ' ')
      whitespace++;
    else if(str[i]>='0' && str[i]<='9')
      digit++;
    else
      symbol++;
  }
  cout<<"Vowels:"<<vowel;
  cout<<"\nConsonants:"<<consonant;
  cout<<"\nWhite Spaces:"<<whitespace;
  cout<<"\nDigits:"<<digit;
  cout<<"\nSymbols:"<<symbol;
}