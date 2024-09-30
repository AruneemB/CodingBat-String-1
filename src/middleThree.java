public class middleThree
{
    public String middleThree(String str)
    {
        String characterOne = str.substring(str.length()/2 - 1, str.length()/2);
        String characterTwo = str.substring(str.length()/2, str.length()/2 + 1);
        String characterThree = str.substring(str.length()/2 + 1, str.length()/2 + 2);
        return characterOne + characterTwo + characterThree;
    }

}
