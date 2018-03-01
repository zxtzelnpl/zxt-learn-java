import java.lang.reflect.Array;

public class BeforeGeneric {
    static class ArrayList{
        private Object[] elements = new Object[0];
        public Object get(int i){
            return elements[i];
        }
        public void add(Object o){
            int length = elements.length;
            Object[] newElements = new Object[length+1];
            for(int i=0;i<length;i++){
                newElements[i]=elements[i];
            }
            newElements[length]=o;
            elements=newElements;
        }
    }

    public static void main(String[] args){
        ArrayList stringVlaues = new ArrayList();
        stringVlaues.add("aaa");

        String str = (String) stringVlaues.get(0);
        System.out.println(str);
    }
}
