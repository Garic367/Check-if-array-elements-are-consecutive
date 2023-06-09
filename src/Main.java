import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean are_consecutive = true;
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if((arr[i] != arr[i-1]+1) || arr[i] == arr[i-1]){
                are_consecutive = false;
            }
        }
        System.out.println(are_consecutive == true?"Array elements are consecutive":"Array elements are not consecutive");
    }
}


