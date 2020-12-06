package Physic2D.primitives;

import Captain.Component;

public abstract class Bounds extends Component {
    abstract public float getWidth();
    abstract public float getHeight();

    public static boolean checkCollision(Bounds b1, Bounds b2){
        return BoxBounds.checkCollision((BoxBounds)b1, (BoxBounds)b2);
    }
}
