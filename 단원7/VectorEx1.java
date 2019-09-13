package 단원7;
import java.util.Vector;

/**
 * 여기에 VectorEx1 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */


public class VectorEx1
{
    public static void printVector(Vector<Integer> v ){
        for(int i =0; i < v.size(); i++){
            int n = v.get(i);
            System.out.println(n);
        }
    }
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>(); // Integer 벡터 생성
        printVector(v);
        
    }
}
