package com.santos.stream_lambda;

import java.util.Locale;

interface OperacaoMatematica{
    int calcular(int a, int b);
}

interface ManipuladorString {
    String manipular(String str);
}
public class LambdaApplication {

    public static void main(String[] args) {

        OperacaoMatematica soma = new OperacaoMatematica() {

            public int calcular(int a, int b) {
                return a + b;
            }

        };

        System.out.println("Soma sem função lambda " + soma.calcular(5, 3));

        OperacaoMatematica somaFl = (a, b) -> a + b;

        System.out.println("Soma com função lambda " + somaFl.calcular(5, 3));

        OperacaoMatematica multiplicacao = (a, b) -> a * b;

        System.out.println("Multiplicação com função lamba " + multiplicacao.calcular(5, 3));

        //Manipulação de String

        ManipuladorString maiuscula = new ManipuladorString() {
            @Override
            public String manipular(String str) {
                return str.toUpperCase(Locale.ROOT);
            }
        };
        System.out.println("Manipulação de String sem lambda " + maiuscula.manipular("Guilherme"));

        ManipuladorString maiusculaFL = str -> str.toUpperCase(Locale.ROOT);

        System.out.println("Manipulação de String com lambda " + maiusculaFL.manipular("Guilherme"));


    }
}
