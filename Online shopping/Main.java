#include<iostream>
using namespace std;
int main()
{
  int flipamount, flipdiscount, flipship, snapamount, snapdiscount, snapship, amazonamount, amazondiscount, amazonship;
  int flipfinal, snapfinal, amazonfinal;
  cin>>flipamount>>flipdiscount>>flipship>>snapamount>>snapdiscount>>snapship>>amazonamount>>amazondiscount>>amazonship;
  flipfinal = flipamount - flipamount*flipdiscount/100 + flipship;
  snapfinal = snapamount - snapamount*snapdiscount/100 + snapship;
  amazonfinal = amazonamount - amazonamount*amazondiscount/100 + amazonship;
  cout<<"In Flipkart Rs."<<flipfinal<<"\n";
  cout<<"In Snapdeal Rs."<<snapfinal<<"\n";
  cout<<"In Amazon Rs."<<amazonfinal<<"\n";
  cout<<"He will prefer ";
  if(flipfinal<=snapfinal && flipfinal<=amazonfinal)
    cout<<"Flipkart";
  else if(snapfinal<flipfinal && snapfinal<amazonfinal)
    cout<<"Snapdeal";
  else
    cout<<"Amazon";
}