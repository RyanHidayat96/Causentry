package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
final class createSurfaceRequest {
    long INotificationSideChannel;
    private String INotificationSideChannelDefault;
    private String INotificationSideChannelStub;
    private String INotificationSideChannelStubProxy;
    private String MediaBrowserCompat;
    private long RemoteActionCompatParcelizer;
    boolean TuitionPaymentFragmentbindingInflater1;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    Date TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final createFragmentShader TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f889a;
    boolean asBinder;
    boolean asInterface;
    String b;
    final Uri cancelAll;
    private String connect;
    Date g;
    Set<String> getInterfaceDescriptor;
    Date notify;
    long onTransact;
    int d = -1;
    int cancel = -1;

    public createSurfaceRequest(Uri uri, createFragmentShader createfragmentshader) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1;
        this.getInterfaceDescriptor = Collections.emptySet();
        this.RemoteActionCompatParcelizer = -1L;
        this.cancelAll = uri;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = createfragmentshader;
        checkAndSetHasConsumer.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new checkAndSetHasConsumer.TuitionPaymentFragmentbindingInflater1() { // from class: createSurfaceRequest.1
            @Override // checkAndSetHasConsumer.TuitionPaymentFragmentbindingInflater1
            public final void b(String str, String str2) {
                if (!str.equalsIgnoreCase("no-cache")) {
                    if (!str.equalsIgnoreCase("no-store")) {
                        if (str.equalsIgnoreCase("max-age")) {
                            createSurfaceRequest.this.d = checkAndSetHasConsumer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2);
                            return;
                        } else if (str.equalsIgnoreCase("s-maxage")) {
                            createSurfaceRequest.this.cancel = checkAndSetHasConsumer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2);
                            return;
                        } else {
                            if (!str.equalsIgnoreCase("public")) {
                                if (str.equalsIgnoreCase("must-revalidate")) {
                                    createSurfaceRequest.this.f889a = true;
                                    return;
                                }
                                return;
                            }
                            createSurfaceRequest.this.TuitionPaymentFragmentbindingInflater1 = true;
                            return;
                        }
                    }
                    createSurfaceRequest.this.asInterface = true;
                    return;
                }
                createSurfaceRequest.this.asBinder = true;
            }
        };
        for (int i = 0; i < createfragmentshader.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() / 2; i++) {
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = createfragmentshader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createfragmentshader.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
            if ("Cache-Control".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                checkAndSetHasConsumer.TuitionPaymentFragmentspecialinlinedviewModeldefault2(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1);
            } else if ("Date".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.notify = makeCurrent.b(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } else if ("Expires".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = makeCurrent.b(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } else if ("Last-Modified".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.g = makeCurrent.b(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } else if ("ETag".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.b = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if ("Pragma".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                if (strTuitionPaymentFragmentspecialinlinedviewModeldefault2.equalsIgnoreCase("no-cache")) {
                    this.asBinder = true;
                }
            } else if ("Age".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = checkAndSetHasConsumer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } else if ("Vary".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                if (this.getInterfaceDescriptor.isEmpty()) {
                    this.getInterfaceDescriptor = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strTuitionPaymentFragmentspecialinlinedviewModeldefault2.split(",")) {
                    this.getInterfaceDescriptor.add(str.trim().toLowerCase(Locale.US));
                }
            } else if ("Content-Encoding".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.INotificationSideChannelStub = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if ("Transfer-Encoding".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.connect = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if ("Content-Length".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                try {
                    this.RemoteActionCompatParcelizer = Long.parseLong(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } catch (NumberFormatException unused) {
                }
            } else if ("Connection".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.INotificationSideChannelStubProxy = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if ("Proxy-Authenticate".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.INotificationSideChannelDefault = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if ("WWW-Authenticate".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.MediaBrowserCompat = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if ("X-Android-Sent-Millis".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.INotificationSideChannel = Long.parseLong(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } else if ("X-Android-Received-Millis".equalsIgnoreCase(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                this.onTransact = Long.parseLong(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Packet packet) {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i == 200 || i == 203 || i == 300 || i == 301 || i == 410) {
            return (!packet.b || this.TuitionPaymentFragmentbindingInflater1 || this.f889a || this.cancel != -1) && !this.asInterface;
        }
        return false;
    }

    static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        return (str.equalsIgnoreCase("Connection") || str.equalsIgnoreCase("Keep-Alive") || str.equalsIgnoreCase("Proxy-Authenticate") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("TE") || str.equalsIgnoreCase("Trailers") || str.equalsIgnoreCase("Transfer-Encoding") || str.equalsIgnoreCase("Upgrade")) ? false : true;
    }
}
