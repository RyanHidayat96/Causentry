package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.OverScroller;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import com.google.android.libraries.places.internal.zzapt;
import defpackage.deInitSession;
import defpackage.initSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    OverScroller scroller;
    private int touchSlop;
    private VelocityTracker velocityTracker;
    private static final byte[] $$h = {109, 84, -87, -114};
    private static final int $$i = 239;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {109, 48, -62, 38};
    private static final int $$e = 29;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {57191, 60044, 57195, 60093, 57190, 60117, 60095, 60068, 60057, 60058, 60063, 57187, 60041, 57186, 60046, 60055, 60047, 60062, 60088, 60048, 57192, 60034, 60052, 60040, 60116, 57189, 57188, 60061, 60053, 60043, 60050, 60106, 57184, 57193, 60056, 60060};
    private static char b = 57191;

    private static void e(int i, int i2, int i3, Object[] objArr) {
        int i4 = i2 * 2;
        byte[] bArr = $$d;
        int i5 = 3 - (i3 * 2);
        int i6 = (i * 3) + 98;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        int i8 = -1;
        if (bArr == null) {
            i6 += -i7;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i6;
            i5++;
            if (i8 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 += -bArr[i5];
        }
    }

    public HeaderBehavior() {
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r1 == (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r1 == (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r5 = r5 + 65;
        com.google.android.material.appbar.HeaderBehavior.TuitionPaymentFragmentbindingInflater1 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        r1 = r10.findPointerIndex(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r1 != (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r8 = com.google.android.material.appbar.HeaderBehavior.TuitionPaymentFragmentbindingInflater1 + 97;
        com.google.android.material.appbar.HeaderBehavior.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r1 = (int) r10.getY(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (java.lang.Math.abs(r1 - r7.lastMotionY) <= r7.touchSlop) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        r7.lastMotionY = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        return true;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = r7.touchSlop
            if (r1 >= 0) goto L15
            android.content.Context r1 = r8.getContext()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            int r1 = r1.getScaledTouchSlop()
            r7.touchSlop = r1
        L15:
            int r1 = r10.getActionMasked()
            r2 = 1
            r3 = -1
            r4 = 0
            if (r1 != r0) goto L65
            boolean r1 = r7.isBeingDragged
            if (r1 == 0) goto L65
            int r1 = com.google.android.material.appbar.HeaderBehavior.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 27
            int r5 = r1 % 128
            com.google.android.material.appbar.HeaderBehavior.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L35
            int r1 = r7.activePointerId
            r6 = 13
            int r6 = r6 / r4
            if (r1 != r3) goto L41
            goto L39
        L35:
            int r1 = r7.activePointerId
            if (r1 != r3) goto L41
        L39:
            int r5 = r5 + 65
            int r8 = r5 % 128
            com.google.android.material.appbar.HeaderBehavior.TuitionPaymentFragmentbindingInflater1 = r8
            int r5 = r5 % r0
            return r4
        L41:
            int r1 = r10.findPointerIndex(r1)
            if (r1 != r3) goto L51
            int r8 = com.google.android.material.appbar.HeaderBehavior.TuitionPaymentFragmentbindingInflater1
            int r8 = r8 + 97
            int r9 = r8 % 128
            com.google.android.material.appbar.HeaderBehavior.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r9
            int r8 = r8 % r0
            return r4
        L51:
            float r1 = r10.getY(r1)
            int r1 = (int) r1
            int r5 = r7.lastMotionY
            int r5 = r1 - r5
            int r5 = java.lang.Math.abs(r5)
            int r6 = r7.touchSlop
            if (r5 <= r6) goto L65
            r7.lastMotionY = r1
            return r2
        L65:
            int r1 = r10.getActionMasked()
            if (r1 != 0) goto Lb0
            r7.activePointerId = r3
            float r1 = r10.getX()
            int r1 = (int) r1
            float r3 = r10.getY()
            int r3 = (int) r3
            boolean r5 = r7.canDragView(r9)
            if (r5 == 0) goto L85
            boolean r8 = r8.isPointInChildBounds(r9, r1, r3)
            if (r8 == 0) goto L85
            r8 = r2
            goto L86
        L85:
            r8 = r4
        L86:
            r7.isBeingDragged = r8
            r8 = r8 ^ r2
            if (r8 == 0) goto L8c
            goto Lb0
        L8c:
            r7.lastMotionY = r3
            int r8 = r10.getPointerId(r4)
            r7.activePointerId = r8
            r7.ensureVelocityTracker()
            android.widget.OverScroller r8 = r7.scroller
            if (r8 == 0) goto Lb0
            int r9 = com.google.android.material.appbar.HeaderBehavior.TuitionPaymentFragmentbindingInflater1
            int r9 = r9 + 111
            int r1 = r9 % 128
            com.google.android.material.appbar.HeaderBehavior.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1
            int r9 = r9 % r0
            boolean r8 = r8.isFinished()
            if (r8 != 0) goto Lb0
            android.widget.OverScroller r8 = r7.scroller
            r8.abortAnimation()
            return r2
        Lb0:
            android.view.VelocityTracker r8 = r7.velocityTracker
            if (r8 == 0) goto Lb7
            r8.addMovement(r10)
        Lb7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0102 A[RETURN] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        int i;
        Object obj;
        VelocityTracker velocityTracker2;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.activePointerId);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i5 = this.lastMotionY;
                this.lastMotionY = y;
                scroll(coordinatorLayout, v, i5 - y, getMaxDragOffset(v), 0);
            } else if (actionMasked != 3) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 111;
                int i7 = i6 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7;
                int i8 = i6 % 2;
                if (actionMasked == 6) {
                    int i9 = i7 + 11;
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.activePointerId = motionEvent.getPointerId(i11);
                    this.lastMotionY = (int) (motionEvent.getY(i11) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                i3 = TuitionPaymentFragmentbindingInflater1 + 117;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                if (i3 % 2 == 0) {
                    velocityTracker2.addMovement(motionEvent);
                    int i12 = 41 / 0;
                } else {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
            if (!this.isBeingDragged) {
                i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i13 = 7 / 0;
                    if (!z) {
                        return false;
                    }
                } else if (!z) {
                    return false;
                }
            }
            return true;
        }
        VelocityTracker velocityTracker3 = this.velocityTracker;
        if (velocityTracker3 != null) {
            int i14 = TuitionPaymentFragmentbindingInflater1 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
            if (i14 % 2 == 0) {
                velocityTracker3.addMovement(motionEvent);
                this.velocityTracker.computeCurrentVelocity(23087);
                fling(coordinatorLayout, v, -getScrollRangeForDragFling(v), 0, this.velocityTracker.getYVelocity(this.activePointerId));
            } else {
                velocityTracker3.addMovement(motionEvent);
                this.velocityTracker.computeCurrentVelocity(1000);
                fling(coordinatorLayout, v, -getScrollRangeForDragFling(v), 0, this.velocityTracker.getYVelocity(this.activePointerId));
                z = true;
            }
        }
        this.isBeingDragged = false;
        this.activePointerId = -1;
        velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            i = TuitionPaymentFragmentbindingInflater1 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
            obj = null;
            if (i % 2 != 0) {
                velocityTracker.recycle();
                this.velocityTracker = null;
                obj.hashCode();
                throw null;
            }
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            i3 = TuitionPaymentFragmentbindingInflater1 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 == 0) {
                velocityTracker2.addMovement(motionEvent);
                int i15 = 41 / 0;
            } else {
                velocityTracker2.addMovement(motionEvent);
            }
        }
        if (!this.isBeingDragged) {
            i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i16 = 7 / 0;
                if (!z) {
                    return false;
                }
            } else if (!z) {
                return false;
            }
        }
        return true;
        z = false;
        this.isBeingDragged = false;
        this.activePointerId = -1;
        velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            i = TuitionPaymentFragmentbindingInflater1 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
            obj = null;
            if (i % 2 != 0) {
                velocityTracker.recycle();
                this.velocityTracker = null;
                obj.hashCode();
                throw null;
            }
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            i3 = TuitionPaymentFragmentbindingInflater1 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 == 0) {
                velocityTracker2.addMovement(motionEvent);
                int i17 = 41 / 0;
            } else {
                velocityTracker2.addMovement(motionEvent);
            }
        }
        if (!this.isBeingDragged) {
            i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i18 = 7 / 0;
                if (!z) {
                    return false;
                }
            } else if (!z) {
                return false;
            }
        }
        return true;
    }

    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            return setHeaderTopBottomOffset(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        setHeaderTopBottomOffset(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iClamp;
        int i4 = 2 % 2;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 != 0 && topAndBottomOffset >= i2) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 26 / 0;
                if (topAndBottomOffset <= i3) {
                    iClamp = MathUtils.clamp(i, i2, i3);
                    if (topAndBottomOffset != iClamp) {
                        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                        int i8 = i7 % 2;
                        setTopAndBottomOffset(iClamp);
                        return i8 != 0 ? topAndBottomOffset >>> iClamp : topAndBottomOffset - iClamp;
                    }
                }
            } else if (topAndBottomOffset <= i3) {
                iClamp = MathUtils.clamp(i, i2, i3);
                if (topAndBottomOffset != iClamp) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    int i10 = i9 % 2;
                    setTopAndBottomOffset(iClamp);
                    if (i10 != 0) {
                    }
                }
            }
        }
        return 0;
    }

    int getTopBottomOffsetForScrollingSibling() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int topAndBottomOffset = getTopAndBottomOffset();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return topAndBottomOffset;
    }

    final int scroll(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentbindingInflater1 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        return setHeaderTopBottomOffset(coordinatorLayout, v, (i5 % 2 == 0 ? getTopBottomOffsetForScrollingSibling() : getTopBottomOffsetForScrollingSibling()) - i, i2, i3);
    }

    final boolean fling(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentbindingInflater1;
        int i5 = i4 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            int i6 = i4 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 == 0) {
                v.removeCallbacks(runnable);
                this.flingRunnable = null;
                throw null;
            }
            v.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new OverScroller(v.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.scroller.computeScrollOffset()) {
            onFlingFinished(coordinatorLayout, v);
            return false;
        }
        FlingRunnable flingRunnable = new FlingRunnable(coordinatorLayout, v);
        this.flingRunnable = flingRunnable;
        ViewCompat.postOnAnimation(v, flingRunnable);
        int i7 = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 68 / 0;
        }
        return true;
    }

    int getMaxDragOffset(V v) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return -v.getHeight();
        }
        v.getHeight();
        throw null;
    }

    int getScrollRangeForDragFling(V v) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            v.getHeight();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int height = v.getHeight();
        int i3 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return height;
    }

    private void ensureVelocityTracker() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 3;
            }
        }
    }

    class FlingRunnable implements Runnable {
        private final V layout;
        private final CoordinatorLayout parent;

        FlingRunnable(CoordinatorLayout coordinatorLayout, V v) {
            this.parent = coordinatorLayout;
            this.layout = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.layout == null || HeaderBehavior.this.scroller == null) {
                return;
            }
            if (HeaderBehavior.this.scroller.computeScrollOffset()) {
                HeaderBehavior headerBehavior = HeaderBehavior.this;
                headerBehavior.setHeaderTopBottomOffset(this.parent, this.layout, headerBehavior.scroller.getCurrY());
                ViewCompat.postOnAnimation(this.layout, this);
                return;
            }
            HeaderBehavior.this.onFlingFinished(this.parent, this.layout);
        }
    }

    private static void d(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = 1770390596;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.blue(0), (-16774949) - Color.rgb(0, 0, 0), AndroidCharacter.getMirror('0') - 15, -1927765101, false, $$j(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $10 + 61;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i5 = 1770390596;
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
        Object[] objArr3 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2266, View.MeasureSpec.makeMeasureSpec(0, 0) + 33, -1927765101, false, $$j(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i9 = $11 + 115;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i11 = $10 + 55;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    i3 = 2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3261, 29 - MotionEvent.axisFromString(""), -127612708, false, $$j(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.green(0) + 22878), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 593, 17 - TextUtils.indexOf("", ""), 1570859318, false, $$j(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                        int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                        int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                    } else {
                        int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                        int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                        int i18 = $11 + 27;
                        $10 = i18 % 128;
                        i3 = 2;
                        if (i18 % 2 != 0) {
                            int i19 = 5 / 2;
                        }
                    }
                    i3 = 2;
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += i3;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    boolean canDragView(V v) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    void onFlingFinished(CoordinatorLayout coordinatorLayout, V v) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:101:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:105:0x073b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0759  */
    public static Object[] b(int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        String line;
        int i6;
        Object[] objArr;
        int[] iArr;
        int i7;
        char c;
        char c2;
        int i8;
        int i9;
        Object[] objArr2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String[] strArr;
        String str;
        int jumpTapTimeout;
        int i18;
        int i19 = 2 % 2;
        try {
            int i20 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i21 = i20 * 784;
            int i22 = (((i21 | (-64906)) << 1) - (i21 ^ (-64906))) - (-65772);
            int i23 = ~i20;
            int i24 = ~i;
            int i25 = i23 | i24;
            int i26 = (~((i25 ^ 83) | (i25 & 83))) * (-783);
            int i27 = (i22 ^ i26) + ((i26 & i22) << 1);
            int i28 = ~((i24 & 83) | (i24 ^ 83));
            int i29 = ((i23 & i28) | (i23 ^ i28)) * 783;
            Object[] objArr3 = new Object[1];
            d(18 - (~(-TextUtils.getOffsetAfter("", 0))), new char[]{'#', 18, 11, '\f', 14, 20, 13903, 13903, '\f', '\r', 19, 23, 13894, 13894, 16, '#', 17, '\f', 13904}, (byte) (((i27 | i29) << 1) - (i27 ^ i29)), objArr3);
            Object[] objArr4 = new Object[1];
            d(18 - Color.red(0), new char[]{3, 7, Typography.quote, '\f', Typography.quote, 24, '!', 5, 18, 16, 11, '\f', 14, 20, 13912, 13912, '\f', '\r'}, (byte) (90 - (~(-Color.green(0)))), objArr4);
            String[] strArr2 = {(String) objArr3[0], (String) objArr4[0]};
            int i30 = TuitionPaymentFragmentbindingInflater1;
            int i31 = (i30 & 61) + (i30 | 61);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i31 % 128;
            int i32 = i31 % 2;
            int i33 = 0;
            while (true) {
                if (i33 >= 2) {
                    i5 = i;
                    break;
                }
                int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
                TuitionPaymentFragmentbindingInflater1 = i34 % 128;
                if (i34 % 2 != 0) {
                    str = strArr2[i33];
                    jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >>> 104;
                    i18 = 120;
                } else {
                    str = strArr2[i33];
                    jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                    i18 = 16;
                }
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i35 = jumpTapTimeout * 829;
                int i36 = i18 * 829;
                int i37 = (i35 & i36) + (i35 | i36);
                int i38 = ~jumpTapTimeout;
                int i39 = ~i18;
                int i40 = ~((i38 ^ i39) | (i38 & i39));
                int i41 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i42 = (i41 ^ jumpTapTimeout) | (i41 & jumpTapTimeout);
                int i43 = ~((i42 ^ i18) | (i42 & i18));
                int i44 = -(-(((i40 ^ i43) | (i40 & i43)) * (-828)));
                int i45 = (i37 ^ i44) + ((i37 & i44) << 1);
                int i46 = (jumpTapTimeout & i18) | (jumpTapTimeout ^ i18);
                int i47 = -(-(((i46 ^ i41) | (i41 & i46)) * (-828)));
                int i48 = ((i45 | i47) << 1) - (i47 ^ i45);
                int i49 = -(-((~i46) * 828));
                Object[] objArr5 = new Object[1];
                d(((i48 | i49) << 1) - (i49 ^ i48), new char[]{'\n', 27, 6, 16, 18, Typography.quote, 11, 4, 23, 18, 0, 11, 14, 11, 17, ' '}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 117), objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                    i3 = ~(i & 1);
                    i4 = i | 1;
                    i5 = i3 & i4;
                    break;
                }
                i33++;
            }
        } catch (Exception unused) {
            i3 = ~(i & 2);
            i4 = i | 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (2419 - TextUtils.indexOf("", "", 0, 0));
                int iIndexOf = TextUtils.indexOf("", "", 0) + 2845;
                int iArgb = 5 - Color.argb(0, 0, 0, 0);
                byte b2 = (byte) 0;
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                e(b2, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, iArgb, -501222268, false, (String) objArr6[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = -74190532;
            int i50 = (int) Runtime.getRuntime().totalMemory();
            long j2 = TypedValues.CycleType.TYPE_EASING;
            long j3 = i50;
            long j4 = -1;
            long j5 = (((long) (-419)) * j) + (((long) 421) * jLongValue) + (((jLongValue | j3) ^ j4) * j2);
            int i51 = i5;
            long j6 = j ^ j4;
            long j7 = j5 + (((long) (-420)) * (jLongValue | j6)) + (j2 * ((((jLongValue ^ j4) | j6) ^ j4) | (j4 ^ ((j3 ^ j4) | jLongValue)))) + ((long) (-1084996154));
            int i52 = 501358106 + (((~(1742686395 | i)) | (-1744791996)) * 336) + (((~((-1115054490) | i)) | 1112948889) * (-168));
            int i53 = ~i;
            int i54 = ((int) (j7 >> 32)) & (i52 + ((1742686395 | (~((-1115054490) | i53))) * 168));
            int iMyTid = Process.myTid();
            int i55 = ((int) j7) & ((-501357939) + (((~((-1082787202) | iMyTid)) | 1082786944) * 336) + (((~(1774953684 | iMyTid)) | (-1774953942)) * (-168)) + (((~((~iMyTid) | 1774953684)) | (-1082787202)) * 168));
            int i56 = ((i54 & i55) | (i54 ^ i55)) ^ 1;
            int i57 = -i56;
            int i58 = ((i56 & i57) | (i56 ^ i57)) >> 31;
            int i59 = (~(i & 10)) & (i | 10) & (~i58);
            int i60 = i58 & i;
            int i61 = (i60 & i59) | (i59 ^ i60);
            int i62 = i ^ i51;
            int i63 = -i62;
            int i64 = ((i62 & i63) | (i62 ^ i63)) >> 31;
            int i65 = i61 & (~i64);
            int i66 = i51 & i64;
            int i67 = (i65 ^ i66) | (i65 & i66);
            try {
                int gidForName = Process.getGidForName("");
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i68 = (gidForName * 934) - 38212;
                int i69 = ~gidForName;
                int i70 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i71 = ~((i69 & i70) | (i69 ^ i70));
                int i72 = -(-(((i71 & (-42)) | ((-42) ^ i71)) * (-933)));
                int i73 = (i68 ^ i72) + ((i68 & i72) << 1);
                int i74 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (-42));
                int i75 = ~(((-42) ^ gidForName) | ((-42) & gidForName));
                int i76 = ((i74 & i75) | (i74 ^ i75)) * 933;
                int i77 = ((((i73 | i76) << 1) - (i76 ^ i73)) - (~(-(-((~(gidForName | 41)) * 933))))) - 1;
                char[] cArr = {29, 18, 22, 18, 25, 18, '\f', '\r', 29, 16, '\f', 27, 11, 16, 14, 20, 30, 29, 17, '\r', '\n', '!', Typography.quote, 24, 30, 29, ' ', 16, 13876, 13876, 16, 29, '\r', '\n', 17, '\r', '\n', '!', '\f', '\r'};
                int i78 = -View.resolveSizeAndState(0, 0, 0);
                int i79 = ((-77) ^ i53) | ((-77) & i53);
                int i80 = i78 | 76;
                int i81 = ((((i78 * 989) - 75012) - (~(((~((i79 & i78) | (i79 ^ i78))) | (~((i80 & i) | (i80 ^ i)))) * 988))) - 1) + ((i78 | (-77)) * (-988));
                int i82 = (~(((-77) & i) | ((-77) ^ i))) | (~((~i78) | (-77)));
                int i83 = (i78 & i53) | (i53 ^ i78);
                int i84 = ((~((i83 & 76) | (i83 ^ 76))) | i82) * 988;
                Object[] objArr7 = new Object[1];
                d(i77, cArr, (byte) ((i81 & i84) + (i84 | i81)), objArr7);
                File file = new File((String) objArr7[0]);
                if (file.canRead()) {
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    try {
                        line = bufferedReader.readLine();
                        int trimmedLength = TextUtils.getTrimmedLength("");
                        int i85 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i86 = ((i85 | 71) << 1) - (i85 ^ 71);
                        TuitionPaymentFragmentbindingInflater1 = i86 % 128;
                        int i87 = i86 % 2;
                        int i88 = trimmedLength + 3;
                        char[] cArr2 = {Typography.quote, 28, 13825};
                        int i89 = -ExpandableListView.getPackedPositionGroup(0L);
                        Object[] objArr8 = new Object[1];
                        d(i88, cArr2, (byte) ((i89 & 23) + (i89 | 23)), objArr8);
                        if (!line.equals((String) objArr8[0])) {
                            int i90 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i91 = (i90 ^ 3) + ((i90 & 3) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i91 % 128;
                            int i92 = i91 % 2;
                            fileReader.close();
                            bufferedReader.close();
                        } else {
                            fileReader.close();
                            bufferedReader.close();
                            int i93 = TuitionPaymentFragmentbindingInflater1;
                            int i94 = (i93 ^ 57) + ((i93 & 57) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i94 % 128;
                            int i95 = i94 % 2;
                            line = null;
                        }
                    } catch (Throwable th) {
                        fileReader.close();
                        bufferedReader.close();
                        throw th;
                    }
                } else {
                    int i96 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
                    TuitionPaymentFragmentbindingInflater1 = i96 % 128;
                    if (i96 % 2 != 0) {
                        int i97 = 3 / 0;
                    }
                    line = null;
                }
            } catch (Exception unused2) {
            }
            try {
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0);
                int i98 = iIndexOf2 * (-520);
                int i99 = (i98 & 33930) + (i98 | 33930);
                int i100 = ~iIndexOf2;
                int i101 = i100 | 65;
                int i102 = (~((i101 & i) | (i101 ^ i))) * 521;
                int i103 = (i99 ^ i102) + ((i102 & i99) << 1);
                int i104 = (~(((-66) ^ iIndexOf2) | ((-66) & iIndexOf2))) * (-1042);
                int i105 = ((i103 | i104) << 1) - (i104 ^ i103);
                int i106 = ~((iIndexOf2 & (-66)) | ((-66) ^ iIndexOf2));
                int i107 = ~i;
                int i108 = (i100 & i107) | (i100 ^ i107);
                int i109 = ~((i108 & 65) | (i108 ^ 65));
                Object[] objArr9 = new Object[1];
                d(ExpandableListView.getPackedPositionChild(0L) + 32, new char[]{25, 24, 16, 18, 30, 28, 18, 22, 18, 29, 23, '\r', 16, 24, '\f', 16, 25, 28, 17, '\r', '\n', '!', '\r', 11, 16, 29, '\n', '\t', 16, '\f', 13887}, (byte) ((i105 - (~(((i109 & i106) | (i106 ^ i109)) * 521))) - 1), objArr9);
                File file2 = new File((String) objArr9[0]);
                int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i111 = (i110 ^ 87) + ((i110 & 87) << 1);
                TuitionPaymentFragmentbindingInflater1 = i111 % 128;
                int i112 = i111 % 2;
                if (file2.canRead()) {
                    FileReader fileReader2 = new FileReader(file2);
                    BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                    try {
                        String line2 = bufferedReader2.readLine();
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                        int i113 = iNormalizeMetaState * 960;
                        int i114 = (i113 & (-1917)) + (i113 | (-1917));
                        int i115 = ~(((-2) ^ i53) | ((-2) & i53));
                        int i116 = ~((iNormalizeMetaState ^ i) | (iNormalizeMetaState & i));
                        int i117 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i118 = (i117 & 95) + (i117 | 95);
                        int i119 = i118 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i119;
                        int i120 = i118 % 2;
                        int i121 = -(-(959 * ((i115 & i116) | (i115 ^ i116))));
                        int i122 = (i114 & i121) + (i114 | i121) + 1918;
                        int i123 = ~(((-2) & i) | ((-2) ^ i));
                        int i124 = ~((iNormalizeMetaState & i53) | (i53 ^ iNormalizeMetaState));
                        int i125 = -(-(((i123 & i124) | (i123 ^ i124)) * 959));
                        int i126 = (i122 ^ i125) + ((i125 & i122) << 1);
                        int i127 = (i119 ^ 17) + ((i119 & 17) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i127 % 128;
                        int i128 = i127 % 2;
                        int i129 = -(-Color.red(0));
                        Object[] objArr10 = new Object[1];
                        d(i126, new char[]{13849}, (byte) ((i129 ^ 110) + ((i129 & 110) << 1)), objArr10);
                        boolean zEquals = line2.equals((String) objArr10[0]);
                        int i130 = TuitionPaymentFragmentbindingInflater1;
                        int i131 = ((i130 | 7) << 1) - (i130 ^ 7);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i131 % 128;
                        int i132 = i131 % 2;
                        fileReader2.close();
                        bufferedReader2.close();
                        if (zEquals) {
                            int iIndexOf3 = TextUtils.indexOf("", "", 0);
                            int i133 = (iIndexOf3 * 755) - 27108;
                            int i134 = ~iIndexOf3;
                            int i135 = ~(i134 | 36);
                            int i136 = ~iIndexOf3;
                            int i137 = ~(i136 | i);
                            int i138 = (i135 & i137) | (i135 ^ i137);
                            int i139 = ~((i ^ 36) | (i & 36));
                            int i140 = ((i138 & i139) | (i138 ^ i139)) * (-754);
                            int i141 = (i133 ^ i140) + ((i133 & i140) << 1);
                            int i142 = ~((i134 ^ 36) | (i134 & 36) | i);
                            int i143 = ~((iIndexOf3 & i53) | (i53 ^ iIndexOf3) | 36);
                            int i144 = ((i141 - (~(((i142 & i143) | (i142 ^ i143)) * (-754)))) - 1) + (((i136 ^ i53) | (i136 & i53)) * 754);
                            char[] cArr3 = {29, 18, 22, 18, 25, 18, '\f', '\r', 29, 16, '\f', 27, 11, 16, 14, 20, 30, 29, 17, '\r', '\n', '!', Typography.quote, 24, 30, 29, 17, '\r', '\n', '!', Typography.quote, 24, 31, 11, 28, Typography.quote};
                            int i145 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            Object[] objArr11 = new Object[1];
                            d(i144, cArr3, (byte) (((i145 | 30) << 1) - (i145 ^ 30)), objArr11);
                            File file3 = new File((String) objArr11[0]);
                            if (file3.canRead()) {
                                FileReader fileReader3 = new FileReader(file3);
                                BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                try {
                                    String line3 = bufferedReader3.readLine();
                                    int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                                    int i146 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i147 = (i146 & 9) + (i146 | 9);
                                    TuitionPaymentFragmentbindingInflater1 = i147 % 128;
                                    int i148 = i147 % 2;
                                    int i149 = -tapTimeout;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i150 = i149 * 471;
                                    int i151 = (i150 ^ 471) + ((i150 & 471) << 1);
                                    int i152 = -(-(((i149 ^ 1) | (i149 & 1)) * (-470)));
                                    int i153 = (i151 ^ i152) + ((i152 & i151) << 1);
                                    int i154 = ~i149;
                                    int i155 = ~((i154 & (-2)) | (i154 ^ (-2)));
                                    int i156 = ~((-2) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                    int i157 = (i155 & i156) | (i155 ^ i156);
                                    int i158 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    int i159 = (i158 ^ i149) | (i158 & i149);
                                    int i160 = TuitionPaymentFragmentbindingInflater1 + 113;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i160 % 128;
                                    if (i160 % 2 == 0) {
                                        int i161 = ~((i159 ^ 1) | (i159 & 1));
                                        int i162 = -((-470) / ((i157 & i161) | (i157 ^ i161)));
                                        i11 = ((i153 | i162) << 1) - (i162 ^ i153);
                                        int i163 = ((-2) & i149) | ((-2) ^ i149);
                                        i12 = ~((i163 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i163 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                        i13 = i149 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                    } else {
                                        int i164 = (i157 | (~((i159 & 1) | (i159 ^ 1)))) * (-470);
                                        i11 = ((i153 | i164) << 1) - (i164 ^ i153);
                                        int i165 = ((-2) ^ i149) | ((-2) & i149);
                                        i12 = ~((i165 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i165 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                        i13 = i149 | i158;
                                    }
                                    int i166 = (i11 - (~(-(-(470 * (i12 | (~((i13 & 1) | (i13 ^ 1))))))))) - 1;
                                    char[] cArr4 = {13849};
                                    int i167 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    int i168 = TuitionPaymentFragmentbindingInflater1 + 109;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i168 % 128;
                                    if (i168 % 2 == 0) {
                                        i14 = ((-183) >>> i167) % 75;
                                        i15 = ~((~i167) | 110);
                                        i16 = (i53 ^ 110) | (i53 & 110);
                                    } else {
                                        i14 = (i167 * (-183)) + 20350;
                                        int i169 = ~i167;
                                        i15 = ~((i169 & 110) | (i169 ^ 110));
                                        i16 = i53 | 110;
                                    }
                                    int i170 = ~i16;
                                    int i171 = 184 * ((i15 & i170) | (i15 ^ i170));
                                    int i172 = (i14 ^ i171) + ((i14 & i171) << 1);
                                    int i173 = ~((-111) | i167);
                                    int i174 = (i172 - (~(-(-(((i173 & i) | (i ^ i173)) * (-184)))))) - 1;
                                    int i175 = ~i167;
                                    byte b4 = (byte) (i174 + ((~((i175 & i53) | (i175 ^ i53))) * 184));
                                    Object[] objArr12 = new Object[1];
                                    d(i166, cArr4, b4, objArr12);
                                    boolean zEquals2 = line3.equals((String) objArr12[0]);
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    zzapt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    if (zEquals2) {
                                        int i176 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        int i177 = i176 + 1;
                                        TuitionPaymentFragmentbindingInflater1 = i177 % 128;
                                        int i178 = i177 % 2;
                                        if (line != null) {
                                            objArr = new Object[2];
                                            int[] iArr2 = new int[1];
                                            objArr[0] = iArr2;
                                            int i179 = i176 + 47;
                                            TuitionPaymentFragmentbindingInflater1 = i179 % 128;
                                            if (i179 % 2 != 0) {
                                                i17 = (~(i & 26)) & (i | 26);
                                                strArr = new String[0];
                                                strArr[1] = line;
                                            } else {
                                                i17 = (i & (-21)) | (i53 & 20);
                                                strArr = new String[]{line};
                                            }
                                            int i180 = i176 + 83;
                                            TuitionPaymentFragmentbindingInflater1 = i180 % 128;
                                            int i181 = i180 % 2;
                                            iArr2[0] = i17;
                                            objArr[1] = strArr;
                                            int i182 = ((i176 | 27) << 1) - (i176 ^ 27);
                                            TuitionPaymentFragmentbindingInflater1 = i182 % 128;
                                            if (i182 % 2 != 0) {
                                                int i183 = 4 % 5;
                                            }
                                            c2 = 0;
                                        } else {
                                            i6 = 2;
                                        }
                                    }
                                    objArr = new Object[i6];
                                    iArr = new int[1];
                                    objArr[0] = iArr;
                                    int i184 = TuitionPaymentFragmentbindingInflater1;
                                    int i185 = (i184 & 119) + (i184 | 119);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i185 % 128;
                                    int i186 = i185 % 2;
                                    String[] strArr3 = new String[0];
                                    int i187 = (i184 ^ 47) + ((i184 & 47) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i187 % 128;
                                    int i188 = i187 % 2;
                                    i7 = i184 + 67;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        c = 1;
                                        iArr[1] = i;
                                        c2 = 0;
                                    } else {
                                        c = 1;
                                        c2 = 0;
                                        iArr[0] = i;
                                    }
                                    objArr[c] = strArr3;
                                } catch (Throwable th2) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    throw th2;
                                }
                            }
                        }
                        int i189 = ((int[]) objArr[c2])[c2];
                        int i190 = (~(i & i67)) & (i | i67);
                        int i191 = -i190;
                        int i192 = ((i190 & i191) | (i190 ^ i191)) >> 31;
                        int i193 = (~i192) & i189;
                        int i194 = i67 & i192;
                        i8 = (i194 & i193) | (i193 ^ i194);
                        String[] strArr4 = (String[]) objArr[1];
                        Object[] objArr13 = new Object[2];
                        int i195 = (i189 & i53) | ((~i189) & i);
                        int i196 = -i195;
                        int i197 = (((i195 & i196) | (i195 ^ i196)) >> 31) & 1;
                        int i198 = -i197;
                        int i199 = (~(((i198 & i197) | (i197 ^ i198)) >> 31)) & 1;
                        objArr13[i197] = null;
                        objArr13[i199] = strArr4;
                        String[] strArr5 = (String[]) objArr13[0];
                        int i200 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i9 = i200 + 45;
                        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                        if (i9 % 2 != 0) {
                            objArr2 = new Object[4];
                            objArr2[1] = new int[1];
                            objArr2[0] = new int[1];
                            objArr2[4] = new int[1];
                            int i201 = i ^ i8;
                            int i202 = -i201;
                            i10 = ((i201 & i202) | (i201 ^ i202)) << 35;
                        } else {
                            objArr2 = new Object[4];
                            objArr2[0] = new int[1];
                            objArr2[1] = new int[1];
                            objArr2[2] = new int[1];
                            int i203 = (i53 & i8) | ((~i8) & i);
                            int i204 = -i203;
                            i10 = ((i203 & i204) | (i203 ^ i204)) >> 31;
                        }
                        ((int[]) objArr2[0])[0] = i;
                        ((int[]) objArr2[2])[0] = i8;
                        objArr2[3] = strArr5;
                        int i205 = (-694850260) + (((~((-986978888) | i)) | 940576772) * (-140)) + ((~((-46402116) | i)) * 70) + (((~(1027289116 | i)) | (-133114460)) * 70) + (i10 & 16);
                        int i206 = (i200 ^ 125) + ((i200 & 125) << 1);
                        int i207 = i206 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i207;
                        int i208 = i206 % 2;
                        int i209 = (((((-419) * i205) - (~(i2 * 421))) - 1) - (~(-(-((~((i2 ^ i) | (i2 & i))) * TypedValues.CycleType.TYPE_EASING))))) - 1;
                        int i210 = ((~i205) | i2) * (-420);
                        int i211 = (i209 ^ i210) + ((i209 & i210) << 1);
                        int i212 = (~i205) | (~i2);
                        int i213 = (i207 & 91) + (i207 | 91);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i213 % 128;
                        int i214 = i213 % 2;
                        int i215 = ~i;
                        int i216 = -(-(TypedValues.CycleType.TYPE_EASING * ((i212 ^ (-1)) | (~((i215 & i2) | (i215 ^ i2))))));
                        int i217 = (i211 & i216) + (i216 | i211);
                        int i218 = (i217 << 13) ^ i217;
                        int i219 = i218 >>> 17;
                        int i220 = ((~i218) & i219) | ((~i219) & i218);
                        ((int[]) objArr2[1])[0] = i220 ^ (i220 << 5);
                        return objArr2;
                    } catch (Throwable th3) {
                        fileReader2.close();
                        bufferedReader2.close();
                        throw th3;
                    }
                }
                int i221 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
                TuitionPaymentFragmentbindingInflater1 = i221 % 128;
                int i222 = i221 % 2;
            } catch (Exception unused3) {
            }
            i6 = 2;
            objArr = new Object[i6];
            iArr = new int[1];
            objArr[0] = iArr;
            int i1810 = TuitionPaymentFragmentbindingInflater1;
            int i1811 = (i1810 & 119) + (i1810 | 119);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1811 % 128;
            int i1812 = i1811 % 2;
            String[] strArr6 = new String[0];
            int i1813 = (i1810 ^ 47) + ((i1810 & 47) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1813 % 128;
            int i1814 = i1813 % 2;
            i7 = i1810 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            if (i7 % 2 == 0) {
                c = 1;
                iArr[1] = i;
                c2 = 0;
            } else {
                c = 1;
                c2 = 0;
                iArr[0] = i;
            }
            objArr[c] = strArr6;
            int i1815 = ((int[]) objArr[c2])[c2];
            int i1910 = (~(i & i67)) & (i | i67);
            int i1911 = -i1910;
            int i1912 = ((i1910 & i1911) | (i1910 ^ i1911)) >> 31;
            int i1913 = (~i1912) & i1815;
            int i1914 = i67 & i1912;
            i8 = (i1914 & i1913) | (i1913 ^ i1914);
            String[] strArr7 = (String[]) objArr[1];
            Object[] objArr14 = new Object[2];
            int i1915 = (i1815 & i53) | ((~i1815) & i);
            int i1916 = -i1915;
            int i1917 = (((i1915 & i1916) | (i1915 ^ i1916)) >> 31) & 1;
            int i1918 = -i1917;
            int i1919 = (~(((i1918 & i1917) | (i1917 ^ i1918)) >> 31)) & 1;
            objArr14[i1917] = null;
            objArr14[i1919] = strArr7;
            String[] strArr8 = (String[]) objArr14[0];
            int i2010 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            i9 = i2010 + 45;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            if (i9 % 2 != 0) {
                objArr2 = new Object[4];
                objArr2[1] = new int[1];
                objArr2[0] = new int[1];
                objArr2[4] = new int[1];
                int i2011 = i ^ i8;
                int i2012 = -i2011;
                i10 = ((i2011 & i2012) | (i2011 ^ i2012)) << 35;
            } else {
                objArr2 = new Object[4];
                objArr2[0] = new int[1];
                objArr2[1] = new int[1];
                objArr2[2] = new int[1];
                int i2013 = (i53 & i8) | ((~i8) & i);
                int i2014 = -i2013;
                i10 = ((i2013 & i2014) | (i2013 ^ i2014)) >> 31;
            }
            ((int[]) objArr2[0])[0] = i;
            ((int[]) objArr2[2])[0] = i8;
            objArr2[3] = strArr8;
            int i2015 = (-694850260) + (((~((-986978888) | i)) | 940576772) * (-140)) + ((~((-46402116) | i)) * 70) + (((~(1027289116 | i)) | (-133114460)) * 70) + (i10 & 16);
            int i2016 = (i2010 ^ 125) + ((i2010 & 125) << 1);
            int i2017 = i2016 % 128;
            TuitionPaymentFragmentbindingInflater1 = i2017;
            int i2018 = i2016 % 2;
            int i2019 = (((((-419) * i2015) - (~(i2 * 421))) - 1) - (~(-(-((~((i2 ^ i) | (i2 & i))) * TypedValues.CycleType.TYPE_EASING))))) - 1;
            int i2110 = ((~i2015) | i2) * (-420);
            int i2111 = (i2019 ^ i2110) + ((i2019 & i2110) << 1);
            int i2112 = (~i2015) | (~i2);
            int i2113 = (i2017 & 91) + (i2017 | 91);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2113 % 128;
            int i2114 = i2113 % 2;
            int i2115 = ~i;
            int i2116 = -(-(TypedValues.CycleType.TYPE_EASING * ((i2112 ^ (-1)) | (~((i2115 & i2) | (i2115 ^ i2))))));
            int i2117 = (i2111 & i2116) + (i2116 | i2111);
            int i2118 = (i2117 << 13) ^ i2117;
            int i2119 = i2118 >>> 17;
            int i223 = ((~i2118) & i2119) | ((~i2119) & i2118);
            ((int[]) objArr2[1])[0] = i223 ^ (i223 << 5);
            return objArr2;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$j(byte r6, short r7, short r8) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r1 = com.google.android.material.appbar.HeaderBehavior.$$h
            int r8 = r8 + 113
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r3 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L2b:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.$$j(byte, short, short):java.lang.String");
    }
}
