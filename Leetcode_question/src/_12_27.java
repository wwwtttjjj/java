import java.util.Arrays;

public class _12_27 {
    public static void main(String[] args) {
        Solution1227 s = new Solution1227();
        int [] player1 = new int []{4,10,7,9};
        int [] player2 = new int []{6,5,2,312};
        System.out.println(s.isWinner(player1, player2));

    }
}
class Solution1227 {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = getScores(player1);
        int score2 = getScores(player2);
        if (score1 > score2){
            return 1;
        } else if (score2 > score1) {
            return 2;

        }
        return 0;


    }
    public int getScores(int [] player){
        if (player.length == 1){
            return player[0];
        }
        int score = player[0] + player[1];
        if (player[0] == 10){
                score += player[1];
            }
        for(int i = 2; i < player.length; i++){
            if(player[i - 1] == 10 || player[i - 2] == 10){
                score += 2*player[i];
            }
            else{
                score += player[i];
            }
        }
        return score;

    }
}