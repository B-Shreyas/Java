package hashMap;

public class CdPlayer implements MediaPlayer {

	@Override
	public void powerOn() {
		
		System.out.println("CD Player is On");
		
	}

	@Override
	public void playMusic() {
		
		System.out.println("The music track is playing");
	}

	@Override
	public void playNextTrack(String nextTrack) {
		
		System.out.println(">||" + nextTrack + " on CD Player");
		
	}

	@Override
	public boolean isPlaying() {
		return isPlaying();
	}

	@Override
	public void stop() {
		
		System.out.println("The music track has stopped ");
		}

}
