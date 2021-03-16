package Task_07;

public class Point {
    private int x;
    private int y;
    private int[] xy = {x,y};
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int[] getXY(){
        return xy;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "Point: (" + x+ "," +y+ ")";
    }
}
