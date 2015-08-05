package week4;

public class Song {
	public String name;
	public String artist;
	public int duration;
	public String album;
	
	public Song(String name, String artist, int duration, String album){
		this.name = name;
		this.artist = artist;
		this.duration = duration;
		this.album = album;
	}
	
	public String toString(){
		return name + " by " + artist + " from the album " + album + " with a duration of " + duration 
				+ " seconds";
	}
}
