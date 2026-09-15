package defpackage;

import android.net.Uri;
import com.koushikdutta.async.AsyncServer;
import com.koushikdutta.async.AsyncServer.AnonymousClass5;
import com.koushikdutta.async.http.Protocol;
import com.koushikdutta.async.util.ArrayDeque;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public class createOutputSurfaceInternal extends unregisterOutputSurface {
    public boolean TuitionPaymentFragmentbindingInflater1;
    InternalImageProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f886a;
    private String asBinder;
    private int asInterface;
    private Hashtable<String, TuitionPaymentFragmentbindingInflater1> b;

    protected lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault3(OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, Uri uri, int i, boolean z, lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor) {
        return lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor;
    }

    public createOutputSurfaceInternal(InternalImageProcessor internalImageProcessor, String str, int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 300000;
        this.b = new Hashtable<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Integer.MAX_VALUE;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = internalImageProcessor;
        this.f886a = str;
        this.asInterface = i;
    }

    private int b(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals(this.f886a)) {
            return -1;
        }
        if (uri.getPort() == -1) {
            return this.asInterface;
        }
        return uri.getPort();
    }

    public createOutputSurfaceInternal(InternalImageProcessor internalImageProcessor) {
        this(internalImageProcessor, "http", 80);
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(Uri uri, int i, String str, int i2) {
        String string;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            string = sb.toString();
        } else {
            string = "";
        }
        if (str != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(":");
            sb2.append(i2);
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(uri.getScheme());
        sb3.append("//");
        sb3.append(uri.getHost());
        sb3.append(":");
        sb3.append(i);
        sb3.append("?proxy=");
        sb3.append(string);
        return sb3.toString();
    }

    class b {
        long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = System.currentTimeMillis();
        getAbsolutePathFromUri b;

        public b(getAbsolutePathFromUri getabsolutepathfromuri) {
            this.b = getabsolutepathfromuri;
        }
    }

    static class TuitionPaymentFragmentbindingInflater1 {
        int TuitionPaymentFragmentbindingInflater1;
        ArrayDeque<OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayDeque<>();
        ArrayDeque<b> b = new ArrayDeque<>();

        TuitionPaymentFragmentbindingInflater1() {
        }
    }

    @Override // defpackage.unregisterOutputSurface, defpackage.OpenGlRenderer
    public final lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault3(final OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        String host;
        int i;
        final Uri uri = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.INotificationSideChannel;
        final int iB = b(tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.INotificationSideChannel);
        if (iB == -1) {
            return null;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put("socket-owner", this);
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault2(uri, iB, tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.f186a, tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.d));
        synchronized (this) {
            if (tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                DefaultSurfaceProcessorExternalSyntheticLambda13 defaultSurfaceProcessorExternalSyntheticLambda13 = new DefaultSurfaceProcessorExternalSyntheticLambda13();
                tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
                return defaultSurfaceProcessorExternalSyntheticLambda13;
            }
            boolean z = true;
            tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1++;
            while (!tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2.b.isEmpty()) {
                b bVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                if (bVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    b bVar = bVarTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    getAbsolutePathFromUri getabsolutepathfromuri = bVar.b;
                    if (bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + ((long) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) < System.currentTimeMillis()) {
                        getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
                        getabsolutepathfromuri.TuitionPaymentFragmentbindingInflater1();
                    } else if (getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                        Node node = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a;
                        if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 3) {
                            node.TuitionPaymentFragmentbindingInflater1("Reusing keep-alive socket");
                        }
                        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.b(null, getabsolutepathfromuri);
                        DefaultSurfaceProcessorExternalSyntheticLambda13 defaultSurfaceProcessorExternalSyntheticLambda14 = new DefaultSurfaceProcessorExternalSyntheticLambda13();
                        defaultSurfaceProcessorExternalSyntheticLambda14.b();
                        return defaultSurfaceProcessorExternalSyntheticLambda14;
                    }
                } else {
                    throw new NoSuchElementException();
                }
            }
            if (!this.TuitionPaymentFragmentbindingInflater1 || tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.f186a != null) {
                Node node2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a;
                if (node2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 3) {
                    node2.TuitionPaymentFragmentbindingInflater1("Connecting socket");
                }
                String str = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.f186a;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.f186a == null) {
                    host = uri.getHost();
                    z = false;
                    i = iB;
                } else {
                    host = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.f186a;
                    i = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a.d;
                }
                if (z) {
                    Node node3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a;
                    StringBuilder sb = new StringBuilder("Using proxy: ");
                    sb.append(host);
                    sb.append(":");
                    sb.append(i);
                    String string = sb.toString();
                    if (node3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 2) {
                        node3.TuitionPaymentFragmentbindingInflater1(string);
                    }
                }
                return (lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor) AsyncServer.TuitionPaymentFragmentspecialinlinedviewModeldefault2(845635290, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, InetSocketAddress.createUnresolved(host, i), TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2, uri, iB, z, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1)}, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -845635289, getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
            Node node4 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a;
            if (node4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 2) {
                node4.TuitionPaymentFragmentbindingInflater1("Resolving domain and connecting to all available addresses");
            }
            DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
            AsyncServer asyncServer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String host2 = uri.getHost();
            DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda6 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
            AsyncServer.b.execute(asyncServer.new AnonymousClass5(host2, defaultSurfaceProcessorExternalSyntheticLambda6));
            defaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(defaultSurfaceProcessorExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new DefaultSurfaceProcessorPendingSnapshot() { // from class: getExtensionsBeforeInitialized
                @Override // defpackage.DefaultSurfaceProcessorPendingSnapshot
                public final DefaultSurfaceProcessorExternalSyntheticLambda10 TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
                    final createOutputSurfaceInternal createoutputsurfaceinternal = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    final int i2 = iB;
                    final OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    return DefaultSurfaceProcessorExternalSyntheticLambda11.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Arrays.asList((InetAddress[]) obj), new DefaultSurfaceProcessorPendingSnapshot() { // from class: activateExternalTexture
                        @Override // defpackage.DefaultSurfaceProcessorPendingSnapshot
                        public final DefaultSurfaceProcessorExternalSyntheticLambda10 TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj2) {
                            createOutputSurfaceInternal createoutputsurfaceinternal2 = createoutputsurfaceinternal;
                            int i3 = i2;
                            OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            InetAddress inetAddress = (InetAddress) obj2;
                            final DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda7 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
                            String str2 = String.format(Locale.ENGLISH, "%s:%s", inetAddress, Integer.valueOf(i3));
                            Node node5 = tuitionPaymentFragmentspecialinlinedviewModeldefault4.f189a;
                            String strConcat = "attempting connection to ".concat(String.valueOf(str2));
                            if (node5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 2) {
                                node5.TuitionPaymentFragmentbindingInflater1(strConcat);
                            }
                            return defaultSurfaceProcessorExternalSyntheticLambda7;
                        }
                    });
                }
            }).TuitionPaymentFragmentbindingInflater1(new onFrameAvailable() { // from class: createTempSurface
                @Override // defpackage.onFrameAvailable
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) throws Exception {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2, uri, iB, exc);
                }
            }), null).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new DefaultSurfaceProcessorExternalSyntheticLambda14() { // from class: removeOutputSurfaceInternal
                @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14
                public final void TuitionPaymentFragmentbindingInflater1(Exception exc, Object obj) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2, uri, iB, exc, (getAbsolutePathFromUri) obj);
                }
            });
            return defaultSurfaceProcessorExternalSyntheticLambda5;
        }
    }

    final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, Uri uri, int i, Exception exc) throws Exception {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2, uri, i, false, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1).b(exc, null);
    }

    final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, Uri uri, int i, Exception exc, getAbsolutePathFromUri getabsolutepathfromuri) {
        if (getabsolutepathfromuri == null) {
            return;
        }
        if (exc == null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2, uri, i, false, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1).b(null, getabsolutepathfromuri);
            return;
        }
        Node node = tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a;
        if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 3) {
            node.TuitionPaymentFragmentbindingInflater1("Recycling extra socket leftover from cancelled operation");
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(getabsolutepathfromuri);
        b(getabsolutepathfromuri, tuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a);
    }

    private TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.b.get(str);
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            return tuitionPaymentFragmentbindingInflater1;
        }
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = new TuitionPaymentFragmentbindingInflater1();
        this.b.put(str, tuitionPaymentFragmentbindingInflater2);
        return tuitionPaymentFragmentbindingInflater2;
    }

    final void TuitionPaymentFragmentbindingInflater1(String str) {
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.b.get(str);
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            while (!tuitionPaymentFragmentbindingInflater1.b.isEmpty()) {
                ArrayDeque<b> arrayDeque = tuitionPaymentFragmentbindingInflater1.b;
                Object[] objArr = arrayDeque.b;
                b bVar = (b) objArr[(arrayDeque.TuitionPaymentFragmentbindingInflater1 - 1) & (objArr.length - 1)];
                getAbsolutePathFromUri getabsolutepathfromuri = bVar.b;
                if (bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + ((long) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) > System.currentTimeMillis()) {
                    break;
                }
                if (tuitionPaymentFragmentbindingInflater1.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != null) {
                    getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
                    getabsolutepathfromuri.TuitionPaymentFragmentbindingInflater1();
                } else {
                    throw new NoSuchElementException();
                }
            }
            if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 == 0 && tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isEmpty() && tuitionPaymentFragmentbindingInflater1.b.isEmpty()) {
                this.b.remove(str);
            }
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final getAbsolutePathFromUri getabsolutepathfromuri) {
        getabsolutepathfromuri.b(new lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: createOutputSurfaceInternal.5
            @Override // defpackage.lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor
            public final void b(Exception exc) {
                getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
                getabsolutepathfromuri.TuitionPaymentFragmentbindingInflater1();
            }
        });
        getabsolutepathfromuri.TuitionPaymentFragmentbindingInflater1(null);
        getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: createOutputSurfaceInternal.4
            @Override // lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1, defpackage.lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor
            public final void TuitionPaymentFragmentbindingInflater1(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
                super.TuitionPaymentFragmentbindingInflater1(checkreadytorelease, autoValue_Packet);
                while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                    AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
                }
                autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
                getabsolutepathfromuri.TuitionPaymentFragmentbindingInflater1();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:5:0x000f, B:7:0x001a, B:10:0x0024, B:13:0x0040, B:18:0x004f, B:20:0x0063, B:25:0x006e, B:27:0x0076, B:30:0x007c, B:31:0x007f, B:23:0x0068, B:32:0x0087, B:34:0x008f, B:37:0x0094, B:38:0x0097, B:16:0x0049, B:39:0x00a2, B:41:0x00aa, B:44:0x00af, B:45:0x00b2), top: B:51:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:5:0x000f, B:7:0x001a, B:10:0x0024, B:13:0x0040, B:18:0x004f, B:20:0x0063, B:25:0x006e, B:27:0x0076, B:30:0x007c, B:31:0x007f, B:23:0x0068, B:32:0x0087, B:34:0x008f, B:37:0x0094, B:38:0x0097, B:16:0x0049, B:39:0x00a2, B:41:0x00aa, B:44:0x00af, B:45:0x00b2), top: B:51:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006e A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:5:0x000f, B:7:0x001a, B:10:0x0024, B:13:0x0040, B:18:0x004f, B:20:0x0063, B:25:0x006e, B:27:0x0076, B:30:0x007c, B:31:0x007f, B:23:0x0068, B:32:0x0087, B:34:0x008f, B:37:0x0094, B:38:0x0097, B:16:0x0049, B:39:0x00a2, B:41:0x00aa, B:44:0x00af, B:45:0x00b2), top: B:51:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0076 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:5:0x000f, B:7:0x001a, B:10:0x0024, B:13:0x0040, B:18:0x004f, B:20:0x0063, B:25:0x006e, B:27:0x0076, B:30:0x007c, B:31:0x007f, B:23:0x0068, B:32:0x0087, B:34:0x008f, B:37:0x0094, B:38:0x0097, B:16:0x0049, B:39:0x00a2, B:41:0x00aa, B:44:0x00af, B:45:0x00b2), top: B:51:0x000f }] */
    @Override // defpackage.unregisterOutputSurface, defpackage.OpenGlRenderer
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(OpenGlRenderer.asInterface asinterface) {
        Protocol protocol;
        String strTuitionPaymentFragmentbindingInflater1;
        Node node;
        if (asinterface.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get("socket-owner") != this) {
            return;
        }
        try {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(asinterface.asBinder);
            if (asinterface.onTransact != null || !asinterface.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                Node node2 = asinterface.f189a;
                if (node2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 2) {
                    node2.TuitionPaymentFragmentbindingInflater1("closing out socket (exception)");
                }
                asinterface.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
                asinterface.asBinder.TuitionPaymentFragmentbindingInflater1();
            } else {
                String strD = asinterface.d.d();
                String strTuitionPaymentFragmentbindingInflater2 = asinterface.d.b().TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Connection".toLowerCase(Locale.US));
                if (strTuitionPaymentFragmentbindingInflater2 == null) {
                    if (Protocol.TuitionPaymentFragmentbindingInflater1(strD) == Protocol.HTTP_1_1) {
                        protocol = Protocol.HTTP_1_1;
                        strTuitionPaymentFragmentbindingInflater1 = asinterface.f189a.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Connection".toLowerCase(Locale.US));
                        if (strTuitionPaymentFragmentbindingInflater1 == null) {
                            if (protocol == Protocol.HTTP_1_1) {
                                node = asinterface.f189a;
                                if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 3) {
                                    node.TuitionPaymentFragmentbindingInflater1("Recycling keep-alive socket");
                                }
                                b(asinterface.asBinder, asinterface.f189a);
                            }
                        } else if ("keep-alive".equalsIgnoreCase(strTuitionPaymentFragmentbindingInflater1)) {
                            node = asinterface.f189a;
                            if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                                node.TuitionPaymentFragmentbindingInflater1("Recycling keep-alive socket");
                            }
                            b(asinterface.asBinder, asinterface.f189a);
                        }
                    }
                } else if ("keep-alive".equalsIgnoreCase(strTuitionPaymentFragmentbindingInflater2)) {
                    protocol = Protocol.HTTP_1_1;
                    strTuitionPaymentFragmentbindingInflater1 = asinterface.f189a.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Connection".toLowerCase(Locale.US));
                    if (strTuitionPaymentFragmentbindingInflater1 == null) {
                        if (protocol == Protocol.HTTP_1_1) {
                            node = asinterface.f189a;
                            if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                                node.TuitionPaymentFragmentbindingInflater1("Recycling keep-alive socket");
                            }
                            b(asinterface.asBinder, asinterface.f189a);
                        }
                    } else if ("keep-alive".equalsIgnoreCase(strTuitionPaymentFragmentbindingInflater1)) {
                        node = asinterface.f189a;
                        if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                            node.TuitionPaymentFragmentbindingInflater1("Recycling keep-alive socket");
                        }
                        b(asinterface.asBinder, asinterface.f189a);
                    }
                }
                Node node3 = asinterface.f189a;
                if (node3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 2) {
                    node3.TuitionPaymentFragmentbindingInflater1("closing out socket (not keep alive)");
                }
                asinterface.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
                asinterface.asBinder.TuitionPaymentFragmentbindingInflater1();
            }
        } finally {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(asinterface.f189a);
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Node node) {
        Uri uri = node.INotificationSideChannel;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(uri, b(uri), node.f186a, node.d);
        synchronized (this) {
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.b.get(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (tuitionPaymentFragmentbindingInflater1 == null) {
                return;
            }
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1--;
            while (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() > 0) {
                OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2Remove = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove();
                DefaultSurfaceProcessorExternalSyntheticLambda13 defaultSurfaceProcessorExternalSyntheticLambda13 = (DefaultSurfaceProcessorExternalSyntheticLambda13) tuitionPaymentFragmentspecialinlinedviewModeldefault2Remove.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (!defaultSurfaceProcessorExternalSyntheticLambda13.isCancelled()) {
                    defaultSurfaceProcessorExternalSyntheticLambda13.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2Remove));
                }
            }
            TuitionPaymentFragmentbindingInflater1(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    private void b(getAbsolutePathFromUri getabsolutepathfromuri, Node node) {
        final ArrayDeque<b> arrayDeque;
        if (getabsolutepathfromuri == null) {
            return;
        }
        Uri uri = node.INotificationSideChannel;
        final String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(uri, b(uri), node.f186a, node.d);
        final b bVar = new b(getabsolutepathfromuri);
        synchronized (this) {
            arrayDeque = TuitionPaymentFragmentspecialinlinedviewModeldefault2(strTuitionPaymentFragmentspecialinlinedviewModeldefault2).b;
            arrayDeque.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bVar);
        }
        getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: createOutputSurfaceInternal.3
            @Override // defpackage.lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor
            public final void b(Exception exc) {
                synchronized (createOutputSurfaceInternal.this) {
                    arrayDeque.remove(bVar);
                    createOutputSurfaceInternal.this.TuitionPaymentFragmentbindingInflater1(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
        });
    }
}
