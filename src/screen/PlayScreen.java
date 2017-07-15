/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen;

import com.bruynhuis.galago.screen.AbstractScreen;
import com.bruynhuis.galago.ui.Label;

/**
 *
 * @author Luiz
 */
public class PlayScreen extends AbstractScreen{

    @Override
    protected void init() {
        
         Label heading = new Label(hudPanel, "Hello from play screen");
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
