public class Main {
    public static void main(String[] args) {

        Baconian b = new Baconian();
        AtBash aB = new AtBash();
        xor1 x = new xor1();
        cezarc c = new cezarc();


        if (args[0].equals("-e") && args[1].equals("baconian")) {
            System.out.println(b.baconianCipherCodder(args));
        } else if (args[0].equals("-d") && args[1].equals("baconian")) {
            System.out.println(b.baconianCipherDecodder(args[2]));
        } else if (args[0].equals("-e") && args[1].equals("atBash")) {
            System.out.println(aB.atBashCodder(args));
        } else if (args[0].equals("-d") && args[1].equals("atBash")) {
            System.out.println(aB.atBashDecodder(args[2]));
        } else if (args[0].equals("-e") && args[1].equals("xor")) {
            System.out.println(x.cipherCoder(args));
        } else if (args[0].equals("-d") && args[1].equals("xor")) {
            System.out.println(x.cipherDecoder(args));
        } else if (args[0].equals("-e") && args[1].equals("caesar")) {
            System.out.println(c.cipherCoder(args));
        } else if (args[0].equals("-d") && args[1].equals("caesar")) {
            System.out.println(c.cipherDecoder(args));
        } else if (args[0].equals("-l")) {
        System.out.println("[-e(encrypt)/-d(decrypt)] ['baconian/atBash/xor/caesar'] ['Text']");
        }

    }
}
