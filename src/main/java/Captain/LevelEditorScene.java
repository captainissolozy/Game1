package Captain;

import Component.SpriteRenderer;
import Component.Spritesheet;
import org.joml.Vector2f;
import util.AssetPool;

import static org.lwjgl.glfw.GLFW.*;

public class LevelEditorScene extends Scene {

    public LevelEditorScene() {

    }

    private Spritesheet sprites0,sprites1,sprites_crave ,kidlesheet ,grass , kwalksheet, sprites_forest, maincharectersheet, sprites_crave2, tree1, tree2, tree3, tree_dry, tree_dry2, tree_dry3, tree_dry4;
    private GameObject knightidle, knightwalk, maincharecter;

    @Override
    public void init() {
        loadResources();

        this.camera = new Camera(new Vector2f(-250, 0));

        sprites0 = AssetPool.getSpritesheet("assets/images/Background.png");
        sprites1 = AssetPool.getSpritesheet("assets/images/Tileset.png");
        sprites_crave = AssetPool.getSpritesheet("assets/images/Tile_47.png");
        sprites_crave2 = AssetPool.getSpritesheet("assets/images/Tile_48.png");
        sprites_forest = AssetPool.getSpritesheet("assets/images/Tileset_forest.png");
        kidlesheet = AssetPool.getSpritesheet("assets/images/idleknight.png");
        maincharectersheet = AssetPool.getSpritesheet("assets/images/character/Woodcutter_idle.png");
        tree1 = AssetPool.getSpritesheet("assets/images/tree3.png");
        tree2 = AssetPool.getSpritesheet("assets/images/tree2.png");
        tree3 = AssetPool.getSpritesheet("assets/images/tree1.png");
        tree_dry = AssetPool.getSpritesheet("assets/images/object/Trees/1.png");
        tree_dry2 = AssetPool.getSpritesheet("assets/images/object/Trees/2.png");
        tree_dry3 = AssetPool.getSpritesheet("assets/images/object/Trees/3.png");
        tree_dry4 = AssetPool.getSpritesheet("assets/images/object/Ridges/3.png");
        grass = AssetPool.getSpritesheet("assets/images/grass_mo.png");

        //Obj background
        GameObject back1 = new GameObject("Object 1", new Transform(new Vector2f(-250, 0), new Vector2f(1920, 1080)));
        back1.addComponent(new SpriteRenderer(sprites0.getSprite(0)));
        this.addGameObjectToScene(back1);
        GameObject back2 = new GameObject("back2", new Transform(new Vector2f(2310, 0), new Vector2f(1920, 1080)));
        back2.addComponent(new SpriteRenderer(sprites0.getSprite(0)));
        this.addGameObjectToScene(back2);

        //Obj knight
        knightidle = new GameObject("knightc", new Transform(new Vector2f(-52, 115), new Vector2f(100, 100)));
        knightidle.addComponent(new SpriteRenderer(kidlesheet.getSprite(0)));
        this.addGameObjectToScene(knightidle);

        //Obj environment
        //top floor
        GameObject tree_9 = new GameObject("tree_9", new Transform(new Vector2f(750, 50), new Vector2f(199, 183)));
        tree_9.addComponent(new SpriteRenderer(tree1.getSprite(0)));
        this.addGameObjectToScene(tree_9);

        GameObject tree_8 = new GameObject("tree_8", new Transform(new Vector2f(100, 30), new Vector2f(141, 168)));
        tree_8.addComponent(new SpriteRenderer(tree2.getSprite(0)));
        this.addGameObjectToScene(tree_8);

        GameObject tree_7 = new GameObject("tree_7", new Transform(new Vector2f(200, 148), new Vector2f(141, 168)));
        tree_7.addComponent(new SpriteRenderer(tree2.getSprite(0)));
        this.addGameObjectToScene(tree_7);

        GameObject tree_6 = new GameObject("tree_6", new Transform(new Vector2f(1340, 148), new Vector2f(141, 168)));
        tree_6.addComponent(new SpriteRenderer(tree2.getSprite(0)));
        this.addGameObjectToScene(tree_6);

        GameObject obj67 = new GameObject("Object 67 crave", new Transform(new Vector2f(1340, 148), new Vector2f(48, 48)));
        obj67.addComponent(new SpriteRenderer(sprites_forest.getSprite(47)));
        this.addGameObjectToScene(obj67);

        GameObject obj66 = new GameObject("Object 66 crave", new Transform(new Vector2f(1292, 148), new Vector2f(48, 48)));
        obj66.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj66);

        GameObject obj65 = new GameObject("Object 65 crave", new Transform(new Vector2f(1244, 148), new Vector2f(48, 48)));
        obj65.addComponent(new SpriteRenderer(sprites_forest.getSprite(40)));
        this.addGameObjectToScene(obj65);

