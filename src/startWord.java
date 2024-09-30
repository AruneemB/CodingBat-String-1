public class startWord
{
    public String startWord(String str, String word)
    {
        String wordWithoutFirstChar;

        if(str.length() <= 1 && word.length() <= 1) return str;
        if(str.length() <= 1 && word.length() <= 2) return "";

        wordWithoutFirstChar = word.substring(1);
        if(str.substring(1, word.length()).equalsIgnoreCase(wordWithoutFirstChar)) return str.substring(0, word.length());


        return "";
    }

}
