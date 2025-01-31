#include<stdio.h>

int main() {
    float price [3];
    printf("enter the actual cost of the prizes:");
    scanf("%f",&price[0]);
    scanf("%f",&price[1]);
    scanf("%f",&price[2]);

    printf("The total price 1:%f",price[0]+(0.18*price[0])); 
    printf("The total price 2:%f",price[1]+(0.18*price[1])); 
    printf("The total price 3:%f",price[2]+(0.18*price[2])); 

    return 0;
 
}
