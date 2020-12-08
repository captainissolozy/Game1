package Physic2D.primitives;

import Captain.Component;
import Captain.GameObject;

public abstract class Bounds extends Component {
    abstract public float getWidth();
    abstract public float getHeight();

    public static boolean checkCollision(GameObject b1, GameObject b2){
        return BoxBounds.checkCollision(b1, b2);
    }

    public static void resolveCollision(Bounds b, GameObject plr){
        BoxBounds box = (BoxBounds) b;
        box.resolveCollision(plr);
    }


}
