package com.bpjstku.databinding;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityContactCenterBinding implements ViewBinding {
    public final MaterialButton btnCallCareContactCenter;
    public final ImageView imgCallCenter;
    public final ImageView imgProgramBackground;
    public final LinearLayout layoutAntrianOnlineInfo;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final RecyclerView rvService;
    public final TextView tvAntrianOnlineInfo;
    public final TextView tvOurServiceInfo;
    private static final byte[] $$c = {25, -93, -120, -48};
    private static final int $$d = 99;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {21, 65, -9, -121};
    private static final int $$b = 240;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {45557, 39261, 57532, 52207, 4918, 31379, 17879, 44325, 62569, 57260, 10027, 3669, 22954, 41208, 34885, 54161, 15048, 555, 28028, 45547, 39247, 57489, 52222, 4925, 31368, 17879, 44292, 62563, 57260, 10028, 3679, 22950, 41187, 34887, 54165, 15065, 572, 45565, 39232, 57500, 52216, 4923, 31375, 17876, 44396, 62563, 57261, 10054, 3710, 22945, 41204, 34901, 54165, 8351, 2161, 29101, 23253, 33367, 60321, 54521, 15388, 25934, 20119, 46632, 40761, 51340, 12767, 6510, 17067, 44023, 37709, 64576, 9716, 3385, 30281, 24469, 34592, 61543, 55805, 711, 27139, 21434, 48360, 58377, 52560, 13956, 7709, 18272, 45204, 39385, 49513, 10937, 5084, 18819, 24880, 6393, 45491, 39262, 57482, 52197, 4919, 31433, 17859, 44347, 62591, 57329, 9987, 3679, 22966, 41208, 34885, 54174, 14995, 552, 28012, 46296, 39957, 59237, 52917, 5693, 24905, 18576, 37865, 64312, 49800, 11731, 29988, 45485, 13580, 7650, 25662, 20294, 38852, 65074, 49514, 10639, 28893, 23300, 41915, 35498, 56607, 9292, 3325, 22328, 48740, 34526, 59859, 12391, 6314, 25562, 18950, 37555, 58868, 52334, 5955, 32663, 17978, 43370, 61846, 55491, 8964, 2958, 21224, 42267};
    private static long b = -9050249391560681170L;

    private static void c(int i, short s, byte b2, Object[] objArr) {
        int i2 = 98 - (b2 * 4);
        byte[] bArr = $$a;
        int i3 = s * 3;
        int i4 = (i * 3) + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = i4 + i3;
            i4++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2;
            int i7 = i4 + 1;
            i2 = i6 + bArr[i4];
            i4 = i7;
        }
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getRoot();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            return root;
        }
        obj.hashCode();
        throw null;
    }

    private ActivityContactCenterBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnCallCareContactCenter = materialButton;
        this.imgCallCenter = imageView;
        this.imgProgramBackground = imageView2;
        this.layoutAntrianOnlineInfo = linearLayout;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.rvService = recyclerView;
        this.tvAntrianOnlineInfo = textView;
        this.tvOurServiceInfo = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.rootView;
        int i4 = i2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return constraintLayout;
    }

    public static ActivityContactCenterBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityContactCenterBinding activityContactCenterBindingInflate = inflate(layoutInflater, null, false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityContactCenterBindingInflate;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r4
  0x001f: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    public static ActivityContactCenterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            viewInflate = layoutInflater.inflate(R.layout.activity_contact_center, viewGroup, false);
            if (z) {
                viewGroup.addView(viewInflate);
            }
        } else {
            viewInflate = layoutInflater.inflate(R.layout.activity_contact_center, viewGroup, false);
            if (z) {
                viewGroup.addView(viewInflate);
            }
        }
        ActivityContactCenterBinding activityContactCenterBindingBind = bind(viewInflate);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
        }
        return activityContactCenterBindingBind;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.rgb(0, 0, 0) + 16777216), KeyEvent.normalizeMetaState(0) + 2187, TextUtils.indexOf("", "", 0) + 40, 841711447, false, $$e(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 3011 - (ViewConfiguration.getTapTimeout() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 36505), KeyEvent.keyCodeFromString("") + 3376, 17 - View.resolveSizeAndState(0, 0, 0), -968507904, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i5 = $10 + 15;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 99;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36505), 3376 - View.MeasureSpec.getMode(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16, -968507904, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    public static ActivityContactCenterBinding bind(View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.btnCallCareContactCenter;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnCallCareContactCenter);
        if (materialButton != null) {
            i4 = R.id.imgCallCenter;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCallCenter);
            if (imageView != null) {
                i4 = R.id.imgProgramBackground;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgProgramBackground);
                if (imageView2 != null) {
                    i4 = R.id.layoutAntrianOnlineInfo;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutAntrianOnlineInfo);
                    if (linearLayout != null) {
                        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                        int i6 = i5 % 2;
                        i4 = R.id.layout_toolbar;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                        if (viewFindChildViewById != null) {
                            LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                            i4 = R.id.rvService;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvService);
                            if (recyclerView != null) {
                                i4 = R.id.tvAntrianOnlineInfo;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAntrianOnlineInfo);
                                if (textView != null) {
                                    i4 = R.id.tvOurServiceInfo;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvOurServiceInfo);
                                    if (textView2 != null) {
                                        return new ActivityContactCenterBinding((ConstraintLayout) view, materialButton, imageView, imageView2, linearLayout, layoutToolbarCenterBindingBind, recyclerView, textView, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 2650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivityContactCenterBinding.TuitionPaymentFragmentbindingInflater1(int, int):java.lang.Object[]");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, byte r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r0 = 1 - r8
            byte[] r1 = com.bpjstku.databinding.ActivityContactCenterBinding.$$c
            int r7 = r7 * 3
            int r7 = 115 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L19:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L2a:
            r3 = r1[r7]
        L2c:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivityContactCenterBinding.$$e(byte, byte, short):java.lang.String");
    }
}
