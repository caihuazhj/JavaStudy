package ReusingClasses.InheritanceSyntax;

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}
class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}
public class Chess extends BoardGame {
    Chess(int i) {
        super(i);
        System.out.println("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess(10);
    }
}