        GameObject obj64 = new GameObject("Object 64 crave", new Transform(new Vector2f(1196, 148), new Vector2f(48, 48)));
        obj64.addComponent(new SpriteRenderer(sprites_forest.getSprite(52)));
        this.addGameObjectToScene(obj64);

        GameObject obj63 = new GameObject("Object 63 crave", new Transform(new Vector2f(1148, 148), new Vector2f(48, 48)));
        obj63.addComponent(new SpriteRenderer(sprites_crave2.getSprite(0)));
        this.addGameObjectToScene(obj63);

        GameObject obj62 = new GameObject("Object 62 crave", new Transform(new Vector2f(1196, 196), new Vector2f(48, 48)));
        obj62.addComponent(new SpriteRenderer(sprites_forest.getSprite(47)));
        this.addGameObjectToScene(obj62);

        GameObject obj61 = new GameObject("Object 61 crave", new Transform(new Vector2f(1148, 196), new Vector2f(48, 48)));
        obj61.addComponent(new SpriteRenderer(sprites_forest.getSprite(40)));
        this.addGameObjectToScene(obj61);

        GameObject obj60 = new GameObject("Object 60 crave", new Transform(new Vector2f(1100, 196), new Vector2f(48, 48)));
        obj60.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj60);

        GameObject obj59 = new GameObject("Object 59 crave", new Transform(new Vector2f(1052, 148), new Vector2f(48, 48)));
        obj59.addComponent(new SpriteRenderer(sprites_crave.getSprite(0)));
        this.addGameObjectToScene(obj59);

        GameObject obj58 = new GameObject("Object 58 crave", new Transform(new Vector2f(1052, 196), new Vector2f(48, 48)));
        obj58.addComponent(new SpriteRenderer(sprites_forest.getSprite(42)));
        this.addGameObjectToScene(obj58);

        GameObject obj57 = new GameObject("Object 57 crave", new Transform(new Vector2f(1004, 148), new Vector2f(48, 48)));
        obj57.addComponent(new SpriteRenderer(sprites_forest.getSprite(18)));
        this.addGameObjectToScene(obj57);

        GameObject obj56 = new GameObject("Object 56 crave", new Transform(new Vector2f(1004, 196), new Vector2f(48, 48)));
        obj56.addComponent(new SpriteRenderer(sprites_forest.getSprite(46)));
        this.addGameObjectToScene(obj56);

        GameObject obj55 = new GameObject("Object 55 crave", new Transform(new Vector2f(908, 148), new Vector2f(48, 48)));
        obj55.addComponent(new SpriteRenderer(sprites_forest.getSprite(46)));
        this.addGameObjectToScene(obj55);

        GameObject obj54 = new GameObject("Object 54 crave", new Transform(new Vector2f(956, 148), new Vector2f(48, 48)));
        obj54.addComponent(new SpriteRenderer(sprites_forest.getSprite(24)));
        this.addGameObjectToScene(obj54);

        GameObject tree_3 = new GameObject("tree_dry3", new Transform(new Vector2f(616, 290), new Vector2f(199, 183)));
        tree_3.addComponent(new SpriteRenderer(tree1.getSprite(0)));
        this.addGameObjectToScene(tree_3);

        GameObject obj68 = new GameObject("Object 68 crave", new Transform(new Vector2f(568, 268), new Vector2f(48, 48)));
        obj68.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj68);

        GameObject obj53 = new GameObject("Object 52 crave", new Transform(new Vector2f(900, 200), new Vector2f(48, 48)));
        obj53.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj53);

        GameObject obj51 = new GameObject("Object 51 crave", new Transform(new Vector2f(616, 244), new Vector2f(48, 48)));
        obj51.addComponent(new SpriteRenderer(sprites_forest.getSprite(48)));
        this.addGameObjectToScene(obj51);

        GameObject obj47 = new GameObject("Object 47 crave", new Transform(new Vector2f(664, 244), new Vector2f(48, 48)));
        obj47.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj47);

        GameObject obj48 = new GameObject("Object 48 crave", new Transform(new Vector2f(712, 244), new Vector2f(48, 48)));
        obj48.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj48);

        GameObject obj49 = new GameObject("Object 49 crave", new Transform(new Vector2f(760, 244), new Vector2f(48, 48)));
        obj49.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj49);

        GameObject obj50 = new GameObject("Object 50 crave", new Transform(new Vector2f(808, 244), new Vector2f(48, 48)));
        obj50.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj50);

        GameObject obj52 = new GameObject("Object 52 crave", new Transform(new Vector2f(856, 244), new Vector2f(48, 48)));
        obj52.addComponent(new SpriteRenderer(sprites_forest.getSprite(58)));
        this.addGameObjectToScene(obj52);

        GameObject tree = new GameObject("tree", new Transform(new Vector2f(-292, 145), new Vector2f(199, 183)));
        tree.addComponent(new SpriteRenderer(tree1.getSprite(0)));
        this.addGameObjectToScene(tree);

        GameObject tree_2 = new GameObject("tree", new Transform(new Vector2f(100, 145), new Vector2f(104, 135)));
        tree_2.addComponent(new SpriteRenderer(tree3.getSprite(0)));
        this.addGameObjectToScene(tree_2);

