package sec07.chap01.ex03;

public class Main {
    public static void main(String[] args) {
        Click click1 = new Click(123, 456, 5323487);
        Click click2 = new Click(123, 456, 5323487);
        Click click3 = new Click(123, 456, 2693702);
        Click click4 = new Click(234, 567, 93827345);

        var click1Hash = click1.hashCode();
        var click2Hash = click2.hashCode();
        var click3Hash = click3.hashCode();
        var click4Hash = click4.hashCode();

        var click1str = click1.toString();
        var click2str = click2.toString();
        var click3str = click3.toString();
        var click4str = click4.toString();

        var str1 = new String("Hello");
        var str2 = new String("Hello");
        var str3 = new String("World");

        var str1Hash = str1.hashCode();
        var str2Hash = str2.hashCode();
        var str3Hash = str3.hashCode();

        var str1ToStr = str1.toString();
        var str1eq2 = str1.equals(str2);

    }
}
