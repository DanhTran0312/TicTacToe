public class Board implements IBoard{
    private Box boxes[]; // boxes within the board
    private int col; // constant colunm number of the board
    private int  row; // constant row number of the board
    private String name; // name of the board

    // default constructor
    Board(){
        this(3,3,"Default Board"); // Default Setting for Board
    }

    // Constructor that takes 3 parameters
    Board(int rowNum,int colNum,String boardName){
        this.setSize(rowNum, colNum);
        name = boardName;
        boxes = new Box[this.row*this.col];
        initBoard(); // initialize boxes in the board
    }

    @Override
    public int getColSize(){
        return this.col;
    }

    @Override
    public int getRowSize(){
        return this.row;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setSize(int row, int col){
        this.row = row;
        this.col = col;
    }

    @Override
    public boolean isFull(){
        for(Box b: this.boxes){
            if(b.isEmpty())
                return false;
        }
        System.out.println("Tie Game");
        return true;
    }

    @Override
    public boolean makeMove(String player, int row, int col){
        return boxes[row*this.col+col].setValue(player);
    }

    @Override
    public String getMark(int row, int col){
        return boxes[row*this.col+col].getValue();
    }


    private void initBoard(){
        for(int i=0;i<boxes.length;i++){
            boxes[i] = new Box(i/this.col, i%this.col); // create a new Box object for each box in the array.
        }
    }

    // print board layout
    @Override
    public void print(){
        String output = ""; // storing the output
        for(int i = 0;i<boxes.length;i++){
            if((i+1)%this.col == 0)
                output += (boxes[i].getValue() + "\n"); // return when reach the end of the row
            else
                output += (boxes[i].getValue() + " "); // adding a space after a value
        }
        System.out.print(output);
    }


    // print out each box value for testing purposes
    public void printTest(){
        for(int i=0;i<boxes.length;i++){
            System.out.println("row:" + boxes[i].getRow() +" col:"+boxes[i].getCol()+ " placeholder:"+boxes[i].getValue());
        }
    }

}
