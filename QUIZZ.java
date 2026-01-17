package lesson11;

import java.util.Scanner;

public class QUIZZ{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        char answer;

        System.out.println("1) Сколько часов в неделе?");
        System.out.println("a) 188   b) 168   c) 174   d) 154");
        answer = input.next().charAt(0);
        if (answer == 'b' || answer == 'B') {
            score++;
        }

        System.out.println("2) В каком году был создан этот код?");
        System.out.println("a) 2025   b) 2015   c) 2022   d) 2305");
        answer = input.next().charAt(0);
        if (answer == 'a' || answer == 'A') {
            score++;
        }

        System.out.println("Ваш счёт: " + score + "/2");
    }
    }
