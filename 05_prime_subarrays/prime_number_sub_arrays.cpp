#include<iostream>
#include<vector>
using namespace std;

int main(){
    cout<< "Enter a number: ";
    int num;
    cin>>num;
    vector<bool> isPrime(num+1,true);

    for(int i=2;i<=num;i++){
        if(isPrime[i]){
            for(int j=i*i;j<=num;j=j+i){
                isPrime[j] = false;
            }
        }
    }
    
    // print prime numbers and push into the vector
    cout<< "Prime numbers between 1 and " << num << " are: "<< endl;
    vector<int> primes;
    for(int i=2;i<=num;i++){
        if(isPrime[i]){
            cout<< i;
            primes.push_back(i);
            if(i!=num){
                cout<< ", ";
            }
        }
    }   
    cout<< endl;    

    // printing subarrays
    cout<< "Printing all the subarrays:"<<endl;
    for(int i=0;i<primes.size();i++){
        for(int j=i;j<primes.size();j++){
            for(int k=i;k<=j;k++){
                cout<< primes[k] << " ";
            }
            cout<< endl;
        }
    }

    // printing subarrays whose sum is an even number
    cout<< "Printing the subarrays whose sum is even:"<<endl;
     for(int i=0;i<primes.size();i++){
        for(int j=i;j<primes.size();j++){
            int sum=0;
            for(int k=i;k<=j;k++){
                sum += primes[k];    
            }
            if(sum%2==0){
                for(int k=i;k<=j;k++){
                    cout<< primes[k] << " ";    
                }
                cout<< endl;
            }
        }
    }
    return 0;
}