package sec05.chap09.ex01;

public class Main {
    public static void main(String[] args) {
        PolarBear polarBear = new PolarBear();
        Mamal mamal = polarBear;
        Swimmer swimmer = polarBear;

        GlidingLizard glidingLizard = new GlidingLizard();
        Eagle eagle = new Eagle();

        Hunter[] hunters = {
                polarBear, glidingLizard, eagle
        };

        for(Hunter hunter : hunters){
            hunter.hunt();
        }
    }
}
