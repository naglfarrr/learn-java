import java.io.Serializable;

/**
 * @author: naglfarrr
 * @description: a helloworld test
 * @create: 2021-10-18 12:45
 **/
public class HelloWorld {
    public static long fact(long n) {
        if(n < 0) {
            throw new IllegalArgumentException();
        }

        long r = 1;
        for (long i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }
}
