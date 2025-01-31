#include<stdio.h>
#include<math.h>

float squarearea(float side);
float circlearea(float rad);
float rectanglearea(float a,float b);

int main() {
    float side=65;
    float side=65;
    printf("Area is %f",squarearea(side));
    return 0;


}

float squarearea(float side){
    return side*side;
}
float circlearea(float rad) {
    return 3.14*rad*rad;
}
float rectanglearea(float a,float b){
    return a*b; 
}
