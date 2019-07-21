#include<stdio.h>
int main()
{
	//your code here
  long int n,fact=1;
  int i;
  scanf("%ld",&n);
  for(i=1;i<=n;i++)
  {
    fact=fact*i;
}
  printf("%ld",fact);
  return 0;
}