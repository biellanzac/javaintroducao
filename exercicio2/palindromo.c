#include <stdbool.h>
#include <stdio.h>
#include <string.h>

bool palindromo(char *s) {
    int inicio = 0;
    int fim = strlen(s) - 1;

    while (inicio <= fim) {
        if (s[inicio] != s[fim]) { // Correção aqui
            return false;
        }
        inicio++;
        fim--;
    }

    return true;
}

int main(){
    char s[] = "aa";

    palindromo(s);

    if(palindromo(s)){
        printf("SIM");
    }else{
        printf("NAO");
    }
}


