package sec13.chap01.ex02;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("강백호", 25, 180.0, false);
        String personStr = objToString(person);
        System.out.println(personStr);

        String personXml= objToXML(person);
        System.out.println(personXml);
    }

    public static String objToString(Object obj){
        Class<?> objClass = obj.getClass();
        StringBuilder sb = new StringBuilder();

        sb.append("ClassName : ")
                .append(objClass.getSimpleName())
                .append("\n");

        for(Field f : objClass.getDeclaredFields()){
            if(Modifier.isStatic(f.getModifiers())) continue;
            f.setAccessible(true);

            try {
                sb.append(" - %s (%s) : %s%n".formatted(
                         f.getName(),
                        f.getType().getSimpleName(),
                        f.get(obj)
                ));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return sb.toString();
    }

    public static String objToXML(Object obj){
        Class<?> objClass = obj.getClass();
        StringBuilder sb = new StringBuilder();

        sb.append(
                "<%s>%n".formatted(objClass.getSimpleName())
        );

        for (Field f : objClass.getDeclaredFields()) {
            if (Modifier.isStatic(f.getModifiers())) continue;
            f.setAccessible(true);
            try {
                sb.append(
                        "\t<%s>%s</%s>%n".formatted(
                                f.getName(),
                                f.get(obj),
                                f.getName()
                        )
                );
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        sb.append(
                "</%s>%n".formatted(objClass.getSimpleName())
        );

        return sb.toString();
    }
}
