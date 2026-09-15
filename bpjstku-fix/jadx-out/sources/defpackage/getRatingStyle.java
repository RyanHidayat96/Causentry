package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.promo.model.request.VoucherRequest;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0003\u001e\u001f\u000bB\u001d\b\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u000fH\u0097\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001d"}, d2 = {"LgetRatingStyle;", "", "Lkotlin/Pair;", "", "LgetRatingStyle$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "p0", "<init>", "(Ljava/util/Map;)V", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Z", "b", "()Ljava/util/Map;", "", "iterator", "()Ljava/util/Iterator;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "LgetRatingStyle$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LgetRatingStyle$TuitionPaymentFragmentbindingInflater1;", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getRatingStyle implements Iterable<Pair<? extends String, ? extends TuitionPaymentFragmentspecialinlinedviewModeldefault3>>, KMappedMarker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<String, TuitionPaymentFragmentspecialinlinedviewModeldefault3> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static final getRatingStyle TuitionPaymentFragmentbindingInflater1 = new getRatingStyle();

    private getRatingStyle(Map<String, TuitionPaymentFragmentspecialinlinedviewModeldefault3> map) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
    }

    public getRatingStyle() {
        this(MapsKt.emptyMap());
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty();
    }

    public final Map<String, String> b() {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            return MapsKt.emptyMap();
        }
        Map<String, TuitionPaymentFragmentspecialinlinedviewModeldefault3> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, TuitionPaymentFragmentspecialinlinedviewModeldefault3>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            String str = it.next().getValue().TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        return linkedHashMap;
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends TuitionPaymentFragmentspecialinlinedviewModeldefault3>> iterator() {
        Map<String, TuitionPaymentFragmentspecialinlinedviewModeldefault3> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, TuitionPaymentFragmentspecialinlinedviewModeldefault3> entry : map.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof getRatingStyle) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((getRatingStyle) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(entries=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(')');
        return sb.toString();
    }

    public final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new TuitionPaymentFragmentbindingInflater1(this);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final Object b;

        public final int hashCode() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj;
            return Intrinsics.areEqual((Object) null, tuitionPaymentFragmentspecialinlinedviewModeldefault3.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry(value=");
            sb.append(this.b);
            sb.append(", memoryCacheKey=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            sb.append(')');
            return sb.toString();
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 {
        private final Map<String, TuitionPaymentFragmentspecialinlinedviewModeldefault3> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static final byte[] $$c = {68, 104, -93, -37};
        private static final int $$f = 82;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {58, 66, -1, 15, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
        private static final int $$e = 74;
        private static final byte[] $$a = {109, 48, -62, 38, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -21, -49, -2, 2, 1, 4, 0, -21, 9, -8, -1, 35, -39, 6, -11, 1, -21, 17, 27, -39, -11, 7, -23, 19, 49, -64, 9, -15, 5, 55, -40, -22, -12, 11, 2, -5, -3, 17, -19, -4, 5, 5, -2, -13, -7, 4, -7};
        private static final int $$b = 174;
        private static int d = 0;
        private static int asBinder = 1;
        private static long b = -811283966438590031L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
        private static char TuitionPaymentFragmentbindingInflater1 = 34097;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {45563, 10741, 33264, 31225, 53724, 18896, 8632, 39329, 29087, 59793, 16784, 14705, 37219, 2414, 57725, 22854, 12602, 43327, 45491, 45511, 10686, 33241, 14743, 45561, 10728, 33261, 31180, 53670, 3819, 38646, 16096, 50900, 28362, 63168, 40630, 9973, 52888, 22168, 65166, 34353, 11884, 46696, 24156, 58952, 36407, 5682, 48749, 45478, 45491, 10743, 33265, 31197, 53727, 18900, 8603, 39323, 29109, 59806, 16770, 14711, 45491, 10723, 33277, 31179, 53720, 18885, 8633, 39399, 29066, 59776, 16780, 14711, 37218, 2405, 57707, 22875, 12588, 43313, 295, 63773, 61561, 26686, 49199, 14342, 36871, 2117, 24698, 55395, 12354, 43099, 1, 30897, 53417, 18599, 41168, 6277, 28916, 59637, 16630, 47260, 4295, 35012, 57658, 22832, 45337, 10515, 33034, 63805, 20848, 51564, 8525, 39293, 61874, 27067, 49594, 14739};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static long f969a = -3818961426262972016L;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(short r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 + 4
                byte[] r0 = getRatingStyle.TuitionPaymentFragmentbindingInflater1.$$a
                int r8 = r8 * 3
                int r8 = 115 - r8
                int r7 = 34 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r9
                r4 = r2
                goto L29
            L12:
                r3 = r2
            L13:
                int r9 = r9 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L24:
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L29:
                int r9 = -r9
                int r8 = r8 + r9
                int r8 = r8 + (-2)
                r9 = r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: getRatingStyle.TuitionPaymentFragmentbindingInflater1.f(short, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void g(int r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 + 4
                int r8 = r8 + 84
                int r9 = r9 * 52
                int r9 = r9 + 1
                byte[] r0 = getRatingStyle.TuitionPaymentFragmentbindingInflater1.$$d
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L13
                r8 = r7
                r3 = r9
                r4 = r2
                goto L2b
            L13:
                r3 = r2
            L14:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L2b:
                int r7 = -r7
                int r3 = r3 + r7
                int r7 = r3 + (-10)
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: getRatingStyle.TuitionPaymentFragmentbindingInflater1.g(int, byte, int, java.lang.Object[]):void");
        }

        private static void e(char c, int i, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = $10 + 83;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), 2187 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 40, 841711447, false, $$g(b2, (byte) (b2 | 6), b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(f969a), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33018 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 3011 - (ViewConfiguration.getJumpTapTimeout() >> 16), 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 321985076, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - View.combineMeasuredStates(0, 0)), Process.getGidForName("") + 3377, 17 - View.combineMeasuredStates(0, 0), -968507904, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i7 = $10 + 75;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36504), 3376 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 17 - (ViewConfiguration.getTouchSlop() >> 8), -968507904, false, $$g(b7, b8, (byte) (b8 - 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }

        public TuitionPaymentFragmentbindingInflater1() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new LinkedHashMap();
        }

        public TuitionPaymentFragmentbindingInflater1(getRatingStyle getratingstyle) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = MapsKt.toMutableMap(getratingstyle.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - Color.argb(0, 0, 0, 0)), 1235 - Color.alpha(0), 36 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -653973969, false, $$g(b2, (byte) (b2 | 13), b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionType(0L) + 2764, View.MeasureSpec.getMode(0) + 14, 1504416861, false, $$g(b3, (byte) (b3 | 11), b3), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - TextUtils.indexOf((CharSequence) "", '0', 0)), KeyEvent.getDeadChar(0, 0) + 253, 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b4 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 2891 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 18, 2012627446, false, $$g(b4, (byte) (b4 | 12), b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    int i3 = $10 + 57;
                    $11 = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
            int i5 = $10 + 51;
            $11 = i5 % 128;
            int i6 = i5 % 2;
        }

        public final getRatingStyle TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = 2 % 2;
            getRatingStyle getratingstyle = new getRatingStyle(getPackageName.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), null);
            int i2 = d + 39;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return getratingstyle;
        }

        /* JADX WARN: Code duplicated, block: B:108:0x0b43 A[Catch: Exception -> 0x0e72, all -> 0x0eb7, IOException -> 0x0ebb, TryCatch #8 {Exception -> 0x0e72, blocks: (B:106:0x0b35, B:108:0x0b43, B:109:0x0b80, B:111:0x0b96, B:112:0x0bd2, B:151:0x0e12, B:154:0x0e18, B:156:0x0e21, B:157:0x0e22, B:162:0x0e28, B:164:0x0e31, B:165:0x0e32, B:167:0x0e34, B:169:0x0e3f, B:170:0x0e40, B:172:0x0e42, B:174:0x0e4d, B:175:0x0e4e), top: B:294:0x0b35 }] */
        /* JADX WARN: Code duplicated, block: B:111:0x0b96 A[Catch: Exception -> 0x0e72, all -> 0x0eb7, IOException -> 0x0ebb, TryCatch #8 {Exception -> 0x0e72, blocks: (B:106:0x0b35, B:108:0x0b43, B:109:0x0b80, B:111:0x0b96, B:112:0x0bd2, B:151:0x0e12, B:154:0x0e18, B:156:0x0e21, B:157:0x0e22, B:162:0x0e28, B:164:0x0e31, B:165:0x0e32, B:167:0x0e34, B:169:0x0e3f, B:170:0x0e40, B:172:0x0e42, B:174:0x0e4d, B:175:0x0e4e), top: B:294:0x0b35 }] */
        /* JADX WARN: Code duplicated, block: B:115:0x0c9d A[Catch: all -> 0x0eb7, IOException -> 0x0ebb, TryCatch #17 {, blocks: (B:43:0x060b, B:44:0x0640, B:46:0x066a, B:48:0x06be, B:53:0x072b, B:58:0x077a, B:64:0x07fe, B:105:0x0b32, B:106:0x0b35, B:108:0x0b43, B:109:0x0b80, B:111:0x0b96, B:112:0x0bd2, B:113:0x0be3, B:115:0x0c9d, B:117:0x0cd6, B:119:0x0d07, B:121:0x0d3f, B:123:0x0dbb, B:125:0x0dc5, B:185:0x0e72, B:186:0x0eb6, B:150:0x0e0f, B:151:0x0e12, B:154:0x0e18, B:156:0x0e21, B:157:0x0e22, B:162:0x0e28, B:164:0x0e31, B:165:0x0e32, B:167:0x0e34, B:169:0x0e3f, B:170:0x0e40, B:172:0x0e42, B:174:0x0e4d, B:175:0x0e4e), top: B:302:0x060b }] */
        /* JADX WARN: Code duplicated, block: B:117:0x0cd6 A[Catch: all -> 0x0eb7, IOException -> 0x0ebb, TryCatch #17 {, blocks: (B:43:0x060b, B:44:0x0640, B:46:0x066a, B:48:0x06be, B:53:0x072b, B:58:0x077a, B:64:0x07fe, B:105:0x0b32, B:106:0x0b35, B:108:0x0b43, B:109:0x0b80, B:111:0x0b96, B:112:0x0bd2, B:113:0x0be3, B:115:0x0c9d, B:117:0x0cd6, B:119:0x0d07, B:121:0x0d3f, B:123:0x0dbb, B:125:0x0dc5, B:185:0x0e72, B:186:0x0eb6, B:150:0x0e0f, B:151:0x0e12, B:154:0x0e18, B:156:0x0e21, B:157:0x0e22, B:162:0x0e28, B:164:0x0e31, B:165:0x0e32, B:167:0x0e34, B:169:0x0e3f, B:170:0x0e40, B:172:0x0e42, B:174:0x0e4d, B:175:0x0e4e), top: B:302:0x060b }] */
        /* JADX WARN: Code duplicated, block: B:119:0x0d07 A[Catch: all -> 0x0eb7, IOException -> 0x0ebb, TryCatch #17 {, blocks: (B:43:0x060b, B:44:0x0640, B:46:0x066a, B:48:0x06be, B:53:0x072b, B:58:0x077a, B:64:0x07fe, B:105:0x0b32, B:106:0x0b35, B:108:0x0b43, B:109:0x0b80, B:111:0x0b96, B:112:0x0bd2, B:113:0x0be3, B:115:0x0c9d, B:117:0x0cd6, B:119:0x0d07, B:121:0x0d3f, B:123:0x0dbb, B:125:0x0dc5, B:185:0x0e72, B:186:0x0eb6, B:150:0x0e0f, B:151:0x0e12, B:154:0x0e18, B:156:0x0e21, B:157:0x0e22, B:162:0x0e28, B:164:0x0e31, B:165:0x0e32, B:167:0x0e34, B:169:0x0e3f, B:170:0x0e40, B:172:0x0e42, B:174:0x0e4d, B:175:0x0e4e), top: B:302:0x060b }] */
        /* JADX WARN: Code duplicated, block: B:121:0x0d3f A[Catch: all -> 0x0eb7, IOException -> 0x0ebb, TryCatch #17 {, blocks: (B:43:0x060b, B:44:0x0640, B:46:0x066a, B:48:0x06be, B:53:0x072b, B:58:0x077a, B:64:0x07fe, B:105:0x0b32, B:106:0x0b35, B:108:0x0b43, B:109:0x0b80, B:111:0x0b96, B:112:0x0bd2, B:113:0x0be3, B:115:0x0c9d, B:117:0x0cd6, B:119:0x0d07, B:121:0x0d3f, B:123:0x0dbb, B:125:0x0dc5, B:185:0x0e72, B:186:0x0eb6, B:150:0x0e0f, B:151:0x0e12, B:154:0x0e18, B:156:0x0e21, B:157:0x0e22, B:162:0x0e28, B:164:0x0e31, B:165:0x0e32, B:167:0x0e34, B:169:0x0e3f, B:170:0x0e40, B:172:0x0e42, B:174:0x0e4d, B:175:0x0e4e), top: B:302:0x060b }] */
        /* JADX WARN: Code duplicated, block: B:123:0x0dbb A[Catch: all -> 0x0eb7, IOException -> 0x0ebb, TRY_LEAVE, TryCatch #17 {, blocks: (B:43:0x060b, B:44:0x0640, B:46:0x066a, B:48:0x06be, B:53:0x072b, B:58:0x077a, B:64:0x07fe, B:105:0x0b32, B:106:0x0b35, B:108:0x0b43, B:109:0x0b80, B:111:0x0b96, B:112:0x0bd2, B:113:0x0be3, B:115:0x0c9d, B:117:0x0cd6, B:119:0x0d07, B:121:0x0d3f, B:123:0x0dbb, B:125:0x0dc5, B:185:0x0e72, B:186:0x0eb6, B:150:0x0e0f, B:151:0x0e12, B:154:0x0e18, B:156:0x0e21, B:157:0x0e22, B:162:0x0e28, B:164:0x0e31, B:165:0x0e32, B:167:0x0e34, B:169:0x0e3f, B:170:0x0e40, B:172:0x0e42, B:174:0x0e4d, B:175:0x0e4e), top: B:302:0x060b }] */
        /* JADX WARN: Code duplicated, block: B:127:0x0de3  */
        /* JADX WARN: Code duplicated, block: B:193:0x0ebd  */
        /* JADX WARN: Code duplicated, block: B:226:0x13d8 A[EDGE_INSN: B:226:0x13d8->B:227:0x13db BREAK  A[LOOP:5: B:206:0x10bb->B:225:0x13cc], PHI: r2
  0x13d8: PHI (r2v13 java.lang.String[]) = (r2v11 java.lang.String[]), (r2v11 java.lang.String[]), (r2v17 java.lang.String[]) binds: [B:202:0x0ffb, B:204:0x10b5, B:338:0x13d8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:24:0x03a6  */
        /* JADX WARN: Code duplicated, block: B:26:0x03a9  */
        /* JADX WARN: Code duplicated, block: B:29:0x03cb A[Catch: all -> 0x1ca8, TryCatch #5 {all -> 0x1ca8, blocks: (B:12:0x0211, B:14:0x0227, B:16:0x0279, B:27:0x03b4, B:29:0x03cb, B:30:0x041e, B:216:0x12a3, B:218:0x12bb, B:220:0x130f, B:242:0x1433, B:244:0x1440, B:245:0x1486, B:247:0x1592, B:249:0x159f, B:250:0x15ea, B:252:0x17f7, B:254:0x1804, B:255:0x1852, B:257:0x196d, B:259:0x197a, B:260:0x19c0, B:262:0x1b09, B:264:0x1b16, B:265:0x1b5f), top: B:288:0x0211 }] */
        /* JADX WARN: Code duplicated, block: B:328:0x04cb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:329:0x04d9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:334:0x0ebb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:335:0x0dc5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:337:0x0de5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:34:0x04cd A[LOOP:1: B:25:0x03a7->B:34:0x04cd, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:35:0x04d9 A[EDGE_INSN: B:35:0x04d9->B:36:0x04dd BREAK  A[LOOP:1: B:25:0x03a7->B:34:0x04cd], PHI: r3 r10
  0x04d9: PHI (r3v52 java.lang.Object) = (r3v51 java.lang.Object), (r3v147 java.lang.Object) binds: [B:23:0x03a4, B:329:0x04d9] A[DONT_GENERATE, DONT_INLINE]
  0x04d9: PHI (r10v76 int) = (r10v0 int), (r10v187 int) binds: [B:23:0x03a4, B:329:0x04d9] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:38:0x05b7  */
        /* JADX WARN: Code duplicated, block: B:40:0x05ee  */
        /* JADX WARN: Code duplicated, block: B:42:0x060a  */
        /* JADX WARN: Code duplicated, block: B:51:0x06ee A[Catch: all -> 0x0e41, TryCatch #21 {all -> 0x0e41, blocks: (B:49:0x06e1, B:51:0x06ee, B:52:0x0725), top: B:307:0x06e1 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x073c A[Catch: all -> 0x0e33, TryCatch #14 {all -> 0x0e33, blocks: (B:54:0x072f, B:56:0x073c, B:57:0x0774), top: B:298:0x072f }] */
        /* JADX WARN: Multi-variable type inference failed */
        public static Object[] b(Context context, int i, int i2, int i3) throws Throwable {
            Object obj;
            int i4;
            int i5;
            int i6;
            int i7;
            String[] strArr;
            int i8;
            int i9;
            Object obj2;
            int i10;
            Object obj3;
            String str;
            int i11;
            int i12;
            Object obj4;
            int i13;
            int i14;
            Object obj5;
            int i15;
            String[] strArrSplit;
            int length;
            int i16;
            String str2;
            Object[] objArr;
            String[] strArr2;
            int i17;
            Object obj6;
            int i18;
            int i19;
            Process processExec;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            byte b2;
            String str3;
            Throwable th;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            String[] strArrSplit2;
            int length2;
            int i20;
            String str4;
            Object[] objArr2;
            String str5;
            Object[] objArr3;
            Object[] objArr4;
            String[] strArrSplit3;
            int i21;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            String str6;
            int i22;
            int i23;
            long j;
            int i24;
            int i25;
            int i26 = i;
            int i27 = 1;
            int i28 = 0;
            if (context != null) {
                try {
                    Object[] objArr5 = new Object[1];
                    c(new char[]{48256, 11760, 20724, 21443}, new char[]{20750, 14665, 33434, 63397}, (char) (ViewConfiguration.getScrollBarSize() >> 8), Color.blue(0) - 1707521711, new char[]{21217, 23316, 23410, 43929, 56000, 5069, 53375, 36314, 37626, 3610, 31638, 28845, 17096, 14790, 59662, 286, 6764, 25106, 10275, 54017, 31865, 45455, 62890}, objArr5);
                    Class<?> cls = Class.forName((String) objArr5[0]);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                    int i29 = iResolveSizeAndState * (-300);
                    int i30 = (i29 ^ 12491022) + ((i29 & 12491022) << 1);
                    int i31 = 41361 | iResolveSizeAndState;
                    int i32 = (i30 - (~((~((i31 ^ i26) | (i31 & i26))) * (-301)))) - 1;
                    int i33 = ~((-41362) | i26);
                    int i34 = ~i26;
                    int i35 = ~((i34 ^ iResolveSizeAndState) | (i34 & iResolveSizeAndState));
                    int i36 = -(-(((i33 ^ i35) | (i35 & i33)) * (-301)));
                    int i37 = (i32 ^ i36) + ((i32 & i36) << 1);
                    int i38 = ~iResolveSizeAndState;
                    int i39 = ((~((i38 & i26) | (i38 ^ i26))) | (-41362)) * 301;
                    Object[] objArr6 = new Object[1];
                    c(new char[]{48256, 11760, 20724, 21443}, new char[]{42807, '(', 37277, 26017}, (char) (((i37 | i39) << 1) - (i39 ^ i37)), View.getDefaultSize(0, 0), new char[]{47933, 38884, 59309, 51130, 51993, 26304, 33930, 18415, 13129, 27133, 23887, 61188, 62948, 37371}, objArr6);
                    String str7 = (String) cls.getMethod((String) objArr6[0], null).invoke(context, null);
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i40 = -(-TextUtils.getOffsetAfter("", 0));
                    Object[] objArr7 = new Object[1];
                    c(new char[]{48256, 11760, 20724, 21443}, new char[]{20750, 14665, 33434, 63397}, keyRepeatDelay, (i40 & (-1707521711)) + (i40 | (-1707521711)), new char[]{21217, 23316, 23410, 43929, 56000, 5069, 53375, 36314, 37626, 3610, 31638, 28845, 17096, 14790, 59662, 286, 6764, 25106, 10275, 54017, 31865, 45455, 62890}, objArr7);
                    Class<?> cls2 = Class.forName((String) objArr7[0]);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
                    int iB = VoucherRequest.b();
                    int i41 = iIndexOf * 477;
                    int i42 = (i41 ^ (-475)) + ((i41 & (-475)) << 1);
                    int i43 = ~iIndexOf;
                    int i44 = ((-2) ^ iIndexOf) | ((-2) & iIndexOf);
                    int i45 = ((-2) & iIndexOf) | ((-2) ^ iIndexOf);
                    int i46 = i42 + (((~((i44 ^ iB) | (i44 & iB))) | (~((i43 ^ 1) | (i43 & 1)))) * (-476)) + ((~((i45 & iB) | (i45 ^ iB))) * 952);
                    int i47 = ~iB;
                    int i48 = (i47 & (-2)) | ((-2) ^ i47);
                    int i49 = (~((i48 & iIndexOf) | (i48 ^ iIndexOf))) * 476;
                    char c = (char) ((i46 & i49) + (i49 | i46));
                    int capsMode = TextUtils.getCapsMode("", 0, 0);
                    int i50 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                    int i51 = ((i50 | 18) << 1) - (i50 ^ 18);
                    Object[] objArr8 = new Object[1];
                    e(c, capsMode, i51, objArr8);
                    Object objInvoke = cls2.getMethod((String) objArr8[0], null).invoke(context, null);
                    byte[] bArr = $$a;
                    Object[] objArr9 = new Object[1];
                    f(bArr[28], bArr[35], bArr[13], objArr9);
                    Class<?> cls3 = Class.forName((String) objArr9[0]);
                    byte b3 = bArr[40];
                    byte b4 = bArr[50];
                    int i52 = $$b;
                    Object[] objArr10 = new Object[1];
                    f(b3, b4, (byte) (i52 & 112), objArr10);
                    int iIndexOf2 = ((String) cls3.getField((String) objArr10[0]).get(objInvoke)).indexOf(str7);
                    if (iIndexOf2 > 0) {
                        Object[] objArr11 = new Object[1];
                        f(bArr[28], bArr[35], bArr[13], objArr11);
                        Class<?> cls4 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        f(bArr[40], bArr[50], (byte) (i52 & 112), objArr12);
                        String str8 = (String) cls4.getField((String) objArr12[0]).get(objInvoke);
                        int length3 = str8.length();
                        int i53 = ((length3 | (-16)) << 1) - (length3 ^ (-16));
                        if (i53 >= 0) {
                            int i54 = 0;
                            while (true) {
                                if (i54 > i53) {
                                    i9 = iIndexOf2;
                                    obj2 = objInvoke;
                                    i5 = i26;
                                    i10 = 0;
                                    break;
                                }
                                String strSubstring = str8.substring(i54, (i54 & 16) + (i54 | 16));
                                try {
                                    Object[] objArr13 = new Object[2];
                                    objArr13[i27] = 931995;
                                    objArr13[i28] = strSubstring;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int iRed = 3393 - Color.red(i28);
                                        int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', i28, i28) + 10;
                                        byte[] bArr2 = $$d;
                                        byte b5 = bArr2[2];
                                        Object[] objArr14 = new Object[i27];
                                        g(b5, (byte) (b5 & 14), (byte) (bArr2[7] - i27), objArr14);
                                        String str9 = (String) objArr14[0];
                                        Class[] clsArr = new Class[2];
                                        clsArr[0] = String.class;
                                        clsArr[i27] = Integer.TYPE;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iRed, iIndexOf3, 1203525406, false, str9, clsArr);
                                    }
                                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr13)).longValue();
                                    long j2 = 1297089484;
                                    i9 = iIndexOf2;
                                    obj2 = objInvoke;
                                    int i55 = i54;
                                    int i56 = i53;
                                    long j3 = -1;
                                    long j4 = j2 ^ j3;
                                    long jMyPid = Process.myPid();
                                    long j5 = (((long) 284) * j2) + (((long) (-282)) * jLongValue) + (((long) (-283)) * (((j4 | jLongValue) ^ j3) | ((j4 | jMyPid) ^ j3)));
                                    long j6 = 283;
                                    long j7 = jLongValue ^ j3;
                                    long j8 = j5 + (((j2 | j7) ^ j3) * j6) + (j6 * ((jMyPid | (j4 | j7)) ^ j3)) + ((long) (-1299159361));
                                    i5 = i;
                                    int i57 = ((int) (j8 >> 32)) & ((-2072279902) + ((~(1023406837 | i34)) * (-116)) + ((950788853 | i5) * 116) + (((~((-486437558) | i5)) | 413819573) * 116));
                                    int i58 = ~Process.myUid();
                                    int i59 = ((int) j8) & ((-1595074564) + (((~(884420007 | i58)) | 552806402) * (-933)) + (((~(i58 | 552806402)) | 335807909) * 933) + 753979210);
                                    if (((i57 & i59) | (i57 ^ i59)) == -725904754) {
                                        i10 = 1;
                                        break;
                                    }
                                    int i60 = (i55 ^ (-51)) + ((i55 & (-51)) << 1);
                                    i54 = ((i60 | 52) << 1) - (i60 ^ 52);
                                    i26 = i5;
                                    objInvoke = obj2;
                                    iIndexOf2 = i9;
                                    i53 = i56;
                                    str8 = str8;
                                    i27 = 1;
                                    i28 = 0;
                                } catch (Throwable th2) {
                                    Throwable cause = th2.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th2;
                                }
                            }
                            int i61 = -i10;
                            int i62 = ((i10 & i61) | (i10 ^ i61)) >> 31;
                            int i63 = (~i62) & i5;
                            int i64 = i62 & ((i5 & (-21)) | (i34 & 20));
                            int i65 = (i64 & i63) | (i63 ^ i64);
                            byte[] bArr3 = $$a;
                            Object[] objArr15 = new Object[1];
                            f(bArr3[28], bArr3[35], bArr3[13], objArr15);
                            Class<?> cls5 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            f(bArr3[40], bArr3[50], (byte) ($$b & 112), objArr16);
                            Field field = cls5.getField((String) objArr16[0]);
                            obj3 = obj2;
                            str = (String) field.get(obj3);
                            int length4 = str.length();
                            i11 = 1;
                            i12 = (length4 ^ (-6)) + ((length4 & (-6)) << 1);
                            if (i12 >= 0) {
                                obj4 = obj3;
                                i13 = i34;
                                i14 = 0;
                                break;
                            }
                            i21 = 0;
                            while (true) {
                                if (i21 <= i12) {
                                    obj4 = obj3;
                                    i13 = i34;
                                    i14 = 0;
                                    break;
                                }
                                String strSubstring2 = str.substring(i21, (i21 ^ 6) + ((i21 & 6) << i11));
                                Object[] objArr17 = new Object[2];
                                objArr17[i11] = 931995;
                                objArr17[0] = strSubstring2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                                    int i66 = 3394 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    int packedPositionType = 9 - ExpandableListView.getPackedPositionType(0L);
                                    byte[] bArr4 = $$d;
                                    byte b6 = bArr4[2];
                                    Object[] objArr18 = new Object[1];
                                    g(b6, (byte) (b6 & 14), (byte) (bArr4[7] - 1), objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, i66, packedPositionType, 1203525406, false, (String) objArr18[0], new Class[]{String.class, Integer.TYPE});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr17)).longValue();
                                long j9 = 1378159371;
                                str6 = str;
                                obj4 = obj3;
                                i22 = i21;
                                i23 = i12;
                                long j10 = -1;
                                long j11 = jLongValue2 ^ j10;
                                i13 = i34;
                                long jFreeMemory = ((long) ((int) Runtime.getRuntime().freeMemory())) ^ j10;
                                long j12 = 933;
                                j = (((long) 934) * j9) + (((long) (-932)) * jLongValue2) + (((long) (-933)) * (j11 | (((j9 ^ j10) | jFreeMemory) ^ j10))) + ((((j11 | jFreeMemory) ^ j10) | ((j11 | j9) ^ j10)) * j12) + (j12 * (j10 ^ (jLongValue2 | j9))) + ((long) (-1380229248));
                                int iMyUid = Process.myUid();
                                int i67 = ~iMyUid;
                                int i68 = (-582312778) + (((~((-577866788) | i67)) | 538017794) * (-1188));
                                int i69 = (~(iMyUid | 577866787)) | 538017794;
                                int i70 = ~(2015093198 | i67);
                                i24 = ((int) (j >> 32)) & (i68 + ((i69 | i70) * 594) + (((~(577866787 | i67)) | (-2054942192) | i70) * 594));
                                i25 = ~((-590209) | i5);
                                if ((i24 | (((int) j) & (1905508913 + ((675317761 | i25) * (-476)) + (i25 * 952) + ((~((-590209) | i13)) * 476)))) == -2096167706) {
                                    i14 = 1;
                                    break;
                                }
                                i21 = i22 + 1;
                                i34 = i13;
                                obj3 = obj4;
                                str = str6;
                                i12 = i23;
                                i11 = 1;
                            }
                            int i71 = -i14;
                            int i72 = ((i14 & i71) | (i14 ^ i71)) >> 31;
                            int i73 = (~i72) & i5;
                            int i74 = i72 & (i5 ^ 20);
                            int i75 = ((~i65) & i5) | (i65 & i13);
                            int i76 = (i75 | (-i75)) >> 31;
                            int i77 = ((i74 & i73) | (i73 ^ i74)) & (~i76);
                            int i78 = i65 & i76;
                            i6 = (i78 & i77) | (i77 ^ i78);
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            f(bArr5[28], bArr5[35], bArr5[13], objArr19);
                            Class<?> cls6 = Class.forName((String) objArr19[0]);
                            Object[] objArr20 = new Object[1];
                            f(bArr5[40], bArr5[50], (byte) ($$b & 112), objArr20);
                            obj5 = obj4;
                            String str10 = (String) cls6.getField((String) objArr20[0]).get(obj5);
                            int i79 = i9;
                            int i80 = ~i79;
                            String strSubstring3 = str10.substring(0, i79 & ((i80 | (-i80)) >> 31));
                            char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                            int iB2 = VoucherRequest.b();
                            int i81 = (absoluteGravity * (-183)) + 3330;
                            int i82 = ~absoluteGravity;
                            int i83 = ((i82 ^ 18) | (i82 & 18)) * (-368);
                            int i84 = (i81 & i83) + (i81 | i83);
                            int i85 = (absoluteGravity ^ (-19)) | (absoluteGravity & (-19));
                            int i86 = ~iB2;
                            int i87 = i84 + (((i85 & i86) | (i85 ^ i86)) * 184);
                            int i88 = ~(i82 | (-19));
                            int i89 = ~((i86 & absoluteGravity) | (i86 ^ absoluteGravity));
                            int i90 = (i89 & i88) | (i88 ^ i89);
                            int i91 = ~((absoluteGravity & 18) | (absoluteGravity ^ 18));
                            int i92 = -(-(((i90 & i91) | (i90 ^ i91)) * 184));
                            i15 = 0;
                            Object[] objArr21 = new Object[1];
                            e(c3, (i87 ^ i92) + ((i92 & i87) << 1), -TextUtils.lastIndexOf("", '0', 0), objArr21);
                            strArrSplit = strSubstring3.split((String) objArr21[0]);
                            length = strArrSplit.length;
                            i16 = 0;
                            while (i16 < length) {
                                str2 = strArrSplit[i16];
                                char cCombineMeasuredStates = (char) View.combineMeasuredStates(i15, i15);
                                int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                int i93 = ((maximumFlingVelocity | 19) << 1) - (maximumFlingVelocity ^ 19);
                                int threadPriority = Process.getThreadPriority(i15);
                                int i94 = (((threadPriority | 20) << 1) - (threadPriority ^ 20)) >> 6;
                                int i95 = (i94 & 3) + (i94 | 3);
                                objArr = new Object[1];
                                e(cCombineMeasuredStates, i93, i95, objArr);
                                if (str2.split((String) objArr[0]).length > 1) {
                                    synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getCapsMode("", 0, 0), View.resolveSizeAndState(0, 0, 0) + 2267, 33 - TextUtils.getOffsetBefore("", 0)))) {
                                        try {
                                            Object[] objArr22 = new Object[1];
                                            c(new char[]{48256, 11760, 20724, 21443}, new char[]{44281, 17748, 41773, 11741}, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 56739), View.getDefaultSize(0, 0), new char[]{55559, 5108, 38884, 22441, 18710, 27082, 58769, 47163, 1590, 3414, 47769, 46047, 39334, 41025, 54477, 61705}, objArr22);
                                            String str11 = (String) objArr22[0];
                                            try {
                                                Runtime runtime = Runtime.getRuntime();
                                                char[] cArr = {48256, 11760, 20724, 21443};
                                                char[] cArr2 = {64639, 19829, 7207, 299};
                                                int i96 = -(ViewConfiguration.getTapTimeout() >> 16);
                                                char c4 = (char) (((i96 | 11036) << 1) - (i96 ^ 11036));
                                                strArr2 = strArrSplit;
                                                i17 = length;
                                                try {
                                                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                    int iB3 = VoucherRequest.b();
                                                    int i97 = iIndexOf4 * 284;
                                                    obj6 = obj5;
                                                    int i98 = (i97 ^ (-282)) + ((i97 & (-282)) << 1);
                                                    int i99 = ~iIndexOf4;
                                                    i18 = i16;
                                                    int i100 = ~((i99 ^ 1) | (i99 & 1));
                                                    int i101 = ~((i99 ^ iB3) | (i99 & iB3));
                                                    int i102 = (i98 - (~(-(-(((i100 ^ i101) | (i101 & i100)) * (-283)))))) - 1;
                                                    int i103 = (~(((-2) ^ iIndexOf4) | ((-2) & iIndexOf4))) * 283;
                                                    int i104 = ((i102 | i103) << 1) - (i102 ^ i103);
                                                    int i105 = ~iIndexOf4;
                                                    int i106 = (i105 & (-2)) | (i105 ^ (-2));
                                                    try {
                                                        Object[] objArr23 = new Object[1];
                                                        c(cArr, cArr2, c4, i104 + ((~((iB3 & i106) | (i106 ^ iB3))) * 283), new char[]{38869, 14990}, objArr23);
                                                        processExec = runtime.exec((String) objArr23[0], (String[]) null, (File) null);
                                                        try {
                                                            Object[] objArr24 = {processExec.getInputStream()};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AndroidCharacter.getMirror('0') - '0'), 2143 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                                            }
                                                            Object objNewInstance = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr24);
                                                            try {
                                                                Object[] objArr25 = {processExec.getErrorStream()};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 2142 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                                                }
                                                                Object objNewInstance2 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr25);
                                                                DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                                                                try {
                                                                    byte[] bArr6 = $$a;
                                                                    i6 = i6;
                                                                    try {
                                                                        Object[] objArr26 = new Object[1];
                                                                        f((byte) (bArr6[45] - 1), bArr6[9], bArr6[3], objArr26);
                                                                        Class<?> cls7 = Class.forName((String) objArr26[0]);
                                                                        b2 = (byte) 29;
                                                                        byte b7 = bArr6[28];
                                                                        str3 = str2;
                                                                        Object[] objArr27 = new Object[1];
                                                                        f(b2, b7, (byte) (b7 | 53), objArr27);
                                                                        cls7.getMethod((String) objArr27[0], null).invoke(objNewInstance, null);
                                                                        try {
                                                                            Object[] objArr28 = new Object[1];
                                                                            f((byte) (bArr6[45] - 1), bArr6[9], bArr6[3], objArr28);
                                                                            Class<?> cls8 = Class.forName((String) objArr28[0]);
                                                                            byte b8 = bArr6[28];
                                                                            Object[] objArr29 = new Object[1];
                                                                            f(b2, b8, (byte) (b8 | 53), objArr29);
                                                                            cls8.getMethod((String) objArr29[0], null).invoke(objNewInstance2, null);
                                                                            try {
                                                                                StringBuilder sb = new StringBuilder();
                                                                                sb.append(str11);
                                                                                int i107 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                                                int i108 = iIndexOf5 * 221;
                                                                                int i109 = ((i108 | (-5037)) << 1) - (i108 ^ (-5037));
                                                                                int i110 = ~iIndexOf5;
                                                                                int i111 = ~((i110 & (-24)) | (i110 ^ (-24)));
                                                                                int i112 = i13 | iIndexOf5;
                                                                                int i113 = ~((i112 & 23) | (i112 ^ 23));
                                                                                int i114 = ((i111 & i113) | (i111 ^ i113)) * 220;
                                                                                int i115 = (i109 & i114) + (i114 | i109);
                                                                                int i116 = ~i5;
                                                                                int i117 = ~((i116 ^ 23) | (i116 & 23));
                                                                                int i118 = ((i117 & iIndexOf5) | (iIndexOf5 ^ i117)) * (-440);
                                                                                int i119 = (i115 ^ i118) + ((i115 & i118) << 1);
                                                                                int i120 = -(-((iIndexOf5 | 23 | i5) * 220));
                                                                                Object[] objArr30 = new Object[1];
                                                                                e((char) ((i107 ^ 34817) + ((i107 & 34817) << 1)), ((i119 | i120) << 1) - (i120 ^ i119), 0 - (~(-TextUtils.getCapsMode("", 0, 0))), objArr30);
                                                                                sb.append((String) objArr30[0]);
                                                                                String string = sb.toString();
                                                                                int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                                                int i121 = scrollDefaultDelay * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                                                                                int i122 = ((i121 | 5294075) << 1) - (i121 ^ 5294075);
                                                                                int i123 = (scrollDefaultDelay ^ 10525) | (scrollDefaultDelay & 10525);
                                                                                int i124 = i123 * (-502);
                                                                                int i125 = (i122 ^ i124) + ((i122 & i124) << 1);
                                                                                int i126 = ~scrollDefaultDelay;
                                                                                int i127 = ~((i126 ^ (-10526)) | (i126 & (-10526)));
                                                                                int i128 = ~scrollDefaultDelay;
                                                                                int i129 = ~((i128 ^ i13) | (i128 & i13));
                                                                                int i130 = (i127 ^ i129) | (i127 & i129);
                                                                                int i131 = (i123 & i5) | (i123 ^ i5);
                                                                                int i132 = ~i131;
                                                                                int i133 = -(-(((i130 ^ i132) | (i130 & i132)) * (-502)));
                                                                                int i134 = ((i125 | i133) << 1) - (i125 ^ i133);
                                                                                int i135 = i128 | i13;
                                                                                int i136 = ~((i135 & 10525) | (i135 ^ 10525));
                                                                                int i137 = ~i131;
                                                                                int i138 = -(-(((i136 & i137) | (i136 ^ i137)) * TypedValues.PositionType.TYPE_DRAWPATH));
                                                                                Object[] objArr31 = new Object[1];
                                                                                c(new char[]{48256, 11760, 20724, 21443}, new char[]{62794, 34102, 7482, 22569}, (char) (((i134 | i138) << 1) - (i138 ^ i134)), 981808886 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{53305, 54572, 31618, 36455, 11702}, objArr31);
                                                                                dataOutputStream.write(string.getBytes((String) objArr31[0]));
                                                                                dataOutputStream.flush();
                                                                                int i139 = -(-Color.rgb(0, 0, 0));
                                                                                int i140 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                                int i141 = (i140 & 22) + (i140 | 22);
                                                                                int i142 = -(ViewConfiguration.getTapTimeout() >> 16);
                                                                                int i143 = (i142 ^ 5) + ((i142 & 5) << 1);
                                                                                Object[] objArr32 = new Object[1];
                                                                                e((char) (((i139 | 16777216) << 1) - (i139 ^ 16777216)), i141, i143, objArr32);
                                                                                String str12 = (String) objArr32[0];
                                                                                int i144 = -KeyEvent.getDeadChar(0, 0);
                                                                                int i145 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                int i146 = ~(((-981808885) ^ i116) | (i116 & (-981808885)));
                                                                                int i147 = ~((i145 ^ i5) | (i145 & i5));
                                                                                int i148 = (((i145 * 960) - 931954980) - (~(((i146 ^ i147) | (i146 & i147)) * 959))) - 1;
                                                                                int i149 = (i148 & 956882891) + (956882891 | i148);
                                                                                int i150 = ((~(((-981808885) & i5) | ((-981808885) ^ i5))) | (~((i145 & i13) | (i13 ^ i145)))) * 959;
                                                                                Object[] objArr33 = new Object[1];
                                                                                c(new char[]{48256, 11760, 20724, 21443}, new char[]{62794, 34102, 7482, 22569}, (char) (((i144 | 10525) << 1) - (i144 ^ 10525)), (i149 ^ i150) + ((i150 & i149) << 1), new char[]{53305, 54572, 31618, 36455, 11702}, objArr33);
                                                                                dataOutputStream.write(str12.getBytes((String) objArr33[0]));
                                                                                dataOutputStream.flush();
                                                                                try {
                                                                                    long jNanoTime = System.nanoTime();
                                                                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                    while (true) {
                                                                                        try {
                                                                                            processExec.exitValue();
                                                                                            i19 = i13;
                                                                                            break;
                                                                                        } catch (IllegalThreadStateException unused) {
                                                                                            if (nanos > 0) {
                                                                                                int i151 = i13;
                                                                                                try {
                                                                                                    try {
                                                                                                        Object[] objArr34 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                        byte[] bArr7 = $$a;
                                                                                                        i19 = i151;
                                                                                                        try {
                                                                                                            Object[] objArr35 = new Object[1];
                                                                                                            f((byte) (bArr7[45] - 1), bArr7[9], bArr7[3], objArr35);
                                                                                                            Class<?> cls9 = Class.forName((String) objArr35[0]);
                                                                                                            byte b9 = bArr7[28];
                                                                                                            Object[] objArr36 = new Object[1];
                                                                                                            f(b2, b9, (byte) (b9 | 57), objArr36);
                                                                                                            cls9.getMethod((String) objArr36[0], Long.TYPE).invoke(null, objArr34);
                                                                                                        } catch (Throwable th3) {
                                                                                                            th = th3;
                                                                                                            Throwable th4 = th;
                                                                                                            Throwable cause2 = th4.getCause();
                                                                                                            if (cause2 != null) {
                                                                                                                throw cause2;
                                                                                                            }
                                                                                                            throw th4;
                                                                                                        }
                                                                                                    } catch (Throwable th5) {
                                                                                                        th = th5;
                                                                                                    }
                                                                                                } catch (InterruptedException e2) {
                                                                                                    e = e2;
                                                                                                    throw e;
                                                                                                } catch (Throwable th6) {
                                                                                                    th = th6;
                                                                                                    th = th;
                                                                                                    try {
                                                                                                        processExec.destroy();
                                                                                                        throw th;
                                                                                                    } catch (Exception unused2) {
                                                                                                        throw th;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                i19 = i13;
                                                                                            }
                                                                                            nanos = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - jNanoTime);
                                                                                            if (nanos <= 0) {
                                                                                                break;
                                                                                            }
                                                                                            i13 = i19;
                                                                                        } catch (InterruptedException e3) {
                                                                                            throw e3;
                                                                                        } catch (Throwable th7) {
                                                                                            th = th7;
                                                                                            processExec.destroy();
                                                                                            throw th;
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    dataOutputStream.close();
                                                                                                                    while (true) {
                                                                                                                        if (i20 < length2) {
                                                                                                                            str4 = strArrSplit2[i20];
                                                                                                                            char keyRepeatDelay2 = (char) (48903 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                                                                            int iIndexOf6 = TextUtils.indexOf("", "", 0, 0) + 28;
                                                                                                                            int i152 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                                                                                            objArr2 = new Object[1];
                                                                                                                            e(keyRepeatDelay2, iIndexOf6, (i152 & 19) + (i152 | 19), objArr2);
                                                                                                                            if (str4.startsWith((String) objArr2[0])) {
                                                                                                                                str5 = str3;
                                                                                                                            } else {
                                                                                                                                objArr3 = new Object[1];
                                                                                                                                c(new char[]{48256, 11760, 20724, 21443}, new char[]{5165, 21104, 62501, 62259}, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0), new char[]{22220, 13395, 59487, 25227, 47039, 44640, 63585, 19239, 58628, 31478, 5342, 33622, 4419, 39435, 47234, 32246, 42575, 49180, 31771, 24722}, objArr3);
                                                                                                                                if (str4.startsWith((String) objArr3[0])) {
                                                                                                                                    str5 = str3;
                                                                                                                                } else {
                                                                                                                                    objArr4 = new Object[1];
                                                                                                                                    c(new char[]{48256, 11760, 20724, 21443}, new char[]{40309, 30693, 64624, 16340}, (char) TextUtils.indexOf("", "", 0), (-2) - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), new char[]{57926, 52255, 49696, 22396, 6197, 37019, 38508, 56465}, objArr4);
                                                                                                                                    if (str4.startsWith((String) objArr4[0])) {
                                                                                                                                        int i153 = -Process.getGidForName("");
                                                                                                                                        int i154 = -MotionEvent.axisFromString("");
                                                                                                                                        int iB4 = VoucherRequest.b();
                                                                                                                                        int i155 = (i154 * (-1975)) - (-45494);
                                                                                                                                        int i156 = ~i154;
                                                                                                                                        int i157 = (i156 & 46) | (i156 ^ 46);
                                                                                                                                        int i158 = ~i157;
                                                                                                                                        int i159 = ((i158 & iB4) | (iB4 ^ i158)) * 988;
                                                                                                                                        int i160 = ((i155 | i159) << 1) - (i155 ^ i159);
                                                                                                                                        int i161 = ~(((-47) & i154) | ((-47) ^ i154));
                                                                                                                                        int i162 = ~iB4;
                                                                                                                                        int i163 = (i160 - (~(-(-(((~((i154 & i162) | (i162 ^ i154))) | i161) * (-1976)))))) - 1;
                                                                                                                                        int i164 = ~i157;
                                                                                                                                        int i165 = ~((iB4 & (-47)) | ((-47) ^ iB4));
                                                                                                                                        int i166 = (i164 & i165) | (i164 ^ i165);
                                                                                                                                        int i167 = ~((i162 ^ 46) | (i162 & 46));
                                                                                                                                        Object[] objArr37 = new Object[1];
                                                                                                                                        e((char) ((i153 ^ (-1)) + (i153 << 1)), i163 + (((i166 & i167) | (i166 ^ i167)) * 988), -TextUtils.indexOf((CharSequence) "", '0', 0), objArr37);
                                                                                                                                        strArrSplit3 = str4.split((String) objArr37[0]);
                                                                                                                                        if (strArrSplit3.length > 1) {
                                                                                                                                            str5 = str3;
                                                                                                                                            if (strArrSplit3[1].equalsIgnoreCase(str5)) {
                                                                                                                                                int i168 = (~(i5 & 20)) & (i5 | 20);
                                                                                                                                                int i169 = (~(i5 & i6)) & (i5 | i6);
                                                                                                                                                int i170 = -i169;
                                                                                                                                                int i171 = ((i169 & i170) | (i169 ^ i170)) >> 31;
                                                                                                                                                int i172 = i168 & (~i171);
                                                                                                                                                int i173 = i6 & i171;
                                                                                                                                                i6 = (i172 & i173) | (i172 ^ i173);
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            str5 = str3;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        str5 = str3;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i20++;
                                                                                                                            str3 = str5;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } catch (InterruptedException e4) {
                                                                                                                    e = e4;
                                                                                                                    throw e;
                                                                                                                }
                                                                                                            } catch (IOException unused3) {
                                                                                                            }
                                                                                                            StringBuilder sb2 = new StringBuilder();
                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                                                                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                                                                int i174 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2141;
                                                                                                                int i175 = 46 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                                                byte[] bArr8 = $$d;
                                                                                                                byte b10 = bArr8[2];
                                                                                                                Object[] objArr38 = new Object[1];
                                                                                                                g(b10, (byte) (b10 + 1), bArr8[7], objArr38);
                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, i174, i175, 399405187, false, (String) objArr38[0], null);
                                                                                                            }
                                                                                                            sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance).toString());
                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                                                                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                                                                                int iRgb = (-16775074) - Color.rgb(0, 0, 0);
                                                                                                                int mirror = ']' - AndroidCharacter.getMirror('0');
                                                                                                                byte[] bArr9 = $$d;
                                                                                                                byte b11 = bArr9[2];
                                                                                                                Object[] objArr39 = new Object[1];
                                                                                                                g(b11, (byte) (b11 + 1), bArr9[7], objArr39);
                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, iRgb, mirror, 399405187, false, (String) objArr39[0], null);
                                                                                                            }
                                                                                                            sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance2).toString());
                                                                                                            String string2 = sb2.toString();
                                                                                                            int i176 = -TextUtils.lastIndexOf("", '0', 0);
                                                                                                            int iB5 = VoucherRequest.b();
                                                                                                            int i177 = ~i176;
                                                                                                            int i178 = ~(i177 | (-34817));
                                                                                                            int i179 = ~((i177 ^ iB5) | (i177 & iB5));
                                                                                                            int i180 = (i178 & i179) | (i178 ^ i179);
                                                                                                            int i181 = ~(((-34817) & iB5) | ((-34817) ^ iB5));
                                                                                                            int i182 = (((i176 * 881) + 30672896) - (~(((i181 & i180) | (i180 ^ i181)) * (-880)))) - 1;
                                                                                                            int i183 = ~iB5;
                                                                                                            int i184 = ~((i177 & i183) | (i177 ^ i183));
                                                                                                            int i185 = (i184 & 34816) | (i184 ^ 34816);
                                                                                                            int i186 = ~((i176 & iB5) | (i176 ^ iB5));
                                                                                                            int i187 = i182 + (((i185 ^ i186) | (i185 & i186)) * (-880));
                                                                                                            int i188 = -(-(i186 * 880));
                                                                                                            char c5 = (char) ((i187 & i188) + (i188 | i187));
                                                                                                            int iResolveSize = View.resolveSize(0, 0);
                                                                                                            int iB6 = VoucherRequest.b();
                                                                                                            int i189 = ~iB6;
                                                                                                            int i190 = ~((i189 ^ 22) | (i189 & 22));
                                                                                                            int i191 = (((((iResolveSize * 522) - 11440) - (~(-(-(((i190 & iResolveSize) | (iResolveSize ^ i190)) * (-1042)))))) - 1) - (~((iB6 | 22) * 521))) - 1;
                                                                                                            int i192 = ~iResolveSize;
                                                                                                            int i193 = ~((i192 ^ (-23)) | (i192 & (-23)));
                                                                                                            int i194 = ~((iB6 & i192) | (i192 ^ iB6));
                                                                                                            int i195 = (i194 & i193) | (i193 ^ i194);
                                                                                                            int i196 = ~((iResolveSize & i189) | (i189 ^ iResolveSize) | 22);
                                                                                                            int i197 = ((i195 & i196) | (i195 ^ i196)) * 521;
                                                                                                            Object[] objArr40 = new Object[1];
                                                                                                            e(c5, (i191 ^ i197) + ((i197 & i191) << 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr40);
                                                                                                            strArrSplit2 = string2.split((String) objArr40[0]);
                                                                                                            length2 = strArrSplit2.length;
                                                                                                            i20 = 0;
                                                                                                        } catch (Exception unused4) {
                                                                                                            int i198 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                                                            char c6 = (char) (((i198 | 28153) << 1) - (i198 ^ 28153));
                                                                                                            int i199 = -TextUtils.getOffsetAfter("", 0);
                                                                                                            Object[] objArr41 = new Object[1];
                                                                                                            c(new char[]{48256, 11760, 20724, 21443}, new char[]{52608, 39160, 63659, 38253}, c6, (i199 & (-1416038195)) + (i199 | (-1416038195)), new char[]{65192, 2662, 1589, 51424, 3074, 17311, 22039, 5257, 61338, 51553, 55203, 27916, 46035, 53332, 7415, 63602, 24417, 10757, 53157, 30996, 18936, 2249, 47994, 27432, 12732, 16076, 41741}, objArr41);
                                                                                                            throw new IOException((String) objArr41[0]);
                                                                                                        }
                                                                                                        processExec.destroy();
                                                                                                    } catch (Exception unused5) {
                                                                                                    }
                                                                                                } catch (IOException unused6) {
                                                                                                }
                                                                                                Object[] objArr42 = new Object[1];
                                                                                                f((byte) (bArr[45] - 1), bArr[9], bArr[3], objArr42);
                                                                                                Class<?> cls10 = Class.forName((String) objArr42[0]);
                                                                                                Object[] objArr43 = new Object[1];
                                                                                                f(b, bArr[9], bArr[21], objArr43);
                                                                                                cls10.getMethod((String) objArr43[0], Long.TYPE).invoke(objNewInstance2, 10L);
                                                                                            } catch (Throwable th8) {
                                                                                                Throwable cause3 = th8.getCause();
                                                                                                if (cause3 != null) {
                                                                                                    throw cause3;
                                                                                                }
                                                                                                throw th8;
                                                                                            }
                                                                                            byte[] bArr10 = $$a;
                                                                                            Object[] objArr44 = new Object[1];
                                                                                            f((byte) (bArr10[45] - 1), bArr10[9], bArr10[3], objArr44);
                                                                                            Class<?> cls11 = Class.forName((String) objArr44[0]);
                                                                                            byte b12 = (byte) 30;
                                                                                            Object[] objArr45 = new Object[1];
                                                                                            f(b12, bArr10[9], bArr10[21], objArr45);
                                                                                            cls11.getMethod((String) objArr45[0], Long.TYPE).invoke(objNewInstance, 100L);
                                                                                        } catch (Throwable th9) {
                                                                                            Throwable cause4 = th9.getCause();
                                                                                            if (cause4 != null) {
                                                                                                throw cause4;
                                                                                            }
                                                                                            throw th9;
                                                                                        }
                                                                                    } catch (Throwable th10) {
                                                                                        th = th10;
                                                                                        th = th;
                                                                                        processExec.destroy();
                                                                                        throw th;
                                                                                    }
                                                                                } catch (InterruptedException e5) {
                                                                                    e = e5;
                                                                                } catch (Throwable th11) {
                                                                                    th = th11;
                                                                                }
                                                                            } catch (IOException unused7) {
                                                                                i19 = i13;
                                                                            } catch (Exception unused8) {
                                                                                int i1910 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                                char c7 = (char) (((i1910 | 28153) << 1) - (i1910 ^ 28153));
                                                                                int i1911 = -TextUtils.getOffsetAfter("", 0);
                                                                                Object[] objArr46 = new Object[1];
                                                                                c(new char[]{48256, 11760, 20724, 21443}, new char[]{52608, 39160, 63659, 38253}, c7, (i1911 & (-1416038195)) + (i1911 | (-1416038195)), new char[]{65192, 2662, 1589, 51424, 3074, 17311, 22039, 5257, 61338, 51553, 55203, 27916, 46035, 53332, 7415, 63602, 24417, 10757, 53157, 30996, 18936, 2249, 47994, 27432, 12732, 16076, 41741}, objArr46);
                                                                                throw new IOException((String) objArr46[0]);
                                                                            }
                                                                        } catch (Throwable th12) {
                                                                            Throwable cause5 = th12.getCause();
                                                                            if (cause5 != null) {
                                                                                throw cause5;
                                                                            }
                                                                            throw th12;
                                                                        }
                                                                    } catch (Throwable th13) {
                                                                        th = th13;
                                                                        Throwable th14 = th;
                                                                        Throwable cause6 = th14.getCause();
                                                                        if (cause6 != null) {
                                                                            throw cause6;
                                                                        }
                                                                        throw th14;
                                                                    }
                                                                } catch (Throwable th15) {
                                                                    th = th15;
                                                                }
                                                            } catch (Throwable th16) {
                                                                Throwable cause7 = th16.getCause();
                                                                if (cause7 != null) {
                                                                    throw cause7;
                                                                }
                                                                throw th16;
                                                            }
                                                        } catch (Throwable th17) {
                                                            Throwable cause8 = th17.getCause();
                                                            if (cause8 != null) {
                                                                throw cause8;
                                                            }
                                                            throw th17;
                                                        }
                                                    } catch (IOException unused9) {
                                                        i6 = i6;
                                                    } catch (Exception unused10) {
                                                    }
                                                } catch (IOException unused11) {
                                                    obj6 = obj5;
                                                    i18 = i16;
                                                    i19 = i13;
                                                    i6 = i6;
                                                    i16 = i18 + 1;
                                                    i13 = i19;
                                                    strArrSplit = strArr2;
                                                    length = i17;
                                                    obj5 = obj6;
                                                    i15 = 0;
                                                } catch (Exception unused12) {
                                                    int i1912 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    char c8 = (char) (((i1912 | 28153) << 1) - (i1912 ^ 28153));
                                                    int i1913 = -TextUtils.getOffsetAfter("", 0);
                                                    Object[] objArr47 = new Object[1];
                                                    c(new char[]{48256, 11760, 20724, 21443}, new char[]{52608, 39160, 63659, 38253}, c8, (i1913 & (-1416038195)) + (i1913 | (-1416038195)), new char[]{65192, 2662, 1589, 51424, 3074, 17311, 22039, 5257, 61338, 51553, 55203, 27916, 46035, 53332, 7415, 63602, 24417, 10757, 53157, 30996, 18936, 2249, 47994, 27432, 12732, 16076, 41741}, objArr47);
                                                    throw new IOException((String) objArr47[0]);
                                                }
                                            } catch (Exception unused13) {
                                            }
                                        } catch (IOException unused14) {
                                            strArr2 = strArrSplit;
                                            i17 = length;
                                        }
                                    }
                                    i16 = i18 + 1;
                                    i13 = i19;
                                    strArrSplit = strArr2;
                                    length = i17;
                                    obj5 = obj6;
                                    i15 = 0;
                                } else {
                                    i6 = i6;
                                    strArr2 = strArrSplit;
                                    i17 = length;
                                    obj6 = obj5;
                                    i18 = i16;
                                    i19 = i13;
                                }
                                i6 = i6;
                                i16 = i18 + 1;
                                i13 = i19;
                                strArrSplit = strArr2;
                                length = i17;
                                obj5 = obj6;
                                i15 = 0;
                            }
                            obj = obj5;
                            i4 = i13;
                        } else {
                            i9 = iIndexOf2;
                            obj2 = objInvoke;
                            i5 = i26;
                            i10 = 0;
                            int i610 = -i10;
                            int i611 = ((i10 & i610) | (i10 ^ i610)) >> 31;
                            int i612 = (~i611) & i5;
                            int i613 = i611 & ((i5 & (-21)) | (i34 & 20));
                            int i614 = (i613 & i612) | (i612 ^ i613);
                            byte[] bArr11 = $$a;
                            Object[] objArr110 = new Object[1];
                            f(bArr11[28], bArr11[35], bArr11[13], objArr110);
                            Class<?> cls12 = Class.forName((String) objArr110[0]);
                            Object[] objArr111 = new Object[1];
                            f(bArr11[40], bArr11[50], (byte) ($$b & 112), objArr111);
                            Field field2 = cls12.getField((String) objArr111[0]);
                            obj3 = obj2;
                            str = (String) field2.get(obj3);
                            int length5 = str.length();
                            i11 = 1;
                            i12 = (length5 ^ (-6)) + ((length5 & (-6)) << 1);
                            if (i12 >= 0) {
                                obj4 = obj3;
                                i13 = i34;
                                i14 = 0;
                                break;
                            }
                            i21 = 0;
                            while (true) {
                                if (i21 <= i12) {
                                    obj4 = obj3;
                                    i13 = i34;
                                    i14 = 0;
                                    break;
                                }
                                String strSubstring4 = str.substring(i21, (i21 ^ 6) + ((i21 & 6) << i11));
                                Object[] objArr112 = new Object[2];
                                objArr112[i11] = 931995;
                                objArr112[0] = strSubstring4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                                    int i615 = 3394 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    int packedPositionType2 = 9 - ExpandableListView.getPackedPositionType(0L);
                                    byte[] bArr12 = $$d;
                                    byte b13 = bArr12[2];
                                    Object[] objArr113 = new Object[1];
                                    g(b13, (byte) (b13 & 14), (byte) (bArr12[7] - 1), objArr113);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf2, i615, packedPositionType2, 1203525406, false, (String) objArr113[0], new Class[]{String.class, Integer.TYPE});
                                }
                                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr112)).longValue();
                                long j13 = 1378159371;
                                str6 = str;
                                obj4 = obj3;
                                i22 = i21;
                                i23 = i12;
                                long j14 = -1;
                                long j15 = jLongValue3 ^ j14;
                                i13 = i34;
                                long jFreeMemory2 = ((long) ((int) Runtime.getRuntime().freeMemory())) ^ j14;
                                long j16 = 933;
                                j = (((long) 934) * j13) + (((long) (-932)) * jLongValue3) + (((long) (-933)) * (j15 | (((j13 ^ j14) | jFreeMemory2) ^ j14))) + ((((j15 | jFreeMemory2) ^ j14) | ((j15 | j13) ^ j14)) * j16) + (j16 * (j14 ^ (jLongValue3 | j13))) + ((long) (-1380229248));
                                int iMyUid2 = Process.myUid();
                                int i616 = ~iMyUid2;
                                int i617 = (-582312778) + (((~((-577866788) | i616)) | 538017794) * (-1188));
                                int i618 = (~(iMyUid2 | 577866787)) | 538017794;
                                int i710 = ~(2015093198 | i616);
                                i24 = ((int) (j >> 32)) & (i617 + ((i618 | i710) * 594) + (((~(577866787 | i616)) | (-2054942192) | i710) * 594));
                                i25 = ~((-590209) | i5);
                                if ((i24 | (((int) j) & (1905508913 + ((675317761 | i25) * (-476)) + (i25 * 952) + ((~((-590209) | i13)) * 476)))) == -2096167706) {
                                    i14 = 1;
                                    break;
                                }
                                i21 = i22 + 1;
                                i34 = i13;
                                obj3 = obj4;
                                str = str6;
                                i12 = i23;
                                i11 = 1;
                            }
                            int i711 = -i14;
                            int i712 = ((i14 & i711) | (i14 ^ i711)) >> 31;
                            int i713 = (~i712) & i5;
                            int i714 = i712 & (i5 ^ 20);
                            int i715 = ((~i614) & i5) | (i614 & i13);
                            int i716 = (i715 | (-i715)) >> 31;
                            int i717 = ((i714 & i713) | (i713 ^ i714)) & (~i716);
                            int i718 = i614 & i716;
                            i6 = (i718 & i717) | (i717 ^ i718);
                            byte[] bArr13 = $$a;
                            Object[] objArr114 = new Object[1];
                            f(bArr13[28], bArr13[35], bArr13[13], objArr114);
                            Class<?> cls13 = Class.forName((String) objArr114[0]);
                            Object[] objArr210 = new Object[1];
                            f(bArr13[40], bArr13[50], (byte) ($$b & 112), objArr210);
                            obj5 = obj4;
                            String str13 = (String) cls13.getField((String) objArr210[0]).get(obj5);
                            int i719 = i9;
                            int i810 = ~i719;
                            String strSubstring5 = str13.substring(0, i719 & ((i810 | (-i810)) >> 31));
                            char c9 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0);
                            int iB7 = VoucherRequest.b();
                            int i811 = (absoluteGravity2 * (-183)) + 3330;
                            int i812 = ~absoluteGravity2;
                            int i813 = ((i812 ^ 18) | (i812 & 18)) * (-368);
                            int i814 = (i811 & i813) + (i811 | i813);
                            int i815 = (absoluteGravity2 ^ (-19)) | (absoluteGravity2 & (-19));
                            int i816 = ~iB7;
                            int i817 = i814 + (((i815 & i816) | (i815 ^ i816)) * 184);
                            int i818 = ~(i812 | (-19));
                            int i819 = ~((i816 & absoluteGravity2) | (i816 ^ absoluteGravity2));
                            int i910 = (i819 & i818) | (i818 ^ i819);
                            int i911 = ~((absoluteGravity2 & 18) | (absoluteGravity2 ^ 18));
                            int i912 = -(-(((i910 & i911) | (i910 ^ i911)) * 184));
                            i15 = 0;
                            Object[] objArr211 = new Object[1];
                            e(c9, (i817 ^ i912) + ((i912 & i817) << 1), -TextUtils.lastIndexOf("", '0', 0), objArr211);
                            strArrSplit = strSubstring5.split((String) objArr211[0]);
                            length = strArrSplit.length;
                            i16 = 0;
                            while (i16 < length) {
                                str2 = strArrSplit[i16];
                                char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(i15, i15);
                                int maximumFlingVelocity2 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                int i913 = ((maximumFlingVelocity2 | 19) << 1) - (maximumFlingVelocity2 ^ 19);
                                int threadPriority2 = Process.getThreadPriority(i15);
                                int i914 = (((threadPriority2 | 20) << 1) - (threadPriority2 ^ 20)) >> 6;
                                int i915 = (i914 & 3) + (i914 | 3);
                                objArr = new Object[1];
                                e(cCombineMeasuredStates2, i913, i915, objArr);
                                if (str2.split((String) objArr[0]).length > 1) {
                                    synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getCapsMode("", 0, 0), View.resolveSizeAndState(0, 0, 0) + 2267, 33 - TextUtils.getOffsetBefore("", 0)))) {
                                        Object[] objArr212 = new Object[1];
                                        c(new char[]{48256, 11760, 20724, 21443}, new char[]{44281, 17748, 41773, 11741}, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 56739), View.getDefaultSize(0, 0), new char[]{55559, 5108, 38884, 22441, 18710, 27082, 58769, 47163, 1590, 3414, 47769, 46047, 39334, 41025, 54477, 61705}, objArr212);
                                        String str14 = (String) objArr212[0];
                                        Runtime runtime2 = Runtime.getRuntime();
                                        char[] cArr3 = {48256, 11760, 20724, 21443};
                                        char[] cArr4 = {64639, 19829, 7207, 299};
                                        int i916 = -(ViewConfiguration.getTapTimeout() >> 16);
                                        char c10 = (char) (((i916 | 11036) << 1) - (i916 ^ 11036));
                                        strArr2 = strArrSplit;
                                        i17 = length;
                                        int iIndexOf7 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                        int iB8 = VoucherRequest.b();
                                        int i917 = iIndexOf7 * 284;
                                        obj6 = obj5;
                                        int i918 = (i917 ^ (-282)) + ((i917 & (-282)) << 1);
                                        int i919 = ~iIndexOf7;
                                        i18 = i16;
                                        int i1010 = ~((i919 ^ 1) | (i919 & 1));
                                        int i1011 = ~((i919 ^ iB8) | (i919 & iB8));
                                        int i1012 = (i918 - (~(-(-(((i1010 ^ i1011) | (i1011 & i1010)) * (-283)))))) - 1;
                                        int i1013 = (~(((-2) ^ iIndexOf7) | ((-2) & iIndexOf7))) * 283;
                                        int i1014 = ((i1012 | i1013) << 1) - (i1012 ^ i1013);
                                        int i1015 = ~iIndexOf7;
                                        int i1016 = (i1015 & (-2)) | (i1015 ^ (-2));
                                        Object[] objArr213 = new Object[1];
                                        c(cArr3, cArr4, c10, i1014 + ((~((iB8 & i1016) | (i1016 ^ iB8))) * 283), new char[]{38869, 14990}, objArr213);
                                        processExec = runtime2.exec((String) objArr213[0], (String[]) null, (File) null);
                                        Object[] objArr214 = {processExec.getInputStream()};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AndroidCharacter.getMirror('0') - '0'), 2143 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                        }
                                        Object objNewInstance3 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr214);
                                        Object[] objArr215 = {processExec.getErrorStream()};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 2142 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                        }
                                        Object objNewInstance4 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr215);
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                                        byte[] bArr14 = $$a;
                                        i6 = i6;
                                        Object[] objArr216 = new Object[1];
                                        f((byte) (bArr14[45] - 1), bArr14[9], bArr14[3], objArr216);
                                        Class<?> cls14 = Class.forName((String) objArr216[0]);
                                        b2 = (byte) 29;
                                        byte b14 = bArr14[28];
                                        str3 = str2;
                                        Object[] objArr217 = new Object[1];
                                        f(b2, b14, (byte) (b14 | 53), objArr217);
                                        cls14.getMethod((String) objArr217[0], null).invoke(objNewInstance3, null);
                                        Object[] objArr218 = new Object[1];
                                        f((byte) (bArr14[45] - 1), bArr14[9], bArr14[3], objArr218);
                                        Class<?> cls15 = Class.forName((String) objArr218[0]);
                                        byte b15 = bArr14[28];
                                        Object[] objArr219 = new Object[1];
                                        f(b2, b15, (byte) (b15 | 53), objArr219);
                                        cls15.getMethod((String) objArr219[0], null).invoke(objNewInstance4, null);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(str14);
                                        int i1017 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                        int i1018 = iIndexOf8 * 221;
                                        int i1019 = ((i1018 | (-5037)) << 1) - (i1018 ^ (-5037));
                                        int i1110 = ~iIndexOf8;
                                        int i1111 = ~((i1110 & (-24)) | (i1110 ^ (-24)));
                                        int i1112 = i13 | iIndexOf8;
                                        int i1113 = ~((i1112 & 23) | (i1112 ^ 23));
                                        int i1114 = ((i1111 & i1113) | (i1111 ^ i1113)) * 220;
                                        int i1115 = (i1019 & i1114) + (i1114 | i1019);
                                        int i1116 = ~i5;
                                        int i1117 = ~((i1116 ^ 23) | (i1116 & 23));
                                        int i1118 = ((i1117 & iIndexOf8) | (iIndexOf8 ^ i1117)) * (-440);
                                        int i1119 = (i1115 ^ i1118) + ((i1115 & i1118) << 1);
                                        int i1210 = -(-((iIndexOf8 | 23 | i5) * 220));
                                        Object[] objArr310 = new Object[1];
                                        e((char) ((i1017 ^ 34817) + ((i1017 & 34817) << 1)), ((i1119 | i1210) << 1) - (i1210 ^ i1119), 0 - (~(-TextUtils.getCapsMode("", 0, 0))), objArr310);
                                        sb3.append((String) objArr310[0]);
                                        String string3 = sb3.toString();
                                        int scrollDefaultDelay2 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                        int i1211 = scrollDefaultDelay2 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                                        int i1212 = ((i1211 | 5294075) << 1) - (i1211 ^ 5294075);
                                        int i1213 = (scrollDefaultDelay2 ^ 10525) | (scrollDefaultDelay2 & 10525);
                                        int i1214 = i1213 * (-502);
                                        int i1215 = (i1212 ^ i1214) + ((i1212 & i1214) << 1);
                                        int i1216 = ~scrollDefaultDelay2;
                                        int i1217 = ~((i1216 ^ (-10526)) | (i1216 & (-10526)));
                                        int i1218 = ~scrollDefaultDelay2;
                                        int i1219 = ~((i1218 ^ i13) | (i1218 & i13));
                                        int i1310 = (i1217 ^ i1219) | (i1217 & i1219);
                                        int i1311 = (i1213 & i5) | (i1213 ^ i5);
                                        int i1312 = ~i1311;
                                        int i1313 = -(-(((i1310 ^ i1312) | (i1310 & i1312)) * (-502)));
                                        int i1314 = ((i1215 | i1313) << 1) - (i1215 ^ i1313);
                                        int i1315 = i1218 | i13;
                                        int i1316 = ~((i1315 & 10525) | (i1315 ^ 10525));
                                        int i1317 = ~i1311;
                                        int i1318 = -(-(((i1316 & i1317) | (i1316 ^ i1317)) * TypedValues.PositionType.TYPE_DRAWPATH));
                                        Object[] objArr311 = new Object[1];
                                        c(new char[]{48256, 11760, 20724, 21443}, new char[]{62794, 34102, 7482, 22569}, (char) (((i1314 | i1318) << 1) - (i1318 ^ i1314)), 981808886 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{53305, 54572, 31618, 36455, 11702}, objArr311);
                                        dataOutputStream2.write(string3.getBytes((String) objArr311[0]));
                                        dataOutputStream2.flush();
                                        int i1319 = -(-Color.rgb(0, 0, 0));
                                        int i1410 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        int i1411 = (i1410 & 22) + (i1410 | 22);
                                        int i1412 = -(ViewConfiguration.getTapTimeout() >> 16);
                                        int i1413 = (i1412 ^ 5) + ((i1412 & 5) << 1);
                                        Object[] objArr312 = new Object[1];
                                        e((char) (((i1319 | 16777216) << 1) - (i1319 ^ 16777216)), i1411, i1413, objArr312);
                                        String str15 = (String) objArr312[0];
                                        int i1414 = -KeyEvent.getDeadChar(0, 0);
                                        int i1415 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        int i1416 = ~(((-981808885) ^ i1116) | (i1116 & (-981808885)));
                                        int i1417 = ~((i1415 ^ i5) | (i1415 & i5));
                                        int i1418 = (((i1415 * 960) - 931954980) - (~(((i1416 ^ i1417) | (i1416 & i1417)) * 959))) - 1;
                                        int i1419 = (i1418 & 956882891) + (956882891 | i1418);
                                        int i1510 = ((~(((-981808885) & i5) | ((-981808885) ^ i5))) | (~((i1415 & i13) | (i13 ^ i1415)))) * 959;
                                        Object[] objArr313 = new Object[1];
                                        c(new char[]{48256, 11760, 20724, 21443}, new char[]{62794, 34102, 7482, 22569}, (char) (((i1414 | 10525) << 1) - (i1414 ^ 10525)), (i1419 ^ i1510) + ((i1510 & i1419) << 1), new char[]{53305, 54572, 31618, 36455, 11702}, objArr313);
                                        dataOutputStream2.write(str15.getBytes((String) objArr313[0]));
                                        dataOutputStream2.flush();
                                        long jNanoTime2 = System.nanoTime();
                                        long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L);
                                        while (true) {
                                            processExec.exitValue();
                                            i19 = i13;
                                            break;
                                        }
                                        dataOutputStream2.close();
                                        byte[] bArr15 = $$a;
                                        Object[] objArr48 = new Object[1];
                                        f((byte) (bArr15[45] - 1), bArr15[9], bArr15[3], objArr48);
                                        Class<?> cls16 = Class.forName((String) objArr48[0]);
                                        byte b16 = (byte) 30;
                                        Object[] objArr49 = new Object[1];
                                        f(b16, bArr15[9], bArr15[21], objArr49);
                                        cls16.getMethod((String) objArr49[0], Long.TYPE).invoke(objNewInstance3, 100L);
                                        Object[] objArr410 = new Object[1];
                                        f((byte) (bArr15[45] - 1), bArr15[9], bArr15[3], objArr410);
                                        Class<?> cls17 = Class.forName((String) objArr410[0]);
                                        Object[] objArr411 = new Object[1];
                                        f(b16, bArr15[9], bArr15[21], objArr411);
                                        cls17.getMethod((String) objArr411[0], Long.TYPE).invoke(objNewInstance4, 10L);
                                        processExec.destroy();
                                        StringBuilder sb4 = new StringBuilder();
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            int i1710 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2141;
                                            int i1711 = 46 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            byte[] bArr16 = $$d;
                                            byte b17 = bArr16[2];
                                            Object[] objArr314 = new Object[1];
                                            g(b17, (byte) (b17 + 1), bArr16[7], objArr314);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout2, i1710, i1711, 399405187, false, (String) objArr314[0], null);
                                        }
                                        sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance3).toString());
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                            int iRgb2 = (-16775074) - Color.rgb(0, 0, 0);
                                            int mirror2 = ']' - AndroidCharacter.getMirror('0');
                                            byte[] bArr17 = $$d;
                                            byte b18 = bArr17[2];
                                            Object[] objArr315 = new Object[1];
                                            g(b18, (byte) (b18 + 1), bArr17[7], objArr315);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration2, iRgb2, mirror2, 399405187, false, (String) objArr315[0], null);
                                        }
                                        sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance4).toString());
                                        String string4 = sb4.toString();
                                        int i1712 = -TextUtils.lastIndexOf("", '0', 0);
                                        int iB9 = VoucherRequest.b();
                                        int i1713 = ~i1712;
                                        int i1714 = ~(i1713 | (-34817));
                                        int i1715 = ~((i1713 ^ iB9) | (i1713 & iB9));
                                        int i1810 = (i1714 & i1715) | (i1714 ^ i1715);
                                        int i1811 = ~(((-34817) & iB9) | ((-34817) ^ iB9));
                                        int i1812 = (((i1712 * 881) + 30672896) - (~(((i1811 & i1810) | (i1810 ^ i1811)) * (-880)))) - 1;
                                        int i1813 = ~iB9;
                                        int i1814 = ~((i1713 & i1813) | (i1713 ^ i1813));
                                        int i1815 = (i1814 & 34816) | (i1814 ^ 34816);
                                        int i1816 = ~((i1712 & iB9) | (i1712 ^ iB9));
                                        int i1817 = i1812 + (((i1815 ^ i1816) | (i1815 & i1816)) * (-880));
                                        int i1818 = -(-(i1816 * 880));
                                        char c11 = (char) ((i1817 & i1818) + (i1818 | i1817));
                                        int iResolveSize2 = View.resolveSize(0, 0);
                                        int iB10 = VoucherRequest.b();
                                        int i1819 = ~iB10;
                                        int i1914 = ~((i1819 ^ 22) | (i1819 & 22));
                                        int i1915 = (((((iResolveSize2 * 522) - 11440) - (~(-(-(((i1914 & iResolveSize2) | (iResolveSize2 ^ i1914)) * (-1042)))))) - 1) - (~((iB10 | 22) * 521))) - 1;
                                        int i1916 = ~iResolveSize2;
                                        int i1917 = ~((i1916 ^ (-23)) | (i1916 & (-23)));
                                        int i1918 = ~((iB10 & i1916) | (i1916 ^ iB10));
                                        int i1919 = (i1918 & i1917) | (i1917 ^ i1918);
                                        int i1920 = ~((iResolveSize2 & i1819) | (i1819 ^ iResolveSize2) | 22);
                                        int i1921 = ((i1919 & i1920) | (i1919 ^ i1920)) * 521;
                                        Object[] objArr412 = new Object[1];
                                        e(c11, (i1915 ^ i1921) + ((i1921 & i1915) << 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr412);
                                        strArrSplit2 = string4.split((String) objArr412[0]);
                                        length2 = strArrSplit2.length;
                                        i20 = 0;
                                        while (true) {
                                            if (i20 < length2) {
                                                str4 = strArrSplit2[i20];
                                                char keyRepeatDelay3 = (char) (48903 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                int iIndexOf9 = TextUtils.indexOf("", "", 0, 0) + 28;
                                                int i1511 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                objArr2 = new Object[1];
                                                e(keyRepeatDelay3, iIndexOf9, (i1511 & 19) + (i1511 | 19), objArr2);
                                                if (str4.startsWith((String) objArr2[0])) {
                                                    objArr3 = new Object[1];
                                                    c(new char[]{48256, 11760, 20724, 21443}, new char[]{5165, 21104, 62501, 62259}, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0), new char[]{22220, 13395, 59487, 25227, 47039, 44640, 63585, 19239, 58628, 31478, 5342, 33622, 4419, 39435, 47234, 32246, 42575, 49180, 31771, 24722}, objArr3);
                                                    if (str4.startsWith((String) objArr3[0])) {
                                                        objArr4 = new Object[1];
                                                        c(new char[]{48256, 11760, 20724, 21443}, new char[]{40309, 30693, 64624, 16340}, (char) TextUtils.indexOf("", "", 0), (-2) - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), new char[]{57926, 52255, 49696, 22396, 6197, 37019, 38508, 56465}, objArr4);
                                                        if (str4.startsWith((String) objArr4[0])) {
                                                            int i1512 = -Process.getGidForName("");
                                                            int i1513 = -MotionEvent.axisFromString("");
                                                            int iB11 = VoucherRequest.b();
                                                            int i1514 = (i1513 * (-1975)) - (-45494);
                                                            int i1515 = ~i1513;
                                                            int i1516 = (i1515 & 46) | (i1515 ^ 46);
                                                            int i1517 = ~i1516;
                                                            int i1518 = ((i1517 & iB11) | (iB11 ^ i1517)) * 988;
                                                            int i1610 = ((i1514 | i1518) << 1) - (i1514 ^ i1518);
                                                            int i1611 = ~(((-47) & i1513) | ((-47) ^ i1513));
                                                            int i1612 = ~iB11;
                                                            int i1613 = (i1610 - (~(-(-(((~((i1513 & i1612) | (i1612 ^ i1513))) | i1611) * (-1976)))))) - 1;
                                                            int i1614 = ~i1516;
                                                            int i1615 = ~((iB11 & (-47)) | ((-47) ^ iB11));
                                                            int i1616 = (i1614 & i1615) | (i1614 ^ i1615);
                                                            int i1617 = ~((i1612 ^ 46) | (i1612 & 46));
                                                            Object[] objArr316 = new Object[1];
                                                            e((char) ((i1512 ^ (-1)) + (i1512 << 1)), i1613 + (((i1616 & i1617) | (i1616 ^ i1617)) * 988), -TextUtils.indexOf((CharSequence) "", '0', 0), objArr316);
                                                            strArrSplit3 = str4.split((String) objArr316[0]);
                                                            if (strArrSplit3.length > 1) {
                                                                str5 = str3;
                                                                if (strArrSplit3[1].equalsIgnoreCase(str5)) {
                                                                    int i1618 = (~(i5 & 20)) & (i5 | 20);
                                                                    int i1619 = (~(i5 & i6)) & (i5 | i6);
                                                                    int i1716 = -i1619;
                                                                    int i1717 = ((i1619 & i1716) | (i1619 ^ i1716)) >> 31;
                                                                    int i1718 = i1618 & (~i1717);
                                                                    int i1719 = i6 & i1717;
                                                                    i6 = (i1718 & i1719) | (i1718 ^ i1719);
                                                                }
                                                            } else {
                                                                str5 = str3;
                                                            }
                                                        } else {
                                                            str5 = str3;
                                                        }
                                                    } else {
                                                        str5 = str3;
                                                    }
                                                } else {
                                                    str5 = str3;
                                                }
                                                i20++;
                                                str3 = str5;
                                            }
                                            i16 = i18 + 1;
                                            i13 = i19;
                                            strArrSplit = strArr2;
                                            length = i17;
                                            obj5 = obj6;
                                            i15 = 0;
                                        }
                                    }
                                } else {
                                    i6 = i6;
                                    strArr2 = strArrSplit;
                                    i17 = length;
                                    obj6 = obj5;
                                    i18 = i16;
                                    i19 = i13;
                                }
                                i6 = i6;
                                i16 = i18 + 1;
                                i13 = i19;
                                strArrSplit = strArr2;
                                length = i17;
                                obj5 = obj6;
                                i15 = 0;
                            }
                            obj = obj5;
                            i4 = i13;
                        }
                    } else {
                        obj = objInvoke;
                        i4 = i34;
                        i5 = i26;
                        i6 = i5;
                    }
                    byte[] bArr18 = $$a;
                    Object[] objArr50 = new Object[1];
                    f(bArr18[28], bArr18[35], bArr18[13], objArr50);
                    Class<?> cls18 = Class.forName((String) objArr50[0]);
                    Object[] objArr51 = new Object[1];
                    f(bArr18[40], bArr18[50], (byte) ($$b & 112), objArr51);
                    String[] strArr3 = {cls18.getField((String) objArr51[0]).get(obj)};
                    Object obj7 = new Object[]{new int[1], strArr3}[0];
                    ((int[]) obj7)[0] = i6;
                    i7 = ((int[]) obj7)[0];
                    String[] strArr4 = strArr3;
                    if ((i2 & 1) == 0) {
                        Object[] objArr52 = new Object[1];
                        c(new char[]{48256, 11760, 20724, 21443}, new char[]{12026, 42259, 31468, 30807}, (char) (22393 - (~(-(Process.myPid() >> 22)))), View.resolveSizeAndState(0, 0, 0) - 324725970, new char[]{22830, 27682, 51992, 24388, 57944, 65273, 24260, 54869, 5596, 18954, 48876, 34183, 52076}, objArr52);
                        try {
                            Object[] objArr53 = {(String) objArr52[0]};
                            char cGreen = (char) Color.green(0);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                            Object[] objArr54 = new Object[1];
                            c(new char[]{48256, 11760, 20724, 21443}, new char[]{20750, 14665, 33434, 63397}, cGreen, (iLastIndexOf & (-1707521710)) + (iLastIndexOf | (-1707521710)), new char[]{21217, 23316, 23410, 43929, 56000, 5069, 53375, 36314, 37626, 3610, 31638, 28845, 17096, 14790, 59662, 286, 6764, 25106, 10275, 54017, 31865, 45455, 62890}, objArr54);
                            Class<?> cls19 = Class.forName((String) objArr54[0]);
                            Object[] objArr55 = new Object[1];
                            c(new char[]{48256, 11760, 20724, 21443}, new char[]{50604, 41308, 46949, 64419}, (char) (41910 - TextUtils.lastIndexOf("", '0', 0, 0)), ViewConfiguration.getLongPressTimeout() >> 16, new char[]{44623, 63197, 32827, 2525, 48468, 31694, 40513, 63362, 61215, 30236, 61979, 26890, 53888, 24402, 47424, 30572}, objArr55);
                            Object objInvoke2 = cls19.getMethod((String) objArr55[0], String.class).invoke(context, objArr53);
                            if (objInvoke2 == null) {
                                strArr4 = strArr4;
                                i8 = i5;
                                break;
                            }
                            char cCombineMeasuredStates3 = (char) View.combineMeasuredStates(0, 0);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                            Object[] objArr56 = new Object[1];
                            c(new char[]{48256, 11760, 20724, 21443}, new char[]{58964, 21499, 18732, 61823}, cCombineMeasuredStates3, ((743701478 & iNormalizeMetaState) << 1) + (iNormalizeMetaState ^ 743701478), new char[]{32654, 1942, 61449, 25378, 22592, 48454, 43601, 53962, 8324, 13015, 5275, 61726, 34455, 33191, 64908, 47824, 29350, 17486, 54858, 33130, 24428, 28827, 43501, 36442, 10840, 58247, 43765, 21488, 6725, 14773, 51408, 27951, 3580, 58208, 3561, 16447, 52680}, objArr56);
                            Class<?> cls20 = Class.forName((String) objArr56[0]);
                            int i200 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                            char c12 = (char) (((i200 | 36655) << 1) - (i200 ^ 36655));
                            int i201 = -TextUtils.getTrimmedLength("");
                            int i202 = i201 * 1773;
                            int i203 = (i202 ^ (-1445913408)) + ((i202 & (-1445913408)) << 1);
                            int i204 = ~i201;
                            int i205 = (~((i204 & 1468846527) | (i204 ^ 1468846527))) | (~(1468846527 | i5));
                            int i206 = ~i5;
                            int i207 = (i206 ^ i201) | (i206 & i201);
                            int i208 = ~((i207 & (-1468846528)) | (i207 ^ (-1468846528)));
                            int i209 = ((i205 & i208) | (i205 ^ i208)) * 886;
                            Object[] objArr57 = new Object[1];
                            c(new char[]{48256, 11760, 20724, 21443}, new char[]{16432, 29486, 12200, 62095}, c12, (i203 & i209) + (i209 | i203) + (((~((i206 ^ (-1468846528)) | (i206 & (-1468846528)))) | i201) * (-1772)) + ((~(i4 | i201)) * 886), new char[]{20074, 36731, 35990, 28623, 41047, 41711, 63118, 14245, 43973, 38810, 8891, 4253, 57220, 20707, 296}, objArr57);
                            List list = (List) cls20.getMethod((String) objArr57[0], null).invoke(objInvoke2, null);
                            if (list == null) {
                                strArr4 = strArr4;
                                i8 = i5;
                                break;
                            }
                            Iterator it = list.iterator();
                            loop5: while (true) {
                                if (!it.hasNext()) {
                                    strArr4 = strArr4;
                                    i8 = i5;
                                    break;
                                }
                                Object next = it.next();
                                int i210 = -(-Color.green(0));
                                int i211 = -(-View.resolveSizeAndState(0, 0, 0));
                                Object[] objArr58 = new Object[1];
                                c(new char[]{48256, 11760, 20724, 21443}, new char[]{8479, 61155, 19370, 36760}, (char) ((i210 & 38987) + (i210 | 38987)), ((i211 & (-1427184863)) << 1) + (i211 ^ (-1427184863)), new char[]{58066, 10867, 2044, 31910, 15010, 48470, 42538, 22980, 13685, 43229, 6237, 52785, 13884, 22301, 58387, 17798, 42337, 10362, 62605, 35706, 64920, 45760, 12310, 18300, 57638, 58200, 57033, 40668, 48864}, objArr58);
                                Class<?> cls21 = Class.forName((String) objArr58[0]);
                                int iBlue = Color.blue(0);
                                int iB12 = VoucherRequest.b();
                                int i212 = iBlue * (-337);
                                int i213 = (i212 & 14021379) + (i212 | 14021379);
                                int i214 = ~iBlue;
                                int i215 = ~iB12;
                                int i216 = -(-(((~((i214 & i215) | (i214 ^ i215))) | (~(((-41362) ^ iBlue) | ((-41362) & iBlue))) | (~((iBlue ^ iB12) | (iBlue & iB12)))) * (-338)));
                                int i217 = ((i213 | i216) << 1) - (i216 ^ i213);
                                int i218 = ~iBlue;
                                int i219 = i217 + ((~(i218 | 41361)) * 338);
                                int i220 = ~iB12;
                                int i221 = ~((i218 ^ i220) | (i218 & i220));
                                int i222 = (iBlue & 41361) | (iBlue ^ 41361);
                                int i223 = ~((iB12 & i222) | (i222 ^ iB12));
                                int i224 = ((i223 & i221) | (i221 ^ i223)) * 338;
                                Object[] objArr59 = new Object[1];
                                c(new char[]{48256, 11760, 20724, 21443}, new char[]{42807, '(', 37277, 26017}, (char) ((i219 & i224) + (i224 | i219)), TextUtils.getTrimmedLength(""), new char[]{47933, 38884, 59309, 51130, 51993, 26304, 33930, 18415, 13129, 27133, 23887, 61188, 62948, 37371}, objArr59);
                                String str16 = (String) cls21.getMethod((String) objArr59[0], null).invoke(next, null);
                                Object[] objArr60 = new Object[1];
                                c(new char[]{48256, 11760, 20724, 21443}, new char[]{58964, 21499, 18732, 61823}, (char) View.resolveSizeAndState(0, 0, 0), 743701477 - (~(-KeyEvent.getDeadChar(0, 0))), new char[]{32654, 1942, 61449, 25378, 22592, 48454, 43601, 53962, 8324, 13015, 5275, 61726, 34455, 33191, 64908, 47824, 29350, 17486, 54858, 33130, 24428, 28827, 43501, 36442, 10840, 58247, 43765, 21488, 6725, 14773, 51408, 27951, 3580, 58208, 3561, 16447, 52680}, objArr60);
                                Class<?> cls22 = Class.forName((String) objArr60[0]);
                                int trimmedLength = TextUtils.getTrimmedLength("");
                                Object[] objArr61 = new Object[1];
                                c(new char[]{48256, 11760, 20724, 21443}, new char[]{5612, 28712, 31194, 2555}, (char) ((trimmedLength ^ 64377) + ((trimmedLength & 64377) << 1)), (-630183916) - (~(-Gravity.getAbsoluteGravity(0, 0))), new char[]{27618, 59865, 23437, 40902, 31178, 37458, 59142, 26719, 46425, 42859, 51836, 61671, 44304, 9238, 25918, 65211, 10546}, objArr61);
                                if (((Boolean) cls22.getMethod((String) objArr61[0], String.class).invoke(objInvoke2, str16)).booleanValue()) {
                                    int length6 = str16.length();
                                    int i225 = (-5061) - (~(length6 * 253));
                                    int i226 = ~length6;
                                    int i227 = ~((i226 & 19) | (19 ^ i226));
                                    int i228 = ~length6;
                                    int i229 = (i228 & i4) | (i228 ^ i4);
                                    int i230 = ~i229;
                                    int i231 = (i227 & i230) | (i227 ^ i230);
                                    int i232 = (length6 & (-20)) | ((-20) ^ length6);
                                    int i233 = i232 | i5;
                                    int i234 = ~i233;
                                    int i235 = i225 + (((i231 & i234) | (i231 ^ i234)) * (-252));
                                    int i236 = i232 * (-252);
                                    int i237 = (i235 ^ i236) + ((i236 & i235) << 1);
                                    int i238 = ~((i229 ^ (-20)) | (i229 & (-20)));
                                    int i239 = ~i233;
                                    int i240 = i237 + (((i238 & i239) | (i238 ^ i239)) * 252);
                                    if (i240 >= 0) {
                                        int i241 = 0;
                                        while (i241 <= i240) {
                                            int i242 = -(-(i241 * (-159)));
                                            int i243 = ((-3180) ^ i242) + ((i242 & (-3180)) << 1);
                                            int i244 = -(-(((i241 ^ (-21)) | (i241 & (-21))) * 160));
                                            int i245 = (i243 & i244) + (i244 | i243);
                                            int i246 = ~((i4 ^ 20) | (i4 & 20));
                                            int i247 = ~((i241 ^ 20) | (i241 & 20));
                                            int i248 = i245 + (((i246 & i247) | (i246 ^ i247)) * (-160));
                                            int i249 = ~i241;
                                            int i250 = ~((i249 & i4) | (i249 ^ i4));
                                            int i251 = -(-(((i250 & 20) | (i250 ^ 20)) * 160));
                                            Object[] objArr62 = {str16.substring(i241, (i248 & i251) + (i251 | i248)), 931995};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                int keyRepeatDelay4 = 3393 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                int iKeyCodeFromString = 9 - KeyEvent.keyCodeFromString("");
                                                byte[] bArr19 = $$d;
                                                byte b19 = bArr19[2];
                                                Object[] objArr63 = new Object[1];
                                                g(b19, (byte) (b19 & 14), (byte) (bArr19[7] - 1), objArr63);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(minimumFlingVelocity, keyRepeatDelay4, iKeyCodeFromString, 1203525406, false, (String) objArr63[0], new Class[]{String.class, Integer.TYPE});
                                            }
                                            long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr62)).longValue();
                                            long j17 = 504140861;
                                            long j18 = TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                                            long j19 = (j18 * j17) + (j18 * jLongValue4);
                                            long j20 = -502;
                                            long j21 = j17 | jLongValue4;
                                            Iterator it2 = it;
                                            String str17 = str16;
                                            long j22 = -1;
                                            long j23 = j17 ^ j22;
                                            long j24 = (j23 | (jLongValue4 ^ j22)) ^ j22;
                                            Object obj8 = objInvoke2;
                                            long j25 = i5;
                                            long j26 = j23 | (j25 ^ j22);
                                            long j27 = (j21 | j25) ^ j22;
                                            long j28 = j19 + (j20 * j21) + (j20 * (j24 | (j26 ^ j22) | j27)) + (((long) TypedValues.PositionType.TYPE_DRAWPATH) * (j27 | (j22 ^ (jLongValue4 | j26)))) + ((long) (-506210738));
                                            int i252 = ((int) (j28 >> 32)) & ((-2065680470) + ((~((-1536399563) | i5)) * 216) + (((-286361665) | i4) * (-216)) + (((~(i4 | (-1536399563))) | (-1321341323)) * 216));
                                            int i253 = ((int) j28) & ((-501357939) + (((~((-2086311973) | i5)) | 744099872) * 336) + (((~(771428913 | i5)) | (-2113641014)) * (-168)) + (((-2086311973) | (~(i4 | 771428913))) * 168));
                                            if (((i253 & i252) | (i252 ^ i253)) == 1245577864) {
                                                i8 = (~(i5 & 70)) & (i5 | 70);
                                                break loop5;
                                            }
                                            i241 = (((i241 | 28) << 1) - (i241 ^ 28)) - 27;
                                            it = it2;
                                            str16 = str17;
                                            objInvoke2 = obj8;
                                            strArr4 = strArr4;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                it = it;
                                objInvoke2 = objInvoke2;
                                strArr4 = strArr4;
                            }
                            int i254 = ((~i7) & i5) | (i7 & i4);
                            int i255 = -i254;
                            int i256 = ((i254 & i255) | (i254 ^ i255)) >> 31;
                            int i257 = i8 & (~i256);
                            int i258 = i7 & i256;
                            i7 = (i258 & i257) | (i257 ^ i258);
                        } catch (Throwable th18) {
                            Throwable cause9 = th18.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th18;
                        }
                    } else {
                        strArr4 = strArr4;
                    }
                    strArr = strArr4;
                } catch (Throwable th19) {
                    Throwable cause10 = th19.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th19;
                }
            } else {
                i7 = i26;
                strArr = null;
            }
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int i259 = -Color.red(0);
            Object[] objArr64 = new Object[1];
            e(cKeyCodeFromString, (i259 & 48) + (i259 | 48), 11 - (~(-TextUtils.getTrimmedLength(""))), objArr64);
            Object[] objArr65 = {(String) objArr64[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int iIndexOf10 = 992 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 8;
                byte[] bArr20 = $$d;
                Object[] objArr66 = new Object[1];
                g((byte) 51, (byte) (-bArr20[15]), (byte) (bArr20[7] - 1), objArr66);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, iIndexOf10, iMakeMeasureSpec, -545305915, false, (String) objArr66[0], new Class[]{String.class});
            }
            long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr65)).longValue();
            long j29 = -183833369;
            long j30 = -1;
            long j31 = j29 ^ j30;
            String[] strArr5 = strArr;
            long startUptimeMillis = (int) Process.getStartUptimeMillis();
            long j32 = (((long) 236) * j29) + (((long) 471) * jLongValue5) + (((long) (-235)) * (jLongValue5 | ((j31 | (startUptimeMillis ^ j30)) ^ j30))) + (((long) (-470)) * (jLongValue5 | ((j31 | startUptimeMillis) ^ j30))) + (((long) 235) * ((((j31 | jLongValue5) | startUptimeMillis) ^ j30) | (((jLongValue5 ^ j30) | j29) ^ j30))) + ((long) 804292653);
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i260 = ~iMaxMemory;
            int i261 = ((int) (j32 >> 32)) & ((-1453938172) + (((~((-1888750757) | i260)) | (-451524346)) * 519) + (((~(i260 | (-276825249))) | (~((-174699098) | iMaxMemory))) * (-519)) + (((~(iMaxMemory | (-451524346))) | 1888750756) * 519));
            int i262 = ~((-743836425) | i);
            int i263 = ~i;
            int i264 = i261 | (((int) j32) & ((-2038855459) + ((i262 | (~((-285807681) | i263))) * 920) + (((~((-1828096782) | i263)) | 743836424) * 920) + (((~((-743836425) | i263)) | (~((-1084260358) | i)) | (~((-285807681) | i))) * 920)));
            int i265 = -i264;
            int i266 = ((i264 & i265) | (i264 ^ i265)) >> 31;
            int i267 = (i266 & ((i & (-51)) | (i263 & 50))) | ((~i266) & i);
            int i268 = (~(i & i7)) & (i | i7);
            int i269 = -i268;
            int i270 = ((i268 & i269) | (i268 ^ i269)) >> 31;
            int i271 = i267 & (~i270);
            int i272 = i7 & i270;
            int i273 = (i272 & i271) | (i271 ^ i272);
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int i274 = -Color.red(0);
            int i275 = (i274 ^ 60) + ((i274 & 60) << 1);
            int i276 = -View.getDefaultSize(0, 0);
            int i277 = (i276 ^ 20) + ((i276 & 20) << 1);
            Object[] objArr67 = new Object[1];
            e(scrollBarSize, i275, i277, objArr67);
            Object[] objArr68 = {(String) objArr67[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c13 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int iBlue2 = Color.blue(0) + 993;
                int packedPositionGroup = 8 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr21 = $$d;
                Object[] objArr69 = new Object[1];
                g((byte) 51, (byte) (-bArr21[15]), (byte) (bArr21[7] - 1), objArr69);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c13, iBlue2, packedPositionGroup, -545305915, false, (String) objArr69[0], new Class[]{String.class});
            }
            long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr68)).longValue();
            long j33 = 146472796;
            long j34 = j33 ^ j30;
            long j35 = i;
            long j36 = j35 ^ j30;
            long j37 = (j34 | j36) ^ j30;
            long j38 = 338;
            long j39 = (((long) (-337)) * j33) + (((long) 339) * jLongValue6) + (((long) (-338)) * (j37 | (((jLongValue6 ^ j30) | j33) ^ j30) | ((j33 | j35) ^ j30))) + (((j34 | jLongValue6) ^ j30) * j38) + (j38 * (j37 | (((jLongValue6 | j33) | j35) ^ j30))) + ((long) 473986488);
            int i278 = ((int) (j39 >> 32)) & ((-1372082302) + (((~(1750682976 | i)) | 1107057908) * (-318)) + (((~(1107057908 | i)) | (~((-1079528545) | i263))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~((-671154433) | i263)) | (~((-1079528545) | i))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
            int i279 = (int) j39;
            int i280 = (int) Runtime.getRuntime().totalMemory();
            int i281 = ~i280;
            int i282 = i279 & ((-1972008908) + (((~(588716143 | i281)) | (~(848510266 | i281))) * (-867)) + (((~(588716143 | i280)) | (-865549696) | (~(848510266 | i280))) * (-1734)) + (((~(i280 | (-17039430))) | (~(i281 | 865549695)) | (~((-276833553) | i280))) * 867));
            int i283 = (i278 & i282) | (i278 ^ i282);
            int i284 = -i283;
            int i285 = ((i283 & i284) | (i283 ^ i284)) >> 31;
            int i286 = (~i285) & i;
            int i287 = i285 & ((i & (-61)) | (i263 & 60));
            int i288 = (~(i & i273)) & (i | i273);
            int i289 = (i288 | (-i288)) >> 31;
            int i290 = ((i287 & i286) | (i286 ^ i287)) & (~i289);
            int i291 = i273 & i289;
            int i292 = (i291 & i290) | (i290 ^ i291);
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0');
            int i293 = iLastIndexOf2 * 483;
            int i294 = ((i293 | 4076006) << 1) - (i293 ^ 4076006);
            int i295 = ~((~iLastIndexOf2) | (-16844));
            int i296 = ~iLastIndexOf2;
            int i297 = (i296 & i263) | (i296 ^ i263);
            int i298 = ~i297;
            int i299 = -(-(((i295 & i298) | (i295 ^ i298)) * (-241)));
            int i300 = (((i294 ^ i299) + ((i299 & i294) << 1)) - (~(-(-(((iLastIndexOf2 ^ 16843) | (iLastIndexOf2 & 16843)) * (-482)))))) - 1;
            int i301 = -(-(((~(iLastIndexOf2 | (-16844))) | (~((i297 ^ 16843) | (i297 & 16843)))) * 241));
            char c14 = (char) ((i300 & i301) + (i301 | i300));
            int i302 = -Color.blue(0);
            int i303 = i302 * (-721);
            int i304 = ((i303 | (-57680)) << 1) - (i303 ^ (-57680));
            int i305 = ~i302;
            int i306 = ~((i305 ^ (-81)) | (i305 & (-81)));
            int i307 = (i306 & i263) | (i263 ^ i306);
            int i308 = (i302 ^ 80) | (i302 & 80);
            int i309 = ~i308;
            int i310 = ((i307 & i309) | (i307 ^ i309)) * 1444;
            int i311 = (i304 ^ i310) + ((i310 & i304) << 1);
            int i312 = ~i308;
            int i313 = ~(i302 | i);
            int i314 = (i312 & i313) | (i312 ^ i313);
            int i315 = ~((i ^ 80) | (i & 80));
            int i316 = -(-(((i314 & i315) | (i314 ^ i315)) * (-1444)));
            int i317 = ~(i305 | 80);
            int i318 = ~((i302 & (-81)) | ((-81) ^ i302));
            int i319 = ((((i311 | i316) << 1) - (i316 ^ i311)) - (~(-(-(((i318 & i317) | (i317 ^ i318)) * 722))))) - 1;
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
            int i320 = iCombineMeasuredStates * (-919);
            int i321 = (i320 ^ (-33084)) + ((i320 & (-33084)) << 1);
            int i322 = ~iCombineMeasuredStates;
            int i323 = (i322 ^ (-37)) | (i322 & (-37));
            int i324 = ~((i323 & i) | (i323 ^ i));
            int i325 = ((-37) ^ i263) | ((-37) & i263);
            int i326 = ~((i325 & iCombineMeasuredStates) | (i325 ^ iCombineMeasuredStates));
            int i327 = -(-(((i324 & i326) | (i324 ^ i326)) * 920));
            int i328 = (i321 ^ i327) + ((i327 & i321) << 1);
            int i329 = ~iCombineMeasuredStates;
            int i330 = ~((i329 ^ (-37)) | (i329 & (-37)));
            int i331 = ~((i329 ^ i263) | (i329 & i263));
            int i332 = -(-(((i330 & i331) | (i330 ^ i331)) * 920));
            int i333 = ~((i322 & (-37)) | (i322 ^ (-37)) | i263);
            int i334 = ~((i329 & 36) | (i329 ^ 36) | i);
            int i335 = (i333 & i334) | (i333 ^ i334);
            int i336 = ~((-37) | iCombineMeasuredStates | i);
            int i337 = (((i328 | i332) << 1) - (i332 ^ i328)) + (((i335 & i336) | (i335 ^ i336)) * 920);
            Object[] objArr70 = new Object[1];
            e(c14, i319, i337, objArr70);
            Object[] objArr71 = {(String) objArr70[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                int iIndexOf11 = 992 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int scrollDefaultDelay3 = 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                Object[] objArr72 = new Object[1];
                g((byte) 51, (byte) 13, (byte) ($$d[7] - 1), objArr72);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf2, iIndexOf11, scrollDefaultDelay3, 349342683, false, (String) objArr72[0], new Class[]{String.class});
            }
            long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr71)).longValue();
            long j40 = -590670693;
            long j41 = 623;
            long j42 = jLongValue7 ^ j30;
            long j43 = j42 | j40;
            long j44 = (int) Runtime.getRuntime().totalMemory();
            long j45 = (((long) 624) * j40) + (((long) (-622)) * jLongValue7) + (((j43 | j44) ^ j30) * j41) + (((long) (-623)) * ((j44 ^ j30) | (((j40 ^ j30) | jLongValue7) ^ j30))) + (j41 * (((j44 | j40) ^ j30) | (j43 ^ j30) | ((j42 | j44) ^ j30))) + ((long) (-256407912));
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i338 = ~elapsedCpuTime;
            int i339 = 711453272 + (((~(968752313 | i338)) | 37748800) * (-1188));
            int i340 = (~(elapsedCpuTime | (-968752314))) | 37748800;
            int i341 = ~(468474097 | i338);
            int i342 = ((int) (j45 >> 32)) & (i339 + ((i340 | i341) * 594) + (((~((-968752314) | i338)) | 538027016 | i341) * 594));
            int i343 = ((int) j45) & (141838433 + ((~(1775500883 | i263)) * 52) + (((~(1620175939 | i263)) | (~((-1237564947) | i263)) | 155324944) * (-52)) + (((~((-1620175940) | i263)) | 537935937) * 52));
            int i344 = (i342 & i343) | (i342 ^ i343);
            int i345 = -i344;
            int i346 = ((i344 & i345) | (i344 ^ i345)) >> 31;
            int i347 = (~i346) & i;
            int i348 = i346 & ((i & (-81)) | (i263 & 80));
            int i349 = (i348 & i347) | (i347 ^ i348);
            int i350 = ((~i292) & i) | (i292 & i263);
            int i351 = -i350;
            int i352 = ((i350 & i351) | (i350 ^ i351)) >> 31;
            int i353 = i349 & (~i352);
            int i354 = i292 & i352;
            int i355 = (i353 & i354) | (i353 ^ i354);
            int i356 = -(ViewConfiguration.getScrollBarSize() >> 8);
            Object[] objArr73 = new Object[1];
            c(new char[]{48256, 11760, 20724, 21443}, new char[]{9825, 9690, 16356, 56659}, (char) ((i356 & 21311) + (i356 | 21311)), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{9119, 41013, 25364, 62986, 45463, 15809, 13011, 27034, 41574, 47643, 50564, 57692, 44499, 40374, 56916, 23427, 34626, 22976, 61316, 7133, 7790, 16474, 40985, 3457, 18899, 35735, 3563, 38017, 8831, 64696, 28884, 40503, 7864, 60014, 57162, 48764, 63442, 13394, 4569, 39921, 44551, 6819}, objArr73);
            Object[] objArr74 = {(String) objArr73[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 993;
                int i357 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9;
                Object[] objArr75 = new Object[1];
                g((byte) 51, (byte) 13, (byte) ($$d[7] - 1), objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cMakeMeasureSpec, packedPositionGroup2, i357, 349342683, false, (String) objArr75[0], new Class[]{String.class});
            }
            long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr74)).longValue();
            long j46 = -498434063;
            long j47 = 764;
            long jNextInt = ((long) new Random().nextInt()) ^ j30;
            long j48 = (jNextInt | j46) ^ j30;
            long j49 = ((j46 ^ j30) | jLongValue8) ^ j30;
            long j50 = (((long) 765) * j46) + (((long) (-1527)) * jLongValue8) + ((jLongValue8 | j48) * j47) + (((long) (-1528)) * (j49 | ((jNextInt | jLongValue8) ^ j30))) + (j47 * (j49 | (((jLongValue8 ^ j30) | j46) ^ j30) | j48)) + ((long) (-348644542));
            int i358 = (int) Runtime.getRuntime().totalMemory();
            int i359 = ~i358;
            int i360 = ((int) (j50 >> 32)) & (1687905420 + (((~((-1566240601) | i359)) | (-129014190)) * (-90)) + (((~((-1566240601) | i358)) | 44044453) * (-45)) + (((~(i358 | 129014189)) | (-1566240601) | (~(i359 | (-129014190)))) * 45));
            int i361 = ((int) j50) & ((((~((-1929340220) | i)) | 1084825633) * (-283)) + 625749712 + ((~((-844514587) | i)) * 283));
            int i362 = (i360 & i361) | (i360 ^ i361);
            int i363 = (~(i & 90)) & (i | 90);
            int i364 = -i362;
            int i365 = ((i362 & i364) | (i362 ^ i364)) >> 31;
            int i366 = (~i365) & i;
            int i367 = i365 & i363;
            int i368 = (i367 & i366) | (i366 ^ i367);
            int i369 = (~(i & i355)) & (i | i355);
            int i370 = -i369;
            int i371 = ((i369 & i370) | (i369 ^ i370)) >> 31;
            int i372 = i368 & (~i371);
            int i373 = i355 & i371;
            int i374 = (i372 & i373) | (i372 ^ i373);
            int size = View.MeasureSpec.getSize(0);
            int i375 = size * (-958);
            int i376 = (i375 & (-14273242)) + (i375 | (-14273242));
            int i377 = ~i;
            int i378 = ~(((-14900) & i377) | ((-14900) ^ i377));
            int i379 = ~((~size) | i);
            int i380 = ((i376 + ((((i378 & i379) | (i378 ^ i379)) | (~((i377 ^ size) | (i377 & size)))) * 959)) - (~(-(-((~(size | 14899)) * (-959)))))) - 1;
            int i381 = ~size;
            int i382 = ~((i381 & i263) | (i381 ^ i263));
            int i383 = ~((-14900) | i);
            int i384 = (i382 & i383) | (i382 ^ i383);
            int i385 = ~(size | i);
            int i386 = -(-(((i385 & i384) | (i384 ^ i385)) * 959));
            Object[] objArr76 = new Object[1];
            c(new char[]{48256, 11760, 20724, 21443}, new char[]{17182, 35049, 13128, 314}, (char) ((i380 ^ i386) + ((i386 & i380) << 1)), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{56838, 48016, 61181, 3194, 38102, 26778, 58095, 26991, 32560, 55903, 40074, 59531, 48664, 42424, 24206, 49979, 32662, 34641}, objArr76);
            Object[] objArr77 = {(String) objArr76[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c15 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int mode = 993 - View.MeasureSpec.getMode(0);
                int maxKeyCode = 8 - (KeyEvent.getMaxKeyCode() >> 16);
                Object[] objArr78 = new Object[1];
                g((byte) 51, (byte) 13, (byte) ($$d[7] - 1), objArr78);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c15, mode, maxKeyCode, 349342683, false, (String) objArr78[0], new Class[]{String.class});
            }
            long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr77)).longValue();
            long j51 = -579317301;
            long j52 = -159;
            long j53 = (j52 * j51) + (j52 * jLongValue9);
            long j54 = 160;
            long j55 = ((long) (-267761304)) + j53 + ((jLongValue9 | (j51 ^ j30)) * j54) + (((long) (-160)) * (((j36 | j51) ^ j30) | ((j51 | jLongValue9) ^ j30))) + (j54 * ((((jLongValue9 ^ j30) | j36) ^ j30) | j51));
            int i387 = (((int) j55) & (835170482 + (((~(i263 | (-2109857328))) | 672630917) * (-1042)) + (((-2109857328) | i) * 521) + (((~((-672630918) | i)) | 1441920 | (~((-1438668331) | i263))) * 521))) | (((int) (j55 >> 32)) & (1837009417 + ((~((-27271169) | i263)) * (-783)) + (((~(1376377850 | i263)) | (-60848561)) * 783)));
            int i388 = -i387;
            int i389 = ((i387 & i388) | (i387 ^ i388)) >> 31;
            int i390 = (i389 & ((i & (-101)) | (i263 & 100))) | ((~i389) & i);
            int i391 = ((~i374) & i) | (i374 & i263);
            int i392 = (i391 | (-i391)) >> 31;
            int i393 = i390 & (~i392);
            int i394 = i374 & i392;
            int i395 = (i394 & i393) | (i393 ^ i394);
            Object[] objArr79 = {new int[]{i}, strArr5, new int[]{i ^ (i << 5)}, new int[]{i395}};
            int i396 = (~(i & i395)) & (i | i395);
            int i397 = ((i396 | (-i396)) >> 31) & 16;
            int i398 = 717153158 + (((~((-822148265) | i263)) | 13434948) * (-591)) + (((-822148265) | i) * 591);
            int i399 = i397 * (-183);
            int i400 = i398 * 185;
            int i401 = (i399 & i400) + (i399 | i400);
            int i402 = ~i397;
            int i403 = ((i398 ^ i402) | (i398 & i402)) * (-368);
            int i404 = ((i401 | i403) << 1) - (i403 ^ i401);
            int i405 = ~i398;
            int i406 = (i405 & i397) | (i397 ^ i405);
            int i407 = (i404 - (~(((i406 & i377) | (i406 ^ i377)) * 184))) - 1;
            int i408 = ~(i402 | (~i398));
            int i409 = ~((i263 ^ i397) | (i263 & i397));
            int i410 = (i408 & i409) | (i408 ^ i409);
            int i411 = ~((i397 & i398) | (i397 ^ i398));
            int i412 = ((i410 & i411) | (i410 ^ i411)) * 184;
            int i413 = (i3 - (~(-(-(((i407 | i412) << 1) - (i412 ^ i407)))))) - 1;
            int i414 = i413 << 13;
            int i415 = ((~i413) & i414) | ((~i414) & i413);
            int i416 = i415 >>> 17;
            int i417 = (i415 | i416) & (~(i415 & i416));
            return objArr79;
        }

        private static String $$g(short s, short s2, byte b2) {
            int i = b2 * 4;
            int i2 = (s * 4) + 4;
            int i3 = 115 - s2;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i + 1];
            int i4 = -1;
            if (bArr == null) {
                i4 = -1;
                i3 = i2 + i3;
                i2++;
            }
            while (true) {
                int i5 = i4 + 1;
                bArr2[i5] = (byte) i3;
                if (i5 == i) {
                    return new String(bArr2, 0);
                }
                int i6 = i3;
                i4 = i5;
                i3 = bArr[i2] + i6;
                i2++;
            }
        }
    }

    public /* synthetic */ getRatingStyle(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }
}
