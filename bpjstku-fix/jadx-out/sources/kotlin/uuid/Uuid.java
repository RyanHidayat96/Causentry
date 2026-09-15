package kotlin.uuid;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.databinding.ActivityLoginBinding;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UByteArray;
import kotlin.ULong;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u00010B\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ^\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t26\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000\nH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t26\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000\nH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001aJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0000H\u0097\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010(R \u0010\r\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R \u0010\u000e\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010)\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010+\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/uuid/Uuid;", "", "Ljava/io/Serializable;", "Lkotlin/io/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "p0", "p1", "<init>", "(JJ)V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "mostSignificantBits", "leastSignificantBits", "toLongs", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/ULong;", "toULongs", "", "toString", "()Ljava/lang/String;", "toHexDashString", "toHexString", "", "toByteArray", "()[B", "Lkotlin/UByteArray;", "toUByteArray-TcUX1vc", "toUByteArray", "", "", "equals", "(Ljava/lang/Object;)Z", "", "compareTo", "(Lkotlin/uuid/Uuid;)I", "hashCode", "()I", "writeReplace", "()Ljava/lang/Object;", "J", "getMostSignificantBits", "()J", "getMostSignificantBits$annotations", "()V", "getLeastSignificantBits", "getLeastSignificantBits$annotations", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Uuid implements Comparable<Uuid>, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Uuid NIL = new Uuid(0, 0);
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }

    private Uuid(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    private final <T> T toLongs(Function2<? super Long, ? super Long, ? extends T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.invoke(Long.valueOf(getMostSignificantBits()), Long.valueOf(getLeastSignificantBits()));
    }

    private final <T> T toULongs(Function2<? super ULong, ? super ULong, ? extends T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.invoke(ULong.m8197boximpl(ULong.m8203constructorimpl(getMostSignificantBits())), ULong.m8197boximpl(ULong.m8203constructorimpl(getLeastSignificantBits())));
    }

    public final String toString() {
        return toHexDashString();
    }

    public final String toHexDashString() {
        byte[] bArr = new byte[36];
        UuidKt.formatBytesInto(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = 45;
        UuidKt.formatBytesInto(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = 45;
        UuidKt.formatBytesInto(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = 45;
        UuidKt.formatBytesInto(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = 45;
        UuidKt.formatBytesInto(this.leastSignificantBits, bArr, 24, 2, 8);
        return StringsKt.decodeToString(bArr);
    }

    public final String toHexString() {
        byte[] bArr = new byte[32];
        UuidKt.formatBytesInto(this.mostSignificantBits, bArr, 0, 0, 8);
        UuidKt.formatBytesInto(this.leastSignificantBits, bArr, 16, 0, 8);
        return StringsKt.decodeToString(bArr);
    }

    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        UuidKt.setLongAt(bArr, 0, this.mostSignificantBits);
        UuidKt.setLongAt(bArr, 8, this.leastSignificantBits);
        return bArr;
    }

    /* JADX INFO: renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m9513toUByteArrayTcUX1vc() {
        return UByteArray.m8100constructorimpl(toByteArray());
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) p0;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0006X\u0087T¢\u0006\u0006\n\u0004\b \u0010\u001fR*\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00070!j\b\u0012\u0004\u0012\u00020\u0007`\"8GX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0003\u001a\u0004\b#\u0010$"}, d2 = {"Lkotlin/uuid/Uuid$Companion;", "", "<init>", "()V", "", "p0", "p1", "Lkotlin/uuid/Uuid;", "fromLongs", "(JJ)Lkotlin/uuid/Uuid;", "Lkotlin/ULong;", "fromULongs-eb3DHEI", "fromULongs", "", "fromByteArray", "([B)Lkotlin/uuid/Uuid;", "Lkotlin/UByteArray;", "fromUByteArray-GBYM_sE", "fromUByteArray", "", "parse", "(Ljava/lang/String;)Lkotlin/uuid/Uuid;", "parseHexDash", "parseHex", "random", "()Lkotlin/uuid/Uuid;", "NIL", "Lkotlin/uuid/Uuid;", "getNIL", "", "SIZE_BYTES", "I", "SIZE_BITS", "Ljava/util/Comparator;", "Lkotlin/cancelAll;", "getLEXICAL_ORDER", "()Ljava/util/Comparator;", "getLEXICAL_ORDER$annotations", "LEXICAL_ORDER"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static final byte[] $$c = {31, -3, -46, 11};
        private static final int $$d = 191;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {57, -56, 23, -36, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
        private static final int $$b = 182;
        private static int asBinder = 0;
        private static int d = 1;
        private static int b = 731853090;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795523;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -633386706;
        private static byte[] TuitionPaymentFragmentbindingInflater1 = {-91, -55, -40, -126, -9, -91, -54, -38, -45, -121, -122, 16, -39, -102, -29, -48, -45, -34, -81, -41, -82, -106, -102, -117, 102, 101, -110, 109, ByteCompanionObject.MIN_VALUE, -111, -116, -99, 97, -117, -103, 20, Base64.padSymbol, 13, 2, -10, -23, 87, 5, 17, 57, -50, 81, 51, 25, 7, 69, 113, 40, -101, 113, 82, 93, -105, 65, 75, 113, 78, 77, 69, 123, -26, -26, -26, -26};

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 4
                int r7 = r7 * 4
                int r7 = r7 + 84
                byte[] r0 = kotlin.uuid.Uuid.Companion.$$a
                int r8 = r8 * 15
                int r1 = 53 - r8
                byte[] r1 = new byte[r1]
                int r8 = 52 - r8
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2c
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2c:
                int r6 = r6 + 1
                int r7 = -r7
                int r3 = r3 + r7
                int r7 = r3 + (-11)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.uuid.Uuid.Companion.a(byte, short, byte, java.lang.Object[]):void");
        }

        private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            int i6 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 2267, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 33, 1387473586, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i7 = $11 + 5;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    int i9 = $11 + 15;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr = TuitionPaymentFragmentbindingInflater1;
                    long j = 0;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i11 = 0;
                        while (i11 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 3358;
                                int i12 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 17;
                                byte length2 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, longPressTimeout, i12, -1054011043, false, $$e((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i11++;
                            j = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i13 = $10 + 59;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        byte[] bArr3 = TuitionPaymentFragmentbindingInflater1;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), ((byte) KeyEvent.getModifierMetaStateMask()) + 2268, 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1387473586, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                        i5 = 2;
                    } else {
                        iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                        int i15 = $10 + 19;
                        $11 = i15 % 128;
                        i5 = 2;
                        int i16 = i15 % 2;
                    }
                } else {
                    i5 = 2;
                }
                if (iIntValue > 0) {
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - i5) + ((int) (((long) b) ^ 3046761265686732006L)) + i4;
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - TextUtils.getOffsetAfter("", 0)), 2854 - TextUtils.lastIndexOf("", '0', 0), Color.green(0) + 13, -1529949196, false, $$e(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                    if (bArr4 != null) {
                        int length3 = bArr4.length;
                        byte[] bArr5 = new byte[length3];
                        for (int i17 = 0; i17 < length3; i17++) {
                            bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 3046761265686732006L);
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z) {
                            byte[] bArr6 = TuitionPaymentFragmentbindingInflater1;
                            int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
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

        private Companion() {
        }

        public final Uuid getNIL() {
            int i = 2 % 2;
            int i2 = asBinder + 89;
            d = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Uuid uuid = Uuid.NIL;
                int i3 = d + 47;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    return uuid;
                }
                throw null;
            }
            Uuid unused = Uuid.NIL;
            obj.hashCode();
            throw null;
        }

        public final Uuid fromLongs(long p0, long p1) {
            int i = 2 % 2;
            int i2 = asBinder + 97;
            d = i2 % 128;
            if (i2 % 2 != 0 ? p0 == 0 : p0 == 1) {
                if (p1 == 0) {
                    Uuid nil = getNIL();
                    int i3 = asBinder + 103;
                    d = i3 % 128;
                    if (i3 % 2 != 0) {
                        return nil;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            return new Uuid(p0, p1, null);
        }

        /* JADX INFO: renamed from: fromULongs-eb3DHEI, reason: not valid java name */
        public final Uuid m9515fromULongseb3DHEI(long p0, long p1) throws Throwable {
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            int i2 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char offsetBefore = (char) (29944 - TextUtils.getOffsetBefore("", 0));
                int defaultSize = View.getDefaultSize(0, 0) + 1755;
                int offsetAfter = 23 - TextUtils.getOffsetAfter("", 0);
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr = new Object[1];
                a(b2, b2, bArr[5], objArr);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, defaultSize, offsetAfter, 986134021, false, (String) objArr[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr2 = new Object[1];
            c((-1452414312) - TextUtils.indexOf((CharSequence) "", '0', 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 5, (short) ((-59) - Color.green(0)), (byte) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) + 1489867324, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            c((-1452414307) - ((Process.getThreadPriority(0) + 20) >> 6), (-12) - ((Process.getThreadPriority(0) + 20) >> 6), (short) (ImageFormat.getBitsPerPixel(0) - 119), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1489867346 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                int defaultSize2 = View.getDefaultSize(0, 0) + 1755;
                int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte b3 = $$a[7];
                Object[] objArr4 = new Object[1];
                a((byte) 37, b3, b3, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, defaultSize2, threadPriority, 1596667560, false, (String) objArr4[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                    int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                    int i3 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    byte b4 = $$a[7];
                    Object[] objArr5 = new Object[1];
                    a((byte) 89, b4, b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, tapTimeout, i3, 1599039318, false, (String) objArr5[0], null);
                }
                Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i4 = ((int[]) objArr6[0])[0];
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{i4}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i5 = 1332474231 + (((~iIdentityHashCode) | 886316618) * 1444) + (((~(iIdentityHashCode | (-389318697))) | (~(601921122 | iIdentityHashCode)) | 336857096) * (-1444)) + 1184356474;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr7 = new Object[1];
                c(TextUtils.getTrimmedLength("") - 1452414302, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 12, (short) (22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1489867358, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1452414303, (-11) - (ViewConfiguration.getPressedStateDuration() >> 16), (short) (94 - Color.argb(0, 0, 0, 0)), (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 1489867374, objArr8);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr9 = {2079278752};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42048), (Process.myTid() >> 22) + 1726, 28 - Process.getGidForName(""), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), 1154828288);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetAfter2 = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                        int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                        byte b5 = $$a[7];
                        Object[] objArr10 = new Object[1];
                        a((byte) 89, b5, b5, objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter2, tapTimeout2, modifierMetaStateMask, 1599039318, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                    try {
                        Object[] objArr11 = new Object[1];
                        c(TextUtils.getCapsMode("", 0, 0) - 1452414311, Color.blue(0) - 5, (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 60), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1489867323, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        c((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1452414307, (-12) - KeyEvent.normalizeMetaState(0), (short) ((-121) - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1489867345 - View.combineMeasuredStates(0, 0), objArr12);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                            int trimmedLength = 1755 - TextUtils.getTrimmedLength("");
                            int iIndexOf = 23 - TextUtils.indexOf("", "");
                            byte b6 = $$a[7];
                            Object[] objArr13 = new Object[1];
                            a((byte) 37, b6, b6, objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, trimmedLength, iIndexOf, 1596667560, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 29945);
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                            int fadingEdgeLength = 23 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte[] bArr2 = $$a;
                            byte b7 = bArr2[7];
                            Object[] objArr14 = new Object[1];
                            a(b7, b7, bArr2[5], objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, iCombineMeasuredStates, fadingEdgeLength, 986134021, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                        int i8 = d + 109;
                        asBinder = i8 % 128;
                        int i9 = i8 % 2;
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
            int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
            int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
            if (i11 != i10) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
                if (strArr != null) {
                    while (i2 < strArr.length) {
                        int i12 = asBinder + 47;
                        d = i12 % 128;
                        if (i12 % 2 == 0) {
                            arrayList.add(strArr[i2]);
                            i2 += 43;
                        } else {
                            arrayList.add(strArr[i2]);
                            i2++;
                        }
                    }
                }
                throw new RuntimeException(String.valueOf(i11));
            }
            int i13 = d + 59;
            asBinder = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
            Object[] objArr15 = {new int[]{i16}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i17 = ~(40620138 | iIdentityHashCode2);
            int i18 = i15 + (-1510104762) + ((134229381 | i17) * (-814)) + ((i17 | (~((~iIdentityHashCode2) | (-171982288))) | 2867232) * 407) + (((~(iIdentityHashCode2 | 171982287)) | (~((-40620139) | iIdentityHashCode2)) | 2867232) * 407);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr15[3])[0] = i20 ^ (i20 << 5);
            int i21 = asBinder + 87;
            d = i21 % 128;
            if (i21 % 2 != 0) {
                return fromLongs(p0, p1);
            }
            int i22 = 5 / 0;
            return fromLongs(p0, p1);
        }

        public final Uuid fromByteArray(byte[] p0) {
            int i = 2 % 2;
            int i2 = d + 19;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.length == 16) {
                int i4 = d + 75;
                asBinder = i4 % 128;
                return i4 % 2 != 0 ? fromLongs(UuidKt.getLongAt(p0, 0), UuidKt.getLongAt(p0, 115)) : fromLongs(UuidKt.getLongAt(p0, 0), UuidKt.getLongAt(p0, 8));
            }
            StringBuilder sb = new StringBuilder("Expected exactly 16 bytes, but was ");
            sb.append(UuidKt__UuidKt.truncateForErrorMessage$UuidKt__UuidKt(p0, 32));
            sb.append(" of size ");
            sb.append(p0.length);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        /* JADX INFO: renamed from: fromUByteArray-GBYM_sE, reason: not valid java name */
        public final Uuid m9514fromUByteArrayGBYM_sE(byte[] p0) {
            int i = 2 % 2;
            int i2 = d + 105;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return fromByteArray(p0);
            }
            Intrinsics.checkNotNullParameter(p0, "");
            fromByteArray(p0);
            throw null;
        }

        public final Uuid parse(String p0) {
            int i = 2 % 2;
            int i2 = d + 11;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            int length = p0.length();
            if (length == 32) {
                return UuidKt.uuidParseHex(p0);
            }
            int i4 = asBinder;
            int i5 = i4 + 105;
            d = i5 % 128;
            int i6 = i5 % 2;
            if (length == 36) {
                int i7 = i4 + 85;
                d = i7 % 128;
                int i8 = i7 % 2;
                return UuidKt.uuidParseHexDash(p0);
            }
            StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
            sb.append(UuidKt__UuidKt.truncateForErrorMessage$UuidKt__UuidKt(p0, 64));
            sb.append("\" of length ");
            sb.append(p0.length());
            throw new IllegalArgumentException(sb.toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            r0 = new java.lang.StringBuilder("Expected a 36-char string in the standard hex-and-dash UUID format, but was \"");
            r0.append(kotlin.uuid.UuidKt__UuidKt.truncateForErrorMessage$UuidKt__UuidKt(r4, 64));
            r0.append("\" of length ");
            r0.append(r4.length());
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
        
            throw new java.lang.IllegalArgumentException(r0.toString().toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r4.length() == 98) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            if (r4.length() == 36) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            r4 = kotlin.uuid.UuidKt.uuidParseHexDash(r4);
            r1 = kotlin.uuid.Uuid.Companion.d + 107;
            kotlin.uuid.Uuid.Companion.asBinder = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.uuid.Uuid parseHexDash(java.lang.String r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = kotlin.uuid.Uuid.Companion.asBinder
                int r1 = r1 + 35
                int r2 = r1 % 128
                kotlin.uuid.Uuid.Companion.d = r2
                int r1 = r1 % r0
                java.lang.String r2 = ""
                if (r1 != 0) goto L1c
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
                int r1 = r4.length()
                r2 = 98
                if (r1 != r2) goto L39
                goto L27
            L1c:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
                int r1 = r4.length()
                r2 = 36
                if (r1 != r2) goto L39
            L27:
                kotlin.uuid.Uuid r4 = kotlin.uuid.UuidKt.uuidParseHexDash(r4)
                int r1 = kotlin.uuid.Uuid.Companion.d
                int r1 = r1 + 107
                int r2 = r1 % 128
                kotlin.uuid.Uuid.Companion.asBinder = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L37
                return r4
            L37:
                r4 = 0
                throw r4
            L39:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Expected a 36-char string in the standard hex-and-dash UUID format, but was \""
                r0.<init>(r1)
                r1 = 64
                java.lang.String r1 = kotlin.uuid.UuidKt__UuidKt.access$truncateForErrorMessage(r4, r1)
                r0.append(r1)
                java.lang.String r1 = "\" of length "
                r0.append(r1)
                int r4 = r4.length()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.uuid.Uuid.Companion.parseHexDash(java.lang.String):kotlin.uuid.Uuid");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        
            r0 = new java.lang.StringBuilder("Expected a 32-char hexadecimal string, but was \"");
            r0.append(kotlin.uuid.UuidKt__UuidKt.truncateForErrorMessage$UuidKt__UuidKt(r4, 64));
            r0.append("\" of length ");
            r0.append(r4.length());
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
        
            throw new java.lang.IllegalArgumentException(r0.toString().toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r4.length() == 26) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            if (r4.length() == 32) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            r4 = kotlin.uuid.UuidKt.uuidParseHex(r4);
            r1 = kotlin.uuid.Uuid.Companion.d + 39;
            kotlin.uuid.Uuid.Companion.asBinder = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.uuid.Uuid parseHex(java.lang.String r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = kotlin.uuid.Uuid.Companion.d
                int r1 = r1 + 17
                int r2 = r1 % 128
                kotlin.uuid.Uuid.Companion.asBinder = r2
                int r1 = r1 % r0
                java.lang.String r2 = ""
                if (r1 == 0) goto L1c
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
                int r1 = r4.length()
                r2 = 26
                if (r1 != r2) goto L35
                goto L27
            L1c:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
                int r1 = r4.length()
                r2 = 32
                if (r1 != r2) goto L35
            L27:
                kotlin.uuid.Uuid r4 = kotlin.uuid.UuidKt.uuidParseHex(r4)
                int r1 = kotlin.uuid.Uuid.Companion.d
                int r1 = r1 + 39
                int r2 = r1 % 128
                kotlin.uuid.Uuid.Companion.asBinder = r2
                int r1 = r1 % r0
                return r4
            L35:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Expected a 32-char hexadecimal string, but was \""
                r0.<init>(r1)
                r1 = 64
                java.lang.String r1 = kotlin.uuid.UuidKt__UuidKt.access$truncateForErrorMessage(r4, r1)
                r0.append(r1)
                java.lang.String r1 = "\" of length "
                r0.append(r1)
                int r4 = r4.length()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.uuid.Uuid.Companion.parseHex(java.lang.String):kotlin.uuid.Uuid");
        }

        public final Uuid random() {
            int i = 2 % 2;
            int i2 = asBinder + 7;
            d = i2 % 128;
            int i3 = i2 % 2;
            Uuid uuidSecureRandomUuid = UuidKt.secureRandomUuid();
            int i4 = asBinder + 51;
            d = i4 % 128;
            int i5 = i4 % 2;
            return uuidSecureRandomUuid;
        }

        public final Comparator<Uuid> getLEXICAL_ORDER() {
            int i = 2 % 2;
            int i2 = d + 29;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Comparator<Uuid> comparatorNaturalOrder = ComparisonsKt.naturalOrder();
            int i4 = asBinder + 17;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 46 / 0;
            }
            return comparatorNaturalOrder;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "Use naturalOrder<Uuid>() instead", replaceWith = @ReplaceWith(expression = "naturalOrder<Uuid>()", imports = {"kotlin.comparisons.naturalOrder"}))
        @DeprecatedSinceKotlin(warningSince = "2.1")
        public static /* synthetic */ void getLEXICAL_ORDER$annotations() {
            int i = 2 % 2;
            int i2 = d + 17;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r7, short r8, int r9) {
            /*
                int r8 = r8 + 117
                int r9 = r9 * 4
                int r9 = r9 + 4
                byte[] r0 = kotlin.uuid.Uuid.Companion.$$c
                int r7 = r7 * 2
                int r7 = 1 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r5 = r2
                r9 = r7
                goto L29
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L29:
                int r8 = -r8
                int r3 = r3 + 1
                int r8 = r8 + r9
                r9 = r3
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.uuid.Uuid.Companion.$$e(short, short, int):java.lang.String");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Uuid p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        long j = this.mostSignificantBits;
        return j != p0.mostSignificantBits ? Long.compare(ULong.m8203constructorimpl(j) ^ Long.MIN_VALUE, ULong.m8203constructorimpl(p0.mostSignificantBits) ^ Long.MIN_VALUE) : Long.compare(ULong.m8203constructorimpl(this.leastSignificantBits) ^ Long.MIN_VALUE, ULong.m8203constructorimpl(p0.leastSignificantBits) ^ Long.MIN_VALUE);
    }

    public final int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    private final Object writeReplace() {
        return UuidKt.serializedUuid(this);
    }

    public /* synthetic */ Uuid(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
