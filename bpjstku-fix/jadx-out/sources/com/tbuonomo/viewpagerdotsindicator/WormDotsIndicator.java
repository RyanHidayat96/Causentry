package com.tbuonomo.viewpagerdotsindicator;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.bpjstku.R;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;
import defpackage.MediaStoreOutputOptionsBuilder;
import defpackage.MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder;
import defpackage.ViewPortBuilder;
import defpackage.initSession;
import defpackage.setAspectRatio;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\fJ\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0012\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u001c\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001dR\u0016\u0010!\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u001e\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010(\u001a\u00020.8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010/"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/WormDotsIndicator;", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)V", "", "Landroid/view/ViewGroup;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Z)Landroid/view/ViewGroup;", "LMediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder;", "TuitionPaymentFragmentbindingInflater1", "()LMediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder;", "()V", "setDotIndicatorColor", "", "setDotsStrokeWidth", "(F)V", "setStrokeDotsIndicatorColor", "Landroid/view/View;", "(ZLandroid/view/View;)V", "b", "I", "g", "Landroid/view/View;", "Landroid/widget/ImageView;", "asInterface", "Landroid/widget/ImageView;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroidx/dynamicanimation/animation/SpringAnimation;", "d", "Landroidx/dynamicanimation/animation/SpringAnimation;", "a", "asBinder", "cancelAll", "F", "Landroid/widget/LinearLayout;", "notify", "Landroid/widget/LinearLayout;", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "()Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WormDotsIndicator extends BaseDotsIndicator {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private SpringAnimation b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private int a;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private ImageView TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private float asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private SpringAnimation TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private View TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final LinearLayout g;
    private static final byte[] $$j = {58, -103, 118, 14};
    private static final int $$k = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {119, -103, 14, -22, -20, -6, 55, -69, -12, -14, -6, 3, -9, -10, -1, -25, -7, -8, 11, 43, -59, -26, -14, 3, 3, 45, -27, -58, -14, 3, 3, 8, -26, -21, -12, 9, -21, 70, -25, 9, -25, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
    private static final int $$h = 225;
    private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$e = 242;
    private static int INotificationSideChannel = 0;
    private static int cancel = 1;
    private static char[] onTransact = {59676, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59757, 59756, 59746, 59744, 59771, 59751, 59757, 59699, 59770, 59775, 59769, 59775, 59766, 59763, 59771, 59756, 59756, 59748, 59769, 59767, 59761, 59772, 59772, 59902, 59900, 59890, 59893, 59889, 59903, 59868, 59870, 59901, 59893, 59862, 59854, 59883, 59890, 59895, 59894, 59894, 59895, 59407, 59903, 59879, 59888, 59890, 59898, 59899, 59698, 59769, 59768, 59751, 59747, 59749, 59751, 59749, 59745, 59753, 59757, 59745, 59749, 59771, 59731, 59729, 59770, 59746};

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i);
        int i9 = ~(i7 | i2);
        int i10 = i8 | i9;
        int i11 = ~i;
        int i12 = (~((~i2) | i7 | i)) | (~(i7 | i11 | i2));
        int i13 = i9 | (~(i11 | i3));
        int i14 = i3 + i + i4 + ((-1696018712) * i6) + (2108813197 * i5);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i3) - 2121662464) + (1221732374 * i) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i4) + (39845888 * i6) + (227278848 * i5) + ((-1705377792) * i15);
        int i17 = ((i3 * 362004572) - 1408384217) + (i * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i4 * 362004373) + (i6 * (-1290304248)) + (i5 * 155295761) + (i15 * (-60686336));
        if (i16 + (i17 * i17 * (-1680474112)) != 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        final WormDotsIndicator wormDotsIndicator = (WormDotsIndicator) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i18 = 2 % 2;
        ViewGroup viewGroupTuitionPaymentFragmentspecialinlinedviewModeldefault2 = wormDotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
        viewGroupTuitionPaymentFragmentspecialinlinedviewModeldefault2.setOnClickListener(new View.OnClickListener() { // from class: OutputOptionsBuilder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WormDotsIndicator.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iIntValue, view);
            }
        });
        ArrayList<ImageView> arrayList = wormDotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        View viewFindViewById = viewGroupTuitionPaymentFragmentspecialinlinedviewModeldefault2.findViewById(R.id.worm_dot);
        Intrinsics.checkNotNull(viewFindViewById, "");
        arrayList.add((ImageView) viewFindViewById);
        wormDotsIndicator.g.addView(viewGroupTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i19 = INotificationSideChannel + 85;
        cancel = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 52
            int r7 = 56 - r7
            int r5 = r5 * 14
            int r5 = 98 - r5
            byte[] r0 = com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator.$$d
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r0[r7]
        L28:
            int r7 = r7 + 1
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-10)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator.f(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void i(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 37
            int r7 = 41 - r7
            int r8 = r8 * 15
            int r0 = r8 + 38
            byte[] r1 = com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator.$$g
            int r6 = r6 * 15
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            int r8 = r8 + 37
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L31
        L18:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L31:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r3 + 1
            int r7 = r7 + (-8)
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator.i(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WormDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = cancel + 119;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = INotificationSideChannel + 3;
            cancel = i6 % 128;
            i = i6 % 2 == 0 ? 1 : 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ SpringAnimation TuitionPaymentFragmentbindingInflater1(WormDotsIndicator wormDotsIndicator) {
        int i = 2 % 2;
        int i2 = cancel;
        int i3 = i2 + 85;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        SpringAnimation springAnimation = wormDotsIndicator.b;
        int i5 = i2 + 51;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return springAnimation;
        }
        throw null;
    }

    public static final /* synthetic */ SpringAnimation TuitionPaymentFragmentspecialinlinedviewModeldefault2(WormDotsIndicator wormDotsIndicator) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 99;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        SpringAnimation springAnimation = wormDotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 != 0) {
            return springAnimation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ImageView TuitionPaymentFragmentspecialinlinedviewModeldefault3(WormDotsIndicator wormDotsIndicator) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 85;
        int i3 = i2 % 128;
        cancel = i3;
        int i4 = i2 % 2;
        ImageView imageView = wormDotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i3 + 87;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return imageView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WormDotsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        this.g = linearLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i2 = (int) (getContext().getResources().getDisplayMetrics().density * 24.0f);
        setPadding(i2, 0, i2, 0);
        setClipToPadding(false);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        addView(linearLayout);
        this.asInterface = getContext().getResources().getDisplayMetrics().density * 2.0f;
        Intrinsics.checkNotNullParameter(context, "");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true);
        int i3 = typedValue.data;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        this.a = i3;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.INotificationSideChannelDefault);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = typedArrayObtainStyledAttributes.getColor(MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.write, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            this.a = typedArrayObtainStyledAttributes.getColor(MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.MediaBrowserCompat, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i4 = MediaStoreOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.getRoot;
            this.asInterface = typedArrayObtainStyledAttributes.getDimension(6, this.asInterface);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            int i5 = INotificationSideChannel + 105;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < 5) {
                int i8 = cancel + 53;
                INotificationSideChannel = i8 % 128;
                if (i8 % 2 != 0) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                    i7 += 9;
                } else {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                    i7++;
                }
                int i9 = 2 % 2;
            }
            addView(TuitionPaymentFragmentspecialinlinedviewModeldefault2(false));
        }
        BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 pager = getPager();
        if (pager == null || !pager.TuitionPaymentFragmentbindingInflater1()) {
            ImageView imageView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (imageView != null && indexOfChild(imageView) != -1) {
                removeView(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            ViewGroup viewGroupTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
            this.TuitionPaymentFragmentbindingInflater1 = viewGroupTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNull(viewGroupTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (ImageView) viewGroupTuitionPaymentFragmentspecialinlinedviewModeldefault2.findViewById(R.id.worm_dot);
            addView(this.TuitionPaymentFragmentbindingInflater1);
            this.b = new SpringAnimation(this.TuitionPaymentFragmentbindingInflater1, SpringAnimation.TRANSLATION_X);
            SpringForce springForce = new SpringForce(0.0f);
            springForce.setDampingRatio(1.0f);
            springForce.setStiffness(300.0f);
            SpringAnimation springAnimation = this.b;
            Intrinsics.checkNotNull(springAnimation);
            springAnimation.setSpring(springForce);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new SpringAnimation(this.TuitionPaymentFragmentbindingInflater1, new b());
            SpringForce springForce2 = new SpringForce(0.0f);
            springForce2.setDampingRatio(1.0f);
            springForce2.setStiffness(300.0f);
            SpringAnimation springAnimation2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNull(springAnimation2);
            springAnimation2.setSpring(springForce2);
        }
        int i10 = INotificationSideChannel + 121;
        cancel = i10 % 128;
        int i11 = i10 % 2;
    }

    public static final class b extends FloatPropertyCompat<View> {
        b() {
            super("DotsWidth");
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            ImageView imageViewTuitionPaymentFragmentspecialinlinedviewModeldefault3 = WormDotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(WormDotsIndicator.this);
            Intrinsics.checkNotNull(imageViewTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return imageViewTuitionPaymentFragmentspecialinlinedviewModeldefault3.getLayoutParams().width;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(View view, float f) {
            Intrinsics.checkNotNullParameter(view, "");
            ImageView imageViewTuitionPaymentFragmentspecialinlinedviewModeldefault3 = WormDotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(WormDotsIndicator.this);
            Intrinsics.checkNotNull(imageViewTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            imageViewTuitionPaymentFragmentspecialinlinedviewModeldefault3.getLayoutParams().width = (int) f;
            ImageView imageViewTuitionPaymentFragmentspecialinlinedviewModeldefault4 = WormDotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault3(WormDotsIndicator.this);
            Intrinsics.checkNotNull(imageViewTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            imageViewTuitionPaymentFragmentspecialinlinedviewModeldefault4.requestLayout();
        }
    }

    private final ViewGroup TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean p0) {
        int i;
        int i2 = 2 % 2;
        int i3 = cancel + 31;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.worm_dot_layout, (ViewGroup) this, false);
        Intrinsics.checkNotNull(viewInflate, "");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        viewGroup.setLayoutDirection(0);
        View viewFindViewById = viewGroup.findViewById(R.id.worm_dot);
        if (p0) {
            int i5 = INotificationSideChannel + 21;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            i = R.drawable.worm_dot_stroke_background;
        } else {
            int i7 = INotificationSideChannel + 13;
            cancel = i7 % 128;
            int i8 = i7 % 2;
            i = R.drawable.worm_dot_background;
        }
        viewFindViewById.setBackgroundResource(i);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        ((ViewGroup.LayoutParams) layoutParams2).height = (int) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ((ViewGroup.LayoutParams) layoutParams2).width = ((ViewGroup.LayoutParams) layoutParams2).height;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) this.TuitionPaymentFragmentbindingInflater1, 0, (int) this.TuitionPaymentFragmentbindingInflater1, 0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        Object[] objArr = {this, Boolean.valueOf(p0), viewFindViewById};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1404562814, setAspectRatio.AnonymousClass6.b(), objArr, 1404562814, setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b());
        return viewGroup;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0053  */
    /* JADX WARN: Code duplicated, block: B:14:0x005c A[PHI: r8
  0x005c: PHI (r8v7 android.graphics.drawable.GradientDrawable) = (r8v4 android.graphics.drawable.GradientDrawable), (r8v9 android.graphics.drawable.GradientDrawable) binds: [B:8:0x003d, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003f A[PHI: r8
  0x003f: PHI (r8v5 android.graphics.drawable.GradientDrawable) = (r8v4 android.graphics.drawable.GradientDrawable), (r8v9 android.graphics.drawable.GradientDrawable) binds: [B:8:0x003d, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        GradientDrawable gradientDrawable;
        int i;
        WormDotsIndicator wormDotsIndicator = (WormDotsIndicator) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        View view = (View) objArr[2];
        int i2 = 2 % 2;
        int i3 = cancel + 83;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 != 0) {
            Drawable background = view.getBackground();
            Intrinsics.checkNotNull(background, "");
            gradientDrawable = (GradientDrawable) background;
            int i4 = 27 / 0;
            if (!(!zBooleanValue)) {
                i = cancel + 59;
                INotificationSideChannel = i % 128;
                if (i % 2 == 0) {
                    gradientDrawable.setStroke((int) wormDotsIndicator.asInterface, wormDotsIndicator.a);
                    throw null;
                }
                gradientDrawable.setStroke((int) wormDotsIndicator.asInterface, wormDotsIndicator.a);
            } else {
                gradientDrawable.setColor(wormDotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i5 = cancel + 57;
                INotificationSideChannel = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            Drawable background2 = view.getBackground();
            Intrinsics.checkNotNull(background2, "");
            gradientDrawable = (GradientDrawable) background2;
            if (zBooleanValue) {
                i = cancel + 59;
                INotificationSideChannel = i % 128;
                if (i % 2 == 0) {
                    gradientDrawable.setStroke((int) wormDotsIndicator.asInterface, wormDotsIndicator.a);
                    throw null;
                }
                gradientDrawable.setStroke((int) wormDotsIndicator.asInterface, wormDotsIndicator.a);
            } else {
                gradientDrawable.setColor(wormDotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i7 = cancel + 57;
                INotificationSideChannel = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        gradientDrawable.setCornerRadius(wormDotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        return null;
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder {
        @Override // defpackage.MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        }

        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // defpackage.MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return WormDotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size();
        }

        @Override // defpackage.MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, float f) {
            float f2;
            ViewParent parent = WormDotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i).getParent();
            Intrinsics.checkNotNull(parent, "");
            float left = ((ViewGroup) parent).getLeft();
            ArrayList<ImageView> arrayList = WormDotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i2 != -1) {
                i = i2;
            }
            ViewParent parent2 = arrayList.get(i).getParent();
            Intrinsics.checkNotNull(parent2, "");
            float left2 = ((ViewGroup) parent2).getLeft();
            if (0.0f <= f && f <= 0.1f) {
                f2 = WormDotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else if (0.1f <= f && f <= 0.9f) {
                f2 = (left2 - left) + WormDotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                left = left2;
                f2 = WormDotsIndicator.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            SpringAnimation springAnimationTuitionPaymentFragmentbindingInflater1 = WormDotsIndicator.TuitionPaymentFragmentbindingInflater1(WormDotsIndicator.this);
            if (springAnimationTuitionPaymentFragmentbindingInflater1 != null) {
                springAnimationTuitionPaymentFragmentbindingInflater1.animateToFinalPosition(left);
            }
            SpringAnimation springAnimationTuitionPaymentFragmentspecialinlinedviewModeldefault2 = WormDotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault2(WormDotsIndicator.this);
            if (springAnimationTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                springAnimationTuitionPaymentFragmentspecialinlinedviewModeldefault2.animateToFinalPosition(f2);
            }
        }
    }

    private static void h(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = onTransact;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 7;
                $11 = i11 % 128;
                if (i11 % i2 == 0) {
                    try {
                        Object[] objArr2 = new Object[i6];
                        objArr2[i4] = Integer.valueOf(cArr[i10]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", i4, i4), 1270 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, 407021364, false, $$l(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i10 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i10])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1270, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19, 407021364, false, $$l(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i10++;
                }
                i2 = 2;
                i4 = 0;
                i6 = 1;
            }
            int i12 = $11 + 87;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i5, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i7) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i14 = $10 + 39;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), (-16773991) - Color.rgb(0, 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 13, 2133916302, false, $$l(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                } else {
                    int i17 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (29943 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.indexOf("", "", 0) + 1755, 23 - KeyEvent.keyCodeFromString(""), 387247676, false, $$l(b8, b9, (byte) (b9 + 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (41240 - TextUtils.lastIndexOf("", '0', 0, 0)), 1705 - ((Process.getThreadPriority(0) + 20) >> 6), 21 - TextUtils.indexOf("", ""), -1434471773, false, $$l(b10, b11, (byte) (b11 | 6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i18 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i18, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i18);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i7];
            setvideostabilizationmode.b = i;
            while (setvideostabilizationmode.b < i7) {
                cArr6[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
                int i19 = $10 + 93;
                $11 = i19 % 128;
                int i20 = i19 % 2;
            }
            int i21 = $10 + 41;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i23 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i23;
                while (true) {
                    if (setvideostabilizationmode.b >= i7) {
                        break loop3;
                    }
                    int i24 = $11 + 63;
                    $10 = i24 % 128;
                    if (i24 % 2 != 0) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] >> iArr[2]);
                        setvideostabilizationmode.b <<= 1;
                    }
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i23 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Type inference failed for: r3v57, types: [boolean, int] */
    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 65;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cGreen = (char) (Color.green(0) + 31533);
            int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
            byte[] bArr = $$d;
            byte b2 = bArr[80];
            Object[] objArr3 = new Object[1];
            f(b2, (byte) (b2 | 52), bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, iLastIndexOf, windowTouchSlop, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        h(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1}, new int[]{0, 22, 0, 15}, false, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        h(new byte[]{1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0}, new int[]{22, 15, 12, 1}, false, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetBefore = (char) (31533 - TextUtils.getOffsetBefore("", 0));
            int iBlue = Color.blue(0) + 921;
            int iRed = Color.red(0) + 28;
            byte[] bArr2 = $$d;
            byte b3 = bArr2[7];
            Object[] objArr6 = new Object[1];
            f(b3, bArr2[80], b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, iBlue, iRed, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31532);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 922;
                int i4 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte[] bArr3 = $$d;
                Object[] objArr7 = new Object[1];
                f(bArr3[7], (byte) (-bArr3[33]), bArr3[80], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, modifierMetaStateMask, i4, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ((~((-16843076) | iIdentityHashCode)) * 521) + 1054650688 + (((~((~iIdentityHashCode) | (-16843076))) | 1756933120) * 521) + 321304790;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            h(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{37, 26, 142, 0}, false, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            h(new byte[]{0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{63, 18, 0, 4}, true, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(p0), 0, 321304790};
                byte[] bArr4 = $$g;
                byte b4 = bArr4[74];
                Object[] objArr12 = new Object[1];
                i(b4, b4, bArr4[51], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b5 = bArr4[51];
                Object[] objArr13 = new Object[1];
                i(b5, b5, bArr4[74], objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cBlue = (char) (Color.blue(0) + 31533);
                    int i8 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 920;
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 28;
                    byte[] bArr5 = $$d;
                    Object[] objArr15 = new Object[1];
                    f(bArr5[7], (byte) (-bArr5[33]), bArr5[80], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, i8, packedPositionType, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    h(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1}, new int[]{0, 22, 0, 15}, false, objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    h(new byte[]{1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0}, new int[]{22, 15, 12, 1}, false, objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0, 0));
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 921;
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
                        byte[] bArr6 = $$d;
                        byte b6 = bArr6[7];
                        Object[] objArr18 = new Object[1];
                        f(b6, bArr6[80], b6, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, tapTimeout, keyRepeatTimeout, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (31534 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
                        int iAlpha = 28 - Color.alpha(0);
                        byte[] bArr7 = $$d;
                        byte b7 = bArr7[80];
                        Object[] objArr19 = new Object[1];
                        f(b7, (byte) (b7 | 52), bArr7[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, keyRepeatTimeout2, iAlpha, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[3])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i12 = ~System.identityHashCode(this);
            int i13 = i11 + ((((~((-658069812) | i12)) | 33575200) * (-241)) - 1892940301) + (((~(i12 | (-624494612))) | 1082434632) * 241);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr2[0])[0] = i15 ^ (i15 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i16 = cancel + 41;
                    INotificationSideChannel = i16 % 128;
                    int i17 = i16 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i10];
            int i18 = i10 - 1;
            iArr[i18] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i18) % 2) - 1], 1).show();
            int i19 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i20 = ~p0;
            int i21 = i19 + 1822803092 + (((~(i20 | 1641291541)) | 132788102) * (-1042)) + ((1641291541 | p0) * 521) + (((~(i20 | 1744715671)) | (~((-132788103) | p0)) | 29363972) * 521);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
        }
        ImageView imageView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(p0);
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        int i24 = ((int[]) objArr2[0])[0];
        int i25 = i24 * i24;
        int i26 = -(1358004683 * i24);
        int i27 = (((i25 & i26) + (i25 | i26)) - (~(-(i24 * (-1900257437))))) - (-277838096);
        int i28 = ((i27 >> 18) - 32767) / 16384;
        int i29 = i27 >> 27;
        int i30 = ((i29 & (-63)) + (i29 | (-63))) / 32;
        int i31 = -(((i27 - (~(((i28 | 1) << 1) - (i28 ^ 1)))) - 1) ^ (((i30 | 1) << 1) - (i30 ^ 1)));
        int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
        int i33 = i32 >> 27;
        int i34 = (((i33 & (-63)) + (i33 | (-63))) / 32) + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1404562814, setAspectRatio.AnonymousClass6.b(), new Object[]{this, Boolean.valueOf((boolean) (1345 / (((-((i34 & 1) + (i34 | 1))) & i32) * 1345))), imageView}, 1404562814, setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b());
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = cancel + 95;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = this.g;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() - 1);
        int i4 = cancel + 33;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final MediaStoreOutputOptionsMediaStoreOutputOptionsInternalBuilder TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1();
        int i2 = INotificationSideChannel + 75;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        return tuitionPaymentFragmentbindingInflater1;
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final BaseDotsIndicator.Type TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 121;
        cancel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            BaseDotsIndicator.Type type = BaseDotsIndicator.Type.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        BaseDotsIndicator.Type type2 = BaseDotsIndicator.Type.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = cancel + 49;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 == 0) {
            return type2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 android.widget.ImageView) = (r1v4 android.widget.ImageView), (r1v8 android.widget.ImageView) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public final void setDotIndicatorColor(int p0) {
        ImageView imageView;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 27;
        int i3 = i2 % 128;
        cancel = i3;
        if (i2 % 2 == 0) {
            imageView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = 68 / 0;
            if (imageView != null) {
                int i5 = i3 + 123;
                INotificationSideChannel = i5 % 128;
                int i6 = i5 % 2;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = p0;
                Intrinsics.checkNotNull(imageView);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1404562814, setAspectRatio.AnonymousClass6.b(), new Object[]{this, false, imageView}, 1404562814, setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b());
            }
        } else {
            imageView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (imageView != null) {
                int i7 = i3 + 123;
                INotificationSideChannel = i7 % 128;
                int i8 = i7 % 2;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = p0;
                Intrinsics.checkNotNull(imageView);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1404562814, setAspectRatio.AnonymousClass6.b(), new Object[]{this, false, imageView}, 1404562814, setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b());
            }
        }
        int i9 = INotificationSideChannel + 47;
        cancel = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 13 / 0;
        }
    }

    public final void setStrokeDotsIndicatorColor(int p0) {
        int i = 2 % 2;
        this.a = p0;
        Iterator<ImageView> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
        while (it.hasNext()) {
            int i2 = cancel + 107;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 != 0) {
                ImageView next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1404562814, setAspectRatio.AnonymousClass6.b(), new Object[]{this, false, next}, 1404562814, setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b());
            } else {
                ImageView next2 = it.next();
                Intrinsics.checkNotNullExpressionValue(next2, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1404562814, setAspectRatio.AnonymousClass6.b(), new Object[]{this, true, next2}, 1404562814, setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b());
            }
        }
        int i3 = INotificationSideChannel + 47;
        cancel = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDotsStrokeWidth(float p0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 35;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = p0;
        Iterator<ImageView> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
        int i4 = INotificationSideChannel + 27;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 % 3;
        }
        while (it.hasNext()) {
            int i6 = cancel + 95;
            INotificationSideChannel = i6 % 128;
            if (i6 % 2 != 0) {
                ImageView next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1404562814, setAspectRatio.AnonymousClass6.b(), new Object[]{this, false, next}, 1404562814, setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b());
            } else {
                ImageView next2 = it.next();
                Intrinsics.checkNotNullExpressionValue(next2, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1404562814, setAspectRatio.AnonymousClass6.b(), new Object[]{this, true, next2}, 1404562814, setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b());
            }
            int i7 = INotificationSideChannel + 47;
            cancel = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public static /* synthetic */ void b(WormDotsIndicator wormDotsIndicator, int i, View view) {
        int i2 = 2 % 2;
        int i3 = INotificationSideChannel + 89;
        cancel = i3 % 128;
        int i4 = i3 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i4 == 0) {
                Intrinsics.checkNotNullParameter(wormDotsIndicator, "");
                wormDotsIndicator.getDotsClickable();
                throw null;
            }
            Intrinsics.checkNotNullParameter(wormDotsIndicator, "");
            if (wormDotsIndicator.getDotsClickable()) {
                BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 pager = wormDotsIndicator.getPager();
                if (i < (pager != null ? pager.TuitionPaymentFragmentspecialinlinedviewModeldefault1() : 0)) {
                    BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 pager2 = wormDotsIndicator.getPager();
                    Intrinsics.checkNotNull(pager2);
                    pager2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
                    int i5 = INotificationSideChannel + 105;
                    cancel = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WormDotsIndicator(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WormDotsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private final void TuitionPaymentFragmentbindingInflater1(boolean p0, View p1) {
        Object[] objArr = {this, Boolean.valueOf(p0), p1};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1404562814, setAspectRatio.AnonymousClass6.b(), objArr, 1404562814, setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b());
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) {
        Object[] objArr = {this, Integer.valueOf(p0)};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(1283959482, setAspectRatio.AnonymousClass6.b(), objArr, -1283959481, setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$l(byte r5, byte r6, int r7) {
        /*
            byte[] r0 = com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator.$$j
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r7 = r7 + 99
            int r5 = r5 * 4
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r5
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r3 = r0[r6]
        L25:
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator.$$l(byte, byte, int):java.lang.String");
    }
}
