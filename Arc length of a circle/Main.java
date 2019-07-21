#include<stdio.h>
int main()
{
float r,arg,len;
  scanf("%f%f",&r,&arg);
  len=2*3.14*r*(arg/360);
  printf("%0.2f",len);
  return 0;
}
