package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes3.dex */
public interface getCameraControl {
    public static final Charset TuitionPaymentFragmentbindingInflater1 = Charset.forName(Hex.DEFAULT_CHARSET_NAME);

    boolean equals(Object obj);

    int hashCode();

    void updateDiskCacheKey(MessageDigest messageDigest);
}
