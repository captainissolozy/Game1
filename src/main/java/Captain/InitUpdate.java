package Captain;

import Component.SpriteRenderer;
import Component.Spritesheet;
import Physic2D.primitives.Bounds;
import Physic2D.primitives.BoxBounds;
import org.joml.Vector2f;
import util.AssetPool;

import static org.lwjgl.glfw.GLFW.*;

public class InitUpdate extends Scene {

    public InitUpdate() {

    }

    private Spritesheet sprites0,sprites_town,sprites_crave_new ,kidlesheet ,grass ,background_3 , kwalksheet, sprites_forest, maincharectersheet, background_2, sprites_crave2, treeset, tree2, tree3, tree_dry, tree_dry2, tree_dry3, tree_dry4;
    private GameObject knightidle, knightwalk, maincharecter;
    public BoxBounds playerBounds;

    @Override
    public void init() {
        loadResources();

        this.camera = new Camera(new Vector2f(-250, 0));

        sprites0 = AssetPool.getSpritesheet("assets/images/Background.png");
        background_2 = AssetPool.getSpritesheet("assets/images/Background-2.jpg");
        background_3 = AssetPool.getSpritesheet("assets/images/Background-3.jfif");
        sprites_town = AssetPool.getSpritesheet("assets/images/Tileset_town.png");
        sprites_forest = AssetPool.getSpritesheet("assets/images/Tileset_forest.png");
        kidlesheet = AssetPool.getSpritesheet("assets/images/Slime_Walk.png");
        maincharectersheet = AssetPool.getSpritesheet("assets/images/character/Woodcutter_idle.png");
        treeset = AssetPool.getSpritesheet("assets/images/tree_set.png");
        tree_dry = AssetPool.getSpritesheet("assets/images/object/Trees/1.png");
        tree_dry2 = AssetPool.getSpritesheet("assets/images/object/Trees/2.png");
        tree_dry3 = AssetPool.getSpritesheet("assets/images/object/Trees/3.png");
        tree_dry4 = AssetPool.getSpritesheet("assets/images/object/Ridges/3.png");
        grass = AssetPool.getSpritesheet("assets/images/grass_mo.png");


        //Obj background
        GameObject back1 = new GameObject("Object 1", new Transform(new Vector2f(-250, 0), new Vector2f(1920, 1080)), false, true);
        back1.addComponent(new SpriteRenderer(sprites0.getSprite(0)));
        this.addGameObjectToScene(back1);
        GameObject back2 = new GameObject("Object 1", new Transform(new Vector2f(-250, 1080), new Vector2f(1920, 1080)), false, true);
        back2.addComponent(new SpriteRenderer(background_2.getSprite(0)));
        this.addGameObjectToScene(back2);
        GameObject back3 = new GameObject("Object 1", new Transform(new Vector2f(-250, 2160), new Vector2f(1920, 1080)), false, true);
        back3.addComponent(new SpriteRenderer(background_3.getSprite(0)));
        this.addGameObjectToScene(back3);
//        GameObject back2 = new GameObject("back2", new Transform(new Vector2f(1670, 0), new Vector2f(1920, 1080)));
//        back2.addComponent(new SpriteRenderer(sprites0.getSprite(0)));
//        this.addGameObjectToScene(back2);

        //Obj knight
        knightidle = new GameObject("knightc", new Transform(new Vector2f(-52, 155), new Vector2f(50, 50)), true, false);
        knightidle.addComponent(new SpriteRenderer(kidlesheet.getSprite(0)));
        this.addGameObjectToScene(knightidle);
        playerBounds = new BoxBounds(new Vector2f(50,50));
        knightidle.addComponent(playerBounds);
        //Obj environment
        //Environment Skyblocks
        GameObject obj1_skyblock = new GameObject("Object 1 sky", new Transform(new Vector2f(340, 436), new Vector2f(48, 48)));
        obj1_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(31)));
        this.addGameObjectToScene(obj1_skyblock);

        GameObject obj2_skyblock = new GameObject("Object 2 sky", new Transform(new Vector2f(388, 436), new Vector2f(48, 48)));
        obj2_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(33)));
        this.addGameObjectToScene(obj2_skyblock);

        GameObject obj3_skyblock = new GameObject("Object 3 sky", new Transform(new Vector2f(440, 350), new Vector2f(48, 48)));
        obj3_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(30)));
        this.addGameObjectToScene(obj3_skyblock);

        GameObject obj4_skyblock = new GameObject("Object 4 sky", new Transform(new Vector2f(488, 320), new Vector2f(48, 48)));
        obj4_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj4_skyblock);

        GameObject obj5_skyblock = new GameObject("Object 5 sky", new Transform(new Vector2f(488, 320), new Vector2f(48, 48)));
        obj5_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj5_skyblock);

        GameObject obj6_skyblock = new GameObject("Object 6 sky", new Transform(new Vector2f(540, 400), new Vector2f(48, 48)));
        obj6_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj6_skyblock);

        GameObject obj7_skyblock = new GameObject("Object 7 sky", new Transform(new Vector2f(480, 460), new Vector2f(48, 48)));
        obj7_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj7_skyblock);

        GameObject obj8_skyblock = new GameObject("Object 8 sky", new Transform(new Vector2f(590, 440), new Vector2f(48, 48)));
        obj8_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj8_skyblock);

        GameObject obj9_skyblock = new GameObject("Object 9 sky", new Transform(new Vector2f(90, 600), new Vector2f(48, 48)));
        obj9_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(31)));
        this.addGameObjectToScene(obj9_skyblock);

        GameObject obj10_skyblock = new GameObject("Object 10 sky", new Transform(new Vector2f(138, 600), new Vector2f(48, 48)));
        obj10_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj10_skyblock);

        GameObject obj11_skyblock = new GameObject("Object 11 sky", new Transform(new Vector2f(186, 600), new Vector2f(48, 48)));
        obj11_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(33)));
        this.addGameObjectToScene(obj11_skyblock);

        GameObject obj41_skyblock = new GameObject("Object 41 sky", new Transform(new Vector2f(400, 650), new Vector2f(48, 48)));
        obj41_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(30)));
        this.addGameObjectToScene(obj41_skyblock);

        GameObject obj42_skyblock = new GameObject("Object 42 sky", new Transform(new Vector2f(300, 620), new Vector2f(48, 48)));
        obj42_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj42_skyblock);

        GameObject obj43_skyblock = new GameObject("Object 43 sky", new Transform(new Vector2f(448, 650), new Vector2f(48, 48)));
        obj43_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj43_skyblock);

        GameObject obj44_skyblock = new GameObject("Object 44 sky", new Transform(new Vector2f(530, 690), new Vector2f(48, 48)));
        obj44_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj44_skyblock);

        GameObject obj12_skyblock = new GameObject("Object 12 sky", new Transform(new Vector2f(240, 460), new Vector2f(48, 48)));
        obj12_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj12_skyblock);

        GameObject obj13_skyblock = new GameObject("Object 13 sky", new Transform(new Vector2f(160, 410), new Vector2f(48, 48)));
        obj13_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj13_skyblock);

        GameObject obj14_skyblock = new GameObject("Object 14 sky", new Transform(new Vector2f(80, 460), new Vector2f(48, 48)));
        obj14_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj14_skyblock);

        GameObject obj15_skyblock = new GameObject("Object 15 sky", new Transform(new Vector2f(0, 500), new Vector2f(48, 48)));
        obj15_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj15_skyblock);

        GameObject obj16_skyblock = new GameObject("Object 16 sky", new Transform(new Vector2f(-196, 532), new Vector2f(48, 48)));
        obj16_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(42)));
        this.addGameObjectToScene(obj16_skyblock);

        GameObject obj17_skyblock = new GameObject("Object 17 sky", new Transform(new Vector2f(-148, 532), new Vector2f(48, 48)));
        obj17_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj17_skyblock);

        GameObject obj19_skyblock = new GameObject("Object 19 sky", new Transform(new Vector2f(-100, 532), new Vector2f(48, 48)));
        obj19_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(33)));
        this.addGameObjectToScene(obj19_skyblock);

        GameObject obj18_skyblock = new GameObject("Object 18 sky", new Transform(new Vector2f(-196, 484), new Vector2f(48, 48)));
        obj18_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(60)));
        this.addGameObjectToScene(obj18_skyblock);

        GameObject tree_sky = new GameObject("Object tree sky", new Transform(new Vector2f(-220, 580), new Vector2f(199, 199)), false, true);
        tree_sky.addComponent(new SpriteRenderer(treeset.getSprite(1)));
        this.addGameObjectToScene(tree_sky);

        GameObject obj20_skyblock = new GameObject("Object 20 sky", new Transform(new Vector2f(0, 600), new Vector2f(48, 48)));
        obj20_skyblock.addComponent(new SpriteRenderer (sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj20_skyblock);

        GameObject obj21_skyblock = new GameObject("Object 21 sky", new Transform(new Vector2f(-148, 580), new Vector2f(48, 48)));
        obj21_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj21_skyblock);

        GameObject obj22_skyblock = new GameObject("Object 22 sky", new Transform(new Vector2f(-100, 630), new Vector2f(48, 48)));
        obj22_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj22_skyblock);

        GameObject obj23_skyblock = new GameObject("Object 23 sky", new Transform(new Vector2f(570, 700), new Vector2f(48, 48)));
        obj23_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(31)));
        this.addGameObjectToScene(obj23_skyblock);

        GameObject obj24_skyblock = new GameObject("Object 24 sky", new Transform(new Vector2f(618, 700), new Vector2f(48, 48)));
        obj24_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(22)));
        this.addGameObjectToScene(obj24_skyblock);

        GameObject obj25_skyblock = new GameObject("Object 25 sky", new Transform(new Vector2f(618, 748), new Vector2f(48, 48)));
        obj25_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(53)));
        this.addGameObjectToScene(obj25_skyblock);

        GameObject obj26_skyblock = new GameObject("Object 26 sky", new Transform(new Vector2f(666, 748), new Vector2f(48, 48)));
        obj26_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(58)));
        this.addGameObjectToScene(obj26_skyblock);

        GameObject obj27_skyblock = new GameObject("Object 27 sky", new Transform(new Vector2f(810, 748), new Vector2f(48, 48)));
        obj27_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj27_skyblock);

        GameObject obj28_skyblock = new GameObject("Object 28 sky", new Transform(new Vector2f(762, 748), new Vector2f(48, 48)));
        obj28_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(6)));
        this.addGameObjectToScene(obj28_skyblock);

        GameObject obj29_skyblock = new GameObject("Object 29 sky", new Transform(new Vector2f(858, 748), new Vector2f(48, 48)));
        obj29_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj29_skyblock);

        GameObject obj31_skyblock = new GameObject("Object 31 sky", new Transform(new Vector2f(906, 748), new Vector2f(48, 48)));
        obj31_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(58)));
        this.addGameObjectToScene(obj31_skyblock);

        GameObject obj39_skyblock = new GameObject("Object 39 sky", new Transform(new Vector2f(964, 770), new Vector2f(48, 48)));
        obj39_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj39_skyblock);

        GameObject obj30_skyblock = new GameObject("Object 30 sky", new Transform(new Vector2f(1060, 800), new Vector2f(48, 48)));
        obj30_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj30_skyblock);

        GameObject obj32_skyblock = new GameObject("Object 32 sky", new Transform(new Vector2f(1108, 800), new Vector2f(48, 48)));
        obj32_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj32_skyblock);

        GameObject obj33_skyblock = new GameObject("Object 33 sky", new Transform(new Vector2f(1156, 800), new Vector2f(48, 48)));
        obj33_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj33_skyblock);

        GameObject obj40_skyblock = new GameObject("Object 40 sky", new Transform(new Vector2f(1240, 820), new Vector2f(48, 48)));
        obj40_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj40_skyblock);

        GameObject obj34_skyblock = new GameObject("Object 34 sky", new Transform(new Vector2f(1300, 850), new Vector2f(48, 48)));
        obj34_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj34_skyblock);

        GameObject obj35_skyblock = new GameObject("Object 35 sky", new Transform(new Vector2f(1390, 830), new Vector2f(48, 48)));
        obj35_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj35_skyblock);

        GameObject obj36_skyblock = new GameObject("Object 36 sky", new Transform(new Vector2f(1484, 868), new Vector2f(48, 48)));
        obj36_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj36_skyblock);

        GameObject obj37_skyblock = new GameObject("Object 37 sky", new Transform(new Vector2f(1532, 868), new Vector2f(48, 48)));
        obj37_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj37_skyblock);

        GameObject obj38_skyblock = new GameObject("Object 38 sky", new Transform(new Vector2f(1436, 868), new Vector2f(48, 48)));
        obj38_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(48)));
        this.addGameObjectToScene(obj38_skyblock);

        GameObject obj203_skyblock = new GameObject("Object 38 sky", new Transform(new Vector2f(1390, 920), new Vector2f(48, 48)));
        obj203_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj203_skyblock);

        GameObject obj204_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1480, 890), new Vector2f(48, 48)));
        obj204_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj204_skyblock);

        GameObject obj205_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1236, 1030), new Vector2f(48, 48)));
        obj205_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(114)));
        this.addGameObjectToScene(obj205_skyblock);

        GameObject obj206_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1284, 1030), new Vector2f(48, 48)));
        obj206_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(116)));
        this.addGameObjectToScene(obj206_skyblock);

        GameObject obj207_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1332, 1030), new Vector2f(48, 48)));
        obj207_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(115)));
        this.addGameObjectToScene(obj207_skyblock);

        GameObject obj208_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1480, 960), new Vector2f(48, 48)));
        obj208_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj208_skyblock);

        GameObject obj209_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1390, 1000), new Vector2f(48, 48)));
        obj209_skyblock.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj209_skyblock);

        GameObject obj210_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1150, 1090), new Vector2f(48, 48)));
        obj210_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj210_skyblock);

        GameObject obj211_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1200, 1140), new Vector2f(48, 48)));
        obj211_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj211_skyblock);

        GameObject obj212_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1095, 1120), new Vector2f(48, 48)));
        obj212_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj212_skyblock);

        GameObject obj213_skyblock = new GameObject("Object sky", new Transform(new Vector2f(48, 1396), new Vector2f(48, 48)));
        obj213_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj213_skyblock);

        GameObject obj214_skyblock = new GameObject("Object sky", new Transform(new Vector2f(96, 1396), new Vector2f(48, 48)));
        obj214_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(97)));
        this.addGameObjectToScene(obj214_skyblock);

        GameObject obj215_skyblock = new GameObject("Object sky", new Transform(new Vector2f(144, 1396), new Vector2f(48, 48)));
        obj215_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj215_skyblock);

        GameObject obj216_skyblock = new GameObject("Object sky", new Transform(new Vector2f(192, 1396), new Vector2f(48, 48)));
        obj216_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(97)));
        this.addGameObjectToScene(obj216_skyblock);

        GameObject obj217_skyblock = new GameObject("Object sky", new Transform(new Vector2f(240, 1396), new Vector2f(48, 48)));
        obj217_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj217_skyblock);

        GameObject obj218_skyblock = new GameObject("Object sky", new Transform(new Vector2f(288, 1396), new Vector2f(48, 48)));
        obj218_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj218_skyblock);

        GameObject obj219_skyblock = new GameObject("Object sky", new Transform(new Vector2f(336, 1396), new Vector2f(48, 48)));
        obj219_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj219_skyblock);

        GameObject obj220_skyblock = new GameObject("Object sky", new Transform(new Vector2f(384, 1396), new Vector2f(48, 48)));
        obj220_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(97)));
        this.addGameObjectToScene(obj220_skyblock);

        GameObject obj221_skyblock = new GameObject("Object sky", new Transform(new Vector2f(432, 1396), new Vector2f(48, 48)));
        obj221_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj221_skyblock);

        GameObject obj222_skyblock = new GameObject("Object sky", new Transform(new Vector2f(480, 1396), new Vector2f(48, 48)));
        obj222_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj222_skyblock);

        GameObject obj223_skyblock = new GameObject("Object sky", new Transform(new Vector2f(528, 1396), new Vector2f(48, 48)));
        obj223_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj223_skyblock);

        GameObject obj224_skyblock = new GameObject("Object sky", new Transform(new Vector2f(576, 1396), new Vector2f(48, 48)));
        obj224_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(97)));
        this.addGameObjectToScene(obj224_skyblock);

        GameObject obj225_skyblock = new GameObject("Object sky", new Transform(new Vector2f(624, 1396), new Vector2f(48, 48)));
        obj225_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj225_skyblock);

        GameObject obj226_skyblock = new GameObject("Object sky", new Transform(new Vector2f(672, 1396), new Vector2f(48, 48)));
        obj226_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj226_skyblock);

        GameObject obj227_skyblock = new GameObject("Object sky", new Transform(new Vector2f(720, 1396), new Vector2f(48, 48)));
        obj227_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj227_skyblock);

        GameObject obj228_skyblock = new GameObject("Object sky", new Transform(new Vector2f(768, 1396), new Vector2f(48, 48)));
        obj228_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj228_skyblock);

        GameObject obj229_skyblock = new GameObject("Object sky", new Transform(new Vector2f(816, 1396), new Vector2f(48, 48)));
        obj229_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(97)));
        this.addGameObjectToScene(obj229_skyblock);

        GameObject obj230_skyblock = new GameObject("Object sky", new Transform(new Vector2f(864, 1396), new Vector2f(48, 48)));
        obj230_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj230_skyblock);

        GameObject obj231_skyblock = new GameObject("Object sky", new Transform(new Vector2f(912, 1396), new Vector2f(48, 48)));
        obj231_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj231_skyblock);

        GameObject obj232_skyblock = new GameObject("Object sky", new Transform(new Vector2f(960, 1396), new Vector2f(48, 48)));
        obj232_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(97)));
        this.addGameObjectToScene(obj232_skyblock);

        GameObject obj233_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1008, 1396), new Vector2f(48, 48)));
        obj233_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj233_skyblock);

        GameObject obj234_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1056, 1396), new Vector2f(48, 48)));
        obj234_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj234_skyblock);

        GameObject obj235_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1104, 1396), new Vector2f(48, 48)));
        obj235_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj235_skyblock);

        GameObject obj236_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1152, 1396), new Vector2f(48, 48)));
        obj236_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj236_skyblock);

        GameObject obj237_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1200, 1396), new Vector2f(48, 48)));
        obj237_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj237_skyblock);

        GameObject obj238_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1248, 1396), new Vector2f(48, 48)));
        obj238_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(97)));
        this.addGameObjectToScene(obj238_skyblock);

        GameObject obj239_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1296, 1396), new Vector2f(48, 48)));
        obj239_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj239_skyblock);

        GameObject obj240_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1344, 1396), new Vector2f(48, 48)));
        obj240_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj240_skyblock);

        GameObject obj241_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1392, 1396), new Vector2f(48, 48)));
        obj241_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj241_skyblock);

        GameObject obj242_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1440, 1396), new Vector2f(48, 48)));
        obj242_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj242_skyblock);

        GameObject obj243_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1488, 1396), new Vector2f(48, 48)));
        obj243_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj243_skyblock);

        GameObject obj244_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1536, 1396), new Vector2f(48, 48)));
        obj244_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj244_skyblock);

        GameObject obj245_skyblock = new GameObject("Object sky", new Transform(new Vector2f(48, 1444), new Vector2f(48, 48)));
        obj245_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(97)));
        this.addGameObjectToScene(obj245_skyblock);

        GameObject obj246_skyblock = new GameObject("Object sky", new Transform(new Vector2f(96, 1444), new Vector2f(48, 48)));
        obj246_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj246_skyblock);

        GameObject obj247_skyblock = new GameObject("Object sky", new Transform(new Vector2f(144, 1444), new Vector2f(48, 48)));
        obj247_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj247_skyblock);

        GameObject obj248_skyblock = new GameObject("Object sky", new Transform(new Vector2f(192, 1444), new Vector2f(48, 48)));
        obj248_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj248_skyblock);

        GameObject obj249_skyblock = new GameObject("Object sky", new Transform(new Vector2f(240, 1444), new Vector2f(48, 48)));
        obj249_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj249_skyblock);

        GameObject obj250_skyblock = new GameObject("Object sky", new Transform(new Vector2f(288, 1444), new Vector2f(48, 48)));
        obj250_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj250_skyblock);

        GameObject obj251_skyblock = new GameObject("Object sky", new Transform(new Vector2f(336, 1444), new Vector2f(48, 48)));
        obj251_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj251_skyblock);

        GameObject obj252_skyblock = new GameObject("Object sky", new Transform(new Vector2f(384, 1444), new Vector2f(48, 48)));
        obj252_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj252_skyblock);

        GameObject obj253_skyblock = new GameObject("Object sky", new Transform(new Vector2f(432, 1444), new Vector2f(48, 48)));
        obj253_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj253_skyblock);

        GameObject obj254_skyblock = new GameObject("Object sky", new Transform(new Vector2f(480, 1444), new Vector2f(48, 48)));
        obj254_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj254_skyblock);

        GameObject obj255_skyblock = new GameObject("Object sky", new Transform(new Vector2f(528, 1444), new Vector2f(48, 48)));
        obj255_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(97)));
        this.addGameObjectToScene(obj255_skyblock);

        GameObject obj256_skyblock = new GameObject("Object sky", new Transform(new Vector2f(576, 1444), new Vector2f(48, 48)));
        obj256_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj256_skyblock);

        GameObject obj257_skyblock = new GameObject("Object sky", new Transform(new Vector2f(624, 1444), new Vector2f(48, 48)));
        obj257_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj257_skyblock);

        GameObject obj258_skyblock = new GameObject("Object sky", new Transform(new Vector2f(672, 1444), new Vector2f(48, 48)));
        obj258_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(83)));
        this.addGameObjectToScene(obj258_skyblock);

        GameObject obj259_skyblock = new GameObject("Object sky", new Transform(new Vector2f(720, 1444), new Vector2f(48, 48)));
        obj259_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(97)));
        this.addGameObjectToScene(obj259_skyblock);

        GameObject obj260_skyblock = new GameObject("Object sky", new Transform(new Vector2f(768, 1444), new Vector2f(48, 48)));
        obj260_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(111)));
        this.addGameObjectToScene(obj260_skyblock);

        GameObject obj261_skyblock = new GameObject("Object sky", new Transform(new Vector2f(816, 1444), new Vector2f(48, 48)));
        obj261_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj261_skyblock);

        GameObject obj262_skyblock = new GameObject("Object sky", new Transform(new Vector2f(864, 1444), new Vector2f(48, 48)));
        obj262_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj262_skyblock);

        GameObject obj263_skyblock = new GameObject("Object sky", new Transform(new Vector2f(912, 1444), new Vector2f(48, 48)));
        obj263_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj263_skyblock);

        GameObject obj264_skyblock = new GameObject("Object sky", new Transform(new Vector2f(960, 1444), new Vector2f(48, 48)));
        obj264_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj264_skyblock);

        GameObject obj265_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1008, 1444), new Vector2f(48, 48)));
        obj265_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj265_skyblock);

        GameObject obj266_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1056, 1444), new Vector2f(48, 48)));
        obj266_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj266_skyblock);

        GameObject obj267_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1104, 1444), new Vector2f(48, 48)));
        obj267_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj267_skyblock);

        GameObject obj268_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1056, 1444), new Vector2f(48, 48)));
        obj268_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj268_skyblock);

        GameObject obj269_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1104, 1444), new Vector2f(48, 48)));
        obj269_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj269_skyblock);

        GameObject obj270_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1152, 1444), new Vector2f(48, 48)));
        obj270_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj270_skyblock);

        GameObject obj271_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1200, 1444), new Vector2f(48, 48)));
        obj271_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj271_skyblock);

        GameObject obj272_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1248, 1444), new Vector2f(48, 48)));
        obj272_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj272_skyblock);

        GameObject obj273_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1296, 1444), new Vector2f(48, 48)));
        obj273_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj273_skyblock);

        GameObject obj274_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1344, 1444), new Vector2f(48, 48)));
        obj274_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj274_skyblock);

        GameObject obj275_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1392, 1444), new Vector2f(48, 48)));
        obj275_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj275_skyblock);

        GameObject obj276_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1440, 1444), new Vector2f(48, 48)));
        obj276_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj276_skyblock);

        GameObject obj277_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1488, 1444), new Vector2f(48, 48)));
        obj277_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj277_skyblock);

        GameObject obj278_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1536, 1444), new Vector2f(48, 48)));
        obj278_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj278_skyblock);

        GameObject obj279_skyblock = new GameObject("Object sky", new Transform(new Vector2f(48, 1492), new Vector2f(48, 48)));
        obj279_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj279_skyblock);

        GameObject obj280_skyblock = new GameObject("Object sky", new Transform(new Vector2f(96, 1492), new Vector2f(48, 48)));
        obj280_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj280_skyblock);

        GameObject obj281_skyblock = new GameObject("Object sky", new Transform(new Vector2f(144, 1492), new Vector2f(48, 48)));
        obj281_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj281_skyblock);

        GameObject obj282_skyblock = new GameObject("Object sky", new Transform(new Vector2f(192, 1492), new Vector2f(48, 48)));
        obj282_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj282_skyblock);

        GameObject obj283_skyblock = new GameObject("Object sky", new Transform(new Vector2f(240, 1492), new Vector2f(48, 48)));
        obj283_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj283_skyblock);

        GameObject obj284_skyblock = new GameObject("Object sky", new Transform(new Vector2f(288, 1492), new Vector2f(48, 48)));
        obj284_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj284_skyblock);

        GameObject obj285_skyblock = new GameObject("Object sky", new Transform(new Vector2f(336, 1492), new Vector2f(48, 48)));
        obj285_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj285_skyblock);

        GameObject obj286_skyblock = new GameObject("Object sky", new Transform(new Vector2f(384, 1492), new Vector2f(48, 48)));
        obj286_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj286_skyblock);

        GameObject obj287_skyblock = new GameObject("Object sky", new Transform(new Vector2f(432, 1492), new Vector2f(48, 48)));
        obj287_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj287_skyblock);

        GameObject obj288_skyblock = new GameObject("Object sky", new Transform(new Vector2f(480, 1492), new Vector2f(48, 48)));
        obj288_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj288_skyblock);

        GameObject obj289_skyblock = new GameObject("Object sky", new Transform(new Vector2f(528, 1492), new Vector2f(48, 48)));
        obj289_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj289_skyblock);

        GameObject obj290_skyblock = new GameObject("Object sky", new Transform(new Vector2f(576, 1492), new Vector2f(48, 48)));
        obj290_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj290_skyblock);

        GameObject obj291_skyblock = new GameObject("Object sky", new Transform(new Vector2f(624, 1492), new Vector2f(48, 48)));
        obj291_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj291_skyblock);

        GameObject obj292_skyblock = new GameObject("Object sky", new Transform(new Vector2f(672, 1492), new Vector2f(48, 48)));
        obj292_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj292_skyblock);

        GameObject obj293_skyblock = new GameObject("Object sky", new Transform(new Vector2f(720, 1492), new Vector2f(48, 48)));
        obj293_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj293_skyblock);

        GameObject obj294_skyblock = new GameObject("Object sky", new Transform(new Vector2f(768, 1492), new Vector2f(48, 48)));
        obj294_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(0)));
        this.addGameObjectToScene(obj294_skyblock);

        GameObject obj295_skyblock = new GameObject("Object sky", new Transform(new Vector2f(816, 1492), new Vector2f(48, 48)));
        obj295_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj295_skyblock);

        GameObject obj296_skyblock = new GameObject("Object sky", new Transform(new Vector2f(864, 1492), new Vector2f(48, 48)));
        obj296_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj296_skyblock);

        GameObject obj297_skyblock = new GameObject("Object sky", new Transform(new Vector2f(912, 1492), new Vector2f(48, 48)));
        obj297_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj297_skyblock);

        GameObject obj298_skyblock = new GameObject("Object sky", new Transform(new Vector2f(960, 1492), new Vector2f(48, 48)));
        obj298_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj298_skyblock);

        GameObject obj299_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1008, 1492), new Vector2f(48, 48)));
        obj299_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj299_skyblock);

        GameObject obj300_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1056, 1492), new Vector2f(48, 48)));
        obj300_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj300_skyblock);

        GameObject obj301_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1104, 1492), new Vector2f(48, 48)));
        obj301_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj301_skyblock);

        GameObject obj302_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1152, 1492), new Vector2f(48, 48)));
        obj302_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj302_skyblock);

        GameObject obj303_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1200, 1492), new Vector2f(48, 48)));
        obj303_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj303_skyblock);

        GameObject obj304_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1248, 1492), new Vector2f(48, 48)));
        obj304_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj304_skyblock);

        GameObject obj305_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1296, 1492), new Vector2f(48, 48)));
        obj305_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj305_skyblock);

        GameObject obj306_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1344, 1492), new Vector2f(48, 48)));
        obj306_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj306_skyblock);

        GameObject obj307_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1392, 1492), new Vector2f(48, 48)));
        obj307_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj307_skyblock);

        GameObject obj308_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1440, 1492), new Vector2f(48, 48)));
        obj308_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj308_skyblock);

        GameObject obj309_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1488, 1492), new Vector2f(48, 48)));
        obj309_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj309_skyblock);

        GameObject obj310_skyblock = new GameObject("Object sky", new Transform(new Vector2f(1536, 1492), new Vector2f(48, 48)));
        obj310_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(34)));
        this.addGameObjectToScene(obj310_skyblock);

        GameObject obj311_skyblock = new GameObject("Object sky", new Transform(new Vector2f(48, 1530), new Vector2f(48, 48)));
        obj311_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj311_skyblock);

        GameObject obj312_skyblock = new GameObject("Object sky", new Transform(new Vector2f(96, 1530), new Vector2f(48, 48)));
        obj312_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj312_skyblock);

        GameObject obj313_skyblock = new GameObject("Object sky", new Transform(new Vector2f(144, 1530), new Vector2f(48, 48)));
        obj313_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj313_skyblock);

        GameObject obj314_skyblock = new GameObject("Object sky", new Transform(new Vector2f(192, 1530), new Vector2f(48, 48)));
        obj314_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj314_skyblock);

        GameObject obj315_skyblock = new GameObject("Object sky", new Transform(new Vector2f(240, 1530), new Vector2f(48, 48)));
        obj315_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj315_skyblock);

        GameObject obj316_skyblock = new GameObject("Object sky", new Transform(new Vector2f(288, 1530), new Vector2f(48, 48)));
        obj316_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj316_skyblock);

        GameObject obj317_skyblock = new GameObject("Object sky", new Transform(new Vector2f(336, 1530), new Vector2f(48, 48)));
        obj317_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj317_skyblock);

        GameObject obj318_skyblock = new GameObject("Object sky", new Transform(new Vector2f(384, 1530), new Vector2f(48, 48)));
        obj318_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj318_skyblock);

        GameObject obj319_skyblock = new GameObject("Object sky", new Transform(new Vector2f(432, 1530), new Vector2f(48, 48)));
        obj319_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj319_skyblock);

        GameObject obj320_skyblock = new GameObject("Object sky", new Transform(new Vector2f(480, 1530), new Vector2f(48, 48)));
        obj320_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj320_skyblock);

        GameObject obj321_skyblock = new GameObject("Object sky", new Transform(new Vector2f(528, 1530), new Vector2f(48, 48)));
        obj321_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj321_skyblock);

        GameObject obj322_skyblock = new GameObject("Object sky", new Transform(new Vector2f(576, 1530), new Vector2f(48, 48)));
        obj322_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj322_skyblock);

        GameObject obj323_skyblock = new GameObject("Object sky", new Transform(new Vector2f(624, 1530), new Vector2f(48, 48)));
        obj323_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj323_skyblock);

        GameObject obj324_skyblock = new GameObject("Object sky", new Transform(new Vector2f(672, 1530), new Vector2f(48, 48)));
        obj324_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj324_skyblock);

        GameObject obj325_skyblock = new GameObject("Object sky", new Transform(new Vector2f(720, 1530), new Vector2f(48, 48)));
        obj325_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj325_skyblock);

        GameObject obj326_skyblock = new GameObject("Object sky", new Transform(new Vector2f(768, 1530), new Vector2f(48, 48)));
        obj326_skyblock.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj326_skyblock);
        //top floor
        GameObject obj1_sky = new GameObject("Object 1 sky", new Transform(new Vector2f(-292, 148), new Vector2f(48, 48)));
        obj1_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj1_sky);

        GameObject obj2_sky = new GameObject("Object 2 sky", new Transform(new Vector2f(-244, 148), new Vector2f(48, 48)));
        obj2_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj2_sky);

        GameObject obj3_sky = new GameObject("Object 3 sky", new Transform(new Vector2f(-292, 196), new Vector2f(48, 48)));
        obj3_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj3_sky);

        GameObject obj4_sky = new GameObject("Object 4 sky", new Transform(new Vector2f(-244, 196), new Vector2f(48, 48)));
        obj4_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj4_sky);

        GameObject obj5_sky = new GameObject("Object 5 sky", new Transform(new Vector2f(-292, 244), new Vector2f(48, 48)));
        obj5_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj5_sky);

        GameObject obj6_sky = new GameObject("Object 6 sky", new Transform(new Vector2f(-244, 244), new Vector2f(48, 48)));
        obj6_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj6_sky);

        GameObject obj7_sky = new GameObject("Object 7 sky", new Transform(new Vector2f(-292, 292), new Vector2f(48, 48)));
        obj7_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj7_sky);

        GameObject obj8_sky = new GameObject("Object 8 sky", new Transform(new Vector2f(-244, 292), new Vector2f(48, 48)));
        obj8_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj8_sky);

        GameObject obj9_sky = new GameObject("Object 9 sky", new Transform(new Vector2f(-292, 340), new Vector2f(48, 48)));
        obj9_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj9_sky);

        GameObject obj10_sky = new GameObject("Object 10 sky", new Transform(new Vector2f(-244, 340), new Vector2f(48, 48)));
        obj10_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj10_sky);

        GameObject obj11_sky = new GameObject("Object 11 sky", new Transform(new Vector2f(-292, 388), new Vector2f(48, 48)));
        obj11_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj11_sky);

        GameObject obj12_sky = new GameObject("Object 12 sky", new Transform(new Vector2f(-244, 388), new Vector2f(48, 48)));
        obj12_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj12_sky);

        GameObject obj13_sky = new GameObject("Object 13 sky", new Transform(new Vector2f(-292, 436), new Vector2f(48, 48)));
        obj13_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj13_sky);

        GameObject obj14_sky = new GameObject("Object 14 sky", new Transform(new Vector2f(-244, 436), new Vector2f(48, 48)));
        obj14_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj14_sky);

        GameObject obj15_sky = new GameObject("Object 15 sky", new Transform(new Vector2f(-292, 484), new Vector2f(48, 48)));
        obj15_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj15_sky);

        GameObject obj16_sky = new GameObject("Object 16 sky", new Transform(new Vector2f(-244, 484), new Vector2f(48, 48)));
        obj16_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(3)));
        this.addGameObjectToScene(obj16_sky);

        GameObject obj17_sky = new GameObject("Object 17 sky", new Transform(new Vector2f(-292, 532), new Vector2f(48, 48)));
        obj17_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj17_sky);

        GameObject obj18_sky = new GameObject("Object 18 sky", new Transform(new Vector2f(-244, 532), new Vector2f(48, 48)));
        obj18_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(23)));
        this.addGameObjectToScene(obj18_sky);

        GameObject obj19_sky = new GameObject("Object 19 sky", new Transform(new Vector2f(-292, 580), new Vector2f(48, 48)));
        obj19_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj19_sky);

        GameObject obj20_sky = new GameObject("Object 20 sky", new Transform(new Vector2f(-244, 580), new Vector2f(48, 48)));
        obj20_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj20_sky);

        GameObject obj21_sky = new GameObject("Object 21 sky", new Transform(new Vector2f(-292, 628), new Vector2f(48, 48)));
        obj21_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj21_sky);

        GameObject obj22_sky = new GameObject("Object 22 sky", new Transform(new Vector2f(-244, 628), new Vector2f(48, 48)));
        obj22_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj22_sky);

        GameObject obj23_sky = new GameObject("Object 23 sky", new Transform(new Vector2f(-292, 676), new Vector2f(48, 48)));
        obj23_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj23_sky);

        GameObject obj24_sky = new GameObject("Object 24 sky", new Transform(new Vector2f(-244, 676), new Vector2f(48, 48)));
        obj24_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj24_sky);

        GameObject obj25_sky = new GameObject("Object 25 sky", new Transform(new Vector2f(-292, 724), new Vector2f(48, 48)));
        obj25_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj25_sky);

        GameObject obj26_sky = new GameObject("Object 26 sky", new Transform(new Vector2f(-244, 724), new Vector2f(48, 48)));
        obj26_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj26_sky);

        GameObject obj27_sky = new GameObject("Object 27 sky", new Transform(new Vector2f(-292, 772), new Vector2f(48, 48)));
        obj27_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj27_sky);

        GameObject obj28_sky = new GameObject("Object 28 sky", new Transform(new Vector2f(-244, 772), new Vector2f(48, 48)));
        obj28_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj28_sky);

        GameObject obj29_sky = new GameObject("Object 29 sky", new Transform(new Vector2f(-292, 820), new Vector2f(48, 48)));
        obj29_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj29_sky);

        GameObject obj30_sky = new GameObject("Object 30 sky", new Transform(new Vector2f(-244, 820), new Vector2f(48, 48)));
        obj30_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj30_sky);

        GameObject obj31_sky = new GameObject("Object 31 sky", new Transform(new Vector2f(-292, 868), new Vector2f(48, 48)));
        obj31_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj31_sky);

        GameObject obj32_sky = new GameObject("Object 32 sky", new Transform(new Vector2f(-244, 868), new Vector2f(48, 48)));
        obj32_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj32_sky);

        GameObject obj33_sky = new GameObject("Object 33 sky", new Transform(new Vector2f(-292, 916), new Vector2f(48, 48)));
        obj33_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj33_sky);

        GameObject obj34_sky = new GameObject("Object 34 sky", new Transform(new Vector2f(-244, 916), new Vector2f(48, 48)));
        obj34_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj34_sky);

        GameObject obj35_sky = new GameObject("Object 35 sky", new Transform(new Vector2f(-292, 964), new Vector2f(48, 48)));
        obj35_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj35_sky);

        GameObject obj36_sky = new GameObject("Object 36 sky", new Transform(new Vector2f(-244, 964), new Vector2f(48, 48)));
        obj36_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj36_sky);

        GameObject obj37_sky = new GameObject("Object 37 sky", new Transform(new Vector2f(-292, 1012), new Vector2f(48, 48)));
        obj37_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj37_sky);

        GameObject obj38_sky = new GameObject("Object 38 sky", new Transform(new Vector2f(-244, 1012), new Vector2f(48, 48)));
        obj38_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj38_sky);

        GameObject obj37_sky_2 = new GameObject("Object 37 sky", new Transform(new Vector2f(-292, 1012), new Vector2f(48, 48)));
        obj37_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj37_sky_2);

        GameObject obj38_sky_2 = new GameObject("Object 38 sky", new Transform(new Vector2f(-244, 1012), new Vector2f(48, 48)));
        obj38_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj38_sky_2);

        GameObject obj39_sky = new GameObject("Object 39 sky", new Transform(new Vector2f(-292, 1060), new Vector2f(48, 48)));
        obj39_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(24)));
        this.addGameObjectToScene(obj39_sky);

        GameObject obj40_sky = new GameObject("Object 40 sky", new Transform(new Vector2f(-244, 1060), new Vector2f(48, 48)));
        obj40_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(24)));
        this.addGameObjectToScene(obj40_sky);

        GameObject obj81_sky = new GameObject("Object sky", new Transform(new Vector2f(-196, 1060), new Vector2f(48, 48)));
        obj81_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj81_sky);

        GameObject obj81_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(-196, 1012), new Vector2f(48, 48)));
        obj81_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj81_sky_2);

        GameObject obj82_sky = new GameObject("Object sky", new Transform(new Vector2f(-148, 1060), new Vector2f(48, 48)));
        obj82_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(80)));
        this.addGameObjectToScene(obj82_sky);

        GameObject obj82_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(-148, 1012), new Vector2f(48, 48)));
        obj82_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj82_sky_2);

        GameObject obj83_sky = new GameObject("Object sky", new Transform(new Vector2f(-100, 1060), new Vector2f(48, 48)));
        obj83_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj83_sky);

        GameObject obj83_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(-100, 1012), new Vector2f(48, 48)));
        obj83_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj83_sky_2);

        GameObject obj84_sky = new GameObject("Object sky", new Transform(new Vector2f(-52, 1060), new Vector2f(48, 48)));
        obj84_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(80)));
        this.addGameObjectToScene(obj84_sky);

        GameObject obj84_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(-52, 1012), new Vector2f(48, 48)));
        obj84_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj84_sky_2);

        GameObject obj85_sky = new GameObject("Object sky", new Transform(new Vector2f(-4, 1060), new Vector2f(48, 48)));
        obj85_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj85_sky);

        GameObject obj85_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(-4, 1012), new Vector2f(48, 48)));
        obj85_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj85_sky_2);

        GameObject obj86_sky = new GameObject("Object sky", new Transform(new Vector2f(44, 1060), new Vector2f(48, 48)));
        obj86_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj86_sky);

        GameObject obj86_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(44, 1012), new Vector2f(48, 48)));
        obj86_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj86_sky_2);

        GameObject obj87_sky = new GameObject("Object sky", new Transform(new Vector2f(92, 1060), new Vector2f(48, 48)));
        obj87_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(80)));
        this.addGameObjectToScene(obj87_sky);

        GameObject obj87_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(92, 1012), new Vector2f(48, 48)));
        obj87_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj87_sky_2);

        GameObject obj88_sky = new GameObject("Object sky", new Transform(new Vector2f(140, 1060), new Vector2f(48, 48)));
        obj88_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(80)));
        this.addGameObjectToScene(obj88_sky);

        GameObject obj88_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(140, 1012), new Vector2f(48, 48)));
        obj88_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj88_sky_2);

        GameObject obj89_sky = new GameObject("Object sky", new Transform(new Vector2f(188, 1060), new Vector2f(48, 48)));
        obj89_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj89_sky);

        GameObject obj89_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(188, 1012), new Vector2f(48, 48)));
        obj89_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj89_sky_2);

        GameObject obj90_sky = new GameObject("Object sky", new Transform(new Vector2f(236, 1060), new Vector2f(48, 48)));
        obj90_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(80)));
        this.addGameObjectToScene(obj90_sky);

        GameObject obj90_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(236, 1012), new Vector2f(48, 48)));
        obj90_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj90_sky_2);

        GameObject obj91_sky = new GameObject("Object sky", new Transform(new Vector2f(284, 1060), new Vector2f(48, 48)));
        obj91_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(80)));
        this.addGameObjectToScene(obj91_sky);

        GameObject obj91_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(284, 1012), new Vector2f(48, 48)));
        obj91_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj91_sky_2);

        GameObject obj92_sky = new GameObject("Object sky", new Transform(new Vector2f(332, 1060), new Vector2f(48, 48)));
        obj92_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj92_sky);

        GameObject obj92_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(332, 1012), new Vector2f(48, 48)));
        obj92_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj92_sky_2);

        GameObject obj93_sky = new GameObject("Object sky", new Transform(new Vector2f(380, 1060), new Vector2f(48, 48)));
        obj93_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(80)));
        this.addGameObjectToScene(obj93_sky);

        GameObject obj93_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(380, 1012), new Vector2f(48, 48)));
        obj93_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj93_sky_2);

        GameObject obj94_sky = new GameObject("Object sky", new Transform(new Vector2f(428, 1060), new Vector2f(48, 48)));
        obj94_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj94_sky);

        GameObject obj94_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(428, 1012), new Vector2f(48, 48)));
        obj94_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj94_sky_2);

        GameObject obj95_sky = new GameObject("Object sky", new Transform(new Vector2f(476, 1060), new Vector2f(48, 48)));
        obj95_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj95_sky);

        GameObject obj95_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(476, 1012), new Vector2f(48, 48)));
        obj95_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj95_sky_2);

        GameObject obj96_sky = new GameObject("Object sky", new Transform(new Vector2f(524, 1060), new Vector2f(48, 48)));
        obj96_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj96_sky);

        GameObject obj96_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(524, 1012), new Vector2f(48, 48)));
        obj96_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj96_sky_2);

        GameObject obj97_sky = new GameObject("Object sky", new Transform(new Vector2f(572, 1060), new Vector2f(48, 48)));
        obj97_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(80)));
        this.addGameObjectToScene(obj97_sky);

        GameObject obj97_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(572, 1012), new Vector2f(48, 48)));
        obj97_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj97_sky_2);

        GameObject obj98_sky = new GameObject("Object sky", new Transform(new Vector2f(620, 1060), new Vector2f(48, 48)));
        obj98_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(80)));
        this.addGameObjectToScene(obj98_sky);

        GameObject obj98_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(620, 1012), new Vector2f(48, 48)));
        obj98_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj98_sky_2);

        GameObject obj99_sky = new GameObject("Object sky", new Transform(new Vector2f(668, 1060), new Vector2f(48, 48)));
        obj99_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj99_sky);

        GameObject obj99_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(668, 1012), new Vector2f(48, 48)));
        obj99_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj99_sky_2);

        GameObject obj100_sky = new GameObject("Object sky", new Transform(new Vector2f(716, 1060), new Vector2f(48, 48)));
        obj100_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj100_sky);

        GameObject obj100_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(716, 1012), new Vector2f(48, 48)));
        obj100_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj100_sky_2);

        GameObject obj101_sky = new GameObject("Object sky", new Transform(new Vector2f(764, 1060), new Vector2f(48, 48)));
        obj101_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(80)));
        this.addGameObjectToScene(obj101_sky);

        GameObject obj101_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(764, 1012), new Vector2f(48, 48)));
        obj101_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj101_sky_2);

        GameObject obj102_sky = new GameObject("Object sky", new Transform(new Vector2f(812, 1060), new Vector2f(48, 48)));
        obj102_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj102_sky);

        GameObject obj102_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(812, 1012), new Vector2f(48, 48)));
        obj102_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj102_sky_2);

        GameObject obj103_sky = new GameObject("Object sky", new Transform(new Vector2f(860, 1060), new Vector2f(48, 48)));
        obj103_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj103_sky);

        GameObject obj103_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(860, 1012), new Vector2f(48, 48)));
        obj103_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj103_sky_2);

        GameObject obj104_sky = new GameObject("Object sky", new Transform(new Vector2f(908, 1060), new Vector2f(48, 48)));
        obj104_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj104_sky);

        GameObject obj104_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(908, 1012), new Vector2f(48, 48)));
        obj104_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj104_sky_2);

        GameObject obj105_sky = new GameObject("Object sky", new Transform(new Vector2f(956, 1060), new Vector2f(48, 48)));
        obj105_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(38)));
        this.addGameObjectToScene(obj105_sky);

        GameObject obj105_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(956, 1012), new Vector2f(48, 48)));
        obj105_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj105_sky_2);

        GameObject obj106_sky = new GameObject("Object sky", new Transform(new Vector2f(1004, 1060), new Vector2f(48, 48)));
        obj106_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(80)));
        this.addGameObjectToScene(obj106_sky);

        GameObject obj106_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(1004, 1012), new Vector2f(48, 48)));
        obj106_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj106_sky_2);

        GameObject obj107_sky = new GameObject("Object sky", new Transform(new Vector2f(1004, 1108), new Vector2f(48, 48)));
        obj107_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(107)));
        this.addGameObjectToScene(obj107_sky);

        GameObject obj108_sky = new GameObject("Object sky", new Transform(new Vector2f(956, 1108), new Vector2f(48, 48)));
        obj108_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(116)));
        this.addGameObjectToScene(obj108_sky);

        GameObject obj109_sky = new GameObject("Object sky", new Transform(new Vector2f(908, 1108), new Vector2f(48, 48)));
        obj109_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(116)));
        this.addGameObjectToScene(obj109_sky);

        GameObject obj110_sky = new GameObject("Object sky", new Transform(new Vector2f(860, 1108), new Vector2f(48, 48)));
        obj110_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(107)));
        this.addGameObjectToScene(obj110_sky);

        GameObject obj111_sky = new GameObject("Object sky", new Transform(new Vector2f(812, 1108), new Vector2f(48, 48)));
        obj111_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(2)));
        this.addGameObjectToScene(obj111_sky);

        GameObject obj114_sky = new GameObject("Object sky", new Transform(new Vector2f(812, 1108), new Vector2f(48, 48)));
        obj114_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj114_sky);

        GameObject obj112_sky = new GameObject("Object sky", new Transform(new Vector2f(764, 1108), new Vector2f(48, 48)));
        obj112_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj112_sky);

        GameObject obj115_sky = new GameObject("Object sky", new Transform(new Vector2f(764, 1108), new Vector2f(48, 48)));
        obj115_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj115_sky);

        GameObject obj113_sky = new GameObject("Object sky", new Transform(new Vector2f(716, 1108), new Vector2f(48, 48)));
        obj113_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj113_sky);

        GameObject obj116_sky = new GameObject("Object sky", new Transform(new Vector2f(716, 1108), new Vector2f(48, 48)));
        obj116_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj116_sky);

        GameObject obj117_sky = new GameObject("Object sky", new Transform(new Vector2f(668, 1108), new Vector2f(48, 48)));
        obj117_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj117_sky);

        GameObject obj118_sky = new GameObject("Object sky", new Transform(new Vector2f(668, 1108), new Vector2f(48, 48)));
        obj118_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj118_sky);

        GameObject obj119_sky = new GameObject("Object sky", new Transform(new Vector2f(620, 1108), new Vector2f(48, 48)));
        obj119_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj119_sky);

        GameObject obj120_sky = new GameObject("Object sky", new Transform(new Vector2f(620, 1108), new Vector2f(48, 48)));
        obj120_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj120_sky);

        GameObject obj121_sky = new GameObject("Object sky", new Transform(new Vector2f(572, 1108), new Vector2f(48, 48)));
        obj121_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj121_sky);

        GameObject obj122_sky = new GameObject("Object sky", new Transform(new Vector2f(572, 1108), new Vector2f(48, 48)));
        obj122_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj122_sky);

        GameObject obj123_sky = new GameObject("Object sky", new Transform(new Vector2f(524, 1108), new Vector2f(48, 48)));
        obj123_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj123_sky);

        GameObject obj124_sky = new GameObject("Object sky", new Transform(new Vector2f(524, 1108), new Vector2f(48, 48)));
        obj124_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj124_sky);

        GameObject obj125_sky = new GameObject("Object sky", new Transform(new Vector2f(476, 1108), new Vector2f(48, 48)));
        obj125_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj125_sky);

        GameObject obj126_sky = new GameObject("Object sky", new Transform(new Vector2f(476, 1108), new Vector2f(48, 48)));
        obj126_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj126_sky);

        GameObject obj127_sky = new GameObject("Object sky", new Transform(new Vector2f(428, 1108), new Vector2f(48, 48)));
        obj127_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj127_sky);

        GameObject obj128_sky = new GameObject("Object sky", new Transform(new Vector2f(428, 1108), new Vector2f(48, 48)));
        obj128_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj128_sky);

        GameObject obj129_sky = new GameObject("Object sky", new Transform(new Vector2f(380, 1108), new Vector2f(48, 48)));
        obj129_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj129_sky);

        GameObject obj130_sky = new GameObject("Object sky", new Transform(new Vector2f(380, 1108), new Vector2f(48, 48)));
        obj130_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj130_sky);

        GameObject obj131_sky = new GameObject("Object sky", new Transform(new Vector2f(332, 1108), new Vector2f(48, 48)));
        obj131_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj131_sky);

        GameObject obj132_sky = new GameObject("Object sky", new Transform(new Vector2f(332, 1108), new Vector2f(48, 48)));
        obj132_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj132_sky);

        GameObject obj133_sky = new GameObject("Object sky", new Transform(new Vector2f(284, 1108), new Vector2f(48, 48)));
        obj133_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj133_sky);

        GameObject obj134_sky = new GameObject("Object sky", new Transform(new Vector2f(284, 1108), new Vector2f(48, 48)));
        obj134_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj134_sky);

        GameObject obj135_sky = new GameObject("Object sky", new Transform(new Vector2f(236, 1108), new Vector2f(48, 48)));
        obj135_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj135_sky);

        GameObject obj136_sky = new GameObject("Object sky", new Transform(new Vector2f(236, 1108), new Vector2f(48, 48)));
        obj136_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj136_sky);

        GameObject obj137_sky = new GameObject("Object sky", new Transform(new Vector2f(188, 1108), new Vector2f(48, 48)));
        obj137_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj137_sky);

        GameObject obj138_sky = new GameObject("Object sky", new Transform(new Vector2f(188, 1108), new Vector2f(48, 48)));
        obj138_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj138_sky);

        GameObject obj139_sky = new GameObject("Object sky", new Transform(new Vector2f(140, 1108), new Vector2f(48, 48)));
        obj139_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(23)));
        this.addGameObjectToScene(obj139_sky);

        GameObject obj346_sky = new GameObject("Object sky", new Transform(new Vector2f(140, 1156), new Vector2f(199, 199)), false, true);
        obj346_sky.addComponent(new SpriteRenderer(treeset.getSprite(1)));
        this.addGameObjectToScene(obj346_sky);

        GameObject obj347_sky = new GameObject("Object sky", new Transform(new Vector2f(300, 1156), new Vector2f(199, 199)), false, true);
        obj347_sky.addComponent(new SpriteRenderer(treeset.getSprite(0)));
        this.addGameObjectToScene(obj347_sky);

        GameObject obj337_sky = new GameObject("Object sky", new Transform(new Vector2f(140, 1156), new Vector2f(48, 48)));
        obj337_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(2)));
        this.addGameObjectToScene(obj337_sky);

        GameObject obj338_sky = new GameObject("Object sky", new Transform(new Vector2f(92, 1156), new Vector2f(48, 48)));
        obj338_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj338_sky);

        GameObject obj339_sky = new GameObject("Object sky", new Transform(new Vector2f(44, 1156), new Vector2f(48, 48)));
        obj339_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj339_sky);

        GameObject obj340_sky = new GameObject("Object sky", new Transform(new Vector2f(-4, 1156), new Vector2f(48, 48)));
        obj340_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj340_sky);

        GameObject obj341_sky = new GameObject("Object sky", new Transform(new Vector2f(-52, 1156), new Vector2f(48, 48)));
        obj341_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj341_sky);

        GameObject obj342_sky = new GameObject("Object sky", new Transform(new Vector2f(-100, 1156), new Vector2f(48, 48)));
        obj342_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj342_sky);

        GameObject obj343_sky = new GameObject("Object sky", new Transform(new Vector2f(-148, 1156), new Vector2f(48, 48)));
        obj343_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj343_sky);

        GameObject obj344_sky = new GameObject("Object sky", new Transform(new Vector2f(-196, 1156), new Vector2f(48, 48)));
        obj344_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(57)));
        this.addGameObjectToScene(obj344_sky);

        GameObject obj345_sky = new GameObject("Object sky", new Transform(new Vector2f(-196, 1204), new Vector2f(48, 48)));
        obj345_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(2)));
        this.addGameObjectToScene(obj345_sky);

        GameObject obj348_sky = new GameObject("Object sky", new Transform(new Vector2f(-100, 1250), new Vector2f(48, 48)));
        obj348_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj348_sky);

        GameObject obj349_sky = new GameObject("Object sky", new Transform(new Vector2f(-30, 1220), new Vector2f(48, 48)));
        obj349_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj349_sky);

        GameObject obj354_sky = new GameObject("Object sky", new Transform(new Vector2f(-170, 1290), new Vector2f(48, 48)));
        obj354_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj354_sky);

        GameObject obj355_sky = new GameObject("Object sky", new Transform(new Vector2f(-80, 1320), new Vector2f(48, 48)));
        obj355_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj355_sky);

        GameObject obj356_sky = new GameObject("Object sky", new Transform(new Vector2f(-150, 1360), new Vector2f(48, 48)));
        obj356_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj356_sky);

        GameObject obj357_sky = new GameObject("Object sky", new Transform(new Vector2f(-50, 1380), new Vector2f(48, 48)));
        obj357_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj357_sky);

        GameObject obj358_sky = new GameObject("Object sky", new Transform(new Vector2f(0, 1420), new Vector2f(48, 48)));
        obj358_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj358_sky);

        GameObject obj359_sky = new GameObject("Object sky", new Transform(new Vector2f(-70, 1450), new Vector2f(48, 48)));
        obj359_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj359_sky);

        GameObject obj360_sky = new GameObject("Object sky", new Transform(new Vector2f(-170, 1470), new Vector2f(48, 48)));
        obj360_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj360_sky);

        GameObject obj361_sky = new GameObject("Object sky", new Transform(new Vector2f(-110, 1500), new Vector2f(48, 48)));
        obj361_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj361_sky);

        GameObject obj362_sky = new GameObject("Object sky", new Transform(new Vector2f(0, 1490), new Vector2f(48, 48)));
        obj362_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj362_sky);

        GameObject obj363_sky = new GameObject("Object sky", new Transform(new Vector2f(850, 1520), new Vector2f(48, 48)));
        obj363_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj363_sky);

        GameObject obj364_sky = new GameObject("Object sky", new Transform(new Vector2f(940, 1550), new Vector2f(48, 48)));
        obj364_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj364_sky);

        GameObject obj365_sky = new GameObject("Object sky", new Transform(new Vector2f(990, 1510), new Vector2f(48, 48)));
        obj365_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj365_sky);

        GameObject obj370_sky = new GameObject("Object sky", new Transform(new Vector2f(1090, 1540), new Vector2f(48, 48)));
        obj370_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj370_sky);

        GameObject obj371_sky = new GameObject("Object sky", new Transform(new Vector2f(1190, 1590), new Vector2f(48, 48)));
        obj371_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(116)));
        this.addGameObjectToScene(obj371_sky);

        GameObject obj372_sky = new GameObject("Object sky", new Transform(new Vector2f(1090, 1540), new Vector2f(48, 48)));
        obj372_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj372_sky);

        GameObject obj373_sky = new GameObject("Object sky", new Transform(new Vector2f(1140, 1580), new Vector2f(48, 48)));
        obj373_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj373_sky);

        GameObject obj374_sky = new GameObject("Object sky", new Transform(new Vector2f(1060, 1600), new Vector2f(48, 48)));
        obj374_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj374_sky);

        GameObject obj375_sky = new GameObject("Object sky", new Transform(new Vector2f(1250, 1650), new Vector2f(48, 48)));
        obj375_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj375_sky);

        GameObject obj376_sky = new GameObject("Object sky", new Transform(new Vector2f(1534, 1710), new Vector2f(48, 48)));
        obj376_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj376_sky);

        GameObject obj377_sky = new GameObject("Object sky", new Transform(new Vector2f(1300, 1750), new Vector2f(48, 48)));
        obj377_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(116)));
        this.addGameObjectToScene(obj377_sky);

        GameObject obj378_sky = new GameObject("Object sky", new Transform(new Vector2f(1252, 1730), new Vector2f(48, 48)));
        obj378_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(117)));
        this.addGameObjectToScene(obj378_sky);

        GameObject obj379_sky = new GameObject("Object sky", new Transform(new Vector2f(1204, 1750), new Vector2f(48, 48)));
        obj379_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(116)));
        this.addGameObjectToScene(obj379_sky);

        GameObject obj380_sky = new GameObject("Object sky", new Transform(new Vector2f(1100, 1700), new Vector2f(48, 48)));
        obj380_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(117)));
        this.addGameObjectToScene(obj380_sky);

        GameObject obj381_sky = new GameObject("Object sky", new Transform(new Vector2f(950, 1770), new Vector2f(48, 48)));
        obj381_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(117)));
        this.addGameObjectToScene(obj381_sky);

        GameObject obj382_sky = new GameObject("Object sky", new Transform(new Vector2f(998, 1740), new Vector2f(48, 48)));
        obj382_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(116)));
        this.addGameObjectToScene(obj382_sky);

        GameObject obj383_sky = new GameObject("Object sky", new Transform(new Vector2f(830, 1720), new Vector2f(48, 48)));
        obj383_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(117)));
        this.addGameObjectToScene(obj383_sky);

        GameObject obj384_sky = new GameObject("Object sky", new Transform(new Vector2f(782, 1720), new Vector2f(48, 48)));
        obj384_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(116)));
        this.addGameObjectToScene(obj384_sky);

        GameObject obj385_sky = new GameObject("Object sky", new Transform(new Vector2f(1050, 1760), new Vector2f(48, 48)));
        obj385_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj385_sky);

        GameObject obj386_sky = new GameObject("Object sky", new Transform(new Vector2f(1450, 1740), new Vector2f(48, 48)));
        obj386_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj386_sky);

        GameObject obj389_sky = new GameObject("Object sky", new Transform(new Vector2f(1390, 1760), new Vector2f(48, 48)));
        obj389_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj389_sky);

        GameObject obj387_sky = new GameObject("Object sky", new Transform(new Vector2f(700, 1740), new Vector2f(48, 48)));
        obj387_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj387_sky);

        GameObject obj388_sky = new GameObject("Object sky", new Transform(new Vector2f(600, 1720), new Vector2f(48, 48)));
        obj388_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(117)));
        this.addGameObjectToScene(obj388_sky);

        GameObject obj390_sky = new GameObject("Object sky", new Transform(new Vector2f(470, 1700), new Vector2f(48, 48)));
        obj390_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(116)));
        this.addGameObjectToScene(obj390_sky);

        GameObject obj391_sky = new GameObject("Object sky", new Transform(new Vector2f(422, 1700), new Vector2f(48, 48)));
        obj391_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(117)));
        this.addGameObjectToScene(obj391_sky);

        GameObject obj392_sky = new GameObject("Object sky", new Transform(new Vector2f(130, 1780), new Vector2f(48, 48)));
        obj392_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(116)));
        this.addGameObjectToScene(obj392_sky);

        GameObject obj393_sky = new GameObject("Object sky", new Transform(new Vector2f(82, 1780), new Vector2f(48, 48)));
        obj393_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(116)));
        this.addGameObjectToScene(obj393_sky);

        GameObject obj394_sky = new GameObject("Object sky", new Transform(new Vector2f(34, 1780), new Vector2f(48, 48)));
        obj394_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(117)));
        this.addGameObjectToScene(obj394_sky);

