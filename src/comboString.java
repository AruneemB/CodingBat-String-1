public class comboString
{
    public String comboString(String a, String b)
    {

        String longString;
        String shortString;
        String comboString;

        if(a.length() > b.length())
        {
            longString = a;
            shortString = b;
        }
        else
        {
            longString = b;
            shortString = a;
        }

        comboString = shortString + longString + shortString;
        return comboString;

    }

}
