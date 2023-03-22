package leetCode;

public class AsciiCharSequence implements CharSequence {
    private final byte[] bytes;
    public AsciiCharSequence(byte[] bytes){
        this.bytes = bytes.clone();
    }

    @Override
    public int length() {
        return this.bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) this.bytes[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] subBytes = new byte[end - start];
        for (int i = start, j = 0; i < end; i++, j++) {
            subBytes[j] = this.bytes[i];
        }
        return new AsciiCharSequence(subBytes);
    }

    @Override
    public String toString() {
        return new String(this.bytes);
    }

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println(answer);
        example[0] = 74;
        System.out.println(answer);
    }
}
