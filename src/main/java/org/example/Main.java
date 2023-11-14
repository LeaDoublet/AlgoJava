package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //getName();
        //getMax();
        //getMajOrMin();
        //getCategory();
        //numberBeetween(1,3);
        //factoriel();
        //getNumberPair();
        ex8();
    }

    private static void ex8() {
        // exercice 8 :

        int[] t= new int[10];
        int i=0;
        int max = t.length;
        while(i<max){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez un nombre : ");
            int nombre = scanner.nextInt();
            t[i]=nombre;
            afficherTable(t);
            i++;
        }
        double moyenne = calculerMoyenne(t);
        System.out.println("La moyenne du tableau est : " + moyenne);

        trierTableau(t);

    }

    private static void trierTableau(int[] t) {
        //exercice 10 : 
        int n = t.length;
        boolean estTrié;
        do {
            estTrié = true;
            for (int i = 0; i < n - 1; i++) {
                if (t[i] > t[i + 1]) {
                    // Échanger les éléments si ils ne sont pas dans l'ordre
                    int temp = t[i];
                    t[i] = t[i + 1];
                    t[i + 1] = temp;
                    estTrié = false;
                }
            }
        } while (!estTrié);
        afficherTable(t);
    }

    private static double calculerMoyenne(int[] t) {
        //exercice 9 :
        int somme = 0;
        for (int i = 0; i < t.length; i++) {
            somme += t[i];
        }
        return (double) somme / t.length;
    }

    private static void afficherTable(int[] t){
        System.out.print("[ ");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]);
            if (i < t.length) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
    private static void getNumberPair() {
        //Exercice 7 :
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();
        int i=0;
        while (i<=nombre){
            System.out.println(i);
            i=i+2;
        }

    }

    private static int factoriel() {
        //Exercice 6 :
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre pour calculer le factoriel : ");
        int nombre = scanner.nextInt();
        long factoriel = calculerFactoriel(nombre);
        System.out.println("Le factoriel de " + nombre + " est : " + factoriel);
        return (int) factoriel;
    }

    // Fonction pour calculer le factoriel d'un nombre
    private static long calculerFactoriel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculerFactoriel(n - 1);
        }
    }


    private static void numberBeetween(int i, int i1) {

        int number = 0;
        while (number > i1 || number < i) {
            Scanner num = new Scanner(System.in);
            System.out.println("Veuillez saisir un nb entre 1 et 3 :)");
            number = num.nextInt();
        }
    }

    private static void getCategory() { //Exercice 4 :
        Scanner age = new Scanner(System.in);
        System.out.println("Veuillez saisir votre age :)");
        String category = "";
        int userAge = age.nextInt();
        if (userAge <=7 || userAge>=6){
            category = "Poussin";
        }
        if (userAge <=9 || userAge>=8){
            category = "Pupille";
        }
        if (userAge <=11 || userAge>=10){
            category = "Minime";
        }
        if (userAge >=12){
            category = "Cadet";
        }
        System.out.println("Vous etes : "+ category);
    }

    private static void getMajOrMin() { //Exercice 3 :
        Scanner age = new Scanner(System.in);
        System.out.println("Veuillez saisir votre age :)");
        int userAge = age.nextInt();
        if(userAge>18){
            System.out.println("felicitations vous etes majeurs");
        } else{
            System.out.println("Vous etes mineurs");
        }
    }

    private static void getMax() {
        //Exercice 2 :
        Scanner firstNum = new Scanner(System.in);
        System.out.println("Veuillez saisir deux nombres a comparer");
        Scanner secndNum = new Scanner(System.in);
        int nb1 = firstNum.nextInt();
        int nb2 = firstNum.nextInt();
        if (nb2>nb1){
            System.out.println("Max = "+nb2);
        }
        if (nb1>nb2){
            System.out.println("Max = "+nb1);
        }
        if(nb1==nb2){
            System.out.println("Max = "+nb1 + "="+nb2);
        }
    }

    private static void getName() { //Exercice 1 :
        Scanner myName = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom :)");
        String userName = myName.nextLine();
        System.out.println("Bonjour " + userName);
    }
}