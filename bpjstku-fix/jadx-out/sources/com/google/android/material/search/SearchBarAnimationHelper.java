package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
class SearchBarAnimationHelper {
    private static final long COLLAPSE_DURATION_MS = 250;
    private static final long COLLAPSE_FADE_IN_CHILDREN_DURATION_MS = 100;
    private static final long EXPAND_DURATION_MS = 300;
    private static final long EXPAND_FADE_OUT_CHILDREN_DURATION_MS = 75;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_DURATION_MS = 250;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_IN_START_DELAY_MS = 500;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_OUT_START_DELAY_MS = 750;
    private static final long ON_LOAD_ANIM_SECONDARY_DURATION_MS = 250;
    private static final long ON_LOAD_ANIM_SECONDARY_START_DELAY_MS = 250;
    private boolean collapsing;
    private Animator defaultCenterViewAnimator;
    private boolean expanding;
    private Animator secondaryViewAnimator;
    private static final byte[] $$c = {106, -22, 107, 95};
    private static final int $$f = 154;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {25, -93, -120, -48, 10, -4, -65, 49, 13, -2, 1, -15, 4, 11, -22, 11, -70, 57, 3, 4, -17, 11, -6, -15, 9, -64, 17, 3, 29, -54, 71, -41, -17, 5, -41, 27, 3, 25, -50, 70, -40, -17, 5, 31, -14, 9, -13, 4, -3, -32, 15, 22, -14, -10, 7, 4, -48, 42, -19, 4, 4, -10, 7, 4, -3, -5, -13, -4, 4, -10, 9, -5, 3, -4, -5, 3, -11, -3, 16, -15, -6, 16, -44, 32, -13, -1, 5, -10, -1, -1, -7, 18, -11, 6, -69};
    private static final int $$e = 157;
    private static final byte[] $$a = {84, 10, 24, -102, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 218;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int asBinder = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {47224, 47211, 47221, 47207, 47210, 47216, 47147, 47206, 47174, 47200, 47205, 47220, 47212, 47190, 47213, 47222, 47214, 47209, 47175, 47192, 47203, 47173, 47217, 47204, 47215, 47218, 47185, 47143, 47219, 47223, 47139, 47136, 47140, 47138, 47144, 47142, 47141, 47137, 47145};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719449;
    private static boolean b = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    private final Set<SearchBar.OnLoadAnimationCallback> onLoadAnimationCallbacks = new LinkedHashSet();
    private final Set<AnimatorListenerAdapter> expandAnimationListeners = new LinkedHashSet();
    private final Set<AnimatorListenerAdapter> collapseAnimationListeners = new LinkedHashSet();
    private boolean onLoadAnimationFadeInEnabled = true;
    private Animator runningExpandOrCollapseAnimator = null;

    interface OnLoadAnimationInvocation {
        void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback);
    }

