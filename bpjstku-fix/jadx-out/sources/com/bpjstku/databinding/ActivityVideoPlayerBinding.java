package com.bpjstku.databinding;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.DeviceQuirksExternalSyntheticLambda0;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityVideoPlayerBinding implements ViewBinding {
    public final ImageButton btnFullscreen;
    public final FloatingActionButton fab;
    public final LayoutToolbarCenterBinding layoutToolbarCenter;
    public final LinearLayout llVideo;
    public final ProgressBar progressBar;
    public final RelativeLayout rootLayout;
    private final RelativeLayout rootView;
    public final ScrollView scrollContent;
    public final TextView tvDescVideo;
    public final TextView tvTitleVideo;
    public final WebView videoPlayer;
    public final FrameLayout videoPlayerFullscreen;
    private static final byte[] $$c = {12, -88, 33, 118};
    private static final int $$d = 89;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {92, 126, -38, -95, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 57;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59746, 59864, 59865, 59844, 59828, 59841, 59856, 59866, 59731, 59834, 59824, 59815, 59823, 59836, 59838, 59769, 59875, 59884, 59882, 59879, 59896, 59899, 59878, 59861, 59850, 59841, 59873, 59884, 59885, 59846, 59852, 59872, 59872, 59886, 59745, 59863, 59869, 59865, 59857, 59870, 59862, 59869, 59869, 59887, 59861, 59883, 59887, 59862, 59868, 59682, 59762, 59899, 59879, 59885, 59842, 59852, 59875, 59899, 59844, 59836, 59865, 59872, 59877, 59876, 59876, 59877, 59901, 59885, 59861, 59878, 59872, 59880, 59881, 59881, 59884, 59874, 59706, 59751, 59768, 59769, 59744, 59746, 59770, 59729, 59731, 59771, 59749, 59745, 59757, 59753, 59745, 59749, 59751, 59749};

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 52
            int r9 = 53 - r9
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = com.bpjstku.databinding.ActivityVideoPlayerBinding.$$a
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivityVideoPlayerBinding.c(short, int, byte, java.lang.Object[]):void");
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ActivityVideoPlayerBinding(RelativeLayout relativeLayout, ImageButton imageButton, FloatingActionButton floatingActionButton, LayoutToolbarCenterBinding layoutToolbarCenterBinding, LinearLayout linearLayout, ProgressBar progressBar, RelativeLayout relativeLayout2, ScrollView scrollView, TextView textView, TextView textView2, WebView webView, FrameLayout frameLayout) {
        this.rootView = relativeLayout;
        this.btnFullscreen = imageButton;
        this.fab = floatingActionButton;
        this.layoutToolbarCenter = layoutToolbarCenterBinding;
        this.llVideo = linearLayout;
        this.progressBar = progressBar;
        this.rootLayout = relativeLayout2;
        this.scrollContent = scrollView;
        this.tvDescVideo = textView;
        this.tvTitleVideo = textView2;
        this.videoPlayer = webView;
        this.videoPlayerFullscreen = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 119;
        b = i3 % 128;
        int i4 = i3 % 2;
        RelativeLayout relativeLayout = this.rootView;
        int i5 = i2 + 23;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return relativeLayout;
        }
        throw null;
    }

    public static ActivityVideoPlayerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        b = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    public static ActivityVideoPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_video_player, viewGroup, false);
        if (!(!z)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
            b = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
        }
        ActivityVideoPlayerBinding activityVideoPlayerBindingBind = bind(viewInflate);
        int i4 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return activityVideoPlayerBindingBind;
    }

    public static ActivityVideoPlayerBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.btnFullscreen;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.btnFullscreen);
        if (imageButton != null) {
            int i3 = b + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.fab;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, R.id.fab);
            if (floatingActionButton != null) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    ViewBindings.findChildViewById(view, R.id.layout_toolbar_center);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar_center);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i2 = R.id.llVideo;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llVideo);
                    if (linearLayout != null) {
                        i2 = R.id.progressBar;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                        if (progressBar != null) {
                            int i6 = b + 111;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                            int i7 = i6 % 2;
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            i2 = R.id.scrollContent;
                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollContent);
                            if (scrollView != null) {
                                i2 = R.id.tvDescVideo;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescVideo);
                                if (textView != null) {
                                    i2 = R.id.tvTitleVideo;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleVideo);
                                    if (textView2 != null) {
                                        i2 = R.id.videoPlayer;
                                        WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.videoPlayer);
                                        if (webView != null) {
                                            i2 = R.id.videoPlayerFullscreen;
                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.videoPlayerFullscreen);
                                            if (frameLayout != null) {
                                                return new ActivityVideoPlayerBinding(relativeLayout, imageButton, floatingActionButton, layoutToolbarCenterBindingBind, linearLayout, progressBar, relativeLayout, scrollView, textView, textView2, webView, frameLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i2 = R.id.layout_toolbar_center;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (cArr != null) {
            int i9 = $10 + 125;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i3] = Integer.valueOf(cArr[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.rgb(i3, i3, i3) + 16777216), 1270 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getTrimmedLength("") + 18, 407021364, false, $$e(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i11++;
                    i3 = 0;
                    i5 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i12 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 3225 - TextUtils.indexOf("", "", 0), 13 - Color.green(0), 2133916302, false, $$e(b4, b5, (byte) (b5 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 29944), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754, 22 - ((byte) KeyEvent.getModifierMetaStateMask()), 387247676, false, $$e(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                try {
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 41241), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1705, TextUtils.indexOf((CharSequence) "", '0') + 22, -1434471773, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i14 = $11 + 65;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                char[] cArr5 = new char[i6];
                i = 0;
                System.arraycopy(cArr3, 0, cArr5, 1, i6);
                System.arraycopy(cArr5, 0, cArr3, i6 << i8, i8);
                System.arraycopy(cArr5, i8, cArr3, 0, i6 * i8);
            } else {
                i = 0;
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr3, 0, cArr6, 0, i6);
                int i15 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr3, i15, i8);
                System.arraycopy(cArr6, i8, cArr3, 0, i15);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i6];
            setvideostabilizationmode.b = i;
            while (setvideostabilizationmode.b < i6) {
                int i16 = $10 + 23;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                cArr7[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr3 = cArr7;
        }
        if (i7 > 0) {
            setvideostabilizationmode.b = 0;
            while (setvideostabilizationmode.b < i6) {
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                setvideostabilizationmode.b++;
                int i18 = $10 + 23;
                $11 = i18 % 128;
                int i19 = i18 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x073b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0741  */
    /* JADX WARN: Code duplicated, block: B:105:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:106:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:110:0x080e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0815  */
    /* JADX WARN: Code duplicated, block: B:114:0x0848  */
    /* JADX WARN: Code duplicated, block: B:116:0x085f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0881  */
    /* JADX WARN: Code duplicated, block: B:120:0x089a  */
    public static Object[] TuitionPaymentFragmentbindingInflater1(Class cls, int i, int i2, int i3) throws Throwable {
        String string;
        int i4;
        char c;
        char c2;
        String str;
        String[] strArr;
        int i5;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int[] iArr2;
        char c3;
        int[] iArr3;
        int i16;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28 = 2 % 2;
        int i29 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i29 % 128;
        if (i29 % 2 == 0 ? (i2 & 2) != 0 : (i2 & 4) != 0) {
            String[][] strArr2 = new String[1][];
            try {
                Object[] objArr = new Object[1];
                a(new int[]{0, 8, 109, 0}, true, new byte[]{0, 1, 1, 0, 0, 1, 1, 1}, objArr);
                Field declaredField = Class.class.getDeclaredField((String) objArr[0]);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(cls);
                Class<?> cls2 = obj.getClass();
                Object[] objArr2 = new Object[1];
                a(new int[]{8, 7, 77, 0}, false, new byte[]{1, 1, 1, 0, 1, 1, 1}, objArr2);
                Field declaredField2 = cls2.getDeclaredField((String) objArr2[0]);
                declaredField2.setAccessible(true);
                try {
                    Object[] objArr3 = {Long.valueOf(((Number) declaredField2.get(obj)).longValue() & 281474976710655L), strArr2};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486768121);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cBlue = (char) (41241 - Color.blue(0));
                        int iBlue = 1705 - Color.blue(0);
                        int i30 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21;
                        byte[] bArr = $$a;
                        byte b2 = bArr[7];
                        Object[] objArr4 = new Object[1];
                        c(b2, b2, bArr[5], objArr4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, iBlue, i30, -107095506, false, (String) objArr4[0], new Class[]{Long.TYPE, String[][].class});
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).longValue();
                    long j = -1027769637;
                    long j2 = -344;
                    long j3 = (j2 * j) + (j2 * jLongValue);
                    long j4 = 345;
                    long j5 = -1;
                    long j6 = j ^ j5;
                    long j7 = jLongValue ^ j5;
                    long j8 = j6 | j7;
                    long j9 = i;
                    long j10 = j3 + (((j8 ^ j5) | ((j6 | j9) ^ j5)) * j4) + ((((j6 | (j9 ^ j5)) ^ j5) | ((j7 | j) ^ j5)) * j4) + (j4 * ((j8 | j9) ^ j5)) + ((long) (-1078247424));
                    int i31 = (int) (j10 >> 32);
                    int iNextInt = new Random().nextInt(2029308256);
                    int i32 = i31 & (1520786966 + (((~((~iNextInt) | 31241113)) | (-1407038362)) * 529) + (((~(iNextInt | 31241113)) | (-1405985298)) * 529));
                    int i33 = 1680495813 + (((~((-258727770) | i)) | 1695954179) * (-964));
                    int i34 = ~i;
                    int i35 = ((int) j10) & (i33 + (((~((-258727770) | i34)) | 84022529) * (-964)));
                    int i36 = (i35 & i32) | (i32 ^ i35);
                    if (i36 != 0) {
                        int i37 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                        b = i37 % 128;
                        if (i37 % 2 == 0) {
                            i4 = ((~i36) & i) | (i36 & i34);
                            strArr = new String[2];
                            strArr[0] = cls.getName();
                            strArr[0] = strArr2[0][0];
                            str = strArr2[0][1];
                            c = 0;
                            c2 = 5;
                        } else {
                            i4 = ((~i36) & i) | (i36 & i34);
                            String[] strArr3 = new String[4];
                            c = 0;
                            strArr3[0] = cls.getName();
                            String[] strArr4 = strArr2[0];
                            strArr3[1] = strArr4[0];
                            c2 = 2;
                            str = strArr4[1];
                            strArr = strArr3;
                        }
                        strArr[c2] = str;
                        strArr[3] = strArr2[c][2];
                        Object[] objArr5 = new Object[4];
                        objArr5[c] = new int[1];
                        objArr5[1] = new int[1];
                        objArr5[2] = new int[1];
                        DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        ((int[]) objArr5[2])[0] = i;
                        ((int[]) objArr5[1])[0] = i4;
                        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int i38 = ~iElapsedRealtime;
                        int i39 = 1548126418 + (((~((-669612064) | i38)) | (-1035419396) | (~(669612063 | iElapsedRealtime))) * (-564)) + ((~(iElapsedRealtime | (-404096769))) * 1128) + (((~((-1035419396) | i38)) | (-1073708832)) * 564);
                        int i40 = b - (-1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i40 % 128;
                        if (i40 % 2 != 0) {
                            i5 = i39 * 16;
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            i6 = ((-405) - i5) >> (406 - (~(-(-i3))));
                        } else {
                            i5 = i39 + 16;
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i41 = i5 * (-405);
                            int i42 = -(-(i3 * 407));
                            i6 = ((i41 | i42) << 1) - (i41 ^ i42);
                        }
                        int i43 = ~i3;
                        int i44 = ~((i43 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i43 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i45 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i46 = (i45 ^ i5) | (i45 & i5);
                        int i47 = ~((i46 & i3) | (i46 ^ i3));
                        int i48 = (-406) * ((i44 & i47) | (i44 ^ i47));
                        int i49 = (i6 ^ i48) + ((i6 & i48) << 1);
                        int i50 = ~i3;
                        int i51 = b;
                        int i52 = i51 + 29;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i52 % 128;
                        int i53 = i52 % 2;
                        int i54 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-1);
                        int i55 = (i50 & i54) | (i50 ^ i54);
                        int i56 = (i49 - (~(-(-((-406) * (~((i55 & i5) | (i55 ^ i5)))))))) - 1;
                        int i57 = ~i5;
                        int i58 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i57) | (i57 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i59 = ~((i45 ^ i3) | (i45 & i3));
                        int i60 = i56 + (((i58 & i59) | (i58 ^ i59)) * 406);
                        int i61 = i51 + 53;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i61 % 128;
                        if (i61 % 2 == 0) {
                            int i62 = (i60 << 13) ^ i60;
                            int i63 = i62 >>> 17;
                            int i64 = ((~i62) & i63) | ((~i63) & i62);
                            int i65 = i64 << 5;
                            ((int[]) objArr5[0])[0] = ((~i64) & i65) | ((~i65) & i64);
                            objArr5[3] = strArr;
                            return objArr5;
                        }
                        int i66 = i60 * 99;
                        int i67 = (i66 & (~i60)) | ((~i66) & i60);
                        int i68 = i67 / 50;
                        int i69 = ((~i67) & i68) | ((~i68) & i67);
                        int i70 = i69 * 2;
                        ((int[]) objArr5[0])[1] = ((~i69) & i70) | ((~i70) & i69);
                        objArr5[2] = strArr;
                        return objArr5;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        Object[] objArr6 = {new PrintWriter(stringWriter)};
                        Object[] objArr7 = new Object[1];
                        a(new int[]{15, 19, 128, 0}, true, new byte[]{1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr7);
                        Class<?> cls3 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        a(new int[]{34, 15, 115, 13}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0}, objArr8);
                        cls3.getMethod((String) objArr8[0], PrintWriter.class).invoke(th2, objArr6);
                        string = stringWriter.toString();
                        DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                } catch (Throwable unused) {
                    Object[] objArr9 = new Object[1];
                    a(new int[]{49, 1, 36, 0}, true, new byte[]{0}, objArr9);
                    string = (String) objArr9[0];
                }
                int i71 = (~(i & 31)) & (i | 31);
                String[] strArr5 = {cls.getName(), string};
                int[] iArr4 = {i71};
                int i72 = ~i;
                int i73 = 596901302 + ((~((-574619657) | i72)) * (-783)) + (((~(i72 | 1103066871)) | (-601964588)) * 783) + 16;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i74 = i73 * 450;
                int i75 = -(-(i3 * (-448)));
                int i76 = (i74 & i75) + (i74 | i75);
                int i77 = ~i73;
                int i78 = ~((i77 & i3) | (i77 ^ i3));
                int i79 = ~i3;
                int i80 = ~((i79 & i73) | (i79 ^ i73) | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                int i81 = ((i80 & i78) | (i78 ^ i80)) * 449;
                int i82 = (i76 & i81) + (i81 | i76) + (i78 * (-1347));
                int i83 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (~i3) | i73);
                int i84 = ((i83 & i78) | (i78 ^ i83)) * 449;
                int i85 = (i82 & i84) + (i84 | i82);
                int i86 = i85 << 13;
                int i87 = (i86 | i85) & (~(i85 & i86));
                int i88 = i87 ^ (i87 >>> 17);
                ((int[]) objArr[0])[0] = i88 ^ (i88 << 5);
                Object[] objArr10 = {new int[1], iArr4, new int[]{i}, strArr5};
                return objArr10;
            }
        }
        int[] iArr5 = {-1844476378, 1276062274, -797088743, 965014536, -30564408, 800164665, 427080095, -63109426, -2128711273, 443823261, -421827424, -1596256068, -554832609, -49350782, -437871410, 1291703475, -587285223, 1359539528, -706062319, 1866472215};
        String[][] strArr6 = new String[1][];
        int iCurrentTimeMillis = ((int) System.currentTimeMillis()) ^ 343337308;
        int i89 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i90 = (i89 & 7) + (i89 | 7);
        b = i90 % 128;
        int i91 = i90 % 2;
        try {
            Object[] objArr11 = {Integer.valueOf(i ^ iCurrentTimeMillis), iArr5, Integer.valueOf(i2), strArr6};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-561316232);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 43042);
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 3111;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 23;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr12 = new Object[1];
                c(b3, b3, bArr2[5], objArr12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iIndexOf, iLastIndexOf, 974412207, false, (String) objArr12[0], new Class[]{Integer.TYPE, int[].class, Integer.TYPE, String[][].class});
            }
            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr11)).longValue();
            long j11 = -1659154679;
            long j12 = 46;
            long j13 = -1;
            long j14 = jLongValue2 ^ j13;
            long jMyUid = Process.myUid();
            long j15 = jMyUid ^ j13;
            long j16 = (j12 * j11) + (j12 * jLongValue2) + (((long) (-90)) * (j11 | ((j14 | j15) ^ j13))) + (((long) (-45)) * (((j14 | jMyUid) ^ j13) | ((j11 | jLongValue2) ^ j13))) + (((long) 45) * ((j13 ^ (j15 | j11)) | j14 | (((j11 ^ j13) | jMyUid) ^ j13))) + ((long) 1762888744);
            int i92 = (((~(529071711 | i)) | (-1790683734)) * 262) + 1503198642;
            int i93 = ~i;
            int i94 = ((int) (j16 >> 32)) & (i92 + (((~(529071711 | i93)) | (-1790683734)) * 262));
            int iNextInt2 = new Random().nextInt(1766863761);
            int i95 = ~(1034335394 | iNextInt2);
            int i96 = 354873745 + ((65797 | i95) * (-280)) + ((i95 | (~(402891015 | iNextInt2))) * 140);
            int i97 = ~(1034401191 | iNextInt2);
            int i98 = ~iNextInt2;
            int i99 = ((int) j16) & (i96 + (((~(i98 | (-631510177))) | i97 | (~((-65798) | i98))) * 140));
            int i100 = (i94 & i99) | (i94 ^ i99);
            int i101 = (i100 | iCurrentTimeMillis) & (~(i100 & iCurrentTimeMillis));
            if (i101 != i) {
                String[] strArr7 = strArr6[0];
                Object[] objArr13 = new Object[4];
                int[] iArr6 = new int[1];
                objArr13[0] = iArr6;
                int[] iArr7 = new int[1];
                objArr13[1] = iArr7;
                int i102 = b;
                int i103 = (i102 & 11) + (i102 | 11);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i103 % 128;
                int i104 = i103 % 2;
                int[] iArr8 = new int[1];
                objArr13[2] = iArr8;
                int i105 = i102 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i105 % 128;
                if (i105 % 2 != 0) {
                    ((int[]) objArr13[5])[0] = i;
                    iArr6[1] = i101;
                } else {
                    iArr8[0] = i;
                    iArr7[0] = i101;
                }
                int i106 = (-102862260) + (((~(1123703175 | i93)) | 537134104) * (-1188));
                int i107 = (~(i | (-1123703176))) | 537134104;
                int i108 = ~(581328283 | i93);
                int i109 = i106 + ((i107 | i108) * 594) + (((~((-1123703176) | i93)) | 1079508996 | i108) * 594);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i110 = b;
                int i111 = ((i110 | 67) << 1) - (i110 ^ 67);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i111 % 128;
                int i112 = i111 % 2;
                int i113 = (16 & i109) | (16 ^ i109);
                int i114 = (8047 - (~(TypedValues.PositionType.TYPE_PERCENT_WIDTH * i109))) + (i113 * (-502));
                int i115 = ~i109;
                int i116 = ~((i115 & (-17)) | ((-17) ^ i115));
                int i117 = i110 + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i117 % 128;
                int i118 = i117 % 2;
                int i119 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                int i120 = ~((-17) | i119);
                int i121 = (i116 & i120) | (i116 ^ i120);
                int i122 = i113 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                int i123 = ~i122;
                int i124 = (-502) * ((i121 & i123) | (i121 ^ i123));
                int i125 = (i114 & i124) + (i114 | i124);
                int i126 = (i110 & 5) + (i110 | 5);
                int i127 = i126 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i127;
                if (i126 % 2 != 0) {
                    int i128 = ((-17) ^ i119) | ((-17) & i119);
                    int i129 = ~((i128 & i109) | (i128 ^ i109));
                    int i130 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & i113) | (i113 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                    int i131 = -(-(TypedValues.PositionType.TYPE_DRAWPATH % ((i130 & i129) | (i129 ^ i130))));
                    int i132 = i3 >>> ((i125 ^ i131) + ((i131 & i125) << 1));
                    int i133 = i132 >> 19;
                    i26 = ((~i132) & i133) | ((~i133) & i132);
                    i27 = i26 * 74;
                } else {
                    int i134 = ((-17) ^ i119) | ((-17) & i119);
                    int i135 = ((~((i134 & i109) | (i134 ^ i109))) | (~i122)) * TypedValues.PositionType.TYPE_DRAWPATH;
                    int i136 = -(-(((i125 | i135) << 1) - (i135 ^ i125)));
                    int i137 = (i3 ^ i136) + ((i136 & i3) << 1);
                    i26 = (i137 << 13) ^ i137;
                    i27 = i26 >>> 17;
                }
                int i138 = i127 + 37;
                b = i138 % 128;
                int i139 = i138 % 2;
                int i140 = ((~i26) & i27) | ((~i27) & i26);
                int i141 = i140 << 5;
                ((int[]) objArr13[0])[0] = (i140 | i141) & (~(i140 & i141));
                objArr13[3] = strArr7;
                int i142 = i127 - (-1);
                b = i142 % 128;
                int i143 = i142 % 2;
                return objArr13;
            }
            try {
                Object[] objArr14 = new Object[1];
                a(new int[]{50, 26, 128, 23}, false, new byte[]{0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0}, objArr14);
                String str2 = (String) objArr14[0];
                int i144 = b;
                int i145 = (i144 ^ 97) + ((i144 & 97) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i145 % 128;
                int i146 = i145 % 2;
                Class<?> cls4 = Class.forName(str2);
                Object[] objArr15 = new Object[1];
                a(new int[]{76, 18, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, objArr15);
                if (cls4.getMethod((String) objArr15[0], new Class[0]).invoke(null, null) != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c4 = (char) (22877 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 594;
                        i7 = 16;
                        int pressedStateDuration = 17 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte[] bArr3 = $$a;
                        byte b4 = bArr3[5];
                        byte b5 = bArr3[7];
                        Object[] objArr16 = new Object[1];
                        c(b4, b5, b5, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, touchSlop, pressedStateDuration, -1471475267, false, (String) objArr16[0], null);
                    } else {
                        i7 = 16;
                    }
                    if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null) != 0) {
                        int i147 = b;
                        int i148 = ((i147 | 93) << 1) - (i147 ^ 93);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i148 % 128;
                        i8 = i148 % 2 != 0 ? i ^ 37 : (~(i & 9)) & (i | 9);
                    }
                    if (i8 != i) {
                        i14 = i7;
                        i11 = 1;
                        i12 = 4;
                        i13 = 0;
                    } else {
                        int i149 = ~i;
                        int i150 = (-428095139) + ((~((i149 ^ (-838541619)) | (i149 & (-838541619)) | 1210952164)) * 52);
                        int i151 = ~(((-1210952165) & i149) | ((-1210952165) ^ i149));
                        int i152 = i150 + (((~(((-838541619) & i93) | (i93 ^ (-838541619)))) | (i151 & 2695456) | (i151 ^ 2695456)) * (-52));
                        int i153 = ~((i149 & 838541618) | (838541618 ^ i149));
                        int i154 = ((i153 & (-2046798327)) | (i153 ^ (-2046798327))) * 52;
                        i9 = (i152 ^ i154) + ((i154 & i152) << 1);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i155 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        int i156 = ~((-1907296405) | i155);
                        int i157 = (i156 & 1879048336) | (1879048336 ^ i156);
                        int i158 = ~((268418381 ^ i155) | (268418381 & i155));
                        int i159 = (i157 & i158) | (i157 ^ i158);
                        int i160 = ~(((-240170314) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-240170314) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                        int i161 = 1865678398 + (((i159 & i160) | (i159 ^ i160)) * (-84));
                        int i162 = ~((268418381 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (268418381 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                        int i163 = (i162 & 1907296404) | (1907296404 ^ i162);
                        int i164 = ~((i155 & (-268418382)) | (i155 ^ (-268418382)));
                        int i165 = ((i164 & i163) | (i163 ^ i164)) * (-84);
                        int i166 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        int i167 = ~((i166 & (-268418382)) | (i166 ^ (-268418382)));
                        i10 = ((i161 & i165) + (i165 | i161)) - (~(-(-(((i167 & 240170313) | (i167 ^ 240170313)) * 84))));
                        i11 = 1;
                        if (i9 > i10 - 1) {
                            i12 = 4;
                            int i168 = 4 % 4;
                        } else {
                            i12 = 4;
                        }
                        i13 = 0;
                        i14 = 0;
                    }
                    String[] strArr8 = new String[i13];
                    Object[] objArr17 = new Object[i12];
                    objArr17[i13] = new int[i11];
                    iArr = new int[i11];
                    objArr17[i11] = iArr;
                    int[] iArr9 = new int[i11];
                    objArr17[2] = iArr9;
                    i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                    b = i15 % 128;
                    iArr2 = iArr9;
                    if (i15 % 2 == 0) {
                        iArr2[1] = i;
                        iArr3 = iArr;
                        c3 = 0;
                    } else {
                        c3 = 0;
                        iArr2[0] = i;
                        iArr3 = iArr;
                    }
                    iArr3[c3] = i8;
                    i16 = 701438042 + (((~((-1274655957) | i)) | 430375502) * (-366)) + (((~((-1113109649) | i)) | 268829194) * 366) + i14;
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i169 = b;
                    i17 = i169 + 101;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                    if (i17 % 2 != 0) {
                        int i170 = -(-i3);
                        i18 = (55 >>> i16) * (((i170 | (-107)) << 1) - (i170 ^ (-107)));
                        i19 = (~i16) | i3;
                    } else {
                        int i171 = i16 * 55;
                        int i172 = -(-(i3 * (-107)));
                        i18 = ((i171 | i172) << 1) - (i171 ^ i172);
                        int i173 = ~i16;
                        i19 = (i173 & i3) | (i173 ^ i3);
                    }
                    i20 = ~i19;
                    int i174 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    i21 = ~((i174 & i3) | (i174 ^ i3));
                    i22 = (i169 & 75) + (i169 | 75);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
                    if (i22 % 2 != 0) {
                        i25 = i18 << ((-108) % ((i20 & i21) | (i20 ^ i21)));
                        int i175 = ~i16;
                        int i176 = ~((i175 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i175 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i177 = ~i3;
                        int i178 = ~((i177 & i16) | (i177 ^ i16));
                        i24 = (i176 & i178) | (i176 ^ i178);
                        i23 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    } else {
                        int i179 = (i18 - (~(-(-((-108) * ((i20 & i21) | (i20 ^ i21))))))) - 1;
                        int i180 = ~i16;
                        int i181 = ~((i180 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i180 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i182 = ~((~i3) | i16);
                        int i183 = (i181 & i182) | (i181 ^ i182);
                        i23 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        i24 = i183;
                        i25 = i179;
                    }
                    int i184 = ~((i23 & i16) | (i23 ^ i16));
                    int i185 = 54 * ((i24 & i184) | (i24 ^ i184));
                    int i186 = ((i25 | i185) << 1) - (i25 ^ i185);
                    int i187 = ~i3;
                    int i188 = ~((i187 & i16) | (i187 ^ i16));
                    int i189 = -(-(((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i188) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ i188)) * 54));
                    int i190 = ((i186 | i189) << 1) - (i189 ^ i186);
                    int i191 = i190 << 13;
                    int i192 = (i191 & (~i190)) | ((~i191) & i190);
                    int i193 = i192 >>> 17;
                    int i194 = ((~i192) & i193) | ((~i193) & i192);
                    int i195 = i194 << 5;
                    ((int[]) objArr17[0])[0] = (i194 | i195) & (~(i194 & i195));
                    objArr17[3] = strArr8;
                    return objArr17;
                }
                int i196 = b;
                int i197 = (i196 ^ 57) + ((i196 & 57) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i197 % 128;
                if (i197 % 2 != 0) {
                    int i198 = 0 / 0;
                }
                i7 = 16;
            } catch (Exception unused2) {
            }
            i8 = i;
            if (i8 != i) {
                i14 = i7;
                i11 = 1;
                i12 = 4;
                i13 = 0;
            } else {
                int i1410 = ~i;
                int i1510 = (-428095139) + ((~((i1410 ^ (-838541619)) | (i1410 & (-838541619)) | 1210952164)) * 52);
                int i1511 = ~(((-1210952165) & i1410) | ((-1210952165) ^ i1410));
                int i1512 = i1510 + (((~(((-838541619) & i93) | (i93 ^ (-838541619)))) | (i1511 & 2695456) | (i1511 ^ 2695456)) * (-52));
                int i1513 = ~((i1410 & 838541618) | (838541618 ^ i1410));
                int i1514 = ((i1513 & (-2046798327)) | (i1513 ^ (-2046798327))) * 52;
                i9 = (i1512 ^ i1514) + ((i1514 & i1512) << 1);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i1515 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                int i1516 = ~((-1907296405) | i1515);
                int i1517 = (i1516 & 1879048336) | (1879048336 ^ i1516);
                int i1518 = ~((268418381 ^ i1515) | (268418381 & i1515));
                int i1519 = (i1517 & i1518) | (i1517 ^ i1518);
                int i1610 = ~(((-240170314) & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | ((-240170314) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                int i1611 = 1865678398 + (((i1519 & i1610) | (i1519 ^ i1610)) * (-84));
                int i1612 = ~((268418381 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (268418381 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                int i1613 = (i1612 & 1907296404) | (1907296404 ^ i1612);
                int i1614 = ~((i1515 & (-268418382)) | (i1515 ^ (-268418382)));
                int i1615 = ((i1614 & i1613) | (i1613 ^ i1614)) * (-84);
                int i1616 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                int i1617 = ~((i1616 & (-268418382)) | (i1616 ^ (-268418382)));
                i10 = ((i1611 & i1615) + (i1615 | i1611)) - (~(-(-(((i1617 & 240170313) | (i1617 ^ 240170313)) * 84))));
                i11 = 1;
                if (i9 > i10 - 1) {
                    i12 = 4;
                    int i1618 = 4 % 4;
                } else {
                    i12 = 4;
                }
                i13 = 0;
                i14 = 0;
            }
            String[] strArr9 = new String[i13];
            Object[] objArr18 = new Object[i12];
            objArr18[i13] = new int[i11];
            iArr = new int[i11];
            objArr18[i11] = iArr;
            int[] iArr10 = new int[i11];
            objArr18[2] = iArr10;
            i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            b = i15 % 128;
            iArr2 = iArr10;
            if (i15 % 2 == 0) {
                iArr2[1] = i;
                iArr3 = iArr;
                c3 = 0;
            } else {
                c3 = 0;
                iArr2[0] = i;
                iArr3 = iArr;
            }
            iArr3[c3] = i8;
            i16 = 701438042 + (((~((-1274655957) | i)) | 430375502) * (-366)) + (((~((-1113109649) | i)) | 268829194) * 366) + i14;
            iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i1619 = b;
            i17 = i1619 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
            if (i17 % 2 != 0) {
                int i1710 = -(-i3);
                i18 = (55 >>> i16) * (((i1710 | (-107)) << 1) - (i1710 ^ (-107)));
                i19 = (~i16) | i3;
            } else {
                int i1711 = i16 * 55;
                int i1712 = -(-(i3 * (-107)));
                i18 = ((i1711 | i1712) << 1) - (i1711 ^ i1712);
                int i1713 = ~i16;
                i19 = (i1713 & i3) | (i1713 ^ i3);
            }
            i20 = ~i19;
            int i1714 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            i21 = ~((i1714 & i3) | (i1714 ^ i3));
            i22 = (i1619 & 75) + (i1619 | 75);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
            if (i22 % 2 != 0) {
                i25 = i18 << ((-108) % ((i20 & i21) | (i20 ^ i21)));
                int i1715 = ~i16;
                int i1716 = ~((i1715 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i1715 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                int i1717 = ~i3;
                int i1718 = ~((i1717 & i16) | (i1717 ^ i16));
                i24 = (i1716 & i1718) | (i1716 ^ i1718);
                i23 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            } else {
                int i1719 = (i18 - (~(-(-((-108) * ((i20 & i21) | (i20 ^ i21))))))) - 1;
                int i1810 = ~i16;
                int i1811 = ~((i1810 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i1810 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                int i1812 = ~((~i3) | i16);
                int i1813 = (i1811 & i1812) | (i1811 ^ i1812);
                i23 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                i24 = i1813;
                i25 = i1719;
            }
            int i1814 = ~((i23 & i16) | (i23 ^ i16));
            int i1815 = 54 * ((i24 & i1814) | (i24 ^ i1814));
            int i1816 = ((i25 | i1815) << 1) - (i25 ^ i1815);
            int i1817 = ~i3;
            int i1818 = ~((i1817 & i16) | (i1817 ^ i16));
            int i1819 = -(-(((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i1818) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ i1818)) * 54));
            int i199 = ((i1816 | i1819) << 1) - (i1819 ^ i1816);
            int i1910 = i199 << 13;
            int i1911 = (i1910 & (~i199)) | ((~i1910) & i199);
            int i1912 = i1911 >>> 17;
            int i1913 = ((~i1911) & i1912) | ((~i1912) & i1911);
            int i1914 = i1913 << 5;
            ((int[]) objArr18[0])[0] = (i1913 | i1914) & (~(i1913 & i1914));
            objArr18[3] = strArr9;
            return objArr18;
        } catch (Throwable th4) {
            Throwable cause3 = th4.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, short r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r8 = 105 - r8
            byte[] r1 = com.bpjstku.databinding.ActivityVideoPlayerBinding.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2b
        L15:
            r3 = r2
        L16:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r6 = r6 + 1
            int r4 = -r4
            int r8 = r8 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivityVideoPlayerBinding.$$e(byte, short, short):java.lang.String");
    }
}
