package com.zero.rythmx;

import com.badlogic.gdx.Game;

public class MainGame extends Game {

	public MainGame(){

	}

	@Override
	public void create () {

	    setScreen(new mainGameScreen(this));

	}

	@Override
	public void render () {

	}
	
	@Override
	public void dispose () {

	}
}
