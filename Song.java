/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.*;

/**
 *
 * @author Subham
 * 
 
 */
public class Song {
    
    //instance variables
    
    private String SongName; //initilize the songName
    private String ArtistName;//initilize the ArtistName
    private int Durationinseconds;//initilize the duration in second
    private int yearreleased;//initilize the year released

    //intiize the deatails of the artist name and adding other information
    public Song(String SongName, String ArtistName, int yearreleased,int Durationinseconds) {
        this.SongName = SongName;
        this.ArtistName = ArtistName;
        this.Durationinseconds = Durationinseconds;
        this.setYear(yearreleased);
    }
    
    
    //sets the year by validating or throws error
    private void setYear(int yearreleased){
        
        if(yearreleased <=Calendar.getInstance().get(Calendar.YEAR)){
             this.yearreleased = yearreleased;
        }else{
            
            
            throw new IllegalArgumentException( "year must be less then or equal to the current year");
        }
        
    }

    public String getSongName() {
        return SongName; // return the Songname
    }

    public String getArtistName() {
        return ArtistName; //return the artistname
    }

    public int getDurationinseconds() {
        return Durationinseconds;//return the duration f song in seconds
    }

    public int getYearreleased() {
        return yearreleased; //return the year in which the song releaased
    }
    
     /**
     * This method will return the songs name by artist
     */
    public String toString()
    {
        return this.SongName + "by" + this.ArtistName; //return the songname by the artist name
    }
    
    
    
}