//        GameObject obj395_sky = new GameObject("Object sky", new Transform(new Vector2f(-14, 1780), new Vector2f(48, 48)));
//        obj395_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(116)));
//        this.addGameObjectToScene(obj395_sky);

        GameObject obj396_sky = new GameObject("Object sky", new Transform(new Vector2f(210, 1780), new Vector2f(48, 48)));
        obj396_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj396_sky);

        GameObject obj397_sky = new GameObject("Object sky", new Transform(new Vector2f(300, 1750), new Vector2f(48, 48)));
        obj397_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj397_sky);

        GameObject obj398_sky = new GameObject("Object sky", new Transform(new Vector2f(360, 1760), new Vector2f(48, 48)));
        obj398_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj398_sky);

        GameObject obj399_sky = new GameObject("Object sky", new Transform(new Vector2f(360, 1760), new Vector2f(48, 48)));
        obj399_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj399_sky);

//        GameObject obj400_sky = new GameObject("Object sky", new Transform(new Vector2f(360, 1800), new Vector2f(48, 48)));
//        obj400_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(107)));
//        this.addGameObjectToScene(obj400_sky);

        GameObject obj401_sky = new GameObject("Object sky", new Transform(new Vector2f(-196, 1860), new Vector2f(48, 48)));
        obj401_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(107)));
        this.addGameObjectToScene(obj401_sky);

        GameObject obj402_sky = new GameObject("Object sky", new Transform(new Vector2f(-148, 1860), new Vector2f(48, 48)));
        obj402_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(117)));
        this.addGameObjectToScene(obj402_sky);

        GameObject obj403_sky = new GameObject("Object sky", new Transform(new Vector2f(0, 1840), new Vector2f(48, 48)));
        obj403_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj403_sky);

        GameObject obj404_sky = new GameObject("Object sky", new Transform(new Vector2f(-70, 1870), new Vector2f(48, 48)));
        obj404_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj404_sky);

        GameObject obj405_sky = new GameObject("Object sky", new Transform(new Vector2f(-200, 1920), new Vector2f(48, 48)));
        obj405_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj405_sky);

        GameObject obj406_sky = new GameObject("Object sky", new Transform(new Vector2f(-100, 1950), new Vector2f(48, 48)));
        obj406_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj406_sky);

        GameObject obj408_sky = new GameObject("Object sky", new Transform(new Vector2f(-52, 1950), new Vector2f(48, 48)));
        obj408_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj408_sky);

        GameObject obj407_sky = new GameObject("Object sky", new Transform(new Vector2f(-200, 1980), new Vector2f(48, 48)));
        obj407_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj407_sky);

        GameObject obj409_sky = new GameObject("Object sky", new Transform(new Vector2f(-90, 2010), new Vector2f(48, 48)));
        obj409_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj409_sky);

        GameObject obj410_sky = new GameObject("Object sky", new Transform(new Vector2f(-30, 2050), new Vector2f(48, 48)));
        obj410_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(86)));
        this.addGameObjectToScene(obj410_sky);

        GameObject obj411_sky = new GameObject("Object sky", new Transform(new Vector2f(50, 2040), new Vector2f(48, 48)));
        obj411_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(140)));
        this.addGameObjectToScene(obj411_sky);

        GameObject obj412_sky = new GameObject("Object sky", new Transform(new Vector2f(98, 2040), new Vector2f(48, 48)));
        obj412_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(24)));
        this.addGameObjectToScene(obj412_sky);

        GameObject obj413_sky = new GameObject("Object sky", new Transform(new Vector2f(98, 2088), new Vector2f(48, 48)));
        obj413_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(140)));
        this.addGameObjectToScene(obj413_sky);

        GameObject obj414_sky = new GameObject("Object sky", new Transform(new Vector2f(190, 2100), new Vector2f(48, 48)));
        obj414_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(140)));
        this.addGameObjectToScene(obj414_sky);

        GameObject obj415_sky = new GameObject("Object sky", new Transform(new Vector2f(238, 2140), new Vector2f(48, 48)));
        obj415_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj415_sky);

        GameObject obj416_sky = new GameObject("Object sky", new Transform(new Vector2f(238, 2140), new Vector2f(48, 48)));
        obj416_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj416_sky);

        GameObject obj417_sky = new GameObject("Object sky", new Transform(new Vector2f(1198, 2212), new Vector2f(48, 48)));
        obj417_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(0)));
        this.addGameObjectToScene(obj417_sky);

        GameObject obj418_sky = new GameObject("Object sky", new Transform(new Vector2f(1246, 2212), new Vector2f(48, 48)));
        obj418_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj418_sky);

        GameObject obj419_sky = new GameObject("Object sky", new Transform(new Vector2f(1294, 2212), new Vector2f(48, 48)));
        obj419_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj419_sky);

        GameObject obj420_sky = new GameObject("Object sky", new Transform(new Vector2f(1342, 2212), new Vector2f(48, 48)));
        obj420_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj420_sky);

        GameObject obj421_sky = new GameObject("Object sky", new Transform(new Vector2f(1390, 2212), new Vector2f(48, 48)));
        obj421_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj421_sky);

        GameObject obj422_sky = new GameObject("Object sky", new Transform(new Vector2f(1438, 2212), new Vector2f(48, 48)));
        obj422_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(25)));
        this.addGameObjectToScene(obj422_sky);

        GameObject obj423_sky = new GameObject("Object sky", new Transform(new Vector2f(1486, 2212), new Vector2f(48, 48)));
        obj423_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj423_sky);

        GameObject obj424_sky = new GameObject("Object sky", new Transform(new Vector2f(1534, 2212), new Vector2f(48, 48)));
        obj424_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj424_sky);

        GameObject obj425_sky = new GameObject("Object sky", new Transform(new Vector2f(1534, 2260), new Vector2f(48, 48)));
        obj425_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj425_sky);

        GameObject obj426_sky = new GameObject("Object sky", new Transform(new Vector2f(1486, 2260), new Vector2f(48, 48)));
        obj426_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj426_sky);

        GameObject obj427_sky = new GameObject("Object sky", new Transform(new Vector2f(1438, 2260), new Vector2f(48, 48)));
        obj427_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(0)));
        this.addGameObjectToScene(obj427_sky);

        GameObject obj428_sky = new GameObject("Object sky", new Transform(new Vector2f(-196, 2212), new Vector2f(48, 48)));
        obj428_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj428_sky);

        GameObject obj429_sky = new GameObject("Object sky", new Transform(new Vector2f(-148, 2212), new Vector2f(48, 48)));
        obj429_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(2)));
        this.addGameObjectToScene(obj429_sky);

        GameObject obj450_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 2212), new Vector2f(199, 199)), false, true);
        obj450_sky.addComponent(new SpriteRenderer(treeset.getSprite(2)));
        this.addGameObjectToScene(obj450_sky);

        GameObject obj451_sky = new GameObject("Object sky", new Transform(new Vector2f(1080, 2356), new Vector2f(48, 48)));
        obj451_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(31)));
        this.addGameObjectToScene(obj451_sky);

        GameObject obj452_sky = new GameObject("Object sky", new Transform(new Vector2f(1128, 2356), new Vector2f(48, 48)));
        obj452_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj452_sky);

        GameObject obj453_sky = new GameObject("Object sky", new Transform(new Vector2f(1176, 2356), new Vector2f(48, 48)));
        obj453_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj453_sky);

        GameObject obj454_sky = new GameObject("Object sky", new Transform(new Vector2f(1224, 2356), new Vector2f(48, 48)));
        obj454_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(33)));
        this.addGameObjectToScene(obj454_sky);

        GameObject obj455_sky = new GameObject("Object sky", new Transform(new Vector2f(970, 2370), new Vector2f(48, 48)));
        obj455_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(30)));
        this.addGameObjectToScene(obj455_sky);

        GameObject obj456_sky = new GameObject("Object sky", new Transform(new Vector2f(842, 2390), new Vector2f(48, 48)));
        obj456_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(33)));
        this.addGameObjectToScene(obj456_sky);

        GameObject obj457_sky = new GameObject("Object sky", new Transform(new Vector2f(794, 2390), new Vector2f(48, 48)));
        obj457_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(31)));
        this.addGameObjectToScene(obj457_sky);

        GameObject obj458_sky = new GameObject("Object sky", new Transform(new Vector2f(1350, 2290), new Vector2f(48, 48)));
        obj458_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj458_sky);

        GameObject obj459_sky = new GameObject("Object sky", new Transform(new Vector2f(1250, 2320), new Vector2f(48, 48)));
        obj459_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj459_sky);

        GameObject obj460_sky = new GameObject("Object sky", new Transform(new Vector2f(660, 2320), new Vector2f(48, 48)));
        obj460_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj460_sky);

        GameObject obj461_sky = new GameObject("Object sky", new Transform(new Vector2f(570, 2340), new Vector2f(48, 48)));
        obj461_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj461_sky);

        GameObject obj462_sky = new GameObject("Object sky", new Transform(new Vector2f(490, 2360), new Vector2f(48, 48)));
        obj462_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj462_sky);

        GameObject obj463_sky = new GameObject("Object sky", new Transform(new Vector2f(442, 2360), new Vector2f(48, 48)));
        obj463_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj463_sky);

        GameObject obj464_sky = new GameObject("Object sky", new Transform(new Vector2f(442, 2408), new Vector2f(48, 48)));
        obj464_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj464_sky);

        GameObject obj465_sky = new GameObject("Object sky", new Transform(new Vector2f(340, 2428), new Vector2f(48, 48)));
        obj465_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(8)));
        this.addGameObjectToScene(obj465_sky);

        GameObject obj466_sky = new GameObject("Object sky", new Transform(new Vector2f(292, 2428), new Vector2f(48, 48)));
        obj466_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(7)));
        this.addGameObjectToScene(obj466_sky);

        GameObject obj467_sky = new GameObject("Object sky", new Transform(new Vector2f(244, 2428), new Vector2f(48, 48)));
        obj467_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(6)));
        this.addGameObjectToScene(obj467_sky);

        GameObject obj468_sky = new GameObject("Object sky", new Transform(new Vector2f(54, 2460), new Vector2f(48, 48)));
        obj468_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(6)));
        this.addGameObjectToScene(obj468_sky);

        GameObject obj469_sky = new GameObject("Object sky", new Transform(new Vector2f(102, 2460), new Vector2f(48, 48)));
        obj469_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(8)));
        this.addGameObjectToScene(obj469_sky);

        GameObject obj470_sky = new GameObject("Object sky", new Transform(new Vector2f(-196, 2548), new Vector2f(48, 48)));
        obj470_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj470_sky);

        GameObject obj471_sky = new GameObject("Object sky", new Transform(new Vector2f(-148, 2548), new Vector2f(48, 48)));
        obj471_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj471_sky);

        GameObject obj472_sky = new GameObject("Object sky", new Transform(new Vector2f(-100, 2548), new Vector2f(48, 48)));
        obj472_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(33)));
        this.addGameObjectToScene(obj472_sky);

        GameObject obj473_sky = new GameObject("Object sky", new Transform(new Vector2f(-4, 2500), new Vector2f(48, 48)));
        obj473_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj473_sky);

        GameObject obj474_sky = new GameObject("Object sky", new Transform(new Vector2f(-52, 2530), new Vector2f(48, 48)));
        obj474_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj474_sky);

        GameObject obj475_sky = new GameObject("Object sky", new Transform(new Vector2f(-192, 2594), new Vector2f(199, 199)), false, true);
        obj475_sky.addComponent(new SpriteRenderer(treeset.getSprite(1)));
        this.addGameObjectToScene(obj475_sky);

        GameObject obj476_sky = new GameObject("Object sky", new Transform(new Vector2f(-90, 2630), new Vector2f(48, 48)));
        obj476_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj476_sky);

        GameObject obj477_sky = new GameObject("Object sky", new Transform(new Vector2f(-170, 2590), new Vector2f(48, 48)));
        obj477_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj477_sky);

        GameObject obj478_sky = new GameObject("Object sky", new Transform(new Vector2f(0, 2660), new Vector2f(48, 48)));
        obj478_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj478_sky);

        GameObject obj479_sky = new GameObject("Object sky", new Transform(new Vector2f(-96, 2700), new Vector2f(48, 48)));
        obj479_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj479_sky);

        GameObject obj480_sky = new GameObject("Object sky", new Transform(new Vector2f(0, 2740), new Vector2f(48, 48)));
        obj480_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj480_sky);

        GameObject obj481_sky = new GameObject("Object sky", new Transform(new Vector2f(96, 2780), new Vector2f(48, 48)));
        obj481_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj481_sky);

        GameObject obj482_sky = new GameObject("Object sky", new Transform(new Vector2f(210, 2810), new Vector2f(48, 48)));
        obj482_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(31)));
        this.addGameObjectToScene(obj482_sky);

        GameObject obj483_sky = new GameObject("Object sky", new Transform(new Vector2f(258, 2810), new Vector2f(48, 48)));
        obj483_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj483_sky);

        GameObject obj484_sky = new GameObject("Object sky", new Transform(new Vector2f(306, 2810), new Vector2f(48, 48)));
        obj484_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(33)));
        this.addGameObjectToScene(obj484_sky);

        GameObject obj485_sky = new GameObject("Object sky", new Transform(new Vector2f(530, 2820), new Vector2f(48, 48)));
        obj485_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj485_sky);

        GameObject obj486_sky = new GameObject("Object sky", new Transform(new Vector2f(578, 2820), new Vector2f(48, 48)));
        obj486_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj486_sky);

        GameObject obj487_sky = new GameObject("Object sky", new Transform(new Vector2f(626, 2820), new Vector2f(48, 48)));
        obj487_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj487_sky);

        GameObject obj488_sky = new GameObject("Object sky", new Transform(new Vector2f(674, 2820), new Vector2f(48, 48)));
        obj488_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj488_sky);

        GameObject obj489_sky = new GameObject("Object sky", new Transform(new Vector2f(722, 2820), new Vector2f(48, 48)));
        obj489_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj489_sky);

        GameObject obj490_sky = new GameObject("Object sky", new Transform(new Vector2f(770, 2820), new Vector2f(48, 48)));
        obj490_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj490_sky);

        GameObject obj491_sky = new GameObject("Object sky", new Transform(new Vector2f(818, 2820), new Vector2f(48, 48)));
        obj491_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(58)));
        this.addGameObjectToScene(obj491_sky);

        GameObject obj492_sky = new GameObject("Object sky", new Transform(new Vector2f(482, 2820), new Vector2f(48, 48)));
        obj492_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(48)));
        this.addGameObjectToScene(obj492_sky);

        GameObject obj493_sky = new GameObject("Object sky", new Transform(new Vector2f(620, 2868), new Vector2f(199, 199)), false, true);
        obj493_sky.addComponent(new SpriteRenderer(treeset.getSprite(2)));
        this.addGameObjectToScene(obj493_sky);

        GameObject obj494_sky = new GameObject("Object sky", new Transform(new Vector2f(410, 2830), new Vector2f(48, 48)));
        obj494_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(38)));
        this.addGameObjectToScene(obj494_sky);

        GameObject obj366_sky = new GameObject("Object sky", new Transform(new Vector2f(1300, 1630), new Vector2f(48, 48)));
        obj366_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(116)));
        this.addGameObjectToScene(obj366_sky);

