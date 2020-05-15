package ru.gb.jtwo.alesson.online;

import java.awt.*;

public class BackGround extends Sprite {
    Color color = new Color((int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255));
    BackGround(){
        halfHeight = 600;
        halfWidth = 800;
    }

    @Override
    public void render(MainCanvas canvas, Graphics g) {
        g.setColor(color);
        g.fillRect(0,0, (int) getWidth(), (int) getHeight());
    }
}
