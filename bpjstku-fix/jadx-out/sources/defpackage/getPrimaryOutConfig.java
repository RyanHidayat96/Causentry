package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getPrimaryOutConfig extends unregisterOutputSurface {
    private CookieManager TuitionPaymentFragmentbindingInflater1;
    private SharedPreferences TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private calculateInvertedTextureTransform b;

    public getPrimaryOutConfig(calculateInvertedTextureTransform calculateinvertedtexturetransform) {
        this.b = calculateinvertedtexturetransform;
    }

    private void TuitionPaymentFragmentbindingInflater1() {
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            this.TuitionPaymentFragmentbindingInflater1 = new CookieManager(null, null);
            Context context = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.cancel);
            sb.append("-cookies");
            SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sharedPreferences;
            for (String str : sharedPreferences.getAll().keySet()) {
                try {
                    String string = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(str, null);
                    getOutSurfaceOrThrow getoutsurfaceorthrow = new getOutSurfaceOrThrow();
                    boolean z = true;
                    for (String str2 : string.split("\n")) {
                        if (z) {
                            z = false;
                        } else if (!TextUtils.isEmpty(str2)) {
                            getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2);
                        }
                    }
                    this.TuitionPaymentFragmentbindingInflater1.put(URI.create(str), getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // defpackage.unregisterOutputSurface, defpackage.OpenGlRenderer
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        TuitionPaymentFragmentbindingInflater1();
        try {
            Map<String, List<String>> map = this.TuitionPaymentFragmentbindingInflater1.get(URI.create(tuitionPaymentFragmentspecialinlinedviewModeldefault3.f189a.INotificationSideChannel.toString()), tuitionPaymentFragmentspecialinlinedviewModeldefault3.f189a.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            getOutSurfaceOrThrow getoutsurfaceorthrow = tuitionPaymentFragmentspecialinlinedviewModeldefault3.f189a.g;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3(key, entry.getValue());
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.unregisterOutputSurface, defpackage.OpenGlRenderer
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(OpenGlRenderer.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        TuitionPaymentFragmentbindingInflater1();
        try {
            URI uriCreate = URI.create(tuitionPaymentFragmentspecialinlinedviewModeldefault1.f189a.INotificationSideChannel.toString());
            getOutSurfaceOrThrow getoutsurfaceorthrowB = tuitionPaymentFragmentspecialinlinedviewModeldefault1.d.b();
            TuitionPaymentFragmentbindingInflater1();
            this.TuitionPaymentFragmentbindingInflater1.put(uriCreate, getoutsurfaceorthrowB.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (getoutsurfaceorthrowB.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Set-Cookie".toLowerCase(Locale.US)) == null) {
                return;
            }
            List<HttpCookie> list = this.TuitionPaymentFragmentbindingInflater1.getCookieStore().get(uriCreate);
            getOutSurfaceOrThrow getoutsurfaceorthrow = new getOutSurfaceOrThrow();
            for (HttpCookie httpCookie : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(httpCookie.getName());
                sb.append("=");
                sb.append(httpCookie.getValue());
                sb.append("; path=");
                sb.append(httpCookie.getPath());
                getoutsurfaceorthrow.TuitionPaymentFragmentbindingInflater1("Set-Cookie", sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uriCreate.getScheme());
            sb2.append("://");
            sb2.append(uriCreate.getAuthority());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.edit().putString(sb2.toString(), getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2("HTTP/1.1 200 OK")).commit();
        } catch (Exception unused) {
        }
    }
}
