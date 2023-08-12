#include<iostream>
using namespace std;

int main(){
    int n1=0,n2=1,n3,count;
    cin>>count;
    cout<< "Fibonacci series of "<< count << " numbers: "<< endl;
    cout<< n1 << " "<< n2 << " ";
    for(int i=2;i<count;i++){
        n3=n1+n2;
        cout<< n3 <<" ";
        n1 = n2;
        n2 = n3;
    }

    return 0;
}