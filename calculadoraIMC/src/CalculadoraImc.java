public class CalculadoraImc{

    public String calcGeral(float peso, double altura, int idade, String genero){


        double imc = peso / (altura * altura);

        String categoria = null;

        if (idade < 65) {

            if (imc < 16) {
                categoria = "Baixo peso muito grave";
            } else if (imc >= 16 && imc <= 16.99) {
                categoria = "Baixo peso grave";
            } else if (imc >= 17 && imc <= 18.49) {
                categoria = "Baixo peso";
            } else if (imc >= 18.5 && imc <= 24.99) {
                categoria = "Peso normal";
            } else if (imc >= 25 && imc <= 29.99) {
                categoria = "Sobrepeso";
            } else if (imc >= 30 && imc <= 34.99) {
                categoria = "Obesidade grau I";
            } else if (imc >= 35 && imc <= 39.99) {
                categoria = "Obesidade grau II";
            } else {
                categoria = "Obesidade grau III (obesidade mórbida)";
            }
        }

        else if (idade > 65 && genero.equals("mulher")){

            if (imc < 21.9) {
                categoria = "Baixo peso";
            } else if (imc >= 21.9 && imc <= 27) {
                categoria = "Peso normal";
            } else if (imc >= 27.1 && imc <= 32) {
                categoria = "Sobrepeso";
            } else if (imc >= 32.1 && imc <= 37) {
                categoria = "Obesidade grau I";
            } else if (imc >= 37.1 && imc <= 41.9) {
                categoria = "Obesidade grau II";
            } else {
                categoria = "Obesidade grau III (obesidade mórbida)";
            }
        }

        else if (idade > 65 && genero.equals("homem")){

            if (imc < 21.9) {
                categoria = "Baixo peso";
            } else if (imc >= 21.9 && imc <= 27) {
                categoria = "Peso normal";
            } else if (imc >= 27.1 && imc <= 30) {
                categoria = "Sobrepeso";
            } else if (imc >= 30.1 && imc <= 35) {
                categoria = "Obesidade grau I";
            } else if (imc >= 35.1 && imc <= 39.9) {
                categoria = "Obesidade grau II";
            } else {
                categoria = "Obesidade grau III (obesidade mórbida)";
            }
        }

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Sua categoria é: " + categoria);

        return categoria;
    }

}
