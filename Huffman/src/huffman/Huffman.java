package huffman;

import huffman.utility.CharCodeWithMeta;
import huffman.utility.TimeWatcher;

import java.util.HashMap;

public class Huffman {
    public static void compress(final String inFilename, final String outFilename, boolean printCodes, boolean printStats) {
        var timeWatcher = new TimeWatcher();

        timeWatcher.start("read-file-to-encode");
        byte[] data = HuffmanIO.readFromFile(inFilename);
        timeWatcher.stop();
        if (data == null || data.length == 0)
            return;

        timeWatcher.start("build-codes");
        HashMap<Byte, CharCodeWithMeta> codes = new HuffmanTree(data).buildCodes();
        timeWatcher.stop();

        if (printCodes) {
            HuffmanIO.printCodes(codes);
        }

        timeWatcher.start("encode-str");
        byte[] encodedData = new HuffmanStringEncoder(codes, data).getEncoded();
        timeWatcher.stop();

        timeWatcher.start("write-file-encoded");
        HuffmanIO.writeToFile(outFilename, encodedData);
        timeWatcher.stop();

        if (printStats) {
            HuffmanIO.printStats(data.length, encodedData.length);
        }
    }

    public static void decompress(final String inFilename, final String outFilename, boolean printStats) {
        var timeWatcher = new TimeWatcher();

        timeWatcher.start("read-file-to-decode");
        byte[] encodedData = HuffmanIO.readFromFile(inFilename);
        timeWatcher.stop();

        timeWatcher.start("decode-file");
        byte[] data = new HuffmanStringDecoder(encodedData).getDecoded();
        timeWatcher.stop();

        timeWatcher.start("write-file-decoded");
        HuffmanIO.writeToFile(outFilename, data);
        timeWatcher.stop();

        if (printStats) {
            HuffmanIO.printStats(encodedData.length, data.length);
        }
    }
}