//        GameObject tree_dry1 = new GameObject("tree", new Transform(new Vector2f(25, 145), new Vector2f(104, 135)));
//        tree_dry1.addComponent(new SpriteRenderer(tree_dry.getSprite(0)));
//        this.addGameObjectToScene(tree_dry1);

//        GameObject tree_5 = new GameObject("tree222", new Transform(new Vector2f(540, 145), new Vector2f(109, 41)));
//        tree_5.addComponent(new SpriteRenderer(tree_dry4.getSprite(0)));
//        this.addGameObjectToScene(tree_5);

        GameObject obj39 = new GameObject("Object 39 crave", new Transform(new Vector2f(332, 148), new Vector2f(48, 48)));
        obj39.addComponent(new SpriteRenderer(sprites_forest.getSprite(46)));
        this.addGameObjectToScene(obj39);

        GameObject obj40 = new GameObject("Object 40 crave", new Transform(new Vector2f(380, 196), new Vector2f(48, 48)));
        obj40.addComponent(new SpriteRenderer(sprites_forest.getSprite(46)));
        this.addGameObjectToScene(obj40);

        GameObject obj41 = new GameObject("Object 41 crave", new Transform(new Vector2f(380, 148), new Vector2f(48, 48)));
        obj41.addComponent(new SpriteRenderer(sprites_forest.getSprite(25)));
        this.addGameObjectToScene(obj41);

        GameObject obj42 = new GameObject("Object 42 crave", new Transform(new Vector2f(428, 196), new Vector2f(48, 48)));
        obj42.addComponent(new SpriteRenderer(sprites_forest.getSprite(42)));
        this.addGameObjectToScene(obj42);

        GameObject obj43 = new GameObject("Object 43 crave", new Transform(new Vector2f(428, 148), new Vector2f(48, 48)));
        obj43.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj43);

        GameObject obj44 = new GameObject("Object 44 crave", new Transform(new Vector2f(476, 196), new Vector2f(48, 48)));
        obj44.addComponent(new SpriteRenderer(sprites_forest.getSprite(33)));
        this.addGameObjectToScene(obj44);

        GameObject obj45 = new GameObject("Object 45 crave", new Transform(new Vector2f(476, 196), new Vector2f(48, 48)));
        obj45.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj45);

        GameObject obj46 = new GameObject("Object 46 crave", new Transform(new Vector2f(520, 196), new Vector2f(48, 48)));
        obj46.addComponent(new SpriteRenderer(sprites_forest.getSprite(58)));
        this.addGameObjectToScene(obj46);

        GameObject obj_1 = new GameObject("Object -1", new Transform(new Vector2f(-292, 100), new Vector2f(48, 48)));
        obj_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj_1);

        GameObject obj = new GameObject("Object", new Transform(new Vector2f(-244, 100), new Vector2f(48, 48)));
        obj.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj);

        GameObject obj0 = new GameObject("Object 0", new Transform(new Vector2f(-196, 100), new Vector2f(48, 48)));
        obj0.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj0);

        GameObject obj1 = new GameObject("Object 1", new Transform(new Vector2f(-148, 100), new Vector2f(48, 48)));
        obj1.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj1);

        GameObject obj2 = new GameObject("Object 2", new Transform(new Vector2f(-100, 100), new Vector2f(48, 48)));
        obj2.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj2);

        GameObject obj3 = new GameObject("Object 3", new Transform(new Vector2f(-52, 100), new Vector2f(48, 48)));
        obj3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj3);

        GameObject obj5 = new GameObject("Object 3/2", new Transform(new Vector2f(-4, 100), new Vector2f(48, 48)));
        obj5.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj5);

        GameObject obj4 = new GameObject("Object 4", new Transform(new Vector2f(44, 100), new Vector2f(48, 48)));
        obj4.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj4);

        GameObject obj6 = new GameObject("Object 6", new Transform(new Vector2f(92, 100), new Vector2f(48, 48)));
        obj6.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj6);

        GameObject obj7 = new GameObject("Object 7", new Transform(new Vector2f(140, 100), new Vector2f(48, 48)));
        obj7.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj7);

        GameObject obj8 = new GameObject("Object 8", new Transform(new Vector2f(188, 100), new Vector2f(48, 48)));
        obj8.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj8);

        GameObject obj9 = new GameObject("Object 9", new Transform(new Vector2f(236, 100), new Vector2f(48, 48)));
        obj9.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj9);

        GameObject obj10 = new GameObject("Object 10", new Transform(new Vector2f(284, 100), new Vector2f(48, 48)));
        obj10.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj10);

        GameObject obj11 = new GameObject("Object 11", new Transform(new Vector2f(332, 100), new Vector2f(48, 48)));
        obj11.addComponent(new SpriteRenderer(sprites_forest.getSprite(25)));
        this.addGameObjectToScene(obj11);

        GameObject obj12 = new GameObject("Object 12", new Transform(new Vector2f(380, 100), new Vector2f(48, 48)));
        obj12.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj12);

        GameObject obj13 = new GameObject("Object 13", new Transform(new Vector2f(428, 100), new Vector2f(48, 48)));
        obj13.addComponent(new SpriteRenderer(sprites_forest.getSprite(23)));
        this.addGameObjectToScene(obj13);

        GameObject obj14 = new GameObject("Object 14", new Transform(new Vector2f(476, 100), new Vector2f(48, 48)));
        obj14.addComponent(new SpriteRenderer(sprites_forest.getSprite(19)));
        this.addGameObjectToScene(obj14);

        GameObject obj15 = new GameObject("Object 15", new Transform(new Vector2f(524, 100), new Vector2f(48, 48)));
        obj15.addComponent(new SpriteRenderer(sprites_forest.getSprite(39)));
        this.addGameObjectToScene(obj15);

        GameObject obj16 = new GameObject("Object 16", new Transform(new Vector2f(572, 100), new Vector2f(48, 48)));
        obj16.addComponent(new SpriteRenderer(sprites_forest.getSprite(39)));
        this.addGameObjectToScene(obj16);

        GameObject obj17 = new GameObject("Object 17", new Transform(new Vector2f(620, 100), new Vector2f(48, 48)));
        obj17.addComponent(new SpriteRenderer(sprites_forest.getSprite(59)));
        this.addGameObjectToScene(obj17);

        GameObject obj18 = new GameObject("Object 18", new Transform(new Vector2f(668, 100), new Vector2f(48, 48)));
        obj18.addComponent(new SpriteRenderer(sprites_forest.getSprite(39)));
        this.addGameObjectToScene(obj18);

        GameObject obj19 = new GameObject("Object 19", new Transform(new Vector2f(716, 100), new Vector2f(48, 48)));
        obj19.addComponent(new SpriteRenderer(sprites_forest.getSprite(49)));
        this.addGameObjectToScene(obj19);

        GameObject obj20 = new GameObject("Object 20", new Transform(new Vector2f(764, 100), new Vector2f(48, 48)));
        obj20.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj20);

        GameObject obj21 = new GameObject("Object 21", new Transform(new Vector2f(812, 100), new Vector2f(48, 48)));
        obj21.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj21);

        GameObject obj22 = new GameObject("Object 22", new Transform(new Vector2f(860, 100), new Vector2f(48, 48)));
        obj22.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj22);

        GameObject obj23 = new GameObject("Object 23", new Transform(new Vector2f(908, 100), new Vector2f(48, 48)));
        obj23.addComponent(new SpriteRenderer(sprites_forest.getSprite(25)));
        this.addGameObjectToScene(obj23);

        GameObject obj24 = new GameObject("Object 24", new Transform(new Vector2f(956, 100), new Vector2f(48, 48)));
        obj24.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj24);

        GameObject obj25 = new GameObject("Object 25", new Transform(new Vector2f(1004, 100), new Vector2f(48, 48)));
        obj25.addComponent(new SpriteRenderer(sprites_forest.getSprite(23)));
        this.addGameObjectToScene(obj25);

        GameObject obj26 = new GameObject("Object 26", new Transform(new Vector2f(1052, 100), new Vector2f(48, 48)));
        obj26.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj26);

        GameObject obj27 = new GameObject("Object 27", new Transform(new Vector2f(1100, 100), new Vector2f(48, 48)));
        obj27.addComponent(new SpriteRenderer(sprites_forest.getSprite(47)));
        this.addGameObjectToScene(obj27);

