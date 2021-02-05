
public class MusicSorter extends Sorter {
	
	private String comparisonMode;
	
	MusicSorter(){
		this.comparisonMode = "title";
	}
	
	MusicSorter(String comparisonMode){
		this.comparisonMode = comparisonMode;
	}
	
	public void setComparisonMode(String comparisonMode) {
		this.comparisonMode = comparisonMode;
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		Music music1 = (Music)o1;
		Music music2 = (Music)o2;
		
		String compareProperty1 = "", compareProperty2 = "";
		
		if(comparisonMode.equals("title")) {
			compareProperty1 = music1.getTitle();
			compareProperty2 = music2.getTitle();
		}
		else if(comparisonMode.equals("artist")) {
			compareProperty1 = music1.getArtist();
			compareProperty2 = music2.getArtist();
		}
			
		return compareProperty1.compareToIgnoreCase(compareProperty2);
		
	}
	
}