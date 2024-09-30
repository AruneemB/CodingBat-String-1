public class seeColor
{
    public String seeColor(String str)
    {
        if(str.length() < 3)
        {
            return "";
        }

        if(str.length() == 3)
        {
            if(!str.equalsIgnoreCase("red"))
            {
                return "";
            }
        }

        if(str.substring(0, 3).equalsIgnoreCase("red"))
        {
            return "red";
        }

        if(str.substring(0, 4).equalsIgnoreCase("blue"))
        {
            return "blue";
        }

        return "";
    }

}
