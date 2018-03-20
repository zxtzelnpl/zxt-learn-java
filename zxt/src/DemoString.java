public class DemoString {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10;i++){
            sb.append("呵呵*"+i+"\n");
        }
        System.out.println(sb);
    }
}