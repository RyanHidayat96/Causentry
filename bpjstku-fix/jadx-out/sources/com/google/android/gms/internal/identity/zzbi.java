package com.google.android.gms.internal.identity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.location.Location;
import android.media.AudioTrack;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.DeviceOrientationListener;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzo;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbi extends GoogleApi implements FusedLocationProviderClient {
    static final Api.ClientKey zza;
    public static final Api zzb;
    private static final Object zzc;
    private static Object zzd;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzb = new Api("LocationServices.API", new zzbf(), clientKey);
        zzc = new Object();
    }

    public zzbi(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) zzb, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    private final Task zza(final LocationRequest locationRequest, ListenerHolder listenerHolder) {
        final zzbh zzbhVar = new zzbh(this, listenerHolder, zzcd.zza);
        return doRegisterEventListener(RegistrationMethods.builder().register(new RemoteCall() { // from class: com.google.android.gms.internal.location.zzbt
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                Api api = zzbi.zzb;
                ((zzdz) obj).zzs(zzbhVar, locationRequest, (TaskCompletionSource) obj2);
            }
        }).unregister(zzbhVar).withHolder(listenerHolder).setMethodKey(2435).build());
    }

    private final Task zzb(final LocationRequest locationRequest, ListenerHolder listenerHolder) {
        final zzbh zzbhVar = new zzbh(this, listenerHolder, zzbz.zza);
        return doRegisterEventListener(RegistrationMethods.builder().register(new RemoteCall() { // from class: com.google.android.gms.internal.location.zzbu
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                Api api = zzbi.zzb;
                ((zzdz) obj).zzt(zzbhVar, locationRequest, (TaskCompletionSource) obj2);
            }
        }).unregister(zzbhVar).withHolder(listenerHolder).setMethodKey(2436).build());
    }

    private final Task zzc(final DeviceOrientationRequest deviceOrientationRequest, final ListenerHolder listenerHolder) {
        RemoteCall remoteCall = new RemoteCall() { // from class: com.google.android.gms.internal.location.zzbm
            private static final byte[] $$c = {80, -8, 43, 65};
            private static final int $$f = 215;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {7, 15, 25, 25, 15, 18, -11, 21, 7, 5, 7, 29, -5, -23, 56, -7, 32, -12, 11, 20, 3, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -57};
            private static final int $$e = 203;
            private static final byte[] $$a = {51, -5, 77, 89, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
            private static final int $$b = 91;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int d = 1;
            private static char b = 48314;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 26180;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 4768;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 21710;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 + 4
                    int r7 = r7 * 52
                    int r0 = 53 - r7
                    byte[] r1 = com.google.android.gms.internal.identity.zzbm.$$a
                    int r6 = r6 * 14
                    int r6 = 98 - r6
                    byte[] r0 = new byte[r0]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r1 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L32
                L16:
                    r3 = r2
                L17:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    if (r3 != r7) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L27:
                    int r6 = r6 + 1
                    r4 = r1[r6]
                    int r3 = r3 + 1
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L32:
                    int r6 = -r6
                    int r3 = r3 + r6
                    int r6 = r3 + (-11)
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzbm.a(int, short, byte, java.lang.Object[]):void");
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
            private static void e(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.google.android.gms.internal.identity.zzbm.$$d
                    int r6 = r6 * 21
                    int r6 = r6 + 84
                    int r8 = r8 * 35
                    int r8 = 53 - r8
                    int r7 = r7 + 4
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r8
                    r4 = r2
                    goto L28
                L14:
                    r3 = r2
                L15:
                    int r4 = r3 + 1
                    byte r5 = (byte) r6
                    r1[r3] = r5
                    int r7 = r7 + 1
                    if (r4 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    r3 = r0[r7]
                L28:
                    int r6 = r6 + r3
                    int r6 = r6 + (-10)
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzbm.e(byte, byte, byte, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                        objArr[0] = new String(cArr2, 0, i);
                        return;
                    }
                    int i4 = $10 + 81;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    int i6 = 58224;
                    int i7 = 0;
                    while (i7 < 16) {
                        int i8 = $10 + 9;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        char c = cArr3[1];
                        char c2 = cArr3[i3];
                        int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                        int i11 = c2 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            objArr2[2] = Integer.valueOf(i11);
                            objArr2[1] = Integer.valueOf(i10);
                            objArr2[i3] = Integer.valueOf(c);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char mirror = (char) (AndroidCharacter.getMirror('0') + 47725);
                                int threadPriority = 468 - ((Process.getThreadPriority(i3) + 20) >> 6);
                                int iMyTid = 13 - (Process.myTid() >> 22);
                                Class[] clsArr = new Class[4];
                                clsArr[i3] = Integer.TYPE;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, threadPriority, iMyTid, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            int i12 = i7;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 47773), 468 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 13 - (Process.myTid() >> 22), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i6 -= 40503;
                            i7 = i12 + 1;
                            i3 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                    Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-16774893) - Color.rgb(0, 0, 0), Color.blue(0) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
            }

            /* JADX WARN: Code duplicated, block: B:22:0x022e  */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = d + 109;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                zzdz zzdzVar = (zzdz) obj;
                Api api = zzbi.zzb;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf = (char) (37567 - TextUtils.indexOf("", "", 0));
                    int windowTouchSlop = 625 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int fadingEdgeLength = 14 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    byte b3 = bArr[5];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, (byte) (-b3), objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, windowTouchSlop, fadingEdgeLength, -477065106, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{33313, 55582, 55953, 9146, 30586, 25857, 45294, 56091, 1445, 24857, 42679, 6733, 41017, 38635, 61638, 23013, 38120, 53203, 59982, 54058, 22366, 19499, 55698, 50644}, 22 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{39724, 45989, 55629, 50512, 64505, 60495, 16709, 57626, 24049, 3128, 50435, 27747, 17643, 54667, 29845, 753, 23659, 10018}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char mirror = (char) (37615 - AndroidCharacter.getMirror('0'));
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 625;
                    int fadingEdgeLength2 = 14 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[5];
                    Object[] objArr5 = new Object[1];
                    a(b4, bArr2[7], (byte) (-b4), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, iKeyCodeFromString, fadingEdgeLength2, -976899241, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char keyRepeatTimeout = (char) (37567 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int modifierMetaStateMask = 624 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int i4 = 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte[] bArr3 = $$a;
                        Object[] objArr6 = new Object[1];
                        a(bArr3[5], bArr3[7], bArr3[0], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, modifierMetaStateMask, i4, -973632554, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i5 = ((int[]) objArr7[2])[0];
                    int i6 = ((int[]) objArr7[0])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int[] iArr = {i6};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i7 = 1682176680 + (((~(689536483 | iIdentityHashCode)) | 1134201637) * 672);
                    int i8 = ~iIdentityHashCode;
                    int i9 = ((i7 + (((~(iIdentityHashCode | 1134201637)) | (~((-689536484) | i8))) * (-672))) + (((~((-1134201638) | i8)) | 1115849220) * 672)) - 1906986967;
                    int i10 = (i9 << 13) ^ i9;
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
                    objArr = new Object[]{iArr, new int[1], new int[]{i5}, strArr};
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{3807, 52153, 12819, 37603, 30677, 46268, 30941, 57301, 18455, 49322, 42221, 12284, 37166, 62444, 22888, 55013, 7254, 1283, 43430, 62384, 18456, 19691, 23969, 884, 57590, 28677, 26729, 51288}, 26 - View.combineMeasuredStates(0, 0), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{51784, 20159, 36107, 51714, 16965, 32761, 22162, 57874, 5539, 45371, 39014, 44381, 60728, 14392, 16584, 58798, 32268, 35705, 970, 3619}, View.getDefaultSize(0, 0) + 18, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i12 = d + 91;
                        int i13 = i12 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i13;
                        int i14 = i12 % 2;
                        if (applicationContext instanceof ContextWrapper) {
                            int i15 = i13 + 49;
                            d = i15 % 128;
                            int i16 = i15 % 2;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{28572, 44974, 59259, 57588, 54800, 18345, 33511, 53155, 18199, 60570, 5321, 5891, 46486, 27964, 21116, 58522, 61627, 12945}, 16 - TextUtils.indexOf("", ""), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{55084, 50946, 9701, 63735, 43601, 23553, 44355, 50867, 59601, 10371, 1441, 35785, 16773, 48853, 47005, 49185, 48661, 54112}, ExpandableListView.getPackedPositionChild(0L) + 17, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    Object[] objArr12 = new Object[1];
                    c(new char[]{60698, 27818, 30088, 53670, 2344, 16010, 26297, 47950, 21154, 5946, 39671, 41571, 4415, 17313, 63894, 65093, 10933, 27586, 27114, 48417, 50640, 28838, 40864, 13919, 20995, 6586, 2742, 23884, 56458, 20127, 21996, 48564, 48585, 49226, 25318, 9500, 37039, 3727, 1657, 47177, 45158, 64628, 19269, 52473, 8315, 48047, 57387, 10181, 44401, 58314, 23307, 3778, 41207, 27344, 33584, 61613, 63467, 7925, 11270, 26723, 14252, 22965, Typography.doublePrime, 22595, 55844, 23606}, (ViewConfiguration.getPressedStateDuration() >> 16) + 64, objArr12);
                    String str = (String) objArr12[0];
                    Object[] objArr13 = new Object[1];
                    c(new char[]{60635, 4050, 30043, 17769, 25008, 65176, 56253, 50279, 30982, 47140, 31340, 3887, 2411, 19925, 26812, 52554, 45641, 10556, 21662, 49738, 8754, 61110, 8456, 32822, 12031, 43136, 12625, 12979, 46233, 37517, 41104, 23093, 39535, 35203, 35138, 38436, 60861, 47250, 36754, 63351, 34592, 24714, 47133, 45273, 6740, 20080, 37781, 12452, 17551, 54654, 47865, 51890, 53253, 64383, 57684, 11437, 18323, 37244, 7332, 60119, 16244, 55259, 15598, 56806, 3672, 47882}, 64 - View.MeasureSpec.getSize(0), objArr13);
                    String[] strArr2 = {str, (String) objArr13[0]};
                    int i17 = TuitionPaymentFragmentbindingInflater1;
                    int i18 = i17 + 33;
                    d = i18 % 128;
                    int i19 = i18 % 2;
                    int i20 = i17 + 3;
                    d = i20 % 128;
                    int i21 = i20 % 2;
                    try {
                        Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -1906986967};
                        byte[] bArr4 = $$d;
                        byte b5 = bArr4[54];
                        Object[] objArr15 = new Object[1];
                        e(b5, bArr4[24], b5, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        byte b6 = bArr4[54];
                        Object[] objArr16 = new Object[1];
                        e((byte) (b6 - 1), bArr4[25], (byte) (b6 - 1), objArr16);
                        objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                        int i22 = ((int[]) objArr[0])[0];
                        int i23 = ((int[]) objArr[2])[0];
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 37567);
                                int i24 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 624;
                                int trimmedLength = 14 - TextUtils.getTrimmedLength("");
                                byte[] bArr5 = $$a;
                                Object[] objArr17 = new Object[1];
                                a(bArr5[5], bArr5[7], bArr5[0], objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, i24, trimmedLength, -973632554, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr18 = new Object[1];
                                c(new char[]{33313, 55582, 55953, 9146, 30586, 25857, 45294, 56091, 1445, 24857, 42679, 6733, 41017, 38635, 61638, 23013, 38120, 53203, 59982, 54058, 22366, 19499, 55698, 50644}, 'F' - AndroidCharacter.getMirror('0'), objArr18);
                                Class<?> cls5 = Class.forName((String) objArr18[0]);
                                Object[] objArr19 = new Object[1];
                                c(new char[]{39724, 45989, 55629, 50512, 64505, 60495, 16709, 57626, 24049, 3128, 50435, 27747, 17643, 54667, 29845, 753, 23659, 10018}, 15 - Color.red(0), objArr19);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 37567);
                                    int iArgb = 625 - Color.argb(0, 0, 0, 0);
                                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15;
                                    byte[] bArr6 = $$a;
                                    byte b7 = bArr6[5];
                                    Object[] objArr20 = new Object[1];
                                    a(b7, bArr6[7], (byte) (-b7), objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, iArgb, iIndexOf, -976899241, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0', 0));
                                    int i25 = 626 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int i26 = 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    byte[] bArr7 = $$a;
                                    byte b8 = bArr7[7];
                                    byte b9 = bArr7[5];
                                    Object[] objArr21 = new Object[1];
                                    a(b8, b9, (byte) (-b9), objArr21);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, i25, i26, -477065106, false, (String) objArr21[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr[3];
                    if (strArr3 != null) {
                        for (String str2 : strArr3) {
                            arrayList.add(str2);
                        }
                    }
                    throw null;
                }
                int i27 = ((int[]) objArr[1])[0];
                int i28 = ((int[]) objArr[2])[0];
                int i29 = ((int[]) objArr[0])[0];
                String[] strArr4 = (String[]) objArr[3];
                int[] iArr2 = {i28};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i30 = ~iIdentityHashCode2;
                int i31 = i27 + (((~((-196679) | i30)) | (~(1048311031 | iIdentityHashCode2))) * 988) + 655816292 + (((~(iIdentityHashCode2 | (-775623768))) | 775427089 | (~(i30 | 1048311031))) * 988);
                int i32 = (i31 << 13) ^ i31;
                int i33 = i32 ^ (i32 >>> 17);
                ((int[]) objArr[1])[0] = i33 ^ (i33 << 5);
                Object[] objArr22 = {new int[]{i29}, new int[1], iArr2, strArr4};
                zzdzVar.zzC(listenerHolder, deviceOrientationRequest, taskCompletionSource);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r5, byte r6, byte r7) {
                /*
                    int r5 = r5 * 3
                    int r5 = 108 - r5
                    byte[] r0 = com.google.android.gms.internal.identity.zzbm.$$c
                    int r6 = r6 * 4
                    int r1 = r6 + 1
                    int r7 = r7 * 4
                    int r7 = 3 - r7
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r4 = r5
                    r5 = r6
                    r3 = r2
                    goto L29
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r5
                    int r7 = r7 + 1
                    r1[r3] = r4
                    if (r3 != r6) goto L25
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L25:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                L29:
                    int r5 = r5 + r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzbm.$$g(byte, byte, byte):java.lang.String");
            }
        };
        return doRegisterEventListener(RegistrationMethods.builder().register(remoteCall).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.location.zzbn
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                zzdz zzdzVar = (zzdz) obj;
                Api api = zzbi.zzb;
                ListenerHolder.ListenerKey listenerKey = listenerHolder.getListenerKey();
                if (listenerKey != null) {
                    zzdzVar.zzD(listenerKey, taskCompletionSource);
                }
            }
        }).withHolder(listenerHolder).setMethodKey(2434).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> flushLocations() {
        return doWrite(TaskApiCall.builder().run(zzca.zza).setMethodKey(2422).build());
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    public final String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Location> getCurrentLocation(int i, CancellationToken cancellationToken) {
        CurrentLocationRequest.Builder builder = new CurrentLocationRequest.Builder();
        builder.setPriority(i);
        CurrentLocationRequest currentLocationRequestBuild = builder.build();
        if (cancellationToken != null) {
            Preconditions.checkArgument(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task<Location> taskDoRead = doRead(TaskApiCall.builder().run(new zzbp(currentLocationRequestBuild, cancellationToken)).setMethodKey(2415).build());
        if (cancellationToken == null) {
            return taskDoRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        taskDoRead.continueWith(new zzbq(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Location> getLastLocation() {
        return doRead(TaskApiCall.builder().run(zzby.zza).setMethodKey(2414).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<LocationAvailability> getLocationAvailability() {
        return doRead(TaskApiCall.builder().run(zzbr.zza).setMethodKey(2416).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> removeLocationUpdates(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.location.zzbx
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                Api api = zzbi.zzb;
                ((zzdz) obj).zzx(pendingIntent, (TaskCompletionSource) obj2, null);
            }
        }).setMethodKey(2418).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestDeviceOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, DeviceOrientationListener deviceOrientationListener, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return zzc(deviceOrientationRequest, ListenerHolders.createListenerHolder(deviceOrientationListener, looper, "DeviceOrientationListener"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestLocationUpdates(final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.location.zzbs
            private static final byte[] $$c = {31, -3, -46, 11};
            private static final int $$d = 82;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {58, -51, 54, -115, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$b = 75;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int b = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {60050, 60117, 60056, 60051, 60088, 60058, 60043, 60054, 60045, 60034, 60057, 60048, 60072, 60060, 60047, 60062, 60040, 60049, 60055, 60073, 60041, 60063, 60052, 60053, 60083};
            private static char TuitionPaymentFragmentbindingInflater1 = 57188;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 3
                    int r7 = 84 - r7
                    int r8 = r8 * 4
                    int r8 = r8 + 53
                    int r6 = r6 * 2
                    int r6 = r6 + 4
                    byte[] r0 = com.google.android.gms.internal.identity.zzbs.$$a
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r7 = r6
                    r3 = r8
                    r5 = r2
                    goto L29
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r7
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r8) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    r3 = r0[r6]
                L29:
                    int r6 = r6 + 1
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    r3 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzbs.c(short, byte, int, java.lang.Object[]):void");
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                zzdz zzdzVar = (zzdz) obj;
                Api api = zzbi.zzb;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                char c = '0';
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - MotionEvent.axisFromString("")), 39 - TextUtils.indexOf((CharSequence) "", '0'), 19 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                Object obj3 = null;
                int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                int i3 = 0;
                Object[] objArr = new Object[1];
                a(new char[]{'\b', 20, 22, 21, 20, 2, 1, 6, 21, 17, 2, 11, 6, 19, '\n', 19, '\t', 2, 17, 23, 1, '\f'}, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 93), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                a(new char[]{16, 19, 6, 7, 17, 16, 24, 16, 20, '\n', 19, '\r', 2, 5, 13902}, (byte) (78 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                long j = -575;
                long j2 = (j * 2862890252889366301L) + (j * (-765633078147407314L));
                long j3 = 576;
                long j4 = -1;
                long j5 = j4 ^ 2862890252889366301L;
                long j6 = j4 ^ (-765633078147407314L);
                long j7 = (j5 | j6) ^ j4;
                long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
                long j8 = j2 + ((j7 | ((j6 | jFreeMemory) ^ j4)) * j3) + ((((j5 | (-765633078147407314L)) ^ j4) | (j4 ^ ((j6 | (jFreeMemory ^ j4)) | 2862890252889366301L))) * j3) + (j3 * j7);
                int i4 = 0;
                while (true) {
                    int i5 = 8;
                    int i6 = 5;
                    if (i4 == 10) {
                        Object[] objArr3 = new Object[1];
                        a(new char[]{15, 7, '\t', 6, 3, 16, '\b', 20, 11, 3, 14, 7, 19, 11, 17, 5}, (byte) (69 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, objArr3);
                        Class<?> cls2 = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        a(new char[]{1, 20, 18, 20, '\n', 4, 19, 14, 20, '\t', 18, 1, 2, 24, 20, 16}, (byte) (Process.getGidForName("") + 78), 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
                        int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                        try {
                            Object[] objArr5 = {2139017372};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 46038), 1134 - View.resolveSizeAndState(0, 0, 0), 19 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                            }
                            Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 361048365, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                int i7 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
                                byte b2 = $$a[7];
                                byte b3 = b2;
                                Object[] objArr7 = new Object[1];
                                c(b2, b3, b3, objArr7);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i7, scrollBarSize, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), ExpandableListView.getPackedPositionGroup(0L) + 1117, (ViewConfiguration.getLongPressTimeout() >> 16) + 17), Boolean.TYPE});
                            }
                            Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                            int i8 = ((int[]) objArr8[1])[0];
                            int i9 = ((int[]) objArr8[3])[0];
                            if (i9 == i8) {
                                break;
                            }
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr8[0];
                            if (strArr != null) {
                                while (i3 < strArr.length) {
                                    arrayList.add(strArr[i3]);
                                    i3++;
                                    int i10 = b + 97;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                                    int i11 = i10 % 2;
                                }
                            }
                            throw new RuntimeException(String.valueOf(i9));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37836), 59 - KeyEvent.getDeadChar(0, 0), 17 - TextUtils.indexOf("", c, 0), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    int i12 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(obj3);
                    long j9 = jLongValue;
                    int i13 = 0;
                    while (true) {
                        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                        b = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = 4 / i6;
                        }
                        int i16 = 0;
                        while (i16 != i5) {
                            i12 = (((((int) (j9 >> i16)) & 255) + (i12 << 6)) + (i12 << 16)) - i12;
                            i16++;
                            i5 = 8;
                        }
                        if (i13 != 0) {
                            break;
                        }
                        i13++;
                        j9 = j8;
                        i5 = 8;
                        i6 = 5;
                    }
                    if (i12 == i2) {
                        break;
                    }
                    jLongValue -= 1024;
                    i4++;
                    c = '0';
                    obj3 = null;
                }
                zzdzVar.zzu(pendingIntent, locationRequest, taskCompletionSource);
            }

            private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                int length;
                char[] cArr2;
                int i3 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i4 = 1770390596;
                Object obj2 = null;
                if (cArr3 != null) {
                    int i5 = $11 + 45;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        length = cArr3.length;
                        cArr2 = new char[length];
                    } else {
                        length = cArr3.length;
                        cArr2 = new char[length];
                    }
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.getMode(0), 2267 - (Process.myTid() >> 22), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34, -1927765101, false, $$e(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                            }
                            cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i6++;
                            i4 = 1770390596;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr2;
                }
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 2267 - (ViewConfiguration.getScrollBarSize() >> 8), 33 - (ViewConfiguration.getTouchSlop() >> 8), -1927765101, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    int i7 = $11 + 85;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        i2 = i + 69;
                        cArr4[i2] = (char) (cArr[i2] * b2);
                    } else {
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b2);
                    }
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            int i8 = $10 + 43;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                            obj = obj2;
                        } else {
                            try {
                                Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b7 = (byte) 0;
                                    byte b8 = (byte) (b7 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Color.red(0) + 3261, KeyEvent.normalizeMetaState(0) + 30, -127612708, false, $$e(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char keyRepeatTimeout = (char) (22878 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 594;
                                        int tapTimeout = 17 - (ViewConfiguration.getTapTimeout() >> 16);
                                        byte b9 = (byte) (-$$c[1]);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, iKeyCodeFromString, tapTimeout, 1570859318, false, $$e((byte) 0, b9, (byte) (b9 - 4)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                    int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i10];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        int i11 = $10 + 47;
                                        $11 = i11 % 128;
                                        int i12 = i11 % 2;
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i13];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i14];
                                    } else {
                                        int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i15];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i16];
                                    }
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                    }
                }
                for (int i17 = 0; i17 < i; i17++) {
                    int i18 = $10 + 67;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0020  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(short r5, short r6, short r7) {
                /*
                    int r6 = r6 + 113
                    int r5 = r5 * 3
                    int r0 = 1 - r5
                    byte[] r1 = com.google.android.gms.internal.identity.zzbs.$$c
                    int r7 = r7 + 4
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r5 = 0 - r5
                    if (r1 != 0) goto L14
                    r4 = r5
                    r3 = r2
                    goto L26
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r5) goto L20
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    return r5
                L20:
                    int r3 = r3 + 1
                    int r7 = r7 + 1
                    r4 = r1[r7]
                L26:
                    int r4 = -r4
                    int r6 = r6 + r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzbs.$$e(short, short, short):java.lang.String");
            }
        }).setMethodKey(2417).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> setMockLocation(final Location location) {
        Preconditions.checkArgument(location != null);
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.location.zzbl
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                Api api = zzbi.zzb;
                ((zzdz) obj).zzA(location, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(2421).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> setMockMode(boolean z) {
        synchronized (zzc) {
            try {
                if (!z) {
                    Object obj = zzd;
                    if (obj != null) {
                        zzd = null;
                        return doUnregisterEventListener(ListenerHolders.createListenerKey(obj, Object.class.getSimpleName()), 2420).continueWith(zzcf.zza, zzbk.zza);
                    }
                } else if (zzd == null) {
                    Object obj2 = new Object();
                    zzd = obj2;
                    return doRegisterEventListener(RegistrationMethods.builder().register(zzcb.zza).unregister(zzcc.zza).withHolder(ListenerHolders.createListenerHolder(obj2, Looper.getMainLooper(), Object.class.getSimpleName())).setMethodKey(2420).build());
                }
                return Tasks.forResult(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzbi(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) zzb, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> removeDeviceOrientationUpdates(DeviceOrientationListener deviceOrientationListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(deviceOrientationListener, "DeviceOrientationListener"), 2440).continueWith(zzcg.zza, zzbo.zza);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Location> getLastLocation(final LastLocationRequest lastLocationRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.location.zzbj
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                Api api = zzbi.zzb;
                ((zzdz) obj).zzq(lastLocationRequest, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(2414).setFeatures(zzo.zzf).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> removeLocationUpdates(LocationCallback locationCallback) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(locationCallback, "LocationCallback"), 2418).continueWith(zzce.zza, zzbw.zza);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return zzb(locationRequest, ListenerHolders.createListenerHolder(locationCallback, looper, "LocationCallback"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestDeviceOrientationUpdates(DeviceOrientationRequest deviceOrientationRequest, Executor executor, DeviceOrientationListener deviceOrientationListener) {
        return zzc(deviceOrientationRequest, ListenerHolders.createListenerHolder(deviceOrientationListener, executor, "DeviceOrientationListener"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> removeLocationUpdates(LocationListener locationListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(locationListener, "LocationListener"), 2418).continueWith(zzch.zza, zzbv.zza);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return zza(locationRequest, ListenerHolders.createListenerHolder(locationListener, looper, "LocationListener"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Location> getCurrentLocation(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken) {
        if (cancellationToken != null) {
            Preconditions.checkArgument(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task<Location> taskDoRead = doRead(TaskApiCall.builder().run(new zzbp(currentLocationRequest, cancellationToken)).setMethodKey(2415).build());
        if (cancellationToken == null) {
            return taskDoRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        taskDoRead.continueWith(new zzbq(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationCallback locationCallback) {
        return zzb(locationRequest, ListenerHolders.createListenerHolder(locationCallback, executor, "LocationCallback"));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
        return zza(locationRequest, ListenerHolders.createListenerHolder(locationListener, executor, "LocationListener"));
    }
}
