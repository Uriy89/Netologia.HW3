package installation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileCreate {

    private final String SUCCESSDIR = "Directory was created successfully";
    private final String ERRORDIR = "Directory was not created!";
    private final String SUCCESSFILE = "File was created successfully";
    private final String ERRORDIRFILE = "File was not created!";
    private final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
    private Date date = new Date();
    private List<StringBuilder> list = new ArrayList<>();

    public void CreateNewDir(NewDir dir) {
        File file = new File(dir.getPath(), dir.getName());
        if (file.mkdir()) list.add(log(SUCCESSDIR, dir.getName()));
        else list.add(log(ERRORDIR, dir.getName()));
    }

    public void CreateNewFile(NewFile nfile) {
        File file = new File(nfile.getName());
        try {
            file.createNewFile();
        } catch (IOException ex) {
            ex.getMessage();
        }
        check(file);
    }

    private void check(File file) {
        if (file.exists() && !file.isDirectory()) list.add(log(SUCCESSFILE, file.getName()));
        else list.add(log(ERRORDIRFILE, file.getName()));
    }

    private StringBuilder log(String msg, String name) {
        StringBuilder str = new StringBuilder();
        str.append(df.format(date));
        str.append("    :   ");
        str.append(msg);
        str.append("                [ " + name + " ]");
        str.append("\n");
        return str;
    }

    public List<StringBuilder> returnList() {
        return list;
    }
}
