package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0017¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r"}, d2 = {"LgetLifecycleCameraRepositoryObserver;", ExifInterface.GPS_DIRECTION_TRUE, "LmodifyBitrate;", "LappendBackupVideoProfile;", "p0", "p1", "<init>", "(LappendBackupVideoProfile;LappendBackupVideoProfile;)V", "LderiveCodec;", "LgenerateBackupProfile;", "TuitionPaymentFragmentbindingInflater1", "(LderiveCodec;)LgenerateBackupProfile;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LappendBackupVideoProfile;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 3, 0})
public final class getLifecycleCameraRepositoryObserver<T> implements modifyBitrate<T, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static short[] f952a;
    private final appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final appendBackupVideoProfile TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {21, 65, -9, -121};
    private static final int $$d = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {5, -91, 77, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 163;
    private static int asInterface = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -1864254176;
    private static int b = -1934795532;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1812228783;
    private static byte[] asBinder = {-18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -26, -26};

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 52
            int r7 = 56 - r7
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r9 = r9 + 1
            byte[] r0 = defpackage.getLifecycleCameraRepositoryObserver.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2d:
            int r7 = r7 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getLifecycleCameraRepositoryObserver.c(short, int, short, java.lang.Object[]):void");
    }

    public getLifecycleCameraRepositoryObserver(appendBackupVideoProfile appendbackupvideoprofile, appendBackupVideoProfile appendbackupvideoprofile2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendbackupvideoprofile;
        this.TuitionPaymentFragmentbindingInflater1 = appendbackupvideoprofile2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getLifecycleCameraRepositoryObserver(appendBackupVideoProfile appendbackupvideoprofile, appendBackupVideoProfile appendbackupvideoprofile2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = g + 59;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            appendbackupvideoprofile = isSamsungJ2.b();
            Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofile, "");
            int i4 = asInterface + 99;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            appendbackupvideoprofile2 = dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1();
            Intrinsics.checkExpressionValueIsNotNull(appendbackupvideoprofile2, "");
            int i6 = asInterface + 19;
            g = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        this(appendbackupvideoprofile, appendbackupvideoprofile2);
    }

    @Override // defpackage.modifyBitrate
    public final generateBackupProfile<T> TuitionPaymentFragmentbindingInflater1(deriveCodec<T> p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 651;
            int i3 = 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b3, (byte) (b3 | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, offsetBefore, i3, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d((-525781334) - View.MeasureSpec.getMode(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, (short) (TextUtils.lastIndexOf("", '0', 0) + 1), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-474800582) - Color.argb(0, 0, 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d((-525781330) - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) - 3, (short) View.combineMeasuredStates(0, 0), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-474800561) - View.MeasureSpec.getSize(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
            int packedPositionChild = 650 - ExpandableListView.getPackedPositionChild(0L);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44;
            byte[] bArr2 = $$a;
            byte b4 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b4, bArr2[80], b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, packedPositionChild, keyRepeatTimeout, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = asInterface + 113;
            g = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int iResolveSize = 651 - View.resolveSize(0, 0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 45;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                c(b5, b6, (byte) (b6 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumDrawingCacheSize, iResolveSize, iLastIndexOf, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            int i8 = (int) Runtime.getRuntime().totalMemory();
            int i9 = ~i8;
            int i10 = (((1162379461 + ((i8 | (-696991456)) * 140)) + (((~((-696991456) | i9)) | 696981593) * (-280))) + (((~(i8 | (-696981594))) | ((~(700422265 | i9)) | (-700432128))) * 140)) - 256994258;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 1611 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -256994258, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int trimmedLength = 651 - TextUtils.getTrimmedLength("");
                    int fadingEdgeLength = 44 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr3 = $$a;
                    byte b7 = bArr3[7];
                    Object[] objArr9 = new Object[1];
                    c(b7, bArr3[80], b7, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, trimmedLength, fadingEdgeLength, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ExpandableListView.getPackedPositionGroup(0L), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 695, TextUtils.indexOf((CharSequence) "", '0') + 99), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "", 0) + 63406), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 792, TextUtils.lastIndexOf("", '0', 0, 0) + 84), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                    int maxKeyCode = 651 - (KeyEvent.getMaxKeyCode() >> 16);
                    int doubleTapTimeout = 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b8 = $$a[7];
                    byte b9 = b8;
                    Object[] objArr10 = new Object[1];
                    c(b8, b9, (byte) (b9 | 37), objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore2, maxKeyCode, doubleTapTimeout, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    d((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 525781334, KeyEvent.keyCodeFromString("") + 4, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (Process.myTid() >> 22), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 474800582, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    d((-525781329) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-3) - KeyEvent.getDeadChar(0, 0), (short) KeyEvent.getDeadChar(0, 0), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-474800561) - Drawable.resolveOpacity(0, 0), objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 652;
                        int iLastIndexOf3 = 43 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[7];
                        Object[] objArr13 = new Object[1];
                        c(b10, bArr4[80], b10, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iLastIndexOf2, iLastIndexOf3, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int i13 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 44;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[80];
                        byte b12 = bArr5[7];
                        Object[] objArr14 = new Object[1];
                        c(b11, b12, (byte) (b12 | 52), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(tapTimeout2, i13, jumpTapTimeout, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i14 = ((int[]) objArr[0])[0];
        int i15 = ((int[]) objArr[2])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    int i16 = g + 73;
                    asInterface = i16 % 128;
                    if (i16 % 2 != 0) {
                        arrayList.add(strArr[i2]);
                        i2 += 98;
                    } else {
                        arrayList.add(strArr[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i17 = g + 47;
        asInterface = i17 % 128;
        int i18 = i17 % 2;
        Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i19 = ((int[]) objArr[3])[0];
        int i20 = ((int[]) objArr[2])[0];
        int i21 = ((int[]) objArr[0])[0];
        int iMyTid = Process.myTid();
        int i22 = i19 + (-1374888425) + (((~(iMyTid | (-249246899))) | 252677708) * 191) + (((~((~iMyTid) | (-249246899))) | 235602944) * 191);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr15[3])[0] = i24 ^ (i24 << 5);
        appendBackupVideoProfile appendbackupvideoprofile = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        share.b(appendbackupvideoprofile, "scheduler is null");
        SingleSubscribeOn singleSubscribeOn = new SingleSubscribeOn(p0, appendbackupvideoprofile);
        appendBackupVideoProfile appendbackupvideoprofile2 = this.TuitionPaymentFragmentbindingInflater1;
        share.b(appendbackupvideoprofile2, "scheduler is null");
        SingleObserveOn singleObserveOn = new SingleObserveOn(singleSubscribeOn, appendbackupvideoprofile2);
        int i25 = ((int[]) objArr15[3])[0];
        int i26 = i25 * i25;
        int i27 = -(611994392 * i25);
        int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
        int i29 = -(i25 * 1536959586);
        int i30 = (i28 & i29) + (i29 | i28);
        int i31 = ((i30 | 1449181577) << 1) - (1449181577 ^ i30);
        int i32 = i31 >> 22;
        int i33 = ((i32 ^ (-2047)) + ((i32 & (-2047)) << 1)) / 1024;
        int i34 = ((i33 | 1) << 1) - (i33 ^ 1);
        int i35 = (i31 ^ i34) + ((i34 & i31) << 1);
        int i36 = i31 >> 19;
        int i37 = ((i36 ^ (-16383)) + ((i36 & (-16383)) << 1)) / 8192;
        int i38 = -(((i37 & 1) + (i37 | 1)) ^ i35);
        int i39 = (i38 ^ 3) + ((i38 & 3) << 1);
        int i40 = i39 >> 15;
        int i41 = ((((-262143) | i40) << 1) - (i40 ^ (-262143))) / 131072;
        int i42 = (i41 ^ 1) + ((i41 & 1) << 1);
        Intrinsics.checkExpressionValueIsNotNull(singleObserveOn, "11|9|9|10|upstream.subscribeOn(sub…erveOn(observerScheduler)".substring(44700 / (((-(((i42 | 1) << 1) - (i42 ^ 1))) & i39) * 1490)));
        return singleObserveOn;
    }

    private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 2315 - AndroidCharacter.getMirror('0'), 32 - ((byte) KeyEvent.getModifierMetaStateMask()), 1387473586, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i6 = $11 + 5;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = asBinder;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int deadChar = 3358 - KeyEvent.getDeadChar(0, 0);
                            int i8 = 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte length2 = (byte) $$c.length;
                            byte b5 = (byte) (length2 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, deadChar, i8, -1054011043, false, $$e(length2, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = asBinder;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 2267 - TextUtils.getTrimmedLength(""), Color.red(0) + 33, 1387473586, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (((long) f952a[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i9 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                if (!z2) {
                    i4 = 0;
                } else {
                    int i10 = $10 + 59;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 1;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i9 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 1;
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - Color.green(0)), 2855 - (ViewConfiguration.getTapTimeout() >> 16), 13 - Color.alpha(0), -1529949196, false, $$e(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = asBinder;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i12 = 0; i12 < length3; i12++) {
                        bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    z = true;
                } else {
                    int i13 = $11 + 39;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = asBinder;
                        int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = f952a;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
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

    /* JADX WARN: Multi-variable type inference failed */
    public getLifecycleCameraRepositoryObserver() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r5, int r6, int r7) {
        /*
            int r5 = r5 + 117
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = defpackage.getLifecycleCameraRepositoryObserver.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r5 = r6
            r4 = r7
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
        L25:
            int r7 = r7 + 1
            int r5 = r5 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getLifecycleCameraRepositoryObserver.$$e(int, int, int):java.lang.String");
    }
}
