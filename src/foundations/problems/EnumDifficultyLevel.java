package foundations.problems;

enum Difficulty{
    EASY(120),MEDIUM(60),HARD(30);
    final int timeLimit;
    Difficulty(int limit){
        timeLimit = limit;
    }
}
public class EnumDifficultyLevel {
    public static void main(String[] args) {
        Difficulty dif = Difficulty.HARD;
        System.out.println("Difficulty Level:" + dif);
        System.out.println("Time Limit: "+ dif.timeLimit+" minutes");
    }
}
