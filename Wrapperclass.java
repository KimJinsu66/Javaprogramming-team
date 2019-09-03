
/**
 * Wrapper class practice
 *
 * @author (JinsuKim)
 * @version (2019.09.04)
 * p350 ~351
   */ 
public class Wrapperclass
{
    public static void main(String[] args){
        //Integer i = new Integer(10);
        //Character c = new Character('c');
        //Double d = new Double(3.14);
        //Boolean b = new Boolean(true);
        
        //Character 제외하한 나머지 Wrapper클래스 경우 문자열로 객체를 생성 가능
        /**
        Integer i = new Integer("10");
        Double d = new Double("3.14");
        Boolean b = new Boolean("true");
        */
        // Wrapper 객체에 들어 있는 기본 타입의 값을 알아내기 위한 코드
        
        Integer i = new Integer("10");
        int ii = i.intValue();
        Character c = new Character('c');
        char cc = c.charValue();
        Double d = new Double("3.14");
        double dd = d.doubleValue();
        Boolean b = new Boolean("true");
        boolean bb = b.booleanValue();
        
    }
}
