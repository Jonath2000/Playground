#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  student s1;
  cin.getline(s1.name, 50);
  cin>>s1.roll>>s1.marks;
  cout<<endl;
  cout<<"Student Details";
  cout<<"\nName: "<<s1.name;
  cout<<"\nRoll: "<<s1.roll;
  cout<<"\nMarks: "<<int(s1.marks);
}