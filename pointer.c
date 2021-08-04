#include<stdio.h>
int main(){
    int n=2;
    int *p=&n;
    *p=0;
    printf("%d",n);
    return 0;
}