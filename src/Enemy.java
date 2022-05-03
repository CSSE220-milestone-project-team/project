public class Enemy {

    public boolean catchPlayer(int PlayerX,int PlayerY, int EnemyX, int EnemyY){

        return false;
    }



    public void moveLeft(int locX,int distance){
        locX=locX-distance;

    }
    public void moveRight(int locX, int distance){
        locX=locX+distance;

    }

}
