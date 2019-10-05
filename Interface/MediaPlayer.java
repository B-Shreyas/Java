

public interface MediaPlayer {
	
	boolean powerOn();
	void addMusic(String songName, String singer, float songLength);
	void playMusic();
	void playNextTrack(String nextTrack);
	boolean isPlaying();
	void stop();

}
