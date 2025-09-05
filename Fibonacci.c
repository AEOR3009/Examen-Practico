#include <stdio.h>

int main() {
    int n, a = 0, b = 1, temp;
    
    printf("¿Cuantos terminos de Fibonacci desea? ");
    scanf("%d", &n);
    
    printf("Serie de Fibonacci:\n");
    for (int i = 0; i < n; i++) {
        printf("%d\n", a);
        temp = a + b;
        a = b;
        b = temp;
    }
    
    return 0;
}