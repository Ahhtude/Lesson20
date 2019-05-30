package org.xml.demo.ui.figures;

import java.awt.Graphics;

/**
 *
 * @author alitvinov
 */
public class Circle extends Figure {
    
    private int startX, startY, height, width;

    public Circle(int startX, int startY, int currentX, int currentY) {        
        this.startX = Integer.min(startX, currentX);
        this.startY = Integer.min(startY, currentY);
        this.height = this.width = (int) (Math.pow(startX - currentX, 2) + Math.pow(startY - currentY, 2));
    }
        
    @Override
    public void draw(Graphics g, boolean filled) {
        if (filled) {
            g.fillOval(startX, startY, width, height);
        } else {
            g.drawOval(startX, startY, width, height);
        }
    }
    
    
}