package Captain;

import java.util.ArrayList;
import java.util.List;

public class GameObject {

    private String name;
    private List<Component> components;
    public Transform transform;
    private boolean isPlayer=false;
    private boolean isBackground=false;
    private boolean isHalfblock;
    public boolean onGround;
    private boolean isDeath = false, isWin=false;

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
    public GameObject(String name, Transform transform, boolean isPlayer, boolean isBackground, boolean isHalfblock){
        this.name = name;
        this.components = new ArrayList<>();
        this.transform = transform;
        this.isPlayer = isPlayer;
        this.isBackground = isBackground;
        this.isHalfblock = isHalfblock;
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
        for (int i=0; i < components.size(); i++) {
            components.get(i).update(dt);
        }
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

    public void setDeath(boolean death) {
        isDeath = death;
    }

    public void setWin(boolean win) {
        isWin = win;
    }
}