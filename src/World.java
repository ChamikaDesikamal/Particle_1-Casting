public class World {
    String name;
    World(){
        System.out.println("World object Created!");
    }
    void proccess(){
        System.out.println("Earth can Rotate!");
    }
}
class Earth extends World{
    int area;
    Earth(){
        System.out.println("Earth object created!");
    }

    @Override
    void proccess() {
        System.out.println("Earth is a World!");
    }
}
class TestCasting{
    public static void main(String[] args) {
        World w = new Earth();
        w.name = "Earth";
        System.out.println(w.name);
        Earth e =(Earth) w;
        e.area = 510;
        System.out.println(e.name);
        System.out.println(e.area);
        e.proccess();
    }
}