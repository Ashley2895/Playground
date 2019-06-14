#include<stdio.h>
int main()
{
  int l=6,b=9,area,peri;
  area= l * b;
  peri= 2 * (l + b);
  printf("The perimeter of the rectangle is: %d cm \nThe area of the rectangle is: %d sq cm",peri,area);
  return 0;
}