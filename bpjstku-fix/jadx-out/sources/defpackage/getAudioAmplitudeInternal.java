package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.RtlMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class getAudioAmplitudeInternal {
    private AudioStats b;
    private static final byte[] $$c = {89, 107, -36, -112};
    private static final int $$f = 74;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 67, 3, -12, 15, -13, 10, 7, -18, 20, -10, 7, 0, -63, 55, 6, -1, 3, 12, -18, 12, -8, -1, 18, -13, -53, 23, 34, 16, -18, 9, 4, -39, 38, -1, 3, 12, -18, 12, -40, 31, 18, -13, -34, 35, 18, -10, 14, -12, 12, 6, -84, 80, -2, -10, -1, 7, -7, 12, -71, 1, 70, 6, -1, -2, 6, -8, 0, -63, 83, -12, -3, 19, -41, 35, -10, 2, 8, -71, 65, 2, 2, -4, 21, -8, 9, -79, 16, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -64};
    private static final int $$e = 147;
    private static final byte[] $$a = {51, -99, -8, -59, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 18;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f909a = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {47397, 47448, 47394, 47444, 47447, 47453, 47384, 47443, 47411, 47437, 47442, 47393, 47449, 47363, 47450, 47395, 47451, 47446, 47412, 47365, 47440, 47410, 47454, 47441, 47452, 47455, 47422};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719622;
    private static boolean TuitionPaymentFragmentbindingInflater1 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r6 = r6 + 38
            byte[] r0 = defpackage.getAudioAmplitudeInternal.$$a
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = 84 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getAudioAmplitudeInternal.c(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.getAudioAmplitudeInternal.$$d
            int r7 = r7 * 98
            int r7 = r7 + 4
            int r6 = r6 * 15
            int r6 = 99 - r6
            int r8 = r8 * 46
            int r8 = 99 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r5 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getAudioAmplitudeInternal.e(short, short, int, java.lang.Object[]):void");
    }

    public getAudioAmplitudeInternal(AudioStats audioStats) {
        this.b = audioStats;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        int i = 2 % 2;
        int i2 = f909a + 5;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3, 1, 0);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(typedArrayObtainStyledAttributes);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(typedArrayObtainStyledAttributes);
            b(typedArrayObtainStyledAttributes);
            TuitionPaymentFragmentbindingInflater1(typedArrayObtainStyledAttributes);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3, 0, 0);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(typedArrayObtainStyledAttributes);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(typedArrayObtainStyledAttributes);
            b(typedArrayObtainStyledAttributes);
            TuitionPaymentFragmentbindingInflater1(typedArrayObtainStyledAttributes);
        }
        typedArrayObtainStyledAttributes.recycle();
        int i3 = f909a + 95;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TypedArray typedArray) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        f909a = i2 % 128;
        int i3 = i2 % 2;
        int resourceId = typedArray.getResourceId(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.getInterfaceDescriptor, -1);
        boolean z = typedArray.getBoolean(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.b, true);
        int i4 = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.asBinder;
        int i5 = 0;
        boolean z2 = typedArray.getBoolean(4, false);
        int i6 = typedArray.getInt(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.TuitionPaymentFragmentbindingInflater1, -1);
        if (i6 == -1) {
            int i7 = asBinder + 115;
            f909a = i7 % 128;
            int i8 = i7 % 2;
            i6 = 3;
        }
        int i9 = typedArray.getInt(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.INotificationSideChannel, 0);
        if (i9 >= 0) {
            int i10 = f909a + 51;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            if (i6 <= 0 || i9 <= (i5 = i6 - 1)) {
                i5 = i9;
            }
        }
        this.b.MediaBrowserCompat = resourceId;
        this.b.TuitionPaymentFragmentbindingInflater1 = z;
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z2;
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6;
        this.b.connect = i5;
        this.b.read = i5;
        this.b.d = i5;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TypedArray typedArray) {
        int i = 2 % 2;
        int i2 = f909a + 27;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int color = typedArray.getColor(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.INotificationSideChannelDefault, Color.parseColor("#33ffffff"));
            int color2 = typedArray.getColor(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.RemoteActionCompatParcelizer, Color.parseColor("#ffffff"));
            this.b.write = color;
            this.b.INotificationSideChannelStubProxy = color2;
            return;
        }
        int color3 = typedArray.getColor(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.INotificationSideChannelDefault, Color.parseColor("#33ffffff"));
        int color4 = typedArray.getColor(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.RemoteActionCompatParcelizer, Color.parseColor("#ffffff"));
        this.b.write = color3;
        this.b.INotificationSideChannelStubProxy = color4;
        int i3 = 25 / 0;
    }

    private static void d(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 1;
                $10 = i6 % 128;
                if (i6 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr2[i5]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i4;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31338 - ExpandableListView.getPackedPositionChild(j)), 2995 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), 17 - (ViewConfiguration.getTapTimeout() >> 16), 1182129903, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i5 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (31339 - TextUtils.getOffsetBefore("", 0)), 2993 - MotionEvent.axisFromString(""), 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1182129903, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                j = 0;
                i4 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 43325), 253 - TextUtils.getOffsetBefore("", 0), 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        int i7 = 33602;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33602), 3085 - Gravity.getAbsoluteGravity(0, 0), 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2146875848, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!TuitionPaymentFragmentbindingInflater1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i8 = $11 + 21;
            $10 = i8 % 128;
            int i9 = i8 % 2;
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
            int i10 = $10 + 105;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >> i] >>> iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (i7 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (Process.myTid() >> 22) + 3085, 26 - KeyEvent.getDeadChar(0, 0), -2146875848, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr7 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33601), Color.argb(0, 0, 0, 0) + 3085, ExpandableListView.getPackedPositionType(0L) + 26, -2146875848, false, $$g(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                i7 = 33602;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private void b(TypedArray typedArray) throws Throwable {
        AnimationType animationType;
        Object[] objArr;
        char c;
        RtlMode rtlMode;
        int i = 2 % 2;
        boolean z = typedArray.getBoolean(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.g, false);
        long j = typedArray.getInt(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 350);
        if (j < 0) {
            int i2 = f909a + 79;
            asBinder = i2 % 128;
            j = i2 % 2 != 0 ? 1L : 0L;
        }
        switch (typedArray.getInt(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1, AnimationType.NONE.ordinal())) {
            case 0:
                animationType = AnimationType.NONE;
                break;
            case 1:
                animationType = AnimationType.COLOR;
                break;
            case 2:
                animationType = AnimationType.SCALE;
                break;
            case 3:
                animationType = AnimationType.WORM;
                break;
            case 4:
                animationType = AnimationType.SLIDE;
                break;
            case 5:
                animationType = AnimationType.FILL;
                break;
            case 6:
                animationType = AnimationType.THIN_WORM;
                break;
            case 7:
                animationType = AnimationType.DROP;
                break;
            case 8:
                animationType = AnimationType.SWAP;
                break;
            case 9:
                animationType = AnimationType.SCALE_DOWN;
                break;
            default:
                animationType = AnimationType.NONE;
                int i3 = f909a + 107;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                break;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2268;
            int offsetAfter = 33 - TextUtils.getOffsetAfter("", 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[132], bArr[7], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iLastIndexOf, offsetAfter, -887667012, false, (String) objArr2[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(null, null, (ViewConfiguration.getTapTimeout() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(null, null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 2267;
            int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[132], bArr2[7], bArr2[0], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter2, capsMode, i5, -874156483, false, (String) objArr5[0], null);
        }
        if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = f909a + 7;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int mirror = 2315 - AndroidCharacter.getMirror('0');
                int iNormalizeMetaState = 33 - KeyEvent.normalizeMetaState(0);
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr6 = new Object[1];
                c(b, b2, (byte) (b2 | 103), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, mirror, iNormalizeMetaState, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr7[0])[0];
            int i9 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i10 = ((~((-75690010) | iIdentityHashCode)) * 521) + 997947696 + (((~((~iIdentityHashCode) | (-75690010))) | 723585602) * 521) + 1433573384;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            d(null, null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(null, null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(null, null, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(null, null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1433573384};
                byte[] bArr3 = $$d;
                byte b3 = bArr3[26];
                byte b4 = b3;
                Object[] objArr13 = new Object[1];
                e(b3, b4, b4, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = bArr3[74];
                byte b6 = b5;
                Object[] objArr14 = new Object[1];
                e(b5, b6, b6, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iLastIndexOf2 = 2266 - TextUtils.lastIndexOf("", '0');
                        int iLastIndexOf3 = 32 - TextUtils.lastIndexOf("", '0', 0);
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr15 = new Object[1];
                        c(b7, b8, (byte) (b8 | 103), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize, iLastIndexOf2, iLastIndexOf3, -654680577, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        d(null, null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        d(null, null, View.resolveSize(0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cRed = (char) Color.red(0);
                            int i13 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267;
                            int offsetAfter3 = 33 - TextUtils.getOffsetAfter("", 0);
                            byte[] bArr4 = $$a;
                            Object[] objArr18 = new Object[1];
                            c(bArr4[132], bArr4[7], bArr4[0], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, i13, offsetAfter3, -874156483, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int minimumFlingVelocity = 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int packedPositionGroup = 33 - ExpandableListView.getPackedPositionGroup(0L);
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr5[132], bArr5[7], bArr5[5], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, minimumFlingVelocity, packedPositionGroup, -887667012, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[1];
            if (strArr2 != null) {
                int i14 = asBinder + 65;
                f909a = i14 % 128;
                for (int i15 = i14 % 2 == 0 ? 1 : 0; i15 < strArr2.length; i15++) {
                    arrayList.add(strArr2[i15]);
                }
            }
            throw null;
        }
        int i16 = asBinder + 83;
        f909a = i16 % 128;
        int i17 = i16 % 2;
        Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[0])[0];
        int i20 = ((int[]) objArr[3])[0];
        String[] strArr3 = (String[]) objArr[1];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i21 = i18 + (-1693092821) + (((~((-56859420) | iIdentityHashCode2)) | 4194568) * 104) + ((~((~iIdentityHashCode2) | 804518747)) * (-104)) + ((iIdentityHashCode2 | 751853896) * 104);
        int i22 = i21 ^ (i21 << 13);
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr20[2])[0] = i23 ^ (i23 << 5);
        int i24 = typedArray.getInt(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.notify, RtlMode.Off.ordinal());
        if (i24 == 0) {
            rtlMode = RtlMode.On;
        } else if (i24 != 1) {
            rtlMode = i24 != 2 ? RtlMode.Auto : RtlMode.Auto;
        } else {
            rtlMode = RtlMode.Off;
        }
        boolean z2 = typedArray.getBoolean(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.d, false);
        int i25 = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.asInterface;
        int i26 = ((int[]) objArr20[2])[0];
        int i27 = ((i26 * i26) - (~(-(210652424 * i26)))) - 1;
        int i28 = -(i26 * 2039792906);
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        int i30 = ((i29 | 848077393) << 1) - (848077393 ^ i29);
        int i31 = (((i30 >> 29) - 15) / 8) + 1;
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        int i33 = i30 >> 20;
        int i34 = -(i32 ^ ((((i33 ^ (-8191)) + ((i33 & (-8191)) << 1)) / 4096) + 1));
        int i35 = (i34 ^ 6) + ((i34 & 6) << 1);
        int i36 = i35 >> 20;
        int i37 = ((i36 ^ (-8191)) + ((i36 & (-8191)) << 1)) / 4096;
        int i38 = ((i37 | 1) << 1) - (i37 ^ 1);
        long j3 = typedArray.getInt(i25, 31158000 / (((-((i38 ^ 1) + ((i38 & 1) << 1))) & i35) * 1731));
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
        this.b.f76a = z;
        this.b.b = animationType;
        this.b.getInterfaceDescriptor = rtlMode;
        this.b.asBinder = z2;
        this.b.asInterface = j3;
    }

    private void TuitionPaymentFragmentbindingInflater1(TypedArray typedArray) {
        Orientation orientation;
        int i = 2 % 2;
        if (typedArray.getInt(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.f80a, Orientation.HORIZONTAL.ordinal()) == 0) {
            int i2 = f909a + 125;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                orientation = Orientation.HORIZONTAL;
                int i3 = 4 / 0;
            } else {
                orientation = Orientation.HORIZONTAL;
            }
        } else {
            orientation = Orientation.VERTICAL;
        }
        int dimension = (int) typedArray.getDimension(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.cancel, (int) TypedValue.applyDimension(1, 6.0f, Resources.getSystem().getDisplayMetrics()));
        if (dimension < 0) {
            int i4 = asBinder + 121;
            f909a = i4 % 128;
            int i5 = i4 % 2;
            dimension = 0;
        }
        int dimension2 = (int) typedArray.getDimension(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.cancelAll, (int) TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics()));
        if (dimension2 < 0) {
            dimension2 = 0;
        }
        float f = typedArray.getFloat(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.onTransact, 0.7f);
        if (f < 0.3f) {
            f = 0.3f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        int dimension3 = (int) typedArray.getDimension(AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.b.INotificationSideChannelStubProxy, (int) TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics()));
        if (dimension3 > dimension) {
            dimension3 = dimension;
        }
        AudioStats audioStats = this.b;
        if (audioStats.b == null) {
            audioStats.b = AnimationType.NONE;
        }
        int i6 = audioStats.b == AnimationType.FILL ? dimension3 : 0;
        this.b.INotificationSideChannelStub = dimension;
        this.b.INotificationSideChannel = orientation;
        this.b.notify = dimension2;
        this.b.RemoteActionCompatParcelizer = f;
        this.b.IconCompatParcelizer = i6;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            byte[] r0 = defpackage.getAudioAmplitudeInternal.$$c
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = 68 - r8
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getAudioAmplitudeInternal.$$g(short, int, short):java.lang.String");
    }
}
