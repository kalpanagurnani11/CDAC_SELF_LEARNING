// a

//  1 2
//  b c d
//  3 4 5 6
//  e f g h i
//  7 8 9 10 11 12

#include <iostream>
using namespace std;

int main() 
    int n = 4;

    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= i; j++)
            cout << j;
        for(int j = i-1; j >= 1; j--)
            cout << j;
        cout << endl;
    }

    for(int i = n-1; i >= 1; i--) {
        for(int j = 1; j <= i; j++)
            cout << j;
        for(int j = i-1; j >= 1; j--)
            cout << j;
        cout << endl;
    }
}