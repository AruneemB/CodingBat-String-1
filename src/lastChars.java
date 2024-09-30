public class lastChars
{
    public String lastChars(String a, String b)
    {
        String aFirstChar;
        String bLastChar;

        if(a.length() == 0)
        {
            aFirstChar = "@";
        }
        else
        {
            aFirstChar = a.substring(0, 1);
        }

        if(b.length() == 0)
        {
            bLastChar = "@";
        }
        else
        {
            bLastChar = b.substring(b.length() - 1);
        }

        return aFirstChar + bLastChar;
    }

}
