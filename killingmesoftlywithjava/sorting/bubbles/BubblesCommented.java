//starting with bubble sort! sorted like this in school once, again got reminded yesterday this thing existed by dennis. so i sorted some of the heights of my friends
//commented everything especially for some real nice guy. think i might include his height here too

package bubbles; //<- simply just ignore.....

public class Bubbles {

	public static void main(String[] args) {

		int height[] = new int[6];
			height[0]= 160; //pal
			height[1]= 175; //dennis
			height[2]= 166; //me
			height[3]= 163; //salman
			height[4]= 180; //louis
			height[5]= 161; //madame

		int slot = 1; //some variable for temporarily dumping (or saving) numbers in there
		int length = height.length; //length of height array in one variable!

		//jus displaying unsorted heights
		System.out.println("Unsorted:");
		for(int i = 0; i < length; i++) {
			System.out.println(height[i]);
		}
		
		//Sorting should work a little faster this way - please test :)
		Arrays.sort(height);
		System.out.println(Arrays.toString(height));

	}

}
