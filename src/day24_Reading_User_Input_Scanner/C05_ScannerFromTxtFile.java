package day24_Reading_User_Input_Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class C05_ScannerFromTxtFile {
    public static void main(String[] args)throws FileNotFoundException {

        File file = new File("src/day24_Reading_User_Input_Scanner/Scanner.txt");

        Scanner sc = new Scanner(file);



        while (sc.hasNext()){  //hasnext
            System.out.println(sc.next());
        }
    }
}
