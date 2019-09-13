package 단원7;
import java.util.*;

/**
 * ArrayListEx
 * 
 * @author (작성자 이름) 
 * @version (2019.09.12)
 */
public class ArrayListEx
{
    public static void main(String[] args){
        //문자열만 삽입 가능한 Arraylist 생성
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i ++){
            System.out.print("숫자를 입력하세요>>");
            int s = sc.nextInt();
            a.add(s); 
        }
        for(int i = 0; i< a.size(); i++){
            int num = a.get(i); // ArrayList의 i번째 정수 받아오기;
            System.out.println(num);
        }
    
    }
}
