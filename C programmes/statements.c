#include<stdio.h>

int main() {
    int marks;
    printf("enter the marks:");
    scanf("%d",&marks);

    if(marks>90) {
        printf("The students who scored bove 90 they are called are A+ students \n");
        printf("They are intelligent \n");

    }

    else if(marks<90 && marks>75){
        printf("The students who scored less than 90 and above 75 they are good \n");
        printf("They have to work more to get A+ in the forther examinations \n");
    }    


    else{
        printf("Better luck next time to the students who scored less than 75 marks \n");

    }

    return 0;
}        