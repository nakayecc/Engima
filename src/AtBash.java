public class AtBash {

    public static String atBashCodder(String[] args) {
        String dataToCipher = args[2].toLowerCase();
        String outputCipherText = "";

        for (int i = 0; i < dataToCipher.length(); i++) {
            Character charFromString = dataToCipher.charAt(i);
            int intValueCripherChar = 122 + ((122 - (int) charFromString) - 25);
            outputCipherText += (char) intValueCripherChar;

        }
        return outputCipherText;
    }
