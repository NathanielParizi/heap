import java.util.*;



public class Chapter6_4 

{
	
	

	Integer nums [];

	Integer sNums [];

	Random rand = new Random();

	MyBinaryHeap<Integer> mbhs;

	public Chapter6_4()

	{


	}

	public Integer kthLargest(int k, int n)

	{

		nums = new Integer[n];

		for (int i = 0; i < nums.length; i++)

		{

		    nums[i] = rand.nextInt(100);


		    for (int j = 0; j < i; j++) {

		        if (nums[i] == nums[j]) {

		            i--; 

		            break;

		        }

		    }  

		}

		sNums = new Integer[k];

		for (int i = 0; i < k ;i++)//created k list from N array

		{

			sNums[i] = nums[i];

		}


		mbhs = new MyBinaryHeap<Integer>(sNums);

		int temp;


		for(; k < nums.length; k++)

		{

			if (k <= nums.length-1)

			{

				if (mbhs.findMin() < nums[k])

				{

					mbhs.deleteMin();

					mbhs.insert(nums[k]);

					temp = mbhs.findMin();

				}

				

			}

		}


		temp = mbhs.findMin();

		return temp;

	}

}



