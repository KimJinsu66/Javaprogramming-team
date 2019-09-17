package 단원7;

/**
 * 여기에 GStack 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class GStack<T>
{
    int tos;
    Object [] stck;
    public GStack(){
        tos = 0;
        stck = new Object [10];
    }
    public void push(T item){
        if(tos == 10)
            return;
        stck[tos] = item;
        tos++;
    }
    public T pop(){
        if(tos == 0)
            return null;
        tos--;
        return (T)stck[tos];
    }
}