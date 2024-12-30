package lession16.bt4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class PrintFile {
    public static void printFile() {
        try (
                BufferedReader br = new BufferedReader(new FileReader("D:\\codegym\\module 2\\baitap\\lession16\\bt4\\countries.csv"));
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                printParameter(parseCsvLine(line));
            }
        } catch (Exception e) {
            System.out.println("File không tồn tại!!!");
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static void printParameter(List<String> country) {
        System.out.println(
                "Country [" +
                        "id=" + country.get(0) +
                        ", code=" + country.get(1) +
                        ", name=" + country.get(2) +
                        ']'
        );
    }
}
