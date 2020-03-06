package com.sample.collection_framework;
import java.util.ArrayList; 
public class Custom_list
{
		ArrayList<Integer> arraylist = new ArrayList<Integer>(10);
		Custom_list()
		{
		 arraylist.add(10);
		 arraylist.add(15);
		 arraylist.add(20);
		 arraylist.add(25);
		 arraylist.add(30);
		 arraylist.add(35);
		 arraylist.add(40);
		 arraylist.add(45);
		 arraylist.add(50);
		 arraylist.add(55);
		}
		public int size()
		{
			return arraylist.size();
		}
		public void insert_ele(int index,int element)
		{
			arraylist.add(index,element);
		}
		public boolean remove_ele(int element)
		{
			int n=arraylist.indexOf(element);
			if(n<arraylist.size())
			{
				arraylist.remove(n);
				return true;
			}
			else
				return false;
		}
		public boolean search_ele(int element)
		{
			boolean a=arraylist.contains(element);
			return a;
		}
		public void print_elements()
		{
			for(int i=0;i<arraylist.size();i++)
			{
				System.out.println(arraylist.get(i));
			}
		}


}


