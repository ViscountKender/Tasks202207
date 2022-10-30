public class Square {
  private  int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public int perimeter(){
        return 4 * side;
    }
    public int square(int side){
        return side * side;
    }







}
