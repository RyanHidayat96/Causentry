package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
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
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import at.favre.lib.armadillo.AuthenticatedEncryptionException;
import at.favre.lib.bytes.Bytes;
import at.favre.lib.bytes.MutableBytes;
import com.bpjstku.presentation.danasiaga.DanaSiagaConcentActivity;
import com.google.android.material.transition.platform.SlideDistanceProvider;
import com.google.mlkit.common.sdkinternal.CloseGuard;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaBrowserCompatItemCallback implements MediaBrowserCompatMediaBrowserImplApi21 {
    private final Provider TuitionPaymentFragmentbindingInflater1;
    private ThreadLocal<Cipher> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final SecureRandom TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {25, 5, -88, -44};
    private static final int $$f = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {89, 92, -72, 43, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$e = 82;
    private static final byte[] $$a = {5, 11, -122, -94, 1, 31, -11, 33, -64, 63, 25, 17, 1, 14, 5, -55, 31, 48, 17, 2, 7, 23, 8, 25, -33, 47, 15, 11, -9, 23, -1, 12};
    private static final int $$b = 11;
    private static int cancelAll = 0;
    private static int onTransact = 1;
    private static char[] b = {47407, 47416, 47395, 47339, 47405, 47403, 47410, 47399, 47412, 47411, 47414, 47397, 47372, 47409, 47402, 47413, 47408, 47398, 47371, 47401, 47404, 47384, 47376, 47336, 47415, 47396};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719641;
    private static boolean d = true;
    private static boolean asInterface = true;
    private static long asBinder = -6377398940819159759L;
    private static int g = -981105359;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f166a = 51060;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.MediaBrowserCompatItemCallback.$$a
            int r6 = r6 + 4
            int r5 = r5 * 3
            int r5 = 106 - r5
            int r7 = r7 * 8
            int r1 = r7 + 11
            byte[] r1 = new byte[r1]
            int r7 = r7 + 10
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r5
            r5 = r7
            r3 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2b:
            int r5 = r5 + r4
            int r5 = r5 + (-10)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaBrowserCompatItemCallback.c(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.MediaBrowserCompatItemCallback.$$d
            int r7 = r7 + 4
            int r1 = r5 + 1
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r6
            r3 = r2
            r6 = r5
            goto L25
        L11:
            r3 = r2
        L12:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r7]
        L25:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaBrowserCompatItemCallback.e(int, int, byte, java.lang.Object[]):void");
    }

    public MediaBrowserCompatItemCallback() {
        this(new SecureRandom(), null);
    }

    public MediaBrowserCompatItemCallback(SecureRandom secureRandom, Provider provider) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ThreadLocal<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = secureRandom;
        this.TuitionPaymentFragmentbindingInflater1 = provider;
    }

    private static void h(char[] cArr, char[] cArr2, char c, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $10 + 3;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char defaultSize = (char) (View.getDefaultSize(0, 0) + 8328);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1235;
                    int iResolveOpacity = 35 - Drawable.resolveOpacity(0, 0);
                    byte b2 = (byte) ($$f - i2);
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iKeyCodeFromString, iResolveOpacity, -653973969, false, $$g(b2, b3, (byte) (b3 | 35)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int trimmedLength = 2764 - TextUtils.getTrimmedLength("");
                    int iIndexOf = TextUtils.indexOf("", "") + 14;
                    byte b4 = (byte) ($$f - 2);
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, trimmedLength, iIndexOf, 1504416861, false, $$g(b4, b5, (byte) (b5 | 37)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43324), (Process.myPid() >> 22) + 253, Process.getGidForName("") + 23, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 65200);
                    int i6 = 2890 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int absoluteGravity = 17 - Gravity.getAbsoluteGravity(0, 0);
                    byte b6 = (byte) ($$f - 2);
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i6, absoluteGravity, 2012627446, false, $$g(b6, b7, (byte) (b7 | 36)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (asBinder ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) g) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) f166a) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i7 = $10 + 73;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i9 = $11 + 119;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 68 / 0;
        }
    }

    private static void f(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = b;
        float f = 0.0f;
        char c = '0';
        int i3 = 0;
        if (cArr3 != null) {
            int i4 = $10 + 43;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr3[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) ((TypedValue.complexToFloat(i3) > f ? 1 : (TypedValue.complexToFloat(i3) == f ? 0 : -1)) + 31339);
                        int iLastIndexOf = TextUtils.lastIndexOf("", c, i3) + 2995;
                        int iBlue = 17 - Color.blue(i3);
                        byte b2 = (byte) ($$f - 2);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iLastIndexOf, iBlue, 1182129903, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    f = 0.0f;
                    c = '0';
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43325), 252 - TextUtils.lastIndexOf("", '0'), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        if (asInterface) {
            int i7 = $10 + 97;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i9 = $10 + 53;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char jumpTapTimeout = (char) (33602 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int i11 = 3085 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iRed = 26 - Color.red(0);
                    byte b4 = (byte) ($$f - 2);
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, i11, iRed, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            int i12 = $10 + 81;
            $11 = i12 % 128;
            if (i12 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (d) {
            int i13 = $10 + 125;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                try {
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 33602);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 3085;
                        int size = 26 - View.MeasureSpec.getSize(0);
                        byte b6 = (byte) ($$f - 2);
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, offsetBefore, size, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i14 = $11 + 3;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr2);
            return;
        }
        int i16 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i16 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0168  */
    /* JADX WARN: Code duplicated, block: B:58:0x0172  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f  */
    /* JADX WARN: Code duplicated, block: B:64:0x018c  */
    /* JADX WARN: Code duplicated, block: B:65:0x018f  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a3  */
    @Override // defpackage.MediaBrowserCompatMediaBrowserImplApi21
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        byte[] bArr4;
        Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        MutableBytes mutableBytes;
        SecureRandom secureRandom;
        Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        MutableBytes mutableBytes2;
        SecureRandom secureRandom2;
        MutableBytes mutableBytes3;
        int i = 2 % 2;
        int i2 = onTransact + 11;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0 ? bArr.length < 16 : bArr.length < 23) {
            throw new IllegalArgumentException("key length must be longer than 16 bytes");
        }
        byte[] bArrDoFinal = null;
        try {
            byte[] bArr5 = new byte[12];
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.nextBytes(bArr5);
                Cipher cipherTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
                if (DanaSiagaConcentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(new ArrayList()) != 0) {
                    int i3 = cancelAll + 119;
                    onTransact = i3 % 128;
                    if (i3 % 2 == 0) {
                        int[] iArr = new int[iIntValue];
                        iArr[iIntValue - 1] = 0;
                        Toast.makeText((Context) null, iArr[((iIntValue - iIntValue) >>> 3) + 1], 0).show();
                    } else {
                        int[] iArr2 = new int[iIntValue];
                        int i4 = iIntValue - 1;
                        iArr2[i4] = 1;
                        Toast.makeText((Context) null, iArr2[((iIntValue * i4) % 2) - 1], 1).show();
                    }
                }
                cipherTuitionPaymentFragmentspecialinlinedviewModeldefault1.init(1, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, bArr5));
                if (bArr3 != null) {
                    int i5 = onTransact + 23;
                    cancelAll = i5 % 128;
                    int i6 = i5 % 2;
                    cipherTuitionPaymentFragmentspecialinlinedviewModeldefault1.updateAAD(bArr3);
                }
                int iIntValue2 = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
                if (SlideDistanceProvider.TuitionPaymentFragmentbindingInflater1(new ArrayList()) != 0) {
                    throw new RuntimeException(String.valueOf(iIntValue2));
                }
                bArrDoFinal = cipherTuitionPaymentFragmentspecialinlinedviewModeldefault1.doFinal(bArr2);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrDoFinal.length + 13);
                byteBufferAllocate.put((byte) 12);
                byteBufferAllocate.put(bArr5);
                byteBufferAllocate.put(bArrDoFinal);
                byte[] bArrArray = byteBufferAllocate.array();
                Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr5);
                if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4 instanceof MutableBytes) {
                    mutableBytes3 = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i7 = onTransact + 33;
                    cancelAll = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    mutableBytes3 = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault4.byteOrder);
                }
                SecureRandom secureRandom3 = new SecureRandom();
                if (mutableBytes3.byteArray.length > 0) {
                    secureRandom3.nextBytes(mutableBytes3.byteArray);
                }
                Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArrDoFinal);
                MutableBytes mutableBytes4 = bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5 instanceof MutableBytes ? (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5 : new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault5.byteOrder);
                SecureRandom secureRandom4 = new SecureRandom();
                if (mutableBytes4.byteArray.length > 0) {
                    secureRandom4.nextBytes(mutableBytes4.byteArray);
                }
                return bArrArray;
            } catch (Exception e2) {
                e = e2;
                bArr4 = bArrDoFinal;
                bArrDoFinal = bArr5;
                try {
                    throw new AuthenticatedEncryptionException("could not encrypt", e);
                } catch (Throwable th) {
                    th = th;
                    bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArrDoFinal);
                    if (!(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof MutableBytes)) {
                        mutableBytes = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteOrder);
                    } else {
                        mutableBytes = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    }
                    secureRandom = new SecureRandom();
                    if (mutableBytes.byteArray.length > 0) {
                        secureRandom.nextBytes(mutableBytes.byteArray);
                    }
                    bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr4);
                    if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof MutableBytes) {
                        mutableBytes2 = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    } else {
                        mutableBytes2 = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteOrder);
                    }
                    secureRandom2 = new SecureRandom();
                    if (mutableBytes2.byteArray.length > 0) {
                        secureRandom2.nextBytes(mutableBytes2.byteArray);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bArr4 = bArrDoFinal;
                bArrDoFinal = bArr5;
                bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArrDoFinal);
                if (!(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof MutableBytes)) {
                    mutableBytes = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteOrder);
                } else {
                    mutableBytes = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                secureRandom = new SecureRandom();
                if (mutableBytes.byteArray.length > 0) {
                    secureRandom.nextBytes(mutableBytes.byteArray);
                }
                bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr4);
                if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof MutableBytes) {
                    mutableBytes2 = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    mutableBytes2 = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteOrder);
                }
                secureRandom2 = new SecureRandom();
                if (mutableBytes2.byteArray.length > 0) {
                    secureRandom2.nextBytes(mutableBytes2.byteArray);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            bArr4 = null;
        } catch (Throwable th3) {
            th = th3;
            bArr4 = null;
        }
    }

    @Override // defpackage.MediaBrowserCompatMediaBrowserImplApi21
    public final byte[] TuitionPaymentFragmentbindingInflater1(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        int i = 2 % 2;
        if (isPinchToZoomEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1((List) new ArrayList()) != 0) {
            throw null;
        }
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        if (onActionModeFinished.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ArrayList()) != 0) {
            int[] iArr = new int[iIntValue];
            int i2 = iIntValue - 1;
            iArr[i2] = 1;
            Toast.makeText((Context) null, iArr[((iIntValue * i2) % 2) - 1], 1).show();
        }
        try {
            byte b2 = bArr2[0];
            if (b2 != 12 && b2 != 16) {
                throw new IllegalStateException("Unexpected iv length");
            }
            Cipher cipherTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            cipherTuitionPaymentFragmentspecialinlinedviewModeldefault1.init(2, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, bArr2, 1, b2));
            if (bArr3 != null) {
                int i3 = cancelAll + 43;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                cipherTuitionPaymentFragmentspecialinlinedviewModeldefault1.updateAAD(bArr3);
            }
            int i5 = b2 + 1;
            byte[] bArrDoFinal = cipherTuitionPaymentFragmentspecialinlinedviewModeldefault1.doFinal(bArr2, i5, bArr2.length - i5);
            int i6 = onTransact + 19;
            cancelAll = i6 % 128;
            int i7 = i6 % 2;
            return bArrDoFinal;
        } catch (Exception e2) {
            throw new AuthenticatedEncryptionException("could not decrypt", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x02f9 A[Catch: Exception -> 0x060b, TryCatch #2 {Exception -> 0x060b, blocks: (B:6:0x0037, B:8:0x003b, B:9:0x0043, B:11:0x00ac, B:12:0x00e2, B:15:0x00f0, B:18:0x011d, B:22:0x01d9, B:24:0x0239, B:28:0x02a3, B:33:0x02b2, B:39:0x02ca, B:41:0x02f0, B:43:0x02f9, B:44:0x0336, B:46:0x0345, B:47:0x037c, B:55:0x03f6, B:57:0x03fc, B:58:0x03fd, B:36:0x02bd, B:59:0x03fe, B:61:0x040a, B:63:0x0410, B:64:0x0411, B:65:0x0412, B:67:0x041b, B:68:0x0450, B:80:0x0519, B:104:0x05ef, B:105:0x05f4, B:109:0x05fa, B:111:0x0600, B:112:0x0601, B:114:0x0603, B:116:0x0609, B:117:0x060a, B:69:0x0457, B:71:0x0464, B:72:0x049f, B:49:0x0384, B:51:0x039a, B:52:0x03de, B:74:0x04a6, B:76:0x04bd, B:78:0x0508, B:19:0x011f, B:23:0x01db, B:27:0x0241), top: B:128:0x0037, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0345 A[Catch: Exception -> 0x060b, TryCatch #2 {Exception -> 0x060b, blocks: (B:6:0x0037, B:8:0x003b, B:9:0x0043, B:11:0x00ac, B:12:0x00e2, B:15:0x00f0, B:18:0x011d, B:22:0x01d9, B:24:0x0239, B:28:0x02a3, B:33:0x02b2, B:39:0x02ca, B:41:0x02f0, B:43:0x02f9, B:44:0x0336, B:46:0x0345, B:47:0x037c, B:55:0x03f6, B:57:0x03fc, B:58:0x03fd, B:36:0x02bd, B:59:0x03fe, B:61:0x040a, B:63:0x0410, B:64:0x0411, B:65:0x0412, B:67:0x041b, B:68:0x0450, B:80:0x0519, B:104:0x05ef, B:105:0x05f4, B:109:0x05fa, B:111:0x0600, B:112:0x0601, B:114:0x0603, B:116:0x0609, B:117:0x060a, B:69:0x0457, B:71:0x0464, B:72:0x049f, B:49:0x0384, B:51:0x039a, B:52:0x03de, B:74:0x04a6, B:76:0x04bd, B:78:0x0508, B:19:0x011f, B:23:0x01db, B:27:0x0241), top: B:128:0x0037, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x039a A[Catch: all -> 0x03f5, TryCatch #1 {all -> 0x03f5, blocks: (B:49:0x0384, B:51:0x039a, B:52:0x03de), top: B:126:0x0384, outer: #2 }] */
    private Cipher TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        int i;
        int i2;
        Cipher cipher;
        Method method;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        MediaBrowserCompatItemCallback mediaBrowserCompatItemCallback = this;
        int i3 = 2 % 2;
        char[] cArr = null;
        if (CloseGuard.Factory.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
            throw null;
        }
        Cipher cipher2 = mediaBrowserCompatItemCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get();
        if (cipher2 != null) {
            return cipher2;
        }
        try {
            Provider provider = mediaBrowserCompatItemCallback.TuitionPaymentFragmentbindingInflater1;
            if (provider != null) {
                cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
            } else {
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                byte[] bArr = $$a;
                byte b2 = bArr[4];
                Object[] objArr2 = new Object[1];
                c((byte) (b2 - 1), bArr[30], b2, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b3 = bArr[4];
                Object[] objArr3 = new Object[1];
                c(b3, bArr[11], (byte) (b3 - 1), objArr3);
                Method[] methodArr = {cls.getMethod((String) objArr3[0], String.class)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int iArgb = 2823 - Color.argb(0, 0, 0, 0);
                    int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21;
                    byte[] bArr2 = $$d;
                    Object[] objArr4 = new Object[1];
                    e((byte) 52, bArr2[7], bArr2[5], objArr4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, iArgb, i5, 1814927978, false, (String) objArr4[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
                    Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 2824 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 21 - ((byte) KeyEvent.getModifierMetaStateMask()))).getDeclaredMethods();
                    int length = declaredMethods.length;
                    int i6 = cancelAll + 99;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 0;
                    while (i8 < length) {
                        Method method2 = declaredMethods[i8];
                        try {
                            Object[] objArr5 = new Object[1];
                            f(cArr, cArr, 127 - Gravity.getAbsoluteGravity(i4, i4), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr5);
                            Class<?> cls2 = Class.forName((String) objArr5[i4]);
                            Object[] objArr6 = new Object[1];
                            h(new char[]{46308, 62411, 33233, 33669, 55923, 55580, 10694, 11860, 40475, 11291, 38495, 25381}, new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{15273, 62059, 65338, 9124}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr6);
                            Object[] objArr7 = new Object[1];
                            objArr7[i4] = Integer.valueOf(((Integer) cls2.getMethod((String) objArr6[i4], null).invoke(method2, null)).intValue());
                            Object[] objArr8 = new Object[1];
                            f(null, null, ExpandableListView.getPackedPositionChild(0L) + 128, new byte[]{-120, -119, -111, -118, -111, -112, -113, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr8);
                            Class<?> cls3 = Class.forName((String) objArr8[i4]);
                            Object[] objArr9 = new Object[1];
                            f(null, null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, new byte[]{-119, -125, -111, -116, -126, -109, -110, -111}, objArr9);
                            String str = (String) objArr9[i4];
                            Class<?>[] clsArr = new Class[1];
                            clsArr[i4] = Integer.TYPE;
                            if (((Boolean) cls3.getMethod(str, clsArr).invoke(null, objArr7)).booleanValue()) {
                                int i9 = cancelAll + 17;
                                onTransact = i9 % 128;
                                int i10 = i9 % 2;
                                Class cls4 = Long.TYPE;
                                Object[] objArr10 = new Object[1];
                                f(null, null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr10);
                                Class<?> cls5 = Class.forName((String) objArr10[i4]);
                                Object[] objArr11 = new Object[1];
                                h(new char[]{21711, 35530, 35626, 3576, 15580, 60067, 11704, 38051, 52647, 60562, 37980, 13365, 28298}, new char[]{0, 0, 0, 0}, (char) (23217 - Color.red(i4)), new char[]{21033, 32192, 45320, 13146}, 142458961 - TextUtils.lastIndexOf("", '0'), objArr11);
                                if (cls4.equals(cls5.getMethod((String) objArr11[0], null).invoke(method2, null))) {
                                    Object[] objArr12 = new Object[1];
                                    f(null, null, ExpandableListView.getPackedPositionGroup(0L) + 127, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr12);
                                    Class<?> cls6 = Class.forName((String) objArr12[0]);
                                    Object[] objArr13 = new Object[1];
                                    h(new char[]{53884, 50095, 8403, 12565, 41684, 27514, 17980, 61666, 65245, 59286, 49228, 46285, 37702, 25699, 54041, 1154, 52689}, new char[]{0, 0, 0, 0}, (char) (13276 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), new char[]{4950, 47835, 56502, 17971}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 1229268204, objArr13);
                                    Object[] objArr14 = (Object[]) cls6.getMethod((String) objArr13[0], null).invoke(method2, null);
                                    if (objArr14.length == 2) {
                                        int i11 = cancelAll + 65;
                                        onTransact = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            if (Long.TYPE.equals(objArr14[1])) {
                                                objArr = new Object[1];
                                                f(null, null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr);
                                                if (Class.forName((String) objArr[0]).equals(objArr14[1])) {
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2823;
                                                        int gidForName = Process.getGidForName("") + 23;
                                                        byte[] bArr3 = $$d;
                                                        Object[] objArr15 = new Object[1];
                                                        e((byte) 52, bArr3[7], bArr3[5], objArr15);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, keyRepeatTimeout, gidForName, 1814927978, false, (String) objArr15[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                                                        int iRed = Color.red(0) + 2823;
                                                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 22;
                                                        byte[] bArr4 = $$d;
                                                        Object[] objArr16 = new Object[1];
                                                        e((byte) 52, bArr4[7], bArr4[5], objArr16);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, iRed, packedPositionType, 1814927978, false, (String) objArr16[0], null);
                                                    }
                                                    try {
                                                        Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                            char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2823;
                                                            int i12 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                                                            byte[] bArr5 = $$d;
                                                            byte b4 = bArr5[7];
                                                            byte b5 = bArr5[54];
                                                            Object[] objArr18 = new Object[1];
                                                            e(b4, b5, (byte) (b5 | 32), objArr18);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iCombineMeasuredStates, i12, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                                        }
                                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr17)).longValue();
                                                        int i13 = cancelAll + 45;
                                                        onTransact = i13 % 128;
                                                        int i14 = i13 % 2;
                                                        break;
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                throw new IllegalStateException("could not get cipher instance", e);
                                            }
                                            continue;
                                        } else if (Long.TYPE.equals(objArr14[0])) {
                                            objArr = new Object[1];
                                            f(null, null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr);
                                            if (Class.forName((String) objArr[0]).equals(objArr14[1])) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2823;
                                                    int gidForName2 = Process.getGidForName("") + 23;
                                                    byte[] bArr6 = $$d;
                                                    Object[] objArr19 = new Object[1];
                                                    e((byte) 52, bArr6[7], bArr6[5], objArr19);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop2, keyRepeatTimeout2, gidForName2, 1814927978, false, (String) objArr19[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cAxisFromString2 = (char) ((-1) - MotionEvent.axisFromString(""));
                                                    int iRed2 = Color.red(0) + 2823;
                                                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 22;
                                                    byte[] bArr7 = $$d;
                                                    Object[] objArr110 = new Object[1];
                                                    e((byte) 52, bArr7[7], bArr7[5], objArr110);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString2, iRed2, packedPositionType2, 1814927978, false, (String) objArr110[0], null);
                                                }
                                                Object[] objArr111 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                                    int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 2823;
                                                    int i15 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                                                    byte[] bArr8 = $$d;
                                                    byte b6 = bArr8[7];
                                                    byte b7 = bArr8[54];
                                                    Object[] objArr112 = new Object[1];
                                                    e(b6, b7, (byte) (b7 | 32), objArr112);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iCombineMeasuredStates2, i15, -2137287382, false, (String) objArr112[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr111)).longValue();
                                                int i16 = cancelAll + 45;
                                                onTransact = i16 % 128;
                                                int i17 = i16 % 2;
                                                break;
                                            }
                                            throw new IllegalStateException("could not get cipher instance", e);
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i8++;
                            cArr = null;
                            i4 = 0;
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
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int mode = 2823 - View.MeasureSpec.getMode(0);
                    int maximumFlingVelocity = 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte[] bArr9 = $$d;
                    Object[] objArr20 = new Object[1];
                    e((byte) 52, bArr9[7], bArr9[5], objArr20);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, mode, maximumFlingVelocity, 1814927978, false, (String) objArr20[0], null);
                }
                try {
                    Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2824;
                        int bitsPerPixel = 21 - ImageFormat.getBitsPerPixel(0);
                        byte b8 = $$d[7];
                        Object[] objArr22 = new Object[1];
                        e(b8, (byte) (b8 | 14), (byte) 51, objArr22);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, iLastIndexOf, bitsPerPixel, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
                    try {
                        Object[] objArr23 = {0, methodArr, null};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 37657);
                            int iResolveOpacity = 2720 - Drawable.resolveOpacity(0, 0);
                            int packedPositionGroup = 19 - ExpandableListView.getPackedPositionGroup(0L);
                            byte b9 = $$d[7];
                            Object[] objArr24 = new Object[1];
                            e(b9, (byte) (b9 | 14), (byte) 51, objArr24);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(edgeSlop, iResolveOpacity, packedPositionGroup, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
                        long j = -1599489871;
                        long j2 = (((long) (-244)) * j) + (((long) 246) * jLongValue);
                        long j3 = -245;
                        long j4 = -1;
                        long j5 = jLongValue ^ j4;
                        long jIdentityHashCode = System.identityHashCode(this);
                        long j6 = j2 + ((((j5 | (jIdentityHashCode ^ j4)) ^ j4) | ((j5 | j) ^ j4)) * j3);
                        long j7 = (jIdentityHashCode | j5) ^ j4;
                        long j8 = j6 + (j3 * j7) + (((long) 245) * (j7 | j)) + ((long) (-210915974));
                        int i18 = (int) (j8 >> 32);
                        try {
                            int iUptimeMillis = (int) SystemClock.uptimeMillis();
                            int i19 = i18 & ((-1320242614) + (((~((-1813060801) | iUptimeMillis)) | 1745950912) * 1504) + ((~(iUptimeMillis | (-67109889))) * (-1504)) + 1072315232);
                            int i20 = (int) j8;
                            int iIdentityHashCode = System.identityHashCode(this);
                            int i21 = i19 | (i20 & ((-501357939) + (((~((-1885360135) | iIdentityHashCode)) | 811618310) * 336) + (((~(972380751 | iIdentityHashCode)) | (-2046122576)) * (-168)) + (((~((~iIdentityHashCode) | 972380751)) | (-1885360135)) * 168)));
                            int i22 = i21 >>> 24;
                            int i23 = i21 & ViewCompat.MEASURED_SIZE_MASK;
                            int i24 = i22 != 0 ? 1 : 0;
                            if (i24 != 0) {
                                int i25 = onTransact + 11;
                                int i26 = i25 % 128;
                                cancelAll = i26;
                                int i27 = i25 % 2;
                                int i28 = i26 + 117;
                                onTransact = i28 % 128;
                                int i29 = i28 % 2;
                                i = 1;
                                i2 = 1;
                            } else {
                                i = 1;
                                i2 = 0;
                            }
                            arrayList.add((i24 == i && i23 < i && (method = methodArr[i23]) != null) ? method.toString() : null);
                            if ((i22 + 6) * i2 != 0) {
                                throw new NullPointerException();
                            }
                            cipher = Cipher.getInstance("AES/GCM/NoPadding");
                            mediaBrowserCompatItemCallback = this;
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }
            mediaBrowserCompatItemCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(cipher);
            return mediaBrowserCompatItemCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get();
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // defpackage.MediaBrowserCompatMediaBrowserImplApi21
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 67;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        if (i == 0) {
            return 16;
        }
        int i6 = i3 + 69;
        cancelAll = i6 % 128;
        int i7 = i6 % 2;
        return 32;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0701  */
    /* JADX WARN: Code duplicated, block: B:103:0x0704  */
    /* JADX WARN: Code duplicated, block: B:16:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x035a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0360  */
    /* JADX WARN: Code duplicated, block: B:47:0x0369 A[Catch: Exception -> 0x06dc, TRY_LEAVE, TryCatch #1 {Exception -> 0x06dc, blocks: (B:45:0x0363, B:47:0x0369, B:54:0x0402, B:62:0x047d, B:63:0x0486, B:71:0x0557, B:73:0x05be, B:75:0x05c4, B:76:0x05c5, B:64:0x0489, B:77:0x05c6, B:79:0x05e7, B:85:0x0647, B:91:0x06be, B:95:0x06d4, B:97:0x06da, B:98:0x06db, B:87:0x0666, B:89:0x0673, B:90:0x06b7, B:66:0x04aa, B:68:0x04b7, B:69:0x04fe), top: B:115:0x0363, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x03af  */
    /* JADX WARN: Code duplicated, block: B:52:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x041f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0429  */
    /* JADX WARN: Code duplicated, block: B:61:0x0464  */
    /* JADX WARN: Code duplicated, block: B:64:0x0489 A[Catch: Exception -> 0x06dc, TRY_LEAVE, TryCatch #1 {Exception -> 0x06dc, blocks: (B:45:0x0363, B:47:0x0369, B:54:0x0402, B:62:0x047d, B:63:0x0486, B:71:0x0557, B:73:0x05be, B:75:0x05c4, B:76:0x05c5, B:64:0x0489, B:77:0x05c6, B:79:0x05e7, B:85:0x0647, B:91:0x06be, B:95:0x06d4, B:97:0x06da, B:98:0x06db, B:87:0x0666, B:89:0x0673, B:90:0x06b7, B:66:0x04aa, B:68:0x04b7, B:69:0x04fe), top: B:115:0x0363, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x04b7 A[Catch: all -> 0x05bd, TryCatch #4 {all -> 0x05bd, blocks: (B:66:0x04aa, B:68:0x04b7, B:69:0x04fe), top: B:120:0x04aa, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x05c6 A[Catch: Exception -> 0x06dc, TRY_LEAVE, TryCatch #1 {Exception -> 0x06dc, blocks: (B:45:0x0363, B:47:0x0369, B:54:0x0402, B:62:0x047d, B:63:0x0486, B:71:0x0557, B:73:0x05be, B:75:0x05c4, B:76:0x05c5, B:64:0x0489, B:77:0x05c6, B:79:0x05e7, B:85:0x0647, B:91:0x06be, B:95:0x06d4, B:97:0x06da, B:98:0x06db, B:87:0x0666, B:89:0x0673, B:90:0x06b7, B:66:0x04aa, B:68:0x04b7, B:69:0x04fe), top: B:115:0x0363, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x060d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0617  */
    /* JADX WARN: Code duplicated, block: B:89:0x0673 A[Catch: all -> 0x06d3, TryCatch #0 {all -> 0x06d3, blocks: (B:87:0x0666, B:89:0x0673, B:90:0x06b7), top: B:113:0x0666, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code duplicated, block: B:93:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:99:0x06dc  */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str;
        int i9;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i10;
        int i11;
        int i12;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char[] cArr;
        char[] cArr2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        char c;
        char[] cArr3;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i29 = 2 % 2;
        int i30 = cancelAll + 53;
        int i31 = i30 % 128;
        onTransact = i31;
        if (i30 % 2 == 0) {
            int i32 = 9 / 0;
            if (context != null) {
                int i33 = i31 + 45;
                cancelAll = i33 % 128;
                int i34 = i33 % 2;
                try {
                    Object[] objArr2 = new Object[1];
                    h(new char[]{55668, 31524, 30444, 3046, 54822, 54768, 5285, 15238, 34196, 52600, 31310, 52270, 50248, 48692, 3650, 23706, 17603, 47332, 16491, 5411, 53836, 54845, 58651}, new char[]{0, 0, 0, 0}, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), new char[]{31703, 41997, 14610, 58300}, 312741242 - (~(-(-View.getDefaultSize(0, 0)))), objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    int i35 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i36 = i35 * (-813);
                    int i37 = ((i36 | 14292240) << 1) - (i36 ^ 14292240);
                    int i38 = ~((-35031) | i35);
                    int i39 = ~((i35 ^ i) | (i35 & i));
                    int i40 = (i38 | i39) * (-814);
                    int i41 = (i37 ^ i40) + ((i37 & i40) << 1);
                    int i42 = ~i;
                    int i43 = ~(((-35031) ^ i42) | ((-35031) & i42));
                    int i44 = ~i35;
                    int i45 = (~((i44 ^ 35030) | (i44 & 35030))) | i43;
                    int i46 = i41 + (((i39 & i45) | (i45 ^ i39)) * 407);
                    int i47 = ~((i44 ^ 35030) | (i44 & 35030));
                    int i48 = ~((i44 & i) | (i44 ^ i));
                    int i49 = (i47 & i48) | (i47 ^ i48);
                    int i50 = ~(i | 35030);
                    int i51 = i49 ^ i50;
                    int i52 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i53 = ~i;
                    int i54 = ((i52 * 960) - 1917) + (((~(((-2) ^ i53) | ((-2) & i53))) | (~(i52 | i))) * 959);
                    int i55 = ((((i54 | 1918) << 1) - (i54 ^ 1918)) - (~(-(-(((~((i52 & i42) | (i42 ^ i52))) | (~(((-2) ^ i) | ((-2) & i)))) * 959))))) - 1;
                    Object[] objArr3 = new Object[1];
                    h(new char[]{39211, 40071, 55989, 13884, 40887, 44419, 46100, 13690, 41475, 5055, 9796, 57776, 46625, 49439, 51192, 50172, 45349, 53540}, new char[]{0, 0, 0, 0}, (char) (i46 + (((i49 & i50) | i51) * 407)), new char[]{34171, 40318, 54852, 42376}, i55, objArr3);
                    Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                    int i56 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i57 = (i56 * 868) + 111104;
                    int i58 = ~i56;
                    int i59 = -(-(((~((i42 & (-129)) | ((-129) ^ i42))) | (~(i58 | i53))) * (-867)));
                    int i60 = ((i57 | i59) << 1) - (i57 ^ i59);
                    int i61 = ~i56;
                    int i62 = ~(i61 | (-129));
                    int i63 = ~((i61 ^ i) | (i61 & i));
                    int i64 = (i62 & i63) | (i62 ^ i63);
                    int i65 = ~(((-129) ^ i) | ((-129) & i));
                    int i66 = -(-(((i64 & i65) | (i64 ^ i65)) * (-1734)));
                    int i67 = ~((i61 & (-129)) | (i61 ^ (-129)) | i53);
                    int i68 = ~((i58 & 128) | (i58 ^ 128) | i);
                    int i69 = (i67 & i68) | (i67 ^ i68);
                    int i70 = (i56 & (-129)) | ((-129) ^ i56);
                    Object[] objArr4 = new Object[1];
                    f(null, null, (((i60 ^ i66) + ((i66 & i60) << 1)) - (~(-(-(((~((i70 & i) | (i70 ^ i))) | i69) * 867))))) - 1, new byte[]{-113, -118, -122, -105, -122, -113, -111, -116, -126, -117, -111, -123, -108, -108, -106, -124, -107, -108, -124, -116, -122, -119, -116, -122, -113, -117, -124, -112, -111, -113, -120, -112, -122, -126}, objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    int i71 = -(-Drawable.resolveOpacity(0, 0));
                    Object[] objArr5 = new Object[1];
                    h(new char[]{57411, 57917, 29538, 36713, 6344}, new char[]{0, 0, 0, 0}, (char) (((i71 | 13726) << 1) - (i71 ^ 13726)), new char[]{42277, 26142, 40499, 48693}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 862330533, objArr5);
                    int i72 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                    int i73 = -i72;
                    int i74 = ((i72 & i73) | (i72 ^ i73)) >> 31;
                    int i75 = (~i74) & i;
                    int i76 = i74 & (i ^ 1);
                    i4 = (i76 & i75) | (i75 ^ i76);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i4 = i;
            }
        } else if (context != null) {
            int i310 = i31 + 45;
            cancelAll = i310 % 128;
            int i311 = i310 % 2;
            Object[] objArr6 = new Object[1];
            h(new char[]{55668, 31524, 30444, 3046, 54822, 54768, 5285, 15238, 34196, 52600, 31310, 52270, 50248, 48692, 3650, 23706, 17603, 47332, 16491, 5411, 53836, 54845, 58651}, new char[]{0, 0, 0, 0}, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), new char[]{31703, 41997, 14610, 58300}, 312741242 - (~(-(-View.getDefaultSize(0, 0)))), objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            int i312 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i313 = i312 * (-813);
            int i314 = ((i313 | 14292240) << 1) - (i313 ^ 14292240);
            int i315 = ~((-35031) | i312);
            int i316 = ~((i312 ^ i) | (i312 & i));
            int i410 = (i315 | i316) * (-814);
            int i411 = (i314 ^ i410) + ((i314 & i410) << 1);
            int i412 = ~i;
            int i413 = ~(((-35031) ^ i412) | ((-35031) & i412));
            int i414 = ~i312;
            int i415 = (~((i414 ^ 35030) | (i414 & 35030))) | i413;
            int i416 = i411 + (((i316 & i415) | (i415 ^ i316)) * 407);
            int i417 = ~((i414 ^ 35030) | (i414 & 35030));
            int i418 = ~((i414 & i) | (i414 ^ i));
            int i419 = (i417 & i418) | (i417 ^ i418);
            int i510 = ~(i | 35030);
            int i511 = i419 ^ i510;
            int i512 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i513 = ~i;
            int i514 = ((i512 * 960) - 1917) + (((~(((-2) ^ i513) | ((-2) & i513))) | (~(i512 | i))) * 959);
            int i515 = ((((i514 | 1918) << 1) - (i514 ^ 1918)) - (~(-(-(((~((i512 & i412) | (i412 ^ i512))) | (~(((-2) ^ i) | ((-2) & i)))) * 959))))) - 1;
            Object[] objArr7 = new Object[1];
            h(new char[]{39211, 40071, 55989, 13884, 40887, 44419, 46100, 13690, 41475, 5055, 9796, 57776, 46625, 49439, 51192, 50172, 45349, 53540}, new char[]{0, 0, 0, 0}, (char) (i416 + (((i419 & i510) | i511) * 407)), new char[]{34171, 40318, 54852, 42376}, i515, objArr7);
            Object objInvoke2 = cls3.getMethod((String) objArr7[0], null).invoke(context, null);
            int i516 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i517 = (i516 * 868) + 111104;
            int i518 = ~i516;
            int i519 = -(-(((~((i412 & (-129)) | ((-129) ^ i412))) | (~(i518 | i513))) * (-867)));
            int i610 = ((i517 | i519) << 1) - (i517 ^ i519);
            int i611 = ~i516;
            int i612 = ~(i611 | (-129));
            int i613 = ~((i611 ^ i) | (i611 & i));
            int i614 = (i612 & i613) | (i612 ^ i613);
            int i615 = ~(((-129) ^ i) | ((-129) & i));
            int i616 = -(-(((i614 & i615) | (i614 ^ i615)) * (-1734)));
            int i617 = ~((i611 & (-129)) | (i611 ^ (-129)) | i513);
            int i618 = ~((i518 & 128) | (i518 ^ 128) | i);
            int i619 = (i617 & i618) | (i617 ^ i618);
            int i77 = (i516 & (-129)) | ((-129) ^ i516);
            Object[] objArr8 = new Object[1];
            f(null, null, (((i610 ^ i616) + ((i616 & i610) << 1)) - (~(-(-(((~((i77 & i) | (i77 ^ i))) | i619) * 867))))) - 1, new byte[]{-113, -118, -122, -105, -122, -113, -111, -116, -126, -117, -111, -123, -108, -108, -106, -124, -107, -108, -124, -116, -122, -119, -116, -122, -113, -117, -124, -112, -111, -113, -120, -112, -122, -126}, objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            int i78 = -(-Drawable.resolveOpacity(0, 0));
            Object[] objArr9 = new Object[1];
            h(new char[]{57411, 57917, 29538, 36713, 6344}, new char[]{0, 0, 0, 0}, (char) (((i78 | 13726) << 1) - (i78 ^ 13726)), new char[]{42277, 26142, 40499, 48693}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 862330533, objArr9);
            int i79 = cls4.getField((String) objArr9[0]).getInt(objInvoke2) & 2;
            int i710 = -i79;
            int i711 = ((i79 & i710) | (i79 ^ i710)) >> 31;
            int i712 = (~i711) & i;
            int i713 = i711 & (i ^ 1);
            i4 = (i713 & i712) | (i712 ^ i713);
        } else {
            i4 = i;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (16948 - TextUtils.lastIndexOf("", '0', 0));
                int trimmedLength = 2739 - TextUtils.getTrimmedLength("");
                int defaultSize = View.getDefaultSize(0, 0) + 13;
                byte[] bArr = $$d;
                Object[] objArr10 = new Object[1];
                e((byte) 52, bArr[7], bArr[5], objArr10);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, trimmedLength, defaultSize, 1501733736, false, (String) objArr10[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char c2 = (char) (16950 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int iIndexOf = 2738 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int scrollDefaultDelay = 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte b2 = $$d[7];
                Object[] objArr11 = new Object[1];
                e((byte) 52, b2, (byte) (b2 | 51), objArr11);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iIndexOf, scrollDefaultDelay, 47863026, false, (String) objArr11[0], null);
            }
            Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            int i80 = cancelAll;
            int i81 = (i80 & 35) + (i80 | 35);
            onTransact = i81 % 128;
            int i82 = i81 % 2;
            if (!set.contains(obj2)) {
                int i83 = onTransact + 77;
                cancelAll = i83 % 128;
                if (i83 % 2 != 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char trimmedLength2 = (char) (TextUtils.getTrimmedLength("") + 16949);
                        int trimmedLength3 = 2739 - TextUtils.getTrimmedLength("");
                        int pressedStateDuration = 13 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte b3 = $$d[7];
                        Object[] objArr12 = new Object[1];
                        e((byte) 37, b3, (byte) (b3 | 103), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength2, trimmedLength3, pressedStateDuration, 631063962, false, (String) objArr12[0], null);
                    }
                    int i84 = 63 / 0;
                    if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                        if (Build.VERSION.SDK_INT == 30) {
                            i5 = i;
                        }
                    }
                } else {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyTid = (char) (16949 - (Process.myTid() >> 22));
                        int iGreen = Color.green(0) + 2739;
                        int i85 = 14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        byte b4 = $$d[7];
                        Object[] objArr13 = new Object[1];
                        e((byte) 37, b4, (byte) (b4 | 103), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyTid, iGreen, i85, 631063962, false, (String) objArr13[0], null);
                    }
                    if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                        if (Build.VERSION.SDK_INT == 30) {
                            i5 = i;
                        }
                    }
                }
                try {
                    if (Build.VERSION.SDK_INT > 33) {
                        cArr = new char[]{16998, 33455, 16101, 21375, 58566, 40643, 51010, 16860, 37494, 17700, 59725, 16017, 55886, 1573, 42896, 40131, 21841, 38486, 19239, 10323, 39265, 35739, 5894, 23746, 61613, 13806, 43126, 26172};
                        cArr2 = new char[]{0, 0, 0, 0};
                        i13 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i86 = i13 * 303;
                        i14 = ((i86 | (-18090702)) << 1) - (i86 ^ (-18090702));
                        i15 = ~i13;
                        i16 = ~i;
                        i17 = ~((i15 ^ i16) | (i15 & i16) | 60102);
                        int i87 = (i13 ^ 60102) | (i13 & 60102);
                        i18 = (i87 ^ i) | (i87 & i);
                        i19 = cancelAll + 25;
                        int i88 = i19 % 128;
                        onTransact = i88;
                        if (i19 % 2 == 0) {
                            int i89 = ~i18;
                            int i90 = ~i13;
                            int i91 = (i90 & 60102) | (i90 ^ 60102);
                            i20 = (i14 >>> ((-302) << ((i89 & i17) | (i17 ^ i89)))) + ((-604) << (~((i91 & i) | (i91 ^ i))));
                        } else {
                            int i92 = ~i18;
                            int i93 = ((i17 & i92) | (i17 ^ i92)) * (-302);
                            int i94 = (i14 & i93) + (i14 | i93);
                            int i95 = (i15 & 60102) | (i15 ^ 60102);
                            int i96 = (~((i95 & i) | (i95 ^ i))) * (-604);
                            i20 = (i96 | i94) + (i94 & i96);
                        }
                        int i97 = (i13 & (-60103)) | ((-60103) ^ i13);
                        int i98 = i88 + 61;
                        cancelAll = i98 % 128;
                        int i99 = i98 % 2;
                        int i100 = ~i97;
                        int i101 = ~((60102 ^ i) | (60102 & i));
                        c = (char) (i20 + (302 * ((i100 & i101) | (i100 ^ i101))));
                        cArr3 = new char[]{43616, 10086, 50493, 48618};
                        i21 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i102 = onTransact;
                        i22 = ((i102 | 21) << 1) - (i102 ^ 21);
                        cancelAll = i22 % 128;
                        if (i22 % 2 != 0) {
                            int i103 = (-183) << i21;
                            i23 = (i103 ^ (-184)) + ((i103 & (-184)) << 1);
                        } else {
                            int i104 = i21 * (-183);
                            i23 = ((i104 | 183) << 1) - (i104 ^ 183);
                        }
                        int i105 = ~i21;
                        int i106 = ~i;
                        int i107 = (i105 & i106) | (i105 ^ i106);
                        int i108 = ~(i107 | (~i107));
                        int i109 = ((i102 | 21) << 1) - (i102 ^ 21);
                        int i110 = i109 % 128;
                        cancelAll = i110;
                        int i111 = i109 % 2;
                        i24 = ~i;
                        i25 = (i23 - (~(-(-((-184) * (i108 | (~((i24 ^ i21) | (i24 & i21))))))))) - 1;
                        i26 = ~i21;
                        i27 = ~i26;
                        i28 = i110 + 61;
                        onTransact = i28 % 128;
                        if (i28 % 2 == 0) {
                            int i112 = ~(i26 | i16);
                            int i113 = (i112 & i27) | (i27 ^ i112);
                            int i114 = ~i24;
                            int i115 = -(i21 | i26);
                            int i116 = (i25 << (184 >>> ((i113 & i114) | (i113 ^ i114)))) * ((i115 & 184) + (i115 | 184));
                            Object[] objArr14 = new Object[1];
                            h(cArr, cArr2, c, cArr3, i116, objArr14);
                            obj = objArr14[0];
                        } else {
                            int i117 = -(-(((~(i26 | i24)) | i27 | (~i16)) * 184));
                            int i118 = (i25 & i117) + (i117 | i25);
                            int i119 = -(-((i21 | i26) * 184));
                            int i120 = (i118 & i119) + (i119 | i118);
                            Object[] objArr15 = new Object[1];
                            h(cArr, cArr2, c, cArr3, i120, objArr15);
                            obj = objArr15[0];
                        }
                        try {
                            Object[] objArr16 = {(String) obj};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 993;
                                int i121 = 9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                byte b5 = $$d[7];
                                Object[] objArr17 = new Object[1];
                                e(b5, (byte) (b5 | 14), (byte) 51, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority, jumpTapTimeout, i121, 410748506, false, (String) objArr17[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr16)).longValue();
                            long j = 571965460;
                            long j2 = i;
                            long j3 = -1;
                            long j4 = jLongValue ^ j3;
                            long j5 = 676;
                            long j6 = j2 ^ j3;
                            long j7 = (((long) 677) * j) + (((long) (-675)) * jLongValue) + (((long) (-676)) * (j | j2 | j4)) + ((((j4 | j) ^ j3) | ((j6 | j) ^ j3)) * j5) + (j5 * ((((j ^ j3) | j4) ^ j3) | ((j4 | j6) ^ j3) | (((jLongValue | j) | j2) ^ j3))) + ((long) (-772883697));
                            int i122 = (int) (j7 >> 32);
                            int iNextInt = new Random().nextInt(1487455526);
                            int i123 = i122 & ((((~((-342924555) | iNextInt)) | 339739914) * (-566)) + 456489414 + ((~(iNextInt | (-3184641))) * 566));
                            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                            int i124 = ~startElapsedRealtime;
                            int i125 = ((int) j7) & ((-1972008908) + (((~((-331495959) | i124)) | (~(1768722368 | i124))) * (-867)) + (((~((-331495959) | startElapsedRealtime)) | 310521878 | (~(1768722368 | startElapsedRealtime))) * (-1734)) + (((~(startElapsedRealtime | 2079244246)) | (~(i124 | (-310521879))) | (~((-20974081) | startElapsedRealtime))) * 867));
                            i6 = (i123 & i125) | (i123 ^ i125);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    } else {
                        int i126 = -Color.rgb(0, 0, 0);
                        int i127 = ((i126 | (-16777089)) << 1) - (i126 ^ (-16777089));
                        byte[] bArr2 = {-104};
                        int i128 = cancelAll + 9;
                        onTransact = i128 % 128;
                        int i129 = i128 % 2;
                        Object[] objArr18 = new Object[1];
                        f(null, null, i127, bArr2, objArr18);
                        str = (String) objArr18[0];
                        i9 = -(Process.myTid() >> 22);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        i10 = (i9 * 217) - 27305;
                        int i130 = cancelAll;
                        i11 = i130 + 15;
                        onTransact = i11 % 128;
                        if (i11 % 2 == 0) {
                            i12 = i10 << ((~((i9 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i9 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) * 216);
                        } else {
                            i12 = i10 + ((~(i9 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 216);
                        }
                        int i131 = (i130 ^ 67) + ((i130 & 67) << 1);
                        onTransact = i131 % 128;
                        int i132 = i131 % 2;
                        int i133 = (i9 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i9 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                        int i134 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i135 = -(-((-216) * ((i133 & i134) | (i133 ^ i134))));
                        int i136 = (i12 & i135) + (i12 | i135);
                        int i137 = ((~(i9 | i134)) | 127) * 216;
                        Object[] objArr19 = new Object[1];
                        f(null, null, (i136 & i137) + (i137 | i136), new byte[]{-119, -123, -103, -126, -121, -121, -102, -103, -119, -112, -124, -113, -120}, objArr19);
                        String str2 = (String) objArr19[0];
                        int i138 = onTransact;
                        int i139 = ((i138 | 69) << 1) - (i138 ^ 69);
                        cancelAll = i139 % 128;
                        int i140 = i139 % 2;
                        try {
                            objArr = new Object[]{str2};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char maximumDrawingCacheSize = (char) (33602 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                int i141 = 3086 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int iAlpha = Color.alpha(0) + 26;
                                byte b6 = $$d[7];
                                Object[] objArr20 = new Object[1];
                                e(b6, (byte) (b6 | 14), (byte) 51, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, i141, iAlpha, 1411172903, false, (String) objArr20[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i142 = onTransact;
                                int i143 = (i142 & 117) + (i142 | 117);
                                cancelAll = i143 % 128;
                                int i144 = i143 % 2;
                                i6 = 1;
                            } else {
                                i6 = 0;
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th3;
                        }
                    }
                } catch (Exception unused) {
                }
                int i145 = (i6 | (-i6)) >> 31;
                int i146 = cancelAll + 55;
                int i147 = i146 % 128;
                onTransact = i147;
                int i148 = i146 % 2;
                int i149 = (~i145) & i;
                int i150 = i145 & (i ^ 10);
                int i151 = (i150 & i149) | (i149 ^ i150);
                i7 = (i147 & 117) + (i147 | 117);
                cancelAll = i7 % 128;
                if (i7 % 2 != 0) {
                    i8 = i2 & 28;
                } else {
                    i8 = i2 & 32;
                }
                int i152 = -i8;
                int i153 = ((i8 & i152) | (i8 ^ i152)) >> 31;
                int i154 = i151 & (~i153);
                int i155 = i153 & i;
                i5 = (i154 & i155) | (i154 ^ i155);
            } else if (Build.VERSION.SDK_INT == 30) {
                i5 = i;
            } else {
                if (Build.VERSION.SDK_INT > 33) {
                    cArr = new char[]{16998, 33455, 16101, 21375, 58566, 40643, 51010, 16860, 37494, 17700, 59725, 16017, 55886, 1573, 42896, 40131, 21841, 38486, 19239, 10323, 39265, 35739, 5894, 23746, 61613, 13806, 43126, 26172};
                    cArr2 = new char[]{0, 0, 0, 0};
                    i13 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int i810 = i13 * 303;
                    i14 = ((i810 | (-18090702)) << 1) - (i810 ^ (-18090702));
                    i15 = ~i13;
                    i16 = ~i;
                    i17 = ~((i15 ^ i16) | (i15 & i16) | 60102);
                    int i811 = (i13 ^ 60102) | (i13 & 60102);
                    i18 = (i811 ^ i) | (i811 & i);
                    i19 = cancelAll + 25;
                    int i812 = i19 % 128;
                    onTransact = i812;
                    if (i19 % 2 == 0) {
                        int i813 = ~i18;
                        int i910 = ~i13;
                        int i911 = (i910 & 60102) | (i910 ^ 60102);
                        i20 = (i14 >>> ((-302) << ((i813 & i17) | (i17 ^ i813)))) + ((-604) << (~((i911 & i) | (i911 ^ i))));
                    } else {
                        int i912 = ~i18;
                        int i913 = ((i17 & i912) | (i17 ^ i912)) * (-302);
                        int i914 = (i14 & i913) + (i14 | i913);
                        int i915 = (i15 & 60102) | (i15 ^ 60102);
                        int i916 = (~((i915 & i) | (i915 ^ i))) * (-604);
                        i20 = (i916 | i914) + (i914 & i916);
                    }
                    int i917 = (i13 & (-60103)) | ((-60103) ^ i13);
                    int i918 = i812 + 61;
                    cancelAll = i918 % 128;
                    int i919 = i918 % 2;
                    int i1010 = ~i917;
                    int i1011 = ~((60102 ^ i) | (60102 & i));
                    c = (char) (i20 + (302 * ((i1010 & i1011) | (i1010 ^ i1011))));
                    cArr3 = new char[]{43616, 10086, 50493, 48618};
                    i21 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i1012 = onTransact;
                    i22 = ((i1012 | 21) << 1) - (i1012 ^ 21);
                    cancelAll = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i1013 = (-183) << i21;
                        i23 = (i1013 ^ (-184)) + ((i1013 & (-184)) << 1);
                    } else {
                        int i1014 = i21 * (-183);
                        i23 = ((i1014 | 183) << 1) - (i1014 ^ 183);
                    }
                    int i1015 = ~i21;
                    int i1016 = ~i;
                    int i1017 = (i1015 & i1016) | (i1015 ^ i1016);
                    int i1018 = ~(i1017 | (~i1017));
                    int i1019 = ((i1012 | 21) << 1) - (i1012 ^ 21);
                    int i1110 = i1019 % 128;
                    cancelAll = i1110;
                    int i1111 = i1019 % 2;
                    i24 = ~i;
                    i25 = (i23 - (~(-(-((-184) * (i1018 | (~((i24 ^ i21) | (i24 & i21))))))))) - 1;
                    i26 = ~i21;
                    i27 = ~i26;
                    i28 = i1110 + 61;
                    onTransact = i28 % 128;
                    if (i28 % 2 == 0) {
                        int i1112 = ~(i26 | i16);
                        int i1113 = (i1112 & i27) | (i27 ^ i1112);
                        int i1114 = ~i24;
                        int i1115 = -(i21 | i26);
                        int i1116 = (i25 << (184 >>> ((i1113 & i1114) | (i1113 ^ i1114)))) * ((i1115 & 184) + (i1115 | 184));
                        Object[] objArr110 = new Object[1];
                        h(cArr, cArr2, c, cArr3, i1116, objArr110);
                        obj = objArr110[0];
                    } else {
                        int i1117 = -(-(((~(i26 | i24)) | i27 | (~i16)) * 184));
                        int i1118 = (i25 & i1117) + (i1117 | i25);
                        int i1119 = -(-((i21 | i26) * 184));
                        int i1210 = (i1118 & i1119) + (i1119 | i1118);
                        Object[] objArr111 = new Object[1];
                        h(cArr, cArr2, c, cArr3, i1210, objArr111);
                        obj = objArr111[0];
                    }
                    Object[] objArr112 = {(String) obj};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 993;
                        int i1211 = 9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte b7 = $$d[7];
                        Object[] objArr113 = new Object[1];
                        e(b7, (byte) (b7 | 14), (byte) 51, objArr113);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority2, jumpTapTimeout2, i1211, 410748506, false, (String) objArr113[0], new Class[]{String.class});
                    }
                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr112)).longValue();
                    long j8 = 571965460;
                    long j9 = i;
                    long j10 = -1;
                    long j11 = jLongValue2 ^ j10;
                    long j12 = 676;
                    long j13 = j9 ^ j10;
                    long j14 = (((long) 677) * j8) + (((long) (-675)) * jLongValue2) + (((long) (-676)) * (j8 | j9 | j11)) + ((((j11 | j8) ^ j10) | ((j13 | j8) ^ j10)) * j12) + (j12 * ((((j8 ^ j10) | j11) ^ j10) | ((j11 | j13) ^ j10) | (((jLongValue2 | j8) | j9) ^ j10))) + ((long) (-772883697));
                    int i1212 = (int) (j14 >> 32);
                    int iNextInt2 = new Random().nextInt(1487455526);
                    int i1213 = i1212 & ((((~((-342924555) | iNextInt2)) | 339739914) * (-566)) + 456489414 + ((~(iNextInt2 | (-3184641))) * 566));
                    int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                    int i1214 = ~startElapsedRealtime2;
                    int i1215 = ((int) j14) & ((-1972008908) + (((~((-331495959) | i1214)) | (~(1768722368 | i1214))) * (-867)) + (((~((-331495959) | startElapsedRealtime2)) | 310521878 | (~(1768722368 | startElapsedRealtime2))) * (-1734)) + (((~(startElapsedRealtime2 | 2079244246)) | (~(i1214 | (-310521879))) | (~((-20974081) | startElapsedRealtime2))) * 867));
                    i6 = (i1213 & i1215) | (i1213 ^ i1215);
                } else {
                    int i1216 = -Color.rgb(0, 0, 0);
                    int i1217 = ((i1216 | (-16777089)) << 1) - (i1216 ^ (-16777089));
                    byte[] bArr3 = {-104};
                    int i1218 = cancelAll + 9;
                    onTransact = i1218 % 128;
                    int i1219 = i1218 % 2;
                    Object[] objArr114 = new Object[1];
                    f(null, null, i1217, bArr3, objArr114);
                    str = (String) objArr114[0];
                    i9 = -(Process.myTid() >> 22);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    i10 = (i9 * 217) - 27305;
                    int i1310 = cancelAll;
                    i11 = i1310 + 15;
                    onTransact = i11 % 128;
                    if (i11 % 2 == 0) {
                        i12 = i10 << ((~((i9 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i9 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) * 216);
                    } else {
                        i12 = i10 + ((~(i9 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 216);
                    }
                    int i1311 = (i1310 ^ 67) + ((i1310 & 67) << 1);
                    onTransact = i1311 % 128;
                    int i1312 = i1311 % 2;
                    int i1313 = (i9 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i9 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                    int i1314 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i1315 = -(-((-216) * ((i1313 & i1314) | (i1313 ^ i1314))));
                    int i1316 = (i12 & i1315) + (i12 | i1315);
                    int i1317 = ((~(i9 | i1314)) | 127) * 216;
                    Object[] objArr115 = new Object[1];
                    f(null, null, (i1316 & i1317) + (i1317 | i1316), new byte[]{-119, -123, -103, -126, -121, -121, -102, -103, -119, -112, -124, -113, -120}, objArr115);
                    String str3 = (String) objArr115[0];
                    int i1318 = onTransact;
                    int i1319 = ((i1318 | 69) << 1) - (i1318 ^ 69);
                    cancelAll = i1319 % 128;
                    int i1410 = i1319 % 2;
                    objArr = new Object[]{str3};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char maximumDrawingCacheSize2 = (char) (33602 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int i1411 = 3086 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iAlpha2 = Color.alpha(0) + 26;
                        byte b8 = $$d[7];
                        Object[] objArr21 = new Object[1];
                        e(b8, (byte) (b8 | 14), (byte) 51, objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize2, i1411, iAlpha2, 1411172903, false, (String) objArr21[0], new Class[]{String.class});
                    }
                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                        int i1412 = onTransact;
                        int i1413 = (i1412 & 117) + (i1412 | 117);
                        cancelAll = i1413 % 128;
                        int i1414 = i1413 % 2;
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                }
                int i1415 = (i6 | (-i6)) >> 31;
                int i1416 = cancelAll + 55;
                int i1417 = i1416 % 128;
                onTransact = i1417;
                int i1418 = i1416 % 2;
                int i1419 = (~i1415) & i;
                int i156 = i1415 & (i ^ 10);
                int i157 = (i156 & i1419) | (i1419 ^ i156);
                i7 = (i1417 & 117) + (i1417 | 117);
                cancelAll = i7 % 128;
                if (i7 % 2 != 0) {
                    i8 = i2 & 28;
                } else {
                    i8 = i2 & 32;
                }
                int i158 = -i8;
                int i159 = ((i8 & i158) | (i8 ^ i158)) >> 31;
                int i1510 = i157 & (~i159);
                int i1511 = i159 & i;
                i5 = (i1510 & i1511) | (i1510 ^ i1511);
            }
            int i160 = (~(i & i4)) & (i | i4);
            int i161 = cancelAll + 119;
            int i162 = i161 % 128;
            onTransact = i162;
            int i163 = i161 % 2;
            int i164 = (i160 | (-i160)) >> 31;
            int i165 = i5 & (~i164);
            int i166 = i4 & i164;
            int i167 = (i165 & i166) | (i165 ^ i166);
            int[] iArr = new int[1];
            int i168 = (~i167) & i;
            int i169 = ~i;
            int i170 = i168 | (i167 & i169);
            int i171 = (i162 ^ 113) + ((i162 & 113) << 1);
            cancelAll = i171 % 128;
            int i172 = i171 % 2;
            Object[] objArr22 = {new int[]{i}, iArr, new int[]{i167}, null};
            int i173 = (~(188991326 | i169)) | (-267116416) | (~(229301555 | i169));
            int i174 = -(-((-1939354280) + (((~(i | (-151176467))) | i173) * 590) + (i173 * (-1180)) + (((~((-229301556) | i169)) | (~((-188991327) | i169))) * 590) + (((i170 | (-i170)) >> 31) & 16)));
            int i175 = (i3 ^ i174) + ((i3 & i174) << 1);
            int i176 = i175 << 13;
            int i177 = (i176 | i175) & (~(i175 & i176));
            int i178 = i177 >>> 17;
            int i179 = ((~i177) & i178) | ((~i178) & i177);
            int i180 = i179 << 5;
            iArr[0] = (i179 | i180) & (~(i179 & i180));
            return objArr22;
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    private static String $$g(short s, byte b2, int i) {
        byte[] bArr = $$c;
        int i2 = 3 - (b2 * 3);
        int i3 = s * 3;
        int i4 = i + 67;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            i2++;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i2];
        }
    }
}
