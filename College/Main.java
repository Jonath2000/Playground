#include<iostream>
using namespace std;
 struct College { 
   char name[100]; 
   char city[100]; 
   int establishmentYear; 
   float passPercentage; 
 };
int main()
{
  int n;
  cout<<"Enter the number of colleges\n";
  scanf("%d\n", &n);
  College data[n];
  for(int i = 0; i<n; i++){
    cout<<"Enter the details of college "<<(i+1)<<endl;
    cout<<"Enter name\n";
    cin.getline(data[i].name, 100);
    cout<<"Enter city\n";
    cin.getline(data[i].city, 100);
    cout<<"Enter year of establishment\n";
    scanf("%d\n", &data[i].establishmentYear);
    cout<<"Enter pass percentage\n";
    scanf("%f\n", &data[i].passPercentage);
  }
  cout<<"Details of colleges\n";
  for(int i = 0; i<n; i++){
    cout<<"College:"<<(i+1)<<endl;
    cout<<"Name:"<<data[i].name<<endl;
    cout<<"City:"<<data[i].city<<endl;
    cout<<"Year of establishment:"<<data[i].establishmentYear<<endl;
    cout<<"Pass percentage:"<<data[i].passPercentage<<endl;
  }
}