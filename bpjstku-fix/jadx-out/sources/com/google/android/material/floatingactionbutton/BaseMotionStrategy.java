package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.util.Preconditions;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionSpec;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
abstract class BaseMotionStrategy implements MotionStrategy {
    private final Context context;
    private MotionSpec defaultMotionSpec;
    private final ExtendedFloatingActionButton fab;
    private final ArrayList<Animator.AnimatorListener> listeners = new ArrayList<>();
    private MotionSpec motionSpec;
    private final AnimatorTracker tracker;

    BaseMotionStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker) {
        this.fab = extendedFloatingActionButton;
        this.context = extendedFloatingActionButton.getContext();
        this.tracker = animatorTracker;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void setMotionSpec(MotionSpec motionSpec) {
        this.motionSpec = motionSpec;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final MotionSpec getCurrentMotionSpec() {
        MotionSpec motionSpec = this.motionSpec;
        if (motionSpec != null) {
            return motionSpec;
        }
        if (this.defaultMotionSpec == null) {
            this.defaultMotionSpec = MotionSpec.createFromResource(this.context, getDefaultMotionSpecResource());
        }
        return (MotionSpec) Preconditions.checkNotNull(this.defaultMotionSpec);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void addAnimationListener(Animator.AnimatorListener animatorListener) {
        this.listeners.add(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void removeAnimationListener(Animator.AnimatorListener animatorListener) {
        this.listeners.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final List<Animator.AnimatorListener> getListeners() {
        return this.listeners;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public MotionSpec getMotionSpec() {
        return this.motionSpec;
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationStart(Animator animator) {
        this.tracker.onNextAnimationStart(animator);
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationEnd() {
        this.tracker.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationCancel() {
        this.tracker.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public AnimatorSet createAnimator() {
        return createAnimator(getCurrentMotionSpec());
    }

    AnimatorSet createAnimator(MotionSpec motionSpec) {
        ArrayList arrayList = new ArrayList();
        if (motionSpec.hasPropertyValues("opacity")) {
            arrayList.add(motionSpec.getAnimator("opacity", this.fab, View.ALPHA));
        }
        if (motionSpec.hasPropertyValues("scale")) {
            arrayList.add(motionSpec.getAnimator("scale", this.fab, View.SCALE_Y));
            arrayList.add(motionSpec.getAnimator("scale", this.fab, View.SCALE_X));
        }
        if (motionSpec.hasPropertyValues("width")) {
            arrayList.add(motionSpec.getAnimator("width", this.fab, ExtendedFloatingActionButton.WIDTH));
        }
        if (motionSpec.hasPropertyValues("height")) {
            arrayList.add(motionSpec.getAnimator("height", this.fab, ExtendedFloatingActionButton.HEIGHT));
        }
        if (motionSpec.hasPropertyValues("paddingStart")) {
            arrayList.add(motionSpec.getAnimator("paddingStart", this.fab, ExtendedFloatingActionButton.PADDING_START));
        }
        if (motionSpec.hasPropertyValues("paddingEnd")) {
            arrayList.add(motionSpec.getAnimator("paddingEnd", this.fab, ExtendedFloatingActionButton.PADDING_END));
        }
        if (motionSpec.hasPropertyValues("labelOpacity")) {
            arrayList.add(motionSpec.getAnimator("labelOpacity", this.fab, new Property<ExtendedFloatingActionButton, Float>(Float.class, "LABEL_OPACITY_PROPERTY") { // from class: com.google.android.material.floatingactionbutton.BaseMotionStrategy.1
                private static final byte[] $$c = {118, 35, -100, -35};
                private static final int $$d = 125;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {51, -5, 77, 89, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
                private static final int $$b = 206;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                private static int d = 1;
                private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 64701;
                private static char b = 621;
                private static char TuitionPaymentFragmentbindingInflater1 = 63662;
                private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 35326;

                private static void a(int i, short s, byte b2, Object[] objArr) {
                    int i2 = s + 4;
                    int i3 = (b2 * 4) + 84;
                    byte[] bArr = $$a;
                    int i4 = i * 15;
                    byte[] bArr2 = new byte[53 - i4];
                    int i5 = 52 - i4;
                    int i6 = -1;
                    if (bArr == null) {
                        i3 = (i3 + (-i5)) - 11;
                    }
                    while (true) {
                        i6++;
                        i2++;
                        bArr2[i6] = (byte) i3;
                        if (i6 == i5) {
                            objArr[0] = new String(bArr2, 0);
                            return;
                        }
                        i3 = (i3 + (-bArr[i2])) - 11;
                    }
                }

                private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                    int i2 = 2 % 2;
                    onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                    char[] cArr2 = new char[cArr.length - 2];
                    oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i3 = 0;
                        if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                            objArr[0] = new String(cArr2, 0, i);
                            return;
                        }
                        cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        int i4 = 58224;
                        int i5 = 0;
                        while (i5 < 16) {
                            int i6 = $10 + 7;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            char c = cArr3[1];
                            char c2 = cArr3[i3];
                            int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                            int i9 = c2 >>> 5;
                            try {
                                Object[] objArr2 = new Object[4];
                                objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                objArr2[2] = Integer.valueOf(i9);
                                objArr2[1] = Integer.valueOf(i8);
                                objArr2[i3] = Integer.valueOf(c);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cAlpha = (char) (47773 - Color.alpha(i3));
                                    int longPressTimeout = 468 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                    int iIndexOf = 13 - TextUtils.indexOf("", "", i3);
                                    Class[] clsArr = new Class[4];
                                    clsArr[i3] = Integer.TYPE;
                                    clsArr[1] = Integer.TYPE;
                                    clsArr[2] = Integer.TYPE;
                                    clsArr[3] = Integer.TYPE;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, longPressTimeout, iIndexOf, -2007001706, false, "o", clsArr);
                                }
                                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                cArr3[1] = cCharValue;
                                int i10 = i5;
                                Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16777684, 13 - View.resolveSizeAndState(0, 0, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                }
                                cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                                i4 -= 40503;
                                i5 = i10 + 1;
                                int i11 = $10 + 33;
                                $11 = i11 % 128;
                                int i12 = i11 % 2;
                                i3 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                        cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                        Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), Color.blue(0) + 2323, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43, -1312321721, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    }
                }

                @Override // android.util.Property
                public /* bridge */ /* synthetic */ Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
                    int i = 2 % 2;
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                    d = i2 % 128;
                    ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
                    if (i2 % 2 != 0) {
                        return get2(extendedFloatingActionButton2);
                    }
                    get2(extendedFloatingActionButton2);
                    throw null;
                }

                @Override // android.util.Property
                public /* bridge */ /* synthetic */ void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) throws Throwable {
                    Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
                    int i = 2 % 2;
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
                    d = i2 % 128;
                    int i3 = i2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                        int i4 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                        int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                        byte[] bArr = $$a;
                        Object[] objArr = new Object[1];
                        a(bArr[5], bArr[28], bArr[7], objArr);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, i4, deadChar, 986134021, false, (String) objArr[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr2 = new Object[1];
                    c(new char[]{5463, 64774, 63581, 27496, 21189, 10792, 54694, 18532, 11353, 22341, 16430, 49801, 23074, 25341, 8235, 15912, 50164, 40365, 57121, 37750, 14582, 44658, 1515, 10868}, 22 - Gravity.getAbsoluteGravity(0, 0), objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    Object[] objArr3 = new Object[1];
                    c(new char[]{15819, 35789, 45755, 64367, 52926, 983, 35887, 976, 56504, 1087, 49806, 43570, 25466, 12894, 33248, 10543, 6806, 48233}, 15 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                        int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                        int i5 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr4 = new Object[1];
                        a(b3, (byte) (b3 | 36), b2, objArr4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, packedPositionGroup, i5, 1596667560, false, (String) objArr4[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                        d = i6 % 128;
                        int i7 = i6 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1756;
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 24;
                            byte b4 = $$a[7];
                            byte b5 = b4;
                            Object[] objArr5 = new Object[1];
                            a(b5, (byte) (b5 | 88), b4, objArr5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop, modifierMetaStateMask, iLastIndexOf, 1599039318, false, (String) objArr5[0], null);
                        }
                        Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        int i8 = ((int[]) objArr6[0])[0];
                        objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{i8}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i9 = ((((~((-329169631) | iIdentityHashCode)) | 43165828) * (-566)) - 1125342703) + ((~(iIdentityHashCode | (-286003803))) * 566) + 529827027;
                        int i10 = (i9 << 13) ^ i9;
                        int i11 = i10 ^ (i10 >>> 17);
                        ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i11 ^ (i11 << 5);
                    } else {
                        Object[] objArr7 = new Object[1];
                        c(new char[]{6065, 19533, 35673, 2206, 56095, 64953, 61022, 21256, 18796, 14714, 64714, 61949, 45348, 36705, 10475, 48820, 6075, 43973}, 16 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr7);
                        Class<?> cls2 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        c(new char[]{8499, 28308, 51346, 34931, 60441, 16991, 30677, 63813, 47013, 59400, 43705, 51733, 63024, 23416, 41729, 64638, 44675, 4023}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15, objArr8);
                        int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
                        try {
                            Object[] objArr9 = {-368867026};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1726 - (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.makeMeasureSpec(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                            }
                            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), 529827027);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755;
                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                                byte b6 = $$a[7];
                                byte b7 = b6;
                                Object[] objArr10 = new Object[1];
                                a(b7, (byte) (b7 | 88), b6, objArr10);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, minimumFlingVelocity, iLastIndexOf2, 1599039318, false, (String) objArr10[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
                            try {
                                Object[] objArr11 = new Object[1];
                                c(new char[]{5463, 64774, 63581, 27496, 21189, 10792, 54694, 18532, 11353, 22341, 16430, 49801, 23074, 25341, 8235, 15912, 50164, 40365, 57121, 37750, 14582, 44658, 1515, 10868}, 21 - TextUtils.indexOf((CharSequence) "", '0'), objArr11);
                                Class<?> cls3 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                c(new char[]{15819, 35789, 45755, 64367, 52926, 983, 35887, 976, 56504, 1087, 49806, 43570, 25466, 12894, 33248, 10543, 6806, 48233}, TextUtils.getCapsMode("", 0, 0) + 15, objArr12);
                                long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                                    int iMyPid = (Process.myPid() >> 22) + 1755;
                                    int capsMode = 23 - TextUtils.getCapsMode("", 0, 0);
                                    byte b8 = $$a[7];
                                    byte b9 = b8;
                                    Object[] objArr13 = new Object[1];
                                    a(b9, (byte) (b9 | 36), b8, objArr13);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iMyPid, capsMode, 1596667560, false, (String) objArr13[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                    char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                                    int iIndexOf = TextUtils.indexOf("", "", 0) + 1755;
                                    int packedPositionChild = 22 - ExpandableListView.getPackedPositionChild(0L);
                                    byte[] bArr2 = $$a;
                                    Object[] objArr14 = new Object[1];
                                    a(bArr2[5], bArr2[28], bArr2[7], objArr14);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iIndexOf, packedPositionChild, 986134021, false, (String) objArr14[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
                    int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0];
                    int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
                    if (i13 == i12) {
                        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
                        int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
                        Object[] objArr15 = {new int[]{i15}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
                        int iIdentityHashCode2 = System.identityHashCode(this);
                        int i16 = ~iIdentityHashCode2;
                        int i17 = ~((-509484821) | i16);
                        int i18 = ~(296882394 | iIdentityHashCode2);
                        int i19 = i14 + (-1774707662) + ((i17 | i18) * 1150) + (((~((-296882395) | i16)) | i18) * (-575)) + (((~(iIdentityHashCode2 | (-509484821))) | (~(i16 | 509484820))) * 575);
                        int i20 = (i19 << 13) ^ i19;
                        int i21 = i20 ^ (i20 >>> 17);
                        ((int[]) objArr15[3])[0] = i21 ^ (i21 << 5);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
                        if (strArr != null) {
                            int i22 = 0;
                            while (i22 < strArr.length) {
                                int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
                                d = i23 % 128;
                                if (i23 % 2 == 0) {
                                    arrayList2.add(strArr[i22]);
                                    i22 += 10;
                                } else {
                                    arrayList2.add(strArr[i22]);
                                    i22++;
                                }
                            }
                        }
                        int[] iArr = new int[i13];
                        int i24 = i13 - 1;
                        iArr[i24] = 1;
                        Toast.makeText((Context) null, iArr[((i13 * i24) % 2) - 1], 1).show();
                        int i25 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
                        int i26 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
                        Object[] objArr16 = {new int[]{i26}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
                        int i27 = (int) Runtime.getRuntime().totalMemory();
                        int i28 = i25 + 1402289550 + (((~((-548208901) | i27)) | (~((-335606475) | i27))) * 69) + (((~(i27 | (-369163980))) | (~((-581766406) | i27)) | 33557505) * (-69)) + 1125780720;
                        int i29 = (i28 << 13) ^ i28;
                        int i30 = i29 ^ (i29 >>> 17);
                        ((int[]) objArr16[3])[0] = i30 ^ (i30 << 5);
                    }
                    set2(extendedFloatingActionButton, f);
                }

                /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
                public Float get2(ExtendedFloatingActionButton extendedFloatingActionButton) {
                    int i = 2 % 2;
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
                    d = i2 % 128;
                    int i3 = i2 % 2;
                    Float fValueOf = Float.valueOf(AnimationUtils.lerp(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), BaseMotionStrategy.this.fab.originalTextCsl.getDefaultColor()))));
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
                    d = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 29 / 0;
                    }
                    return fValueOf;
                }

                /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
                public void set2(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
                    int i = 2 % 2;
                    int i2 = d + 25;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    int i3 = i2 % 2;
                    int colorForState = extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), BaseMotionStrategy.this.fab.originalTextCsl.getDefaultColor());
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (AnimationUtils.lerp(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                    if (f.floatValue() == 1.0f) {
                        int i4 = d + 61;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                        if (i4 % 2 == 0) {
                            extendedFloatingActionButton.silentlyUpdateTextColor(extendedFloatingActionButton.originalTextCsl);
                            return;
                        } else {
                            extendedFloatingActionButton.silentlyUpdateTextColor(extendedFloatingActionButton.originalTextCsl);
                            int i5 = 74 / 0;
                            return;
                        }
                    }
                    extendedFloatingActionButton.silentlyUpdateTextColor(colorStateListValueOf);
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$e(int r6, byte r7, int r8) {
                    /*
                        int r8 = r8 + 4
                        byte[] r0 = com.google.android.material.floatingactionbutton.BaseMotionStrategy.AnonymousClass1.$$c
                        int r6 = r6 * 2
                        int r6 = r6 + 108
                        int r7 = r7 * 3
                        int r7 = r7 + 1
                        byte[] r1 = new byte[r7]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r3 = r8
                        r4 = r2
                        goto L2a
                    L14:
                        r3 = r2
                    L15:
                        int r8 = r8 + 1
                        byte r4 = (byte) r6
                        r1[r3] = r4
                        int r3 = r3 + 1
                        if (r3 != r7) goto L24
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        return r6
                    L24:
                        r4 = r0[r8]
                        r5 = r3
                        r3 = r8
                        r8 = r4
                        r4 = r5
                    L2a:
                        int r6 = r6 + r8
                        r8 = r3
                        r3 = r4
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.BaseMotionStrategy.AnonymousClass1.$$e(int, byte, int):java.lang.String");
                }
            }));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }
}
