package exception;

/**
 * @author: naglfarrr
 * @description:
 * @create: 2021-10-22 14:15
 **/
public class ExceptionLearn01 {
    private LowerLevel lowerLevel = new LowerLevel();

    public void hi() {
        try {
            lowerLevel.throwException();
        }catch (Exception e) {
            throw new RuntimeException("high", e);
        }
    }

    public static void main(String[] args) {
        ExceptionLearn01 higherlevel = new ExceptionLearn01();
        higherlevel.hi();
    }
}

class LowerLevel {
    void throwException() {
        throw new RuntimeException("lower exception");
    }
}
