package musicDev.lesson;

import org.jfugue.player.Player;//import Jfugue class

public class Lesson1 {
	public static void main(String[] args) {
		musicCreate1();
	}
	
	public static void musicCreate1() {
		//Create music string
		//The scale of C major
		String music = "C Rh C# Rh C";
		
		//Get a JFUgue5.0 Player
		Player player = new Player();
		
		//Play music 
		player.play(music);
	}
	
	public static void musicCreate2() {
		//Put notes of C major to String
		//Octave and Duration include
		String[] c_major_scale = new String[] {
			"C4q", "D4q", "E4q", "F4q", "G4q", "A4q", "B4q", "C5q"
			//0      1      2      3      4      5      6      7
		};//String of C major
		
		//Create pattern of index of Cmajor
		int pattern[] = new int[] {
				0,1,2,3,4,5,6,7
		};
		
		//music string
		String music = "";
		
		//Write music parttern
		for(int i = 0; i < pattern.length; i++) {
			music += c_major_scale[pattern[i]] + " ";
		}
		
		//Write music parttern backward
		for(int i = 0; i < pattern.length; i++) {
			music += c_major_scale[pattern[pattern.length-i-1]] + " ";
		}
		
		//get Jfugue5 Player
		Player player = new Player();
		//Play music
		player.play(music);
	}
	
	public static void musicCreate3() {
		//Put notes of C major to String
		//Octave and Duration include
		String[] c_major_scale = new String[] {
			"C4q", "D4q", "E4q", "F4q", "G4q", "A4q", "B4q"
			//0      1      2      3      4      5      6   
		};//String of C major
		
		//Create pattern of index of Cmajor
		int pattern[] = new int[] {
				0,1,2,3,4,5,6
		};
		
		//music string
		String music = "";
		
		//ADDING SOME CHORD
		// CHORD is the combination of 3 note ex: C+E+G
		//Write music parttern
		for(int i = 0; i < pattern.length; i++) {
			if(i%2 == 0) {
				music += c_major_scale[pattern[i]] + "+" +
						c_major_scale[(pattern[i]+2) % c_major_scale.length] + "+" +
						c_major_scale[(pattern[i]+4) % c_major_scale.length] + " ";
			}else {
				music += c_major_scale[pattern[i]] + " ";
			}
		}
		
		//Write music parttern backward
		for(int i = 0; i < pattern.length; i++) {
			if(i%2 == 0) {
				music += c_major_scale[pattern[i]] + "+" +
						c_major_scale[(pattern[pattern.length-i-1]+2) % c_major_scale.length] + "+" +
						c_major_scale[(pattern[pattern.length-i-1]+4) % c_major_scale.length] + " ";
			}else {
				music += c_major_scale[pattern[pattern.length-i-1]] + " ";
			}
		}
		//get Jfugue5 Player
		Player player = new Player();
		//Play music
		player.play(music);
	}
}
