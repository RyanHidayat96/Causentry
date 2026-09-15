package defpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getContentPaddingRight {
    private static final List<b> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();
    static volatile b[] TuitionPaymentFragmentbindingInflater1 = new b[0];
    private static final b b = new b() { // from class: getContentPaddingRight.1
        @Override // getContentPaddingRight.b
        public final void TuitionPaymentFragmentbindingInflater1(String str, Object... objArr) throws IOException {
            for (b bVar : getContentPaddingRight.TuitionPaymentFragmentbindingInflater1) {
                bVar.TuitionPaymentFragmentbindingInflater1(str, objArr);
            }
        }

        @Override // getContentPaddingRight.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th, String str, Object... objArr) throws IOException {
            for (b bVar : getContentPaddingRight.TuitionPaymentFragmentbindingInflater1) {
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th, str, objArr);
            }
        }

        @Override // getContentPaddingRight.b
        public final void b(String str, Object... objArr) throws IOException {
            for (b bVar : getContentPaddingRight.TuitionPaymentFragmentbindingInflater1) {
                bVar.b(str, objArr);
            }
        }

        @Override // getContentPaddingRight.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th, String str, Object... objArr) throws IOException {
            for (b bVar : getContentPaddingRight.TuitionPaymentFragmentbindingInflater1) {
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, str, objArr);
            }
        }

        @Override // getContentPaddingRight.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, Object... objArr) throws IOException {
            for (b bVar : getContentPaddingRight.TuitionPaymentFragmentbindingInflater1) {
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, objArr);
            }
        }

        @Override // getContentPaddingRight.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) throws IOException {
            for (b bVar : getContentPaddingRight.TuitionPaymentFragmentbindingInflater1) {
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // getContentPaddingRight.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, Object... objArr) throws IOException {
            for (b bVar : getContentPaddingRight.TuitionPaymentFragmentbindingInflater1) {
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, objArr);
            }
        }

        @Override // getContentPaddingRight.b
        public final void TuitionPaymentFragmentbindingInflater1(Throwable th, String str, Object... objArr) throws IOException {
            for (b bVar : getContentPaddingRight.TuitionPaymentFragmentbindingInflater1) {
                bVar.TuitionPaymentFragmentbindingInflater1(th, str, objArr);
            }
        }

        @Override // getContentPaddingRight.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) throws IOException {
            for (b bVar : getContentPaddingRight.TuitionPaymentFragmentbindingInflater1) {
                bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            }
        }

        @Override // getContentPaddingRight.b
        protected final void TuitionPaymentFragmentbindingInflater1(int i, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }
    };

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, Object... objArr) throws IOException {
        b.TuitionPaymentFragmentbindingInflater1(str, objArr);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, Object... objArr) throws IOException {
        b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, str, objArr);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, Object... objArr) throws IOException {
        b.b(str, objArr);
    }

    public static void b(String str, Object... objArr) throws IOException {
        b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(null, str, objArr);
    }

    public static void asBinder(String str, Object... objArr) throws IOException {
        b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, objArr);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) throws IOException {
        b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
    }

    public static void TuitionPaymentFragmentbindingInflater1(String str, Object... objArr) throws IOException {
        b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, objArr);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th, String str, Object... objArr) throws IOException {
        b.TuitionPaymentFragmentbindingInflater1(th, str, objArr);
    }

    public static void TuitionPaymentFragmentbindingInflater1(Throwable th) throws IOException {
        b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
    }

    public static b b(String str) {
        for (b bVar : TuitionPaymentFragmentbindingInflater1) {
            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(str);
        }
        return b;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(b bVar) {
        if (bVar == b) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        List<b> list = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        synchronized (list) {
            list.add(bVar);
            TuitionPaymentFragmentbindingInflater1 = (b[]) list.toArray(new b[list.size()]);
        }
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int size;
        List<b> list = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        synchronized (list) {
            size = list.size();
        }
        return size;
    }

    public static abstract class b {
        final ThreadLocal<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ThreadLocal<>();

        protected abstract void TuitionPaymentFragmentbindingInflater1(int i, String str, String str2, Throwable th);

        public void TuitionPaymentFragmentbindingInflater1(String str, Object... objArr) throws IOException {
            b(2, null, str, objArr);
        }

        public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th, String str, Object... objArr) throws IOException {
            b(2, th, str, objArr);
        }

        public void b(String str, Object... objArr) throws IOException {
            b(3, null, str, objArr);
        }

        public void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th, String str, Object... objArr) throws IOException {
            b(3, th, str, objArr);
        }

        public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, Object... objArr) throws IOException {
            b(5, null, str, objArr);
        }

        public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) throws IOException {
            b(5, th, null, new Object[0]);
        }

        public void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, Object... objArr) throws IOException {
            b(6, null, str, objArr);
        }

        public void TuitionPaymentFragmentbindingInflater1(Throwable th, String str, Object... objArr) throws IOException {
            b(6, th, str, objArr);
        }

        public void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) throws IOException {
            b(6, th, null, new Object[0]);
        }

        private static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) throws IOException {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        private void b(int i, Throwable th, String str, Object... objArr) throws IOException {
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get();
            if (str2 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove();
            }
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str != null) {
                if (objArr != null && objArr.length > 0) {
                    str = String.format(str, objArr);
                }
                if (th != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("\n");
                    sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3(th));
                    str = sb.toString();
                }
            } else if (th == null) {
                return;
            } else {
                str = TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
            }
            TuitionPaymentFragmentbindingInflater1(i, str2, str, th);
        }
    }
}
