package com.zero.rythmx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.zero.rythmx.Actors.Player;

public class mainGameScreen extends baseScreen {

    public mainGameScreen(MainGame game){

        super(game);

    }

    private Stage myStage;
    private Player myPlayer;

    @Override
    public void show() {

        myStage = new Stage();
        myPlayer = new Player();
        myStage.addActor(myPlayer);
        myPlayer.setPosition(20,100);
    }
    @Override
    public void hide() {
        myStage.dispose();
    }


    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 5, 9, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        myStage.act();
        myStage.draw();
    }
}
