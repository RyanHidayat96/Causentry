package defpackage;

import java.util.NoSuchElementException;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public final class onInputSurface {
    private static final String TuitionPaymentFragmentbindingInflater1;
    private static final ThreadLocal<Vector<lambdanew3androidxcameracoreSurfaceRequest>> b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("ActionThreadLocal");
        TuitionPaymentFragmentbindingInflater1 = sb.toString();
        b = new ThreadLocal<Vector<lambdanew3androidxcameracoreSurfaceRequest>>() { // from class: onInputSurface.4
            @Override // java.lang.ThreadLocal
            protected final /* synthetic */ Vector<lambdanew3androidxcameracoreSurfaceRequest> initialValue() {
                return new Vector<>();
            }
        };
    }

    private static void b() {
        synchronized (onInputSurface.class) {
            Vector vector = new Vector(b.get());
            for (int i = 0; i < vector.size(); i++) {
                try {
                    ThreadLocal<Vector<lambdanew3androidxcameracoreSurfaceRequest>> threadLocal = b;
                    lambdanew3androidxcameracoreSurfaceRequest lambdanew3androidxcameracoresurfacerequest = threadLocal.get().get(i);
                    if (lambdanew3androidxcameracoresurfacerequest != null && lambdanew3androidxcameracoresurfacerequest.cancel()) {
                        threadLocal.get().remove(lambdanew3androidxcameracoresurfacerequest);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            vector.clear();
        }
    }

    static final boolean TuitionPaymentFragmentbindingInflater1(lambdanew3androidxcameracoreSurfaceRequest lambdanew3androidxcameracoresurfacerequest) {
        boolean zRemove = b.get().remove(lambdanew3androidxcameracoresurfacerequest);
        b();
        return zRemove;
    }

    public static final lambdanew3androidxcameracoreSurfaceRequest TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b();
        try {
            return b.get().lastElement();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Vector vector;
        synchronized (onInputSurface.class) {
            try {
                ThreadLocal<Vector<lambdanew3androidxcameracoreSurfaceRequest>> threadLocal = b;
                synchronized (threadLocal) {
                    vector = new Vector(threadLocal.get());
                }
                for (int i = 0; i < vector.size(); i++) {
                    lambdanew3androidxcameracoreSurfaceRequest lambdanew3androidxcameracoresurfacerequest = (lambdanew3androidxcameracoreSurfaceRequest) vector.get(i);
                    if (lambdanew3androidxcameracoresurfacerequest != null && !lambdanew3androidxcameracoresurfacerequest.cancel()) {
                        lambdanew3androidxcameracoresurfacerequest.MediaBrowserCompat();
                    }
                }
            } catch (Exception unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentbindingInflater1("Expected exception? It depends on what you expect!");
                }
            }
        }
    }
}
