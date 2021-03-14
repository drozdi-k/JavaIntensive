package IfElse;

public class PhraseAnalyser {

    public static String analyse(String text) {
        if(text.startsWith("Make")&&text.endsWith("great again")) return "It stands no chance";
        else if(text.startsWith("Make")||text.endsWith("great again")) return "It could be worse";
        else return "It is fine, really";
    }
}
