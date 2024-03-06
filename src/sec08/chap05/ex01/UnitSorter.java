package sec08.chap05.ex01;

import sec07.chap04.*;
import sec07.chap04.MagicKnight;
import sec07.chap04.Side;
import sec07.chap04.Unit;

import java.util.Comparator;

public class UnitSorter implements Comparator<Unit> {
    @Override
    public int compare(Unit o1, Unit o2){
        var result = getClassPoint(o2)-getClassPoint(o1);
        if(result == 0) result=o1.hashCode()-o2.hashCode();
        return result;
    }
    public int getClassPoint(Unit u){
        int result = u.getSide()== Side.RED ? 10 : 0;
        if(u instanceof Swordman) result+=1;
        if(u instanceof Knight) result +=2;
        if(u instanceof MagicKnight) result+=3;

        return result;
    }
}
