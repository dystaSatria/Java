// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int sayi1 = 2;
        int sayi2 = 20;
        int sayi3 = 30
                ;
        int biggest = sayi1;

        if ( biggest < sayi2){
            biggest = sayi2;
        }

        if ( biggest < sayi3) {
            biggest = sayi3;
        }

        System.out.println("The biggest number is "+biggest);

    }
}