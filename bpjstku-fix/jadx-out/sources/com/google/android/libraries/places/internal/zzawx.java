package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class zzawx implements zzbzz {
    private static final byte[] $$c = {58, -51, 54, -115};
    private static final int $$f = 1;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, -5, -24, -13, -22, -8, 53, -67, -18, -10, -2, -15, -3, 45, -61, -23, 0, -24, -7, -4, -5, 44, -67, -16, -16, 59, -61, -30, -9, 2, 48, -61, -25, -3, 49, -69, -5, -11, -19, -16, 1, -21, -15, 65, -30, -45, -12, -12, -15, 17, -32, -8, -17, 27, -47, 18, -29, -22, -14, 6, -24, -11, 70, -54, -27, -28, -10, -2, -4, -30, 37, -51, -6, -9, 18, -29, -22, -14, 6, -24, -11, 27, -43, -14, 1, -16, -9, -15, 69, -40, -61, 2, -13, -2, -11, -23};
    private static final int $$e = 170;
    private static final byte[] $$a = {91, -17, 90, 37, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 217;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {33135, 1283, 35244, 3157, 37101, 5256, 39736, 8085, 41593, 9734, 43774, 12572, 46547, 14458, 48144, 16550, 51027, 19422, 53140, 21048, 54993, 23930, 13831, 45677, 16069, 47931, 10141, 41960, 11348, 43141, 5407, 37240, 7632, 34391, 687, 36616, 2925, 40594, 6906, 38472, 5040, 36698, 2939, 33995, '#', 48519, 14765, 46453, 11968, 43567, 10123, 41975, 24408, 45557, 13723, 47423, 15579, 41060, 9242, 43962, 12112, 37580, 5766, 39473, 437, 34171, 2292, 35986, 28724};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 264883512928908799L;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 4
            int r9 = 84 - r9
            int r7 = r7 * 15
            int r7 = 53 - r7
            byte[] r0 = com.google.android.libraries.places.internal.zzawx.$$a
            int r8 = r8 * 52
            int r8 = 107 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L2d:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-11)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzawx.a(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 92
            int r0 = 93 - r7
            byte[] r1 = com.google.android.libraries.places.internal.zzawx.$$d
            int r8 = 99 - r8
            int r6 = r6 * 92
            int r6 = 95 - r6
            byte[] r0 = new byte[r0]
            int r7 = 92 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-10)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzawx.d(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0349  */
    /* JADX WARN: Code duplicated, block: B:63:0x034a  */
    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $11 + 23;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            obj = null;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i6 = $10 + 107;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i << i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int iCombineMeasuredStates = 2187 - View.combineMeasuredStates(0, 0);
                        int defaultSize = 40 - View.getDefaultSize(0, 0);
                        byte b2 = (byte) ($$f - 1);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, iCombineMeasuredStates, defaultSize, 841711447, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 33017);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 3011;
                        int i8 = 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte b4 = (byte) ($$f - 1);
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority, absoluteGravity, i8, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) (36505 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int iAlpha = 3376 - Color.alpha(0);
                        int packedPositionType = 17 - ExpandableListView.getPackedPositionType(0L);
                        int i9 = $$f;
                        byte b6 = (byte) (i9 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iAlpha, packedPositionType, -968507904, false, $$g(b6, b6, (byte) i9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i10 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i10])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2187;
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40;
                    byte b7 = (byte) ($$f - 1);
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iResolveOpacity, maximumFlingVelocity, 841711447, false, $$g(b7, b8, (byte) (b8 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i10), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cNormalizeMetaState = (char) (33017 - KeyEvent.normalizeMetaState(0));
                    int scrollDefaultDelay = 3011 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 26;
                    byte b9 = (byte) ($$f - 1);
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, scrollDefaultDelay, pressedStateDuration, 321985076, false, $$g(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i10] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cNormalizeMetaState2 = (char) (36505 - KeyEvent.normalizeMetaState(0));
                    int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3376;
                    int scrollBarSize = 17 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int i12 = $$f;
                    byte b11 = (byte) (i12 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState2, i11, scrollBarSize, -968507904, false, $$g(b11, b11, (byte) i12), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i13 = $11 + 5;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char offsetAfter = (char) (36505 - TextUtils.getOffsetAfter("", 0));
                    int deadChar = 3376 - KeyEvent.getDeadChar(0, 0);
                    int modifierMetaStateMask = 16 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int i14 = $$f;
                    byte b12 = (byte) (i14 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetAfter, deadChar, modifierMetaStateMask, -968507904, false, $$g(b12, b12, (byte) i14), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                obj.hashCode();
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char absoluteGravity2 = (char) (36505 - Gravity.getAbsoluteGravity(0, 0));
                int trimmedLength = 3376 - TextUtils.getTrimmedLength("");
                int i15 = 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int i16 = $$f;
                byte b13 = (byte) (i16 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(absoluteGravity2, trimmedLength, i15, -968507904, false, $$g(b13, b13, (byte) i16), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbzz
    public final /* synthetic */ zzcaa zza(zzbfe zzbfeVar, zzbfd zzbfdVar) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) (43042 - KeyEvent.getDeadChar(0, 0));
            int iResolveSize = View.resolveSize(0, 0) + 3111;
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 22;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[40], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, iResolveSize, capsMode, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (12434 - View.resolveSizeAndState(0, 0, 0)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22, 14 - TextUtils.indexOf((CharSequence) "", '0'), (char) (34814 - View.resolveSize(0, 0)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43041);
            int i4 = 3112 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int iBlue = Color.blue(0) + 22;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b3, bArr2[5], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i4, iBlue, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (43043 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int iGreen = 3111 - Color.green(0);
                int defaultSize = 22 - View.getDefaultSize(0, 0);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[5];
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iGreen, defaultSize, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int i7 = ~(((int) Runtime.getRuntime().totalMemory()) | 801150757);
            int i8 = ((((438339800 | i7) * (-658)) + 451524386) + ((i7 | 270534872) * 658)) - 1445040452;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{new int[1], new int[]{i6}, new int[]{i5}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(37 - (ViewConfiguration.getEdgeSlop() >> 16), 16 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 12132), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((Process.myTid() >> 22) + 53, 17 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, -1445040452};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[40];
                byte b7 = bArr4[16];
                Object[] objArr11 = new Object[1];
                d(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr4[16];
                byte b9 = bArr4[40];
                Object[] objArr12 = new Object[1];
                d(b8, b9, b9, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char longPressTimeout = (char) (43042 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3111;
                    int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
                    byte[] bArr5 = $$a;
                    byte b10 = bArr5[5];
                    byte b11 = bArr5[7];
                    Object[] objArr13 = new Object[1];
                    a(b10, b11, b11, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(longPressTimeout, maximumFlingVelocity, i11, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, (char) (View.getDefaultSize(0, 0) + 12434), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(21 - ImageFormat.getBitsPerPixel(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 15, (char) (34814 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cNormalizeMetaState = (char) (43042 - KeyEvent.normalizeMetaState(0));
                        int tapTimeout = 3111 - (ViewConfiguration.getTapTimeout() >> 16);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 22;
                        byte[] bArr6 = $$a;
                        byte b12 = bArr6[7];
                        byte b13 = b12;
                        Object[] objArr16 = new Object[1];
                        a(b12, bArr6[5], b13, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, tapTimeout, touchSlop, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mode = (char) (43042 - View.MeasureSpec.getMode(0));
                        int i12 = 3112 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22;
                        byte[] bArr7 = $$a;
                        byte b14 = bArr7[7];
                        Object[] objArr17 = new Object[1];
                        a(b14, bArr7[40], b14, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, i12, scrollDefaultDelay, -1272852037, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
                    b = i13 % 128;
                    int i14 = i13 % 2;
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 == i15) {
            int i17 = b + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i22 = i19 + ((~((-557876755) | startElapsedRealtime)) * 521) + 2028770680 + (((~((~startElapsedRealtime) | (-557876755))) | 1073754312) * 521);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr[0])[0] = i24 ^ (i24 << 5);
            Object[] objArr18 = {new int[1], new int[]{i21}, new int[]{i20}, strArr2};
            int i25 = b + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i25 % 128;
            int i26 = i25 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i16];
            int i27 = i16 - 1;
            iArr[i27] = 1;
            Toast.makeText((Context) null, iArr[((i16 * i27) % 2) - 1], 1).show();
            int i28 = ((int[]) objArr[0])[0];
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr2 = {i29};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i31 = ~((-1230466801) | elapsedCpuTime);
            int i32 = ~elapsedCpuTime;
            int i33 = i28 + (-636344202) + ((i31 | (~(1566535410 | i32))) * (-406)) + ((~((-1091970753) | i32)) * (-406)) + (((~(elapsedCpuTime | (-474564659))) | (~(1230466800 | i32))) * 406);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr[0])[0] = i35 ^ (i35 << 5);
            Object[] objArr19 = {new int[1], new int[]{i30}, iArr2, strArr4};
        }
        return new zzawy(zzbfeVar, zzbfdVar, null);
    }

    zzawx() {
    }

    private static String $$g(short s, short s2, short s3) {
        int i = 4 - (s2 * 3);
        byte[] bArr = $$c;
        int i2 = s * 3;
        int i3 = 115 - (s3 * 3);
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 = (-i3) + i4;
            i++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i3 = (-bArr[i]) + i3;
            i++;
            i5 = i6;
        }
    }
}
