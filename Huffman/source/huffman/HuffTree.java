package huffman;

import huffman.utility.CodeMetadata;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Stack;

public class HuffTree {
    private static class Node {
        public byte b;
        public long freq;

        Node left, right;

        public Node(byte b, long freq, Node left, Node right) {
            this.b = b;
            this.freq = freq;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;

    public HuffTree(final byte[] data) {
        root = buildHuffmanTree(countBytes(data)).root;
    }

    public HuffTree(byte b, long freq) {
        root = new Node(b, freq, null, null);
    }

    public HuffTree(HuffTree left, HuffTree right) {
        root = new Node((byte) 0, left.root.freq + right.root.freq, left.root, right.root);
    }

    private static HashMap<Byte, Long> countBytes(final byte[] data) {
        var charFrequency = new HashMap<Byte, Long>();

        for (byte ch : data) {
            if (!charFrequency.containsKey(ch))
                charFrequency.put(ch, 1L);
            else
                charFrequency.put(ch, charFrequency.get(ch) + 1);
        }

        return charFrequency;
    }

    private static HuffTree buildHuffmanTree(final HashMap<Byte, Long> characterFreq) {
        var symbolsQueue = new PriorityQueue<HuffTree>(Comparator.comparingLong(tree -> tree.root.freq));

        for (Byte ch : characterFreq.keySet()) {
            symbolsQueue.add(new HuffTree(ch, characterFreq.get(ch)));
        }

        while (symbolsQueue.size() > 1) {
            HuffTree tree1 = symbolsQueue.remove();
            HuffTree tree2 = symbolsQueue.remove();

            symbolsQueue.add(new HuffTree(tree1, tree2));
        }

        return symbolsQueue.peek();
    }

    public HashMap<Byte, CodeMetadata> buildCodes() {
        class TraversingData {
            public Node node;
            public final CodeMetadata nodeCode;

            public TraversingData(Node node, CodeMetadata nodeCode) {
                this.node = node;
                this.nodeCode = nodeCode;
            }
        }

        var codes = new HashMap<Byte, CodeMetadata>();

        // If text contains only 1 character
        if (root.left == null & root.right == null) {
            codes.put(root.b, new CodeMetadata(1L, (byte) 1));
            return codes;
        }

        var stack = new Stack<TraversingData>();

        stack.push(new TraversingData(root, new CodeMetadata(0L, (byte) 0)));

        while (!stack.empty()) {
            TraversingData data = stack.pop();

            if (data.node.left == null && data.node.right == null) {
                codes.put(data.node.b, data.nodeCode);
                continue;
            }

            stack.push(new TraversingData(
                    data.node.left, new CodeMetadata(
                    data.nodeCode.code << 1, (byte) (data.nodeCode.length + (byte) 1))
            ));

            stack.push(new TraversingData(
                    data.node.right, new CodeMetadata(
                    (data.nodeCode.code << 1) + 1, (byte) (data.nodeCode.length + (byte) 1))
            ));
        }

        return codes;
    }
}
