package songplaylistapp;

public class song {
	String title;
	double duration;
	
	public song(String title, double duration) {
		this.title = title;
		this.duration = duration;
	
	}
    public song() {
	
    }
    public String getTitle() 
    {
    	return title;
    }
    public double getDuration() {
    	return duration;
    }
    @Override 
    
    public String toString() {
    return"Song{" +
           "title='"+ title + '\'' +
           ", duration=" + duration +
           '}';
    }
 }
