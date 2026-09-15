package com.dynatrace.android.agent.conf;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.UseCase;
import defpackage.addStateChangeCallback;
import defpackage.deInitSession;
import defpackage.getAppTargetRotation;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class ServerConfiguration {
    private static final Status INotificationSideChannelStub = Status.OK;
    public final boolean INotificationSideChannel;
    public final int TuitionPaymentFragmentbindingInflater1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f762a;
    public final boolean asBinder;
    public final UseCase asInterface;
    public final int b;
    public final Status cancel;
    public final long cancelAll;
    public final int d;
    public final addStateChangeCallback g;
    public final int notify;
    public final getAppTargetRotation onTransact;

    public enum Status {
        OK,
        ERROR
    }

    public /* synthetic */ ServerConfiguration(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, byte b) {
        this(tuitionPaymentFragmentbindingInflater1);
    }

    private ServerConfiguration(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentbindingInflater1.b;
        this.asBinder = tuitionPaymentFragmentbindingInflater1.asBinder;
        this.onTransact = tuitionPaymentFragmentbindingInflater1.cancel;
        this.f762a = tuitionPaymentFragmentbindingInflater1.d;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1;
        this.asInterface = tuitionPaymentFragmentbindingInflater1.g;
        this.b = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.notify = tuitionPaymentFragmentbindingInflater1.INotificationSideChannel;
        this.g = tuitionPaymentFragmentbindingInflater1.f763a;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.d = tuitionPaymentFragmentbindingInflater1.asInterface;
        this.INotificationSideChannel = tuitionPaymentFragmentbindingInflater1.cancelAll;
        this.cancelAll = tuitionPaymentFragmentbindingInflater1.onTransact;
        this.cancel = tuitionPaymentFragmentbindingInflater1.notify;
    }

    public static TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new TuitionPaymentFragmentbindingInflater1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerConfiguration serverConfiguration = (ServerConfiguration) obj;
        return this.TuitionPaymentFragmentbindingInflater1 == serverConfiguration.TuitionPaymentFragmentbindingInflater1 && this.asBinder == serverConfiguration.asBinder && this.onTransact.equals(serverConfiguration.onTransact) && this.f762a == serverConfiguration.f762a && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.asInterface.equals(serverConfiguration.asInterface) && this.b == serverConfiguration.b && this.notify == serverConfiguration.notify && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && this.g.equals(serverConfiguration.g) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.d == serverConfiguration.d && this.INotificationSideChannel == serverConfiguration.INotificationSideChannel && this.cancelAll == serverConfiguration.cancelAll && this.cancel == serverConfiguration.cancel;
    }

    public final int hashCode() {
        int i = this.TuitionPaymentFragmentbindingInflater1;
        boolean z = this.asBinder;
        int iHashCode = this.onTransact.hashCode();
        int i2 = this.f762a;
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode2 = this.asInterface.hashCode();
        int i4 = this.b;
        int i5 = this.notify;
        boolean z2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode3 = this.g.hashCode();
        int i6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i7 = this.d;
        boolean z3 = this.INotificationSideChannel;
        int iHashCode4 = this.cancel.hashCode();
        long j = this.cancelAll;
        return (((((((((((((((((((((((((((i * 31) + (z ? 1 : 0)) * 31) + iHashCode) * 31) + i2) * 31) + i3) * 31) + iHashCode2) * 31) + i4) * 31) + i5) * 31) + (z2 ? 1 : 0)) * 31) + iHashCode3) * 31) + i6) * 31) + i7) * 31) + (z3 ? 1 : 0)) * 31) + iHashCode4) * 31) + ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerConfiguration{maxBeaconSizeKb=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", selfmonitoring=");
        sb.append(this.asBinder);
        sb.append(", sessionSplitConfiguration=");
        sb.append(this.onTransact);
        sb.append(", sendIntervalSec=");
        sb.append(this.f762a);
        sb.append(", maxCachedCrashesCount=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", rageTapConfiguration=");
        sb.append(this.asInterface);
        sb.append(", capture=");
        sb.append(this.b);
        sb.append(", trafficControlPercentage=");
        sb.append(this.notify);
        sb.append(", bp4Enabled=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", replayConfiguration=");
        sb.append(this.g);
        sb.append(", multiplicity=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", serverId=");
        sb.append(this.d);
        sb.append(", switchServer=");
        sb.append(this.INotificationSideChannel);
        sb.append(", status=");
        sb.append(this.cancel);
        sb.append(", timestamp=");
        sb.append(this.cancelAll);
        sb.append('}');
        return sb.toString();
    }

    public static class TuitionPaymentFragmentbindingInflater1 {
        public int INotificationSideChannel;
        public int TuitionPaymentFragmentbindingInflater1;
        public int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public addStateChangeCallback f763a;
        public boolean asBinder;
        public int asInterface;
        public int b;
        public getAppTargetRotation cancel;
        boolean cancelAll;
        public int d;
        public UseCase g;
        public Status notify;
        public long onTransact;
        private static final byte[] $$c = {ByteCompanionObject.MAX_VALUE, 43, -39, -37};
        private static final int $$f = 17;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {74, 60, 122, -26, -13, 1, 62, -70, 1, -5, 19, -18, 12, -17, 4, 65, -66, 3, 2, -13, -1, 3, 65, -60, -6, -7, 14, -14, 3, 12, -12, Base64.padSymbol, -59, -13, -1, 3, 65, -27, -45, -1, 3, 62, -72, 36, -34, 1, 12, 3, -13, 72, -35, -36, -16, 18, 0, 23, -26, -10, 6, -14, 11, 20, -29, -7, 2, 14, -3};
        private static final int $$e = 133;
        private static final byte[] $$a = {83, -90, 68, -23, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 6;
        private static int INotificationSideChannelDefault = 0;
        private static int getInterfaceDescriptor = 1;
        private static char[] RemoteActionCompatParcelizer = {60051, 60053, 60047, 60061, 60054, 60034, 60045, 59747, 60046, 60052, 60117, 60043, 60079, 59748, 60050, 60048, 59749, 60090, 60040, 60060, 59744, 59745, 60058, 60059, 60072, 60056, 60083, 60049, 59746, 60055, 60088, 60063, 60057, 60073, 60041, 60062};
        private static char INotificationSideChannelStub = 57191;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.dynatrace.android.agent.conf.ServerConfiguration.TuitionPaymentFragmentbindingInflater1.$$a
                int r8 = r8 * 15
                int r1 = r8 + 38
                int r6 = r6 * 2
                int r6 = r6 + 84
                int r7 = r7 + 4
                byte[] r1 = new byte[r1]
                int r8 = r8 + 37
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2d
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2d:
                int r7 = r7 + r6
                int r6 = r7 + (-11)
                int r7 = r3 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.conf.ServerConfiguration.TuitionPaymentFragmentbindingInflater1.c(short, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 63
                int r8 = r8 + 4
                byte[] r0 = com.dynatrace.android.agent.conf.ServerConfiguration.TuitionPaymentFragmentbindingInflater1.$$d
                int r7 = r7 + 98
                int r6 = r6 * 63
                int r1 = 64 - r6
                byte[] r1 = new byte[r1]
                int r6 = 63 - r6
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2f
            L16:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L1a:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2f:
                int r7 = -r7
                int r8 = r8 + r7
                int r8 = r8 + (-1)
                int r7 = r3 + 1
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.conf.ServerConfiguration.TuitionPaymentFragmentbindingInflater1.f(int, short, short, java.lang.Object[]):void");
        }

        private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = RemoteActionCompatParcelizer;
            long j = 0;
            int i5 = 1770390596;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = $10 + 67;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $10 + 89;
                    $11 = i9 % 128;
                    if (i9 % i3 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                int iIndexOf = TextUtils.indexOf("", "") + 2267;
                                int i10 = 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, iIndexOf, i10, -1927765101, false, $$g(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2267, ExpandableListView.getPackedPositionChild(0L) + 34, -1927765101, false, $$g(b4, b5, (byte) (b5 + 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i8++;
                    }
                    i3 = 2;
                    j = 0;
                    i5 = 1770390596;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(INotificationSideChannelStub)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 2267 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33, -1927765101, false, $$g(b6, b7, (byte) (b7 + 3)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i11 = $10 + 73;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i13 = $10 + 61;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    } else {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 49268), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3261, 30 - TextUtils.indexOf("", "", 0, 0), -127612708, false, $$g(b8, b9, (byte) (b9 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (22878 - (ViewConfiguration.getEdgeSlop() >> 16)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 593, TextUtils.indexOf((CharSequence) "", '0') + 18, 1570859318, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i16 = $11 + 103;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                        } else {
                            int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i20];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                }
            }
            for (int i22 = 0; i22 < i; i22++) {
                cArr4[i22] = (char) (cArr4[i22] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        public TuitionPaymentFragmentbindingInflater1() {
            this.b = 150;
            this.asBinder = true;
            this.cancel = getAppTargetRotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.d = 120;
            this.TuitionPaymentFragmentbindingInflater1 = 0;
            this.g = UseCase.TuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            this.INotificationSideChannel = 100;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
            this.f763a = addStateChangeCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            this.asInterface = 1;
            this.cancelAll = false;
            this.notify = ServerConfiguration.INotificationSideChannelStub;
            this.onTransact = 0L;
        }

        public TuitionPaymentFragmentbindingInflater1(ServerConfiguration serverConfiguration, boolean z) {
            this.b = serverConfiguration.TuitionPaymentFragmentbindingInflater1;
            this.asBinder = serverConfiguration.asBinder;
            this.cancel = serverConfiguration.onTransact;
            this.d = serverConfiguration.f762a;
            this.TuitionPaymentFragmentbindingInflater1 = serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.g = serverConfiguration.asInterface;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = serverConfiguration.b;
            this.INotificationSideChannel = serverConfiguration.notify;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.f763a = new addStateChangeCallback(new addStateChangeCallback.b(serverConfiguration.g), (byte) 0);
            this.onTransact = serverConfiguration.cancelAll;
            if (!z) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                this.asInterface = serverConfiguration.d;
                this.cancelAll = serverConfiguration.INotificationSideChannel;
                this.notify = serverConfiguration.cancel;
                int i = INotificationSideChannelDefault + 31;
                getInterfaceDescriptor = i % 128;
                int i2 = i % 2;
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            this.asInterface = 1;
            this.cancelAll = false;
            this.notify = ServerConfiguration.INotificationSideChannelStub;
            int i3 = INotificationSideChannelDefault + 7;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        }

        public final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 25;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 876;
                int trimmedLength = 10 - TextUtils.getTrimmedLength("");
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                c(b, b2, b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, packedPositionGroup, trimmedLength, -1650998592, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new char[]{19, 4, ' ', '#', '\b', 15, Typography.quote, 7, 6, 21, 6, 28, 0, 23, 5, ' ', 0, Typography.quote, 27, 11, 27, '\r'}, (byte) (View.resolveSize(0, 0) + 30), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new char[]{5, '#', 23, '\n', 23, 30, ' ', Typography.quote, Typography.quote, 23, 26, 5, 16, 2, 13886}, (byte) (View.combineMeasuredStates(0, 0) + 63), 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 877;
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                byte[] bArr = $$a;
                byte b3 = bArr[7];
                Object[] objArr5 = new Object[1];
                c(b3, (byte) (b3 | 37), bArr[28], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, iLastIndexOf, keyRepeatTimeout, 2012020043, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i4 = getInterfaceDescriptor + 51;
                INotificationSideChannelDefault = i4 % 128;
                int i5 = i4 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char defaultSize = (char) View.getDefaultSize(0, 0);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 876;
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 11;
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[7];
                    Object[] objArr6 = new Object[1];
                    c(b4, (byte) (b4 | 89), bArr2[28], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, iKeyCodeFromString, iLastIndexOf2, 2012931276, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = ~iUptimeMillis;
                int i7 = (((((~(47454199 | i6)) | (~(iUptimeMillis | 87764428))) * 959) + 865956559) + (((~(iUptimeMillis | 47454199)) | (~(i6 | 87764428))) * 959)) - 63850052;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e(new char[]{19, 4, ' ', '#', '\b', 15, Typography.quote, 7, 23, '\n', 6, 11, '\r', 29, '\b', 20, '\b', '\f', 3, 0, 18, 6, '#', 30, 19, Typography.quote}, (byte) (MotionEvent.axisFromString("") + 57), (ViewConfiguration.getTouchSlop() >> 8) + 26, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new char[]{26, 7, 13926, 13926, 31, 5, 5, 14, 13928, 13928, 26, 17, 28, 19, '\b', 20, 7, 3}, (byte) (126 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 18 - KeyEvent.normalizeMetaState(0), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = (((applicationContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext).getBaseContext() != null) ? applicationContext.getApplicationContext() : null;
                }
                Object[] objArr10 = new Object[1];
                e(new char[]{28, 21, '\n', 18, 11, 28, 19, 4, 22, 7, 29, 0, 20, 0, Typography.quote, 5}, (byte) (40 - TextUtils.getCapsMode("", 0, 0)), 16 - (Process.myPid() >> 22), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e(new char[]{'\r', ' ', 31, 5, '\b', 20, 3, 0, 28, 20, 24, 6, '!', 6, ' ', 30}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 60), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i10 = INotificationSideChannelDefault + 3;
                getInterfaceDescriptor = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -63850052};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[54];
                    Object[] objArr13 = new Object[1];
                    f(b5, bArr3[5], b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr3[5];
                    Object[] objArr14 = new Object[1];
                    f(b6, bArr3[54], b6, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        int i12 = INotificationSideChannelDefault + 23;
                        getInterfaceDescriptor = i12 % 128;
                        int i13 = i12 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
                            int iResolveSize = View.resolveSize(0, 0) + 10;
                            byte[] bArr4 = $$a;
                            byte b7 = bArr4[7];
                            Object[] objArr16 = new Object[1];
                            c(b7, (byte) (b7 | 89), bArr4[28], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(doubleTapTimeout, scrollBarSize, iResolveSize, 2012931276, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            e(new char[]{19, 4, ' ', '#', '\b', 15, Typography.quote, 7, 6, 21, 6, 28, 0, 23, 5, ' ', 0, Typography.quote, 27, 11, 27, '\r'}, (byte) (30 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), TextUtils.indexOf("", "") + 22, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            e(new char[]{5, '#', 23, '\n', 23, 30, ' ', Typography.quote, Typography.quote, 23, 26, 5, 16, 2, 13886}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 64), 15 - Color.green(0), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "");
                                int iGreen = 876 - Color.green(0);
                                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                                byte[] bArr5 = $$a;
                                byte b8 = bArr5[7];
                                Object[] objArr19 = new Object[1];
                                c(b8, (byte) (b8 | 37), bArr5[28], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iGreen, windowTouchSlop, 2012020043, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                int capsMode = 876 - TextUtils.getCapsMode("", 0, 0);
                                int i14 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                byte b9 = $$a[7];
                                byte b10 = b9;
                                Object[] objArr20 = new Object[1];
                                c(b9, b10, b10, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, capsMode, i14, -1650998592, false, (String) objArr20[0], null);
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
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[0])[0];
            if (i16 == i15) {
                int i17 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i18 = i17 + (-1660481460) + (((~((-44053521) | iIdentityHashCode)) | 84363749) * (-756)) + (((~iIdentityHashCode) | (-44053521)) * 756);
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                ((int[]) objArr21[1])[0] = i20 ^ (i20 << 5);
                int i21 = INotificationSideChannelDefault + 111;
                getInterfaceDescriptor = i21 % 128;
                int i22 = i21 % 2;
            } else {
                int[] iArr = new int[i16];
                int i23 = i16 - 1;
                iArr[i23] = 1;
                Toast.makeText((Context) null, iArr[((i16 * i23) % 2) - 1], 1).show();
                int i24 = ((int[]) objArr[1])[0];
                Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i25 = ~iIdentityHashCode2;
                int i26 = i24 + (-219778240) + (((~(1006526637 | i25)) | 1046836866) * 226) + (((~(i25 | 1073706671)) | (~((-1046836867) | iIdentityHashCode2)) | 979656832) * (-113)) + ((~(iIdentityHashCode2 | 1006526637)) * 113);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr22[1])[0] = i28 ^ (i28 << 5);
            }
            this.cancelAll = z;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, short r7, int r8) {
            /*
                int r6 = r6 * 3
                int r6 = 4 - r6
                int r8 = 116 - r8
                byte[] r0 = com.dynatrace.android.agent.conf.ServerConfiguration.TuitionPaymentFragmentbindingInflater1.$$c
                int r7 = r7 * 4
                int r7 = r7 + 1
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2a:
                int r6 = -r6
                int r6 = r6 + r3
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.conf.ServerConfiguration.TuitionPaymentFragmentbindingInflater1.$$g(byte, short, int):java.lang.String");
        }
    }
}
