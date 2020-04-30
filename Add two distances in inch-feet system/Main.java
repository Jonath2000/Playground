#include<iostream>
using namespace std;
struct length {
  int feet;
  float inch;
}d1, d2;
int main()
{
  scanf("%d\n", &d1.feet);
  scanf("%f\n", &d1.inch);
  scanf("%d\n", &d2.feet);
  scanf("%f\n", &d2.inch);
  d1.feet += d2.feet;
  d1.inch += d2.inch;
  if(d1.inch >12){
    d1.inch -= 12;
    d1.feet++;
  }
  cout<<d1.feet<<"'-"<<d1.inch<<"\"";
}