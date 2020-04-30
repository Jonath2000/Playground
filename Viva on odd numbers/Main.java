#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
  float score = 0;
  for(int i = 0; i<3; i++){
    int n = 0;
    cin>>n;
    if(n<0)	
		score -= 1;    
    else if(n == 0){}
    else if(n%2 != 0)
      score += 1;
    else{
      score -= 0.5;
      i--;
    }
  }
  cout << fixed << setprecision(1) << score;
}