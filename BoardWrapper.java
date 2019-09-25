public class BoardWrapper implements IBoard{

    Board board = new Board();

    public BoardWrapper(){
    }

    @Override
    public void print(){
        this.board.print();
    }

    @Override
    public String getMark(int row, int col){
        return this.board.getMark(row, col);
    }

    @Override
    public boolean makeMove(String player,int row, int col){
        return this.board.makeMove(player, row, col);
    }

    @Override
    public void setSize(int row, int col){
        this.board.setSize(row, col);
    }

    @Override
    public int getColSize(){
        return this.board.getColSize();
    }

    @Override
    public int getRowSize(){
        return this.board.getRowSize();
    }

    @Override
    public String getName(){
        return this.board.getName();
    }

    @Override
    public boolean isFull(){
        return this.board.isFull();
    }

}
