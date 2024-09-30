public class withoutX2
{
    public String withoutX2(String str)
    {
        if(str.length() >= 2 && str.substring(0, 2).equalsIgnoreCase("xx")) return str.substring(2);
        if(str.length() >= 1 && str.substring(0, 1).equalsIgnoreCase("x")) return str.substring(1);
        if(str.length() >= 1 && str.substring(1, 2).equalsIgnoreCase("x")) return str.substring(0, 1) + str.substring(2);
        return str;
    }

}
