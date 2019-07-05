package xyz.sovietcommandantotter.raycaster;

public class Map {
	private String path;
	private int x, y;
	
	/**
	 * 
	 * @param path           The path of the .txt file that contains the map
	 * @param x              The length of the map on the x axis if viewed from top down.
	 * @param y              The length of the map on the Y axis if viewed from top down.
	 */
	
	public Map(String path, int x, int y) 
	{
		this.path = path;
		this.x = x;
		this.y = y;
	}
}
