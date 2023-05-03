package pluralsight.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorSimpleDemo {

    public static void main(String[] args) throws Exception {

        File file = new File("./output.txt");
        file.createNewFile();

        // Output Stream takes File as its input
        OutputStream oStream = new FileOutputStream(file);

        // DataOutputStream takes output stream as input
        DataOutputStream doStream = new DataOutputStream(oStream);
        doStream.writeChars("test");

        doStream.close();
        oStream.close();
    }
}