//        GameObject obj367_sky = new GameObject("Object sky", new Transform(new Vector2f(1348, 1630), new Vector2f(48, 48)));
//        obj367_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(117)));
//        this.addGameObjectToScene(obj367_sky);

        GameObject obj368_sky = new GameObject("Object sky", new Transform(new Vector2f(1396, 1630), new Vector2f(48, 48)));
        obj368_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(117)));
        this.addGameObjectToScene(obj368_sky);

        GameObject obj369_sky = new GameObject("Object sky", new Transform(new Vector2f(1444, 1630), new Vector2f(48, 48)));
        obj369_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(117)));
        this.addGameObjectToScene(obj369_sky);

        GameObject obj350_sky = new GameObject("Object sky", new Transform(new Vector2f(0, 1300), new Vector2f(48, 48)));
        obj350_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(140)));
        this.addGameObjectToScene(obj350_sky);

        GameObject obj140_sky = new GameObject("Object sky", new Transform(new Vector2f(140, 1108), new Vector2f(48, 48)));
        obj140_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj140_sky);

        GameObject obj141_sky = new GameObject("Object sky", new Transform(new Vector2f(92, 1108), new Vector2f(48, 48)));
        obj141_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj141_sky);

        GameObject obj142_sky = new GameObject("Object sky", new Transform(new Vector2f(92, 1108), new Vector2f(48, 48)));
        obj142_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj142_sky);

        GameObject obj143_sky = new GameObject("Object sky", new Transform(new Vector2f(44, 1108), new Vector2f(48, 48)));
        obj143_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj143_sky);

        GameObject obj144_sky = new GameObject("Object sky", new Transform(new Vector2f(44, 1108), new Vector2f(48, 48)));
        obj144_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj144_sky);

        GameObject obj145_sky = new GameObject("Object sky", new Transform(new Vector2f(-4, 1108), new Vector2f(48, 48)));
        obj145_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj145_sky);

        GameObject obj146_sky = new GameObject("Object sky", new Transform(new Vector2f(-4, 1108), new Vector2f(48, 48)));
        obj146_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj146_sky);

        GameObject obj148_sky = new GameObject("Object sky", new Transform(new Vector2f(-52, 1108), new Vector2f(48, 48)));
        obj148_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj148_sky);

        GameObject obj149_sky = new GameObject("Object sky", new Transform(new Vector2f(-52, 1108), new Vector2f(48, 48)));
        obj149_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj149_sky);

        GameObject obj150_sky = new GameObject("Object sky", new Transform(new Vector2f(-100, 1108), new Vector2f(48, 48)));
        obj150_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj150_sky);

        GameObject obj151_sky = new GameObject("Object sky", new Transform(new Vector2f(-100, 1108), new Vector2f(48, 48)));
        obj151_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj151_sky);

        GameObject obj152_sky = new GameObject("Object sky", new Transform(new Vector2f(-148, 1108), new Vector2f(48, 48)));
        obj152_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj152_sky);

        GameObject obj153_sky = new GameObject("Object sky", new Transform(new Vector2f(-148, 1108), new Vector2f(48, 48)));
        obj153_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj153_sky);

        GameObject obj154_sky = new GameObject("Object sky", new Transform(new Vector2f(-196, 1108), new Vector2f(48, 48)));
        obj154_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj154_sky);

        GameObject obj155_sky = new GameObject("Object sky", new Transform(new Vector2f(-196, 1108), new Vector2f(48, 48)));
        obj155_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(4)));
        this.addGameObjectToScene(obj155_sky);

        GameObject obj156_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1108), new Vector2f(48, 48)));
        obj156_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(107)));
        this.addGameObjectToScene(obj156_sky);

        GameObject obj157_sky = new GameObject("Object sky", new Transform(new Vector2f(-292, 1108), new Vector2f(48, 48)));
        obj157_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(107)));
        this.addGameObjectToScene(obj157_sky);

        GameObject obj158_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1156), new Vector2f(48, 48)));
        obj158_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj158_sky);

        GameObject obj159_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1204), new Vector2f(48, 48)));
        obj159_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj159_sky);

        GameObject obj160_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1252), new Vector2f(48, 48)));
        obj160_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj160_sky);

        GameObject obj161_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1300), new Vector2f(48, 48)));
        obj161_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj161_sky);

        GameObject obj162_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1348), new Vector2f(48, 48)));
        obj162_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj162_sky);

        GameObject obj163_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1396), new Vector2f(48, 48)));
        obj163_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj163_sky);

        GameObject obj164_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1444), new Vector2f(48, 48)));
        obj164_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj164_sky);

        GameObject obj165_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1492), new Vector2f(48, 48)));
        obj165_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj165_sky);

        GameObject obj166_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1540), new Vector2f(48, 48)));
        obj166_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj166_sky);

        GameObject obj167_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1588), new Vector2f(48, 48)));
        obj167_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj167_sky);

        GameObject obj168_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1636), new Vector2f(48, 48)));
        obj168_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj168_sky);

        GameObject obj169_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1684), new Vector2f(48, 48)));
        obj169_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj169_sky);

        GameObject obj170_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1732), new Vector2f(48, 48)));
        obj170_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj170_sky);

        GameObject obj171_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1780), new Vector2f(48, 48)));
        obj171_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj171_sky);

        GameObject obj172_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1828), new Vector2f(48, 48)));
        obj172_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj172_sky);

        GameObject obj173_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1876), new Vector2f(48, 48)));
        obj173_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj173_sky);

        GameObject obj174_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1924), new Vector2f(48, 48)));
        obj174_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj174_sky);

        GameObject obj175_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 1972), new Vector2f(48, 48)));
        obj175_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj175_sky);

        GameObject obj176_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 2020), new Vector2f(48, 48)));
        obj176_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj176_sky);

        GameObject obj177_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 2068), new Vector2f(48, 48)));
        obj177_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj177_sky);

        GameObject obj178_sky = new GameObject("Object sky", new Transform(new Vector2f(-244, 2116), new Vector2f(48, 48)));
        obj178_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(141)));
        this.addGameObjectToScene(obj178_sky);

        GameObject obj179_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2164), new Vector2f(48, 48)));
        obj179_sky_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(26)));
        this.addGameObjectToScene(obj179_sky_2);

        GameObject obj180_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(-196, 2164), new Vector2f(48, 48)));
        obj180_sky_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj180_sky_2);

        GameObject obj181_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(-148, 2164), new Vector2f(48, 48)));
        obj181_sky_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj181_sky_2);

        GameObject obj182_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(-100, 2164), new Vector2f(48, 48)));
        obj182_sky_2.addComponent(new SpriteRenderer(sprites_forest.getSprite(33)));
        this.addGameObjectToScene(obj182_sky_2);

        GameObject obj183_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2116), new Vector2f(48, 48)));
        obj183_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj183_sky_3);

        GameObject obj184_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(-196, 2116), new Vector2f(48, 48)));
        obj184_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj184_sky_3);

        GameObject obj185_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(-148, 2116), new Vector2f(48, 48)));
        obj185_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj185_sky_3);

        GameObject obj186_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(-100, 2116), new Vector2f(48, 48)));
        obj186_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj186_sky_3);

        GameObject obj187_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(284, 2068), new Vector2f(48, 48)));
        obj187_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj187_sky_3);

        GameObject obj188_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(332, 2068), new Vector2f(48, 48)));
        obj188_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj188_sky_3);

        GameObject obj189_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(380, 2068), new Vector2f(48, 48)));
        obj189_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj189_sky_3);

        GameObject obj190_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(428, 2068), new Vector2f(48, 48)));
        obj190_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj190_sky_3);

        GameObject obj191_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(476, 2068), new Vector2f(48, 48)));
        obj191_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj191_sky_3);

        GameObject obj192_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(524, 2068), new Vector2f(48, 48)));
        obj192_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj192_sky_3);

        GameObject obj193_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(572, 2068), new Vector2f(48, 48)));
        obj193_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj193_sky_3);

        GameObject obj194_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(620, 2068), new Vector2f(48, 48)));
        obj194_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj194_sky_3);

        GameObject obj195_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(668, 2068), new Vector2f(48, 48)));
        obj195_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj195_sky_3);

        GameObject obj196_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(716, 2068), new Vector2f(48, 48)));
        obj196_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj196_sky_3);

        GameObject obj197_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(764, 2068), new Vector2f(48, 48)));
        obj197_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj197_sky_3);

        GameObject obj198_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(812, 2068), new Vector2f(48, 48)));
        obj198_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj198_sky_3);

        GameObject obj199_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(860, 2068), new Vector2f(48, 48)));
        obj199_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj199_sky_3);

        GameObject obj200_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(908, 2068), new Vector2f(48, 48)));
        obj200_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj200_sky_3);

        GameObject obj201_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(956, 2068), new Vector2f(48, 48)));
        obj201_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj201_sky_3);

        GameObject obj202_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1004, 2068), new Vector2f(48, 48)));
        obj202_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj202_sky_3);

        GameObject obj203_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1052, 2068), new Vector2f(48, 48)));
        obj203_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj203_sky_3);

        GameObject obj204_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1100, 2068), new Vector2f(48, 48)));
        obj204_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj204_sky_3);

        GameObject obj205_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1148, 2068), new Vector2f(48, 48)));
        obj205_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj205_sky_3);

        GameObject obj206_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1196, 2068), new Vector2f(48, 48)));
        obj206_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj206_sky_3);

        GameObject obj207_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1244, 2068), new Vector2f(48, 48)));
        obj207_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj207_sky_3);

        GameObject obj208_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1292, 2068), new Vector2f(48, 48)));
        obj208_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj208_sky_3);

        GameObject obj209_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1340, 2068), new Vector2f(48, 48)));
        obj209_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj209_sky_3);

        GameObject obj210_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1388, 2068), new Vector2f(48, 48)));
        obj210_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj210_sky_3);

        GameObject obj211_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1436, 2068), new Vector2f(48, 48)));
        obj211_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj211_sky_3);

        GameObject obj212_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1484, 2068), new Vector2f(48, 48)));
        obj212_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj212_sky_3);

        GameObject obj213_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1532, 2068), new Vector2f(48, 48)));
        obj213_sky_3.addComponent(new SpriteRenderer(sprites_town.getSprite(45)));
        this.addGameObjectToScene(obj213_sky_3);

        GameObject obj214_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(284, 2164), new Vector2f(48, 48)));
        obj214_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(0)));
        this.addGameObjectToScene(obj214_sky_3);

        GameObject obj215_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(332, 2164), new Vector2f(48, 48)));
        obj215_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(19)));
        this.addGameObjectToScene(obj215_sky_3);

        GameObject obj216_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(380, 2164), new Vector2f(48, 48)));
        obj216_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(29)));
        this.addGameObjectToScene(obj216_sky_3);

        GameObject obj217_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(428, 2164), new Vector2f(48, 48)));
        obj217_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(59)));
        this.addGameObjectToScene(obj217_sky_3);

        GameObject obj218_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(476, 2164), new Vector2f(48, 48)));
        obj218_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(29)));
        this.addGameObjectToScene(obj218_sky_3);

        GameObject obj219_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(524, 2164), new Vector2f(48, 48)));
        obj219_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(39)));
        this.addGameObjectToScene(obj219_sky_3);

        GameObject obj220_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(572, 2164), new Vector2f(48, 48)));
        obj220_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(29)));
        this.addGameObjectToScene(obj220_sky_3);

        GameObject obj221_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(620, 2164), new Vector2f(48, 48)));
        obj221_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(39)));
        this.addGameObjectToScene(obj221_sky_3);

        GameObject obj222_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(668, 2164), new Vector2f(48, 48)));
        obj222_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(39)));
        this.addGameObjectToScene(obj222_sky_3);

        GameObject obj223_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(716, 2164), new Vector2f(48, 48)));
        obj223_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(29)));
        this.addGameObjectToScene(obj223_sky_3);

        GameObject obj224_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(764, 2164), new Vector2f(48, 48)));
        obj224_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(39)));
        this.addGameObjectToScene(obj224_sky_3);

        GameObject obj225_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(812, 2164), new Vector2f(48, 48)));
        obj225_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(29)));
        this.addGameObjectToScene(obj225_sky_3);

        GameObject obj226_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(860, 2164), new Vector2f(48, 48)));
        obj226_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(29)));
        this.addGameObjectToScene(obj226_sky_3);

        GameObject obj227_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(908, 2164), new Vector2f(48, 48)));
        obj227_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(59)));
        this.addGameObjectToScene(obj227_sky_3);

        GameObject obj228_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(956, 2164), new Vector2f(48, 48)));
        obj228_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(49)));
        this.addGameObjectToScene(obj228_sky_3);

        GameObject obj229_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1004, 2164), new Vector2f(48, 48)));
        obj229_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj229_sky_3);

        GameObject obj230_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1052, 2164), new Vector2f(48, 48)));
        obj230_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj230_sky_3);

        GameObject obj231_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1100, 2164), new Vector2f(48, 48)));
        obj231_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj231_sky_3);

        GameObject obj232_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1148, 2164), new Vector2f(48, 48)));
        obj232_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj232_sky_3);

        GameObject obj233_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1196, 2164), new Vector2f(48, 48)));
        obj233_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj233_sky_3);

        GameObject obj234_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1244, 2164), new Vector2f(48, 48)));
        obj234_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj234_sky_3);

        GameObject obj235_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1292, 2164), new Vector2f(48, 48)));
        obj235_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj235_sky_3);

        GameObject obj236_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1340, 2164), new Vector2f(48, 48)));
        obj236_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj236_sky_3);

        GameObject obj237_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1388, 2164), new Vector2f(48, 48)));
        obj237_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj237_sky_3);

        GameObject obj238_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1436, 2164), new Vector2f(48, 48)));
        obj238_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj238_sky_3);

        GameObject obj239_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1484, 2164), new Vector2f(48, 48)));
        obj239_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj239_sky_3);

        GameObject obj240_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1532, 2164), new Vector2f(48, 48)));
        obj240_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj240_sky_3);

        GameObject obj241_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2164), new Vector2f(48, 48)));
        obj241_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(25)));
        this.addGameObjectToScene(obj241_sky_3);

        GameObject obj262_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2212), new Vector2f(48, 48)));
        obj262_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj262_sky_3);

        GameObject obj263_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2260), new Vector2f(48, 48)));
        obj263_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj263_sky_3);

        GameObject obj264_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2308), new Vector2f(48, 48)));
        obj264_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj264_sky_3);

        GameObject obj265_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2356), new Vector2f(48, 48)));
        obj265_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj265_sky_3);

        GameObject obj266_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2404), new Vector2f(48, 48)));
        obj266_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(1)));
        this.addGameObjectToScene(obj266_sky_3);

        GameObject obj242_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2212), new Vector2f(48, 48)));
        obj242_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj242_sky_4);

        GameObject obj243_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2260), new Vector2f(48, 48)));
        obj243_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj243_sky_4);

        GameObject obj244_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2308), new Vector2f(48, 48)));
        obj244_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj244_sky_4);

        GameObject obj245_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2356), new Vector2f(48, 48)));
        obj245_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj245_sky_4);

        GameObject obj246_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2404), new Vector2f(48, 48)));
        obj246_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj246_sky_4);

        GameObject obj247_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2452), new Vector2f(48, 48)));
        obj247_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj247_sky_4);

        GameObject obj248_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2500), new Vector2f(48, 48)));
        obj248_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj248_sky_4);

        GameObject obj249_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2548), new Vector2f(48, 48)));
        obj249_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj249_sky_4);

        GameObject obj250_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2596), new Vector2f(48, 48)));
        obj250_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj250_sky_4);

        GameObject obj251_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2644), new Vector2f(48, 48)));
        obj251_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj251_sky_4);

        GameObject obj252_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2692), new Vector2f(48, 48)));
        obj252_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj252_sky_4);

        GameObject obj253_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2740), new Vector2f(48, 48)));
        obj253_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj253_sky_4);

        GameObject obj254_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2788), new Vector2f(48, 48)));
        obj254_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj254_sky_4);

        GameObject obj255_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2836), new Vector2f(48, 48)));
        obj255_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj255_sky_4);

        GameObject obj256_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2884), new Vector2f(48, 48)));
        obj256_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj256_sky_4);

        GameObject obj257_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2932), new Vector2f(48, 48)));
        obj257_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj257_sky_4);

        GameObject obj258_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 2980), new Vector2f(48, 48)));
        obj258_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj258_sky_4);

        GameObject obj259_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 3028), new Vector2f(48, 48)));
        obj259_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj259_sky_4);

        GameObject obj260_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 3076), new Vector2f(48, 48)));
        obj260_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj260_sky_4);

        GameObject obj261_sky_4 = new GameObject("Object sky", new Transform(new Vector2f(-244, 3124), new Vector2f(48, 48)));
        obj261_sky_4.addComponent(new SpriteRenderer(sprites_forest.getSprite(12)));
        this.addGameObjectToScene(obj261_sky_4);

        //overall_sky //rightside
        GameObject obj41_sky = new GameObject("Object 41 sky", new Transform(new Vector2f(1628, 148), new Vector2f(48, 48)));
        obj41_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj41_sky);

        GameObject obj42_sky = new GameObject("Object 42 sky", new Transform(new Vector2f(1580, 148), new Vector2f(48, 48)));
        obj42_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj42_sky);

        GameObject obj43_sky = new GameObject("Object 43 sky", new Transform(new Vector2f(1628, 196), new Vector2f(48, 48)));
        obj43_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj43_sky);

        GameObject obj44_sky = new GameObject("Object 44 sky", new Transform(new Vector2f(1580, 196), new Vector2f(48, 48)));
        obj44_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj44_sky);

        GameObject obj45_sky = new GameObject("Object 45 sky", new Transform(new Vector2f(1628, 244), new Vector2f(48, 48)));
        obj45_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj45_sky);

        GameObject obj46_sky = new GameObject("Object 46 sky", new Transform(new Vector2f(1580, 244), new Vector2f(48, 48)));
        obj46_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj46_sky);

        GameObject obj47_sky = new GameObject("Object 47 sky", new Transform(new Vector2f(1628, 292), new Vector2f(48, 48)));
        obj47_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj47_sky);

        GameObject obj48_sky = new GameObject("Object 48 sky", new Transform(new Vector2f(1580, 292), new Vector2f(48, 48)));
        obj48_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj48_sky);

        GameObject obj49_sky = new GameObject("Object 49 sky", new Transform(new Vector2f(1628, 340), new Vector2f(48, 48)));
        obj49_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj49_sky);

        GameObject obj50_sky = new GameObject("Object 50 sky", new Transform(new Vector2f(1580, 340), new Vector2f(48, 48)));
        obj50_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj50_sky);

        GameObject obj51_sky = new GameObject("Object 51 sky", new Transform(new Vector2f(1628, 388), new Vector2f(48, 48)));
        obj51_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj51_sky);

        GameObject obj52_sky = new GameObject("Object 52 sky", new Transform(new Vector2f(1580, 388), new Vector2f(48, 48)));
        obj52_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj52_sky);

        GameObject obj53_sky = new GameObject("Object 53 sky", new Transform(new Vector2f(1628, 436), new Vector2f(48, 48)));
        obj53_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj53_sky);

        GameObject obj54_sky = new GameObject("Object 54 sky", new Transform(new Vector2f(1580, 436), new Vector2f(48, 48)));
        obj54_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj54_sky);

        GameObject obj55_sky = new GameObject("Object 55 sky", new Transform(new Vector2f(1628, 484), new Vector2f(48, 48)));
        obj55_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj55_sky);

        GameObject obj56_sky = new GameObject("Object 56 sky", new Transform(new Vector2f(1580, 484), new Vector2f(48, 48)));
        obj56_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj56_sky);

        GameObject obj57_sky = new GameObject("Object 57 sky", new Transform(new Vector2f(1628, 532), new Vector2f(48, 48)));
        obj57_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj57_sky);

        GameObject obj58_sky = new GameObject("Object 58 sky", new Transform(new Vector2f(1580, 532), new Vector2f(48, 48)));
        obj58_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj58_sky);

        GameObject obj59_sky = new GameObject("Object 59 sky", new Transform(new Vector2f(1628, 580), new Vector2f(48, 48)));
        obj59_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj59_sky);

        GameObject obj60_sky = new GameObject("Object 60 sky", new Transform(new Vector2f(1580, 580), new Vector2f(48, 48)));
        obj60_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj60_sky);

        GameObject obj61_sky = new GameObject("Object 61 sky", new Transform(new Vector2f(1628, 628), new Vector2f(48, 48)));
        obj61_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj61_sky);

        GameObject obj62_sky = new GameObject("Object 62 sky", new Transform(new Vector2f(1580, 628), new Vector2f(48, 48)));
        obj62_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj62_sky);

        GameObject obj63_sky = new GameObject("Object 63 sky", new Transform(new Vector2f(1628, 676), new Vector2f(48, 48)));
        obj63_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj63_sky);

        GameObject obj64_sky = new GameObject("Object 64 sky", new Transform(new Vector2f(1580, 676), new Vector2f(48, 48)));
        obj64_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj64_sky);

        GameObject obj65_sky = new GameObject("Object 65 sky", new Transform(new Vector2f(1628, 724), new Vector2f(48, 48)));
        obj65_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj65_sky);

        GameObject obj66_sky = new GameObject("Object 66 sky", new Transform(new Vector2f(1580, 724), new Vector2f(48, 48)));
        obj66_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj66_sky);

        GameObject obj67_sky = new GameObject("Object 67 sky", new Transform(new Vector2f(1628, 772), new Vector2f(48, 48)));
        obj67_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj67_sky);

        GameObject obj68_sky = new GameObject("Object 68 sky", new Transform(new Vector2f(1580, 772), new Vector2f(48, 48)));
        obj68_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj68_sky);

        GameObject obj69_sky = new GameObject("Object 69 sky", new Transform(new Vector2f(1628, 820), new Vector2f(48, 48)));
        obj69_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj69_sky);

        GameObject obj70_sky = new GameObject("Object 70 sky", new Transform(new Vector2f(1580, 820), new Vector2f(48, 48)));
        obj70_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj70_sky);

        GameObject obj71_sky = new GameObject("Object 70 sky", new Transform(new Vector2f(1628, 868), new Vector2f(48, 48)));
        obj71_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj71_sky);

        GameObject obj72_sky = new GameObject("Object 71 sky", new Transform(new Vector2f(1580, 868), new Vector2f(48, 48)));
        obj72_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(16)));
        this.addGameObjectToScene(obj72_sky);

        GameObject obj73_sky = new GameObject("Object 73 sky", new Transform(new Vector2f(1628, 916), new Vector2f(48, 48)));
        obj73_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj73_sky);

        GameObject obj74_sky = new GameObject("Object 74 sky", new Transform(new Vector2f(1580, 916), new Vector2f(48, 48)));
        obj74_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj74_sky);

        GameObject obj75_sky = new GameObject("Object 75 sky", new Transform(new Vector2f(1628, 964), new Vector2f(48, 48)));
        obj75_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj75_sky);

        GameObject obj76_sky = new GameObject("Object 76 sky", new Transform(new Vector2f(1580, 964), new Vector2f(48, 48)));
        obj76_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj76_sky);

        GameObject obj77_sky = new GameObject("Object 77 sky", new Transform(new Vector2f(1628, 1012), new Vector2f(48, 48)));
        obj77_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj77_sky);

        GameObject obj78_sky = new GameObject("Object 78 sky", new Transform(new Vector2f(1580, 1012), new Vector2f(48, 48)));
        obj78_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj78_sky);

        GameObject obj79_sky = new GameObject("Object 79 sky", new Transform(new Vector2f(1628, 1060), new Vector2f(48, 48)));
        obj79_sky.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj79_sky);

        GameObject obj80_sky = new GameObject("Object 80 sky", new Transform(new Vector2f(1580, 1060), new Vector2f(48, 48)));
        obj80_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(129)));
        this.addGameObjectToScene(obj80_sky);

        GameObject obj181_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1108), new Vector2f(48, 48)));
        obj181_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(107)));
        this.addGameObjectToScene(obj181_sky);

        GameObject obj182_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1156), new Vector2f(48, 48)));
        obj182_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj182_sky);

        GameObject obj183_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1204), new Vector2f(48, 48)));
        obj183_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj183_sky);

        GameObject obj184_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1252), new Vector2f(48, 48)));
        obj184_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj184_sky);

        GameObject obj185_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1300), new Vector2f(48, 48)));
        obj185_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj185_sky);

        GameObject obj186_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1348), new Vector2f(48, 48)));
        obj186_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj186_sky);

        GameObject obj187_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1444), new Vector2f(48, 48)));
        obj187_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj187_sky);

        GameObject obj199_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1396), new Vector2f(48, 48)));
        obj199_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj199_sky);

        GameObject obj188_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1492), new Vector2f(48, 48)));
        obj188_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj188_sky);

        GameObject obj189_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1540), new Vector2f(48, 48)));
        obj189_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj189_sky);

        GameObject obj190_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1588), new Vector2f(48, 48)));
        obj190_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj190_sky);

        GameObject obj191_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1636), new Vector2f(48, 48)));
        obj191_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj191_sky);

        GameObject obj192_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1684), new Vector2f(48, 48)));
        obj192_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj192_sky);

        GameObject obj193_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1732), new Vector2f(48, 48)));
        obj193_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj193_sky);

        GameObject obj194_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1780), new Vector2f(48, 48)));
        obj194_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj194_sky);

        GameObject obj195_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1828), new Vector2f(48, 48)));
        obj195_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj195_sky);

        GameObject obj196_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1876), new Vector2f(48, 48)));
        obj196_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj196_sky);

        GameObject obj197_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1924), new Vector2f(48, 48)));
        obj197_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj197_sky);

        GameObject obj198_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 1972), new Vector2f(48, 48)));
        obj198_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj198_sky);

        GameObject obj200_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 2020), new Vector2f(48, 48)));
        obj200_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj200_sky);

        GameObject obj201_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 2068), new Vector2f(48, 48)));
        obj201_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj201_sky);

        GameObject obj202_sky = new GameObject("Object sky", new Transform(new Vector2f(1580, 2116), new Vector2f(48, 48)));
        obj202_sky.addComponent(new SpriteRenderer(sprites_town.getSprite(37)));
        this.addGameObjectToScene(obj202_sky);

        GameObject obj203_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(1532, 2116), new Vector2f(48, 48)));
        obj203_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj203_sky_2);

        GameObject obj204_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(1484, 2116), new Vector2f(48, 48)));
        obj204_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj204_sky_2);

        GameObject obj205_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(1436, 2116), new Vector2f(48, 48)));
        obj205_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj205_sky_2);

        GameObject obj206_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(1388, 2116), new Vector2f(48, 48)));
        obj206_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj206_sky_2);

        GameObject obj207_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(1340, 2116), new Vector2f(48, 48)));
        obj207_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj207_sky_2);

        GameObject obj208_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(1292, 2116), new Vector2f(48, 48)));
        obj208_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj208_sky_2);

        GameObject obj209_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(1244, 2116), new Vector2f(48, 48)));
        obj209_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj209_sky_2);

        GameObject obj210_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(1196, 2116), new Vector2f(48, 48)));
        obj210_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj210_sky_2);

        GameObject obj211_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(1148, 2116), new Vector2f(48, 48)));
        obj211_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj211_sky_2);

        GameObject obj212_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(1100, 2116), new Vector2f(48, 48)));
        obj212_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj212_sky_2);

        GameObject obj213_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(1052, 2116), new Vector2f(48, 48)));
        obj213_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj213_sky_2);

        GameObject obj214_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(1004, 2116), new Vector2f(48, 48)));
        obj214_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj214_sky_2);

        GameObject obj215_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(956, 2116), new Vector2f(48, 48)));
        obj215_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj215_sky_2);

        GameObject obj216_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(908, 2116), new Vector2f(48, 48)));
        obj216_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj216_sky_2);

        GameObject obj217_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(860, 2116), new Vector2f(48, 48)));
        obj217_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj217_sky_2);

        GameObject obj218_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(812, 2116), new Vector2f(48, 48)));
        obj218_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj218_sky_2);

        GameObject obj219_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(764, 2116), new Vector2f(48, 48)));
        obj219_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj219_sky_2);

        GameObject obj220_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(716, 2116), new Vector2f(48, 48)));
        obj220_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj220_sky_2);

        GameObject obj221_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(668, 2116), new Vector2f(48, 48)));
        obj221_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj221_sky_2);

        GameObject obj222_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(620, 2116), new Vector2f(48, 48)));
        obj222_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj222_sky_2);

        GameObject obj223_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(572, 2116), new Vector2f(48, 48)));
        obj223_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj223_sky_2);

        GameObject obj224_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(524, 2116), new Vector2f(48, 48)));
        obj224_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj224_sky_2);

        GameObject obj225_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(476, 2116), new Vector2f(48, 48)));
        obj225_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj225_sky_2);

        GameObject obj226_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(428, 2116), new Vector2f(48, 48)));
        obj226_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj226_sky_2);

        GameObject obj227_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(380, 2116), new Vector2f(48, 48)));
        obj227_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj227_sky_2);

        GameObject obj228_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(332, 2116), new Vector2f(48, 48)));
        obj228_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj228_sky_2);

        GameObject obj229_sky_2 = new GameObject("Object sky", new Transform(new Vector2f(284, 2116), new Vector2f(48, 48)));
        obj229_sky_2.addComponent(new SpriteRenderer(sprites_town.getSprite(112)));
        this.addGameObjectToScene(obj229_sky_2);

        GameObject obj242_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2212), new Vector2f(48, 48)));
        obj242_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj242_sky_3);

        GameObject obj243_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2260), new Vector2f(48, 48)));
        obj243_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj243_sky_3);

        GameObject obj244_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2308), new Vector2f(48, 48)));
        obj244_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj244_sky_3);

        GameObject obj245_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2356), new Vector2f(48, 48)));
        obj245_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj245_sky_3);

        GameObject obj246_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2404), new Vector2f(48, 48)));
        obj246_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj246_sky_3);

        GameObject obj247_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2452), new Vector2f(48, 48)));
        obj247_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj247_sky_3);

        GameObject obj248_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2500), new Vector2f(48, 48)));
        obj248_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj248_sky_3);

        GameObject obj249_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2548), new Vector2f(48, 48)));
        obj249_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj249_sky_3);

        GameObject obj250_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2596), new Vector2f(48, 48)));
        obj250_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj250_sky_3);

        GameObject obj251_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2644), new Vector2f(48, 48)));
        obj251_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj251_sky_3);

        GameObject obj252_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2692), new Vector2f(48, 48)));
        obj252_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj252_sky_3);

        GameObject obj253_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2740), new Vector2f(48, 48)));
        obj253_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj253_sky_3);

        GameObject obj254_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2788), new Vector2f(48, 48)));
        obj254_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj254_sky_3);

        GameObject obj255_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2836), new Vector2f(48, 48)));
        obj255_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj255_sky_3);

        GameObject obj256_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2884), new Vector2f(48, 48)));
        obj256_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj256_sky_3);

        GameObject obj257_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2932), new Vector2f(48, 48)));
        obj257_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj257_sky_3);

        GameObject obj258_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 2980), new Vector2f(48, 48)));
        obj258_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj258_sky_3);

        GameObject obj259_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 3028), new Vector2f(48, 48)));
        obj259_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj259_sky_3);

        GameObject obj260_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 3076), new Vector2f(48, 48)));
        obj260_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj260_sky_3);

        GameObject obj261_sky_3 = new GameObject("Object sky", new Transform(new Vector2f(1580, 3124), new Vector2f(48, 48)));
        obj261_sky_3.addComponent(new SpriteRenderer(sprites_forest.getSprite(10)));
        this.addGameObjectToScene(obj261_sky_3);

        //top floor
        GameObject tree_9 = new GameObject("tree_9", new Transform(new Vector2f(750, 50), new Vector2f(199, 199)), false, true);
        tree_9.addComponent(new SpriteRenderer(treeset.getSprite(2)));
        this.addGameObjectToScene(tree_9);

        GameObject tree_8 = new GameObject("tree_8", new Transform(new Vector2f(100, 30), new Vector2f(199, 199)), false, true);
        tree_8.addComponent(new SpriteRenderer(treeset.getSprite(2)));
        this.addGameObjectToScene(tree_8);

        GameObject tree_7 = new GameObject("tree_7", new Transform(new Vector2f(200, 148), new Vector2f(199, 199)), false, true);
        tree_7.addComponent(new SpriteRenderer(treeset.getSprite(2)));
        this.addGameObjectToScene(tree_7);

        GameObject tree_6 = new GameObject("tree_6", new Transform(new Vector2f(1340, 148), new Vector2f(199, 199)), false, true);
        tree_6.addComponent(new SpriteRenderer(treeset.getSprite(2)));
        this.addGameObjectToScene(tree_6);

        GameObject tree_10 = new GameObject("tree_6", new Transform(new Vector2f(1500, 148), new Vector2f(199, 199)), false, true);
        tree_10.addComponent(new SpriteRenderer(treeset.getSprite(0)));
        this.addGameObjectToScene(tree_10);

        GameObject obj67 = new GameObject("Object 67 crave", new Transform(new Vector2f(1340, 148), new Vector2f(48, 48)), false, true);
        obj67.addComponent(new SpriteRenderer(sprites_forest.getSprite(2)));
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
        obj63.addComponent(new SpriteRenderer(sprites_forest.getSprite(61)));
        this.addGameObjectToScene(obj63);

        GameObject obj62 = new GameObject("Object 62 crave", new Transform(new Vector2f(1196, 196), new Vector2f(48, 48)));
        obj62.addComponent(new SpriteRenderer(sprites_forest.getSprite(2)));
        this.addGameObjectToScene(obj62);

        GameObject obj61 = new GameObject("Object 61 crave", new Transform(new Vector2f(1148, 196), new Vector2f(48, 48)));
        obj61.addComponent(new SpriteRenderer(sprites_forest.getSprite(40)));
        this.addGameObjectToScene(obj61);

        GameObject obj60 = new GameObject("Object 60 crave", new Transform(new Vector2f(1100, 196), new Vector2f(48, 48)));
        obj60.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj60);

        GameObject obj59_c = new GameObject("Object 59 crave", new Transform(new Vector2f(1052, 148), new Vector2f(48, 48)));
        obj59_c.addComponent(new SpriteRenderer(sprites_forest.getSprite(60)));
        this.addGameObjectToScene(obj59_c);

        GameObject obj58 = new GameObject("Object 58 crave", new Transform(new Vector2f(1052, 196), new Vector2f(48, 48)));
        obj58.addComponent(new SpriteRenderer(sprites_forest.getSprite(42)));
        this.addGameObjectToScene(obj58);

        GameObject obj57 = new GameObject("Object 57 crave", new Transform(new Vector2f(1004, 148), new Vector2f(48, 48)));
        obj57.addComponent(new SpriteRenderer(sprites_forest.getSprite(18)));
        this.addGameObjectToScene(obj57);

        GameObject obj56 = new GameObject("Object 56 crave", new Transform(new Vector2f(1004, 196), new Vector2f(48, 48)));
        obj56.addComponent(new SpriteRenderer(sprites_forest.getSprite(0)));
        this.addGameObjectToScene(obj56);

        GameObject obj55 = new GameObject("Object 55 crave", new Transform(new Vector2f(908, 148), new Vector2f(48, 48)));
        obj55.addComponent(new SpriteRenderer(sprites_forest.getSprite(0)));
        this.addGameObjectToScene(obj55);

        GameObject obj54 = new GameObject("Object 54 crave", new Transform(new Vector2f(956, 148), new Vector2f(48, 48)));
        obj54.addComponent(new SpriteRenderer(sprites_forest.getSprite(24)));
        this.addGameObjectToScene(obj54);

        GameObject tree_3 = new GameObject("tree_dry3", new Transform(new Vector2f(616, 290), new Vector2f(199, 199)));
        tree_3.addComponent(new SpriteRenderer(treeset.getSprite(2)));
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

        GameObject tree = new GameObject("tree", new Transform(new Vector2f(-292, 145), new Vector2f(199, 199)), false, true);
        tree.addComponent(new SpriteRenderer(treeset.getSprite(2)));
        this.addGameObjectToScene(tree);

        GameObject tree_2 = new GameObject("tree", new Transform(new Vector2f(100, 145), new Vector2f(199, 199)), false, true);
        tree_2.addComponent(new SpriteRenderer(treeset.getSprite(0)));
        this.addGameObjectToScene(tree_2);

