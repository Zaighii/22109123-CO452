public class Songs {
    private String songs;
    private String artist;
    private int playcount;
    
 

   
    //Constructor
    public Songs(String songs, String artist, int playcount)
    {
         this.songs= songs;
         this.artist= artist;
         this.playcount= playcount;
   
    }
   
    //print method
    public void print()
    {
       System.out.print("SONG:"+ this.songs + "\t");
       System.out.print("ARTIST: "+this.artist + "\t");
       System.out.println("PLAYCOUNT: "+this.playcount + "\t");
    }

    public int getPlaycount() {
        return this.playcount;
       
    }

   

}