package main;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ScaledImage {
	public static ImageIcon scale(String path) {
		BufferedImage scaledImage;
		BufferedImage ogImage;
		ImageIcon icon = null;
		try {
			ogImage = ImageIO.read(new FileInputStream(System.getProperty("user.dir")+"/src/game/board/images/"+path));
			scaledImage = new BufferedImage(50, 50, ogImage.getType());
			Graphics2D g = scaledImage.createGraphics();
			g.drawImage(ogImage, 0, 0, 50, 50, null);
			g.dispose();
			icon = new ImageIcon(scaledImage);
		} catch (Exception e) {
			System.out.println("Failed to read image");
			System.out.println(e);
			e.printStackTrace();
			System.exit(-1);
		}
		return icon;
	}
}
