package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.android.volley.toolbox.HttpHeaderParser;
import com.koushikdutta.async.AsyncSSLException;
import com.koushikdutta.async.AsyncServer;
import com.koushikdutta.async.http.RedirectLimitExceededException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class InternalImageProcessor {
    public createEglContext TuitionPaymentFragmentbindingInflater1;
    private Operation TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public createOutputSurfaceInternal TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public AsyncServer TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final List<OpenGlRenderer> b;

    public InternalImageProcessor(AsyncServer asyncServer) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.b = copyOnWriteArrayList;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = asyncServer;
        createOutputSurfaceInternal createoutputsurfaceinternal = new createOutputSurfaceInternal(this);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = createoutputsurfaceinternal;
        copyOnWriteArrayList.add(0, createoutputsurfaceinternal);
        createEglContext createeglcontext = new createEglContext(this);
        this.TuitionPaymentFragmentbindingInflater1 = createeglcontext;
        copyOnWriteArrayList.add(0, createeglcontext);
        Operation operation = new Operation();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = operation;
        copyOnWriteArrayList.add(0, operation);
        createEglContext createeglcontext2 = this.TuitionPaymentFragmentbindingInflater1;
        createeglcontext2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(new setInputFormat());
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Node node) {
        if (node.f186a == null) {
            try {
                List<Proxy> listSelect = ProxySelector.getDefault().select(URI.create(node.INotificationSideChannel.toString()));
                if (listSelect.isEmpty()) {
                    return;
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() == Proxy.Type.HTTP && (proxy.address() instanceof InetSocketAddress)) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                    String hostString = inetSocketAddress.getHostString();
                    int port = inetSocketAddress.getPort();
                    node.f186a = hostString;
                    node.d = port;
                }
            } catch (Exception unused) {
            }
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends DefaultSurfaceProcessorExternalSyntheticLambda5<safeProcess> {
        public lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public getAbsolutePathFromUri TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public Runnable b;

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalImageProcessor internalImageProcessor, byte b) {
            this();
        }

        @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda5, defpackage.DefaultSurfaceProcessorExternalSyntheticLambda13, defpackage.lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            if (!super.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                return false;
            }
            getAbsolutePathFromUri getabsolutepathfromuri = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (getabsolutepathfromuri != null) {
                getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
            }
            lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessor == null) {
                return true;
            }
            lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return true;
        }
    }

    static void b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, Exception exc, InternalImageProcessorExternalSyntheticLambda1 internalImageProcessorExternalSyntheticLambda1, Node node, createSurfaceOutputFuture createsurfaceoutputfuture) {
        boolean zB;
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (exc != null) {
            node.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Connection error", exc);
            zB = tuitionPaymentFragmentspecialinlinedviewModeldefault1.b(exc, (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
        } else {
            if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 3) {
                node.TuitionPaymentFragmentbindingInflater1("Connection successful");
            }
            zB = tuitionPaymentFragmentspecialinlinedviewModeldefault1.b((Exception) null, internalImageProcessorExternalSyntheticLambda1, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
        }
        if (zB) {
            createsurfaceoutputfuture.TuitionPaymentFragmentbindingInflater1(exc, internalImageProcessorExternalSyntheticLambda1);
        } else if (internalImageProcessorExternalSyntheticLambda1 != null) {
            internalImageProcessorExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            internalImageProcessorExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1();
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final Node node, final int i, final TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, final createSurfaceOutputFuture createsurfaceoutputfuture) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            TuitionPaymentFragmentbindingInflater1(node, i, tuitionPaymentFragmentspecialinlinedviewModeldefault1, createsurfaceoutputfuture);
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: InternalImageProcessor.3
                @Override // java.lang.Runnable
                public final void run() {
                    InternalImageProcessor.this.TuitionPaymentFragmentbindingInflater1(node, i, tuitionPaymentFragmentspecialinlinedviewModeldefault1, createsurfaceoutputfuture);
                }
            }, 0L);
        }
    }

    final void TuitionPaymentFragmentbindingInflater1(final Node node, final int i, final TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, final createSurfaceOutputFuture createsurfaceoutputfuture) {
        if (i > 15) {
            b(tuitionPaymentFragmentspecialinlinedviewModeldefault1, new RedirectLimitExceededException("too many redirects"), null, node, createsurfaceoutputfuture);
            return;
        }
        Uri uri = node.INotificationSideChannel;
        final OpenGlRenderer.asInterface asinterface = new OpenGlRenderer.asInterface();
        node.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = System.currentTimeMillis();
        asinterface.f189a = node;
        if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 3) {
            node.TuitionPaymentFragmentbindingInflater1("Executing request.");
        }
        Iterator<OpenGlRenderer> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault3((OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault3) asinterface);
        }
        if (node.asInterface > 0) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.b = new Runnable() { // from class: InternalImageProcessor.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                        asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        if (asinterface.asBinder != null) {
                            asinterface.asBinder.TuitionPaymentFragmentbindingInflater1();
                        }
                    }
                    InternalImageProcessor.b(tuitionPaymentFragmentspecialinlinedviewModeldefault1, new TimeoutException(), null, node, createsurfaceoutputfuture);
                }
            };
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault1.b, node.asInterface);
        }
        asinterface.TuitionPaymentFragmentbindingInflater1 = new lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: InternalImageProcessor.4
            private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

            @Override // defpackage.lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor
            public final void b(Exception exc, getAbsolutePathFromUri getabsolutepathfromuri) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && getabsolutepathfromuri != null) {
                    getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                    getabsolutepathfromuri.b(new lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    getabsolutepathfromuri.TuitionPaymentFragmentbindingInflater1();
                    throw new AssertionError("double connect callback");
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                Node node2 = node;
                if (node2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 2) {
                    node2.TuitionPaymentFragmentbindingInflater1("socket connected");
                }
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.isCancelled()) {
                    if (getabsolutepathfromuri != null) {
                        getabsolutepathfromuri.TuitionPaymentFragmentbindingInflater1();
                        return;
                    }
                    return;
                }
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.b != null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                if (exc == null) {
                    asinterface.asBinder = getabsolutepathfromuri;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getabsolutepathfromuri;
                    final InternalImageProcessor internalImageProcessor = InternalImageProcessor.this;
                    Node node3 = node;
                    int i2 = i;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    createSurfaceOutputFuture createsurfaceoutputfuture2 = createsurfaceoutputfuture;
                    OpenGlRenderer.asInterface asinterface2 = asinterface;
                    final AnonymousClass5 anonymousClass5 = internalImageProcessor.new AnonymousClass5(node3, tuitionPaymentFragmentspecialinlinedviewModeldefault2, node3, createsurfaceoutputfuture2, asinterface2, i2);
                    asinterface2.g = new lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: InternalImageProcessor.2
                        @Override // defpackage.lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor
                        public final void b(Exception exc2) {
                            if (exc2 != null) {
                                anonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc2);
                            } else {
                                anonymousClass5.cancelAll();
                            }
                        }
                    };
                    asinterface2.b = new lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: InternalImageProcessor.8
                        @Override // defpackage.lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor
                        public final void b(Exception exc2) {
                            if (exc2 != null) {
                                anonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc2);
                            } else {
                                anonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            }
                        }
                    };
                    asinterface2.d = anonymousClass5;
                    getAbsolutePathFromUri getabsolutepathfromuri2 = asinterface2.asBinder;
                    anonymousClass5.asBinder = getabsolutepathfromuri2;
                    if (getabsolutepathfromuri2 != null) {
                        getabsolutepathfromuri2.b(((InternalImageProcessorExternalSyntheticLambda1) anonymousClass5).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                    Iterator<OpenGlRenderer> it2 = internalImageProcessor.b.iterator();
                    while (it2.hasNext() && !it2.next().b((OpenGlRenderer.b) asinterface2)) {
                    }
                    return;
                }
                InternalImageProcessor.b(tuitionPaymentFragmentspecialinlinedviewModeldefault1, exc, null, node, createsurfaceoutputfuture);
            }
        };
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(node);
        if (node.TuitionPaymentFragmentbindingInflater1 != null && node.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(HttpHeaderParser.HEADER_CONTENT_TYPE.toLowerCase(Locale.US)) == null) {
            node.g.b(HttpHeaderParser.HEADER_CONTENT_TYPE, node.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
        Iterator<OpenGlRenderer> it2 = this.b.iterator();
        while (it2.hasNext()) {
            lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = it2.next().TuitionPaymentFragmentspecialinlinedviewModeldefault3((OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2) asinterface);
            if (lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessorTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessorTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdarelease5androidxcameracoreprocessingdefaultsurfaceprocessorTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                return;
            }
        }
        StringBuilder sb = new StringBuilder("invalid uri=");
        sb.append(node.INotificationSideChannel);
        sb.append(" middlewares=");
        sb.append(this.b);
        b(tuitionPaymentFragmentspecialinlinedviewModeldefault1, new IllegalArgumentException(sb.toString()), null, node, createsurfaceoutputfuture);
    }

    /* JADX INFO: renamed from: InternalImageProcessor$5, reason: invalid class name */
    final class AnonymousClass5 extends InternalImageProcessorExternalSyntheticLambda1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f159a;
        private /* synthetic */ createSurfaceOutputFuture asInterface;
        private /* synthetic */ Node cancelAll;
        private /* synthetic */ OpenGlRenderer.asInterface d;
        private /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Node node, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, Node node2, createSurfaceOutputFuture createsurfaceoutputfuture, OpenGlRenderer.asInterface asinterface, int i) {
            super(node);
            this.g = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.cancelAll = node2;
            this.asInterface = createsurfaceoutputfuture;
            this.d = asinterface;
            this.f159a = i;
        }

        @Override // defpackage.InternalImageProcessorExternalSyntheticLambda1
        protected final void TuitionPaymentFragmentbindingInflater1(Exception exc) {
            if (exc == null) {
                Node node = this.cancelAll;
                if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 2) {
                    node.TuitionPaymentFragmentbindingInflater1("request completed");
                }
                if (this.g.isCancelled()) {
                    return;
                }
                if (this.g.b != null && ((InternalImageProcessorExternalSyntheticLambda1) this).TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = InternalImageProcessor.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(this.g.b, this.cancelAll.asInterface);
                }
                Iterator<OpenGlRenderer> it = InternalImageProcessor.this.b.iterator();
                while (it.hasNext()) {
                    it.next().b((OpenGlRenderer.g) this.d);
                }
                return;
            }
            InternalImageProcessor.b(this.g, exc, null, this.cancelAll, this.asInterface);
        }

        @Override // defpackage.lambdaexecuteSafely11, defpackage.DefaultSurfaceProcessor
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkReadyToRelease checkreadytorelease) {
            this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = checkreadytorelease;
            Iterator<OpenGlRenderer> it = InternalImageProcessor.this.b.iterator();
            while (it.hasNext()) {
                it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault2((OpenGlRenderer.TuitionPaymentFragmentbindingInflater1) this.d);
            }
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            for (OpenGlRenderer openGlRenderer : InternalImageProcessor.this.b) {
            }
            getOutSurfaceOrThrow getoutsurfaceorthrow = ((InternalImageProcessorExternalSyntheticLambda1) this).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i = ((InternalImageProcessorExternalSyntheticLambda1) this).b;
            if ((i != 301 && i != 302 && i != 307) || !this.cancelAll.b) {
                Node node = this.cancelAll;
                StringBuilder sb = new StringBuilder("Final (post cache response) headers:\n");
                sb.append(toString());
                String string = sb.toString();
                if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 2) {
                    node.TuitionPaymentFragmentbindingInflater1(string);
                }
                InternalImageProcessor.b(this.g, null, this, this.cancelAll, this.asInterface);
                return;
            }
            String strTuitionPaymentFragmentbindingInflater1 = getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Location".toLowerCase(Locale.US));
            try {
                Uri uri = Uri.parse(strTuitionPaymentFragmentbindingInflater1);
                if (uri.getScheme() == null) {
                    uri = Uri.parse(new URL(new URL(this.cancelAll.INotificationSideChannel.toString()), strTuitionPaymentFragmentbindingInflater1).toString());
                }
                final Node node2 = new Node(uri, this.cancelAll.asBinder.equals("HEAD") ? "HEAD" : ShareTarget.METHOD_GET);
                node2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                node2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                node2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                node2.f186a = this.cancelAll.f186a;
                node2.d = this.cancelAll.d;
                InternalImageProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(node2);
                InternalImageProcessor.TuitionPaymentFragmentbindingInflater1(this.cancelAll, node2, "User-Agent");
                InternalImageProcessor.TuitionPaymentFragmentbindingInflater1(this.cancelAll, node2, "Range");
                Node node3 = this.cancelAll;
                if (node3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 4) {
                    node3.TuitionPaymentFragmentbindingInflater1("Redirecting");
                }
                if (node2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 4) {
                    node2.TuitionPaymentFragmentbindingInflater1("Redirected");
                }
                AsyncServer asyncServer = InternalImageProcessor.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                final int i2 = this.f159a;
                final TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.g;
                final createSurfaceOutputFuture createsurfaceoutputfuture = this.asInterface;
                asyncServer.TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: Edge
                    @Override // java.lang.Runnable
                    public final void run() {
                        InternalImageProcessor.AnonymousClass5 anonymousClass5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Node node4 = node2;
                        int i3 = i2;
                        InternalImageProcessor.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3(node4, i3 + 1, tuitionPaymentFragmentspecialinlinedviewModeldefault1, createsurfaceoutputfuture);
                    }
                }, 0L);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(new lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            } catch (Exception e2) {
                InternalImageProcessor.b(this.g, e2, this, this.cancelAll, this.asInterface);
            }
        }

        @Override // defpackage.InternalImageProcessorExternalSyntheticLambda1
        protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (this.g.isCancelled()) {
                return;
            }
            if (this.g.b != null) {
                this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            Node node = this.cancelAll;
            StringBuilder sb = new StringBuilder("Received headers:\n");
            sb.append(toString());
            String string = sb.toString();
            if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 2) {
                node.TuitionPaymentFragmentbindingInflater1(string);
            }
            Iterator<OpenGlRenderer> it = InternalImageProcessor.this.b.iterator();
            while (it.hasNext()) {
                it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.d);
            }
        }

        @Override // defpackage.InternalImageProcessorExternalSyntheticLambda1, defpackage.getSurfaceEdge
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
            if (exc != null) {
                this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1("exception during response", exc);
            }
            if (this.g.isCancelled()) {
                return;
            }
            if (exc instanceof AsyncSSLException) {
                this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1("SSL Exception", exc);
                if (((AsyncSSLException) exc).mIgnore) {
                    return;
                }
            }
            getAbsolutePathFromUri getabsolutepathfromuri = this.asBinder;
            if (getabsolutepathfromuri != null) {
                super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc);
                if ((!getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1() || exc != null) && b() == null && exc != null) {
                    InternalImageProcessor.b(this.g, exc, null, this.cancelAll, this.asInterface);
                }
                this.d.onTransact = exc;
                Iterator<OpenGlRenderer> it = InternalImageProcessor.this.b.iterator();
                while (it.hasNext()) {
                    it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.d);
                }
            }
        }
    }

    static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Node node, Node node2, String str) {
        String strTuitionPaymentFragmentbindingInflater1 = node.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(str.toLowerCase(Locale.US));
        if (TextUtils.isEmpty(strTuitionPaymentFragmentbindingInflater1)) {
            return;
        }
        node2.g.b(str, strTuitionPaymentFragmentbindingInflater1);
    }
}
