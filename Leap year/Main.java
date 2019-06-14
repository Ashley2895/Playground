#include<stdio.h>
int main()
{
  int n,leap;
  scanf("%d",&n);
  if(n%4==0)
  {
    if(n%100==0)
    {
      if(n%400==0)
        printf("Leap year",n);
      else
        printf("Not Leap year",n);
    }
    else
        printf("Leap year",n);
  }
    else
        printf("Not Leap year",n);
     
  return 0;
}