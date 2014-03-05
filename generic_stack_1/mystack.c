#include <stdlib.h>
#include <stdio.h>
#include "mystack.h"

/*Initialize the stack here*/
stack * stack_initialize(){
	stack  * s;
	s = (stack *)malloc(sizeof(stack));
	s->elems = 0;
	s->head = NULL;
	return s;
}

/*check whether the stack is empty or not*/
int stack_isempty(stack *s){
	if(s->head == NULL){
		return 1;
	}
	return 0;
}

/*push the pointer onto the stack*/
void stack_push(stack *s, void * data){
	s->elems++;
	node * n = (node*)malloc(sizeof(node));
	if(s->head == NULL){
		n->previous = NULL;
	}
	else{
		s->head->next = n;	
		n->previous = s->head;
	}
	n->data = data;
	n->next = NULL;
	s->head  = n;
	return ;
}

/*pop elements from the stack*/
void stack_pop(stack *s){
	if(s->head == NULL){
		perror("Stack is empty. Can't pop from empty stack.\n");
		return ;
	}
	if(s->head->previous == NULL){
		free(s->head);
		//free the actual struct also
		s->head = NULL;
		return ;
	}
	else{
		s->head = s->head->previous;
		free(s->head->next);
		s->head->next = NULL;
	}
	s->elems --;
	return ;
}

/*get the first element of the stack*/
void * stack_top(stack *s){
	if(s->head == NULL){
		perror("Stack is empty. Can't view from empty stack.\n");
		return 0;
	}
	return s->head->data;
}

/*free the memory used by the stack*/
void stack_destroy(stack *s){
	while(s->head !=NULL){
		stack_pop(s);
	}
	return ;
}
