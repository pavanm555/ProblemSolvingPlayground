#include <iostream>
using namespace std;

int main(){
    string word;
    cin>> word;

    string reverse;

    for(int i=word.length()-1;i>=0;i--){
        reverse += word[i];
    }
    cout<< reverse;

    return 0;
}