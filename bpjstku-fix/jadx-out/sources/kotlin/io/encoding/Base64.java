package kotlin.io.encoding;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import defpackage.deInitSession;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0017\u0018\u0000 >2\u00020\u0001:\u0002?>B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u0019\u001a\u00028\u0000\"\f\b\u0000\u0010\u0018*\u00060\u0016j\u0002`\u00172\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001b\u0010\u000eJ;\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0012J+\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001b\u0010\u001eJ;\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001fJ'\u0010 \u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0001¢\u0006\u0004\b \u0010\u000eJ7\u0010!\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000¢\u0006\u0004\b!\u0010\u0012J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J7\u0010&\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u0012J'\u0010'\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0000¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0017\u0010*\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u000bH\u0001¢\u0006\u0004\b*\u0010+J/\u0010,\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u00100J'\u00101\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u0010(J'\u00102\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0000¢\u0006\u0004\b2\u00103J'\u00104\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0002¢\u0006\u0004\b4\u00103R\u001a\u00105\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010%R\u001a\u00108\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010%R\u001a\u0010:\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010="}, d2 = {"Lkotlin/io/encoding/Base64;", "", "", "p0", "p1", "Lkotlin/io/encoding/Base64$PaddingOption;", "p2", "<init>", "(ZZLkotlin/io/encoding/Base64$PaddingOption;)V", "withPadding", "(Lkotlin/io/encoding/Base64$PaddingOption;)Lkotlin/io/encoding/Base64;", "", "", "encodeToByteArray", "([BII)[B", "p3", "p4", "encodeIntoByteArray", "([B[BIII)I", "", "encode", "([BII)Ljava/lang/String;", "Ljava/lang/Appendable;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "encodeToAppendable", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "decode", "decodeIntoByteArray", "", "(Ljava/lang/CharSequence;II)[B", "(Ljava/lang/CharSequence;[BIII)I", "encodeToByteArrayImpl$kotlin_stdlib", "encodeIntoByteArrayImpl$kotlin_stdlib", "encodeSize$kotlin_stdlib", "(I)I", "shouldPadOnEncode", "()Z", "decodeImpl", "decodeSize$kotlin_stdlib", "([BII)I", "charsToBytesImpl$kotlin_stdlib", "bytesToStringImpl$kotlin_stdlib", "([B)Ljava/lang/String;", "handlePaddingSymbol", "([BIII)I", "", "checkPaddingIsAllowed", "(I)V", "skipIllegalSymbolsIfMime", "checkSourceBounds$kotlin_stdlib", "(III)V", "checkDestinationBounds", "isUrlSafe", "Z", "isUrlSafe$kotlin_stdlib", "isMimeScheme", "isMimeScheme$kotlin_stdlib", "paddingOption", "Lkotlin/io/encoding/Base64$PaddingOption;", "getPaddingOption$kotlin_stdlib", "()Lkotlin/io/encoding/Base64$PaddingOption;", "Default", "PaddingOption"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class Base64 {

    /* JADX INFO: renamed from: Default, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Base64 Mime;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static final Base64 UrlSafe;
    private static char[] b = null;
    private static final int bitsPerByte = 8;
    private static final int bitsPerSymbol = 6;
    public static final int bytesPerGroup = 3;
    private static final int mimeGroupsPerLine = 19;
    public static final int mimeLineLength = 76;
    private static final byte[] mimeLineSeparatorSymbols;
    public static final int symbolsPerGroup = 4;
    private final boolean isMimeScheme;
    private final boolean isUrlSafe;
    private final PaddingOption paddingOption;
    public static final byte padSymbol = 61;
    private static final byte[] $$c = {82, padSymbol, -66, -42};
    private static final int $$f = 210;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {57, -50, -56, -93, 4, -11, -11, -19, -10, 6, -22, 38, -39, -21, -1, -22, 8, 52, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 57};
    private static final int $$e = 249;
    private static final byte[] $$a = {55, -47, -47, 67, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 251;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1238a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    private static void c(byte b2, byte b3, int i, Object[] objArr) {
        int i2 = 98 - (b3 * 14);
        int i3 = (b2 * 52) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = (i3 + (-i2)) - 10;
            i3++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i5 = i2;
            i2 = (i5 + (-bArr[i3])) - 10;
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r5 = r5 * 30
            int r5 = r5 + 84
            byte[] r0 = kotlin.io.encoding.Base64.$$d
            int r7 = r7 * 2
            int r1 = r7 + 53
            byte[] r1 = new byte[r1]
            int r7 = r7 + 52
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            int r6 = r6 + 1
            int r5 = r5 + (-9)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.Base64.e(byte, byte, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ Base64 access$getMime$cp() {
        int i = 2 % 2;
        int i2 = f1238a + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return Mime;
        }
        throw null;
    }

    public static final /* synthetic */ byte[] access$getMimeLineSeparatorSymbols$cp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        f1238a = i2 % 128;
        if (i2 % 2 != 0) {
            return mimeLineSeparatorSymbols;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Base64 access$getUrlSafe$cp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        int i3 = i2 % 128;
        f1238a = i3;
        int i4 = i2 % 2;
        Base64 base64 = UrlSafe;
        int i5 = i3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return base64;
    }

    private Base64(boolean z, boolean z2, PaddingOption paddingOption) {
        this.isUrlSafe = z;
        this.isMimeScheme = z2;
        this.paddingOption = paddingOption;
        if (z && z2) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i = f1238a + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    public final boolean isUrlSafe$kotlin_stdlib() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 67;
        f1238a = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isUrlSafe;
        int i5 = i2 + 121;
        f1238a = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean isMimeScheme$kotlin_stdlib() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        int i3 = i2 % 128;
        f1238a = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.isMimeScheme;
        int i4 = i3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final PaddingOption getPaddingOption$kotlin_stdlib() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        int i3 = i2 % 128;
        f1238a = i3;
        int i4 = i2 % 2;
        PaddingOption paddingOption = this.paddingOption;
        int i5 = i3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return paddingOption;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "<init>", "(Ljava/lang/String;I)V", "PRESENT", "ABSENT", "PRESENT_OPTIONAL", "ABSENT_OPTIONAL"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum PaddingOption {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        ABSENT_OPTIONAL;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public static EnumEntries<PaddingOption> getEntries() {
            return $ENTRIES;
        }
    }

    public final Base64 withPadding(PaddingOption p0) {
        int i = 2 % 2;
        int i2 = f1238a + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.paddingOption != p0) {
            return new Base64(this.isUrlSafe, this.isMimeScheme, p0);
        }
        int i4 = f1238a + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(Base64 base64, byte[] bArr, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = f1238a + 73;
        int i6 = i5 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6;
        int i7 = i5 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i3 & 2) != 0) {
            int i8 = i6 + 61;
            f1238a = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        }
        if ((i3 & 4) != 0) {
            int i10 = i6 + 83;
            f1238a = i10 % 128;
            int i11 = i10 % 2;
            i2 = bArr.length;
            int i12 = i6 + 81;
            f1238a = i12 % 128;
            int i13 = i12 % 2;
        }
        return base64.encodeToByteArray(bArr, i, i2);
    }

    public final byte[] encodeToByteArray(byte[] p0, int p1, int p2) throws Throwable {
        int i = 2 % 2;
        int i2 = f1238a + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        byte[] bArrEncodeToByteArrayImpl$kotlin_stdlib = encodeToByteArrayImpl$kotlin_stdlib(p0, p1, p2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        f1238a = i4 % 128;
        if (i4 % 2 != 0) {
            return bArrEncodeToByteArrayImpl$kotlin_stdlib;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int encodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        int i5;
        int i6;
        int i7 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        int i9 = i8 % 128;
        f1238a = i9;
        int i10 = i8 % 2;
        int i11 = (i4 & 4) != 0 ? 0 : i;
        if ((i4 & 8) != 0) {
            int i12 = i9 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
            int i13 = i12 % 2;
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i4 & 16) != 0) {
            int length = bArr.length;
            int i14 = i9 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
            int i15 = i14 % 2;
            i6 = length;
        } else {
            i6 = i3;
        }
        return base64.encodeIntoByteArray(bArr, bArr2, i11, i5, i6);
    }

    public final int encodeIntoByteArray(byte[] p0, byte[] p1, int p2, int p3, int p4) throws Throwable {
        int iEncodeIntoByteArrayImpl$kotlin_stdlib;
        int i = 2 % 2;
        int i2 = f1238a + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            iEncodeIntoByteArrayImpl$kotlin_stdlib = encodeIntoByteArrayImpl$kotlin_stdlib(p0, p1, p2, p3, p4);
            int i3 = 40 / 0;
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            iEncodeIntoByteArrayImpl$kotlin_stdlib = encodeIntoByteArrayImpl$kotlin_stdlib(p0, p1, p2, p3, p4);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        f1238a = i4 % 128;
        if (i4 % 2 != 0) {
            return iEncodeIntoByteArrayImpl$kotlin_stdlib;
        }
        throw null;
    }

    public static /* synthetic */ String encode$default(Base64 base64, byte[] bArr, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        int i6 = i5 % 128;
        f1238a = i6;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i3 & 2) != 0) {
            int i7 = i6 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
            f1238a = i9 % 128;
            int i10 = i9 % 2;
        }
        return base64.encode(bArr, i, i2);
    }

    public final String encode(byte[] p0, int p1, int p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        String str = new String(encodeToByteArrayImpl$kotlin_stdlib(p0, p1, p2), Charsets.ISO_8859_1);
        int i2 = f1238a + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Appendable encodeToAppendable$default(Base64 base64, byte[] bArr, Appendable appendable, int i, int i2, int i3, Object obj) throws IOException {
        int i4 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i6 = i5 + 77;
        f1238a = i6 % 128;
        int i7 = i6 % 2;
        if ((i3 & 4) != 0) {
            int i8 = i5 + 111;
            f1238a = i8 % 128;
            int i9 = i8 % 2;
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
            int i10 = f1238a + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            int i11 = i10 % 2;
        }
        Appendable appendableEncodeToAppendable = base64.encodeToAppendable(bArr, appendable, i, i2);
        int i12 = f1238a + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
        int i13 = i12 % 2;
        return appendableEncodeToAppendable;
    }

    public final <A extends Appendable> A encodeToAppendable(byte[] p0, A p1, int p2, int p3) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        p1.append(new String(encodeToByteArrayImpl$kotlin_stdlib(p0, p2, p3), Charsets.ISO_8859_1));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        f1238a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
        return p1;
    }

    private static void d(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
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
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 2267 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 33, -1927765101, false, $$g(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2266, 33 - KeyEvent.getDeadChar(0, 0), -1927765101, false, $$g(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = $10 + 55;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i7 = $10 + 57;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 49267), 3261 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 30, -127612708, false, $$g(b7, b8, (byte) (b8 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 22879), ExpandableListView.getPackedPositionType(0L) + 594, KeyEvent.getDeadChar(0, 0) + 17, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i10 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i10];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                        } else {
                            int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i14 = $11 + 51;
        $10 = i14 % 128;
        int i15 = i14 % 2;
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, byte[] bArr, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        int i6 = i5 % 128;
        f1238a = i6;
        if (i5 % 2 != 0 ? (i3 & 2) != 0 : (i3 & 5) != 0) {
            int i7 = i6 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
            int i9 = i6 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
        }
        return base64.decode(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if ((r10 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        r10 = 73 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        if (decodeImpl(r10, r8, 0, r11, r12) == r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (decodeImpl(r10, r8, 0, r11, r12) == r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r10 = kotlin.io.encoding.Base64.f1238a + 97;
        kotlin.io.encoding.Base64.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r10 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] decode(byte[] r10, int r11, int r12) throws java.lang.Throwable {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.io.encoding.Base64.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 121
            int r2 = r1 % 128
            kotlin.io.encoding.Base64.f1238a = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L2a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            int r1 = r10.length
            r9.checkSourceBounds$kotlin_stdlib(r1, r11, r12)
            int r1 = r9.decodeSize$kotlin_stdlib(r10, r11, r12)
            byte[] r8 = new byte[r1]
            r5 = 0
            r2 = r9
            r3 = r10
            r4 = r8
            r6 = r11
            r7 = r12
            int r10 = r2.decodeImpl(r3, r4, r5, r6, r7)
            if (r10 != r1) goto L53
            goto L43
        L2a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            int r1 = r10.length
            r9.checkSourceBounds$kotlin_stdlib(r1, r11, r12)
            int r1 = r9.decodeSize$kotlin_stdlib(r10, r11, r12)
            byte[] r8 = new byte[r1]
            r5 = 0
            r2 = r9
            r3 = r10
            r4 = r8
            r6 = r11
            r7 = r12
            int r10 = r2.decodeImpl(r3, r4, r5, r6, r7)
            if (r10 != r1) goto L53
        L43:
            int r10 = kotlin.io.encoding.Base64.f1238a
            int r10 = r10 + 97
            int r11 = r10 % 128
            kotlin.io.encoding.Base64.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r11
            int r10 = r10 % r0
            if (r10 == 0) goto L52
            r10 = 73
            int r10 = r10 / 0
        L52:
            return r8
        L53:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Check failed."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.Base64.decode(byte[], int, int):byte[]");
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        int i5;
        int length;
        int i6 = 2 % 2;
        int i7 = f1238a;
        int i8 = i7 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        int i9 = i8 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i10 = 0;
        if ((i4 & 4) != 0) {
            int i11 = i7 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i4 & 8) != 0) {
            int i13 = i7 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            if (i13 % 2 != 0) {
                i10 = 1;
            }
        } else {
            i10 = i2;
        }
        if ((i4 & 16) != 0) {
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            f1238a = i14 % 128;
            if (i14 % 2 == 0) {
                int length2 = bArr.length;
                throw null;
            }
            length = bArr.length;
        } else {
            length = i3;
        }
        return base64.decodeIntoByteArray(bArr, bArr2, i5, i10, length);
    }

    public final int decodeIntoByteArray(byte[] p0, byte[] p1, int p2, int p3, int p4) throws Throwable {
        int i = 2 % 2;
        int i2 = f1238a + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        checkSourceBounds$kotlin_stdlib(p0.length, p3, p4);
        checkDestinationBounds(p1.length, p2, decodeSize$kotlin_stdlib(p0, p3, p4));
        int iDecodeImpl = decodeImpl(p0, p1, p2, p3, p4);
        int i4 = f1238a + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return iDecodeImpl;
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, CharSequence charSequence, int i, int i2, int i3, Object obj) throws Throwable {
        int i4 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        int i5 = f1238a + 83;
        int i6 = i5 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6;
        if (i5 % 2 == 0 ? (i3 & 2) != 0 : (i3 & 4) != 0) {
            int i7 = i6 + 41;
            f1238a = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        byte[] bArrDecode = base64.decode(charSequence, i, i2);
        int i9 = f1238a + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
        int i10 = i9 % 2;
        return bArrDecode;
    }

    public final byte[] decode(CharSequence p0, int p1, int p2) throws Throwable {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        int i = 2 % 2;
        int i2 = f1238a + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            boolean z = p0 instanceof String;
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0 instanceof String) {
            int i3 = f1238a + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            String str = (String) p0;
            checkSourceBounds$kotlin_stdlib(str.length(), p1, p2);
            String strSubstring = str.substring(p1, p2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(p0, p1, p2);
            int i5 = f1238a + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        }
        return decode$default(this, bArrCharsToBytesImpl$kotlin_stdlib, 0, 0, 6, (Object) null);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, CharSequence charSequence, byte[] bArr, int i, int i2, int i3, int i4, Object obj) throws Throwable {
        int length;
        int i5 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i6 = f1238a;
        int i7 = i6 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = (i4 & 4) != 0 ? 0 : i;
        int i10 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            int i11 = i6 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
            length = charSequence.length();
        } else {
            length = i3;
        }
        int iDecodeIntoByteArray = base64.decodeIntoByteArray(charSequence, bArr, i9, i10, length);
        int i13 = f1238a + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
        if (i13 % 2 == 0) {
            return iDecodeIntoByteArray;
        }
        throw null;
    }

    public final int decodeIntoByteArray(CharSequence p0, byte[] p1, int p2, int p3, int p4) throws Throwable {
        byte[] bytes;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (!(p0 instanceof String)) {
            bytes = charsToBytesImpl$kotlin_stdlib(p0, p3, p4);
        } else {
            int i2 = f1238a + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            String str = (String) p0;
            checkSourceBounds$kotlin_stdlib(str.length(), p3, p4);
            String strSubstring = str.substring(p3, p4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "");
            bytes = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            f1238a = i4 % 128;
            int i5 = i4 % 2;
        }
        return decodeIntoByteArray$default(this, bytes, p1, p2, 0, 0, 24, (Object) null);
    }

    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(byte[] p0, int p1, int p2) throws Throwable {
        byte[] bArr;
        int i = 2 % 2;
        int i2 = f1238a + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            checkSourceBounds$kotlin_stdlib(p0.length, p1, p2);
            bArr = new byte[encodeSize$kotlin_stdlib(p2 >>> p1)];
            encodeIntoByteArrayImpl$kotlin_stdlib(p0, bArr, 1, p1, p2);
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            checkSourceBounds$kotlin_stdlib(p0.length, p1, p2);
            bArr = new byte[encodeSize$kotlin_stdlib(p2 - p1)];
            encodeIntoByteArrayImpl$kotlin_stdlib(p0, bArr, 0, p1, p2);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        f1238a = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(byte[] p0, byte[] p1, int p2, int p3, int p4) throws Throwable {
        byte[] bArr;
        int i;
        int i2;
        int i3 = p3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        checkSourceBounds$kotlin_stdlib(p0.length, i3, p4);
        checkDestinationBounds(p1.length, p2, encodeSize$kotlin_stdlib(p4 - i3));
        if (this.isUrlSafe) {
            int i5 = f1238a + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                bArr = Base64Kt.base64UrlEncodeMap;
                int i6 = 48 / 0;
            } else {
                bArr = Base64Kt.base64UrlEncodeMap;
            }
        } else {
            bArr = Base64Kt.base64EncodeMap;
        }
        int i7 = 19;
        int i8 = this.isMimeScheme ? 19 : Integer.MAX_VALUE;
        int i9 = p2;
        while (true) {
            i = i3 + 2;
            if (i >= p4) {
                break;
            }
            int iMin = Math.min((p4 - i3) / 3, i8);
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = f1238a + i7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                int i12 = i11 % 2;
                int i13 = i3 + 3;
                int i14 = (p0[i3 + 2] & UByte.MAX_VALUE) | ((p0[i3] & UByte.MAX_VALUE) << 16) | ((p0[i3 + 1] & UByte.MAX_VALUE) << 8);
                p1[i9] = bArr[i14 >>> 18];
                p1[i9 + 1] = bArr[(i14 >>> 12) & 63];
                p1[i9 + 2] = bArr[(i14 >>> 6) & 63];
                p1[i9 + 3] = bArr[i14 & 63];
                i10++;
                i9 += 4;
                i3 = i13;
                i7 = 19;
            }
            if (iMin == i8 && i3 != p4) {
                int i15 = f1238a + 117;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                if (i15 % 2 != 0) {
                    byte[] bArr2 = mimeLineSeparatorSymbols;
                    p1[i9] = bArr2[0];
                    i2 = i9 >> 3;
                    p1[i9] = bArr2[0];
                } else {
                    byte[] bArr3 = mimeLineSeparatorSymbols;
                    p1[i9] = bArr3[0];
                    i2 = i9 + 2;
                    p1[i9 + 1] = bArr3[1];
                }
                i9 = i2;
            }
            i7 = 19;
        }
        int i16 = p4 - i3;
        if (i16 == 1) {
            int i17 = i3 + 1;
            int i18 = (p0[i3] & UByte.MAX_VALUE) << 4;
            p1[i9] = bArr[i18 >>> 6];
            int i19 = i9 + 2;
            p1[i9 + 1] = bArr[i18 & 63];
            if (shouldPadOnEncode()) {
                p1[i19] = padSymbol;
                p1[i9 + 3] = padSymbol;
                i9 += 4;
            } else {
                i9 = i19;
            }
            i3 = i17;
        } else if (i16 == 2) {
            int i20 = ((p0[i3 + 1] & UByte.MAX_VALUE) << 2) | ((p0[i3] & UByte.MAX_VALUE) << 10);
            p1[i9] = bArr[i20 >>> 12];
            p1[i9 + 1] = bArr[(i20 >>> 6) & 63];
            int i21 = i9 + 3;
            p1[i9 + 2] = bArr[i20 & 63];
            if (shouldPadOnEncode()) {
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
                f1238a = i22 % 128;
                if (i22 % 2 == 0) {
                    i9 += 34;
                    p1[i21] = 53;
                } else {
                    i9 += 4;
                    p1[i21] = padSymbol;
                }
            } else {
                i9 = i21;
            }
            i3 = i;
        }
        if (i3 == p4) {
            return i9 - p2;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    public final int encodeSize$kotlin_stdlib(int p0) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i4 + 119;
        f1238a = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = p0 / 2;
            i = p0 - 6;
            if (i2 != 0) {
                int i6 = i4 + 1;
                f1238a = i6 % 128;
                int i7 = i6 % 2;
                i += shouldPadOnEncode() ? 4 : i2 + 1;
            }
        } else {
            int i8 = p0 / 3;
            int i9 = p0 % 3;
            int i10 = i8 * 4;
            if (i9 != 0) {
                i2 = i9;
                i = i10;
                int i11 = i4 + 1;
                f1238a = i11 % 128;
                int i12 = i11 % 2;
                i += shouldPadOnEncode() ? 4 : i2 + 1;
            } else {
                i = i10;
            }
        }
        if (this.isMimeScheme) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
            f1238a = i13 % 128;
            int i14 = i13 % 2;
            i += ((i - 1) / 76) * 2;
        }
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    private final boolean shouldPadOnEncode() {
        int i = 2 % 2;
        int i2 = f1238a + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (this.paddingOption == PaddingOption.PRESENT || this.paddingOption == PaddingOption.PRESENT_OPTIONAL) {
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        f1238a = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2 A[SYNTHETIC] */
    private final int decodeImpl(byte[] p0, byte[] p1, int p2, int p3, int p4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        int i7 = f1238a + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int[] iArr = this.isUrlSafe ? Base64Kt.base64UrlDecodeMap : Base64Kt.base64DecodeMap;
        int i8 = -8;
        int i9 = p2;
        int iHandlePaddingSymbol = p3;
        int i10 = -8;
        int i11 = 0;
        while (true) {
            if (iHandlePaddingSymbol >= p4) {
                i = -2;
                z = false;
                break;
            }
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
            int i13 = i12 % 128;
            f1238a = i13;
            if (i12 % i5 != 0 ? i10 != i8 : i10 != 74) {
                i2 = p0[iHandlePaddingSymbol] & UByte.MAX_VALUE;
                i3 = iArr[i2];
                if (i3 >= 0) {
                    iHandlePaddingSymbol++;
                    i11 = (i11 << 6) | i3;
                    i4 = i10 + 6;
                    if (i4 >= 0) {
                        int i14 = i13 + 17;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                        int i15 = i14 % 2;
                        p1[i9] = (byte) (i11 >>> i4);
                        i11 &= (1 << i4) - 1;
                        i10 -= 2;
                        i9++;
                        i5 = 2;
                    } else {
                        i10 = i4;
                    }
                } else {
                    if (i3 == -2) {
                        iHandlePaddingSymbol = handlePaddingSymbol(p0, iHandlePaddingSymbol, p4, i10);
                        z = true;
                        i = -2;
                        break;
                    }
                    if (!this.isMimeScheme) {
                        StringBuilder sb = new StringBuilder("Invalid symbol '");
                        sb.append((char) i2);
                        sb.append("'(");
                        String string = Integer.toString(i2, CharsKt.checkRadix(8));
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        sb.append(string);
                        sb.append(") at index ");
                        sb.append(iHandlePaddingSymbol);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    iHandlePaddingSymbol++;
                }
                i5 = 2;
            } else {
                int i16 = iHandlePaddingSymbol + 3;
                if (i16 < p4) {
                    int i17 = (iArr[p0[iHandlePaddingSymbol + 1] & UByte.MAX_VALUE] << 12) | (iArr[p0[iHandlePaddingSymbol] & UByte.MAX_VALUE] << 18) | (iArr[p0[iHandlePaddingSymbol + 2] & UByte.MAX_VALUE] << 6) | iArr[p0[i16] & UByte.MAX_VALUE];
                    if (i17 >= 0) {
                        p1[i9] = (byte) (i17 >> 16);
                        p1[i9 + 1] = (byte) (i17 >> 8);
                        p1[i9 + 2] = (byte) i17;
                        iHandlePaddingSymbol += 4;
                        i9 += 3;
                    } else {
                        i2 = p0[iHandlePaddingSymbol] & UByte.MAX_VALUE;
                        i3 = iArr[i2];
                        if (i3 >= 0) {
                            iHandlePaddingSymbol++;
                            i11 = (i11 << 6) | i3;
                            i4 = i10 + 6;
                            if (i4 >= 0) {
                                int i18 = i13 + 17;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                                int i19 = i18 % 2;
                                p1[i9] = (byte) (i11 >>> i4);
                                i11 &= (1 << i4) - 1;
                                i10 -= 2;
                                i9++;
                                i5 = 2;
                            } else {
                                i10 = i4;
                            }
                        } else {
                            if (i3 == -2) {
                                iHandlePaddingSymbol = handlePaddingSymbol(p0, iHandlePaddingSymbol, p4, i10);
                                z = true;
                                i = -2;
                                break;
                            }
                            if (!this.isMimeScheme) {
                                StringBuilder sb2 = new StringBuilder("Invalid symbol '");
                                sb2.append((char) i2);
                                sb2.append("'(");
                                String string2 = Integer.toString(i2, CharsKt.checkRadix(8));
                                Intrinsics.checkNotNullExpressionValue(string2, "");
                                sb2.append(string2);
                                sb2.append(") at index ");
                                sb2.append(iHandlePaddingSymbol);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            iHandlePaddingSymbol++;
                        }
                    }
                    i5 = 2;
                } else {
                    i2 = p0[iHandlePaddingSymbol] & UByte.MAX_VALUE;
                    i3 = iArr[i2];
                    if (i3 >= 0) {
                        iHandlePaddingSymbol++;
                        i11 = (i11 << 6) | i3;
                        i4 = i10 + 6;
                        if (i4 >= 0) {
                            int i110 = i13 + 17;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i110 % 128;
                            int i111 = i110 % 2;
                            p1[i9] = (byte) (i11 >>> i4);
                            i11 &= (1 << i4) - 1;
                            i10 -= 2;
                            i9++;
                            i5 = 2;
                        } else {
                            i10 = i4;
                        }
                    } else {
                        if (i3 == -2) {
                            iHandlePaddingSymbol = handlePaddingSymbol(p0, iHandlePaddingSymbol, p4, i10);
                            z = true;
                            i = -2;
                            break;
                        }
                        if (!this.isMimeScheme) {
                            StringBuilder sb3 = new StringBuilder("Invalid symbol '");
                            sb3.append((char) i2);
                            sb3.append("'(");
                            String string3 = Integer.toString(i2, CharsKt.checkRadix(8));
                            Intrinsics.checkNotNullExpressionValue(string3, "");
                            sb3.append(string3);
                            sb3.append(") at index ");
                            sb3.append(iHandlePaddingSymbol);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        iHandlePaddingSymbol++;
                    }
                    i5 = 2;
                }
            }
            i8 = -8;
        }
        if (i10 == i) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i10 != -8 && !z && this.paddingOption == PaddingOption.PRESENT) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i11 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        int iSkipIllegalSymbolsIfMime = skipIllegalSymbolsIfMime(p0, iHandlePaddingSymbol, p4);
        if (iSkipIllegalSymbolsIfMime >= p4) {
            return i9 - p2;
        }
        int i20 = p0[iSkipIllegalSymbolsIfMime] & UByte.MAX_VALUE;
        StringBuilder sb4 = new StringBuilder("Symbol '");
        sb4.append((char) i20);
        sb4.append("'(");
        String string4 = Integer.toString(i20, CharsKt.checkRadix(8));
        Intrinsics.checkNotNullExpressionValue(string4, "");
        sb4.append(string4);
        sb4.append(") at index ");
        sb4.append(iSkipIllegalSymbolsIfMime - 1);
        sb4.append(" is prohibited after the pad character");
        throw new IllegalArgumentException(sb4.toString());
    }

    public final int decodeSize$kotlin_stdlib(byte[] p0, int p1, int p2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        f1238a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i4 = p2 - p1;
        if (i4 == 0) {
            return 0;
        }
        if (i4 == 1) {
            StringBuilder sb = new StringBuilder("Input should have at least 2 symbols for Base64 decoding, startIndex: ");
            sb.append(p1);
            sb.append(", endIndex: ");
            sb.append(p2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.isMimeScheme) {
            int i5 = f1238a + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            while (p1 < p2) {
                int i6 = Base64Kt.base64DecodeMap[p0[p1] & UByte.MAX_VALUE];
                if (i6 < 0) {
                    int i7 = f1238a + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                    if (i7 % 2 != 0) {
                        if (i6 == 87) {
                            i4 -= p2 - p1;
                            break;
                        }
                        i4--;
                    } else {
                        if (i6 == -2) {
                            i4 -= p2 - p1;
                            break;
                        }
                        i4--;
                    }
                }
                p1++;
            }
        } else if (p0[p2 - 1] == 61) {
            i4 = p0[p2 - 2] == 61 ? i4 - 2 : i4 - 1;
        }
        return (int) ((((long) i4) * 6) / 8);
    }

    public final byte[] charsToBytesImpl$kotlin_stdlib(CharSequence p0, int p1, int p2) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        checkSourceBounds$kotlin_stdlib(p0.length(), p1, p2);
        byte[] bArr = new byte[p2 - p1];
        int i2 = 0;
        while (p1 < p2) {
            int i3 = f1238a + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            char cCharAt = p0.charAt(p1);
            if (cCharAt <= 255) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                f1238a = i5 % 128;
                int i6 = i5 % 2;
                bArr[i2] = (byte) cCharAt;
            } else {
                bArr[i2] = 63;
            }
            i2++;
            p1++;
        }
        return bArr;
    }

    public final String bytesToStringImpl$kotlin_stdlib(byte[] p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        StringBuilder sb = new StringBuilder(p0.length);
        int i2 = f1238a + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        for (byte b2 : p0) {
            int i4 = f1238a + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            sb.append((char) b2);
        }
        return sb.toString();
    }

    private final int handlePaddingSymbol(byte[] p0, int p1, int p2, int p3) {
        int i = 2 % 2;
        if (p3 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index ".concat(String.valueOf(p1)));
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 115;
        f1238a = i3 % 128;
        if (i3 % 2 != 0 ? p3 == -6 : p3 == 100) {
            checkPaddingIsAllowed(p1);
            return p1 + 1;
        }
        int i4 = i2 + 99;
        f1238a = i4 % 128;
        int i5 = i4 % 2;
        if (p3 != -4) {
            if (p3 == -2) {
                return p1 + 1;
            }
            throw new IllegalStateException("Unreachable".toString());
        }
        checkPaddingIsAllowed(p1);
        int iSkipIllegalSymbolsIfMime = skipIllegalSymbolsIfMime(p0, p1 + 1, p2);
        if (iSkipIllegalSymbolsIfMime != p2) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i7 = i6 + 59;
            f1238a = i7 % 128;
            int i8 = i7 % 2;
            if (p0[iSkipIllegalSymbolsIfMime] == 61) {
                int i9 = i6 + 27;
                f1238a = i9 % 128;
                int i10 = i9 % 2;
                return iSkipIllegalSymbolsIfMime + 1;
            }
        }
        throw new IllegalArgumentException("Missing one pad character at index ".concat(String.valueOf(iSkipIllegalSymbolsIfMime)));
    }

    private final void checkPaddingIsAllowed(int p0) {
        int i = 2 % 2;
        int i2 = f1238a + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (this.paddingOption != PaddingOption.ABSENT) {
            int i4 = f1238a + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index ".concat(String.valueOf(p0)));
    }

    private final int skipIllegalSymbolsIfMime(byte[] p0, int p1, int p2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        int i3 = i2 % 128;
        f1238a = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.isMimeScheme) {
            int i4 = i3 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return p1;
        }
        while (p1 < p2) {
            if (Base64Kt.base64DecodeMap[p0[p1] & UByte.MAX_VALUE] != -1) {
                break;
            }
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            f1238a = i6 % 128;
            int i7 = i6 % 2;
            p1++;
        }
        return p1;
    }

    /* JADX INFO: renamed from: kotlin.io.encoding.Base64$Default, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "<init>", "()V", "", "bitsPerByte", "I", "bitsPerSymbol", "bytesPerGroup", "symbolsPerGroup", "", "padSymbol", "B", "mimeLineLength", "mimeGroupsPerLine", "", "mimeLineSeparatorSymbols", "[B", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "UrlSafe", "Lkotlin/io/encoding/Base64;", "getUrlSafe", "()Lkotlin/io/encoding/Base64;", "Mime", "getMime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion extends Base64 {
        /* JADX WARN: Illegal instructions before constructor call */
        private Companion() {
            boolean z = false;
            super(z, z, PaddingOption.PRESENT, null);
        }

        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return Base64.access$getMimeLineSeparatorSymbols$cp();
        }

        public final Base64 getUrlSafe() {
            return Base64.access$getUrlSafe$cp();
        }

        public final Base64 getMime() {
            return Base64.access$getMime$cp();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void checkSourceBounds$kotlin_stdlib(int p0, int p1, int p2) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        f1238a = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 31533);
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 921;
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 28;
            byte b2 = $$a[80];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, iIndexOf, offsetAfter, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{16, '\r', 15, 7, 2, 4, 19, 2, 4, 21, 0, 3, 19, 21, 3, 20, '\n', 17, 21, 0, '\f', 20}, (byte) (32 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{24, 21, 19, 15, 20, 24, 19, '\f', 3, 23, 0, 5, 2, '\r', 13850}, (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 26), 15 - View.MeasureSpec.getMode(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 921;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr[80], bArr[7], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, minimumFlingVelocity, threadPriority, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31533);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
                int i4 = 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                c(b4, b5, (byte) (b5 | 36), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, absoluteGravity, i4, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i5 = (-256035378) + (((~((~startUptimeMillis) | (-891661970))) | 19205777) * (-245));
            int i6 = ~(startUptimeMillis | (-891661970));
            int i7 = i5 + (i6 * (-245)) + ((i6 | 882417674) * 245) + 1426039092;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{16, '\r', 15, 7, 2, 4, 19, 2, 19, 15, 24, '\t', 14, 11, 1, 4, '\b', 4, 1, 15, 6, 23, '\b', 20, 19, 18}, (byte) (89 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 26 - TextUtils.getCapsMode("", 0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{'\f', 5, 13854, 13854, 21, '\r', 3, '\n', 13856, 13856, 23, 0, '\r', 15, 1, 4, 6, 16}, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 53), View.getDefaultSize(0, 0) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                f1238a = i10 % 128;
                int i11 = i10 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
            f1238a = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(p0), 0, 1426039092};
                byte[] bArr2 = $$d;
                byte b6 = bArr2[43];
                byte b7 = bArr2[89];
                Object[] objArr11 = new Object[1];
                e(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr2[89];
                Object[] objArr12 = new Object[1];
                e(b8, bArr2[43], b8, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char mirror = (char) (31581 - AndroidCharacter.getMirror('0'));
                    int iNormalizeMetaState = 921 - KeyEvent.normalizeMetaState(0);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 29;
                    byte b9 = $$a[7];
                    byte b10 = b9;
                    Object[] objArr13 = new Object[1];
                    c(b9, b10, (byte) (b10 | 36), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, iNormalizeMetaState, iLastIndexOf, -1142834547, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    d(new char[]{16, '\r', 15, 7, 2, 4, 19, 2, 4, 21, 0, 3, 19, 21, 3, 20, '\n', 17, 21, 0, '\f', 20}, (byte) ('P' - AndroidCharacter.getMirror('0')), 22 - (KeyEvent.getMaxKeyCode() >> 16), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    d(new char[]{24, 21, 19, 15, 20, 24, 19, '\f', 3, 23, 0, 5, 2, '\r', 13850}, (byte) (28 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 15 - TextUtils.getCapsMode("", 0, 0), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 31533);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
                        int iIndexOf2 = 28 - TextUtils.indexOf("", "", 0);
                        byte[] bArr3 = $$a;
                        Object[] objArr16 = new Object[1];
                        c(bArr3[80], bArr3[7], (byte) 52, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, scrollBarFadeDuration, iIndexOf2, -778300370, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
                        int modifierMetaStateMask = 920 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int iRgb = (-16777188) - Color.rgb(0, 0, 0);
                        byte b11 = $$a[80];
                        byte b12 = b11;
                        Object[] objArr17 = new Object[1];
                        c(b11, b12, b12, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, modifierMetaStateMask, iRgb, -1048449946, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            int i14 = f1238a + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
            for (int i15 = i14 % 2 == 0 ? 0 : 1; i15 < strArr.length; i15++) {
                arrayList.add(strArr[i15]);
            }
            throw null;
        }
        int i16 = ((int[]) objArr[0])[0];
        int i17 = ((int[]) objArr[3])[0];
        int i18 = ((int[]) objArr[1])[0];
        new int[1][0] = i17;
        new int[1][0] = i18;
        int i19 = (-403930261) + (((~((-516988655) | p0)) | 180391596 | (~((-1257090990) | p0))) * (-880));
        int i20 = (~((-516988655) | (~p0))) | 1257090989;
        int i21 = ~(516988654 | p0);
        int i22 = i16 + i19 + ((i20 | i21) * (-880)) + (i21 * 880);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        int[] iArr = {i24 ^ (i24 << 5)};
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(p1, p2, p0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    private final void checkDestinationBounds(int p0, int p1, int p2) {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        int i4 = i3 % 128;
        f1238a = i4;
        if (i3 % 2 == 0) {
            int i5 = 91 / 0;
            if (p1 >= 0) {
                if (p1 <= p0) {
                    i = p1 + p2;
                    if (i >= 0) {
                        int i6 = i4 + 93;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                        int i7 = i6 % 2;
                        if (i <= p0) {
                            return;
                        }
                    }
                    StringBuilder sb = new StringBuilder("The destination array does not have enough capacity, destination offset: ");
                    sb.append(p1);
                    sb.append(", destination size: ");
                    sb.append(p0);
                    sb.append(", capacity needed: ");
                    sb.append(p2);
                    throw new IndexOutOfBoundsException(sb.toString());
                }
            }
        } else if (p1 >= 0) {
            if (p1 <= p0) {
                i = p1 + p2;
                if (i >= 0) {
                    int i8 = i4 + 93;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                    int i9 = i8 % 2;
                    if (i <= p0) {
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder("The destination array does not have enough capacity, destination offset: ");
                sb2.append(p1);
                sb2.append(", destination size: ");
                sb2.append(p0);
                sb2.append(", capacity needed: ");
                sb2.append(p2);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder("destination offset: ");
        sb3.append(p1);
        sb3.append(", destination size: ");
        sb3.append(p0);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentbindingInflater1();
        INSTANCE = new Companion(null);
        mimeLineSeparatorSymbols = new byte[]{13, 10};
        UrlSafe = new Base64(true, false, PaddingOption.PRESENT);
        Mime = new Base64(false, true, PaddingOption.PRESENT);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ Base64(boolean z, boolean z2, PaddingOption paddingOption, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, paddingOption);
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        b = new char[]{60047, 60052, 60072, 60050, 60117, 60041, 60049, 60046, 60079, 60045, 60056, 60053, 60054, 60090, 60073, 60088, 60034, 60063, 60058, 60043, 60055, 60051, 60048, 60062, 60040};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 57188;
    }

    private static String $$g(byte b2, byte b3, byte b4) {
        int i = 3 - (b3 * 4);
        int i2 = 116 - b4;
        byte[] bArr = $$c;
        int i3 = b2 * 3;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i2 += -i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i++;
            i2 += -bArr[i];
        }
    }
}
