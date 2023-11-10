import helpers.ConsoleColours;

public class App
{
    public static void main(String[] args)
    {
        System.out.println (" Zaighii CW1 ");
        System.out.println(":)");
        String name = InputReader.getString("Enter your name > ");
        System.out.println("Hello " + name);
        String q1 = InputReader.getString("Do you want to play some music?  yes/no ?>");

         if (q1.equalsIgnoreCase("yes") ) {
        System.out.println("This is the music list. ");
        Songs  ObsessedWithYou = new Songs("Obsessed With You", "Central Cee", 121071982);
        Songs  Doja = new Songs("Doja", "Central Cee", 136407811);
        Songs LetGO = new Songs("Let Go", "Central Cee", 59837163);
        Songs Khabib = new Songs("Khabib", "Central Cee", 29048875);
        Songs StraightBackToIt  = new Songs("Straight Back To It", "Central Cee", 15256815);
        Songs Ungrateful = new Songs("Ungrateful", "Central Cee", 28436266);
        Songs Bunda = new Songs("Bunda", "Central Cee", 1552971);
        Songs Mrs = new Songs( "Mrs", "Central Cee", 5359060 );
        Songs NoPain = new Songs("No Pain", "Central Cee", 1328556);
        Songs Fraud = new Songs("Fraud", "Central Cee" , 11570672);
        Songs OneUp = new Songs("One Up", "Central Cee", 423611);
        Songs Loading = new Songs("Loading", "Central Cee", 157874343);
        Songs MeAndYou = new Songs("Me & You", "Central Cee", 3627683);
        Songs Chapters = new Songs("Chapters", "Central Cee", 1391814);
     
        ArrayList<Songs> songs = new ArrayList<Songs>();
         songs.add(ObsessedWithYou);
         songs.add(Doja);
         songs.add(LetGO);
         songs.add(Khabib);
         songs.add(StraightBackToIt);
         songs.add(Ungrateful);
         songs.add(Bunda);
         songs.add(Mrs);
         songs.add(NoPain);
         songs.add(Fraud);
         songs.add(OneUp);
         songs.add(Loading);
         songs.add(Me&You);
         songs.add(Chapters);

int id = 1;
         for(Songs song : songs){
            System.out.print("ID: " + id+"\t");
            song.print();
            id++;
         }
         String q2 = InputReader.getString("Do you want to include a song? >");
         if (q2.equalsIgnoreCase("yes") ) {
         
    String songsadd = InputReader.getString("Put the song's name here : >");
    String artistadd = InputReader.getString("Enter the artist's name here : >");
    int playcountadd = InputReader.getInt("Enter the song's play count : >");
    System.out.print("SONG:" + songsadd +"\t");
    System.out.print("ARTIST:" + artistadd +"\t");
    System.out.println("PLAYCOUNT:" + playcountadd +"\t");
    Songs newsong = new Songs(songsadd, artistadd, playcountadd);
    songs.add(newsong);
    for (Songs i : songs) {
      i.print();
    }
   
  }
  else {
    System.out.println("okay");
}
 

    String q3 =InputReader.getString("Is there a song that you would like removed yes/no ? ");
    if (q3.equalsIgnoreCase("yes") ) {
   
    int q4 =InputReader.getInt("Choose the songs in order from 0 to 14>");
    if ( q4 <= 14  ) {
    String q5 = InputReader.getString("Do you really want to delete the song number" + q4 + "? >");
    if (q5.equalsIgnoreCase("yes") ) {
    songs.remove(q4);
    int idr = 1;
    for (Songs i : songs) {
      System.out.print("ID: "+ idr+ "\t");
      idr++;
      i.print();
                          }
                        }
                        }
  else {
    System.out.println("Please enter a number between 0 and 14");
    int q8 =InputReader.getInt("Sort the songs by number from 0 to 14>");
    if ( q8 <= 14  ) {
      String q9 = InputReader.getString("Do you really want to delete the song number" + q8 + "? >");
      if (q9.equalsIgnoreCase("yes") ) {
      }
      songs.remove(q8);
      for (Songs i : songs) {
        System.out.print("ID: ");
        i.print();
}
}
}


    }
    else {
      System.out.println("Okay :)");
      }

   try (Scanner choose = new Scanner(System.in)) {
    System.out.println("Kindly provide the total number of plays for the songs you are searching for :  ");
    int playcount = choose.nextInt();
   
   System.out.println("The songs are :");

   for(Songs song : songs){
    if ( playcount <= song.getPlaycount()){
      song.print();
    }

   }
  }
 


}
else {
  System.out.println("Good bye.");
}
}}