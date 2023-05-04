import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream ("numeros.dat")); ObjectOutputStream odd = new ObjectOutputStream(new FileOutputStream("impares.dat")); ObjectOutputStream even = new ObjectOutputStream(new FileOutputStream("pares.dat"))) {
            while (true){
                int number = in.readInt();
                if (number % 2 == 0){
                    System.out.println(number);
                    even.writeInt(number);
                }
                else{
                    System.out.println(number);
                    odd.writeInt(number);
                }
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}