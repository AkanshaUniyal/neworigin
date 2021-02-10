#include <stdio.h>
int main()
{
    int a=0,b=1,c=2,k=0,n;
    printf("Enter the number of terms of series");
    scanf("%d",&n);

    while(n>0)
    {
        k=a+b+c;
        printf("%d ",a,b,c);
        a=b;b=c;c=k;  n--; 
    }

}