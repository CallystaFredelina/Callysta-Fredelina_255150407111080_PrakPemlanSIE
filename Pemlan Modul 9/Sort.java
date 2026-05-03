import java.util.Arrays;
 
public class Sort {
 
    public static int[] bubble(int[] list) {
        int tukarAtauGeser = 0; //menmbahkan no.6
        for (int i = 0; i < list.length - 1; i++) {
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] > list[i]) {  // no.5 mengubah (<) menjadi (>)
                    int t = list[i];
                    list[i] = list[k];
                    list[k] = t;
                    tukarAtauGeser++; //menmbahkan no.6
                }
            }
        }
        System.out.println("Bubble swap: " + tukarAtauGeser); //menambahkan untuk no.6
        return list;
    }
 
    public static int[] insertion(int[] list) {
        int tukarAtauGeser = 0; //menmbahkan no.6
        for (int i = 1; i < list.length; ++i) {
            int key = list[i];
            int k = i - 1;
            while (k >= 0 && list[k] < key) {  // no.5 mengubah (>) menjadi (<)
                list[k + 1] = list[k];
                k = k - 1;
                tukarAtauGeser++; //menmbahkan no.6
            }
            list[k + 1] = key;
        }
        System.out.println("Insertion geser: " + tukarAtauGeser);  //menmbahkan no.6
        return list;
    }
 
    public static int[] selection(int[] list) {
        int tukarAtauGeser = 0;  //menmbahkan no.6
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] > list[minIndex]) // no.5 mengubah (<) menjadi (>)
                    minIndex = k;
            }
            int t = list[minIndex];
            list[minIndex] = list[i];
            list[i] = t;
            tukarAtauGeser++;  //menmbahkan no.6
        }
        System.out.println("Selection swap: " + tukarAtauGeser);  //menmbahkan no.6 
        return list;
    }
 
    public static void main(String[] args) {
    int[] arr = {
        47, 3, 85, 22, 61, 9, 74, 38, 56, 91,
        14, 67, 29, 5, 83, 42, 70, 18, 95, 33,
        77, 11, 50, 26, 88, 44, 63, 7, 99, 55
    };
    // No.3 - menpilkan array
    System.out.println("Array awal (belum diurutkan):");
    System.out.println(Arrays.toString(arr));

    // No.4 - panggil ketiga fungsi sorting
    System.out.println("\n--- Bubble Sort ---");
    System.out.println("Sebelum  : " + Arrays.toString(arr));
    int[] hasilBubble = bubble(Arrays.copyOf(arr, arr.length));
    System.out.println("Sesudah  : " + Arrays.toString(hasilBubble));

    System.out.println("\n--- Insertion Sort ---");
    System.out.println("Sebelum  : " + Arrays.toString(arr));
    int[] hasilInsertion = insertion(Arrays.copyOf(arr, arr.length));
    System.out.println("Sesudah  : " + Arrays.toString(hasilInsertion));

    System.out.println("\n--- Selection Sort ---");
    System.out.println("Sebelum  : " + Arrays.toString(arr));
    int[] hasilSelection = selection(Arrays.copyOf(arr, arr.length));
    System.out.println("Sesudah  : " + Arrays.toString(hasilSelection));
  } 
}