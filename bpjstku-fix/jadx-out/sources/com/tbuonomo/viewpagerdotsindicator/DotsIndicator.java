package com.tbuonomo.viewpagerdotsindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bpjstku.R;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import defpackage.MediaSpecOutputFormat;
import defpackage.MediaStoreOutputOptions;
import defpackage.MediaStoreOutputOptionsBuilder;
import defpackage.MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder;
import defpackage.ViewPortBuilder;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR*\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\fR\u0014\u0010\u0017\u001a\u00020&8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010'"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/DotsIndicator;", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)V", "LMediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder;", "TuitionPaymentFragmentbindingInflater1", "()LMediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()V", "setSelectedPointColor", "Landroid/animation/ArgbEvaluator;", "b", "Landroid/animation/ArgbEvaluator;", "", "asBinder", "F", "asInterface", "Landroid/widget/LinearLayout;", "g", "Landroid/widget/LinearLayout;", "", "a", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "selectedDotColor", "I", "getSelectedDotColor", "()I", "setSelectedDotColor", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "()Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3_"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DotsIndicator extends BaseDotsIndicator {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private float TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private float TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final ArgbEvaluator b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private LinearLayout TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int selectedDotColor;

    public /* synthetic */ DotsIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.b = new ArgbEvaluator();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            linearLayout2 = null;
        }
        addView(linearLayout2, -2, -2);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2.5f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.b);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            setSelectedDotColor(typedArrayObtainStyledAttributes.getColor(MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.asBinder, -16711681));
            float f = typedArrayObtainStyledAttributes.getFloat(MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.g, 2.5f);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = f;
            if (f < 1.0f) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1.0f;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = typedArrayObtainStyledAttributes.getBoolean(MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.asInterface, false);
            this.TuitionPaymentFragmentbindingInflater1 = typedArrayObtainStyledAttributes.getDimension(MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            for (int i2 = 0; i2 < 5; i2++) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2);
            }
            if (this.pager != null) {
                post(new MediaSpecOutputFormat(this));
            }
        }
    }

    public final int getSelectedDotColor() {
        return this.selectedDotColor;
    }

    public final void setSelectedDotColor(int i) {
        this.selectedDotColor = i;
        b();
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final int p0) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.dot_layout, (ViewGroup) this, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.dot);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        viewInflate.setLayoutDirection(0);
        ((ViewGroup.LayoutParams) layoutParams2).height = (int) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ((ViewGroup.LayoutParams) layoutParams2).width = ((ViewGroup.LayoutParams) layoutParams2).height;
        layoutParams2.setMargins((int) this.TuitionPaymentFragmentbindingInflater1, 0, (int) this.TuitionPaymentFragmentbindingInflater1, 0);
        MediaStoreOutputOptions mediaStoreOutputOptions = new MediaStoreOutputOptions();
        mediaStoreOutputOptions.setCornerRadius(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        if (isInEditMode()) {
            mediaStoreOutputOptions.setColor(p0 == 0 ? this.selectedDotColor : getDotsColor());
        } else {
            BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 pager = getPager();
            Intrinsics.checkNotNull(pager);
            mediaStoreOutputOptions.setColor(pager.TuitionPaymentFragmentspecialinlinedviewModeldefault2() == p0 ? this.selectedDotColor : getDotsColor());
        }
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        ImageView imageView2 = imageView;
        Intrinsics.checkNotNullParameter(imageView2, "");
        imageView2.setBackground(mediaStoreOutputOptions);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: OutputOptions
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, p0, view);
            }
        });
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        int i = (int) (this.TuitionPaymentFragmentbindingInflater1 * 0.8f);
        Intrinsics.checkNotNullParameter(viewInflate, "");
        viewInflate.setPadding(i, viewInflate.getPaddingTop(), i, viewInflate.getPaddingBottom());
        int i2 = (int) (this.TuitionPaymentFragmentbindingInflater1 * 2.0f);
        Intrinsics.checkNotNullParameter(viewInflate, "");
        viewInflate.setPadding(viewInflate.getPaddingLeft(), i2, viewInflate.getPaddingRight(), i2);
        imageView.setElevation(this.TuitionPaymentFragmentbindingInflater1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(imageView);
        LinearLayout linearLayout = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            linearLayout = null;
        }
        linearLayout.addView(viewInflate);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        LinearLayout linearLayout = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            linearLayout = null;
        }
        LinearLayout linearLayout3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            linearLayout2 = linearLayout3;
        }
        linearLayout.removeViewAt(linearLayout2.getChildCount() - 1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() - 1);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder {
        private static final byte[] $$c = {1, 115, -83, 116};
        private static final int $$d = 41;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {38, 31, -70, -1, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 99;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static int b = -83722405;

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 1
                int r8 = 145 - r8
                int r7 = r7 * 14
                int r7 = 98 - r7
                byte[] r0 = com.tbuonomo.viewpagerdotsindicator.DotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r6
                r5 = r2
                goto L24
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r6) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L22:
                r3 = r0[r8]
            L24:
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-11)
                int r8 = r8 + 1
                r3 = r5
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tbuonomo.viewpagerdotsindicator.DotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault2.c(byte, int, int, java.lang.Object[]):void");
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        /* JADX WARN: Code duplicated, block: B:40:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:41:0x01c6  */
        private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            char c;
            int i4;
            Throwable cause;
            int i5 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (true) {
                c = '0';
                i4 = 29209604;
                if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                    break;
                }
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iIndexOf = 3291 - TextUtils.indexOf("", "", 0);
                        int mirror = AndroidCharacter.getMirror('0') - 17;
                        byte b2 = (byte) ($$c[0] - 1);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, iIndexOf, mirror, 1199271174, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char defaultSize = (char) View.getDefaultSize(0, 0);
                        int i7 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 44;
                        byte b4 = $$c[0];
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, i7, tapTimeout, -450685997, false, $$e(b5, b5, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i3 > 0) {
                int i8 = $10 + 33;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i10 = $11 + 43;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * i2];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "");
                            int mirror2 = AndroidCharacter.getMirror(c) + 603;
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 44;
                            byte b6 = $$c[0];
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, mirror2, jumpTapTimeout, -450685997, false, $$e(b7, b7, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                            int iAlpha = 651 - Color.alpha(0);
                            int i11 = 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte b8 = $$c[0];
                            byte b9 = (byte) (b8 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, iAlpha, i11, -450685997, false, $$e(b9, b9, b8), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    c = '0';
                    i4 = 29209604;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
            int i12 = $10 + 115;
            $11 = i12 % 128;
            int i13 = i12 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0143  */
        /* JADX WARN: Code duplicated, block: B:21:0x014d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0159  */
        /* JADX WARN: Code duplicated, block: B:26:0x0164  */
        @Override // defpackage.MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, float f) {
            int i3;
            int i4 = 2 % 2;
            ImageView imageView = DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i);
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            ImageView imageView2 = imageView;
            int i5 = (int) (DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + (DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * (DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1.0f) * (1.0f - f)));
            ImageView imageView3 = imageView2;
            Intrinsics.checkNotNullParameter(imageView3, "");
            imageView3.getLayoutParams().width = i5;
            imageView3.requestLayout();
            ArrayList<ImageView> arrayList = DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(arrayList, "");
            if (i2 >= 0) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                if (i6 % 2 != 0) {
                    arrayList.size();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (i2 < arrayList.size()) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
                    int i8 = i7 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i8;
                    int i9 = i7 % 2;
                    int i10 = i8 + 71;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                    int i11 = i10 % 2;
                    ImageView imageView4 = DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i2);
                    Intrinsics.checkNotNullExpressionValue(imageView4, "");
                    ImageView imageView5 = imageView4;
                    int i12 = (int) (DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + (DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * (DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1.0f) * f));
                    ImageView imageView6 = imageView5;
                    Intrinsics.checkNotNullParameter(imageView6, "");
                    imageView6.getLayoutParams().width = i12;
                    imageView6.requestLayout();
                    Drawable background = imageView2.getBackground();
                    Intrinsics.checkNotNull(background, "");
                    MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) background;
                    Drawable background2 = imageView5.getBackground();
                    Intrinsics.checkNotNull(background2, "");
                    MediaStoreOutputOptions mediaStoreOutputOptions2 = (MediaStoreOutputOptions) background2;
                    if (DotsIndicator.this.getSelectedDotColor() != DotsIndicator.this.getDotsColor()) {
                        int i13 = TuitionPaymentFragmentbindingInflater1 + 27;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                        int i14 = i13 % 2;
                        Object objEvaluate = DotsIndicator.this.b.evaluate(f, Integer.valueOf(DotsIndicator.this.getSelectedDotColor()), Integer.valueOf(DotsIndicator.this.getDotsColor()));
                        Intrinsics.checkNotNull(objEvaluate, "");
                        int iIntValue = ((Integer) objEvaluate).intValue();
                        Object objEvaluate2 = DotsIndicator.this.b.evaluate(f, Integer.valueOf(DotsIndicator.this.getDotsColor()), Integer.valueOf(DotsIndicator.this.getSelectedDotColor()));
                        Intrinsics.checkNotNull(objEvaluate2, "");
                        mediaStoreOutputOptions2.setColor(((Integer) objEvaluate2).intValue());
                        if (!DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            mediaStoreOutputOptions.setColor(iIntValue);
                        } else {
                            int i15 = TuitionPaymentFragmentbindingInflater1 + 101;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                            if (i15 % 2 == 0) {
                                BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 pager = DotsIndicator.this.getPager();
                                Intrinsics.checkNotNull(pager);
                                int i16 = 13 / 0;
                                if (i <= pager.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                    mediaStoreOutputOptions.setColor(DotsIndicator.this.getSelectedDotColor());
                                } else {
                                    mediaStoreOutputOptions.setColor(iIntValue);
                                }
                            } else {
                                BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 pager2 = DotsIndicator.this.getPager();
                                Intrinsics.checkNotNull(pager2);
                                if (i <= pager2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                    mediaStoreOutputOptions.setColor(DotsIndicator.this.getSelectedDotColor());
                                } else {
                                    mediaStoreOutputOptions.setColor(iIntValue);
                                }
                            }
                        }
                    }
                } else {
                    i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                    TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i17 = 2 / 3;
                    }
                }
            } else {
                i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i18 = 2 / 3;
                }
            }
            DotsIndicator.this.invalidate();
        }

        @Override // defpackage.MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentbindingInflater1 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            ImageView imageView = DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i);
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            ImageView imageView2 = imageView;
            int i5 = (int) DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNullParameter(imageView2, "");
            imageView2.getLayoutParams().width = i5;
            imageView2.requestLayout();
            DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
            int i6 = TuitionPaymentFragmentbindingInflater1 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // defpackage.MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            int size = DotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size();
            if (i3 != 0) {
                int i4 = 12 / 0;
            }
            return size;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0511  */
        /* JADX WARN: Code duplicated, block: B:39:0x0517  */
        /* JADX WARN: Code duplicated, block: B:43:0x0521  */
        /* JADX WARN: Code duplicated, block: B:45:0x052d A[Catch: Exception -> 0x08a6, TRY_ENTER, TryCatch #2 {Exception -> 0x08a6, blocks: (B:40:0x051a, B:45:0x052d, B:49:0x059f, B:52:0x05d0, B:58:0x066f, B:71:0x0763, B:60:0x0691, B:62:0x0697, B:63:0x0698, B:64:0x0699, B:70:0x06f8, B:73:0x078f, B:75:0x0795, B:76:0x0796, B:46:0x0535, B:77:0x0797, B:82:0x088b, B:86:0x089e, B:88:0x08a4, B:89:0x08a5, B:53:0x05db, B:55:0x05e8, B:56:0x061d, B:78:0x083d, B:80:0x084a, B:81:0x0884, B:65:0x06a5, B:67:0x06b2, B:68:0x06e7), top: B:108:0x051a, inners: #0, #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0535 A[Catch: Exception -> 0x08a6, TRY_LEAVE, TryCatch #2 {Exception -> 0x08a6, blocks: (B:40:0x051a, B:45:0x052d, B:49:0x059f, B:52:0x05d0, B:58:0x066f, B:71:0x0763, B:60:0x0691, B:62:0x0697, B:63:0x0698, B:64:0x0699, B:70:0x06f8, B:73:0x078f, B:75:0x0795, B:76:0x0796, B:46:0x0535, B:77:0x0797, B:82:0x088b, B:86:0x089e, B:88:0x08a4, B:89:0x08a5, B:53:0x05db, B:55:0x05e8, B:56:0x061d, B:78:0x083d, B:80:0x084a, B:81:0x0884, B:65:0x06a5, B:67:0x06b2, B:68:0x06e7), top: B:108:0x051a, inners: #0, #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x05d0 A[Catch: Exception -> 0x08a6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x08a6, blocks: (B:40:0x051a, B:45:0x052d, B:49:0x059f, B:52:0x05d0, B:58:0x066f, B:71:0x0763, B:60:0x0691, B:62:0x0697, B:63:0x0698, B:64:0x0699, B:70:0x06f8, B:73:0x078f, B:75:0x0795, B:76:0x0796, B:46:0x0535, B:77:0x0797, B:82:0x088b, B:86:0x089e, B:88:0x08a4, B:89:0x08a5, B:53:0x05db, B:55:0x05e8, B:56:0x061d, B:78:0x083d, B:80:0x084a, B:81:0x0884, B:65:0x06a5, B:67:0x06b2, B:68:0x06e7), top: B:108:0x051a, inners: #0, #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x05e8 A[Catch: all -> 0x0690, TryCatch #0 {all -> 0x0690, blocks: (B:53:0x05db, B:55:0x05e8, B:56:0x061d), top: B:104:0x05db, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0699 A[Catch: Exception -> 0x08a6, TRY_LEAVE, TryCatch #2 {Exception -> 0x08a6, blocks: (B:40:0x051a, B:45:0x052d, B:49:0x059f, B:52:0x05d0, B:58:0x066f, B:71:0x0763, B:60:0x0691, B:62:0x0697, B:63:0x0698, B:64:0x0699, B:70:0x06f8, B:73:0x078f, B:75:0x0795, B:76:0x0796, B:46:0x0535, B:77:0x0797, B:82:0x088b, B:86:0x089e, B:88:0x08a4, B:89:0x08a5, B:53:0x05db, B:55:0x05e8, B:56:0x061d, B:78:0x083d, B:80:0x084a, B:81:0x0884, B:65:0x06a5, B:67:0x06b2, B:68:0x06e7), top: B:108:0x051a, inners: #0, #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x06b2 A[Catch: all -> 0x078e, TryCatch #4 {all -> 0x078e, blocks: (B:65:0x06a5, B:67:0x06b2, B:68:0x06e7), top: B:111:0x06a5, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:77:0x0797 A[Catch: Exception -> 0x08a6, TRY_LEAVE, TryCatch #2 {Exception -> 0x08a6, blocks: (B:40:0x051a, B:45:0x052d, B:49:0x059f, B:52:0x05d0, B:58:0x066f, B:71:0x0763, B:60:0x0691, B:62:0x0697, B:63:0x0698, B:64:0x0699, B:70:0x06f8, B:73:0x078f, B:75:0x0795, B:76:0x0796, B:46:0x0535, B:77:0x0797, B:82:0x088b, B:86:0x089e, B:88:0x08a4, B:89:0x08a5, B:53:0x05db, B:55:0x05e8, B:56:0x061d, B:78:0x083d, B:80:0x084a, B:81:0x0884, B:65:0x06a5, B:67:0x06b2, B:68:0x06e7), top: B:108:0x051a, inners: #0, #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:80:0x084a A[Catch: all -> 0x089d, TryCatch #3 {all -> 0x089d, blocks: (B:78:0x083d, B:80:0x084a, B:81:0x0884), top: B:109:0x083d, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x0891  */
        /* JADX WARN: Code duplicated, block: B:90:0x08a6  */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            String str;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i9;
            int bitsPerPixel;
            int i10;
            boolean z;
            int i11;
            int i12;
            int i13;
            char[] cArr;
            int i14;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            long j;
            int i15;
            int i16;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i17 = 2 % 2;
            int i18 = TuitionPaymentFragmentbindingInflater1;
            int i19 = i18 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((i18 | 7) << 1) - (i18 ^ 7);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
            int i22 = i21 % 2;
            if (context != null) {
                int i23 = (i18 & 35) + (i18 | 35);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23 % 128;
                int i24 = i23 % 2;
                try {
                    int i25 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i26 = ((i25 | 158) << 1) - (i25 ^ 158);
                    int i27 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i28 = 7341 - (~(-(-(i27 * 306))));
                    int i29 = ~(i27 | 22);
                    int i30 = ~(i27 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    int i31 = -(-(((i29 ^ i30) | (i30 & i29)) * 305));
                    int i32 = (i28 & i31) + (i31 | i28);
                    int i33 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i34 = ~((i27 & i33) | (i33 ^ i27));
                    int i35 = (i32 - (~(-(-(((i34 & (-23)) | ((-23) ^ i34)) * 305))))) - 1;
                    int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                    Object[] objArr2 = new Object[1];
                    a(false, i26, i35, (scrollBarFadeDuration & 9) + (scrollBarFadeDuration | 9), new char[]{15, 65481, 65502, '\n', '\t', 15, 0, 19, 15, 65532, '\t', 65535, '\r', '\n', 4, 65535, 65481, 65534, '\n', '\t', 15, 0, '\t'}, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize();
                    int i36 = TuitionPaymentFragmentbindingInflater1 + 47;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i36 % 128;
                    int i37 = i36 % 2;
                    int i38 = maximumDrawingCacheSize >> 24;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i39 = i38 * 522;
                    int i40 = ((i39 | (-83200)) << 1) - (i39 ^ (-83200));
                    int i41 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i42 = ~((i41 & 160) | (i41 ^ 160));
                    int i43 = ((i40 - (~(((i42 & i38) | (i38 ^ i42)) * (-1042)))) - 1) + ((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | 160) * 521);
                    int i44 = ~i38;
                    int i45 = ~(i44 | (-161));
                    int i46 = ~(i44 | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i47 = (i45 ^ i46) | (i46 & i45);
                    int i48 = i38 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i49 = ~((i48 & 160) | (i48 ^ 160));
                    int i50 = i43 + (((i49 & i47) | (i47 ^ i49)) * 521);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                    int i51 = iResolveSizeAndState * 253;
                    int i52 = (i51 & 4554) + (i51 | 4554);
                    int i53 = ~((~iResolveSizeAndState) | (-19));
                    int i54 = ~i;
                    int i55 = ~(((-19) ^ i54) | ((-19) & i54));
                    int i56 = (i53 ^ i55) | (i53 & i55);
                    int i57 = (iResolveSizeAndState ^ 18) | (iResolveSizeAndState & 18);
                    int i58 = ~(i57 | i);
                    int i59 = ((i52 + (((i56 ^ i58) | (i58 & i56)) * (-252))) - (~(-(-(i57 * (-252)))))) - 1;
                    int i60 = ~i;
                    int i61 = ((-19) ^ i60) | ((-19) & i60);
                    int i62 = ~((iResolveSizeAndState & i61) | (i61 ^ iResolveSizeAndState));
                    int i63 = ~((i57 ^ i) | (i57 & i));
                    int i64 = ((i62 & i63) | (i62 ^ i63)) * 252;
                    int i65 = ((i59 | i64) << 1) - (i64 ^ i59);
                    int i66 = -((byte) KeyEvent.getModifierMetaStateMask());
                    int i67 = ~i66;
                    int i68 = ~((i67 ^ (-17)) | (i67 & (-17)) | i60);
                    int i69 = ~((i ^ 16) | (i & 16));
                    int i70 = (((i66 * (-519)) + 8336) - (~(((i68 ^ i69) | (i68 & i69)) * 520))) - 1;
                    int i71 = ~((-17) | i54);
                    int i72 = ~(i66 | i);
                    int i73 = -(-(((i71 ^ i72) | (i71 & i72)) * (-1040)));
                    int i74 = (i70 ^ i73) + ((i70 & i73) << 1);
                    int i75 = (~(i66 | (-17))) | (~((i67 ^ i60) | (i67 & i60)));
                    int i76 = -(-(((i75 & i72) | (i75 ^ i72)) * 520));
                    Object[] objArr3 = new Object[1];
                    a(true, i50, i65, (i74 ^ i76) + ((i74 & i76) << 1), new char[]{65535, 7, 65506, 7, '\b', 2, '\r', 65530, 65532, 2, 5, '\t', '\t', 65498, '\r', 65534, 0, '\b'}, objArr3);
                    Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                    int i77 = TuitionPaymentFragmentbindingInflater1;
                    int i78 = (i77 ^ 11) + ((i77 & 11) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i78 % 128;
                    int i79 = i78 % 2;
                    int i80 = 156 + iResolveOpacity;
                    byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                    int i81 = modifierMetaStateMask * (-559);
                    int i82 = (i81 & 19635) + (i81 | 19635) + ((~((i60 ^ modifierMetaStateMask) | (i60 & modifierMetaStateMask))) * (-560));
                    int i83 = ((-36) & modifierMetaStateMask) | ((-36) ^ modifierMetaStateMask);
                    int i84 = (~((i83 & i) | (i83 ^ i))) * (-560);
                    int i85 = ~((~modifierMetaStateMask) | 35);
                    int i86 = ~((i60 & 35) | (i60 ^ 35));
                    int i87 = (((i82 | i84) << 1) - (i84 ^ i82)) + (((i86 & i85) | (i85 ^ i86)) * 560);
                    int trimmedLength = TextUtils.getTrimmedLength("");
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i88 = trimmedLength * 567;
                    int i89 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i90 = (i89 ^ 65) + ((i89 & 65) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i90 % 128;
                    int i91 = i90 % 2;
                    int i92 = ((i88 | (-7910)) << 1) - (i88 ^ (-7910));
                    int i93 = ~trimmedLength;
                    int i94 = ~((i93 ^ 14) | (i93 & 14));
                    int i95 = ~((i93 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i93 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                    int i96 = (i92 - (~(((i95 & i94) | (i94 ^ i95)) * (-566)))) - 1;
                    int i97 = (~((-15) | trimmedLength)) * 566;
                    int i98 = (i96 ^ i97) + ((i97 & i96) << 1);
                    int i99 = ~trimmedLength;
                    int i100 = (i99 & (-15)) | (i99 ^ (-15));
                    int i101 = i100 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    Object[] objArr4 = new Object[1];
                    a(false, i80, i87, i98 + ((~((i100 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | i101)) * 566), new char[]{'\r', '\r', '\t', 6, 0, 65534, 17, 6, '\f', 11, 65510, 11, 3, '\f', 65534, 11, 1, 15, '\f', 6, 1, 65483, 0, '\f', 11, 17, 2, 11, 17, 65483, '\r', '\n', 65483, 65502}, objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    int i102 = -ImageFormat.getBitsPerPixel(0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i103 = ~i102;
                    int i104 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    int i105 = ~((i103 & i104) | (i103 ^ i104));
                    int i106 = (((i102 * 866) - 139104) - (~(-(-(((i105 & (-162)) | ((-162) ^ i105)) * (-865)))))) - 1;
                    int i107 = -(-((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i102) | (i102 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * 865));
                    int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
                    int i109 = ~(((-162) & i104) | ((-162) ^ i104));
                    int i110 = ~(i102 | i104);
                    int i111 = -(-(((i110 & i109) | (i109 ^ i110)) * 865));
                    int i112 = ((i108 | i111) << 1) - (i111 ^ i108);
                    int i113 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i114 = i113 * (-167);
                    int i115 = (i114 & (-835)) + (i114 | (-835));
                    int i116 = ~i113;
                    int i117 = ~((i116 & (-6)) | (i116 ^ (-6)));
                    int i118 = ~((-6) | i);
                    int i119 = i115 + (((i117 & i118) | (i117 ^ i118)) * 336);
                    int i120 = ((~((i113 ^ 5) | (i113 & 5))) | (~((i113 ^ i) | (i113 & i)))) * (-168);
                    int i121 = (i119 & i120) + (i120 | i119);
                    int i122 = ~(i113 | i54);
                    int i123 = -(-(((i122 & (-6)) | ((-6) ^ i122)) * 168));
                    int i124 = (i121 ^ i123) + ((i123 & i121) << 1);
                    int i125 = -ExpandableListView.getPackedPositionChild(0L);
                    Object[] objArr5 = new Object[1];
                    a(true, i112, i124, (i125 ^ 3) + ((i125 & 3) << 1), new char[]{65534, 65528, 3, 65533, '\n'}, objArr5);
                    int i126 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                    int i127 = (~(i & 1)) & (i | 1);
                    int i128 = -i126;
                    int i129 = ((i126 & i128) | (i126 ^ i128)) >> 31;
                    int i130 = (~i129) & i;
                    int i131 = i129 & i127;
                    int i132 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                    TuitionPaymentFragmentbindingInflater1 = i132 % 128;
                    int i133 = i132 % 2;
                    i4 = (i131 & i130) | (i130 ^ i131);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i4 = i;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 16949);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2739;
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13;
                    byte b2 = $$a[5];
                    Object[] objArr6 = new Object[1];
                    c((byte) 52, b2, (short) (b2 | 140), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, maximumFlingVelocity, minimumFlingVelocity, 1501733736, false, (String) objArr6[0], new Class[0]);
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cResolveSize = (char) (View.resolveSize(0, 0) + 16949);
                    int size = View.MeasureSpec.getSize(0) + 2739;
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 13;
                    byte b3 = $$a[5];
                    Object[] objArr7 = new Object[1];
                    c((byte) 52, b3, (short) (b3 | 88), objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, size, pressedStateDuration, 47863026, false, (String) objArr7[0], null);
                }
                Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null);
                int i134 = TuitionPaymentFragmentbindingInflater1;
                int i135 = (i134 ^ 93) + ((i134 & 93) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i135 % 128;
                int i136 = i135 % 2;
                if (!set.contains(obj)) {
                    int i137 = ~i;
                    int i138 = (i137 & (-1765752410)) | (i137 ^ (-1765752410));
                    int i139 = (~((i138 & 1565143736) | (i138 ^ 1565143736))) * (-116);
                    int i140 = ((1595161030 | i139) << 1) - (i139 ^ 1595161030);
                    int i141 = ((-1765752410) | i) * 116;
                    int i142 = (i140 & i141) + (i141 | i140);
                    int i143 = ~(((-1565143737) & i) | ((-1565143737) ^ i));
                    int i144 = ((i143 & 339738784) | (339738784 ^ i143)) * 116;
                    int i145 = (i142 & i144) + (i144 | i142);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i146 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    int i147 = ~(((-18548910) & i146) | ((-18548910) ^ i146));
                    int i148 = (i147 & 306216978) | (i147 ^ 306216978);
                    int i149 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & (-1455736339)) | ((-1455736339) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                    int i150 = 2037386138 + (((i149 & i148) | (i148 ^ i149)) * (-68));
                    int i151 = ((-1168068270) & i146) | ((-1168068270) ^ i146);
                    int i152 = -(-((~((i151 & (-1455736339)) | (i151 ^ (-1455736339)))) * (-68)));
                    int i153 = (i150 ^ i152) + ((i152 & i150) << 1);
                    int i154 = ~(1455736338 | i146);
                    int i155 = (i153 - (~(-(-(((i154 & (-1168068270)) | ((-1168068270) ^ i154)) * 68))))) - 1;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (i145 <= i155) {
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) (16950 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int i156 = 2740 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 13;
                            byte[] bArr = $$a;
                            byte b4 = (byte) (bArr[0] - 1);
                            byte b5 = bArr[5];
                            Object[] objArr8 = new Object[1];
                            c(b4, b5, (short) (b5 | 36), objArr8);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i156, longPressTimeout, 631063962, false, (String) objArr8[0], null);
                        }
                        boolean zContains = set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null));
                        int i157 = 94 / 0;
                        if (zContains) {
                            if (Build.VERSION.SDK_INT == 30) {
                                i5 = i;
                            }
                        }
                    } else {
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (16950 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2740;
                            int i158 = 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte[] bArr2 = $$a;
                            byte b6 = (byte) (bArr2[0] - 1);
                            byte b7 = bArr2[5];
                            Object[] objArr9 = new Object[1];
                            c(b6, b7, (short) (b7 | 36), objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iIndexOf, i158, 631063962, false, (String) objArr9[0], null);
                        }
                        if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                            if (Build.VERSION.SDK_INT == 30) {
                                i5 = i;
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT > 33) {
                        i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
                        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                        if (i9 % 2 != 0) {
                            bitsPerPixel = ImageFormat.getBitsPerPixel(1);
                            i10 = 3599;
                            z = true;
                        } else {
                            bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                            i10 = 152;
                            z = false;
                        }
                        int i159 = bitsPerPixel * (-559);
                        int i160 = i10 * 561;
                        int i161 = ((i159 | i160) << 1) - (i159 ^ i160);
                        int i162 = ~i;
                        int i163 = (~((i162 ^ bitsPerPixel) | (i162 & bitsPerPixel))) * (-560);
                        int i164 = (i161 & i163) + (i163 | i161);
                        int i165 = ~i10;
                        int i166 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i167 = (i166 ^ 45) + ((i166 & 45) << 1);
                        int i168 = i167 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i168;
                        int i169 = i167 % 2;
                        int i170 = (i165 & bitsPerPixel) | (i165 ^ bitsPerPixel);
                        int i171 = -(-((-560) * (~((i170 & i) | (i170 ^ i)))));
                        int i172 = (i164 ^ i171) + ((i171 & i164) << 1);
                        int i173 = ~bitsPerPixel;
                        int i174 = ((i168 | 103) << 1) - (i168 ^ 103);
                        int i175 = i174 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i175;
                        int i176 = i174 % 2;
                        int i177 = ~(i173 | i10);
                        int i178 = ~((i10 & i162) | (i162 ^ i10));
                        int i179 = 560 * ((i177 & i178) | (i177 ^ i178));
                        i11 = ((i172 | i179) << 1) - (i179 ^ i172);
                        int i180 = i175 + 97;
                        TuitionPaymentFragmentbindingInflater1 = i180 % 128;
                        int i181 = i180 % 2;
                        int i182 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        i12 = (i182 ^ 28) + ((i182 & 28) << 1);
                        int iIndexOf2 = TextUtils.indexOf("", "", 0);
                        i13 = (iIndexOf2 & 6) + (iIndexOf2 | 6);
                        cArr = new char[]{4, 14, 7, 65488, 20, 5, 65489, 7, 22, 5, 65489, 11, 16, 11, 22, 65489, 14, 14, '\r', 6, 65487, 6, 7, 4, 23, '\t', '\t', 3};
                        int i183 = TuitionPaymentFragmentbindingInflater1;
                        i14 = (i183 ^ 35) + ((i183 & 35) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                        if (i14 % 2 == 0) {
                            Object[] objArr10 = new Object[1];
                            a(z, i11, i12, i13, cArr, objArr10);
                            Object[] objArr11 = {(String) objArr10[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 993;
                                int iMyTid = (Process.myTid() >> 22) + 8;
                                byte b8 = $$a[7];
                                byte b9 = b8;
                                Object[] objArr12 = new Object[1];
                                c(b8, b9, b9, objArr12);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, pressedStateDuration2, iMyTid, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr11)).longValue();
                            long j2 = 1763020516;
                            long j3 = -1;
                            long j4 = ((j2 ^ j3) | jLongValue) ^ j3;
                            long j5 = i;
                            long j6 = j5 ^ j3;
                            long j7 = (((long) 595) * j2) + (((long) (-1187)) * jLongValue) + (((long) (-1188)) * (j4 | ((j6 | jLongValue) ^ j3)));
                            long j8 = 594;
                            long j9 = jLongValue ^ j3;
                            long j10 = ((j5 | j9) ^ j3) | j4;
                            long j11 = (j6 | j2) ^ j3;
                            j = j7 + ((j10 | j11) * j8) + (j8 * (((j9 | j2) ^ j3) | ((j9 | j6) ^ j3) | j11)) + ((long) (-1963938753));
                            i15 = (int) (j >> 90);
                            int iMyUid = Process.myUid();
                            i16 = (((-1320242614) + (((~(591993450 | iMyUid)) | 1488085013) * 1504)) + ((~(iMyUid | 2080078463)) * (-1504))) - 1939396608;
                        } else {
                            Object[] objArr13 = new Object[1];
                            a(z, i11, i12, i13, cArr, objArr13);
                            Object[] objArr14 = {(String) objArr13[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int size2 = View.MeasureSpec.getSize(0) + 993;
                                int iGreen = Color.green(0) + 8;
                                byte b10 = $$a[7];
                                byte b11 = b10;
                                Object[] objArr15 = new Object[1];
                                c(b10, b11, b11, objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, size2, iGreen, 410748506, false, (String) objArr15[0], new Class[]{String.class});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr14)).longValue();
                            long j12 = 1324885164;
                            long jMyUid = Process.myUid();
                            long j13 = -1;
                            long j14 = jMyUid ^ j13;
                            long j15 = 164;
                            long j16 = jLongValue2 ^ j13;
                            j = (((long) 165) * j12) + (((long) (-163)) * jLongValue2) + (((long) (-328)) * (j12 | ((j14 | jLongValue2) ^ j13))) + ((j12 | jMyUid) * j15) + (j15 * (((jLongValue2 | (j14 | j12)) ^ j13) | (((j12 ^ j13) | j16) ^ j13) | ((j16 | jMyUid) ^ j13))) + ((long) (-1525803401));
                            i15 = (int) (j >> 32);
                            i16 = 1587634074 + (((~(1180715516 | i)) | (-1332366335) | (~(256510894 | i))) * (-744)) + (((~i) | 104860076) * 744) + ((1332366334 | i) * 744);
                        }
                        int i184 = ~i;
                        i8 = (i15 & i16) | (((int) j) & (1070064730 + (((~((-1155342706) | i184)) | 1702398180) * (-602)) + (((~((-1155342706) | i)) | 1146617952 | (~(1711122933 | i184))) * (-301)) + ((~(i184 | 1702398180)) * 301)));
                    } else {
                        int i185 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i186 = i185 * (-167);
                        int i187 = ((i186 | (-17535)) << 1) - (i186 ^ (-17535));
                        int i188 = ~i185;
                        int i189 = ~((i188 & (-106)) | (i188 ^ (-106)));
                        int i190 = ~((-106) | i);
                        int i191 = ((i189 & i190) | (i189 ^ i190)) * 336;
                        int i192 = (i187 & i191) + (i191 | i187);
                        int i193 = ~((i185 ^ 105) | (i185 & 105));
                        int i194 = ~((i185 ^ i) | (i185 & i));
                        int i195 = (i192 - (~(-(-(((i193 & i194) | (i193 ^ i194)) * (-168)))))) - 1;
                        int i196 = ~i;
                        int i197 = ~((i185 & i196) | (i196 ^ i185));
                        int i198 = ((i197 & (-106)) | ((-106) ^ i197)) * 168;
                        Object[] objArr16 = new Object[1];
                        a(true, (i195 ^ i198) + ((i198 & i195) << 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{0}, objArr16);
                        str = (String) objArr16[0];
                        int i199 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        Object[] objArr17 = new Object[1];
                        a(true, (i199 & 156) + (i199 | 156), 11 - (~(-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))), 1 - View.resolveSize(0, 0), new char[]{15, 2, '\t', 65535, 65534, 4, 4, 18, 65535, 2, 1, 65483, '\f'}, objArr17);
                        objArr = new Object[]{(String) objArr17[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cResolveOpacity = (char) (33602 - Drawable.resolveOpacity(0, 0));
                            int i200 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3084;
                            int absoluteGravity = 26 - Gravity.getAbsoluteGravity(0, 0);
                            byte b12 = $$a[7];
                            byte b13 = b12;
                            Object[] objArr18 = new Object[1];
                            c(b12, b13, b13, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, i200, absoluteGravity, 1411172903, false, (String) objArr18[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i201 = TuitionPaymentFragmentbindingInflater1 + 31;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i201 % 128;
                            int i202 = i201 % 2;
                            i8 = 1;
                        } else {
                            i8 = 0;
                        }
                    }
                    int i203 = (~(i & 10)) & (i | 10);
                    int i204 = -i8;
                    int i205 = ((i8 & i204) | (i8 ^ i204)) >> 31;
                    int i206 = (~i205) & i;
                    int i207 = i205 & i203;
                    int i208 = (i207 & i206) | (i206 ^ i207);
                    int i209 = i2 & 32;
                    int i210 = -i209;
                    int i211 = ((i209 & i210) | (i209 ^ i210)) >> 31;
                    i5 = (i208 & (~i211)) | (i211 & i);
                } else if (Build.VERSION.SDK_INT == 30) {
                    i5 = i;
                } else {
                    try {
                        if (Build.VERSION.SDK_INT > 33) {
                            i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
                            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                            if (i9 % 2 != 0) {
                                bitsPerPixel = ImageFormat.getBitsPerPixel(1);
                                i10 = 3599;
                                z = true;
                            } else {
                                bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                                i10 = 152;
                                z = false;
                            }
                            int i1510 = bitsPerPixel * (-559);
                            int i1610 = i10 * 561;
                            int i1611 = ((i1510 | i1610) << 1) - (i1510 ^ i1610);
                            int i1612 = ~i;
                            int i1613 = (~((i1612 ^ bitsPerPixel) | (i1612 & bitsPerPixel))) * (-560);
                            int i1614 = (i1611 & i1613) + (i1613 | i1611);
                            int i1615 = ~i10;
                            int i1616 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i1617 = (i1616 ^ 45) + ((i1616 & 45) << 1);
                            int i1618 = i1617 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i1618;
                            int i1619 = i1617 % 2;
                            int i1710 = (i1615 & bitsPerPixel) | (i1615 ^ bitsPerPixel);
                            int i1711 = -(-((-560) * (~((i1710 & i) | (i1710 ^ i)))));
                            int i1712 = (i1614 ^ i1711) + ((i1711 & i1614) << 1);
                            int i1713 = ~bitsPerPixel;
                            int i1714 = ((i1618 | 103) << 1) - (i1618 ^ 103);
                            int i1715 = i1714 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1715;
                            int i1716 = i1714 % 2;
                            int i1717 = ~(i1713 | i10);
                            int i1718 = ~((i10 & i1612) | (i1612 ^ i10));
                            int i1719 = 560 * ((i1717 & i1718) | (i1717 ^ i1718));
                            i11 = ((i1712 | i1719) << 1) - (i1719 ^ i1712);
                            int i1810 = i1715 + 97;
                            TuitionPaymentFragmentbindingInflater1 = i1810 % 128;
                            int i1811 = i1810 % 2;
                            int i1812 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            i12 = (i1812 ^ 28) + ((i1812 & 28) << 1);
                            int iIndexOf3 = TextUtils.indexOf("", "", 0);
                            i13 = (iIndexOf3 & 6) + (iIndexOf3 | 6);
                            cArr = new char[]{4, 14, 7, 65488, 20, 5, 65489, 7, 22, 5, 65489, 11, 16, 11, 22, 65489, 14, 14, '\r', 6, 65487, 6, 7, 4, 23, '\t', '\t', 3};
                            int i1813 = TuitionPaymentFragmentbindingInflater1;
                            i14 = (i1813 ^ 35) + ((i1813 & 35) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                            if (i14 % 2 == 0) {
                                Object[] objArr19 = new Object[1];
                                a(z, i11, i12, i13, cArr, objArr19);
                                try {
                                    Object[] objArr110 = {(String) objArr19[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cIndexOf3 = (char) TextUtils.indexOf("", "", 0);
                                        int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 993;
                                        int iMyTid2 = (Process.myTid() >> 22) + 8;
                                        byte b14 = $$a[7];
                                        byte b15 = b14;
                                        Object[] objArr111 = new Object[1];
                                        c(b14, b15, b15, objArr111);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf3, pressedStateDuration3, iMyTid2, 410748506, false, (String) objArr111[0], new Class[]{String.class});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr110)).longValue();
                                    long j17 = 1763020516;
                                    long j18 = -1;
                                    long j19 = ((j17 ^ j18) | jLongValue3) ^ j18;
                                    long j20 = i;
                                    long j21 = j20 ^ j18;
                                    long j22 = (((long) 595) * j17) + (((long) (-1187)) * jLongValue3) + (((long) (-1188)) * (j19 | ((j21 | jLongValue3) ^ j18)));
                                    long j23 = 594;
                                    long j24 = jLongValue3 ^ j18;
                                    long j110 = ((j20 | j24) ^ j18) | j19;
                                    long j111 = (j21 | j17) ^ j18;
                                    j = j22 + ((j110 | j111) * j23) + (j23 * (((j24 | j17) ^ j18) | ((j24 | j21) ^ j18) | j111)) + ((long) (-1963938753));
                                    i15 = (int) (j >> 90);
                                    int iMyUid2 = Process.myUid();
                                    i16 = (((-1320242614) + (((~(591993450 | iMyUid2)) | 1488085013) * 1504)) + ((~(iMyUid2 | 2080078463)) * (-1504))) - 1939396608;
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                Object[] objArr112 = new Object[1];
                                a(z, i11, i12, i13, cArr, objArr112);
                                try {
                                    Object[] objArr113 = {(String) objArr112[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char c4 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int size3 = View.MeasureSpec.getSize(0) + 993;
                                        int iGreen2 = Color.green(0) + 8;
                                        byte b16 = $$a[7];
                                        byte b17 = b16;
                                        Object[] objArr114 = new Object[1];
                                        c(b16, b17, b17, objArr114);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c4, size3, iGreen2, 410748506, false, (String) objArr114[0], new Class[]{String.class});
                                    }
                                    long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr113)).longValue();
                                    long j112 = 1324885164;
                                    long jMyUid2 = Process.myUid();
                                    long j113 = -1;
                                    long j114 = jMyUid2 ^ j113;
                                    long j115 = 164;
                                    long j116 = jLongValue4 ^ j113;
                                    j = (((long) 165) * j112) + (((long) (-163)) * jLongValue4) + (((long) (-328)) * (j112 | ((j114 | jLongValue4) ^ j113))) + ((j112 | jMyUid2) * j115) + (j115 * (((jLongValue4 | (j114 | j112)) ^ j113) | (((j112 ^ j113) | j116) ^ j113) | ((j116 | jMyUid2) ^ j113))) + ((long) (-1525803401));
                                    i15 = (int) (j >> 32);
                                    i16 = 1587634074 + (((~(1180715516 | i)) | (-1332366335) | (~(256510894 | i))) * (-744)) + (((~i) | 104860076) * 744) + ((1332366334 | i) * 744);
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                            int i1814 = ~i;
                            i8 = (i15 & i16) | (((int) j) & (1070064730 + (((~((-1155342706) | i1814)) | 1702398180) * (-602)) + (((~((-1155342706) | i)) | 1146617952 | (~(1711122933 | i1814))) * (-301)) + ((~(i1814 | 1702398180)) * 301)));
                        } else {
                            int i1815 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int i1816 = i1815 * (-167);
                            int i1817 = ((i1816 | (-17535)) << 1) - (i1816 ^ (-17535));
                            int i1818 = ~i1815;
                            int i1819 = ~((i1818 & (-106)) | (i1818 ^ (-106)));
                            int i1910 = ~((-106) | i);
                            int i1911 = ((i1819 & i1910) | (i1819 ^ i1910)) * 336;
                            int i1912 = (i1817 & i1911) + (i1911 | i1817);
                            int i1913 = ~((i1815 ^ 105) | (i1815 & 105));
                            int i1914 = ~((i1815 ^ i) | (i1815 & i));
                            int i1915 = (i1912 - (~(-(-(((i1913 & i1914) | (i1913 ^ i1914)) * (-168)))))) - 1;
                            int i1916 = ~i;
                            int i1917 = ~((i1815 & i1916) | (i1916 ^ i1815));
                            int i1918 = ((i1917 & (-106)) | ((-106) ^ i1917)) * 168;
                            Object[] objArr115 = new Object[1];
                            a(true, (i1915 ^ i1918) + ((i1918 & i1915) << 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{0}, objArr115);
                            str = (String) objArr115[0];
                            int i1919 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            Object[] objArr116 = new Object[1];
                            a(true, (i1919 & 156) + (i1919 | 156), 11 - (~(-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))), 1 - View.resolveSize(0, 0), new char[]{15, 2, '\t', 65535, 65534, 4, 4, 18, 65535, 2, 1, 65483, '\f'}, objArr116);
                            try {
                                objArr = new Object[]{(String) objArr116[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cResolveOpacity2 = (char) (33602 - Drawable.resolveOpacity(0, 0));
                                    int i2010 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3084;
                                    int absoluteGravity2 = 26 - Gravity.getAbsoluteGravity(0, 0);
                                    byte b18 = $$a[7];
                                    byte b19 = b18;
                                    Object[] objArr117 = new Object[1];
                                    c(b18, b19, b19, objArr117);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity2, i2010, absoluteGravity2, 1411172903, false, (String) objArr117[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i2011 = TuitionPaymentFragmentbindingInflater1 + 31;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2011 % 128;
                                    int i2012 = i2011 % 2;
                                    i8 = 1;
                                } else {
                                    i8 = 0;
                                }
                            } catch (Throwable th4) {
                                Throwable cause4 = th4.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th4;
                            }
                        }
                    } catch (Exception unused) {
                        i8 = 0;
                    }
                    int i2013 = (~(i & 10)) & (i | 10);
                    int i2014 = -i8;
                    int i2015 = ((i8 & i2014) | (i8 ^ i2014)) >> 31;
                    int i2016 = (~i2015) & i;
                    int i2017 = i2015 & i2013;
                    int i2018 = (i2017 & i2016) | (i2016 ^ i2017);
                    int i2019 = i2 & 32;
                    int i212 = -i2019;
                    int i213 = ((i2019 & i212) | (i2019 ^ i212)) >> 31;
                    i5 = (i2018 & (~i213)) | (i213 & i);
                }
                int i214 = (~(i & i4)) & (i | i4);
                int i215 = -i214;
                int i216 = ((i214 & i215) | (i214 ^ i215)) >> 31;
                int i217 = i5 & (~i216);
                int i218 = i4 & i216;
                int i219 = (i217 & i218) | (i217 ^ i218);
                Object[] objArr20 = new Object[4];
                int i220 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i221 = (i220 & 23) + (i220 | 23);
                int i222 = i221 % 128;
                TuitionPaymentFragmentbindingInflater1 = i222;
                if (i221 % 2 != 0) {
                    i6 = 1;
                    objArr20[1] = new int[0];
                    objArr20[1] = new int[0];
                    objArr20[5] = new int[0];
                    i7 = 2;
                } else {
                    i6 = 1;
                    objArr20[0] = new int[1];
                    objArr20[1] = new int[1];
                    i7 = 2;
                    objArr20[2] = new int[1];
                }
                int i223 = (i222 ^ 89) + ((i222 & 89) << i6);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i223 % 128;
                int i224 = i223 % i7;
                int i225 = (~(i & i219)) & (i | i219);
                int i226 = -i225;
                ((int[]) objArr20[0])[0] = i;
                ((int[]) objArr20[2])[0] = i219;
                objArr20[3] = null;
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i227 = ~iMaxMemory;
                int i228 = (-1813746852) + (((~(88101216 | i227)) | (-128411446) | (~((-88101217) | iMaxMemory))) * (-564)) + ((~(iMaxMemory | (-83902753))) * 1128) + (((~((-128411446) | i227)) | 4198464) * 564);
                int i229 = -(-((((i225 & i226) | (i225 ^ i226)) >> 31) & 16));
                int i230 = (i3 - (~(-(-(((i228 | i229) << 1) - (i229 ^ i228)))))) - 1;
                int i231 = i230 << 13;
                int i232 = (i230 | i231) & (~(i230 & i231));
                int i233 = i232 >>> 17;
                int i234 = ((~i232) & i233) | ((~i233) & i232);
                ((int[]) objArr20[1])[0] = i234 ^ (i234 << 5);
                return objArr20;
            } catch (Throwable th5) {
                Throwable cause5 = th5.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th5;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r6, short r7, int r8) {
            /*
                int r6 = r6 * 2
                int r0 = r6 + 1
                int r7 = r7 * 4
                int r7 = 4 - r7
                byte[] r1 = com.tbuonomo.viewpagerdotsindicator.DotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                int r8 = 120 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r4 = r6
                r8 = r7
                r3 = r2
                goto L28
            L15:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L19:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L24:
                int r3 = r3 + 1
                r4 = r1[r8]
            L28:
                int r4 = -r4
                int r7 = r7 + r4
                int r8 = r8 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tbuonomo.viewpagerdotsindicator.DotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$e(short, short, int):java.lang.String");
        }
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder TuitionPaymentFragmentbindingInflater1() {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int p0) {
        ImageView imageView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(p0);
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        ImageView imageView2 = imageView;
        Drawable background = imageView2.getBackground();
        MediaStoreOutputOptions mediaStoreOutputOptions = background instanceof MediaStoreOutputOptions ? (MediaStoreOutputOptions) background : null;
        if (mediaStoreOutputOptions != null) {
            BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 pager = getPager();
            Intrinsics.checkNotNull(pager);
            if (p0 == pager.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                mediaStoreOutputOptions.setColor(this.selectedDotColor);
            } else {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 pager2 = getPager();
                    Intrinsics.checkNotNull(pager2);
                    if (p0 < pager2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                        mediaStoreOutputOptions.setColor(this.selectedDotColor);
                    }
                }
                mediaStoreOutputOptions.setColor(getDotsColor());
            }
        }
        ImageView imageView3 = imageView2;
        Intrinsics.checkNotNullParameter(imageView3, "");
        imageView3.setBackground(mediaStoreOutputOptions);
        imageView2.invalidate();
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final BaseDotsIndicator.Type TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return BaseDotsIndicator.Type.TuitionPaymentFragmentbindingInflater1;
    }

    @Deprecated(message = "Use setSelectedDotColor() instead", replaceWith = @ReplaceWith(expression = "setSelectedDotColor()", imports = {}))
    public final void setSelectedPointColor(int p0) {
        setSelectedDotColor(p0);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(DotsIndicator dotsIndicator, int i, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Intrinsics.checkNotNullParameter(dotsIndicator, "");
            if (dotsIndicator.getDotsClickable()) {
                BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 pager = dotsIndicator.getPager();
                if (i < (pager != null ? pager.TuitionPaymentFragmentspecialinlinedviewModeldefault1() : 0)) {
                    BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 pager2 = dotsIndicator.getPager();
                    Intrinsics.checkNotNull(pager2);
                    pager2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
                }
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotsIndicator(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
