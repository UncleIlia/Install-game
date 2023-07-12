import java.io.File;
import java.io.IOException;
import java.util.logging.*;

public class CreateNewFile {

    private static final Logger logger = Logger.getLogger(CreateNewFile.class.getName());

    public void create(String path, String fileName) throws IOException {
        File newFile = new File(path, fileName);

        Handler fileHandler = new FileHandler("D://Games1//temp//temp.txt");
        fileHandler.setFormatter(new Main.MyFormatter());
        logger.addHandler(fileHandler);

        try {
            if (newFile.createNewFile())
                logger.info("Файл создан");
        } catch (IOException ex) {
            logger.info("Не удалось создать файл");
        }
    }
}
