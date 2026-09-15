package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.bpjstku.data.promo.model.request.VoucherRequest;
import com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityMenu;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getSensorRect implements Function1 {
    private /* synthetic */ OldDaySecurityActivity TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {51, -5, 77, 89};
    private static final int $$f = 4;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {118, 35, -100, -35, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 50;
    private static final byte[] $$a = {102, -96, -78, -55, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, 22, -22, -15, 11, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, 26, -39, 6, -11};
    private static final int $$b = 23;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int b = -83722406;

    public /* synthetic */ getSensorRect(OldDaySecurityActivity oldDaySecurityActivity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = oldDaySecurityActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.getSensorRect.$$a
            int r6 = r6 * 32
            int r6 = r6 + 4
            int r8 = r8 * 19
            int r1 = 33 - r8
            int r7 = r7 * 6
            int r7 = 103 - r7
            byte[] r1 = new byte[r1]
            int r8 = 32 - r8
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-2)
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getSensorRect.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 103 - r8
            byte[] r0 = defpackage.getSensorRect.$$d
            int r6 = r6 * 52
            int r6 = 56 - r6
            int r7 = r7 * 52
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r8 + 1
            int r8 = r3 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getSensorRect.c(int, byte, byte, java.lang.Object[]):void");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            OldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (OldDaySecurityMenu) obj);
            throw null;
        }
        Unit unitTuitionPaymentFragmentbindingInflater1 = OldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (OldDaySecurityMenu) obj);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitTuitionPaymentFragmentbindingInflater1;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0176  */
    /* JADX WARN: Code duplicated, block: B:34:0x0177  */
    private static void d(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iRgb = Color.rgb(0, 0, 0) + 16780507;
                    int pressedStateDuration = 31 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b2 = (byte) ($$f - 4);
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iRgb, pressedStateDuration, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cGreen = (char) Color.green(0);
                    int i7 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 650;
                    int i8 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45;
                    byte b4 = (byte) ($$f - 4);
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, i7, i8, -450685997, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i9 = $10 + 15;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            int i11 = $11 + 123;
            $10 = i11 % 128;
            int i12 = i11 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                    int i13 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 652;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 45;
                    byte b6 = (byte) ($$f - 4);
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, i13, iLastIndexOf, -450685997, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0bdf A[PHI: r0 r2
  0x0bdf: PHI (r0v57 int) = (r0v28 int), (r0v61 int) binds: [B:98:0x0bd1, B:95:0x0bc4] A[DONT_GENERATE, DONT_INLINE]
  0x0bdf: PHI (r2v52 int) = (r2v37 int), (r2v54 int) binds: [B:98:0x0bd1, B:95:0x0bc4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x0c2b  */
    /* JADX WARN: Code duplicated, block: B:122:0x08c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x09d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x09d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x09d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:59:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:63:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0919  */
    /* JADX WARN: Code duplicated, block: B:70:0x0976 A[Catch: all -> 0x0c8b, TryCatch #1 {all -> 0x0c8b, blocks: (B:68:0x095f, B:70:0x0976, B:71:0x09b5, B:84:0x0a3b, B:86:0x0a48, B:87:0x0a87, B:89:0x0aa6, B:91:0x0af8), top: B:119:0x095f }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0bd3 A[PHI: r0 r2
  0x0bd3: PHI (r0v29 int) = (r0v28 int), (r0v61 int) binds: [B:98:0x0bd1, B:95:0x0bc4] A[DONT_GENERATE, DONT_INLINE]
  0x0bd3: PHI (r2v38 int) = (r2v37 int), (r2v54 int) binds: [B:98:0x0bd1, B:95:0x0bc4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        String string;
        Method[] declaredMethods;
        int length;
        Method[] methodArr;
        int i7;
        Class<?> cls;
        int i8;
        boolean z2;
        int i9;
        int iB;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Object[] objArr;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i16 = 2;
        int i17 = 2 % 2;
        int i18 = TuitionPaymentFragmentbindingInflater1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
        int i19 = i18 % 2;
        byte[] bArr = $$a;
        byte b2 = bArr[28];
        int i20 = 1;
        Object[] objArr3 = new Object[1];
        a(b2, bArr[7], b2, objArr3);
        int i21 = 0;
        Class<?> cls2 = Class.forName((String) objArr3[0]);
        byte b3 = bArr[7];
        Object[] objArr4 = new Object[1];
        a(b3, bArr[28], b3, objArr4);
        String str = (String) objArr4[0];
        int i22 = TuitionPaymentFragmentbindingInflater1;
        int i23 = (i22 & 37) + (i22 | 37);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23 % 128;
        int i24 = i23 % 2;
        Class<?> cls3 = Integer.TYPE;
        int i25 = TuitionPaymentFragmentbindingInflater1;
        int i26 = ((i25 | 37) << 1) - (i25 ^ 37);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
        int i27 = i26 % 2;
        Class<?>[] clsArr = {String.class, cls3};
        Class<?> cls4 = Class.forName("android.app.ApplicationPackageManager");
        byte b4 = bArr[7];
        Object[] objArr5 = new Object[1];
        a(b4, bArr[28], b4, objArr5);
        Method[] methodArr2 = {cls2.getMethod(str, clsArr), cls4.getMethod((String) objArr5[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int fadingEdgeLength = 2823 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 22;
            byte[] bArr2 = $$d;
            Object[] objArr6 = new Object[1];
            c((byte) (-bArr2[5]), bArr2[7], bArr2[54], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, fadingEdgeLength, offsetBefore, 1814927978, false, (String) objArr6[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
            TuitionPaymentFragmentbindingInflater1 = i28 % 128;
            if (i28 % 2 == 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.getOffsetBefore("", 0) + 2823, 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).getDeclaredMethods();
                length = declaredMethods.length;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getLongPressTimeout() >> 16), 2823 - (Process.myPid() >> 22), KeyEvent.normalizeMetaState(0) + 22)).getDeclaredMethods();
                length = declaredMethods.length;
            }
            int i29 = 0;
            while (i29 < length) {
                Method method = declaredMethods[i29];
                int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i31 = ((i30 | 71) << i20) - (i30 ^ 71);
                TuitionPaymentFragmentbindingInflater1 = i31 % 128;
                int i32 = i31 % i16;
                int i33 = (i30 & 119) + (i30 | 119);
                TuitionPaymentFragmentbindingInflater1 = i33 % 128;
                int i34 = i33 % i16;
                try {
                    int i35 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int i36 = (i35 ^ 152) + ((i35 & 152) << i20);
                    int i37 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iB2 = VoucherRequest.b();
                    int i38 = i37 * 866;
                    int i39 = (i38 ^ (-20736)) + ((i38 & (-20736)) << i20);
                    int i40 = ~i37;
                    int i41 = ~iB2;
                    int i42 = ~((i40 ^ i41) | (i40 & i41));
                    int i43 = -(-((((-25) ^ i42) | ((-25) & i42)) * (-865)));
                    int i44 = (i39 ^ i43) + ((i43 & i39) << i20);
                    int i45 = (~(i37 | iB2)) * 865;
                    int i46 = (i44 & i45) + (i44 | i45);
                    int i47 = ~iB2;
                    int i48 = ~(((-25) & i47) | ((-25) ^ i47));
                    int i49 = ~(i41 | i37);
                    int i50 = ((i49 & i48) | (i48 ^ i49)) * 865;
                    Object[] objArr7 = new Object[i20];
                    d(true, i36, ((i46 | i50) << i20) - (i50 ^ i46), 14 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), new char[]{'\f', 6, 5, 18, 65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517, 65486, 20, 3, 5}, objArr7);
                    Class<?> cls5 = Class.forName((String) objArr7[i21]);
                    int mode = View.MeasureSpec.getMode(i21);
                    int iB3 = VoucherRequest.b();
                    int i51 = ~mode;
                    int i52 = ~iB3;
                    int i53 = ~((i51 ^ i52) | (i51 & i52));
                    int i54 = ~mode;
                    int i55 = (i54 ^ 160) | (i54 & 160);
                    int i56 = ~i55;
                    int i57 = (i53 ^ i56) | (i53 & i56);
                    int i58 = ~((i52 ^ 160) | (i52 & 160));
                    int i59 = (((mode * 398) - 63360) - (~(((i57 & i58) | (i57 ^ i58)) * (-397)))) - i20;
                    int i60 = TuitionPaymentFragmentbindingInflater1 + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i60 % 128;
                    int i61 = i60 % 2;
                    int i62 = (-397) * (~i55);
                    int i63 = (i59 & i62) + (i59 | i62);
                    int i64 = ~((i51 & 160) | (i51 ^ 160));
                    int i65 = (i64 & iB3) | (iB3 ^ i64);
                    int i66 = ~((-161) | mode);
                    int i67 = ((i65 & i66) | (i65 ^ i66)) * 397;
                    int i68 = ((i63 & i67) << i20) + (i63 ^ i67);
                    int i69 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iB4 = VoucherRequest.b();
                    int i70 = (i69 * 1773) - 10620;
                    int i71 = ~i69;
                    int i72 = ~((i71 & (-13)) | (i71 ^ (-13)));
                    int i73 = ~(((-13) & iB4) | ((-13) ^ iB4));
                    int i74 = (i72 & i73) | (i72 ^ i73);
                    int i75 = ~iB4;
                    int i76 = (i75 & i69) | (i75 ^ i69);
                    int i77 = ~((i76 & 12) | (i76 ^ 12));
                    int i78 = ((i74 & i77) | (i74 ^ i77)) * 886;
                    int i79 = (i70 & i78) + (i70 | i78);
                    int i80 = ~iB4;
                    int i81 = ((~((i80 ^ 12) | (i80 & 12))) | i69) * (-1772);
                    int i82 = ((((i79 | i81) << i20) - (i81 ^ i79)) - (~((~((i69 & i80) | (i80 ^ i69))) * 886))) - 1;
                    int i83 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int iB5 = VoucherRequest.b();
                    int i84 = i83 * 714;
                    int i85 = ((i84 | (-6408)) << i20) - (i84 ^ (-6408));
                    int i86 = ~i83;
                    int i87 = ~iB5;
                    int i88 = ~((i86 & i87) | (i86 ^ i87));
                    int i89 = ~((~i83) | 9);
                    int i90 = (i88 ^ i89) | (i88 & i89);
                    int i91 = (-10) | i83;
                    int i92 = ~((i91 ^ iB5) | (i91 & iB5));
                    int i93 = -(-(((i90 ^ i92) | (i90 & i92)) * (-713)));
                    int i94 = (i83 & (-10)) | ((-10) ^ i83);
                    int i95 = (((i85 | i93) << i20) - (i93 ^ i85)) + ((~((i94 & iB5) | (i94 ^ iB5))) * 1426);
                    int i96 = -(-((~(((-10) ^ i87) | ((-10) & i87))) * 713));
                    Object[] objArr8 = new Object[i20];
                    d(false, i68, i82, (i95 & i96) + (i96 | i95), new char[]{7, 65532, 1, 65534, 1, 65533, '\n', 11, 65535, 65533, '\f', 65509}, objArr8);
                    Object[] objArr9 = new Object[i20];
                    objArr9[0] = Integer.valueOf(((Integer) cls5.getMethod((String) objArr8[0], null).invoke(method, null)).intValue());
                    int i97 = -(KeyEvent.getMaxKeyCode() >> 16);
                    int i98 = (i97 & 153) + (i97 | 153);
                    int iAlpha = 26 - Color.alpha(0);
                    int i99 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                    Object[] objArr10 = new Object[i20];
                    d(false, i98, iAlpha, (i99 ^ 16) + ((i99 & 16) << i20), new char[]{17, 4, 5, 11, 4, 2, 19, 65485, 65516, 14, 3, '\b', 5, '\b', 4, 17, '\t', 0, 21, 0, 65485, 11, 0, '\r', 6, 65485}, objArr10);
                    Class<?> cls6 = Class.forName((String) objArr10[0]);
                    int i100 = -(ViewConfiguration.getTouchSlop() >> 8);
                    int iB6 = VoucherRequest.b();
                    int i101 = ~i100;
                    int i102 = ((i100 * (-716)) - (-229600)) + (((i101 & 160) | (i101 ^ 160)) * (-1434));
                    int i103 = ~iB6;
                    int i104 = ~((i103 & 160) | (i103 ^ 160));
                    int i105 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i106 = (i105 ^ 63) + ((i105 & 63) << i20);
                    TuitionPaymentFragmentbindingInflater1 = i106 % 128;
                    int i107 = i106 % 2;
                    int i108 = ~((i100 ^ 160) | (i100 & 160));
                    int i109 = (i104 ^ i108) | (i104 & i108);
                    int i110 = (i101 ^ (-161)) | (i101 & (-161));
                    int i111 = 717 * (i109 | (~((i110 & iB6) | (i110 ^ iB6))));
                    int i112 = ((i102 | i111) << i20) - (i111 ^ i102);
                    int i113 = (i101 ^ (-161)) | (i101 & (-161));
                    int i114 = ~iB6;
                    int i115 = ~((i113 & i114) | (i113 ^ i114));
                    int i116 = (i108 & i115) | (i115 ^ i108);
                    int i117 = ~(160 | iB6);
                    int i118 = (i112 - (~(((i116 & i117) | (i116 ^ i117)) * 717))) - 1;
                    int i119 = 7 - (~(-(-(ViewConfiguration.getKeyRepeatDelay() >> 16))));
                    byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                    int iB7 = VoucherRequest.b();
                    int i120 = -(-(modifierMetaStateMask * Base64.padSymbol));
                    int i121 = (i120 & (-964)) + (i120 | (-964));
                    int i122 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i123 = (i122 ^ 3) + ((i122 & 3) << i20);
                    TuitionPaymentFragmentbindingInflater1 = i123 % 128;
                    int i124 = i123 % 2;
                    int i125 = ((i121 + 8685) - (~(-(-(((~modifierMetaStateMask) | (~(((-10) ^ iB7) | ((-10) & iB7)))) * (-964)))))) - i20;
                    int i126 = ~iB7;
                    int i127 = (i125 - (~(-(-(((~((modifierMetaStateMask & (-10)) | ((-10) ^ modifierMetaStateMask))) | (~(((-10) & i126) | ((-10) ^ i126)))) * (-964)))))) - 1;
                    Object[] objArr11 = new Object[i20];
                    d(false, i118, i119, i127, new char[]{1, 11, 65510, 65529, '\f', 1, 14, 65533}, objArr11);
                    String str2 = (String) objArr11[0];
                    Class<?>[] clsArr2 = new Class[i20];
                    clsArr2[0] = Integer.TYPE;
                    if (((Boolean) cls6.getMethod(str2, clsArr2).invoke(null, objArr9)).booleanValue()) {
                        int i128 = TuitionPaymentFragmentbindingInflater1;
                        int i129 = (i128 ^ 55) + ((i128 & 55) << i20);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i129 % 128;
                        int i130 = i129 % 2;
                        Class cls7 = Long.TYPE;
                        if (i130 != 0) {
                            int offsetAfter = 32464 >> TextUtils.getOffsetAfter("", 0);
                            int capsMode = TextUtils.getCapsMode("", 0, i20) * 127;
                            int i131 = -Color.green(i20);
                            Object[] objArr12 = new Object[i20];
                            d(true, offsetAfter, capsMode, (i131 & 43) + (i131 | 43), new char[]{'\f', 6, 5, 18, 65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517, 65486, 20, 3, 5}, objArr12);
                            cls = Class.forName((String) objArr12[0]);
                            i8 = 20563;
                            z2 = i20;
                        } else {
                            int offsetAfter2 = 152 - TextUtils.getOffsetAfter("", 0);
                            int capsMode2 = TextUtils.getCapsMode("", 0, 0);
                            int i132 = -(-Color.green(0));
                            Object[] objArr13 = new Object[i20];
                            d(true, offsetAfter2, ((capsMode2 | 24) << i20) - (capsMode2 ^ 24), ((i132 | 14) << i20) - (i132 ^ 14), new char[]{'\f', 6, 5, 18, 65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517, 65486, 20, 3, 5}, objArr13);
                            cls = Class.forName((String) objArr13[0]);
                            i8 = 161;
                            z2 = 0;
                        }
                        int i133 = -Process.getGidForName("");
                        int iB8 = VoucherRequest.b();
                        int i134 = i133 * 1773;
                        int i135 = i8 * (-885);
                        int i136 = (i134 ^ i135) + ((i134 & i135) << i20);
                        int i137 = ~i133;
                        int i138 = ~i8;
                        int i139 = ~((i137 ^ i138) | (i137 & i138));
                        int i140 = ~((i138 ^ iB8) | (i138 & iB8));
                        int i141 = (i139 ^ i140) | (i139 & i140);
                        int i142 = ~iB8;
                        int i143 = (i142 ^ i133) | (i142 & i133);
                        int i144 = (i136 - (~(-(-((i141 | (~((i143 ^ i8) | (i143 & i8)))) * 886))))) - i20;
                        int i145 = ~((i8 & i142) | (i142 ^ i8));
                        int i146 = ((i145 & i133) | (i133 ^ i145)) * (-1772);
                        int i147 = (i144 & i146) + (i146 | i144);
                        int i148 = ~((i142 ^ i133) | (i133 & i142));
                        int i149 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i150 = (i149 & 55) + (i149 | 55);
                        TuitionPaymentFragmentbindingInflater1 = i150 % 128;
                        if (i150 % 2 == 0) {
                            int i151 = i147 - (886 << i148);
                            i9 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            iB = VoucherRequest.b();
                            i10 = (465 >>> i9) / (-17594);
                            int i152 = ~iB;
                            i11 = i151;
                            i12 = ~(((-39) ^ i152) | (i152 & (-39)));
                            i13 = 38;
                        } else {
                            int i153 = (i147 - (~(-(-(i148 * 886))))) - i20;
                            i9 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            iB = VoucherRequest.b();
                            i10 = (i9 * 465) - 5556;
                            int i154 = ~iB;
                            i11 = i153;
                            i12 = ~(((-13) ^ i154) | (i154 & (-13)));
                            i13 = 12;
                        }
                        int i155 = TuitionPaymentFragmentbindingInflater1 + 77;
                        methodArr = declaredMethods;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i155 % 128;
                        if (i155 % 2 != 0) {
                            int i156 = ~i13;
                            int i157 = ~((i156 ^ i9) | (i156 & i9));
                            int i158 = (i12 ^ i157) | (i157 & i12);
                            int i159 = ~iB;
                            int i160 = ~((i159 ^ i9) | (i159 & i9));
                            int i161 = i10 << (464 % ((i158 ^ i160) | (i158 & i160)));
                            int i162 = (~i9) | iB;
                            i14 = ~i13;
                            i15 = i161 << ((-464) << ((i162 & i14) | (i162 ^ i14)));
                        } else {
                            int i163 = (~((~i13) | i9)) | i12;
                            int i164 = ~iB;
                            int i165 = -(-(464 * (i163 | (~((i164 ^ i9) | (i164 & i9))))));
                            int i166 = (i10 ^ i165) + ((i165 & i10) << 1);
                            int i167 = ~i9;
                            int i168 = (i167 & iB) | (iB ^ i167);
                            i14 = ~i13;
                            int i169 = ((i168 & i14) | (i168 ^ i14)) * (-464);
                            i15 = ((i166 | i169) << 1) - (i169 ^ i166);
                        }
                        int i170 = ~((i14 ^ i9) | (i14 & i9));
                        int i171 = ~((i9 & iB) | (i9 ^ iB));
                        int i172 = -(-(464 * ((i171 & i170) | (i170 ^ i171))));
                        int i173 = ((i15 | i172) << 1) - (i15 ^ i172);
                        int i174 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int iB9 = VoucherRequest.b();
                        int i175 = i174 * (-830);
                        int i176 = (i175 ^ 4992) + ((i175 & 4992) << 1);
                        int i177 = ~iB9;
                        int i178 = (i174 ^ 6) | (i174 & 6);
                        int i179 = -(-(((~(((-7) & i177) | ((-7) ^ i177))) | (~((i178 ^ iB9) | (i178 & iB9)))) * (-831)));
                        int i180 = (i176 ^ i179) + ((i176 & i179) << 1);
                        int i181 = ((-7) & i174) | ((-7) ^ i174);
                        int i182 = (~((i181 & iB9) | (i181 ^ iB9))) * (-1662);
                        int i183 = (i180 & i182) + (i182 | i180);
                        int i184 = ~i174;
                        int i185 = TuitionPaymentFragmentbindingInflater1 + 87;
                        i7 = length;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i185 % 128;
                        if (i185 % 2 != 0) {
                            int i186 = ~((i177 & i184) | (i184 ^ i177));
                            int i187 = ~((i174 & iB9) | (i174 ^ iB9));
                            int i188 = (i187 & i186) | (i186 ^ i187);
                            int i189 = ~(iB9 | 6);
                            int i190 = -(-(831 / ((i188 & i189) | (i188 ^ i189))));
                            Object[] objArr14 = new Object[1];
                            d(z2, i11, i173, (i183 ^ i190) + ((i190 & i183) << 1), new char[]{4, 65514, 15, 6, 65531, 65533, 65531, '\n', 65512, 65531, '\n', 11, '\b'}, objArr14);
                            if (cls7.equals(cls.getMethod((String) objArr14[0], null).invoke(method, null))) {
                                int i191 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int iB10 = VoucherRequest.b();
                                int i192 = (i191 * (-519)) + 78671;
                                int i193 = ~i191;
                                int i194 = (i193 & (-152)) | (i193 ^ (-152));
                                int i195 = ~iB10;
                                int i196 = ~((i194 & i195) | (i194 ^ i195));
                                int i197 = ~((iB10 ^ 151) | (iB10 & 151));
                                int i198 = -(-(((i196 & i197) | (i196 ^ i197)) * 520));
                                int i199 = (i192 ^ i198) + ((i192 & i198) << 1);
                                int i200 = ~iB10;
                                int i201 = ~((i200 & (-152)) | ((-152) ^ i200));
                                int i202 = ~((iB10 & i191) | (i191 ^ iB10));
                                int i203 = ((i201 & i202) | (i201 ^ i202)) * (-1040);
                                int i204 = (i199 & i203) + (i203 | i199);
                                int i205 = ~i191;
                                int i206 = ~((i205 & i195) | (i205 ^ i195));
                                int i207 = ~((i191 & (-152)) | ((-152) ^ i191));
                                int i208 = ((i207 & i206) | (i206 ^ i207) | i202) * 520;
                                int i209 = (i204 ^ i208) + ((i208 & i204) << 1);
                                int i210 = -View.resolveSizeAndState(0, 0, 0);
                                int iB11 = VoucherRequest.b();
                                int i211 = TuitionPaymentFragmentbindingInflater1 + 47;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i211 % 128;
                                int i212 = i211 % 2;
                                int i213 = (217 * i210) - 5160;
                                int i214 = -(-((~(i210 | iB11)) * 216));
                                int i215 = ~iB11;
                                int i216 = (i213 & i214) + (i213 | i214) + (((i210 ^ (-25)) | (i210 & (-25)) | i215) * (-216));
                                int i217 = ~(i210 | i215);
                                int i218 = i216 + (((i217 & 24) | (i217 ^ 24)) * 216);
                                int i219 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                Object[] objArr15 = new Object[1];
                                d(true, i209, i218, ((i219 | 14) << 1) - (i219 ^ 14), new char[]{'\f', 6, 5, 18, 65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517, 65486, 20, 3, 5}, objArr15);
                                Class<?> cls8 = Class.forName((String) objArr15[0]);
                                int i220 = -TextUtils.lastIndexOf("", '0');
                                int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                                Object[] objArr16 = new Object[1];
                                d(false, ((i220 | 159) << 1) - (i220 ^ 159), ((windowTouchSlop | 17) << 1) - (windowTouchSlop ^ 17), 2 - View.resolveSize(0, 0), new char[]{65533, 11, 65535, 65533, '\f', 65512, 65529, '\n', 65529, 5, 65533, '\f', 65533, '\n', 65516, 17, '\b'}, objArr16);
                                objArr = (Object[]) cls8.getMethod((String) objArr16[0], null).invoke(method, null);
                                if (objArr.length == 2) {
                                    int i221 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                                    TuitionPaymentFragmentbindingInflater1 = i221 % 128;
                                    int i222 = i221 % 2;
                                    if (Long.TYPE.equals(objArr[0])) {
                                        int i223 = TuitionPaymentFragmentbindingInflater1;
                                        int i224 = ((i223 | 117) << 1) - (i223 ^ 117);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i224 % 128;
                                        int i225 = i224 % 2;
                                        int i226 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                        int i227 = (i226 & 152) + (i226 | 152);
                                        int threadPriority = (Process.getThreadPriority(0) + 20) >> 6;
                                        int iB12 = VoucherRequest.b();
                                        int i228 = threadPriority * (-1529);
                                        int i229 = ((i228 | (-18336)) << 1) - (i228 ^ (-18336));
                                        int i230 = ~threadPriority;
                                        int i231 = i230 | (-25);
                                        int i232 = ~iB12;
                                        int i233 = ~((i231 & i232) | (i231 ^ i232));
                                        int i234 = ~((i230 ^ 24) | (i230 & 24) | iB12);
                                        int i235 = ((-25) ^ threadPriority) | ((-25) & threadPriority);
                                        int i236 = ((i229 - (~(-(-((((i233 & i234) | (i233 ^ i234)) | (~((i235 & iB12) | (i235 ^ iB12)))) * 765))))) - 1) + (((~((i230 ^ (-25)) | (i230 & (-25)))) | (~(i232 | (~threadPriority)))) * 1530);
                                        int i237 = ~((i230 & iB12) | (i230 ^ iB12));
                                        int i238 = (~iB12) | (-25);
                                        int i239 = ~((threadPriority & i238) | (i238 ^ threadPriority));
                                        int i240 = -(-(((i239 & i237) | (i237 ^ i239)) * 765));
                                        int i241 = (i236 ^ i240) + ((i240 & i236) << 1);
                                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                                        int iB13 = VoucherRequest.b();
                                        int i242 = (iLastIndexOf * 495) - 7395;
                                        int i243 = -(-(((iLastIndexOf ^ (-16)) | (iLastIndexOf & (-16))) * (-988)));
                                        int i244 = ((i242 | i243) << 1) - (i242 ^ i243);
                                        int i245 = (~iLastIndexOf) | 15;
                                        int i246 = ~iB13;
                                        int i247 = i244 + (((i245 & i246) | (i245 ^ i246)) * 494);
                                        int i248 = ~iLastIndexOf;
                                        int i249 = ~((i248 & (-16)) | (i248 ^ (-16)));
                                        int i250 = ~((~iB13) | 15);
                                        int i251 = (i250 & i249) | (i249 ^ i250);
                                        int i252 = ~((iLastIndexOf & 15) | (iLastIndexOf ^ 15));
                                        int i253 = i251 ^ i252;
                                        objArr2 = new Object[1];
                                        d(true, i227, i241, i247 + (((i252 & i251) | i253) * 494), new char[]{'\f', 6, 5, 18, 65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517, 65486, 20, 3, 5}, objArr2);
                                        if (!(!Class.forName((String) objArr2[0]).equals(objArr[1]))) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2823;
                                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 22;
                                                byte[] bArr3 = $$d;
                                                Object[] objArr17 = new Object[1];
                                                c((byte) (-bArr3[5]), bArr3[7], bArr3[54], objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, iMakeMeasureSpec, edgeSlop, 1814927978, false, (String) objArr17[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                                int i254 = 2823 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                                                byte[] bArr4 = $$d;
                                                Object[] objArr18 = new Object[1];
                                                c((byte) (-bArr4[5]), bArr4[7], bArr4[54], objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, i254, minimumFlingVelocity, 1814927978, false, (String) objArr18[0], null);
                                            }
                                            try {
                                                Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 2824;
                                                    int iNormalizeMetaState = 22 - KeyEvent.normalizeMetaState(0);
                                                    byte[] bArr5 = $$d;
                                                    byte b5 = bArr5[7];
                                                    Object[] objArr20 = new Object[1];
                                                    c(b5, (byte) (-bArr5[5]), b5, objArr20);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, iLastIndexOf2, iNormalizeMetaState, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                                                int i255 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                int i256 = (i255 & 5) + (i255 | 5);
                                                TuitionPaymentFragmentbindingInflater1 = i256 % 128;
                                                int i257 = i256 % 2;
                                                break;
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            int i258 = ~(i177 | i184);
                            int i259 = ~((i174 & iB9) | (i174 ^ iB9));
                            int i260 = (i259 & i258) | (i258 ^ i259);
                            int i261 = ~((iB9 & 6) | (iB9 ^ 6));
                            int i262 = -(-(((i260 & i261) | (i260 ^ i261)) * 831));
                            Object[] objArr21 = new Object[1];
                            d(z2, i11, i173, (i183 & i262) + (i262 | i183), new char[]{4, 65514, 15, 6, 65531, 65533, 65531, '\n', 65512, 65531, '\n', 11, '\b'}, objArr21);
                            if (!(!cls7.equals(cls.getMethod((String) objArr21[0], null).invoke(method, null)))) {
                                int i1910 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int iB14 = VoucherRequest.b();
                                int i1911 = (i1910 * (-519)) + 78671;
                                int i1912 = ~i1910;
                                int i1913 = (i1912 & (-152)) | (i1912 ^ (-152));
                                int i1914 = ~iB14;
                                int i1915 = ~((i1913 & i1914) | (i1913 ^ i1914));
                                int i1916 = ~((iB14 ^ 151) | (iB14 & 151));
                                int i1917 = -(-(((i1915 & i1916) | (i1915 ^ i1916)) * 520));
                                int i1918 = (i1911 ^ i1917) + ((i1911 & i1917) << 1);
                                int i2010 = ~iB14;
                                int i2011 = ~((i2010 & (-152)) | ((-152) ^ i2010));
                                int i2012 = ~((iB14 & i1910) | (i1910 ^ iB14));
                                int i2013 = ((i2011 & i2012) | (i2011 ^ i2012)) * (-1040);
                                int i2014 = (i1918 & i2013) + (i2013 | i1918);
                                int i2015 = ~i1910;
                                int i2016 = ~((i2015 & i1914) | (i2015 ^ i1914));
                                int i2017 = ~((i1910 & (-152)) | ((-152) ^ i1910));
                                int i2018 = ((i2017 & i2016) | (i2016 ^ i2017) | i2012) * 520;
                                int i2019 = (i2014 ^ i2018) + ((i2018 & i2014) << 1);
                                int i2110 = -View.resolveSizeAndState(0, 0, 0);
                                int iB15 = VoucherRequest.b();
                                int i2111 = TuitionPaymentFragmentbindingInflater1 + 47;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2111 % 128;
                                int i2112 = i2111 % 2;
                                int i2113 = (217 * i2110) - 5160;
                                int i2114 = -(-((~(i2110 | iB15)) * 216));
                                int i2115 = ~iB15;
                                int i2116 = (i2113 & i2114) + (i2113 | i2114) + (((i2110 ^ (-25)) | (i2110 & (-25)) | i2115) * (-216));
                                int i2117 = ~(i2110 | i2115);
                                int i2118 = i2116 + (((i2117 & 24) | (i2117 ^ 24)) * 216);
                                int i2119 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                Object[] objArr110 = new Object[1];
                                d(true, i2019, i2118, ((i2119 | 14) << 1) - (i2119 ^ 14), new char[]{'\f', 6, 5, 18, 65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517, 65486, 20, 3, 5}, objArr110);
                                Class<?> cls9 = Class.forName((String) objArr110[0]);
                                int i2210 = -TextUtils.lastIndexOf("", '0');
                                int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop() >> 8;
                                Object[] objArr111 = new Object[1];
                                d(false, ((i2210 | 159) << 1) - (i2210 ^ 159), ((windowTouchSlop2 | 17) << 1) - (windowTouchSlop2 ^ 17), 2 - View.resolveSize(0, 0), new char[]{65533, 11, 65535, 65533, '\f', 65512, 65529, '\n', 65529, 5, 65533, '\f', 65533, '\n', 65516, 17, '\b'}, objArr111);
                                objArr = (Object[]) cls9.getMethod((String) objArr111[0], null).invoke(method, null);
                                if (objArr.length == 2) {
                                    int i2211 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                                    TuitionPaymentFragmentbindingInflater1 = i2211 % 128;
                                    int i2212 = i2211 % 2;
                                    if (Long.TYPE.equals(objArr[0])) {
                                        int i2213 = TuitionPaymentFragmentbindingInflater1;
                                        int i2214 = ((i2213 | 117) << 1) - (i2213 ^ 117);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2214 % 128;
                                        int i2215 = i2214 % 2;
                                        int i2216 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                        int i2217 = (i2216 & 152) + (i2216 | 152);
                                        int threadPriority2 = (Process.getThreadPriority(0) + 20) >> 6;
                                        int iB16 = VoucherRequest.b();
                                        int i2218 = threadPriority2 * (-1529);
                                        int i2219 = ((i2218 | (-18336)) << 1) - (i2218 ^ (-18336));
                                        int i2310 = ~threadPriority2;
                                        int i2311 = i2310 | (-25);
                                        int i2312 = ~iB16;
                                        int i2313 = ~((i2311 & i2312) | (i2311 ^ i2312));
                                        int i2314 = ~((i2310 ^ 24) | (i2310 & 24) | iB16);
                                        int i2315 = ((-25) ^ threadPriority2) | ((-25) & threadPriority2);
                                        int i2316 = ((i2219 - (~(-(-((((i2313 & i2314) | (i2313 ^ i2314)) | (~((i2315 & iB16) | (i2315 ^ iB16)))) * 765))))) - 1) + (((~((i2310 ^ (-25)) | (i2310 & (-25)))) | (~(i2312 | (~threadPriority2)))) * 1530);
                                        int i2317 = ~((i2310 & iB16) | (i2310 ^ iB16));
                                        int i2318 = (~iB16) | (-25);
                                        int i2319 = ~((threadPriority2 & i2318) | (i2318 ^ threadPriority2));
                                        int i2410 = -(-(((i2319 & i2317) | (i2317 ^ i2319)) * 765));
                                        int i2411 = (i2316 ^ i2410) + ((i2410 & i2316) << 1);
                                        int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0);
                                        int iB17 = VoucherRequest.b();
                                        int i2412 = (iLastIndexOf3 * 495) - 7395;
                                        int i2413 = -(-(((iLastIndexOf3 ^ (-16)) | (iLastIndexOf3 & (-16))) * (-988)));
                                        int i2414 = ((i2412 | i2413) << 1) - (i2412 ^ i2413);
                                        int i2415 = (~iLastIndexOf3) | 15;
                                        int i2416 = ~iB17;
                                        int i2417 = i2414 + (((i2415 & i2416) | (i2415 ^ i2416)) * 494);
                                        int i2418 = ~iLastIndexOf3;
                                        int i2419 = ~((i2418 & (-16)) | (i2418 ^ (-16)));
                                        int i2510 = ~((~iB17) | 15);
                                        int i2511 = (i2510 & i2419) | (i2419 ^ i2510);
                                        int i2512 = ~((iLastIndexOf3 & 15) | (iLastIndexOf3 ^ 15));
                                        int i2513 = i2511 ^ i2512;
                                        objArr2 = new Object[1];
                                        d(true, i2217, i2411, i2417 + (((i2512 & i2511) | i2513) * 494), new char[]{'\f', 6, 5, 18, 65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517, 65486, 20, 3, 5}, objArr2);
                                        if (!(!Class.forName((String) objArr2[0]).equals(objArr[1]))) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 2823;
                                                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 22;
                                                byte[] bArr6 = $$d;
                                                Object[] objArr112 = new Object[1];
                                                c((byte) (-bArr6[5]), bArr6[7], bArr6[54], objArr112);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild2, iMakeMeasureSpec2, edgeSlop2, 1814927978, false, (String) objArr112[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                                                int i2514 = 2823 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                                                byte[] bArr7 = $$d;
                                                Object[] objArr113 = new Object[1];
                                                c((byte) (-bArr7[5]), bArr7[7], bArr7[54], objArr113);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState2, i2514, minimumFlingVelocity2, 1814927978, false, (String) objArr113[0], null);
                                            }
                                            Object[] objArr114 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                                int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0) + 2824;
                                                int iNormalizeMetaState2 = 22 - KeyEvent.normalizeMetaState(0);
                                                byte[] bArr8 = $$d;
                                                byte b6 = bArr8[7];
                                                Object[] objArr22 = new Object[1];
                                                c(b6, (byte) (-bArr8[5]), b6, objArr22);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec2, iLastIndexOf4, iNormalizeMetaState2, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr114)).longValue();
                                            int i2515 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i2516 = (i2515 & 5) + (i2515 | 5);
                                            TuitionPaymentFragmentbindingInflater1 = i2516 % 128;
                                            int i2517 = i2516 % 2;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        methodArr = declaredMethods;
                        i7 = length;
                    }
                    i29 = (i29 & (-122)) + (i29 | (-122)) + 123;
                    declaredMethods = methodArr;
                    length = i7;
                    i16 = 2;
                    i21 = 0;
                    i20 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int iNormalizeMetaState3 = 2823 - KeyEvent.normalizeMetaState(0);
            int i263 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte[] bArr9 = $$d;
            Object[] objArr23 = new Object[1];
            c((byte) (-bArr9[5]), bArr9[7], bArr9[54], objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, iNormalizeMetaState3, i263, 1814927978, false, (String) objArr23[0], null);
        }
        Object[] objArr24 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char capsMode3 = (char) TextUtils.getCapsMode("", 0, 0);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2823;
            int iLastIndexOf5 = TextUtils.lastIndexOf("", '0', 0) + 23;
            byte[] bArr10 = $$d;
            byte b7 = bArr10[7];
            byte b8 = (byte) (-bArr10[5]);
            Object[] objArr25 = new Object[1];
            c(b7, b8, (byte) (b8 + 4), objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(capsMode3, longPressTimeout, iLastIndexOf5, 1025296417, false, (String) objArr25[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr24);
        Object[] objArr26 = {0, methodArr2, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c = (char) (37658 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int offsetBefore2 = 2720 - TextUtils.getOffsetBefore("", 0);
            int i264 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19;
            byte[] bArr11 = $$d;
            byte b9 = bArr11[7];
            byte b10 = (byte) (-bArr11[5]);
            Object[] objArr27 = new Object[1];
            c(b9, b10, (byte) (b10 + 4), objArr27);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, offsetBefore2, i264, -1568796068, false, (String) objArr27[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr26)).longValue();
        long j = -291016934;
        long j2 = -1;
        long j3 = j ^ j2;
        long jMaxMemory = (jLongValue | ((long) ((int) Runtime.getRuntime().maxMemory()))) ^ j2;
        long j4 = (((long) (-109)) * j) + (((long) 111) * jLongValue) + (((long) (-220)) * (j3 | jMaxMemory)) + (((long) 220) * (((j | jLongValue) ^ j2) | jMaxMemory)) + (((long) 110) * ((((jLongValue ^ j2) | j) ^ j2) | ((j3 | jLongValue) ^ j2))) + ((long) (-1519388911));
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i265 = ~startElapsedRealtime;
        int i266 = ~((-1394318782) | i265);
        int i267 = ~((-42907630) | startElapsedRealtime);
        int i268 = ((int) (j4 >> 32)) & ((-334238508) + ((i266 | i267) * 1150) + (((~(42907629 | i265)) | i267) * (-575)) + (((~(startElapsedRealtime | (-1394318782))) | (~(i265 | 1394318781))) * 575));
        int i269 = ~((int) Process.getElapsedCpuTime());
        int i270 = ((1019428157 + (((~(i269 | 2147417850)) | (~((-537924689) | i269))) * (-184))) + (((86133376 | (~((-624058065) | i269))) | (~(2061284474 | i269))) * 184)) - 1125326568;
        int i271 = TuitionPaymentFragmentbindingInflater1;
        int i272 = (i271 ^ 25) + ((i271 & 25) << 1);
        int i273 = i272 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i273;
        int i274 = ((int) j4) & i270;
        if (i272 % 2 != 0) {
            int i275 = (i268 & i274) | (i268 ^ i274);
            i = i275 >> 98;
            i2 = i275 & ViewCompat.MEASURED_SIZE_MASK;
            if (i != 0) {
                int i276 = i273 + 81;
                TuitionPaymentFragmentbindingInflater1 = i276 % 128;
                int i277 = i276 % 2;
                i3 = i;
                i4 = i2;
                z = true;
            } else {
                i3 = i;
                i4 = i2;
                z = false;
            }
        } else {
            int i278 = (i268 & i274) | (i268 ^ i274);
            i = i278 >>> 24;
            i2 = i278 & ViewCompat.MEASURED_SIZE_MASK;
            if (i != 0) {
                int i279 = i273 + 81;
                TuitionPaymentFragmentbindingInflater1 = i279 % 128;
                int i2710 = i279 % 2;
                i3 = i;
                i4 = i2;
                z = true;
            } else {
                i3 = i;
                i4 = i2;
                z = false;
            }
        }
        if (z) {
            int i280 = (i273 & 17) + (i273 | 17);
            TuitionPaymentFragmentbindingInflater1 = i280 % 128;
            i5 = 2;
            int i281 = i280 % 2;
            i6 = 1;
        } else {
            i5 = 2;
            int i282 = i273 + 23;
            TuitionPaymentFragmentbindingInflater1 = i282 % 128;
            int i283 = i282 % 2;
            i6 = 0;
        }
        if (!z || i4 >= i5) {
            string = null;
        } else {
            int i284 = TuitionPaymentFragmentbindingInflater1;
            int i285 = ((i284 | 75) << 1) - (i284 ^ 75);
            int i286 = i285 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i286;
            int i287 = i285 % i5;
            Method method2 = methodArr2[i4];
            if (method2 != null) {
                int i288 = i286 + 125;
                TuitionPaymentFragmentbindingInflater1 = i288 % 128;
                int i289 = i288 % i5;
                string = method2.toString();
                int i290 = TuitionPaymentFragmentbindingInflater1;
                int i291 = (i290 ^ 77) + ((i290 & 77) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i291 % 128;
                int i292 = i291 % 2;
            } else {
                string = null;
            }
        }
        list.add(string);
        int iB18 = VoucherRequest.b();
        int i293 = i3 * (-183);
        int i294 = ((-1098) ^ i293) + ((i293 & (-1098)) << 1);
        int i295 = ~iB18;
        int i296 = ~(((-7) ^ i295) | ((-7) & i295) | i3);
        int i297 = ~i3;
        int i298 = ~((i295 & i297) | (i297 ^ i295) | 6);
        int i299 = -(-(((i298 & i296) | (i296 ^ i298)) * (-184)));
        int i300 = (i294 ^ i299) + ((i299 & i294) << 1);
        int i301 = ~i3;
        int i302 = ~((i301 & (-7)) | ((-7) ^ i301));
        int i303 = ~iB18;
        int i304 = ~(((-7) & i303) | ((-7) ^ i303));
        int i305 = (i302 & i304) | (i302 ^ i304);
        int i306 = ~((i303 & i297) | (i297 ^ i303));
        int i307 = i300 + (((i306 & i305) | (i305 ^ i306)) * 184);
        int i308 = -(-(((i3 ^ 6) | (i3 & 6)) * 184));
        return (((i307 | i308) << 1) - (i308 ^ i307)) * i6;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, short r8, int r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r0 = defpackage.getSensorRect.$$c
            int r9 = 120 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r9 = r9 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getSensorRect.$$g(byte, short, int):java.lang.String");
    }
}
