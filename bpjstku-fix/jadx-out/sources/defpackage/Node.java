package defpackage;

import android.net.Uri;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class Node {
    public Uri INotificationSideChannel;
    public ShaderProvider TuitionPaymentFragmentbindingInflater1;
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f186a;
    public String asBinder;
    public int asInterface;
    public boolean b;
    public int d;
    public getOutSurfaceOrThrow g;
    String notify;

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        String property = System.getProperty("http.agent");
        if (property != null) {
            return property;
        }
        StringBuilder sb = new StringBuilder("Java");
        sb.append(System.getProperty("java.version"));
        return sb.toString();
    }

    public Node(Uri uri, String str) {
        this(uri, str, null);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getOutSurfaceOrThrow getoutsurfaceorthrow, Uri uri) {
        if (uri != null) {
            String host = uri.getHost();
            if (uri.getPort() != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(host);
                sb.append(":");
                sb.append(uri.getPort());
                host = sb.toString();
            }
            if (host != null) {
                getoutsurfaceorthrow.b("Host", host);
            }
        }
        getoutsurfaceorthrow.b("User-Agent", TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        getoutsurfaceorthrow.b("Accept-Encoding", "gzip, deflate");
        getoutsurfaceorthrow.b("Connection", "keep-alive");
        getoutsurfaceorthrow.b("Accept", "*/*");
    }

    public Node(Uri uri, String str, getOutSurfaceOrThrow getoutsurfaceorthrow) {
        this.notify = "HTTP/1.1";
        this.g = new getOutSurfaceOrThrow();
        this.b = true;
        this.asInterface = 30000;
        this.d = -1;
        this.asBinder = str;
        this.INotificationSideChannel = uri;
        if (getoutsurfaceorthrow == null) {
            this.g = new getOutSurfaceOrThrow();
        } else {
            this.g = getoutsurfaceorthrow;
        }
        if (getoutsurfaceorthrow == null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.g, uri);
        }
    }

    public final String toString() {
        getOutSurfaceOrThrow getoutsurfaceorthrow = this.g;
        if (getoutsurfaceorthrow == null) {
            return super.toString();
        }
        return getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.INotificationSideChannel.toString());
    }

    public final String TuitionPaymentFragmentbindingInflater1(String str) {
        return String.format(Locale.ENGLISH, "(%d ms) %s: %s", Long.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != 0 ? System.currentTimeMillis() - this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0L), this.INotificationSideChannel, str);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, Exception exc) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null || this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 6) {
            return;
        }
        TuitionPaymentFragmentbindingInflater1(str);
        exc.getMessage();
    }
}
