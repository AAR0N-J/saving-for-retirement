import java.util.Scanner;

public class savingforretirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bobAge = sc.nextInt(), bobRetire = sc.nextInt(), bobSaves = sc.nextInt();
        int aliceAge = sc.nextInt(), aliceSaves = sc.nextInt();
        if (bobAge>=20 && bobRetire>=bobAge && bobRetire<=100 && aliceAge<=100 && aliceAge>=20
                && aliceSaves>=1 && aliceSaves<=100 && bobSaves>=1 && bobSaves<=100){
            int yearsOfSaving = bobRetire - bobAge;
            int bobSavings = yearsOfSaving*bobSaves;
            int aliceSavings = 0;
            int aliceRetire = aliceAge;
            while (aliceSavings<=bobSavings){
                aliceSavings += aliceSaves;
                aliceRetire++;
            }
            System.out.println(aliceRetire);
        }
    }
}
