package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import com.dynatrace.android.agent.CommunicationManager;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.conf.DataCollectionLevel;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.midtrans.sdk.analytics.MixpanelAnalyticsManager;
import java.lang.reflect.Field;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeferrableSurface {
    private static addRequestCancellationListener INotificationSideChannel;
    private static sendCaptureError RemoteActionCompatParcelizer;
    public static isEffectTargetsSupported TuitionPaymentFragmentbindingInflater1;
    private static final Bitmap2JpegBytesApi34Impl TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    static CommunicationManager TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final propagatePostviewImage TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f930a;
    private static final releaseInputResources asBinder;
    private static lambdaprovideSurface5 asInterface;
    private static final AutoValue_TakePictureManager_CaptureError b;
    private static long cancel;
    private static getExpectedFrameRate cancelAll;
    private static final Image2JpegBytesIn d;
    private static lambdasetTransformationInfoListener8 g;
    private static AtomicBoolean notify;
    private static getAppConfig onTransact;
    private static final byte[] $$d = {27, -8, 5, 78, 62, 9, 5, -15, 21, 21, 19, -6, 4, -8, 34, 9, 15, 2, -4, 43, 5, 13, -3, -12, 48, 9, 6, 15, 9, -27, 43, 14, -1, 16, 9, 15, -10, -8, 34, 9, 15, 2, -4, 43, 5, 13, -3, -12, 48, 9, 6, 15, 9, -27, 43, 14, -1, 16, 9, 15, -32, 47, 16, -5, 23, 6, -3, 21, -62, 23, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 75;
    private static final byte[] $$a = {25, -93, -120, -48, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 173;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = defpackage.getDeferrableSurface.$$a
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getDeferrableSurface.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 66
            int r6 = 69 - r6
            byte[] r0 = defpackage.getDeferrableSurface.$$d
            int r7 = r7 * 29
            int r1 = r7 + 38
            int r8 = r8 * 19
            int r8 = r8 + 65
            byte[] r1 = new byte[r1]
            int r7 = r7 + 37
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L32
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getDeferrableSurface.e(short, short, int, java.lang.Object[]):void");
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(MixpanelAnalyticsManager.CORE_FLOW);
        f930a = sb.toString();
        b = new AutoValue_TakePictureManager_CaptureError();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new propagatePostviewImage();
        asBinder = new releaseInputResources();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Bitmap2JpegBytesApi34Impl();
        d = new Image2JpegBytesIn();
        g = null;
        cancel = 12L;
        INotificationSideChannel = new addRequestCancellationListener();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CommunicationManager(INotificationSideChannel);
        notify = new AtomicBoolean(true);
        asInterface = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1();
        cancelAll = new getExpectedFrameRate(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        RemoteActionCompatParcelizer = null;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, bindToCamera bindtocamera, long j) {
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long jB;
        mergeConfigs mergeconfigsTuitionPaymentFragmentbindingInflater1;
        sendCaptureError sendcaptureerror;
        Object[] objArr;
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            StringBuilder sb = new StringBuilder("new session with ");
            sb.append(bindtocamera.TuitionPaymentFragmentbindingInflater1.toString());
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
        }
        if (bindtocamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == DataCollectionLevel.USER_BEHAVIOR) {
            jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (z && mergeConfigs.TuitionPaymentFragmentbindingInflater1().cancelAll != jTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
            }
            jB = TuitionPaymentFragmentbindingInflater1.b();
            if (jB < 0) {
                return;
            }
        } else {
            jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isEffectTargetsSupported.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            try {
                setEffect seteffect = TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                ContentValues contentValues = new ContentValues();
                contentValues.put("visitorid", (Integer) 0);
                contentValues.put("sessionid", (Integer) 0);
                seteffect.getWritableDatabase().update("parm", contentValues, "_id=1", null);
            } catch (Exception unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String str = isEffectTargetsSupported.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    ViewPort.a("Database error.");
                }
            }
            lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
            boolean z2 = SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            lambdasetTransformationInfoListener8 lambdasettransformationinfolistener8 = g;
            lambdasettransformationinfolistener8.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                StringBuilder sb2 = new StringBuilder("GPS/Network getLastKnownLocation mockDeviceLocation:");
                sb2.append(lambdasettransformationinfolistener8.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb2.toString());
            }
            jB = 1;
        }
        if (z) {
            mergeconfigsTuitionPaymentFragmentbindingInflater1 = mergeConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bindtocamera, j);
        } else {
            mergeconfigsTuitionPaymentFragmentbindingInflater1 = mergeConfigs.TuitionPaymentFragmentbindingInflater1(bindtocamera);
        }
        mergeconfigsTuitionPaymentFragmentbindingInflater1.cancelAll = jTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        mergeconfigsTuitionPaymentFragmentbindingInflater1.d = jB;
        if (!z) {
            mergeconfigsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bindtocamera;
        }
        if (z) {
            synchronized (getDeferrableSurface.class) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3("resetLifecycle");
                ViewPort.TuitionPaymentFragmentbindingInflater1();
            }
        }
        int i = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().onTransact.d;
        lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().notify = i;
        g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(true);
        if (lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().d) {
            if (!z) {
                getAppConfig getappconfig = onTransact;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cArgb = (char) (31533 - Color.argb(0, 0, 0, 0));
                    int deadChar = 921 - KeyEvent.getDeadChar(0, 0);
                    int iRed = Color.red(0) + 28;
                    byte b2 = $$a[80];
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    c(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, deadChar, iRed, -1048449946, false, (String) objArr2[0], null);
                }
                long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
                    int i2 = 921 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 29;
                    byte[] bArr = $$a;
                    Object[] objArr3 = new Object[1];
                    c((byte) 52, bArr[80], bArr[7], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i2, iLastIndexOf, -778300370, false, (String) objArr3[0], null);
                }
                if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31533);
                        int i3 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 920;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
                        byte b4 = (byte) ($$b & 119);
                        byte b5 = $$a[7];
                        Object[] objArr4 = new Object[1];
                        c(b4, b5, b5, objArr4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, i3, tapTimeout, -1142834547, false, (String) objArr4[0], null);
                    }
                    Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[]{((int[]) objArr5[3])[0]}, (String[]) objArr5[4]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i4 = 264661457 + ((297381403 | startElapsedRealtime) * 614);
                    int i5 = ~startElapsedRealtime;
                    int i6 = i4 + (((~((-738914379) | i5)) | 565258 | (~(1035165265 | i5))) * (-1228)) + (((~(i5 | 1035730523)) | (~((-738349121) | i5))) * 614) + 394623298;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                } else {
                    Context applicationContext = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    try {
                        Object[] objArr6 = {applicationContext, Integer.valueOf(((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, getappconfig)).intValue()), 0, 394623298};
                        byte[] bArr2 = $$d;
                        byte b6 = (byte) (-bArr2[32]);
                        Object[] objArr7 = new Object[1];
                        e(b6, b6, bArr2[94], objArr7);
                        Class<?> cls = Class.forName((String) objArr7[0]);
                        byte b7 = bArr2[94];
                        Object[] objArr8 = new Object[1];
                        e(b7, b7, (byte) (-bArr2[32]), objArr8);
                        Object[] objArr9 = (Object[]) cls.getMethod((String) objArr8[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char gidForName = (char) (Process.getGidForName("") + 31534);
                            int gidForName2 = Process.getGidForName("") + 922;
                            int deadChar2 = 28 - KeyEvent.getDeadChar(0, 0);
                            byte b8 = (byte) ($$b & 119);
                            byte b9 = $$a[7];
                            Object[] objArr10 = new Object[1];
                            c(b8, b9, b9, objArr10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, gidForName2, deadChar2, -1142834547, false, (String) objArr10[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr9);
                        try {
                            long jLongValue2 = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cRed = (char) (31533 - Color.red(0));
                                int iRed2 = 921 - Color.red(0);
                                int i9 = 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                byte[] bArr3 = $$a;
                                Object[] objArr11 = new Object[1];
                                c((byte) 52, bArr3[80], bArr3[7], objArr11);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, iRed2, i9, -778300370, false, (String) objArr11[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31534);
                                int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 920;
                                int i11 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                byte b10 = $$a[80];
                                byte b11 = b10;
                                Object[] objArr12 = new Object[1];
                                c(b10, b11, b11, objArr12);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, i10, i11, -1048449946, false, (String) objArr12[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            objArr = objArr9;
                        } catch (Exception unused2) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i12 = ((int[]) objArr[1])[0];
                int i13 = ((int[]) objArr[3])[0];
                if (i13 == i12) {
                    int i14 = ((int[]) objArr[0])[0];
                    Object[] objArr13 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i15 = i14 + 1515543643 + (((~((-1576154675) | elapsedCpuTime)) | 197924969) * (-366)) + (((~(elapsedCpuTime | (-1412572691))) | 34342985) * 366);
                    int i16 = (i15 << 13) ^ i15;
                    int i17 = i16 ^ (i16 >>> 17);
                    ((int[]) objArr13[0])[0] = i17 ^ (i17 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        for (String str2 : strArr) {
                            arrayList.add(str2);
                        }
                    }
                    int[] iArr = new int[i13];
                    int i18 = i13 - 1;
                    iArr[i18] = 1;
                    Toast.makeText((Context) null, iArr[((i13 * i18) % 2) - 1], 1).show();
                    int i19 = ((int[]) objArr[0])[0];
                    Object[] objArr14 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int i20 = (~new Random().nextInt(732759675)) | 499730894;
                    int i21 = i19 + (-1920088554) + (i20 * 495) + (((~i20) | 163643596) * 495);
                    int i22 = (i21 << 13) ^ i21;
                    int i23 = i22 ^ (i22 >>> 17);
                    ((int[]) objArr14[0])[0] = i23 ^ (i23 << 5);
                }
                getappconfig.TuitionPaymentFragmentbindingInflater1 = new getEffect(getappconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            getAppConfig getappconfig2 = onTransact;
            String str3 = lambdaprovideSurface5.b;
            synchronized (getappconfig2) {
                getappconfig2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new HashMap();
                if (getappconfig2.b == AgentMode.SAAS) {
                    Map<String, String> map = getappconfig2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    StringBuilder sb3 = new StringBuilder("dtAdkSettings=");
                    getCurrentConfig getcurrentconfig = getappconfig2.asInterface;
                    sb3.append(getCurrentConfig.b(mergeconfigsTuitionPaymentFragmentbindingInflater1));
                    map.put("dtAdkSettings", sb3.toString());
                }
                if (mergeconfigsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.ordinal() >= DataCollectionLevel.PERFORMANCE.ordinal()) {
                    Map<String, String> map2 = getappconfig2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    StringBuilder sb4 = new StringBuilder("dtAdk=");
                    getCurrentConfig getcurrentconfig2 = getappconfig2.asInterface;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(mergeconfigsTuitionPaymentFragmentbindingInflater1.cancelAll);
                    sb5.append("_");
                    sb5.append(mergeconfigsTuitionPaymentFragmentbindingInflater1.d);
                    sb5.append("-");
                    sb5.append(mergeconfigsTuitionPaymentFragmentbindingInflater1.b);
                    sb5.append("_");
                    sb5.append(str3);
                    sb5.append("_m");
                    sb4.append(sb5.toString());
                    map2.put("dtAdk", sb4.toString());
                    if (getappconfig2.b == AgentMode.APP_MON) {
                        Map<String, String> map3 = getappconfig2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        StringBuilder sb6 = new StringBuilder("dtCookie=");
                        getCurrentConfig getcurrentconfig3 = getappconfig2.asInterface;
                        long j3 = mergeconfigsTuitionPaymentFragmentbindingInflater1.cancelAll;
                        long j4 = mergeconfigsTuitionPaymentFragmentbindingInflater1.d;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(j3);
                        sb7.append("_");
                        sb7.append(j4);
                        sb6.append(sb7.toString());
                        map3.put("dtCookie", sb6.toString());
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add("dtAdk");
                    if (getappconfig2.b == AgentMode.APP_MON) {
                        arrayList2.add("dtCookie");
                    }
                    getappconfig2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getappconfig2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, arrayList2);
                    getappconfig2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getappconfig2.d, arrayList2);
                }
                if (!getappconfig2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty()) {
                    getappconfig2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(getappconfig2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getappconfig2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.values(), false);
                    getappconfig2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(getappconfig2.d, getappconfig2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.values(), true);
                }
            }
        }
        if (lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStubProxy && (sendcaptureerror = RemoteActionCompatParcelizer) != null) {
            synchronized (sendcaptureerror) {
                if (sendcaptureerror.b) {
                    sendcaptureerror.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
                }
                sendcaptureerror.asBinder = mergeconfigsTuitionPaymentFragmentbindingInflater1;
                sendcaptureerror.g = new CaptureNodeExternalSyntheticLambda1(mergeconfigsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                sendcaptureerror.notify = mergeconfigsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                sendcaptureerror.b = true;
            }
        }
        if (mergeconfigsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(EventType.ACTION_AUTO_LOADING_APP)) {
            StringBuilder sb8 = new StringBuilder("Loading ");
            sb8.append(lambdaprovideSurface5.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            isPrimary isprimary = new isPrimary(sb8.toString(), mergeconfigsTuitionPaymentFragmentbindingInflater1, i, true);
            isprimary.INotificationSideChannelStubProxy();
            ((lambdanew3androidxcameracoreSurfaceRequest) isprimary).TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPort.b();
            isprimary.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = EventType.ACTION_AUTO_LOADING_APP;
            TuitionPaymentFragmentbindingInflater1(isprimary, isprimary.cancelAll());
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2.d.set(mergeconfigsTuitionPaymentFragmentbindingInflater1.f1275a.active);
        b();
        if (asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            new setTransformationInfoListener();
        }
    }

    static void b() {
        if (TuitionPaymentFragmentbindingInflater1 == null) {
            return;
        }
        notifyInactive.TuitionPaymentFragmentspecialinlinedviewModeldefault1().b();
        addRequestCancellationListener addrequestcancellationlistener = INotificationSideChannel;
        synchronized (addrequestcancellationlistener.b) {
            addrequestcancellationlistener.b.clear();
            addrequestcancellationlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0L;
        }
        CommunicationManager communicationManager = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        synchronized (communicationManager.cancelAll) {
            communicationManager.g.set(true);
            communicationManager.cancelAll.notify();
        }
    }

    public static void b(ServerConfiguration serverConfiguration) {
        lambdaprovideSurface5 lambdaprovidesurface5 = asInterface;
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("switching settings: ".concat(String.valueOf(serverConfiguration)));
        }
        lambdaprovidesurface5.onTransact = serverConfiguration;
        long j = (serverConfiguration.f762a + 9) / 10;
        cancel = j;
        INotificationSideChannel.TuitionPaymentFragmentbindingInflater1(j);
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Send event timeout set to: %s ticks", Long.valueOf(j)));
        }
        if (serverConfiguration.INotificationSideChannel) {
            lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().notify = serverConfiguration.d;
        }
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(isServiced isserviced) {
        if (isserviced.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isserviced.TuitionPaymentFragmentspecialinlinedviewModeldefault2())) {
            String string = isserviced.b().toString();
            g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(false);
            String string2 = g.TuitionPaymentFragmentspecialinlinedviewModeldefault1(isserviced.cancel).toString();
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Store %dbytes", Integer.valueOf(string2.length() + string.length())));
            }
            notifyInactive notifyinactiveTuitionPaymentFragmentspecialinlinedviewModeldefault1 = notifyInactive.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            notifyinactiveTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(new notifyInactive.TuitionPaymentFragmentbindingInflater1(string2, string, isserviced.cancel, isserviced.TuitionPaymentFragmentspecialinlinedviewModeldefault2().protocolId, isserviced.onTransact(), isserviced.d(), lambdaprovideSurface5.b));
        }
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(mergeConfigs mergeconfigs) {
        return g.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mergeconfigs).toString();
    }

    static isServiced TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, int i, long j, lambdanew3androidxcameracoreSurfaceRequest lambdanew3androidxcameracoresurfacerequest, mergeConfigs mergeconfigs, int i2, String... strArr) {
        isServiced isserviced;
        isServiced isserviced2;
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Handle event name=%s type=%s", str, Integer.valueOf(i)));
        }
        long j2 = j < 0 ? 0L : j;
        switch (i) {
            case 1:
                if (lambdanew3androidxcameracoresurfacerequest != null) {
                    INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdanew3androidxcameracoresurfacerequest);
                }
                isserviced = lambdanew3androidxcameracoresurfacerequest;
                TuitionPaymentFragmentbindingInflater1(isserviced, i);
                return isserviced;
            case 2:
                if (lambdanew3androidxcameracoresurfacerequest != null) {
                    lambdanew3androidxcameracoresurfacerequest.INotificationSideChannelStubProxy();
                }
                isserviced = lambdanew3androidxcameracoresurfacerequest;
                TuitionPaymentFragmentbindingInflater1(isserviced, i);
                return isserviced;
            case 3:
            case 5:
            default:
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("addEvent invalid type: %d", Integer.valueOf(i)));
                }
                isserviced = null;
                TuitionPaymentFragmentbindingInflater1(isserviced, i);
                return isserviced;
            case 4:
                if (str == null || str.isEmpty()) {
                    return null;
                }
                isserviced2 = new isServiced(str, 4, EventType.NAMED_EVENT, j2, mergeconfigs, i2, true);
                INotificationSideChannel.TuitionPaymentFragmentbindingInflater1();
                isserviced = isserviced2;
                TuitionPaymentFragmentbindingInflater1(isserviced, i);
                return isserviced;
            case 6:
                if (str == null || str.isEmpty()) {
                    return null;
                }
                isserviced = new isServiced(str, 6, EventType.VALUE_INT64, j2, mergeconfigs, i2, true);
                isserviced.notify = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strArr[0], ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                INotificationSideChannel.TuitionPaymentFragmentbindingInflater1();
                TuitionPaymentFragmentbindingInflater1(isserviced, i);
                return isserviced;
            case 7:
                if (str == null || str.isEmpty()) {
                    return null;
                }
                isserviced = new isServiced(str, 6, EventType.VALUE_DOUBLE, j2, mergeconfigs, i2, true);
                isserviced.notify = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strArr[0], ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                INotificationSideChannel.TuitionPaymentFragmentbindingInflater1();
                TuitionPaymentFragmentbindingInflater1(isserviced, i);
                return isserviced;
            case 8:
                if (str == null || str.isEmpty()) {
                    return null;
                }
                isserviced = new isServiced(str, 6, EventType.VALUE_STRING, j2, mergeconfigs, i2, true);
                isserviced.notify = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strArr[0], ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                INotificationSideChannel.TuitionPaymentFragmentbindingInflater1();
                TuitionPaymentFragmentbindingInflater1(isserviced, i);
                return isserviced;
            case 9:
                if (str == null || str.isEmpty()) {
                    return null;
                }
                isserviced = new isServiced(str, 6, EventType.ERROR_INT, j2, mergeconfigs, i2, true);
                isserviced.notify = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strArr[0], ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                INotificationSideChannel.TuitionPaymentFragmentbindingInflater1();
                TuitionPaymentFragmentbindingInflater1(isserviced, i);
                return isserviced;
            case 10:
                if (str == null || str.isEmpty()) {
                    return null;
                }
                isserviced = new lambdainitialSurfaceRecreationCompleter6androidxcameracoreSurfaceRequest(str, strArr[0], strArr[1], strArr[2], j2, mergeconfigs, i2, strArr[3]);
                INotificationSideChannel.TuitionPaymentFragmentbindingInflater1();
                TuitionPaymentFragmentbindingInflater1(isserviced, i);
                return isserviced;
            case 11:
                if (str == null || str.isEmpty()) {
                    return null;
                }
                isserviced2 = new lambdaupdateTransformationInfo7(str, strArr[0], strArr[1], mergeconfigs, i2, strArr[2]);
                INotificationSideChannel.TuitionPaymentFragmentbindingInflater1();
                String str2 = strArr[2];
                String str3 = strArr[0];
                String str4 = strArr[1];
                getSecondaryCameraId.b();
                isserviced = isserviced2;
                TuitionPaymentFragmentbindingInflater1(isserviced, i);
                return isserviced;
            case 12:
                isserviced2 = new isServiced(str, 12, EventType.IDENTIFY_USER, j2, mergeconfigs, i2, true);
                INotificationSideChannel.TuitionPaymentFragmentbindingInflater1();
                isserviced = isserviced2;
                TuitionPaymentFragmentbindingInflater1(isserviced, i);
                return isserviced;
        }
    }

    public static void b(mergeConfigs mergeconfigs) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(mergeconfigs.asBinder, 12, 0L, null, mergeconfigs, lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().notify, new String[0]);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(isServiced isserviced) {
        TuitionPaymentFragmentbindingInflater1(isserviced, isserviced.cancelAll());
    }

    private static void TuitionPaymentFragmentbindingInflater1(isServiced isserviced, int i) {
        if (isserviced != null && isserviced.cancel() && isserviced.TuitionPaymentFragmentbindingInflater1) {
            if (g != null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(isserviced);
                if (isServiced.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get() == 0) {
                    isServiced.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(1);
                }
            } else if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("discarded");
            }
            if (i == 2) {
                INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(isserviced);
            }
        }
    }

    static void b(Application application, Activity activity, SurfaceRequestTransformationInfo surfaceRequestTransformationInfo, SurfaceRequestResultResultCode surfaceRequestResultResultCode) {
        bindToCamera bindtocamera;
        lambdaprovideSurface4 lambdaprovidesurface4TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Application.ActivityLifecycleCallbacks getsafecloseimagereaderproxy;
        if (surfaceRequestTransformationInfo.onTransact) {
            SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("startup configuration: ".concat(String.valueOf(surfaceRequestTransformationInfo)));
            ViewPort.g(String.format("%s %s Target API %d Android API %d", lambdaprovideSurface5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), "8.287.1.1006", Integer.valueOf(((Integer) ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2111259520, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -2111259519, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{application}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).intValue()), Integer.valueOf(Build.VERSION.SDK_INT)));
        }
        isPrimary.b(surfaceRequestTransformationInfo);
        asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceRequestTransformationInfo, application);
        removeStateChangeCallback removestatechangecallback = asInterface.asBinder;
        new TorchStateState();
        b(removeStateChangeCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(removestatechangecallback.TuitionPaymentFragmentbindingInflater1(), (surfaceRequestTransformationInfo == null || !surfaceRequestTransformationInfo.connect) ? 1 : (-new Random(System.currentTimeMillis()).nextInt(32767)) - 2));
        if (surfaceRequestTransformationInfo.getRoot) {
            bindtocamera = new bindToCamera(asInterface.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        } else {
            asInterface.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            bindtocamera = bindToCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        lambdaprovideSurface5.b = surfaceRequestTransformationInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        addUseCase.b();
        SurfaceRequest3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceRequestTransformationInfo.f230a.startsWith("https");
        SurfaceRequest3.b = !surfaceRequestTransformationInfo.asInterface;
        KeyStore keyStore = surfaceRequestTransformationInfo.INotificationSideChannelDefault;
        SurfaceRequest3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = keyStore;
        if (keyStore != null) {
            SurfaceRequest3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = surfaceRequestTransformationInfo.INotificationSideChannelStub;
        }
        if (notify.get()) {
            mergeConfigs.TuitionPaymentFragmentbindingInflater1(bindtocamera);
        } else {
            ViewPort.TuitionPaymentFragmentbindingInflater1();
            mergeConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bindtocamera);
        }
        isEffectTargetsSupported iseffecttargetssupported = new isEffectTargetsSupported(application);
        TuitionPaymentFragmentbindingInflater1 = iseffecttargetssupported;
        String str = surfaceRequestTransformationInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        synchronized (iseffecttargetssupported) {
            try {
                iseffecttargetssupported.b.getWritableDatabase().delete("Events", "app_id!= ?", new String[]{str});
            } catch (Exception unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String str2 = isEffectTargetsSupported.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    ViewPort.TuitionPaymentFragmentbindingInflater1("Database error.");
                }
            }
        }
        byte b2 = 0;
        boolean z = surfaceRequestTransformationInfo.write != null;
        if (z) {
            lambdaprovidesurface4TuitionPaymentFragmentspecialinlinedviewModeldefault2 = surfaceRequestTransformationInfo.write.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("set new agent state listener: ".concat(String.valueOf(lambdaprovidesurface4TuitionPaymentFragmentspecialinlinedviewModeldefault2)));
            }
            asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdaprovidesurface4TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        } else {
            lambdaprovidesurface4TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        }
        g = new lambdasetTransformationInfoListener8(surfaceRequestTransformationInfo.notify);
        notifyInactive.TuitionPaymentFragmentspecialinlinedviewModeldefault1().start();
        INotificationSideChannel.TuitionPaymentFragmentbindingInflater1(cancel);
        CommunicationManager communicationManager = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        isEffectTargetsSupported iseffecttargetssupported2 = TuitionPaymentFragmentbindingInflater1;
        communicationManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = surfaceRequestResultResultCode;
        communicationManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iseffecttargetssupported2;
        communicationManager.TuitionPaymentFragmentbindingInflater1 = lambdaprovidesurface4TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        communicationManager.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceRequestTransformationInfo.g;
        iseffecttargetssupported2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime(), lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().onTransact.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0);
        if (communicationManager.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            communicationManager.asBinder = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }
        communicationManager.onTransact = new SurfaceRequest5(new SurfaceRequestExternalSyntheticLambda4(), surfaceRequestTransformationInfo, new snapToSurfaceRotation(surfaceRequestTransformationInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        Thread thread = communicationManager.cancelAll;
        if (thread != null && thread.isAlive()) {
            try {
                communicationManager.cancelAll.interrupt();
            } catch (Exception unused2) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.a("event sender thread problem");
                }
            }
        }
        CommunicationManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CommunicationManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2(communicationManager, b2);
        communicationManager.cancelAll = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.start();
        communicationManager.asInterface.set(true);
        if (surfaceRequestTransformationInfo.asBinder) {
            getSecondaryCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            getSecondaryCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cancelAll);
        }
        if (lambdaprovidesurface4TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            ServerConfiguration serverConfiguration = asInterface.onTransact;
        }
        if (surfaceRequestTransformationInfo.TuitionPaymentFragmentbindingInflater1) {
            AutoValue_TakePictureManager_CaptureError autoValue_TakePictureManager_CaptureError = b;
            getImageProxy getimageproxy = new getImageProxy(new getOnDiskCallback(), new updateSuggestedStreamSpec(), new getViewPort(), new UseCaseGroupBuilder(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3), new CaptureNode1(new CaptureNode1ExternalSyntheticLambda1()));
            getInputEdge getinputedge = new getInputEdge();
            if (Build.VERSION.SDK_INT >= 29) {
                getsafecloseimagereaderproxy = new lambdatransform2androidxcameracoreimagecaptureCaptureNode(getimageproxy, getinputedge);
            } else {
                getsafecloseimagereaderproxy = new getSafeCloseImageReaderProxy(getimageproxy, getinputedge);
            }
            autoValue_TakePictureManager_CaptureError.TuitionPaymentFragmentbindingInflater1 = getsafecloseimagereaderproxy;
            application.registerActivityLifecycleCallbacks(getsafecloseimagereaderproxy);
        }
        Bitmap2JpegBytesApi34Impl bitmap2JpegBytesApi34Impl = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        hasGainmap hasgainmap = new hasGainmap(new getInputEdge(), bitmap2JpegBytesApi34Impl, new Bitmap2JpegBytes(), bitmap2JpegBytesApi34Impl);
        bitmap2JpegBytesApi34Impl.b = hasgainmap;
        application.registerActivityLifecycleCallbacks(hasgainmap);
        if (surfaceRequestTransformationInfo.b) {
            propagatePostviewImage propagatepostviewimage = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            lambdareleaseInputResources3 lambdareleaseinputresources3 = new lambdareleaseInputResources3(new UseCaseGroupBuilder(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3), new lambdaonCaptureStarted0androidxcameracoreimagecaptureCaptureNode1(new CaptureNode1ExternalSyntheticLambda1()), new notifyReset(), application);
            propagatepostviewimage.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdareleaseinputresources3;
            propagatepostviewimage.b = lambdareleaseinputresources3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        releaseInputResources releaseinputresources = asBinder;
        lambdatransform1androidxcameracoreimagecaptureCaptureNode lambdatransform1androidxcameracoreimagecapturecapturenode = new lambdatransform1androidxcameracoreimagecaptureCaptureNode(new getInputEdge());
        releaseinputresources.b = lambdatransform1androidxcameracoreimagecapturecapturenode;
        lambdatransform1androidxcameracoreimagecapturecapturenode.TuitionPaymentFragmentbindingInflater1.add(new lambdanew1());
        application.registerActivityLifecycleCallbacks(releaseinputresources.b);
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(surfaceRequestTransformationInfo.write.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        if (surfaceRequestTransformationInfo.INotificationSideChannelStubProxy) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new UseCaseGroup());
            if (z) {
                arrayList2.add(surfaceRequestTransformationInfo.write.TuitionPaymentFragmentbindingInflater1());
            }
            RemoteActionCompatParcelizer = new sendCaptureError(arrayList2, Executors.newScheduledThreadPool(1), SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            arrayList.add(new CaptureNodeExternalSyntheticLambda6(RemoteActionCompatParcelizer, SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        }
        Image2JpegBytesIn image2JpegBytesIn = d;
        if (!arrayList.isEmpty()) {
            Image2Bitmap image2Bitmap = new Image2Bitmap(new ImageCaptureControl(arrayList));
            image2JpegBytesIn.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = image2Bitmap;
            application.registerActivityLifecycleCallbacks(image2Bitmap);
        }
        if (surfaceRequestTransformationInfo.cancel) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            if (surfaceRequestTransformationInfo.RemoteActionCompatParcelizer != null) {
                Collections.addAll(hashSet, surfaceRequestTransformationInfo.RemoteActionCompatParcelizer);
            }
            if (surfaceRequestTransformationInfo.read != null) {
                Collections.addAll(hashSet2, surfaceRequestTransformationInfo.read);
            }
            if (surfaceRequestTransformationInfo.getInterfaceDescriptor == AgentMode.APP_MON) {
                if (surfaceRequestTransformationInfo.f230a.startsWith("https://")) {
                    hashSet2.add(surfaceRequestTransformationInfo.f230a);
                } else {
                    hashSet.add(surfaceRequestTransformationInfo.f230a);
                }
            }
            if (surfaceRequestTransformationInfo.INotificationSideChannel) {
                hashSet.add("file://");
            }
            onTransact = new getAppConfig(hashSet, hashSet2, surfaceRequestTransformationInfo.INotificationSideChannel, surfaceRequestTransformationInfo.getInterfaceDescriptor);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(false, bindtocamera, SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1());
        TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(true);
        SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.set(true);
        notify.set(false);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("%s ... force closed actions due to %s", Thread.currentThread().getName(), str));
        }
        onInputSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        isPrimary.IconCompatParcelizer();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009d A[Catch: all -> 0x0157, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0018, B:7:0x001d, B:9:0x0023, B:10:0x002a, B:12:0x0030, B:13:0x0035, B:15:0x003b, B:16:0x0040, B:18:0x0046, B:19:0x004b, B:20:0x0058, B:22:0x005b, B:23:0x005c, B:26:0x0064, B:32:0x0076, B:34:0x007c, B:36:0x0080, B:29:0x0069, B:31:0x006d, B:37:0x0097, B:39:0x009d, B:40:0x00a0, B:42:0x00ad, B:43:0x00ca, B:44:0x00d3, B:46:0x00de, B:47:0x00df, B:49:0x00e5, B:54:0x0100, B:56:0x0106, B:58:0x010a, B:59:0x011d, B:61:0x0128, B:51:0x00e9, B:53:0x00ed, B:65:0x0152, B:66:0x0153, B:68:0x0155, B:69:0x0156, B:45:0x00d4, B:21:0x0059), top: B:77:0x0003, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad A[Catch: all -> 0x0157, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0018, B:7:0x001d, B:9:0x0023, B:10:0x002a, B:12:0x0030, B:13:0x0035, B:15:0x003b, B:16:0x0040, B:18:0x0046, B:19:0x004b, B:20:0x0058, B:22:0x005b, B:23:0x005c, B:26:0x0064, B:32:0x0076, B:34:0x007c, B:36:0x0080, B:29:0x0069, B:31:0x006d, B:37:0x0097, B:39:0x009d, B:40:0x00a0, B:42:0x00ad, B:43:0x00ca, B:44:0x00d3, B:46:0x00de, B:47:0x00df, B:49:0x00e5, B:54:0x0100, B:56:0x0106, B:58:0x010a, B:59:0x011d, B:61:0x0128, B:51:0x00e9, B:53:0x00ed, B:65:0x0152, B:66:0x0153, B:68:0x0155, B:69:0x0156, B:45:0x00d4, B:21:0x0059), top: B:77:0x0003, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0128 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0018, B:7:0x001d, B:9:0x0023, B:10:0x002a, B:12:0x0030, B:13:0x0035, B:15:0x003b, B:16:0x0040, B:18:0x0046, B:19:0x004b, B:20:0x0058, B:22:0x005b, B:23:0x005c, B:26:0x0064, B:32:0x0076, B:34:0x007c, B:36:0x0080, B:29:0x0069, B:31:0x006d, B:37:0x0097, B:39:0x009d, B:40:0x00a0, B:42:0x00ad, B:43:0x00ca, B:44:0x00d3, B:46:0x00de, B:47:0x00df, B:49:0x00e5, B:54:0x0100, B:56:0x0106, B:58:0x010a, B:59:0x011d, B:61:0x0128, B:51:0x00e9, B:53:0x00ed, B:65:0x0152, B:66:0x0153, B:68:0x0155, B:69:0x0156, B:45:0x00d4, B:21:0x0059), top: B:77:0x0003, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void b(long j) {
        CommunicationManager communicationManager;
        ThreadPoolExecutor threadPoolExecutor;
        Thread thread;
        long jElapsedRealtime;
        synchronized (getDeferrableSurface.class) {
            SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.set(false);
            Application application = (Application) lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().g;
            releaseInputResources releaseinputresources = asBinder;
            lambdatransform1androidxcameracoreimagecaptureCaptureNode lambdatransform1androidxcameracoreimagecapturecapturenode = releaseinputresources.b;
            if (lambdatransform1androidxcameracoreimagecapturecapturenode != null) {
                application.unregisterActivityLifecycleCallbacks(lambdatransform1androidxcameracoreimagecapturecapturenode);
                releaseinputresources.b = null;
            }
            propagatePostviewImage propagatepostviewimage = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            BitmapEffect bitmapEffect = propagatepostviewimage.b;
            if (bitmapEffect != null) {
                application.unregisterActivityLifecycleCallbacks(bitmapEffect);
                propagatepostviewimage.b = null;
                propagatepostviewimage.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            }
            AutoValue_TakePictureManager_CaptureError autoValue_TakePictureManager_CaptureError = b;
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = autoValue_TakePictureManager_CaptureError.TuitionPaymentFragmentbindingInflater1;
            if (activityLifecycleCallbacks != null) {
                application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                autoValue_TakePictureManager_CaptureError.TuitionPaymentFragmentbindingInflater1 = null;
            }
            Bitmap2JpegBytesApi34Impl bitmap2JpegBytesApi34Impl = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            hasGainmap hasgainmap = bitmap2JpegBytesApi34Impl.b;
            if (hasgainmap != null) {
                application.unregisterActivityLifecycleCallbacks(hasgainmap);
                bitmap2JpegBytesApi34Impl.b = null;
            }
            Image2JpegBytesIn image2JpegBytesIn = d;
            Image2Bitmap image2Bitmap = image2JpegBytesIn.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (image2Bitmap != null) {
                application.unregisterActivityLifecycleCallbacks(image2Bitmap);
                image2JpegBytesIn.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            }
            RemoteActionCompatParcelizer = null;
            notifyInactive notifyinactiveTuitionPaymentFragmentspecialinlinedviewModeldefault1 = notifyInactive.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            notifyInactive.TuitionPaymentFragmentbindingInflater1.set(false);
            synchronized (notifyInactive.class) {
                notifyInactive.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            }
            if (!notifyinactiveTuitionPaymentFragmentspecialinlinedviewModeldefault1.isAlive()) {
                communicationManager = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                threadPoolExecutor = communicationManager.asBinder;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdownNow();
                }
                communicationManager.asInterface.set(false);
                thread = communicationManager.cancelAll;
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String str = CommunicationManager.b;
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Shutdown allocated time: %s ms threadId=%s", Long.valueOf(j), Long.valueOf(thread.getId())));
                }
                jElapsedRealtime = communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime();
                synchronized (thread) {
                    communicationManager.g.set(true);
                    communicationManager.f759a = false;
                    thread.notify();
                    if (thread.isAlive()) {
                        thread.join(j);
                        if (thread.isAlive()) {
                            String str2 = CommunicationManager.b;
                            ViewPort.asInterface(String.format("Thread to send final events didn't complete in allotted time:%s ms", Long.valueOf(j)));
                        }
                    }
                    communicationManager.onTransact.b.set(0);
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        String str3 = CommunicationManager.b;
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Shutdown took: %s ms threadID=%s", Long.valueOf((communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime()) - jElapsedRealtime), Long.valueOf(thread.getId())));
                    }
                }
            } else {
                try {
                    notifyinactiveTuitionPaymentFragmentspecialinlinedviewModeldefault1.join(1000L);
                } catch (InterruptedException e2) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        String str4 = notifyInactive.b;
                        ViewPort.asInterface(e2.toString());
                    }
                }
                if (notifyinactiveTuitionPaymentFragmentspecialinlinedviewModeldefault1.isAlive() && SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String str5 = notifyInactive.b;
                    StringBuilder sb = new StringBuilder("could not stop thread ");
                    sb.append(notifyinactiveTuitionPaymentFragmentspecialinlinedviewModeldefault1.getName());
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                }
                communicationManager = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                threadPoolExecutor = communicationManager.asBinder;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdownNow();
                }
                communicationManager.asInterface.set(false);
                thread = communicationManager.cancelAll;
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String str6 = CommunicationManager.b;
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Shutdown allocated time: %s ms threadId=%s", Long.valueOf(j), Long.valueOf(thread.getId())));
                }
                jElapsedRealtime = communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime();
                synchronized (thread) {
                    communicationManager.g.set(true);
                    communicationManager.f759a = false;
                    thread.notify();
                }
                if (thread.isAlive()) {
                    try {
                        thread.join(j);
                    } catch (InterruptedException unused) {
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            String str7 = CommunicationManager.b;
                            ViewPort.a(String.format("Thread to send final events Interrupted, allotted time: %s ms", Long.valueOf(j)));
                        }
                    }
                    if (thread.isAlive() && SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        String str8 = CommunicationManager.b;
                        ViewPort.asInterface(String.format("Thread to send final events didn't complete in allotted time:%s ms", Long.valueOf(j)));
                    }
                }
                communicationManager.onTransact.b.set(0);
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String str9 = CommunicationManager.b;
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Shutdown took: %s ms threadID=%s", Long.valueOf((communicationManager.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime()) - jElapsedRealtime), Long.valueOf(thread.getId())));
                }
            }
            throw th;
        }
    }

    static boolean TuitionPaymentFragmentbindingInflater1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface.get();
    }

    public static SurfaceRequestExternalSyntheticLambda2 TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        mergeConfigs mergeconfigsTuitionPaymentFragmentbindingInflater1;
        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda2;
        int i;
        long j;
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface.get()) {
            return null;
        }
        lambdanew3androidxcameracoreSurfaceRequest lambdanew3androidxcameracoresurfacerequestTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onInputSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (lambdanew3androidxcameracoresurfacerequestTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            lambdanew3androidxcameracoresurfacerequestTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isPrimary.read();
        }
        if (lambdanew3androidxcameracoresurfacerequestTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            j = lambdanew3androidxcameracoresurfacerequestTuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface;
            mergeconfigsTuitionPaymentFragmentbindingInflater1 = lambdanew3androidxcameracoresurfacerequestTuitionPaymentFragmentspecialinlinedviewModeldefault1.cancel;
            i = lambdanew3androidxcameracoresurfacerequestTuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannel;
            surfaceRequestExternalSyntheticLambda2 = lambdanew3androidxcameracoresurfacerequestTuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelDefault();
        } else {
            mergeconfigsTuitionPaymentFragmentbindingInflater1 = null;
            surfaceRequestExternalSyntheticLambda2 = null;
            i = 0;
            j = 0;
        }
        if (surfaceRequestExternalSyntheticLambda2 == null) {
            mergeconfigsTuitionPaymentFragmentbindingInflater1 = mergeConfigs.TuitionPaymentFragmentbindingInflater1(false);
            i = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().notify;
            surfaceRequestExternalSyntheticLambda2 = new SurfaceRequestExternalSyntheticLambda2(0L, i, mergeconfigsTuitionPaymentFragmentbindingInflater1);
            j = 0;
        }
        int i2 = i;
        if (!mergeconfigsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(EventType.WEB_REQUEST)) {
            return null;
        }
        isServiced isserviced = new isServiced(surfaceRequestExternalSyntheticLambda2.toString(), 100, EventType.PLACEHOLDER, j, mergeconfigsTuitionPaymentFragmentbindingInflater1, i2, true);
        if (j == 0) {
            lambdanew3androidxcameracoreSurfaceRequest.TuitionPaymentFragmentbindingInflater1(isserviced);
        } else {
            lambdanew3androidxcameracoresurfacerequestTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(isserviced);
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Added an event %s id=%d pid=%d", isserviced.asBinder, Long.valueOf(isserviced.asInterface), Long.valueOf(isserviced.a())));
        }
        return surfaceRequestExternalSyntheticLambda2;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isServiced isserviced) {
        INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(isserviced);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(mergeConfigs mergeconfigs) {
        if (lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().d) {
            getAppConfig getappconfig = onTransact;
            synchronized (getappconfig) {
                if (getappconfig.b == AgentMode.SAAS) {
                    StringBuilder sb = new StringBuilder("dtAdkSettings=");
                    getCurrentConfig getcurrentconfig = getappconfig.asInterface;
                    sb.append(getCurrentConfig.b(mergeconfigs));
                    String string = sb.toString();
                    getappconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.put("dtAdkSettings", string);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(string);
                    getappconfig.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(getappconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3, arrayList, false);
                    getappconfig.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(getappconfig.d, arrayList, true);
                }
            }
        }
    }

    public static addRequestCancellationListener TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return INotificationSideChannel;
    }

    public static propagatePostviewImage TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
