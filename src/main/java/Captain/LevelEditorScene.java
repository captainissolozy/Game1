package Captain;

import Component.SpriteRenderer;
import Component.Spritesheet;
import org.joml.Vector2f;
import util.AssetPool;

import static org.lwjgl.glfw.GLFW.*;

public class LevelEditorScene extends Scene {

    public LevelEditorScene() {

    }

    private Spritesheet sprites0,sprites1, kidlesheet, kwalksheet;
    private GameObject knightidle, knightwalk;

    @Override
    public void init() {
        loadResources();

        this.camera = new Camera(new Vector2f(-250, 0));

        sprites0 = AssetPool.getSpritesheet("assets/images/Background.png");
        sprites1 = AssetPool.getSpritesheet("assets/images/Tileset.png");
        kidlesheet = AssetPool.getSpritesheet("assets/images/idleknight.png");

        GameObject back1 = new GameObject("Object 1", new Transform(new Vector2f(-250, 0), new Vector2f(2560, 1440)));
        back1.addComponent(new SpriteRenderer(sprites0.getSprite(0)));
        this.addGameObjectToScene(back1);
        GameObject back2 = new GameObject("back2", new Transform(new Vector2f(2310, 0), new Vector2f(2560, 1440)));
        back2.addComponent(new SpriteRenderer(sprites0.getSprite(0)));
        this.addGameObjectToScene(back2);

        knightidle = new GameObject("knightc", new Transform(new Vector2f(-52, 128), new Vector2f(64, 64)));
        knightidle.addComponent(new SpriteRenderer(kidlesheet.getSprite(0)));
        this.addGameObjectToScene(knightidle);

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

        GameObject obj6 = new GameObject("Object 6", new Transform(new Vector2f(188, 100), new Vector2f(48, 48)));
        obj6.addComponent(new SpriteRenderer(sprites1.getSprite(57)));
        this.addGameObjectToScene(obj6);
    }

    private void loadResources() {
        AssetPool.getShader("assets/shaders/default.glsl");

        AssetPool.addSpritesheet("assets/images/Background.png",
                new Spritesheet(AssetPool.getTexture("assets/images/Background.png"),
                        1920, 1080, 1, 0));
        AssetPool.addSpritesheet("assets/images/Tileset.png",
                new Spritesheet(AssetPool.getTexture("assets/images/Tileset.png"),
                        48, 48, 182, 0));
        AssetPool.addSpritesheet("assets/images/idleknight.png",
                new Spritesheet(AssetPool.getTexture("assets/images/idleknight.png"),
                        64, 64, 15, 0));
    }

    private int spriteIndex = 0;
    private float spriteFlipTime = 0.08f;
    private float spriteFlipTimeLeft = 0.0f;
    private float speed = 50f;

    @Override
    public void update(float dt) {
        if (!(KeyListener.isKeyPressed(GLFW_KEY_UP) ||KeyListener.isKeyPressed(GLFW_KEY_DOWN)||KeyListener.isKeyPressed(GLFW_KEY_LEFT)||KeyListener.isKeyPressed(GLFW_KEY_RIGHT))){
            spriteFlipTimeLeft -= dt;
            if (spriteFlipTimeLeft <= 0) {
                spriteFlipTimeLeft = spriteFlipTime;
                spriteIndex++;
                if (spriteIndex > 14) {
                    spriteIndex = 0;
                }
                knightidle.getComponent(SpriteRenderer.class).setSprite(kidlesheet.getSprite(spriteIndex));
            }
        }
        if (KeyListener.isKeyPressed(GLFW_KEY_RIGHT)) {
            if (camera.position.x < 3590){
                camera.position.x += speed * dt;
            }else
                camera.position.x = 3590;
        } else if (KeyListener.isKeyPressed(GLFW_KEY_LEFT)) {
            if (camera.position.x > -250){
                camera.position.x -= speed * dt;
            }else
                camera.position.x = -250;
        }
        if (KeyListener.isKeyPressed(GLFW_KEY_UP)) {
            if (camera.position.y<760){
                camera.position.y += speed * dt;
            }else
                camera.position.y = 760;
        } else if (KeyListener.isKeyPressed(GLFW_KEY_DOWN)) {
            if (camera.position.y>0){
            camera.position.y -= speed * dt;
            }else{
                camera.position.y = 0;
        }

            for (GameObject go : this.gameObjects) {
                go.update(dt);
            }
        }


        for (GameObject go : this.gameObjects) {
            go.update(dt);
        }

        this.renderer.render();
    }
}