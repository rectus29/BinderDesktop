package com.rectus.binder;
/*-----------------------------------------------------*/
/*      _____           _               ___   ___      */
/*     |  __ \         | |             |__ \ / _ \     */
/*     | |__) |___  ___| |_ _   _ ___     ) | (_) |    */
/*     |  _  // _ \/ __| __| | | / __|   / / \__, |    */
/*     | | \ \  __/ (__| |_| |_| \__ \  / /_   / /     */
/*     |_|  \_\___|\___|\__|\__,_|___/ |____| /_/      */
/*                                                     */
/*                Date: 24/10/2016 14:06               */
/*                 All right reserved                  */
/*                  Class main                         */
/*-----------------------------------------------------*/

import java.awt.*;
import java.awt.event.KeyEvent;

public class main {

	public static void main(String[] args) {

		try {
			Robot robot = new Robot();

			// Simulate a key press
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);

		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}
