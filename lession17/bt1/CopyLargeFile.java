package lession17.bt1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyLargeFile {
    private static void copyFileUsingJava7Files(File src, File des) throws IOException {
        try{
            Files.copy(src.toPath(), des.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copy completed");
        }catch(IOException ioe){
            System.out.println("Can't copy that file");
            System.out.println(ioe.getMessage());
        }
    }

    private static void copyFileUsingStream(File src, File des) throws IOException {
        try (
                InputStream is = new FileInputStream(src);
                OutputStream os = new FileOutputStream(des);
        ) {
            byte[] buffer = new byte[1024];
            int length;
            while((length = is.read(buffer)) > 0){
                os.write(buffer, 0 , length);
            }
            System.out.println("Copy completed");
        }catch(IOException ioe){
            System.out.println("Can't copy that file");
            System.out.println(ioe.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file: ");
        String srcPath = sc.nextLine();
        System.out.print("Enter des file: ");
        String desPath = sc.nextLine();

        File src = new File(srcPath);
        File des = new File(desPath);

//        copyFileUsingJava7Files(src, des);
        copyFileUsingStream(src, des);

    }
}
