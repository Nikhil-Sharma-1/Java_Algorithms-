import java.util.*;
public class substitutionCipher {
    String s="abcdefghijklmnopqrstuvwxyz ";
    public char getCipher(char c) {
        char ch=' ';
        int ind=0;
        for(int i=0;i<s.length();i++) {
            ch=s.charAt(i);
            if(ch==c)
            {
                ind=i;
            }
        }
        return s.charAt((ind+10)%27);
    }
    public static void main(String args[])
    {
        Main ob=new Main();
        Scanner sc=new Scanner(System.in);
        String msg="";
        msg=sc.nextLine();
        for(int i=0;i<msg.length();i++)
        {
            System.out.print(ob.getCipher(msg.charAt(i))+" ");
        }
    }
}

