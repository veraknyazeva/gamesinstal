import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        File src = new File("/Users/veraknazeva/Desktop/Games/src");
        if (src.mkdir()) {
            builder.append("src создан " + "\n");
        }

        File res = new File("/Users/veraknazeva/Desktop/Games/res");
        if (res.mkdir()) {
            builder.append("res создан " + "\n");
        }

        File savegames = new File("/Users/veraknazeva/Desktop/Games/savegames");
        if (savegames.mkdir()) {
            builder.append("savegames создан" + "\n");
        }

        File temp = new File("/Users/veraknazeva/Desktop/Games/temp");
        if (temp.mkdir()) {
            builder.append("temp создан" + "\n");
        }

        File main = new File("/Users/veraknazeva/Desktop/Games/src/main");
        if (main.mkdir()) {
            builder.append("main создан" + "\n");
        }

        File test = new File("/Users/veraknazeva/Desktop/Games/src/test");
        if (test.mkdir()) {
            builder.append("test создан" + "\n");
        }

        File mainJava = new File("/Users/veraknazeva/Desktop/Games/src/main/Main.java");
        try {
            if (mainJava.createNewFile()) {
                builder.append("Файл Main.java был создан" + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File utils = new File("/Users/veraknazeva/Desktop/Games/src/main/Utils.java");
        try {
            if (utils.createNewFile()) {
                builder.append("Файл Utils.java был создан" + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawables = new File("/Users/veraknazeva/Desktop/Games/res/drawables");
        if (drawables.mkdir()) {
            builder.append("drawables создан" + "\n");
        }

        File vectors = new File("/Users/veraknazeva/Desktop/Games/res/vectors");
        if (vectors.mkdir()) {
            builder.append("vectors создан" + "\n");
        }

        File icons = new File("/Users/veraknazeva/Desktop/Games/res/icons");
        if (icons.mkdir()) {
            builder.append("icons создан" + "\n");
        }

        File tempTXT = new File("/Users/veraknazeva/Desktop/Games/temp/temp.txt");
        try {
            if (tempTXT.createNewFile()) {
                builder.append("Файл temp.java был создан" + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter(tempTXT, false)) {
            writer.write(builder.toString());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}