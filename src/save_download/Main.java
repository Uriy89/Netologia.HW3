package save_download;

import java.util.ArrayList;
import java.util.List;


public class Main {
    private static String zipPath = "Games//savegames//zip.zip";
    private static String pathDir = "Games//savegames";

    public static void main(String[] args) {
        GameProgress gameProgress1 = new GameProgress(98, 32, 6, 19.86);
        GameProgress gameProgress2 = new GameProgress(56, 12, 9, 5.6);
        GameProgress gameProgress3 = new GameProgress(23, 11, 2, 87.06);

        SerializeDeserialize.saveGame("Games//savegames//save1.dat", gameProgress1);
        SerializeDeserialize.saveGame("Games//savegames//save2.dat", gameProgress2);
        SerializeDeserialize.saveGame("Games//savegames//save3.dat", gameProgress3);

        List<String> list = new ArrayList<>();
        list.add("Games//savegames//save1.dat");
        list.add("Games//savegames//save2.dat");
        list.add("Games//savegames//save3.dat");


        ZipOutInFiles.zipFiles(zipPath, list);
        ZipOutInFiles.deleteFile(list);

        ZipOutInFiles.openZip(zipPath, pathDir);
        System.out.println(SerializeDeserialize.openProgress("Games//savegames//games_save_1.dat"));
    }



}
