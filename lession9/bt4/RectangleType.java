package lession9.bt4;

public class RectangleType {
    public static String typeOfRec(int a, int b, int c){
        if(a <= 0 || b <= 0 || c <= 0){
            return "Không phải là tam giác";
        }else if(a == b && b == c){
            return "Tam giác đều";
        }else if(a == b || a == c || b == c){
            return "Tam giác cân";
        }else if(a + b > c && a + c > b && b + c > a){
            return "Tam giác thường";
        }else{
            return "Không phải là tam giác";
        }
    }
}
