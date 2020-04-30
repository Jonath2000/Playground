#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	std::string fnum;
	cin>>fnum;
	int pos = fnum.find(".");
    cout<<"Floating part is : ";
    if(pos != std::string::npos){
      for(int i = pos+1; i<fnum.length(); i++)
        cout<<fnum[i];
    }
}