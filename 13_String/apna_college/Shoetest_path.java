package apna_college;
//Question:-1--> Given a route containing 4 direction (E,W,N,S), Find the shorted path to reach destination.
//Solution:--

public class Shoetest_path {
    public static float getshorted_path(String path){
        int x=0;
        int y=0;

        for(int i=0; i<path.length(); i++){
            char dir=path.charAt(i);
            //south
            if (dir=='S') {
                y--;
            }
            //North
            else if (dir=='N') {
                y++;
            }
            //west
            else if (dir=='W') {
                x--;
            }
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;

        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path="WESNWESSNNEWWNEW";

        System.out.println(getshorted_path(path));
    }

}
