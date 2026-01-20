package main.java.grid;
import java.io.*;
import java.util.*;
public class GridMover {
	int height;
	int width;
	int startRow = 0;
	int startCol = 0;
	Map<String, int[]> map = new HashMap<>();
	
	public void initialize() {
		map.put("U", new int[] {-1,0});
		map.put("D", new int[] {1,0});
		map.put("L", new int[] {0,-1});
		map.put("R", new int[] {0,1});
		map.put("UL", new int[] {-1,-1});
		map.put("UR", new int[] {-1,1});
		map.put("DL", new int[] {1,-1});
		map.put("DR", new int[] {1,1});
		
	}
	
    // 이곳에 GridMover 클래스의 구현이 들어갑니다.
	public GridMover(int height, int width){
		this.height = height;
		this.width = width;
	}
	
	public GridMover(int height, int width, int startRow, int startCol) {
		this.height = height;
		this.width = width;
		this.startRow = startRow;
		this.startCol = startCol;
	}
	
	
	public int[] getPosition() {
		return new int[] {startRow, startCol};
		
	}
	
	public void move(String command) {
		int[] m = map.get(command);
		int nx = m[0] + startRow;
		int ny = m[1] + startCol;
		if (0<=nx & nx<)
	}
	
	
	
	
}
