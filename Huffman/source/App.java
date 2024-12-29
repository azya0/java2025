import huffman.Huffman;

import java.util.List;

public class App {
    public static void parseArgs(List<String> args) {
        String inputFilename = null, outputFilename = null;
        boolean decompress = false;

        for (String arg : args) {
            switch (arg) {
                case "-d" -> decompress = true;
                default -> {
                    if (inputFilename == null) {
                        inputFilename = arg;
                    } else if (outputFilename == null) {
                        outputFilename = arg;
                    } else {
                        System.err.println("too many args" + arg);
                        return;
                    }
                }
            }
        }

        if (inputFilename == null) {
            System.err.println("miss input file");
            return;
        }
        if (outputFilename == null) {
            System.err.println("miss output file");
            return;
        }

        if (decompress) {
            Huffman.decompress(
                inputFilename,
                outputFilename
            );
        } else {
            Huffman.compress(
                inputFilename,
                outputFilename
            );
        }
    }
}
