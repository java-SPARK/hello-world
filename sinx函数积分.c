#include<stdio.h>
#include<math.h>
int main()
{
    double y,i;
    y=0;
    i=0.1;
    for(;i<=1;i++)
    {
        y=sin(i)+y;
    }
    y=y*0.1;
    printf("%f",y);
    return 0;
}
