public class makeOutWord
{
    public String makeOutWord(String out, String word)
    {
        String startTag = out.substring(0, 2);
        String endTag = out.substring(2);
        return(startTag + word + endTag);
    }

}
