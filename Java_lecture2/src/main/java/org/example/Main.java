package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        //StringBuilder
        /*
        API - способ взаимодействия программ между собой. С помощью API можно использовать уже готовые
        методы/функционал другой программы.
        Например. Мы хотим создать строку из миллиона плюсиков.
        1)Способ 1:
        С помощью простого String:

        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
            }

            Такой код будет выполняться примерно 40сек. Объекты String являются неизменяемыми, поэтому все операции,
            которые изменяют строки, фактически приводят к созданию новой строки, что сказывается на производительности
            приложения. Для решения этой проблемы, чтобы работа со строками проходила с меньшими издержками в Java был
             добавлен класс StringBuilder.
         2) Способ 2:
         С помощью StringBuilder:

         StringBuilder sb = new StringBuilder();
         for (int i = 0; i < 1_000_000; i++) {
                sb.append("+");
        }

         */

        //Работа с файловой системой
        /*
        File dir1 = new File ("C://MyNewDir");
        File file1 = new File("C://MyNewDir", "Hello.txt");
        File file2 = new File(dir1, "Hello2.txt");

        Обработка ошибок:
        try {
            Код в котором может появиться ошибка
        } catch (Exception e) {
            Обработка если ошибка случилась
        }
        finally {
            Код, который выполнится в любом случае
        }

        */

        //Логирование
       /*
       public class Ex005_Logger {
            public static void main(String[] args) throws IOException {

                Logger logger = Logger.getLogger(Ex005_Logger.class.getName()); // в скобках указываем название класса для которого делаем логирование
                //ConsoleHandler ch = new ConsoleHandler(); //создаем консоль хэндлер чтобы ошибки выпадали в терминал
                FileHandler fh = new FileHandler("log.txt");
                //logger.addHandler(ch); //указываем хэндлер в качестве аргумента для нашего логера
                logger.addHandler(fh);

                SimpleFormatter sFormat = new SimpleFormatter(); //указываем формат вывода сообщение
                //XMLFormatter xml = new XMLFormatter();
                fh.setFormatter(sFormat);
                //fh.setFormatter(xml);

                //logger.setLevel(Level.INFO);
                logger.log(Level.WARNING, "Тестовое логирование 1"); //указываем уровень сообщения
                logger.info("Тестовое логирование 2");// можно просто ИНФО указать
        */
    }
}