//        GameObject obj28 = new GameObject("Object 28", new Transform(new Vector2f(1148, 100), new Vector2f(48, 48)));
//        obj28.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
//        this.addGameObjectToScene(obj28);

//        GameObject obj29 = new GameObject("Object 29", new Transform(new Vector2f(1196, 100), new Vector2f(48, 48)));
//        obj29.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
//        this.addGameObjectToScene(obj29);

//        GameObject obj30 = new GameObject("Object 30", new Transform(new Vector2f(1244, 100), new Vector2f(48, 48)));
//        obj30.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
//        this.addGameObjectToScene(obj30);

        GameObject obj31 = new GameObject("Object 31", new Transform(new Vector2f(1292, 100), new Vector2f(48, 48)));
        obj31.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj31);

        GameObject obj32 = new GameObject("Object 32", new Transform(new Vector2f(1340, 100), new Vector2f(48, 48)));
        obj32.addComponent(new SpriteRenderer(sprites_forest.getSprite(23)));
        this.addGameObjectToScene(obj32);

        GameObject obj33 = new GameObject("Object 33", new Transform(new Vector2f(1388, 100), new Vector2f(48, 48)));
        obj33.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj33);

        GameObject obj34 = new GameObject("Object 34", new Transform(new Vector2f(1436, 100), new Vector2f(48, 48)));
        obj34.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj34);

        GameObject obj35 = new GameObject("Object 35", new Transform(new Vector2f(1484, 100), new Vector2f(48, 48)));
        obj35.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj35);

        GameObject obj36 = new GameObject("Object 36", new Transform(new Vector2f(1532, 100), new Vector2f(48, 48)));
        obj36.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj36);

        GameObject obj37 = new GameObject("Object 37", new Transform(new Vector2f(1580, 100), new Vector2f(48, 48)));
        obj37.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj37);

        GameObject obj38 = new GameObject("Object 38", new Transform(new Vector2f(1628, 100), new Vector2f(48, 48)));
        obj38.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj38);

        //second floor
        GameObject obj_1_1 = new GameObject("Object -1", new Transform(new Vector2f(-292, 52), new Vector2f(48, 48)));
        obj_1_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj_1_1);

        GameObject obj_0 = new GameObject("Object", new Transform(new Vector2f(-244, 52), new Vector2f(48, 48)));
        obj_0.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj_0);

        GameObject obj0_1 = new GameObject("Object 0", new Transform(new Vector2f(-196, 52), new Vector2f(48, 48)));
        obj0_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj0_1);

        GameObject obj1_1 = new GameObject("Object 1", new Transform(new Vector2f(-148, 52), new Vector2f(48, 48)));
        obj1_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj1_1);

        GameObject obj2_1 = new GameObject("Object 2", new Transform(new Vector2f(-100, 52), new Vector2f(48, 48)));
        obj2_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj2_1);

        GameObject obj3_1 = new GameObject("Object 3", new Transform(new Vector2f(-52, 52), new Vector2f(48, 48)));
        obj3_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj3_1);

        GameObject obj5_1 = new GameObject("Object 3/2", new Transform(new Vector2f(-4, 52), new Vector2f(48, 48)));
        obj5_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj5_1);

        GameObject obj4_1 = new GameObject("Object 4", new Transform(new Vector2f(44, 52), new Vector2f(48, 48)));
        obj4_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj4_1);

        GameObject obj6_1 = new GameObject("Object 6", new Transform(new Vector2f(92, 52), new Vector2f(48, 48)));
        obj6_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj6_1);

        GameObject obj7_1 = new GameObject("Object 7", new Transform(new Vector2f(140, 52), new Vector2f(48, 48)));
        obj7_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj7_1);

        GameObject obj8_1 = new GameObject("Object 8", new Transform(new Vector2f(188, 52), new Vector2f(48, 48)));
        obj8_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj8_1);

        GameObject obj9_1 = new GameObject("Object 9", new Transform(new Vector2f(236, 52), new Vector2f(48, 48)));
        obj9_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj9_1);

        GameObject obj10_1 = new GameObject("Object 10", new Transform(new Vector2f(284, 52), new Vector2f(48, 48)));
        obj10_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj10_1);

        GameObject obj11_1 = new GameObject("Object 11", new Transform(new Vector2f(332, 52), new Vector2f(48, 48)));
        obj11_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj11_1);

        GameObject obj12_1 = new GameObject("Object 12", new Transform(new Vector2f(380, 52), new Vector2f(48, 48)));
        obj12_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj12_1);

        GameObject obj13_1 = new GameObject("Object 13", new Transform(new Vector2f(428, 52), new Vector2f(48, 48)));
        obj13_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj13_1);

        GameObject obj14_1 = new GameObject("Object 14", new Transform(new Vector2f(476, 52), new Vector2f(48, 48)));
        obj14_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj14_1);

        GameObject obj15_1 = new GameObject("Object 15", new Transform(new Vector2f(524, 52), new Vector2f(48, 48)));
        obj15_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj15_1);

        GameObject obj16_1 = new GameObject("Object 16", new Transform(new Vector2f(572, 52), new Vector2f(48, 48)));
        obj16_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj16_1);

        GameObject obj17_1 = new GameObject("Object 17", new Transform(new Vector2f(620, 52), new Vector2f(48, 48)));
        obj17_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj17_1);

        GameObject obj18_1 = new GameObject("Object 18", new Transform(new Vector2f(668, 52), new Vector2f(48, 48)));
        obj18_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj18_1);

        GameObject obj19_1 = new GameObject("Object 19", new Transform(new Vector2f(716, 52), new Vector2f(48, 48)));
        obj19_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj19_1);

        GameObject obj20_1 = new GameObject("Object 20", new Transform(new Vector2f(764, 52), new Vector2f(48, 48)));
        obj20_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj20_1);

        GameObject obj21_1 = new GameObject("Object 21", new Transform(new Vector2f(812, 52), new Vector2f(48, 48)));
        obj21_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj21_1);

        GameObject obj22_1 = new GameObject("Object 22", new Transform(new Vector2f(860, 52), new Vector2f(48, 48)));
        obj22_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj22_1);

        GameObject obj23_1 = new GameObject("Object 23", new Transform(new Vector2f(908, 52), new Vector2f(48, 48)));
        obj23_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj23_1);

        GameObject obj24_1 = new GameObject("Object 24", new Transform(new Vector2f(956, 52), new Vector2f(48, 48)));
        obj24_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj24_1);

        GameObject obj25_1 = new GameObject("Object 25", new Transform(new Vector2f(1004, 52), new Vector2f(48, 48)));
        obj25_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj25_1);

        GameObject obj26_1 = new GameObject("Object 26", new Transform(new Vector2f(1052, 52), new Vector2f(48, 48)));
        obj26_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj26_1);

        GameObject obj27_1 = new GameObject("Object 27", new Transform(new Vector2f(1100, 52), new Vector2f(48, 48)));
        obj27_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(23)));
        this.addGameObjectToScene(obj27_1);

        GameObject obj28_1 = new GameObject("Object 28", new Transform(new Vector2f(1148, 52), new Vector2f(48, 48)));
        obj28_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(19)));
        this.addGameObjectToScene(obj28_1);

        GameObject obj29_1 = new GameObject("Object 29", new Transform(new Vector2f(1196, 52), new Vector2f(48, 48)));
        obj29_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(29)));
        this.addGameObjectToScene(obj29_1);

        GameObject obj30_1 = new GameObject("Object 30", new Transform(new Vector2f(1244, 52), new Vector2f(48, 48)));
        obj30_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(49)));
        this.addGameObjectToScene(obj30_1);

        GameObject obj31_1 = new GameObject("Object 31", new Transform(new Vector2f(1292, 52), new Vector2f(48, 48)));
        obj31_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj31_1);

        GameObject obj32_1 = new GameObject("Object 32", new Transform(new Vector2f(1340, 52), new Vector2f(48, 48)));
        obj32_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj32_1);

        GameObject obj33_1 = new GameObject("Object 33", new Transform(new Vector2f(1388, 52), new Vector2f(48, 48)));
        obj33_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj33_1);

        GameObject obj34_1 = new GameObject("Object 34", new Transform(new Vector2f(1436, 52), new Vector2f(48, 48)));
        obj34_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj34_1);

        GameObject obj35_1 = new GameObject("Object 35", new Transform(new Vector2f(1484, 52), new Vector2f(48, 48)));
        obj35_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj35_1);

        GameObject obj36_1 = new GameObject("Object 36", new Transform(new Vector2f(1532, 52), new Vector2f(48, 48)));
        obj36_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj36_1);

        GameObject obj37_1 = new GameObject("Object 37", new Transform(new Vector2f(1580, 52), new Vector2f(48, 48)));
        obj37_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj37_1);

        GameObject obj38_1 = new GameObject("Object 38", new Transform(new Vector2f(1628, 52), new Vector2f(48, 48)));
        obj38_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj38_1);

        //third floor
        GameObject obj_1_2 = new GameObject("Object -1", new Transform(new Vector2f(-292, 4), new Vector2f(48, 48)));
        obj_1_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj_1_2);

        GameObject obj_0_2 = new GameObject("Object", new Transform(new Vector2f(-244, 4), new Vector2f(48, 48)));
        obj_0_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj_0_2);

        GameObject obj0_2 = new GameObject("Object 0", new Transform(new Vector2f(-196, 4), new Vector2f(48, 48)));
        obj0_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj0_2);

        GameObject obj1_2 = new GameObject("Object 1", new Transform(new Vector2f(-148, 4), new Vector2f(48, 48)));
        obj1_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj1_2);

        GameObject obj2_2 = new GameObject("Object 2", new Transform(new Vector2f(-100, 4), new Vector2f(48, 48)));
        obj2_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj2_2);

        GameObject obj3_2 = new GameObject("Object 3", new Transform(new Vector2f(-52, 4), new Vector2f(48, 48)));
        obj3_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj3_2);

        GameObject obj5_2 = new GameObject("Object 3/2", new Transform(new Vector2f(-4, 4), new Vector2f(48, 48)));
        obj5_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj5_2);

        GameObject obj4_2 = new GameObject("Object 4", new Transform(new Vector2f(44, 4), new Vector2f(48, 48)));
        obj4_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj4_2);

        GameObject obj6_2 = new GameObject("Object 6", new Transform(new Vector2f(92, 4), new Vector2f(48, 48)));
        obj6_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj6_2);

        GameObject obj7_2 = new GameObject("Object 7", new Transform(new Vector2f(140, 4), new Vector2f(48, 48)));
        obj7_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj7_2);

        GameObject obj8_2 = new GameObject("Object 8", new Transform(new Vector2f(188, 4), new Vector2f(48, 48)));
        obj8_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj8_2);

        GameObject obj9_2 = new GameObject("Object 9", new Transform(new Vector2f(236, 4), new Vector2f(48, 48)));
        obj9_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj9_2);

        GameObject obj10_2 = new GameObject("Object 10", new Transform(new Vector2f(284, 4), new Vector2f(48, 48)));
        obj10_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj10_2);

        GameObject obj11_2 = new GameObject("Object 11", new Transform(new Vector2f(332, 4), new Vector2f(48, 48)));
        obj11_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj11_2);

        GameObject obj12_2 = new GameObject("Object 12", new Transform(new Vector2f(380, 4), new Vector2f(48, 48)));
        obj12_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj12_2);

        GameObject obj13_2 = new GameObject("Object 13", new Transform(new Vector2f(428, 4), new Vector2f(48, 48)));
        obj13_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj13_2);

        GameObject obj14_2 = new GameObject("Object 14", new Transform(new Vector2f(476, 4), new Vector2f(48, 48)));
        obj14_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj14_2);

        GameObject obj15_2 = new GameObject("Object 15", new Transform(new Vector2f(524, 4), new Vector2f(48, 48)));
        obj15_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj15_2);

        GameObject obj16_2 = new GameObject("Object 16", new Transform(new Vector2f(572, 4), new Vector2f(48, 48)));
        obj16_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj16_2);

        GameObject obj17_2 = new GameObject("Object 17", new Transform(new Vector2f(620, 4), new Vector2f(48, 48)));
        obj17_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj17_2);

        GameObject obj18_2 = new GameObject("Object 18", new Transform(new Vector2f(668, 4), new Vector2f(48, 48)));
        obj18_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj18_2);

        GameObject obj19_2 = new GameObject("Object 19", new Transform(new Vector2f(716, 4), new Vector2f(48, 48)));
        obj19_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj19_2);

        GameObject obj20_2 = new GameObject("Object 20", new Transform(new Vector2f(764, 4), new Vector2f(48, 48)));
        obj20_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj20_2);

        GameObject obj21_2 = new GameObject("Object 21", new Transform(new Vector2f(812, 4), new Vector2f(48, 48)));
        obj21_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj21_2);

        GameObject obj22_2 = new GameObject("Object 22", new Transform(new Vector2f(860, 4), new Vector2f(48, 48)));
        obj22_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj22_2);

        GameObject obj23_2 = new GameObject("Object 23", new Transform(new Vector2f(908, 4), new Vector2f(48, 48)));
        obj23_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj23_2);

        GameObject obj24_2 = new GameObject("Object 24", new Transform(new Vector2f(956, 4), new Vector2f(48, 48)));
        obj24_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj24_2);

        GameObject obj25_2 = new GameObject("Object 25", new Transform(new Vector2f(1004, 4), new Vector2f(48, 48)));
        obj25_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj25_2);

        GameObject obj26_2 = new GameObject("Object 26", new Transform(new Vector2f(1052, 4), new Vector2f(48, 48)));
        obj26_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj26_2);

        GameObject obj27_2 = new GameObject("Object 27", new Transform(new Vector2f(1100, 4), new Vector2f(48, 48)));
        obj27_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj27_2);

        GameObject obj28_2 = new GameObject("Object 28", new Transform(new Vector2f(1148, 4), new Vector2f(48, 48)));
        obj28_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj28_2);

        GameObject obj29_2 = new GameObject("Object 29", new Transform(new Vector2f(1196, 4), new Vector2f(48, 48)));
        obj29_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj29_2);

        GameObject obj30_2 = new GameObject("Object 30", new Transform(new Vector2f(1244, 4), new Vector2f(48, 48)));
        obj30_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj30_2);

        GameObject obj31_2 = new GameObject("Object 31", new Transform(new Vector2f(1292, 4), new Vector2f(48, 48)));
        obj31_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj31_2);

        GameObject obj32_2 = new GameObject("Object 32", new Transform(new Vector2f(1340, 4), new Vector2f(48, 48)));
        obj32_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj32_2);

        GameObject obj33_2 = new GameObject("Object 33", new Transform(new Vector2f(1388, 4), new Vector2f(48, 48)));
        obj33_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj33_2);

        GameObject obj34_2 = new GameObject("Object 34", new Transform(new Vector2f(1436, 4), new Vector2f(48, 48)));
        obj34_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj34_2);

        GameObject obj35_2 = new GameObject("Object 35", new Transform(new Vector2f(1484, 4), new Vector2f(48, 48)));
        obj35_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj35_2);

        GameObject obj36_2 = new GameObject("Object 36", new Transform(new Vector2f(1532, 4), new Vector2f(48, 48)));
        obj36_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj36_2);

        GameObject obj37_2 = new GameObject("Object 37", new Transform(new Vector2f(1580, 4), new Vector2f(48, 48)));
        obj37_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj37_2);

        GameObject obj38_2 = new GameObject("Object 38", new Transform(new Vector2f(1628, 4), new Vector2f(48, 48)));
        obj38_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj38_2);
    }

    private void loadResources() {
        AssetPool.getShader("assets/shaders/default.glsl");

        AssetPool.addSpritesheet("assets/images/Background.png",
                new Spritesheet(AssetPool.getTexture("assets/images/Background.png"),
                        2048, 1080, 1, 0));
        AssetPool.addSpritesheet("assets/images/Tileset.png",
                new Spritesheet(AssetPool.getTexture("assets/images/Tileset.png"),
                        48, 48, 182, 0));
        AssetPool.addSpritesheet("assets/images/idleknight.png",
                new Spritesheet(AssetPool.getTexture("assets/images/idleknight.png"),
                        64, 64, 15, 0));
        AssetPool.addSpritesheet("assets/images/character/Woodcutter_idle.png",
                new Spritesheet(AssetPool.getTexture("assets/images/character/Woodcutter_idle.png"),
                        40, 40, 4, 0));
        AssetPool.addSpritesheet("assets/images/Tileset_forest.png",
                new Spritesheet(AssetPool.getTexture("assets/images/Tileset_forest.png"),
                        32, 32, 60, 0));
        AssetPool.addSpritesheet("assets/images/tree3.png",
                new Spritesheet(AssetPool.getTexture("assets/images/tree3.png"),
                        199, 183, 1, 0));
        AssetPool.addSpritesheet("assets/images/tree2.png",
                new Spritesheet(AssetPool.getTexture("assets/images/tree2.png"),
                        141, 168, 1, 0));
        AssetPool.addSpritesheet("assets/images/tree1.png",
                new Spritesheet(AssetPool.getTexture("assets/images/tree1.png"),
                        104, 135, 1, 0));
        AssetPool.addSpritesheet("assets/images/object/Trees/1.png",
                new Spritesheet(AssetPool.getTexture("assets/images/object/Trees/1.png"),
                        101, 103, 1, 0));
        AssetPool.addSpritesheet("assets/images/object/Trees/2.png",
                new Spritesheet(AssetPool.getTexture("assets/images/object/Trees/2.png"),
                        104, 135, 1, 0));
        AssetPool.addSpritesheet("assets/images/object/Trees/3.png",
                new Spritesheet(AssetPool.getTexture("assets/images/object/Trees/3.png"),
                        104, 135, 1, 0));
        AssetPool.addSpritesheet("assets/images/object/Ridges/3.png",
                new Spritesheet(AssetPool.getTexture("assets/images/object/Ridges/3.png"),
                        109, 41, 1, 0));
        AssetPool.addSpritesheet("assets/images/Tile_47.png",
                new Spritesheet(AssetPool.getTexture("assets/images/Tile_47.png"),
                        32, 32, 1, 0));
        AssetPool.addSpritesheet("assets/images/Tile_48.png",
                new Spritesheet(AssetPool.getTexture("assets/images/Tile_48.png"),
                        32, 32, 1, 0));
        AssetPool.addSpritesheet("assets/images/object/Grass/2.png",
                new Spritesheet(AssetPool.getTexture("assets/images/object/Grass/2.png"),
                        17, 16, 1, 0));
        AssetPool.addSpritesheet("assets/images/grass_mo.png",
                new Spritesheet(AssetPool.getTexture("assets/images/grass_mo.png"),
                        85, 18, 5, 0));
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