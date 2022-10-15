import org.apache.commons.io.*;
import java.io.*;

class Test1 {
    public static void main( String args[] ) {
        long x = FileUtils.sizeOf(new File("Test1.java"));
        System.out.println(x);
    }
}