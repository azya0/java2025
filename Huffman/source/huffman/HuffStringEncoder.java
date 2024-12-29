package huffman;

import huffman.utility.BString;
import huffman.utility.CodeMetadata;

import java.util.HashMap;

public class HuffStringEncoder {
    private final BString encoder;
    private final HashMap<Byte, CodeMetadata> charToCode;
    private final byte[] data;

    public HuffStringEncoder(final HashMap<Byte, CodeMetadata> charToCode, final byte[] data) {
        encoder = new BString();
        this.charToCode = charToCode;
        this.data = data;

        encodeCodes();
        encodeStr();
    }

    private void encodeCodes() {
        encoder.placeByte((byte) (charToCode.size() - 1));
        for (Byte ch : charToCode.keySet()) {
            encoder.placeByte(ch);
            encoder.placeByteCode(new CodeMetadata(charToCode.get(ch).length, (byte) 6));
            encoder.placeByteCode(charToCode.get(ch));
        }
    }

    private void encodeStr() {
        for (byte ch : data) {
            encoder.placeByteCode(charToCode.get(ch));
        }
        encoder.setEnd();
    }

    public byte[] getEncoded() {
        return encoder.getBytes();
    }
}
