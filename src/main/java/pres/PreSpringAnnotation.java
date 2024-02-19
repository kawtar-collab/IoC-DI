package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PreSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("Dao", "metier");
        metier.IMetier metier = context.getBean(metier.IMetier.class);
        System.out.println("res="+metier.calcul());
    }
}
