import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the Array Elements [" + n + "]");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            largest = arr[i];
        }
        System.out.println("Maximum Array Element: "+largest);
        sc.close();
    }
}
