package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import defpackage.ImageAnalysisBuilder;
import defpackage.setBackpressureStrategy;
import defpackage.setHighResolutionDisabled;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ViewTarget<T extends View, Z> extends setBackpressureStrategy<Z> {
    private static final String TAG = "ViewTarget";
    private static boolean isTagUsedAtLeastOnce = false;
    private static int tagId = 2131428283;
    private View.OnAttachStateChangeListener attachStateListener;
    private boolean isAttachStateListenerAdded;
    private boolean isClearedByUs;
    private final TuitionPaymentFragmentbindingInflater1 sizeDeterminer;
    public final T view;

    public ViewTarget(T t) {
        if (t != null) {
            this.view = t;
            this.sizeDeterminer = new TuitionPaymentFragmentbindingInflater1(t);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Deprecated
    public ViewTarget(T t, boolean z) {
        this(t);
        if (z) {
            waitForLayout();
        }
    }

    public final ViewTarget<T, Z> clearOnDetach() {
        if (this.attachStateListener != null) {
            return this;
        }
        this.attachStateListener = new View.OnAttachStateChangeListener() { // from class: com.bumptech.glide.request.target.ViewTarget.5
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                ViewTarget.this.resumeMyRequest();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                ViewTarget.this.pauseMyRequest();
            }
        };
        maybeAddAttachStateListener();
        return this;
    }

    void resumeMyRequest() {
        ImageAnalysisBuilder request = getRequest();
        if (request == null || !request.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            return;
        }
        request.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    void pauseMyRequest() {
        ImageAnalysisBuilder request = getRequest();
        if (request != null) {
            this.isClearedByUs = true;
            request.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            this.isClearedByUs = false;
        }
    }

    public final ViewTarget<T, Z> waitForLayout() {
        this.sizeDeterminer.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        return this;
    }

    @Override // defpackage.setBackpressureStrategy, defpackage.setDefaultResolution
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        maybeAddAttachStateListener();
    }

    private void maybeAddAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
        if (onAttachStateChangeListener == null || this.isAttachStateListenerAdded) {
            return;
        }
        this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.isAttachStateListenerAdded = true;
    }

    private void maybeRemoveAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
        if (onAttachStateChangeListener == null || !this.isAttachStateListenerAdded) {
            return;
        }
        this.view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.isAttachStateListenerAdded = false;
    }

    public T getView() {
        return this.view;
    }

    @Override // defpackage.setDefaultResolution
    public void getSize(setHighResolutionDisabled sethighresolutiondisabled) {
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.sizeDeterminer;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (TuitionPaymentFragmentbindingInflater1.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault1) && TuitionPaymentFragmentbindingInflater1.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            sethighresolutiondisabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return;
        }
        if (!tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.contains(sethighresolutiondisabled)) {
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(sethighresolutiondisabled);
        }
        if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 == null) {
            ViewTreeObserver viewTreeObserver = tuitionPaymentFragmentbindingInflater1.b.getViewTreeObserver();
            TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1);
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            viewTreeObserver.addOnPreDrawListener(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    @Override // defpackage.setDefaultResolution
    public void removeCallback(setHighResolutionDisabled sethighresolutiondisabled) {
        this.sizeDeterminer.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(sethighresolutiondisabled);
    }

    @Override // defpackage.setBackpressureStrategy, defpackage.setDefaultResolution
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        this.sizeDeterminer.TuitionPaymentFragmentbindingInflater1();
        if (this.isClearedByUs) {
            return;
        }
        maybeRemoveAttachStateListener();
    }

    @Override // defpackage.setBackpressureStrategy, defpackage.setDefaultResolution
    public void setRequest(ImageAnalysisBuilder imageAnalysisBuilder) {
        setTag(imageAnalysisBuilder);
    }

    @Override // defpackage.setBackpressureStrategy, defpackage.setDefaultResolution
    public ImageAnalysisBuilder getRequest() {
        Object tag = getTag();
        if (tag == null) {
            return null;
        }
        if (tag instanceof ImageAnalysisBuilder) {
            return (ImageAnalysisBuilder) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target for: ");
        sb.append(this.view);
        return sb.toString();
    }

    private void setTag(Object obj) {
        isTagUsedAtLeastOnce = true;
        this.view.setTag(tagId, obj);
    }

    private Object getTag() {
        return this.view.getTag(tagId);
    }

    @Deprecated
    public static void setTagId(int i) {
        if (isTagUsedAtLeastOnce) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        tagId = i;
    }

    static final class TuitionPaymentFragmentbindingInflater1 {
        private static Integer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final List<setHighResolutionDisabled> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();
        final View b;

        static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) {
            if (i > 0 || i == Integer.MIN_VALUE) {
                return i2 > 0 || i2 == Integer.MIN_VALUE;
            }
            return false;
        }

        static boolean b(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        TuitionPaymentFragmentbindingInflater1(View view) {
            this.b = view;
        }

        final void TuitionPaymentFragmentbindingInflater1() {
            ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.TuitionPaymentFragmentbindingInflater1);
            }
            this.TuitionPaymentFragmentbindingInflater1 = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.clear();
        }

        final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            int paddingTop = this.b.getPaddingTop();
            int paddingBottom = this.b.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            return TuitionPaymentFragmentbindingInflater1(this.b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop + paddingBottom);
        }

        final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            int paddingLeft = this.b.getPaddingLeft();
            int paddingRight = this.b.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            return TuitionPaymentFragmentbindingInflater1(this.b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft + paddingRight);
        }

        private int TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.b.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.b.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Context context = this.b.getContext();
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Integer.valueOf(Math.max(point.x, point.y));
                } else {
                    throw new NullPointerException("Argument must not be null");
                }
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2.intValue();
        }

        static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<TuitionPaymentFragmentbindingInflater1> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

            TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new WeakReference<>(tuitionPaymentFragmentbindingInflater1);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable(ViewTarget.TAG, 2)) {
                    toString();
                }
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
                if (tuitionPaymentFragmentbindingInflater1 == null || tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
                    return true;
                }
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                if (!TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                    return true;
                }
                Iterator it = new ArrayList(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3).iterator();
                while (it.hasNext()) {
                    ((setHighResolutionDisabled) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
                return true;
            }
        }
    }
}
