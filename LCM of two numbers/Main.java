#include<stdio.h>
int main()
{
  //Type your code here
    int a,b,d,c,i,sum;
 scanf("%d%d",&a,&b);
  sum=(a>b)? b:a;
  for(i=sum;i>=1;i--)
  {
    if(a%i==0&&b%i==0)
    {
    c=i;
    break;
    }
  }
  d=(a*b)/c;
  printf("%d",d);
  return 0;
}
 

 