package sec13.chap01.ex01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Button> btnClass1 = Button.class;
        Class<?> btnClass2 = Class.forName("sec13.chap01.ex01.Button");

        boolean areSame = btnClass1 == btnClass2;

        Constructor[] btn1Constrs = btnClass1.getConstructors();
        Constructor<?> btn1Constr = btnClass1.getConstructor(String.class, int.class);

        Button button1A = (Button) btn1Constr.newInstance("Enter",3);
        Button button1B = (Button)  btn1Constrs[0].newInstance();
        Button button1C = (Button)  btn1Constrs[1].newInstance("Tab", 2);

        Field[] btnFields = btnClass1.getDeclaredFields();
        for (Field f : btnFields) {
            System.out.printf(
                    "변수명: %s\n타입: %s\n선언된 클래스: %s\n\n",
                    f.getName(),
                    f.getType(),
                    f.getDeclaringClass()
            );
        }

        Field btn1Disabled = btnClass1.getField("disabled");

        System.out.println("\n- - - - -\n");

        Method[] btnMethods = btnClass1.getDeclaredMethods();
        for(Method m : btnMethods){
            System.out.printf("메소드명: %s\n인자 타입(들): %s\n반환 타입: %s\n\n",
                    m.getName(),
                    Arrays.stream(m.getParameterTypes())
                            .map(Class::getSimpleName)
                            .collect(Collectors.joining(", "))
                    ,m.getReturnType()
                    );
        }

        System.out.println("\n- - - - -\n");

        Object button2 = btnClass2.getConstructor(String.class, int.class)
                .newInstance("Space",5);

        Field btn2Disabled = btnClass2.getField("disabled");
        boolean btn2DisabledVal = (boolean) btn2Disabled.get(button2);

        btn2Disabled.set(button2,true);

        //  💡 필드 배열로 접근시
        for (Field f : btnClass2.getDeclaredFields()) {

            f.setAccessible(true); // ⚠️ 이렇게 해주지 않으면 private일 시 예외 발생
            System.out.println(f.getName() + " : " + f.get(button2));
        }
        System.out.println("\n- - - - -\n");
        Method btn2onclick = btnClass2
                .getMethod("onClick", boolean.class, int.class, int.class);
        btn2onclick.invoke(button2, false, 123, 455);

        System.out.println("\n- - - - -\n");

        //  💡 상위 클래스와 인터페이스들 가져오기
        Class<?> btn1Super = btnClass1.getSuperclass();
        Class[] btn1Interfaces = btnClass1.getInterfaces();

    }
}
