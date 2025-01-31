#include<stdio.h>

int main () {
    int n;
    printf("enter the  number:");
    scanf("%d",&n);

    int sum =0;

    for(int i=0; i<=n; i++) {
        sum=sum+i;


    }
    printf("sum is %d \n",sum);

    // int i=0;
    // while(i <= n) {
    //     printf("%d\n",i);
    //     i++;
    // }

    return 0;

}