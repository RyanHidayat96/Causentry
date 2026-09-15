package androidx.FastestIyy;

import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f276a = 0;

    static {
        try {
            SSLContext.getDefault();
        } catch (NoSuchAlgorithmException unused) {
        }
    }
}
