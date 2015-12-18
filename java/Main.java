/*
 * @brief SAMU - the potential ancestor of developmental robotics chatter bots
 *
 * @file Main.java
 * @author  Norbert Bátfai <nbatfai@gmail.com>
 * @author2 Gyügyei Tamás
 * @version 0.0.1
 *
 * @section LICENSE
 *
 * Copyright (C) 2015 Norbert Bátfai, batfai.norbert@inf.unideb.hu
 * Copyright (C) 2015 Gyügyei Tamás
 *
 * Gyügyei Tamás wrote the Java version, from Norbert Bátfai's C++ version
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @section DESCRIPTION
 * SAMU
 * 
 * The main purpose of this project is to allow the evaluation and 
 * verification of the results of the paper entitled "A disembodied 
 * developmental robotic agent called Samu Bátfai". It is our hope 
 * that Samu will be the ancestor of developmental robotics chatter 
 * bots that will be able to chat in natural language like humans do.
 *
 */


class Main {
	
	public static void main(String[] args) {
		// Do not remove this copyright notice!
		System.out.print( "This program will try to provide a disembodied DevRob agent called Samu Bátfai.\n"
		  + "Copyright (C) 2015 Norbert Bátfai\n"
		  + "License GPLv3+: GNU GPL version 3 or later <http://gnu.org/licenses/gpl.html>\n"
		  + "This is free software: you are free to change and redistribute it.\n"
		  + "There is NO WARRANTY, to the extent permitted by law.\n\n");


		System.out.print("The prenatal development phase has started." + "\n");
		System.out.print("The prenatal development phase has finished." + "\n");


		String[] sentence = {
	  	"A rare black squirrel has become a regular visitor to a suburban garden", "This is a car", "This car is mine",
	  	"I have a little car", "The sky is blue", "The little brown bear has eaten all of the honey",
	  	"I love Samu"
		};

		int k = 0;

		for (Samu s = new Samu(); s.run();) {
			double summa = 0.0;
	    	
	    	for (int i = 0; i < 7; ++i) {
	    		s.putIn(sentence[i]);
				summa += s.reward();
	    	}
	    	System.out.print( "###### " + (++k) + "-th iter " + summa + "\n");
		}
	}
}
