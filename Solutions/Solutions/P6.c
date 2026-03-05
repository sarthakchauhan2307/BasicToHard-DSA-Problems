#include<stdio.h>

void main(){
	int n=23,sum=0,temp=0;
	temp=n;
	while(temp!=0){
		sum=sum+(temp%10);
		temp=temp/10;
	}
	if(n%sum==0){
		printf("Harshad Number");
	}
	else{
		printf("Not Harshad Number");
	}
}
