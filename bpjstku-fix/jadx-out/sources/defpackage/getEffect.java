package defpackage;

import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class getEffect {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private CookieManager b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("CookieWriter");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
    }

    public getEffect(boolean z) {
        if (z) {
            try {
                CookieManager.setAcceptFileSchemeCookies(true);
            } catch (Exception unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.a("unable to access CookieManager");
                    return;
                }
                return;
            }
        }
        if (!CookieManager.getInstance().acceptCookie()) {
            CookieManager.getInstance().setAcceptCookie(true);
        }
        this.b = CookieManager.getInstance();
    }

    public final void TuitionPaymentFragmentbindingInflater1(Set<String> set, Collection<String> collection, boolean z) {
        if (this.b == null) {
            return;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            StringBuilder sb = new StringBuilder("domains: ");
            sb.append(set.toString());
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
            StringBuilder sb2 = new StringBuilder("cookies: ");
            sb2.append(collection.toString());
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb2.toString());
        }
        for (String str : set) {
            for (String string : collection) {
                CookieManager cookieManager = this.b;
                if (z) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(string);
                    sb3.append("; secure");
                    string = sb3.toString();
                }
                cookieManager.setCookie(str, string);
            }
        }
        this.b.flush();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Set<String> set, Collection<String> collection) {
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            for (String str2 : collection) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("=; Max-Age=-1");
                arrayList.add(sb.toString());
            }
        }
        this.b.flush();
        TuitionPaymentFragmentbindingInflater1(set, arrayList, false);
    }
}
