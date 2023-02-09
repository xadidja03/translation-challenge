package util;

import java.util.Scanner;

public class MenuUtil {
    public static byte entry(){
        System.out.println(
                "[1].Azerbaijan to English"+"\n"+
                        "[2].English to Azerbaijan"+ "\n"+
                        "[3].Exit"
        );
        Scanner scanner=new Scanner(System.in);
        System.out.print("Choose: ");
        byte option = scanner.nextByte();

        return option;

    }
}