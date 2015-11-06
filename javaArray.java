//# javaArray
//Hand built array methods (java)

public class className
{
    public static void main(String args[])
    {
        int intArray = new int[1];
        intArray[0] = 5;
        intArray = addElement(intArray,7);
    }
    public int addElement(int[] tempArray,int element)
    {
        int newArray[] = new int[tempArray.length()+1];
        for(int i = 0;i<tempArray.length();i++)
        {
            newArray[i] = tempArray[i];
        }
        newArray[newArray.length()-1] = element;
        return newArray;
    }
}
