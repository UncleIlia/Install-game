import java.io.File;
import java.io.IOException;
import java.util.logging.*;

public class CreateNewFile {

    private static final Logger logger = Logger.getLogger(CreateNewFile.class.getName());

    public void create(String path, String fileName) throws IOException {
        File newFile = new File(path, fileName);

        Handler fileHandler = new FileHandler("D://Games1//temp//temp.txt", 0, 1, true);
        fileHandler.setFormatter(new CreateNewFile.MyFormatter());
        logger.addHandler(fileHandler);

        try {
            if (newFile.createNewFile()) {
                logger.info("File created");
            }
        } catch (IOException ex) {
            logger.info("File not created");
        }
        fileHandler.close();
    }

    static class MyFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return record.getLevel() + ": " + record.getMessage() + " " + record.getInstant() + "\n";
        }
    }
}
