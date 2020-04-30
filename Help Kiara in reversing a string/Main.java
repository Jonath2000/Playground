#include <iostream>
#include <cstring>
using namespace std;
int main()
{
    char str[100], rev[100];     
    int count = 0, end, i;    
    cin.getline(str,100);
    count = strlen(str);
    end = count-1;
    for(i = 0; i<=end; i++)
        rev[i] = str[end-i];
    cout<<rev;
}