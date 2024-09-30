public class deFront
{
    public String deFront(String str)
    {
        if(str.substring(0, 1).equalsIgnoreCase("a") &&
                str.substring(1, 2).equalsIgnoreCase("b")) return str;

        if(str.substring(0, 1).equalsIgnoreCase("a")) return str.substring(0, 1) + str.substring(2);
        if(str.substring(1, 2).equalsIgnoreCase("b")) return str.substring(1);

        return str.substring(2);
    }

}
