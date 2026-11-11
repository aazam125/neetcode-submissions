class Solution {
    public boolean isValidSudoku(char[][] board) {


        HashSet<Character> boxOne = new HashSet<>();
        HashSet<Character> boxTwo = new HashSet<>();
        HashSet<Character> boxThree = new HashSet<>();
        HashSet<Character> boxFour = new HashSet<>();
        HashSet<Character> boxFive = new HashSet<>();
        HashSet<Character> boxSix = new HashSet<>();
        HashSet<Character> boxSeven = new HashSet<>();
        HashSet<Character> boxEight = new HashSet<>();
        HashSet<Character> boxNine = new HashSet<>();


        for(int i = 0; i < board.length; i++){
            HashSet<Character> seenRow = new HashSet<>();
            HashSet<Character> seenColumn = new HashSet<>();
            for(int j = 0; j < board[i].length; j++){

                if(seenRow.contains(board[i][j]) && (board[i][j] != '.')){
                    return false;
                }
                else{
                    seenRow.add(board[i][j]);
                }

                if(seenColumn.contains(board[j][i]) && (board[j][i] != '.')){
                    return false;
                }
                else{
                    seenColumn.add(board[j][i]);
                }

                if(i/3 == 0 && j/3 == 0){
                    if(boxOne.contains(board[i][j]) && (board[i][j] != '.')){
                        return false;
                    }
                    else{
                        boxOne.add(board[i][j]);
                    }
                }        
                else if(i/3 == 0 && j/3 == 1 && (board[i][j] != '.')){
                    if(boxTwo.contains(board[i][j])){
                        return false;
                    }
                    else{
                        boxTwo.add(board[i][j]);
                    }
                }
                else if(i/3 == 0 && j/3 == 2){
                    if(boxThree.contains(board[i][j]) && (board[i][j] != '.')){
                        return false;
                    }
                    else{
                        boxThree.add(board[i][j]);
                    }
                }
                else if(i/3 == 1 && j/3 == 0 && (board[i][j] != '.')){
                    if(boxFour.contains(board[i][j])){
                        return false;
                    }
                    else{
                        boxFour.add(board[i][j]);
                    }
                }
                else if(i/3 == 1 && j/3 == 1 && (board[i][j] != '.')){
                    if(boxFive.contains(board[i][j])){
                        return false;
                    }
                    else{
                        boxFive.add(board[i][j]);
                    }
                }
                else if(i/3 == 1 && j/3 == 2 && (board[i][j] != '.')){
                    if(boxSix.contains(board[i][j])){
                        return false;
                    }
                    else{
                        boxSix.add(board[i][j]);
                    }
                }
                else if(i/3 == 2 && j/3 == 0 && (board[i][j] != '.')){
                    if(boxSeven.contains(board[i][j])){
                        return false;
                    }
                    else{
                        boxSeven.add(board[i][j]);
                    }
                }
                else if(i/3 == 2 && j/3 == 1 && (board[i][j] != '.')){
                    if(boxEight.contains(board[i][j])){
                        return false;
                    }
                    else{
                        boxEight.add(board[i][j]);
                    }
                }
                else if(i/3 == 2 && j/3 == 2 && (board[i][j] != '.')){
                    if(boxNine.contains(board[i][j])){
                        return false;
                    }
                    else{
                        boxNine.add(board[i][j]);
                    }
                }





            }

        }

        return true;
    }
}
