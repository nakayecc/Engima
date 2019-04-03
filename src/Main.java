public class Main {
    public static void main(String[] args){

        Baconian b = new Baconian();
        AtBash aB = new AtBash();


        if( args[0].equals("-e") && args[1].equals("baconian")) {
            System.out.println(b.baconianCipherCodder(args));
        }
        else if ( args[0].equals("-d") && args[1].equals("baconian")) {
            System.out.println(b.baconianCipherDecodder(args[2]));
        }
        else if ( args[0].equals("-e") && args[1].equals("atBash")) {
            System.out.println(aB.atBashCodder(args));
        }
        else if ( args[0].equals("-d") && args[1].equals("atBash")) {
            System.out.println(aB.atBashDecodder(args[2]));
        }
    }
}
