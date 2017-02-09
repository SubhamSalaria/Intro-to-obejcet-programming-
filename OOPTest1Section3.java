/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;

/**
 *
 * @author subham
 */
public class OOPTest1Section3 {
    public static void main(String[] args)
    {
        Song song1 = new Song("Primary Stage","JavaFX'ers",2016,175);
        Song song2 = new Song("The Java Boogie","Code-R",2014,222);
        Song song3 = new Song("Loopin'","Abstract People", 2012,102);
        
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        
        /**
         * Uncomment these commands once the methods are created.
         */    
        displaySongs(songs);
//        
        System.out.printf("The longest song is: %s%n", getLongestSong(songs));
    }
    
    
    /**
     * This method is called displaySongs.  It will receive an ArrayList of Song 
     * objects and display their attributes to the screen. The display will come in the form of 
     * Song [#]: [song name by artist], released in [year released], it is [duration] seconds long.
     * 
     * It should show 1 song per line.
     */
    public static void displaySongs(ArrayList<Song> songs){
        
        for(Song s:songs){
            
            System.out.println(s +", released in"+s.getYearreleased()+",it is"+s.getDurationinseconds()+"second long");
            
        }
        
    }
    
    

     /**
      * This method is called getLongestSong.  It accepts an ArrayList of Song objects. 
      * The method will loop over all the Song objects in the ArrayList and return 
      * the Song object that has the longest duration.
      */
    
     public static int getLongestSong(ArrayList<Song> songs){
         
        int max=0;
        
        for(Song s:songs){
            
            if(s.getDurationinseconds()>max){
                max = s.getDurationinseconds();
            }
            
        }
        
        return max; //return the max song duration
        
    }
}
