#include <stdio.h>

int main() {
    int n;
    float num, mayor, menor;
    
    printf("¿Cuantos numeros desea ingresar? ");
    scanf("%d", &n);
    
    printf("Ingrese el numero 1: ");
    scanf("%f", &num);
    mayor = num;
    menor = num;
    
    for (int i = 2; i <= n; i++) {
        printf("Ingrese el numero %d: ", i);
        scanf("%f", &num);
        
        if (num > mayor) {
            mayor = num;
        }
        
        if (num < menor) {
            menor = num;
        }
    }
    
    printf("El numero mayor es: %.2f\n", mayor);
    printf("El numero menor es: %.2f\n", menor);
    
    return 0;
}