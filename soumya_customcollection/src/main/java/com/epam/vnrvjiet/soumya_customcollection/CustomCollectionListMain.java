package com.epam.vnrvjiet.soumya_customcollection;
import java.util.*;
public class CustomCollectionListMain {
	
	public static void main(String args[])
	{int index;
	Scanner sc=new Scanner(System.in);
		MyCustomCollectionList objectOfList=new MyCustomCollectionList();
		int continuity=1,operation;
		while(continuity==1) {
		
		
		
	   System.out.println("1.Add Element to the List\n2.Update the List element\n3.Fetch the element at particular index\n4.Remove the Element at index\n5.Print the List elements\n6.Size of the list");
	   System.out.println("Enter your operation to be performed:");
	    operation=sc.nextInt();
	    switch(operation)
	    {
	     case 1:System.out.println("Enter the element to be added:");
	     Object newelement=sc.next();
	     objectOfList.addElement(newelement);break;
	     
	     case 2:System.out.println("Enter the index to be updated:");
	     index=sc.nextInt();
	     System.out.println("Enter the new Value to be set:");
	     Object newValue=sc.next();
	     objectOfList.setElement(index, newValue);break;
	     
	     case 3:System.out.println("Enter the index:");
	     index=sc.nextInt();
	     objectOfList.getElement(index);
	     break;
	     
	     case 4:System.out.println("Enter the index of the element to be removed:");
	     index=sc.nextInt();
	     objectOfList.removeElementAtIndex(index);
	     break;
	     
	     case 5:
	    objectOfList.printList();
		  break; 
	     case 6:
	    	objectOfList.sizeoftheList();
	    	break;
		  default:System.out.println("Select the correct operation(1 to 5)!!");
	    }
	    
	    System.out.println("Do you want to continue(yes-1/no-0)");
	    int choice=sc.nextInt();
	    if(choice==1)
	    	continuity=1;
	    else
	    	continuity=0;
		}
		sc.close();
	}
	

}
