import java.io.File;
import java.io.IOException;
import java.util.logging.*;

public class CreateNewDirectory {

    private static final Logger logger = Logger.getLogger(CreateNewDirectory.class.getName());

    public void create (String path, String directoryName) throws IOException {
        File dir = new File(path, directoryName);

        Handler fileHandler = new FileHandler("D://Games1//temp//temp.txt");
        fileHandler.setFormatter(new Main.MyFormatter());
        logger.addHandler(fileHandler);

        if (dir.mkdir()){
            logger.info("Папка создана");
        } else {
            logger.info("Не удалось создать папку");
        }
    }
}
