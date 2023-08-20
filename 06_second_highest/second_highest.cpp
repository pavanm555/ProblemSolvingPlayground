#include<iostream>
using namespace std;

int main(){
    int arr[] = {8,5,2,6,7,9,12};
    int highest, second_highest;
    highest = arr[0];
    second_highest = arr[0];
    for(int i : arr){
        if(i>highest){
            second_highest = highest;
            highest = i;
        }
        else if(i>second_highest){
            second_highest=i;
        }
    }
    cout<< "Second highest: "<< second_highest << endl;
    cout<< "Highest: "<< highest << endl;

    return 0;
}