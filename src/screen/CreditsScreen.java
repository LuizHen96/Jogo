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
public class CreditsScreen extends AbstractScreen{
    private TouchButton menuButton;

    @Override
    protected void init() {

        Label heading = new Label(hudPanel, "Creditos:");
        heading.centerTop(-200, 100);
        Label nome1 = new Label(hudPanel, "Luiz Henrique C. da Silva", 20, 600, 60);
        nome1.setPosition(0, 70);
        Label nome2 = new Label(hudPanel, "Flavio M. Shinzato", 20, 600, 60);
        nome2.setPosition(0, 40);
        Label nome3 = new Label(hudPanel, "Jessica Abe", 20, 600, 60);
        nome3.setPosition(0, 10);
        
        
        
        menuButton = new TouchButton(hudPanel, "menu_button", "Voltar");
        menuButton.centerBottom(280, 0);
        menuButton.addTouchButtonListener(new TouchButtonAdapter(){
            @Override
            public void doTouchUp(float touchX, float touchY, float tpf, String uid) {
                if(isActive()){
                    showScreen("menu");
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
