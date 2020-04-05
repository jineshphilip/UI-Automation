package MyPackage;

import java.awt.*;

import javax.swing.*;



public class ImageViewer {
	public static final  String Jinesh = "My Name";

	public static void main(String[] args) {
		EventQueue.invokeLater(() ->{
			JFrame frame = new JFrame();
			frame.setTitle("ImageViewer");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
		});
		System.out.println(Jinesh);

	}

}
