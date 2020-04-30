#include <iostream>
using namespace std;
struct complex{
  int real = -50934, img = -50934;
};
int main(){
  complex n1, n2, out;
  int choise;
  cin>>choise;
  if(choise >=1 && choise<=3){
    cin>>n1.real>>n1.img>>n2.real>>n2.img;
    if(n1.real != -50934 && n2.real != -50934 && n1.img != -50934 && n2.img != -50934){
    if(choise == 1){
      out.real = n1.real+n2.real;
      out.img = n1.img+n2.img;
    }
    else if(choise == 2){
      out.real = n1.real-n2.real;
      out.img = n1.img-n2.img;
    }
    else{
      out.real = n1.real*n2.real - n1.img*n2.img;
      out.img = (n1.real+n1.img) * n2.img;
    }
    if(out.img>0)
      cout<<out.real<<"+"<<out.img<<"i";
    else if(out.img<0)
      cout<<out.real<<out.img<<"i";
    else
      cout<<out.real;
  }
  }
  else
    cout<<"Invalid choice";
}