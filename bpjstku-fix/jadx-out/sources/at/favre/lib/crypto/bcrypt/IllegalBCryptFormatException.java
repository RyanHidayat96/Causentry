package at.favre.lib.crypto.bcrypt;

/* JADX INFO: loaded from: classes6.dex */
public class IllegalBCryptFormatException extends Exception {
    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append(" - example of expected hash format: '$2a$06$If6bvum7DFjUnE9p2uDeDu0YHzrHM6tf.iqN8.yx.jNN1ILEf7h0i' which includes 16 bytes salt and 23 bytes hash value encoded in a base64 flavor");
        return sb.toString();
    }
}
