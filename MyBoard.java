public class MyBoard{
    private Box boxes[][]; // boxes within the board
    private int col; // constant colunm number of the board
    private int  row; // constant row number of the board
    private String name; // name of the board

    // default constructor
    MyBoard(){
        this(3,3,"2D TicTacToe Board"); // Default Setting for Board
    }

    // Constructor that takes 3 parameters
    MyBoard(int rowNum,int colNum,String boardName){
        this.setSize(rowNum, colNum);
        name = boardName;
        boxes = new Box[this.row][this.col];
        initBoard(); // initialize boxes in the board
    }


    public int getColSize(){
        return this.col;
    }


    public int getRowSize(){
        return this.row;
    }


    public String getName(){
        return this.name;
    }


    public void setSize(int row, int col){
        this.row = row;
        this.col = col;
    }

    // Check if the board is full or not

    public boolean isFull(){
        for(int i = 0;i<boxes.length;i++){
            for(int j = 0;j<boxes[i].length;j++){
                if(boxes[i][j].isEmpty())
                    return false;
            }
        }
        System.out.println("Tie Game");
        return true;
    }

    // Make a move/Place a mark in a selected box

    public boolean makeMove(String player, int row, int col){
        return boxes[row][col].setValue(player);
    }

    // Get the value/placeholder of a selected box

    public String getMark(int row, int col){
        return boxes[row][col].getValue();
    }

    // Initialize the 2d array of boxes
    private void initBoard(){
        for(int i = 0;i<boxes.length;i++){
            for(int j = 0;j<boxes[i].length;j++){
                boxes[i][j] = new Box(i, j); // create a new Box object for each box in the array.
            }
        }
    }

    // print board layout

    public void print(){
        String output = ""; // storing the output
        for(int i = 0;i<boxes.length;i++){
            for(int j = 0;j<boxes[i].length;j++){
                if(j+1 == this.col)
                    output += (boxes[i][j].getValue() + "\n"); // return when reach the end of the row
                else
                    output += (boxes[i][j].getValue() + " "); // adding a space after a value
            }

        }
        System.out.print(output);
    }

}
