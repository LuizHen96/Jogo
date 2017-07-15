package mygame;

import com.bruynhuis.galago.app.Base2DApplication;
import com.bruynhuis.galago.resource.EffectManager;
import com.bruynhuis.galago.resource.ModelManager;
import com.bruynhuis.galago.resource.ScreenManager;
import com.bruynhuis.galago.resource.SoundManager;
import com.bruynhuis.galago.resource.TextureManager;
import screen.CreditsScreen;
import screen.MenuScreen;
import screen.PlayScreen;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends Base2DApplication {

    public Main() {
        super("Heroes of the Dungeon", 800, 600, "playersavefile.save", null, null, false);
    }
    
    public static void main(String[] args) {
        new Main();
        
    }

    @Override
    protected void preInitApp() {
        //Chamado antes carregamento do jogo
    }

    @Override
    protected void postInitApp() {
         //Chamado depois carregamento do jogo
         showScreen("menu");
    }

    @Override
    protected boolean isPhysicsEnabled() {
        return true;
    }

    @Override
    protected void initScreens(ScreenManager sm) {
        sm.loadScreen("menu", new MenuScreen());
        sm.loadScreen("play", new PlayScreen());
        sm.loadScreen("credits", new CreditsScreen());
    }

    @Override
    public void initModelManager(ModelManager mm) {
    
    }

    @Override
    protected void initSound(SoundManager sm) {
    
    }

    @Override
    protected void initEffect(EffectManager em) {
    
    }

    @Override
    protected void initTextures(TextureManager tm) {
    
    }

}
