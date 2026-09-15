package com.google.android.material.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
class ViewOverlayApi14 implements ViewOverlayImpl {
    protected OverlayViewGroup overlayViewGroup;

    ViewOverlayApi14(Context context, ViewGroup viewGroup, View view) {
        this.overlayViewGroup = new OverlayViewGroup(context, viewGroup, view, this);
    }

    static ViewOverlayApi14 createFrom(View view) {
        ViewGroup contentView = ViewUtils.getContentView(view);
        if (contentView == null) {
            return null;
        }
        int childCount = contentView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = contentView.getChildAt(i);
            if (childAt instanceof OverlayViewGroup) {
                return ((OverlayViewGroup) childAt).viewOverlay;
            }
        }
        return new ViewGroupOverlayApi14(contentView.getContext(), contentView, view);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(Drawable drawable) {
        this.overlayViewGroup.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(Drawable drawable) {
        this.overlayViewGroup.remove(drawable);
    }

    static class OverlayViewGroup extends ViewGroup {
        private static int TuitionPaymentFragmentbindingInflater1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static int asBinder;
        private static short[] b;
        static Method invalidateChildInParentFastMethod;
        private boolean disposed;
        ArrayList<Drawable> drawables;
        ViewGroup hostView;
        View requestingView;
        ViewOverlayApi14 viewOverlay;
        private static final byte[] $$c = {117, -15, -81, 1};
        private static final int $$f = 161;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {Base64.padSymbol, -108, 49, -100, 17, 3, -58, 62, 13, 5, -3, 10, -2, -50, 56, 18, -5, 19, 2, -1, 0, -49, 68, -7, 24, -10, 18, -4, -3, 16, -57, 58, 17, 2, 8, 8, -63, 76, 4, -6, 8, 2, 16, -6, 1, 19, -64, 40, 41, -15, 18, 11, -6, 22, -16, 18, -22, 35, -76, 36, 52, -8, 1, 24, -10, -30, 50, 14, -14, 19, -28, 24, 19, 7, -4, 13};
        private static final int $$e = 101;
        private static final byte[] $$a = {39, 27, 2, 54, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 129;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f803a = 0;
        private static int asInterface = 1;
        private static int g = 0;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.$$a
                int r6 = r6 * 14
                int r6 = 98 - r6
                int r8 = r8 * 52
                int r8 = 56 - r8
                int r7 = 53 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                r3 = r0[r8]
            L26:
                int r6 = r6 + r3
                int r6 = r6 + (-10)
                int r8 = r8 + 1
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.c(short, byte, int, java.lang.Object[]):void");
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
        private static void e(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = 99 - r7
                int r8 = r8 * 72
                int r8 = 73 - r8
                byte[] r0 = com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.$$d
                int r6 = r6 * 72
                int r6 = 75 - r6
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r7 = r8
                r4 = r2
                goto L29
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                int r6 = r6 + 1
                r1[r3] = r5
                if (r4 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r0[r6]
            L29:
                int r7 = r7 + r3
                int r7 = r7 + (-5)
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.e(byte, byte, byte, java.lang.Object[]):void");
        }

        static {
            asBinder = 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            try {
                invalidateChildInParentFastMethod = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
                int i = g + 31;
                asBinder = i % 128;
                int i2 = i % 2;
            } catch (NoSuchMethodException unused) {
            }
        }

        OverlayViewGroup(Context context, ViewGroup viewGroup, View view, ViewOverlayApi14 viewOverlayApi14) {
            super(context);
            this.drawables = null;
            this.hostView = viewGroup;
            this.requestingView = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.viewOverlay = viewOverlayApi14;
        }

        public void add(Drawable drawable) {
            int i = 2 % 2;
            int i2 = asInterface + 125;
            f803a = i2 % 128;
            if (i2 % 2 != 0) {
                assertNotDisposed();
                throw null;
            }
            assertNotDisposed();
            if (this.drawables == null) {
                this.drawables = new ArrayList<>();
            }
            if (this.drawables.contains(drawable)) {
                return;
            }
            this.drawables.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
            int i3 = f803a + 5;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }

        public void remove(Drawable drawable) {
            int i = 2 % 2;
            int i2 = f803a;
            int i3 = i2 + 3;
            asInterface = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            ArrayList<Drawable> arrayList = this.drawables;
            if (arrayList != null) {
                int i4 = i2 + 41;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList.remove(drawable);
                    invalidate(drawable.getBounds());
                    drawable.setCallback(null);
                    disposeIfEmpty();
                    return;
                }
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                disposeIfEmpty();
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0024  */
        /* JADX WARN: Code duplicated, block: B:13:0x0033  */
        /* JADX WARN: Code duplicated, block: B:16:0x0039 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:9:0x0020  */
        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            int i;
            boolean zContains;
            int i2 = 2 % 2;
            int i3 = asInterface + 85;
            f803a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 46 / 0;
                if (!super.verifyDrawable(drawable)) {
                    arrayList = this.drawables;
                    if (arrayList != null) {
                        int i5 = asInterface + 101;
                        f803a = i5 % 128;
                        i = i5 % 2;
                        zContains = arrayList.contains(drawable);
                        if (i != 0) {
                            int i6 = 62 / 0;
                            if (!zContains) {
                            }
                        } else if (!zContains) {
                        }
                    }
                    return false;
                }
            } else if (!super.verifyDrawable(drawable)) {
                arrayList = this.drawables;
                if (arrayList != null) {
                    int i7 = asInterface + 101;
                    f803a = i7 % 128;
                    i = i7 % 2;
                    zContains = arrayList.contains(drawable);
                    if (i != 0) {
                        int i8 = 62 / 0;
                        if (!zContains) {
                        }
                    } else if (!zContains) {
                    }
                }
                return false;
            }
            return true;
        }

        public void add(View view) {
            int i = 2 % 2;
            int i2 = asInterface + 43;
            f803a = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                assertNotDisposed();
                boolean z = view.getParent() instanceof ViewGroup;
                obj.hashCode();
                throw null;
            }
            assertNotDisposed();
            if (!(!(view.getParent() instanceof ViewGroup))) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.hostView && viewGroup.getParent() != null && ViewCompat.isAttachedToWindow(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.hostView.getLocationOnScreen(iArr2);
                    ViewCompat.offsetLeftAndRight(view, iArr[0] - iArr2[0]);
                    ViewCompat.offsetTopAndBottom(view, iArr[1] - iArr2[1]);
                    int i3 = f803a + 101;
                    asInterface = i3 % 128;
                    int i4 = i3 % 2;
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    int i5 = asInterface + 83;
                    f803a = i5 % 128;
                    if (i5 % 2 != 0) {
                        viewGroup.removeView(view);
                        obj.hashCode();
                        throw null;
                    }
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public void remove(View view) {
            int i = 2 % 2;
            int i2 = f803a + 31;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            super.removeView(view);
            disposeIfEmpty();
            int i4 = f803a + 51;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void assertNotDisposed() {
            int i = 2 % 2;
            int i2 = f803a;
            int i3 = i2 + 95;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (this.disposed) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
            int i5 = i2 + 9;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void disposeIfEmpty() {
            int i = 2 % 2;
            int i2 = asInterface + 91;
            f803a = i2 % 128;
            if (i2 % 2 != 0) {
                getChildCount();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.drawables;
                if (arrayList != null) {
                    int i3 = f803a + 7;
                    asInterface = i3 % 128;
                    int i4 = i3 % 2;
                    if (arrayList.size() != 0) {
                        return;
                    }
                }
                this.disposed = true;
                this.hostView.removeView(this);
            }
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            int i = 2 % 2;
            int i2 = asInterface + 119;
            f803a = i2 % 128;
            int i3 = i2 % 2;
            invalidate(drawable.getBounds());
            int i4 = f803a + 107;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 54 / 0;
            }
        }

        private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            int i4;
            long j;
            int i5 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                char c = 3;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int absoluteGravity = 2267 - Gravity.getAbsoluteGravity(0, 0);
                    int iResolveSizeAndState = 33 - View.resolveSizeAndState(0, 0, 0);
                    byte[] bArr = $$c;
                    byte length = (byte) bArr.length;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, absoluteGravity, iResolveSizeAndState, 1387473586, false, $$g(length, (byte) (length - 4), (byte) (-bArr[3])), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i6 = $10 + 73;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 == 0) {
                    j = 3046761265686732006L;
                } else {
                    byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        int i8 = 0;
                        while (i8 < length2) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                int iKeyCodeFromString = 3358 - KeyEvent.keyCodeFromString("");
                                int mode = View.MeasureSpec.getMode(0) + 18;
                                byte b3 = $$c[c];
                                byte b4 = (byte) (b3 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, iKeyCodeFromString, mode, -1054011043, false, $$g(b4, b4, (byte) (-b3)), new Class[]{Integer.TYPE});
                            }
                            bArr3[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i8++;
                            c = 3;
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267;
                                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 33;
                                byte[] bArr5 = $$c;
                                byte length3 = (byte) bArr5.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, scrollBarFadeDuration, tapTimeout, 1387473586, false, $$g(length3, (byte) (length3 - 4), (byte) (-bArr5[3])), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                            j = 3046761265686732006L;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        j = 3046761265686732006L;
                        iIntValue = (short) (((short) (((long) b[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ j)) + i4;
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2855, 13 - Color.argb(0, 0, 0, 0), -1529949196, false, $$g(b5, (byte) (b5 - 3), (byte) (-$$c[3])), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (bArr6 != null) {
                        int length4 = bArr6.length;
                        byte[] bArr7 = new byte[length4];
                        for (int i9 = 0; i9 < length4; i9++) {
                            int i10 = $11 + 47;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            bArr7[i9] = (byte) (((long) bArr6[i9]) ^ 3046761265686732006L);
                        }
                        bArr6 = bArr7;
                    }
                    boolean z = bArr6 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z) {
                            int i12 = $11 + 75;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            byte[] bArr8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr8[i14]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = b;
                            int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) throws Throwable {
            Object[] objArr;
            int size;
            int i = 2 % 2;
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.hostView.getLocationOnScreen(iArr);
            this.requestingView.getLocationOnScreen(iArr2);
            int i2 = 0;
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.requestingView.getWidth(), this.requestingView.getHeight()));
            super.dispatchDraw(canvas);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cBlue = (char) (31533 - Color.blue(0));
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 28;
                byte[] bArr = $$a;
                byte b2 = bArr[80];
                Object[] objArr2 = new Object[1];
                c(b2, (byte) (b2 | 52), bArr[37], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, keyRepeatTimeout, maxKeyCode, -1048449946, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            d(1684719868 - Color.red(0), (-33) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) ('0' - AndroidCharacter.getMirror('0')), (byte) (65 - Gravity.getAbsoluteGravity(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1722609654, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(1684719872 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) - 34, (short) (ViewConfiguration.getTouchSlop() >> 8), (byte) ((-20) - TextUtils.indexOf("", "", 0, 0)), Process.getGidForName("") + 1722609676, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 31533);
                int iAlpha = Color.alpha(0) + 921;
                int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
                byte[] bArr2 = $$a;
                byte b3 = bArr2[37];
                Object[] objArr5 = new Object[1];
                c(b3, bArr2[80], b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iAlpha, iKeyCodeFromString, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 31533);
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 921;
                    int trimmedLength = 28 - TextUtils.getTrimmedLength("");
                    byte[] bArr3 = $$a;
                    Object[] objArr6 = new Object[1];
                    c(bArr3[37], bArr3[33], bArr3[80], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, iIndexOf, trimmedLength, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i3 = ((int[]) objArr7[3])[0];
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i3}, (String[]) objArr7[4]};
                int i4 = (int) Runtime.getRuntime().totalMemory();
                int i5 = (-1424149703) + (((~((-591628151) | i4)) | (-1182451494)) * (-318));
                int i6 = ~((-1182451494) | i4);
                int i7 = ~i4;
                int i8 = i5 + ((i6 | (~(1736165239 | i7))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i4 | 1736165239)) | (~((-1144537090) | i7))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 2043487034;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                d(1684719868 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-34) - (ViewConfiguration.getScrollBarSize() >> 8), (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) ((-96) - (Process.myPid() >> 22)), 1722609691 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                d(1684719870 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-33) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) View.getDefaultSize(0, 0), (byte) (TextUtils.getCapsMode("", 0, 0) - 35), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1722609716, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i11 = asInterface + 25;
                    f803a = i11 % 128;
                    if (i11 % 2 != 0) {
                        boolean z = applicationContext instanceof ContextWrapper;
                        obj.hashCode();
                        throw null;
                    }
                    if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                        applicationContext = null;
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                        int i12 = f803a + 111;
                        asInterface = i12 % 128;
                        int i13 = i12 % 2;
                    }
                }
                Object[] objArr10 = new Object[1];
                d(1684719877 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollBarSize() >> 8) - 34, (short) ('0' - AndroidCharacter.getMirror('0')), (byte) (1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.indexOf("", "") + 1722609734, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                d(ImageFormat.getBitsPerPixel(0) + 1684719877, (-34) - (ViewConfiguration.getPressedStateDuration() >> 16), (short) (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (Drawable.resolveOpacity(0, 0) - 38), Color.alpha(0) + 1722609750, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i14 = asInterface + 41;
                f803a = i14 % 128;
                int i15 = i14 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 2043487034};
                    byte[] bArr4 = $$d;
                    byte b4 = bArr4[44];
                    byte b5 = bArr4[20];
                    Object[] objArr13 = new Object[1];
                    e(b4, b5, b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr4[20];
                    byte b7 = bArr4[44];
                    Object[] objArr14 = new Object[1];
                    e(b6, b7, b7, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 31533);
                        int capsMode = 921 - TextUtils.getCapsMode("", 0, 0);
                        int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        Object[] objArr15 = new Object[1];
                        c(bArr5[37], bArr5[33], bArr5[80], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, capsMode, tapTimeout, -1142834547, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        d((Process.myTid() >> 22) + 1684719868, (Process.myTid() >> 22) - 34, (short) TextUtils.getTrimmedLength(""), (byte) (Color.alpha(0) + 65), 1722609652 - ExpandableListView.getPackedPositionChild(0L), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        d(MotionEvent.axisFromString("") + 1684719873, (-34) - TextUtils.getOffsetBefore("", 0), (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 21), 1722609674 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 31533);
                            int iIndexOf2 = TextUtils.indexOf("", "", 0) + 921;
                            int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
                            byte[] bArr6 = $$a;
                            byte b8 = bArr6[37];
                            Object[] objArr18 = new Object[1];
                            c(b8, bArr6[80], b8, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, iIndexOf2, iIndexOf3, -778300370, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf2 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                            int i16 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 921;
                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 28;
                            byte[] bArr7 = $$a;
                            byte b9 = bArr7[80];
                            Object[] objArr19 = new Object[1];
                            c(b9, (byte) (b9 | 52), bArr7[37], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, i16, iResolveSizeAndState, -1048449946, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
            if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr == null) {
                    throw null;
                }
                while (i2 < strArr.length) {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
                throw null;
            }
            int i17 = f803a + 119;
            asInterface = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[3])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i20}, (String[]) objArr[4]};
            int iMyPid = Process.myPid();
            int i21 = i19 + 617408959 + (((~(iMyPid | 715361339)) | 1058718304) * 191) + (((~((~iMyPid) | 715361339)) | 353911360) * 191);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            Object obj2 = objArr20[0];
            ((int[]) obj2)[0] = i23 ^ (i23 << 5);
            ArrayList<Drawable> arrayList2 = this.drawables;
            if (arrayList2 == null) {
                int i24 = ((int[]) obj2)[0];
                int i25 = i24 * i24;
                int i26 = -(946403751 * i24);
                int i27 = (i25 & i26) + (i25 | i26);
                int i28 = -(i24 * 160104145);
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                int i30 = (i29 ^ (-1522651632)) + (((-1522651632) & i29) << 1);
                int i31 = (((i30 >> 27) - 63) / 32) + 1;
                int i32 = (i30 & i31) + (i31 | i30);
                int i33 = i30 >> 17;
                int i34 = ((((-65535) | i33) << 1) - (i33 ^ (-65535))) / 32768;
                int i35 = -((((i34 | 1) << 1) - (i34 ^ 1)) ^ i32);
                int i36 = ((i35 | 8) << 1) - (i35 ^ 8);
                int i37 = i36 >> 17;
                size = 0 / (((-((((((-65535) | i37) << 1) - (i37 ^ (-65535))) / 32768) + 2)) & i36) * 730);
            } else {
                size = arrayList2.size();
            }
            while (i2 < size) {
                this.drawables.get(i2).draw(canvas);
                i2++;
            }
        }

        private void getOffset(int[] iArr) {
            int i = 2 % 2;
            int i2 = asInterface + 75;
            f803a = i2 % 128;
            int i3 = i2 % 2;
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.hostView.getLocationOnScreen(iArr2);
            this.requestingView.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
            int i4 = f803a + 23;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }

        protected ViewParent invalidateChildInParentFast(int i, int i2, Rect rect) {
            int i3 = 2 % 2;
            int i4 = asInterface;
            int i5 = i4 + 99;
            f803a = i5 % 128;
            int i6 = i5 % 2;
            if (this.hostView != null) {
                int i7 = i4 + 77;
                f803a = i7 % 128;
                int i8 = i7 % 2;
                if (invalidateChildInParentFastMethod != null) {
                    try {
                        getOffset(new int[2]);
                        invalidateChildInParentFastMethod.invoke(this.hostView, Integer.valueOf(i), Integer.valueOf(i2), rect);
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            int i9 = f803a + 79;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        
            if (r6.hostView != null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        
            r7[0] = 0;
            r7[1] = 0;
            r0 = new int[2];
            getOffset(r0);
            r8.offset(r0[0], r0[1]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            return super.invalidateChildInParent(r7, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            invalidate(r8);
            r7 = com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.asInterface + 67;
            com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.f803a = r7 % 128;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            if (r6.hostView != null) goto L13;
         */
        @Override // android.view.ViewGroup, android.view.ViewParent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.view.ViewParent invalidateChildInParent(int[] r7, android.graphics.Rect r8) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.asInterface
                r2 = 1
                int r1 = r1 + r2
                int r3 = r1 % 128
                com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.f803a = r3
                int r1 = r1 % r0
                r4 = 0
                if (r1 != 0) goto L53
                android.view.ViewGroup r1 = r6.hostView
                if (r1 == 0) goto L52
                int r3 = r3 + r2
                int r1 = r3 % 128
                com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.asInterface = r1
                int r3 = r3 % r0
                r1 = 0
                if (r3 != 0) goto L26
                r3 = r7[r2]
                r8.offset(r3, r3)
                android.view.ViewGroup r3 = r6.hostView
                if (r3 == 0) goto L46
                goto L31
            L26:
                r3 = r7[r1]
                r5 = r7[r2]
                r8.offset(r3, r5)
                android.view.ViewGroup r3 = r6.hostView
                if (r3 == 0) goto L46
            L31:
                r7[r1] = r1
                r7[r2] = r1
                int[] r0 = new int[r0]
                r6.getOffset(r0)
                r1 = r0[r1]
                r0 = r0[r2]
                r8.offset(r1, r0)
                android.view.ViewParent r7 = super.invalidateChildInParent(r7, r8)
                return r7
            L46:
                r6.invalidate(r8)
                int r7 = com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.asInterface
                int r7 = r7 + 67
                int r8 = r7 % 128
                com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.f803a = r8
                int r7 = r7 % r0
            L52:
                return r4
            L53:
                r4.hashCode()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.invalidateChildInParent(int[], android.graphics.Rect):android.view.ViewParent");
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int i = 2 % 2;
            int i2 = f803a + 33;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 1;
            f803a = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            int i6 = asInterface + 21;
            f803a = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 368987373;
            TuitionPaymentFragmentbindingInflater1 = -1934795577;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 389573507;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new byte[]{19, -81, 83, -92, -114, 113, -81, 86, -90, 93, -127, -126, 28, -93, -26, 109, 92, 93, 90, -87, 81, -86, 8, -14, 14, -1, 2, 1, -10, 25, -28, -11, -8, 9, 5, -1, 13, 31, 69, -70, -75, 76, 82, -99, 67, 77, -75, 75, -77, 87, 100, 85, -8, 70, 73, 117, -116, -67, -68, -69, 72, -80, 75, 23, -60, Base64.padSymbol, -50, 40, -59, -63, -58, -57, 59, 20, -10, Base64.padSymbol, 50, -56, 59, -58, 41, 9, -17, 22, -26, 29, -63, -62, 32, 30, -22, 18, -39, 42, 12, -14, 16, 9, Base64.padSymbol, -55, 16, -25, -55, 46, 37, -13, 57, 55, -55, 58, 53, Base64.padSymbol, -57};
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, short r7, int r8) {
            /*
                int r7 = r7 * 4
                int r0 = 1 - r7
                byte[] r1 = com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.$$c
                int r8 = r8 + 4
                int r6 = 121 - r6
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L15
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2a
            L15:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L19:
                byte r4 = (byte) r8
                int r6 = r6 + 1
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L28:
                r3 = r1[r6]
            L2a:
                int r3 = -r3
                int r8 = r8 + r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.ViewOverlayApi14.OverlayViewGroup.$$g(int, short, int):java.lang.String");
        }
    }
}
