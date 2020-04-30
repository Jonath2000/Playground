#include <iostream>
int main(){
  int max,n;
  std::cin>>max>>n;
  if(n<max)
    std::cout<<"Yes, you can enter.";
  else if(n==max)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}