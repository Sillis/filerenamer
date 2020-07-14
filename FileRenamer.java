import java.io.File;
import java.io.IOException;

public class FileRenamer {

    public static void main(String[] argv) throws IOException {

	// Change the source directory to wherever you have your batch.
        File directory = new File("z:\\projektit\\filerenamer\\samples");
        File[] files = directory.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
		// Remember to change these as well.
                File f = new File("z:\\projektit\\filerenamer\\samples\\"+files[i].getName()); 
		// Change the .txt here to the desired file extension.'
		// This is also the part where you can define the name for the files. I've used "silly_1.txt" etc.
                f.renameTo(new File("z:\\projektit\\filerenamer\\samples\\silly_"+i+".txt"));
            }
        }

        System.out.println("Renaming finished. Thanks for using this little program.");
    }
}
