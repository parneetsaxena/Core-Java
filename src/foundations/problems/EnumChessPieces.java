package foundations.problems;

public class EnumChessPieces {
    enum Pieces{
        KING(0,"One square in any direction"),
        QUEEN(9,"Any number of squares horizontally,diagonally and vertically"),
        ROOK(5,"Any number of squares vertically or horizontally"),
        BISHOP(3,"Any number of squares diagonally"),
        KNIGHT(3,"Moves in an L-Shape. Two squares in one direction and one square perpendicular. Can jump over pieces"),
        PAWN(1,"Moves forward one square (two in its first move), captures one square diagonally forward");
        final String movement;
        final int points;
        Pieces(int p,String m){
            points=p;
            movement = m;
        }
    }

    public static void main(String[] args) {
        Pieces p = Pieces.QUEEN;
        System.out.println("Piece: "+p);
        System.out.println("Points: "+p.points+"\n Moves: "+ p.movement);
    }
}
