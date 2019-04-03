import java.util.*;

public class Baconian {
    private HashMap dict;

    public Baconian() {
        this.dict = new HashMap<Character, String>() {{
            put('A', "AAAAA");
            put('B', "AAAAB");
            put('C', "AAABA");
            put('D', "AAABB");
            put('E', "AABAA");
            put('F', "AABAB");
            put('G', "AABBA");
            put('H', "AABBB");
            put('I', "ABAAA");
            put('J', "ABAAB");
            put('K', "ABABA");
            put('L', "ABABB");
            put('M', "ABBAA");
            put('N', "ABBAB");
            put('O', "ABBBA");
            put('P', "ABBBB");
            put('Q', "BAAAA");
            put('R', "BAAAB");
            put('S', "BAABA");
            put('T', "BAABB");
            put('U', "BABAA");
            put('V', "BABAB");
            put('W', "BABBA");
            put('X', "BABBB");
            put('Y', "BBAAA");
            put('Z', "BBAAB");
            put(' ', "BBBAA");
        }};
    }

    public String baconianCipherCodder(String[] args) {
        String outputCode = "";
        String toCript = args[1].toUpperCase();
        char[] toCriptChar = toCript.toCharArray();

        for (int i = 0; i < toCript.length(); i++) {

            outputCode += dict.get(toCriptChar[i]) + " ";


        }
        return outputCode;

    }

    public String baconianCipherDecodder(String coddedString) {
        coddedString = coddedString.replace(" ", "");
        int begin = 0;
        int end = 5;
        String FindChar = "";

        for (int i = 0; i < (coddedString.length() / 5); i++) {
            FindChar += findValueByKey(dict, coddedString.substring(begin, end));
            begin += 5;
            end += 5;

        }
        return FindChar;
    }

    public Object findValueByKey(HashMap hashMap, String value) {

        Iterator hmIterator = hashMap.entrySet().iterator();

        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            if (value.equals(mapElement.getValue())) {
                return mapElement.getKey();
            }
        }
        return "-1";

    }
}