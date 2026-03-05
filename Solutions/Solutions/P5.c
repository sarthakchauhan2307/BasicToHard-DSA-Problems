#include<stdio.h>
void main(){
	int i=0,j=0,n=4,sumI=0,sumJ=0;
	
	for(i=1;i<=n;i++){
		sumJ=0;
		for(j=1;j<=i;j++){
			sumJ=sumJ+j;		
		}
		sumI=sumI+sumJ;
	}
	printf("%d",sumI);
	
}
