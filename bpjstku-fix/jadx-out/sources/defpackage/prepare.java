package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import com.google.android.gms.internal.mlkit_common.zzin;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class prepare extends Drawable implements Drawable.Callback, Animatable {
    public final ArrayList<TuitionPaymentFragmentspecialinlinedviewModeldefault1> INotificationSideChannel;
    private final Set<Object> INotificationSideChannelDefault;
    private int INotificationSideChannelStub;
    public boolean INotificationSideChannelStubProxy;
    private boolean IconCompatParcelizer;
    private final ValueAnimator.AnimatorUpdateListener MediaBrowserCompat;
    public setCaptioningEnabled RemoteActionCompatParcelizer;
    ensureClassLoader TuitionPaymentFragmentbindingInflater1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public previous TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public playFromMediaId TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1323a;
    public String asBinder;
    public MediaControllerCompatMediaControllerImplApi23 asInterface;
    public final onRemoveQueueItemAt b;
    public boolean cancel;
    public boolean cancelAll;
    private final Matrix connect = new Matrix();
    public MediaControllerCompatMediaControllerImplApi24 d;
    public play g;
    public ImageView.ScaleType getInterfaceDescriptor;
    public float notify;
    public boolean onTransact;
    private static final byte[] $$c = {39, 27, 2, 54};
    private static final int $$d = 74;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {21, 65, -9, -121, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 20;
    private static int getNotifyChildrenChangedOptions = 0;
    private static int getRoot = 1;
    private static char[] read = {60048, 60052, 60059, 60051, 60072, 60088, 60053, 60056, 60073, 60062, 60057, 60047, 60063, 60034, 60043, 60050, 60040, 60061, 60060, 60041, 59745, 60055, 60117, 60054, 60058};
    private static char write = 57188;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i4)) | i5;
        int i9 = i4 | i5 | i7;
        int i10 = i5 + i6 + i2 + (1159740906 * i3) + ((-617157175) * i);
        int i11 = i10 * i10;
        int i12 = ((i5 * 934236018) - 2089811968) + (934236018 * i6) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i2) + (1488977920 * i3) + (2111832064 * i) + (2070937600 * i11);
        int i13 = (i5 * (-824977050)) + 1921657099 + (i6 * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + (i2 * (-824977973)) + (i3 * (-135083378)) + (i * 1125239651) + (i11 * 298844160);
        switch (i12 + (i13 * i13 * 2098200576)) {
            case 1:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 4:
                return b(objArr);
            case 5:
                return d(objArr);
            case 6:
                return asBinder(objArr);
            default:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.prepare.$$a
            int r1 = 53 - r7
            int r8 = r8 * 52
            int r8 = r8 + 4
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2f
        L16:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2f:
            int r8 = r8 + r6
            int r8 = r8 + (-11)
            int r6 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prepare.c(byte, int, short, java.lang.Object[]):void");
    }

    public prepare() {
        onRemoveQueueItemAt onremovequeueitemat = new onRemoveQueueItemAt();
        this.b = onremovequeueitemat;
        this.notify = 1.0f;
        this.INotificationSideChannelStubProxy = true;
        this.cancelAll = false;
        this.INotificationSideChannelDefault = new HashSet();
        this.INotificationSideChannel = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: prepare.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (prepare.this.TuitionPaymentFragmentbindingInflater1 != null) {
                    prepare.this.TuitionPaymentFragmentbindingInflater1.b(prepare.this.b.b());
                }
            }
        };
        this.MediaBrowserCompat = animatorUpdateListener;
        this.INotificationSideChannelStub = 255;
        this.IconCompatParcelizer = true;
        this.onTransact = false;
        onremovequeueitemat.addUpdateListener(animatorUpdateListener);
    }

    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = read;
        int i5 = 1770390596;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 23;
                $11 = i7 % 128;
                if (i7 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 2267 - TextUtils.getOffsetBefore("", 0), 33 - KeyEvent.getDeadChar(0, 0), -1927765101, false, $$e(b2, b3, (byte) (b3 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(obj, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2266, ((Process.getThreadPriority(0) + 20) >> 6) + 33, -1927765101, false, $$e(b4, b5, (byte) (b5 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i6++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
                i5 = 1770390596;
                obj = null;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(write)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b6 = (byte) 0;
            byte b7 = (byte) (b6 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), 2267 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33, -1927765101, false, $$e(b6, b7, (byte) (b7 - 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $10 + 45;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                i2 = i + 122;
                cArr4[i2] = (char) (cArr[i2] << b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                } else {
                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cBlue = (char) (49267 - Color.blue(0));
                        int scrollBarFadeDuration = 3261 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iIndexOf = 29 - TextUtils.indexOf((CharSequence) "", '0');
                        byte b8 = $$c[2];
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, scrollBarFadeDuration, iIndexOf, -127612708, false, $$e((byte) 0, b8, (byte) (b8 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 22879), 594 - (ViewConfiguration.getWindowTouchSlop() >> 8), 17 - View.MeasureSpec.makeMeasureSpec(0, 0), 1570859318, false, $$e(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i9];
                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                        int i10 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                        int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i10];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                    } else {
                        int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                        int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i12];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
            }
        }
        int i14 = 0;
        while (i14 < i) {
            int i15 = $10 + 13;
            int i16 = i15 % 128;
            $11 = i16;
            int i17 = i15 % 2;
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
            i14++;
            int i18 = i16 + 101;
            $10 = i18 % 128;
            int i19 = i18 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        this.TuitionPaymentFragmentbindingInflater1 = new ensureClassLoader(this, MediaSessionCompat2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i2 = getRoot + 91;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        prepare prepareVar = (prepare) objArr[0];
        int i = 2 % 2;
        int i2 = getRoot + 111;
        getNotifyChildrenChangedOptions = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            prepareVar.b.isRunning();
            obj.hashCode();
            throw null;
        }
        if (prepareVar.b.isRunning()) {
            int i3 = getRoot + 71;
            getNotifyChildrenChangedOptions = i3 % 128;
            if (i3 % 2 != 0) {
                prepareVar.b.cancel();
                throw null;
            }
            prepareVar.b.cancel();
        }
        prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        prepareVar.TuitionPaymentFragmentbindingInflater1 = null;
        prepareVar.asInterface = null;
        onRemoveQueueItemAt onremovequeueitemat = prepareVar.b;
        onremovequeueitemat.TuitionPaymentFragmentbindingInflater1 = null;
        onremovequeueitemat.b = -2.1474836E9f;
        onremovequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2.1474836E9f;
        prepareVar.invalidateSelf();
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        prepare prepareVar = (prepare) objArr[0];
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 81;
        int i3 = i2 % 128;
        getRoot = i3;
        int i4 = i2 % 2;
        if (!prepareVar.onTransact) {
            int i5 = i3 + 111;
            getNotifyChildrenChangedOptions = i5 % 128;
            int i6 = i5 % 2;
            prepareVar.onTransact = true;
            Drawable.Callback callback = prepareVar.getCallback();
            if (callback != null) {
                callback.invalidateDrawable(prepareVar);
            }
        }
        int i7 = getRoot + 89;
        getNotifyChildrenChangedOptions = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        prepare prepareVar = (prepare) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = getRoot + 71;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        prepareVar.INotificationSideChannelStub = iIntValue;
        prepareVar.invalidateSelf();
        int i4 = getRoot + 23;
        getNotifyChildrenChangedOptions = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions;
        int i3 = i2 + 51;
        getRoot = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.INotificationSideChannelStub;
        int i6 = i2 + 31;
        getRoot = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 121;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        onSetCaptioningEnabled.b("Use addColorFilter instead.");
        int i4 = getNotifyChildrenChangedOptions + 97;
        getRoot = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) throws Throwable {
        int i = 2 % 2;
        int i2 = getRoot + 33;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            this.onTransact = false;
            if (this.cancelAll) {
                try {
                    b(canvas);
                    int i3 = getNotifyChildrenChangedOptions + 123;
                    getRoot = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Throwable unused) {
                    onSetCaptioningEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
            } else {
                b(canvas);
            }
        } else {
            this.onTransact = false;
            if (this.cancelAll) {
                b(canvas);
                int i5 = getNotifyChildrenChangedOptions + 123;
                getRoot = i5 % 128;
                int i6 = i5 % 2;
            } else {
                b(canvas);
            }
        }
        int i7 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i7 > 0) {
            int i8 = getRoot + 119;
            getNotifyChildrenChangedOptions = i8 % 128;
            int i9 = i8 % 2;
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i7 - 1;
        }
    }

    private void b(Canvas canvas) throws Throwable {
        float f;
        float f2;
        int i = 2 % 2;
        int iSave = -1;
        if (ImageView.ScaleType.FIT_XY != this.getInterfaceDescriptor) {
            if (this.TuitionPaymentFragmentbindingInflater1 != null) {
                float f3 = this.notify;
                float fMin = Math.min(canvas.getWidth() / this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.width(), canvas.getHeight() / this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.height());
                if (f3 > fMin) {
                    f = this.notify / fMin;
                    f3 = fMin;
                } else {
                    int i2 = getNotifyChildrenChangedOptions + 77;
                    getRoot = i2 % 128;
                    int i3 = i2 % 2;
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    iSave = canvas.save();
                    float fWidth = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.width() / 2.0f;
                    float fHeight = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.height() / 2.0f;
                    float f4 = fWidth * f3;
                    float f5 = fHeight * f3;
                    float f6 = this.notify;
                    canvas.translate((fWidth * f6) - f4, (f6 * fHeight) - f5);
                    canvas.scale(f, f, f4, f5);
                }
                this.connect.reset();
                this.connect.preScale(f3, f3);
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, this.connect, this.INotificationSideChannelStub);
                if (iSave > 0) {
                    canvas.restoreToCount(iSave);
                    return;
                }
                return;
            }
            return;
        }
        if (this.TuitionPaymentFragmentbindingInflater1 != null) {
            int i4 = getRoot + 91;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            Rect bounds = getBounds();
            float fWidth2 = bounds.width() / this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.width();
            float fHeight2 = bounds.height() / this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.height();
            if (!(!this.IconCompatParcelizer)) {
                float fMin2 = Math.min(fWidth2, fHeight2);
                if (fMin2 < 1.0f) {
                    int i6 = getRoot + 109;
                    getNotifyChildrenChangedOptions = i6 % 128;
                    int i7 = i6 % 2;
                    f2 = 1.0f / fMin2;
                    fWidth2 /= f2;
                    fHeight2 /= f2;
                } else {
                    f2 = 1.0f;
                }
                if (f2 > 1.0f) {
                    int i8 = getRoot + 83;
                    getNotifyChildrenChangedOptions = i8 % 128;
                    int i9 = i8 % 2;
                    iSave = canvas.save();
                    float fWidth3 = bounds.width() / 2.0f;
                    float fHeight3 = bounds.height() / 2.0f;
                    float f7 = fWidth3 * fMin2;
                    float f8 = fMin2 * fHeight3;
                    canvas.translate(fWidth3 - f7, fHeight3 - f8);
                    canvas.scale(f2, f2, f7, f8);
                }
            }
            this.connect.reset();
            this.connect.preScale(fWidth2, fHeight2);
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, this.connect, this.INotificationSideChannelStub);
            if (iSave > 0) {
                int i10 = getRoot + 3;
                getNotifyChildrenChangedOptions = i10 % 128;
                int i11 = i10 % 2;
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 55;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = getNotifyChildrenChangedOptions + 53;
        getRoot = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        int i = 2 % 2;
        int i2 = getRoot + 53;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannel.clear();
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i4 = getRoot + 19;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        int i = 2 % 2;
        int i2 = getRoot + 121;
        int i3 = i2 % 128;
        getNotifyChildrenChangedOptions = i3;
        int i4 = i2 % 2;
        onRemoveQueueItemAt onremovequeueitemat = this.b;
        if (onremovequeueitemat == null) {
            int i5 = i3 + 33;
            int i6 = i5 % 128;
            getRoot = i6;
            boolean z = !(i5 % 2 != 0);
            int i7 = i6 + 25;
            getNotifyChildrenChangedOptions = i7 % 128;
            int i8 = i7 % 2;
            return z;
        }
        boolean zIsRunning = onremovequeueitemat.isRunning();
        int i9 = getNotifyChildrenChangedOptions + 105;
        getRoot = i9 % 128;
        int i10 = i9 % 2;
        return zIsRunning;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        float fD;
        int i = 2 % 2;
        int i2 = getRoot;
        int i3 = i2 + 57;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2;
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            this.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.10
                @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                    prepare.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
            });
            int i5 = getRoot + 71;
            getNotifyChildrenChangedOptions = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 17 / 0;
                return;
            }
            return;
        }
        if (this.INotificationSideChannelStubProxy) {
            this.b.a();
        } else {
            int i7 = i2 + 125;
            getNotifyChildrenChangedOptions = i7 % 128;
            int i8 = i7 % 2;
            if (this.b.getRepeatCount() == 0) {
                this.b.a();
            }
        }
        if (!this.INotificationSideChannelStubProxy) {
            int i9 = getNotifyChildrenChangedOptions + 97;
            getRoot = i9 % 128;
            if (i9 % 2 != 0 ? this.b.d >= 0.0f : this.b.d >= 2.0f) {
                fD = g();
            } else {
                int i10 = getRoot + 77;
                getNotifyChildrenChangedOptions = i10 % 128;
                if (i10 % 2 != 0) {
                    fD = d();
                    int i11 = 41 / 0;
                } else {
                    fD = d();
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) fD);
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    public final void asInterface() {
        float fG;
        int i = 2 % 2;
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            this.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.6
                @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                    prepare.this.asInterface();
                }
            });
            return;
        }
        if (this.INotificationSideChannelStubProxy) {
            this.b.g();
        } else {
            int i2 = getNotifyChildrenChangedOptions + 1;
            getRoot = i2 % 128;
            if (i2 % 2 == 0) {
                this.b.getRepeatCount();
                throw null;
            }
            if (this.b.getRepeatCount() == 0) {
                this.b.g();
            }
        }
        if (this.INotificationSideChannelStubProxy) {
            return;
        }
        if (this.b.d < 0.0f) {
            int i3 = getRoot + 63;
            getNotifyChildrenChangedOptions = i3 % 128;
            if (i3 % 2 != 0) {
                d();
                throw null;
            }
            fG = d();
        } else {
            fG = g();
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) fG);
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i4 = getNotifyChildrenChangedOptions + 89;
        getRoot = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final int i) {
        int i2 = 2 % 2;
        int i3 = getNotifyChildrenChangedOptions + 95;
        getRoot = i3 % 128;
        int i4 = i3 % 2;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            this.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.11
                @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                    prepare.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
                }
            });
            return;
        }
        onRemoveQueueItemAt onremovequeueitemat = this.b;
        onremovequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, (int) onremovequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i5 = getNotifyChildrenChangedOptions + 5;
        getRoot = i5 % 128;
        int i6 = i5 % 2;
    }

    private float d() {
        onRemoveQueueItemAt onremovequeueitemat;
        previous previousVar;
        int i = 2 % 2;
        int i2 = getRoot + 57;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            onremovequeueitemat = this.b;
            previousVar = onremovequeueitemat.TuitionPaymentFragmentbindingInflater1;
            int i3 = 20 / 0;
            if (previousVar == null) {
                return 0.0f;
            }
        } else {
            onremovequeueitemat = this.b;
            previousVar = onremovequeueitemat.TuitionPaymentFragmentbindingInflater1;
            if (previousVar == null) {
                return 0.0f;
            }
        }
        float f = onremovequeueitemat.b;
        if (f == -2.1474836E9f) {
            int i4 = getNotifyChildrenChangedOptions + 23;
            getRoot = i4 % 128;
            if (i4 % 2 != 0) {
                return previousVar.onTransact;
            }
            int i5 = 47 / 0;
            return previousVar.onTransact;
        }
        int i6 = getNotifyChildrenChangedOptions + 125;
        getRoot = i6 % 128;
        int i7 = i6 % 2;
        return f;
    }

    public final void b(final float f) {
        int i = 2 % 2;
        int i2 = getRoot + 99;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        previous previousVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (previousVar != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2((int) onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(previousVar.onTransact, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, f));
            return;
        }
        this.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.13
            @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                prepare.this.b(f);
            }
        });
        int i4 = getNotifyChildrenChangedOptions + 69;
        getRoot = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final int i) {
        int i2 = 2 % 2;
        int i3 = getNotifyChildrenChangedOptions + 13;
        getRoot = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            this.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.14
                @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                    prepare.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
                }
            });
            return;
        }
        onRemoveQueueItemAt onremovequeueitemat = this.b;
        onremovequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onremovequeueitemat.b, i + 0.99f);
        int i4 = getRoot + 29;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private float g() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 7;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        onRemoveQueueItemAt onremovequeueitemat = this.b;
        previous previousVar = onremovequeueitemat.TuitionPaymentFragmentbindingInflater1;
        if (previousVar == null) {
            int i4 = getRoot + 91;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            return 0.0f;
        }
        float f = onremovequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (f != 2.1474836E9f) {
            return f;
        }
        int i6 = getRoot + 17;
        getNotifyChildrenChangedOptions = i6 % 128;
        int i7 = i6 % 2;
        return previousVar.TuitionPaymentFragmentbindingInflater1;
    }

    public final void TuitionPaymentFragmentbindingInflater1(final float f) {
        int i = 2 % 2;
        previous previousVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (previousVar == null) {
            this.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.15
                @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                    prepare.this.TuitionPaymentFragmentbindingInflater1(f);
                }
            });
            int i2 = getNotifyChildrenChangedOptions + 57;
            getRoot = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1((int) onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(previousVar.onTransact, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, f));
        int i4 = getRoot + 83;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws Throwable {
        prepare prepareVar = (prepare) objArr[0];
        final String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 19;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        previous previousVar = prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (previousVar == null) {
            prepareVar.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.12
                @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                    Object[] objArr2 = {prepare.this, str};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr2, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -2099722673, 2099722676);
                }
            });
            return null;
        }
        getCurrentVolume getcurrentvolumeB = previousVar.b(str);
        if (getcurrentvolumeB == null) {
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2((int) getcurrentvolumeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i4 = getRoot + 97;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final String str) throws Throwable {
        int i = 2 % 2;
        int i2 = getRoot + 27;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        previous previousVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (previousVar == null) {
            this.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.19
                @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
                    prepare.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
                }
            });
            return;
        }
        getCurrentVolume getcurrentvolumeB = previousVar.b(str);
        if (getcurrentvolumeB != null) {
            int i4 = getNotifyChildrenChangedOptions + 123;
            getRoot = i4 % 128;
            if (i4 % 2 == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1((int) (getcurrentvolumeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % getcurrentvolumeB.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                return;
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1((int) (getcurrentvolumeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + getcurrentvolumeB.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final String str) throws Throwable {
        int i = 2 % 2;
        previous previousVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (previousVar == null) {
            this.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.4
                @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
                    prepare.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
                }
            });
            int i2 = getNotifyChildrenChangedOptions + 65;
            getRoot = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        getCurrentVolume getcurrentvolumeB = previousVar.b(str);
        if (getcurrentvolumeB == null) {
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = getRoot + 29;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
        int i6 = (int) getcurrentvolumeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(i6, ((int) getcurrentvolumeB.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + i6);
    }

    public final void TuitionPaymentFragmentbindingInflater1(final String str, final String str2, final boolean z) throws Throwable {
        float f;
        int i = 2 % 2;
        previous previousVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (previousVar == null) {
            this.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.2
                @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
                    prepare.this.TuitionPaymentFragmentbindingInflater1(str, str2, z);
                }
            });
            return;
        }
        getCurrentVolume getcurrentvolumeB = previousVar.b(str);
        if (getcurrentvolumeB == null) {
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = getRoot + 17;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            float f2 = getcurrentvolumeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = (int) getcurrentvolumeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getCurrentVolume getcurrentvolumeB2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(str2);
        if (str2 == null) {
            StringBuilder sb2 = new StringBuilder("Cannot find marker with name ");
            sb2.append(str2);
            sb2.append(".");
            throw new IllegalArgumentException(sb2.toString());
        }
        float f3 = getcurrentvolumeB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (z) {
            int i4 = getRoot + 23;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(i3, (int) (f3 + f));
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final int i, final int i2) {
        int i3 = 2 % 2;
        int i4 = getRoot + 5;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2 + 0.99f);
            return;
        }
        this.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.1
            @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                prepare.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2);
            }
        });
        int i6 = getRoot + 37;
        getNotifyChildrenChangedOptions = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        prepare prepareVar = (prepare) objArr[0];
        final float fFloatValue = ((Number) objArr[1]).floatValue();
        final float fFloatValue2 = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = getRoot + 75;
        getNotifyChildrenChangedOptions = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            previous previousVar = prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            obj.hashCode();
            throw null;
        }
        previous previousVar2 = prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (previousVar2 != null) {
            prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1((int) onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(previousVar2.onTransact, prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, fFloatValue), (int) onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onTransact, prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, fFloatValue2));
            return null;
        }
        prepareVar.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.3
            @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                Object[] objArr2 = {prepare.this, Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr2, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1682163982, 1682163987);
            }
        });
        int i3 = getNotifyChildrenChangedOptions + 121;
        getRoot = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 30 / 0;
        }
        return null;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final int i) {
        int i2 = 2 % 2;
        int i3 = getNotifyChildrenChangedOptions + 121;
        getRoot = i3 % 128;
        int i4 = i3 % 2;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            this.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.9
                @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                    prepare.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
                }
            });
            return;
        }
        this.b.TuitionPaymentFragmentbindingInflater1(i);
        int i5 = getNotifyChildrenChangedOptions + 69;
        getRoot = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final float f) {
        int i = 2 % 2;
        int i2 = getRoot + 85;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        previous previousVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (previousVar == null) {
            this.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.7
                @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                    prepare.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3(f);
                }
            });
            return;
        }
        this.b.TuitionPaymentFragmentbindingInflater1(onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(previousVar.onTransact, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, f));
        int i3 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i3 > 0) {
            int i4 = getRoot + 85;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i3 - 1;
            int i6 = getRoot + 53;
            getNotifyChildrenChangedOptions = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 3;
            }
        }
        int i8 = getNotifyChildrenChangedOptions + 111;
        getRoot = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public final void b() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 123;
        int i3 = i2 % 128;
        getRoot = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        previous previousVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (previousVar != null) {
            float f = this.notify;
            setBounds(0, 0, (int) (previousVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.width() * f), (int) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.height() * f));
        } else {
            int i4 = i3 + 47;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = 2 % 2;
        previous previousVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (previousVar == null) {
            int i2 = getRoot + 21;
            getNotifyChildrenChangedOptions = i2 % 128;
            int i3 = i2 % 2;
            return -1;
        }
        int iWidth = (int) (previousVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.width() * this.notify);
        int i4 = getNotifyChildrenChangedOptions + 3;
        getRoot = i4 % 128;
        if (i4 % 2 != 0) {
            return iWidth;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        prepare prepareVar = (prepare) objArr[0];
        int i = 2 % 2;
        int i2 = getRoot;
        int i3 = i2 + 85;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2;
        previous previousVar = prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (previousVar != null) {
            return Integer.valueOf((int) (previousVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.height() * prepareVar.notify));
        }
        int i5 = i2 + 121;
        getNotifyChildrenChangedOptions = i5 % 128;
        int i6 = i5 % 2;
        return -1;
    }

    private List<MediaControllerCompatPlaybackInfo> TuitionPaymentFragmentbindingInflater1(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo) {
        int i = 2 % 2;
        int i2 = getRoot + 121;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            onSetCaptioningEnabled.b("Cannot resolve KeyPath. Composition is not set yet.");
            List<MediaControllerCompatPlaybackInfo> listEmptyList = Collections.emptyList();
            int i3 = getNotifyChildrenChangedOptions + 37;
            getRoot = i3 % 128;
            int i4 = i3 % 2;
            return listEmptyList;
        }
        ArrayList arrayList = new ArrayList();
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaControllerCompatPlaybackInfo, 0, arrayList, new MediaControllerCompatPlaybackInfo(new String[0]));
        return arrayList;
    }

    public final <T> void TuitionPaymentFragmentbindingInflater1(final MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, final T t, final MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 49;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            this.INotificationSideChannel.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: prepare.8
                @Override // prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                    prepare.this.TuitionPaymentFragmentbindingInflater1(mediaControllerCompatPlaybackInfo, t, (MediaSessionCompatCallbackCallbackHandler<Object>) mediaSessionCompatCallbackCallbackHandler);
                }
            });
            return;
        }
        if (mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            int i4 = getNotifyChildrenChangedOptions + 7;
            getRoot = i4 % 128;
            int i5 = i4 % 2;
            mediaControllerCompatPlaybackInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(t, mediaSessionCompatCallbackCallbackHandler);
        } else {
            List<MediaControllerCompatPlaybackInfo> listTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(mediaControllerCompatPlaybackInfo);
            int i6 = 0;
            while (i6 < listTuitionPaymentFragmentbindingInflater1.size()) {
                listTuitionPaymentFragmentbindingInflater1.get(i6).TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(t, mediaSessionCompatCallbackCallbackHandler);
                i6++;
                int i7 = getRoot + 3;
                getNotifyChildrenChangedOptions = i7 % 128;
                int i8 = i7 % 2;
            }
            if (!(!listTuitionPaymentFragmentbindingInflater1.isEmpty())) {
                return;
            }
        }
        int i9 = getNotifyChildrenChangedOptions + 3;
        getRoot = i9 % 128;
        int i10 = i9 % 2;
        invalidateSelf();
        if (t == registerCallbackListener.MediaBrowserCompat) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b.b());
        }
    }

    public final MediaControllerCompatMediaControllerImplApi24 TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int gidForName = 650 - Process.getGidForName("");
            int i2 = 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, gidForName, i2, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{21, '\t', 14, 17, 0, 16, 17, 2, 6, 21, 24, 2, 11, 18, 14, 6, 20, '\b', 1, 6, 5, 2}, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26), View.getDefaultSize(0, 0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{6, 24, 4, 19, 19, 6, '\r', 7, 14, 4, 1, 16, 18, 20, 13941}, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 118), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
            int i3 = 651 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44;
            byte b3 = $$a[80];
            Object[] objArr5 = new Object[1];
            c(b3, (byte) ($$b | 32), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, i3, i4, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int fadingEdgeLength = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int capsMode = 44 - TextUtils.getCapsMode("", 0, 0);
                byte[] bArr = $$a;
                byte b4 = bArr[7];
                Object[] objArr6 = new Object[1];
                c(b4, (byte) (b4 | 15), bArr[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration, fadingEdgeLength, capsMode, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i7 = ~iFreeMemory;
            int i8 = ((1272830139 + (((~(154650973 | i7)) | (~((-158081784) | iFreeMemory))) * (-370))) + ((((~(iFreeMemory | 154650973)) | (~(i7 | (-158081784)))) | 1296648) * (-370))) - 1878459992;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionType(0L) + 1610, TextUtils.getTrimmedLength("") + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1936747544, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                    int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 45;
                    byte b5 = $$a[80];
                    Object[] objArr9 = new Object[1];
                    c(b5, (byte) ($$b | 32), b5, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, i11, iIndexOf, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.argb(0, 0, 0, 0), 695 - TextUtils.getCapsMode("", 0, 0), (Process.myTid() >> 22) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63406), Color.alpha(0) + 793, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 82), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                    int iLastIndexOf = 650 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int iMyPid = 44 - (Process.myPid() >> 22);
                    byte[] bArr2 = $$a;
                    byte b6 = bArr2[7];
                    Object[] objArr11 = new Object[1];
                    c(b6, (byte) (b6 | 15), bArr2[80], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iLastIndexOf, iMyPid, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    e(new char[]{21, '\t', 14, 17, 0, 16, 17, 2, 6, 21, 24, 2, 11, 18, 14, 6, 20, '\b', 1, 6, 5, 2}, (byte) (TextUtils.getTrimmedLength("") + 26), (ViewConfiguration.getEdgeSlop() >> 16) + 22, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(new char[]{6, 24, 4, 19, 19, 6, '\r', 7, 14, 4, 1, 16, 18, 20, 13941}, (byte) (118 - (Process.myPid() >> 22)), 14 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char defaultSize = (char) View.getDefaultSize(0, 0);
                        int modifierMetaStateMask = 650 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 44;
                        byte b7 = $$a[80];
                        Object[] objArr14 = new Object[1];
                        c(b7, (byte) ($$b | 32), b7, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(defaultSize, modifierMetaStateMask, threadPriority, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int iIndexOf2 = 651 - TextUtils.indexOf("", "", 0, 0);
                        int iAxisFromString = 43 - MotionEvent.axisFromString("");
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr15 = new Object[1];
                        c(b8, b9, b9, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cNormalizeMetaState, iIndexOf2, iAxisFromString, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                for (String str : strArr) {
                    int i14 = getRoot + 3;
                    getNotifyChildrenChangedOptions = i14 % 128;
                    int i15 = i14 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i16 = getNotifyChildrenChangedOptions + 45;
        getRoot = i16 % 128;
        int i17 = i16 % 2;
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[0])[0];
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int i21 = ~((-204252211) | (~iFreeMemory2));
        int i22 = i18 + (((((-268234427) | i21) | (~(204252210 | iFreeMemory2))) * (-338)) - 465492301) + (((~(iFreeMemory2 | (-63982217))) | i21) * 338);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr16[3])[0] = i24 ^ (i24 << 5);
        int i25 = getRoot + 117;
        getNotifyChildrenChangedOptions = i25 % 128;
        if (i25 % 2 != 0) {
            getCallback();
            throw null;
        }
        if (getCallback() == null) {
            return null;
        }
        if (this.d == null) {
            this.d = new MediaControllerCompatMediaControllerImplApi24(getCallback(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return this.d;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        prepare prepareVar = (prepare) objArr[0];
        int i = 2 % 2;
        int i2 = getRoot + 59;
        getNotifyChildrenChangedOptions = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            prepareVar.getCallback();
            obj.hashCode();
            throw null;
        }
        Drawable.Callback callback = prepareVar.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(prepareVar);
            return null;
        }
        int i3 = getNotifyChildrenChangedOptions + 53;
        getRoot = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 59;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
        int i4 = getRoot + 27;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 103;
        getRoot = i2 % 128;
        if (i2 % 2 == 0) {
            getCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
            return;
        }
        int i3 = getNotifyChildrenChangedOptions + 39;
        getRoot = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 8 / 0;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this}, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -296234873, 296234873);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this}, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 289191725, -289191719)).intValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int i = 2 % 2;
        int i2 = getRoot;
        int i3 = i2 + 107;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2 != 0 ? 63 : -3;
        int i5 = i2 + 23;
        getNotifyChildrenChangedOptions = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return i4;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this, drawable}, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1966961742, 1966961744);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this}, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 2108861454, -2108861453);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1452206477, -1452206473);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(float f, float f2) {
        Object[] objArr = {this, Float.valueOf(f), Float.valueOf(f2)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1682163982, 1682163987);
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{this, str}, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -2099722673, 2099722676);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r5, short r6, short r7) {
        /*
            int r5 = r5 * 4
            int r5 = 3 - r5
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r6 = 116 - r6
            byte[] r1 = defpackage.prepare.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r5 = r5 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prepare.$$e(short, short, short):java.lang.String");
    }
}
