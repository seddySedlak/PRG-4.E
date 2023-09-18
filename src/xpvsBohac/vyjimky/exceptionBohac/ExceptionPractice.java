import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExceptionPractice {
    public static void sort(int[] data){
        quickSort(data, 0, data.length - 1);
    }
    public static void quickSort(int[] data, int start, int end) {
        if (end <= start) return;
        int i = split(data, start, end);
        quickSort(data, start, i - 1);
        quickSort(data, i + 1, end);
    }

    static int split(int[] data, int left, int right) {
        int pivot = data[right];
        while
        (true) {
            while ((pivot > data[left]) && (left < right))
                left++;
            if (left < right) {
                data[right] = data[left];
                right--;
            } else break;
            ;
            while ((pivot < data[right]) && (left < right))
                right--;
            if (left < right) {
                data[left] = data[right];
                left++;
            } else break;
        }
        data[left] = pivot;
        return (left);
    }

    static int[] toArray(ArrayList<String> lines){
        return null;
    }

    static ArrayList<String> readFile(String fileName){
        ArrayList<String> lines = null;
//        lines = Files.readAllLines(Paths.get(fileName));
        return lines;
    }

    static int countAverage(int[] data){

        return 0;
    };

    static void replace(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej index v poli:");
        int index = sc.nextInt();
        System.out.println("Zadej cislo, ktere do pole chces vlozit:");
        array[index] = sc.nextInt();
        sc.close();
    }



    public static void main(String[] args){
        int[] first = toArray(readFile("seq"));
        int[] second = toArray(readFile("seq1.txt"));
        int[] third = toArray(readFile("seq2.txt"));

        replace(first);
        replace(second);
        
        sort(second);
        sort(third);

        countAverage(first);
        countAverage(second);
        System.out.println("Happy ending");
    }
}
