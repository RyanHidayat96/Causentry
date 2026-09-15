package com.kennyc.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.findNearestHigherFor;
import defpackage.getMaxSize$WhenMappings;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0003>\u001c?B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u000fJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0010J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0011J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0018\u0010\rJ\u0019\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0019H\u0002¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00192\b\b\u0002\u0010\u0007\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(J'\u0010'\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00192\b\b\u0002\u0010\u0007\u001a\u00020\u0013¢\u0006\u0004\b'\u0010)R\"\u0010*\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u00100R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0018\u0010%\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u00100R$\u00103\u001a\u0004\u0018\u0001028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u00100R*\u00109\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00198\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010&"}, d2 = {"Lcom/kennyc/view/MultiStateView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "", "addView", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;I)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;II)V", "", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "p3", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "b", "Lcom/kennyc/view/MultiStateView$ViewState;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/kennyc/view/MultiStateView$ViewState;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/view/View;)Z", "onAttachedToWindow", "()V", "Landroid/os/Parcelable;", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onSaveInstanceState", "()Landroid/os/Parcelable;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/kennyc/view/MultiStateView$ViewState;)V", "setViewForState", "(Landroid/view/View;Lcom/kennyc/view/MultiStateView$ViewState;Z)V", "(ILcom/kennyc/view/MultiStateView$ViewState;Z)V", "animateLayoutChanges", "Z", "getAnimateLayoutChanges", "()Z", "setAnimateLayoutChanges", "(Z)V", "Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/kennyc/view/MultiStateView$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kennyc/view/MultiStateView$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "getListener", "()Lcom/kennyc/view/MultiStateView$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "setListener", "(Lcom/kennyc/view/MultiStateView$TuitionPaymentFragmentspecialinlinedviewModeldefault1;)V", "viewState", "Lcom/kennyc/view/MultiStateView$ViewState;", "getViewState", "()Lcom/kennyc/view/MultiStateView$ViewState;", "setViewState", "SavedState", "ViewState"}, k = 1, mv = {2, 3, 0})
public final class MultiStateView extends FrameLayout {
    private View TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private View TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private View TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private View TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean animateLayoutChanges;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault1 listener;
    private ViewState viewState;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/kennyc/view/MultiStateView$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", ""}, k = 1, mv = {2, 3, 0})
    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/kennyc/view/MultiStateView$ViewState;", "", "<init>", "(Ljava/lang/String;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 3, 0})
    public enum ViewState {
        CONTENT,
        LOADING,
        ERROR,
        EMPTY
    }

    public MultiStateView(Context context, AttributeSet attributeSet, int i) {
        ViewState viewState;
        super(context, attributeSet, i);
        this.viewState = ViewState.CONTENT;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, findNearestHigherFor.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(findNearestHigherFor.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, -1);
        if (resourceId >= 0) {
            View viewInflate = layoutInflaterFrom.inflate(resourceId, (ViewGroup) this, false);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = viewInflate;
            Intrinsics.checkExpressionValueIsNotNull(viewInflate, "");
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            Intrinsics.checkExpressionValueIsNotNull(layoutParams, "");
            addView(viewInflate, layoutParams);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(findNearestHigherFor.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b, -1);
        if (resourceId2 >= 0) {
            View viewInflate2 = layoutInflaterFrom.inflate(resourceId2, (ViewGroup) this, false);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = viewInflate2;
            Intrinsics.checkExpressionValueIsNotNull(viewInflate2, "");
            ViewGroup.LayoutParams layoutParams2 = viewInflate2.getLayoutParams();
            Intrinsics.checkExpressionValueIsNotNull(layoutParams2, "");
            addView(viewInflate2, layoutParams2);
        }
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(findNearestHigherFor.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1, -1);
        if (resourceId3 >= 0) {
            View viewInflate3 = layoutInflaterFrom.inflate(resourceId3, (ViewGroup) this, false);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = viewInflate3;
            Intrinsics.checkExpressionValueIsNotNull(viewInflate3, "");
            ViewGroup.LayoutParams layoutParams3 = viewInflate3.getLayoutParams();
            Intrinsics.checkExpressionValueIsNotNull(layoutParams3, "");
            addView(viewInflate3, layoutParams3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(findNearestHigherFor.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d, 0);
        if (i2 == 1) {
            viewState = ViewState.ERROR;
        } else if (i2 == 2) {
            viewState = ViewState.EMPTY;
        } else if (i2 == 3) {
            viewState = ViewState.LOADING;
        } else {
            viewState = ViewState.CONTENT;
        }
        setViewState(viewState);
        this.animateLayoutChanges = typedArrayObtainStyledAttributes.getBoolean(findNearestHigherFor.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ MultiStateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 getListener() {
        return this.listener;
    }

    public final void setListener(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        this.listener = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final boolean getAnimateLayoutChanges() {
        return this.animateLayoutChanges;
    }

    public final void setAnimateLayoutChanges(boolean z) {
        this.animateLayoutChanges = z;
    }

    public final ViewState getViewState() {
        return this.viewState;
    }

    public final void setViewState(ViewState viewState) {
        ViewState viewState2 = this.viewState;
        if (viewState != viewState2) {
            this.viewState = viewState;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewState2);
        }
    }

    public final View TuitionPaymentFragmentbindingInflater1(ViewState p0) {
        int i = getMaxSize$WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == 1) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        if (i == 2) {
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        if (i == 3) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        if (i == 4) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void setViewForState$default(MultiStateView multiStateView, View view, ViewState viewState, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        multiStateView.setViewForState(view, viewState, z);
    }

    public final void setViewForState(View p0, ViewState p1, boolean p2) {
        int i = getMaxSize$WhenMappings.$EnumSwitchMapping$1[p1.ordinal()];
        if (i == 1) {
            View view = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (view != null) {
                removeView(view);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = p0;
            addView(p0);
        } else if (i == 2) {
            View view2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (view2 != null) {
                removeView(view2);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0;
            addView(p0);
        } else if (i == 3) {
            View view3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (view3 != null) {
                removeView(view3);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = p0;
            addView(p0);
        } else if (i == 4) {
            View view4 = this.TuitionPaymentFragmentbindingInflater1;
            if (view4 != null) {
                removeView(view4);
            }
            this.TuitionPaymentFragmentbindingInflater1 = p0;
            addView(p0);
        }
        if (p2) {
            setViewState(p1);
        }
    }

    public static /* synthetic */ void setViewForState$default(MultiStateView multiStateView, int i, ViewState viewState, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        multiStateView.setViewForState(i, viewState, z);
    }

    public final void setViewForState(int p0, ViewState p1, boolean p2) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(p0, (ViewGroup) this, false);
        Intrinsics.checkExpressionValueIsNotNull(viewInflate, "");
        setViewForState(viewInflate, p1, p2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            throw new IllegalArgumentException("Content view is not defined");
        }
        if (getMaxSize$WhenMappings.$EnumSwitchMapping$2[this.viewState.ordinal()] == 1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewState.CONTENT);
            return;
        }
        View view = this.TuitionPaymentFragmentbindingInflater1;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        return parcelableOnSaveInstanceState == null ? parcelableOnSaveInstanceState : new SavedState(parcelableOnSaveInstanceState, this.viewState);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable p0) {
        if (p0 instanceof SavedState) {
            SavedState savedState = (SavedState) p0;
            super.onRestoreInstanceState(savedState.getSuperState());
            setViewState(savedState.TuitionPaymentFragmentbindingInflater1);
            return;
        }
        super.onRestoreInstanceState(p0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View p0) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0)) {
            this.TuitionPaymentFragmentbindingInflater1 = p0;
        }
        super.addView(p0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View p0, int p1) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0)) {
            this.TuitionPaymentFragmentbindingInflater1 = p0;
        }
        super.addView(p0, p1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View p0, int p1, ViewGroup.LayoutParams p2) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0)) {
            this.TuitionPaymentFragmentbindingInflater1 = p0;
        }
        super.addView(p0, p1, p2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View p0, ViewGroup.LayoutParams p1) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0)) {
            this.TuitionPaymentFragmentbindingInflater1 = p0;
        }
        super.addView(p0, p1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View p0, int p1, int p2) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0)) {
            this.TuitionPaymentFragmentbindingInflater1 = p0;
        }
        super.addView(p0, p1, p2);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View p0, int p1, ViewGroup.LayoutParams p2) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0)) {
            this.TuitionPaymentFragmentbindingInflater1 = p0;
        }
        return super.addViewInLayout(p0, p1, p2);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View p0, int p1, ViewGroup.LayoutParams p2, boolean p3) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0)) {
            this.TuitionPaymentFragmentbindingInflater1 = p0;
        }
        return super.addViewInLayout(p0, p1, p2, p3);
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(View p0) {
        View view = this.TuitionPaymentFragmentbindingInflater1;
        return ((view != null && view != p0) || Intrinsics.areEqual(p0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || Intrinsics.areEqual(p0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) || Intrinsics.areEqual(p0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) ? false : true;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewState p0) {
        int i = getMaxSize$WhenMappings.$EnumSwitchMapping$3[this.viewState.ordinal()];
        if (i == 1) {
            View view = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (view == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            View view2 = this.TuitionPaymentFragmentbindingInflater1;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            View view4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            if (this.animateLayoutChanges) {
                b(TuitionPaymentFragmentbindingInflater1(p0));
                return;
            } else {
                view.setVisibility(0);
                return;
            }
        }
        if (i == 2) {
            View view5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (view5 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            View view6 = this.TuitionPaymentFragmentbindingInflater1;
            if (view6 != null) {
                view6.setVisibility(8);
            }
            View view7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (view7 != null) {
                view7.setVisibility(8);
            }
            View view8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (view8 != null) {
                view8.setVisibility(8);
            }
            if (this.animateLayoutChanges) {
                b(TuitionPaymentFragmentbindingInflater1(p0));
                return;
            } else {
                view5.setVisibility(0);
                return;
            }
        }
        if (i == 3) {
            View view9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (view9 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            View view10 = this.TuitionPaymentFragmentbindingInflater1;
            if (view10 != null) {
                view10.setVisibility(8);
            }
            View view11 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (view11 != null) {
                view11.setVisibility(8);
            }
            View view12 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (view12 != null) {
                view12.setVisibility(8);
            }
            if (this.animateLayoutChanges) {
                b(TuitionPaymentFragmentbindingInflater1(p0));
                return;
            } else {
                view9.setVisibility(0);
                return;
            }
        }
        if (i != 4) {
            return;
        }
        View view13 = this.TuitionPaymentFragmentbindingInflater1;
        if (view13 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        View view14 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (view14 != null) {
            view14.setVisibility(8);
        }
        View view15 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (view15 != null) {
            view15.setVisibility(8);
        }
        View view16 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (view16 != null) {
            view16.setVisibility(8);
        }
        if (this.animateLayoutChanges) {
            b(TuitionPaymentFragmentbindingInflater1(p0));
        } else {
            view13.setVisibility(0);
        }
    }

    private final void b(View p0) {
        if (p0 == null) {
            View viewTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(this.viewState);
            if (viewTuitionPaymentFragmentbindingInflater1 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            viewTuitionPaymentFragmentbindingInflater1.setVisibility(0);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(p0, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0));
        objectAnimatorOfFloat.start();
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends AnimatorListenerAdapter {
        private /* synthetic */ View TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(View view) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setVisibility(8);
            MultiStateView multiStateView = MultiStateView.this;
            View viewTuitionPaymentFragmentbindingInflater1 = multiStateView.TuitionPaymentFragmentbindingInflater1(multiStateView.getViewState());
            if (viewTuitionPaymentFragmentbindingInflater1 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            viewTuitionPaymentFragmentbindingInflater1.setVisibility(0);
            ObjectAnimator.ofFloat(viewTuitionPaymentFragmentbindingInflater1, "alpha", 0.0f, 1.0f).setDuration(250L).start();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/kennyc/view/MultiStateView$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "p0", "Lcom/kennyc/view/MultiStateView$ViewState;", "p1", "<init>", "(Landroid/os/Parcelable;Lcom/kennyc/view/MultiStateView$ViewState;)V", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/kennyc/view/MultiStateView$ViewState;", "TuitionPaymentFragmentbindingInflater1", "b"}, k = 1, mv = {2, 3, 0})
    static final class SavedState extends View.BaseSavedState {

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        final ViewState TuitionPaymentFragmentbindingInflater1;
        public static final Parcelable.Creator<SavedState> CREATOR = new TuitionPaymentFragmentbindingInflater1();

        public SavedState(Parcelable parcelable, ViewState viewState) {
            super(parcelable);
            this.TuitionPaymentFragmentbindingInflater1 = viewState;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            Serializable serializable = parcel.readSerializable();
            if (serializable == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kennyc.view.MultiStateView.ViewState");
            }
            this.TuitionPaymentFragmentbindingInflater1 = (ViewState) serializable;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            super.writeToParcel(p0, p1);
            p0.writeSerializable(this.TuitionPaymentFragmentbindingInflater1);
        }

        public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<SavedState> {
            TuitionPaymentFragmentbindingInflater1() {
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }
    }

    public MultiStateView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MultiStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }
}
