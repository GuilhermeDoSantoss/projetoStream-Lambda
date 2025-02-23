package com.santos.stream_lambda;

interface OperacaoMatematica{
    int calcular(int a, int b);
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

        System.out.printl("Soma com função lambda " + somaFl.calcular(5, 3));
    }
}
