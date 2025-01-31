#include<stdio.h>

int main () {
    int marks;
    printf("enter the marks between(1-100)");
    scanf("%d",&marks);

    if (marks<=30) {
        printf("The grade of the student is C \n");
    }

    else if(marks>=30 && marks<=70) {
        printf("The grade of the student is B \n ");
    }
    else if(marks>=70 && marks<=90) {
        printf("The grade of the student is A \n");
    }
    else {
        printf("The grade of the student is A+ \n");
    }
    return 0;
}            