#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float hyp,opp,adj;
  scanf("%f%f",&opp,&adj);
  hyp=sqrt((opp*opp)+(adj*adj));
  printf("%0.2f",hyp);
  return 0;
}