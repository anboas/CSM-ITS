package assignment01;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

/***********************************************************************
'Project:           Assignment 01
'Programmer:     	Adam Boas
'Company Info:  	anboas@gmail.com (240) 561-8173
'Date:              Sept 14, 2014
'Description:      	Problem Number 01 Chapter 14
'
'	FollowMe Applet
'
'	Write an applet that initially displays the word "Hello" in the
'	center of a window. The word should follow the mouse cursor when
'	it is moved inside the window
'
'  HONOR CODE: I pledge that this program represents my own program code.
'  I received help from NO ONE in designing and debugging my program.
'
'**********************************************************************/

public class ANB_P02 extends JApplet {
	private static final long serialVersionUID = 1L;

	// First x/y set to start at
	private int x = 100, y = 100;

	// String to draw
	//private String outputString = "Hello";

	/**
	 * Default Constructor
	 */
	public ANB_P02() {
		// Invokes MouseMotionListener
		addMouseMotionListener(new MouseMoved());
	}

	/**
	 * MouseMotionListener
	 */
	private class MouseMoved implements MouseMotionListener {
		@Override
		public void mouseMoved(MouseEvent e) {

			// Get current mouse X/Y
			x = e.getX();
			y = e.getY();
			System.out.println(x + " " + y);

			// Repaint's the current graphics with new x/y values
			repaint();
		}

		@Override
		public void mouseDragged(MouseEvent e) {
		}
	}

	/**
	 * Overrides paint()
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		String output = Integer.toString(x) + " " + Integer.toString(y);
		g.drawString(output, x, y);
		g.fillOval(100, 100, 50, 50);
	}
}
