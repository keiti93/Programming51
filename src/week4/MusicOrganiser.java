package week4;

import java.util.Vector;

public class MusicOrganiser {
	public Vector<Song> songs;
	public int size;

	public MusicOrganiser() {
		songs = new Vector<Song>();
	}

	public void addSong(Song s) {
		songs.add(s);
		size++;
	}

	public int getCount() {
		return size;
	}

	public Vector<String> getAlbums() {
		Vector<String> albums = new Vector<String>();

		for (int i = 0; i < size; i++) {
			Song song = songs.get(i);
			if (!albums.contains(song.album)) {
				albums.add(song.album);
			}
		}
		return albums;

	}

	public int getAlbumsCount() {
		int result = 0;
		Vector<String> albums = new Vector<String>();

		for (int i = 0; i < size; i++) {
			Song song = songs.get(i);
			if (!albums.contains(song.album)) {
				albums.add(song.album);
				result++;
			}
		}
		return result;
	}

	public Vector<Song> getAlbumSongs(String albumName) {
		Vector<Song> result = new Vector<Song>();

		for (int i = 0; i < size; i++) {
			if (albumName == songs.get(i).album) {
				result.add(songs.get(i));
			}
		}
		return result;
	}

	public String getNumberOfAlbumSongs(String albumName) {
		String result = "";
		int counter = 0;

		for (int i = 0; i < size; i++) {
			if (albumName == songs.get(i).album) {
				counter++;
				result = "(" + counter + ")";
			}
		}
		return result;
	}

	public Vector<String> getAlbumsAndSongs() {

		Vector<String> result = new Vector<String>();
		Vector<String> albums = new Vector<String>();

		for (int i = 0; i < size; i++) {
			Song song = songs.get(i);
			if (!albums.contains(song.album)) {
				albums.add(song.album);
				result.add(song.album + getNumberOfAlbumSongs(song.album));
			}
		}
		return result;
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < size; i++) {
			result += songs.get(i) + " ";
		}
		return result;
	}

	public static void main(String[] args) {
		MusicOrganiser mo = new MusicOrganiser();
		mo.addSong(new Song("The real Slim Shady", "Eminem", 213,
				"The Marshall Mathers LP"));
		mo.addSong(new Song("The Way I Am", "Eminem", 183,
				"The Marshall Mathers LP"));
		mo.addSong(new Song("When I'm Gone", "Eminem", 256,
				"Curtain Call: The Hits"));
		mo.addSong(new Song("Lose Yourself", "Eminem", 221,
				"Curtain Call: The Hits"));

		Vector<String> songs = mo.getAlbumsAndSongs();

		for(int i = 0; i < songs.size(); i++) {
		    System.out.println(songs.get(i));
		}
		
	}
}
