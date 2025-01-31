#include<stdio.h>

int main() {

    int marks[3];

    printf("enter the maths marks:");
    scanf("%d",&marks[0]);

    printf("enter the physics marks:");
    scanf("%d",&marks[1]);

    printf("enter the chemistry marks:");
    scanf("%d",&marks[2]);

    printf("math:%d,phy:%d,chem:%d",marks[0],marks[1],marks[2]);

    return 0;


}