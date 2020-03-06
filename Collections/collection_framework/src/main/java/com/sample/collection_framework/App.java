package com.sample.collection_framework;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	public static final Logger LOGGER=LogManager.getLogger(App.class);
	public static void main( String[] args )
    {
    		Scanner sc=new Scanner(System.in);
    		Custom_list l=new Custom_list();
    		boolean bol=true;
    		while(bol)
    		{
    			LOGGER.info("Enter Your Choice \n1.Insert\n2.Delete\n3.Search\n4.view\n5.Exit");
        		int choice=sc.nextInt();
	    		switch(choice)
	    		{
		    		case 1:LOGGER.info("Enter element");
		    				int ele=sc.nextInt();
		    				LOGGER.info("Enter position within "+l.size());
		    				int pos=sc.nextInt();
		    				l.insert_ele(pos, ele);
		    				break;
		    		case 2:
		    			LOGGER.info("Enter element");
		    			int ele1=sc.nextInt();
		    			boolean r=l.remove_ele(ele1);
		    			if(r==true)
		    				LOGGER.info("Element removed");
		    			else
		    				LOGGER.info("Element not found");
		    			break;
		    		case 3:
		    			LOGGER.info("Enter element");
		    			int ele2=sc.nextInt();
		    			boolean b=l.search_ele(ele2);
		    			if(b)
		    			{
		    				LOGGER.info("Element Found");
		    			}
		    			else
		    				LOGGER.info("Element not found");
		    			break;
		    		case 4:
		    			l.print_elements();
		    			break;
		    		case 5:
		    			return;
	    		}
	    		LOGGER.info("Do You Want to continue ,\nIf yes enter 1 or 0");
	    		int a=sc.nextInt();
	    		if(a==0)
	    		{
	    			bol=false;
	    		}
    		}
    }

}
