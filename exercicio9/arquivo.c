#include <stdio.h>

int main() {
    FILE *arquivo;
    int n, i;

    // Abre o arquivo para escrita
    arquivo = fopen("valores.txt", "w");

    // Verifica se o arquivo foi aberto com sucesso
    if (arquivo == NULL) {
        printf("Erro ao abrir o arquivo.\n");
        return 1;
    }

    // Pede ao usuário para digitar o número de valores a serem lidos
    printf("Digite o número de valores a serem lidos: ");
    scanf("%d", &n);

    // Pede ao usuário para digitar os valores e escreve no arquivo
    for (i = 0; i < n; i++) {
        double valor;
        printf("Digite o valor %d: ", i + 1);
        scanf("%lf", &valor);
        fprintf(arquivo, "%lf\n", valor);
    }

    // Fecha o arquivo após a escrita
    fclose(arquivo);

    // Reabre o arquivo para leitura
    arquivo = fopen("valores.txt", "r");

    // Verifica se o arquivo foi aberto com sucesso
    if (arquivo == NULL) {
        printf("Erro ao abrir o arquivo para leitura.\n");
        return 1;
    }

    // Move o ponteiro de arquivo para o final do arquivo
    fseek(arquivo, 0, SEEK_END);

    // Lê os valores do arquivo de trás para frente e exibe na tela
    while (ftell(arquivo) > 0) {
        double valor;
        fseek(arquivo, -sizeof(double), SEEK_CUR); // Move o ponteiro para trás em sizeof(double) bytes
        fread(&valor, sizeof(double), 1, arquivo); // Lê um valor do arquivo
        printf("%lf\n", valor); // Exibe o valor na tela
    }

    // Fecha o arquivo após a leitura
    fclose(arquivo);

    return 0;
}
