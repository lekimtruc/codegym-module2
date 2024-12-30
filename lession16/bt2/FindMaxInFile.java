package lession16.bt2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FindMaxInFile {
    public void findMax(String filePath) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\codegym\\module 2\\baitap\\lession16\\bt2\\result.txt"));
        ) {
            int max = 0;
            String line;
            while ((line = br.readLine()) != null) {
                String[] list = line.split("\\s+");
                for (String number : list) {
                    try {
                        if(Integer.parseInt(number) > max){
                            max = Integer.parseInt(number);
                        }
                    }catch(Exception e){
                        System.out.println("Nội dung có lỗi!!!");
                        break;
                    }
                }
            }

            bw.write("Max= " +max);
            System.out.println("Successful!!!");
        } catch (Exception e) {
            System.out.println("File không tồn tại!!!");
        }
    }
}
