#include<bits/stdc++.h>
using namespace std;
int main() {
        string s;
        cin >> s;
        int n;
        cin >> n;
        if(s == "front" && n%2 == 1) {
            cout << "Left Handed" << endl;
        }
       else if(s == "rear" && n%2 == 0) {
            cout << "Left Handed" << endl;
        }
        else {
            cout << "Right Handed" << endl;
        }
        return 0;
}

