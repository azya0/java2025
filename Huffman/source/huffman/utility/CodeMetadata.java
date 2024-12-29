package huffman.utility;

public class CodeMetadata {
    public long code;
    public byte length;

    public CodeMetadata(long code, byte length) {
        this.code = code;
        this.length = length;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) return false;
        if (this == other) return true;

        CodeMetadata c = (CodeMetadata) other;
        return this.code == c.code && length == c.length;
    }

    @Override
    public int hashCode() {
        return (int) (code >= length ? code * code + code + length : code + length * length);
    }
};
