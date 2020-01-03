import java.util.*;

/**
 * 
 * input:  dict = {
            "Key1" : "1",
            "Key2" : {
                "a" : "2",
                "b" : "3",
                "c" : {
                    "d" : "3",
                    "e" : {
                        "" : "1"
                    }
                }
            }
        }

output: {
            "Key1" : "1",
            "Key2.a" : "2",
            "Key2.b" : "3",
            "Key2.c.d" : "3",
            "Key2.c.e" : "1"
        }

 */
public class FlattenDictionary {
    public static void main(String[] args) {
        Map<String, Object> oMap = new HashMap<>();
        oMap.put("Key1","1");
        Map<String, Object> inner1 = new HashMap<>();
        inner1.put("a", "2");
        inner1.put("b", "3");
        Map<String, Object> inner2 = new HashMap<>();
        inner2.put("d","3");
        Map<String, Object> inner3 = new HashMap<>();
        inner3.put("", "1");
        inner2.put("e", inner3);
        inner1.put("c", inner2);
        oMap.put("Key2", inner1);

        Map<String, String> m = flattenMap(oMap);

        System.out.println(m);
    }

    private static Map<String, String>
     flattenMap(Map<String, Object> oMap) {
        Map<String, String> fMap = new LinkedHashMap<>();
        //iterate over the orig map
        for(Map.Entry<String, Object> entry : oMap.entrySet()) {
            String key = entry.getKey();
            Object val = entry.getValue();
            if(val instanceof String) {
                String s = val.toString();
                fMap.put(key, s);
            } else if(val instanceof Map) {
                //call recursively
                Map<String, Object> m =
                    (Map<String, Object>)val;
                Map<String, String> m1 = flattenMap(m);
                for(Map.Entry<String, String> o: m1.entrySet()) {
                    if(key != "" && o.getKey()== "") {
                        fMap.put(key, o.getValue());
                    } else if(key == "" && o.getKey() != "") {
                        fMap.put(o.getKey(), o.getValue());
                    } else {
                        fMap.put(key+"."+o.getKey(), o.getValue());
                    }
                }
            }
        }
        return fMap;
    }
}