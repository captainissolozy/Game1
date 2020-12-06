package Physic2D.primitives;

import Captain.Component;
import Captain.GameObject;

public abstract class Bounds extends Component {
    abstract public float getWidth();
    abstract public float getHeight();

    public static boolean checkCollision(Bounds b1, Bounds b2){
        return BoxBounds.checkCollision((BoxBounds)b1, (BoxBounds)b2);
    }

    public static void resolveCollision(Bounds b, GameObject plr){
        BoxBounds box = (BoxBounds) b;
        box.resolveCollision(plr);
    }
}
