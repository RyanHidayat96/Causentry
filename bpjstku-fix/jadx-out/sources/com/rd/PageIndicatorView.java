package com.rd;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.text.TextUtilsCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.PositionSavedState;
import com.rd.draw.data.RtlMode;
import defpackage.AudioSpec;
import defpackage.AudioSpecBuilder;
import defpackage.AudioSpecChannelCount;
import defpackage.AudioSpecSource;
import defpackage.AudioStats;
import defpackage.AutoValue_AudioSpec1;
import defpackage.AutoValue_AudioSpecBuilder;
import defpackage.AutoValue_AudioStats;
import defpackage.AutoValue_FallbackStrategy_RuleStrategy;
import defpackage.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal1;
import defpackage.ProcessCameraProviderCompanion;
import defpackage.ProcessCameraProviderCompanionExternalSyntheticLambda0;
import defpackage.ProcessCameraProviderCompaniongetInstance1;
import defpackage.ProcessCameraProviderExternalSyntheticLambda1;
import defpackage.ProcessCameraProviderconfigureInstanceInternal111;
import defpackage.ProcessCameraProvidergetOrCreateCameraXInstance111future1;
import defpackage.ViewPortBuilder;
import defpackage.awaitInstance;
import defpackage.getAudioAmplitude;
import defpackage.getAudioState;
import defpackage.getDurationLimitMillis;
import defpackage.getErrorCause;
import defpackage.getFallbackQuality;
import defpackage.getFileSizeLimit;
import defpackage.hasAudio;
import defpackage.hasError;
import defpackage.initSession;
import defpackage.r8lambda1GtIzncz4245_HpTJbEZFoVqMQY;
import defpackage.shutdownAsync;
import java.lang.reflect.Field;
import java.util.Random;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public class PageIndicatorView extends View implements ViewPager.OnPageChangeListener, ProcessCameraProviderCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ViewPager.OnAdapterChangeListener, View.OnTouchListener {
    private DataSetObserver TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private ProcessCameraProviderCompanion TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewPager f864a;
    private static final byte[] $$d = {5, -91, 77, 46, -12, 2, 63, -52, -14, 6, -9, -1, 9, -10, 71, -66, -2, 13, -14, 14, -9, -6, 19, -19, 11, -6, 1, 64, -63, 8, -8, 11, -3, -13, -1, 11, -1, -7, 66, -68, 13, -2, -2, -10, -1, 2, 17, -19, 11, -6, 1, 64, -69, 18, -11, 11, -17, 9, 4, 1, -19, 8, -3, 7, 6, -13, 68, -37, -14, -11, 11, -17, 9, 4, 1, 13, -24, -3, 7, 6, -13, 34, -17, -18, 0, -4, 8, -3, 14, 30, -44, 17, -6, -6, 8, -9, -6, 80, -79, 3, 11, 2, -6, 8, -11, 72, 0, -69, -5, 2, 3, -5, 9, 1, 64, -79, 11, 7, -17, 13, 1, 14, -19, 4, -18, 42, -34, 11, -1, -7, 72, -64, -1, -1, 5, -20, 9, -8, 80, -14};
    private static final int $$e = 139;
    private static final byte[] $$a = {58, 66, -14, -31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 18;
    private static final Handler b = new Handler(Looper.getMainLooper());

    private static void c(byte b2, byte b3, byte b4, Object[] objArr) {
        int i = 84 - (b4 * 2);
        int i2 = b2 + 4;
        byte[] bArr = $$a;
        int i3 = b3 * 15;
        byte[] bArr2 = new byte[53 - i3];
        int i4 = 52 - i3;
        int i5 = -1;
        if (bArr == null) {
            i = (i2 + (-i4)) - 11;
            i2 = i2;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2 + 1;
            i = (i + (-bArr[i6])) - 11;
            i2 = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 136
            int r0 = 137 - r6
            int r5 = r5 * 136
            int r5 = r5 + 4
            int r7 = r7 + 98
            byte[] r1 = com.rd.PageIndicatorView.$$d
            byte[] r0 = new byte[r0]
            int r6 = 136 - r6
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r5]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rd.PageIndicatorView.d(byte, byte, byte, java.lang.Object[]):void");
    }

    public PageIndicatorView(Context context) throws Throwable {
        super(context);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Runnable() { // from class: com.rd.PageIndicatorView.2
            @Override // java.lang.Runnable
            public final void run() {
                AudioSpecChannelCount audioSpecChannelCount = PageIndicatorView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
                }
                AudioStats audioStats = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                PageIndicatorView.TuitionPaymentFragmentspecialinlinedviewModeldefault1(PageIndicatorView.this);
            }
        };
        if (getId() == -1) {
            setId(getFileSizeLimit.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        b(null);
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder) {
            Handler handler = b;
            handler.removeCallbacks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Runnable runnable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            AudioSpecChannelCount audioSpecChannelCount2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
            }
            handler.postDelayed(runnable, audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface);
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Runnable() { // from class: com.rd.PageIndicatorView.2
            @Override // java.lang.Runnable
            public final void run() {
                AudioSpecChannelCount audioSpecChannelCount = PageIndicatorView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
                }
                AudioStats audioStats = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                PageIndicatorView.TuitionPaymentFragmentspecialinlinedviewModeldefault1(PageIndicatorView.this);
            }
        };
        if (getId() == -1) {
            setId(getFileSizeLimit.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        b(attributeSet);
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder) {
            Handler handler = b;
            handler.removeCallbacks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Runnable runnable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            AudioSpecChannelCount audioSpecChannelCount2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
            }
            handler.postDelayed(runnable, audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface);
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Runnable() { // from class: com.rd.PageIndicatorView.2
            @Override // java.lang.Runnable
            public final void run() {
                AudioSpecChannelCount audioSpecChannelCount = PageIndicatorView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
                }
                AudioStats audioStats = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                PageIndicatorView.TuitionPaymentFragmentspecialinlinedviewModeldefault1(PageIndicatorView.this);
            }
        };
        if (getId() == -1) {
            setId(getFileSizeLimit.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        b(attributeSet);
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder) {
            Handler handler = b;
            handler.removeCallbacks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Runnable runnable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            AudioSpecChannelCount audioSpecChannelCount2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
            }
            handler.postDelayed(runnable, audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface);
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() throws Throwable {
        View viewFindViewById;
        super.onAttachedToWindow();
        for (ViewParent parent = getParent(); parent != null && (parent instanceof ViewGroup); parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getChildCount() <= 0) {
                return;
            }
            AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
            }
            ViewPager viewPager = (viewGroup.getChildCount() <= 0 || (viewFindViewById = viewGroup.findViewById(audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompat)) == null || !(viewFindViewById instanceof ViewPager)) ? null : (ViewPager) viewFindViewById;
            if (viewPager != null) {
                setViewPager(viewPager);
                return;
            }
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        asInterface();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        AudioStats audioStats = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        PositionSavedState positionSavedState = new PositionSavedState(super.onSaveInstanceState());
        positionSavedState.b = audioStats.connect;
        positionSavedState.TuitionPaymentFragmentbindingInflater1 = audioStats.read;
        positionSavedState.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioStats.d;
        return positionSavedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof PositionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        AudioStats audioStats = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        PositionSavedState positionSavedState = (PositionSavedState) parcelable;
        audioStats.connect = positionSavedState.b;
        audioStats.read = positionSavedState.TuitionPaymentFragmentbindingInflater1;
        audioStats.d = positionSavedState.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        super.onRestoreInstanceState(positionSavedState.getSuperState());
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) throws Throwable {
        int i3;
        int i4;
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AudioSpecSource audioSpecSource = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AudioStats audioStats = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int iTuitionPaymentFragmentbindingInflater1 = audioStats.TuitionPaymentFragmentbindingInflater1();
        int i5 = audioStats.INotificationSideChannelStub;
        int i6 = audioStats.IconCompatParcelizer;
        int i7 = audioStats.notify;
        int i8 = audioStats.cancelAll;
        int i9 = audioStats.INotificationSideChannelDefault;
        int i10 = audioStats.onTransact;
        int i11 = audioStats.cancel;
        int i12 = i5 * 2;
        if (audioStats.INotificationSideChannel == null) {
            audioStats.INotificationSideChannel = Orientation.HORIZONTAL;
        }
        Orientation orientation = audioStats.INotificationSideChannel;
        if (iTuitionPaymentFragmentbindingInflater1 != 0) {
            i4 = (i12 * iTuitionPaymentFragmentbindingInflater1) + (i6 * 2 * iTuitionPaymentFragmentbindingInflater1) + (i7 * (iTuitionPaymentFragmentbindingInflater1 - 1));
            i3 = i12 + i6;
            if (orientation == Orientation.HORIZONTAL) {
                i4 = i3;
                i3 = i4;
            }
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (audioStats.b == null) {
            audioStats.b = AnimationType.NONE;
        }
        if (audioStats.b == AnimationType.DROP) {
            if (orientation == Orientation.HORIZONTAL) {
                i4 *= 2;
            } else {
                i3 *= 2;
            }
        }
        Orientation orientation2 = Orientation.HORIZONTAL;
        int i13 = i3 + i8 + i10;
        int i14 = i4 + i9 + i11;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i13, size) : i13;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i14, size2) : i14;
        }
        if (size < 0) {
            size = 0;
        }
        int i15 = size2 >= 0 ? size2 : 0;
        audioStats.getExtras = size;
        audioStats.g = i15;
        Pair pair = new Pair(Integer.valueOf(size), Integer.valueOf(i15));
        setMeasuredDimension(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    protected void onDraw(Canvas canvas) throws Throwable {
        Canvas canvas2;
        getAudioAmplitude getaudioamplitude;
        int i;
        int i2;
        Object[] objArr;
        char c;
        Canvas canvas3 = canvas;
        getAudioAmplitude getaudioamplitude2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
        int iTuitionPaymentFragmentbindingInflater1 = getaudioamplitude2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
        int i3 = 0;
        int i4 = 0;
        while (i4 < iTuitionPaymentFragmentbindingInflater1) {
            int iTuitionPaymentFragmentbindingInflater2 = getDurationLimitMillis.TuitionPaymentFragmentbindingInflater1(getaudioamplitude2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i4);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getaudioamplitude2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i4);
            boolean z = getaudioamplitude2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.f76a;
            int i5 = getaudioamplitude2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.connect;
            boolean z2 = ((z || !(i4 == i5 || i4 == getaudioamplitude2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d)) ? i3 : 1) | ((z && (i4 == i5 || i4 == getaudioamplitude2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.read)) ? 1 : i3);
            getAudioState getaudiostate = getaudioamplitude2.TuitionPaymentFragmentbindingInflater1;
            getaudiostate.d = i4;
            getaudiostate.b = iTuitionPaymentFragmentbindingInflater2;
            getaudiostate.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (getaudioamplitude2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && z2 != 0) {
                AudioStats audioStats = getaudioamplitude2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (audioStats.b == null) {
                    audioStats.b = AnimationType.NONE;
                }
                switch (getAudioAmplitude.AnonymousClass1.TuitionPaymentFragmentbindingInflater1[audioStats.b.ordinal()]) {
                    case 1:
                        iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater1;
                        i4 = i4;
                        canvas2 = canvas3;
                        getaudioamplitude = getaudioamplitude2;
                        i = i3;
                        getAudioState getaudiostate2 = getaudioamplitude.TuitionPaymentFragmentbindingInflater1;
                        if (getaudiostate2.TuitionPaymentFragmentbindingInflater1 != null) {
                            getaudiostate2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, getaudiostate2.d, true, getaudiostate2.b, getaudiostate2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                        break;
                    case 2:
                        iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater1;
                        i4 = i4;
                        canvas2 = canvas3;
                        getaudioamplitude = getaudioamplitude2;
                        i = i3;
                        getAudioState getaudiostate3 = getaudioamplitude.TuitionPaymentFragmentbindingInflater1;
                        ProcessCameraProviderCompanionExternalSyntheticLambda0 processCameraProviderCompanionExternalSyntheticLambda0 = getaudioamplitude.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        getErrorCause geterrorcause = getaudiostate3.TuitionPaymentFragmentbindingInflater1;
                        if (geterrorcause != null) {
                            int i6 = getaudiostate3.d;
                            int i7 = getaudiostate3.b;
                            int i8 = getaudiostate3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (processCameraProviderCompanionExternalSyntheticLambda0 instanceof ProcessCameraProviderconfigureInstanceInternal111) {
                                ProcessCameraProviderconfigureInstanceInternal111 processCameraProviderconfigureInstanceInternal111 = (ProcessCameraProviderconfigureInstanceInternal111) processCameraProviderCompanionExternalSyntheticLambda0;
                                float f = geterrorcause.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
                                int i9 = geterrorcause.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy;
                                int i10 = geterrorcause.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
                                int i11 = geterrorcause.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read;
                                int i12 = geterrorcause.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d;
                                if (geterrorcause.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
                                    if (i6 == i11) {
                                        i9 = processCameraProviderconfigureInstanceInternal111.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    } else if (i6 == i10) {
                                        i9 = processCameraProviderconfigureInstanceInternal111.TuitionPaymentFragmentbindingInflater1;
                                    }
                                } else if (i6 == i10) {
                                    i9 = processCameraProviderconfigureInstanceInternal111.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                } else if (i6 == i12) {
                                    i9 = processCameraProviderconfigureInstanceInternal111.TuitionPaymentFragmentbindingInflater1;
                                }
                                geterrorcause.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(i9);
                                canvas2.drawCircle(i7, i8, f, geterrorcause.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            }
                        }
                        break;
                    case 3:
                        iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater1;
                        i4 = i4;
                        canvas2 = canvas3;
                        getaudioamplitude = getaudioamplitude2;
                        i = i3;
                        getAudioState getaudiostate4 = getaudioamplitude.TuitionPaymentFragmentbindingInflater1;
                        ProcessCameraProviderCompanionExternalSyntheticLambda0 processCameraProviderCompanionExternalSyntheticLambda1 = getaudioamplitude.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        AutoValue_FallbackStrategy_RuleStrategy autoValue_FallbackStrategy_RuleStrategy = getaudiostate4.f910a;
                        if (autoValue_FallbackStrategy_RuleStrategy != null) {
                            int i13 = getaudiostate4.d;
                            int i14 = getaudiostate4.b;
                            int i15 = getaudiostate4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (processCameraProviderCompanionExternalSyntheticLambda1 instanceof AudioSpec) {
                                AudioSpec audioSpec = (AudioSpec) processCameraProviderCompanionExternalSyntheticLambda1;
                                float f2 = autoValue_FallbackStrategy_RuleStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
                                int i16 = autoValue_FallbackStrategy_RuleStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy;
                                int i17 = autoValue_FallbackStrategy_RuleStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
                                int i18 = autoValue_FallbackStrategy_RuleStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read;
                                int i19 = autoValue_FallbackStrategy_RuleStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d;
                                if (autoValue_FallbackStrategy_RuleStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
                                    if (i13 == i18) {
                                        f2 = audioSpec.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        i16 = audioSpec.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    } else if (i13 == i17) {
                                        f2 = audioSpec.b;
                                        i16 = audioSpec.TuitionPaymentFragmentbindingInflater1;
                                    }
                                } else if (i13 == i17) {
                                    f2 = audioSpec.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i16 = audioSpec.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                } else if (i13 == i19) {
                                    f2 = audioSpec.b;
                                    i16 = audioSpec.TuitionPaymentFragmentbindingInflater1;
                                }
                                autoValue_FallbackStrategy_RuleStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(i16);
                                canvas2.drawCircle(i14, i15, f2, autoValue_FallbackStrategy_RuleStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            }
                        }
                        break;
                    case 4:
                        iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater1;
                        i4 = i4;
                        canvas2 = canvas3;
                        getaudioamplitude = getaudioamplitude2;
                        i = i3;
                        getAudioState getaudiostate5 = getaudioamplitude.TuitionPaymentFragmentbindingInflater1;
                        ProcessCameraProviderCompanionExternalSyntheticLambda0 processCameraProviderCompanionExternalSyntheticLambda2 = getaudioamplitude.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal1 autoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal1 = getaudiostate5.onTransact;
                        if (autoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal1 != null) {
                            autoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal1.b(canvas2, processCameraProviderCompanionExternalSyntheticLambda2, getaudiostate5.b, getaudiostate5.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                        break;
                    case 5:
                        iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater1;
                        i4 = i4;
                        canvas2 = canvas3;
                        getaudioamplitude = getaudioamplitude2;
                        i = i3;
                        getAudioState getaudiostate6 = getaudioamplitude.TuitionPaymentFragmentbindingInflater1;
                        ProcessCameraProviderCompanionExternalSyntheticLambda0 processCameraProviderCompanionExternalSyntheticLambda3 = getaudioamplitude.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        AutoValue_AudioSpec1 autoValue_AudioSpec1 = getaudiostate6.g;
                        if (autoValue_AudioSpec1 != null) {
                            int i20 = getaudiostate6.b;
                            int i21 = getaudiostate6.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (processCameraProviderCompanionExternalSyntheticLambda3 instanceof awaitInstance) {
                                int i22 = ((awaitInstance) processCameraProviderCompanionExternalSyntheticLambda3).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i23 = autoValue_AudioSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write;
                                int i24 = autoValue_AudioSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy;
                                int i25 = autoValue_AudioSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
                                autoValue_AudioSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(i23);
                                float f3 = i20;
                                float f4 = i21;
                                float f5 = i25;
                                canvas2.drawCircle(f3, f4, f5, autoValue_AudioSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                autoValue_AudioSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(i24);
                                AudioStats audioStats2 = autoValue_AudioSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                if (audioStats2.INotificationSideChannel == null) {
                                    audioStats2.INotificationSideChannel = Orientation.HORIZONTAL;
                                }
                                if (audioStats2.INotificationSideChannel != Orientation.HORIZONTAL) {
                                    canvas2.drawCircle(f3, i22, f5, autoValue_AudioSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                } else {
                                    canvas2.drawCircle(i22, f4, f5, autoValue_AudioSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                }
                            }
                        }
                        break;
                    case 6:
                        iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater1;
                        i4 = i4;
                        canvas2 = canvas3;
                        getaudioamplitude = getaudioamplitude2;
                        i = i3;
                        getAudioState getaudiostate7 = getaudioamplitude.TuitionPaymentFragmentbindingInflater1;
                        ProcessCameraProviderCompanionExternalSyntheticLambda0 processCameraProviderCompanionExternalSyntheticLambda4 = getaudioamplitude.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        hasAudio hasaudio = getaudiostate7.asInterface;
                        if (hasaudio != null) {
                            int i26 = getaudiostate7.d;
                            int i27 = getaudiostate7.b;
                            int i28 = getaudiostate7.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (processCameraProviderCompanionExternalSyntheticLambda4 instanceof r8lambda1GtIzncz4245_HpTJbEZFoVqMQY) {
                                r8lambda1GtIzncz4245_HpTJbEZFoVqMQY r8lambda1gtizncz4245_hptjbezfovqmqy = (r8lambda1GtIzncz4245_HpTJbEZFoVqMQY) processCameraProviderCompanionExternalSyntheticLambda4;
                                int i29 = hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write;
                                float f6 = hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
                                int i30 = hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault1.IconCompatParcelizer;
                                int i31 = hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
                                int i32 = hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read;
                                int i33 = hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d;
                                if (hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
                                    if (i26 == i32) {
                                        i29 = r8lambda1gtizncz4245_hptjbezfovqmqy.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        f6 = r8lambda1gtizncz4245_hptjbezfovqmqy.b;
                                        i30 = r8lambda1gtizncz4245_hptjbezfovqmqy.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    } else if (i26 == i31) {
                                        i29 = r8lambda1gtizncz4245_hptjbezfovqmqy.TuitionPaymentFragmentbindingInflater1;
                                        f6 = r8lambda1gtizncz4245_hptjbezfovqmqy.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        i30 = r8lambda1gtizncz4245_hptjbezfovqmqy.f1331a;
                                    }
                                } else if (i26 == i31) {
                                    i29 = r8lambda1gtizncz4245_hptjbezfovqmqy.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    f6 = r8lambda1gtizncz4245_hptjbezfovqmqy.b;
                                    i30 = r8lambda1gtizncz4245_hptjbezfovqmqy.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                } else if (i26 == i33) {
                                    i29 = r8lambda1gtizncz4245_hptjbezfovqmqy.TuitionPaymentFragmentbindingInflater1;
                                    f6 = r8lambda1gtizncz4245_hptjbezfovqmqy.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i30 = r8lambda1gtizncz4245_hptjbezfovqmqy.f1331a;
                                }
                                hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setColor(i29);
                                hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setStrokeWidth(hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault1.IconCompatParcelizer);
                                float f7 = i27;
                                float f8 = i28;
                                canvas2.drawCircle(f7, f8, hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub, hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setStrokeWidth(i30);
                                canvas2.drawCircle(f7, f8, f6, hasaudio.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        }
                        break;
                    case 7:
                        iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater1;
                        i4 = i4;
                        canvas2 = canvas3;
                        getaudioamplitude = getaudioamplitude2;
                        i = i3;
                        getAudioState getaudiostate8 = getaudioamplitude.TuitionPaymentFragmentbindingInflater1;
                        ProcessCameraProviderCompanionExternalSyntheticLambda0 processCameraProviderCompanionExternalSyntheticLambda5 = getaudioamplitude.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        AutoValue_AudioSpecBuilder autoValue_AudioSpecBuilder = getaudiostate8.INotificationSideChannel;
                        if (autoValue_AudioSpecBuilder != null) {
                            autoValue_AudioSpecBuilder.b(canvas2, processCameraProviderCompanionExternalSyntheticLambda5, getaudiostate8.b, getaudiostate8.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                        break;
                    case 8:
                        iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater1;
                        i4 = i4;
                        canvas2 = canvas3;
                        getaudioamplitude = getaudioamplitude2;
                        i = i3;
                        getAudioState getaudiostate9 = getaudioamplitude.TuitionPaymentFragmentbindingInflater1;
                        ProcessCameraProviderCompanionExternalSyntheticLambda0 processCameraProviderCompanionExternalSyntheticLambda6 = getaudioamplitude.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        hasError haserror = getaudiostate9.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (haserror != null) {
                            int i34 = getaudiostate9.b;
                            int i35 = getaudiostate9.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (processCameraProviderCompanionExternalSyntheticLambda6 instanceof ProcessCameraProviderCompaniongetInstance1) {
                                ProcessCameraProviderCompaniongetInstance1 processCameraProviderCompaniongetInstance1 = (ProcessCameraProviderCompaniongetInstance1) processCameraProviderCompanionExternalSyntheticLambda6;
                                int i36 = haserror.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write;
                                int i37 = haserror.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy;
                                float f9 = haserror.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
                                haserror.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(i36);
                                canvas2.drawCircle(i34, i35, f9, haserror.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                haserror.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(i37);
                                AudioStats audioStats3 = haserror.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                if (audioStats3.INotificationSideChannel == null) {
                                    audioStats3.INotificationSideChannel = Orientation.HORIZONTAL;
                                }
                                if (audioStats3.INotificationSideChannel != Orientation.HORIZONTAL) {
                                    canvas2.drawCircle(processCameraProviderCompaniongetInstance1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, processCameraProviderCompaniongetInstance1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, processCameraProviderCompaniongetInstance1.b, haserror.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                } else {
                                    canvas2.drawCircle(processCameraProviderCompaniongetInstance1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, processCameraProviderCompaniongetInstance1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, processCameraProviderCompaniongetInstance1.b, haserror.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                }
                            }
                        }
                        break;
                    case 9:
                        iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater1;
                        i4 = i4;
                        canvas2 = canvas3;
                        getaudioamplitude = getaudioamplitude2;
                        i = i3;
                        getAudioState getaudiostate10 = getaudioamplitude.TuitionPaymentFragmentbindingInflater1;
                        ProcessCameraProviderCompanionExternalSyntheticLambda0 processCameraProviderCompanionExternalSyntheticLambda7 = getaudioamplitude.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        AutoValue_AudioStats autoValue_AudioStats = getaudiostate10.notify;
                        if (autoValue_AudioStats != null) {
                            int i38 = getaudiostate10.d;
                            int i39 = getaudiostate10.b;
                            int i40 = getaudiostate10.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (processCameraProviderCompanionExternalSyntheticLambda7 instanceof ProcessCameraProvidergetOrCreateCameraXInstance111future1) {
                                ProcessCameraProvidergetOrCreateCameraXInstance111future1 processCameraProvidergetOrCreateCameraXInstance111future1 = (ProcessCameraProvidergetOrCreateCameraXInstance111future1) processCameraProviderCompanionExternalSyntheticLambda7;
                                int i41 = autoValue_AudioStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy;
                                int i42 = autoValue_AudioStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write;
                                int i43 = autoValue_AudioStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
                                int i44 = autoValue_AudioStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
                                int i45 = autoValue_AudioStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read;
                                int i46 = autoValue_AudioStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d;
                                int i47 = processCameraProvidergetOrCreateCameraXInstance111future1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                if (autoValue_AudioStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
                                    if (i38 == i45) {
                                        i2 = processCameraProvidergetOrCreateCameraXInstance111future1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    } else {
                                        if (i38 == i44) {
                                            i47 = processCameraProvidergetOrCreateCameraXInstance111future1.TuitionPaymentFragmentbindingInflater1;
                                        }
                                        i41 = i42;
                                        i2 = i47;
                                    }
                                } else if (i38 == i46) {
                                    i2 = processCameraProvidergetOrCreateCameraXInstance111future1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                } else {
                                    if (i38 == i44) {
                                        i47 = processCameraProvidergetOrCreateCameraXInstance111future1.TuitionPaymentFragmentbindingInflater1;
                                    }
                                    i41 = i42;
                                    i2 = i47;
                                }
                                autoValue_AudioStats.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(i41);
                                AudioStats audioStats4 = autoValue_AudioStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                if (audioStats4.INotificationSideChannel == null) {
                                    audioStats4.INotificationSideChannel = Orientation.HORIZONTAL;
                                }
                                if (audioStats4.INotificationSideChannel != Orientation.HORIZONTAL) {
                                    canvas2.drawCircle(i39, i2, i43, autoValue_AudioStats.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                } else {
                                    canvas2.drawCircle(i2, i40, i43, autoValue_AudioStats.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                }
                            }
                        }
                        break;
                    case 10:
                        getAudioState getaudiostate11 = getaudioamplitude2.TuitionPaymentFragmentbindingInflater1;
                        ProcessCameraProviderCompanionExternalSyntheticLambda0 processCameraProviderCompanionExternalSyntheticLambda8 = getaudioamplitude2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        getFallbackQuality getfallbackquality = getaudiostate11.asBinder;
                        if (getfallbackquality != null) {
                            int i48 = getaudiostate11.d;
                            int i49 = getaudiostate11.b;
                            int i50 = getaudiostate11.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cMyPid = (char) (Process.myPid() >> 22);
                                int iRed = 876 - Color.red(i3);
                                int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                                byte[] bArr = $$a;
                                Object[] objArr2 = new Object[1];
                                c(bArr[28], bArr[5], bArr[7], objArr2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, iRed, tapTimeout, -1650998592, false, (String) objArr2[0], null);
                            }
                            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                            long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                int threadPriority = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
                                int packedPositionChild = 9 - ExpandableListView.getPackedPositionChild(0L);
                                byte b2 = (byte) ($$b << 1);
                                byte b3 = $$a[7];
                                Object[] objArr3 = new Object[1];
                                c(b2, b3, b3, objArr3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, threadPriority, packedPositionChild, 2012020043, false, (String) objArr3[0], null);
                            }
                            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 876;
                                    int iMyTid = 10 - (Process.myTid() >> 22);
                                    byte b4 = $$a[7];
                                    Object[] objArr4 = new Object[1];
                                    c((byte) 88, b4, b4, objArr4);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, packedPositionGroup, iMyTid, 2012931276, false, (String) objArr4[0], null);
                                }
                                Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                                objArr = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
                                int iIdentityHashCode = System.identityHashCode(this);
                                int i51 = ~iIdentityHashCode;
                                int i52 = ((2070192700 + (((~(350167253 | i51)) | (~((-390477483) | iIdentityHashCode))) * (-370))) + ((((~(iIdentityHashCode | 350167253)) | (~(i51 | (-390477483)))) | 10027093) * (-370))) - 153171249;
                                int i53 = (i52 << 13) ^ i52;
                                int i54 = i53 ^ (i53 >>> 17);
                                ((int[]) objArr[1])[0] = i54 ^ (i54 << 5);
                                c = 2;
                            } else {
                                Context applicationContext = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                                if (applicationContext != null) {
                                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                                }
                                try {
                                    Object[] objArr6 = {applicationContext, Integer.valueOf(i48), 0, 431771637};
                                    byte[] bArr2 = $$d;
                                    byte b5 = bArr2[84];
                                    Object[] objArr7 = new Object[1];
                                    d(b5, b5, bArr2[26], objArr7);
                                    Class<?> cls = Class.forName((String) objArr7[0]);
                                    byte b6 = bArr2[26];
                                    Object[] objArr8 = new Object[1];
                                    d(b6, b6, bArr2[84], objArr8);
                                    Object[] objArr9 = (Object[]) cls.getMethod((String) objArr8[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                                    if (applicationContext != null) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                            int mode = 876 - View.MeasureSpec.getMode(0);
                                            int minimumFlingVelocity2 = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            byte b7 = $$a[7];
                                            Object[] objArr10 = new Object[1];
                                            c((byte) 88, b7, b7, objArr10);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, mode, minimumFlingVelocity2, 2012931276, false, (String) objArr10[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr9);
                                        try {
                                            long jLongValue2 = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                                            Long lValueOf = Long.valueOf(jLongValue2);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                                int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0');
                                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 10;
                                                byte b8 = (byte) ($$b << 1);
                                                byte b9 = $$a[7];
                                                Object[] objArr11 = new Object[1];
                                                c(b8, b9, b9, objArr11);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, iIndexOf, iKeyCodeFromString, 2012020043, false, (String) objArr11[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                                                int tapTimeout2 = 876 - (ViewConfiguration.getTapTimeout() >> 16);
                                                int iAxisFromString = 9 - MotionEvent.axisFromString("");
                                                byte[] bArr3 = $$a;
                                                Object[] objArr12 = new Object[1];
                                                c(bArr3[28], bArr3[5], bArr3[7], objArr12);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, tapTimeout2, iAxisFromString, -1650998592, false, (String) objArr12[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                        } catch (Exception unused) {
                                            throw new RuntimeException();
                                        }
                                    } else {
                                        objArr9 = objArr9;
                                    }
                                    objArr = objArr9;
                                    c = 2;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            int i55 = ((int[]) objArr[c])[0];
                            int i56 = ((int[]) objArr[0])[0];
                            if (i56 == i55) {
                                int i57 = ((int[]) objArr[1])[0];
                                Object[] objArr13 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                                int iMyPid = Process.myPid();
                                int i58 = ~iMyPid;
                                int i59 = i57 + 1402196999 + (((~((-923245122) | i58)) | (~(882934892 | iMyPid))) * 217) + (((~(iMyPid | (-923245122))) | 50797057) * 217) + (((~(882934892 | i58)) | 923245121) * 217);
                                int i60 = (i59 << 13) ^ i59;
                                int i61 = i60 ^ (i60 >>> 17);
                                ((int[]) objArr13[1])[0] = i61 ^ (i61 << 5);
                                i = 0;
                            } else {
                                Toast.makeText((Context) null, i56 / (((i56 - 1) * i56) % 2), 0).show();
                                int i62 = ((int[]) objArr[1])[0];
                                Object[] objArr14 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                                int iNextInt = new Random().nextInt();
                                int i63 = ~iNextInt;
                                int i64 = i62 + (-810060588) + ((805839396 | i63) * (-192)) + (((~(910698023 | i63)) | 145168856) * (-384)) + (((~(iNextInt | (-104858628))) | (~(i63 | 1055866879)) | (~((-145168857) | iNextInt))) * DerHeader.TAG_CLASS_PRIVATE);
                                int i65 = (i64 << 13) ^ i64;
                                int i66 = i65 ^ (i65 >>> 17);
                                i = 0;
                                ((int[]) objArr14[1])[0] = i66 ^ (i66 << 5);
                            }
                            if (processCameraProviderCompanionExternalSyntheticLambda8 instanceof AudioSpec) {
                                AudioSpec audioSpec2 = (AudioSpec) processCameraProviderCompanionExternalSyntheticLambda8;
                                float f10 = getfallbackquality.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
                                int i67 = getfallbackquality.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy;
                                int i68 = getfallbackquality.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
                                int i69 = getfallbackquality.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read;
                                int i70 = getfallbackquality.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d;
                                if (getfallbackquality.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a) {
                                    if (i48 == i69) {
                                        f10 = audioSpec2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        i67 = audioSpec2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    } else if (i48 == i68) {
                                        f10 = audioSpec2.b;
                                        i67 = audioSpec2.TuitionPaymentFragmentbindingInflater1;
                                    }
                                } else if (i48 == i68) {
                                    f10 = audioSpec2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i67 = audioSpec2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                } else if (i48 == i70) {
                                    f10 = audioSpec2.b;
                                    i67 = audioSpec2.TuitionPaymentFragmentbindingInflater1;
                                }
                                getfallbackquality.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(i67);
                                canvas2 = canvas;
                                canvas2.drawCircle(i49, i50, f10, getfallbackquality.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            } else {
                                canvas2 = canvas;
                            }
                        } else {
                            getaudioamplitude2 = getaudioamplitude2;
                            iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater1;
                            i = i3;
                            i4 = i4;
                            canvas2 = canvas3;
                        }
                        getaudioamplitude = getaudioamplitude2;
                        break;
                    default:
                        iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater1;
                        i4 = i4;
                        canvas2 = canvas3;
                        getaudioamplitude = getaudioamplitude2;
                        i = i3;
                        break;
                }
            } else {
                iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater1;
                i4 = i4;
                canvas2 = canvas3;
                getaudioamplitude = getaudioamplitude2;
                i = i3;
                getAudioState getaudiostate12 = getaudioamplitude.TuitionPaymentFragmentbindingInflater1;
                if (getaudiostate12.TuitionPaymentFragmentbindingInflater1 != null) {
                    getaudiostate12.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, getaudiostate12.d, z2, getaudiostate12.b, getaudiostate12.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
            i4++;
            i3 = i;
            getaudioamplitude2 = getaudioamplitude;
            canvas3 = canvas2;
            iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater1;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) throws Throwable {
        AudioStats audioStats;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        getAudioAmplitude getaudioamplitude = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
        if (motionEvent != null && motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (getaudioamplitude.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null && (audioStats = getaudioamplitude.TuitionPaymentFragmentspecialinlinedviewModeldefault2) != null) {
                if (audioStats.INotificationSideChannel == null) {
                    audioStats.INotificationSideChannel = Orientation.HORIZONTAL;
                }
                if (audioStats.INotificationSideChannel != Orientation.HORIZONTAL) {
                    y = x;
                    x = y;
                }
                int iTuitionPaymentFragmentbindingInflater1 = audioStats.TuitionPaymentFragmentbindingInflater1();
                int i = audioStats.INotificationSideChannelStub;
                int i2 = audioStats.IconCompatParcelizer;
                int i3 = audioStats.notify;
                if (audioStats.INotificationSideChannel == null) {
                    audioStats.INotificationSideChannel = Orientation.HORIZONTAL;
                }
                if (audioStats.INotificationSideChannel == Orientation.HORIZONTAL) {
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioStats.g;
                } else {
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioStats.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
                int i4 = 0;
                int i5 = 0;
                while (i4 < iTuitionPaymentFragmentbindingInflater1) {
                    int i6 = (i * 2) + (i2 / 2) + (i4 > 0 ? i3 : i3 / 2) + i5;
                    boolean z = x >= ((float) i5) && x <= ((float) i6);
                    boolean z2 = y >= 0.0f && y <= ((float) iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    if (z && z2) {
                        if (i4 < 0) {
                            break;
                        }
                        getAudioAmplitude.b bVar = getaudioamplitude.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        break;
                    }
                    i4++;
                    i5 = i6;
                }
            }
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        if (!audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } else if (action == 1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        return false;
    }

    @Override // ProcessCameraProviderCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void b() {
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
            }
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
    public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) throws Throwable {
        DataSetObserver dataSetObserver;
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            if (pagerAdapter != null && (dataSetObserver = this.TuitionPaymentFragmentbindingInflater1) != null) {
                pagerAdapter.unregisterDataSetObserver(dataSetObserver);
                this.TuitionPaymentFragmentbindingInflater1 = null;
            }
            TuitionPaymentFragmentbindingInflater1();
        }
        a();
    }

    public void setCount(int i) {
        if (i >= 0) {
            AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
            }
            if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1() != i) {
                AudioSpecChannelCount audioSpecChannelCount2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
                }
                audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
                g();
                requestLayout();
            }
        }
    }

    public void setDynamicCount(boolean z) {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        if (z) {
            TuitionPaymentFragmentbindingInflater1();
        } else {
            asInterface();
        }
    }

    public void setFadeOnIdle(boolean z) {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder = z;
        if (z) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    public void setRadius(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub = (int) f;
        invalidate();
    }

    public void setPadding(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.notify = (int) f;
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
  0x0006: PHI (r0v5 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    public void setScaleFactor(float f) {
        float f2 = 1.0f;
        if (f > 1.0f) {
            f = f2;
        } else {
            f2 = 0.3f;
            if (f < 0.3f) {
                f = f2;
            }
        }
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.RemoteActionCompatParcelizer = f;
    }

    public void setStrokeWidth(float f) {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        int i = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
        if (f < 0.0f) {
            f = 0.0f;
        } else {
            float f2 = i;
            if (f > f2) {
                f = f2;
            }
        }
        AudioSpecChannelCount audioSpecChannelCount2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.IconCompatParcelizer = (int) f;
        invalidate();
    }

    public void setSelectedColor(int i) {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy = i;
        invalidate();
    }

    public void setUnselectedColor(int i) {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write = i;
        invalidate();
    }

    public void setAutoVisibility(boolean z) throws Throwable {
        if (!z) {
            setVisibility(0);
        }
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 = z;
        g();
    }

    public void setOrientation(Orientation orientation) {
        if (orientation != null) {
            AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
            }
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannel = orientation;
            requestLayout();
        }
    }

    public void setAnimationDuration(long j) {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
    }

    public void setIdleDuration(long j) {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface = j;
        AudioSpecChannelCount audioSpecChannelCount2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    public void setAnimationType(AnimationType animationType) {
        ProcessCameraProviderCompanion processCameraProviderCompanion = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        processCameraProviderCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        ProcessCameraProviderCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = processCameraProviderCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
        }
        if (animationType != null) {
            AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
            }
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b = animationType;
        } else {
            AudioSpecChannelCount audioSpecChannelCount2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
            }
            audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b = AnimationType.NONE;
        }
        invalidate();
    }

    public void setInteractiveAnimation(boolean z) {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f76a = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
    }

    public void setRtlMode(RtlMode rtlMode) {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        AudioStats audioStats = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (rtlMode == null) {
            audioStats.getInterfaceDescriptor = RtlMode.Off;
        } else {
            audioStats.getInterfaceDescriptor = rtlMode;
        }
        if (this.f864a == null) {
            return;
        }
        int currentItem = audioStats.connect;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            currentItem = (audioStats.TuitionPaymentFragmentbindingInflater1() - 1) - currentItem;
        } else {
            ViewPager viewPager = this.f864a;
            if (viewPager != null) {
                currentItem = viewPager.getCurrentItem();
            }
        }
        audioStats.d = currentItem;
        audioStats.read = currentItem;
        audioStats.connect = currentItem;
        invalidate();
    }

    public void setSelection(int i) {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        AudioStats audioStats = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        AudioSpecChannelCount audioSpecChannelCount2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        int iTuitionPaymentFragmentbindingInflater1 = audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1() - 1;
        if (i < 0) {
            i = 0;
        } else if (i > iTuitionPaymentFragmentbindingInflater1) {
            i = iTuitionPaymentFragmentbindingInflater1;
        }
        if (i == audioStats.connect || i == audioStats.read) {
            return;
        }
        audioStats.f76a = false;
        audioStats.d = audioStats.connect;
        audioStats.read = i;
        audioStats.connect = i;
        ProcessCameraProviderExternalSyntheticLambda1 processCameraProviderExternalSyntheticLambda1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        shutdownAsync shutdownasync = processCameraProviderExternalSyntheticLambda1.b;
        if (shutdownasync != null) {
            AudioSpecBuilder audioSpecBuilder = shutdownasync.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (audioSpecBuilder != null) {
                audioSpecBuilder.TuitionPaymentFragmentbindingInflater1();
            }
            shutdownAsync shutdownasync2 = processCameraProviderExternalSyntheticLambda1.b;
            shutdownasync2.TuitionPaymentFragmentbindingInflater1 = false;
            shutdownasync2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0.0f;
            shutdownasync2.b();
        }
    }

    public void setSelected(int i) {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        AudioStats audioStats = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats.b == null) {
            audioStats.b = AnimationType.NONE;
        }
        AnimationType animationType = audioStats.b;
        audioStats.b = AnimationType.NONE;
        setSelection(i);
        audioStats.b = animationType;
    }

    public void setProgress(int i, float f) throws Throwable {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        AudioStats audioStats = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats.f76a) {
            int iTuitionPaymentFragmentbindingInflater1 = audioStats.TuitionPaymentFragmentbindingInflater1();
            if (iTuitionPaymentFragmentbindingInflater1 <= 0 || i < 0) {
                i = 0;
            } else {
                int i2 = iTuitionPaymentFragmentbindingInflater1 - 1;
                if (i > i2) {
                    i = i2;
                }
            }
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f == 1.0f) {
                audioStats.d = audioStats.connect;
                audioStats.connect = i;
            }
            audioStats.read = i;
            shutdownAsync shutdownasync = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
            if (shutdownasync != null) {
                shutdownasync.TuitionPaymentFragmentbindingInflater1 = true;
                shutdownasync.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = f;
                shutdownasync.b();
            }
        }
    }

    public void setClickListener(getAudioAmplitude.b bVar) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bVar;
    }

    private void b(AttributeSet attributeSet) throws Throwable {
        ProcessCameraProviderCompanion processCameraProviderCompanion = new ProcessCameraProviderCompanion(this);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = processCameraProviderCompanion;
        AudioSpecChannelCount audioSpecChannelCount = processCameraProviderCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getContext(), attributeSet);
        AudioSpecChannelCount audioSpecChannelCount2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        AudioStats audioStats = audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        audioStats.cancelAll = getPaddingLeft();
        audioStats.INotificationSideChannelDefault = getPaddingTop();
        audioStats.onTransact = getPaddingRight();
        audioStats.cancel = getPaddingBottom();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = audioStats.f76a;
    }

    private void TuitionPaymentFragmentbindingInflater1() {
        ViewPager viewPager;
        if (this.TuitionPaymentFragmentbindingInflater1 != null || (viewPager = this.f864a) == null || viewPager.getAdapter() == null) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1 = new DataSetObserver() { // from class: com.rd.PageIndicatorView.1
            @Override // android.database.DataSetObserver
            public final void onChanged() throws Throwable {
                PageIndicatorView.this.a();
            }
        };
        try {
            this.f864a.getAdapter().registerDataSetObserver(this.TuitionPaymentFragmentbindingInflater1);
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    private void asInterface() {
        ViewPager viewPager;
        if (this.TuitionPaymentFragmentbindingInflater1 == null || (viewPager = this.f864a) == null || viewPager.getAdapter() == null) {
            return;
        }
        try {
            this.f864a.getAdapter().unregisterDataSetObserver(this.TuitionPaymentFragmentbindingInflater1);
            this.TuitionPaymentFragmentbindingInflater1 = null;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() throws Throwable {
        AudioSpecBuilder audioSpecBuilder;
        ViewPager viewPager = this.f864a;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        int count = this.f864a.getAdapter().getCount();
        int currentItem = TuitionPaymentFragmentspecialinlinedviewModeldefault2() ? (count - 1) - this.f864a.getCurrentItem() : this.f864a.getCurrentItem();
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect = currentItem;
        AudioSpecChannelCount audioSpecChannelCount2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read = currentItem;
        AudioSpecChannelCount audioSpecChannelCount3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d = currentItem;
        AudioSpecChannelCount audioSpecChannelCount4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = count;
        shutdownAsync shutdownasync = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
        if (shutdownasync != null && (audioSpecBuilder = shutdownasync.TuitionPaymentFragmentspecialinlinedviewModeldefault2) != null) {
            audioSpecBuilder.TuitionPaymentFragmentbindingInflater1();
        }
        g();
        requestLayout();
    }

    private void g() throws Throwable {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1) {
            AudioSpecChannelCount audioSpecChannelCount2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
            }
            int iTuitionPaymentFragmentbindingInflater1 = audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
            int visibility = getVisibility();
            if (visibility != 0 && iTuitionPaymentFragmentbindingInflater1 > 1) {
                setVisibility(0);
            } else {
                if (visibility == 4 || iTuitionPaymentFragmentbindingInflater1 > 1) {
                    return;
                }
                setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.rd.PageIndicatorView$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        static {
            int[] iArr = new int[RtlMode.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr;
            try {
                iArr[RtlMode.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[RtlMode.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[RtlMode.Auto.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int[] iArr = AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        AudioStats audioStats = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats.getInterfaceDescriptor == null) {
            audioStats.getInterfaceDescriptor = RtlMode.Off;
        }
        int i = iArr[audioStats.getInterfaceDescriptor.ordinal()];
        if (i != 1) {
            return i == 3 && TextUtilsCompat.getLayoutDirectionFromLocale(getContext().getResources().getConfiguration().locale) == 1;
        }
        return true;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Handler handler = b;
        handler.removeCallbacks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Runnable runnable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        handler.postDelayed(runnable, audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b.removeCallbacks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        animate().cancel();
        animate().alpha(1.0f).setDuration(250L);
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(PageIndicatorView pageIndicatorView) {
        pageIndicatorView.animate().cancel();
        pageIndicatorView.animate().alpha(0.0f).setDuration(250L);
    }

    public void setPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        int iApplyDimension = (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.notify = iApplyDimension;
        invalidate();
    }

    public void setRadius(int i) {
        if (i < 0) {
            i = 0;
        }
        int iApplyDimension = (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub = iApplyDimension;
        invalidate();
    }

    public void setStrokeWidth(int i) {
        int iApplyDimension = (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        int i2 = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
        if (iApplyDimension < 0) {
            iApplyDimension = 0;
        } else if (iApplyDimension > i2) {
            iApplyDimension = i2;
        }
        AudioSpecChannelCount audioSpecChannelCount2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.IconCompatParcelizer = iApplyDimension;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) throws Throwable {
        ViewPager viewPager2 = this.f864a;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(this);
            this.f864a.removeOnAdapterChangeListener(this);
            this.f864a = null;
        }
        if (viewPager == null) {
            return;
        }
        this.f864a = viewPager;
        viewPager.addOnPageChangeListener(this);
        this.f864a.addOnAdapterChangeListener(this);
        this.f864a.setOnTouchListener(this);
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompat = this.f864a.getId();
        AudioSpecChannelCount audioSpecChannelCount2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        setDynamicCount(audioSpecChannelCount2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        a();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        ViewPortBuilder.asInterface();
        try {
            AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
            }
            AudioStats audioStats = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            boolean z = (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) ? false : true;
            int iTuitionPaymentFragmentbindingInflater1 = audioStats.TuitionPaymentFragmentbindingInflater1();
            if (z) {
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                    i = (iTuitionPaymentFragmentbindingInflater1 - 1) - i;
                }
                setSelection(i);
            }
        } finally {
            ViewPortBuilder.d();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) throws Throwable {
        AudioSpecChannelCount audioSpecChannelCount = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AudioStats();
        }
        AudioStats audioStats = audioSpecChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats.b == null) {
            audioStats.b = AnimationType.NONE;
        }
        AnimationType animationType = audioStats.b;
        boolean z = audioStats.f76a;
        if ((getMeasuredHeight() == 0 && getMeasuredWidth() == 0) || !z || animationType == AnimationType.NONE) {
            return;
        }
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentbindingInflater1 = audioStats.TuitionPaymentFragmentbindingInflater1();
        int i3 = audioStats.connect;
        if (zTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            i = (iTuitionPaymentFragmentbindingInflater1 - 1) - i;
        }
        boolean z2 = false;
        if (i < 0) {
            i = 0;
        } else {
            int i4 = iTuitionPaymentFragmentbindingInflater1 - 1;
            if (i > i4) {
                i = i4;
            }
        }
        boolean z3 = i > i3;
        if (!zTuitionPaymentFragmentspecialinlinedviewModeldefault2 ? i + 1 < i3 : i - 1 < i3) {
            z2 = true;
        }
        if (z3 || z2) {
            audioStats.connect = i;
            i3 = i;
        }
        float f2 = 0.0f;
        if (i3 != i || f == 0.0f) {
            f = 1.0f - f;
        } else {
            i = zTuitionPaymentFragmentspecialinlinedviewModeldefault2 ? i - 1 : i + 1;
        }
        if (f > 1.0f) {
            f2 = 1.0f;
        } else if (f >= 0.0f) {
            f2 = f;
        }
        Pair pair = new Pair(Integer.valueOf(i), Float.valueOf(f2));
        setProgress(((Integer) pair.first).intValue(), ((Float) pair.second).floatValue());
    }
}
