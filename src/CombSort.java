import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

// Java program for implementation of Comb Sort

class CombSort<T extends Comparable<T>>
{
    // Function to sort arr[] using Comb Sort

    /**
     * Function that sort the array
     *
     * @param arr array to sort
     */
    void comb(ArrayList<T> arr)
    {
        int step = arr.size() - 1;
        double fakt = 1.2473309;

        // Initialize swapped as true to make sure that
        // loop runs
        boolean swapped = false;

        // Keep running while gap is more than 1 and last
        // iteration caused a swap
        while (step >= 1)
        {
            // Compare all elements with current gap
            // Swap arr[i] and arr[i + 1]
            for (int i = 0; i + step < arr.size(); i++)
                if (arr.get(i).compareTo(arr.get(i + step)) > 0)
                    Collections.swap(arr, i, i + step);
            step /= fakt;
        }

        // bubble sort
        for (int i = 0; i < arr.size() - 1; i++)
        {
            for (int j = 0; j < arr.size() - i - 1; j++)
                if (arr.get(i).compareTo(arr.get(i + 1)) > 0)
                {
                    // Swap arr[i] and arr[i+gap]
                    Collections.swap(arr, i, i + 1);
                    // Set swapped
                    swapped = true;
                }
            if (!swapped)
                break;
        }
    }

    // Driver method
    public static void main(String args[]) throws IOException {
        int a;
        ArrayList<String> array = new ArrayList<String>();

        BufferedReader Fin = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter Fout = new BufferedWriter(new FileWriter("output.txt"));

        CombSort ob = new CombSort();
        Scanner scanner = new Scanner(Fin);
        scanner.useLocale(Locale.US); // start using English locale

        a = scanner.nextInt(); // scan number of elements

        array.ensureCapacity(a); // resize the array

        for (int i = 0; i < a; i++)
            array.add(i, scanner.next()); // scan the elements

        Fin.close();

        ob.comb(array);

        for (int i = 0; i < a; i++)
        {
            Fout.write(array.get(i) + " ");
        }

        Fout.flush();
        Fout.close();
    }
}