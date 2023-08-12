#include <iostream>
using namespace std;

int main(){
    int a,b;
    cin>>a;
    cin>>b;
    cout<< "Before swapping: "<< a << " " << b << endl;
    a = a+b;
    b = a-b;
    a = a-b;
    cout<< "After swapping: "<< a << " " << b << endl;
    return 0;
}