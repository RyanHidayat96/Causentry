package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import com.dynatrace.android.agent.comm.InvalidResponseException;
import com.dynatrace.android.agent.conf.AgentMode;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceRequest5 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int asBinder;
    private static long asInterface;
    private SurfaceRequestTransformationInfo TuitionPaymentFragmentbindingInflater1;
    private SurfaceRequestExternalSyntheticLambda4 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f228a;
    public AtomicInteger b = new AtomicInteger(0);
    private getAttachedSurfaceResolution d;
    private static final byte[] $$a = {57, -56, 23, -36, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 103;
    private static int notify = 0;
    private static int cancel = 1;
    private static int g = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r0 = defpackage.SurfaceRequest5.$$a
            int r1 = r7 + 1
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            int r8 = r8 + 1
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SurfaceRequest5.c(short, int, short, java.lang.Object[]):void");
    }

    static {
        asBinder = 1;
        TuitionPaymentFragmentbindingInflater1();
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("RequestExecutor");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
        int i = g + 7;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public SurfaceRequest5(SurfaceRequestExternalSyntheticLambda4 surfaceRequestExternalSyntheticLambda4, SurfaceRequestTransformationInfo surfaceRequestTransformationInfo, getAttachedSurfaceResolution getattachedsurfaceresolution) {
        this.TuitionPaymentFragmentbindingInflater1 = surfaceRequestTransformationInfo;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = surfaceRequestExternalSyntheticLambda4;
        this.d = getattachedsurfaceresolution;
        if (surfaceRequestTransformationInfo.getInterfaceDescriptor == AgentMode.SAAS) {
            this.f228a = surfaceRequestTransformationInfo.f230a;
            int i = cancel + 71;
            notify = i % 128;
            int i2 = i % 2;
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2("DTX_BeaconSignal", "dynaTraceMonitor");
        StringBuilder sb = new StringBuilder();
        sb.append(surfaceRequestTransformationInfo.f230a);
        sb.append("/");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.f228a = sb.toString();
        int i3 = notify + 67;
        cancel = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x018f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0190  */
    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (true) {
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i3 = $11 + 101;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (KeyEvent.getMaxKeyCode() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2624, (ViewConfiguration.getPressedStateDuration() >> 16) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (asInterface ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39422), Color.red(0) + 481, KeyEvent.normalizeMetaState(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 1;
                $10 = i6 % 128;
                int i7 = i6 % 2;
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $11 + 121;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 39422), 481 - TextUtils.indexOf("", "", 0, 0), 37 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 481, 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3(ServerConfiguration serverConfiguration, boolean z, int i, long j, long j2) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder(this.f228a);
        sb.append("?type=m&srvid=");
        sb.append(i);
        sb.append("&app=");
        sb.append(lambdaprovideSurface5.b);
        sb.append("&va=");
        sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3("8.287.1.1006"));
        sb.append("&tt=maandroid&pt=0");
        if (this.TuitionPaymentFragmentbindingInflater1.getInterfaceDescriptor == AgentMode.SAAS) {
            int i3 = notify + 37;
            cancel = i3 % 128;
            if (i3 % 2 == 0) {
                sb.append("&resp=json&cts=");
                sb.append(serverConfiguration.cancelAll);
                int i4 = 79 / 0;
            } else {
                sb.append("&resp=json&cts=");
                sb.append(serverConfiguration.cancelAll);
            }
        }
        if (z) {
            sb.append("&ns=1");
        }
        sb.append("&si=");
        sb.append(j);
        sb.append("_");
        sb.append(j2);
        String string = sb.toString();
        int i5 = notify + 73;
        cancel = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final ServerConfiguration TuitionPaymentFragmentspecialinlinedviewModeldefault1(ServerConfiguration serverConfiguration, boolean z, String str, int i, long j, long j2, boolean z2) throws Exception {
        int i2 = 2 % 2;
        SurfaceRequestExternalSyntheticLambda7 surfaceRequestExternalSyntheticLambda7TuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3(serverConfiguration, z, i, j, j2), str, z2);
        int i3 = surfaceRequestExternalSyntheticLambda7TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 >= 200) {
            int i4 = notify;
            int i5 = i4 + 101;
            cancel = i5 % 128;
            if (i5 % 2 != 0 ? i3 <= 299 : i3 <= 8500) {
                int i6 = i4 + 35;
                cancel = i6 % 128;
                int i7 = i6 % 2;
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(serverConfiguration, surfaceRequestExternalSyntheticLambda7TuitionPaymentFragmentbindingInflater1);
            }
        }
        if (surfaceRequestExternalSyntheticLambda7TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 404) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i8 = notify + 119;
            cancel = i8 % 128;
            int i9 = i8 % 2;
        }
        StringBuilder sb = new StringBuilder("invalid response code ");
        sb.append(surfaceRequestExternalSyntheticLambda7TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        throw new InvalidResponseException(sb.toString(), surfaceRequestExternalSyntheticLambda7TuitionPaymentFragmentbindingInflater1);
    }

    private ServerConfiguration TuitionPaymentFragmentspecialinlinedviewModeldefault1(ServerConfiguration serverConfiguration, SurfaceRequestExternalSyntheticLambda7 surfaceRequestExternalSyntheticLambda7) throws InvalidResponseException {
        int i = 2 % 2;
        if (surfaceRequestExternalSyntheticLambda7 == null || surfaceRequestExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            throw new InvalidResponseException("no message body", surfaceRequestExternalSyntheticLambda7);
        }
        if (surfaceRequestExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3.startsWith("{")) {
            if (this.TuitionPaymentFragmentbindingInflater1.getInterfaceDescriptor == AgentMode.APP_MON) {
                throw new InvalidResponseException("invalid configuration format", surfaceRequestExternalSyntheticLambda7);
            }
            try {
                return this.d.b(serverConfiguration, surfaceRequestExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } catch (InvalidConfigurationException | ClassCastException | JSONException e2) {
                throw new InvalidResponseException("invalid message protocol", e2, surfaceRequestExternalSyntheticLambda7);
            }
        }
        Map<String, String> mapB = ViewPort.b(surfaceRequestExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        if (mapB != null) {
            int i2 = notify + 25;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            if ("m".equals(mapB.get("type"))) {
                ServerConfiguration serverConfigurationTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mapB, this.TuitionPaymentFragmentbindingInflater1.getInterfaceDescriptor);
                if (this.TuitionPaymentFragmentbindingInflater1.getInterfaceDescriptor == AgentMode.APP_MON) {
                    String str = mapB.get("bn");
                    if (str == null || str.length() <= 0 || this.b.get() > 3) {
                        int i4 = notify + 1;
                        cancel = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 3 % 5;
                        }
                        str = "dynaTraceMonitor";
                    } else {
                        int i6 = cancel + 11;
                        notify = i6 % 128;
                        if (i6 % 2 != 0) {
                            boolean z = SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Setting dtMonitor: %s attempt: %s ", str, Integer.valueOf(this.b.get())));
                        }
                    }
                    if (!str.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.TuitionPaymentFragmentbindingInflater1.f230a);
                        sb.append("/");
                        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        this.f228a = sb.toString();
                        removeStateChangeCallback removestatechangecallback = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().asBinder;
                        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if ("dynaTraceMonitor".equals(str2)) {
                            removestatechangecallback.b.edit().remove("DTX_BeaconSignal").apply();
                        } else {
                            removestatechangecallback.b.edit().putString("DTX_BeaconSignal", str2).apply();
                        }
                    }
                }
                return serverConfigurationTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
        }
        throw new InvalidResponseException("invalid message protocol", surfaceRequestExternalSyntheticLambda7);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = notify + 57;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
            int iMyPid = 651 - (Process.myPid() >> 22);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 45;
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            c(b2, (byte) (b2 | 52), b, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iMyPid, iIndexOf, -459846511, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{16441, 27487, 5870, 49681, 60819, 39228, 17482, 28585, 7039, 50842, 62060, 40328, 18637, 29822, 8082, 51994, 63141, 41442, 19798, 30972, 9231, 53166}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 11113, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{16445, 20493, 24651, 28803, 207, 4384, 8554, 12677, 49653, 53816, 57870, 62047, 33437, 37584, 41763}, 4153 - Color.argb(0, 0, 0, 0), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int deadChar = 651 - KeyEvent.getDeadChar(0, 0);
            int iKeyCodeFromString = 44 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$a;
            byte b3 = bArr[5];
            Object[] objArr6 = new Object[1];
            c(b3, bArr[7], b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, deadChar, iKeyCodeFromString, -873460649, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int i4 = 652 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int deadChar2 = 44 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[5];
                Object[] objArr7 = new Object[1];
                c(b4, (byte) (b4 | 36), bArr2[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatDelay, i4, deadChar2, -1595579076, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr8[2])[0];
            int i6 = ((int[]) objArr8[0])[0];
            int i7 = ~System.identityHashCode(this);
            int i8 = (((((~((-575648777) | i7)) | 4498432) * (-241)) - 1657715688) + (((~(i7 | (-571150345))) | (-576716399)) * 241)) - 724032888;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1609 - MotionEvent.axisFromString(""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr9 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -724032888, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 652;
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 44;
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[5];
                    Object[] objArr10 = new Object[1];
                    c(b5, bArr3[7], b5, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iLastIndexOf, offsetBefore, 2075921419, false, (String) objArr10[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.getGidForName("") + 1), 696 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 98 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 794 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 83), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr11 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iResolveOpacity = 651 - Drawable.resolveOpacity(0, 0);
                    int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43;
                    byte[] bArr4 = $$a;
                    byte b6 = bArr4[5];
                    Object[] objArr12 = new Object[1];
                    c(b6, (byte) (b6 | 36), bArr4[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iResolveOpacity, i11, -1595579076, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr11);
                try {
                    Object[] objArr13 = new Object[1];
                    e(new char[]{16441, 27487, 5870, 49681, 60819, 39228, 17482, 28585, 7039, 50842, 62060, 40328, 18637, 29822, 8082, 51994, 63141, 41442, 19798, 30972, 9231, 53166}, TextUtils.lastIndexOf("", '0', 0, 0) + 11114, objArr13);
                    Class<?> cls2 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    e(new char[]{16445, 20493, 24651, 28803, 207, 4384, 8554, 12677, 49653, 53816, 57870, 62047, 33437, 37584, 41763}, (ViewConfiguration.getEdgeSlop() >> 16) + 4153, objArr14);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int offsetAfter = 651 - TextUtils.getOffsetAfter("", 0);
                        int i12 = 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[5];
                        Object[] objArr15 = new Object[1];
                        c(b7, bArr5[7], b7, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cArgb, offsetAfter, i12, -873460649, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int iMyPid2 = 651 - (Process.myPid() >> 22);
                        int pressedStateDuration = 44 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr16 = new Object[1];
                        c(b9, (byte) (b9 | 52), b8, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionGroup, iMyPid2, pressedStateDuration, -459846511, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr11;
                } catch (Exception unused) {
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
        int i13 = ((int[]) objArr[0])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 == i13) {
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i18 = ~iIdentityHashCode;
            int i19 = i15 + (-1706690203) + (((~(624246259 | i18)) | (-627677070) | (~((-624246260) | iIdentityHashCode))) * (-564)) + ((~(iIdentityHashCode | (-622925186))) * 1128) + (((~((-627677070) | i18)) | 1321074) * 564);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr2[3])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i22 = cancel + 5;
                notify = i22 % 128;
                int i23 = i22 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i24 = i14 - 1;
            iArr[i24] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i24) % 2) - 1], 1).show();
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[0])[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i28 = ~elapsedCpuTime;
            int i29 = i25 + 1269399330 + (((-239207) | i28) * (-369)) + (((~((-796674073) | i28)) | (-793243263)) * (-369)) + (((~(elapsedCpuTime | 796674072)) | (-796913279) | (~(i28 | (-793004057)))) * 369);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr2[3])[0] = i31 ^ (i31 << 5);
        }
        if (this.TuitionPaymentFragmentbindingInflater1.getInterfaceDescriptor == AgentMode.APP_MON) {
            int i32 = notify + 81;
            cancel = i32 % 128;
            int i33 = i32 % 2;
            if ("dynaTraceMonitor".equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return;
            }
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i34 = notify + 85;
                cancel = i34 % 128;
                int i35 = i34 % 2;
                String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i36 = ((int[]) objArr2[3])[0];
                int i37 = i36 * i36;
                int i38 = -(26742996 * i36);
                int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
                int i40 = -(i36 * (-312689256));
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                int i42 = (i41 & (-1122730140)) + ((-1122730140) | i41);
                int i43 = ((i42 >> 27) - 63) / 32;
                int i44 = (i43 & 1) + (i43 | 1);
                int i45 = ((i42 | i44) << 1) - (i44 ^ i42);
                int i46 = ((i42 >> 15) - 262143) / 131072;
                int i47 = -(i45 ^ ((i46 ^ 1) + ((i46 & 1) << 1)));
                int i48 = (i47 & 4) + (i47 | 4);
                int i49 = i48 >> 15;
                int i50 = (((-262143) & i49) + (i49 | (-262143))) / 131072;
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Resetting beacon signal (%s) to (%s)", str2, "24|14|29|0|16|dynaTraceMonitor".substring(110544 / (((-(((i50 & 1) + (i50 | 1)) + 1)) & i48) * 1974))));
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "dynaTraceMonitor";
            lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().asBinder.b.edit().remove("DTX_BeaconSignal").apply();
            this.b.incrementAndGet();
        }
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        asInterface = 7674136112256182595L;
    }
}
