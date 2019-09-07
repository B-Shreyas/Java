package hashMap;

public class HomeTheater implements MediaPlayer {

	@Override
	public void powerOn() {
		
		System.out.println("HomeTheater is ON");
		
	}

	@Override
	public void playMusic() {
		
		System.out.println("The music track is playing");
		
	}

	@Override
	public void playNextTrack(String nextTrack) {
		
		System.out.println(">||" + nextTrack + " on Home Theater ");
		
	}

	@Override
	public boolean isPlaying() {
		
		return isPlaying();
	}

	@Override
	public void stop() {
		
		System.out.println("The HomeTheater's music has stopped");
		
	}

}
