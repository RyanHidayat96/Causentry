package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.measurement.internal.zzny;
import com.google.mlkit.common.MlKitException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001a8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u0007\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u00068\u0017X\u0097D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000b\u0010\u0014R\u0014\u0010\r\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019"}, d2 = {"LsetPreviewTargetSize;", "LcreateImageAnalysis;", "<init>", "()V", "", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(I)Ljava/lang/String;", "(Ljava/lang/String;)I", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(I)Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)LcreateImageAnalysis;", "", "", "b", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "LdeactivateRecording;", "LdeactivateRecording;", "()LdeactivateRecording;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setPreviewTargetSize implements createImageAnalysis {
    public static final setPreviewTargetSize INSTANCE;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private static final String b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private static final deactivateRecording TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int d;
    private static final byte[] $$c = {ByteCompanionObject.MAX_VALUE, 43, -39, -37};
    private static final int $$f = 74;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {33, -59, 107, -108, -4, -20, -6, 6, -26, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 42;
    private static final byte[] $$a = {43, 23, 22, -14, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1380a = 0;
    private static int asInterface = 1;
    private static int b = 0;

    public static /* synthetic */ Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i4 | i);
        int i9 = (~((~i) | i4)) | (~(i4 | i5));
        int i10 = i4 + i5 + i6 + (32217706 * i3) + (238734613 * i2);
        int i11 = i10 * i10;
        int i12 = (((-3446596) * i4) - 528416768) + (677943110 * i5) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i6) + ((-154927104) * i3) + ((-131989504) * i2) + ((-1876361216) * i11);
        int i13 = ((i4 * 1127137324) - 440746823) + (i5 * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i6 * 1127136485) + (i3 * 976419026) + (i2 * 1106960329) + (i11 * 279773184);
        return i12 + ((i13 * i13) * (-1943076864)) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.setPreviewTargetSize.$$a
            int r5 = r5 * 14
            int r5 = r5 + 84
            int r1 = r7 + 1
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-10)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setPreviewTargetSize.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 5
            int r5 = 8 - r5
            int r7 = r7 * 47
            int r0 = 53 - r7
            int r6 = r6 * 33
            int r6 = 117 - r6
            byte[] r1 = defpackage.setPreviewTargetSize.$$d
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            int r5 = r5 + 1
            r3 = r1[r5]
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setPreviewTargetSize.f(int, short, int, java.lang.Object[]):void");
    }

    private setPreviewTargetSize() {
    }

    @Override // defpackage.createImageAnalysis
    public final boolean b() {
        int i = 2 % 2;
        int i2 = f1380a + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    @Override // defpackage.createImageAnalysis
    public final boolean d() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        int i3 = i2 % 128;
        f1380a = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        d = 1;
        asInterface();
        INSTANCE = new setPreviewTargetSize();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = isCameraAttached.TuitionPaymentFragmentbindingInflater1.INSTANCE;
        b = "kotlin.Nothing";
        int i = b + 39;
        d = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 81;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 111;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 64837), Color.rgb(0, 0, 0) + 16778572, 38 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 47773), KeyEvent.keyCodeFromString("") + 468, 12 - TextUtils.lastIndexOf("", '0', 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i8 = $11 + 19;
        $10 = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x01f9  */
    @Override // defpackage.createImageAnalysis
    public final deactivateRecording TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 31533);
            int capsMode2 = 921 - TextUtils.getCapsMode("", 0, 0);
            int absoluteGravity = 28 - Gravity.getAbsoluteGravity(0, 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[7], bArr[37], bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, capsMode2, absoluteGravity, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{30367, 41075, 30462, 54062, 2675, 15876, 60529, 26607, 47676, 40933, 47397, 6223, 61288, 44235, 30115, 52582, 4226, 31127, 18125, 33180, 17858, 1619, 5001, 45730, 35072, 54071}, AndroidCharacter.getMirror('0') - '/', objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{20865, 4742, 20964, 25049, 49321, 61655, 9902, 43326, 40254, 11548, 29695, 55008, 51324, 7724, 48955, 914, 14220, 52092, 35846}, TextUtils.getOffsetAfter("", 0) + 1, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 31533);
            int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
            int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[80];
            byte b3 = bArr2[37];
            Object[] objArr5 = new Object[1];
            c(b2, b3, (byte) (b3 & 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, i2, iIndexOf, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
                int i3 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int iRed = Color.red(0) + 28;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[80];
                byte b5 = (byte) (bArr3[17] + 1);
                Object[] objArr6 = new Object[1];
                c(b4, (byte) (b4 | 51), b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, i3, iRed, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i4}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = (((-335625976) + (((~((~iIdentityHashCode) | 9613669)) | (-1773911416)) * 529)) + (((~(iIdentityHashCode | 9613669)) | (-1764465975)) * 529)) - 1080497429;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{18657, 51869, 18560, 47552, 15691, 16107, 56137, 26368, 33858, 62731, 36381, 6304, 53528, 50726, 17093, 52724, 11972, 4969, 29173, 33151, 31655, 27799, 9385, 45659, 46921, 47578, 56155, 26395, 33864, 62722}, 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{35892, 10179, 35927, 21637, 9718, 11864, 50146, 30643, 16541, 6226, 38576, 2172, 5596, 11128, 23140, 56576, 59955, 65077, 26952, 37324, 49003, 33230}, 1 - ExpandableListView.getPackedPositionType(0L), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i8 = f1380a + 75;
                    asInterface = i8 % 128;
                    int i9 = i8 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{3592, 42820, 3682, 54294, 11069, 20941, 52525, 2101, 49898, 39127, 39022, 30662, 38903, 43937, 21648, 41605, 26655, 32423, 26514, 61021}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{23634, 27557, 23611, 6386, 55411, 25300, 15984, 15139, 37098, 21555, 27445, 17608, 50562, 26383, 43006, 37261, 14965, 45661, 38109, 56652}, View.resolveSizeAndState(0, 0, 0) + 1, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1080497429};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[10];
                Object[] objArr13 = new Object[1];
                f(b6, bArr4[12], b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr4[12];
                Object[] objArr14 = new Object[1];
                f(b7, bArr4[10], b7, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char trimmedLength = (char) (31533 - TextUtils.getTrimmedLength(""));
                    int mirror = AndroidCharacter.getMirror('0') + 873;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                    byte[] bArr5 = $$a;
                    byte b8 = bArr5[80];
                    byte b9 = (byte) (bArr5[17] + 1);
                    Object[] objArr15 = new Object[1];
                    c(b8, (byte) (b8 | 51), b9, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, mirror, iResolveOpacity, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{30367, 41075, 30462, 54062, 2675, 15876, 60529, 26607, 47676, 40933, 47397, 6223, 61288, 44235, 30115, 52582, 4226, 31127, 18125, 33180, 17858, 1619, 5001, 45730, 35072, 54071}, -TextUtils.indexOf((CharSequence) "", '0'), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{20865, 4742, 20964, 25049, 49321, 61655, 9902, 43326, 40254, 11548, 29695, 55008, 51324, 7724, 48955, 914, 14220, 52092, 35846}, 1 - (Process.myTid() >> 22), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (31534 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int i10 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 921;
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 28;
                        byte[] bArr6 = $$a;
                        byte b10 = bArr6[80];
                        byte b11 = bArr6[37];
                        Object[] objArr18 = new Object[1];
                        c(b10, b11, (byte) (b11 & 52), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i10, offsetAfter, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31532);
                        int longPressTimeout = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iResolveOpacity2 = 28 - Drawable.resolveOpacity(0, 0);
                        byte[] bArr7 = $$a;
                        Object[] objArr19 = new Object[1];
                        c(bArr7[7], bArr7[37], bArr7[80], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, longPressTimeout, iResolveOpacity2, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i11 = f1380a + 57;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = asInterface + 37;
            f1380a = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[3])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i18}, (String[]) objArr[4]};
            int iMyTid = Process.myTid();
            int i19 = ~((-840151381) | iMyTid);
            int i20 = ~iMyTid;
            int i21 = i17 + (-1395843965) + ((i19 | (~(933928263 | i20))) * (-1808)) + (((~((-839029061) | iMyTid)) | (~(i20 | 935050583))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iMyTid | (-933928264))) | 1122320 | (~(840151380 | i20))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr20[0])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i24 = 0;
                while (i24 < strArr.length) {
                    int i25 = asInterface + 31;
                    f1380a = i25 % 128;
                    if (i25 % 2 != 0) {
                        arrayList.add(strArr[i24]);
                        i24 += 126;
                    } else {
                        arrayList.add(strArr[i24]);
                        i24++;
                    }
                }
            }
            int[] iArr = new int[i14];
            int i26 = i14 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i26) % 2) - 1], 1).show();
            int i27 = ((int[]) objArr[0])[0];
            int i28 = ((int[]) objArr[3])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i28}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i29 = ~iIdentityHashCode2;
            int i30 = i27 + 1780023588 + (((~(i29 | 1377534221)) | 396545422) * (-1042)) + ((1377534221 | iIdentityHashCode2) * 521) + (((~(iIdentityHashCode2 | (-396545423))) | 302153996 | (~(i29 | 1471925647))) * 521);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr21[0])[0] = i32 ^ (i32 << 5);
            int i33 = f1380a + 43;
            asInterface = i33 % 128;
            int i34 = i33 % 2;
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.createImageAnalysis
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final String getINotificationSideChannel() {
        String str;
        int i = 2 % 2;
        int i2 = f1380a + 51;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            str = b;
            int i4 = 68 / 0;
        } else {
            str = b;
        }
        int i5 = i3 + 5;
        f1380a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f1380a + 119;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 121;
        f1380a = i4 % 128;
        int i5 = i4 % 2;
        return "NothingSerialDescriptor";
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int iHashCode;
        setPreviewTargetSize setpreviewtargetsize = (setPreviewTargetSize) objArr[0];
        int i = 2 % 2;
        int i2 = f1380a + 57;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = b.hashCode() >> (setpreviewtargetsize.TuitionPaymentFragmentbindingInflater1().hashCode() >>> 72);
        } else {
            iHashCode = (setpreviewtargetsize.TuitionPaymentFragmentbindingInflater1().hashCode() * 31) + b.hashCode();
        }
        return Integer.valueOf(iHashCode);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f1380a + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        List listEmptyList = CollectionsKt.emptyList();
        int i4 = asInterface + 37;
        f1380a = i4 % 128;
        if (i4 % 2 == 0) {
            return listEmptyList;
        }
        throw null;
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> b(int p0) {
        int i = 2 % 2;
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.createImageAnalysis
    public final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) {
        int i = 2 % 2;
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.createImageAnalysis
    public final int TuitionPaymentFragmentbindingInflater1(String p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.createImageAnalysis
    public final String TuitionPaymentFragmentbindingInflater1(int p0) {
        int i = 2 % 2;
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // defpackage.createImageAnalysis
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int p0) {
        int i = 2 % 2;
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = f1380a;
        int i3 = i2 + 63;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        if (this == p0) {
            int i6 = i2 + 73;
            asInterface = i6 % 128;
            return i6 % 2 != 0;
        }
        int i7 = i4 + 103;
        f1380a = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (List) b(new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1677983456, -1677983455, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.createImageAnalysis
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 97;
        f1380a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 125;
        f1380a = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Integer) b(new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 330182218, -330182218, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).intValue();
    }

    static void asInterface() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 4248286360700885333L;
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
    private static java.lang.String $$g(int r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r0 = 1 - r8
            int r7 = r7 * 2
            int r7 = r7 + 107
            byte[] r1 = defpackage.setPreviewTargetSize.$$c
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r6 = r6 + 1
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setPreviewTargetSize.$$g(int, byte, byte):java.lang.String");
    }
}
