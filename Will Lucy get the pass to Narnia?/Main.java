#include <iostream>
int main(){
  int n1, n2, menu, out, flag = 1;
  std::cout<<"Enter first number : ";
  std::cin>>n1;
  std::cout<<"Enter second number : ";
  std::cin>>n2;
  std::cout<<"Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  std::cin>>menu;
  switch(menu)	{
    case 1:
      out = n1+n2;
      break;
    case 2:
      out = n1-n2;
      break;
    case 3:
      out = n1*n2;
      break;
    case 4:
      out = n1/n2;
      break;
    case 5:
      out = n1%n2;
      break;
    default:
      std::cout<<"Invalid operation";
      flag = 0;
  }
  if(flag)
    std::cout<<out;
}