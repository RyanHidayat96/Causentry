package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"LgetDefaultDarkScrimannotations;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "message", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class getDefaultDarkScrimannotations {
    public static final int $stable = 0;
    private final String message;
    private static final byte[] $$c = {112, 19, -59, 97};
    private static final int $$d = 208;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {55, -47, -47, 67, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 19;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {60073, 60062, 60048, 60088, 60047, 60075, 60078, 60056, 60077, 60063, 60040, 60055, 60043, 60054, 60052, 60079, 60034, 60117, 60041, 60053, 60050, 60076, 60058, 60072, 60074};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 57188;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = defpackage.getDefaultDarkScrimannotations.$$a
            int r1 = 53 - r7
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getDefaultDarkScrimannotations.a(byte, byte, byte, java.lang.Object[]):void");
    }

    public getDefaultDarkScrimannotations(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        int i;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
            int iResolveSize = View.resolveSize(0, 0) + 651;
            int keyRepeatTimeout = 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveSize, keyRepeatTimeout, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{24, 17, '\b', 19, '\n', 24, 7, 19, '\n', 11, 18, 22, 15, 11, 0, 2, 18, '\b', '\f', '\n', '\f', 7}, (byte) (2 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 22 - View.MeasureSpec.getMode(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{6, 16, 2, 17, 11, 0, 5, 4, 2, 21, 14, 1, 23, '\n', 13882}, (byte) ((Process.myTid() >> 22) + 59), View.resolveSize(0, 0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651;
            int iIndexOf = TextUtils.indexOf("", "") + 44;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr2[5], (byte) 52, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i3, iIndexOf, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 651;
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 44;
                byte b3 = $$a[5];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (b4 | 14), b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, windowTouchSlop, pressedStateDuration, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = 1745876209 + (((~(296873177 | iIdentityHashCode)) | 4985638 | (~((-293442368) | iIdentityHashCode))) * (-744)) + (((~iIdentityHashCode) | 8416448) * 744) + ((iIdentityHashCode | (-4985639)) * 744) + 1235519957;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[3])[0] = i8 ^ (i8 << 5);
            i = 2;
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.myPid() >> 22), ExpandableListView.getPackedPositionChild(0L) + 1611, 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1235519957, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iMyTid = (Process.myTid() >> 22) + 651;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 44;
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    a(bArr3[5], (byte) 52, bArr3[7], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, iMyTid, iResolveOpacity, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 695, (ViewConfiguration.getJumpTapTimeout() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.resolveSizeAndState(0, 0, 0) + 63406), 793 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.getOffsetBefore("", 0) + 83), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c4 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 651;
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 44;
                    byte b5 = $$a[5];
                    byte b6 = b5;
                    Object[] objArr10 = new Object[1];
                    a(b6, (byte) (b6 | 14), b5, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c4, jumpTapTimeout2, tapTimeout, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{24, 17, '\b', 19, '\n', 24, 7, 19, '\n', 11, 18, 22, 15, 11, 0, 2, 18, '\b', '\f', '\n', '\f', 7}, (byte) (2 - KeyEvent.keyCodeFromString("")), View.resolveSizeAndState(0, 0, 0) + 22, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new char[]{6, 16, 2, 17, 11, 0, 5, 4, 2, 21, 14, 1, 23, '\n', 13882}, (byte) (TextUtils.getOffsetBefore("", 0) + 59), TextUtils.lastIndexOf("", '0') + 16, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int iArgb = 651 - Color.argb(0, 0, 0, 0);
                        int i9 = 45 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte[] bArr4 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr4[5], (byte) 52, bArr4[7], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMyTid, iArgb, i9, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 651;
                        int mirror = AndroidCharacter.getMirror('0') - 4;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        Object[] objArr14 = new Object[1];
                        a(b7, b7, bArr5[5], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMakeMeasureSpec, iKeyCodeFromString, mirror, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                    b = i10 % 128;
                    i = 2;
                    int i11 = i10 % 2;
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[i])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        b = i14 % 128;
        int i15 = i14 % i;
        Object[] objArr15 = new Object[4];
        objArr15[0] = new int[]{i};
        objArr15[i] = new int[]{i};
        objArr15[3] = new int[1];
        int i16 = ((int[]) objArr[3])[0];
        int i17 = ((int[]) objArr[i])[0];
        int i18 = ((int[]) objArr[0])[0];
        objArr15[1] = new String[0];
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i19 = i16 + (((~(1048469502 | iFreeMemory)) | 1040319508) * 449) + 415787440 + (((~((~iFreeMemory) | 1048469502)) | 1040319508) * 449);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr15[3])[0] = i21 ^ (i21 << 5);
        int i22 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
        if (i22 % 2 != 0) {
            return this.message.hashCode();
        }
        this.message.hashCode();
        throw null;
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
        int i4 = 1770390596;
        char c = '0';
        Object obj2 = null;
        int i5 = 3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iMakeMeasureSpec = 2267 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iLastIndexOf = 32 - TextUtils.lastIndexOf("", c);
                        byte b3 = (byte) i5;
                        byte b4 = (byte) (b3 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, iMakeMeasureSpec, iLastIndexOf, -1927765101, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 1770390596;
                    c = '0';
                    i5 = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 3;
            byte b6 = (byte) (b5 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2266, (ViewConfiguration.getPressedStateDuration() >> 16) + 33, -1927765101, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $10 + 125;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i9 = $10 + 29;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b * b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + b2);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 2;
                        byte b8 = (byte) (b7 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 49267), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3261, 29 - TextUtils.indexOf((CharSequence) "", '0', 0), -127612708, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22877 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 595 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 17 - View.resolveSizeAndState(0, 0, 0), 1570859318, false, $$e(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                        } else {
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            int i16 = $10 + 67;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                cArr4[i15] = (char) (cArr4[i15] ^ 24819);
                i15 += 104;
            } else {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                i15++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
            b = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(p0 instanceof getDefaultDarkScrimannotations))) {
            if (Intrinsics.areEqual(this.message, ((getDefaultDarkScrimannotations) p0).message)) {
                return true;
            }
            int i4 = b + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            return i4 % 2 == 0;
        }
        int i5 = b + 51;
        int i6 = i5 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 115;
        b = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.message;
        StringBuilder sb = new StringBuilder("getDefaultDarkScrimannotations(message=");
        sb.append(str);
        sb.append(")");
        String string = sb.toString();
        int i2 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = defpackage.getDefaultDarkScrimannotations.$$c
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r6 = 116 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getDefaultDarkScrimannotations.$$e(short, byte, int):java.lang.String");
    }
}
