public class withoutX
{
    public String withoutX(String str)
    {
        String withoutX = str;

        if(!str.contains("x"))
        {
            return withoutX;
        }

        if(str.equals("x") || str.equals("xx"))
        {
            return "";
        }

        if(str.substring(0, 1).equals("x") && str.substring(str.length()-1).equals("x"))
        {
            return withoutX.substring(1, str.length()-1);
        }

        if(str.substring(0, 1).equals("x"))
        {
            return withoutX.substring(1, str.length());
        }

        if(str.substring(str.length()-1).equals("x"))
        {
            return withoutX.substring(0, str.length()-1);
        }

        return withoutX;
    }

}
