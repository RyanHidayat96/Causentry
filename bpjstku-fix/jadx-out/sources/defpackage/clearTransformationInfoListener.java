package defpackage;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public final class clearTransformationInfoListener {
    private static final String d;
    public boolean TuitionPaymentFragmentbindingInflater1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Timer f359a;
    public Date b;
    private long asBinder = 4;
    public AtomicBoolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicBoolean(true);
    public long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("ConnectionAttemptMonitor");
        d = sb.toString();
    }

    public clearTransformationInfoListener() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public final void b() {
        synchronized (this) {
            Timer timer = this.f359a;
            if (timer != null) {
                timer.cancel();
                this.f359a.purge();
                this.f359a = null;
            }
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Date date) {
        synchronized (this) {
            b();
            this.b = date;
            if (date != null) {
                Timer timer = new Timer(d);
                this.f359a = timer;
                try {
                    timer.schedule(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, (byte) 0), this.b);
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        StringBuilder sb = new StringBuilder("Connection attempt is scheduled for ");
                        sb.append(this.b);
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                    }
                } catch (Exception e2) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        StringBuilder sb2 = new StringBuilder("Failed to schedule a connection attempt ... ");
                        sb2.append(e2.toString());
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb2.toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Date TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Date date = new Date(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        long j = this.asBinder - 1;
        this.asBinder = j;
        if (j > 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 60000L;
            return date;
        }
        if (j == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0L;
            return null;
        }
        long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (j2 == 1920000) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 3420000L;
            return date;
        }
        if (j2 == 3420000 || j2 <= 0) {
            return null;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j2 * 2;
        return date;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get()) {
                return true;
            }
            return this.TuitionPaymentFragmentbindingInflater1 || this.f359a != null || (this.asBinder > 0 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < 3420000);
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        synchronized (this) {
            this.TuitionPaymentFragmentbindingInflater1 = false;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(false);
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Connection stop notification");
            }
            b();
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        synchronized (this) {
            this.TuitionPaymentFragmentbindingInflater1 = false;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(false);
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.f359a == null && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 60000L;
            }
            if (this.f359a != null || TuitionPaymentFragmentspecialinlinedviewModeldefault3() != null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Date(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() + ((long) (i * 1000))));
            }
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1(boolean z, boolean z2) {
        synchronized (this) {
            this.TuitionPaymentFragmentbindingInflater1 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(false);
            if (z) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Connection ok notification");
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                this.asBinder = -1L;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0L;
                b();
            } else {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("No connection notification");
                }
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.f359a == null && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 60000L;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                } else if (z2 && this.f359a == null) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends TimerTask {
        private static short[] asBinder;
        private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
        private static final int $$d = 28;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {42, -104, -68, 105, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
        private static final int $$b = 149;
        private static int b = 416643372;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795560;
        private static int TuitionPaymentFragmentbindingInflater1 = -1476523069;
        private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-110, -122, -119, 115, -92, -110, -69, -117, ByteCompanionObject.MIN_VALUE, 116, 119, -63, -106, 75, -48, -127, ByteCompanionObject.MIN_VALUE, -113, -100, -124, -97, -97, 99, -112, 111, 106, -101, 114, -119, 102, -107, 98, 118, -112, 110, -15, -26, -10, -17, -45, -46, 48, -18, -6, -30, -85, 58, 28, -62, -32, -58, -14, -83, 28, -14, -41, -34, 8, -62, -52, -14, -61, -50, -58, -4, -26, -26, -26, -26};

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 2
                int r8 = r8 + 84
                int r7 = r7 * 4
                int r0 = r7 + 53
                int r6 = r6 * 3
                int r6 = 3 - r6
                byte[] r1 = clearTransformationInfoListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$a
                byte[] r0 = new byte[r0]
                int r7 = r7 + 52
                r2 = 0
                if (r1 != 0) goto L19
                r8 = r6
                r3 = r7
                r4 = r2
                goto L32
            L19:
                r3 = r2
            L1a:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
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
                r5 = r8
                r8 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: clearTransformationInfoListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3.c(short, int, short, java.lang.Object[]):void");
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(clearTransformationInfoListener cleartransformationinfolistener, byte b2) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:47:0x021e  */
        /* JADX WARN: Code duplicated, block: B:64:0x02d2  */
        private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            int i4;
            boolean z;
            int i5;
            int i6 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char gidForName = (char) ((-1) - Process.getGidForName(""));
                    int i7 = 2268 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int iBlue = Color.blue(0) + 33;
                    byte length = (byte) $$c.length;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, i7, iBlue, 1387473586, false, $$e((byte) 0, length, (byte) (length - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                boolean z2 = iIntValue == -1;
                if (z2) {
                    byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (bArr != null) {
                        int length2 = bArr.length;
                        byte[] bArr2 = new byte[length2];
                        for (int i8 = 0; i8 < length2; i8++) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 3359 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1054011043, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i9 = $11 + 21;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2266;
                                int iMyPid = 33 - (Process.myPid() >> 22);
                                byte length3 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, i10, iMyPid, 1387473586, false, $$e((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) + 3046761265686732006L)) - ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) * 3046761265686732006L));
                        } else {
                            byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(b)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                int iAxisFromString = 2266 - MotionEvent.axisFromString("");
                                int i11 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                                byte length4 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iAxisFromString, i11, 1387473586, false, $$e((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                        }
                        iIntValue = (byte) i5;
                    } else {
                        iIntValue = (short) (((short) (((long) asBinder[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    int i12 = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L));
                    if (z2) {
                        int i13 = $10 + 27;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                    } else {
                        i4 = 0;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 + i4;
                    Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55903 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2855, 13 - (ViewConfiguration.getTapTimeout() >> 16), -1529949196, false, $$e(b5, b6, (byte) (b6 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (bArr5 != null) {
                        int length5 = bArr5.length;
                        byte[] bArr6 = new byte[length5];
                        for (int i14 = 0; i14 < length5; i14++) {
                            int i15 = $10 + 71;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            bArr6[i14] = (byte) (((long) bArr5[i14]) ^ 3046761265686732006L);
                        }
                        bArr5 = bArr6;
                    }
                    if (bArr5 != null) {
                        int i17 = $10 + 107;
                        $11 = i17 % 128;
                        if (i17 % 2 == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i18 = $11 + 105;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        if (z) {
                            byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = asBinder;
                            int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i21]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() throws Throwable {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 40 - (ViewConfiguration.getJumpTapTimeout() >> 16), 18 - Process.getGidForName(""), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object[] objArr = new Object[1];
            a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 726881989, (-40) - ExpandableListView.getPackedPositionType(0L), (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 109), (byte) TextUtils.indexOf("", ""), View.resolveSizeAndState(0, 0, 0) + 1804065334, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(ExpandableListView.getPackedPositionGroup(0L) - 726881984, (-48) - ((byte) KeyEvent.getModifierMetaStateMask()), (short) (View.MeasureSpec.makeMeasureSpec(0, 0) + 127), (byte) Color.blue(0), 1804065354 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j = -1;
            long j2 = j ^ 4446566617152392462L;
            long jIdentityHashCode = System.identityHashCode(this);
            long j3 = jIdentityHashCode ^ j;
            long j4 = (((long) 302) * 4446566617152392462L) + (((long) TypedValues.MotionType.TYPE_EASING) * (-2349309442410433475L)) + (((long) (-602)) * (((j2 | j3) ^ j) | (-2349309442410433475L))) + (((long) (-301)) * (((j2 | (j ^ (-2349309442410433475L))) ^ j) | ((j2 | jIdentityHashCode) ^ j) | ((j3 | (-2828184861033153L)) ^ j))) + (((long) 301) * (j ^ (j3 | (-2349309442410433475L))));
            int i2 = 0;
            while (true) {
                int i3 = 8;
                if (i2 != 10) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37836), 59 - Color.red(0), 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                    int i5 = 0;
                    long j5 = jLongValue;
                    while (true) {
                        int i6 = 0;
                        while (i6 != i3) {
                            i4 = (((((int) (j5 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                            i6++;
                            i3 = 8;
                        }
                        if (i5 != 0) {
                            break;
                        }
                        i5++;
                        j5 = j4;
                        i3 = 8;
                    }
                    if (i4 == i) {
                        break;
                    }
                    jLongValue -= 1024;
                    i2++;
                } else {
                    Object[] objArr3 = new Object[1];
                    a((ViewConfiguration.getTapTimeout() >> 16) - 726881979, (-46) - View.MeasureSpec.makeMeasureSpec(0, 0), (short) ((-15) - Color.red(0)), (byte) ((-1) - TextUtils.lastIndexOf("", '0')), Color.alpha(0) + 1804065369, objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    a((-726881981) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) - 46, (short) ((ViewConfiguration.getTouchSlop() >> 8) - 31), (byte) View.MeasureSpec.getMode(0), 55960 - AndroidCharacter.getMirror('0'), objArr4);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr5 = {-1496127952};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 46039), TextUtils.indexOf((CharSequence) "", '0', 0) + 1135, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 283866734, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr5), false};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
                            byte b2 = $$a[7];
                            byte b3 = b2;
                            Object[] objArr7 = new Object[1];
                            c(b2, b3, b3, objArr7);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i7, scrollBarFadeDuration, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0') + 45994), TextUtils.indexOf("", "", 0, 0) + 1117, 17 - Color.green(0)), Boolean.TYPE});
                        }
                        Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
                        int i8 = ((int[]) objArr8[1])[0];
                        int i9 = ((int[]) objArr8[3])[0];
                        if (i9 == i8) {
                            break;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[0];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
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
            }
            synchronized (clearTransformationInfoListener.this) {
                clearTransformationInfoListener.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(true);
                clearTransformationInfoListener cleartransformationinfolistener = clearTransformationInfoListener.this;
                cleartransformationinfolistener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cleartransformationinfolistener.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        }

        private static String $$e(short s, byte b2, byte b3) {
            int i = b3 * 4;
            byte[] bArr = $$c;
            int i2 = 121 - b2;
            int i3 = (s * 4) + 4;
            byte[] bArr2 = new byte[i + 1];
            int i4 = -1;
            if (bArr == null) {
                i2 = i3 + (-i);
                i3++;
            }
            while (true) {
                i4++;
                bArr2[i4] = (byte) i2;
                if (i4 == i) {
                    return new String(bArr2, 0);
                }
                int i5 = i2;
                int i6 = i3 + 1;
                i2 = i5 + (-bArr[i3]);
                i3 = i6;
            }
        }
    }
}
