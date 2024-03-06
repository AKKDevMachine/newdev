package sec13.chap02.ex02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@TargAnnot
@Target(ElementType.CONSTRUCTOR)
public @interface TargConstr {
}
