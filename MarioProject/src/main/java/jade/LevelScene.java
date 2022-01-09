package jade;

import util.Time;

public class LevelScene extends Scene{

    public LevelScene(){
        System.out.println("Inside Level Scene");
        System.out.println(Time.getTime());
        Window.get().r = 1f;
        Window.get().g = 1f;
        Window.get().b = 1f;
    }

    @Override
    public void update(float dt) {

    }
}
