@ItcastAnnotation(arrayAttr = 1)
public class Main {
    public static void main(String[] args){
        if(Main.class.isAnnotationPresent(ItcastAnnotation.class));
        ItcastAnnotation annotation = (ItcastAnnotation)Main.class.getAnnotation(ItcastAnnotation.class);
        System.out.println(annotation.color());
        System.out.println(annotation.value());
        System.out.println(annotation.arrayAttr().length);
        System.out.println(annotation.annotationAttr());
        System.out.println(annotation.annotationAttr().value());
    }
}
