package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.firebase.sessions.dagger.internal.Providers;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes5.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;
    private int slideDistance = -1;
    private int slideEdge;
    private static final byte[] $$c = {68, -119, -76, 97};
    private static final int $$f = DerHeader.TAG_CLASS_PRIVATE;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, -1, 37, -59, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 191;
    private static final byte[] $$a = {113, 29, -123, -97, 1, 31, -11, 33, -64, 63, 25, 17, 1, 14, 5, -55, 31, 48, 17, 2, 7, 23, 21, -31, 45, 15, -3, 21};
    private static final int $$b = 173;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int g = 1;
    private static char b = 21122;
    private static char TuitionPaymentFragmentbindingInflater1 = 15272;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1908;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57030;

    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.material.transition.platform.SlideDistanceProvider.$$a
            int r6 = r6 * 6
            int r6 = r6 + 100
            int r7 = r7 + 4
            int r8 = r8 * 12
            int r1 = 19 - r8
            byte[] r1 = new byte[r1]
            int r8 = 18 - r8
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2d:
            int r6 = r6 + r7
            int r6 = r6 + (-10)
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.SlideDistanceProvider.a(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 103 - r8
            byte[] r0 = com.google.android.material.transition.platform.SlideDistanceProvider.$$d
            int r7 = r7 * 52
            int r1 = 53 - r7
            int r6 = r6 * 52
            int r6 = 56 - r6
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L2b:
            int r8 = -r8
            int r6 = r6 + 1
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.SlideDistanceProvider.c(int, short, int, java.lang.Object[]):void");
    }

    public SlideDistanceProvider(int i) {
        this.slideEdge = i;
    }

    public final int getSlideEdge() {
        int i;
        int i2 = 2 % 2;
        int i3 = g + 41;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
        if (i3 % 2 != 0) {
            i = this.slideEdge;
            int i5 = 24 / 0;
        } else {
            i = this.slideEdge;
        }
        int i6 = i4 + 77;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 51 / 0;
        }
        return i;
    }

    public final void setSlideEdge(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        int i4 = i3 % 128;
        g = i4;
        int i5 = i3 % 2;
        this.slideEdge = i;
        if (i5 == 0) {
            int i6 = 96 / 0;
        }
        int i7 = i4 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        int i8 = i7 % 2;
    }

    public final int getSlideDistance() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 33;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.slideDistance;
        int i5 = i2 + 7;
        g = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        throw new java.lang.IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r3.slideDistance = r4;
        r2 = r2 + 73;
        com.google.android.material.transition.platform.SlideDistanceProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if ((r2 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setSlideDistance(int r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.transition.platform.SlideDistanceProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.google.android.material.transition.platform.SlideDistanceProvider.g = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L15
            r1 = 25
            int r1 = r1 / 0
            if (r4 < 0) goto L28
            goto L17
        L15:
            if (r4 < 0) goto L28
        L17:
            r3.slideDistance = r4
            int r2 = r2 + 73
            int r4 = r2 % 128
            com.google.android.material.transition.platform.SlideDistanceProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L23
            return
        L23:
            r4 = 0
            r4.hashCode()
            throw r4
        L28:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead."
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.SlideDistanceProvider.setSlideDistance(int):void");
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public final Animator createAppear(ViewGroup viewGroup, View view) {
        Animator animatorCreateTranslationAppearAnimator;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            animatorCreateTranslationAppearAnimator = createTranslationAppearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
            int i3 = 55 / 0;
        } else {
            animatorCreateTranslationAppearAnimator = createTranslationAppearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
        }
        int i4 = g + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return animatorCreateTranslationAppearAnimator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    public final Animator createDisappear(ViewGroup viewGroup, View view) {
        int i = 2 % 2;
        int i2 = g + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.slideEdge;
        if (i3 == 0) {
            return createTranslationDisappearAnimator(viewGroup, view, i4, getSlideDistanceOrDefault(view.getContext()));
        }
        createTranslationDisappearAnimator(viewGroup, view, i4, getSlideDistanceOrDefault(view.getContext()));
        throw null;
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                break;
            }
            int i3 = $11 + 113;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i7 = i6;
                int i8 = (c4 + i5) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                int i9 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c2] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char doubleTapTimeout = (char) (47773 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int i10 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 468;
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, i10, deadChar, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 468 - TextUtils.indexOf("", "", 0), 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6 = i7 + 1;
                    c2 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2323, (-16777172) - Color.rgb(0, 0, 0), -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
        int i11 = $10 + 97;
        $11 = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private int getSlideDistanceOrDefault(Context context) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        int i3 = i2 % 128;
        g = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.slideDistance;
        if (i4 != -1) {
            int i5 = i3 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 == 0) {
                return i4;
            }
            obj.hashCode();
            throw null;
        }
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i, int i2) {
        float f;
        int i3 = 2 % 2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return createTranslationXAnimator(view2, i2 + translationX, translationX, translationX);
        }
        if (i == 5) {
            return createTranslationXAnimator(view2, translationX - i2, translationX, translationX);
        }
        if (i == 48) {
            return createTranslationYAnimator(view2, translationY - i2, translationY, translationY);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        g = i4 % 128;
        int i5 = i4 % 2;
        if (i == 80) {
            return createTranslationYAnimator(view2, i2 + translationY, translationY, translationY);
        }
        if (i != 8388611) {
            if (i == 8388613) {
                return createTranslationXAnimator(view2, !isRtl(view) ? i2 + translationX : translationX - i2, translationX, translationX);
            }
            throw new IllegalArgumentException("Invalid slide direction: ".concat(String.valueOf(i)));
        }
        if (isRtl(view)) {
            int i6 = g + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            f = i6 % 2 != 0 ? i2 / translationX : i2 + translationX;
        } else {
            f = translationX - i2;
        }
        Animator animatorCreateTranslationXAnimator = createTranslationXAnimator(view2, f, translationX, translationX);
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        g = i7 % 128;
        int i8 = i7 % 2;
        return animatorCreateTranslationXAnimator;
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i, int i2) {
        int i3 = 2 % 2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return createTranslationXAnimator(view2, translationX, translationX - i2, translationX);
        }
        if (i == 5) {
            return createTranslationXAnimator(view2, translationX, i2 + translationX, translationX);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        int i5 = i4 % 128;
        g = i5;
        if (i4 % 2 != 0 ? i == 48 : i == 54) {
            Animator animatorCreateTranslationYAnimator = createTranslationYAnimator(view2, translationY, i2 + translationY, translationY);
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
            g = i6 % 128;
            if (i6 % 2 != 0) {
                return animatorCreateTranslationYAnimator;
            }
            throw null;
        }
        int i7 = i5 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        int i8 = i7 % 2;
        if (i == 80) {
            return createTranslationYAnimator(view2, translationY, translationY - i2, translationY);
        }
        if (i == 8388611) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? translationX - i2 : i2 + translationX, translationX);
        }
        if (i == 8388613) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? i2 + translationX : translationX - i2, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: ".concat(String.valueOf(i)));
    }

    private static Animator createTranslationXAnimator(final View view, float f, float f2, final float f3) {
        int i = 2 % 2;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f2));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f3);
            }
        });
        int i2 = g + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static Animator createTranslationYAnimator(final View view, float f, float f2, final float f3) {
        int i = 2 % 2;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f, f2));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f3);
            }
        });
        int i2 = g + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static boolean isRtl(View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        g = i2 % 128;
        int i3 = i2 % 2;
        int layoutDirection = ViewCompat.getLayoutDirection(view);
        if (i3 != 0 ? layoutDirection == 1 : layoutDirection == 0) {
            return true;
        }
        int i4 = g + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:116:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:118:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:119:0x0804  */
    /* JADX WARN: Code duplicated, block: B:133:0x04ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x05d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x05d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x05d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x03ff A[PHI: r1
  0x03ff: PHI (r1v83 java.lang.Object[]) = (r1v82 java.lang.Object[]), (r1v104 java.lang.Object[]) binds: [B:53:0x03fd, B:49:0x03f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x040d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0419  */
    /* JADX WARN: Code duplicated, block: B:61:0x0424 A[PHI: r4
  0x0424: PHI (r4v123 int) = (r4v122 int), (r4v153 int) binds: [B:60:0x0422, B:57:0x0416] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0469  */
    /* JADX WARN: Code duplicated, block: B:64:0x047b  */
    /* JADX WARN: Code duplicated, block: B:69:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x0522  */
    /* JADX WARN: Code duplicated, block: B:76:0x057d A[Catch: all -> 0x0812, TryCatch #0 {all -> 0x0812, blocks: (B:74:0x0566, B:76:0x057d, B:77:0x05c3, B:91:0x0643, B:93:0x0650, B:94:0x0694, B:96:0x06b2, B:97:0x0703), top: B:128:0x0566 }] */
    public static int TuitionPaymentFragmentbindingInflater1(List list) throws Throwable {
        Method[] methodArr;
        Class<?> cls;
        Object obj;
        int i;
        int i2;
        Method method;
        int i3;
        String string;
        Method[] methodArr2;
        int i4;
        int i5;
        int i6;
        char[] cArr;
        int trimmedLength;
        int iTuitionPaymentFragmentbindingInflater1;
        int i7;
        Object[] objArr;
        int i8;
        int i9;
        int iIndexOf;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i15 = 2 % 2;
        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i17 = 1;
        int i18 = (i16 ^ 29) + ((i16 & 29) << 1);
        g = i18 % 128;
        int i19 = 11;
        int i20 = 0;
        if (i18 % 2 == 0) {
            methodArr = new Method[0];
            byte[] bArr = $$a;
            byte b2 = bArr[4];
            byte b3 = (byte) (-b2);
            Object[] objArr3 = new Object[1];
            a(b2, b3, (byte) (b3 + 1), objArr3);
            cls = Class.forName((String) objArr3[0]);
            byte b4 = bArr[4];
            Object[] objArr4 = new Object[1];
            a((byte) (b4 - 1), bArr[11], b4, objArr4);
            obj = objArr4[0];
        } else {
            methodArr = new Method[1];
            byte[] bArr2 = $$a;
            byte b5 = bArr2[4];
            byte b6 = (byte) (-b5);
            Object[] objArr5 = new Object[1];
            a(b5, b6, (byte) (b6 + 1), objArr5);
            cls = Class.forName((String) objArr5[0]);
            byte b7 = bArr2[4];
            Object[] objArr6 = new Object[1];
            a((byte) (b7 - 1), bArr2[11], b7, objArr6);
            obj = objArr6[0];
        }
        String str = (String) obj;
        int i21 = g;
        int i22 = (i21 ^ 25) + ((i21 & 25) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
        int i23 = i22 % 2;
        Method method2 = cls.getMethod(str, byte[].class);
        int i24 = g + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
        int i25 = i24 % 2;
        methodArr[0] = method2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2823;
            int trimmedLength2 = 22 - TextUtils.getTrimmedLength("");
            byte[] bArr3 = $$d;
            Object[] objArr7 = new Object[1];
            c(bArr3[5], bArr3[7], bArr3[10], objArr7);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, offsetBefore, trimmedLength2, 1814927978, false, (String) objArr7[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", "", 0, 0), 2823 - (ViewConfiguration.getTouchSlop() >> 8), 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i26 = 0;
            while (i26 < length) {
                Method method3 = declaredMethods[i26];
                try {
                    char[] cArr2 = {29550, 27755, 22266, 4100, 6429, 61665, 8315, 2010, 1886, 32799, 55492, 1148, 53768, 21559, 48441, 30731, 1476, 58145, 10973, 40875, 22368, 36703, 8471, 33556, 40785, 15441};
                    int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                    int iTuitionPaymentFragmentbindingInflater2 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i27 = (maxKeyCode * (-559)) + 13464;
                    int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i29 = ((i28 | 121) << 1) - (i28 ^ 121);
                    g = i29 % 128;
                    int i30 = i29 % 2;
                    int i31 = ~iTuitionPaymentFragmentbindingInflater2;
                    int i32 = -(-((-560) * (~((i31 & maxKeyCode) | (i31 ^ maxKeyCode)))));
                    int i33 = (i27 & i32) + (i32 | i27);
                    int i34 = (-25) | maxKeyCode;
                    int i35 = (i33 - (~(-(-((~((i34 & iTuitionPaymentFragmentbindingInflater2) | (i34 ^ iTuitionPaymentFragmentbindingInflater2))) * (-560)))))) - i17;
                    int i36 = ~((~maxKeyCode) | 24);
                    int i37 = ~iTuitionPaymentFragmentbindingInflater2;
                    int i38 = (i36 | (~((i37 & 24) | (i37 ^ 24)))) * 560;
                    int i39 = (i35 & i38) + (i38 | i35);
                    Object[] objArr8 = new Object[i17];
                    d(cArr2, i39, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[i20]);
                    int i40 = -TextUtils.lastIndexOf("", '0', i20);
                    int i41 = (i40 & 11) + (i40 | i19);
                    Object[] objArr9 = new Object[i17];
                    d(new char[]{5050, 61356, 15290, 57209, 21323, 11368, 22510, 10537, 23848, 21945, 24317, 14538, 29300, 19266}, i41, objArr9);
                    Object[] objArr10 = new Object[i17];
                    objArr10[i20] = Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[i20], null).invoke(method3, null)).intValue());
                    char[] cArr3 = {50629, 20546, 58573, 36947, 53763, 42182, 28004, 5144, 59568, 13151, 45616, 47839, 43799, 59847, 27204, 38063, 12911, 53900, 47948, 21741, 15173, 14457, 37375, 32189, 51861, 34700, 41546, 24761};
                    int i42 = -(ExpandableListView.getPackedPositionForChild(i20, i20) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i20, i20) == 0L ? 0 : -1));
                    int iTuitionPaymentFragmentbindingInflater3 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int i43 = i42 * (-381);
                    int i44 = g;
                    int i45 = (i44 & 109) + (i44 | 109);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i45 % 128;
                    int i46 = i45 % 2;
                    int i47 = ((i43 | 4800) << i17) - (i43 ^ 4800);
                    int i48 = ~i42;
                    int i49 = i48 * (-191);
                    int i50 = (i47 ^ i49) + ((i47 & i49) << i17);
                    int i51 = ~(25 | iTuitionPaymentFragmentbindingInflater3);
                    int i52 = i50 + (((i51 & i42) | (i42 ^ i51)) * 191);
                    int i53 = ~((i48 ^ 25) | (i48 & 25));
                    int i54 = ~((~iTuitionPaymentFragmentbindingInflater3) | 25);
                    int i55 = -(-(((i53 & i54) | (i53 ^ i54)) * 191));
                    int i56 = ((i52 | i55) << i17) - (i52 ^ i55);
                    Object[] objArr11 = new Object[i17];
                    d(cArr3, i56, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[i20]);
                    int i57 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                    int i58 = (i57 & 9) + (i57 | 9);
                    Object[] objArr12 = new Object[i17];
                    d(new char[]{54987, 52209, 18993, 56622, 44121, 15071, 36305, 6070, 37189, 59390}, i58, objArr12);
                    String str2 = (String) objArr12[i20];
                    Class<?>[] clsArr = new Class[i17];
                    clsArr[i20] = Integer.TYPE;
                    if (((Boolean) cls3.getMethod(str2, clsArr).invoke(null, objArr10)).booleanValue()) {
                        Class cls4 = Long.TYPE;
                        Object[] objArr13 = new Object[i17];
                        d(new char[]{29550, 27755, 22266, 4100, 6429, 61665, 8315, 2010, 1886, 32799, 55492, 1148, 53768, 21559, 48441, 30731, 1476, 58145, 10973, 40875, 22368, 36703, 8471, 33556, 40785, 15441}, 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr13);
                        String str3 = (String) objArr13[i20];
                        int i59 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
                        g = i59 % 128;
                        int i60 = i59 % 2;
                        Class<?> cls5 = Class.forName(str3);
                        char[] cArr4 = {48071, 11710, 12670, 57851, 58336, 22657, 24164, 41760, 31019, 53969, 19382, 8669, 29668, 44828, 46926, 21756};
                        int i61 = -(ViewConfiguration.getTouchSlop() >> 8);
                        int i62 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i63 = (i62 ^ 95) + ((i62 & 95) << i17);
                        g = i63 % 128;
                        int i64 = i63 % 2;
                        int iTuitionPaymentFragmentbindingInflater4 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                        int i65 = ~iTuitionPaymentFragmentbindingInflater4;
                        int i66 = ~(((-14) ^ i65) | ((-14) & i65));
                        int i67 = ~i61;
                        int i68 = g;
                        int i69 = i68 + 97;
                        methodArr2 = declaredMethods;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i69 % 128;
                        int i70 = i69 % 2;
                        int i71 = ~((i67 ^ iTuitionPaymentFragmentbindingInflater4) | (i67 & iTuitionPaymentFragmentbindingInflater4));
                        int i72 = (((i61 * 371) + 4823) - (~((-370) * ((i71 & i66) | (i66 ^ i71))))) - 1;
                        int i73 = ~i61;
                        int i74 = ((i68 | 77) << 1) - (i68 ^ 77);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i74 % 128;
                        int i75 = i74 % 2;
                        int i76 = ~((iTuitionPaymentFragmentbindingInflater4 ^ (-1)) | i73);
                        int i77 = ~(((-14) & iTuitionPaymentFragmentbindingInflater4) | ((-14) ^ iTuitionPaymentFragmentbindingInflater4));
                        int i78 = (i76 & i77) | (i76 ^ i77);
                        int i79 = ((i68 | 49) << 1) - (i68 ^ 49);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i79 % 128;
                        if (i79 % 2 != 0) {
                            int i80 = ~((i61 ^ 13) | (i61 & 13));
                            int i81 = i72 >>> ((-370) / ((i78 & i80) | (i78 ^ i80)));
                            int i82 = -(-(370 << (~(i61 | 13))));
                            i6 = ((i81 | i82) << 1) - (i81 ^ i82);
                            i5 = 1;
                        } else {
                            int i83 = ~((i61 ^ 13) | (i61 & 13));
                            int i84 = i72 - (~(-(-(((i78 & i83) | (i78 ^ i83)) * (-370)))));
                            i5 = 1;
                            int i85 = i84 - 1;
                            int i86 = (~(i61 | 13)) * 370;
                            i6 = (i85 & i86) + (i86 | i85);
                        }
                        Object[] objArr14 = new Object[i5];
                        d(cArr4, i6, objArr14);
                        if (cls4.equals(cls5.getMethod((String) objArr14[0], null).invoke(method3, null))) {
                            Object[] objArr15 = new Object[1];
                            d(new char[]{29550, 27755, 22266, 4100, 6429, 61665, 8315, 2010, 1886, 32799, 55492, 1148, 53768, 21559, 48441, 30731, 1476, 58145, 10973, 40875, 22368, 36703, 8471, 33556, 40785, 15441}, 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr15);
                            Class<?> cls6 = Class.forName((String) objArr15[0]);
                            int i87 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                            g = i87 % 128;
                            if (i87 % 2 == 0) {
                                cArr = new char[]{24155, 58631, 60978, 22318, 29502, 13458, 53471, 29059, 57264, 44064, 34768, 43833, 15445, 3914, 56898, 25652, 15736, 17265, 42825, 26607};
                                trimmedLength = TextUtils.getTrimmedLength("");
                                iTuitionPaymentFragmentbindingInflater1 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                                i7 = 38;
                            } else {
                                cArr = new char[]{24155, 58631, 60978, 22318, 29502, 13458, 53471, 29059, 57264, 44064, 34768, 43833, 15445, 3914, 56898, 25652, 15736, 17265, 42825, 26607};
                                trimmedLength = TextUtils.getTrimmedLength("");
                                iTuitionPaymentFragmentbindingInflater1 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                                i7 = 17;
                            }
                            int i88 = trimmedLength * (-711);
                            int i89 = i7 * 713;
                            int i90 = (i88 & i89) + (i88 | i89);
                            int i91 = ~i7;
                            int i92 = ~((i91 ^ trimmedLength) | (i91 & trimmedLength));
                            int i93 = ~iTuitionPaymentFragmentbindingInflater1;
                            int i94 = (i90 - (~(((~(i93 | trimmedLength)) | i92) * (-712)))) - 1;
                            int i95 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
                            int i96 = i95 % 128;
                            g = i96;
                            int i97 = i95 % 2;
                            int i98 = ~((i91 ^ i93) | (i93 & i91) | trimmedLength);
                            int i99 = (i7 & trimmedLength) | (trimmedLength ^ i7);
                            int i100 = i96 + 15;
                            i4 = length;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i100 % 128;
                            int i101 = i100 % 2;
                            int i102 = ~((i99 & iTuitionPaymentFragmentbindingInflater1) | (i99 ^ iTuitionPaymentFragmentbindingInflater1));
                            int i103 = (-712) * ((i98 & i102) | (i98 ^ i102));
                            int i104 = (i94 & i103) + (i103 | i94);
                            int i105 = ~iTuitionPaymentFragmentbindingInflater1;
                            int i106 = i96 + 11;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i106 % 128;
                            int i107 = i106 % 2;
                            int i108 = ~((trimmedLength & i105) | (i105 ^ trimmedLength));
                            int i109 = -(-(712 * ((i108 & i91) | (i91 ^ i108))));
                            int i110 = ((i104 | i109) << 1) - (i104 ^ i109);
                            Object[] objArr16 = new Object[1];
                            d(cArr, i110, objArr16);
                            Object objInvoke = cls6.getMethod((String) objArr16[0], null).invoke(method3, null);
                            int i111 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i112 = (i111 & 103) + (i111 | 103);
                            int i113 = i112 % 128;
                            g = i113;
                            if (i112 % 2 == 0) {
                                objArr = (Object[]) objInvoke;
                                if (objArr.length == 5) {
                                    i8 = ((i113 | 117) << 1) - (i113 ^ 117);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        i9 = 0;
                                        if (Long.TYPE.equals(objArr[0])) {
                                            char[] cArr5 = {29550, 27755, 22266, 4100, 6429, 61665, 8315, 2010, 1886, 32799, 55492, 1148, 53768, 21559, 48441, 30731, 1476, 58145, 10973, 40875, 22368, 36703, 8471, 33556, 40785, 15441};
                                            iIndexOf = TextUtils.indexOf("", "", i9, i9);
                                            int i114 = g + 63;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i114 % 128;
                                            int i115 = i114 % 2;
                                            int iTuitionPaymentFragmentbindingInflater5 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                                            int i116 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i117 = i116 + 81;
                                            g = i117 % 128;
                                            int i118 = i117 % 2;
                                            i10 = (221 * iIndexOf) - 5256;
                                            int i119 = (i116 & 55) + (i116 | 55);
                                            g = i119 % 128;
                                            int i120 = i119 % 2;
                                            i11 = ~((~iIndexOf) | (-25));
                                            i12 = ~iTuitionPaymentFragmentbindingInflater5;
                                            i13 = (i116 ^ 3) + ((i116 & 3) << 1);
                                            g = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                int i121 = (i12 & iIndexOf) | (i12 ^ iIndexOf);
                                                i14 = (i10 - (~(-(220 << (i11 | (~((i121 & 24) | (i121 ^ 24)))))))) - 1;
                                            } else {
                                                int i122 = (i12 & iIndexOf) | (i12 ^ iIndexOf);
                                                int i123 = ~((i122 & 24) | (i122 ^ 24));
                                                int i124 = -(-(((i11 & i123) | (i11 ^ i123)) * 220));
                                                i14 = (i10 ^ i124) + ((i124 & i10) << 1);
                                            }
                                            int i125 = ~((~iTuitionPaymentFragmentbindingInflater5) | 24);
                                            int i126 = (-440) * ((i125 & iIndexOf) | (iIndexOf ^ i125));
                                            int i127 = (i14 & i126) + (i14 | i126);
                                            int i128 = (iIndexOf & 24) | (iIndexOf ^ 24);
                                            int i129 = ((iTuitionPaymentFragmentbindingInflater5 & i128) | (i128 ^ iTuitionPaymentFragmentbindingInflater5)) * 220;
                                            int i130 = ((i127 | i129) << 1) - (i129 ^ i127);
                                            objArr2 = new Object[1];
                                            d(cArr5, i130, objArr2);
                                            if (!(!Class.forName((String) objArr2[0]).equals(objArr[1]))) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                                    int i131 = 2824 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    int iArgb = Color.argb(0, 0, 0, 0) + 22;
                                                    byte[] bArr4 = $$d;
                                                    Object[] objArr17 = new Object[1];
                                                    c(bArr4[5], bArr4[7], bArr4[10], objArr17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, i131, iArgb, 1814927978, false, (String) objArr17[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                    int i132 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2822;
                                                    int iGreen = 22 - Color.green(0);
                                                    byte[] bArr5 = $$d;
                                                    Object[] objArr18 = new Object[1];
                                                    c(bArr5[5], bArr5[7], bArr5[10], objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, i132, iGreen, 1814927978, false, (String) objArr18[0], null);
                                                }
                                                try {
                                                    Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                                                        int trimmedLength3 = 2823 - TextUtils.getTrimmedLength("");
                                                        int i133 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                        byte[] bArr6 = $$d;
                                                        byte b8 = bArr6[7];
                                                        Object[] objArr20 = new Object[1];
                                                        c(b8, bArr6[5], b8, objArr20);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, trimmedLength3, i133, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                                                    break;
                                                } catch (Throwable th) {
                                                    Throwable cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        i9 = 0;
                                        if (Long.TYPE.equals(objArr[0])) {
                                            char[] cArr6 = {29550, 27755, 22266, 4100, 6429, 61665, 8315, 2010, 1886, 32799, 55492, 1148, 53768, 21559, 48441, 30731, 1476, 58145, 10973, 40875, 22368, 36703, 8471, 33556, 40785, 15441};
                                            iIndexOf = TextUtils.indexOf("", "", i9, i9);
                                            int i1110 = g + 63;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1110 % 128;
                                            int i1111 = i1110 % 2;
                                            int iTuitionPaymentFragmentbindingInflater6 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                                            int i1112 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i1113 = i1112 + 81;
                                            g = i1113 % 128;
                                            int i1114 = i1113 % 2;
                                            i10 = (221 * iIndexOf) - 5256;
                                            int i1115 = (i1112 & 55) + (i1112 | 55);
                                            g = i1115 % 128;
                                            int i1210 = i1115 % 2;
                                            i11 = ~((~iIndexOf) | (-25));
                                            i12 = ~iTuitionPaymentFragmentbindingInflater6;
                                            i13 = (i1112 ^ 3) + ((i1112 & 3) << 1);
                                            g = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                int i1211 = (i12 & iIndexOf) | (i12 ^ iIndexOf);
                                                i14 = (i10 - (~(-(220 << (i11 | (~((i1211 & 24) | (i1211 ^ 24)))))))) - 1;
                                            } else {
                                                int i1212 = (i12 & iIndexOf) | (i12 ^ iIndexOf);
                                                int i1213 = ~((i1212 & 24) | (i1212 ^ 24));
                                                int i1214 = -(-(((i11 & i1213) | (i11 ^ i1213)) * 220));
                                                i14 = (i10 ^ i1214) + ((i1214 & i10) << 1);
                                            }
                                            int i1215 = ~((~iTuitionPaymentFragmentbindingInflater6) | 24);
                                            int i1216 = (-440) * ((i1215 & iIndexOf) | (iIndexOf ^ i1215));
                                            int i1217 = (i14 & i1216) + (i14 | i1216);
                                            int i1218 = (iIndexOf & 24) | (iIndexOf ^ 24);
                                            int i1219 = ((iTuitionPaymentFragmentbindingInflater6 & i1218) | (i1218 ^ iTuitionPaymentFragmentbindingInflater6)) * 220;
                                            int i134 = ((i1217 | i1219) << 1) - (i1219 ^ i1217);
                                            objArr2 = new Object[1];
                                            d(cArr6, i134, objArr2);
                                            if (!(!Class.forName((String) objArr2[0]).equals(objArr[1]))) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                                                    int i135 = 2824 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    int iArgb2 = Color.argb(0, 0, 0, 0) + 22;
                                                    byte[] bArr7 = $$d;
                                                    Object[] objArr110 = new Object[1];
                                                    c(bArr7[5], bArr7[7], bArr7[10], objArr110);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState2, i135, iArgb2, 1814927978, false, (String) objArr110[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                    int i136 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2822;
                                                    int iGreen2 = 22 - Color.green(0);
                                                    byte[] bArr8 = $$d;
                                                    Object[] objArr111 = new Object[1];
                                                    c(bArr8[5], bArr8[7], bArr8[10], objArr111);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout2, i136, iGreen2, 1814927978, false, (String) objArr111[0], null);
                                                }
                                                Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                                                    int trimmedLength4 = 2823 - TextUtils.getTrimmedLength("");
                                                    int i137 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                    byte[] bArr9 = $$d;
                                                    byte b9 = bArr9[7];
                                                    Object[] objArr21 = new Object[1];
                                                    c(b9, bArr9[5], b9, objArr21);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar2, trimmedLength4, i137, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                objArr = (Object[]) objInvoke;
                                if (objArr.length == 2) {
                                    i8 = ((i113 | 117) << 1) - (i113 ^ 117);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        i9 = 0;
                                        if (Long.TYPE.equals(objArr[0])) {
                                            char[] cArr7 = {29550, 27755, 22266, 4100, 6429, 61665, 8315, 2010, 1886, 32799, 55492, 1148, 53768, 21559, 48441, 30731, 1476, 58145, 10973, 40875, 22368, 36703, 8471, 33556, 40785, 15441};
                                            iIndexOf = TextUtils.indexOf("", "", i9, i9);
                                            int i1116 = g + 63;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1116 % 128;
                                            int i1117 = i1116 % 2;
                                            int iTuitionPaymentFragmentbindingInflater7 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                                            int i1118 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i1119 = i1118 + 81;
                                            g = i1119 % 128;
                                            int i11110 = i1119 % 2;
                                            i10 = (221 * iIndexOf) - 5256;
                                            int i11111 = (i1118 & 55) + (i1118 | 55);
                                            g = i11111 % 128;
                                            int i12110 = i11111 % 2;
                                            i11 = ~((~iIndexOf) | (-25));
                                            i12 = ~iTuitionPaymentFragmentbindingInflater7;
                                            i13 = (i1118 ^ 3) + ((i1118 & 3) << 1);
                                            g = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                int i12111 = (i12 & iIndexOf) | (i12 ^ iIndexOf);
                                                i14 = (i10 - (~(-(220 << (i11 | (~((i12111 & 24) | (i12111 ^ 24)))))))) - 1;
                                            } else {
                                                int i12112 = (i12 & iIndexOf) | (i12 ^ iIndexOf);
                                                int i12113 = ~((i12112 & 24) | (i12112 ^ 24));
                                                int i12114 = -(-(((i11 & i12113) | (i11 ^ i12113)) * 220));
                                                i14 = (i10 ^ i12114) + ((i12114 & i10) << 1);
                                            }
                                            int i12115 = ~((~iTuitionPaymentFragmentbindingInflater7) | 24);
                                            int i12116 = (-440) * ((i12115 & iIndexOf) | (iIndexOf ^ i12115));
                                            int i12117 = (i14 & i12116) + (i14 | i12116);
                                            int i12118 = (iIndexOf & 24) | (iIndexOf ^ 24);
                                            int i12119 = ((iTuitionPaymentFragmentbindingInflater7 & i12118) | (i12118 ^ iTuitionPaymentFragmentbindingInflater7)) * 220;
                                            int i138 = ((i12117 | i12119) << 1) - (i12119 ^ i12117);
                                            objArr2 = new Object[1];
                                            d(cArr7, i138, objArr2);
                                            if (!(!Class.forName((String) objArr2[0]).equals(objArr[1]))) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char cNormalizeMetaState3 = (char) KeyEvent.normalizeMetaState(0);
                                                    int i139 = 2824 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    int iArgb3 = Color.argb(0, 0, 0, 0) + 22;
                                                    byte[] bArr10 = $$d;
                                                    Object[] objArr113 = new Object[1];
                                                    c(bArr10[5], bArr10[7], bArr10[10], objArr113);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState3, i139, iArgb3, 1814927978, false, (String) objArr113[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char doubleTapTimeout3 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                    int i1310 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2822;
                                                    int iGreen3 = 22 - Color.green(0);
                                                    byte[] bArr11 = $$d;
                                                    Object[] objArr114 = new Object[1];
                                                    c(bArr11[5], bArr11[7], bArr11[10], objArr114);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout3, i1310, iGreen3, 1814927978, false, (String) objArr114[0], null);
                                                }
                                                Object[] objArr115 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                                                    int trimmedLength5 = 2823 - TextUtils.getTrimmedLength("");
                                                    int i1311 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                    byte[] bArr12 = $$d;
                                                    byte b10 = bArr12[7];
                                                    Object[] objArr22 = new Object[1];
                                                    c(b10, bArr12[5], b10, objArr22);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar3, trimmedLength5, i1311, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr115)).longValue();
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        i9 = 0;
                                        if (Long.TYPE.equals(objArr[0])) {
                                            char[] cArr8 = {29550, 27755, 22266, 4100, 6429, 61665, 8315, 2010, 1886, 32799, 55492, 1148, 53768, 21559, 48441, 30731, 1476, 58145, 10973, 40875, 22368, 36703, 8471, 33556, 40785, 15441};
                                            iIndexOf = TextUtils.indexOf("", "", i9, i9);
                                            int i11112 = g + 63;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11112 % 128;
                                            int i11113 = i11112 % 2;
                                            int iTuitionPaymentFragmentbindingInflater8 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                                            int i11114 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i11115 = i11114 + 81;
                                            g = i11115 % 128;
                                            int i11116 = i11115 % 2;
                                            i10 = (221 * iIndexOf) - 5256;
                                            int i11117 = (i11114 & 55) + (i11114 | 55);
                                            g = i11117 % 128;
                                            int i121110 = i11117 % 2;
                                            i11 = ~((~iIndexOf) | (-25));
                                            i12 = ~iTuitionPaymentFragmentbindingInflater8;
                                            i13 = (i11114 ^ 3) + ((i11114 & 3) << 1);
                                            g = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                int i121111 = (i12 & iIndexOf) | (i12 ^ iIndexOf);
                                                i14 = (i10 - (~(-(220 << (i11 | (~((i121111 & 24) | (i121111 ^ 24)))))))) - 1;
                                            } else {
                                                int i121112 = (i12 & iIndexOf) | (i12 ^ iIndexOf);
                                                int i121113 = ~((i121112 & 24) | (i121112 ^ 24));
                                                int i121114 = -(-(((i11 & i121113) | (i11 ^ i121113)) * 220));
                                                i14 = (i10 ^ i121114) + ((i121114 & i10) << 1);
                                            }
                                            int i121115 = ~((~iTuitionPaymentFragmentbindingInflater8) | 24);
                                            int i121116 = (-440) * ((i121115 & iIndexOf) | (iIndexOf ^ i121115));
                                            int i121117 = (i14 & i121116) + (i14 | i121116);
                                            int i121118 = (iIndexOf & 24) | (iIndexOf ^ 24);
                                            int i121119 = ((iTuitionPaymentFragmentbindingInflater8 & i121118) | (i121118 ^ iTuitionPaymentFragmentbindingInflater8)) * 220;
                                            int i1312 = ((i121117 | i121119) << 1) - (i121119 ^ i121117);
                                            objArr2 = new Object[1];
                                            d(cArr8, i1312, objArr2);
                                            if (!(!Class.forName((String) objArr2[0]).equals(objArr[1]))) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char cNormalizeMetaState4 = (char) KeyEvent.normalizeMetaState(0);
                                                    int i1313 = 2824 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    int iArgb4 = Color.argb(0, 0, 0, 0) + 22;
                                                    byte[] bArr13 = $$d;
                                                    Object[] objArr116 = new Object[1];
                                                    c(bArr13[5], bArr13[7], bArr13[10], objArr116);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState4, i1313, iArgb4, 1814927978, false, (String) objArr116[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method3);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char doubleTapTimeout4 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                    int i1314 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2822;
                                                    int iGreen4 = 22 - Color.green(0);
                                                    byte[] bArr14 = $$d;
                                                    Object[] objArr117 = new Object[1];
                                                    c(bArr14[5], bArr14[7], bArr14[10], objArr117);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout4, i1314, iGreen4, 1814927978, false, (String) objArr117[0], null);
                                                }
                                                Object[] objArr118 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char deadChar4 = (char) KeyEvent.getDeadChar(0, 0);
                                                    int trimmedLength6 = 2823 - TextUtils.getTrimmedLength("");
                                                    int i1315 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                    byte[] bArr15 = $$d;
                                                    byte b11 = bArr15[7];
                                                    Object[] objArr23 = new Object[1];
                                                    c(b11, bArr15[5], b11, objArr23);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar4, trimmedLength6, i1315, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr118)).longValue();
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        int i140 = (i26 ^ 105) + ((i26 & 105) << 1);
                        i26 = (i140 & (-104)) + (i140 | (-104));
                        length = i4;
                        declaredMethods = methodArr2;
                        i19 = 11;
                        i17 = 1;
                        i20 = 0;
                    } else {
                        methodArr2 = declaredMethods;
                    }
                    i4 = length;
                    int i141 = (i26 ^ 105) + ((i26 & 105) << 1);
                    i26 = (i141 & (-104)) + (i141 | (-104));
                    length = i4;
                    declaredMethods = methodArr2;
                    i19 = 11;
                    i17 = 1;
                    i20 = 0;
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
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2823;
            int iMakeMeasureSpec = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr16 = $$d;
            Object[] objArr24 = new Object[1];
            c(bArr16[5], bArr16[7], bArr16[10], objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout, iResolveOpacity, iMakeMeasureSpec, 1814927978, false, (String) objArr24[0], null);
        }
        Object[] objArr25 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int i142 = 2823 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iIndexOf2 = TextUtils.indexOf("", "") + 22;
            byte[] bArr17 = $$d;
            byte b12 = bArr17[7];
            byte b13 = bArr17[5];
            Object[] objArr26 = new Object[1];
            c(b12, b13, (byte) (b13 + 4), objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, i142, iIndexOf2, 1025296417, false, (String) objArr26[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr25);
        Object[] objArr27 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37656);
            int i143 = 2721 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i144 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18;
            byte[] bArr18 = $$d;
            byte b14 = bArr18[7];
            byte b15 = bArr18[5];
            Object[] objArr28 = new Object[1];
            c(b14, b15, (byte) (b15 + 4), objArr28);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, i143, i144, -1568796068, false, (String) objArr28[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr27)).longValue();
        long j = -145789655;
        long j2 = (((long) 960) * j) + (((long) (-1917)) * jLongValue);
        long j3 = 959;
        long j4 = -1;
        long j5 = jLongValue ^ j4;
        long j6 = (int) Runtime.getRuntime().totalMemory();
        long j7 = j6 ^ j4;
        long j8 = j2 + ((((j5 | j7) ^ j4) | ((j | j6) ^ j4)) * j3) + (((long) (-959)) * j5) + (j3 * (((j5 | j6) ^ j4) | ((j7 | j) ^ j4))) + ((long) (-1664616190));
        int i145 = ~new Random().nextInt(1656728843);
        int i146 = ((int) (j8 >> 32)) & (1754752898 + (((~(1000721789 | i145)) | 436504621) * (-828)) + ((i145 | 1000721789) * (-828)) + 331046008);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i147 = ((int) j8) & (249624309 + (((~(746734867 | elapsedCpuTime)) | (-2111006019)) * (-668)) + ((746734867 | (~((-2111006019) | elapsedCpuTime))) * 1336) + ((elapsedCpuTime | (-1364271169)) * 668));
        int i148 = (i146 & i147) | (i146 ^ i147);
        int i149 = i148 >>> 24;
        int i150 = i148 & ViewCompat.MEASURED_SIZE_MASK;
        if (i149 != 0) {
            int i151 = g;
            int i152 = ((i151 | 31) << 1) - (i151 ^ 31);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i152 % 128;
            int i153 = i152 % 2;
            i2 = 1;
            i = 1;
        } else {
            int i154 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            i = 1;
            int i155 = (i154 ^ 45) + ((i154 & 45) << 1);
            g = i155 % 128;
            int i156 = i155 % 2;
            i2 = 0;
        }
        int i157 = i2 != i ? 0 : i;
        if (i2 != i) {
            string = null;
        } else {
            int i158 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
            int i159 = i158 % 128;
            g = i159;
            if (i158 % 2 == 0) {
                int i160 = 0 / 0;
                if (i150 < methodArr.length) {
                    method = methodArr[i150];
                    if (method != null) {
                        i3 = (i159 & 111) + (i159 | 111);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                        if (i3 % 2 == 0) {
                            method.toString();
                            throw null;
                        }
                        string = method.toString();
                    }
                }
            } else if (i150 < methodArr.length) {
                method = methodArr[i150];
                if (method != null) {
                    i3 = (i159 & 111) + (i159 | 111);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                    if (i3 % 2 == 0) {
                        method.toString();
                        throw null;
                    }
                    string = method.toString();
                }
            }
            string = null;
        }
        list.add(string);
        return (i149 + 6) * i157;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, short r8, int r9) {
        /*
            int r7 = r7 * 2
            int r7 = 108 - r7
            byte[] r0 = com.google.android.material.transition.platform.SlideDistanceProvider.$$c
            int r9 = r9 * 3
            int r9 = 1 - r9
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r8 = r9
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.SlideDistanceProvider.$$g(byte, short, int):java.lang.String");
    }
}
