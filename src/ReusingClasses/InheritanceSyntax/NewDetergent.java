package ReusingClasses.InheritanceSyntax;

import javafx.scene.media.VideoTrack;

public class NewDetergent extends Detergent {

    public NewDetergent() {
        System.out.println("newdete");
    }

    public void sterilize(){
        System.out.println("new sterilize");
    }

    public void scrub(){
        append(" new scrub");
        super.scrub();
    }

    public static void main(String[] args) {
        NewDetergent newDetergent = new NewDetergent();

    }
}
