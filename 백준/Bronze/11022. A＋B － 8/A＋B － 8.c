#include<stdio.h>
int main(){
    int num,a,b,i;
    scanf("%d",&num);
    for(i=1;i<=num;i++){
        scanf("%d %d",&a,&b);
        printf("Case #%d: %d + %d = %d\n",i,a,b,a+b);
    }
}

