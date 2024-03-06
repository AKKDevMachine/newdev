package sec06.chap07.ex01;

public enum Gender {
    MALE("GON"), FEMALE("ONY");
    private String emoji;
    Gender(String emoji){
        this.emoji = emoji;
    }
    public String getEmoji(){return emoji;}
}
