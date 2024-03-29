package Physic2D.primitives;

import Captain.GameObject;
import Captain.InitUpdate;
import org.joml.Vector2f;

public class BoxBounds extends Bounds{
    private float speedl;
    private float speedr;
    public float width, height, halfWidth, halfHeight;
    public Vector2f vec, center= new Vector2f();
    public InitUpdate init = new InitUpdate();
    public float overlapY, overlapX;
    public BoxBounds(){

    }

    public BoxBounds(Vector2f vec){
        this.width = vec.x;
        this.height = vec.y;
        this.halfWidth = this.width/2.0f;
        this.halfHeight = this.height/2.0f;
    }



    public void calculateCenter(){
        this.center.x = this.gameObject.transform.position.x + this.halfWidth;
        this.center.y = this.gameObject.transform.position.y + this.halfHeight;
    }

    @Override
    public void start(){
        this.calculateCenter();
    }

    public static boolean checkCollision(GameObject b1, GameObject b2){
        if (b1.transform.position.x+b1.transform.scale.x-9 >= b2.transform.position.x && b2.transform.position.x+b2.transform.scale.x >= b1.transform.position.x+9
                && b1.transform.position.y+1+b1.transform.scale.y >= b2.transform.position.y && b2.transform.position.y-20+b2.transform.scale.y >= b1.transform.position.y){
            return true;
        }else
            return false;
    }



    public void resolveCollision(GameObject player){
        BoxBounds playerBounds = player.getComponent(BoxBounds.class);
        playerBounds.calculateCenter();
        this.calculateCenter();
        float dx = this.center.x - playerBounds.center.x;
        float dy = this.center.y - playerBounds.center.y;

        float combineHalfWidths = playerBounds.halfWidth+this.halfWidth;
        float combineHalfHeights = playerBounds.halfHeight+this.halfHeight;

        overlapX = combineHalfWidths-Math.abs(dx);
        overlapY = combineHalfHeights-Math.abs(dy);

        if (overlapX >= overlapY){
            if (dy>0){
                player.transform.position.y = gameObject.transform.position.y - playerBounds.getHeight()+20;
            }else if(dy<0){
                player.onGround = true;
                player.transform.position.y = gameObject.transform.position.y + playerBounds.getHeight();
            }
        }else {
            if (dx<0){
                player.transform.position.x = gameObject.transform.position.x + playerBounds.getWidth()-10;
                init.setisCollidel(true);
            }else if (dx>0){
                player.transform.position.x = gameObject.transform.position.x - playerBounds.getWidth()+8;
                init.setisCollider(true);

                }
            }
        }

    @Override
    public float getWidth() {
        return width;
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public void update(float dt) {

    }

    public void setSpeedR(float speedr){
        this.speedr = speedr;
    }
    public void setSpeedl(float speedl){
        this.speedl = speedl;
    }

}