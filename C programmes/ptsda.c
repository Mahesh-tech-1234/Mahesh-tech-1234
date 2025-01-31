#include<stdio.h>
int main(){
    int i=10;
    int const j=20;
     int*ptr=&i;
     printf("*ptr: %d\n",*ptr);

     ptr=&j;

      printf("*ptr: %d\n",*ptr);

      return 0;


}