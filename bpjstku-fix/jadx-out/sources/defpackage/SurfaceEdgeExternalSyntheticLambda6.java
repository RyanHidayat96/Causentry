package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.koushikdutta.async.util.TaggedList;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceEdgeExternalSyntheticLambda6<T> {
    private static int $10 = 0;
    private static int $11 = 1;
    public Hashtable<String, TaggedList<T>> b = new Hashtable<>();
    private static final byte[] $$d = {90, 46, 113, 8, -14, 15, -32, 17, 19, -4, -46, 47, -1, 1, -3, -13};
    private static final int $$e = ModuleDescriptor.MODULE_VERSION;
    private static final byte[] $$a = {91, -9, 99, 11, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 72;
    private static long TuitionPaymentFragmentbindingInflater1 = -989911647812957824L;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.SurfaceEdgeExternalSyntheticLambda6.$$a
            int r7 = r7 + 84
            int r6 = r6 * 52
            int r6 = 56 - r6
            int r5 = r5 * 52
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SurfaceEdgeExternalSyntheticLambda6.a(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 12
            int r6 = 16 - r6
            int r7 = r7 * 12
            int r0 = 13 - r7
            int r5 = r5 * 17
            int r5 = r5 + 98
            byte[] r1 = defpackage.SurfaceEdgeExternalSyntheticLambda6.$$d
            byte[] r0 = new byte[r0]
            int r7 = 12 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2a:
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SurfaceEdgeExternalSyntheticLambda6.d(int, byte, byte, java.lang.Object[]):void");
    }

    public final <V> V TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        synchronized (this) {
            TaggedList<T> taggedList = this.b.get(str);
            if (taggedList == null) {
                return null;
            }
            return (V) taggedList.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    public final <V> void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, V v) {
        synchronized (this) {
            TaggedList<T> taggedList = this.b.get(str);
            if (taggedList == null) {
                taggedList = new TaggedList<>();
                this.b.put(str, taggedList);
            }
            synchronized (taggedList) {
                taggedList.tag = v;
            }
        }
    }

    public final ArrayList<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        TaggedList<T> taggedListRemove;
        synchronized (this) {
            taggedListRemove = this.b.remove(str);
        }
        return taggedListRemove;
    }

    private ArrayList<T> b(String str) throws Throwable {
        Object[] objArr;
        char c;
        TaggedList<T> taggedList;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int i = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
            int iRed = 10 - Color.red(0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[7], bArr[5], (byte) 14, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, i, iRed, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{57594, 16326, 24217, 32112, 39992, 47885, 56269, 64208, 6508, 14371, 22347, 30713, 38534, 46463, 54309, 62211, 5062, 12987, 20833, 28733, 36612, 45023}, 57139 - TextUtils.indexOf("", ""), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{57598, 4180, 444, 12546, Typography.lessOrEqual, 21457, 17197, 29884, 26086, 38209, 34473, 47086, 42838, 55473, 51220}, View.MeasureSpec.getSize(0) + 61603, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 876;
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 10;
            byte[] bArr2 = $$a;
            byte b = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b, b, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, touchSlop, offsetBefore, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) Color.green(0);
                int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                byte[] bArr3 = $$a;
                byte b2 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b2, b2, bArr3[10], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, i2, doubleTapTimeout, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iNextInt = new Random().nextInt(894903370);
            int i3 = ~iNextInt;
            int i4 = ((((((~(168233906 | i3)) | (~((-208544136) | iNextInt))) | (~(i3 | 208544135))) * 959) - 2141772072) + (((~(iNextInt | 208544135)) | ((~(i3 | (-208544136))) | (~(168233906 | iNextInt)))) * 959)) - 1171686893;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            c = 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{57594, 35074, 13073, 56588, 18216, 61729, 39733, 1396, 44866, 22852, 49997, 27944, 5966, 33139, 11117, 54667, 32669, 59797, 37809, 15799, 42883, 20912, 64467, 26063, 4050, 47584}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 27127, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{57592, 4345, 199, 12460, 8354, 20614, 16485, 28795, 24659, 36900, 32785, 45071, 41452, 53713, 49581, 61867, 57732, 4466}, 61463 - Color.red(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(str != null ? str.length() : 0), -1171686893};
                byte[] bArr4 = $$d;
                byte b3 = bArr4[13];
                byte b4 = b3;
                Object[] objArr11 = new Object[1];
                d(b3, b4, (byte) (b4 - 1), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b5 = bArr4[13];
                byte b6 = (byte) (b5 - 1);
                Object[] objArr12 = new Object[1];
                d(b6, b6, b5, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                        int iCombineMeasuredStates = 10 - View.combineMeasuredStates(0, 0);
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        Object[] objArr14 = new Object[1];
                        a(b7, b7, bArr5[10], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, tapTimeout, iCombineMeasuredStates, 256017550, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(new char[]{57594, 16326, 24217, 32112, 39992, 47885, 56269, 64208, 6508, 14371, 22347, 30713, 38534, 46463, 54309, 62211, 5062, 12987, 20833, 28733, 36612, 45023}, 57140 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(new char[]{57598, 4180, 444, 12546, Typography.lessOrEqual, 21457, 17197, 29884, 26086, 38209, 34473, 47086, 42838, 55473, 51220}, ExpandableListView.getPackedPositionGroup(0L) + 61603, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 875;
                            int i8 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte[] bArr6 = $$a;
                            byte b8 = bArr6[5];
                            Object[] objArr17 = new Object[1];
                            a(b8, b8, bArr6[7], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, i7, i8, 2009631821, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cBlue = (char) Color.blue(0);
                            int i9 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
                            byte[] bArr7 = $$a;
                            Object[] objArr18 = new Object[1];
                            a(bArr7[7], bArr7[5], (byte) 14, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, i9, scrollBarSize, 252381699, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
                c = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i10 = ((int[]) objArr[c])[0];
        int i11 = ((int[]) objArr[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i13 = i12 + 1012321996 + (((~((-145236503) | iIdentityHashCode)) | (~((-104926274) | iIdentityHashCode))) * 69) + (((~(iIdentityHashCode | (-391486818))) | (~((-431797047) | iIdentityHashCode)) | 286560544) * (-69)) + 1620796584;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr19[1])[0] = i15 ^ (i15 << 5);
            synchronized (this) {
                taggedList = this.b.get(str);
            }
            return taggedList;
        }
        throw new RuntimeException(String.valueOf(i11));
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 117;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 19472), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2624, 13 - ExpandableListView.getPackedPositionGroup(0L), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() * (TuitionPaymentFragmentbindingInflater1 + 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 39423), TextUtils.indexOf((CharSequence) "", '0', 0) + 482, View.resolveSize(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19473 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 2623 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (9053247990562531611L ^ TuitionPaymentFragmentbindingInflater1);
                    try {
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - (ViewConfiguration.getPressedStateDuration() >> 16)), TextUtils.lastIndexOf("", '0', 0) + 482, KeyEvent.keyCodeFromString("") + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $11 + 31;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $11 + 35;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getTouchSlop() >> 8) + 481, 36 - Process.getGidForName(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                int i9 = 64 / 0;
            } else {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 39422), (ViewConfiguration.getFadingEdgeLength() >> 16) + 481, Process.getGidForName("") + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr2);
    }

    public final void b(String str, T t) {
        synchronized (this) {
            ArrayList<T> arrayListB = b(str);
            if (arrayListB == null) {
                arrayListB = new TaggedList<>();
                this.b.put(str, (TaggedList<T>) arrayListB);
            }
            arrayListB.add(t);
        }
    }

    public final boolean TuitionPaymentFragmentbindingInflater1(String str, T t) {
        synchronized (this) {
            TaggedList<T> taggedList = this.b.get(str);
            if (taggedList == null) {
                return false;
            }
            taggedList.remove(t);
            return taggedList.size() == 0;
        }
    }
}
