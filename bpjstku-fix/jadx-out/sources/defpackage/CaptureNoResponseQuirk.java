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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.presentation.util.WebviewFaqCustomActivity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CaptureNoResponseQuirk implements VideoOutput {
    private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private /* synthetic */ WebviewFaqCustomActivity TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ String b;
    private static final byte[] $$c = {68, -119, -76, 97};
    private static final int $$d = 174;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {104, 27, -72, 120};
    private static final int $$b = 219;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f117a = 0;
    private static int asBinder = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {45557, 61096, 3926, 44076, 52450, 28042, 35409, 11018, 19393, 59537, 2329, 43518, 50854, 26473, 33819, 9430, 17816, 57934, 774, 4058, 20619, 45386, 4620, 29400, 54176, 13408, 38170, 62970, 22176, 46895, 6085, 30875, 55619, 14888, 39651, 64440, 23656, 48055, 58623, 1340, 42609, 50853, 26588, 32792, 8457, 16769, 58074, 830, 41887, 52455, 27951, 36417, 11928, 45491, 61096, 3947, 44090, 52399, 28052, 35411, 11039, 19402, 59526, 2358, 43454, 50860, 26466, 33820, 9408, 17803, 57860, 790, 41899, 49265, 24876, 33263, 16019, 24403, 64604, 7369, 48532, 55850, 31461, 39851, 14443, 22792, 63972, 5766, 46939, 54273, 29884, 38259, 12863, 45554, 61108, 3938, 45491, 61099, 3936, 44070, 52451, 28112, 35397, 11028, 19415, 59596, 2353, 43508, 50874, 26473, 33819, 9433, 17859, 57933, 790, 41899, 49265, 24876, 33251, 16034, 24401, 64541, 7371, 48515, 55860, 31474, 39850, 43482, 45491, 61096, 3947, 44090, 52399, 28052, 35411, 11039, 19402, 59526, 2358, 43454, 50860, 26466, 33820, 9408, 17803, 57860, 790, 41899, 49265, 24876, 33263, 16019, 24403, 64604, 7390, 48531, 55865, 31476, 39847, 14443, 22811, 63972, 5789, 46919};
    private static long g = 854025676604108507L;

    public /* synthetic */ CaptureNoResponseQuirk(String str, String str2, String str3, WebviewFaqCustomActivity webviewFaqCustomActivity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.b = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = webviewFaqCustomActivity;
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
    private static void d(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = 98 - r8
            int r9 = r9 * 3
            int r9 = 1 - r9
            byte[] r0 = defpackage.CaptureNoResponseQuirk.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L27
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
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CaptureNoResponseQuirk.d(short, short, short, java.lang.Object[]):void");
    }

    @Override // defpackage.VideoOutput
    public final void TuitionPaymentFragmentbindingInflater1(VideoEncoderSessionVideoEncoderState videoEncoderSessionVideoEncoderState) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        f117a = i2 % 128;
        if (i2 % 2 != 0) {
            WebviewFaqCustomActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, videoEncoderSessionVideoEncoderState);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        WebviewFaqCustomActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, videoEncoderSessionVideoEncoderState);
        int i3 = f117a + 3;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x02e1  */
    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        float f;
        Throwable cause;
        int i3 = 2;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            f = 0.0f;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i5 = $10 + 69;
            $11 = i5 % 128;
            if (i5 % i3 != 0) {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.getMode(0) + 2187, 41 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 841711447, false, $$e(b, b2, (byte) (b2 - 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(g), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 33018), (-16774205) - Color.rgb(0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 26, 321985076, false, $$e(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - View.MeasureSpec.makeMeasureSpec(0, 0)), 3376 - View.resolveSize(0, 0), 17 - View.combineMeasuredStates(0, 0), -968507904, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } else {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i % i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2187, 40 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 841711447, false, $$e(b7, b8, (byte) (b8 - 2)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(g), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33017), 3011 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 26, 321985076, false, $$e(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (View.getDefaultSize(0, 0) + 36505), TextUtils.indexOf("", "", 0) + 3376, 16 - TextUtils.indexOf((CharSequence) "", '0'), -968507904, false, $$e(b11, b12, (byte) (b12 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            i3 = 2;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                byte b13 = (byte) 0;
                byte b14 = (byte) (b13 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - (ViewConfiguration.getLongPressTimeout() >> 16)), 3376 - ((Process.getThreadPriority(0) + 20) >> 6), 18 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), -968507904, false, $$e(b13, b14, (byte) (b14 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
            f = 0.0f;
        }
        objArr[0] = new String(cArr);
        int i8 = $11 + 65;
        $10 = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x082e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0835  */
    /* JADX WARN: Code duplicated, block: B:112:0x085c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0873  */
    /* JADX WARN: Code duplicated, block: B:116:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:118:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x050e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0510 A[Catch: Exception -> 0x080b, TRY_LEAVE, TryCatch #1 {Exception -> 0x080b, blocks: (B:66:0x04dc, B:69:0x0510, B:75:0x062c, B:77:0x0634, B:80:0x06ab, B:89:0x07ab, B:99:0x07fc, B:100:0x0802, B:102:0x0804, B:103:0x080a, B:70:0x051a, B:72:0x053e, B:74:0x061e, B:81:0x06b5, B:84:0x0728, B:88:0x079d, B:85:0x0737), top: B:130:0x04dc, inners: #0, #6 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0634 A[Catch: Exception -> 0x080b, TryCatch #1 {Exception -> 0x080b, blocks: (B:66:0x04dc, B:69:0x0510, B:75:0x062c, B:77:0x0634, B:80:0x06ab, B:89:0x07ab, B:99:0x07fc, B:100:0x0802, B:102:0x0804, B:103:0x080a, B:70:0x051a, B:72:0x053e, B:74:0x061e, B:81:0x06b5, B:84:0x0728, B:88:0x079d, B:85:0x0737), top: B:130:0x04dc, inners: #0, #6 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:80:0x06ab A[Catch: Exception -> 0x080b, TRY_LEAVE, TryCatch #1 {Exception -> 0x080b, blocks: (B:66:0x04dc, B:69:0x0510, B:75:0x062c, B:77:0x0634, B:80:0x06ab, B:89:0x07ab, B:99:0x07fc, B:100:0x0802, B:102:0x0804, B:103:0x080a, B:70:0x051a, B:72:0x053e, B:74:0x061e, B:81:0x06b5, B:84:0x0728, B:88:0x079d, B:85:0x0737), top: B:130:0x04dc, inners: #0, #6 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0728 A[Catch: all -> 0x07fb, TRY_ENTER, TryCatch #6 {all -> 0x07fb, blocks: (B:81:0x06b5, B:84:0x0728, B:88:0x079d, B:85:0x0737), top: B:138:0x06b5, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0737 A[Catch: all -> 0x07fb, TRY_LEAVE, TryCatch #6 {all -> 0x07fb, blocks: (B:81:0x06b5, B:84:0x0728, B:88:0x079d, B:85:0x0737), top: B:138:0x06b5, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:93:0x07c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:96:0x07f6  */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        String line;
        Object[] objArr;
        char c;
        Object obj;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String[] strArr;
        int i11;
        Object[] objArr2;
        Object[] objArr3;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        char c2;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        boolean zEquals;
        File file2;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean zEquals2;
        int i20;
        int i21;
        int i22;
        String str;
        int i23;
        int iB;
        int i24;
        int i25;
        int scrollDefaultDelay;
        int i26;
        int i27 = 2 % 2;
        try {
            Object[] objArr4 = new Object[1];
            c((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - (~(ViewConfiguration.getTouchSlop() >> 8)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr4);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
            int iB2 = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
            int i28 = packedPositionChild * 569;
            int i29 = (i28 & 11380) + (i28 | 11380);
            int i30 = ~packedPositionChild;
            int i31 = ~(i30 | (-21));
            int i32 = ~packedPositionChild;
            int i33 = ~iB2;
            int i34 = (~((i32 ^ i33) | (i32 & i33))) | i31;
            int i35 = ~(((-21) ^ i33) | ((-21) & i33));
            int i36 = -(-(((i34 ^ i35) | (i35 & i34)) * (-1136)));
            int i37 = (i29 & i36) + (i36 | i29);
            int i38 = ~((i30 ^ iB2) | (i30 & iB2));
            int i39 = ~((-21) | iB2);
            int i40 = (i38 ^ i39) | (i38 & i39);
            int i41 = ~iB2;
            int i42 = i41 | packedPositionChild;
            int i43 = -(-((i40 | (~((i42 ^ 20) | (i42 & 20)))) * (-568)));
            int i44 = (i37 & i43) + (i43 | i37);
            int i45 = (~((i41 ^ packedPositionChild) | (packedPositionChild & i41))) | (~((i33 & 20) | (i33 ^ 20)));
            int i46 = ~((i30 ^ (-21)) | (i30 & (-21)) | iB2);
            int i47 = (i44 - (~(-(-(((i45 & i46) | (i45 ^ i46)) * 568))))) - 1;
            int i48 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i49 = ((i48 | 18) << 1) - (i48 ^ 18);
            int i50 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
            Object[] objArr5 = new Object[1];
            c(i47, i49, (char) ((i50 ^ 48689) + ((i50 & 48689) << 1)), objArr5);
            String[] strArr2 = {(String) objArr4[0], (String) objArr5[0]};
            int i51 = 0;
            while (true) {
                if (i51 >= 2) {
                    i5 = i;
                    break;
                }
                int i52 = f117a;
                int i53 = (i52 & 119) + (i52 | 119);
                asBinder = i53 % 128;
                if (i53 % 2 == 0) {
                    str = strArr2[i51];
                    int pressedStateDuration = ViewConfiguration.getPressedStateDuration();
                    i23 = -((pressedStateDuration ^ 78) + ((pressedStateDuration & 78) << 1));
                    iB = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                    i24 = 8;
                } else {
                    str = strArr2[i51];
                    i23 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    iB = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                    i24 = 37;
                }
                int i54 = i23 * (-515);
                int i55 = -(-(i24 * 517));
                int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
                int i57 = ~i24;
                int i58 = ~((i57 & iB) | (i57 ^ iB));
                int i59 = ~iB;
                int i60 = ~((i59 ^ i23) | (i59 & i23));
                int i61 = (i58 ^ i60) | (i58 & i60);
                int i62 = (i59 ^ i24) | (i59 & i24);
                int i63 = -(-(((~i62) | i61) * (-516)));
                int i64 = ((i56 | i63) << 1) - (i63 ^ i56);
                int i65 = ~i23;
                int i66 = ~i24;
                int i67 = (i66 & i65) | (i65 ^ i66);
                int i68 = ((~((i67 & iB) | (i67 ^ iB))) | (~((i65 ^ i59) | (i65 & i59) | i24))) * 516;
                int i69 = (i64 & i68) + (i64 | i68);
                int i70 = f117a;
                int i71 = ((i70 | 71) << 1) - (i70 ^ 71);
                asBinder = i71 % 128;
                if (i71 % 2 == 0) {
                    int i72 = ~((i65 & i24) | (i65 ^ i24));
                    int i73 = ~((i59 ^ i24) | (i24 & i59));
                    int i74 = -(516 >> ((i72 & i73) | (i72 ^ i73)));
                    i25 = (i69 & i74) + (i74 | i69);
                    scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay();
                    i26 = 123;
                } else {
                    int i75 = ~((i65 & i24) | (i65 ^ i24));
                    int i76 = ~i62;
                    i25 = i69 + (((i75 & i76) | (i75 ^ i76)) * 516);
                    scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay();
                    i26 = 16;
                }
                int i77 = -(scrollDefaultDelay >> 16);
                int i78 = (i26 & i77) + (i77 | i26);
                int i79 = -((byte) KeyEvent.getModifierMetaStateMask());
                Object[] objArr6 = new Object[1];
                c(i25, i78, (char) ((i79 ^ 2633) + ((i79 & 2633) << 1)), objArr6);
                Class<?> cls = Class.forName((String) objArr6[0]);
                if (!(!((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue())) {
                    i3 = i & (-2);
                    i4 = (~i) & 1;
                    i5 = i3 | i4;
                    break;
                }
                i51++;
                int i80 = asBinder + 29;
                f117a = i80 % 128;
                int i81 = i80 % 2;
            }
        } catch (Exception unused) {
            i3 = i & (-3);
            i4 = (~i) & 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 2419);
                int mode = 2845 - View.MeasureSpec.getMode(0);
                int i82 = 4 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte b = (byte) 0;
                byte b2 = b;
                Object[] objArr7 = new Object[1];
                d(b, b2, b2, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, mode, i82, -501222268, false, (String) objArr7[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = 269196599;
            long j2 = 216;
            long j3 = i;
            long j4 = -1;
            int i83 = i5;
            long j5 = j3 ^ j4;
            long j6 = (((long) 217) * j) + (((long) (-215)) * jLongValue) + (((j | j3) ^ j4) * j2) + (((long) (-216)) * (j | (jLongValue ^ j4) | j5)) + (j2 * (jLongValue | ((j5 | j) ^ j4))) + ((long) (-1428383285));
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i84 = ((int) (j6 >> 32)) & (((~((-1367345195) | iFreeMemory)) * 521) + 245798960 + (((~((~iFreeMemory) | (-1367345195))) | 69345280) * 521));
            int i85 = ~i;
            int i86 = ((int) j6) & ((-1517074966) + (((~((-807449753) | i85)) | (-2050291134)) * (-591)) + (((-807449753) | i) * 591));
            int i87 = (i84 & i86) | (i84 ^ i86);
            int i88 = (i87 & (-2)) | ((~i87) & 1);
            int i89 = (i88 | (-i88)) >> 31;
            int i90 = ((i & (-11)) | (i85 & 10)) & (~i89);
            int i91 = i89 & i;
            int i92 = ((~i83) & i) | (i83 & i85);
            int i93 = (i92 | (-i92)) >> 31;
            int i94 = ((i91 & i90) | (i90 ^ i91)) & (~i93);
            int i95 = i83 & i93;
            int i96 = (i94 & i95) | (i94 ^ i95);
            try {
                try {
                    int i97 = -TextUtils.getTrimmedLength("");
                    int iB3 = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                    int i98 = i97 * (-419);
                    int i99 = (i98 ^ 22313) + ((i98 & 22313) << 1);
                    int i100 = (~((iB3 ^ 53) | (iB3 & 53))) * TypedValues.CycleType.TYPE_EASING;
                    int i101 = (i99 & i100) + (i100 | i99);
                    int i102 = ((~i97) | 53) * (-420);
                    int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
                    int i104 = ~i97;
                    int i105 = ~((i104 & (-54)) | (i104 ^ (-54)));
                    int i106 = ~iB3;
                    int i107 = ~((i106 & 53) | (i106 ^ 53));
                    int i108 = ((i105 & i107) | (i105 ^ i107)) * TypedValues.CycleType.TYPE_EASING;
                    int i109 = ((i103 | i108) << 1) - (i108 ^ i103);
                    int mode2 = View.MeasureSpec.getMode(0);
                    int i110 = (mode2 * (-574)) - 22960;
                    int i111 = ~mode2;
                    int i112 = ~i;
                    int i113 = ((~(i111 | i112)) | (~((-41) | i))) * 1150;
                    int i114 = (((i110 & i113) + (i110 | i113)) - (~(((~(((-41) ^ i) | ((-41) & i))) | (~((i85 ^ 40) | (i85 & 40)))) * (-575)))) - 1;
                    int i115 = ((~(mode2 | i112)) | (~((i111 & i) | (i111 ^ i)))) * 575;
                    int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                    int i117 = -TextUtils.lastIndexOf("", '0', 0, 0);
                    int i118 = (i117 * 69) + 67;
                    int i119 = ~i117;
                    int i120 = ~((i119 ^ i85) | (i119 & i85));
                    int i121 = ~((i ^ (-1)) | i);
                    int i122 = -(-(((i120 & i121) | (i120 ^ i121)) * (-68)));
                    int i123 = (i118 & i122) + (i118 | i122);
                    int i124 = (i119 ^ i85) | (i119 & i85);
                    int i125 = -(-((~(i124 | (~i124))) * (-68)));
                    int i126 = ((i123 | i125) << 1) - (i125 ^ i123);
                    int i127 = ~i85;
                    int i128 = ((i119 & i127) | (i119 ^ i127)) * 68;
                    Object[] objArr8 = new Object[1];
                    c(i109, i116, (char) (((i126 | i128) << 1) - (i128 ^ i126)), objArr8);
                    File file3 = new File((String) objArr8[0]);
                    int i129 = f117a;
                    int i130 = (i129 & 125) + (i129 | 125);
                    asBinder = i130 % 128;
                    if (i130 % 2 == 0) {
                        file3.canRead();
                        throw null;
                    }
                    if (file3.canRead()) {
                        FileReader fileReader3 = new FileReader(file3);
                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                        try {
                            line = bufferedReader3.readLine();
                            int capsMode = TextUtils.getCapsMode("", 0, 0);
                            int i131 = f117a + 79;
                            int i132 = i131 % 128;
                            asBinder = i132;
                            int i133 = i131 % 2;
                            int i134 = capsMode * (-716);
                            int i135 = ((i134 | 133455) << 1) - (i134 ^ 133455);
                            int i136 = ~capsMode;
                            int i137 = i135 + (((i136 ^ 93) | (i136 & 93)) * (-1434));
                            int i138 = ~((i112 ^ 93) | (i112 & 93));
                            int i139 = (i132 & 73) + (i132 | 73);
                            int i140 = i139 % 128;
                            f117a = i140;
                            if (i139 % 2 != 0) {
                                int i141 = (~((capsMode ^ 93) | (capsMode & 93))) | i138;
                                int i142 = ~capsMode;
                                int i143 = (i142 & (-94)) | (i142 ^ (-94));
                                int i144 = ~((i143 & i) | (i143 ^ i));
                                int i145 = -(((i141 & i144) | (i141 ^ i144)) * 717);
                                i22 = (i137 ^ i145) + ((i145 & i137) << 1);
                            } else {
                                int i146 = ~((capsMode ^ 93) | (capsMode & 93));
                                int i147 = (i138 ^ i146) | (i138 & i146);
                                int i148 = i136 | (-94);
                                int i149 = ~((i148 & i) | (i148 ^ i));
                                i22 = i137 + (((i149 & i147) | (i147 ^ i149)) * 717);
                            }
                            int i150 = ~capsMode;
                            int i151 = (i150 & (-94)) | (i150 ^ (-94));
                            int i152 = ~((i151 & i112) | (i151 ^ i112));
                            int i153 = (i140 ^ 77) + ((i140 & 77) << 1);
                            asBinder = i153 % 128;
                            int i154 = i153 % 2;
                            int i155 = ((capsMode & 93) | (capsMode ^ 93)) ^ (-1);
                            int i156 = -(-(717 * ((i155 & i152) | (i152 ^ i155) | (~((93 ^ i) | (93 & i))))));
                            int i157 = ((i22 | i156) << 1) - (i156 ^ i22);
                            int i158 = 1 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))));
                            int tapTimeout = ViewConfiguration.getTapTimeout();
                            int i159 = f117a;
                            int i160 = (i159 ^ 99) + ((i159 & 99) << 1);
                            asBinder = i160 % 128;
                            int i161 = i160 % 2;
                            Object[] objArr9 = new Object[1];
                            c(i157, i158, (char) (tapTimeout >> 16), objArr9);
                            if (line.equals((String) objArr9[0])) {
                                fileReader3.close();
                                bufferedReader3.close();
                            } else {
                                int i162 = asBinder + 51;
                                f117a = i162 % 128;
                                if (i162 % 2 != 0) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                fileReader3.close();
                                bufferedReader3.close();
                            }
                            int i163 = -(-Drawable.resolveOpacity(0, 0));
                            int i164 = ((i163 | 96) << 1) - (i163 ^ 96);
                            int i165 = -KeyEvent.getDeadChar(0, 0);
                            Object[] objArr10 = new Object[1];
                            c(i164, (i165 & 31) + (i165 | 31), (char) View.getDefaultSize(0, 0), objArr10);
                            file = new File((String) objArr10[0]);
                            if (!file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                try {
                                    String line2 = bufferedReader.readLine();
                                    int i166 = 126 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                                    int threadPriority = Process.getThreadPriority(0);
                                    int i167 = asBinder + 15;
                                    f117a = i167 % 128;
                                    int i168 = i167 % 2;
                                    int i169 = -((threadPriority + 20) >> 6);
                                    int iB4 = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                                    int i170 = i169 * (-1529);
                                    int i171 = (i170 ^ (-764)) + ((i170 & (-764)) << 1);
                                    int i172 = ~i169;
                                    int i173 = (i172 ^ (-2)) | (i172 & (-2));
                                    int i174 = ~((~iB4) | i173);
                                    int i175 = ~i169;
                                    int i176 = (i175 ^ 1) | (i175 & 1);
                                    int i177 = ~((i176 ^ iB4) | (i176 & iB4));
                                    int i178 = (i174 ^ i177) | (i174 & i177);
                                    int i179 = ((-2) ^ i169) | ((-2) & i169);
                                    int i180 = ~((i179 ^ iB4) | (i179 & iB4));
                                    int i181 = -(-(((i178 ^ i180) | (i178 & i180)) * 765));
                                    int i182 = (i171 ^ i181) + ((i181 & i171) << 1);
                                    int i183 = ~i173;
                                    int i184 = ~iB4;
                                    int i185 = ~(i172 | i184);
                                    int i186 = (i182 - (~(((i183 ^ i185) | (i183 & i185)) * 1530))) - 1;
                                    int i187 = ~(i172 | iB4);
                                    int i188 = i184 | (-2);
                                    int i189 = ~((i188 & i169) | (i188 ^ i169));
                                    int i190 = i186 + (((i187 & i189) | (i187 ^ i189)) * 765);
                                    int i191 = -(KeyEvent.getMaxKeyCode() >> 16);
                                    int i192 = f117a + 57;
                                    int i193 = i192 % 128;
                                    asBinder = i193;
                                    int i194 = i192 % 2;
                                    int i195 = 677 * i191;
                                    int i196 = (i195 & (-4227525)) + (i195 | (-4227525));
                                    int i197 = ((i191 ^ i) | (i191 & i) | (-6264)) * (-676);
                                    int i198 = (i196 ^ i197) + ((i197 & i196) << 1);
                                    int i199 = ~(((-6264) ^ i191) | ((-6264) & i191));
                                    int i200 = ~i;
                                    int i201 = ~((i200 ^ i191) | (i200 & i191));
                                    int i202 = ((i199 ^ i201) | (i199 & i201)) * 676;
                                    int i203 = (i198 & i202) + (i198 | i202);
                                    int i204 = ~((~i191) | (-6264));
                                    int i205 = ~((-6264) | i200);
                                    int i206 = (i204 & i205) | (i204 ^ i205);
                                    int i207 = i193 + 5;
                                    f117a = i207 % 128;
                                    int i208 = i207 % 2;
                                    int i209 = (i191 & 6263) | (i191 ^ 6263);
                                    int i210 = ~((i209 & i) | (i209 ^ i));
                                    int i211 = -(-(676 * ((i210 & i206) | (i206 ^ i210))));
                                    Object[] objArr11 = new Object[1];
                                    c(i166, i190, (char) ((i203 & i211) + (i211 | i203)), objArr11);
                                    zEquals = line2.equals((String) objArr11[0]);
                                    fileReader.close();
                                    bufferedReader.close();
                                    if (zEquals) {
                                        int i212 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int i213 = (i212 ^ 128) + ((i212 & 128) << 1);
                                        int i214 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int i215 = i214 * (-500);
                                        int i216 = (i215 & (-17500)) + (i215 | (-17500));
                                        int i217 = ~(((-36) & i214) | ((-36) ^ i214));
                                        int i218 = ~i214;
                                        int i219 = (i218 & 35) | (i218 ^ 35);
                                        int i220 = ~((i219 & i) | (i219 ^ i));
                                        int i221 = ((i217 & i220) | (i217 ^ i220)) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                        int i222 = (i216 ^ i221) + ((i221 & i216) << 1);
                                        int i223 = ~i214;
                                        int i224 = (~((i223 ^ (-36)) | (i223 & (-36)))) * 1002;
                                        int i225 = (i222 ^ i224) + ((i224 & i222) << 1);
                                        int i226 = (i223 & i85) | (i223 ^ i85);
                                        int i227 = (~((i226 & 35) | (i226 ^ 35))) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                        Object[] objArr12 = new Object[1];
                                        c(i213, (i225 ^ i227) + ((i227 & i225) << 1), (char) Color.alpha(0), objArr12);
                                        file2 = new File((String) objArr12[0]);
                                        if (!file2.canRead()) {
                                            fileReader2 = new FileReader(file2);
                                            bufferedReader2 = new BufferedReader(fileReader2);
                                            try {
                                                String line3 = bufferedReader2.readLine();
                                                int i228 = 125 - (~(-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))));
                                                int i229 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                int iB5 = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                                                int i230 = i229 * (-183);
                                                int i231 = (i230 & 185) + (i230 | 185);
                                                int i232 = ~i229;
                                                int i233 = (i231 - (~(((i232 ^ 1) | (i232 & 1)) * (-368)))) - 1;
                                                int i234 = (i229 ^ (-2)) | (i229 & (-2));
                                                int i235 = ~iB5;
                                                int i236 = i233 + (((i234 ^ i235) | (i235 & i234)) * 184);
                                                int i237 = f117a;
                                                int i238 = (i237 & 15) + (i237 | 15);
                                                int i239 = i238 % 128;
                                                asBinder = i239;
                                                int i240 = i238 % 2;
                                                int i241 = ~(((-2) & i232) | (i232 ^ (-2)));
                                                int i242 = ~iB5;
                                                int i243 = ~((i242 & i229) | (i242 ^ i229));
                                                int i244 = (i241 & i243) | (i241 ^ i243);
                                                int i245 = ~(i229 | 1);
                                                int i246 = i236 + (184 * ((i244 & i245) | (i244 ^ i245)));
                                                i16 = i239 + 27;
                                                f117a = i16 % 128;
                                                if (i16 % 2 != 0) {
                                                    i17 = (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1));
                                                    i18 = (-744) - (~(-i17));
                                                    i19 = 6300;
                                                } else {
                                                    i17 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    i18 = i17 * (-743);
                                                    i19 = 6262;
                                                }
                                                int i247 = asBinder;
                                                int i248 = ((i247 | 103) << 1) - (i247 ^ 103);
                                                f117a = i248 % 128;
                                                int i249 = i248 % 2;
                                                int i250 = (i18 - (~(-(-((-743) * i19))))) - 1;
                                                int i251 = i17 | i19;
                                                int i252 = ~i251;
                                                int i253 = ~((i17 ^ i) | (i17 & i));
                                                int i254 = (i252 ^ i253) | (i252 & i253);
                                                int i255 = ~((i19 ^ i) | (i19 & i));
                                                int i256 = -(-(((i254 ^ i255) | (i254 & i255)) * (-744)));
                                                int i257 = ((i250 | i256) << 1) - (i250 ^ i256);
                                                int i258 = ~i17;
                                                int i259 = ~i19;
                                                int i260 = ~((i258 & i259) | (i258 ^ i259));
                                                int i261 = -(-(((i260 & i85) | (i85 ^ i260)) * 744));
                                                Object[] objArr13 = new Object[1];
                                                c(i228, i246, (char) ((i257 & i261) + (i261 | i257) + (((i251 ^ i) | (i251 & i)) * 744)), objArr13);
                                                zEquals2 = line3.equals((String) objArr13[0]);
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                if (zEquals2) {
                                                    i20 = asBinder;
                                                    i21 = (i20 ^ 31) + ((i20 & 31) << 1);
                                                    f117a = i21 % 128;
                                                    if (i21 % 2 == 0) {
                                                        Object obj3 = null;
                                                        obj3.hashCode();
                                                        throw null;
                                                    }
                                                    if (line != null) {
                                                        int i262 = i20 + 125;
                                                        f117a = i262 % 128;
                                                        int i263 = i262 % 2;
                                                        int i264 = ((i20 | 45) << 1) - (i20 ^ 45);
                                                        f117a = i264 % 128;
                                                        int i265 = i264 % 2;
                                                        objArr = new Object[]{new int[]{(i & (-21)) | (i85 & 20)}, new String[]{line}};
                                                        c = 0;
                                                    } else {
                                                        i14 = 2;
                                                    }
                                                }
                                                Object[] objArr14 = new Object[i14];
                                                iArr = new int[1];
                                                objArr14[0] = iArr;
                                                int i266 = f117a;
                                                int i267 = ((i266 | 55) << 1) - (i266 ^ 55);
                                                asBinder = i267 % 128;
                                                int i268 = i267 % 2;
                                                String[] strArr3 = new String[0];
                                                i15 = i266 + 91;
                                                asBinder = i15 % 128;
                                                if (i15 % 2 == 0) {
                                                    c2 = 1;
                                                    iArr[1] = i;
                                                    c = 0;
                                                } else {
                                                    c2 = 1;
                                                    c = 0;
                                                    iArr[0] = i;
                                                }
                                                objArr14[c2] = strArr3;
                                                objArr = objArr14;
                                            } catch (Throwable th) {
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                throw th;
                                            }
                                        }
                                    }
                                    obj = objArr[c];
                                    i6 = ((int[]) obj)[c];
                                    int i269 = ((~i96) & i) | (i96 & i85);
                                    i7 = (i269 | (-i269)) >> 31;
                                    i8 = (~i7) & i6;
                                    i9 = f117a + 55;
                                    int i270 = i9 % 128;
                                    asBinder = i270;
                                    if (i9 % 2 == 0) {
                                        int i271 = i96 & i7;
                                        i10 = (i271 & i8) | (i8 ^ i271);
                                        strArr = (String[]) obj;
                                        objArr2 = new Object[2];
                                        int i272 = (i6 & i85) | ((~i6) & i);
                                        int i273 = -i272;
                                        i11 = (((i272 & i273) | (i272 ^ i273)) << 5) & 1;
                                    } else {
                                        i10 = i8 | (i96 & i7);
                                        strArr = (String[]) objArr[1];
                                        int i274 = ((~i6) & i) | (i6 & i85);
                                        i11 = ((i274 | (-i274)) >> 31) & 1;
                                        objArr2 = new Object[2];
                                    }
                                    int i275 = i270 + 25;
                                    int i276 = i275 % 128;
                                    f117a = i276;
                                    int i277 = i275 % 2;
                                    int i278 = -i11;
                                    int i279 = (~(((i278 & i11) | (i11 ^ i278)) >> 31)) & 1;
                                    objArr2[i11] = null;
                                    objArr2[i279] = strArr;
                                    String[] strArr4 = (String[]) objArr2[0];
                                    objArr3 = new Object[4];
                                    objArr3[0] = new int[1];
                                    i12 = i276 + 43;
                                    int i280 = i12 % 128;
                                    asBinder = i280;
                                    if (i12 % 2 == 0) {
                                        objArr3[0] = new int[0];
                                        objArr3[5] = new int[0];
                                        int i281 = ((~i10) & i) | (i10 & i85);
                                        int i282 = -i281;
                                        int i283 = ((i281 & i282) | (i281 ^ i282)) >> 12;
                                        i13 = (i283 & 58) ^ ((~i283) & 1);
                                    } else {
                                        objArr3[1] = new int[1];
                                        objArr3[2] = new int[1];
                                        int i284 = i ^ i10;
                                        int i285 = -i284;
                                        i13 = (((i284 & i285) | (i284 ^ i285)) >> 31) & 16;
                                    }
                                    ((int[]) objArr3[0])[0] = i;
                                    ((int[]) objArr3[2])[0] = i10;
                                    objArr3[3] = strArr4;
                                    int i286 = (((~((-488691146) | i85)) | 404788672 | (~((-448380917) | i85))) * (-397)) + 903418554 + (((-127494718) | i) * 397);
                                    int i287 = (i13 * 399) + (i286 * 399);
                                    int i288 = ~i13;
                                    int i289 = ~(i288 | i286);
                                    int i290 = ~i286;
                                    int i291 = ~((i290 ^ i13) | (i290 & i13));
                                    int i292 = (i289 & i291) | (i289 ^ i291);
                                    int i293 = ~i286;
                                    int i294 = -(-(((~((i & i293) | (i293 ^ i))) | i292) * 398));
                                    int i295 = (i287 & i294) + (i294 | i287);
                                    int i296 = -(-(((i13 ^ i286) | (i13 & i286)) * (-1194)));
                                    int i297 = (i295 & i296) + (i296 | i295);
                                    int i298 = ~((i290 ^ i85) | (i85 & i290));
                                    int i299 = ((i280 | 113) << 1) - (i280 ^ 113);
                                    f117a = i299 % 128;
                                    int i300 = i299 % 2;
                                    int i301 = ~(i286 | i288);
                                    int i302 = (i301 & i298) | (i298 ^ i301);
                                    int i303 = ~((i293 ^ i13) | (i293 & i13));
                                    int i304 = -(-((i297 - (~(398 * ((i302 & i303) | (i302 ^ i303))))) - 1));
                                    int i305 = ((i2 | i304) << 1) - (i2 ^ i304);
                                    int i306 = i305 << 13;
                                    int i307 = (i306 & (~i305)) | ((~i306) & i305);
                                    int i308 = i307 >>> 17;
                                    int i309 = ((~i307) & i308) | ((~i308) & i307);
                                    int i310 = i309 << 5;
                                    ((int[]) objArr3[1])[0] = (i309 | i310) & (~(i309 & i310));
                                    return objArr3;
                                } catch (Throwable th2) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    throw th2;
                                }
                            }
                            i14 = 2;
                            Object[] objArr15 = new Object[i14];
                            iArr = new int[1];
                            objArr15[0] = iArr;
                            int i2610 = f117a;
                            int i2611 = ((i2610 | 55) << 1) - (i2610 ^ 55);
                            asBinder = i2611 % 128;
                            int i2612 = i2611 % 2;
                            String[] strArr5 = new String[0];
                            i15 = i2610 + 91;
                            asBinder = i15 % 128;
                            if (i15 % 2 == 0) {
                                c2 = 1;
                                iArr[1] = i;
                                c = 0;
                            } else {
                                c2 = 1;
                                c = 0;
                                iArr[0] = i;
                            }
                            objArr15[c2] = strArr5;
                            objArr = objArr15;
                            obj = objArr[c];
                            i6 = ((int[]) obj)[c];
                            int i2613 = ((~i96) & i) | (i96 & i85);
                            i7 = (i2613 | (-i2613)) >> 31;
                            i8 = (~i7) & i6;
                            i9 = f117a + 55;
                            int i2710 = i9 % 128;
                            asBinder = i2710;
                            if (i9 % 2 == 0) {
                                int i2711 = i96 & i7;
                                i10 = (i2711 & i8) | (i8 ^ i2711);
                                strArr = (String[]) obj;
                                objArr2 = new Object[2];
                                int i2712 = (i6 & i85) | ((~i6) & i);
                                int i2713 = -i2712;
                                i11 = (((i2712 & i2713) | (i2712 ^ i2713)) << 5) & 1;
                            } else {
                                i10 = i8 | (i96 & i7);
                                strArr = (String[]) objArr[1];
                                int i2714 = ((~i6) & i) | (i6 & i85);
                                i11 = ((i2714 | (-i2714)) >> 31) & 1;
                                objArr2 = new Object[2];
                            }
                            int i2715 = i2710 + 25;
                            int i2716 = i2715 % 128;
                            f117a = i2716;
                            int i2717 = i2715 % 2;
                            int i2718 = -i11;
                            int i2719 = (~(((i2718 & i11) | (i11 ^ i2718)) >> 31)) & 1;
                            objArr2[i11] = null;
                            objArr2[i2719] = strArr;
                            String[] strArr6 = (String[]) objArr2[0];
                            objArr3 = new Object[4];
                            objArr3[0] = new int[1];
                            i12 = i2716 + 43;
                            int i2810 = i12 % 128;
                            asBinder = i2810;
                            if (i12 % 2 == 0) {
                                objArr3[0] = new int[0];
                                objArr3[5] = new int[0];
                                int i2811 = ((~i10) & i) | (i10 & i85);
                                int i2812 = -i2811;
                                int i2813 = ((i2811 & i2812) | (i2811 ^ i2812)) >> 12;
                                i13 = (i2813 & 58) ^ ((~i2813) & 1);
                            } else {
                                objArr3[1] = new int[1];
                                objArr3[2] = new int[1];
                                int i2814 = i ^ i10;
                                int i2815 = -i2814;
                                i13 = (((i2814 & i2815) | (i2814 ^ i2815)) >> 31) & 16;
                            }
                            ((int[]) objArr3[0])[0] = i;
                            ((int[]) objArr3[2])[0] = i10;
                            objArr3[3] = strArr6;
                            int i2816 = (((~((-488691146) | i85)) | 404788672 | (~((-448380917) | i85))) * (-397)) + 903418554 + (((-127494718) | i) * 397);
                            int i2817 = (i13 * 399) + (i2816 * 399);
                            int i2818 = ~i13;
                            int i2819 = ~(i2818 | i2816);
                            int i2910 = ~i2816;
                            int i2911 = ~((i2910 ^ i13) | (i2910 & i13));
                            int i2912 = (i2819 & i2911) | (i2819 ^ i2911);
                            int i2913 = ~i2816;
                            int i2914 = -(-(((~((i & i2913) | (i2913 ^ i))) | i2912) * 398));
                            int i2915 = (i2817 & i2914) + (i2914 | i2817);
                            int i2916 = -(-(((i13 ^ i2816) | (i13 & i2816)) * (-1194)));
                            int i2917 = (i2915 & i2916) + (i2916 | i2915);
                            int i2918 = ~((i2910 ^ i85) | (i85 & i2910));
                            int i2919 = ((i2810 | 113) << 1) - (i2810 ^ 113);
                            f117a = i2919 % 128;
                            int i3010 = i2919 % 2;
                            int i3011 = ~(i2816 | i2818);
                            int i3012 = (i3011 & i2918) | (i2918 ^ i3011);
                            int i3013 = ~((i2913 ^ i13) | (i2913 & i13));
                            int i3014 = -(-((i2917 - (~(398 * ((i3012 & i3013) | (i3012 ^ i3013))))) - 1));
                            int i3015 = ((i2 | i3014) << 1) - (i2 ^ i3014);
                            int i3016 = i3015 << 13;
                            int i3017 = (i3016 & (~i3015)) | ((~i3016) & i3015);
                            int i3018 = i3017 >>> 17;
                            int i3019 = ((~i3017) & i3018) | ((~i3018) & i3017);
                            int i311 = i3019 << 5;
                            ((int[]) objArr3[1])[0] = (i3019 | i311) & (~(i3019 & i311));
                            return objArr3;
                        } catch (Throwable th3) {
                            fileReader3.close();
                            bufferedReader3.close();
                            throw th3;
                        }
                    }
                    int i312 = asBinder;
                    int i313 = ((i312 | 47) << 1) - (i312 ^ 47);
                    f117a = i313 % 128;
                    int i314 = i313 % 2;
                } catch (Exception unused2) {
                }
                int i1610 = -(-Drawable.resolveOpacity(0, 0));
                int i1611 = ((i1610 | 96) << 1) - (i1610 ^ 96);
                int i1612 = -KeyEvent.getDeadChar(0, 0);
                Object[] objArr16 = new Object[1];
                c(i1611, (i1612 & 31) + (i1612 | 31), (char) View.getDefaultSize(0, 0), objArr16);
                file = new File((String) objArr16[0]);
                if (!file.canRead()) {
                    fileReader = new FileReader(file);
                    bufferedReader = new BufferedReader(fileReader);
                    String line4 = bufferedReader.readLine();
                    int i1613 = 126 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                    int threadPriority2 = Process.getThreadPriority(0);
                    int i1614 = asBinder + 15;
                    f117a = i1614 % 128;
                    int i1615 = i1614 % 2;
                    int i1616 = -((threadPriority2 + 20) >> 6);
                    int iB6 = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                    int i1710 = i1616 * (-1529);
                    int i1711 = (i1710 ^ (-764)) + ((i1710 & (-764)) << 1);
                    int i1712 = ~i1616;
                    int i1713 = (i1712 ^ (-2)) | (i1712 & (-2));
                    int i1714 = ~((~iB6) | i1713);
                    int i1715 = ~i1616;
                    int i1716 = (i1715 ^ 1) | (i1715 & 1);
                    int i1717 = ~((i1716 ^ iB6) | (i1716 & iB6));
                    int i1718 = (i1714 ^ i1717) | (i1714 & i1717);
                    int i1719 = ((-2) ^ i1616) | ((-2) & i1616);
                    int i1810 = ~((i1719 ^ iB6) | (i1719 & iB6));
                    int i1811 = -(-(((i1718 ^ i1810) | (i1718 & i1810)) * 765));
                    int i1812 = (i1711 ^ i1811) + ((i1811 & i1711) << 1);
                    int i1813 = ~i1713;
                    int i1814 = ~iB6;
                    int i1815 = ~(i1712 | i1814);
                    int i1816 = (i1812 - (~(((i1813 ^ i1815) | (i1813 & i1815)) * 1530))) - 1;
                    int i1817 = ~(i1712 | iB6);
                    int i1818 = i1814 | (-2);
                    int i1819 = ~((i1818 & i1616) | (i1818 ^ i1616));
                    int i1910 = i1816 + (((i1817 & i1819) | (i1817 ^ i1819)) * 765);
                    int i1911 = -(KeyEvent.getMaxKeyCode() >> 16);
                    int i1912 = f117a + 57;
                    int i1913 = i1912 % 128;
                    asBinder = i1913;
                    int i1914 = i1912 % 2;
                    int i1915 = 677 * i1911;
                    int i1916 = (i1915 & (-4227525)) + (i1915 | (-4227525));
                    int i1917 = ((i1911 ^ i) | (i1911 & i) | (-6264)) * (-676);
                    int i1918 = (i1916 ^ i1917) + ((i1917 & i1916) << 1);
                    int i1919 = ~(((-6264) ^ i1911) | ((-6264) & i1911));
                    int i2010 = ~i;
                    int i2011 = ~((i2010 ^ i1911) | (i2010 & i1911));
                    int i2012 = ((i1919 ^ i2011) | (i1919 & i2011)) * 676;
                    int i2013 = (i1918 & i2012) + (i1918 | i2012);
                    int i2014 = ~((~i1911) | (-6264));
                    int i2015 = ~((-6264) | i2010);
                    int i2016 = (i2014 & i2015) | (i2014 ^ i2015);
                    int i2017 = i1913 + 5;
                    f117a = i2017 % 128;
                    int i2018 = i2017 % 2;
                    int i2019 = (i1911 & 6263) | (i1911 ^ 6263);
                    int i2110 = ~((i2019 & i) | (i2019 ^ i));
                    int i2111 = -(-(676 * ((i2110 & i2016) | (i2016 ^ i2110))));
                    Object[] objArr17 = new Object[1];
                    c(i1613, i1910, (char) ((i2013 & i2111) + (i2111 | i2013)), objArr17);
                    zEquals = line4.equals((String) objArr17[0]);
                    fileReader.close();
                    bufferedReader.close();
                    if (zEquals) {
                        int i2112 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i2113 = (i2112 ^ 128) + ((i2112 & 128) << 1);
                        int i2114 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i2115 = i2114 * (-500);
                        int i2116 = (i2115 & (-17500)) + (i2115 | (-17500));
                        int i2117 = ~(((-36) & i2114) | ((-36) ^ i2114));
                        int i2118 = ~i2114;
                        int i2119 = (i2118 & 35) | (i2118 ^ 35);
                        int i2210 = ~((i2119 & i) | (i2119 ^ i));
                        int i2211 = ((i2117 & i2210) | (i2117 ^ i2210)) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                        int i2212 = (i2116 ^ i2211) + ((i2211 & i2116) << 1);
                        int i2213 = ~i2114;
                        int i2214 = (~((i2213 ^ (-36)) | (i2213 & (-36)))) * 1002;
                        int i2215 = (i2212 ^ i2214) + ((i2214 & i2212) << 1);
                        int i2216 = (i2213 & i85) | (i2213 ^ i85);
                        int i2217 = (~((i2216 & 35) | (i2216 ^ 35))) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                        Object[] objArr18 = new Object[1];
                        c(i2113, (i2215 ^ i2217) + ((i2217 & i2215) << 1), (char) Color.alpha(0), objArr18);
                        file2 = new File((String) objArr18[0]);
                        if (!file2.canRead()) {
                            fileReader2 = new FileReader(file2);
                            bufferedReader2 = new BufferedReader(fileReader2);
                            String line5 = bufferedReader2.readLine();
                            int i2218 = 125 - (~(-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))));
                            int i2219 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int iB7 = lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                            int i2310 = i2219 * (-183);
                            int i2311 = (i2310 & 185) + (i2310 | 185);
                            int i2312 = ~i2219;
                            int i2313 = (i2311 - (~(((i2312 ^ 1) | (i2312 & 1)) * (-368)))) - 1;
                            int i2314 = (i2219 ^ (-2)) | (i2219 & (-2));
                            int i2315 = ~iB7;
                            int i2316 = i2313 + (((i2314 ^ i2315) | (i2315 & i2314)) * 184);
                            int i2317 = f117a;
                            int i2318 = (i2317 & 15) + (i2317 | 15);
                            int i2319 = i2318 % 128;
                            asBinder = i2319;
                            int i2410 = i2318 % 2;
                            int i2411 = ~(((-2) & i2312) | (i2312 ^ (-2)));
                            int i2412 = ~iB7;
                            int i2413 = ~((i2412 & i2219) | (i2412 ^ i2219));
                            int i2414 = (i2411 & i2413) | (i2411 ^ i2413);
                            int i2415 = ~(i2219 | 1);
                            int i2416 = i2316 + (184 * ((i2414 & i2415) | (i2414 ^ i2415)));
                            i16 = i2319 + 27;
                            f117a = i16 % 128;
                            if (i16 % 2 != 0) {
                                i17 = (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1));
                                i18 = (-744) - (~(-i17));
                                i19 = 6300;
                            } else {
                                i17 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                i18 = i17 * (-743);
                                i19 = 6262;
                            }
                            int i2417 = asBinder;
                            int i2418 = ((i2417 | 103) << 1) - (i2417 ^ 103);
                            f117a = i2418 % 128;
                            int i2419 = i2418 % 2;
                            int i2510 = (i18 - (~(-(-((-743) * i19))))) - 1;
                            int i2511 = i17 | i19;
                            int i2512 = ~i2511;
                            int i2513 = ~((i17 ^ i) | (i17 & i));
                            int i2514 = (i2512 ^ i2513) | (i2512 & i2513);
                            int i2515 = ~((i19 ^ i) | (i19 & i));
                            int i2516 = -(-(((i2514 ^ i2515) | (i2514 & i2515)) * (-744)));
                            int i2517 = ((i2510 | i2516) << 1) - (i2510 ^ i2516);
                            int i2518 = ~i17;
                            int i2519 = ~i19;
                            int i2614 = ~((i2518 & i2519) | (i2518 ^ i2519));
                            int i2615 = -(-(((i2614 & i85) | (i85 ^ i2614)) * 744));
                            Object[] objArr19 = new Object[1];
                            c(i2218, i2416, (char) ((i2517 & i2615) + (i2615 | i2517) + (((i2511 ^ i) | (i2511 & i)) * 744)), objArr19);
                            zEquals2 = line5.equals((String) objArr19[0]);
                            fileReader2.close();
                            bufferedReader2.close();
                            if (zEquals2) {
                                i20 = asBinder;
                                i21 = (i20 ^ 31) + ((i20 & 31) << 1);
                                f117a = i21 % 128;
                                if (i21 % 2 == 0) {
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                                if (line != null) {
                                    int i2616 = i20 + 125;
                                    f117a = i2616 % 128;
                                    int i2617 = i2616 % 2;
                                    int i2618 = ((i20 | 45) << 1) - (i20 ^ 45);
                                    f117a = i2618 % 128;
                                    int i2619 = i2618 % 2;
                                    objArr = new Object[]{new int[]{(i & (-21)) | (i85 & 20)}, new String[]{line}};
                                    c = 0;
                                } else {
                                    i14 = 2;
                                }
                            }
                            Object[] objArr110 = new Object[i14];
                            iArr = new int[1];
                            objArr110[0] = iArr;
                            int i26110 = f117a;
                            int i26111 = ((i26110 | 55) << 1) - (i26110 ^ 55);
                            asBinder = i26111 % 128;
                            int i26112 = i26111 % 2;
                            String[] strArr7 = new String[0];
                            i15 = i26110 + 91;
                            asBinder = i15 % 128;
                            if (i15 % 2 == 0) {
                                c2 = 1;
                                iArr[1] = i;
                                c = 0;
                            } else {
                                c2 = 1;
                                c = 0;
                                iArr[0] = i;
                            }
                            objArr110[c2] = strArr7;
                            objArr = objArr110;
                        }
                    }
                    obj = objArr[c];
                    i6 = ((int[]) obj)[c];
                    int i26113 = ((~i96) & i) | (i96 & i85);
                    i7 = (i26113 | (-i26113)) >> 31;
                    i8 = (~i7) & i6;
                    i9 = f117a + 55;
                    int i27110 = i9 % 128;
                    asBinder = i27110;
                    if (i9 % 2 == 0) {
                        int i27111 = i96 & i7;
                        i10 = (i27111 & i8) | (i8 ^ i27111);
                        strArr = (String[]) obj;
                        objArr2 = new Object[2];
                        int i27112 = (i6 & i85) | ((~i6) & i);
                        int i27113 = -i27112;
                        i11 = (((i27112 & i27113) | (i27112 ^ i27113)) << 5) & 1;
                    } else {
                        i10 = i8 | (i96 & i7);
                        strArr = (String[]) objArr[1];
                        int i27114 = ((~i6) & i) | (i6 & i85);
                        i11 = ((i27114 | (-i27114)) >> 31) & 1;
                        objArr2 = new Object[2];
                    }
                    int i27115 = i27110 + 25;
                    int i27116 = i27115 % 128;
                    f117a = i27116;
                    int i27117 = i27115 % 2;
                    int i27118 = -i11;
                    int i27119 = (~(((i27118 & i11) | (i11 ^ i27118)) >> 31)) & 1;
                    objArr2[i11] = null;
                    objArr2[i27119] = strArr;
                    String[] strArr8 = (String[]) objArr2[0];
                    objArr3 = new Object[4];
                    objArr3[0] = new int[1];
                    i12 = i27116 + 43;
                    int i28110 = i12 % 128;
                    asBinder = i28110;
                    if (i12 % 2 == 0) {
                        objArr3[0] = new int[0];
                        objArr3[5] = new int[0];
                        int i28111 = ((~i10) & i) | (i10 & i85);
                        int i28112 = -i28111;
                        int i28113 = ((i28111 & i28112) | (i28111 ^ i28112)) >> 12;
                        i13 = (i28113 & 58) ^ ((~i28113) & 1);
                    } else {
                        objArr3[1] = new int[1];
                        objArr3[2] = new int[1];
                        int i28114 = i ^ i10;
                        int i28115 = -i28114;
                        i13 = (((i28114 & i28115) | (i28114 ^ i28115)) >> 31) & 16;
                    }
                    ((int[]) objArr3[0])[0] = i;
                    ((int[]) objArr3[2])[0] = i10;
                    objArr3[3] = strArr8;
                    int i28116 = (((~((-488691146) | i85)) | 404788672 | (~((-448380917) | i85))) * (-397)) + 903418554 + (((-127494718) | i) * 397);
                    int i28117 = (i13 * 399) + (i28116 * 399);
                    int i28118 = ~i13;
                    int i28119 = ~(i28118 | i28116);
                    int i29110 = ~i28116;
                    int i29111 = ~((i29110 ^ i13) | (i29110 & i13));
                    int i29112 = (i28119 & i29111) | (i28119 ^ i29111);
                    int i29113 = ~i28116;
                    int i29114 = -(-(((~((i & i29113) | (i29113 ^ i))) | i29112) * 398));
                    int i29115 = (i28117 & i29114) + (i29114 | i28117);
                    int i29116 = -(-(((i13 ^ i28116) | (i13 & i28116)) * (-1194)));
                    int i29117 = (i29115 & i29116) + (i29116 | i29115);
                    int i29118 = ~((i29110 ^ i85) | (i85 & i29110));
                    int i29119 = ((i28110 | 113) << 1) - (i28110 ^ 113);
                    f117a = i29119 % 128;
                    int i30110 = i29119 % 2;
                    int i30111 = ~(i28116 | i28118);
                    int i30112 = (i30111 & i29118) | (i29118 ^ i30111);
                    int i30113 = ~((i29113 ^ i13) | (i29113 & i13));
                    int i30114 = -(-((i29117 - (~(398 * ((i30112 & i30113) | (i30112 ^ i30113))))) - 1));
                    int i30115 = ((i2 | i30114) << 1) - (i2 ^ i30114);
                    int i30116 = i30115 << 13;
                    int i30117 = (i30116 & (~i30115)) | ((~i30116) & i30115);
                    int i30118 = i30117 >>> 17;
                    int i30119 = ((~i30117) & i30118) | ((~i30118) & i30117);
                    int i315 = i30119 << 5;
                    ((int[]) objArr3[1])[0] = (i30119 | i315) & (~(i30119 & i315));
                    return objArr3;
                }
            } catch (Exception unused3) {
            }
            line = null;
            i14 = 2;
            Object[] objArr111 = new Object[i14];
            iArr = new int[1];
            objArr111[0] = iArr;
            int i26114 = f117a;
            int i26115 = ((i26114 | 55) << 1) - (i26114 ^ 55);
            asBinder = i26115 % 128;
            int i26116 = i26115 % 2;
            String[] strArr9 = new String[0];
            i15 = i26114 + 91;
            asBinder = i15 % 128;
            if (i15 % 2 == 0) {
                c2 = 1;
                iArr[1] = i;
                c = 0;
            } else {
                c2 = 1;
                c = 0;
                iArr[0] = i;
            }
            objArr111[c2] = strArr9;
            objArr = objArr111;
            obj = objArr[c];
            i6 = ((int[]) obj)[c];
            int i26117 = ((~i96) & i) | (i96 & i85);
            i7 = (i26117 | (-i26117)) >> 31;
            i8 = (~i7) & i6;
            i9 = f117a + 55;
            int i271110 = i9 % 128;
            asBinder = i271110;
            if (i9 % 2 == 0) {
                int i271111 = i96 & i7;
                i10 = (i271111 & i8) | (i8 ^ i271111);
                strArr = (String[]) obj;
                objArr2 = new Object[2];
                int i271112 = (i6 & i85) | ((~i6) & i);
                int i271113 = -i271112;
                i11 = (((i271112 & i271113) | (i271112 ^ i271113)) << 5) & 1;
            } else {
                i10 = i8 | (i96 & i7);
                strArr = (String[]) objArr[1];
                int i271114 = ((~i6) & i) | (i6 & i85);
                i11 = ((i271114 | (-i271114)) >> 31) & 1;
                objArr2 = new Object[2];
            }
            int i271115 = i271110 + 25;
            int i271116 = i271115 % 128;
            f117a = i271116;
            int i271117 = i271115 % 2;
            int i271118 = -i11;
            int i271119 = (~(((i271118 & i11) | (i11 ^ i271118)) >> 31)) & 1;
            objArr2[i11] = null;
            objArr2[i271119] = strArr;
            String[] strArr10 = (String[]) objArr2[0];
            objArr3 = new Object[4];
            objArr3[0] = new int[1];
            i12 = i271116 + 43;
            int i281110 = i12 % 128;
            asBinder = i281110;
            if (i12 % 2 == 0) {
                objArr3[0] = new int[0];
                objArr3[5] = new int[0];
                int i281111 = ((~i10) & i) | (i10 & i85);
                int i281112 = -i281111;
                int i281113 = ((i281111 & i281112) | (i281111 ^ i281112)) >> 12;
                i13 = (i281113 & 58) ^ ((~i281113) & 1);
            } else {
                objArr3[1] = new int[1];
                objArr3[2] = new int[1];
                int i281114 = i ^ i10;
                int i281115 = -i281114;
                i13 = (((i281114 & i281115) | (i281114 ^ i281115)) >> 31) & 16;
            }
            ((int[]) objArr3[0])[0] = i;
            ((int[]) objArr3[2])[0] = i10;
            objArr3[3] = strArr10;
            int i281116 = (((~((-488691146) | i85)) | 404788672 | (~((-448380917) | i85))) * (-397)) + 903418554 + (((-127494718) | i) * 397);
            int i281117 = (i13 * 399) + (i281116 * 399);
            int i281118 = ~i13;
            int i281119 = ~(i281118 | i281116);
            int i291110 = ~i281116;
            int i291111 = ~((i291110 ^ i13) | (i291110 & i13));
            int i291112 = (i281119 & i291111) | (i281119 ^ i291111);
            int i291113 = ~i281116;
            int i291114 = -(-(((~((i & i291113) | (i291113 ^ i))) | i291112) * 398));
            int i291115 = (i281117 & i291114) + (i291114 | i281117);
            int i291116 = -(-(((i13 ^ i281116) | (i13 & i281116)) * (-1194)));
            int i291117 = (i291115 & i291116) + (i291116 | i291115);
            int i291118 = ~((i291110 ^ i85) | (i85 & i291110));
            int i291119 = ((i281110 | 113) << 1) - (i281110 ^ 113);
            f117a = i291119 % 128;
            int i301110 = i291119 % 2;
            int i301111 = ~(i281116 | i281118);
            int i301112 = (i301111 & i291118) | (i291118 ^ i301111);
            int i301113 = ~((i291113 ^ i13) | (i291113 & i13));
            int i301114 = -(-((i291117 - (~(398 * ((i301112 & i301113) | (i301112 ^ i301113))))) - 1));
            int i301115 = ((i2 | i301114) << 1) - (i2 ^ i301114);
            int i301116 = i301115 << 13;
            int i301117 = (i301116 & (~i301115)) | ((~i301116) & i301115);
            int i301118 = i301117 >>> 17;
            int i301119 = ((~i301117) & i301118) | ((~i301118) & i301117);
            int i316 = i301119 << 5;
            ((int[]) objArr3[1])[0] = (i301119 | i316) & (~(i301119 & i316));
            return objArr3;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        f117a = i2 % 128;
        int i3 = i2 % 2;
        seek.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = readShort.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
        int i4 = f117a + 89;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static String $$e(int i, int i2, byte b) {
        int i3 = 3 - (b * 2);
        int i4 = i * 2;
        int i5 = 115 - (i2 * 3);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 = (-i5) + i3;
            i7 = -1;
        }
        while (true) {
            int i8 = i3;
            int i9 = i5;
            int i10 = i7 + 1;
            bArr2[i10] = (byte) i9;
            if (i10 == i6) {
                return new String(bArr2, 0);
            }
            int i11 = i8 + 1;
            i3 = i11;
            i5 = (-bArr[i11]) + i9;
            i7 = i10;
        }
    }
}
