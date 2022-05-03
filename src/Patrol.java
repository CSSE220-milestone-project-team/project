public class Patrol extends Enemy {
        private Enemy enemy;
        private int positionX;
        private int positionY;
        private int moveSpeed;

        public Patrol(int positionX,int positionY,int moveSpeed){
                this.positionX = positionX;
                this.positionY = positionY;
                this.moveSpeed = moveSpeed;
        } //Patrol


    public void patrolMoveLeft(int positionX,int moveSpeed){
        enemy.moveLeft(positionX,moveSpeed);

    }
    public void patrolMoveRight(int positionX, int moveSpeed){
            enemy.moveRight(positionX,moveSpeed);
    }





}
