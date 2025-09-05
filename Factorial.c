#include <stdio.h>

int main() {
    int n, fact = 1;
    
    printf("Ingrese un numero: ");
    scanf("%d", &n);
    
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    
    printf("El factorial de %d es %d\n", n, fact);
    
    return 0;
}