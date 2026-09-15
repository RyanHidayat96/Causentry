package defpackage;

import com.google.android.gms.security.ProviderInstaller;
import java.lang.reflect.Field;
import java.util.Hashtable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

/* JADX INFO: loaded from: classes4.dex */
public final class setInputFormat implements InternalImageProcessorExternalSyntheticLambda0 {
    private Hashtable<String, b> b = new Hashtable<>();

    static class b implements InternalImageProcessorExternalSyntheticLambda0 {
        private Field TuitionPaymentFragmentbindingInflater1;
        private Field TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private Field TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private Field b;

        @Override // defpackage.InternalImageProcessorExternalSyntheticLambda0
        public final SSLEngine b(SSLContext sSLContext, String str, int i) {
            return null;
        }

        public b(Class cls) {
            try {
                Field declaredField = cls.getSuperclass().getDeclaredField("peerHost");
                this.b = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = cls.getSuperclass().getDeclaredField("peerPort");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("sslParameters");
                this.TuitionPaymentFragmentbindingInflater1 = declaredField3;
                declaredField3.setAccessible(true);
                Field declaredField4 = this.TuitionPaymentFragmentbindingInflater1.getType().getDeclaredField("useSni");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = declaredField4;
                declaredField4.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }

        @Override // defpackage.InternalImageProcessorExternalSyntheticLambda0
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SSLEngine sSLEngine, OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, String str, int i) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                try {
                    this.b.set(sSLEngine, str);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(sSLEngine, Integer.valueOf(i));
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(this.TuitionPaymentFragmentbindingInflater1.get(sSLEngine), Boolean.TRUE);
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    @Override // defpackage.InternalImageProcessorExternalSyntheticLambda0
    public final SSLEngine b(SSLContext sSLContext, String str, int i) {
        ProviderInstaller.PROVIDER_NAME.equals(sSLContext.getProvider().getName());
        return sSLContext.createSSLEngine(str, i);
    }

    @Override // defpackage.InternalImageProcessorExternalSyntheticLambda0
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SSLEngine sSLEngine, OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, String str, int i) {
        String canonicalName = sSLEngine.getClass().getCanonicalName();
        b bVar = this.b.get(canonicalName);
        if (bVar == null) {
            bVar = new b(sSLEngine.getClass());
            this.b.put(canonicalName, bVar);
        }
        bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sSLEngine, tuitionPaymentFragmentspecialinlinedviewModeldefault2, str, i);
    }
}
