package lession16.bt3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
    public static void copyFile(String srcFile, String desFile){
        try(
                BufferedReader br = new BufferedReader(new FileReader(srcFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(desFile));
                ){
            int count = 0;
            String line;
            while((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
                count += line.length();
            }
            System.out.println("Số ký tự trong file: " +count);
            System.out.println("Successful!!!");
        }catch(Exception e){
            System.out.println("File không tồn tại");
        }
    }
}
