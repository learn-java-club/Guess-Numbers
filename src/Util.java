public class Util {

    public static int  getInterger( String input, Player player ) {
        try {

            int val = Integer.parseInt( input );
            if(player != null){
                player.setPlayerguess(val);
            }
            return val;
        }
        catch( Exception e ) {
            return -1;
        }
    }
}
