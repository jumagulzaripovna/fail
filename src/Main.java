import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {



        FileWriter writer = null;
        try {
            writer=new FileWriter("alfavit.eng");
            writer.write("1\tA\n" +
                    "2\tB\n" +
                    "3\tC\n" +
                    "4\tD\n" +
                    "5\tE\n" +
                    "6\tF\n" +
                    "7\tGt\n" +
                    "8\tH\n" +
                    "9\tI\n" +
                    "10\tJ\n" +
                    "11\tK\n" +
                    "12\tL\n" +
                    "13\tM\n" +
                    "14\tN\n" +
                    "15\tO\n" +
                    "16\tP\n" +
                    "17\tQ\n" +
                    "18\tR\n" +
                    "19\tS\n" +
                    "20\tT\n" +
                    "21\tU\n" +
                    "22\tV\n" +
                    "23\tW\n" +
                    "24\tX\n" +
                    "25\tY\n" +
                    "26\tZ\n");
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }

}