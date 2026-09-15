package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.ViewCompat;
import com.datadog.android.api.context.DeviceType;
import defpackage.initSession;
import defpackage.isSupportedYUVFormat;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\u00068WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00068WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u000e\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\f\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0010\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00068WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u00168WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0013\u0010\u0018R\u001b\u0010\u0015\u001a\u00020\u00068WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0017\u001a\u00020\u00068\u0017X\u0097D¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0019\u0010\u000f"}, d2 = {"LisSupportedYUVFormat;", "LconvertYuvToJpegBytesIntoSurface;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "p1", "p2", "p3", "p4", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "g", "Ljava/lang/String;", "asBinder", "Lcom/datadog/android/api/context/DeviceType;", "asInterface", "()Lcom/datadog/android/api/context/DeviceType;", "d", "a"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class isSupportedYUVFormat implements convertYuvToJpegBytesIntoSurface {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] cancel;
    private static long notify;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {106, -66, 28, 119};
    private static final int $$f = 253;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {Base64.padSymbol, -108, 49, -100, -15, -18, 11, -21, -7, -5, -7, -29, 5, 23, -56, 7, -32, 12, -11, -20, -3, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 57};
    private static final int $$e = 247;
    private static final byte[] $$a = {12, 11, -9, -106, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 98;
    private static int INotificationSideChannel = 0;
    private static int INotificationSideChannelDefault = 1;
    private static int cancelAll = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r0 = r8 + 1
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r6 = r6 + 4
            byte[] r1 = defpackage.isSupportedYUVFormat.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isSupportedYUVFormat.c(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.isSupportedYUVFormat.$$d
            int r7 = r7 * 17
            int r7 = 21 - r7
            int r6 = r6 * 21
            int r6 = 105 - r6
            int r8 = r8 * 35
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            int r7 = r7 + 1
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isSupportedYUVFormat.f(short, int, byte, java.lang.Object[]):void");
    }

    private isSupportedYUVFormat(final Context context, final String str, final String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.g = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<DeviceType>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$deviceType$2
            private static final byte[] $$c = {77, -106, 83, 4};
            private static final int $$d = 242;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {73, 55, 58, 33, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 36;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static int TuitionPaymentFragmentbindingInflater1 = -83722486;

            private static void a(int i, byte b, short s, Object[] objArr) {
                byte[] bArr = $$a;
                int i2 = (s * 52) + 4;
                int i3 = (i * 14) + 84;
                byte[] bArr2 = new byte[53 - b];
                int i4 = 52 - b;
                int i5 = -1;
                if (bArr == null) {
                    i2++;
                    i3 = (i2 + i4) - 11;
                }
                while (true) {
                    int i6 = i2;
                    int i7 = i3;
                    i5++;
                    bArr2[i5] = (byte) i7;
                    if (i5 == i4) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i2 = i6 + 1;
                        i3 = (i7 + bArr[i6]) - 11;
                    }
                }
            }

            private static void b(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                char[] cArr2;
                int i4 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr3 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) (-1);
                            byte b2 = (byte) (b + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 3291 - TextUtils.getOffsetBefore("", 0), (Process.myTid() >> 22) + 31, 1199271174, false, $$e(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (-b3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.green(0), 650 - TextUtils.lastIndexOf("", '0', 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 45, -450685997, false, $$e(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                if (i3 > 0) {
                    int i6 = $10 + 95;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr4 = new char[i2];
                    System.arraycopy(cArr3, 0, cArr4, 0, i2);
                    System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    int i8 = $10 + 113;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                }
                if (z) {
                    int i10 = $10 + 45;
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
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (-b5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 651 - View.MeasureSpec.makeMeasureSpec(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 44, -450685997, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i11 = $10 + 43;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                    }
                    cArr3 = cArr2;
                }
                objArr[0] = new String(cArr3);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ DeviceType invoke() throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int defaultSize = View.getDefaultSize(0, 0) + 651;
                    int doubleTapTimeout = 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b = $$a[7];
                    byte b2 = b;
                    Object[] objArr2 = new Object[1];
                    a(b, b2, b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, defaultSize, doubleTapTimeout, -459846511, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                b(true, 203 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 22 - Gravity.getAbsoluteGravity(0, 0), 2 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b(false, 208 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 9 - ExpandableListView.getPackedPositionChild(0L), new char[]{65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f'}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int maximumFlingVelocity = 651 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 44;
                    byte b3 = $$a[80];
                    Object[] objArr5 = new Object[1];
                    a(b3, (byte) ($$b | 16), b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, maximumFlingVelocity, deadChar, -873460649, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 651;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 44;
                        byte[] bArr = $$a;
                        byte b4 = bArr[7];
                        Object[] objArr6 = new Object[1];
                        a(b4, (byte) (b4 | 15), bArr[80], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, i4, scrollBarSize, -1595579076, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i5 = ((int[]) objArr7[2])[0];
                    int i6 = ((int[]) objArr7[0])[0];
                    int i7 = ~(((int) Process.getStartElapsedRealtime()) | (-306901245));
                    int i8 = ((827244655 + (((-310332055) | i7) * (-220))) + ((i7 | 45160) * 220)) - 2034167073;
                    int i9 = (i8 << 13) ^ i8;
                    int i10 = i9 ^ (i9 >>> 17);
                    ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
                    int i11 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1609 - TextUtils.lastIndexOf("", '0'), View.MeasureSpec.getMode(0) + 26, 2145681644, false, null, new Class[0]);
                        }
                        Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1646842663, 0};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                            int i13 = 651 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int keyRepeatTimeout = 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            byte b5 = $$a[80];
                            Object[] objArr9 = new Object[1];
                            a(b5, (byte) ($$b | 16), b5, objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, i13, keyRepeatTimeout, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.green(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 695, 98 - View.resolveSize(0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getScrollBarSize() >> 8)), 793 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 83), Integer.TYPE, Integer.TYPE});
                        }
                        objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 651;
                            int i14 = 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte[] bArr2 = $$a;
                            byte b6 = bArr2[7];
                            Object[] objArr10 = new Object[1];
                            a(b6, (byte) (b6 | 15), bArr2[80], objArr10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup, longPressTimeout, i14, -1595579076, false, (String) objArr10[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                        try {
                            Object[] objArr11 = new Object[1];
                            b(true, 203 - TextUtils.getCapsMode("", 0, 0), 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2 - TextUtils.getCapsMode("", 0, 0), new char[]{11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1}, objArr11);
                            Class<?> cls2 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            b(false, (-16777009) - Color.rgb(0, 0, 0), 15 - TextUtils.indexOf("", ""), 9 - TextUtils.lastIndexOf("", '0'), new char[]{65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f'}, objArr12);
                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 651;
                                int longPressTimeout2 = 44 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                byte b7 = $$a[80];
                                Object[] objArr13 = new Object[1];
                                a(b7, (byte) ($$b | 16), b7, objArr13);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(modifierMetaStateMask, tapTimeout, longPressTimeout2, -873460649, false, (String) objArr13[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 651;
                                int i15 = 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                byte b8 = $$a[7];
                                byte b9 = b8;
                                Object[] objArr14 = new Object[1];
                                a(b8, b9, b9, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatDelay, iResolveOpacity, i15, -459846511, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
                int i16 = ((int[]) objArr[0])[0];
                int i17 = ((int[]) objArr[2])[0];
                if (i17 == i16) {
                    int i18 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                    int i19 = i18 % 2;
                    Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i20 = ((int[]) objArr[3])[0];
                    int i21 = ((int[]) objArr[2])[0];
                    int i22 = ((int[]) objArr[0])[0];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i23 = i20 + 1821354007 + (((~iIdentityHashCode) | 5552814) * 1444) + (((~(iIdentityHashCode | (-210776539))) | (~(214207348 | iIdentityHashCode)) | 1061002) * (-1444)) + 285834866;
                    int i24 = (i23 << 13) ^ i23;
                    int i25 = i24 ^ (i24 >>> 17);
                    ((int[]) objArr15[3])[0] = i25 ^ (i25 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[1];
                    if (strArr != null) {
                        for (String str5 : strArr) {
                            arrayList.add(str5);
                        }
                    }
                    Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
                    Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i26 = ((int[]) objArr[3])[0];
                    int i27 = ((int[]) objArr[2])[0];
                    int i28 = ((int[]) objArr[0])[0];
                    int iNextInt = new Random().nextInt();
                    int i29 = i26 + (-1526710005) + (((~((~iNextInt) | 650306754)) | 3480092) * 446) + (((~(iNextInt | 653786846)) | 650257472) * 446) + 1552121032;
                    int i30 = (i29 << 13) ^ i29;
                    int i31 = i30 ^ (i30 >>> 17);
                    ((int[]) objArr16[3])[0] = i31 ^ (i31 << 5);
                    int i32 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i32 % 128;
                    if (i32 % 2 == 0) {
                        int i33 = 2 % 5;
                    }
                }
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }

            public final DeviceType TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                DeviceType deviceTypeTuitionPaymentFragmentbindingInflater1;
                int i = 2 % 2;
                int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 == 0) {
                    deviceTypeTuitionPaymentFragmentbindingInflater1 = isSupportedYUVFormat.Companion.TuitionPaymentFragmentbindingInflater1(isSupportedYUVFormat.INSTANCE, str2, context);
                    int i3 = 50 / 0;
                } else {
                    deviceTypeTuitionPaymentFragmentbindingInflater1 = isSupportedYUVFormat.Companion.TuitionPaymentFragmentbindingInflater1(isSupportedYUVFormat.INSTANCE, str2, context);
                }
                int i4 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return deviceTypeTuitionPaymentFragmentbindingInflater1;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r5, byte r6, short r7) {
                /*
                    int r6 = 120 - r6
                    int r7 = r7 * 2
                    int r0 = r7 + 1
                    byte[] r1 = com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$deviceType$2.$$c
                    int r5 = r5 + 4
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L13
                    r3 = r6
                    r6 = r7
                    r4 = r2
                    goto L25
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r6
                    int r5 = r5 + 1
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L23
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    return r5
                L23:
                    r3 = r1[r5]
                L25:
                    int r6 = r6 + r3
                    r3 = r4
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$deviceType$2.$$e(int, byte, short):java.lang.String");
            }
        });
        this.b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<String>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$deviceName$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                if (!StringsKt.isBlank((String) this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue())) {
                    if (StringsKt.contains$default((CharSequence) this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (CharSequence) this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue(), false, 2, (Object) null)) {
                        return this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    }
                    String str5 = (String) this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    String str6 = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str5);
                    sb.append(" ");
                    sb.append(str6);
                    return sb.toString();
                }
                return this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }

            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<String>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$deviceBrand$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String strValueOf;
                String str5 = str;
                if (str5.length() <= 0) {
                    return str5;
                }
                StringBuilder sb = new StringBuilder();
                char cCharAt = str5.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    strValueOf = CharsKt.titlecase(cCharAt, locale);
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb.append((Object) strValueOf);
                String strSubstring = str5.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                sb.append(strSubstring);
                return sb.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
        this.asInterface = "Android";
        this.d = str4;
        this.asBinder = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<String>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$osMajorVersion$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return (String) CollectionsKt.first(StringsKt.split$default((CharSequence) this.this$0.d, new char[]{'.'}, false, 0, 6, (Object) null));
            }

            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<String>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$architecture$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String property = System.getProperty("os.arch");
                return property == null ? EnvironmentCompat.MEDIA_UNKNOWN : property;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public isSupportedYUVFormat(Context context) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(context, "");
        String str4 = Build.BRAND;
        if (str4 == null) {
            int i = INotificationSideChannel + 33;
            INotificationSideChannelDefault = i % 128;
            int i2 = i % 2;
            str = "";
        } else {
            str = str4;
        }
        String str5 = Build.MODEL;
        if (str5 == null) {
            int i3 = INotificationSideChannel + 65;
            INotificationSideChannelDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str2 = "";
        } else {
            str2 = str5;
        }
        String str6 = Build.ID;
        String str7 = str6 == null ? "" : str6;
        String str8 = Build.VERSION.RELEASE;
        if (str8 == null) {
            int i6 = 2 % 2;
            str3 = "";
        } else {
            str3 = str8;
        }
        this(context, str, str2, str7, str3);
    }

    @Override // defpackage.convertYuvToJpegBytesIntoSurface
    public final DeviceType g() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 1;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        DeviceType deviceType = (DeviceType) this.g.getValue();
        int i4 = INotificationSideChannel + 41;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return deviceType;
    }

    @Override // defpackage.convertYuvToJpegBytesIntoSurface
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 7;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.b.getValue();
        int i4 = INotificationSideChannelDefault + 15;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // defpackage.convertYuvToJpegBytesIntoSurface
    public final String b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 55;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    @Override // defpackage.convertYuvToJpegBytesIntoSurface
    public final String TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 95;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i2 + 57;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // defpackage.convertYuvToJpegBytesIntoSurface
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 87;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        throw null;
    }

    @Override // defpackage.convertYuvToJpegBytesIntoSurface
    public final String asBinder() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 37;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.asInterface;
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return str;
    }

    @Override // defpackage.convertYuvToJpegBytesIntoSurface
    public final String d() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 95;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            return this.d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.convertYuvToJpegBytesIntoSurface
    public final String a() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 59;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.asBinder.getValue();
        int i4 = INotificationSideChannel + 69;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: isSupportedYUVFormat$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LisSupportedYUVFormat$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ DeviceType TuitionPaymentFragmentbindingInflater1(Companion companion, String str, Context context) {
            Object systemService = context.getSystemService("uimode");
            UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
            if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                PackageManager packageManager = context.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "");
                if (!packageManager.hasSystemFeature("android.software.leanback") && !packageManager.hasSystemFeature("com.google.android.tv")) {
                    Locale locale = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    String str2 = lowerCase;
                    boolean z = false;
                    if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "tablet", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "sm-t", false, 2, (Object) null) || context.getResources().getConfiguration().smallestScreenWidthDp >= 800) {
                        return DeviceType.TABLET;
                    }
                    Locale locale2 = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(locale2, "");
                    String lowerCase2 = str.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    if (!StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) HintConstants.AUTOFILL_HINT_PHONE, false, 2, (Object) null)) {
                        Object systemService2 = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                        TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                        if (telephonyManager != null && telephonyManager.getPhoneType() == 0) {
                            z = true;
                        }
                        if (!(true ^ z)) {
                            return DeviceType.OTHER;
                        }
                    }
                    return DeviceType.MOBILE;
                }
            }
            return DeviceType.TV;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x01c2  */
    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        Throwable cause;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            i3 = 3;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i5 = $10 + 89;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(cancel[i + i7])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf("", "") + 2187, 40 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 841711447, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(notify), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 33016), 3011 - View.resolveSize(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 26, 321985076, false, $$g(b3, b4, (byte) (b4 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 36506), TextUtils.getOffsetAfter("", 0) + 3376, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, -968507904, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
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
            int i8 = $11 + i3;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36505), 3377 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 17 - (ViewConfiguration.getLongPressTimeout() >> 16), -968507904, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            i3 = 3;
        }
        objArr[0] = new String(cArr);
    }

    @Override // defpackage.convertYuvToJpegBytesIntoSurface
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 95;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) (37567 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 625;
            int i4 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14;
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (-b), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, keyRepeatTimeout, i4, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e('0' - AndroidCharacter.getMirror('0'), 22 - (ViewConfiguration.getScrollBarSize() >> 8), (char) TextUtils.indexOf("", "", 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, 15 - TextUtils.indexOf("", "", 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 38566), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char defaultSize = (char) (37567 - View.getDefaultSize(0, 0));
            int iIndexOf = 625 - TextUtils.indexOf("", "", 0, 0);
            int iIndexOf2 = TextUtils.indexOf("", "", 0) + 14;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(b2, bArr2[7], (byte) (-b2), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, iIndexOf, iIndexOf2, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = INotificationSideChannelDefault + 25;
            INotificationSideChannel = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 37567);
                int keyRepeatTimeout2 = 625 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 14;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) 51, bArr3[7], (byte) (-bArr3[5]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, keyRepeatTimeout2, jumpTapTimeout2, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode;
            int i10 = ~(882817387 | i9);
            int i11 = (((243647512 + ((134301332 | i10) * (-712))) + (((~(iIdentityHashCode | 1017118719)) | (~(i9 | (-134301333)))) * (-712))) + (((-940920734) | i10) * 712)) - 1191038514;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[1])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{new int[]{i8}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(37 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.red(0) + 26, (char) (13903 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(AndroidCharacter.getMirror('0') + 15, (ViewConfiguration.getScrollBarSize() >> 8) + 18, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i14 = INotificationSideChannelDefault + 117;
                INotificationSideChannel = i14 % 128;
                if (i14 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 80, TextUtils.getTrimmedLength("") + 16, (char) (8770 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(TextUtils.indexOf((CharSequence) "", '0', 0) + 98, 16 - ExpandableListView.getPackedPositionGroup(0L), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e(114 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 64 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e(177 - TextUtils.indexOf("", "", 0), View.combineMeasuredStates(0, 0) + 64, (char) (KeyEvent.normalizeMetaState(0) + 8449), objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -1191038514};
                byte[] bArr4 = $$d;
                byte b3 = bArr4[24];
                byte b4 = (byte) (b3 - 1);
                byte b5 = b3;
                Object[] objArr15 = new Object[1];
                f(b4, b5, b5, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b6 = bArr4[24];
                byte b7 = (byte) (b6 - 1);
                Object[] objArr16 = new Object[1];
                f(b6, b7, b7, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i15 = ((int[]) objArr17[0])[0];
                int i16 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) (37568 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int pressedStateDuration = 625 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i17 = 15 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) 51, bArr5[7], (byte) (-bArr5[5]), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, pressedStateDuration, i17, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        e(TextUtils.indexOf("", ""), 21 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) Color.red(0), objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        e(22 - View.MeasureSpec.getMode(0), 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 38566), objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) (37567 - TextUtils.indexOf("", "", 0));
                            int iCombineMeasuredStates = 625 - View.combineMeasuredStates(0, 0);
                            int i18 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15;
                            byte[] bArr6 = $$a;
                            byte b8 = bArr6[5];
                            Object[] objArr21 = new Object[1];
                            c(b8, bArr6[7], (byte) (-b8), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iCombineMeasuredStates, i18, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (37568 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 626;
                            int gidForName = Process.getGidForName("") + 15;
                            byte[] bArr7 = $$a;
                            byte b9 = bArr7[5];
                            Object[] objArr22 = new Object[1];
                            c(b9, (byte) (-b9), bArr7[7], objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, packedPositionChild, gidForName, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i19 = ((int[]) objArr[0])[0];
        int i20 = ((int[]) objArr[2])[0];
        if (i20 == i19) {
            int i21 = ((int[]) objArr[1])[0];
            int i22 = ((int[]) objArr[2])[0];
            int i23 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i22};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = ~iIdentityHashCode2;
            int i25 = i21 + 1899760768 + (((~((-1712840125) | i24)) | 110897996) * 226) + (((~(i24 | (-1610863793))) | (~((-110897997) | iIdentityHashCode2)) | 8921664) * (-113)) + ((~(iIdentityHashCode2 | (-1712840125))) * 113);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr[1])[0] = i27 ^ (i27 << 5);
            Object[] objArr23 = {new int[]{i23}, new int[1], iArr2, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i28 = INotificationSideChannel + 123;
                INotificationSideChannelDefault = i28 % 128;
                int i29 = i28 % 2;
                for (int i30 = 0; i30 < strArr3.length; i30++) {
                    int i31 = INotificationSideChannel + 57;
                    INotificationSideChannelDefault = i31 % 128;
                    if (i31 % 2 == 0) {
                        arrayList.add(strArr3[i30]);
                    } else {
                        arrayList.add(strArr3[i30]);
                    }
                }
            }
            int[] iArr3 = new int[i20];
            int i32 = i20 - 1;
            iArr3[i32] = 1;
            Toast.makeText((Context) null, iArr3[((i20 * i32) % 2) - 1], 1).show();
            int i33 = ((int[]) objArr[1])[0];
            int i34 = ((int[]) objArr[2])[0];
            int i35 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr4 = {i34};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i36 = ~((-1107894337) | startUptimeMillis);
            int i37 = i33 + (-765853688) + ((10666112 | i36) * (-476)) + (i36 * 952) + ((~((~startUptimeMillis) | (-1107894337))) * 476);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr[1])[0] = i39 ^ (i39 << 5);
            Object[] objArr24 = {new int[]{i35}, new int[1], iArr4, strArr4};
        }
        return (String) this.TuitionPaymentFragmentbindingInflater1.getValue();
    }

    static {
        onTransact = 0;
        asInterface();
        INSTANCE = new Companion(null);
        int i = cancelAll + 43;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    static void asInterface() {
        cancel = new char[]{45565, 17585, 23422, 28199, 25855, 31674, 3690, 1383, 7147, 11956, 9516, 14382, 52929, 50568, 55362, 61204, 58817, 63660, 36678, 33290, 39107, 44936, 10076, 53782, 52702, 63616, 62022, 60691, 39119, 37822, 36164, 47107, 46027, 44716, 22644, 21299, 20214, 34738, 29438, 27953, 22632, 21168, 19957, 14373, 13096, 11690, 6392, 4925, 3612, 63670, 62423, 60941, 55639, 54165, 52937, 47377, 46163, 44731, 39364, 37987, 36531, 31226, 29756, 45567, 17578, 23400, 28199, 25845, 31677, 3706, 1288, 7156, 11959, 9582, 14356, 52955, 50586, 55362, 61208, 58819, 63617, 37812, 26364, 31022, 19574, 18172, 23037, 11309, 10085, 14753, 3243, 1811, 6726, 60553, 59341, 64017, 52574, 45557, 17595, 23423, 28219, 25828, 31674, 3706, 1328, 7116, 11942, 9585, 14357, 52987, 50580, 55378, 61204, 45486, 17594, 23420, 28212, 25841, 31665, 3688, 1407, 7101, 11937, 9572, 14408, 52957, 50590, 55383, 61252, 58779, 63710, 36636, 33280, 39061, 45012, 41577, 47355, 20401, 16928, 22832, 28604, 25339, 31087, 3186, 696, 6597, 11358, 9032, 14732, 52417, 49922, 54870, 60616, 58242, 62994, 36182, 33765, 38526, 44350, 41893, 46820, 19821, 16511, 22194, 28068, 24628, 30587, 3468, 155, 5901, 10831, 8326, 14223, 51786, 49421, 55188, 60035, 37118, 26047, 31359, 20322, 17825, 23271, 12141, 9343, 15072, 4000, 1075, 6430, 61404, 58568, 63825, 52804, 50335, 55773, 44573, 41815, 47508, 36565, 33593, 39342, 28343, 25378, 30769, 20149, 17402, 22579, 11646, 9144, 14532, 3420, 590, 6277, 60869, 57943, 63246, 52634, 49879, 55107, 44037, 41706, 46894, 35950, 33444, 38883, 27700, 24877, 30642, 19709, 16739, 22134, 11404, 8650, 13910, 2832, 385, 5848, 60232, 57434, 63121, 52102};
        notify = -3831369900337511201L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, short r8) {
        /*
            byte[] r0 = defpackage.isSupportedYUVFormat.$$c
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r8 = r8 * 3
            int r8 = r8 + 109
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isSupportedYUVFormat.$$g(short, short, short):java.lang.String");
    }
}
