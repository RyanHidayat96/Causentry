package defpackage;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes4.dex */
public final class onSurfaceTextureDestroyed {
    String TuitionPaymentFragmentbindingInflater1;
    final Class<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final Method TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final ThreadMode asBinder;
    final boolean b;

    public onSurfaceTextureDestroyed(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = method;
        this.asBinder = threadMode;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cls;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof onSurfaceTextureDestroyed)) {
            return false;
        }
        b();
        onSurfaceTextureDestroyed onsurfacetexturedestroyed = (onSurfaceTextureDestroyed) obj;
        onsurfacetexturedestroyed.b();
        return this.TuitionPaymentFragmentbindingInflater1.equals(onsurfacetexturedestroyed.TuitionPaymentFragmentbindingInflater1);
    }

    private void b() {
        synchronized (this) {
            if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getDeclaringClass().getName());
                sb.append('#');
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getName());
                sb.append('(');
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getName());
                this.TuitionPaymentFragmentbindingInflater1 = sb.toString();
            }
        }
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }
}
