package dimensions.solar;

public class Solar{
	
	private static Server server;
	
    /**
     * Static class doesn't need to be initialized.
     */
    private Solar(){}
    
    public static Server getServer(){
    	return server;
    }

    public static void setServer(Server server){
    	if(Solar.server != null)
    		throw new IllegalArgumentException("Server already defined!");
    	Solar.server = server;
    }
    
    public static String getName(){
    	return server.getName();
    }
    
    public static String getVersion(){
    	return server.getVersion();
    }
    
}
