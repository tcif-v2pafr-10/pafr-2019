package nl.pafr.composite;

public class Main {
	public static StringBuffer compositeBuilder = new StringBuffer();

	public static void main(String[] args) {
		Directory music = new Directory("MUSIC");
		File track1 = new File("Don't wary, be happy.mp3");
		music.add(track1);
		Directory scorpions = new Directory("SCORPIONS");
		music.add(scorpions);
		Directory dio = new Directory("DIO");
		scorpions.add(dio);
		File track2 = new File("track2.m3u");
		File track3 = new File("Wind of change.mp3");
		File track4 = new File("Big city night.mp3");
		File track5 = new File("Rainbow in the dark.mp3");
		music.add(track2);
		scorpions.add(track3);
		scorpions.add(track4);
		dio.add(track5);

		music.ls(compositeBuilder);
	}
}
