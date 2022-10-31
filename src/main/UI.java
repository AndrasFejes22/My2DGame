package main;

import object.OBJ_Key;

import java.awt.*;
import java.awt.image.BufferedImage;

public class UI {

    GamePanel gp;
    Font arial_40;
    BufferedImage keyImage;
    public boolean messageOn = false;
    public boolean gameFinished = false;
    public String message = "";
    public int messageCounter = 0;


    public UI(GamePanel gp) {
        this.gp = gp;
        arial_40 = new Font("Arial", Font.PLAIN, 40);
        OBJ_Key key = new OBJ_Key();
        keyImage = key.image;
    }

    public void showMessage(String text){
        message = text;
        messageOn = true;
    }

    public void draw(Graphics2D g2){

        if(gameFinished){

            g2.setFont(arial_40);
            g2.setColor(Color.orange);

            String text;
            int textLenght;
            int x;
            int y;

            text = "You found the treasure!";
            textLenght = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();

            x = gp.screenWidth/2 - textLenght/2;
            y = gp.screenHeight/2 - (gp.tileSize * 3);

            g2.drawString(text, x, y);

        } else {
            g2.setFont(arial_40);
            g2.setColor(Color.orange);

            g2.drawImage(keyImage, gp.tileSize / 2, gp.tileSize / 2, gp.tileSize, gp.tileSize, null);
            g2.drawString("x " + gp.player.hasKey, 74, 65);
            //g2.drawString("Boots = " + gp.player.hasBoots, 25, 105);

            //message
            if(messageOn){
                g2.setFont(g2.getFont().deriveFont(30F));
                g2.drawString(message , gp.tileSize/2, gp.tileSize*2);

                messageCounter++;
                if(messageCounter > 150){
                    messageCounter = 0;
                    messageOn = false;
                }
            }
        }



    }
}
