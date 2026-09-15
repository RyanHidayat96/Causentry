package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.firebase.encoders.annotations.Encodable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class getCompleteFuture extends RgbaImageProxy2 {
    private final String TuitionPaymentFragmentbindingInflater1;
    private final Integer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final QosTier TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final ClientInfo TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final long asBinder;
    private final List<TakePictureManager> b;
    private final long g;

    /* synthetic */ getCompleteFuture(long j, long j2, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier, byte b) {
        this(j, j2, clientInfo, num, str, list, qosTier);
    }

    private getCompleteFuture(long j, long j2, ClientInfo clientInfo, Integer num, String str, List<TakePictureManager> list, QosTier qosTier) {
        this.asBinder = j;
        this.g = j2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = clientInfo;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = num;
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.b = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = qosTier;
    }

    @Override // defpackage.RgbaImageProxy2
    public final long d() {
        return this.asBinder;
    }

    @Override // defpackage.RgbaImageProxy2
    public final long asInterface() {
        return this.g;
    }

    @Override // defpackage.RgbaImageProxy2
    public final ClientInfo TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.RgbaImageProxy2
    public final Integer TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.RgbaImageProxy2
    public final String b() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.RgbaImageProxy2
    @Encodable.Field(name = "logEvent")
    public final List<TakePictureManager> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.b;
    }

    @Override // defpackage.RgbaImageProxy2
    public final QosTier TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogRequest{requestTimeMs=");
        sb.append(this.asBinder);
        sb.append(", requestUptimeMs=");
        sb.append(this.g);
        sb.append(", clientInfo=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", logSource=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", logSourceName=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", logEvents=");
        sb.append(this.b);
        sb.append(", qosTier=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RgbaImageProxy2)) {
            return false;
        }
        RgbaImageProxy2 rgbaImageProxy2 = (RgbaImageProxy2) obj;
        if (this.asBinder != rgbaImageProxy2.d() || this.g != rgbaImageProxy2.asInterface()) {
            return false;
        }
        ClientInfo clientInfo = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (clientInfo == null) {
            if (rgbaImageProxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault2() != null) {
                return false;
            }
        } else if (!clientInfo.equals(rgbaImageProxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault2())) {
            return false;
        }
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (num == null) {
            if (rgbaImageProxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != null) {
                return false;
            }
        } else if (!num.equals(rgbaImageProxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
            return false;
        }
        String str = this.TuitionPaymentFragmentbindingInflater1;
        if (str == null) {
            if (rgbaImageProxy2.b() != null) {
                return false;
            }
        } else if (!str.equals(rgbaImageProxy2.b())) {
            return false;
        }
        List<TakePictureManager> list = this.b;
        if (list == null) {
            if (rgbaImageProxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null) {
                return false;
            }
        } else if (!list.equals(rgbaImageProxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault1())) {
            return false;
        }
        QosTier qosTier = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (qosTier == null) {
            if (rgbaImageProxy2.TuitionPaymentFragmentbindingInflater1() != null) {
                return false;
            }
        } else if (!qosTier.equals(rgbaImageProxy2.TuitionPaymentFragmentbindingInflater1())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.asBinder;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.g;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        ClientInfo clientInfo = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode = clientInfo == null ? 0 : clientInfo.hashCode();
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List<TakePictureManager> list = this.b;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        QosTier qosTier = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return ((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1 {
        private QosTier TuitionPaymentFragmentbindingInflater1;
        private Integer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private ClientInfo TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f923a;
        private List<TakePictureManager> b;
        private Long d;
        private static final byte[] $$c = {118, 35, -100, -35};
        private static final int $$f = 165;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {118, 35, -100, -35, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 55, -2, 20, -18, -50, 67, -14, 25, -11, -7, 10, 7, -69, 64, 3, -10, 2, 8, -61, 69, -12, 13, 5, -15, 15, 2, -69, 28, 38, -9, 6, 14, -12, -4, 18, -19, 12, -39, 34, 16, -18, 9, 4, -40, 51, -1, 2, -4, -1, -7, 14, -34, 20, 9, -4, -1, 18, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, -17, 8, 6, -9, 6, 6, -6, -29, 38, -7, 7, -10, 20, -14, 14, -64};
        private static final int $$e = 141;
        private static final byte[] $$a = {101, 89, 94, -73, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 30;
        private static int asInterface = 0;
        private static int g = 1;
        private static int[] asBinder = {1804618576, -106059491, 40062018, 1334583982, -614118754, 1891949671, -321338909, 1458059665, -668274530, -1199630863, -1752493593, -1346600780, 1122184786, 1206674324, -1379784574, 352068140, 1333220344, 302714299};

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 4
                int r8 = r8 * 14
                int r8 = 98 - r8
                int r0 = 53 - r6
                byte[] r1 = getCompleteFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                byte[] r0 = new byte[r0]
                int r6 = 52 - r6
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r6
                r8 = r7
                r4 = r2
                goto L2c
            L15:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L19:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L28:
                int r8 = r8 + 1
                r3 = r1[r8]
            L2c:
                int r7 = r7 + r3
                int r7 = r7 + (-10)
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: getCompleteFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.c(byte, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(byte r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 31
                int r9 = r9 + 38
                byte[] r0 = getCompleteFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$d
                int r8 = r8 * 15
                int r8 = r8 + 84
                int r7 = r7 * 68
                int r7 = 72 - r7
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2d
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L2d:
                int r3 = r3 + r7
                int r7 = r3 + (-1)
                int r8 = r8 + 1
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: getCompleteFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.f(byte, byte, short, java.lang.Object[]):void");
        }

        @Override // RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1
        public final RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
            int i = 2 % 2;
            int i2 = asInterface + 47;
            g = i2 % 128;
            int i3 = i2 % 2;
            this.f923a = Long.valueOf(j);
            int i4 = g + 27;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int length2;
            int[] iArr3;
            int i2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr4 = asBinder;
            int i4 = -1870535734;
            int i5 = 1;
            int i6 = 0;
            if (iArr4 != null) {
                int i7 = $10 + 111;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    length2 = iArr4.length;
                    iArr3 = new int[length2];
                    i2 = 1;
                } else {
                    length2 = iArr4.length;
                    iArr3 = new int[length2];
                    i2 = 0;
                }
                while (i2 < length2) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr4[i2])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char size = (char) View.MeasureSpec.getSize(0);
                            int iBlue = Color.blue(0) + 3291;
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 31;
                            byte b = (byte) ($$f & 3);
                            byte b2 = (byte) (b - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, iBlue, fadingEdgeLength, 1948206109, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        iArr3[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i2++;
                        i4 = -1870535734;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i8 = $10 + 65;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                iArr4 = iArr3;
            }
            int length3 = iArr4.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = asBinder;
            if (iArr6 != null) {
                int i10 = $10 + 69;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                }
                int i11 = 0;
                while (i11 < length) {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr6[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(i6, i6);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 3291;
                        int pressedStateDuration = 31 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte b3 = (byte) ($$f & 3);
                        byte b4 = (byte) (b3 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, maxKeyCode, pressedStateDuration, 1948206109, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr2[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i11++;
                    i5 = 1;
                    i6 = 0;
                }
                iArr6 = iArr2;
            }
            int i12 = i6;
            System.arraycopy(iArr6, i12, iArr5, i12, length3);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[i12] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i13 = 17;
                for (int i14 = 1; i13 > i14; i14 = 1) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i13];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 2558 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 683220507, false, $$g(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i13--;
                }
                int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr5 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - Color.blue(0)), 348 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.combineMeasuredStates(0, 0) + 25, -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                i12 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        @Override // RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1
        public final RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(long j) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (31532 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
                int trimmedLength = 28 - TextUtils.getTrimmedLength("");
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c((byte) 52, bArr[7], bArr[80], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, scrollBarFadeDuration, trimmedLength, -1048449946, false, (String) objArr2[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new int[]{697717760, -1908308589, 1020614840, 148356802, 1830078124, -747827456, 1652348128, 1958250049, -2099626543, -742451278, 2066396637, -826488214, -1437360466, 317532736}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new int[]{957396690, 242714001, 164443855, 815581247, -1572347110, -245922271, -1833016453, -1396504305, -602194598, 1215814309}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char scrollBarFadeDuration2 = (char) (31533 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int iMyPid = (Process.myPid() >> 22) + 921;
                int iRed = 28 - Color.red(0);
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                c(bArr2[80], bArr2[7], bArr2[37], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration2, iMyPid, iRed, -778300370, false, (String) objArr5[0], null);
            }
            if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i2 = asInterface + 81;
                g = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
                    int scrollDefaultDelay = 921 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iMyPid2 = (Process.myPid() >> 22) + 28;
                    byte[] bArr3 = $$a;
                    Object[] objArr6 = new Object[1];
                    c(bArr3[33], (byte) 51, bArr3[37], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, scrollDefaultDelay, iMyPid2, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i4 = ~iIdentityHashCode;
                int i5 = ((((-1424575593) + (((~(iIdentityHashCode | 721075494)) | ((~((-717394213) | i4)) | (-1056685432))) * (-68))) + ((~((-335609938) | i4)) * (-68))) + (((~((-721075495) | i4)) | (-1053004150)) * 68)) - 1160238188;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e(new int[]{-938390838, -469609731, 182270718, 64152975, 787746528, 1474014752, -323431693, -692759045, -795865903, 55427578, 570817226, 1816800808, -484675029, -1260667882, 2046830506, -1062265818}, View.MeasureSpec.makeMeasureSpec(0, 0) + 26, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new int[]{-1623567200, -739067961, -1339533274, 1808879170, 748245364, -485095543, -270778649, -1630612714, -1388315607, -1627635441, 1884201138, -1973639539}, 18 - (ViewConfiguration.getTouchSlop() >> 8), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i8 = asInterface + 83;
                    g = i8 % 128;
                    int i9 = i8 % 2;
                    applicationContext = (((applicationContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext).getBaseContext() != null) ? applicationContext.getApplicationContext() : null;
                }
                Object[] objArr10 = new Object[1];
                e(new int[]{-1617763250, -1461264708, -269779604, 209452235, 139430742, 1338298290, 896978202, -233302691, -444024774, 1713280902}, 16 - KeyEvent.normalizeMetaState(0), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e(new int[]{524004596, 155666131, 1048452111, 363760620, -832704558, -1721654787, 1111117736, -713356386, -226552085, -2132529083}, 15 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1160238188};
                    byte[] bArr4 = $$d;
                    byte b = (byte) (-bArr4[5]);
                    byte b2 = b;
                    Object[] objArr13 = new Object[1];
                    f(b, b2, b2, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b3 = bArr4[77];
                    byte b4 = b3;
                    Object[] objArr14 = new Object[1];
                    f(b3, b4, b4, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveOpacity = (char) (31533 - Drawable.resolveOpacity(0, 0));
                        int tapTimeout = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                        int iCombineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
                        byte[] bArr5 = $$a;
                        Object[] objArr15 = new Object[1];
                        c(bArr5[33], (byte) 51, bArr5[37], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, tapTimeout, iCombineMeasuredStates, -1142834547, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new int[]{697717760, -1908308589, 1020614840, 148356802, 1830078124, -747827456, 1652348128, 1958250049, -2099626543, -742451278, 2066396637, -826488214, -1437360466, 317532736}, View.combineMeasuredStates(0, 0) + 22, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new int[]{957396690, 242714001, 164443855, 815581247, -1572347110, -245922271, -1833016453, -1396504305, -602194598, 1215814309}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 15, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cMakeMeasureSpec = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                            int i10 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28;
                            byte[] bArr6 = $$a;
                            Object[] objArr18 = new Object[1];
                            c(bArr6[80], bArr6[7], bArr6[37], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, i10, maximumDrawingCacheSize, -778300370, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31534);
                            int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
                            byte[] bArr7 = $$a;
                            Object[] objArr19 = new Object[1];
                            c((byte) 52, bArr7[7], bArr7[80], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, iIndexOf, iKeyCodeFromString, -1048449946, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
            int i11 = ((int[]) objArr[1])[0];
            int i12 = ((int[]) objArr[3])[0];
            if (i12 != i11) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    for (String str : strArr) {
                        int i13 = g + 69;
                        asInterface = i13 % 128;
                        int i14 = i13 % 2;
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i12));
            }
            int i15 = g + 53;
            asInterface = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyTid = Process.myTid();
            int i18 = i17 + (-1099253475) + (((~((~iMyTid) | (-69796866))) | (~(1459354971 | iMyTid))) * (-302)) + ((~((-69796866) | iMyTid)) * (-604)) + (((~(iMyTid | 1389558106)) | 1074833434) * 302);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr20[0])[0] = i20 ^ (i20 << 5);
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1
        public final RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClientInfo clientInfo) {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 119;
            g = i3 % 128;
            int i4 = i3 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = clientInfo;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i2 + 37;
            g = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1
        public final RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer num) {
            int i = 2 % 2;
            int i2 = g + 93;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = num;
            if (i4 != 0) {
                int i5 = 19 / 0;
            }
            int i6 = i3 + 33;
            g = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1
        public final RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(String str) {
            int i = 2 % 2;
            int i2 = asInterface + 5;
            int i3 = i2 % 128;
            g = i3;
            int i4 = i2 % 2;
            Object obj = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 99;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        @Override // RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1
        public final RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<TakePictureManager> list) {
            int i = 2 % 2;
            int i2 = g + 87;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.b = list;
            if (i3 != 0) {
                int i4 = 78 / 0;
            }
            return this;
        }

        @Override // RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1
        public final RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1 b(QosTier qosTier) {
            int i = 2 % 2;
            int i2 = asInterface + 17;
            int i3 = i2 % 128;
            g = i3;
            int i4 = i2 % 2;
            this.TuitionPaymentFragmentbindingInflater1 = qosTier;
            int i5 = i3 + 7;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        @Override // RgbaImageProxy2.TuitionPaymentFragmentbindingInflater1
        public final RgbaImageProxy2 TuitionPaymentFragmentbindingInflater1() {
            String string;
            int i = 2 % 2;
            int i2 = asInterface + 61;
            int i3 = i2 % 128;
            g = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.f923a != null) {
                string = "";
            } else {
                int i4 = i3 + 109;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                string = " requestTimeMs";
            }
            if (this.d == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" requestUptimeMs");
                string = sb.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new getCompleteFuture(this.f923a.longValue(), this.d.longValue(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this.TuitionPaymentFragmentbindingInflater1, (byte) 0);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, int r7, int r8) {
            /*
                int r6 = r6 * 56
                int r6 = 122 - r6
                byte[] r0 = getCompleteFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                int r7 = r7 * 4
                int r7 = r7 + 4
                int r8 = r8 * 4
                int r1 = 1 - r8
                byte[] r1 = new byte[r1]
                r2 = 0
                int r8 = 0 - r8
                if (r0 != 0) goto L19
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2c
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L27:
                r3 = r0[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L2c:
                int r7 = -r7
                int r3 = r3 + 1
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: getCompleteFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$g(int, int, int):java.lang.String");
        }
    }
}
