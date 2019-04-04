
public class xor1 {

    public String cipherCoder(String[] args) {

        String msg =args[2] ;
        String key ="a";
        String hexToDecinal = "";
        for (int i = 0; i < msg.length()-1; i+=2) {

            String output = msg.substring(i, (i+2));
            int decimal = Integer.parseInt(output, 16);
            hexToDecinal += (char)decimal;
        }

        String decrypt = "";
        int keyIter = 0;
        for (int i = 0; i < hexToDecinal.length(); i++) {

            int temp = hexToDecinal.charAt(i) ^ key.charAt(keyIter);

            decrypt += (char)temp;
            keyIter++;
            if(keyIter >= key.length()){

                keyIter = 0;
            }
        }

        return decrypt;
    }

    public  String cipherDecoder(String[] args) {

        String msg =args[2] ;
        String key ="a";
        String encryp = "";
        int keyIter = 0;
        for (int i = 0; i < msg.length(); i++) {

            int temp = msg.charAt(i) ^ key.charAt(keyIter);
            encryp += String.format("%02x", (byte)temp);
            keyIter++;
            if(keyIter >= key.length()){
                keyIter = 0;
            }

        }

        return encryp;
    }
}