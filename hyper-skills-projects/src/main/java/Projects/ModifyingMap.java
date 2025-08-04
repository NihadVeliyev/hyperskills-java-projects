package Projects;

import java.util.Map;

public class ModifyingMap {
    public static void main(String[] args) {

    }
    public static void mapShare(Map<String, String> map) {

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }

        map.remove("c");
    }
}
