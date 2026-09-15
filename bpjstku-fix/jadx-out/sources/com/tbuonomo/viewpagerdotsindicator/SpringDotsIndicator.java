package com.tbuonomo.viewpagerdotsindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.R;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;
import defpackage.MediaStoreOutputOptionsBuilder;
import defpackage.MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder;
import defpackage.ViewPortBuilder;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\fJ\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0012\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0012\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010!R\u0016\u0010\"\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001eR\u0016\u0010 \u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001eR\u0014\u0010&\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u001d\u001a\u00020.8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010/"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/SpringDotsIndicator;", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)V", "", "Landroid/view/ViewGroup;", "b", "(Z)Landroid/view/ViewGroup;", "LMediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder;", "TuitionPaymentFragmentbindingInflater1", "()LMediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()V", "setDotIndicatorColor", "", "setDotsStrokeWidth", "(F)V", "setStrokeDotsIndicatorColor", "Landroid/view/View;", "(ZLandroid/view/View;)V", "a", "F", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "I", "asInterface", "Landroidx/dynamicanimation/animation/SpringAnimation;", "g", "Landroidx/dynamicanimation/animation/SpringAnimation;", "d", "Landroid/view/View;", "onTransact", "cancel", "INotificationSideChannel", "Landroid/widget/LinearLayout;", "notify", "Landroid/widget/LinearLayout;", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "()Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpringDotsIndicator extends BaseDotsIndicator {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private float asBinder;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final float TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private float asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private View b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private SpringAnimation TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final LinearLayout d;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private int g;

    public /* synthetic */ SpringDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpringDotsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        float f = getContext().getResources().getDisplayMetrics().density * 24.0f;
        setClipToPadding(false);
        int i2 = (int) f;
        setPadding(i2, 0, i2, 0);
        linearLayout.setOrientation(0);
        addView(linearLayout, -2, -2);
        this.asInterface = getContext().getResources().getDisplayMetrics().density * 2.0f;
        Intrinsics.checkNotNullParameter(context, "");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int i3 = typedValue.data;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        this.g = i3;
        this.asBinder = 300.0f;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0.5f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.d);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = typedArrayObtainStyledAttributes.getColor(MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.INotificationSideChannel, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            int i4 = MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.getInterfaceDescriptor;
            this.g = typedArrayObtainStyledAttributes.getColor(6, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            this.asBinder = typedArrayObtainStyledAttributes.getFloat(MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.RemoteActionCompatParcelizer, this.asBinder);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = typedArrayObtainStyledAttributes.getFloat(MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.notify, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.INotificationSideChannelStubProxy;
            this.asInterface = typedArrayObtainStyledAttributes.getDimension(7, this.asInterface);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.TuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (isInEditMode()) {
            for (int i6 = 0; i6 < 5; i6++) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
            }
            addView(b(false));
        }
        BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 pager = getPager();
        if (pager == null || !pager.TuitionPaymentFragmentbindingInflater1()) {
            View view = this.b;
            if (view != null && indexOfChild(view) != -1) {
                removeView(this.b);
            }
            ViewGroup viewGroupB = b(false);
            this.b = viewGroupB;
            addView(viewGroupB);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new SpringAnimation(this.b, SpringAnimation.TRANSLATION_X);
            SpringForce springForce = new SpringForce(0.0f);
            springForce.setDampingRatio(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            springForce.setStiffness(this.asBinder);
            SpringAnimation springAnimation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNull(springAnimation);
            springAnimation.setSpring(springForce);
        }
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final int p0) {
        ViewGroup viewGroupB = b(true);
        viewGroupB.setOnClickListener(new View.OnClickListener() { // from class: MediaStoreOutputOptionsMediaStoreOutputOptionsInternal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpringDotsIndicator.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, p0, view);
            }
        });
        ArrayList<ImageView> arrayList = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        View viewFindViewById = viewGroupB.findViewById(com.bpjstku.R.id.spring_dot);
        Intrinsics.checkNotNull(viewFindViewById, "");
        arrayList.add((ImageView) viewFindViewById);
        this.d.addView(viewGroupB);
    }

    private final ViewGroup b(boolean p0) {
        float f;
        View viewInflate = LayoutInflater.from(getContext()).inflate(com.bpjstku.R.layout.spring_dot_layout, (ViewGroup) this, false);
        Intrinsics.checkNotNull(viewInflate, "");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        viewGroup.setLayoutDirection(0);
        ImageView imageView = (ImageView) viewGroup.findViewById(com.bpjstku.R.id.spring_dot);
        imageView.setBackgroundResource(p0 ? com.bpjstku.R.drawable.spring_dot_stroke_background : com.bpjstku.R.drawable.spring_dot_background);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (!p0) {
            f = this.TuitionPaymentFragmentbindingInflater1;
        } else {
            f = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        ((ViewGroup.LayoutParams) layoutParams2).height = (int) f;
        ((ViewGroup.LayoutParams) layoutParams2).width = ((ViewGroup.LayoutParams) layoutParams2).height;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) this.TuitionPaymentFragmentbindingInflater1, 0, (int) this.TuitionPaymentFragmentbindingInflater1, 0);
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        TuitionPaymentFragmentbindingInflater1(p0, imageView);
        return viewGroup;
    }

    private final void TuitionPaymentFragmentbindingInflater1(boolean p0, View p1) {
        Drawable background = p1.findViewById(com.bpjstku.R.id.spring_dot).getBackground();
        Intrinsics.checkNotNull(background, "");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (p0) {
            gradientDrawable.setStroke((int) this.asInterface, this.g);
        } else {
            gradientDrawable.setColor(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        gradientDrawable.setCornerRadius(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        LinearLayout linearLayout = this.d;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() - 1);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int p0) {
        ImageView imageView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(p0);
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        TuitionPaymentFragmentbindingInflater1(true, imageView);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder {
        @Override // defpackage.MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        }

        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // defpackage.MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return SpringDotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size();
        }

        @Override // defpackage.MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, float f) {
            float f2 = SpringDotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            float f3 = SpringDotsIndicator.this.TuitionPaymentFragmentbindingInflater1;
            ViewParent parent = SpringDotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i).getParent();
            Intrinsics.checkNotNull(parent, "");
            float left = ((ViewGroup) parent).getLeft();
            SpringAnimation springAnimation = SpringDotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (springAnimation != null) {
                springAnimation.animateToFinalPosition(left + ((f2 + (f3 * 2.0f)) * f));
            }
        }
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder TuitionPaymentFragmentbindingInflater1() {
        return new TuitionPaymentFragmentbindingInflater1();
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final BaseDotsIndicator.Type TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return BaseDotsIndicator.Type.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final void setDotIndicatorColor(int p0) {
        View view = this.b;
        if (view != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = p0;
            Intrinsics.checkNotNull(view);
            TuitionPaymentFragmentbindingInflater1(false, view);
        }
    }

    public final void setStrokeDotsIndicatorColor(int p0) {
        this.g = p0;
        for (ImageView imageView : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            TuitionPaymentFragmentbindingInflater1(true, imageView);
        }
    }

    public final void setDotsStrokeWidth(float p0) {
        this.asInterface = p0;
        for (ImageView imageView : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            TuitionPaymentFragmentbindingInflater1(true, imageView);
        }
    }

    public static /* synthetic */ void b(SpringDotsIndicator springDotsIndicator, int i, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Intrinsics.checkNotNullParameter(springDotsIndicator, "");
            if (springDotsIndicator.getDotsClickable()) {
                BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 pager = springDotsIndicator.getPager();
                if (i < (pager != null ? pager.TuitionPaymentFragmentspecialinlinedviewModeldefault1() : 0)) {
                    BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 pager2 = springDotsIndicator.getPager();
                    Intrinsics.checkNotNull(pager2);
                    pager2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
                }
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpringDotsIndicator(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpringDotsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
