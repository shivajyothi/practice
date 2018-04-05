package practices;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StringQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of strings to be added in to queue");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Queue<String> q=new LinkedList<String>();
		Queue<String> q2=new LinkedList<String>();
		System.out.println("Enter strings\n");
		for (int i=0;i<n;i++)
		{
			q.add(sc.next());
			
		}
		q2.addAll(q);
		/*Iterator<String> itr=q.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());*/
		while(!q.isEmpty()){
			System.out.println("element removed is"+q.poll());
			System.out.println("current size of the queue is"+q.size());
		}
		
		System.out.println("*****************************");
		while(!q2.isEmpty()){
		String s1=q2.poll();
		String s2=s1+s1;
		System.out.println("string removed is"+s2);
		System.out.println("current size of the queue is"+q2.size());
		}
		
	}
	}


