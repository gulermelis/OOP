
public class PostfixEvaluation {

	
	public static double evalPostfix(String expression, IStack stack) throws StackEmpty
	{
		String[] exp = expression.split(" ");
		
		for(int i=0;i<exp.length;i++)
		{
			String str = exp[i];
			
			if(str.matches("(-?[0-9]+.?[0-9]*){1,20}"))
			{
				stack.push(str);
			}
			else
			{
				
				double num1 = Double.parseDouble(stack.pop().toString());
				double num2 = Double.parseDouble(stack.pop().toString());
				
				if(str.equals("+"))
				{
					stack.push(num2 + num1);
				}
				else if(str.equals("-"))
				{
					stack.push(num2 - num1);
				}
				else if(str.equals("*"))
				{
					stack.push(num2 * num1);
				}
				else if(str.equals("/"))
				{
					stack.push(num2 / num1);
				}
			}
		}
		
		return Double.parseDouble(stack.pop().toString());
	}
	
	
	public static void main(String[] args) throws StackEmpty 
	{
		
		String expression = "10 612 92 - 4 / 75 -9.2 - * +";
        //System.out.println(evalPostfix(expression, new BoundedStack(20)));
        //System.out.println(evalPostfix(expression, new Stack()));
        //System.out.println(evalPostfix(expression, new DynamicStack()));
		
		BoundedStack bs = new BoundedStack(20);
		Stack st = new Stack();
		DynamicStack ds = new DynamicStack();
		
		
		
		System.out.println(bs.evalPostfix(expression));
        System.out.println(st.evalPostfix(expression));
        System.out.println(ds.evalPostfix(expression));
	}

}
