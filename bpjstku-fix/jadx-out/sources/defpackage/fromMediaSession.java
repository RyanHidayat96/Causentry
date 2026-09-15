package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.media.AudioTrack;
import android.os.Build;
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
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class fromMediaSession implements unregisterCallbackListener, binderDied.b, getAudioStream {
    private final Paint INotificationSideChannelDefault;
    private List<fromMediaSession> INotificationSideChannelStub;
    private fromMediaSession INotificationSideChannelStubProxy;
    private final RectF MediaBrowserCompat;
    private final RectF RemoteActionCompatParcelizer;
    final prepare TuitionPaymentFragmentbindingInflater1;
    public final List<binderDied<?, ?>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final Layer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final Matrix TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f905a;
    private final Paint asBinder;
    onAudioInfoChanged b;
    private final RectF cancel;
    private MediaControllerCompatCallbackStubApi21 cancelAll;
    final MediaControllerCompatCallbackStubCompat d;
    boolean g;
    private fromMediaSession getInterfaceDescriptor;
    private final RectF write;
    private static final byte[] $$c = {94, -56, 58, -24};
    private static final int $$f = 82;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {80, -8, 43, 65, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 123;
    private static int getItem = 0;
    private static int getNotifyChildrenChangedOptions = 1;
    private static char[] IconCompatParcelizer = {47236, 47287, 47233, 47283, 47286, 47292, 47223, 47282, 47250, 47276, 47281, 47232, 47288, 47202, 47289, 47234, 47290, 47285, 47251};
    private static int read = 2047719461;
    private static boolean getRoot = true;
    private static boolean disconnect = true;
    private final Path connect = new Path();
    private final Matrix INotificationSideChannel = new Matrix();
    private final Paint asInterface = new setVolumeTo(1);
    private final Paint notify = new setVolumeTo(PorterDuff.Mode.DST_IN, (byte) 0);
    private final Paint onTransact = new setVolumeTo(PorterDuff.Mode.DST_OUT, (byte) 0);

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i5)) | i9 | (~(i8 | i5));
        int i11 = ~i5;
        int i12 = (~(i8 | i11)) | i9;
        int i13 = (~(i11 | i7)) | i6;
        int i14 = i2 + i6 + i + ((-700610695) * i3) + ((-1151578525) * i4);
        int i15 = i14 * i14;
        int i16 = (1165304685 * i2) + 1030029312 + ((-1366800679) * i6) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i) + ((-665714688) * i3) + (367394816 * i4) + (374145024 * i15);
        int i17 = ((i2 * 323709325) - 650539883) + (i6 * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i * 323709601) + (i3 * (-499299047)) + (i4 * 1568885315) + (i15 * (-395509760));
        return i16 + ((i17 * i17) * (-772603904)) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r0 = 53 - r7
            byte[] r1 = defpackage.fromMediaSession.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r8]
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            int r8 = r8 + 1
            int r6 = r6 + (-11)
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fromMediaSession.c(byte, int, short, java.lang.Object[]):void");
    }

    abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Canvas canvas, Matrix matrix, int i);

    /* JADX WARN: Code duplicated, block: B:15:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:18:0x00eb A[LOOP:0: B:16:0x00e5->B:18:0x00eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0105  */
    /* JADX WARN: Code duplicated, block: B:24:0x010d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[SYNTHETIC] */
    fromMediaSession(prepare prepareVar, Layer layer) {
        Iterator<binderDied<MediaControllerCompatApi23, Path>> it;
        boolean z = true;
        setVolumeTo setvolumeto = new setVolumeTo(1);
        this.INotificationSideChannelDefault = setvolumeto;
        this.asBinder = new setVolumeTo(PorterDuff.Mode.CLEAR);
        this.MediaBrowserCompat = new RectF();
        this.cancel = new RectF();
        this.RemoteActionCompatParcelizer = new RectF();
        this.write = new RectF();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Matrix();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList();
        this.g = true;
        this.TuitionPaymentFragmentbindingInflater1 = prepareVar;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = layer;
        StringBuilder sb = new StringBuilder();
        sb.append(layer.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append("#draw");
        this.f905a = sb.toString();
        if (layer.f366a == Layer.MatteType.INVERT) {
            setvolumeto.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            setvolumeto.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        MediaControllerCompatCallbackStubCompat mediaControllerCompatCallbackStubCompat = new MediaControllerCompatCallbackStubCompat(layer.read);
        this.d = mediaControllerCompatCallbackStubCompat;
        mediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentbindingInflater1(this);
        if (layer.asBinder != null) {
            int i = getItem + 59;
            getNotifyChildrenChangedOptions = i % 128;
            if (i % 2 == 0) {
                int i2 = 5 / 0;
                if (!layer.asBinder.isEmpty()) {
                    MediaControllerCompatCallbackStubApi21 mediaControllerCompatCallbackStubApi21 = new MediaControllerCompatCallbackStubApi21(layer.asBinder);
                    this.cancelAll = mediaControllerCompatCallbackStubApi21;
                    it = mediaControllerCompatCallbackStubApi21.b.iterator();
                    int i3 = getItem + 47;
                    getNotifyChildrenChangedOptions = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 2 % 2;
                    while (it.hasNext()) {
                        it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
                    }
                    for (binderDied<Integer, Integer> binderdied : this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        if (binderdied != null) {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied);
                        }
                        binderdied.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
                    }
                }
            } else if (!layer.asBinder.isEmpty()) {
                MediaControllerCompatCallbackStubApi21 mediaControllerCompatCallbackStubApi22 = new MediaControllerCompatCallbackStubApi21(layer.asBinder);
                this.cancelAll = mediaControllerCompatCallbackStubApi22;
                it = mediaControllerCompatCallbackStubApi22.b.iterator();
                int i6 = getItem + 47;
                getNotifyChildrenChangedOptions = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                while (it.hasNext()) {
                    it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
                }
                while (r6.hasNext()) {
                    if (binderdied != null) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied);
                    }
                    binderdied.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
                }
            }
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isEmpty()) {
            if (true != this.g) {
                this.g = true;
                this.TuitionPaymentFragmentbindingInflater1.invalidateSelf();
            }
            int i9 = getItem + 43;
            getNotifyChildrenChangedOptions = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 86 / 0;
                return;
            }
            return;
        }
        onAudioInfoChanged onaudioinfochanged = new onAudioInfoChanged(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.b = onaudioinfochanged;
        onaudioinfochanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(new binderDied.b() { // from class: fromMediaSession.4
            @Override // binderDied.b
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                fromMediaSession frommediasession = fromMediaSession.this;
                boolean z2 = frommediasession.b.d() == 1.0f;
                if (z2 != frommediasession.g) {
                    frommediasession.g = z2;
                    frommediasession.TuitionPaymentFragmentbindingInflater1.invalidateSelf();
                }
            }
        });
        if (this.b.asInterface().floatValue() != 1.0f) {
            int i11 = getItem + 97;
            getNotifyChildrenChangedOptions = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            z = false;
        }
        if (z != this.g) {
            int i14 = getNotifyChildrenChangedOptions + 97;
            getItem = i14 % 128;
            if (i14 % 2 != 0) {
                this.g = z;
                this.TuitionPaymentFragmentbindingInflater1.invalidateSelf();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.g = z;
            this.TuitionPaymentFragmentbindingInflater1.invalidateSelf();
        }
        onAudioInfoChanged onaudioinfochanged2 = this.b;
        if (onaudioinfochanged2 != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(onaudioinfochanged2);
            int i15 = getNotifyChildrenChangedOptions + 101;
            getItem = i15 % 128;
            if (i15 % 2 != 0) {
                return;
            }
            int i16 = 2 % 2;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        fromMediaSession frommediasession = (fromMediaSession) objArr[0];
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 75;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        frommediasession.TuitionPaymentFragmentbindingInflater1.invalidateSelf();
        int i4 = getItem + 123;
        getNotifyChildrenChangedOptions = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(fromMediaSession frommediasession) {
        int i = 2 % 2;
        int i2 = getItem;
        int i3 = i2 + 1;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2;
        this.getInterfaceDescriptor = frommediasession;
        int i5 = i2 + 107;
        getNotifyChildrenChangedOptions = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    final void TuitionPaymentFragmentbindingInflater1(fromMediaSession frommediasession) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 123;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannelStubProxy = frommediasession;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = IconCompatParcelizer;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 31339), KeyEvent.normalizeMetaState(0) + 2994, 17 - View.resolveSizeAndState(0, 0, 0), 1182129903, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(read)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43324), View.getDefaultSize(0, 0) + 253, View.resolveSize(0, 0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i4 = 33602;
        int i5 = 1687675375;
        if (disconnect) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + i4), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3084, 26 - TextUtils.indexOf("", ""), -2146875848, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 33602;
                i5 = 1687675375;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!getRoot) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i6 = $11 + 111;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 % 1) % getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] / i] * iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 %= 0;
                } else {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i7 = $11 + 67;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 + 1) >>> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] << i] >> iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33650 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getJumpTapTimeout() >> 16) + 3085, 'J' - AndroidCharacter.getMirror('0'), -2146875848, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), TextUtils.getTrimmedLength("") + 3085, 26 - (Process.myPid() >> 22), -2146875848, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            int i8 = $11 + 97;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 / 2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Override // defpackage.unregisterCallbackListener
    public void b(RectF rectF, Matrix matrix, boolean z) {
        int i = 2 % 2;
        int i2 = getItem + 105;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        this.MediaBrowserCompat.set(0.0f, 0.0f, 0.0f, 0.0f);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), -1232273144, new Object[]{this}, AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), 1232273145);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(matrix);
        if (z) {
            int i4 = getNotifyChildrenChangedOptions;
            int i5 = i4 + 83;
            getItem = i5 % 128;
            if (i5 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            List<fromMediaSession> list = this.INotificationSideChannelStub;
            if (list != null) {
                int i6 = i4 + 89;
                getItem = i6 % 128;
                for (int size = i6 % 2 != 0 ? list.size() >> 1 : list.size() - 1; size >= 0; size--) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.preConcat(this.INotificationSideChannelStub.get(size).d.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                }
            } else {
                fromMediaSession frommediasession = this.INotificationSideChannelStubProxy;
                if (frommediasession != null) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.preConcat(frommediasession.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                }
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.preConcat(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    /* JADX WARN: Code duplicated, block: B:193:0x0964  */
    /* JADX WARN: Code duplicated, block: B:205:0x099c  */
    /* JADX WARN: Code duplicated, block: B:208:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:223:0x01d7 A[EDGE_INSN: B:223:0x01d7->B:64:0x01d7 BREAK  A[LOOP:1: B:39:0x0114->B:60:0x01c3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0163  */
    @Override // defpackage.unregisterCallbackListener
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Canvas canvas, Matrix matrix, int i) throws Throwable {
        MediaControllerCompatCallbackStubApi21 mediaControllerCompatCallbackStubApi21;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Object[] objArr;
        int i7;
        int i8 = 2;
        int i9 = 2 % 2;
        int i10 = 1;
        if (!this.g || this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b) {
            int i11 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
            if (i11 > 0) {
                prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i11 - 1;
                return;
            }
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), -1232273144, new Object[]{this}, AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), 1232273145);
        this.INotificationSideChannel.reset();
        this.INotificationSideChannel.set(matrix);
        for (int size = this.INotificationSideChannelStub.size() - 1; size >= 0; size--) {
            int i12 = getItem + 11;
            getNotifyChildrenChangedOptions = i12 % 128;
            int i13 = i12 % 2;
            this.INotificationSideChannel.preConcat(this.INotificationSideChannelStub.get(size).d.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        int i14 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i14 > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i14 - 1;
        }
        int iIntValue = (int) ((((i / 255.0f) * (this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1() == null ? 100 : this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().asInterface().intValue())) / 100.0f) * 255.0f);
        if (this.getInterfaceDescriptor == null) {
            mediaControllerCompatCallbackStubApi21 = this.cancelAll;
            if (mediaControllerCompatCallbackStubApi21 != null) {
            }
            int i15 = getItem + 23;
            getNotifyChildrenChangedOptions = i15 % 128;
            int i16 = i15 % 2;
            this.INotificationSideChannel.preConcat(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, this.INotificationSideChannel, iIntValue);
            i2 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
            if (i2 > 0) {
                prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i2 - 1;
            }
            i3 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
            if (i3 > 0) {
                prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i3 - 1;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(0.0f);
            return;
        }
        int i17 = getItem + 21;
        getNotifyChildrenChangedOptions = i17 % 128;
        if (i17 % 2 == 0) {
            mediaControllerCompatCallbackStubApi21 = this.cancelAll;
            if (mediaControllerCompatCallbackStubApi21 != null || mediaControllerCompatCallbackStubApi21.b.isEmpty()) {
                int i18 = getItem + 23;
                getNotifyChildrenChangedOptions = i18 % 128;
                int i19 = i18 % 2;
                this.INotificationSideChannel.preConcat(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, this.INotificationSideChannel, iIntValue);
                i2 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                if (i2 > 0) {
                    prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i2 - 1;
                }
                i3 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                if (i3 > 0) {
                    prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i3 - 1;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(0.0f);
                return;
            }
        }
        b(this.MediaBrowserCompat, this.INotificationSideChannel, false);
        RectF rectF = this.MediaBrowserCompat;
        if (this.getInterfaceDescriptor != null && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.f366a != Layer.MatteType.INVERT) {
            this.RemoteActionCompatParcelizer.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.getInterfaceDescriptor.b(this.RemoteActionCompatParcelizer, matrix, true);
            if (!rectF.intersect(this.RemoteActionCompatParcelizer)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        this.INotificationSideChannel.preConcat(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        RectF rectF2 = this.MediaBrowserCompat;
        Matrix matrix2 = this.INotificationSideChannel;
        this.cancel.set(0.0f, 0.0f, 0.0f, 0.0f);
        MediaControllerCompatCallbackStubApi21 mediaControllerCompatCallbackStubApi22 = this.cancelAll;
        int i20 = 5;
        if (mediaControllerCompatCallbackStubApi22 != null && !mediaControllerCompatCallbackStubApi22.b.isEmpty()) {
            int i21 = getItem + 13;
            getNotifyChildrenChangedOptions = i21 % 128;
            if (i21 % 2 != 0) {
                int size2 = this.cancelAll.TuitionPaymentFragmentbindingInflater1.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size2) {
                        if (!rectF2.intersect(this.cancel)) {
                            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                            break;
                        }
                        break;
                    }
                    Mask mask = this.cancelAll.TuitionPaymentFragmentbindingInflater1.get(i22);
                    this.connect.set(this.cancelAll.b.get(i22).asInterface());
                    this.connect.transform(matrix2);
                    int i23 = AnonymousClass3.TuitionPaymentFragmentbindingInflater1[mask.b.ordinal()];
                    if (i23 == i10 || i23 == 2) {
                        break;
                    }
                    int i24 = getNotifyChildrenChangedOptions;
                    int i25 = i24 + 117;
                    getItem = i25 % 128;
                    if (i25 % 2 == 0 ? i23 == 3 : i23 == i20) {
                        if (mask.TuitionPaymentFragmentbindingInflater1) {
                            break;
                        }
                    } else {
                        int i26 = i24 + 5;
                        getItem = i26 % 128;
                        int i27 = i26 % 2;
                        if (i23 == 4) {
                            if (mask.TuitionPaymentFragmentbindingInflater1) {
                                break;
                                break;
                            }
                        }
                    }
                    this.connect.computeBounds(this.write, false);
                    if (i22 == 0) {
                        int i28 = getNotifyChildrenChangedOptions + 73;
                        getItem = i28 % 128;
                        if (i28 % 2 != 0) {
                            this.cancel.set(this.write);
                            int i29 = 62 / 0;
                        } else {
                            this.cancel.set(this.write);
                        }
                    } else {
                        RectF rectF3 = this.cancel;
                        rectF3.set(Math.min(rectF3.left, this.write.left), Math.min(this.cancel.top, this.write.top), Math.max(this.cancel.right, this.write.right), Math.max(this.cancel.bottom, this.write.bottom));
                    }
                    i22++;
                    i10 = 1;
                    i20 = 5;
                }
            }
        }
        if (!this.MediaBrowserCompat.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
            int i30 = getItem + 81;
            getNotifyChildrenChangedOptions = i30 % 128;
            int i31 = i30 % 2;
            this.MediaBrowserCompat.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        int i32 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i32 > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i32 - 1;
        }
        if (this.MediaBrowserCompat.isEmpty()) {
            i4 = 1;
        } else {
            this.asInterface.setAlpha(255);
            onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, this.MediaBrowserCompat, this.asInterface);
            int i33 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
            if (i33 > 0) {
                i5 = 1;
                prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i33 - 1;
            } else {
                i5 = 1;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(canvas);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, this.INotificationSideChannel, iIntValue);
            int i34 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
            if (i34 > 0) {
                prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i34 - i5;
            }
            MediaControllerCompatCallbackStubApi21 mediaControllerCompatCallbackStubApi23 = this.cancelAll;
            if (mediaControllerCompatCallbackStubApi23 == null || mediaControllerCompatCallbackStubApi23.b.isEmpty()) {
                i6 = iIntValue;
            } else {
                Matrix matrix3 = this.INotificationSideChannel;
                onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, this.MediaBrowserCompat, this.notify);
                if (Build.VERSION.SDK_INT < 28) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(canvas);
                }
                int i35 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                if (i35 > 0) {
                    prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i35 - 1;
                }
                int i36 = 0;
                while (i36 < this.cancelAll.TuitionPaymentFragmentbindingInflater1.size()) {
                    Mask mask2 = this.cancelAll.TuitionPaymentFragmentbindingInflater1.get(i36);
                    binderDied<MediaControllerCompatApi23, Path> binderdied = this.cancelAll.b.get(i36);
                    binderDied<Integer, Integer> binderdied2 = this.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i36);
                    int i37 = AnonymousClass3.TuitionPaymentFragmentbindingInflater1[mask2.b.ordinal()];
                    if (i37 == 1) {
                        iIntValue = iIntValue;
                        i36 = i36;
                        if (!this.cancelAll.b.isEmpty()) {
                            int i38 = 0;
                            while (true) {
                                if (i38 >= this.cancelAll.TuitionPaymentFragmentbindingInflater1.size()) {
                                    this.asInterface.setAlpha(255);
                                    canvas.drawRect(this.MediaBrowserCompat, this.asInterface);
                                    break;
                                } else if (this.cancelAll.TuitionPaymentFragmentbindingInflater1.get(i38).b != Mask.MaskMode.MASK_MODE_NONE) {
                                    break;
                                } else {
                                    i38++;
                                }
                            }
                        }
                    } else if (i37 == i8) {
                        iIntValue = iIntValue;
                        i36 = i36;
                        if (i36 == 0) {
                            this.asInterface.setColor(ViewCompat.MEASURED_STATE_MASK);
                            this.asInterface.setAlpha(255);
                            canvas.drawRect(this.MediaBrowserCompat, this.asInterface);
                        }
                        if (mask2.TuitionPaymentFragmentbindingInflater1) {
                            onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, this.MediaBrowserCompat, this.onTransact);
                            canvas.drawRect(this.MediaBrowserCompat, this.asInterface);
                            this.onTransact.setAlpha((int) (binderdied2.asInterface().intValue() * 2.55f));
                            this.connect.set(binderdied.asInterface());
                            this.connect.transform(matrix3);
                            canvas.drawPath(this.connect, this.onTransact);
                            canvas.restore();
                        } else {
                            this.connect.set(binderdied.asInterface());
                            this.connect.transform(matrix3);
                            canvas.drawPath(this.connect, this.onTransact);
                        }
                    } else if (i37 == 3) {
                        iIntValue = iIntValue;
                        i36 = i36;
                        if (mask2.TuitionPaymentFragmentbindingInflater1) {
                            onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, this.MediaBrowserCompat, this.notify);
                            canvas.drawRect(this.MediaBrowserCompat, this.asInterface);
                            this.onTransact.setAlpha((int) (binderdied2.asInterface().intValue() * 2.55f));
                            this.connect.set(binderdied.asInterface());
                            this.connect.transform(matrix3);
                            canvas.drawPath(this.connect, this.onTransact);
                            canvas.restore();
                        } else {
                            onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, this.MediaBrowserCompat, this.notify);
                            this.connect.set(binderdied.asInterface());
                            this.connect.transform(matrix3);
                            this.asInterface.setAlpha((int) (binderdied2.asInterface().intValue() * 2.55f));
                            canvas.drawPath(this.connect, this.asInterface);
                            canvas.restore();
                        }
                    } else if (i37 != 4) {
                        iIntValue = iIntValue;
                        i36 = i36;
                    } else if (mask2.TuitionPaymentFragmentbindingInflater1) {
                        onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, this.MediaBrowserCompat, this.asInterface);
                        canvas.drawRect(this.MediaBrowserCompat, this.asInterface);
                        this.connect.set(binderdied.asInterface());
                        this.connect.transform(matrix3);
                        this.asInterface.setAlpha((int) (binderdied2.asInterface().intValue() * 2.55f));
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cMyTid = (char) (Process.myTid() >> 22);
                            int iLastIndexOf = 650 - TextUtils.lastIndexOf("", '0', 0);
                            int edgeSlop = 44 - (ViewConfiguration.getEdgeSlop() >> 16);
                            byte b = $$a[7];
                            byte b2 = b;
                            Object[] objArr2 = new Object[1];
                            c(b, b2, b2, objArr2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, iLastIndexOf, edgeSlop, -459846511, false, (String) objArr2[0], null);
                        }
                        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                        Object[] objArr3 = new Object[1];
                        e(null, null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        e(null, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
                        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int doubleTapTimeout = 651 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i39 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43;
                            byte b3 = $$a[5];
                            Object[] objArr5 = new Object[1];
                            c(b3, (byte) 52, b3, objArr5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, doubleTapTimeout, i39, -873460649, false, (String) objArr5[0], null);
                        }
                        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                            int i40 = getNotifyChildrenChangedOptions + 19;
                            getItem = i40 % 128;
                            int i41 = i40 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                int i42 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651;
                                int gidForName = 43 - Process.getGidForName("");
                                byte[] bArr = $$a;
                                byte b4 = bArr[5];
                                Object[] objArr6 = new Object[1];
                                c(b4, (byte) (b4 | 14), bArr[7], objArr6);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i42, gidForName, -1595579076, false, (String) objArr6[0], null);
                            }
                            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                            int i43 = ((int[]) objArr7[2])[0];
                            int i44 = ((int[]) objArr7[0])[0];
                            int iIdentityHashCode = System.identityHashCode(this);
                            int i45 = ~iIdentityHashCode;
                            int i46 = 1039129555 + (((~(333165061 | i45)) | (~((-336595872) | iIdentityHashCode))) * 1900) + (((~(i45 | 336595871)) | (~(iIdentityHashCode | (-333165062)))) * (-950)) + (((~(iIdentityHashCode | 336595871)) | (~(i45 | (-333165062)))) * 950) + 603549883;
                            int i47 = (i46 << 13) ^ i46;
                            int i48 = i47 ^ (i47 >>> 17);
                            ((int[]) objArr[3])[0] = i48 ^ (i48 << 5);
                            i7 = 0;
                        } else {
                            try {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.getTrimmedLength(""), TextUtils.indexOf("", "", 0, 0) + 1610, 25 - TextUtils.lastIndexOf("", '0', 0, 0), 2145681644, false, null, new Class[0]);
                                }
                                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 603549883, 0};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                    int iIndexOf = TextUtils.indexOf("", "", 0) + 651;
                                    int scrollDefaultDelay = 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    byte b5 = $$a[5];
                                    Object[] objArr9 = new Object[1];
                                    c(b5, (byte) 52, b5, objArr9);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, iIndexOf, scrollDefaultDelay, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), AndroidCharacter.getMirror('0') + 647, KeyEvent.keyCodeFromString("") + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63405 - MotionEvent.axisFromString("")), 793 - ((Process.getThreadPriority(0) + 20) >> 6), View.resolveSize(0, 0) + 83), Integer.TYPE, Integer.TYPE});
                                }
                                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                    int offsetBefore = 651 - TextUtils.getOffsetBefore("", 0);
                                    int iIndexOf2 = 44 - TextUtils.indexOf("", "");
                                    byte[] bArr2 = $$a;
                                    byte b6 = bArr2[5];
                                    Object[] objArr10 = new Object[1];
                                    c(b6, (byte) (b6 | 14), bArr2[7], objArr10);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, offsetBefore, iIndexOf2, -1595579076, false, (String) objArr10[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                                try {
                                    Object[] objArr11 = new Object[1];
                                    e(null, null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr11);
                                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                                    Object[] objArr12 = new Object[1];
                                    e(null, null, 126 - TextUtils.lastIndexOf("", '0'), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr12);
                                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                        char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int fadingEdgeLength = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int size3 = 44 - View.MeasureSpec.getSize(0);
                                        byte b7 = $$a[5];
                                        Object[] objArr13 = new Object[1];
                                        c(b7, (byte) 52, b7, objArr13);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, fadingEdgeLength, size3, -873460649, false, (String) objArr13[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 651;
                                        int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 44;
                                        byte b8 = $$a[7];
                                        byte b9 = b8;
                                        Object[] objArr14 = new Object[1];
                                        c(b8, b9, b9, objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMakeMeasureSpec, longPressTimeout, longPressTimeout2, -459846511, false, (String) objArr14[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                                    i7 = 0;
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
                        int i49 = ((int[]) objArr[i7])[i7];
                        int i50 = ((int[]) objArr[2])[i7];
                        if (i50 == i49) {
                            Object[] objArr15 = new Object[4];
                            int[] iArr = new int[1];
                            objArr15[i7] = iArr;
                            int[] iArr2 = new int[1];
                            objArr15[2] = iArr2;
                            objArr15[3] = new int[1];
                            int i51 = ((int[]) objArr[3])[i7];
                            int i52 = ((int[]) objArr[2])[i7];
                            int i53 = ((int[]) objArr[i7])[i7];
                            iArr2[i7] = i52;
                            iArr[i7] = i53;
                            objArr15[1] = new String[i7];
                            int i54 = ~System.identityHashCode(this);
                            int i55 = i51 + (-760152250) + ((~((-822804865) | i54)) * (-783)) + (((~(i54 | (-823869929))) | (-827300739)) * 783);
                            int i56 = (i55 << 13) ^ i55;
                            int i57 = i56 ^ (i56 >>> 17);
                            ((int[]) objArr15[3])[0] = i57 ^ (i57 << 5);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr[1];
                            if (strArr != null) {
                                for (String str : strArr) {
                                    arrayList.add(str);
                                }
                            }
                            int[] iArr3 = new int[i50];
                            int i58 = i50 - 1;
                            iArr3[i58] = 1;
                            Toast.makeText((Context) null, iArr3[((i50 * i58) % 2) - 1], 1).show();
                            int i59 = ((int[]) objArr[3])[0];
                            int i60 = ((int[]) objArr[2])[0];
                            int i61 = ((int[]) objArr[0])[0];
                            new int[1][0] = i60;
                            new int[1][0] = i61;
                            int i62 = i59 + (-353737388) + ((~((~i) | (-92819734))) * 433) + (((~(92928413 | i)) | (-96359224)) * (-433)) + (((~((-96359224) | i)) | 108680) * 433);
                            int i63 = (i62 << 13) ^ i62;
                            int i64 = i63 ^ (i63 >>> 17);
                            int[] iArr4 = {i64 ^ (i64 << 5)};
                        }
                        canvas.drawPath(this.connect, this.onTransact);
                        canvas.restore();
                    } else {
                        iIntValue = iIntValue;
                        i36 = i36;
                        this.connect.set(binderdied.asInterface());
                        this.connect.transform(matrix3);
                        this.asInterface.setAlpha((int) (binderdied2.asInterface().intValue() * 2.55f));
                        canvas.drawPath(this.connect, this.asInterface);
                    }
                    i36++;
                    iIntValue = iIntValue;
                    i8 = 2;
                }
                i6 = iIntValue;
                canvas.restore();
                int i65 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                if (i65 > 0) {
                    prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i65 - 1;
                }
            }
            if (this.getInterfaceDescriptor != null) {
                onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, this.MediaBrowserCompat, this.INotificationSideChannelDefault);
                int i66 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                if (i66 > 0) {
                    prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i66 - 1;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(canvas);
                this.getInterfaceDescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, matrix, i6);
                canvas.restore();
                int i67 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                if (i67 > 0) {
                    prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i67 - 1;
                }
                int i68 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                if (i68 > 0) {
                    int i69 = getItem + 11;
                    getNotifyChildrenChangedOptions = i69 % 128;
                    int i70 = i69 % 2;
                    i4 = 1;
                    prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i68 - 1;
                } else {
                    i4 = 1;
                }
            } else {
                i4 = 1;
            }
            canvas.restore();
            int i71 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
            if (i71 > 0) {
                prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i71 - i4;
            }
        }
        int i72 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i72 > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i72 - i4;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(0.0f);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(float f) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 73;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        sendMediaButton sendmediabutton = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.cancelAll;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (sendmediabutton.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            int i4 = getItem + 73;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            onSetShuffleMode onsetshufflemode = sendmediabutton.b.get(str);
            if (onsetshufflemode == null) {
                onsetshufflemode = new onSetShuffleMode();
                sendmediabutton.b.put(str, onsetshufflemode);
            }
            float f2 = onsetshufflemode.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 0.0f;
            onsetshufflemode.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = f2;
            int i6 = onsetshufflemode.b + 1;
            onsetshufflemode.b = i6;
            if (i6 == Integer.MAX_VALUE) {
                onsetshufflemode.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = f2 / 2.0f;
                onsetshufflemode.b = i6 / 2;
            }
            if (!(!str.equals("__container"))) {
                int i7 = getItem + 95;
                getNotifyChildrenChangedOptions = i7 % 128;
                if (i7 % 2 == 0) {
                    sendmediabutton.TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i8 = getItem + 123;
                getNotifyChildrenChangedOptions = i8 % 128;
                int i9 = i8 % 2;
                for (sendMediaButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 : sendmediabutton.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                }
            }
        }
        int i10 = getItem + 7;
        getNotifyChildrenChangedOptions = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0058 A[PHI: r10
  0x0058: PHI (r10v2 int) = (r10v1 int), (r10v8 int) binds: [B:8:0x0056, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Canvas canvas) {
        int i;
        int i2 = 2 % 2;
        int i3 = getItem + 53;
        getNotifyChildrenChangedOptions = i3 % 128;
        if (i3 % 2 == 0) {
            canvas.drawRect(this.MediaBrowserCompat.left + 1.0f, this.MediaBrowserCompat.top / 0.0f, this.MediaBrowserCompat.right * 2.0f, this.MediaBrowserCompat.bottom / 0.0f, this.asBinder);
            i = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
            if (i > 0) {
                prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i - 1;
            }
        } else {
            canvas.drawRect(this.MediaBrowserCompat.left - 1.0f, this.MediaBrowserCompat.top - 1.0f, this.MediaBrowserCompat.right + 1.0f, this.MediaBrowserCompat.bottom + 1.0f, this.asBinder);
            i = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
            if (i > 0) {
                prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i - 1;
            }
        }
        int i4 = getItem + 49;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: fromMediaSession$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] TuitionPaymentFragmentbindingInflater1;
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            TuitionPaymentFragmentbindingInflater1 = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    void b(float f) {
        int i = 2 % 2;
        MediaControllerCompatCallbackStubCompat mediaControllerCompatCallbackStubCompat = this.d;
        binderDied<Integer, Integer> binderdied = mediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentbindingInflater1;
        Object obj = null;
        if (binderdied != null) {
            int i2 = getItem + 107;
            getNotifyChildrenChangedOptions = i2 % 128;
            if (i2 % 2 == 0) {
                binderdied.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
                throw null;
            }
            binderdied.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
            int i3 = getItem + 67;
            getNotifyChildrenChangedOptions = i3 % 128;
            int i4 = i3 % 2;
        }
        binderDied<?, Float> binderdied2 = mediaControllerCompatCallbackStubCompat.asInterface;
        if (binderdied2 != null) {
            binderdied2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
        }
        binderDied<?, Float> binderdied3 = mediaControllerCompatCallbackStubCompat.b;
        if (binderdied3 != null) {
            binderdied3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
        }
        binderDied<PointF, PointF> binderdied4 = mediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (binderdied4 != null) {
            binderdied4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
        }
        binderDied<?, PointF> binderdied5 = mediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (binderdied5 != null) {
            binderdied5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
        }
        binderDied<onStop, onStop> binderdied6 = mediaControllerCompatCallbackStubCompat.g;
        if (binderdied6 != null) {
            binderdied6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
        }
        binderDied<Float, Float> binderdied7 = mediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = 0;
        if (binderdied7 != null) {
            int i6 = getItem + 5;
            getNotifyChildrenChangedOptions = i6 % 128;
            if (i6 % 2 == 0) {
                binderdied7.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
                int i7 = 63 / 0;
            } else {
                binderdied7.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
            }
            int i8 = getItem + 49;
            getNotifyChildrenChangedOptions = i8 % 128;
            int i9 = i8 % 2;
        }
        onAudioInfoChanged onaudioinfochanged = mediaControllerCompatCallbackStubCompat.d;
        if (onaudioinfochanged != null) {
            onaudioinfochanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
        }
        onAudioInfoChanged onaudioinfochanged2 = mediaControllerCompatCallbackStubCompat.f176a;
        if (onaudioinfochanged2 != null) {
            int i10 = getNotifyChildrenChangedOptions + 61;
            getItem = i10 % 128;
            if (i10 % 2 != 0) {
                onaudioinfochanged2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
                obj.hashCode();
                throw null;
            }
            onaudioinfochanged2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
        }
        if (this.cancelAll != null) {
            for (int i11 = 0; i11 < this.cancelAll.b.size(); i11++) {
                this.cancelAll.b.get(i11).TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
            }
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.MediaBrowserCompat != 0.0f) {
            int i12 = getNotifyChildrenChangedOptions + 45;
            getItem = i12 % 128;
            f = i12 % 2 != 0 ? f + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.MediaBrowserCompat : f / this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.MediaBrowserCompat;
        }
        onAudioInfoChanged onaudioinfochanged3 = this.b;
        if (onaudioinfochanged3 != null) {
            int i13 = getNotifyChildrenChangedOptions + 31;
            getItem = i13 % 128;
            if (i13 % 2 != 0) {
                onaudioinfochanged3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.MediaBrowserCompat * f);
            } else {
                onaudioinfochanged3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f / this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.MediaBrowserCompat);
            }
        }
        fromMediaSession frommediasession = this.getInterfaceDescriptor;
        if (frommediasession != null) {
            this.getInterfaceDescriptor.b(frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault2.MediaBrowserCompat * f);
        }
        while (i5 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size()) {
            int i14 = getItem + 79;
            getNotifyChildrenChangedOptions = i14 % 128;
            if (i14 % 2 == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i5).TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
                i5 += 127;
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i5).TuitionPaymentFragmentspecialinlinedviewModeldefault2(f);
                i5++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r6.INotificationSideChannelStubProxy == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r3 = r3 + 81;
        defpackage.fromMediaSession.getNotifyChildrenChangedOptions = r3 % 128;
        r3 = r3 % 2;
        r6.INotificationSideChannelStub = java.util.Collections.emptyList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r6.INotificationSideChannelStub = new java.util.ArrayList();
        r0 = r6.INotificationSideChannelStubProxy;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r6.INotificationSideChannelStub.add(r0);
        r0 = r0.INotificationSideChannelStubProxy;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r6.INotificationSideChannelStubProxy == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Object[] r6) {
        /*
            r0 = 0
            r6 = r6[r0]
            fromMediaSession r6 = (defpackage.fromMediaSession) r6
            r1 = 2
            int r2 = r1 % r1
            int r2 = defpackage.fromMediaSession.getNotifyChildrenChangedOptions
            int r3 = r2 + 125
            int r4 = r3 % 128
            defpackage.fromMediaSession.getItem = r4
            int r3 = r3 % r1
            java.util.List<fromMediaSession> r3 = r6.INotificationSideChannelStub
            r4 = 0
            if (r3 != 0) goto L4c
            int r2 = r2 + 65
            int r3 = r2 % 128
            defpackage.fromMediaSession.getItem = r3
            int r2 = r2 % r1
            if (r2 == 0) goto L27
            fromMediaSession r2 = r6.INotificationSideChannelStubProxy
            r5 = 90
            int r5 = r5 / r0
            if (r2 != 0) goto L39
            goto L2b
        L27:
            fromMediaSession r0 = r6.INotificationSideChannelStubProxy
            if (r0 != 0) goto L39
        L2b:
            int r3 = r3 + 81
            int r0 = r3 % 128
            defpackage.fromMediaSession.getNotifyChildrenChangedOptions = r0
            int r3 = r3 % r1
            java.util.List r0 = java.util.Collections.emptyList()
            r6.INotificationSideChannelStub = r0
            return r4
        L39:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.INotificationSideChannelStub = r0
            fromMediaSession r0 = r6.INotificationSideChannelStubProxy
        L42:
            if (r0 == 0) goto L4c
            java.util.List<fromMediaSession> r1 = r6.INotificationSideChannelStub
            r1.add(r0)
            fromMediaSession r0 = r0.INotificationSideChannelStubProxy
            goto L42
        L4c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fromMediaSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Object[]):java.lang.Object");
    }

    @Override // defpackage.setRepeatMode
    public final String b() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 111;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = getNotifyChildrenChangedOptions + 81;
        getItem = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override // defpackage.getAudioStream
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, int i, List<MediaControllerCompatPlaybackInfo> list, MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo2) {
        int i2 = 2 % 2;
        int i3 = getItem + 97;
        getNotifyChildrenChangedOptions = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 85 / 0;
            if (!mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i)) {
                return;
            }
        } else if (!mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i)) {
            return;
        }
        if (!"__container".equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo3 = new MediaControllerCompatPlaybackInfo(mediaControllerCompatPlaybackInfo2);
            mediaControllerCompatPlaybackInfo3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(str);
            if (mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i)) {
                MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo4 = new MediaControllerCompatPlaybackInfo(mediaControllerCompatPlaybackInfo3);
                mediaControllerCompatPlaybackInfo4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this;
                list.add(mediaControllerCompatPlaybackInfo4);
                int i5 = getNotifyChildrenChangedOptions + 5;
                getItem = i5 % 128;
                int i6 = i5 % 2;
            }
            mediaControllerCompatPlaybackInfo2 = mediaControllerCompatPlaybackInfo3;
        }
        if (mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i)) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaControllerCompatPlaybackInfo, i + mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i), list, mediaControllerCompatPlaybackInfo2);
        }
    }

    public <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 7;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        this.d.TuitionPaymentFragmentbindingInflater1(t, mediaSessionCompatCallbackCallbackHandler);
        int i4 = getItem + 41;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentbindingInflater1 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), -1232273144, new Object[]{this}, AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, 1232273145);
    }

    @Override // binderDied.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iTuitionPaymentFragmentbindingInflater1 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), 2024687341, new Object[]{this}, AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, -2024687341);
    }

    void TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, int i, List<MediaControllerCompatPlaybackInfo> list, MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo2) {
        int i2 = 2 % 2;
        int i3 = getItem + 111;
        getNotifyChildrenChangedOptions = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.setRepeatMode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<setRepeatMode> list, List<setRepeatMode> list2) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 123;
        getItem = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = defpackage.fromMediaSession.$$c
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r8 = r8 + 67
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fromMediaSession.$$g(short, byte, byte):java.lang.String");
    }
}
