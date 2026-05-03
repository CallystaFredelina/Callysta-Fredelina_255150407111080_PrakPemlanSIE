public class Search {
public static int linearSearch(int[] arr, int search) {
    int check = 0; //nambahin no.6
    for (int i = 0; i < arr.length; i++) {
        check++;  //no.6
        if (arr[i] == search) {
            System.out.println("Linear check: " + check); //mencetak sebelum return
            return i;
        }
    }
    System.out.println("Linear check: " + check);
    return -1;
}
    public static int binarySearch(int[] arr, int search) {
    int check = 0;  //nambah no.6
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        check++;  //no.6
        int mid = low + (high - low) / 2;
        if (arr[mid] == search) {
            System.out.println("Binary check: " + check);  //nambah no.6
            return mid;
        }
        if (arr[mid] < search) low = mid + 1;
        else high = mid - 1;
    }
    System.out.println("Binary check: " + check);  //no.6 
    return -1;
}
  public static void main(String[] args) {

    int[] arr = {
    2, 5, 7, 9, 11, 14, 18, 22, 26, 29,
    33, 38, 42, 44, 47, 50, 55, 56, 61, 63,
    67, 70, 74, 77, 83, 85, 88, 91, 95, 99
    };

    System.out.println("===== No.2 =====");
    int hasil2 = linearSearch(arr, 88);
    System.out.println("linearSearch(88) = " + hasil2);

    System.out.println("\n===== No.3 =====");
    int hasil3 = linearSearch(arr, 100);
    System.out.println("linearSearch(100) = " + hasil3);

    System.out.println("\n===== No.4 =====");
    int hasil4 = binarySearch(arr, 88);
    System.out.println("binarySearch(88) = " + hasil4);

    System.out.println("\n===== No.5 =====");
    int hasil5 = binarySearch(arr, 100);
    System.out.println("binarySearch(100) = " + hasil5);
  }
}
