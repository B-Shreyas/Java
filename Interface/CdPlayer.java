

public class CdPlayer implements MediaPlayer {


	@Override
	public boolean powerOn() {
		
		System.out.println("CD Player is On");
		return true;
	}


	@Override
	public void playMusic() {
		
		System.out.println("The music track is playing");
	}

	@Override
	public void playNextTrack(String nextTrack) {
		
		System.out.println(">>||" + nextTrack + " on CD Player");
		
	}

	@Override
	public boolean isPlaying() {
		return isPlaying();
	}

	@Override
	public void stop() {
		
		System.out.println("The music track has stopped ");
		}


	@Override
	public void addMusic(String songName, String singer, float songLength) {
		// TODO Auto-generated method stub
		
	}

}
