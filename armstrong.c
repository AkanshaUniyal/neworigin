#include <stdio.h>
int main()
{
int num,original,rem,sum=0;
printf("Enter a number \n");
scanf("%d",&num);
original=num;
while(original!=0)
{
rem=original%10;
sum=sum+rem*rem*rem;
original=original/10;
}
if(sum==num)
printf("%d is an Armstrong no.",num);
else
printf("%d is not an armstrong number",num);
return 0;
}
