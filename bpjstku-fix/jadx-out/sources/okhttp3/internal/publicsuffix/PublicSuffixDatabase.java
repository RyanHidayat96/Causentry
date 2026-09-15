package okhttp3.internal.publicsuffix;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.RotationProvider1;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.SurfaceViewImplementation;
import defpackage.getVisibilityRampUpAnimationDurationMillis;
import defpackage.initSession;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u000e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "", "", "p0", "findMatchingRule", "(Ljava/util/List;)Ljava/util/List;", "getEffectiveTldPlusOne", "(Ljava/lang/String;)Ljava/lang/String;", "", "readTheList", "readTheListUninterruptibly", "", "p1", "setListBytes", "([B[B)V", "splitDomain", "(Ljava/lang/String;)Ljava/util/List;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "publicSuffixExceptionListBytes", "[B", "publicSuffixListBytes", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE;
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static byte[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] WILDCARD_LABEL;
    private static int b;
    private static int d;
    private static final PublicSuffixDatabase instance;
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private static final byte[] $$c = {89, 107, -36, -112};
    private static final int $$d = 200;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {83, -90, 68, -23, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 105;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int g = 0;
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = 84 - r8
            byte[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.$$a
            int r6 = r6 * 2
            int r1 = r6 + 53
            byte[] r1 = new byte[r1]
            int r6 = r6 + 52
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L19:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r8]
            int r3 = r3 + 1
        L2e:
            int r7 = r7 + r4
            int r8 = r8 + 1
            int r7 = r7 + (-11)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.c(byte, byte, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ PublicSuffixDatabase access$getInstance$cp() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 21;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        PublicSuffixDatabase publicSuffixDatabase = instance;
        int i5 = i2 + 61;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return publicSuffixDatabase;
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2266, 32 - MotionEvent.axisFromString(""), 1387473586, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                int i7 = $10 + 41;
                int i8 = i7 % 128;
                $11 = i8;
                int i9 = i7 % 2;
                byte[] bArr = TuitionPaymentFragmentbindingInflater1;
                if (bArr != null) {
                    int i10 = i8 + 39;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $11 + 117;
                        $10 = i13 % 128;
                        int i14 = i13 % i4;
                        Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cMyPid = (char) (Process.myPid() >> 22);
                            int maximumFlingVelocity = 3358 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 18;
                            byte length2 = (byte) $$c.length;
                            byte b5 = (byte) (length2 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, maximumFlingVelocity, longPressTimeout, -1054011043, false, $$e(length2, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i12] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i12++;
                        i4 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentbindingInflater1;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.rgb(0, 0, 0) + 16777216), 2266 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 33, 1387473586, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ j)) + i6;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 1;
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - View.getDefaultSize(0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2855, (ViewConfiguration.getTapTimeout() >> 16) + 13, -1529949196, false, $$e(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    int i15 = 0;
                    while (i15 < length3) {
                        bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 3046761265686732006L);
                        i15++;
                        int i16 = $10 + 47;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
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
            int i20 = $10 + 17;
            $11 = i20 % 128;
            int i21 = i20 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "<init>", "()V", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "p0", "", "p1", "", "binarySearch", "([B[[BI)Ljava/lang/String;", "", "EXCEPTION_MARKER", "C", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.access$getInstance$cp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int iAnd;
            int iAnd2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 >= 0 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        iAnd = 46;
                        z = false;
                    } else {
                        z = z2;
                        iAnd = Util.and(bArr2[i8][i9], 255);
                    }
                    iAnd2 = iAnd - Util.and(bArr[i5 + i10], 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        i9 = -1;
                        z2 = true;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset charset = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(charset, "");
                                return new String(bArr, i5, i7, charset);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i4;
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getEffectiveTldPlusOne(String p0) throws Throwable {
        int length;
        int size;
        int size2;
        long j;
        int i = 2 % 2;
        int i2 = asBinder + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        String unicode = IDN.toUnicode(p0);
        Intrinsics.checkNotNullExpressionValue(unicode, "");
        List<String> listSplitDomain = splitDomain(unicode);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - Color.green(0)), 39 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 19 - TextUtils.getTrimmedLength(""), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(1157434443 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getLongPressTimeout() >> 16) - 35, (short) (TextUtils.lastIndexOf("", '0', 0) - 38), (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 41), (ViewConfiguration.getTapTimeout() >> 16) + 174069210, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 1157434447, (-43) - ExpandableListView.getPackedPositionChild(0L), (short) (108 - (ViewConfiguration.getScrollBarSize() >> 8)), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45), 174069231 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = 988;
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j3 = -1;
        long j4 = ((j3 ^ 523961476824600844L) | 1573295697917358143L) ^ j3;
        long j5 = j3 ^ 1573295697917358143L;
        long j6 = jElapsedRealtime ^ j3;
        long j7 = (((long) (-1975)) * 523961476824600844L) + (((long) 989) * 1573295697917358143L) + ((jElapsedRealtime | j4) * j2) + (((long) (-1976)) * (((j5 | 523961476824600844L) ^ j3) | ((j6 | 523961476824600844L) ^ j3))) + (j2 * (j4 | ((j5 | jElapsedRealtime) ^ j3) | (j3 ^ (j6 | 1573295697917358143L))));
        int i5 = 0;
        long j8 = jLongValue;
        while (true) {
            if (i5 == 10) {
                if (p0 != null) {
                    int i6 = asInterface + 31;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                    length = p0.length();
                } else {
                    length = 0;
                }
                try {
                    Object[] objArr3 = {-1235733412};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 46038), 1134 - KeyEvent.normalizeMetaState(0), 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(length), 0, -695305872, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr3), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        c(b2, b3, b3, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, maxKeyCode, iCombineMeasuredStates, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - ((byte) KeyEvent.getModifierMetaStateMask())), 1118 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 17 - TextUtils.getOffsetBefore("", 0)), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i8 = ((int[]) objArr6[1])[0];
                    int i9 = ((int[]) objArr6[3])[0];
                    if (i9 == i8) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr6[0];
                    if (strArr != null) {
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    int[] iArr = new int[i9];
                    int i10 = i9 - 1;
                    iArr[i10] = 1;
                    Toast.makeText((Context) null, iArr[((i9 * i10) % 2) - 1], 1).show();
                    break;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 37836), Gravity.getAbsoluteGravity(0, 0) + 59, (ViewConfiguration.getTouchSlop() >> 8) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i11 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            int i12 = asInterface + 77;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            long j9 = j8;
            int i14 = 0;
            while (true) {
                int i15 = 0;
                while (i15 != 8) {
                    i11 = (((((int) (j9 >> i15)) & 255) + (i11 << 6)) + (i11 << 16)) - i11;
                    i15++;
                    j7 = j7;
                }
                j = j7;
                if (i14 != 0) {
                    break;
                }
                i14++;
                j9 = j;
                j7 = j9;
            }
            if (i11 == i4) {
                break;
            }
            j8 -= 1024;
            i5++;
            j7 = j;
        }
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size()) {
            int i16 = asInterface + 9;
            asBinder = i16 % 128;
            int i17 = i16 % 2;
            if (listFindMatchingRule.get(0).charAt(0) != '!') {
                return null;
            }
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        return SequencesKt.joinToString$default(SequencesKt.drop(CollectionsKt.asSequence(splitDomain(p0)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    private final List<String> splitDomain(String p0) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        List<String> listSplit$default = StringsKt.split$default((CharSequence) p0, new char[]{'.'}, false, 0, 6, (Object) null);
        if (!Intrinsics.areEqual(CollectionsKt.last((List) listSplit$default), "")) {
            return listSplit$default;
        }
        int i4 = asBinder + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return CollectionsKt.dropLast(listSplit$default, 1);
    }

    private final List<String> findMatchingRule(List<String> p0) {
        String strBinarySearch;
        String strBinarySearch2;
        String strBinarySearch3;
        List<String> listEmptyList;
        List<String> listEmptyList2;
        int i = 2 % 2;
        int i2 = asInterface + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if ((!this.listRead.get()) && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = p0.size();
        byte[][] bArr = new byte[size][];
        for (int i4 = 0; i4 < size; i4++) {
            String str = p0.get(i4);
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            bArr[i4] = bytes;
        }
        byte[][] bArr2 = bArr;
        int length = bArr2.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                strBinarySearch = null;
                break;
            }
            Companion companion = INSTANCE;
            byte[] bArr3 = this.publicSuffixListBytes;
            if (bArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                bArr3 = null;
            }
            strBinarySearch = companion.binarySearch(bArr3, bArr, i5);
            if (strBinarySearch != null) {
                break;
            }
            i5++;
        }
        if (bArr2.length <= 1) {
            strBinarySearch2 = null;
            break;
        }
        byte[][] bArr4 = (byte[][]) bArr2.clone();
        int length2 = bArr4.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length2 - 1) {
                strBinarySearch2 = null;
                break;
            }
            bArr4[i6] = WILDCARD_LABEL;
            Companion companion2 = INSTANCE;
            byte[] bArr5 = this.publicSuffixListBytes;
            if (bArr5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                bArr5 = null;
            }
            strBinarySearch2 = companion2.binarySearch(bArr5, bArr4, i6);
            if (strBinarySearch2 != null) {
                break;
            }
            i6++;
        }
        if (strBinarySearch2 == null) {
            strBinarySearch3 = null;
            break;
        }
        int length3 = bArr2.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length3 - 1) {
                strBinarySearch3 = null;
                break;
            }
            int i8 = asBinder + 39;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            Companion companion3 = INSTANCE;
            byte[] bArr6 = this.publicSuffixExceptionListBytes;
            if (bArr6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i10 = asBinder + 103;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                bArr6 = null;
            }
            strBinarySearch3 = companion3.binarySearch(bArr6, bArr, i7);
            if (strBinarySearch3 != null) {
                break;
            }
            int i12 = asBinder + 17;
            asInterface = i12 % 128;
            int i13 = i12 % 2;
            i7++;
        }
        if (strBinarySearch3 != null) {
            int i14 = asInterface + 75;
            asBinder = i14 % 128;
            if (i14 % 2 != 0) {
                return StringsKt.split$default((CharSequence) "!".concat(String.valueOf(strBinarySearch3)), new char[]{'.'}, false, 0, 6, (Object) null);
            }
            String strConcat = "!".concat(String.valueOf(strBinarySearch3));
            char[] cArr = new char[1];
            cArr[1] = 'H';
            return StringsKt.split$default((CharSequence) strConcat, cArr, true, 1, 35, (Object) null);
        }
        if (strBinarySearch == null) {
            int i15 = asInterface + 79;
            asBinder = i15 % 128;
            int i16 = i15 % 2;
            if (strBinarySearch2 == null) {
                return PREVAILING_RULE;
            }
        }
        if (strBinarySearch == null || (listEmptyList = StringsKt.split$default((CharSequence) strBinarySearch, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (strBinarySearch2 == null || (listEmptyList2 = StringsKt.split$default((CharSequence) strBinarySearch2, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        if (listEmptyList.size() > listEmptyList2.size()) {
            return listEmptyList;
        }
        int i17 = asBinder + 29;
        asInterface = i17 % 128;
        if (i17 % 2 == 0) {
            return listEmptyList2;
        }
        throw null;
    }

    private final void readTheListUninterruptibly() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        int i3 = i2 % 128;
        asBinder = i3;
        boolean z = i2 % 2 == 0;
        int i4 = i3 + 43;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            try {
                try {
                    try {
                        readTheList();
                        break;
                    } catch (IOException e2) {
                        Platform.INSTANCE.get().log("Failed to read public suffix list", 5, e2);
                        if (!z) {
                            return;
                        }
                    }
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, byte[]] */
    private final void readTheList() throws IOException {
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new getVisibilityRampUpAnimationDurationMillis(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(resourceAsStream)));
                try {
                    RotationProvider1 rotationProvider1 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    objectRef.element = rotationProvider1.b(rotationProvider1.INotificationSideChannelStubProxy());
                    objectRef2.element = rotationProvider1.b(rotationProvider1.INotificationSideChannelStubProxy());
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
                    synchronized (this) {
                        Object obj = objectRef.element;
                        Intrinsics.checkNotNull(obj);
                        this.publicSuffixListBytes = (byte[]) obj;
                        Object obj2 = objectRef2.element;
                        Intrinsics.checkNotNull(obj2);
                        this.publicSuffixExceptionListBytes = (byte[]) obj2;
                        Unit unit2 = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3, th);
                        throw th2;
                    }
                }
            }
            this.readCompleteLatch.countDown();
        } catch (Throwable th3) {
            this.readCompleteLatch.countDown();
            throw th3;
        }
    }

    public final void setListBytes(byte[] p0, byte[] p1) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.publicSuffixListBytes = p0;
            this.publicSuffixExceptionListBytes = p1;
            this.listRead.set(true);
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.publicSuffixListBytes = p0;
            this.publicSuffixExceptionListBytes = p1;
            this.listRead.set(true);
        }
        this.readCompleteLatch.countDown();
    }

    static {
        d = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new Companion(null);
        WILDCARD_LABEL = new byte[]{42};
        PREVAILING_RULE = CollectionsKt.listOf("*");
        instance = new PublicSuffixDatabase();
        int i = g + 109;
        d = i % 128;
        if (i % 2 == 0) {
            int i2 = 13 / 0;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2033366720;
        b = -1934795553;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 934258928;
        TuitionPaymentFragmentbindingInflater1 = new byte[]{-82, -30, -73, -63, -64, -82, 25, -87, 28, -48, -43, 95, -78, 105, -20, 31, 28, 29, -88, -32, -83, -113, 91, -118, 95, 92, -125, 52, -79, ByteCompanionObject.MIN_VALUE, -107, 36, 80, -118, 88, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, short r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r6 = r6 + 117
            byte[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.$$c
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r8 = r8 + 1
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.$$e(int, short, short):java.lang.String");
    }
}