    private static void a(byte b2, int i, byte b3, Object[] objArr) {
        int i2 = 55 - (b2 * 52);
        int i3 = (b3 * 14) + 84;
        byte[] bArr = $$a;
        int i4 = i * 52;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + (-i3)) - 11;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i3 = (i3 + (-bArr[i2])) - 11;
            i5 = i6;
        }
    }

    private static void d(byte b2, short s, byte b3, Object[] objArr) {
        int i = 42 - (b2 * 39);
        int i2 = 99 - (b3 * 15);
        byte[] bArr = $$d;
        int i3 = s * 13;
        byte[] bArr2 = new byte[i3 + 40];
        int i4 = i3 + 39;
        int i5 = -1;
        if (bArr == null) {
            i2 = i4 + i2 + 2;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i++;
                i2 = i2 + bArr[i] + 2;
            }
        }
    }

    SearchBarAnimationHelper() {
    }

    static /* synthetic */ void access$000(SearchBarAnimationHelper searchBarAnimationHelper, OnLoadAnimationInvocation onLoadAnimationInvocation) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        searchBarAnimationHelper.dispatchOnLoadAnimation(onLoadAnimationInvocation);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$102(SearchBarAnimationHelper searchBarAnimationHelper, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        searchBarAnimationHelper.expanding = z;
        int i5 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return z;
    }

    static /* synthetic */ Animator access$202(SearchBarAnimationHelper searchBarAnimationHelper, Animator animator) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        searchBarAnimationHelper.runningExpandOrCollapseAnimator = animator;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return animator;
    }

    static /* synthetic */ boolean access$302(SearchBarAnimationHelper searchBarAnimationHelper, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 109;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        searchBarAnimationHelper.collapsing = z;
        int i5 = i2 + 69;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void startOnLoadAnimation(SearchBar searchBar) {
        int i = 2 % 2;
        dispatchOnLoadAnimation(new OnLoadAnimationInvocation() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda1
            @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
            public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                onLoadAnimationCallback.onAnimationStart();
            }
        });
        TextView textView = searchBar.getTextView();
        final View centerView = searchBar.getCenterView();
        View secondaryActionMenuItemView = ToolbarUtils.getSecondaryActionMenuItemView(searchBar);
        final Animator secondaryViewAnimator = getSecondaryViewAnimator(textView, secondaryActionMenuItemView);
        secondaryViewAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchBarAnimationHelper.access$000(SearchBarAnimationHelper.this, new OnLoadAnimationInvocation() { // from class: com.google.android.material.search.SearchBarAnimationHelper$1$$ExternalSyntheticLambda0
                    @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
                    public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                        onLoadAnimationCallback.onAnimationEnd();
                    }
                });
            }
        });
        this.secondaryViewAnimator = secondaryViewAnimator;
        textView.setAlpha(0.0f);
        if (secondaryActionMenuItemView != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            secondaryActionMenuItemView.setAlpha(0.0f);
        }
        if (centerView instanceof AnimatableView) {
            Objects.requireNonNull(secondaryViewAnimator);
            ((AnimatableView) centerView).startAnimation(new AnimatableView.Listener() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda2
                @Override // com.google.android.material.animation.AnimatableView.Listener
                public final void onAnimationEnd() {
                    SearchBarAnimationHelper.$r8$lambda$1r7Y4hRSo4F1Esrbw5SdK9GHD3Q(secondaryViewAnimator);
                }
            });
            return;
        }
        if (centerView == 0) {
            secondaryViewAnimator.start();
            return;
        }
        centerView.setAlpha(0.0f);
        centerView.setVisibility(0);
        Animator defaultCenterViewAnimator = getDefaultCenterViewAnimator(centerView);
        this.defaultCenterViewAnimator = defaultCenterViewAnimator;
        defaultCenterViewAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                centerView.setVisibility(8);
                secondaryViewAnimator.start();
            }
        });
        defaultCenterViewAnimator.start();
        int i4 = asBinder + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void stopOnLoadAnimation(SearchBar searchBar) {
        int i = 2 % 2;
        Animator animator = this.secondaryViewAnimator;
        if (animator != null) {
            int i2 = asBinder + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            animator.end();
        }
        Animator animator2 = this.defaultCenterViewAnimator;
        if (animator2 != null) {
            int i4 = asBinder + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                animator2.end();
                int i5 = 52 / 0;
            } else {
                animator2.end();
            }
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof AnimatableView) {
            int i6 = asBinder + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 != 0) {
                ((AnimatableView) centerView).stopAnimation();
                throw null;
            }
            ((AnimatableView) centerView).stopAnimation();
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 4;
            }
        }
        if (centerView != 0) {
            int i9 = asBinder + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            int i10 = i9 % 2;
            centerView.setAlpha(0.0f);
        }
    }

    boolean isOnLoadAnimationFadeInEnabled() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onLoadAnimationFadeInEnabled;
        int i5 = i2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    void setOnLoadAnimationFadeInEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 17;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.onLoadAnimationFadeInEnabled = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 63;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31339), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2994, 17 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1182129903, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
                    int i4 = $10 + 17;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
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
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 252 - TextUtils.lastIndexOf("", '0', 0), 22 - (ViewConfiguration.getFadingEdgeLength() >> 16), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i6 = 33602;
        int i7 = 1687675375;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + i6), 3085 - View.combineMeasuredStates(0, 0), Gravity.getAbsoluteGravity(0, 0) + 26, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i6 = 33602;
                i7 = 1687675375;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!b) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i8 = $10 + 57;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        } else {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        }
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - Color.green(0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 3085, 25 - ((byte) KeyEvent.getModifierMetaStateMask()), -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0206  */
    void addOnLoadAnimationCallback(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37567);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 625;
            int iNormalizeMetaState = 14 - KeyEvent.normalizeMetaState(0);
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[7], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, offsetAfter, iNormalizeMetaState, -477065106, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, 126 - ExpandableListView.getPackedPositionChild(0L), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, Color.argb(0, 0, 0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 37567);
            int iMyTid = (Process.myTid() >> 22) + 625;
            int scrollDefaultDelay = 14 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b3, b3, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, iMyTid, scrollDefaultDelay, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (37567 - (ViewConfiguration.getTapTimeout() >> 16));
                int iMakeMeasureSpec = 625 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int touchSlop = 14 - (ViewConfiguration.getTouchSlop() >> 8);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, bArr3[5], b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, iMakeMeasureSpec, touchSlop, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i6 = ~iUptimeMillis;
            int i7 = (-454814732) + (((~(1390830018 | i6)) | 151619076) * (-108)) + (((~(i6 | 432908102)) | (~((-432908103) | iUptimeMillis)) | 1109540992) * 54) + ((iUptimeMillis | 1109540992) * 54) + 1222397862;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i4}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(null, null, Color.argb(0, 0, 0, 0) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(null, null, ExpandableListView.getPackedPositionType(0L) + 127, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = asBinder + 21;
                int i11 = i10 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11;
                if (i10 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                if (applicationContext instanceof ContextWrapper) {
                    int i12 = i11 + 97;
                    asBinder = i12 % 128;
                    int i13 = i12 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(null, null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(null, null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(null, null, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new byte[]{-98, -100, -99, -98, -98, -91, -90, -96, -98, -100, -90, -91, -127, -90, -89, -127, -95, -92, -116, -99, -90, -91, -95, -99, -127, -90, -93, -93, -96, -100, -127, -96, -96, -91, -125, -92, -93, -98, -94, -116, -98, -94, -94, -95, -116, -97, -93, -94, -95, -127, -116, -116, -95, -99, -99, -96, -97, -99, -98, -127, -127, -99, -116, -100}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(null, null, Color.argb(0, 0, 0, 0) + 127, new byte[]{-99, -97, -89, -127, -91, -100, -99, -112, -100, -92, -91, -98, -96, -96, -112, -96, -92, -92, -91, -94, -97, -99, -116, -100, -100, -127, -116, -91, -93, -95, -98, -96, -90, -96, -96, -92, -96, -98, -91, -98, -97, -99, -94, -95, -92, -97, -92, -100, -91, -99, -100, -116, -98, -89, -99, -116, -94, -98, -95, -89, -97, -125, -127, -112}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 1222397862};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[10];
                byte b6 = (byte) (b5 - 1);
                Object[] objArr15 = new Object[1];
                d(b5, b6, b6, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b7 = bArr4[10];
                byte b8 = (byte) (b7 - 1);
                byte b9 = b7;
                Object[] objArr16 = new Object[1];
                d(b8, b9, b9, objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i14 = ((int[]) objArr[0])[0];
                int i15 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    int i16 = asBinder + 83;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                    int i17 = i16 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 37567);
                        int i18 = 624 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int offsetBefore = 14 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        a(b10, bArr5[5], b10, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, i18, offsetBefore, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(null, null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(null, null, 127 - KeyEvent.normalizeMetaState(0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cMyPid = (char) ((Process.myPid() >> 22) + 37567);
                            int tapTimeout2 = 625 - (ViewConfiguration.getTapTimeout() >> 16);
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
                            byte[] bArr6 = $$a;
                            byte b11 = bArr6[5];
                            Object[] objArr20 = new Object[1];
                            a(b11, b11, bArr6[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, tapTimeout2, edgeSlop, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 37567);
                            int scrollBarFadeDuration2 = 625 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 14;
                            byte[] bArr7 = $$a;
                            byte b12 = bArr7[5];
                            Object[] objArr21 = new Object[1];
                            a(b12, bArr7[7], b12, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, scrollBarFadeDuration2, packedPositionGroup, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i19 = ((int[]) objArr[0])[0];
        int i20 = ((int[]) objArr[2])[0];
        if (i20 == i19) {
            int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            asBinder = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((int[]) objArr[1])[0];
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i24};
            int iIdentityHashCode = System.identityHashCode(this);
            int i26 = ~iIdentityHashCode;
            int i27 = i23 + 67081616 + (((-1611776211) | iIdentityHashCode) * (-676)) + (((~(132265773 | i26)) | 1611776210) * 676) + (((~(iIdentityHashCode | 1744041983)) | (~(i26 | (-1691472348))) | 79696137) * 676);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr[1])[0] = i29 ^ (i29 << 5);
            Object[] objArr22 = {new int[]{i25}, new int[1], iArr2, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i30 = 0;
                while (i30 < strArr3.length) {
                    arrayList.add(strArr3[i30]);
                    i30++;
                    int i31 = asBinder + 69;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i31 % 128;
                    int i32 = i31 % 2;
                }
            }
            int[] iArr3 = new int[i20];
            int i33 = i20 - 1;
            iArr3[i33] = 1;
            Toast.makeText((Context) null, iArr3[((i20 * i33) % 2) - 1], 1).show();
            int i34 = ((int[]) objArr[1])[0];
            int i35 = ((int[]) objArr[2])[0];
            int i36 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i37 = ~iIdentityHashCode2;
            int i38 = i34 + 196458960 + (((~((-137698254) | i37)) | 1686039867) * 519) + (((~(i37 | (-134288069))) | (~(1820327935 | iIdentityHashCode2))) * (-519)) + (((~(iIdentityHashCode2 | 1686039867)) | 137698253) * 519);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr[1])[0] = i40 ^ (i40 << 5);
            Object[] objArr23 = {new int[]{i36}, new int[1], new int[]{i35}, strArr4};
        }
        this.onLoadAnimationCallbacks.add(onLoadAnimationCallback);
    }

    boolean removeOnLoadAnimationCallback(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zRemove = this.onLoadAnimationCallbacks.remove(onLoadAnimationCallback);
        int i4 = asBinder + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return zRemove;
    }

    private void dispatchOnLoadAnimation(OnLoadAnimationInvocation onLoadAnimationInvocation) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<SearchBar.OnLoadAnimationCallback> it = this.onLoadAnimationCallbacks.iterator();
        while (it.hasNext()) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            onLoadAnimationInvocation.invoke(it.next());
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private Animator getDefaultCenterViewAnimator(View view) {
        int i = 2 % 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        long j = 0;
        valueAnimatorOfFloat.setDuration(this.onLoadAnimationFadeInEnabled ? 250L : 0L);
        if (this.onLoadAnimationFadeInEnabled) {
            int i2 = asBinder + 3;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            if (i2 % 2 != 0) {
                int i4 = 86 / 0;
            }
            int i5 = i3 + 59;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            j = ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_IN_START_DELAY_MS;
        }
        valueAnimatorOfFloat.setStartDelay(j);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        valueAnimatorOfFloat2.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat2.setDuration(250L);
        valueAnimatorOfFloat2.setStartDelay(ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_OUT_START_DELAY_MS);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        return animatorSet;
    }

    private Animator getSecondaryViewAnimator(TextView textView, View view) {
        int i = 2 % 2;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.play(getTextViewAnimator(textView));
        if (view != null) {
            int i2 = asBinder + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                animatorSet.play(getSecondaryActionMenuItemAnimator(view));
                throw null;
            }
            animatorSet.play(getSecondaryActionMenuItemAnimator(view));
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return animatorSet;
    }

    private Animator getTextViewAnimator(TextView textView) {
        ValueAnimator valueAnimatorOfFloat;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            View[] viewArr = new View[0];
            viewArr[1] = textView;
            valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(viewArr));
            valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(textView));
            valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        }
        valueAnimatorOfFloat.setDuration(250L);
        int i3 = asBinder + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return valueAnimatorOfFloat;
    }

    private Animator getSecondaryActionMenuItemAnimator(View view) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(250L);
        int i4 = asBinder + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return valueAnimatorOfFloat;
    }

    void startExpandAnimation(final SearchBar searchBar, final View view, final AppBarLayout appBarLayout, final boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            isCollapsing();
            obj.hashCode();
            throw null;
        }
        if (isCollapsing()) {
            int i3 = asBinder + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            Animator animator = this.runningExpandOrCollapseAnimator;
            if (animator != null) {
                animator.cancel();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 % 5;
                }
            }
        }
        this.expanding = true;
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7876x1b96b119(searchBar, view, appBarLayout, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$startExpandAnimation$0$com-google-android-material-search-SearchBarAnimationHelper, reason: not valid java name */
    /* synthetic */ void m7876x1b96b119(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z) {
        int i = 2 % 2;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(getFadeOutChildrenAnimator(searchBar, view), getExpandAnimator(searchBar, view, appBarLayout));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchBarAnimationHelper.access$202(SearchBarAnimationHelper.this, null);
            }
        });
        Iterator<AnimatorListenerAdapter> it = this.expandAnimationListeners.iterator();
        while (it.hasNext()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            animatorSet.addListener(it.next());
            int i4 = asBinder + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
        }
        if (z) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.runningExpandOrCollapseAnimator = animatorSet;
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Animator getExpandAnimator(final SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        int i = 2 % 2;
        Animator expandAnimator = getExpandCollapseAnimationHelper(searchBar, view, appBarLayout).setDuration(300L).addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                searchBar.setVisibility(4);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchBarAnimationHelper.access$102(SearchBarAnimationHelper.this, false);
            }
        }).getExpandAnimator();
        int i2 = asBinder + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return expandAnimator;
    }

    boolean isExpanding() {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.expanding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void addExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.expandAnimationListeners.add(animatorListenerAdapter);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    boolean removeExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Set<AnimatorListenerAdapter> set = this.expandAnimationListeners;
        if (i3 != 0) {
            return set.remove(animatorListenerAdapter);
        }
        set.remove(animatorListenerAdapter);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void startCollapseAnimation(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z) {
        Animator animator;
        int i = 2 % 2;
        if (isExpanding() && (animator = this.runningExpandOrCollapseAnimator) != null) {
            int i2 = asBinder + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            animator.cancel();
        }
        this.collapsing = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(getCollapseAnimator(searchBar, view, appBarLayout), getFadeInChildrenAnimator(searchBar));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                SearchBarAnimationHelper.access$202(SearchBarAnimationHelper.this, null);
            }
        });
        Iterator<AnimatorListenerAdapter> it = this.collapseAnimationListeners.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            animatorSet.setDuration(0L);
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        animatorSet.start();
        this.runningExpandOrCollapseAnimator = animatorSet;
    }

    private Animator getCollapseAnimator(final SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        int i = 2 % 2;
        Animator collapseAnimator = getExpandCollapseAnimationHelper(searchBar, view, appBarLayout).setDuration(250L).addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                searchBar.stopOnLoadAnimation();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                searchBar.setVisibility(0);
                SearchBarAnimationHelper.access$302(SearchBarAnimationHelper.this, false);
            }
        }).getCollapseAnimator();
        int i2 = asBinder + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return collapseAnimator;
    }

    boolean isCollapsing() {
        boolean z;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.collapsing;
            int i4 = 64 / 0;
        } else {
            z = this.collapsing;
        }
        int i5 = i2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    void addCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.collapseAnimationListeners.add(animatorListenerAdapter);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    boolean removeCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.collapseAnimationListeners.remove(animatorListenerAdapter);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zRemove = this.collapseAnimationListeners.remove(animatorListenerAdapter);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return zRemove;
    }

    private ExpandCollapseAnimationHelper getExpandCollapseAnimationHelper(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        int top;
        int i = 2 % 2;
        ExpandCollapseAnimationHelper additionalUpdateListener = new ExpandCollapseAnimationHelper(searchBar, view).setAdditionalUpdateListener(getExpandedViewBackgroundUpdateListener(searchBar, view));
        int i2 = 0;
        if (appBarLayout != null) {
            int i3 = asBinder + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 != 0) {
                top = appBarLayout.getTop();
                int i4 = 60 / 0;
            } else {
                top = appBarLayout.getTop();
            }
            i2 = top;
            int i5 = asBinder + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
        }
        return additionalUpdateListener.setCollapsedViewOffsetY(i2).addEndAnchoredViews(getEndAnchoredViews(view));
    }

    private ValueAnimator.AnimatorUpdateListener getExpandedViewBackgroundUpdateListener(SearchBar searchBar, final View view) {
        int i = 2 % 2;
        final MaterialShapeDrawable materialShapeDrawableCreateWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(view.getContext());
        materialShapeDrawableCreateWithElevationOverlay.setCornerSize(searchBar.getCornerSize());
        materialShapeDrawableCreateWithElevationOverlay.setElevation(ViewCompat.getElevation(searchBar));
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchBarAnimationHelper.lambda$getExpandedViewBackgroundUpdateListener$1(materialShapeDrawableCreateWithElevationOverlay, view, valueAnimator);
            }
        };
        int i2 = asBinder + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return animatorUpdateListener;
    }

    static /* synthetic */ void lambda$getExpandedViewBackgroundUpdateListener$1(MaterialShapeDrawable materialShapeDrawable, View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            materialShapeDrawable.setInterpolation(1.0f % valueAnimator.getAnimatedFraction());
            ViewCompat.setBackground(view, materialShapeDrawable);
            view.setAlpha(0.0f);
        } else {
            materialShapeDrawable.setInterpolation(1.0f - valueAnimator.getAnimatedFraction());
            ViewCompat.setBackground(view, materialShapeDrawable);
            view.setAlpha(1.0f);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void lambda$getFadeOutChildrenAnimator$2(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        view.setAlpha(0.0f);
        int i4 = asBinder + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private Animator getFadeOutChildrenAnimator(SearchBar searchBar, View view) {
        int i = 2 % 2;
        List<View> fadeChildren = getFadeChildren(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(fadeChildren));
        valueAnimatorOfFloat.addUpdateListener(new SearchBarAnimationHelper$$ExternalSyntheticLambda0(view));
        valueAnimatorOfFloat.setDuration(75L);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return valueAnimatorOfFloat;
        }
        throw null;
    }

    private Animator getFadeInChildrenAnimator(SearchBar searchBar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        List<View> fadeChildren = getFadeChildren(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(fadeChildren));
        valueAnimatorOfFloat.setDuration(COLLAPSE_FADE_IN_CHILDREN_DURATION_MS);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        int i4 = asBinder + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return valueAnimatorOfFloat;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v5 java.util.List<android.view.View>) = (r1v4 java.util.List<android.view.View>), (r1v7 java.util.List<android.view.View>) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    private List<View> getFadeChildren(SearchBar searchBar) {
        List<View> children;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            children = ViewUtils.getChildren(searchBar);
            int i4 = 41 / 0;
            if (searchBar.getCenterView() != null) {
                int i5 = asBinder + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                i = i5 % 2;
                children.remove(searchBar.getCenterView());
                if (i != 0) {
                    throw null;
                }
            }
        } else {
            children = ViewUtils.getChildren(searchBar);
            if (searchBar.getCenterView() != null) {
                int i6 = asBinder + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                i = i6 % 2;
                children.remove(searchBar.getCenterView());
                if (i != 0) {
                    throw null;
                }
            }
        }
        int i7 = asBinder + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 63 / 0;
        }
        return children;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    private List<View> getEndAnchoredViews(View view) {
        ViewGroup viewGroup;
        int i = 2 % 2;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            int i2 = 1;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = (ViewGroup) view;
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
                asBinder = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    viewGroup.getChildAt(i2);
                    throw null;
                }
                View childAt = viewGroup.getChildAt(i2);
                if (!zIsLayoutRtl && (childAt instanceof ActionMenuView)) {
                    arrayList.add(childAt);
                } else if (zIsLayoutRtl) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                    asBinder = i5 % 128;
                    if (i5 % 2 == 0) {
                        boolean z = childAt instanceof ActionMenuView;
                        obj.hashCode();
                        throw null;
                    }
                    if (!(childAt instanceof ActionMenuView)) {
                        arrayList.add(childAt);
                    }
                } else {
                    continue;
                }
                i2++;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void $r8$lambda$1r7Y4hRSo4F1Esrbw5SdK9GHD3Q(Animator animator) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        animator.start();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r8 = r8 + 67
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r0 = com.google.android.material.search.SearchBarAnimationHelper.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchBarAnimationHelper.$$g(byte, int, int):java.lang.String");
    }
}
