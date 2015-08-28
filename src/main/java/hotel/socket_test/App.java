package hotel.socket_test;

/**
 * Hello world!
 *
 */
public class App 
{
	private static String ip="127.0.0.1";
	private static int  port=10668;
	
    public static void main( String[] args )
    {
    	RCUSocketRunner rcu=new RCUSocketRunner(ip,port);
    }
}
