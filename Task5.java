import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int mid =( n + 1 ) / 2;
        for(int i = 1 ; i <= n ; i++){
            if(i < mid ){
                System.out.println((mid - 1 - i + 1)+ " ");
            }
            else if(i == mid){
                System.out.println(mid);
            }
            else{
                System.out.println((n - i + mid + 1)+ " ");
            }
        }
    }
}
