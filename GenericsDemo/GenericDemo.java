class Demo<T,S>
{
	private T value;
    private S var;
	

	public S getVar() {
		return var;
	}

	public void setVar(S var) {
		this.var = var;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public void print()
	{
		System.out.println(value.getClass().getName());
		System.out.println(var.getClass().getName());
	}
	
	
}


public class GenericDemo {

	public static void main(String[] args) {
	  Demo <Integer,String >obj=new Demo<>();
	  obj.setValue(10);
	  obj.print();
	  System.out.println(obj.getValue());
	  Demo <String,Double >obj1=new Demo<>();
	  obj1.setValue("Hello");
	  obj1.print();
	  System.out.println(obj1.getValue());
	}

}
