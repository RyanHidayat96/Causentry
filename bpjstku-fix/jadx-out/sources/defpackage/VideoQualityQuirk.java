package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LVideoQualityQuirk;", "LAutoValue_VideoEncoderDataSpace;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "", "p0", "<init>", "(J)V", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "J", "b", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VideoQualityQuirk extends AbstractCoroutineContextElement implements AutoValue_VideoEncoderDataSpace<String> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    final long b;
    private static final byte[] $$c = {63, 56, -36, -117};
    private static final int $$f = 246;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {14, 116, 92, -78, 7, -7, -68, 49, -8, 14, -24, -2, 6, -13, -62, 46, 8, -15, 9, -8, -11, -10, -59, 48, 7, -2, -18, -60, 54, 0, 1, -20, 8, -9, -18, 6, -67, 16, 39, -2, -18, -36, 26, -9, 14, -4, -8, -18, -70, 71, -3, -18, 6, -20, 12, -18, -28, 17, 2, -45, 42, -22, 13, -16, -41, 24, 14, -24, -66, 8, 28, -17, 6, -16, 1, -6, -35, 12, 19, -17, -13, 4, 1, -51, 39, -22, 1, 1, -13, 4, 1, -6, -8, -16, -7, 1, -13, 6, -8, 0, -7, -8, 0, -14, -6, 13, -18, -9, 13, -47, 29, -16, -4, 2, -13, -4, -4, -10, 15, -14, 3, -71};
    private static final int $$e = 189;
    private static final byte[] $$a = {68, 83, 49, -116, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 179;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f239a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 84 - r8
            int r6 = r6 * 15
            int r6 = 53 - r6
            int r7 = r7 + 4
            byte[] r0 = defpackage.VideoQualityQuirk.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r7]
        L26:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            int r7 = r7 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VideoQualityQuirk.c(int, int, short, java.lang.Object[]):void");
    }

    private static void f(short s, int i, byte b2, Object[] objArr) {
        int i2 = 99 - (i * 15);
        int i3 = b2 * 14;
        int i4 = (s * 66) + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i3 + 53];
        int i5 = i3 + 52;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i2 = i5 + i4 + 5;
            i4++;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i2;
            int i9 = i4 + 1;
            i6 = i7;
            i2 = i8 + bArr[i4] + 5;
            i4 = i9;
        }
    }

    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $10 + 105;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3291, View.resolveSizeAndState(0, 0, 0) + 31, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.alpha(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 651, 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -450685997, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
        }
        if (i3 > 0) {
            int i8 = $11 + 21;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i10 = $10 + 55;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), Color.alpha(0) + 651, 43 - ImageFormat.getBitsPerPixel(0), -450685997, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
        int i11 = $10 + 21;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 85 / 0;
        }
    }

    @Override // defpackage.AutoValue_VideoEncoderDataSpace
    public final /* synthetic */ void restoreThreadContext(CoroutineContext coroutineContext, String str) {
        int i = 2 % 2;
        int i2 = f239a + 45;
        d = i2 % 128;
        int i3 = i2 % 2;
        Thread.currentThread().setName(str);
        int i4 = d + 39;
        f239a = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    @Override // defpackage.AutoValue_VideoEncoderDataSpace
    public final /* synthetic */ String updateThreadContext(CoroutineContext coroutineContext) {
        String str;
        int i = 2 % 2;
        lambdaselectSampleRateOrNearestSupported0 lambdaselectsamplerateornearestsupported0 = (lambdaselectSampleRateOrNearestSupported0) coroutineContext.get(lambdaselectSampleRateOrNearestSupported0.INSTANCE);
        if (lambdaselectsamplerateornearestsupported0 != null) {
            int i2 = f239a + 49;
            d = i2 % 128;
            int i3 = i2 % 2;
            str = lambdaselectsamplerateornearestsupported0.TuitionPaymentFragmentbindingInflater1;
            if (str == null) {
                str = "coroutine";
            }
        } else {
            str = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) name, " @", 0, false, 6, (Object) null);
        if (iLastIndexOf$default < 0) {
            int i4 = d + 31;
            f239a = i4 % 128;
            if (i4 % 2 == 0) {
                iLastIndexOf$default = name.length();
                int i5 = 1 / 0;
            } else {
                iLastIndexOf$default = name.length();
            }
        }
        StringBuilder sb = new StringBuilder(str.length() + iLastIndexOf$default + 10);
        String strSubstring = name.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.b);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        threadCurrentThread.setName(string);
        return name;
    }

    public VideoQualityQuirk(long j) {
        super(INSTANCE);
        this.b = j;
    }

    /* JADX INFO: renamed from: VideoQualityQuirk$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVideoQualityQuirk$TuitionPaymentFragmentbindingInflater1;", "Lkotlin/coroutines/CoroutineContext$Key;", "LVideoQualityQuirk;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.Key<VideoQualityQuirk> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CoroutineId(");
        sb.append(this.b);
        sb.append(')');
        String string = sb.toString();
        int i2 = d + 75;
        f239a = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = d + 35;
        f239a = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 11;
            byte[] bArr = $$a;
            byte b2 = bArr[28];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iResolveOpacity, iIndexOf, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 189, 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 22 - KeyEvent.getDeadChar(0, 0), new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(false, 194 - View.getDefaultSize(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 15, 10 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f'}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
            int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
            byte b4 = $$a[7];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            c(b5, (byte) (b5 | 37), b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, scrollDefaultDelay, iKeyCodeFromString, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                int iIndexOf2 = 876 - TextUtils.indexOf("", "", 0);
                int packedPositionType = 10 - ExpandableListView.getPackedPositionType(0L);
                byte b6 = $$a[7];
                byte b7 = b6;
                Object[] objArr6 = new Object[1];
                c(b7, (byte) (b7 | 89), b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, iIndexOf2, packedPositionType, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (((((~(401342463 | i4)) | (~((-12742661) | iIdentityHashCode))) * 988) + 848180456) + ((((~(iIdentityHashCode | 348289574)) | 53052889) | (~(i4 | (-12742661)))) * 988)) - 1066501840;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(false, 190 - Gravity.getAbsoluteGravity(0, 0), 26 - KeyEvent.keyCodeFromString(""), View.resolveSizeAndState(0, 0, 0) + 9, new char[]{6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(true, 197 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 18, 1 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(true, 188 - ((byte) KeyEvent.getModifierMetaStateMask()), 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 7, new char[]{65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f'}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 193, 16 - Color.alpha(0), 2 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1066501840};
                byte[] bArr2 = $$d;
                byte b8 = bArr2[29];
                Object[] objArr13 = new Object[1];
                f(b8, b8, bArr2[30], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = bArr2[30];
                Object[] objArr14 = new Object[1];
                f(b9, b9, bArr2[29], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                        int i8 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr16 = new Object[1];
                        c(b11, (byte) (b11 | 89), b10, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, maximumFlingVelocity, i8, 2012931276, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(true, ((byte) KeyEvent.getModifierMetaStateMask()) + 191, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22, KeyEvent.normalizeMetaState(0) + 22, new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(false, 194 - TextUtils.getOffsetBefore("", 0), 15 - Color.red(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, new char[]{65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f'}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                            int longPressTimeout = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                            byte b12 = $$a[7];
                            byte b13 = b12;
                            Object[] objArr19 = new Object[1];
                            c(b13, (byte) (b13 | 37), b12, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, longPressTimeout, i9, 2012020043, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cGreen = (char) Color.green(0);
                            int iBlue = Color.blue(0) + 876;
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                            byte[] bArr3 = $$a;
                            byte b14 = bArr3[28];
                            byte b15 = bArr3[7];
                            Object[] objArr20 = new Object[1];
                            c(b14, b15, b15, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, iBlue, maximumDrawingCacheSize, -1650998592, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i10 = ((int[]) objArr[2])[0];
        int i11 = ((int[]) objArr[0])[0];
        if (i11 != i10) {
            int[] iArr = new int[i11];
            int i12 = i11 - 1;
            iArr[i12] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i12) % 2) - 1], 1).show();
            int i13 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyTid = Process.myTid();
            int i14 = i13 + (-875256932) + (((~iMyTid) | 41959445) * 1324) + (((~(iMyTid | (-425311849))) | (~(465622077 | iMyTid))) * (-1324)) + 1195836828;
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr21[1])[0] = i16 ^ (i16 << 5);
            int i17 = f239a + 109;
            d = i17 % 128;
            int i18 = i17 % 2;
        } else {
            int i19 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i20 = i19 + (((551351244 + (((~(49798970 | startElapsedRealtime)) | (-90109200)) * (-948))) + ((~((~startElapsedRealtime) | (-84418566))) * (-948))) - 1610795700);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr22[1])[0] = i22 ^ (i22 << 5);
        }
        int iHashCode = Long.hashCode(this.b);
        int i23 = f239a + 83;
        d = i23 % 128;
        if (i23 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    static {
        b = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new Companion(null);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        b = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r8 instanceof defpackage.VideoQualityQuirk) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r7.b == ((defpackage.VideoQualityQuirk) r8).b) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r1 = r1 + 91;
        defpackage.VideoQualityQuirk.d = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.VideoQualityQuirk.f239a
            int r2 = r1 + 71
            int r3 = r2 % 128
            defpackage.VideoQualityQuirk.d = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 55
            int r2 = r2 / r4
            if (r7 != r8) goto L19
            goto L18
        L16:
            if (r7 != r8) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r8 instanceof defpackage.VideoQualityQuirk
            if (r2 == 0) goto L29
            VideoQualityQuirk r8 = (defpackage.VideoQualityQuirk) r8
            long r0 = r7.b
            long r5 = r8.b
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 == 0) goto L28
            return r4
        L28:
            return r3
        L29:
            int r1 = r1 + 91
            int r8 = r1 % 128
            defpackage.VideoQualityQuirk.d = r8
            int r1 = r1 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VideoQualityQuirk.equals(java.lang.Object):boolean");
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722439;
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
    private static java.lang.String $$g(short r6, byte r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = defpackage.VideoQualityQuirk.$$c
            int r7 = 120 - r7
            int r6 = r6 * 2
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r8 = r8 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VideoQualityQuirk.$$g(short, byte, short):java.lang.String");
    }
}
