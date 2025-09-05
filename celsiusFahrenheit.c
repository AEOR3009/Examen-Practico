#include <stdio.h>

int main() {
    float celsius, fahrenheit;
    
    printf("Ingrese grados Celsius: ");
    scanf("%f", &celsius);
    
    fahrenheit = (celsius * 9.0/5.0) + 32.0;
    
    printf("%.2f°C = %.2f°F\n", celsius, fahrenheit);
    
    return 0;
}