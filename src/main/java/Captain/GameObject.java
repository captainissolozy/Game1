package Captain;

import util.Constants;

import java.util.ArrayList;
import java.util.List;

import static org.lwjgl.glfw.GLFW.GLFW_KEY_SPACE;

public class GameObject {

    private String name;
    private List<Component> components;
    public Transform transform;
    private boolean isPlayer=false;
    private boolean isBackground=false;
    public boolean onGround = true;
    private float velocityY;

    public GameObject(String name) {
        this.name = name;
        this.components = new ArrayList<>();
        this.transform = new Transform();
    }

    public GameObject(String name, Transform transform) {
        this.name = name;
        this.components = new ArrayList<>();
        this.transform = transform;
    }
    public GameObject(String name, Transform transform, boolean isPlayer, boolean isBackground){
        this.name = name;
        this.components = new ArrayList<>();
        this.transform = transform;
        this.isPlayer = isPlayer;
        this.isBackground = isBackground;
    }
    public <T extends Component> T getComponent(Class<T> componentClass) {
        for (Component c : components) {
            if (componentClass.isAssignableFrom(c.getClass())) {
                try {
                    return componentClass.cast(c);
                } catch (ClassCastException e) {
                    e.printStackTrace();
                    assert false : "Error: Casting component.";
                }
            }
        }

        return null;
    }

    public <T extends Component> void removeComponent(Class<T> componentClass) {
        for (int i=0; i < components.size(); i++) {
            Component c = components.get(i);
            if (componentClass.isAssignableFrom(c.getClass())) {
                components.remove(i);
                return;
            }
        }
    }

    public void addComponent(Component c) {
        this.components.add(c);
        c.gameObject = this;
    }

    public void update(float dt) {
        if(onGround && KeyListener.isKeyPressed(GLFW_KEY_SPACE)){
            addJumpForce();
            this.onGround = false;
        }
        for (int i=0; i < components.size(); i++) {
            components.get(i).update(dt);
        }
    }

    private void addJumpForce(){
        this.velocityY = Constants.JUMP_FORCE;
    }

    public void start() {
        for (int i=0; i < components.size(); i++) {
            components.get(i).start();
        }
    }
    public boolean getIsPlayer(){
        return isPlayer;
    }
    public boolean getIsBackground(){
        return isBackground;
    }
}