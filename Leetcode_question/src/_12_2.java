public class _12_2 {
    public static void main(String [] args){

    }
}
class Solution122 {
    public boolean carPooling(int[][] trips, int capacity) {
        int terminal = 0;
        int outset = 0;
        int [] locations = new int [1001];
        int passengers = 0;
        for (int i = 0; i < trips.length; i++){
            passengers = trips[i][0];
            outset = trips[i][1];
            terminal = trips[i][2];
            locations[outset] += passengers;
            locations[terminal] -= passengers;
        }
        passengers = 0;
        for(int i = 0; i < 1001; i++){
            passengers += locations[i];
            if (passengers > capacity) return false;
        }

        return true;

    }
}
