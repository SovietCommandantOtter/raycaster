package xyz.sovietcommandantotter.raycaster;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Map {
	private File mapFile;
	private String path;
	private int x, y;
	private char[][] map; // Array that holds map

	/**
	 * @param path The path of the .txt file that contains the map
	 * @param x    The length of the map on the x axis if viewed from top down.
	 * @param y    The length of the map on the Y axis if viewed from top down.
	 */

	public Map(String path, int x, int y) {
		this.path = path;
		this.x = x;
		this.y = y;
		this.map = new char[this.x][this.y];
		this.mapFile = new File(this.path);

	}

	public char[][] loadMap() throws IOException {
		try (InputStream in = new FileInputStream(this.mapFile);
				BufferedReader buffer = new BufferedReader(new FileReader(this.path))) {
			String currentLine;
			for (int yLevel = 0; yLevel < this.y; yLevel++) {
				currentLine = buffer.readLine();
				for (int e = 0; e < this.x; e++) {
					map[e][yLevel] = currentLine.charAt(e);
				}
			}
		}
		return map;
	}
}
