package com.epam.vnrvjiet.soumya_customcollection;
import java.util.Arrays;
public class MyCustomCollectionList {
	private Object[] myArray=new Object[10];
	private int size=10;
	
	public MyCustomCollectionList() {
		for(int i=0;i<10;i++)
			myArray[i]=i+1;
	}
	
	public void addElement(Object element)
	{   
		ensureCapacity();
		myArray[size++]=element;
		System.out.println("Element Successfully added at index:"+ (size-1));
		printList();
	}
	private void ensureCapacity()
	{
		if(size>=myArray.length)
		{
			int oldCapacity=myArray.length;
			int newCapacity=(oldCapacity*3)/2 +1;
			myArray=Arrays.copyOf(myArray,newCapacity);
		}
	}
	public void setElement(int index,Object element)
	{  try{
		//if(index>size-1)
		//throw new ArrayIndexOutOfBoundsException("Cannot set the element at index:"+index);
		myArray[index]=element;
		System.out.println("Value is successfully updated to:"+element);
	       }
	    catch(Exception e)
	    {
		   System.out.println("ArrayoutofBoundsException Cannot set the element at index "+index);//
		   System.out.println(e);
	     }
	}
	public void getElement(int index)
	{   try {
		Object value=myArray[index];
		System.out.println("Element at index:"+index+" is"+value);
		}
	  catch(Exception e) 
	  {
		  System.out.println(e);
	  }
	}
	
	public void printList()
	{   if(size>0) {
		System.out.println("Elements in the list are:");
		for(int i=0;i<size;i++)
			System.out.print(myArray[i]+" ");
		System.out.println();
	                }
	    else
		System.out.println("array is empty!!");
	}
	
	public void removeElementAtIndex(int index)
	{ try {
		
	   Object oldvalue=myArray[index];
		for(int i=index;i<size-1;i++)
		myArray[i]=myArray[i+1];	
		
		size--;
		if(size<0)
			size=0;
		System.out.println(oldvalue +" Removed!!");
		printList();
		}
	   catch(Exception e) {
		System.out.println(e);
	                      }
		
	}
	public void sizeoftheList(){
		System.out.println("List size is:"+size);
	}

	
		
	}


