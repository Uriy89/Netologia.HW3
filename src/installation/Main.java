package installation;


public class Main {
    public static void main(String[] args) {

        FileCreate fc = new FileCreate();

        fc.CreateNewDir(new NewDir("src", "Games"));
        fc.CreateNewDir(new NewDir("res", "Games"));
        fc.CreateNewDir(new NewDir("savegames", "Games"));
        fc.CreateNewDir(new NewDir("temp", "Games"));
        fc.CreateNewDir(new NewDir("main", "Games//src"));
        fc.CreateNewDir(new NewDir("test", "Games//src"));

        fc.CreateNewFile(new NewFile("Games//src//main//Main.java"));
        fc.CreateNewFile(new NewFile("Games//src//main//Utils.java"));

        fc.CreateNewDir(new NewDir("drawables", "Games//res"));
        fc.CreateNewDir(new NewDir("vectors", "Games//res"));
        fc.CreateNewDir(new NewDir("icons", "Games//res"));

        MyLogger.note(fc.returnList());



    }
}
