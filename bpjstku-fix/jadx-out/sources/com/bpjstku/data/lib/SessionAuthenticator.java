package com.bpjstku.data.lib;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.lib.exception.UnauthorisedException;
import com.bpjstku.domain.user.model.UserAccessToken;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.google.gson.Gson;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.FileTransformFactory;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.ZoomGestureDetectorZoomEvent;
import defpackage.accesssetAnchoredZoomStartYp;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.readableMs;
import defpackage.registerlambda1;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.share;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/bpjstku/data/lib/SessionAuthenticator;", "Lokhttp3/Authenticator;", "LgetEventTime;", "<init>", "()V", "Lokhttp3/Route;", "p0", "Lokhttp3/Response;", "p1", "Lokhttp3/Request;", "authenticate", "(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;", "Lregisterlambda1;", "userUseCase$delegate", "Lkotlin/Lazy;", "getUserUseCase", "()Lregisterlambda1;", "userUseCase", "Lcom/bpjstku/data/lib/PreferenceManager;", "preferenceManager$delegate", "getPreferenceManager", "()Lcom/bpjstku/data/lib/PreferenceManager;", "preferenceManager", "Lcom/google/gson/Gson;", "gson$delegate", "getGson", "()Lcom/google/gson/Gson;", "gson", "Lokhttp3/Request$Builder;", "requestBuilder", "Lokhttp3/Request$Builder;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SessionAuthenticator implements Authenticator, getEventTime {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    private final Lazy gson;

    /* JADX INFO: renamed from: preferenceManager$delegate, reason: from kotlin metadata */
    private final Lazy preferenceManager;
    private Request.Builder requestBuilder;

    /* JADX INFO: renamed from: userUseCase$delegate, reason: from kotlin metadata */
    private final Lazy userUseCase;

    /* JADX WARN: Multi-variable type inference failed */
    public SessionAuthenticator() {
        SessionAuthenticator sessionAuthenticator = this;
        final FileTransformFactory fileTransformFactory = sessionAuthenticator.getKoin().b;
        final mapPoint mappoint = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.userUseCase = LazyKt.lazy(new Function0<registerlambda1>() { // from class: com.bpjstku.data.lib.SessionAuthenticator$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, registerlambda1] */
            @Override // kotlin.jvm.functions.Function0
            public final registerlambda1 invoke() {
                return fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), mappoint, objArr);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final FileTransformFactory fileTransformFactory2 = sessionAuthenticator.getKoin().b;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.preferenceManager = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.data.lib.SessionAuthenticator$special$$inlined$inject$default$2
            private static final byte[] $$c = {109, 48, -62, 38};
            private static final int $$d = 236;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {1, 115, -83, 116, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
            private static final int $$b = 221;
            private static int $TuitionPaymentFragmentbindingInflater1 = 0;
            private static int $b = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722386;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r5, short r6, short r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 * 4
                    int r7 = r7 + 84
                    int r5 = r5 * 3
                    int r5 = 4 - r5
                    int r6 = r6 * 4
                    int r0 = 53 - r6
                    byte[] r1 = com.bpjstku.data.lib.SessionAuthenticator$special$$inlined$inject$default$2.$$a
                    byte[] r0 = new byte[r0]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r1 != 0) goto L18
                    r4 = r6
                    r3 = r2
                    goto L2a
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r6) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L26:
                    r4 = r1[r5]
                    int r3 = r3 + 1
                L2a:
                    int r4 = -r4
                    int r7 = r7 + r4
                    int r7 = r7 + (-11)
                    int r5 = r5 + 1
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.lib.SessionAuthenticator$special$$inlined$inject$default$2.c(byte, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:36:0x0175  */
            /* JADX WARN: Code duplicated, block: B:37:0x0176  */
            private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr4) throws Throwable {
                int i4;
                long j;
                Throwable cause;
                int i5 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (true) {
                    i4 = 29209604;
                    j = 0;
                    if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                        break;
                    }
                    int i6 = $10 + 79;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 1;
                            byte b2 = (byte) (-b);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), 3291 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30, 1199271174, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr5)).charValue();
                        try {
                            Object[] objArr6 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = (byte) (b3 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.blue(0), Color.green(0) + 651, 44 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -450685997, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6);
                        } catch (Throwable th) {
                            cause = th.getCause();
                            if (cause != null) {
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
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i3 > 0) {
                    int i9 = $11 + 25;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    int i11 = $10 + 59;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr7 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 651, (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 43, -450685997, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr7);
                        i4 = 29209604;
                        j = 0;
                    }
                    cArr2 = cArr4;
                }
                objArr4[0] = new String(cArr2);
            }

            /* JADX WARN: Type inference failed for: r0v40, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() throws Throwable {
                int iIntValue;
                int i = 2 % 2;
                int i2 = $b + 75;
                $TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                int i4 = 8;
                int i5 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 40 - View.MeasureSpec.getMode(0), 19 - View.resolveSizeAndState(0, 0, 0), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                Object obj = null;
                int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object[] objArr4 = new Object[1];
                a(false, 111 - Color.blue(0), 22 - (Process.myTid() >> 22), TextUtils.getOffsetAfter("", 0) + 17, new char[]{6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f'}, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a(false, 115 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) + 15, 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, objArr5);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                long j = -1;
                long j2 = j ^ (-1091708520289008653L);
                long elapsedCpuTime = (((long) ((int) Process.getElapsedCpuTime())) | (-1091708520289008653L)) ^ j;
                long j3 = (((long) (-391)) * 3188965695030967640L) + (((long) (-195)) * (-1091708520289008653L)) + (((long) (-196)) * (((j2 | 3188965695030967640L) ^ j) | elapsedCpuTime)) + (((long) 392) * (-227014070413672453L)) + (((long) 196) * ((((j ^ 3188965695030967640L) | j2) ^ j) | elapsedCpuTime));
                int i7 = 0;
                try {
                    while (i7 != 10) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getTrimmedLength("") + 37836), TextUtils.indexOf((CharSequence) "", '0', i5) + 60, Color.blue(i5) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        int i8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(obj);
                        int i9 = i5;
                        long j4 = jLongValue;
                        while (true) {
                            int i10 = i5;
                            while (i10 != i4) {
                                int i11 = $b + 55;
                                $TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                                if (i11 % 2 != 0) {
                                    i8 = (((((int) (j4 << i10)) & 3063) - (i8 << 48)) << (i8 << 17)) << i8;
                                    i10 += 88;
                                } else {
                                    int i12 = (((((int) (j4 >> i10)) & 255) + (i8 << 6)) + (i8 << 16)) - i8;
                                    i10++;
                                    i8 = i12;
                                }
                                i4 = 8;
                            }
                            if (i9 != 0) {
                                break;
                            }
                            int i13 = $TuitionPaymentFragmentbindingInflater1 + 31;
                            $b = i13 % 128;
                            i9 = i13 % 2 == 0 ? i9 + 24 : i9 + 1;
                            j4 = j3;
                            i4 = 8;
                            i5 = 0;
                        }
                        if (i8 == i6) {
                            return fileTransformFactory2.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), objArr2, objArr3);
                        }
                        jLongValue -= 1024;
                        i7++;
                        i4 = 8;
                        i5 = 0;
                        obj = null;
                    }
                    Object[] objArr6 = {-1455439056};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46037 - TextUtils.lastIndexOf("", '0')), 1134 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr7 = {Integer.valueOf(iIntValue), 0, -1919667280, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr6), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cAlpha = (char) Color.alpha(0);
                        int iAlpha = Color.alpha(0) + 1031;
                        int absoluteGravity = 15 - Gravity.getAbsoluteGravity(0, 0);
                        byte b = $$a[7];
                        byte b2 = b;
                        Object[] objArr8 = new Object[1];
                        c(b, b2, b2, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAlpha, iAlpha, absoluteGravity, 1298546779, false, (String) objArr8[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.myPid() >> 22) + 45993), (ViewConfiguration.getTapTimeout() >> 16) + 1117, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17), Boolean.TYPE});
                    }
                    Object[] objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr7);
                    int i14 = ((int[]) objArr9[1])[0];
                    int i15 = ((int[]) objArr9[3])[0];
                    if (i15 != i14) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr9[0];
                        if (strArr != null) {
                            int i16 = $TuitionPaymentFragmentbindingInflater1 + 75;
                            $b = i16 % 128;
                            int i17 = i16 % 2;
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        throw new RuntimeException(String.valueOf(i15));
                    }
                    return fileTransformFactory2.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), objArr2, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
                Object[] objArr10 = new Object[1];
                a(true, 110 - View.resolveSizeAndState(0, 0, 0), 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, new char[]{65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23}, objArr10);
                Class<?> cls2 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                a(false, 114 - View.resolveSize(0, 0), 15 - TextUtils.indexOf((CharSequence) "", '0'), ((byte) KeyEvent.getModifierMetaStateMask()) + 17, new char[]{3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535}, objArr11);
                iIntValue = ((Integer) cls2.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r6, byte r7, short r8) {
                /*
                    byte[] r0 = com.bpjstku.data.lib.SessionAuthenticator$special$$inlined$inject$default$2.$$c
                    int r7 = r7 + 4
                    int r8 = r8 * 2
                    int r1 = 1 - r8
                    int r6 = r6 + 119
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r0 != 0) goto L15
                    r3 = r7
                    r6 = r8
                    r4 = r2
                    goto L2b
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r8) goto L21
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L21:
                    int r7 = r7 + 1
                    r4 = r0[r7]
                    int r3 = r3 + 1
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2b:
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.lib.SessionAuthenticator$special$$inlined$inject$default$2.$$e(int, byte, short):java.lang.String");
            }
        });
        final FileTransformFactory fileTransformFactory3 = sessionAuthenticator.getKoin().b;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.gson = LazyKt.lazy(new Function0<Gson>() { // from class: com.bpjstku.data.lib.SessionAuthenticator$special$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r0v1, types: [com.google.gson.Gson, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Gson invoke() {
                return fileTransformFactory3.b(Reflection.getOrCreateKotlinClass(Gson.class), objArr4, objArr5);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final registerlambda1 getUserUseCase() {
        return (registerlambda1) this.userUseCase.getValue();
    }

    private final PreferenceManager getPreferenceManager() {
        return (PreferenceManager) this.preferenceManager.getValue();
    }

    private final Gson getGson() {
        return (Gson) this.gson.getValue();
    }

    @Override // okhttp3.Authenticator
    public final Request authenticate(Route p0, Response p1) throws IOException {
        Intrinsics.checkNotNullParameter(p1, "");
        Request requestBuild = null;
        if (!p1.isSuccessful() && p1.code() == 401 && getUserUseCase().g()) {
            try {
                ErrorResponse errorResponse = (ErrorResponse) getGson().fromJson(p1.peekBody(Long.MAX_VALUE).string(), ErrorResponse.class);
                if (errorResponse != null) {
                    if (!StringsKt.equals(errorResponse.getStatusCode(), "101", true)) {
                        if (!getUserUseCase().g() || PreferenceManager.getString$default(getPreferenceManager(), "USER_ACCESS_TOKEN", null, 2, null).length() <= 0) {
                            return null;
                        }
                        synchronized (this) {
                            try {
                                deriveCodec<UserAccessToken> derivecodecAsInterface = getUserUseCase().asInterface();
                                readableMs readablems = new readableMs() { // from class: com.bpjstku.data.lib.SessionAuthenticator$$ExternalSyntheticLambda0
                                    @Override // defpackage.readableMs
                                    public final Object apply(Object obj) {
                                        return SessionAuthenticator.authenticate$lambda$1$lambda$0((Throwable) obj);
                                    }
                                };
                                share.b(readablems, "resumeFunction is null");
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            Request.Builder builderNewBuilder = p1.request().newBuilder();
                            this.requestBuilder = builderNewBuilder;
                            if (builderNewBuilder == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                builderNewBuilder = null;
                            }
                            Request.Builder builderRemoveHeader = builderNewBuilder.removeHeader("Authorization");
                            String string = getPreferenceManager().getString("USER_ACCESS_TOKEN", "");
                            StringBuilder sb = new StringBuilder("Bearer ");
                            sb.append(string);
                            builderRemoveHeader.addHeader("Authorization", sb.toString());
                            Request.Builder builder = this.requestBuilder;
                            if (builder != null) {
                                if (builder == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                    builder = null;
                                }
                                requestBuild = builder.build();
                            }
                        }
                        return requestBuild;
                    }
                    getUserUseCase().TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    Context applicationContext = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getApplicationContext();
                    Intrinsics.checkNotNull(applicationContext);
                    accesssetAnchoredZoomStartYp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(applicationContext, new Function1() { // from class: com.bpjstku.data.lib.SessionAuthenticator$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SessionAuthenticator.authenticate$lambda$3$lambda$2((Context) obj);
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
        return requestBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserAccessToken authenticate$lambda$1$lambda$0(Throwable th) throws UnauthorisedException {
        Intrinsics.checkNotNullParameter(th, "");
        throw new UnauthorisedException(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit authenticate$lambda$3$lambda$2(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        LoginActivity.Companion companion = LoginActivity.INSTANCE;
        LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(context, null, true, 2);
        return Unit.INSTANCE;
    }

    @Override // defpackage.getEventTime
    public final ZoomGestureDetectorZoomEvent getKoin() {
        return ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
    }
}
