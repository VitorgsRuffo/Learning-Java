import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Music[] musics = new Music[6];
		musics[0] = new Music("ACDC", "Hells Bells", "Back in Black");
		musics[1] = new Music("ACDC", "Shoot to Thrill", "Back in Black");
		musics[2] = new Music("ACDC", "Back in Black", "Back in Black");
		musics[3] = new Music("Skrillex", "The Devil's Den", "Bangarang");
		musics[4] = new Music("Skrillex", "Summit", "Bangarang");
		musics[5] = new Music("Skrillex", "Right in", "Bangarang");

		
		List<Music> musicList = new LinkedList(Arrays.asList(musics));
		System.out.println("Music list before sorting:");
		printMusicCollection(musicList);
		
		
		
		System.out.printf("Sort music list by:\n1 - title\n2 - artist.\n");
		Scanner input = new Scanner(System.in);
		int musicSortingOption = input.nextInt();
		
		String comparisonProperty = "";
		if(musicSortingOption == 1) 
			comparisonProperty ="title";
	
		else if (musicSortingOption == 2) 
			comparisonProperty ="artist";
		
		
		
		MusicSorter musicSorter = new MusicSorter();
		musicSorter.setComparisonMode(comparisonProperty);
		musicSorter.sort(musicList);
	
		
		System.out.println("Music list after sorting:");
		printMusicCollection(musicList);
	}
	
	private static void printMusicCollection(Collection<Music> c) {
		int i = 1;
		for(Music m : c) { 
			//Music music = (Music) m;
			System.out.printf("\n%d - %s\n", i, m);
			i++;
		}
		System.out.println();	
	}
}