package ej1;


public class RunnableImplBuilder {
	
	public static RunnableImpl[] RunnableImplArray(int n, boolean wait){
		RunnableImpl[] runnables = new RunnableImpl[n];
		String name;
		String msg;
		for (int i = 1; i < n; i++){
			name = "Runnable ID " + (i );
			msg = "hola mundo - ";
			runnables[i-1] = single_runnable(name, msg, wait);

		}
		return runnables;
	}
	public static RunnableImpl single_runnable(final String name,final String msg, final boolean wait_time)
	{
        return new RunnableImpl(name, msg, wait_time);		
		
	}
	


}
