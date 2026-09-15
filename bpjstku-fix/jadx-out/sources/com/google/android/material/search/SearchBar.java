package com.google.android.material.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Set;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public class SearchBar extends Toolbar {
    private static final int DEFAULT_SCROLL_FLAGS = 53;
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SearchBar;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private final AccessibilityManager accessibilityManager;
    private MaterialShapeDrawable backgroundShape;
    private View centerView;
    private final boolean defaultMarginsEnabled;
    private final Drawable defaultNavigationIcon;
    private boolean defaultScrollFlagsEnabled;
    private final boolean forceDefaultNavigationOnClickListener;
    private final boolean layoutInflated;
    private int menuResId;
    private Integer navigationIconTint;
    private Drawable originalNavigationIconBackground;
    private final SearchBarAnimationHelper searchBarAnimationHelper;
    private final TextView textView;
    private final boolean tintNavigationIcon;
    private final AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    public static abstract class OnLoadAnimationCallback {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }

    private int defaultIfZero(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-search-SearchBar, reason: not valid java name */
    /* synthetic */ void m7874lambda$new$0$comgoogleandroidmaterialsearchSearchBar(boolean z) {
        setFocusableInTouchMode(z);
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.menuResId = -1;
        this.touchExplorationStateChangeListener = new AccessibilityManagerCompat.TouchExplorationStateChangeListener() { // from class: com.google.android.material.search.SearchBar$$ExternalSyntheticLambda1
            private static final byte[] $$c = {115, 98, 19, 9};
            private static final int $$d = 21;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 245;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59715, 59746, 59749, 59770, 59751, 59746, 59770, 59738, 59699, 59730, 59749, 59770, 59751, 59749, 59773, 59708, 59745, 59745, 59728, 59728, 59749, 59751, 59749, 59745, 59753, 59757, 59745, 59749, 59771, 59731, 59729, 59751, 59757, 59733, 59836, 59836, 59811, 59811, 59824, 59826, 59824, 59836, 59812, 59832, 59836, 59824, 59830, 59822, 59791, 59793, 59824, 59799, 59797, 59829, 59837, 59826, 59829, 59824, 59837, 59806, 59805, 59832, 59826, 59830, 59827, 59837, 59839, 59704, 59746, 59757, 59759, 59750, 59774, 59898, 59899, 59845, 59866, 59899, 59899, 59896, 59869, 59865, 59898, 59899, 59879, 59846, 59846, 59874, 59875, 59899, 59896, 59879, 59874, 59885, 59879, 59878, 59845, 59870, 59876, 59845, 59667, 59705, 59759, 59752, 59744, 59749, 59756, 59759, 59754, 59756, 59747, 59744, 59771, 59717};

            private static void b(short s, byte b, short s2, Object[] objArr) {
                int i3 = 98 - (b * 14);
                byte[] bArr = $$a;
                int i4 = 144 - s;
                byte[] bArr2 = new byte[s2 + 1];
                int i5 = -1;
                if (bArr == null) {
                    i3 = (i4 + s2) - 11;
                    i4 = i4;
                }
                while (true) {
                    i5++;
                    int i6 = i4 + 1;
                    bArr2[i5] = (byte) i3;
                    if (i5 == s2) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i3 = (i3 + bArr[i6]) - 11;
                        i4 = i6;
                    }
                }
            }

            @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                int i3 = 2 % 2;
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                this.f$0.m7874lambda$new$0$comgoogleandroidmaterialsearchSearchBar(z);
                if (i5 == 0) {
                    int i6 = 95 / 0;
                }
            }

            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i3;
                int i4 = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                int i5 = 0;
                int i6 = iArr[0];
                int i7 = 1;
                int i8 = iArr[1];
                int i9 = iArr[2];
                int i10 = iArr[3];
                char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                char c = '0';
                long j = 0;
                if (cArr != null) {
                    int i11 = $11 + 89;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i13 = 0;
                    while (i13 < length) {
                        try {
                            Object[] objArr2 = new Object[i7];
                            objArr2[i5] = Integer.valueOf(cArr[i13]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) i5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionType(j), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1270, TextUtils.indexOf("", c, i5, i5) + 19, 407021364, false, $$e(b, (byte) (b + 5), (byte) (-1)), new Class[]{Integer.TYPE});
                            }
                            cArr2[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i13++;
                            cArr = cArr;
                            i5 = 0;
                            i7 = 1;
                            c = '0';
                            j = 0;
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
                char[] cArr3 = new char[i8];
                System.arraycopy(cArr, i6, cArr3, 0, i8);
                if (bArr != null) {
                    char[] cArr4 = new char[i8];
                    setvideostabilizationmode.b = 0;
                    char c2 = 0;
                    while (setvideostabilizationmode.b < i8) {
                        if (bArr[setvideostabilizationmode.b] == 1) {
                            int i14 = $11 + 87;
                            $10 = i14 % 128;
                            if (i14 % 2 != 0) {
                                int i15 = setvideostabilizationmode.b;
                                Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b2 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 3224 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, 2133916302, false, $$e(b2, (byte) (b2 | 6), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                                int i16 = 96 / 0;
                            } else {
                                int i17 = setvideostabilizationmode.b;
                                Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b3 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 3225, KeyEvent.keyCodeFromString("") + 13, 2133916302, false, $$e(b3, (byte) (b3 | 6), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                            }
                        } else {
                            int i18 = setvideostabilizationmode.b;
                            Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char c3 = (char) (29945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                int iIndexOf = 1755 - TextUtils.indexOf("", "", 0, 0);
                                int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                                byte length2 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iIndexOf, scrollBarSize, 387247676, false, $$e((byte) 0, length2, (byte) (length2 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        }
                        c2 = cArr4[setvideostabilizationmode.b];
                        Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (41242 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1705 - View.MeasureSpec.makeMeasureSpec(0, 0), 22 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1434471773, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    }
                    cArr3 = cArr4;
                }
                if (i10 > 0) {
                    char[] cArr5 = new char[i8];
                    i3 = 0;
                    System.arraycopy(cArr3, 0, cArr5, 0, i8);
                    int i19 = i8 - i10;
                    System.arraycopy(cArr5, 0, cArr3, i19, i10);
                    System.arraycopy(cArr5, i10, cArr3, 0, i19);
                } else {
                    i3 = 0;
                }
                if (z) {
                    char[] cArr6 = new char[i8];
                    setvideostabilizationmode.b = i3;
                    while (setvideostabilizationmode.b < i8) {
                        cArr6[setvideostabilizationmode.b] = cArr3[(i8 - setvideostabilizationmode.b) - 1];
                        setvideostabilizationmode.b++;
                        int i20 = $10 + 1;
                        $11 = i20 % 128;
                        int i21 = i20 % 2;
                    }
                    cArr3 = cArr6;
                }
                if (i9 > 0) {
                    int i22 = $10 + 85;
                    $11 = i22 % 128;
                    if (i22 % 2 == 0) {
                        setvideostabilizationmode.b = 1;
                    } else {
                        setvideostabilizationmode.b = 0;
                    }
                    while (setvideostabilizationmode.b < i8) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                        setvideostabilizationmode.b++;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0479  */
            /* JADX WARN: Code duplicated, block: B:103:0x048c  */
            /* JADX WARN: Code duplicated, block: B:118:0x05e5  */
            /* JADX WARN: Code duplicated, block: B:120:0x05e7  */
            /* JADX WARN: Code duplicated, block: B:130:0x03ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:132:0x0365 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:137:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:41:0x01d2  */
            /* JADX WARN: Code duplicated, block: B:43:0x01d8  */
            /* JADX WARN: Code duplicated, block: B:46:0x01ee A[Catch: Exception -> 0x042a, TRY_LEAVE, TryCatch #4 {Exception -> 0x042a, blocks: (B:44:0x01e7, B:46:0x01ee), top: B:137:0x01e7 }] */
            /* JADX WARN: Code duplicated, block: B:49:0x0215 A[Catch: all -> 0x0318, TryCatch #6 {all -> 0x0318, blocks: (B:47:0x0208, B:49:0x0215, B:50:0x0249), top: B:141:0x0208, outer: #2 }] */
            /* JADX WARN: Code duplicated, block: B:61:0x0324 A[Catch: Exception -> 0x042d, TRY_LEAVE, TryCatch #2 {Exception -> 0x042d, blocks: (B:57:0x031c, B:59:0x0322, B:60:0x0323, B:61:0x0324, B:68:0x03b3, B:70:0x03ba, B:85:0x0419, B:77:0x03c2, B:79:0x03c8, B:80:0x03c9, B:89:0x0422, B:91:0x0428, B:92:0x0429, B:81:0x03ca, B:83:0x03d7, B:84:0x0412, B:64:0x0365, B:66:0x0372, B:67:0x03ac, B:47:0x0208, B:49:0x0215, B:50:0x0249), top: B:134:0x01ec, inners: #0, #1, #6 }] */
            /* JADX WARN: Code duplicated, block: B:66:0x0372 A[Catch: all -> 0x03c1, TryCatch #1 {all -> 0x03c1, blocks: (B:64:0x0365, B:66:0x0372, B:67:0x03ac), top: B:132:0x0365, outer: #2 }] */
            /* JADX WARN: Code duplicated, block: B:83:0x03d7 A[Catch: all -> 0x0421, TryCatch #0 {all -> 0x0421, blocks: (B:81:0x03ca, B:83:0x03d7, B:84:0x0412), top: B:130:0x03ca, outer: #2 }] */
            /* JADX WARN: Code duplicated, block: B:87:0x041f  */
            /* JADX WARN: Code duplicated, block: B:94:0x042d A[PHI: r2 r21
  0x042d: PHI (r2v26 ??) = (r2v25 ??), (r2v29 ??), (r2v30 ??), (r2v30 ??), (r2v38 ??) binds: [B:93:0x042a, B:129:0x042d, B:71:0x03bb, B:86:0x041d, B:54:0x0314] A[DONT_GENERATE, DONT_INLINE]
  0x042d: PHI (r21v1 int) = (r21v0 int), (r21v4 int), (r21v4 int), (r21v4 int), (r21v6 int) binds: [B:93:0x042a, B:129:0x042d, B:71:0x03bb, B:86:0x041d, B:54:0x0314] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:97:0x044c  */
            /* JADX WARN: Code duplicated, block: B:99:0x0471  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v10 */
            /* JADX WARN: Type inference failed for: r2v11, types: [int] */
            /* JADX WARN: Type inference failed for: r2v25 */
            /* JADX WARN: Type inference failed for: r2v26 */
            /* JADX WARN: Type inference failed for: r2v27 */
            /* JADX WARN: Type inference failed for: r2v28 */
            /* JADX WARN: Type inference failed for: r2v29 */
            /* JADX WARN: Type inference failed for: r2v30 */
            /* JADX WARN: Type inference failed for: r2v32, types: [int[]] */
            /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r2v38 */
            /* JADX WARN: Type inference failed for: r2v85 */
            /* JADX WARN: Type inference failed for: r2v86 */
            /* JADX WARN: Type inference failed for: r2v87 */
            /* JADX WARN: Type inference failed for: r2v88 */
            /* JADX WARN: Type inference failed for: r4v6 */
            /* JADX WARN: Type inference failed for: r9v4, types: [int[]] */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context2, int i3, int i4, int i5) throws Throwable {
                int i6;
                int i7;
                ?? r2;
                int i8;
                int i9;
                int i10;
                Object[] objArr;
                int i11;
                int i12;
                ?? r3;
                int i13;
                int i14;
                ?? r4;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                String str;
                String str2;
                int i24;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                boolean zEquals;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                int i25;
                int i26;
                int i27 = 2 % 2;
                int i28 = TuitionPaymentFragmentbindingInflater1 + 107;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i28 % 128;
                if (i28 % 2 != 0) {
                    int i29 = 74 / 0;
                }
                Object obj = null;
                if (context2 != null) {
                    try {
                        Object[] objArr3 = new Object[1];
                        a(new int[]{0, 23, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0}, objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        int[] iArr = {23, 18, 0, 0};
                        int i30 = TuitionPaymentFragmentbindingInflater1 + 79;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i30 % 128;
                        int i31 = i30 % 2;
                        Object[] objArr4 = new Object[1];
                        a(iArr, true, new byte[]{1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0}, objArr4);
                        Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context2, null);
                        Object[] objArr5 = new Object[1];
                        a(new int[]{41, 34, 77, 0}, true, new byte[]{0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr5);
                        Class<?> cls2 = Class.forName((String) objArr5[0]);
                        Object[] objArr6 = new Object[1];
                        a(new int[]{75, 5, 0, 0}, false, new byte[]{0, 0, 1, 0, 0}, objArr6);
                        int i32 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                        int i33 = TuitionPaymentFragmentbindingInflater1;
                        int i34 = ((i33 | 91) << 1) - (i33 ^ 91);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i34 % 128;
                        if (i34 % 2 != 0) {
                            i25 = (~(i3 & 1)) & (i3 | 1);
                            int i35 = -i32;
                            i26 = ((i32 & i35) | (i32 ^ i35)) - 1;
                        } else {
                            i25 = (i3 & (-2)) | ((~i3) & 1);
                            int i36 = -i32;
                            i26 = ((i32 & i36) | (i32 ^ i36)) >> 31;
                        }
                        int i37 = (~i26) & i3;
                        int i38 = i26 & i25;
                        i6 = (i38 & i37) | (i37 ^ i38);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i6 = i3;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 16950);
                        int iMyTid = (Process.myTid() >> 22) + 2739;
                        int i39 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12;
                        Object[] objArr7 = new Object[1];
                        b((short) 141, $$a[132], (byte) ($$b & 62), objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iMyTid, i39, 1501733736, false, (String) objArr7[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cRgb = (char) ((-16760267) - Color.rgb(0, 0, 0));
                        int iNormalizeMetaState = 2739 - KeyEvent.normalizeMetaState(0);
                        int iLastIndexOf = 12 - TextUtils.lastIndexOf("", '0', 0);
                        Object[] objArr8 = new Object[1];
                        b((short) 89, $$a[132], (byte) ($$b & 62), objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, iNormalizeMetaState, iLastIndexOf, 47863026, false, (String) objArr8[0], null);
                    }
                    Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null);
                    int i40 = TuitionPaymentFragmentbindingInflater1;
                    int i41 = (i40 ^ 73) + ((i40 & 73) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i41 % 128;
                    if (i41 % 2 != 0) {
                        set.contains(obj2);
                        obj.hashCode();
                        throw null;
                    }
                    if (!set.contains(obj2)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cAlpha = (char) (Color.alpha(0) + 16949);
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2739;
                            int iMyTid2 = 13 - (Process.myTid() >> 22);
                            byte[] bArr = $$a;
                            byte b = bArr[2];
                            Object[] objArr9 = new Object[1];
                            b((short) (-b), bArr[132], (byte) (-b), objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, edgeSlop, iMyTid2, 631063962, false, (String) objArr9[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                            r3 = 33;
                            if (Build.VERSION.SDK_INT > 33) {
                                r3 = new int[]{80, 28, 133, 27};
                                Object[] objArr10 = new Object[1];
                                a(r3, false, new byte[]{0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0}, objArr10);
                                Object[] objArr11 = {(String) objArr10[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 993;
                                    int iGreen = 8 - Color.green(0);
                                    short s = $$a[7];
                                    byte b2 = (byte) s;
                                    Object[] objArr12 = new Object[1];
                                    b(s, b2, b2, objArr12);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, capsMode, iGreen, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                                }
                                r3 = (Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                long jLongValue = ((Long) r3.invoke(null, objArr11)).longValue();
                                long j = 722660950;
                                long j2 = (((long) (-523)) * j) + (((long) 263) * jLongValue);
                                long j3 = 262;
                                long j4 = -1;
                                long j5 = ((j ^ j4) | jLongValue) ^ j4;
                                long j6 = jLongValue ^ j4;
                                long j7 = (j | j6) ^ j4;
                                i13 = i6;
                                long j8 = i3;
                                long j9 = j2 + ((j5 | j7 | ((j6 | j8) ^ j4)) * j3) + (((long) (-786)) * j7) + (j3 * ((((j8 ^ j4) | j6) ^ j4) | j5 | j7)) + ((long) (-923579187));
                                int i42 = (int) (j9 >> 32);
                                int iNextInt = new Random().nextInt(150982236);
                                int i43 = ~iNextInt;
                                int i44 = i42 & (1738041050 + (((~((-887611040) | i43)) | 549606923 | (~((-549615372) | i43))) * (-1136)) + (((~((-887611040) | iNextInt)) | (~((-549615372) | iNextInt)) | (~(887619487 | i43))) * (-568)) + (((~(iNextInt | (-549606924))) | (~(i43 | 549615371)) | (~(887611039 | i43))) * 568));
                                int i45 = i3;
                                int i46 = ~i45;
                                int i47 = (~(2106870472 | i46)) | 40482070;
                                int i48 = ~((-1477708481) | i45);
                                i14 = i44 | (((int) j9) & (((i47 | i48) * (-252)) + 174320637 + (((~(i46 | 2147352542)) | i48) * 252)));
                                int i49 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i50 = ((i49 | 15) << 1) - (i49 ^ 15);
                                TuitionPaymentFragmentbindingInflater1 = i50 % 128;
                                int i51 = i50 % 2;
                                r4 = i45;
                            } else {
                                r3 = i3;
                                i13 = i6;
                                Object[] objArr13 = new Object[1];
                                a(new int[]{108, 1, 0, 0}, true, new byte[]{1}, objArr13);
                                str = (String) objArr13[0];
                                Object[] objArr14 = new Object[1];
                                a(new int[]{109, 13, 0, 10}, false, new byte[]{0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1}, objArr14);
                                str2 = (String) objArr14[0];
                                int i52 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i24 = ((i52 | 47) << 1) - (i52 ^ 47);
                                TuitionPaymentFragmentbindingInflater1 = i24 % 128;
                                if (i24 % 2 == 0) {
                                    Object[] objArr15 = {str2};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 33603);
                                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 3085;
                                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26;
                                        short s2 = $$a[7];
                                        byte b3 = (byte) s2;
                                        Object[] objArr16 = new Object[1];
                                        b(s2, b3, b3, objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, packedPositionType, keyRepeatDelay, 1411172903, false, (String) objArr16[0], new Class[]{String.class});
                                    }
                                    zEquals = str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr15));
                                    int i53 = 43 / 0;
                                    if (zEquals) {
                                        i14 = 1;
                                        r4 = r3;
                                    } else {
                                        i14 = 0;
                                        r4 = r3;
                                    }
                                } else {
                                    objArr2 = new Object[]{str2};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cResolveSize = (char) (View.resolveSize(0, 0) + 33602);
                                        int i54 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3084;
                                        int iResolveSize = 26 - View.resolveSize(0, 0);
                                        short s3 = $$a[7];
                                        byte b4 = (byte) s3;
                                        Object[] objArr17 = new Object[1];
                                        b(s3, b4, b4, objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, i54, iResolveSize, 1411172903, false, (String) objArr17[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                        i14 = 1;
                                        r4 = r3;
                                    } else {
                                        i14 = 0;
                                        r4 = r3;
                                    }
                                }
                            }
                            i15 = (~((r4 == true ? 1 : 0) & 10)) & ((r4 == true ? 1 : 0) | 10);
                            int i55 = -i14;
                            i16 = ((i14 & i55) | (i14 ^ i55)) >> 31;
                            i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i18 = (i17 ^ 59) + ((i17 & 59) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                            if (i18 % 2 == 0) {
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            int i56 = (~i16) & (r4 == true ? 1 : 0);
                            int i57 = i16 & i15;
                            i19 = (i57 & (i56 == true ? 1 : 0)) | ((i56 == true ? 1 : 0) ^ i57);
                            int i58 = ((i17 | 83) << 1) - (i17 ^ 83);
                            int i59 = i58 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i59;
                            int i60 = i58 % 2;
                            i20 = i4 & 32;
                            i21 = ((i59 | 55) << 1) - (i59 ^ 55);
                            int i61 = i21 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i61;
                            if (i21 % 2 != 0) {
                                int i62 = -i20;
                                i22 = ((i20 & i62) | (i20 ^ i62)) - 21;
                            } else {
                                i22 = (i20 | (-i20)) >> 31;
                            }
                            i23 = ((i61 | 105) << 1) - (i61 ^ 105);
                            TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                            if (i23 % 2 == 0) {
                                throw null;
                            }
                            i7 = (i19 & (~i22)) | (i22 & (r4 == true ? 1 : 0));
                            i8 = i13;
                            r2 = r4;
                        } else if (Build.VERSION.SDK_INT == 30) {
                            int i63 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                            TuitionPaymentFragmentbindingInflater1 = i63 % 128;
                            int i64 = i63 % 2;
                            i7 = i3;
                            r2 = i7;
                            i8 = i6;
                        } else {
                            r3 = 33;
                            if (Build.VERSION.SDK_INT > 33) {
                                r3 = new int[]{80, 28, 133, 27};
                                Object[] objArr18 = new Object[1];
                                a(r3, false, new byte[]{0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0}, objArr18);
                                Object[] objArr19 = {(String) objArr18[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                    int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 993;
                                    int iGreen2 = 8 - Color.green(0);
                                    short s4 = $$a[7];
                                    byte b5 = (byte) s4;
                                    Object[] objArr110 = new Object[1];
                                    b(s4, b5, b5, objArr110);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity2, capsMode2, iGreen2, 410748506, false, (String) objArr110[0], new Class[]{String.class});
                                }
                                r3 = (Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                long jLongValue2 = ((Long) r3.invoke(null, objArr19)).longValue();
                                long j10 = 722660950;
                                long j11 = (((long) (-523)) * j10) + (((long) 263) * jLongValue2);
                                long j12 = 262;
                                long j13 = -1;
                                long j14 = ((j10 ^ j13) | jLongValue2) ^ j13;
                                long j15 = jLongValue2 ^ j13;
                                long j16 = (j10 | j15) ^ j13;
                                i13 = i6;
                                long j17 = i3;
                                long j18 = j11 + ((j14 | j16 | ((j15 | j17) ^ j13)) * j12) + (((long) (-786)) * j16) + (j12 * ((((j17 ^ j13) | j15) ^ j13) | j14 | j16)) + ((long) (-923579187));
                                int i410 = (int) (j18 >> 32);
                                int iNextInt2 = new Random().nextInt(150982236);
                                int i411 = ~iNextInt2;
                                int i412 = i410 & (1738041050 + (((~((-887611040) | i411)) | 549606923 | (~((-549615372) | i411))) * (-1136)) + (((~((-887611040) | iNextInt2)) | (~((-549615372) | iNextInt2)) | (~(887619487 | i411))) * (-568)) + (((~(iNextInt2 | (-549606924))) | (~(i411 | 549615371)) | (~(887611039 | i411))) * 568));
                                int i413 = i3;
                                int i414 = ~i413;
                                int i415 = (~(2106870472 | i414)) | 40482070;
                                int i416 = ~((-1477708481) | i413);
                                i14 = i412 | (((int) j18) & (((i415 | i416) * (-252)) + 174320637 + (((~(i414 | 2147352542)) | i416) * 252)));
                                int i417 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i510 = ((i417 | 15) << 1) - (i417 ^ 15);
                                TuitionPaymentFragmentbindingInflater1 = i510 % 128;
                                int i511 = i510 % 2;
                                r4 = i413;
                            } else {
                                r3 = i3;
                                i13 = i6;
                                Object[] objArr111 = new Object[1];
                                a(new int[]{108, 1, 0, 0}, true, new byte[]{1}, objArr111);
                                str = (String) objArr111[0];
                                Object[] objArr112 = new Object[1];
                                a(new int[]{109, 13, 0, 10}, false, new byte[]{0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1}, objArr112);
                                str2 = (String) objArr112[0];
                                int i512 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i24 = ((i512 | 47) << 1) - (i512 ^ 47);
                                TuitionPaymentFragmentbindingInflater1 = i24 % 128;
                                if (i24 % 2 == 0) {
                                    Object[] objArr113 = {str2};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char cAxisFromString2 = (char) (MotionEvent.axisFromString("") + 33603);
                                        int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 3085;
                                        int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26;
                                        short s5 = $$a[7];
                                        byte b6 = (byte) s5;
                                        Object[] objArr114 = new Object[1];
                                        b(s5, b6, b6, objArr114);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString2, packedPositionType2, keyRepeatDelay2, 1411172903, false, (String) objArr114[0], new Class[]{String.class});
                                    }
                                    zEquals = str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr113));
                                    int i513 = 43 / 0;
                                    if (zEquals) {
                                        i14 = 1;
                                        r4 = r3;
                                    } else {
                                        i14 = 0;
                                        r4 = r3;
                                    }
                                } else {
                                    objArr2 = new Object[]{str2};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cResolveSize2 = (char) (View.resolveSize(0, 0) + 33602);
                                        int i514 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3084;
                                        int iResolveSize2 = 26 - View.resolveSize(0, 0);
                                        short s6 = $$a[7];
                                        byte b7 = (byte) s6;
                                        Object[] objArr115 = new Object[1];
                                        b(s6, b7, b7, objArr115);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize2, i514, iResolveSize2, 1411172903, false, (String) objArr115[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                        i14 = 1;
                                        r4 = r3;
                                    } else {
                                        i14 = 0;
                                        r4 = r3;
                                    }
                                }
                            }
                            i15 = (~((r4 == true ? 1 : 0) & 10)) & ((r4 == true ? 1 : 0) | 10);
                            int i515 = -i14;
                            i16 = ((i14 & i515) | (i14 ^ i515)) >> 31;
                            i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i18 = (i17 ^ 59) + ((i17 & 59) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                            if (i18 % 2 == 0) {
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            int i516 = (~i16) & (r4 == true ? 1 : 0);
                            int i517 = i16 & i15;
                            i19 = (i517 & (i516 == true ? 1 : 0)) | ((i516 == true ? 1 : 0) ^ i517);
                            int i518 = ((i17 | 83) << 1) - (i17 ^ 83);
                            int i519 = i518 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i519;
                            int i65 = i518 % 2;
                            i20 = i4 & 32;
                            i21 = ((i519 | 55) << 1) - (i519 ^ 55);
                            int i66 = i21 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i66;
                            if (i21 % 2 != 0) {
                                int i67 = -i20;
                                i22 = ((i20 & i67) | (i20 ^ i67)) - 21;
                            } else {
                                i22 = (i20 | (-i20)) >> 31;
                            }
                            i23 = ((i66 | 105) << 1) - (i66 ^ 105);
                            TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                            if (i23 % 2 == 0) {
                                throw null;
                            }
                            i7 = (i19 & (~i22)) | (i22 & (r4 == true ? 1 : 0));
                            i8 = i13;
                            r2 = r4;
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i68 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                        TuitionPaymentFragmentbindingInflater1 = i68 % 128;
                        int i69 = i68 % 2;
                        i7 = i3;
                        r2 = i7;
                        i8 = i6;
                    } else {
                        try {
                            r3 = 33;
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    r3 = new int[]{80, 28, 133, 27};
                                    Object[] objArr116 = new Object[1];
                                    a(r3, false, new byte[]{0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0}, objArr116);
                                    try {
                                        Object[] objArr117 = {(String) objArr116[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char minimumFlingVelocity3 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int capsMode3 = TextUtils.getCapsMode("", 0, 0) + 993;
                                            int iGreen3 = 8 - Color.green(0);
                                            short s7 = $$a[7];
                                            byte b8 = (byte) s7;
                                            Object[] objArr118 = new Object[1];
                                            b(s7, b8, b8, objArr118);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity3, capsMode3, iGreen3, 410748506, false, (String) objArr118[0], new Class[]{String.class});
                                        }
                                        r3 = (Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                        long jLongValue3 = ((Long) r3.invoke(null, objArr117)).longValue();
                                        long j19 = 722660950;
                                        long j110 = (((long) (-523)) * j19) + (((long) 263) * jLongValue3);
                                        long j111 = 262;
                                        long j112 = -1;
                                        long j113 = ((j19 ^ j112) | jLongValue3) ^ j112;
                                        long j114 = jLongValue3 ^ j112;
                                        long j115 = (j19 | j114) ^ j112;
                                        i13 = i6;
                                        long j116 = i3;
                                        long j117 = j110 + ((j113 | j115 | ((j114 | j116) ^ j112)) * j111) + (((long) (-786)) * j115) + (j111 * ((((j116 ^ j112) | j114) ^ j112) | j113 | j115)) + ((long) (-923579187));
                                        int i418 = (int) (j117 >> 32);
                                        try {
                                            int iNextInt3 = new Random().nextInt(150982236);
                                            int i419 = ~iNextInt3;
                                            int i4110 = i418 & (1738041050 + (((~((-887611040) | i419)) | 549606923 | (~((-549615372) | i419))) * (-1136)) + (((~((-887611040) | iNextInt3)) | (~((-549615372) | iNextInt3)) | (~(887619487 | i419))) * (-568)) + (((~(iNextInt3 | (-549606924))) | (~(i419 | 549615371)) | (~(887611039 | i419))) * 568));
                                            int i4111 = i3;
                                            int i4112 = ~i4111;
                                            int i4113 = (~(2106870472 | i4112)) | 40482070;
                                            int i4114 = ~((-1477708481) | i4111);
                                            i14 = i4110 | (((int) j117) & (((i4113 | i4114) * (-252)) + 174320637 + (((~(i4112 | 2147352542)) | i4114) * 252)));
                                            int i4115 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i5110 = ((i4115 | 15) << 1) - (i4115 ^ 15);
                                            TuitionPaymentFragmentbindingInflater1 = i5110 % 128;
                                            int i5111 = i5110 % 2;
                                            r4 = i4111;
                                        } catch (Exception unused) {
                                            r3 = i3;
                                            i14 = 0;
                                            r4 = r3;
                                        }
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    r3 = i3;
                                    i13 = i6;
                                    Object[] objArr119 = new Object[1];
                                    a(new int[]{108, 1, 0, 0}, true, new byte[]{1}, objArr119);
                                    str = (String) objArr119[0];
                                    Object[] objArr1110 = new Object[1];
                                    a(new int[]{109, 13, 0, 10}, false, new byte[]{0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1}, objArr1110);
                                    str2 = (String) objArr1110[0];
                                    int i5112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    i24 = ((i5112 | 47) << 1) - (i5112 ^ 47);
                                    TuitionPaymentFragmentbindingInflater1 = i24 % 128;
                                    if (i24 % 2 == 0) {
                                        try {
                                            Object[] objArr1111 = {str2};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cAxisFromString3 = (char) (MotionEvent.axisFromString("") + 33603);
                                                int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 3085;
                                                int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26;
                                                short s8 = $$a[7];
                                                byte b9 = (byte) s8;
                                                Object[] objArr1112 = new Object[1];
                                                b(s8, b9, b9, objArr1112);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString3, packedPositionType3, keyRepeatDelay3, 1411172903, false, (String) objArr1112[0], new Class[]{String.class});
                                            }
                                            zEquals = str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr1111));
                                            int i5113 = 43 / 0;
                                            if (zEquals) {
                                                i14 = 1;
                                                r4 = r3;
                                            } else {
                                                i14 = 0;
                                                r4 = r3;
                                            }
                                        } catch (Throwable th3) {
                                            Throwable cause3 = th3.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th3;
                                        }
                                    } else {
                                        try {
                                            objArr2 = new Object[]{str2};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cResolveSize3 = (char) (View.resolveSize(0, 0) + 33602);
                                                int i5114 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3084;
                                                int iResolveSize3 = 26 - View.resolveSize(0, 0);
                                                short s9 = $$a[7];
                                                byte b10 = (byte) s9;
                                                Object[] objArr1113 = new Object[1];
                                                b(s9, b10, b10, objArr1113);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize3, i5114, iResolveSize3, 1411172903, false, (String) objArr1113[0], new Class[]{String.class});
                                            }
                                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                                i14 = 1;
                                                r4 = r3;
                                            } else {
                                                i14 = 0;
                                                r4 = r3;
                                            }
                                        } catch (Throwable th4) {
                                            Throwable cause4 = th4.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th4;
                                        }
                                    }
                                }
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            r3 = i3;
                            i13 = i6;
                        }
                        i15 = (~((r4 == true ? 1 : 0) & 10)) & ((r4 == true ? 1 : 0) | 10);
                        int i5115 = -i14;
                        i16 = ((i14 & i5115) | (i14 ^ i5115)) >> 31;
                        i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        i18 = (i17 ^ 59) + ((i17 & 59) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                        if (i18 % 2 == 0) {
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                        int i5116 = (~i16) & (r4 == true ? 1 : 0);
                        int i5117 = i16 & i15;
                        i19 = (i5117 & (i5116 == true ? 1 : 0)) | ((i5116 == true ? 1 : 0) ^ i5117);
                        int i5118 = ((i17 | 83) << 1) - (i17 ^ 83);
                        int i5119 = i5118 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i5119;
                        int i610 = i5118 % 2;
                        i20 = i4 & 32;
                        i21 = ((i5119 | 55) << 1) - (i5119 ^ 55);
                        int i611 = i21 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i611;
                        if (i21 % 2 != 0) {
                            int i612 = -i20;
                            i22 = ((i20 & i612) | (i20 ^ i612)) - 21;
                        } else {
                            i22 = (i20 | (-i20)) >> 31;
                        }
                        i23 = ((i611 | 105) << 1) - (i611 ^ 105);
                        TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                        if (i23 % 2 == 0) {
                            throw null;
                        }
                        i7 = (i19 & (~i22)) | (i22 & (r4 == true ? 1 : 0));
                        i8 = i13;
                        r2 = r4;
                    }
                    int i70 = (~i8) & r2;
                    int i71 = ~r2;
                    int i72 = i70 | (i8 & i71);
                    int i73 = (i72 | (-i72)) >> 31;
                    int i74 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                    int i75 = i74 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i75;
                    if (i74 % 2 == 0) {
                        int i76 = i7 & (~i73);
                        int i77 = i8 & i73;
                        i10 = (i76 & i77) | (i76 ^ i77);
                        objArr = new Object[3];
                        i9 = 1;
                        objArr[0] = new int[1];
                        objArr[0] = new int[1];
                    } else {
                        i9 = 1;
                        i10 = (i7 & (~i73)) | (i8 & i73);
                        objArr = new Object[4];
                        objArr[0] = new int[1];
                        objArr[1] = new int[1];
                    }
                    int i78 = (i75 ^ 67) + ((i75 & 67) << i9);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i78 % 128;
                    int i79 = i78 % 2;
                    int[] iArr2 = new int[i9];
                    objArr[2] = iArr2;
                    int i80 = ((~i10) & r2) | (i10 & i71);
                    int i81 = -i80;
                    int i82 = (((i80 & i81) | (i80 ^ i81)) >> 31) & 16;
                    ((int[]) objArr[0])[0] = r2;
                    int i83 = (i75 ^ 65) + ((i75 & 65) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i83 % 128;
                    if (i83 % 2 != 0) {
                        ((int[]) objArr[3])[0] = i10;
                        objArr[2] = null;
                        int i84 = 473038598 + (((~((-724325727) | i71)) | 687882514) * (-1188));
                        int i85 = 687882514 | (~(724325726 | r2));
                        int i86 = ~(764635955 | i71);
                        i11 = i84 + ((i85 | i86) * 594);
                        i12 = ((~(724325726 | i71)) | (-801079168) | i86) * 594;
                    } else {
                        iArr2[0] = i10;
                        objArr[3] = null;
                        i11 = 1155529908 + ((~((-4207170) | i71)) * 52) + (((~(381111710 | i71)) | (~(340801481 | i71)) | (-385318880)) * (-52));
                        i12 = ((~((-381111711) | i71)) | 336594312) * 52;
                    }
                    int i87 = i11 + i12;
                    int i88 = ((i82 * (-55)) - (~(-(-(i87 * (-55)))))) - 1;
                    int i89 = (i75 & 47) + (i75 | 47);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i89 % 128;
                    int i90 = i89 % 2;
                    int i91 = (i88 - (~(56 * ((~((i82 ^ r2) | ((i82 & r2) == true ? 1 : 0))) | i87)))) - 1;
                    int i92 = -(-((~(i82 | i87)) * (-56)));
                    int i93 = (i91 & i92) + (i91 | i92);
                    int i94 = ~r2;
                    int i95 = ~((i94 & i87) | (i94 ^ i87));
                    int i96 = (i75 ^ 39) + ((i75 & 39) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i96 % 128;
                    int i97 = i96 % 2;
                    int i98 = i93 + (((i95 & i82) | (i82 ^ i95)) * 56);
                    int i99 = (i5 & i98) + (i5 | i98);
                    int i100 = i99 << 13;
                    int i101 = (i99 | i100) & (~(i99 & i100));
                    int i102 = i101 >>> 17;
                    int i103 = ((~i101) & i102) | ((~i102) & i101);
                    int i104 = i103 << 5;
                    ((int[]) objArr[1])[0] = ((~i103) & i104) | ((~i104) & i103);
                    int i105 = ((i75 | 107) << 1) - (i75 ^ 107);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i105 % 128;
                    if (i105 % 2 == 0) {
                        return objArr;
                    }
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                } catch (Throwable th5) {
                    Throwable cause5 = th5.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th5;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r6, byte r7, int r8) {
                /*
                    int r6 = r6 * 4
                    int r0 = r6 + 1
                    byte[] r1 = com.google.android.material.search.SearchBar$$ExternalSyntheticLambda1.$$c
                    int r8 = r8 + 4
                    int r7 = 105 - r7
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L13
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L29
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r8 = r8 + 1
                    if (r3 != r6) goto L21
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L21:
                    int r3 = r3 + 1
                    r4 = r1[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L29:
                    int r7 = r7 + r8
                    r8 = r3
                    r3 = r4
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchBar$$ExternalSyntheticLambda1.$$e(int, byte, int):java.lang.String");
            }
        };
        Context context2 = getContext();
        validateAttributes(attributeSet);
        this.defaultNavigationIcon = AppCompatResources.getDrawable(context2, getDefaultNavigationIconResource());
        this.searchBarAnimationHelper = new SearchBarAnimationHelper();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.SearchBar, i, i2, new int[0]);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build();
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.SearchBar_backgroundTint, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.SearchBar_elevation, 0.0f);
        this.defaultMarginsEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_defaultMarginsEnabled, true);
        this.defaultScrollFlagsEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_hideNavigationIcon, false);
        this.forceDefaultNavigationOnClickListener = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.tintNavigationIcon = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchBar_tintNavigationIcon, true);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SearchBar_navigationIconTint)) {
            this.navigationIconTint = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(R.styleable.SearchBar_navigationIconTint, -1));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SearchBar_android_textAppearance, -1);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SearchBar_android_text);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.SearchBar_android_hint);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.SearchBar_strokeWidth, -1.0f);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.SearchBar_strokeColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            initNavigationIcon();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.layoutInflated = true;
        this.textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        ViewCompat.setElevation(this, dimension);
        initTextView(resourceId, string, string2);
        initBackground(shapeAppearanceModelBuild, color, dimension, dimension2, color2);
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setupTouchExplorationStateChangeListener();
    }

    private void setupTouchExplorationStateChangeListener() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.search.SearchBar.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    AccessibilityManagerCompat.addTouchExplorationStateChangeListener(SearchBar.this.accessibilityManager, SearchBar.this.touchExplorationStateChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(SearchBar.this.accessibilityManager, SearchBar.this.touchExplorationStateChangeListener);
                }
            });
        }
    }

    private void validateAttributes(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue(NAMESPACE_APP, "title") != null) {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
            if (attributeSet.getAttributeValue(NAMESPACE_APP, "subtitle") != null) {
                throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
            }
        }
    }

    private void initNavigationIcon() {
        setNavigationIcon(getNavigationIcon() == null ? this.defaultNavigationIcon : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    private void initTextView(int i, String str, String str2) {
        if (i != -1) {
            TextViewCompat.setTextAppearance(this.textView, i);
        }
        setText(str);
        setHint(str2);
        if (getNavigationIcon() == null) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams(), getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
    }

    private void initBackground(ShapeAppearanceModel shapeAppearanceModel, int i, float f, float f2, int i2) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        this.backgroundShape = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(getContext());
        this.backgroundShape.setElevation(f);
        if (f2 >= 0.0f) {
            this.backgroundShape.setStroke(f2, i2);
        }
        int color = MaterialColors.getColor(this, R.attr.colorControlHighlight);
        this.backgroundShape.setFillColor(ColorStateList.valueOf(i));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
        MaterialShapeDrawable materialShapeDrawable2 = this.backgroundShape;
        ViewCompat.setBackground(this, new RippleDrawable(colorStateListValueOf, materialShapeDrawable2, materialShapeDrawable2));
    }

    private ColorStateList getCompatBackgroundColorStateList(int i, int i2) {
        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused}, new int[0]};
        int iLayer = MaterialColors.layer(i, i2);
        return new ColorStateList(iArr, new int[]{iLayer, iLayer, i});
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated && this.centerView == null && !(view instanceof ActionMenuView)) {
            this.centerView = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.forceDefaultNavigationOnClickListener) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable) {
        int i;
        int color;
        if (!this.tintNavigationIcon || drawable == null) {
            return drawable;
        }
        Integer num = this.navigationIconTint;
        if (num != null) {
            color = num.intValue();
        } else {
            if (drawable == this.defaultNavigationIcon) {
                i = R.attr.colorOnSurfaceVariant;
            } else {
                i = R.attr.colorOnSurface;
            }
            color = MaterialColors.getColor(this, i);
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(drawableWrap, color);
        return drawableWrap;
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null) {
            return;
        }
        boolean z2 = !z;
        navigationIconButton.setClickable(z2);
        navigationIconButton.setFocusable(z2);
        Drawable background = navigationIconButton.getBackground();
        if (background != null) {
            this.originalNavigationIconBackground = background;
        }
        navigationIconButton.setBackgroundDrawable(z ? null : this.originalNavigationIconBackground);
        setHandwritingBoundsInsets();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof MenuBuilder;
        if (z) {
            ((MenuBuilder) menu).stopDispatchingItemsChanged();
        }
        super.inflateMenu(i);
        this.menuResId = i;
        if (z) {
            ((MenuBuilder) menu).startDispatchingItemsChanged();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureCenterView(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        layoutCenterView();
        setHandwritingBoundsInsets();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.backgroundShape);
        setDefaultMargins();
        setOrClearDefaultScrollFlags();
    }

    private void setDefaultMargins() {
        if (this.defaultMarginsEnabled && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = defaultIfZero(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = defaultIfZero(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = defaultIfZero(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = defaultIfZero(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    protected int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    protected int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    private void setOrClearDefaultScrollFlags() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.defaultScrollFlagsEnabled) {
                if (layoutParams.getScrollFlags() == 0) {
                    layoutParams.setScrollFlags(53);
                }
            } else if (layoutParams.getScrollFlags() == 53) {
                layoutParams.setScrollFlags(0);
            }
        }
    }

    private void measureCenterView(int i, int i2) {
        View view = this.centerView;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    private void layoutCenterView() {
        View view = this.centerView;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int measuredHeight = this.centerView.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        layoutChild(this.centerView, measuredWidth2, measuredHeight2, measuredWidth2 + measuredWidth, measuredHeight2 + measuredHeight);
    }

    private void layoutChild(View view, int i, int i2, int i3, int i4) {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            view.layout(getMeasuredWidth() - i3, i2, getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    private void setHandwritingBoundsInsets() {
        int width;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z = getLayoutDirection() == 1;
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null || !navigationIconButton.isClickable()) {
            width = 0;
        } else {
            width = z ? getWidth() - navigationIconButton.getLeft() : navigationIconButton.getRight();
        }
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(this);
        if (actionMenuView != null) {
            right = z ? actionMenuView.getRight() : getWidth() - actionMenuView.getLeft();
        }
        float f = -(z ? right : width);
        if (!z) {
            width = right;
        }
        setHandwritingBoundsOffsets(f, 0.0f, -width, 0.0f);
    }

    public View getCenterView() {
        return this.centerView;
    }

    public void setCenterView(View view) {
        View view2 = this.centerView;
        if (view2 != null) {
            removeView(view2);
            this.centerView = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public TextView getTextView() {
        return this.textView;
    }

    public CharSequence getText() {
        return this.textView.getText();
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setText(int i) {
        this.textView.setText(i);
    }

    public void clearText() {
        this.textView.setText("");
    }

    public CharSequence getHint() {
        return this.textView.getHint();
    }

    public void setHint(CharSequence charSequence) {
        this.textView.setHint(charSequence);
    }

    public void setHint(int i) {
        this.textView.setHint(i);
    }

    public int getStrokeColor() {
        return this.backgroundShape.getStrokeColor().getDefaultColor();
    }

    public void setStrokeColor(int i) {
        if (getStrokeColor() != i) {
            this.backgroundShape.setStrokeColor(ColorStateList.valueOf(i));
        }
    }

    public float getStrokeWidth() {
        return this.backgroundShape.getStrokeWidth();
    }

    public void setStrokeWidth(float f) {
        if (getStrokeWidth() != f) {
            this.backgroundShape.setStrokeWidth(f);
        }
    }

    public float getCornerSize() {
        return this.backgroundShape.getTopLeftCornerResolvedSize();
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.defaultScrollFlagsEnabled;
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.defaultScrollFlagsEnabled = z;
        setOrClearDefaultScrollFlags();
    }

    /* JADX INFO: renamed from: lambda$startOnLoadAnimation$1$com-google-android-material-search-SearchBar, reason: not valid java name */
    /* synthetic */ void m7875x58362b63() {
        this.searchBarAnimationHelper.startOnLoadAnimation(this);
    }

    public void startOnLoadAnimation() {
        post(new Runnable() { // from class: com.google.android.material.search.SearchBar$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7875x58362b63();
            }
        });
    }

    public void stopOnLoadAnimation() {
        this.searchBarAnimationHelper.stopOnLoadAnimation(this);
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.searchBarAnimationHelper.isOnLoadAnimationFadeInEnabled();
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.searchBarAnimationHelper.setOnLoadAnimationFadeInEnabled(z);
    }

    public void addOnLoadAnimationCallback(OnLoadAnimationCallback onLoadAnimationCallback) throws Throwable {
        this.searchBarAnimationHelper.addOnLoadAnimationCallback(onLoadAnimationCallback);
    }

    public boolean removeOnLoadAnimationCallback(OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.searchBarAnimationHelper.removeOnLoadAnimationCallback(onLoadAnimationCallback);
    }

    public boolean isExpanding() {
        return this.searchBarAnimationHelper.isExpanding();
    }

    public boolean expand(View view) {
        return expand(view, null);
    }

    public boolean expand(View view, AppBarLayout appBarLayout) {
        return expand(view, appBarLayout, false);
    }

    public boolean expand(View view, AppBarLayout appBarLayout, boolean z) {
        if ((view.getVisibility() == 0 || isExpanding()) && !isCollapsing()) {
            return false;
        }
        this.searchBarAnimationHelper.startExpandAnimation(this, view, appBarLayout, z);
        return true;
    }

    public void addExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addExpandAnimationListener(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeExpandAnimationListener(animatorListenerAdapter);
    }

    public boolean isCollapsing() {
        return this.searchBarAnimationHelper.isCollapsing();
    }

    public boolean collapse(View view) {
        return collapse(view, null);
    }

    public boolean collapse(View view, AppBarLayout appBarLayout) {
        return collapse(view, appBarLayout, false);
    }

    public boolean collapse(View view, AppBarLayout appBarLayout, boolean z) {
        if ((view.getVisibility() != 0 || isCollapsing()) && !isExpanding()) {
            return false;
        }
        this.searchBarAnimationHelper.startCollapseAnimation(this, view, appBarLayout, z);
        return true;
    }

    public void addCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addCollapseAnimationListener(animatorListenerAdapter);
    }

    public boolean removeCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeCollapseAnimationListener(animatorListenerAdapter);
    }

    int getMenuResId() {
        return this.menuResId;
    }

    float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        return materialShapeDrawable != null ? materialShapeDrawable.getElevation() : ViewCompat.getElevation(this);
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        private boolean initialized;

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public boolean shouldHeaderOverlapScrollingChild() {
            return true;
        }

        public ScrollingViewBehavior() {
            this.initialized = false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.initialized = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean zOnDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.initialized && (view2 instanceof AppBarLayout)) {
                this.initialized = true;
                setAppBarLayoutTransparent((AppBarLayout) view2);
            }
            return zOnDependentViewChanged;
        }

        private void setAppBarLayoutTransparent(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.text = text == null ? null : text.toString();
        return savedState;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchBar.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        String text;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.text);
        }
    }
}
