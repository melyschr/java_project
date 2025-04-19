#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#define V 5 // defining array of 5 positions

// estrutura de pilha
typedef struct{
    int Item[V]; // array de itens da pilha
    int top; // topo da pilha
} TStack;
TStack stack;
Item[V] = {1, 2, 2, 4, 5};

int Is_Empty() {
    if (stack.top == 0){
        printf("verdadeiro");
        return true;
    }
    else{
        printf("falso");
        return false;
    }
}
int main() {
    if (! Is_Empty()){
        int x = 0;
        x = stack.Item[stack.top];
        stack.top = stack.top - 1;
        
        printf("Esta vazio");
        return x;
    }
    else{
        printf("Error Underflow");
        return 0;
    }
}