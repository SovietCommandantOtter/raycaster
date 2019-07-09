package xyz.sovietcommandantotter.raycaster;

import java.io.IOException;

public class test {
	private static Map maps = new Map("C:\\Users\\Jack P\\Desktop\\e.txt", 2,2);
	private static char[][] map;
	public static void main(String[] args) {
		//System.out.print(map[0][0]);
		try {
			map = maps.loadMap();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print(map[0][0]);
		System.out.println(map[1][0]);
		System.out.print(map[0][1]);
		System.out.println(map[1][1]);

	}
}
