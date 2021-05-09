package dev.monopoly.states;

import java.awt.Graphics;

import dev.monopoly.Handler;
import dev.monopoly.gfx.Assets;
import dev.monopoly.ui.UIManager;

public class MenuState extends State{
	
	private UIManager uiManager;
	
	public MenuState(Handler handler) {
		super(handler);	
		uiManager = new UIManager(handler);
		
	}

	@Override
	public void update() {
		if(State.getState() == this) {
			handler.getMouseManager().setUIManager(uiManager);
		}
		uiManager.update();
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.gameBoard, 0, 0, 1000, 1000,null);
		uiManager.render(g);
	}

}
