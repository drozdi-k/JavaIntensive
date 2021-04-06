package codewars;

public class YourOrder {
    public static String order(String words) {
        String[] array = words.split(" ");
        String space = " ";
        String result = "", first = "", second = "", third = "", forth = "", fifth = "", sixth = "", seventh = "", eighth = "", ninth = "";
        for (String s : array) {
            if (s.contains("1")) first = s;
            if (s.contains("2")) second = space + s;
            if (s.contains("3")) third = space + s;
            if (s.contains("4")) forth = space + s;
            if (s.contains("5")) fifth = space + s;
            if (s.contains("6")) sixth = space + s;
            if (s.contains("7")) seventh = space + s;
            if (s.contains("8")) eighth = space + s;
            if (s.contains("9")) ninth = space + s;
        }
        result = first + second + third + forth + fifth + sixth + seventh + eighth + ninth;
        return result;
    }
}
