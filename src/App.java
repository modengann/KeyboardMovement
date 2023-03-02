import javadraw.*;

public class App extends Window{

    Oval player;
    public static void main(String[] args) throws Exception {
        Window.open();
    }

    public void start(){
        player = new Oval(screen, 50, 50, 50, 50);

        while(true){

            screen.update();
            screen.sleep(1/30.0);
        }
    }


    public void keyDown(Key key){
        if(key == Key.UP){
            player.move(0, -5);
        }

        if(key == Key.DOWN){
            player.move(0,5);
        }

    }
}
