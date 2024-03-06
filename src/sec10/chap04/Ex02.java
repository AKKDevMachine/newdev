package sec10.chap04;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Map<String, Integer> dutyRegMap = new HashMap<>();
        dutyRegMap.put("정핫훈", 7);
        dutyRegMap.put("김돌준", 13);

        dutyRegMap.forEach((name, month)->{
            try {
                registerDutyMonth(name, month);
            } catch (WrongMonthException we) {
                we.printStackTrace();
                System.out.printf("%s씨 에어팟 빼봐요.%n", name);
            } catch (Exception e){
                e.printStackTrace();
            }
        });

        dutyRegMap.forEach((name, month) -> {
            try {
                registerDutyMonthSafer(name, month);
            } catch (WrongMonthException we) {
                we.printStackTrace();
                System.out.println("내가... 왜 또 불렀는지 알겠어요?");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


    }
    public static void registerDutyMonth(String name, int month) throws WrongMonthException {
        if(month <1 || month >12){
            throw new WrongMonthException("하...");
        }
        System.out.printf("%s씨 %d월 담당으로 배정되셨어요.%n", name, month);
    }

    public static void registerDutyMonthSafer(String name, int month) throws WrongMonthException{
        try {
            if(month < 1 || month > 12){
                throw new WrongMonthException("랜덤배정");
            }
            System.out.printf("%s씨 %d월 담당으로 배정되셨어요.%n", name, month);
        } catch (WrongMonthException we) {
            System.out.printf(
                    "%s씨 %d월 담당으로 배정되셨어요.%n",
                    name, new Random().nextInt(1, 12 + 1)
            );
            throw we;
        }
    }
}
