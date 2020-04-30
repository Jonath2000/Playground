#include<iostream>
using namespace std;
int main()
{
  int row, column, tree;
  cin>>row>>column>>tree;
  int condition = ((tree>=1 && tree<=column) || ((tree-1)%column == 0) || (tree%column == 0));
    if(condition)
      cout<<"Yes";
    else
      cout<<"No";
}