package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"LLayoutSettings;", "", "<init>", "()V", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "LLayoutSettings$b;", "LLayoutSettings$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LLayoutSettings$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LLayoutSettings$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LLayoutSettings$TuitionPaymentFragmentbindingInflater1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class LayoutSettings {
    private LayoutSettings() {
    }

    public /* synthetic */ LayoutSettings(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u000f\tB)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0010\u0011"}, d2 = {"LLayoutSettings$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LLayoutSettings;", "", "p0", "", "", "p1", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LLayoutSettings$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LLayoutSettings$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentbindingInflater1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends LayoutSettings {
        private static short[] asInterface;

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$c = {14, 70, 6, -35};
        private static final int $$f = 180;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {49, 84, -120, 101, 34, 13, 3, 4, 23, -20, 30, 20, -3, 6, 13, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$e = 246;
        private static final byte[] $$a = {91, -9, 99, 11, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 26;
        private static int asBinder = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f162a = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 558371888;
        private static int b = -1934795529;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 708901404;
        private static byte[] d = {20, -24, 31, 53, -54, 20, -19, 29, -26, 58, 57, -89, 24, 93, -42, -25, -26, -31, 18, -22, 17, 77, -79, 64, -67, -66, 73, -90, 91, 74, 71, -74, -70, 64, -78, -74, 73, 70, -65, -95, 110, -80, -66, 70, -72, 64, -92, -105, -90, 11, -75, -70, -122, ByteCompanionObject.MAX_VALUE, 78, 79, 72, -69, 67, -72, -115, 116, -121, 97, -116, -120, -113, -114, 114, 93, -65, 116, 123, -127, 114, -113, 96, 110, -105, 103, -100, 64, 67, -95, -97, 107, -109, 88, -85, -115, 115, -111, -27, 17, -56, 63, 17, -10, -3, 43, -31, -17, 17, -30, -19, -27, 31, -26, -26, -26, -26, -26, -26};

        private static void c(short s, int i, short s2, Object[] objArr) {
            int i2 = i * 15;
            byte[] bArr = $$a;
            int i3 = 107 - (s * 52);
            int i4 = 84 - (s2 * 2);
            byte[] bArr2 = new byte[53 - i2];
            int i5 = 52 - i2;
            int i6 = -1;
            if (bArr == null) {
                i6 = -1;
                i4 = (i4 + (-i3)) - 11;
                i3 = i3;
            }
            while (true) {
                int i7 = i3 + 1;
                int i8 = i6 + 1;
                bArr2[i8] = (byte) i4;
                if (i8 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i6 = i8;
                i4 = (i4 + (-bArr[i7])) - 11;
                i3 = i7;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(short r7, byte r8, byte r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 11
                int r8 = r8 + 4
                byte[] r0 = LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$d
                int r9 = r9 * 3
                int r9 = r9 + 84
                int r7 = r7 * 26
                int r7 = 38 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r9
                r4 = r2
                r9 = r8
                goto L2c
            L17:
                r3 = r2
                r6 = r9
                r9 = r8
                r8 = r6
            L1b:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r9]
            L2c:
                int r8 = r8 + r3
                int r8 = r8 + (-10)
                int r9 = r9 + 1
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.f(short, byte, byte, java.lang.Object[]):void");
        }

        /* JADX INFO: renamed from: LayoutSettings$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: collision with other inner class name */
        public static final class C0002TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0002TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, Map<String, ? extends Object> map) {
                super(str, map, null);
                Intrinsics.checkNotNullParameter(str, "");
            }
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, Map<String, ? extends Object> map) {
            super(null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = map;
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"LLayoutSettings$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentbindingInflater1;", "LLayoutSettings$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "p0", "", "", "p1", "", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Throwable;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class TuitionPaymentFragmentbindingInflater1 extends TuitionPaymentFragmentspecialinlinedviewModeldefault2 {

            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
            private final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
            public final String TuitionPaymentFragmentbindingInflater1;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

            public /* synthetic */ TuitionPaymentFragmentbindingInflater1(String str, Map map, Throwable th, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private TuitionPaymentFragmentbindingInflater1(String str, Map<String, ? extends Object> map, Throwable th, String str2, String str3) {
                super(str, map, null);
                Intrinsics.checkNotNullParameter(str, "");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = th;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
                this.TuitionPaymentFragmentbindingInflater1 = str3;
            }
        }

        /* JADX WARN: Code duplicated, block: B:52:0x01c4 A[PHI: r0
  0x01c4: PHI (r0v9 int) = (r0v8 int), (r0v34 int) binds: [B:51:0x01c2, B:48:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:53:0x01c6 A[PHI: r0
  0x01c6: PHI (r0v31 int) = (r0v8 int), (r0v34 int) binds: [B:51:0x01c2, B:48:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
        private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            int i6 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.getOffsetAfter("", 0) + 2267, Drawable.resolveOpacity(0, 0) + 33, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                if (z) {
                    int i7 = $10 + 95;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                    byte[] bArr = d;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i8 = 0; i8 < length; i8++) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b5 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3358, (ViewConfiguration.getPressedStateDuration() >> 16) + 18, -1054011043, false, $$g(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                                }
                                bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        int i9 = $10 + 115;
                        $11 = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 3 / 2;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i11 = $11 + 57;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        byte[] bArr3 = d;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.alpha(0), TextUtils.lastIndexOf("", '0', 0) + 2268, 33 - TextUtils.indexOf("", ""), 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    } else {
                        iIntValue = (short) (((short) (((long) asInterface[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    int i13 = $10 + 23;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        i4 = ((i3 >>> iIntValue) >> 4) >>> ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) / 3046761265686732006L));
                        if (z) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                    } else {
                        i4 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                        if (z) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - TextUtils.getTrimmedLength("")), 2855 - (ViewConfiguration.getWindowTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 14, -1529949196, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = d;
                    if (bArr4 != null) {
                        int i14 = $11 + 101;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i16 = 0;
                        while (i16 < length2) {
                            bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 3046761265686732006L);
                            i16++;
                            int i17 = $11 + 101;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z2) {
                            byte[] bArr6 = d;
                            int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = asInterface;
                            int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int i2 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2267;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 33;
                byte[] bArr = $$a;
                byte b2 = bArr[40];
                byte b3 = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, iMakeMeasureSpec, -887667012, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(1494374759 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 4 - TextUtils.lastIndexOf("", '0'), (short) ((Process.getThreadPriority(0) + 20) >> 6), (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 6), View.MeasureSpec.makeMeasureSpec(0, 0) + 1377482538, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(1494374763 - KeyEvent.keyCodeFromString(""), Color.argb(0, 0, 0, 0) - 2, (short) TextUtils.getOffsetBefore("", 0), (byte) (83 - Color.alpha(0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1377482559, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int iBlue = Color.blue(0) + 2267;
                int iIndexOf = 32 - TextUtils.indexOf((CharSequence) "", '0');
                byte[] bArr2 = $$a;
                byte b4 = bArr2[5];
                byte b5 = bArr2[7];
                Object[] objArr5 = new Object[1];
                c(b4, b5, b5, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, iBlue, iIndexOf, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i3 = asBinder + 9;
                f162a = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int iResolveSize = 2267 - View.resolveSize(0, 0);
                    int iIndexOf2 = 32 - TextUtils.indexOf((CharSequence) "", '0');
                    byte[] bArr3 = $$a;
                    byte b6 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    c(b6, bArr3[5], b6, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iResolveSize, iIndexOf2, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i5 = ((int[]) objArr7[0])[0];
                int i6 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int iIdentityHashCode = System.identityHashCode(this);
                int i7 = (((-1515287077) + (((~(iIdentityHashCode | 724330613)) | 84382702) * 191)) + (((~((~iIdentityHashCode) | 724330613)) | 67343242) * 191)) - 854547212;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e(1494374759 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8, (short) ((-1) - Process.getGidForName("")), (byte) (82 - TextUtils.indexOf((CharSequence) "", '0')), 1377482573 - (Process.myPid() >> 22), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(1494374761 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((-108) - TextUtils.indexOf("", "")), 1377482598 - Color.red(0), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i10 = f162a + 37;
                    asBinder = i10 % 128;
                    if (i10 % 2 != 0) {
                        boolean z = applicationContext instanceof ContextWrapper;
                        obj.hashCode();
                        throw null;
                    }
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                e((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1494374768, (-1) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) View.resolveSize(0, 0), (byte) ((-127) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1377482615 - View.MeasureSpec.getMode(0), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e(AndroidCharacter.getMirror('0') + 22847, (byte) KeyEvent.getModifierMetaStateMask(), (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (KeyEvent.keyCodeFromString("") + 2), TextUtils.indexOf("", "") + 1377482630, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i11 = f162a + 41;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -854547212};
                    byte[] bArr4 = $$d;
                    byte b7 = bArr4[18];
                    Object[] objArr13 = new Object[1];
                    f((byte) (-b7), bArr4[39], (byte) (-b7), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b8 = bArr4[39];
                    Object[] objArr14 = new Object[1];
                    f(b8, (byte) (-bArr4[18]), b8, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int iAlpha = Color.alpha(0) + 2267;
                            int iAxisFromString = 32 - MotionEvent.axisFromString("");
                            byte[] bArr5 = $$a;
                            byte b9 = bArr5[7];
                            Object[] objArr16 = new Object[1];
                            c(b9, bArr5[5], b9, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iAlpha, iAxisFromString, -654680577, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            e(((byte) KeyEvent.getModifierMetaStateMask()) + 1494374760, 5 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (byte) ((-6) - TextUtils.getCapsMode("", 0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1377482538, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            e(View.MeasureSpec.getSize(0) + 1494374763, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 2, (short) Color.alpha(0), (byte) (ExpandableListView.getPackedPositionChild(0L) + 84), 1377482560 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cMyTid = (char) (Process.myTid() >> 22);
                                int bitsPerPixel = 2266 - ImageFormat.getBitsPerPixel(0);
                                int i13 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33;
                                byte[] bArr6 = $$a;
                                byte b10 = bArr6[5];
                                byte b11 = bArr6[7];
                                Object[] objArr19 = new Object[1];
                                c(b10, b11, b11, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyTid, bitsPerPixel, i13, -874156483, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2267;
                                int i14 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33;
                                byte[] bArr7 = $$a;
                                byte b12 = bArr7[40];
                                byte b13 = bArr7[7];
                                Object[] objArr20 = new Object[1];
                                c(b12, b13, b13, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, iKeyCodeFromString, i14, -887667012, false, (String) objArr20[0], null);
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
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[0])[0];
            if (i16 == i15) {
                int i17 = asBinder + 109;
                f162a = i17 % 128;
                int i18 = i17 % 2;
                Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i19 = ((int[]) objArr[2])[0];
                int i20 = ((int[]) objArr[0])[0];
                int i21 = ((int[]) objArr[3])[0];
                String[] strArr2 = (String[]) objArr[1];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i22 = (-1400378679) + (((~((-562957481) | iIdentityHashCode2)) | (-245755836)) * (-318));
                int i23 = ~((-245755836) | iIdentityHashCode2);
                int i24 = ~iIdentityHashCode2;
                int i25 = i19 + i22 + ((i23 | (~(800059323 | i24))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode2 | 800059323)) | (~((-237101844) | i24))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                int i26 = i25 ^ (i25 << 13);
                int i27 = i26 ^ (i26 >>> 17);
                ((int[]) objArr21[2])[0] = i27 ^ (i27 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[1];
                if (strArr3 != null) {
                    for (String str : strArr3) {
                        int i28 = asBinder + 67;
                        f162a = i28 % 128;
                        int i29 = i28 % 2;
                        arrayList.add(str);
                    }
                }
                int[] iArr = new int[i16];
                int i30 = i16 - 1;
                iArr[i30] = 1;
                Toast.makeText((Context) null, iArr[((i16 * i30) % 2) - 1], 1).show();
                Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i31 = ((int[]) objArr[2])[0];
                int i32 = ((int[]) objArr[0])[0];
                int i33 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[1];
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i34 = ~iElapsedRealtime;
                int i35 = i31 + (-1423784170) + ((536866747 | i34) * (-369)) + (((~((-519319484) | i34)) | 289393832) * (-369)) + (((~(iElapsedRealtime | 519319483)) | 17547264 | (~(i34 | (-247472916)))) * 369);
                int i36 = (i35 << 13) ^ i35;
                int i37 = i36 ^ (i36 >>> 17);
                ((int[]) objArr22[2])[0] = i37 ^ (i37 << 5);
                int i38 = asBinder + 53;
                f162a = i38 % 128;
                int i39 = i38 % 2;
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, map);
        }

        private static String $$g(byte b2, byte b3, int i) {
            int i2 = i + 117;
            int i3 = 4 - (b2 * 4);
            byte[] bArr = $$c;
            int i4 = b3 * 4;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            int i6 = -1;
            if (bArr == null) {
                i2 += i5;
                i3++;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i2;
                if (i6 == i5) {
                    return new String(bArr2, 0);
                }
                i2 += bArr[i3];
                i3++;
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends LayoutSettings {
        public final long TuitionPaymentFragmentbindingInflater1;
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f161a;
        public final long b;
        private static final byte[] $$c = {41, 2, 45, -60};
        private static final int $$f = 51;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {114, -115, 48, 84, -31, -34, 0, -16, -9, 33, -47, 1, -19, -19, 7, -11, 23, -43, -25, 5, -8, -27, -5, -13, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$e = 166;
        private static final byte[] $$a = {48, -110, 22, 55, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
        private static final int $$b = 140;
        private static int asBinder = 0;
        private static int asInterface = 1;
        private static char[] g = {60055, 60117, 60041, 60048, 60062, 60083, 60060, 60057, 60052, 60063, 60040, 60043, 60049, 60050, 60051, 60053, 60056, 60047, 60073, 60045, 60072, 60088, 60058, 60034, 60054};
        private static char d = 57188;

        private static void c(byte b, byte b2, byte b3, Object[] objArr) {
            int i = 13 - (b2 * 10);
            byte[] bArr = $$a;
            int i2 = (b * 3) + 97;
            byte[] bArr2 = new byte[b3 + 1];
            int i3 = -1;
            if (bArr == null) {
                i2 = (i2 + b3) - 5;
            }
            while (true) {
                i++;
                i3++;
                bArr2[i3] = (byte) i2;
                if (i3 == b3) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i2 = (i2 + bArr[i]) - 5;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 20
                int r7 = r7 + 4
                int r8 = r8 * 8
                int r8 = r8 + 76
                int r6 = r6 * 17
                int r0 = 38 - r6
                byte[] r1 = LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$d
                byte[] r0 = new byte[r0]
                int r6 = 37 - r6
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r6
                r8 = r7
                r4 = r2
                goto L30
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L30:
                int r7 = -r7
                int r3 = r3 + r7
                int r7 = r8 + 1
                int r8 = r3 + (-10)
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f(byte, short, short, java.lang.Object[]):void");
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, long j, long j2, boolean z2, boolean z3, int i) {
            super(null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
            this.b = j;
            this.TuitionPaymentFragmentbindingInflater1 = j2;
            this.f161a = z2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        }

        public final int hashCode() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int iHashCode = ((((((((Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.TuitionPaymentFragmentbindingInflater1)) * 31) + Boolean.hashCode(this.f161a)) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 31;
            int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                int iRgb = (-16776340) - Color.rgb(0, 0, 0);
                int iIndexOf = 10 - TextUtils.indexOf("", "", 0);
                byte[] bArr = $$a;
                byte b = bArr[11];
                Object[] objArr2 = new Object[1];
                c(b, (byte) (b + 1), bArr[17], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iRgb, iIndexOf, -1199417970, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new char[]{20, 17, 7, 4, '\r', 18, 6, 4, 5, '\r', 0, 21, 20, '\r', 19, 2, 20, 22, 3, 5, 18, 1}, (byte) (54 - TextUtils.lastIndexOf("", '0')), 22 - View.resolveSizeAndState(0, 0, 0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new char[]{0, 1, 21, '\f', 14, 0, '\b', 19, 2, 24, 2, 15, 14, 23, 13911}, (byte) (TextUtils.getTrimmedLength("") + 88), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int mirror = 924 - AndroidCharacter.getMirror('0');
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                byte b2 = $$a[11];
                byte b3 = (byte) (b2 + 1);
                byte b4 = b2;
                Object[] objArr5 = new Object[1];
                c(b3, b4, b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, mirror, scrollBarFadeDuration, 254769921, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                    int mode = View.MeasureSpec.getMode(0) + 10;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[11];
                    byte b6 = bArr2[12];
                    Object[] objArr6 = new Object[1];
                    c(b5, b5, b6, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iResolveOpacity, mode, 1324201839, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i3 = ~iUptimeMillis;
                int i4 = (-880613440) + ((iUptimeMillis | 917112236) * (-859)) + (((~(iUptimeMillis | (-44564521))) | (~(917112236 | i3))) * 859) + (((~(876802007 | i3)) | (-921366528)) * 859) + 630825845;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e(new char[]{17, 2, 17, 24, 2, 1, 20, 17, 11, 6, 21, 24, '\f', 15, '\t', 4}, (byte) (Gravity.getAbsoluteGravity(0, 0) + 91), TextUtils.indexOf((CharSequence) "", '0') + 17, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new char[]{14, '\b', 0, 19, 18, '\f', 18, 22, 7, 20, 11, '\n', 23, 6, 14, '\t'}, (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 46), 16 - View.getDefaultSize(0, 0), objArr9);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                int i7 = asBinder + 51;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr10 = {Integer.valueOf(iIntValue), 630825845};
                    byte[] bArr3 = $$d;
                    byte b7 = bArr3[11];
                    byte b8 = bArr3[6];
                    Object[] objArr11 = new Object[1];
                    f(b7, b8, b8, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b9 = bArr3[6];
                    byte b10 = bArr3[11];
                    Object[] objArr12 = new Object[1];
                    f(b9, b10, b10, objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                        int iCombineMeasuredStates = 10 - View.combineMeasuredStates(0, 0);
                        byte[] bArr4 = $$a;
                        byte b11 = bArr4[11];
                        Object[] objArr14 = new Object[1];
                        c(b11, b11, bArr4[12], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, keyRepeatTimeout, iCombineMeasuredStates, 1324201839, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        e(new char[]{20, 17, 7, 4, '\r', 18, 6, 4, 5, '\r', 0, 21, 20, '\r', 19, 2, 20, 22, 3, 5, 18, 1}, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 55), 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        e(new char[]{0, 1, 21, '\f', 14, 0, '\b', 19, 2, 24, 2, 15, 14, 23, 13911}, (byte) (TextUtils.indexOf("", "", 0, 0) + 88), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int maxKeyCode = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
                            byte b12 = $$a[11];
                            byte b13 = (byte) (b12 + 1);
                            byte b14 = b12;
                            Object[] objArr17 = new Object[1];
                            c(b13, b14, b14, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, maxKeyCode, pressedStateDuration, 254769921, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10;
                            byte[] bArr5 = $$a;
                            byte b15 = bArr5[11];
                            Object[] objArr18 = new Object[1];
                            c(b15, (byte) (b15 + 1), bArr5[17], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, iMakeMeasureSpec, maximumFlingVelocity, -1199417970, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr13;
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
            int i9 = ((int[]) objArr[2])[0];
            int i10 = ((int[]) objArr[0])[0];
            if (i10 == i9) {
                int i11 = ((int[]) objArr[1])[0];
                Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i12 = ~System.identityHashCode(this);
                int i13 = i11 + ((((-1454000216) + (((~((-145947661) | i12)) | 105637431) * (-933))) + (((~(i12 | 105637431)) | (-251395648)) * 933)) - 401275937);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr19[1])[0] = i15 ^ (i15 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[3];
                if (strArr != null) {
                    int i16 = asInterface + 55;
                    asBinder = i16 % 128;
                    int i17 = 2;
                    int i18 = i16 % 2;
                    int i19 = 0;
                    while (i19 < strArr.length) {
                        int i20 = asInterface + 65;
                        asBinder = i20 % 128;
                        int i21 = i20 % i17;
                        arrayList.add(strArr[i19]);
                        i19++;
                        i17 = 2;
                    }
                }
                int[] iArr = new int[i10];
                int i22 = i10 - 1;
                iArr[i22] = 1;
                Toast.makeText((Context) null, iArr[((i10 * i22) % 2) - 1], 1).show();
                int i23 = ((int[]) objArr[1])[0];
                Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i24 = ~((int) Runtime.getRuntime().totalMemory());
                int i25 = i23 + ((((-942559356) + (((~((-228225682) | i24)) | 268535910) * (-828))) + ((i24 | (-228225682)) * (-828))) - 7697156);
                int i26 = (i25 << 13) ^ i25;
                int i27 = i26 ^ (i26 >>> 17);
                ((int[]) objArr20[1])[0] = i27 ^ (i27 << 5);
            }
            return iHashCode + Integer.hashCode(i2);
        }

        private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = g;
            long j = 0;
            int i4 = 1770390596;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 2268 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), 33 - (ViewConfiguration.getTouchSlop() >> 8), -1927765101, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i5++;
                        j = 0;
                        i4 = 1770390596;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(d)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b4 = (byte) 0;
                byte b5 = (byte) (b4 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.getDefaultSize(0, 0), View.getDefaultSize(0, 0) + 2267, 33 - Color.green(0), -1927765101, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i6 = $11 + 27;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    i2 = i + 105;
                    cArr4[i2] = (char) (cArr[i2] + b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
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
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        int i7 = $11 + 123;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (ViewConfiguration.getEdgeSlop() >> 16)), 3261 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 30, -127612708, false, $$g(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                int i9 = $10 + 91;
                                $11 = i9 % 128;
                                int i10 = i9 % 2;
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b8 = (byte) 0;
                                    byte b9 = (byte) (b8 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - Color.red(0)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 594, 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1570859318, false, $$g(b8, b9, (byte) (b9 + 4)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    int i12 = $11 + 49;
                                    $10 = i12 % 128;
                                    int i13 = i12 % 2;
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                } else {
                                    int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
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
            for (int i18 = 0; i18 < i; i18++) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                int i2 = asInterface + 21;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) obj;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || this.b != tuitionPaymentFragmentspecialinlinedviewModeldefault1.b) {
                return false;
            }
            if (this.TuitionPaymentFragmentbindingInflater1 != tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1) {
                int i4 = asBinder + 63;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (this.f161a != tuitionPaymentFragmentspecialinlinedviewModeldefault1.f161a) {
                int i6 = asInterface + 27;
                asBinder = i6 % 128;
                return i6 % 2 != 0;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return false;
            }
            int i7 = asBinder + 33;
            asInterface = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long j = this.b;
            long j2 = this.TuitionPaymentFragmentbindingInflater1;
            boolean z2 = this.f161a;
            boolean z3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("Configuration(trackErrors=");
            sb.append(z);
            sb.append(", batchSize=");
            sb.append(j);
            sb.append(", batchUploadFrequency=");
            sb.append(j2);
            sb.append(", useProxy=");
            sb.append(z2);
            sb.append(", useLocalEncryption=");
            sb.append(z3);
            sb.append(", batchProcessingLevel=");
            sb.append(i2);
            sb.append(")");
            String string = sb.toString();
            int i3 = asInterface + 61;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return string;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, short r7, short r8) {
            /*
                int r8 = r8 + 113
                byte[] r0 = LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                int r6 = r6 * 3
                int r1 = 1 - r6
                int r7 = r7 + 4
                byte[] r1 = new byte[r1]
                r2 = 0
                int r6 = 0 - r6
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
                if (r3 != r6) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L21:
                int r7 = r7 + 1
                r4 = r0[r7]
                int r3 = r3 + 1
                r5 = r8
                r8 = r7
                r7 = r5
            L2a:
                int r7 = r7 + r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$g(int, short, short):java.lang.String");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class TuitionPaymentFragmentbindingInflater1 extends LayoutSettings {
        public final Map<String, Object> TuitionPaymentFragmentbindingInflater1;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentbindingInflater1(String str, Map<String, ? extends Object> map) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentbindingInflater1 = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentbindingInflater1)) {
                return false;
            }
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) obj;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            Map<String, Object> map = this.TuitionPaymentFragmentbindingInflater1;
            return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Map<String, Object> map = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("Metric(message=");
            sb.append(str);
            sb.append(", additionalProperties=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\nB!\b\u0004\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"LLayoutSettings$b;", "LLayoutSettings;", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/Map;", "TuitionPaymentFragmentbindingInflater1", "LLayoutSettings$b$TuitionPaymentFragmentbindingInflater1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static abstract class b extends LayoutSettings {
        public static int TuitionPaymentFragmentbindingInflater1;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public /* synthetic */ b(LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap, null);
        }

        private b(Map<String, Object> map) {
            super(null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
        }

        public /* synthetic */ b(Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(map);
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = TuitionPaymentFragmentbindingInflater1;
            int i2 = i % 8477288;
            TuitionPaymentFragmentbindingInflater1 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iFreeMemory;
            return iFreeMemory;
        }

        /* JADX INFO: loaded from: classes4.dex */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\r"}, d2 = {"LLayoutSettings$b$TuitionPaymentFragmentbindingInflater1;", "LLayoutSettings$b;", "", "p0", "p1", "p2", "", "", "", "p3", "<init>", "(ZZZLjava/util/Map;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Z", "b", "TuitionPaymentFragmentbindingInflater1", "d"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class TuitionPaymentFragmentbindingInflater1 extends b {
            public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public final boolean TuitionPaymentFragmentbindingInflater1;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public final boolean b;

            public /* synthetic */ TuitionPaymentFragmentbindingInflater1(boolean z, boolean z2, boolean z3, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, z2, z3, (i & 8) != 0 ? new LinkedHashMap() : linkedHashMap);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private TuitionPaymentFragmentbindingInflater1(boolean z, boolean z2, boolean z3, Map<String, Object> map) {
                super(map, null);
                Intrinsics.checkNotNullParameter(map, "");
                this.b = z;
                this.TuitionPaymentFragmentbindingInflater1 = z2;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z3;
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LLayoutSettings$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LLayoutSettings;", "<init>", "()V"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends LayoutSettings {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 INSTANCE = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            super(null);
        }
    }
}
