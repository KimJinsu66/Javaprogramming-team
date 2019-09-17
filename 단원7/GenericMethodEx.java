package 단원7;
import GStack;
/**
 * 여기에 GenericMethodEx 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class GenericMethodEx
{
    public static <T> GStack<T> reverce(GStaack<T> a){
        Gstack<T> s = new GStack<T>();
        while(True){
            T tmp;
            tmp = a.pop();
            if(tmp == null)
                break;
            else
                s.push(tmp);
        }
        return s;
    }
    public static void main(String[] args){
        GStack<Double> gs = new GStack<Double>();
        for(int i = 0; i<5; i++){
            System.out.println(gs.pop());
        }
    }
}

