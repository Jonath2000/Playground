#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int temp = n, sum, arr[10], no = 0;
  while(temp){
    int rem = temp%10;
    arr[no++] = rem;
    temp /= 10;
  }
  for(int i = 0; i<no; i++){
    int val = 1;
    for(int j = 0; j<no; j++){
      val *= arr[i];
    }
    sum += val;
  }
  if(n == sum)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}