/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prova;

import java.util.Scanner;

/**
 *
 * @author Mateus Araujo de Paula
 */
public class Prova {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nExercicio 1:");
        int[] valor = new int[5];
        for (int i = 0; i < valor.length; i++) {
            System.out.println("Valor " + (i + 1) + ":");
            valor[i] = sc.nextInt();
        }
        int aux;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (valor[i] > valor[j]) {
                    aux = valor[j];
                    valor[j] = valor[i];
                    valor[i] = aux;
                }
            }
        }
        System.out.println("Maior valor: " + valor[0]);
        System.out.println("Menor valor: " + valor[4]);

        System.out.println("\nExercicio 2:");
        double salario = 1000;
        double aumento = 0.015;
        for (int i = 0; i < 27; i++) {
            salario = salario + (salario * aumento);
            aumento = aumento * 2;
        }
        System.out.println("Salario atual: " + salario + " Reais.");

        System.out.println("\nExercicio 3:");
        System.out.println("Insira a massa inicial em gramas:");
        double massaInicial = sc.nextDouble();
        double massaAtual = massaInicial;
        int segundos = 0;
        while (massaAtual >= 0.5) {
            massaAtual = massaAtual / 2;
            segundos = segundos + 50;
        }
        int minutos = segundos / 60;
        int horas = minutos / 60;
        minutos = minutos % 60;
        segundos = segundos % 60;
        System.out.println("Massa Inicial: " + massaInicial + " gramas.");
        System.out.println("Massa Final: " + massaAtual + " gramas.");
        System.out.println("Tempo Total:\n" + horas + " Hora(s), " + minutos + " minuto(s), " + segundos + " segundo(s)");
        System.out.println("\n Fim.");

    }

}