//        GameObject tree_dry1 = new GameObject("tree", new Transform(new Vector2f(25, 145), new Vector2f(104, 135)), false, true);
//        tree_dry1.addComponent(new SpriteRenderer(tree_dry.getSprite(0)));
//        this.addGameObjectToScene(tree_dry1);

//        GameObject tree_5 = new GameObject("tree222", new Transform(new Vector2f(540, 145), new Vector2f(109, 41)), false, true);
//        tree_5.addComponent(new SpriteRenderer(tree_dry4.getSprite(0)));
//        this.addGameObjectToScene(tree_5);

        GameObject obj39 = new GameObject("Object 39 crave", new Transform(new Vector2f(332, 148), new Vector2f(48, 48)));
        obj39.addComponent(new SpriteRenderer(sprites_forest.getSprite(0)));
        this.addGameObjectToScene(obj39);

        GameObject obj40 = new GameObject("Object 40 crave", new Transform(new Vector2f(380, 196), new Vector2f(48, 48)));
        obj40.addComponent(new SpriteRenderer(sprites_forest.getSprite(0)));
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
        obj_1.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
        this.addGameObjectToScene(obj_1);

        GameObject obj = new GameObject("Object", new Transform(new Vector2f(-244, 100), new Vector2f(48, 48)));
        obj.addComponent(new SpriteRenderer(sprites_forest.getSprite(23)));
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
        obj27.addComponent(new SpriteRenderer(sprites_forest.getSprite(2)));
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
        obj37.addComponent(new SpriteRenderer(sprites_forest.getSprite(25)));
        this.addGameObjectToScene(obj37);

        GameObject obj38 = new GameObject("Object 38", new Transform(new Vector2f(1628, 100), new Vector2f(48, 48)));
        obj38.addComponent(new SpriteRenderer(sprites_forest.getSprite(11)));
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

        //
        GameObject obj1_ev = new GameObject("Object 1 ev", new Transform(new Vector2f(290, 148), new Vector2f(48, 48)), false, true);
        obj1_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(62)));
        this.addGameObjectToScene(obj1_ev);

        GameObject obj2_ev = new GameObject("Object ev", new Transform(new Vector2f(278, 148), new Vector2f(48, 48)), false, true);
        obj2_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(63)));
        this.addGameObjectToScene(obj2_ev);

        GameObject obj3_ev = new GameObject("Object ev", new Transform(new Vector2f(270, 148), new Vector2f(48, 48)), false, true);
        obj3_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(62)));
        this.addGameObjectToScene(obj3_ev);

        GameObject obj4_ev = new GameObject("Object ev", new Transform(new Vector2f(230, 148), new Vector2f(48, 48)), false, true);
        obj4_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(64)));
        this.addGameObjectToScene(obj4_ev);

        GameObject obj5_ev = new GameObject("Object ev", new Transform(new Vector2f(220, 148), new Vector2f(48, 48)), false, true);
        obj5_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(62)));
        this.addGameObjectToScene(obj5_ev);

        GameObject obj6_ev = new GameObject("Object ev", new Transform(new Vector2f(-120, 148), new Vector2f(48, 48)), false, true);
        obj6_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(62)));
        this.addGameObjectToScene(obj6_ev);

        GameObject obj7_ev = new GameObject("Object ev", new Transform(new Vector2f(-100, 148), new Vector2f(48, 48)), false, true);
        obj7_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(64)));
        this.addGameObjectToScene(obj7_ev);

        GameObject obj8_ev = new GameObject("Object ev", new Transform(new Vector2f(-80, 148), new Vector2f(48, 48)), false, true);
        obj8_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(62)));
        this.addGameObjectToScene(obj8_ev);

        GameObject obj9_ev = new GameObject("Object ev", new Transform(new Vector2f(1000, 520), new Vector2f(48, 48)), false, true);
        obj9_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(48)));
        this.addGameObjectToScene(obj9_ev);

        GameObject obj10_ev = new GameObject("Object ev", new Transform(new Vector2f(1048, 520), new Vector2f(48, 48)), false, true);
        obj10_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj10_ev);

        GameObject obj11_ev = new GameObject("Object ev", new Transform(new Vector2f(1096, 520), new Vector2f(48, 48)), false, true);
        obj11_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj11_ev);

        GameObject obj12_ev = new GameObject("Object ev", new Transform(new Vector2f(1144, 520), new Vector2f(48, 48)), false, true);
        obj12_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj12_ev);

        GameObject obj13_ev = new GameObject("Object ev", new Transform(new Vector2f(1192, 520), new Vector2f(48, 48)), false, true);
        obj13_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj13_ev);

        GameObject obj14_ev = new GameObject("Object ev", new Transform(new Vector2f(1240, 520), new Vector2f(48, 48)), false, true);
        obj14_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(32)));
        this.addGameObjectToScene(obj14_ev);

        GameObject obj15_ev = new GameObject("Object ev", new Transform(new Vector2f(1288, 520), new Vector2f(48, 48)), false, true);
        obj15_ev.addComponent(new SpriteRenderer(sprites_forest.getSprite(58)));
        this.addGameObjectToScene(obj15_ev);

        GameObject obj16_ev = new GameObject("Object ev", new Transform(new Vector2f(1199, 568), new Vector2f(199, 199)), false, true);
        obj16_ev.addComponent(new SpriteRenderer(treeset.getSprite(0)));
        this.addGameObjectToScene(obj16_ev);

        for (GameObject g : gameObjects){
            if (!g.getIsPlayer() && !g.getIsBackground()){
                g.addComponent(new BoxBounds(new Vector2f(48,48)));
            }
        }

    }

    private void loadResources() {
        AssetPool.getShader("assets/shaders/default.glsl");

        AssetPool.addSpritesheet("assets/images/Background.png",
                new Spritesheet(AssetPool.getTexture("assets/images/Background.png"),
                        2048, 1080, 1, 0));
        AssetPool.addSpritesheet("assets/images/Tileset_town.png",
                new Spritesheet(AssetPool.getTexture("assets/images/Tileset_town.png"),
                        48, 48, 182, 0));
        AssetPool.addSpritesheet("assets/images/Slime_Walk.png",
                new Spritesheet(AssetPool.getTexture("assets/images/Slime_Walk.png"),
                        32, 32, 5, 0));
        AssetPool.addSpritesheet("assets/images/character/Woodcutter_idle.png",
                new Spritesheet(AssetPool.getTexture("assets/images/character/Woodcutter_idle.png"),
                        40, 40, 4, 0));
        AssetPool.addSpritesheet("assets/images/Tileset_forest.png",
                new Spritesheet(AssetPool.getTexture("assets/images/Tileset_forest.png"),
                        32, 32, 69, 0));
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
        AssetPool.addSpritesheet("assets/images/object/Grass/2.png",
                new Spritesheet(AssetPool.getTexture("assets/images/object/Grass/2.png"),
                        17, 16, 1, 0));
        AssetPool.addSpritesheet("assets/images/grass_mo.png",
                new Spritesheet(AssetPool.getTexture("assets/images/grass_mo.png"),
                        85, 18, 5, 0));
        AssetPool.addSpritesheet("assets/images/Background-2.jpg",
                new Spritesheet(AssetPool.getTexture("assets/images/Background-2.jpg"),
                        1920, 1080, 1, 0));
        AssetPool.addSpritesheet("assets/images/Background-3.jfif",
                new Spritesheet(AssetPool.getTexture("assets/images/Background-3.jfif"),
                        3840, 2160, 1, 0));
        AssetPool.addSpritesheet("assets/images/tree_set.png",
                new Spritesheet(AssetPool.getTexture("assets/images/tree_set.png"),
                        199, 199, 3, 0));
    }

    private int spriteIndex = 0;
    private float spriteFlipTime = 0.14f;
    private float spriteFlipTimeLeft = 0.0f;
    private float speed = 200f, gravity=100f, speedXl=0,speedXr=0, speedY=0;
    private boolean isCollideR = false, isCollideL = false;

    public void setisCollider(boolean collideR){
        this.isCollideR = collideR;
    }
    public void setisCollidel(boolean collideL){
        this.isCollideL = collideL;
    }

    @Override
    public void update(float dt) {

            knightidle.transform.position.y -= gravity*dt;
            spriteFlipTimeLeft -= dt;
            if (spriteFlipTimeLeft <= 0) {
                spriteFlipTimeLeft = spriteFlipTime;
                spriteIndex++;
                if (spriteIndex > 4) {
                    spriteIndex = 0;
                }
                knightidle.getComponent(SpriteRenderer.class).setSprite(kidlesheet.getSprite(spriteIndex));
            }

        if (KeyListener.isKeyPressed(GLFW_KEY_RIGHT)) { //This reference by grids (32 grids), No! it's not a pixel!...
            speedXl = 0;
            speedXr += 1f;
            if (speedXr >=180f){
                speedXr = 180f;
            }
            if (!isCollideR) {
                knightidle.transform.position.x += speedXr * dt;
            }else {
                speedXr =0;
            }
            if (camera.position.x < 360 && knightidle.transform.position.x < 648 && knightidle.transform.position.x > 50){
                camera.position.x = knightidle.transform.position.x-300;
            }else{
                camera.position.x += 0;

                }
        } else if (KeyListener.isKeyPressed(GLFW_KEY_LEFT)) {
            speedXr = 0;
            speedXl += 1f;
            if (speedXl >=180f){
                speedXl = 180f;
            }
            if (!isCollideL) {
                knightidle.transform.position.x -= speedXl * dt;
            }else {
               speedXl =0;
            }
            if (camera.position.x > -250 && knightidle.transform.position.x < 648 && knightidle.transform.position.x > 50){
                camera.position.x = knightidle.transform.position.x-300;

            }else{
                camera.position.x += 0;

                }
        }else{
                speedXl = 0f;
                speedXr = 0f;

        }
        if (KeyListener.isKeyPressed(GLFW_KEY_SPACE)) {
            if (knightidle.onGround){
            knightidle.transform.position.y += 6500*dt;
            knightidle.onGround = false;
            }
            if (camera.position.y<2400 && knightidle.transform.position.y < 2600 && knightidle.transform.position.y > 50){
                camera.position.y = knightidle.transform.position.y-150;

            }else{
                camera.position.y += 0;

                }
        } else if (KeyListener.isKeyPressed(GLFW_KEY_DOWN)) {

            if (camera.position.y>0  && knightidle.transform.position.y < 2600 && knightidle.transform.position.y > 50){
            camera.position.y = knightidle.transform.position.y-150;

            }else{
                camera.position.y -= 0;

        }


        }


        for (GameObject go : this.gameObjects) {
            go.update(dt);
            if (!go.getIsPlayer() && !go.getIsBackground()){
                if (Bounds.checkCollision(go, knightidle)){
                    BoxBounds.resolveCollision(go.getComponent(Bounds.class), knightidle);
                }
            }

        }

        this.renderer.render();
    }


}