package Physic2D.primitives;

import Captain.GameObject;
import org.joml.Vector2f;

public class BoxBounds extends Bounds{
    public float width, height, halfWidth, halfHeight;
    public Vector2f vec, center= new Vector2f();

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

    public static boolean checkCollision(BoxBounds b1, BoxBounds b2){
        b1.calculateCenter();
        b2.calculateCenter();
        float dx = b2.center.x - b1.center.x;
        float dy = b2.center.y - b1.center.y;

        float combineHalfWidths = b1.halfWidth+b2.halfWidth;
        float combineHalfHeights = b1.halfHeight+b2.halfHeight;

        if (Math.abs(dx)<= combineHalfWidths){
            return Math.abs(dy) <= combineHalfHeights;
        }

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

        float overlapX = combineHalfWidths-Math.abs(dx);
        float overlabY = combineHalfHeights-Math.abs(dy);

        if (overlapX >= overlabY){
            if (dy>0){
                player.transform.position.y = gameObject.transform.position.y - playerBounds.getHeight();
            }else{
                player.transform.position.y = gameObject.transform.position.y + playerBounds.getHeight();
            }
        }else {
            if (dx<0){
                player.transform.position.x = gameObject.transform.position.x - playerBounds.getWidth();
            }else {
                player.transform.position.x = gameObject.transform.position.x + playerBounds.getWidth();
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
}
