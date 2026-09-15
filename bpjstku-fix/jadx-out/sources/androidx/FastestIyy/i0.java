package androidx.FastestIyy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static i0 f286a;

    public static C a() {
        i0 i0Var;
        synchronized (i0.class) {
            if (f286a == null) {
                f286a = new i0();
            }
            i0Var = f286a;
        }
        return i0Var;
    }

    public final void b(final String str, final String str2) {
        Objects.requireNonNull(str2);
        try {
            Runnable runnable = new Runnable() { // from class: androidx.FastestIyy.i0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.a(str, str2);
                }
            };
            n0.a();
            n0.f292a.accept_fewer(runnable, true, false);
        } catch (Error | Exception unused) {
        }
    }

    public static void a(String str, String str2) {
        n0.a();
        n0.f292a.clubs_neighborhood(str, str2);
    }

    public final h0 a(String str, final B b) {
        Objects.requireNonNull(b);
        InvocationHandler invocationHandler = new InvocationHandler() { // from class: androidx.FastestIyy.i0$$ExternalSyntheticLambda1
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return i0.a(b, obj, method, objArr);
            }
        };
        n0.a();
        return new h0(n0.f292a.specify_simon(str, invocationHandler));
    }

    public static /* synthetic */ Object a(B b, Object obj, Method method, Object[] objArr) {
        final String[] strArr = new String[1];
        try {
            b.a((String) objArr[0], (String) objArr[1], new j0() { // from class: androidx.FastestIyy.i0$$ExternalSyntheticLambda3
                @Override // androidx.FastestIyy.j0
                public final void a(String str) {
                    i0.a(strArr, str);
                }
            });
        } catch (Error | Exception unused) {
        }
        return strArr[0];
    }

    public static /* synthetic */ void a(String[] strArr, String str) {
        strArr[0] = str;
    }

    public final void a(String str, String str2, final j0 j0Var) {
        Objects.requireNonNull(str2);
        if (j0Var == null) {
            n0.a();
            n0.f292a.clubs_neighborhood(str, str2);
        } else {
            InvocationHandler invocationHandler = new InvocationHandler() { // from class: androidx.FastestIyy.i0$$ExternalSyntheticLambda2
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    return i0.a(j0Var, obj, method, objArr);
                }
            };
            n0.a();
            n0.f292a.buried_ozone(str, str2, invocationHandler);
        }
    }

    public static /* synthetic */ Object a(j0 j0Var, Object obj, Method method, Object[] objArr) {
        try {
            j0Var.a((String) obj);
            return null;
        } catch (Error | Exception unused) {
            return null;
        }
    }
}
