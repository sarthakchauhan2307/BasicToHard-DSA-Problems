#include <stdio.h>
void main() {
    int n = 12, k = 7;
    int count = 0;
	int i=0,ans=0;
    for (i = 1; i <= n; i++) {
        if (n % i == 0) {
            count++;
            if(count == k){
            	ans=i;
            	break;
			}             
        }
    }
    if(count<k){
    	printf("Not possible to find a %dth factor because number has only %d factor",k,count);
	}
	else
    	printf("%d", ans);
}
