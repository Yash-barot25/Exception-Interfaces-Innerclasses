package exception;

import java.util.HashMap;
import java.util.Map;

public class MapProgramm {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("zubna", "fuck oyu");
        languages.put("java", "A high compiled level language");
        languages.put("python", "A high level interpreted language");

        languages.put("javascript", "A best language for beginners");
        // System.out.println(languages.get("java"));

        if (languages.containsKey("java")) {
            System.out.println("java is already in the list");
        } else {
            languages.put("java", "most popular one");
        }

        System.out.println(languages.get("java"));
        //languages.remove("java");
        languages.replace("java","my first programming language");

        for (String key : languages.keySet()) {
            System.out.println(key + ":" + languages.get(key));
        }

    }
}
