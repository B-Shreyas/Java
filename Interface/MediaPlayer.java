package hashMap;

public interface MediaPlayer {
	
	void powerOn();
	void playMusic();
	void playNextTrack(String nextTrack);
	boolean isPlaying();
	void stop();

}
