import java.util.Scanner;

public class xor1 {
    private static Scanner in;
    public static void main(String[] args){
        in = new Scanner(System.in);

        System.out.print("1. Encryption\n2. Decryption\nChoose(1,2): ");
        int choice = in.nextInt();
        in.nextLine();

        if(choice == 1){
            System.out.println("Encryption");
            cipherEncryption();
        } else if (choice == 2){
            System.out.println("Decryption");
            cipherDecryption();
        } else {
            System.out.println("Invalid Choice");
        }
    }


    private static void cipherDecryption() {
        System.out.print("Enter  message: ");
        String msg = in.nextLine();

        System.out.print("Enter key: ");
        String key = in.nextLine();

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
        System.out.println("Decrypted Text: " + decrypt);
    }

    private static void cipherEncryption() {
        System.out.print("Enter message: ");
        String msg = in.nextLine();

        System.out.print("Enter key: ");
        String key = in.nextLine();

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

        System.out.println("Encrypted Text: " + encryp);
    }
}