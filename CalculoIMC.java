void main() {

    IO.println("Cálculo de IMC");

    IO.println("Digite seu gênero (M/F/N): ");
    char genero = IO.readln().charAt(0);

    // Regra do N → feminino
    if (genero == 'N' || genero == 'n') {
        genero = 'F';
    }

    IO.println("Digite seu peso em kg: ");
    double peso = Double.parseDouble(IO.readln());

    IO.println("Digite sua altura em metros (ex: 1.75): ");
    double altura = Double.parseDouble(IO.readln());

    double imc = peso / (altura * altura);

    String classificacao;

    // Classificação baseada na tabela
    if (genero == 'M' || genero == 'm') {

        if (imc < 20) {
            classificacao = "Abaixo do normal";
        } else if (imc < 25) {
            classificacao = "Normal";
        } else if (imc < 30) {
            classificacao = "Obesidade leve";
        } else if (imc < 40) {
            classificacao = "Obesidade moderada";
        } else {
            classificacao = "Obesidade mórbida";
        }

    } else { // Feminino

        if (imc < 19) {
            classificacao = "Abaixo do normal";
        } else if (imc < 24) {
            classificacao = "Normal";
        } else if (imc < 29) {
            classificacao = "Obesidade leve";
        } else if (imc < 39) {
            classificacao = "Obesidade moderada";
        } else {
            classificacao = "Obesidade mórbida";
        }
    }

    IO.println("Seu IMC é: " + String.format("%.2f", imc));
    IO.println("Classificação: " + classificacao);
}


