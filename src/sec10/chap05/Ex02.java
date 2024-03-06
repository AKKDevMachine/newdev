package sec10.chap05;

public class Ex02 {
    public static void main(String[] args) {
        for (var i = 0; i < 10; i++) {
            dirtyOperation();
        }
    }
    public static void dirtyOperation(){
        try (SuicideSquad sc = new SuicideSquad()){
            sc.doSecretTask();
        } catch (OpFailException e) {
            e.printStackTrace();
            System.out.println("🗑️ 증거 인멸\n- - - - -\n");
        }  catch (Exception e) {
            System.out.println("1111");
            throw new RuntimeException(e);
    }
    }
}
