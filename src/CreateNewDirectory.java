import java.io.File;
import java.io.IOException;
import java.util.logging.*;

public class CreateNewDirectory {

    private static final Logger logger = Logger.getLogger(CreateNewDirectory.class.getName());

    public void create(String path, String directoryName) throws IOException {
        File dir = new File(path, directoryName);

        Handler fileHandler = new FileHandler("D://Games1//temp//temp.txt", 0, 1, true);
        fileHandler.setFormatter(new CreateNewDirectory.MyFormatter());
        logger.addHandler(fileHandler);

        if (dir.mkdir()) {
            logger.info("Папка создана");
        } else
            logger.info("Не удалось создать папку");
        fileHandler.close();
    }

    static class MyFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return record.getLevel() + ": " + record.getMessage() + " " + record.getInstant() + "\n";
        }
    }
}
