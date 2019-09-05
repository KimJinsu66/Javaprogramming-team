
/**
 * Write a description of class Test358 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test358
{
    public static void main(String[] args){
        String java ="Java";
        String cpp = "C++";
        int res = java.compareTo(cpp);
        if(res == 0 )
            System.out.println("the same");
        else if(res <0 )
            System.out.println(java + " < " + cpp);
        else
            System.out.println(java + " > " + cpp);
        String a = "    abcd   def   ";
        String b = "   xyz\t   ";
        String c = a.trim();
        String d = b.trim();
        System.out.println(c);
        System.out.println(d);
        
        }
        

}
