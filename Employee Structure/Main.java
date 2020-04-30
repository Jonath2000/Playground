#include<iostream>
#include <cstring>
using namespace std;
struct student {
  char name[30];
  int id;
  int age;
  char designation[25];
  int salary;
};
int main()	{
  struct student data;
    cout<<"Enter name:\n";
    cin.get(data.name, 30);
    cout<<"Enter ID:\n";
    scanf("%d\n", &data.id);
    cout<<"Enter age:\n";
    scanf("%d\n", &data.age);
    cout<<"Enter designation:\n";
    cin.get(data.designation, 25);
    cout<<"Enter Salary:\n";
    scanf("%d\n", &data.salary);
    
    cout<<"Employee Details\n";
    cout<<"Name of the Employee : "<<data.name<<endl;
    cout<<"ID of the Employee : "<<data.id<<endl;
    cout<<"Age of the Employee : "<<data.age<<endl;
    cout<<"Designation of the Employee : "<<data.designation<<endl;
    cout<<"Salary of the Employee : "<<data.salary<<endl;
}