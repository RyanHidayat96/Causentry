package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.gms.security.ProviderInstaller;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class isSuperset extends unregisterOutputSurface {
    private static Object TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Object();
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean TuitionPaymentFragmentbindingInflater1 = true;
    private boolean asInterface;
    private Context b;
    private createEglContext g;

    public isSuperset(Context context, createEglContext createeglcontext) {
        this.g = createeglcontext;
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.unregisterOutputSurface, defpackage.OpenGlRenderer
    public final lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault3(OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        if (!this.TuitionPaymentFragmentbindingInflater1) {
            return null;
        }
        Context context = this.b;
        try {
            synchronized (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                    if (Security.getProvider(ProviderInstaller.PROVIDER_NAME) != null) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                    } else {
                        SSLContext sSLContext = SSLContext.getDefault();
                        SSLSocketFactory defaultSSLSocketFactory = HttpsURLConnection.getDefaultSSLSocketFactory();
                        ProviderInstaller.installIfNeeded(context);
                        Provider[] providers = Security.getProviders();
                        Provider provider = Security.getProvider(ProviderInstaller.PROVIDER_NAME);
                        Security.removeProvider(ProviderInstaller.PROVIDER_NAME);
                        Security.insertProviderAt(provider, providers.length);
                        SSLContext.setDefault(sSLContext);
                        HttpsURLConnection.setDefaultSSLSocketFactory(defaultSSLSocketFactory);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3 && !this.asInterface && this.TuitionPaymentFragmentbindingInflater1) {
            this.asInterface = true;
            try {
                SSLContext sSLContext2 = SSLContext.getInstance("TLS", ProviderInstaller.PROVIDER_NAME);
                int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
                if (measureChildConstrained.TuitionPaymentFragmentbindingInflater1(new ArrayList()) != 0) {
                    int[] iArr = new int[iIntValue];
                    int i = iIntValue - 1;
                    iArr[i] = 1;
                    Toast.makeText((Context) null, iArr[((iIntValue * i) % 2) - 1], 1).show();
                }
                sSLContext2.init(null, null, null);
                SSLContext sSLContextD = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (sSLContextD == null) {
                    sSLContextD = isLongerInAnyEdge.d();
                }
                if (sSLContextD == isLongerInAnyEdge.d()) {
                    this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sSLContext2;
                }
            } catch (Exception unused2) {
            }
        }
        return super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }
}
