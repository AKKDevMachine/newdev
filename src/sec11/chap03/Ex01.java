package sec11.chap03;

public class Ex01 {
    public static void main(String[] args) {
        Thread thr1 = new Thread(()->{});
        ThreadGroup mainThrGroup = thr1.getThreadGroup();
        String mainThrGroupName = mainThrGroup.getName();

        ThreadGroup threadGroup1 = new ThreadGroup("TG_1");
        String thrGroup1Name = threadGroup1.getName();

        Thread thr2 = new Thread(threadGroup1,()->{});
        String thr2GroupName = thr2.getThreadGroup().getName();

        ThreadGroup threadGroup2 = new ThreadGroup(threadGroup1, "TG_2");
        String thrGroup2ParentName = threadGroup2.getParent().getName();
        String theGroup2Name = threadGroup2.getName();
    }
}
