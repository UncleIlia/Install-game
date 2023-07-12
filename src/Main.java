import java.util.logging.*;


public class Main {

    public static void main(String[] args) throws Exception {
        CreateNewDirectory newDirectory = new CreateNewDirectory();
        CreateNewFile newFile = new CreateNewFile();

//        newDirectory.create("D://Games1", "temp");
//        newFile.create("D://Games1//temp", "temp.text");


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

    static class MyFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return record.getLevel() + ": " + record.getMessage() + " " + record.getInstant() + "\n";
        }
    }
}
