package application;

import entities.Estudante;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
         Integer n = 10;
         Integer quantidadeAluguel, quarto = 0;
         String nome, email;

        Scanner scanner = new Scanner(System.in);
        Estudante[] vect = new Estudante[n];
        System.out.println("Informe a quantidade de quartos alugados ");
        quantidadeAluguel = scanner.nextInt();

        for (int i=1; i<=quantidadeAluguel; i++){
            System.out.println();
            System.out.printf("Aluguel # " + i +": ");
            System.out.printf("Nome: ");
            scanner.nextLine();
            nome = scanner.nextLine();
            System.out.printf("Email: ");
            email = scanner.nextLine();
            System.out.printf("Quarto: ");
            quarto = scanner.nextInt();
            vect[quarto] = new Estudante(nome, email);

        }

        System.out.println();
        System.out.printf("Quartos ocupadoss: ");
        for (int i =0; i<n; i++){
            if(vect[i] != null){
                System.out.printf(i +": " + vect[i]);
            }
        }




        scanner.close();

    }
}
