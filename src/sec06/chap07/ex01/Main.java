package sec06.chap07.ex01;

public class Main {
    public static void main(String[] args) {
        Child child1 = new Child("홍길동",2020,Gender.MALE);
        String childstr = child1.toString();
        System.out.println(childstr);

        var children =  new Child[]{
                new Child("김순이", 2021, Gender.FEMALE),
                new Child("이돌이", 2019, Gender.MALE),
                new Child("박철수", 2020, Gender.MALE),
                new Child("최영희", 2019, Gender.FEMALE)
        };

        for(var child : children){
            System.out.printf("%s %d년생 어린이%n",
                    child.gender().getEmoji(),
                    child.birthYear(),
                    child.name());
        }
    }
}
