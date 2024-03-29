
public class BoundedStack extends StackAbstract //implements IStack
{
	private Object[] contents;
	private int top;

	public BoundedStack(int size)
	{
		contents = new Object[size];
		top = 0; // top � 0 dan baslatarak modifiye edersem...
	}
	
		
	@Override
	public Object peek() throws StackEmpty
	{
		if(isEmpty()) new StackEmpty();
		
		//
		return contents[top - 1];
	}

	@Override
	public Object pop() throws StackEmpty 
	{
		if(isEmpty()) new StackEmpty();
		
		Object retVal = contents[--top]; //pop 1 gosteriyodu,azaltt�
		contents[top] = null;            //top 0 oldu ve null atand�     
		
		return retVal;
	}

	@Override
	public void push(Object data) 
	{
		if(isFull()) new StackFull();
		
		
		contents[top++] = data;                      //boyle 2 sat�rda da yaz�labilir=> contents[top] = data;
		                                             //                       top++;
		//top a ekledi
		//daha sonra topu artt�rd�
		
	}

	@Override
	public boolean isEmpty() 
	{
         return top == 0;
	}

	
	public boolean isFull() 
	{
		return top == contents.length;
	}
	
	@Override
	public String toString()
	{
		String retString = "<" + top + "><top: ";
		
		for(int i=top-1;i>0;i--)
		{
			retString += contents[i] + ", ";
		}
		
		if(isEmpty()) retString += contents[0];
			
		return retString;
	}
	
	

}
