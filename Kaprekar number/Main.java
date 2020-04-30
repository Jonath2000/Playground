#include<iostream>
using namespace std;
int main()
{
  int n, digit = 0;
  cin>>n;
  int temp = n;
  while(temp){
    temp /= 10;
    digit++;
  }
  int square = n*n, squaredigit = 0, d1 = 0, d2 = 0, arr[20];
  temp = square;
  while(temp){
    arr[squaredigit++] = temp%10;
    temp /= 10;
  }
    for(int i = squaredigit-1; i>digit; i--){
      d1 += arr[i];
      d1 *= 10;
  }
    d1 += arr[digit];
    for(int i = digit-1; i>0; i--){
      d2 += arr[i];
      d2 *= 10;
    }
    d2 += arr[0];
  if(squaredigit <2)
    cout<<"Not a Kaprekar Number";
else if(d1+d2 == n)
  cout<<"Kaprekar Number";
else
  cout<<"Not a Kaprekar Number";
}