package triangle;

public class TriangleClassifier {

    public static String triangleClassifier(int a, int b, int c) {
        if (a == b && b == c) {
            return "Tam giác đều";
        } else if (a + b > c && b + c > a && c + a > b){
            if (a==b || b ==c || c == a){
                return "Tam giác cân";
            }else {
                return "Tam giác thường";
            }
        } else {
            return "Không phải tam giác";
        }
    }

}
