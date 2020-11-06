package Captain;

import Component.SpriteRenderer;
import Component.Spritesheet;
import org.joml.Vector2f;
import util.AssetPool;

import static org.lwjgl.glfw.GLFW.*;

public class LevelEditorScene extends Scene {

    public LevelEditorScene() {

    }

    @Override
    public void init() {
        loadResources();

        this.camera = new Camera(new Vector2f(-250, 0));

        Spritesheet sprites0 = AssetPool.getSpritesheet("assets/images/4kback.jpg");
        Spritesheet sprites1 = AssetPool.getSpritesheet("assets/images/Tileset.png");

        GameObject obj1 = new GameObject("Object 1", new Transform(new Vector2f(-250, 0), new Vector2f(3840, 2160)));
        obj1.addComponent(new SpriteRenderer(sprites0.getSprite(0)));
        this.addGameObjectToScene(obj1);

        GameObject obj2 = new GameObject("Object 2", new Transform(new Vector2f(-100, 100), new Vector2f(48, 48)));
        obj2.addComponent(new SpriteRenderer(sprites1.getSprite(58)));
        this.addGameObjectToScene(obj2);

        GameObject obj3 = new GameObject("Object 3", new Transform(new Vector2f(-52, 100), new Vector2f(48, 48)));
        obj3.addComponent(new SpriteRenderer(sprites1.getSprite(57)));
        this.addGameObjectToScene(obj3);

        GameObject obj5 = new GameObject("Object 3/2", new Transform(new Vector2f(-4, 100), new Vector2f(48, 48)));
        obj5.addComponent(new SpriteRenderer(sprites1.getSprite(57)));
        this.addGameObjectToScene(obj5);

        GameObject obj4 = new GameObject("Object 4", new Transform(new Vector2f(44, 100), new Vector2f(48, 48)));
        obj4.addComponent(new SpriteRenderer(sprites1.getSprite(56)));
        this.addGameObjectToScene(obj4);
    }

    private void loadResources() {
        AssetPool.getShader("assets/shaders/default.glsl");

        AssetPool.addSpritesheet("assets/images/4kback.jpg",
                new Spritesheet(AssetPool.getTexture("assets/images/4kback.jpg"),
                        3840, 2160, 1, 0));
        AssetPool.addSpritesheet("assets/images/Tileset.png",
                new Spritesheet(AssetPool.getTexture("assets/images/Tileset.png"),
                        48, 48, 182, 0));
    }

    @Override
    public void update(float dt) {
        if (KeyListener.isKeyPressed(GLFW_KEY_RIGHT)) {
            if (camera.position.x < 2310){
                camera.position.x += 500f * dt;
            }else
                camera.position.x = 2310;
        } else if (KeyListener.isKeyPressed(GLFW_KEY_LEFT)) {
            if (camera.position.x > -250){
                camera.position.x -= 500f * dt;
            }else
                camera.position.x = -250;
        }
        if (KeyListener.isKeyPressed(GLFW_KEY_UP)) {
            if (camera.position.y<1480){
                camera.position.y += 500f * dt;
            }else
                camera.position.y = 1480;
        } else if (KeyListener.isKeyPressed(GLFW_KEY_DOWN)) {
            if (camera.position.y>0){
            camera.position.y -= 500f * dt;
            }else
                camera.position.y = 0;
        }

        for (GameObject go : this.gameObjects) {
            go.update(dt);
        }

        this.renderer.render();
    }
}