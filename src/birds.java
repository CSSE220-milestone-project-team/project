public class birds extends Enemy{
    private Enemy enemy;
    private int positionX;
    private int positionY;
    private int moveSpeed;

    public birds(int positionX, int positionY, int moveSpeed){
        this.positionX = positionX;
        this.positionY = positionY;
        this.moveSpeed = moveSpeed;

    }//birds


    public void patrolMoveLeft(int positionX,int moveSpeed){
        enemy.moveLeft(positionX,moveSpeed);

    }
    public void patrolMoveRight(int positionX, int moveSpeed){
        enemy.moveRight(positionX,moveSpeed);
    }
}
