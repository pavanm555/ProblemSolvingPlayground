#include<iostream>
#include<vector>
using namespace std;

int main(){
    int num;
    cin>> num;

    vector<bool> isPrime(num+1, true);
    for(int i=2;i<=num;i++){
        if (isPrime[i]){
            for(int j=i*i;j<=num;j+=i){
                isPrime[j] = false;
            }
        }
    }
    for(int i=2;i<=num;i++){
        if(isPrime[i]){
            cout<< i <<" ";
        }
    }
    return 0;
}