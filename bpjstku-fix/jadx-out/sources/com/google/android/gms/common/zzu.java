package com.google.android.gms.common;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class zzu extends zzw {
    private final Callable zze;
    private static final byte[] $$c = {83, -4, -55, -17};
    private static final int $$d = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {109, 48, -62, 38, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 217;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long b = -1127116272514090666L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 34097;

    /* synthetic */ zzu(Callable callable, zzv zzvVar) {
        super();
        this.zze = callable;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 15
            int r7 = r7 + 38
            byte[] r0 = com.google.android.gms.common.zzu.$$a
            int r6 = r6 * 2
            int r6 = r6 + 84
            int r8 = 93 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r8]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            int r8 = r8 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzu.a(int, byte, int, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i5 = $11 + 99;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $10 + 1;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf = (char) (8328 - TextUtils.indexOf("", "", 0));
                    int iCombineMeasuredStates = 1235 - View.combineMeasuredStates(0, 0);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 35;
                    byte b2 = (byte) ($$d & i3);
                    byte b3 = (byte) (b2 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iCombineMeasuredStates, packedPositionType, -653973969, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2765, ExpandableListView.getPackedPositionChild(0L) + 15, 1504416861, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-16733891) - Color.rgb(0, 0, 0)), 252 - MotionEvent.axisFromString(""), 22 - Color.red(0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char pressedStateDuration = (char) (65200 - (ViewConfiguration.getPressedStateDuration() >> 16));
                                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 2891;
                                int trimmedLength = TextUtils.getTrimmedLength("") + 17;
                                byte b6 = (byte) ($$d & 1);
                                byte b7 = (byte) (-b6);
                                String str$$e = $$e(b6, b7, (byte) (b7 + 1));
                                i2 = 2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, packedPositionType2, trimmedLength, 2012627446, false, str$$e, new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i3 = i2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Override // com.google.android.gms.common.zzw
    final String zza() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
            int defaultSize = 1755 - View.getDefaultSize(0, 0);
            int iResolveSize = 23 - View.resolveSize(0, 0);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 89), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, defaultSize, iResolveSize, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{48231, 2489, 16587, 22309}, new char[]{60618, 46907, 58825, 47877}, (char) TextUtils.getTrimmedLength(""), KeyEvent.normalizeMetaState(0), new char[]{52104, 54107, 15278, 33147, 20559, 50092, 60097, 44957, 52407, 4981, 54911, 25215, 7324, 4823, 26609, 38854, 38958, 30688, 23770, 52417, 4943, 42362}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{48231, 2489, 16587, 22309}, new char[]{22640, 51523, 30663, 43133}, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 32119), (-943111336) - Color.blue(0), new char[]{26435, 21897, 54636, 49961, 43240, 46945, 26109, 39382, 14301, 24500, 36424, 23817, 47069, 45532, 22264}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (29944 - (ViewConfiguration.getTouchSlop() >> 8));
            int iIndexOf = 1755 - TextUtils.indexOf("", "", 0, 0);
            int bitsPerPixel = 22 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[7], bArr[5], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, iIndexOf, bitsPerPixel, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int trimmedLength = TextUtils.getTrimmedLength("") + 1755;
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b4, bArr2[5], b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, trimmedLength, absoluteGravity, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = ~iIdentityHashCode;
            int i3 = (((1958332176 + (((~(24439776 | i2)) | 237042202) * 226)) + (((~(i2 | 259324922)) | ((~((-237042203) | iIdentityHashCode)) | 2157056)) * (-113))) + ((~(iIdentityHashCode | 24439776)) * 113)) - 1543892243;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[3])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{48231, 2489, 16587, 22309}, new char[]{39006, 42868, 15838, 18145}, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 57661), ExpandableListView.getPackedPositionGroup(0L), new char[]{62466, 32338, 64048, 22690, 14134, 43137, 38692, 5584, 50546, 21185, 3742, 9723, 35141, 3212, 35123, 13812}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{48231, 2489, 16587, 22309}, new char[]{22062, 6436, 14839, 61953}, (char) (313 - TextUtils.indexOf("", "")), View.resolveSize(0, 0), new char[]{21961, 8277, 51759, 58476, 24099, 42722, 2663, 49813, 19286, 38237, 43372, 48398, 31784, 59612, 57072, 21565}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1990249824};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 42049), View.MeasureSpec.getMode(0) + 1726, ImageFormat.getBitsPerPixel(0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -1543892243, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char mode = (char) (29944 - View.MeasureSpec.getMode(0));
                    int absoluteGravity2 = 1755 - Gravity.getAbsoluteGravity(0, 0);
                    int iIndexOf2 = 23 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[7];
                    Object[] objArr11 = new Object[1];
                    a(b5, bArr3[5], b5, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, absoluteGravity2, iIndexOf2, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{48231, 2489, 16587, 22309}, new char[]{60618, 46907, 58825, 47877}, (char) Color.red(0), ExpandableListView.getPackedPositionGroup(0L), new char[]{52104, 54107, 15278, 33147, 20559, 50092, 60097, 44957, 52407, 4981, 54911, 25215, 7324, 4823, 26609, 38854, 38958, 30688, 23770, 52417, 4943, 42362}, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{48231, 2489, 16587, 22309}, new char[]{22640, 51523, 30663, 43133}, (char) (32119 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 943111336, new char[]{26435, 21897, 54636, 49961, 43240, 46945, 26109, 39382, 14301, 24500, 36424, 23817, 47069, 45532, 22264}, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                        int mode2 = View.MeasureSpec.getMode(0) + 1755;
                        int i6 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr4[7], bArr4[5], (byte) 52, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, mode2, i6, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                        int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr15 = new Object[1];
                        a(b6, b7, (byte) (b7 | 89), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cRgb, jumpTapTimeout, iIndexOf3, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    int i7 = TuitionPaymentFragmentbindingInflater1 + 91;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                    int i8 = i7 % 2;
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i9 = TuitionPaymentFragmentbindingInflater1 + 107;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                int i10 = i9 % 2 == 0 ? 0 : 1;
                while (i10 < strArr.length) {
                    arrayList.add(strArr[i10]);
                    i10++;
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                    TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            throw null;
        }
        int i13 = ((int[]) objArr[3])[0];
        Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i14 = ~iIdentityHashCode2;
        int i15 = ~(957580292 | i14);
        int i16 = i13 + (-828029311) + (((-1031271887) | i15) * (-712)) + (((~(iIdentityHashCode2 | (-73691595))) | (~(i14 | 1031271886))) * (-712)) + ((744977866 | i15) * 712);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr16[3])[0] = i18 ^ (i18 << 5);
        try {
            return (String) this.zze.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, short r7, short r8) {
        /*
            int r6 = 104 - r6
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = com.google.android.gms.common.zzu.$$c
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r7 = r7 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzu.$$e(short, short, short):java.lang.String");
    }
}
