/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package screen;

import com.bruynhuis.galago.screen.AbstractScreen;
import com.bruynhuis.galago.ui.Label;
import com.bruynhuis.galago.ui.button.TouchButton;
import com.bruynhuis.galago.ui.listener.TouchButtonAdapter;

/**
 *
 * @author Luiz
 */
public class MenuScreen extends AbstractScreen{

    private Label heading;
    private TouchButton playButton;
    private TouchButton optionsButton;
    private TouchButton creditsButton;
     
    @Override
    protected void init() {
    
        heading = new Label(hudPanel, "Heroes of The Dungeon", 30, 600, 60);
        heading.centerTop(0, 10);
        
        playButton = new TouchButton(hudPanel, "play_button", "Play");
        playButton.centerAt(0, 80);
        playButton.addTouchButtonListener(new TouchButtonAdapter(){
            @Override
            public void doTouchUp(float touchX, float touchY, float tpf, String uid) {
                if(isActive()){
                    showScreen("play");
                }
            }
        });
        
        optionsButton = new TouchButton(hudPanel, "options_button", "Options");
        optionsButton.center();
               
        creditsButton = new TouchButton(hudPanel, "credits_button", "Credits");
        creditsButton.centerAt(0, -80); 
        creditsButton.addTouchButtonListener(new TouchButtonAdapter(){
            @Override
            public void doTouchUp(float touchX, float touchY, float tpf, String uid) {
                if(isActive()){
                    showScreen("credits");
                }
            }
        });
    }

    @Override
    protected void load() {
        
    }

    @Override
    protected void show() {
   
    }

    @Override
    protected void exit() {
        
    }

    @Override
    protected void pause() {
    
    }
    
}
