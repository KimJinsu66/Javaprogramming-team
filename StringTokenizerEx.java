import java.util.StringTokenizer;
/**
 * (예)교과서p370 6-9 : StringTokenizer클래스메소드활용 
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class StringTokenizerEx{
    public static void main(String[] args) { 
        StringTokenizer st= new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/"); //구분자로 '/' 사용
        while(st.hasMoreTokens()){ //토큰이 있는 동안
            System.out.println(st.nextToken());
        }
    }
}

