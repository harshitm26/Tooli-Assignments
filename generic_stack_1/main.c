#include <stdio.h>
#include "mystack.h"
#include <stdlib.h>
//#include "mystack.c"


typedef struct mystruct{
	int a;
}mystruct;

int main(int argc, char** argv) {
	
	stack * s = stack_initialize();
	for(int i=0; i<10; i++){
		mystruct *j = (mystruct*)malloc (sizeof(mystruct));
		j->a = i;
		stack_push(s, j);										//push any user defined structure into the stack
	}
	int i=0;
	while(!stack_isempty(s)){									//check whether stack empty or not
		i++;
		printf("%d\n", ((mystruct *)stack_top(s))->a);
		stack_pop(s);											//pop from stack
	}
	for(int i=0; i<10; i++){
		int *j = (int*)malloc (sizeof(int));
		*j = i;
		stack_push(s, j);
	}
	mystruct *j = (mystruct*) malloc(sizeof(mystruct));
	stack_push(s,j);											//Heterogenous stack
	stack_destroy(s);											//Destroy the stack
	return 0;
}
