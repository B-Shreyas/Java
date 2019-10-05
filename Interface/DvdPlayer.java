

public class DvdPlayer implements MediaPlayer {

	@Override
	public boolean powerOn() {
		
		System.out.println("Dvd Player is ON");
		return true;
	}

	@Override
	public void playMusic() {
		
		System.out.println("The music track is playing");
		
	}

	@Override
	public void playNextTrack(String nextTrack) {
	
		System.out.println(">>||" + nextTrack + " on DVD Player");
		
	}

	@Override
	public boolean isPlaying() {
		
		return isPlaying();
	}

	@Override
	public void stop() {
		
		System.out.println("The Music has stopped");
		
	}

	@Override
	public void addMusic(String songName, String singer, float songLength) {
		// TODO Auto-generated method stub
		
	}

}
