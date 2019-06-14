#include<stdio.h>
int sec_large(int no1,int no2,int no3);
int main()
{
   int no1,no2,no3;
  scanf("%d",&no1);
   scanf("%d",&no2);
   scanf("%d",&no3);
  printf("second greatest = %d",sec_large(no1,no2,no3));
}
int sec_large(int no1,int no2,int no3)
{
  if(no1>no2 && no1>no3)
  {
    return no2>no3 ? no2:no3;
  }
  else if(no2>no3)
  {
    return no1>no3 ? no1:no3;
  }
  else
  {
    return no1>no2 ? no1:no2;
  }
  return 0;
}
  