#include <stdio.h>
#include <string.h>

int main() {
    char texto[100], textoInvertido[100];
    int longitud;
    
    printf("Ingrese un numero o palabra: ");
    scanf("%s", texto);
    
    longitud = strlen(texto);
    
    for (int i = 0; i < longitud; i++) {
        textoInvertido[i] = texto[longitud - 1 - i];
    }
    textoInvertido[longitud] = '\0';
    
    if (strcmp(texto, textoInvertido) == 0) {
        printf("Es un palindromo\n");
    } else {
        printf("No es un palindromo\n");
    }
    
    return 0;
}