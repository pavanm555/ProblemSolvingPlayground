#include <iostream>
using namespace std;

int main(){
    long n;
    cin>>n;
    long temp, rev=0;
    temp = n;
    while(temp>0){
        rev <<= 1;
        if((temp&1) == 1){
            rev ^= 1;
        }
        temp >>= 1;
    }

    if(n == rev){
        cout<< "Palindrome" << endl;
    }
    else{
        cout<<"Not Palindrome"<<endl;
    }
}