Сортировка на JAVA

1) создаем класс JAVA
2) в нем есть
   public static void main(String args[]) throws IOException {
   }
   и 
   функция сортировки
   void comb(ArrayList<Integer> arr)
3) заводим массив ArrayList<type>, где type - это нужный нам тип. Используем ArrayList, так как это аналог vector, только лучше и быстрее.
4) Открываем файлы через буффер: BufferedReader Fin = new BufferedReader(new FileReader("input.txt"));
                                 BufferedWriter Fout = new BufferedWriter(new FileWriter("output.txt"));
5) Создаем объект того, что нужно отсортировать: CombSort ob = new CombSort();
6) Создаем сканнер, с помощью которого будем сканировать переменные из файла: Scanner scanner = new Scanner(Fin);
7) Первое число - количество переменных в массиве: a = scanner.nextInt();
8) Определяем размер массива: array.ensureCapacity(a);
9) Чтобы добавить элементы в массив используем метод .add(index, element): array.add(i, scanner.nextInt());
10) Запускаем нашу сортировку на созданный ранее объект от нужного массива: ob.comb(array);
11) Пишем массив в файл через метод .write(element): Fout.write(array.get(i) + " ");
12) Отчищаем буффер: Fout.flush();
13) Закрываем выходной файл: Fout.close();
14) Чтобы достать элемент из массива для сравнени или для вывода используем метод .get(index): arr.get(i) > arr.get(i + step)
15) Чтобы свапнуть элементы используем метод из коллекции: Collections.swap(arr, i, i + 1);
16) Подключаемые библиотеки: import java.io.FileReader;
                             import java.io.FileWriter;
                             import java.io.BufferedReader;
                             import java.io.BufferedWriter;
                             import java.io.IOException;
                             import java.util.ArrayList;
                             import java.util.Collections;
                             import java.util.Scanner;
