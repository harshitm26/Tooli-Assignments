#ifndef FOO_H_   /* Include guard */
#define FOO_H_

typedef struct node{
	void * data;
	struct node * next;
	struct node * previous;
}node; 

typedef struct  stack{
	int elems;
	node *head;
}stack;

int stack_isempty(stack *);
void stack_push(stack *, void * );
void stack_pop(stack *);
void * stack_top(stack *);
stack * stack_initialize();
void stack_destroy(stack *);
#endif


