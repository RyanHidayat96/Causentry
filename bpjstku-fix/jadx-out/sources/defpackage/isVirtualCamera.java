package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.AnnotatedString;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\rJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\nJ\u001d\u0010\t\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0012J\u0015\u0010\t\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u000e¢\u0006\u0004\b\t\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0016\"\u0004\b\u0015\u0010\u0017"}, d2 = {"LisVirtualCamera;", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "p1", "", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;)Z", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class isVirtualCamera {
    public static final isVirtualCamera INSTANCE;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private static SemanticsConfiguration TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1234a;
    private static char b;
    private static char d;
    private static char g;
    private static final byte[] $$c = {101, 89, 94, -73};
    private static final int $$f = 221;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {118, 35, -100, -35, 13, 10, -25, 53, 10, -14, 23, 16, 22, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 109;
    private static final byte[] $$a = {39, -79, 42, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 116;
    private static int asBinder = 0;
    private static int INotificationSideChannel = 1;
    private static int asInterface = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.isVirtualCamera.$$a
            int r7 = 53 - r7
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r9 = r9 * 52
            int r9 = 54 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r5 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-10)
            r9 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isVirtualCamera.c(int, short, int, java.lang.Object[]):void");
    }

    private static void f(int i, byte b2, int i2, Object[] objArr) {
        int i3 = i2 + 4;
        byte[] bArr = $$d;
        int i4 = 97 - (b2 * 13);
        int i5 = i * 28;
        byte[] bArr2 = new byte[38 - i5];
        int i6 = 37 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 = (i4 + i3) - 10;
            i3 = i3;
            i7 = -1;
        }
        while (true) {
            int i8 = i3 + 1;
            int i9 = i7 + 1;
            bArr2[i9] = (byte) i4;
            if (i9 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 = (i4 + bArr[i8]) - 10;
                i3 = i8;
                i7 = i9;
            }
        }
    }

    private isVirtualCamera() {
    }

    static {
        f1234a = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        INSTANCE = new isVirtualCamera();
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("SemanticsManager");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sb.toString();
        int i = asInterface + 49;
        f1234a = i % 128;
        if (i % 2 != 0) {
            int i2 = 36 / 0;
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SemanticsConfiguration semanticsConfiguration) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = semanticsConfiguration;
        int i5 = i3 + 39;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return (androidx.compose.ui.semantics.Role) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r0 = (androidx.compose.ui.semantics.Role) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r3 = r3 + 119;
        defpackage.isVirtualCamera.asBinder = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 29;
        defpackage.isVirtualCamera.INotificationSideChannel = r1 % 128;
        r1 = r1 % 2;
        r0 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object TuitionPaymentFragmentbindingInflater1() {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.isVirtualCamera.asBinder
            int r2 = r1 + 47
            int r3 = r2 % 128
            defpackage.isVirtualCamera.INotificationSideChannel = r3
            int r2 = r2 % r0
            r4 = 0
            if (r2 != 0) goto L18
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = defpackage.isVirtualCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r5 = 47
            int r5 = r5 / 0
            if (r2 == 0) goto L39
            goto L1c
        L18:
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = defpackage.isVirtualCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            if (r2 == 0) goto L39
        L1c:
            int r1 = r1 + 29
            int r3 = r1 % 128
            defpackage.isVirtualCamera.INotificationSideChannel = r3
            int r1 = r1 % r0
            androidx.compose.ui.semantics.SemanticsProperties r0 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.getRole()
            if (r1 == 0) goto L32
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r0)
            androidx.compose.ui.semantics.Role r0 = (androidx.compose.ui.semantics.Role) r0
            return r0
        L32:
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r0)
            androidx.compose.ui.semantics.Role r0 = (androidx.compose.ui.semantics.Role) r0
            throw r4
        L39:
            int r3 = r3 + 119
            int r1 = r3 % 128
            defpackage.isVirtualCamera.asBinder = r1
            int r3 = r3 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isVirtualCamera.TuitionPaymentFragmentbindingInflater1():java.lang.Object");
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i5 = $11 + 103;
            $10 = i5 % 128;
            int i6 = 58224;
            char c = 1;
            if (i5 % 2 != 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                int i7 = $10 + 47;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) g) ^ 8611973335120459638L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(d);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c4 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 47772);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 469;
                        int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, iIndexOf, i11, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 47773), 468 - ((Process.getThreadPriority(0) + 20) >> 6), 13 - Color.alpha(0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    i4 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.myTid() >> 22), 2323 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public final String b() throws Throwable {
        Object[] objArr;
        String strB;
        String string;
        int i = 2 % 2;
        int i2 = asBinder + 33;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = asBinder + 103;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                string = "onUA: no SemanticsConfiguration value available";
            } else {
                StringBuilder sb = new StringBuilder("onUA: ");
                sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                string = sb.toString();
            }
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState = (char) (31533 - View.resolveSizeAndState(0, 0, 0));
            int defaultSize = View.getDefaultSize(0, 0) + 921;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29;
            byte b2 = (byte) ($$b & 191);
            byte b3 = $$a[6];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, defaultSize, iIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{38228, 25045, 56833, 46721, 32218, 63553, 39207, 18655, 57445, 39540, 12578, 16308, 25455, 1627, 1960, 16671, 26772, 23856, 60614, 5597, 12027, 4587, 404, 33224}, Color.alpha(0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{43212, 60382, 45340, 50164, 8885, 36763, 48184, 48493, 7631, 8827, 9006, 23667, 22685, 14171, 57209, 23493, 31658, 41539}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0, 0));
            int iIndexOf2 = TextUtils.indexOf("", "", 0) + 921;
            int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte[] bArr = $$a;
            byte b4 = bArr[79];
            Object[] objArr5 = new Object[1];
            c(b4, b4, bArr[6], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iIndexOf2, doubleTapTimeout, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = asBinder + 25;
            INotificationSideChannel = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31532);
                int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
                int i8 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b5 = (byte) (-bArr2[32]);
                byte b6 = bArr2[79];
                Object[] objArr6 = new Object[1];
                c(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, packedPositionType, i8, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode;
            int i10 = ((((-1706524821) + ((~(855634374 | i9)) * (-560))) + ((~(iIdentityHashCode | (-67111954))) * (-560))) + (((~(918445269 | i9)) | 4301058) * 560)) - 1621169386;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{29444, 44685, 4184, 37733, 54272, 27583, 2776, 34218, 6300, 52487, 49026, 51595, 11530, 40808, 10968, 49338, 23477, 13934, 4221, 52045, 53413, 58341, 63609, 45143, 10991, 463, 19623, 44026}, Process.getGidForName("") + 27, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{31357, 52764, 46040, 15469, 49510, 51491, 19341, 25822, 39675, 21763, 51843, 8895, 13307, 29078, 51821, 4056, 59923, 21365, 45688, 44618}, 17 - TextUtils.lastIndexOf("", '0', 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{16332, 2160, 47867, 45791, 28923, 62877, 12311, 21240, 16516, 50448, 56355, 3729, 47267, 25764, 53434, 65520, 15694, 7066}, 16 - Drawable.resolveOpacity(0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{64975, 51240, 19053, 63270, 52979, 36723, 55325, 39250, 29677, 16331, 935, 25739, 2189, 48611, 31818, 17502, 61649, 40816}, (ViewConfiguration.getTapTimeout() >> 16) + 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1621169386};
                byte[] bArr3 = $$d;
                byte b7 = bArr3[16];
                Object[] objArr13 = new Object[1];
                f((byte) (-b7), bArr3[37], b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f(bArr3[37], (byte) (-bArr3[16]), (byte) (-bArr3[34]), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char tapTimeout = (char) (31533 - (ViewConfiguration.getTapTimeout() >> 16));
                    int gidForName = Process.getGidForName("") + 922;
                    int i13 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr4 = $$a;
                    byte b8 = (byte) (-bArr4[32]);
                    byte b9 = bArr4[79];
                    Object[] objArr16 = new Object[1];
                    c(b8, b9, b9, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, gidForName, i13, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(new char[]{38228, 25045, 56833, 46721, 32218, 63553, 39207, 18655, 57445, 39540, 12578, 16308, 25455, 1627, 1960, 16671, 26772, 23856, 60614, 5597, 12027, 4587, 404, 33224}, 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new char[]{43212, 60382, 45340, 50164, 8885, 36763, 48184, 48493, 7631, 8827, 9006, 23667, 22685, 14171, 57209, 23493, 31658, 41539}, (ViewConfiguration.getPressedStateDuration() >> 16) + 15, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31533);
                        int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 921;
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[79];
                        Object[] objArr19 = new Object[1];
                        c(b10, b10, bArr5[6], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, longPressTimeout2, threadPriority, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMakeMeasureSpec = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int modifierMetaStateMask = 920 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int offsetAfter = 28 - TextUtils.getOffsetAfter("", 0);
                        byte b11 = (byte) ($$b & 191);
                        byte b12 = $$a[6];
                        Object[] objArr20 = new Object[1];
                        c(b11, b12, b12, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, modifierMetaStateMask, offsetAfter, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i14 = INotificationSideChannel + 13;
                    asBinder = i14 % 128;
                    int i15 = i14 % 2;
                    objArr = objArr15;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i16 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i17 = ~iIdentityHashCode2;
        int i18 = (~((-207493164) | i17)) | 205525024;
        int i19 = ~(iIdentityHashCode2 | 1568554619);
        int i20 = i16 + 1868426587 + ((i18 | i19) * (-502)) + ((i19 | (~(i17 | (-1968140)))) * TypedValues.PositionType.TYPE_DRAWPATH);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr21[0])[0] = i22 ^ (i22 << 5);
        int i23 = INotificationSideChannel;
        int i24 = i23 + 55;
        asBinder = i24 % 128;
        int i25 = i24 % 2;
        SemanticsConfiguration semanticsConfiguration = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (semanticsConfiguration != null) {
            int i26 = i23 + 63;
            asBinder = i26 % 128;
            if (i26 % 2 != 0) {
                INSTANCE.b(semanticsConfiguration);
                throw null;
            }
            strB = INSTANCE.b(semanticsConfiguration);
        } else {
            strB = null;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        return strB;
    }

    public final String b(SemanticsConfiguration p0) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (p0.contains(ViewPortLayoutDirection.TuitionPaymentFragmentbindingInflater1())) {
            int i4 = asBinder + 97;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 != 0) {
                return TuitionPaymentFragmentbindingInflater1(p0);
            }
            TuitionPaymentFragmentbindingInflater1(p0);
            obj.hashCode();
            throw null;
        }
        if (!p0.contains(SemanticsProperties.INSTANCE.getContentDescription())) {
            if (p0.contains(SemanticsProperties.INSTANCE.getText())) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            }
            return null;
        }
        int i5 = INotificationSideChannel + 19;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
        int i7 = asBinder + 3;
        INotificationSideChannel = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 5 / 0;
        }
        return strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(PointerEvent p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 43;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            PointerEventType.m5458equalsimpl0(p0.getType(), PointerEventType.INSTANCE.m5466getRelease7fucELk());
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        boolean zM5458equalsimpl0 = PointerEventType.m5458equalsimpl0(p0.getType(), PointerEventType.INSTANCE.m5466getRelease7fucELk());
        int i3 = INotificationSideChannel + 75;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return zM5458equalsimpl0;
        }
        throw null;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(PointerEvent p0, PointerEventPass p1) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (!PointerEventType.m5458equalsimpl0(p0.getType(), PointerEventType.INSTANCE.m5466getRelease7fucELk())) {
            return false;
        }
        int i4 = asBinder + 63;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        if (p1.ordinal() != PointerEventPass.Final.ordinal()) {
            return false;
        }
        int i6 = asBinder + 79;
        INotificationSideChannel = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    private final String TuitionPaymentFragmentbindingInflater1(SemanticsConfiguration p0) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = 2 % 2;
        String str = (String) SemanticsConfigurationKt.getOrNull(p0, ViewPortLayoutDirection.TuitionPaymentFragmentbindingInflater1());
        if (str != null) {
            int i2 = INotificationSideChannel + 109;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
                int i3 = 85 / 0;
                if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1.length() == 0) {
                    strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
                    int i4 = INotificationSideChannel + 105;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
                if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1.length() == 0) {
                    strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
                    int i6 = INotificationSideChannel + 105;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            String str2 = strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str2 != null) {
                return str2;
            }
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
        int i8 = INotificationSideChannel + 31;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault1(SemanticsConfiguration p0) {
        Object next;
        int i = 2 % 2;
        List list = (List) SemanticsConfigurationKt.getOrNull(p0, SemanticsProperties.INSTANCE.getContentDescription());
        if (list != null) {
            Iterator it = list.iterator();
            int i2 = INotificationSideChannel + 69;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            do {
                next = null;
                if (!it.hasNext()) {
                    int i4 = INotificationSideChannel + 75;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    break;
                }
                int i6 = INotificationSideChannel + 73;
                asBinder = i6 % 128;
                if (i6 % 2 != 0) {
                    ((String) it.next()).length();
                    next.hashCode();
                    throw null;
                }
                next = it.next();
            } while (((String) next).length() <= 0);
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = (String) next;
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            }
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                return strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(SemanticsConfiguration p0) {
        Object next;
        int i = 2 % 2;
        List list = (List) SemanticsConfigurationKt.getOrNull(p0, SemanticsProperties.INSTANCE.getText());
        if (list != null) {
            Iterator it = list.iterator();
            int i2 = asBinder + 91;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            do {
                if (!it.hasNext()) {
                    int i4 = INotificationSideChannel + 107;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    next = null;
                    break;
                }
                next = it.next();
            } while (((AnnotatedString) next).getText().length() <= 0);
            AnnotatedString annotatedString = (AnnotatedString) next;
            if (annotatedString != null) {
                int i6 = INotificationSideChannel + 87;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    return annotatedString.getText();
                }
                int i7 = 12 / 0;
                return annotatedString.getText();
            }
        }
        return null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        b = (char) 157;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 21632;
        g = (char) 22185;
        d = (char) 47551;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, int r8) {
        /*
            byte[] r0 = defpackage.isVirtualCamera.$$c
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r6 = r6 * 4
            int r6 = 108 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r8]
        L27:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isVirtualCamera.$$g(short, int, int):java.lang.String");
    }
}
