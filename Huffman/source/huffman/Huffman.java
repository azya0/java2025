package huffman;

import huffman.utility.CodeMetadata;

import java.util.HashMap;

public class Huffman {
    public static void compress(final String inFilename, final String outFilename) {
        byte[] data = HuffIO.readFromFile(inFilename);

        if (data == null || data.length == 0)
            return;

        HashMap<Byte, CodeMetadata> codes = new HuffTree(data).buildCodes();

        byte[] encodedData = new HuffStringEncoder(codes, data).getEncoded();

        HuffIO.writeToFile(outFilename, encodedData);
    }

    public static void decompress(final String inFilename, final String outFilename) {
        byte[] encodedData = HuffIO.readFromFile(inFilename);

        byte[] data = new HuffStringDecoder(encodedData).getDecoded();

        HuffIO.writeToFile(outFilename, data);
    }
}
