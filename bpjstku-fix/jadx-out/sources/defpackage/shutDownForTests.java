package defpackage;

import android.content.Context;
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
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import kotlin.Metadata;
import kotlin.UIntArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0011@RX\u0091\u000e¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"LshutDownForTests;", "LCameraControllerExternalSyntheticLambda7;", "Lkotlin/UIntArray;", "p0", "<init>", "([ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)V", "TuitionPaymentFragmentbindingInflater1", "[I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "b", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class shutDownForTests extends CameraControllerExternalSyntheticLambda7<UIntArray> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    int b;
    private static final byte[] $$c = {67, -127, -109, 9};
    private static final int $$d = 98;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {63, 56, -36, -117, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 41;
    private static int asInterface = 0;
    private static int d = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1186446055977507184L;
    private static int b = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 34097;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 4
            int r0 = 53 - r6
            byte[] r1 = defpackage.shutDownForTests.$$a
            int r5 = r5 + 4
            int r7 = r7 * 3
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r5]
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shutDownForTests.c(short, byte, short, java.lang.Object[]):void");
    }

    private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i5 = $11 + 73;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c2 = (char) ((TypedValue.complexToFloat(i4) > 0.0f ? 1 : (TypedValue.complexToFloat(i4) == 0.0f ? 0 : -1)) + 8328);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', i4) + 1236;
                    int offsetAfter = 35 - TextUtils.getOffsetAfter("", i4);
                    byte b2 = (byte) i4;
                    byte b3 = b2;
                    String str$$e = $$e(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iLastIndexOf, offsetAfter, -653973969, false, str$$e, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) i4;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.normalizeMetaState(i4), Color.alpha(i4) + 2764, 14 - View.combineMeasuredStates(i4, i4), 1504416861, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.green(0) + 43325), 253 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.green(0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.getGidForName("") + 65201), 2892 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16, 2012627446, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i2 = 2;
                            i4 = 0;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
        int i7 = $10 + 35;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 10 / 0;
        }
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final /* bridge */ /* synthetic */ UIntArray TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        int iIntValue;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        int i2 = 8;
        int i3 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - ((Process.getThreadPriority(0) + 20) >> 6)), 40 - (ViewConfiguration.getWindowTouchSlop() >> 8), Process.getGidForName("") + 20, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        Object obj = null;
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(new char[]{23617, 6710, 63253, 46857}, new char[]{35740, 54349, 28502, 58752}, (char) (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.getMode(0), new char[]{42096, 47528, 57945, 14950, 2528, 64241, 30001, 39900, 11311, 25922, 27238, 45096, 5191, 6417, 13181, 51833, 52145, 50093, 54086, 15035, 46777, 19535}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new char[]{23617, 6710, 63253, 46857}, new char[]{749, 20848, 857, 51832}, (char) (30722 - MotionEvent.axisFromString("")), 1498509314 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{64990, 63984, 19337, 35456, 13154, 24975, 4942, 55761, 41654, 'r', 7553, 45580, 13554, 36965, 49607}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        int iNextInt = new Random().nextInt();
        long j = 306;
        long j2 = ((long) TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + (j * 4583981355057476904L) + (j * (-2486724180315517917L));
        long j3 = 305;
        long j4 = -1;
        long j5 = iNextInt;
        long j6 = j2 + ((((-576376457396949L) ^ j4) | ((j5 | 4583981355057476904L) ^ j4)) * j3) + (j3 * ((j4 ^ (-2486724180315517917L)) | (((j5 ^ j4) | 4583981355057476904L) ^ j4)));
        int i5 = 0;
        long j7 = jLongValue;
        try {
            while (i5 != 10) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getMode(i3) + 37836), (ViewConfiguration.getScrollBarSize() >> 8) + 59, ExpandableListView.getPackedPositionGroup(0L) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(obj);
                int i7 = i3;
                long j8 = j7;
                while (true) {
                    int i8 = i3;
                    while (i8 != i2) {
                        int i9 = d + 99;
                        asInterface = i9 % 128;
                        int i10 = i9 % 2;
                        i6 = (((((int) (j8 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                        i8++;
                        i2 = 8;
                    }
                    if (i7 != 0) {
                        break;
                    }
                    i7++;
                    j8 = j6;
                    i2 = 8;
                    i3 = 0;
                }
                if (i6 == i4) {
                    int[] iArrCopyOf = Arrays.copyOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b);
                    Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
                    return UIntArray.m8177boximpl(UIntArray.m8179constructorimpl(iArrCopyOf));
                }
                int i11 = asInterface + 1;
                d = i11 % 128;
                if (i11 % 2 == 0) {
                    j7 -= 1024;
                    i5 += 126;
                } else {
                    j7 -= 1024;
                    i5++;
                }
                i2 = 8;
                i3 = 0;
                obj = null;
            }
            Object[] objArr3 = {1177496855};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46038), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1133, KeyEvent.keyCodeFromString("") + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, 889363239, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                int iAxisFromString = 14 - MotionEvent.axisFromString("");
                byte[] bArr = $$a;
                byte b2 = bArr[5];
                byte b3 = bArr[7];
                Object[] objArr5 = new Object[1];
                c(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, jumpTapTimeout, iAxisFromString, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1117 - KeyEvent.keyCodeFromString(""), Color.green(0) + 17), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
            int i12 = ((int[]) objArr6[1])[0];
            int i13 = ((int[]) objArr6[3])[0];
            if (i13 != i12) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                int[] iArr = new int[i13];
                int i14 = i13 - 1;
                iArr[i14] = 1;
                Toast.makeText((Context) null, iArr[((i13 * i14) % 2) - 1], 1).show();
            }
            int[] iArrCopyOf2 = Arrays.copyOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf2, "");
            return UIntArray.m8177boximpl(UIntArray.m8179constructorimpl(iArrCopyOf2));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        Object[] objArr7 = new Object[1];
        a(new char[]{23617, 6710, 63253, 46857}, new char[]{57949, 44991, 21803, 402}, (char) (TextUtils.lastIndexOf("", '0') + 37462), TextUtils.lastIndexOf("", '0', 0, 0) + 1, new char[]{4447, 55576, 7226, 480, 13432, 6198, 32240, 9052, 57249, 63063, 41272, 32277, 2457, 4591, 25957, 12783}, objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[0]);
        Object[] objArr8 = new Object[1];
        a(new char[]{23617, 6710, 63253, 46857}, new char[]{20662, 27577, 27371, 18605}, (char) (44394 - TextUtils.indexOf("", "")), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, new char[]{48370, 37835, 3612, 59226, 23681, 54901, 62654, 23046, 16521, 46456, 19495, 36214, 47214, 11785, 9298, 32988}, objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
    }

    private shutDownForTests(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr;
        this.b = UIntArray.m8185getSizeimpl(iArr);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    /* JADX INFO: renamed from: b */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 3;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.b;
        int i5 = i2 + 117;
        d = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda7
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (UIntArray.m8185getSizeimpl(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) < p0) {
            int i4 = asInterface + 83;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int[] iArrCopyOf = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(p0, UIntArray.m8185getSizeimpl(iArr) << 3));
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = UIntArray.m8179constructorimpl(iArrCopyOf);
                return;
            }
            int[] iArr2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr2, RangesKt.coerceAtLeast(p0, UIntArray.m8185getSizeimpl(iArr2) * 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf2, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = UIntArray.m8179constructorimpl(iArrCopyOf2);
        }
    }

    public /* synthetic */ shutDownForTests(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r5, int r6, short r7) {
        /*
            int r5 = r5 * 2
            int r0 = 1 - r5
            byte[] r1 = defpackage.shutDownForTests.$$c
            int r7 = r7 + 102
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shutDownForTests.$$e(byte, int, short):java.lang.String");
    }
}
