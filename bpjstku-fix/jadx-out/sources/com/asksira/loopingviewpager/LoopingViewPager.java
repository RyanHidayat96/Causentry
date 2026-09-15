package com.asksira.loopingviewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import defpackage.MediaSessionCompatCallbackStubApi24;
import defpackage.MediaSessionCompatMediaSessionImplApi18;
import defpackage.ViewPortBuilder;

/* JADX INFO: loaded from: classes3.dex */
public class LoopingViewPager extends ViewPager {
    private boolean INotificationSideChannel;
    private boolean INotificationSideChannelDefault;
    public int TuitionPaymentFragmentbindingInflater1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public Handler TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f375a;
    private TuitionPaymentFragmentbindingInflater1 asBinder;
    private int asInterface;
    protected boolean b;
    private int cancel;
    private int cancelAll;
    private float d;
    private boolean g;
    private float notify;
    private int onTransact;

    /* JADX INFO: loaded from: classes4.dex */
    public interface TuitionPaymentFragmentbindingInflater1 {
    }

    static /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault1(LoopingViewPager loopingViewPager) {
        int i = loopingViewPager.asInterface;
        loopingViewPager.asInterface = i + 1;
        return i;
    }

    public LoopingViewPager(Context context) {
        super(context);
        this.f375a = true;
        this.b = false;
        this.INotificationSideChannelDefault = true;
        this.TuitionPaymentFragmentbindingInflater1 = 5000;
        this.cancelAll = 0;
        this.asInterface = 0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Handler();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Runnable() { // from class: com.asksira.loopingviewpager.LoopingViewPager.4
            @Override // java.lang.Runnable
            public final void run() {
                if (LoopingViewPager.this.getAdapter() == null || !LoopingViewPager.this.b || LoopingViewPager.this.getAdapter().getCount() < 2) {
                    return;
                }
                if (!LoopingViewPager.this.f375a && LoopingViewPager.this.getAdapter().getCount() - 1 == LoopingViewPager.this.asInterface) {
                    LoopingViewPager.this.asInterface = 0;
                } else {
                    LoopingViewPager.TuitionPaymentFragmentspecialinlinedviewModeldefault1(LoopingViewPager.this);
                }
                LoopingViewPager loopingViewPager = LoopingViewPager.this;
                loopingViewPager.setCurrentItem(loopingViewPager.asInterface, true);
            }
        };
        this.onTransact = 0;
        this.cancel = 0;
        this.INotificationSideChannel = true;
        this.g = false;
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.asksira.loopingviewpager.LoopingViewPager.3
            private float TuitionPaymentFragmentspecialinlinedviewModeldefault1;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i, float f, int i2) {
                float f2;
                float f3;
                if (LoopingViewPager.this.asBinder != null) {
                    float f4 = i;
                    if (f4 + f >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        LoopingViewPager.this.INotificationSideChannel = true;
                    } else {
                        LoopingViewPager.this.INotificationSideChannel = false;
                    }
                    if (f == 0.0f) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = f4;
                    }
                    LoopingViewPager loopingViewPager = LoopingViewPager.this;
                    int iB = loopingViewPager.b(loopingViewPager.INotificationSideChannel);
                    if (LoopingViewPager.this.cancel != 2 || Math.abs(LoopingViewPager.this.asInterface - LoopingViewPager.this.cancelAll) <= 1) {
                        if (!LoopingViewPager.this.INotificationSideChannel) {
                            f = 1.0f - f;
                        }
                    } else {
                        int iAbs = Math.abs(LoopingViewPager.this.asInterface - LoopingViewPager.this.cancelAll);
                        if (LoopingViewPager.this.INotificationSideChannel) {
                            f2 = iAbs;
                            f3 = (i - LoopingViewPager.this.cancelAll) / f2;
                        } else {
                            f2 = iAbs;
                            f3 = (LoopingViewPager.this.cancelAll - (i + 1)) / f2;
                            f = 1.0f - f;
                        }
                        f = (f / f2) + f3;
                    }
                    if (f == 0.0f || f > 1.0f) {
                        return;
                    }
                    if (LoopingViewPager.this.g) {
                        if (LoopingViewPager.this.cancel == 1) {
                            TuitionPaymentFragmentbindingInflater1 unused = LoopingViewPager.this.asBinder;
                            return;
                        }
                        return;
                    }
                    if (LoopingViewPager.this.cancel == 1) {
                        if (LoopingViewPager.this.INotificationSideChannel && Math.abs(iB - LoopingViewPager.this.asInterface) == 2) {
                            return;
                        }
                        if (!LoopingViewPager.this.INotificationSideChannel && iB == LoopingViewPager.this.asInterface) {
                            return;
                        }
                    }
                    TuitionPaymentFragmentbindingInflater1 unused2 = LoopingViewPager.this.asBinder;
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i) {
                ViewPortBuilder.asInterface();
                try {
                    LoopingViewPager loopingViewPager = LoopingViewPager.this;
                    loopingViewPager.cancelAll = loopingViewPager.asInterface;
                    LoopingViewPager.this.asInterface = i;
                    if (LoopingViewPager.this.asBinder != null) {
                        TuitionPaymentFragmentbindingInflater1 unused = LoopingViewPager.this.asBinder;
                        LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                    if (LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.removeCallbacks(LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.postDelayed(LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, LoopingViewPager.this.TuitionPaymentFragmentbindingInflater1);
                    }
                } finally {
                    ViewPortBuilder.d();
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int i) {
                int count;
                if (!LoopingViewPager.this.g && LoopingViewPager.this.cancel == 2 && i == 1 && LoopingViewPager.this.asBinder != null) {
                    TuitionPaymentFragmentbindingInflater1 unused = LoopingViewPager.this.asBinder;
                    LoopingViewPager loopingViewPager = LoopingViewPager.this;
                    loopingViewPager.b(loopingViewPager.INotificationSideChannel);
                }
                LoopingViewPager loopingViewPager2 = LoopingViewPager.this;
                loopingViewPager2.onTransact = loopingViewPager2.cancel;
                LoopingViewPager.this.cancel = i;
                if (i == 0) {
                    if (LoopingViewPager.this.f375a) {
                        if (LoopingViewPager.this.getAdapter() == null || (count = LoopingViewPager.this.getAdapter().getCount()) < 2) {
                            return;
                        }
                        int currentItem = LoopingViewPager.this.getCurrentItem();
                        if (currentItem == 0) {
                            LoopingViewPager.this.setCurrentItem(count - 2, false);
                        } else if (currentItem == count - 1) {
                            LoopingViewPager.this.setCurrentItem(1, false);
                        }
                    }
                    if (LoopingViewPager.this.asBinder != null) {
                        TuitionPaymentFragmentbindingInflater1 unused2 = LoopingViewPager.this.asBinder;
                        LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                }
            }
        });
        if (this.f375a) {
            setCurrentItem(1, false);
        }
    }

    public LoopingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f375a = true;
        this.b = false;
        this.INotificationSideChannelDefault = true;
        this.TuitionPaymentFragmentbindingInflater1 = 5000;
        this.cancelAll = 0;
        this.asInterface = 0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Handler();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Runnable() { // from class: com.asksira.loopingviewpager.LoopingViewPager.4
            @Override // java.lang.Runnable
            public final void run() {
                if (LoopingViewPager.this.getAdapter() == null || !LoopingViewPager.this.b || LoopingViewPager.this.getAdapter().getCount() < 2) {
                    return;
                }
                if (!LoopingViewPager.this.f375a && LoopingViewPager.this.getAdapter().getCount() - 1 == LoopingViewPager.this.asInterface) {
                    LoopingViewPager.this.asInterface = 0;
                } else {
                    LoopingViewPager.TuitionPaymentFragmentspecialinlinedviewModeldefault1(LoopingViewPager.this);
                }
                LoopingViewPager loopingViewPager = LoopingViewPager.this;
                loopingViewPager.setCurrentItem(loopingViewPager.asInterface, true);
            }
        };
        this.onTransact = 0;
        this.cancel = 0;
        this.INotificationSideChannel = true;
        this.g = false;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, MediaSessionCompatMediaSessionImplApi18.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, 0, 0);
        try {
            this.f375a = typedArrayObtainStyledAttributes.getBoolean(MediaSessionCompatMediaSessionImplApi18.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b, false);
            this.b = typedArrayObtainStyledAttributes.getBoolean(MediaSessionCompatMediaSessionImplApi18.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, false);
            this.INotificationSideChannelDefault = typedArrayObtainStyledAttributes.getBoolean(MediaSessionCompatMediaSessionImplApi18.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface, true);
            this.TuitionPaymentFragmentbindingInflater1 = typedArrayObtainStyledAttributes.getInt(MediaSessionCompatMediaSessionImplApi18.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, 5000);
            this.d = typedArrayObtainStyledAttributes.getFloat(MediaSessionCompatMediaSessionImplApi18.TuitionPaymentFragmentspecialinlinedviewModeldefault2.f180a, 0.0f);
            this.notify = typedArrayObtainStyledAttributes.getFloat(MediaSessionCompatMediaSessionImplApi18.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 0.0f);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b;
            typedArrayObtainStyledAttributes.recycle();
            addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.asksira.loopingviewpager.LoopingViewPager.3
                private float TuitionPaymentFragmentspecialinlinedviewModeldefault1;

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public final void onPageScrolled(int i, float f, int i2) {
                    float f2;
                    float f3;
                    if (LoopingViewPager.this.asBinder != null) {
                        float f4 = i;
                        if (f4 + f >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            LoopingViewPager.this.INotificationSideChannel = true;
                        } else {
                            LoopingViewPager.this.INotificationSideChannel = false;
                        }
                        if (f == 0.0f) {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = f4;
                        }
                        LoopingViewPager loopingViewPager = LoopingViewPager.this;
                        int iB = loopingViewPager.b(loopingViewPager.INotificationSideChannel);
                        if (LoopingViewPager.this.cancel != 2 || Math.abs(LoopingViewPager.this.asInterface - LoopingViewPager.this.cancelAll) <= 1) {
                            if (!LoopingViewPager.this.INotificationSideChannel) {
                                f = 1.0f - f;
                            }
                        } else {
                            int iAbs = Math.abs(LoopingViewPager.this.asInterface - LoopingViewPager.this.cancelAll);
                            if (LoopingViewPager.this.INotificationSideChannel) {
                                f2 = iAbs;
                                f3 = (i - LoopingViewPager.this.cancelAll) / f2;
                            } else {
                                f2 = iAbs;
                                f3 = (LoopingViewPager.this.cancelAll - (i + 1)) / f2;
                                f = 1.0f - f;
                            }
                            f = (f / f2) + f3;
                        }
                        if (f == 0.0f || f > 1.0f) {
                            return;
                        }
                        if (LoopingViewPager.this.g) {
                            if (LoopingViewPager.this.cancel == 1) {
                                TuitionPaymentFragmentbindingInflater1 unused = LoopingViewPager.this.asBinder;
                                return;
                            }
                            return;
                        }
                        if (LoopingViewPager.this.cancel == 1) {
                            if (LoopingViewPager.this.INotificationSideChannel && Math.abs(iB - LoopingViewPager.this.asInterface) == 2) {
                                return;
                            }
                            if (!LoopingViewPager.this.INotificationSideChannel && iB == LoopingViewPager.this.asInterface) {
                                return;
                            }
                        }
                        TuitionPaymentFragmentbindingInflater1 unused2 = LoopingViewPager.this.asBinder;
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public final void onPageSelected(int i) {
                    ViewPortBuilder.asInterface();
                    try {
                        LoopingViewPager loopingViewPager = LoopingViewPager.this;
                        loopingViewPager.cancelAll = loopingViewPager.asInterface;
                        LoopingViewPager.this.asInterface = i;
                        if (LoopingViewPager.this.asBinder != null) {
                            TuitionPaymentFragmentbindingInflater1 unused = LoopingViewPager.this.asBinder;
                            LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        }
                        if (LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.removeCallbacks(LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.postDelayed(LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, LoopingViewPager.this.TuitionPaymentFragmentbindingInflater1);
                        }
                    } finally {
                        ViewPortBuilder.d();
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public final void onPageScrollStateChanged(int i) {
                    int count;
                    if (!LoopingViewPager.this.g && LoopingViewPager.this.cancel == 2 && i == 1 && LoopingViewPager.this.asBinder != null) {
                        TuitionPaymentFragmentbindingInflater1 unused = LoopingViewPager.this.asBinder;
                        LoopingViewPager loopingViewPager = LoopingViewPager.this;
                        loopingViewPager.b(loopingViewPager.INotificationSideChannel);
                    }
                    LoopingViewPager loopingViewPager2 = LoopingViewPager.this;
                    loopingViewPager2.onTransact = loopingViewPager2.cancel;
                    LoopingViewPager.this.cancel = i;
                    if (i == 0) {
                        if (LoopingViewPager.this.f375a) {
                            if (LoopingViewPager.this.getAdapter() == null || (count = LoopingViewPager.this.getAdapter().getCount()) < 2) {
                                return;
                            }
                            int currentItem = LoopingViewPager.this.getCurrentItem();
                            if (currentItem == 0) {
                                LoopingViewPager.this.setCurrentItem(count - 2, false);
                            } else if (currentItem == count - 1) {
                                LoopingViewPager.this.setCurrentItem(1, false);
                            }
                        }
                        if (LoopingViewPager.this.asBinder != null) {
                            TuitionPaymentFragmentbindingInflater1 unused2 = LoopingViewPager.this.asBinder;
                            LoopingViewPager.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        }
                    }
                }
            });
            if (this.f375a) {
                setCurrentItem(1, false);
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        int mode;
        int size = View.MeasureSpec.getSize(i);
        if (this.d > 0.0f) {
            int iRound = Math.round(View.MeasureSpec.getSize(i) / this.d);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound, BasicMeasure.EXACTLY);
            float f = this.notify;
            if (f > 0.0f && f != this.d) {
                super.onMeasure(i, i2);
                int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), BasicMeasure.EXACTLY);
                int i3 = 0;
                while (i3 < getChildCount()) {
                    View childAt = getChildAt(i3);
                    childAt.measure(iMakeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight <= 0 || measuredHeight <= iRound) {
                        i3++;
                    } else {
                        int iRound2 = (int) Math.round((((double) size) - Math.floor(iRound * (measuredWidth / measuredHeight))) / 2.0d);
                        setPadding(iRound2, getPaddingTop(), iRound2, getPaddingBottom());
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), BasicMeasure.EXACTLY);
                        childAt.measure(iMakeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(0, 0));
                    }
                }
            }
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
            return;
        }
        if (this.INotificationSideChannelDefault && ((mode = View.MeasureSpec.getMode(i2)) == 0 || mode == Integer.MIN_VALUE)) {
            super.onMeasure(i, i2);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), BasicMeasure.EXACTLY);
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt2 = getChildAt(i5);
                childAt2.measure(iMakeMeasureSpec4, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight2 = childAt2.getMeasuredHeight();
                if (measuredHeight2 > i4) {
                    i4 = measuredHeight2;
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i4 + getPaddingTop() + getPaddingBottom(), BasicMeasure.EXACTLY);
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        super.setAdapter(pagerAdapter);
        if (this.f375a) {
            setCurrentItem(1, false);
        }
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (!this.f375a) {
            return this.asInterface;
        }
        if (!(getAdapter() instanceof MediaSessionCompatCallbackStubApi24)) {
            return this.asInterface;
        }
        int i = this.asInterface;
        if (i == 0) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((MediaSessionCompatCallbackStubApi24) getAdapter()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } else {
            if (i == ((MediaSessionCompatCallbackStubApi24) getAdapter()).b() + 1) {
                return 0;
            }
            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.asInterface;
        }
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1;
    }

    public final int b(boolean z) {
        int i = this.cancel;
        if (i == 2 || i == 0 || (this.onTransact == 2 && i == 1)) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        int i2 = z ? 1 : -1;
        if (this.f375a) {
            if (!(getAdapter() instanceof MediaSessionCompatCallbackStubApi24)) {
                return this.asInterface + i2;
            }
            int i3 = this.asInterface;
            if (i3 == 1 && !z) {
                return ((MediaSessionCompatCallbackStubApi24) getAdapter()).b() - 1;
            }
            if (i3 == ((MediaSessionCompatCallbackStubApi24) getAdapter()).b() && z) {
                return 0;
            }
            return (this.asInterface + i2) - 1;
        }
        return this.asInterface + i2;
    }

    public void setIndicatorSmart(boolean z) {
        this.g = z;
    }

    public void setIndicatorPageChangeListener(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        this.asBinder = tuitionPaymentFragmentbindingInflater1;
    }

    public void setInterval(int i) {
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.removeCallbacks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.postDelayed(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1);
    }
}
