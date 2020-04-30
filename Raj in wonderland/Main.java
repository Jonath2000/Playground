#include <iostream>
int main()	{
  int n, i = 0, rem, arr[10];
  std::cin>>n;
  while(n)	{
    rem = n%10;
 	n /= 10;
    arr[i] = rem;
    i++;
  }
  if(i == 1)
    std::cout<<"Not possible";
  else
  (arr[i-1] +1 == arr[i-2])?std::cout<<"Possible":std::cout<<"Not possible";
}