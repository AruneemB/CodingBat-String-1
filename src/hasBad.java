public class hasBad
{
    public boolean hasBad(String str)
    {
        String hasBad = str;
        if(str.length() > 4)
        {
            hasBad = str.substring(0, 4);
        }
        return hasBad.contains("bad");
    }

}
