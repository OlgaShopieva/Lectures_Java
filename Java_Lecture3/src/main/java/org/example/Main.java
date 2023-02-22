package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//ex0();

    }
        static void ex0(){
            /*
          1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
          2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
            */
            ArrayList<Integer> list1 = new ArrayList<>();
            LinkedList<Integer> list2 = new LinkedList<>();

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                list1.add(5);
            }
            long finishTime = System.currentTimeMillis();
            System.out.println("ArrayList: " + (finishTime - startTime));

            long startTime2 = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                list2.add(5);
            }
            long finishTime2 = System.currentTimeMillis();
            System.out.println("LinkedList: " + (finishTime2 - startTime2));
    }
        static void ex1() {
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользователя строку вида
        text~num
        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */
            Scanner scanner = new Scanner(System.in);
            boolean work = true;
            LinkedList<String> linkedList = new LinkedList<String>();
            while (work){
                String line = scanner.nextLine();
                String[] lines = line.split("~");
                if (lines[0].equals("print")) {

                }else {
                    if (check(linkedList, lines)){
                        linkedList.add(Integer.parseInt(lines[1]), lines[0]);
                    }


                }
            }
        }

        static boolean check(LinkedList<Integer> linkedList, String[] lines){
            //                    try {
//                        linkedList.add(Integer.parseInt(lines[1]), lines[0]);
//                    } catch (Exception e) {
//                        System.out.println("Введна неверна команда");
//                    }
            if (!lines[1].matches("[0-9]+")){ //альтернатива try/catch - регулярные выражения
                System.out.println("Введна неверна команда");
                return false;
            }
            int index = Integer.parseInt(lines[1]);
            if (index >= linkedList.size()){
                System.out.println("Введена неверна команда");
                return false;
            }
            return true;
        }


}