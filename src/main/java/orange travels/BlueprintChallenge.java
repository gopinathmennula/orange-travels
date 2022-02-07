package orange travels;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import orange travels.gui.BlueprintFrame;

/**
 * This class is the starting point for this application. It opens a "nice" GUI with
 * settings, a game field and the high scores.
 * 
 * @author Stef Schulz
 * @since 1.0.0
 */

public class BlueprintChallenge {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		SwingUtilities.invokeLater(() -> createAndShowGui());
	}

	private static void createAndShowGui() {
		BlueprintFrame mainFrame = new BlueprintFrame();
		mainFrame.start();
		mainFrame.pack();
	}

}
