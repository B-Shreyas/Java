package hashMap;

public class MusicMain {

	public static void main(String[] args) {
		
		MediaPlayer musicDirectory;
		
		musicDirectory = new CdPlayer();
		musicDirectory.powerOn();
		musicDirectory.playMusic();
		musicDirectory.playNextTrack(" 1st track is playing");
		musicDirectory.stop();
		
		System.out.println("*************************************");
		
		musicDirectory = new DvdPlayer();
		musicDirectory.powerOn();
		musicDirectory.playMusic();
		musicDirectory.playNextTrack(" 2nd track is playing");
		musicDirectory.stop();
		
		System.out.println("*************************************");
		
		musicDirectory = new HomeTheater();
		musicDirectory.powerOn();
		musicDirectory.playMusic();
		musicDirectory.playNextTrack(" 3rd track is playing");
		musicDirectory.stop();
		
		System.out.println("*************************************");

	}

}
