package defpackage;

import android.net.Uri;
import com.android.volley.toolbox.HttpHeaderParser;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
final class Packet {
    private String INotificationSideChannel;
    private final Uri INotificationSideChannelStubProxy;
    final createFragmentShader TuitionPaymentFragmentbindingInflater1;
    String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f194a;
    boolean asBinder;
    boolean b;
    private String cancel;
    private String cancelAll;
    private String g;
    private String getInterfaceDescriptor;
    private String notify;
    private int onTransact;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
    int d = -1;
    int asInterface = -1;

    public Packet(Uri uri, createFragmentShader createfragmentshader) {
        this.onTransact = -1;
        this.INotificationSideChannelStubProxy = uri;
        this.TuitionPaymentFragmentbindingInflater1 = createfragmentshader;
        checkAndSetHasConsumer.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new checkAndSetHasConsumer.TuitionPaymentFragmentbindingInflater1() { // from class: Packet.5
            @Override // checkAndSetHasConsumer.TuitionPaymentFragmentbindingInflater1
            public final void b(String str, String str2) {
                if (!str.equalsIgnoreCase("no-cache")) {
                    if (str.equalsIgnoreCase("max-age")) {
                        Packet.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = checkAndSetHasConsumer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2);
                        return;
                    } else if (str.equalsIgnoreCase("max-stale")) {
                        Packet.this.d = checkAndSetHasConsumer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2);
                        return;
                    } else if (str.equalsIgnoreCase("min-fresh")) {
                        Packet.this.asInterface = checkAndSetHasConsumer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2);
                        return;
                    } else {
                        str.equalsIgnoreCase("only-if-cached");
                        return;
                    }
                }
                Packet.this.asBinder = true;
            }
        };
        for (int i = 0; i < createfragmentshader.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() / 2; i++) {
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = createfragmentshader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createfragmentshader.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
            if ("Cache-Control".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                checkAndSetHasConsumer.TuitionPaymentFragmentspecialinlinedviewModeldefault2(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1);
            } else if ("Pragma".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                if (strTuitionPaymentFragmentspecialinlinedviewModeldefault2.equalsIgnoreCase("no-cache")) {
                    this.asBinder = true;
                }
            } else if ("If-None-Match".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if ("If-Modified-Since".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if ("Authorization".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.b = true;
            } else if ("Content-Length".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                try {
                    this.onTransact = Integer.parseInt(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } catch (NumberFormatException unused) {
                }
            } else if ("Transfer-Encoding".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.cancelAll = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if ("User-Agent".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.getInterfaceDescriptor = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if ("Host".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.notify = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if ("Connection".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.g = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if ("Accept-Encoding".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.f194a = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if (HttpHeaderParser.HEADER_CONTENT_TYPE.equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.INotificationSideChannel = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if ("Proxy-Authorization".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.cancel = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1(Date date) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2("If-Modified-Since");
        }
        String strTuitionPaymentFragmentbindingInflater1 = makeCurrent.TuitionPaymentFragmentbindingInflater1(date);
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1("If-Modified-Since", strTuitionPaymentFragmentbindingInflater1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = strTuitionPaymentFragmentbindingInflater1;
    }
}
