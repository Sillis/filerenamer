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
		// Change the .txt here to the desired file extension.
                f.renameTo(new File("z:\\projektit\\filerenamer\\samples\\silly_"+i+".txt"));
            }
        }

        System.out.println("Renaming finished. Thanks for using this little program.");
    }
}