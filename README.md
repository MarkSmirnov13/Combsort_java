# Сортировка на JAVA

1) :new::new::new:создаем класс JAVA
   Пишем `<T extends Comparable<T>>`, чтобы воспользоваться generics'ом
   
   ```JAVA
   class CombSort<T extends Comparable<T>>
   {
      ...
   }
   ```
2) :new::new::new:в нем есть основная функция

   ```JAVA
   public static void main(String args[]) throws IOException {
   }
   ```
   и 
   функция сортировки:x::arrow_down::x:
   
   ```JAVA
   void comb(ArrayList<Integer> arr) {
   }
   ```
   __Исправляем__:white_check_mark::arrow_down::white_check_mark:
   
   ```JAVA
   void comb(ArrayList<T> arr) {
   }
   ```
3) заводим массив `ArrayList<type>`, где type - это нужный нам тип. Используем `ArrayList`, так как это аналог `vector`, только лучше и быстрее.
4) Открываем файлы через буффер: 
   ```JAVA
   BufferedReader Fin = new BufferedReader(new FileReader("input.txt"));
   BufferedWriter Fout = new BufferedWriter(new FileWriter("output.txt"));
   ```
5) Создаем объект того, что нужно отсортировать: 
   ```JAVA
   CombSort ob = new CombSort();
   ```
6) Создаем сканнер, с помощью которого будем сканировать переменные из файла: 
   ```JAVA
   Scanner scanner = new Scanner(Fin);
   ```
7) :new::new::new:После сканера обязательно переключается на английскую локализацию

   ```JAVA
   scanner.useLocale(Locale.US);
   ```
   и подключаем ему файл 
   ```JAVA
   import java.util.Locale;
   ```
7) Первое число - количество переменных в массиве: 
   ```JAVA
   a = scanner.nextInt();
   ```
8) Определяем размер массива: 
   ```JAVA
   array.ensureCapacity(a);
   ```
9) :new::new::new:Чтобы добавить элементы в массив используем метод `.add(index, element)`: 

   ```JAVA
   array.add(i, scanner.nextInt());
   ```
   Для разных типов нужно использовать разные методы `.next...()`
    ```JAVA
   array.add(i, scanner.nextInt()); // integer
   array.add(i, scanner.nextFloat()); // double
   array.add(i, scanner.next()); // string
   ```
10) Закрываем входной файл: 
      ```JAVA
      Fin.close();
      ```
10) Запускаем нашу сортировку на созданный ранее объект от нужного массива: 
      ```JAVA
      ob.comb(array);
      ```
11) Пишем массив в файл через метод `.write(element)`:
      ```JAVA
      Fout.write(array.get(i) + " ");
      ```
12) Отчищаем буффер: 
      ```JAVA
      Fout.flush();
      ```
13) Закрываем выходной файл: 
      ```JAVA
      Fout.close();
      ```
14) :new::new::new:Чтобы достать элемент из массива для сравнени или для вывода используем метод `.get(index)`: 

      :x::arrow_down::x:
      
      ```JAVA
      arr.get(i) > arr.get(i + step)
      ```
      __Исправляем и используем метод__`compareTo()`__чтобы сравнить элементы__:white_check_mark::arrow_down::white_check_mark:
      
      ```JAVA
      arr.get(i).compareTo(arr.get(i + 1)) > 0 // аналогично  arr.get(i) > arr.get(i + step)
      ```
15) Чтобы свапнуть элементы используем метод из коллекции: 
      ```JAVA
      Collections.swap(arr, i, i + 1);
      ```
16) :new::new::new:Подключаемые библиотеки: 

      ```JAVA
      import java.io.FileReader;
      import java.io.FileWriter;
      import java.io.BufferedReader;
      import java.io.BufferedWriter;
      import java.io.IOException;
      import java.util.ArrayList;
      import java.util.Collections;
      import java.util.Scanner;
      import java.util.Locale;
      ```
