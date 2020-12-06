package Captain;

import org.joml.Vector2f;

public abstract class Component {

    public GameObject gameObject = null;
    public Character character = null;
    protected Vector2f position;
    protected Vector2f scale;

    public void start() {

    }

    public abstract void update(float dt);
}
