public class ConnectFour {
    private int board[][] = new int[7][6];

    public int[][] getBoard() {
        return board;
    }

    public void placeCoord(int coord) {
        for(int i = 0; i < getBoard().length; i++){
            if(getBoard()[5][coord] == 0){
                getBoard()[5][coord] = 1;
                break;
            }
            else if(getBoard()[i][coord] == 1){
                getBoard()[i - 1][coord] = 1;
            }
        }
    }

    public String checkVertically(){
        String result = "";
        int count = 0;
        int rowh = 0;
        int colh = 0;
        for(int col = 0; col < getBoard().length; col++){
            for(int row = 0; row < getBoard()[col].length; row++) {
                if (getBoard()[col][row] == 1){
                    rowh = row;
                    colh = col;
                }
            }
        }
        for(int col = 0; col < getBoard().length; col++){
            if(getBoard()[col][rowh] == 1){
                count += 1;
                if (count == 4){
                    result = "WINNER";
                }
            }
            else {
                count = 0;
            }
        }
        return result;
    }

    public String checkHorizontally(){
        String result = "";
        int count = 0;
        for(int col = 0; col < getBoard().length; col++){
            for(int row = 0; row < getBoard()[col].length; row++){
                if (getBoard()[col][row] == 1){
                    count += 1;
                    if (count == 4){
                        result = "WINNER";
                    }
                }
                else {
                    count = 0;
                }
            }
        }
        return result;
    }
}
