package com.zero.rythmx;

import com.badlogic.gdx.Screen;

public abstract class baseScreen implements Screen{

    protected MainGame myGame;

    public baseScreen(MainGame game){
        this.myGame = game;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
