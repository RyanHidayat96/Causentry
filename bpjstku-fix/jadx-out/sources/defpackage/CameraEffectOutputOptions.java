package defpackage;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraEffectOutputOptions extends CameraControl<InputStream> {
    private static final byte[] $$c = {70, -114, 113, 8};
    private static final int $$f = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, -108, 100, 114, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 103;
    private static final byte[] $$a = {63, 56, -36, -117, 2, -10, 10};
    private static final int $$b = 33;
    private static int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f108a = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47467, 47476, 47519, 47399, 47465, 47463, 47470, 47459, 47472, 47471, 47474, 47457, 47432, 47469, 47462, 47473, 47468, 47458, 47431, 47427, 47456, 47425, 47516, 47461, 47429, 47464};
    private static int TuitionPaymentFragmentbindingInflater1 = 2047719701;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.CameraEffectOutputOptions.$$a
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r9 = r9 * 4
            int r9 = 111 - r9
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r8 = r8 + r3
            int r8 = r8 + (-1)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CameraEffectOutputOptions.c(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = 103 - r8
            int r9 = r9 * 52
            int r9 = r9 + 1
            byte[] r0 = defpackage.CameraEffectOutputOptions.$$d
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r7]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r7 = r7 + 1
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CameraEffectOutputOptions.d(int, short, short, java.lang.Object[]):void");
    }

    @Override // defpackage.CameraControl
    protected final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(InputStream inputStream) throws IOException {
        int i = 2 % 2;
        int i2 = f108a + 9;
        b = i2 % 128;
        InputStream inputStream2 = inputStream;
        if (i2 % 2 != 0) {
            inputStream2.close();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        inputStream2.close();
    }

    @Override // defpackage.CameraControl
    protected final /* synthetic */ InputStream b(AssetManager assetManager, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = b + 1;
        f108a = i2 % 128;
        int i3 = i2 % 2;
        InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(assetManager, str);
        int i4 = f108a + 57;
        b = i4 % 128;
        int i5 = i4 % 2;
        return inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public CameraEffectOutputOptions(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0609  */
    private static InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault2(AssetManager assetManager, String str) throws Throwable {
        int length;
        int i;
        String string;
        Method method;
        int i2 = 2;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            int i4 = b + 117;
            f108a = i4 % 128;
            if (i4 % 2 == 0) {
                length = str.length();
                int i5 = 32 / 0;
            } else {
                length = str.length();
            }
        } else {
            length = 0;
        }
        byte b2 = (byte) 0;
        byte b3 = b2;
        Object[] objArr = new Object[1];
        c(b2, b3, b3, objArr);
        Method[] methodArr = {AssetManager.class.getMethod((String) objArr[0], String.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2823;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 23;
            byte[] bArr = $$d;
            byte b4 = bArr[5];
            Object[] objArr2 = new Object[1];
            d(b4, bArr[10], b4, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, fadingEdgeLength, iLastIndexOf, 1814927978, false, (String) objArr2[0], null);
        }
        try {
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2823, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22)).getDeclaredMethods();
                int length2 = declaredMethods.length;
                int i6 = 0;
                while (i6 < length2) {
                    Method method2 = declaredMethods[i6];
                    int i7 = b + 97;
                    f108a = i7 % 128;
                    int i8 = i7 % i2;
                    try {
                        Object[] objArr3 = new Object[1];
                        e(null, null, Color.rgb(0, 0, 0) + 16777343, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        e(null, null, Color.argb(0, 0, 0, 0) + 127, new byte[]{-110, -120, -119, -111, -118, -111, -112, -113, -115, -116, -119, -121}, objArr4);
                        Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], null).invoke(method2, null)).intValue())};
                        Object[] objArr6 = new Object[1];
                        e(null, null, 127 - TextUtils.getCapsMode("", 0, 0), new byte[]{-120, -119, -111, -118, -111, -112, -113, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr6);
                        Class<?> cls2 = Class.forName((String) objArr6[0]);
                        Object[] objArr7 = new Object[1];
                        e(null, null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, new byte[]{-119, -125, -111, -116, -126, -109, -110, -111}, objArr7);
                        if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                            Class cls3 = Long.TYPE;
                            Object[] objArr8 = new Object[1];
                            e(null, null, 127 - View.MeasureSpec.getMode(0), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr8);
                            Class<?> cls4 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            e(null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new byte[]{-119, -104, -105, -106, -122, -120, -107, -116, -119, -108, -116, -119, -121}, objArr9);
                            if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                                int i9 = f108a + 101;
                                b = i9 % 128;
                                int i10 = i9 % 2;
                                Object[] objArr10 = new Object[1];
                                e(null, null, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr10);
                                Class<?> cls5 = Class.forName((String) objArr10[0]);
                                Object[] objArr11 = new Object[1];
                                e(null, null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, new byte[]{-110, -119, -104, -105, -106, -120, -119, -116, -119, -102, -126, -120, -126, -103, -116, -119, -121}, objArr11);
                                Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method2, null);
                                if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                    int i11 = b + 31;
                                    f108a = i11 % 128;
                                    int i12 = i11 % 2;
                                    Object[] objArr13 = new Object[1];
                                    e(null, null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr13);
                                    if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                        int i13 = b + 23;
                                        f108a = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2823;
                                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 23;
                                                byte[] bArr2 = $$d;
                                                byte b5 = bArr2[5];
                                                Object[] objArr14 = new Object[1];
                                                d(b5, bArr2[10], b5, objArr14);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, absoluteGravity, iIndexOf, 1814927978, false, (String) objArr14[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cResolveSize = (char) View.resolveSize(0, 0);
                                                int i14 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2822;
                                                int iMyTid = (Process.myTid() >> 22) + 22;
                                                byte[] bArr3 = $$d;
                                                byte b6 = bArr3[5];
                                                Object[] objArr15 = new Object[1];
                                                d(b6, bArr3[10], b6, objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, i14, iMyTid, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2823;
                                                int offsetBefore = 22 - TextUtils.getOffsetBefore("", 0);
                                                byte b7 = $$d[7];
                                                byte b8 = b7;
                                                Object[] objArr17 = new Object[1];
                                                d(b7, b8, b8, objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, offsetAfter, offsetBefore, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
                                            break;
                                        }
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                                            int iMyTid2 = 2823 - (Process.myTid() >> 22);
                                            int i15 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            byte[] bArr4 = $$d;
                                            byte b9 = bArr4[5];
                                            Object[] objArr18 = new Object[1];
                                            d(b9, bArr4[10], b9, objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, iMyTid2, i15, 1814927978, false, (String) objArr18[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                            int gidForName = 2822 - Process.getGidForName("");
                                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22;
                                            byte[] bArr5 = $$d;
                                            byte b10 = bArr5[5];
                                            Object[] objArr19 = new Object[1];
                                            d(b10, bArr5[10], b10, objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, gidForName, scrollDefaultDelay, 1814927978, false, (String) objArr19[0], null);
                                        }
                                        Object[] objArr20 = {1L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                            char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int i16 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
                                            int threadPriority = 22 - ((Process.getThreadPriority(0) + 20) >> 6);
                                            byte b11 = $$d[7];
                                            byte b12 = b11;
                                            Object[] objArr21 = new Object[1];
                                            d(b11, b12, b12, objArr21);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, i16, threadPriority, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr20)).longValue();
                                        break;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i6++;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int mirror = AndroidCharacter.getMirror('0') + 2775;
                int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22;
                byte[] bArr6 = $$d;
                byte b13 = bArr6[5];
                Object[] objArr22 = new Object[1];
                d(b13, bArr6[10], b13, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyPid, mirror, scrollDefaultDelay2, 1814927978, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int iBlue = 2823 - Color.blue(0);
                int bitsPerPixel2 = 21 - ImageFormat.getBitsPerPixel(0);
                byte b14 = $$d[7];
                byte b15 = b14;
                Object[] objArr24 = new Object[1];
                d(b15, (byte) (b15 + 5), b14, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(longPressTimeout, iBlue, bitsPerPixel2, 1025296417, false, (String) objArr24[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr23);
            Object[] objArr25 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 37658);
                int keyRepeatDelay = 2720 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iMyTid3 = 19 - (Process.myTid() >> 22);
                byte b16 = $$d[7];
                byte b17 = b16;
                Object[] objArr26 = new Object[1];
                d(b17, (byte) (b17 + 5), b16, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf, keyRepeatDelay, iMyTid3, -1568796068, false, (String) objArr26[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr25)).longValue();
            long j = -245112350;
            long j2 = (((long) 784) * j) + (((long) (-782)) * jLongValue);
            long j3 = -783;
            int i17 = length;
            long j4 = -1;
            long j5 = j ^ j4;
            long jNextInt = ((long) new Random().nextInt(1126114307)) ^ j4;
            long j6 = j2 + ((jLongValue ^ j4) * j3) + (j3 * (((j5 | jNextInt) | jLongValue) ^ j4)) + (((long) 783) * ((j4 ^ (jNextInt | jLongValue)) | j5)) + ((long) (-1565293495));
            int i18 = ~((int) Runtime.getRuntime().totalMemory());
            int i19 = ((int) (j6 >> 32)) & ((((-1019427974) + (((~(i18 | (-278937633))) | (~((-84410885) | i18))) * (-184))) + (((536938947 | (~((-621349832) | i18))) | (~((-815876580) | i18))) * 184)) - 1850831352);
            int iMyTid4 = Process.myTid();
            int i20 = i19 | (((int) j6) & ((-977340223) + (((~((-479480386) | iMyTid4)) | 957746024) * (-668)) + (((-479480386) | (~(957746024 | iMyTid4))) * 1336) + ((iMyTid4 | (-75513858)) * 668)));
            int i21 = i20 >>> 24;
            int i22 = i20 & ViewCompat.MEASURED_SIZE_MASK;
            if (i21 != 0) {
                int i23 = f108a + 65;
                int i24 = i23 % 128;
                b = i24;
                int i25 = i23 % 2;
                int i26 = i24 + 63;
                f108a = i26 % 128;
                if (i26 % 2 == 0) {
                    int i27 = 4 % 2;
                }
                i = 1;
            } else {
                i = 0;
            }
            if (i != 0) {
                int i28 = b + 97;
                f108a = i28 % 128;
                int i29 = i28 % 2;
                if (i22 >= 1 || (method = methodArr[i22]) == null) {
                    string = null;
                } else {
                    string = method.toString();
                }
            } else {
                string = null;
            }
            arrayList.add(string);
            if ((i21 + 6) * i == 0) {
                return assetManager.open(str);
            }
            throw new RuntimeException(String.valueOf(i17));
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final Class<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f108a + 9;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        f108a = i5 % 128;
        int i6 = i5 % 2;
        return InputStream.class;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = $10 + 93;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.red(0) + 31339), 2994 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), 17 - View.getDefaultSize(0, 0), 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
                    f = 0.0f;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43326 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 253 - Color.blue(0), (Process.myTid() >> 22) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i6 = 1687675375;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i7 = $10 + 111;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33603), 3085 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i6 = 1687675375;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getMode(0) + 33602), 3085 - View.MeasureSpec.getSize(0), 26 - (ViewConfiguration.getPressedStateDuration() >> 16), -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
        int i9 = $10 + 115;
        $11 = i9 % 128;
        int i10 = i9 % 2;
    }

    private static String $$g(byte b2, byte b3, byte b4) {
        int i = b4 * 4;
        byte[] bArr = $$c;
        int i2 = b2 + 67;
        int i3 = 3 - (b3 * 2);
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i2 += i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            i3++;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i3];
        }
    }
}
