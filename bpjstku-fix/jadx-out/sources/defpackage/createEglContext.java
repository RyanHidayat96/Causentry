package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public final class createEglContext extends createOutputSurfaceInternal {
    public SSLContext TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    List<InternalImageProcessorExternalSyntheticLambda0> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private TrustManager[] asInterface;
    public HostnameVerifier b;

    public createEglContext(InternalImageProcessor internalImageProcessor) {
        super(internalImageProcessor, "https", 443);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();
    }

    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getAbsolutePathFromUri getabsolutepathfromuri, OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, Uri uri, int i, final lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor) {
        String host = uri.getHost();
        String host2 = uri.getHost();
        SSLContext sSLContextD = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (sSLContextD == null) {
            sSLContextD = isLongerInAnyEdge.d();
        }
        Iterator<InternalImageProcessorExternalSyntheticLambda0> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
        SSLEngine sSLEngineB = null;
        while (it.hasNext() && (sSLEngineB = it.next().b(sSLContextD, host2, i)) == null) {
        }
        Iterator<InternalImageProcessorExternalSyntheticLambda0> it2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
        while (it2.hasNext()) {
            it2.next().TuitionPaymentFragmentspecialinlinedviewModeldefault3(sSLEngineB, tuitionPaymentFragmentspecialinlinedviewModeldefault2, host2, i);
        }
        isLongerInAnyEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getabsolutepathfromuri, host, i, sSLEngineB, null, this.b, new isLongerInAnyEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: createEglContext.4
            @Override // isLongerInAnyEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc, UseCaseConfigUtil useCaseConfigUtil) {
                lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor.b(exc, useCaseConfigUtil);
            }
        });
    }

    /* JADX INFO: renamed from: createEglContext$1, reason: invalid class name */
    final class AnonymousClass1 implements lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor {
        final /* synthetic */ lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentbindingInflater1;
        final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final /* synthetic */ OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final /* synthetic */ Uri TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ boolean d;

        AnonymousClass1(lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor, boolean z, OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, Uri uri, int i) {
            this.TuitionPaymentFragmentbindingInflater1 = lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor;
            this.d = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = uri;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        }

        @Override // defpackage.lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor
        public final void b(Exception exc, final getAbsolutePathFromUri getabsolutepathfromuri) {
            if (exc != null) {
                this.TuitionPaymentFragmentbindingInflater1.b(exc, getabsolutepathfromuri);
                return;
            }
            if (!this.d) {
                createEglContext.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getabsolutepathfromuri, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1);
                return;
            }
            Locale locale = Locale.ENGLISH;
            String host = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getHost();
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str = String.format(locale, "CONNECT %s:%s HTTP/1.1\r\nHost: %s\r\n\r\n", host, Integer.valueOf(i), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getHost());
            Node node = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a;
            String strConcat = "Proxying: ".concat(String.valueOf(str));
            if (node.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 2) {
                node.TuitionPaymentFragmentbindingInflater1(strConcat);
            }
            lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getabsolutepathfromuri, str.getBytes(), new lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: createEglContext.1.2
                @Override // defpackage.lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor
                public final void b(Exception exc2) {
                    if (exc2 != null) {
                        AnonymousClass1.this.TuitionPaymentFragmentbindingInflater1.b(exc2, getabsolutepathfromuri);
                        return;
                    }
                    lambdaexecuteSafely12androidxcameracoreprocessingDefaultSurfaceProcessor lambdaexecutesafely12androidxcameracoreprocessingdefaultsurfaceprocessor = new lambdaexecuteSafely12androidxcameracoreprocessingDefaultSurfaceProcessor();
                    lambdaexecutesafely12androidxcameracoreprocessingdefaultsurfaceprocessor.b = new lambdaexecuteSafely12androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2() { // from class: createEglContext.1.2.4
                        private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

                        @Override // lambdaexecuteSafely12androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str2) {
                            Node node2 = AnonymousClass1.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.f189a;
                            if (node2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && node2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 2) {
                                node2.TuitionPaymentFragmentbindingInflater1(str2);
                            }
                            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                                String strTrim = str2.trim();
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = strTrim;
                                if (strTrim.matches("HTTP/1.\\d 2\\d\\d .*")) {
                                    return;
                                }
                                getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3((lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor) null);
                                getabsolutepathfromuri.b(null);
                                lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor = AnonymousClass1.this.TuitionPaymentFragmentbindingInflater1;
                                StringBuilder sb = new StringBuilder("non 2xx status line: ");
                                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor.b(new IOException(sb.toString()), getabsolutepathfromuri);
                                return;
                            }
                            if (TextUtils.isEmpty(str2.trim())) {
                                getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3((lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor) null);
                                getabsolutepathfromuri.b(null);
                                createEglContext.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getabsolutepathfromuri, AnonymousClass1.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, AnonymousClass1.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, AnonymousClass1.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, AnonymousClass1.this.TuitionPaymentFragmentbindingInflater1);
                            }
                        }
                    };
                    getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaexecutesafely12androidxcameracoreprocessingdefaultsurfaceprocessor);
                    getabsolutepathfromuri.b(new lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: createEglContext.1.2.3
                        @Override // defpackage.lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor
                        public final void b(Exception exc3) {
                            if (!getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1() && exc3 == null) {
                                exc3 = new IOException("socket closed before proxy connect response");
                            }
                            AnonymousClass1.this.TuitionPaymentFragmentbindingInflater1.b(exc3, getabsolutepathfromuri);
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.createOutputSurfaceInternal
    protected final lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault3(OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, Uri uri, int i, boolean z, lambdaonInputSurface0androidxcameracoreprocessingDefaultSurfaceProcessor lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor) {
        return new AnonymousClass1(lambdaoninputsurface0androidxcameracoreprocessingdefaultsurfaceprocessor, z, tuitionPaymentFragmentspecialinlinedviewModeldefault2, uri, i);
    }
}
