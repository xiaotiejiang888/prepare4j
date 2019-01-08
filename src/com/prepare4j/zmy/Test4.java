package com.prepare4j.zmy;

public class Test4 {
    public static void main(String[] args)
    {
        String s1 = "qwerabcdtyuiop";
        String s2 = "xcabcdvbn";
        sop(getMaxSubString(s1,s2));
    }
    private static void sop(String s)
    {
        System.out.println(s);
    }
    private static String getMaxSubString(String s1,String s2)
    {
        //最大相同子串，s1,s2=min
        String max=(s1.length()>s2.length())?s1:s2;
        String min=(max==s1)?s2:s1;
        for(int x=0;x<min.length();x++)
        {
            for(int y=0,z=min.length()-x;z!=min.length()+1;y++,z++)
            {
                String temp=min.substring(y,z);
                if(max.contains(temp))
                    return temp;
            }
        }

        return "";
    }
}
