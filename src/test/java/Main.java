import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws Exception {
        Object obj = new JSONParser().parse(new FileReader("src/test/java/animals.json"));
        JSONObject jo = (JSONObject) obj;

        long countOfLegs = legCounter(jo);

        System.out.println(countOfLegs);
    }

    public static int legCounter(JSONObject jo) {
        long pigs = (long) jo.get("pigs");
        long chickens = (long) jo.get("chickens");
        long cows = (long) jo.get("cows");

        int result = 0;

        result += pigs * 4;
        result += cows * 4;
        result += chickens * 2;

        return result;
    }
}
