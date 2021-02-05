
public class Music {
	
	private final String artist;
	private final String title;
	private final String album;
	
	Music(String artist, String title, String album){
		this.artist = artist;
		this.title = title;
		this.album = album;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAlbum() {
		return this.album;
	}
	
	public String toString() {
		return String.format("\"%s - %s | %s\"", this.artist, 
												 this.title,
												 this.album);
	}
}