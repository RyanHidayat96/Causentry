package androidx;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.FastestIyy.B;
import androidx.FastestIyy.I;
import androidx.FastestIyy.V;
import androidx.FastestIyy.W;
import androidx.FastestIyy.Y;
import androidx.FastestIyy.a0;
import androidx.FastestIyy.h0;
import androidx.FastestIyy.i0;
import androidx.FastestIyy.j0;
import androidx.FastestIyy.n0;
import androidx.FastestIyy.p0;
import defpackage.abortCapture;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.InvocationHandler;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class FastestIyy extends ContentProvider {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f258a;
    public static final byte[] b;
    public static a0 c;
    public static Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f259e;
    public static final AtomicBoolean f;
    public static FastestIyy g;
    public static final Object h;
    public static Thread i;
    public static final String[] j;
    private static final byte[] $$a = {27, -8, 5, 78, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
    private static final int $$b = 254;
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {48, -119, -71, 110, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 6;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        f258a = new byte[]{76, 105, 110, 107, 101, 114, 58, 32, 76, 76, 68};
        b = new byte[]{65, 110, 100, 114, 111, 105, 100, 0};
        c = null;
        f259e = new AtomicBoolean(false);
        f = new AtomicBoolean(false);
        g = null;
        h = new Object();
        i = null;
        j = new String[]{"c4aa19b95764eb93732ebb4c04177ab3b257cde0fa1c7d1d7d231da12089e2d6", "aed68538b14d1737cbd435acf1a097251ad0a9c7208bb3169c922f694614b310", "0a591e406312999209029afaf095a81a0c6793ae89e1dac1d1e99d2a79ebec34", "3fb5f6c8796b685ff26190f70cf1e43ae91fabe6293c9f4da9f1bbdaa540138c"};
    }

    public static /* synthetic */ void a(String str, String str2, j0 j0Var) {
    }

    public static boolean a() {
        synchronized (h) {
            if (f259e.get()) {
                return true;
            }
            if (i != null) {
                return true;
            }
            Thread thread = new Thread(new Runnable() { // from class: androidx.FastestIyy$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    FastestIyy.e();
                }
            });
            i = thread;
            thread.start();
            return true;
        }
    }

    public static FastestIyy b() {
        FastestIyy fastestIyy;
        synchronized (h) {
            if (g == null) {
                g = new FastestIyy();
            }
            fastestIyy = g;
        }
        return fastestIyy;
    }

    public static void c() {
        Context context = d;
        synchronized (Y.class) {
            if (V.b == null) {
                Y y = new Y(context);
                y.a();
                V.b = new W(y);
            }
        }
        p0.a(d);
        a0 a0Var = c;
        a0Var.b.a(a0Var.f274a);
    }

    public static void d() {
        h0 h0VarA = ((i0) i0.a()).a("++--++", new B() { // from class: androidx.FastestIyy$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.B
            public final void a(String str, String str2, j0 j0Var) {
                FastestIyy.a(str, str2, j0Var);
            }
        });
        n0.a();
        FastestIyy fastestIyy = n0.f292a;
        fastestIyy.fiber_forced("++--++", "");
        long j2 = h0VarA.f284a;
        n0.a();
        fastestIyy.weight_success(j2);
    }

    public static void e() {
        FastestIyy fastestIyyB = b();
        StringBuilder sb = new StringBuilder();
        byte[] bytes = "designationplants                                                                      ".getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bytes[i2];
            boolean z = b2 > 64 && b2 < 91;
            boolean z2 = b2 > 96 && b2 < 123;
            if (z || z2) {
                sb.append((char) b2);
            }
            i2++;
        }
        final String string = sb.toString();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(string);
        f.set(true);
        Context context = fastestIyyB.getContext();
        if (context == null) {
            n0.a();
            context = (Context) n0.f292a.width_outputs();
        }
        d = context;
        Runnable runnable = new Runnable() { // from class: androidx.FastestIyy$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                FastestIyy.a(string);
            }
        };
        n0.a();
        FastestIyy fastestIyy = n0.f292a;
        fastestIyy.accept_fewer(runnable, true, false);
        i0.a();
        c = new a0(d);
        Context context2 = d;
        n0.a();
        fastestIyy.doubt_villa(context2);
        Runnable runnable2 = new Runnable() { // from class: androidx.FastestIyy$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                FastestIyy.c();
            }
        };
        n0.a();
        fastestIyy.accept_fewer(runnable2, true, false);
        Runnable runnable3 = new Runnable() { // from class: androidx.FastestIyy$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                FastestIyy.d();
            }
        };
        n0.a();
        fastestIyy.accept_fewer(runnable3, true, false);
        synchronized (h) {
            f259e.set(true);
            i = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = r7 + 102
            byte[] r0 = androidx.FastestIyy.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r9 = r9 * 2
            int r9 = r9 + 11
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r7 = r7 + r8
            int r7 = r7 + 2
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.FastestIyy.m(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void n(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = r8 + 84
            int r6 = r6 * 2
            int r0 = r6 + 53
            byte[] r1 = androidx.FastestIyy.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 52
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2e
        L19:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r8]
        L2e:
            int r7 = r7 + r4
            int r8 = r8 + 1
            int r7 = r7 + (-10)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.FastestIyy.n(int, byte, int, java.lang.Object[]):void");
    }

    public native boolean accept_fewer(Runnable runnable, boolean z, boolean z2);

    public native void barcelona_aging(int i2, InvocationHandler invocationHandler, int i3, boolean z);

    public native boolean buried_ozone(String str, String str2, InvocationHandler invocationHandler);

    public native boolean clubs_neighborhood(String str, String str2);

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public native void doubt_villa(Object obj);

    public native boolean fiber_forced(String str, String str2);

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return a();
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public native long specify_simon(String str, InvocationHandler invocationHandler);

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public native boolean weight_success(long j2);

    public native Object width_outputs();

    private static void k(char[] cArr, int i2, Object[] objArr) {
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i2);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            cArrB[abortcapture.b] = (char) (((long) (cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4])) ^ (((long) abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1) * (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L))));
            abortcapture.b++;
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    public static /* synthetic */ void a(String str) {
        if (((I.a(d, str, j, f258a, b) & 15) >> 2) == 1) {
            I.b();
        }
    }

    private static void l(int i2, char[] cArr, int i3, int i4, boolean z, Object[] objArr) {
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i3];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i3) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + i2);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[i5] = (char) (cArr2[i5] - ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-192590577064050846L))));
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
        }
        if (i4 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i4;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i3 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i3) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i3 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 12 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 58161. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.String r46) {
        /*
            Method dump skipped, instruction units count: 5816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.FastestIyy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.String):void");
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = -83722380;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6398205346714908713L;
    }
}
