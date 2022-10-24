package org.example.Testing;

public class BuggyUtilities
{
    //Return a char array containing every nth character. when the source array.length<n, return sourceArray
    //Hello, n=2 = 'e','l'
    //Hello, n = 10 = 'hl','e','l','o'
    public char[] everyNthCharacter(char[] sourceArray,int n)
    {
        if(sourceArray == null || sourceArray.length<n)
        {
            return sourceArray;
        }
        int returnLength = sourceArray.length/n;
        char[] result = new char[returnLength];
        int index =0;
        for(int i = n-1;i<sourceArray.length;i+=n)
        {
            result[index++] = sourceArray[i];
        }
        return result;
    }
    //Removes pairs of the same character that are next to each other, by removing one occurance of the character
    //ABBCDEEF = ABCDEF
    //ABCBDEEF = ABCBDEF
    public String removePairs(String source)
    {
        //If the length < 2 there are no pairs
        if(source.length() <2)
        {
            return source;
        }
        StringBuilder sb = new StringBuilder();
        char[] rawString = source.toCharArray();

        for(int i = 0;i<rawString.length;i++)
        {
            if(rawString[i] != rawString[i++])
            {
                sb.append(rawString[i]);
            }
        }
        return sb.toString();
    }
    //Performs some conversion
    public int converter(int a, int b)
    {
        return (a/b)+(a*30) -2;

    }
    public String nullifOddlength(String source)
    {
        if(source.length()%2==0)
        {
            return source;
        }
        return null;
    }
}
