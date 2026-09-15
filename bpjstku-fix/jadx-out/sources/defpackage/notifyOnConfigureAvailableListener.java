package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class notifyOnConfigureAvailableListener {
    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    static {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    private static Object TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method TuitionPaymentFragmentbindingInflater1(Object obj) {
        try {
            Method methodTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1("getStackTraceDepth", Throwable.class);
            if (methodTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                return null;
            }
            methodTuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj, new Throwable());
            return methodTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Method TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }
}
