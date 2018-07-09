package sda.code.triangles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sprawdzam trójkątność.");

        try(Scanner scan=new Scanner(System.in)) {
            int x=scan.nextInt();
            int y=scan.nextInt();
            int z=scan.nextInt();

            chechTriangility(x,y,z);
        }catch(InputMismatchException e){
            System.err.println("Błędne dane wejsciowe: "+e.getMessage());
        }

        // bez try with resource

    }

    private static void chechTriangility(int x, int y, int z){
        Triangility tri=new Triangility();
        if(tri.check(x,y,z)){
            System.out.println("To jest trójkąt.");
        }else{
            System.out.println("To nie jest trójkąt.");
        }
    }

}
