package defpackage;

import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class getCameraFactoryProvider implements getCameraControl {
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public URL TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final CameraXConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile byte[] f916a;
    public final URL asBinder;
    public String b;
    private int d;

    public getCameraFactoryProvider(URL url) {
        this(url, CameraXConfig.b);
    }

    public getCameraFactoryProvider(String str) {
        this(str, CameraXConfig.b);
    }

    private getCameraFactoryProvider(URL url, CameraXConfig cameraXConfig) {
        if (url != null) {
            this.asBinder = url;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            if (cameraXConfig == null) {
                throw new NullPointerException("Argument must not be null");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraXConfig;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    private getCameraFactoryProvider(String str, CameraXConfig cameraXConfig) {
        this.asBinder = null;
        if (!TextUtils.isEmpty(str)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            if (cameraXConfig == null) {
                throw new NullPointerException("Argument must not be null");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraXConfig;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    private String b() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str != null) {
            return str;
        }
        URL url = this.asBinder;
        if (url != null) {
            return url.toString();
        }
        throw new NullPointerException("Argument must not be null");
    }

    public String toString() {
        return b();
    }

    @Override // defpackage.getCameraControl
    public boolean equals(Object obj) {
        if (!(obj instanceof getCameraFactoryProvider)) {
            return false;
        }
        getCameraFactoryProvider getcamerafactoryprovider = (getCameraFactoryProvider) obj;
        String string = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (string == null) {
            URL url = this.asBinder;
            if (url == null) {
                throw new NullPointerException("Argument must not be null");
            }
            string = url.toString();
        }
        String string2 = getcamerafactoryprovider.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (string2 == null) {
            URL url2 = getcamerafactoryprovider.asBinder;
            if (url2 == null) {
                throw new NullPointerException("Argument must not be null");
            }
            string2 = url2.toString();
        }
        return string.equals(string2) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(getcamerafactoryprovider.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.getCameraControl
    public int hashCode() {
        if (this.d == 0) {
            int iHashCode = b().hashCode();
            this.d = iHashCode;
            this.d = (iHashCode * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }
        return this.d;
    }

    @Override // defpackage.getCameraControl
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        if (this.f916a == null) {
            this.f916a = b().getBytes(TuitionPaymentFragmentbindingInflater1);
        }
        messageDigest.update(this.f916a);
    }
}
