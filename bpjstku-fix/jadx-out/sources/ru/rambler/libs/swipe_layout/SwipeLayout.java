package ru.rambler.libs.swipe_layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import defpackage.setDurationLimitMillis;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class SwipeLayout extends ViewGroup {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "SwipeLayout";
    private float INotificationSideChannel;
    private final Map<View, Boolean> TuitionPaymentFragmentbindingInflater1;
    private ViewDragHelper TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final ViewDragHelper.Callback TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1349a;
    private boolean asBinder;
    private View asInterface;
    private View b;
    private float cancel;
    private float cancelAll;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 d;
    private View g;
    private int notify;
    private float onTransact;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    }

    public SwipeLayout(Context context) {
        super(context);
        this.TuitionPaymentFragmentbindingInflater1 = new WeakHashMap();
        this.asBinder = true;
        this.f1349a = true;
        this.notify = 0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ViewDragHelper.Callback() { // from class: ru.rambler.libs.swipe_layout.SwipeLayout.3
            private int TuitionPaymentFragmentbindingInflater1;

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final boolean tryCaptureView(View view, int i) {
                this.TuitionPaymentFragmentbindingInflater1 = view.getLeft();
                return true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int clampViewPositionHorizontal(View view, int i, int i2) {
                if (i2 > 0) {
                    return TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, i);
                }
                return TuitionPaymentFragmentbindingInflater1(view, i);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int getViewHorizontalDragRange(View view) {
                return SwipeLayout.this.getWidth();
            }

            /* JADX WARN: Code duplicated, block: B:14:0x002b  */
            /* JADX WARN: Code duplicated, block: B:16:0x0035  */
            /* JADX WARN: Code duplicated, block: B:18:0x0041  */
            /* JADX WARN: Code duplicated, block: B:19:0x0051  */
            /* JADX WARN: Code duplicated, block: B:22:0x0063  */
            /* JADX WARN: Code duplicated, block: B:24:0x0071  */
            /* JADX WARN: Code duplicated, block: B:26:0x0079  */
            /* JADX WARN: Code duplicated, block: B:27:0x008f  */
            /* JADX WARN: Code duplicated, block: B:61:0x0149  */
            /* JADX WARN: Code duplicated, block: B:63:0x014f  */
            /* JADX WARN: Code duplicated, block: B:64:0x015a  */
            /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewReleased(View view, float f, float f2) {
                boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int width;
                float f3;
                float left;
                int i;
                int width2;
                String unused = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                float unused2 = SwipeLayout.this.cancelAll;
                int left2 = view.getLeft() - this.TuitionPaymentFragmentbindingInflater1;
                if (left2 != 0) {
                    boolean z = false;
                    if (left2 > 0) {
                        if (f < 0.0f) {
                            zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, left2, f);
                            if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                return;
                            }
                        } else {
                            if (f > SwipeLayout.this.cancelAll) {
                                if (SwipeLayout.this.b.getLeft() < 0) {
                                    width2 = view.getLeft() - SwipeLayout.this.b.getLeft();
                                } else {
                                    width2 = SwipeLayout.this.getWidth();
                                }
                                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, width2), !(SwipeLayout.this.b.getLeft() < 0), true);
                                return;
                            }
                            if (SwipeLayout.this.g == null) {
                                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, view.getLeft() - SwipeLayout.this.b.getLeft(), false, true);
                                return;
                            }
                            layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.g);
                            if (left2 <= 0 && f >= 0.0f && SwipeLayout.this.g != null && ((i = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == -2 ? SwipeLayout.this.g.getRight() >= SwipeLayout.this.g.getWidth() : !(i == -1 ? SwipeLayout.this.g.getRight() < SwipeLayout.this.getWidth() : SwipeLayout.this.g.getRight() < layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3))) {
                                if (SwipeLayout.this.d != null) {
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused3 = SwipeLayout.this.d;
                                    return;
                                }
                                return;
                            }
                            if (left2 > 0 || f < 0.0f || layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 == -1 || SwipeLayout.this.g.getRight() <= layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) {
                                if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b != -2) {
                                    if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -1) {
                                        width = SwipeLayout.this.g.getWidth();
                                    } else {
                                        width = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                                    }
                                    float f4 = width * layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    f3 = -f4;
                                    left = SwipeLayout.this.b.getLeft() - width;
                                    if (left >= f3 && left <= f4) {
                                        if ((layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != -2 && width == SwipeLayout.this.g.getWidth()) || layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == width || (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1 && width == SwipeLayout.this.getWidth())) {
                                        }
                                        SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, (view.getLeft() - SwipeLayout.this.b.getLeft()) + width, z, true);
                                        return;
                                    }
                                }
                            } else {
                                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, SwipeLayout.this.b.getLeft() < 0 ? view.getLeft() - SwipeLayout.this.b.getLeft() : SwipeLayout.this.getWidth()), true, true);
                                return;
                            }
                        }
                    } else if (f <= 0.0f) {
                        zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, left2, f);
                        if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            return;
                        }
                    } else {
                        if (f > SwipeLayout.this.cancelAll) {
                            if (SwipeLayout.this.b.getLeft() < 0) {
                                width2 = view.getLeft() - SwipeLayout.this.b.getLeft();
                            } else {
                                width2 = SwipeLayout.this.getWidth();
                            }
                            SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, width2), !(SwipeLayout.this.b.getLeft() < 0), true);
                            return;
                        }
                        if (SwipeLayout.this.g == null) {
                            SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, view.getLeft() - SwipeLayout.this.b.getLeft(), false, true);
                            return;
                        }
                        layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.g);
                        if (left2 <= 0) {
                        }
                        if (left2 > 0) {
                        }
                        if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b != -2) {
                            if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -1) {
                                width = SwipeLayout.this.g.getWidth();
                            } else {
                                width = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                            }
                            float f5 = width * layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            f3 = -f5;
                            left = SwipeLayout.this.b.getLeft() - width;
                            if (left >= f3) {
                                z = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != -2 ? true : true;
                                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, (view.getLeft() - SwipeLayout.this.b.getLeft()) + width, z, true);
                                return;
                            }
                        }
                    }
                    SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, view.getLeft() - SwipeLayout.this.b.getLeft(), false, left2 > 0);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                SwipeLayout.this.b(view, i3);
                if (SwipeLayout.this.d != null) {
                    if (i3 > 0) {
                        if (SwipeLayout.this.g != null && (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this.g)) != -2 && SwipeLayout.this.g.getRight() - iTuitionPaymentFragmentspecialinlinedviewModeldefault4 > 0 && (SwipeLayout.this.g.getRight() - iTuitionPaymentFragmentspecialinlinedviewModeldefault4) - i3 <= 0) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused = SwipeLayout.this.d;
                        }
                        if (SwipeLayout.this.asInterface == null || (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this.asInterface)) == -2 || SwipeLayout.this.asInterface.getLeft() + iTuitionPaymentFragmentspecialinlinedviewModeldefault3 <= SwipeLayout.this.getWidth() || (SwipeLayout.this.asInterface.getLeft() + iTuitionPaymentFragmentspecialinlinedviewModeldefault3) - i3 > SwipeLayout.this.getWidth()) {
                            return;
                        }
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused2 = SwipeLayout.this.d;
                        return;
                    }
                    if (i3 < 0) {
                        if (SwipeLayout.this.g != null && (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this.g)) != -2 && SwipeLayout.this.g.getRight() - iTuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 0 && (SwipeLayout.this.g.getRight() - iTuitionPaymentFragmentspecialinlinedviewModeldefault2) - i3 > 0) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused3 = SwipeLayout.this.d;
                        }
                        if (SwipeLayout.this.asInterface == null || (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this.asInterface)) == -2 || SwipeLayout.this.asInterface.getLeft() + iTuitionPaymentFragmentspecialinlinedviewModeldefault1 > SwipeLayout.this.getWidth() || (SwipeLayout.this.asInterface.getLeft() + iTuitionPaymentFragmentspecialinlinedviewModeldefault1) - i3 <= SwipeLayout.this.getWidth()) {
                            return;
                        }
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused4 = SwipeLayout.this.d;
                    }
                }
            }

            private int TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view) {
                LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(view);
                if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -2) {
                    return -2;
                }
                return layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -1 ? view.getWidth() : layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
            }

            private int TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view, int i) {
                if (SwipeLayout.this.g == null) {
                    return view == SwipeLayout.this.b ? Math.min(i, 0) : Math.min(i, SwipeLayout.this.getWidth());
                }
                LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.g);
                int i2 = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (i2 == -2) {
                    return Math.min(i, view.getLeft() - SwipeLayout.this.g.getLeft());
                }
                if (i2 == -1) {
                    return Math.min(i, (SwipeLayout.this.getWidth() + view.getLeft()) - SwipeLayout.this.g.getRight());
                }
                return Math.min(i, (view.getLeft() - SwipeLayout.this.g.getRight()) + layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }

            private int TuitionPaymentFragmentbindingInflater1(View view, int i) {
                if (SwipeLayout.this.asInterface == null) {
                    return view == SwipeLayout.this.b ? Math.max(i, 0) : Math.max(i, -view.getWidth());
                }
                LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.asInterface);
                int i2 = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (i2 == -2) {
                    return Math.max(i, ((SwipeLayout.this.getWidth() - SwipeLayout.this.asInterface.getLeft()) + view.getLeft()) - SwipeLayout.this.asInterface.getWidth());
                }
                if (i2 == -1) {
                    return Math.max(view.getLeft() - SwipeLayout.this.asInterface.getLeft(), i);
                }
                return Math.max(i, ((SwipeLayout.this.getWidth() - SwipeLayout.this.asInterface.getLeft()) + view.getLeft()) - layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }

            private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view, int i, float f) {
                int width;
                int i2;
                if ((-f) <= SwipeLayout.this.cancelAll) {
                    if (SwipeLayout.this.asInterface == null) {
                        SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, view.getLeft() - SwipeLayout.this.b.getLeft(), false, false);
                        return true;
                    }
                    LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.asInterface);
                    if (i < 0 && f <= 0.0f && SwipeLayout.this.asInterface != null && ((i2 = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == -2 ? SwipeLayout.this.asInterface.getRight() <= SwipeLayout.this.getWidth() : !(i2 == -1 ? SwipeLayout.this.asInterface.getRight() > SwipeLayout.this.getWidth() : SwipeLayout.this.asInterface.getLeft() + layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > SwipeLayout.this.getWidth()))) {
                        if (SwipeLayout.this.d != null) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused = SwipeLayout.this.d;
                        }
                        return true;
                    }
                    if (i < 0 && f <= 0.0f && layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 != -1 && SwipeLayout.this.asInterface.getLeft() + layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 < SwipeLayout.this.getWidth()) {
                        SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentbindingInflater1(view, SwipeLayout.this.b.getLeft() > 0 ? view.getLeft() - SwipeLayout.this.b.getLeft() : -SwipeLayout.this.getWidth()), true, false);
                        return true;
                    }
                    if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b != -2) {
                        if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -1) {
                            width = SwipeLayout.this.asInterface.getWidth();
                        } else {
                            width = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                        }
                        float f2 = width * layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        float f3 = -f2;
                        float right = (SwipeLayout.this.b.getRight() + width) - SwipeLayout.this.getWidth();
                        if (right >= f3 && right <= f2) {
                            SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, ((view.getLeft() - SwipeLayout.this.asInterface.getLeft()) + SwipeLayout.this.getWidth()) - width, (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == -2 && width == SwipeLayout.this.asInterface.getWidth()) || layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == width || (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1 && width == SwipeLayout.this.getWidth()), false);
                            return true;
                        }
                    }
                    return false;
                }
                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentbindingInflater1(view, SwipeLayout.this.b.getLeft() > 0 ? view.getLeft() - SwipeLayout.this.b.getLeft() : -SwipeLayout.this.getWidth()), !(SwipeLayout.this.b.getLeft() > 0), false);
                return true;
            }
        };
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(context, null);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TuitionPaymentFragmentbindingInflater1 = new WeakHashMap();
        this.asBinder = true;
        this.f1349a = true;
        this.notify = 0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ViewDragHelper.Callback() { // from class: ru.rambler.libs.swipe_layout.SwipeLayout.3
            private int TuitionPaymentFragmentbindingInflater1;

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final boolean tryCaptureView(View view, int i) {
                this.TuitionPaymentFragmentbindingInflater1 = view.getLeft();
                return true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int clampViewPositionHorizontal(View view, int i, int i2) {
                if (i2 > 0) {
                    return TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, i);
                }
                return TuitionPaymentFragmentbindingInflater1(view, i);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int getViewHorizontalDragRange(View view) {
                return SwipeLayout.this.getWidth();
            }

            /* JADX WARN: Code duplicated, block: B:14:0x002b  */
            /* JADX WARN: Code duplicated, block: B:16:0x0035  */
            /* JADX WARN: Code duplicated, block: B:18:0x0041  */
            /* JADX WARN: Code duplicated, block: B:19:0x0051  */
            /* JADX WARN: Code duplicated, block: B:22:0x0063  */
            /* JADX WARN: Code duplicated, block: B:24:0x0071  */
            /* JADX WARN: Code duplicated, block: B:26:0x0079  */
            /* JADX WARN: Code duplicated, block: B:27:0x008f  */
            /* JADX WARN: Code duplicated, block: B:61:0x0149  */
            /* JADX WARN: Code duplicated, block: B:63:0x014f  */
            /* JADX WARN: Code duplicated, block: B:64:0x015a  */
            /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewReleased(View view, float f, float f2) {
                boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int width;
                float f3;
                float left;
                int i;
                int width2;
                String unused = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                float unused2 = SwipeLayout.this.cancelAll;
                int left2 = view.getLeft() - this.TuitionPaymentFragmentbindingInflater1;
                if (left2 != 0) {
                    boolean z = false;
                    if (left2 > 0) {
                        if (f < 0.0f) {
                            zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, left2, f);
                            if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                return;
                            }
                        } else {
                            if (f > SwipeLayout.this.cancelAll) {
                                if (SwipeLayout.this.b.getLeft() < 0) {
                                    width2 = view.getLeft() - SwipeLayout.this.b.getLeft();
                                } else {
                                    width2 = SwipeLayout.this.getWidth();
                                }
                                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, width2), !(SwipeLayout.this.b.getLeft() < 0), true);
                                return;
                            }
                            if (SwipeLayout.this.g == null) {
                                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, view.getLeft() - SwipeLayout.this.b.getLeft(), false, true);
                                return;
                            }
                            layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.g);
                            if (left2 <= 0 && f >= 0.0f && SwipeLayout.this.g != null && ((i = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == -2 ? SwipeLayout.this.g.getRight() >= SwipeLayout.this.g.getWidth() : !(i == -1 ? SwipeLayout.this.g.getRight() < SwipeLayout.this.getWidth() : SwipeLayout.this.g.getRight() < layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3))) {
                                if (SwipeLayout.this.d != null) {
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused3 = SwipeLayout.this.d;
                                    return;
                                }
                                return;
                            }
                            if (left2 > 0 || f < 0.0f || layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 == -1 || SwipeLayout.this.g.getRight() <= layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) {
                                if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b != -2) {
                                    if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -1) {
                                        width = SwipeLayout.this.g.getWidth();
                                    } else {
                                        width = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                                    }
                                    float f5 = width * layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    f3 = -f5;
                                    left = SwipeLayout.this.b.getLeft() - width;
                                    if (left >= f3 && left <= f5) {
                                        if ((layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != -2 && width == SwipeLayout.this.g.getWidth()) || layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == width || (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1 && width == SwipeLayout.this.getWidth())) {
                                        }
                                        SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, (view.getLeft() - SwipeLayout.this.b.getLeft()) + width, z, true);
                                        return;
                                    }
                                }
                            } else {
                                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, SwipeLayout.this.b.getLeft() < 0 ? view.getLeft() - SwipeLayout.this.b.getLeft() : SwipeLayout.this.getWidth()), true, true);
                                return;
                            }
                        }
                    } else if (f <= 0.0f) {
                        zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, left2, f);
                        if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            return;
                        }
                    } else {
                        if (f > SwipeLayout.this.cancelAll) {
                            if (SwipeLayout.this.b.getLeft() < 0) {
                                width2 = view.getLeft() - SwipeLayout.this.b.getLeft();
                            } else {
                                width2 = SwipeLayout.this.getWidth();
                            }
                            SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, width2), !(SwipeLayout.this.b.getLeft() < 0), true);
                            return;
                        }
                        if (SwipeLayout.this.g == null) {
                            SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, view.getLeft() - SwipeLayout.this.b.getLeft(), false, true);
                            return;
                        }
                        layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.g);
                        if (left2 <= 0) {
                        }
                        if (left2 > 0) {
                        }
                        if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b != -2) {
                            if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -1) {
                                width = SwipeLayout.this.g.getWidth();
                            } else {
                                width = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                            }
                            float f6 = width * layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            f3 = -f6;
                            left = SwipeLayout.this.b.getLeft() - width;
                            if (left >= f3) {
                                z = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != -2 ? true : true;
                                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, (view.getLeft() - SwipeLayout.this.b.getLeft()) + width, z, true);
                                return;
                            }
                        }
                    }
                    SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, view.getLeft() - SwipeLayout.this.b.getLeft(), false, left2 > 0);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                SwipeLayout.this.b(view, i3);
                if (SwipeLayout.this.d != null) {
                    if (i3 > 0) {
                        if (SwipeLayout.this.g != null && (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this.g)) != -2 && SwipeLayout.this.g.getRight() - iTuitionPaymentFragmentspecialinlinedviewModeldefault4 > 0 && (SwipeLayout.this.g.getRight() - iTuitionPaymentFragmentspecialinlinedviewModeldefault4) - i3 <= 0) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused = SwipeLayout.this.d;
                        }
                        if (SwipeLayout.this.asInterface == null || (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this.asInterface)) == -2 || SwipeLayout.this.asInterface.getLeft() + iTuitionPaymentFragmentspecialinlinedviewModeldefault3 <= SwipeLayout.this.getWidth() || (SwipeLayout.this.asInterface.getLeft() + iTuitionPaymentFragmentspecialinlinedviewModeldefault3) - i3 > SwipeLayout.this.getWidth()) {
                            return;
                        }
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused2 = SwipeLayout.this.d;
                        return;
                    }
                    if (i3 < 0) {
                        if (SwipeLayout.this.g != null && (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this.g)) != -2 && SwipeLayout.this.g.getRight() - iTuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 0 && (SwipeLayout.this.g.getRight() - iTuitionPaymentFragmentspecialinlinedviewModeldefault2) - i3 > 0) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused3 = SwipeLayout.this.d;
                        }
                        if (SwipeLayout.this.asInterface == null || (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this.asInterface)) == -2 || SwipeLayout.this.asInterface.getLeft() + iTuitionPaymentFragmentspecialinlinedviewModeldefault1 > SwipeLayout.this.getWidth() || (SwipeLayout.this.asInterface.getLeft() + iTuitionPaymentFragmentspecialinlinedviewModeldefault1) - i3 <= SwipeLayout.this.getWidth()) {
                            return;
                        }
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused4 = SwipeLayout.this.d;
                    }
                }
            }

            private int TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view) {
                LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(view);
                if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -2) {
                    return -2;
                }
                return layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -1 ? view.getWidth() : layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
            }

            private int TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view, int i) {
                if (SwipeLayout.this.g == null) {
                    return view == SwipeLayout.this.b ? Math.min(i, 0) : Math.min(i, SwipeLayout.this.getWidth());
                }
                LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.g);
                int i2 = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (i2 == -2) {
                    return Math.min(i, view.getLeft() - SwipeLayout.this.g.getLeft());
                }
                if (i2 == -1) {
                    return Math.min(i, (SwipeLayout.this.getWidth() + view.getLeft()) - SwipeLayout.this.g.getRight());
                }
                return Math.min(i, (view.getLeft() - SwipeLayout.this.g.getRight()) + layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }

            private int TuitionPaymentFragmentbindingInflater1(View view, int i) {
                if (SwipeLayout.this.asInterface == null) {
                    return view == SwipeLayout.this.b ? Math.max(i, 0) : Math.max(i, -view.getWidth());
                }
                LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.asInterface);
                int i2 = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (i2 == -2) {
                    return Math.max(i, ((SwipeLayout.this.getWidth() - SwipeLayout.this.asInterface.getLeft()) + view.getLeft()) - SwipeLayout.this.asInterface.getWidth());
                }
                if (i2 == -1) {
                    return Math.max(view.getLeft() - SwipeLayout.this.asInterface.getLeft(), i);
                }
                return Math.max(i, ((SwipeLayout.this.getWidth() - SwipeLayout.this.asInterface.getLeft()) + view.getLeft()) - layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }

            private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view, int i, float f) {
                int width;
                int i2;
                if ((-f) <= SwipeLayout.this.cancelAll) {
                    if (SwipeLayout.this.asInterface == null) {
                        SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, view.getLeft() - SwipeLayout.this.b.getLeft(), false, false);
                        return true;
                    }
                    LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.asInterface);
                    if (i < 0 && f <= 0.0f && SwipeLayout.this.asInterface != null && ((i2 = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == -2 ? SwipeLayout.this.asInterface.getRight() <= SwipeLayout.this.getWidth() : !(i2 == -1 ? SwipeLayout.this.asInterface.getRight() > SwipeLayout.this.getWidth() : SwipeLayout.this.asInterface.getLeft() + layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > SwipeLayout.this.getWidth()))) {
                        if (SwipeLayout.this.d != null) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused = SwipeLayout.this.d;
                        }
                        return true;
                    }
                    if (i < 0 && f <= 0.0f && layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 != -1 && SwipeLayout.this.asInterface.getLeft() + layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 < SwipeLayout.this.getWidth()) {
                        SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentbindingInflater1(view, SwipeLayout.this.b.getLeft() > 0 ? view.getLeft() - SwipeLayout.this.b.getLeft() : -SwipeLayout.this.getWidth()), true, false);
                        return true;
                    }
                    if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b != -2) {
                        if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -1) {
                            width = SwipeLayout.this.asInterface.getWidth();
                        } else {
                            width = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                        }
                        float f2 = width * layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        float f3 = -f2;
                        float right = (SwipeLayout.this.b.getRight() + width) - SwipeLayout.this.getWidth();
                        if (right >= f3 && right <= f2) {
                            SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, ((view.getLeft() - SwipeLayout.this.asInterface.getLeft()) + SwipeLayout.this.getWidth()) - width, (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == -2 && width == SwipeLayout.this.asInterface.getWidth()) || layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == width || (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1 && width == SwipeLayout.this.getWidth()), false);
                            return true;
                        }
                    }
                    return false;
                }
                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentbindingInflater1(view, SwipeLayout.this.b.getLeft() > 0 ? view.getLeft() - SwipeLayout.this.b.getLeft() : -SwipeLayout.this.getWidth()), !(SwipeLayout.this.b.getLeft() > 0), false);
                return true;
            }
        };
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(context, attributeSet);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TuitionPaymentFragmentbindingInflater1 = new WeakHashMap();
        this.asBinder = true;
        this.f1349a = true;
        this.notify = 0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ViewDragHelper.Callback() { // from class: ru.rambler.libs.swipe_layout.SwipeLayout.3
            private int TuitionPaymentFragmentbindingInflater1;

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final boolean tryCaptureView(View view, int i2) {
                this.TuitionPaymentFragmentbindingInflater1 = view.getLeft();
                return true;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int clampViewPositionHorizontal(View view, int i2, int i3) {
                if (i3 > 0) {
                    return TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, i2);
                }
                return TuitionPaymentFragmentbindingInflater1(view, i2);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int getViewHorizontalDragRange(View view) {
                return SwipeLayout.this.getWidth();
            }

            /* JADX WARN: Code duplicated, block: B:14:0x002b  */
            /* JADX WARN: Code duplicated, block: B:16:0x0035  */
            /* JADX WARN: Code duplicated, block: B:18:0x0041  */
            /* JADX WARN: Code duplicated, block: B:19:0x0051  */
            /* JADX WARN: Code duplicated, block: B:22:0x0063  */
            /* JADX WARN: Code duplicated, block: B:24:0x0071  */
            /* JADX WARN: Code duplicated, block: B:26:0x0079  */
            /* JADX WARN: Code duplicated, block: B:27:0x008f  */
            /* JADX WARN: Code duplicated, block: B:61:0x0149  */
            /* JADX WARN: Code duplicated, block: B:63:0x014f  */
            /* JADX WARN: Code duplicated, block: B:64:0x015a  */
            /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewReleased(View view, float f, float f2) {
                boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int width;
                float f3;
                float left;
                int i2;
                int width2;
                String unused = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                float unused2 = SwipeLayout.this.cancelAll;
                int left2 = view.getLeft() - this.TuitionPaymentFragmentbindingInflater1;
                if (left2 != 0) {
                    boolean z = false;
                    if (left2 > 0) {
                        if (f < 0.0f) {
                            zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, left2, f);
                            if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                return;
                            }
                        } else {
                            if (f > SwipeLayout.this.cancelAll) {
                                if (SwipeLayout.this.b.getLeft() < 0) {
                                    width2 = view.getLeft() - SwipeLayout.this.b.getLeft();
                                } else {
                                    width2 = SwipeLayout.this.getWidth();
                                }
                                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, width2), !(SwipeLayout.this.b.getLeft() < 0), true);
                                return;
                            }
                            if (SwipeLayout.this.g == null) {
                                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, view.getLeft() - SwipeLayout.this.b.getLeft(), false, true);
                                return;
                            }
                            layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.g);
                            if (left2 <= 0 && f >= 0.0f && SwipeLayout.this.g != null && ((i2 = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == -2 ? SwipeLayout.this.g.getRight() >= SwipeLayout.this.g.getWidth() : !(i2 == -1 ? SwipeLayout.this.g.getRight() < SwipeLayout.this.getWidth() : SwipeLayout.this.g.getRight() < layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3))) {
                                if (SwipeLayout.this.d != null) {
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused3 = SwipeLayout.this.d;
                                    return;
                                }
                                return;
                            }
                            if (left2 > 0 || f < 0.0f || layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 == -1 || SwipeLayout.this.g.getRight() <= layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) {
                                if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b != -2) {
                                    if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -1) {
                                        width = SwipeLayout.this.g.getWidth();
                                    } else {
                                        width = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                                    }
                                    float f6 = width * layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    f3 = -f6;
                                    left = SwipeLayout.this.b.getLeft() - width;
                                    if (left >= f3 && left <= f6) {
                                        if ((layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != -2 && width == SwipeLayout.this.g.getWidth()) || layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == width || (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1 && width == SwipeLayout.this.getWidth())) {
                                        }
                                        SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, (view.getLeft() - SwipeLayout.this.b.getLeft()) + width, z, true);
                                        return;
                                    }
                                }
                            } else {
                                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, SwipeLayout.this.b.getLeft() < 0 ? view.getLeft() - SwipeLayout.this.b.getLeft() : SwipeLayout.this.getWidth()), true, true);
                                return;
                            }
                        }
                    } else if (f <= 0.0f) {
                        zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, left2, f);
                        if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            return;
                        }
                    } else {
                        if (f > SwipeLayout.this.cancelAll) {
                            if (SwipeLayout.this.b.getLeft() < 0) {
                                width2 = view.getLeft() - SwipeLayout.this.b.getLeft();
                            } else {
                                width2 = SwipeLayout.this.getWidth();
                            }
                            SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentspecialinlinedviewModeldefault3(view, width2), !(SwipeLayout.this.b.getLeft() < 0), true);
                            return;
                        }
                        if (SwipeLayout.this.g == null) {
                            SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, view.getLeft() - SwipeLayout.this.b.getLeft(), false, true);
                            return;
                        }
                        layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.g);
                        if (left2 <= 0) {
                        }
                        if (left2 > 0) {
                        }
                        if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b != -2) {
                            if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -1) {
                                width = SwipeLayout.this.g.getWidth();
                            } else {
                                width = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                            }
                            float f7 = width * layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            f3 = -f7;
                            left = SwipeLayout.this.b.getLeft() - width;
                            if (left >= f3) {
                                z = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != -2 ? true : true;
                                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, (view.getLeft() - SwipeLayout.this.b.getLeft()) + width, z, true);
                                return;
                            }
                        }
                    }
                    SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, view.getLeft() - SwipeLayout.this.b.getLeft(), false, left2 > 0);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                SwipeLayout.this.b(view, i4);
                if (SwipeLayout.this.d != null) {
                    if (i4 > 0) {
                        if (SwipeLayout.this.g != null && (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this.g)) != -2 && SwipeLayout.this.g.getRight() - iTuitionPaymentFragmentspecialinlinedviewModeldefault4 > 0 && (SwipeLayout.this.g.getRight() - iTuitionPaymentFragmentspecialinlinedviewModeldefault4) - i4 <= 0) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused = SwipeLayout.this.d;
                        }
                        if (SwipeLayout.this.asInterface == null || (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this.asInterface)) == -2 || SwipeLayout.this.asInterface.getLeft() + iTuitionPaymentFragmentspecialinlinedviewModeldefault3 <= SwipeLayout.this.getWidth() || (SwipeLayout.this.asInterface.getLeft() + iTuitionPaymentFragmentspecialinlinedviewModeldefault3) - i4 > SwipeLayout.this.getWidth()) {
                            return;
                        }
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused2 = SwipeLayout.this.d;
                        return;
                    }
                    if (i4 < 0) {
                        if (SwipeLayout.this.g != null && (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this.g)) != -2 && SwipeLayout.this.g.getRight() - iTuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 0 && (SwipeLayout.this.g.getRight() - iTuitionPaymentFragmentspecialinlinedviewModeldefault2) - i4 > 0) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused3 = SwipeLayout.this.d;
                        }
                        if (SwipeLayout.this.asInterface == null || (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this.asInterface)) == -2 || SwipeLayout.this.asInterface.getLeft() + iTuitionPaymentFragmentspecialinlinedviewModeldefault1 > SwipeLayout.this.getWidth() || (SwipeLayout.this.asInterface.getLeft() + iTuitionPaymentFragmentspecialinlinedviewModeldefault1) - i4 <= SwipeLayout.this.getWidth()) {
                            return;
                        }
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused4 = SwipeLayout.this.d;
                    }
                }
            }

            private int TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view) {
                LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(view);
                if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -2) {
                    return -2;
                }
                return layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -1 ? view.getWidth() : layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
            }

            private int TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view, int i2) {
                if (SwipeLayout.this.g == null) {
                    return view == SwipeLayout.this.b ? Math.min(i2, 0) : Math.min(i2, SwipeLayout.this.getWidth());
                }
                LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.g);
                int i3 = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (i3 == -2) {
                    return Math.min(i2, view.getLeft() - SwipeLayout.this.g.getLeft());
                }
                if (i3 == -1) {
                    return Math.min(i2, (SwipeLayout.this.getWidth() + view.getLeft()) - SwipeLayout.this.g.getRight());
                }
                return Math.min(i2, (view.getLeft() - SwipeLayout.this.g.getRight()) + layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }

            private int TuitionPaymentFragmentbindingInflater1(View view, int i2) {
                if (SwipeLayout.this.asInterface == null) {
                    return view == SwipeLayout.this.b ? Math.max(i2, 0) : Math.max(i2, -view.getWidth());
                }
                LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.asInterface);
                int i3 = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (i3 == -2) {
                    return Math.max(i2, ((SwipeLayout.this.getWidth() - SwipeLayout.this.asInterface.getLeft()) + view.getLeft()) - SwipeLayout.this.asInterface.getWidth());
                }
                if (i3 == -1) {
                    return Math.max(view.getLeft() - SwipeLayout.this.asInterface.getLeft(), i2);
                }
                return Math.max(i2, ((SwipeLayout.this.getWidth() - SwipeLayout.this.asInterface.getLeft()) + view.getLeft()) - layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }

            private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view, int i2, float f) {
                int width;
                int i3;
                if ((-f) <= SwipeLayout.this.cancelAll) {
                    if (SwipeLayout.this.asInterface == null) {
                        SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, view.getLeft() - SwipeLayout.this.b.getLeft(), false, false);
                        return true;
                    }
                    LayoutParams layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SwipeLayout.this.asInterface);
                    if (i2 < 0 && f <= 0.0f && SwipeLayout.this.asInterface != null && ((i3 = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == -2 ? SwipeLayout.this.asInterface.getRight() <= SwipeLayout.this.getWidth() : !(i3 == -1 ? SwipeLayout.this.asInterface.getRight() > SwipeLayout.this.getWidth() : SwipeLayout.this.asInterface.getLeft() + layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > SwipeLayout.this.getWidth()))) {
                        if (SwipeLayout.this.d != null) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused = SwipeLayout.this.d;
                        }
                        return true;
                    }
                    if (i2 < 0 && f <= 0.0f && layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 != -1 && SwipeLayout.this.asInterface.getLeft() + layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 < SwipeLayout.this.getWidth()) {
                        SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentbindingInflater1(view, SwipeLayout.this.b.getLeft() > 0 ? view.getLeft() - SwipeLayout.this.b.getLeft() : -SwipeLayout.this.getWidth()), true, false);
                        return true;
                    }
                    if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b != -2) {
                        if (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b == -1) {
                            width = SwipeLayout.this.asInterface.getWidth();
                        } else {
                            width = layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                        }
                        float f2 = width * layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        float f3 = -f2;
                        float right = (SwipeLayout.this.b.getRight() + width) - SwipeLayout.this.getWidth();
                        if (right >= f3 && right <= f2) {
                            SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, ((view.getLeft() - SwipeLayout.this.asInterface.getLeft()) + SwipeLayout.this.getWidth()) - width, (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == -2 && width == SwipeLayout.this.asInterface.getWidth()) || layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == width || (layoutParamsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1 && width == SwipeLayout.this.getWidth()), false);
                            return true;
                        }
                    }
                    return false;
                }
                SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout.this, view, TuitionPaymentFragmentbindingInflater1(view, SwipeLayout.this.b.getLeft() > 0 ? view.getLeft() - SwipeLayout.this.b.getLeft() : -SwipeLayout.this.getWidth()), !(SwipeLayout.this.b.getLeft() > 0), false);
                return true;
            }
        };
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(context, attributeSet);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, AttributeSet attributeSet) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ViewDragHelper.create(this, 1.0f, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.cancelAll = TypedValue.applyDimension(1, 1500.0f, getResources().getDisplayMetrics());
        this.onTransact = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (typedArrayObtainStyledAttributes.hasValue(setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g)) {
                this.asBinder = typedArrayObtainStyledAttributes.getBoolean(setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g, true);
                this.f1349a = typedArrayObtainStyledAttributes.getBoolean(setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g, true);
            }
            if (typedArrayObtainStyledAttributes.hasValue(setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                this.asBinder = typedArrayObtainStyledAttributes.getBoolean(setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, true);
            }
            if (typedArrayObtainStyledAttributes.hasValue(setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f1369a)) {
                this.f1349a = typedArrayObtainStyledAttributes.getBoolean(setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f1369a, true);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setOnSwipeListener(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        this.d = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public void setOffset(int i) {
        View view = this.b;
        if (view != null) {
            b(null, i - view.getLeft());
        }
    }

    public void setSwipeEnabled(boolean z) {
        this.asBinder = z;
        this.f1349a = z;
    }

    public void setLeftSwipeEnabled(boolean z) {
        this.asBinder = z;
    }

    public void setRightSwipeEnabled(boolean z) {
        this.f1349a = z;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int iMax;
        int childCount = getChildCount();
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            measureChildren(i, i2);
            iMax = 0;
        } else {
            iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                measureChild(childAt, i, i2);
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
            }
            if (iMax > 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(iMax, BasicMeasure.EXACTLY);
                measureChildren(i, i2);
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredHeight());
            }
        }
        setMeasuredDimension(resolveSize(getSuggestedMinimumWidth(), i), resolveSize(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, int i) {
        if (i != 0) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != view) {
                    childAt.offsetLeftAndRight(i);
                    invalidate(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00b2 A[SYNTHETIC] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View key;
        View view;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (this.asBinder || this.f1349a) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.notify = 0;
                this.INotificationSideChannel = motionEvent.getX();
                this.cancel = motionEvent.getY();
            } else if (actionMasked == 1) {
                if (this.notify == 1) {
                    for (Map.Entry<View, Boolean> entry : this.TuitionPaymentFragmentbindingInflater1.entrySet()) {
                        key = entry.getKey();
                        if (key != null) {
                            key.setEnabled(entry.getValue().booleanValue());
                        }
                    }
                    this.TuitionPaymentFragmentbindingInflater1.clear();
                    requestDisallowInterceptTouchEvent(false);
                }
                this.notify = 0;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.notify == 1) {
                        while (r0.hasNext()) {
                            key = entry.getKey();
                            if (key != null) {
                                key.setEnabled(entry.getValue().booleanValue());
                            }
                        }
                        this.TuitionPaymentFragmentbindingInflater1.clear();
                        requestDisallowInterceptTouchEvent(false);
                    }
                    this.notify = 0;
                }
            } else if (this.notify == 0) {
                float fAbs = Math.abs(motionEvent.getX() - this.INotificationSideChannel);
                float fAbs2 = Math.abs(motionEvent.getY() - this.cancel);
                boolean z = motionEvent.getX() - this.INotificationSideChannel > 0.0f;
                if (((!z || this.asBinder) && (z || this.f1349a)) || ((view = this.b) != null && view.getLeft() != 0)) {
                    float f = this.onTransact;
                    if (fAbs >= f || fAbs2 >= f) {
                        int i = (fAbs2 == 0.0f || fAbs / fAbs2 > 1.0f) ? 1 : 2;
                        this.notify = i;
                        if (i == 1) {
                            requestDisallowInterceptTouchEvent(true);
                            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                                if (parent instanceof NestedScrollingParent) {
                                    View view2 = (View) parent;
                                    this.TuitionPaymentFragmentbindingInflater1.put(view2, Boolean.valueOf(view2.isEnabled()));
                                }
                            }
                            if (this.d != null) {
                                motionEvent.getX();
                            }
                        }
                    }
                }
            }
            if (motionEvent.getActionMasked() != 2 || this.notify == 1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.processTouchEvent(motionEvent);
            }
            return true;
        }
        return zOnTouchEvent;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX INFO: loaded from: classes5.dex */
    class TuitionPaymentFragmentbindingInflater1 implements Runnable {
        private final boolean TuitionPaymentFragmentbindingInflater1;
        private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final View TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentbindingInflater1(View view, boolean z, boolean z2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = view;
            this.TuitionPaymentFragmentbindingInflater1 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (SwipeLayout.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || !SwipeLayout.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.continueSettling(true)) {
                String unused = SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (!this.TuitionPaymentFragmentbindingInflater1 || SwipeLayout.this.d == null) {
                    return;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 unused2 = SwipeLayout.this.d;
                return;
            }
            ViewCompat.postOnAnimation(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this);
        }
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        private int TuitionPaymentFragmentbindingInflater1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private float TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private int b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0.9f;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -2;
            this.TuitionPaymentFragmentbindingInflater1 = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d) {
                    this.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, -1);
                } else if (index == setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = typedArrayObtainStyledAttributes.getLayoutDimension(index, -2);
                } else if (index == setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    this.TuitionPaymentFragmentbindingInflater1 = typedArrayObtainStyledAttributes.getLayoutDimension(index, -1);
                } else if (index == setDurationLimitMillis.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = typedArrayObtainStyledAttributes.getFloat(index, 0.9f);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0.9f;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -2;
            this.TuitionPaymentFragmentbindingInflater1 = -1;
        }

        public LayoutParams() {
            super(-1, -2);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0.9f;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -2;
            this.TuitionPaymentFragmentbindingInflater1 = -1;
        }
    }

    static /* synthetic */ LayoutParams TuitionPaymentFragmentspecialinlinedviewModeldefault2(View view) {
        return (LayoutParams) view.getLayoutParams();
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(SwipeLayout swipeLayout, View view, int i, boolean z, boolean z2) {
        if (swipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault2.settleCapturedViewAt(i, view.getTop())) {
            ViewCompat.postOnAnimation(view, swipeLayout.new TuitionPaymentFragmentbindingInflater1(view, z, z2));
        } else if (z) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = swipeLayout.d;
        }
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.asBinder && !this.f1349a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 0) {
            this.notify = 0;
            this.INotificationSideChannel = motionEvent.getX();
            this.cancel = motionEvent.getY();
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int left;
        int childCount = getChildCount();
        int paddingTop = getPaddingTop();
        this.b = null;
        this.g = null;
        this.asInterface = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int i6 = ((LayoutParams) childAt.getLayoutParams()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (i6 == -1) {
                    this.g = childAt;
                } else if (i6 == 0) {
                    this.b = childAt;
                } else if (i6 == 1) {
                    this.asInterface = childAt;
                }
            }
        }
        if (this.b == null) {
            throw new RuntimeException("Center view must be added");
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                int measuredWidth = childAt2.getMeasuredWidth();
                int measuredHeight = childAt2.getMeasuredHeight();
                int i8 = layoutParams.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (i8 == -1) {
                    left = this.b.getLeft() - measuredWidth;
                } else if (i8 == 1) {
                    left = this.b.getRight();
                } else {
                    left = childAt2.getLeft();
                }
                childAt2.layout(left, paddingTop, measuredWidth + left, measuredHeight + paddingTop);
            }
        }
    }
}
