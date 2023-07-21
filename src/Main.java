import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws Exception {
        File initialDir = new File("D://Games1", "temp");
        if (initialDir.mkdir()) {
            System.out.println("Папка temp создана");
        } else {
            System.out.println("Не удалось создать папку temp");
        }

        File initialFile = new File("D://Games1//temp", "temp.text");
        try {
            if (initialFile.createNewFile())
                System.out.println("Файл temp.txt создан");
        } catch (IOException ex) {
            System.out.println("Файл temp.txt не был создан");
        }

        CreateNewDirectory newDirectory = new CreateNewDirectory();
        CreateNewFile newFile = new CreateNewFile();

        newDirectory.create("D://Games1", "src");
        newDirectory.create("D://Games1", "res");
        newDirectory.create("D://Games1", "savegames");
        newDirectory.create("D://Games1//src", "main");
        newDirectory.create("D://Games1//src", "test");
        newFile.create("D://Games1//src//main", "Main.java");
        newFile.create("D://Games1//src//main", "Utils.java");
        newDirectory.create("D://Games1//res", "drawables");
        newDirectory.create("D://Games1//res", "vectors");
        newDirectory.create("D://Games1//res", "icons");
    }
}
