#include<iostream>
using namespace std;

int main(){
    string str = "refere";
    string reverse = "";
    for(int i=0;i<str.length();i++){
        reverse = str[i] + reverse;
    }

    if(str == reverse){
        cout<<"palindrome"<<endl;
    }
    else{
        cout<<"not a palindrome"<<endl;
    }

    return 0;
}