package _07_cow_timer;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.io.IOException;
import javax.swing.JApplet;

public class CowTimer {

	private int seconds;

	public void setTime(int seconds) {
		this.seconds = seconds;
		System.out.println("Cow time set to " + seconds + " s.");
	}

	CowTimer(int seconds) {
		this.seconds = seconds;
	}

	/* 4. Complete the main method of the CowTimerRunner class */

	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for the number
		 * of minutes using Thread.sleep(int milliseconds).
		 */

		for (int i = seconds; i > 0; i--) {
			System.out.println(i);
		}

		/*
		 * 3. When the timer is finished, use the playSound method to play a moo sound.
		 * You can use the .wav file in the default package, or you can download one
		 * from freesound.org, then drag it into the default package.
		 */

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
