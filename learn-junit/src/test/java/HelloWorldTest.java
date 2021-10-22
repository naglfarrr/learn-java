import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void fact() {
        assertEquals(6, HelloWorld.fact(3));
        assertEquals(24, HelloWorld.fact(4));

        // 测试代码是否抛出指定的异常
        assertThrows(IllegalArgumentException.class, new Executable() {
            public void execute() throws Throwable {
                HelloWorld.fact(-1);
            }
        });
        // 上面的代码可以使用 lambda 表达式形式
        assertThrows(IllegalArgumentException.class, () -> {
            HelloWorld.fact(-1);
        });
    }
}