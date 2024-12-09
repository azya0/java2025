import huffman.Huffman;
import huffman.utility.TimeWatcher;

import java.util.List;

public class ConsoleApplication {
    private static void printUsage() {
        System.out.println("\nUsage: Main [options] <inputfile> <outputfile>");
    }

    private static void printOptions() {
        printUsage();
        System.out.println("\nOptions:");
        System.out.println("\t--log-time        - Time log");
        System.out.println("\t--codes           - Print codes");
        System.out.println("\t--stats           - Show compress stats");
        System.out.println("\t-d, --decompress  - Switch to decompressing");
    }

    public static void parseArgs(List<String> args) {
        printOptions();

        String inputFilename = null, outputFilename = null;
        boolean printCodes = false, printStats = false, decompress = false;

        for (String arg : args) {
            switch (arg) {
                case "--log-time" -> TimeWatcher.setIsOn(true);
                case "--codes" -> printCodes = true;
                case "--stats" -> printStats = true;
                case "--decompress", "-d" -> decompress = true;
                default -> {
                    if (inputFilename == null) {
                        inputFilename = arg;
                    } else if (outputFilename == null) {
                        outputFilename = arg;
                    } else {
                        System.err.println("too many args" + arg);
                        printUsage();
                        return;
                    }
                }
            }
        }

        if (inputFilename == null) {
            System.err.println("miss input file");
            printUsage();
            return;
        }
        if (outputFilename == null) {
            System.err.println("miss output file");
            printUsage();
            return;
        }

        if (decompress) {
            Huffman.decompress(
                inputFilename,
                outputFilename,
                printStats
            );
        } else {
            Huffman.compress(
                inputFilename,
                outputFilename,
                printCodes,
                printStats
            );
        }
    }
}
