#include <iostream>
using namespace std;

int main(){
    int num, temp, digit, rev=0;
    cout<<"Enter a number: ";
    cin>>num;
    temp = num;
    
    while(temp>0){
        digit = temp%10;
        rev = (rev*10) + digit;
        temp = temp/10;
    }

    if(num == rev){
        cout<< "Palndrome Number" << endl;
    }
    else{
        cout<< "Not Palindrome Number" << endl;
    }

    return 0;
}