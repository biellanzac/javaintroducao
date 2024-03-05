#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool palindromo_recursivo(char *s, int inicio, int fim) {
    if (inicio >= fim)
        return true;
    
    if (s[inicio] != s[fim])
        return false;
    
    return palindromo_recursivo(s, inicio + 1, fim - 1);
}

bool palindromo(char *s) {
    int tamanho = strlen(s);
    return palindromo_recursivo(s, 0, tamanho - 1);
}

int main() {
    char s[] = "rada";

    if (palindromo(s)) {
        printf("'%s' é um palíndromo.\n", s);
    } else {
        printf("'%s' não é um palíndromo.\n", s);
    }

    return 0;
}
