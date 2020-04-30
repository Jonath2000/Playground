#include<iostream>
using namespace std;
int main()
{
  int row, column, no;
  std::cin>>row>>column>>no;
  if((no>row && no<=row*2)||(no<=(row*(row-1)) &&(no>(row*(row-2)))))
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}