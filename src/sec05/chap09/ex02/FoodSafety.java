package sec05.chap09.ex02;

public interface FoodSafety {
    static void announcement(){
        System.out.println("식품안전 관련 공지");
    }

    default void regularInspecton(){
        System.out.println("정기 체크");
    }

    void cleanKitchen();
    void employeeEducation();
}
