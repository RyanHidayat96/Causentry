package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzoy;
import com.google.android.libraries.places.widget.model.Orientation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzar {
    private final View zza;
    private final zzoy zzb;
    private final CoroutineScope zzc;
    private final int zzd;
    private final Orientation zze;

    static /* synthetic */ void zzg(zzar zzarVar, boolean z, boolean z2, zzbp zzbpVar) {
        View view = zzarVar.zza;
        ((TextView) view.findViewById(R.id.image_loading_failure_text)).setVisibility(8);
        if (z && z2) {
            ImageView imageView = (ImageView) view.findViewById(R.id.place_image);
            View viewFindViewById = view.findViewById(R.id.place_image_container);
            imageView.setVisibility(0);
            viewFindViewById.setVisibility(0);
            if (zzbpVar instanceof zzbl) {
                b.TuitionPaymentFragmentbindingInflater1(zzarVar.zzc, null, null, new zzaq(zzarVar, zzbpVar, imageView, null), 3, null);
                return;
            }
            if (zzbpVar instanceof zzbm) {
                imageView.setImageDrawable(view.getContext().getResources().getDrawable(R.drawable.place_details_image_loading_background, new ContextThemeWrapper(view.getContext(), zzarVar.zzd).getTheme()));
                return;
            }
            if (zzbpVar instanceof zzbn) {
                return;
            }
            if (zzbpVar instanceof zzbo) {
                imageView.setImageDrawable(view.getContext().getResources().getDrawable(zzarVar.zze == Orientation.HORIZONTAL ? R.drawable.place_details_placeholder_horizontal : R.drawable.place_details_placeholder_vertical, new ContextThemeWrapper(view.getContext(), zzarVar.zzd).getTheme()));
            } else {
                if (!(zzbpVar instanceof zzbk)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNull(imageView);
                zzarVar.zzh(imageView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(ImageView imageView) {
        View view = this.zza;
        imageView.setImageDrawable(view.getContext().getResources().getDrawable(R.drawable.place_details_image_loading_background, new ContextThemeWrapper(view.getContext(), this.zzd).getTheme()));
        ((TextView) view.findViewById(R.id.image_loading_failure_text)).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzi(final View view, int i) {
        ViewParent parent = view.getParent();
        final ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        final int i2 = 48;
        view.post(new Runnable(i2, view, viewGroup) { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzan
            private final /* synthetic */ View zza;
            private final /* synthetic */ ViewGroup zzb;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                View view2 = this.zza;
                int iApplyDimension = (int) TypedValue.applyDimension(1, 48.0f, view2.getResources().getDisplayMetrics());
                Rect rect = new Rect();
                view2.getHitRect(rect);
                int iWidth = rect.width();
                int iHeight = rect.height();
                int iMin = (iApplyDimension - Math.min(iWidth, iApplyDimension)) / 2;
                int iMin2 = (iApplyDimension - Math.min(iHeight, iApplyDimension)) / 2;
                if (iMin > 0 || iMin2 > 0) {
                    ViewGroup viewGroup2 = this.zzb;
                    rect.left -= iMin;
                    rect.right += iMin;
                    rect.top -= iMin2;
                    rect.bottom += iMin2;
                    viewGroup2.setTouchDelegate(new TouchDelegate(rect, view2));
                }
            }

            {
                this.zza = view;
                this.zzb = viewGroup;
            }
        });
    }

    private static final void zzj(TextView textView, CharSequence charSequence) {
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }

    public final void zza() {
        int lineHeight;
        Orientation orientation = this.zze;
        if (orientation == Orientation.HORIZONTAL) {
            lineHeight = ((Button) this.zza.findViewById(R.id.open_in_maps_icon_measurement)).getLineHeight();
        } else {
            View viewFindViewById = this.zza.findViewById(R.id.open_in_maps);
            Intrinsics.checkNotNull(viewFindViewById, "");
            lineHeight = ((Button) viewFindViewById).getLineHeight();
        }
        View view = this.zza;
        Drawable drawable = view.getContext().getDrawable(R.drawable.open_in_new);
        if (drawable != null) {
            drawable.setBounds(0, 0, lineHeight, lineHeight);
        } else {
            drawable = null;
        }
        if (orientation != Orientation.HORIZONTAL) {
            View viewFindViewById2 = view.findViewById(R.id.open_in_maps);
            Intrinsics.checkNotNull(viewFindViewById2, "");
            TextView textView = (TextView) viewFindViewById2;
            textView.setCompoundDrawablesRelative(null, null, drawable, null);
            zzi(textView, 48);
            return;
        }
        View viewFindViewById3 = view.findViewById(R.id.open_in_maps);
        Intrinsics.checkNotNull(viewFindViewById3, "");
        final ImageButton imageButton = (ImageButton) viewFindViewById3;
        imageButton.setImageDrawable(drawable);
        imageButton.getLayoutParams().height = imageButton.getPaddingTop() + lineHeight + imageButton.getPaddingBottom();
        imageButton.getLayoutParams().width = lineHeight + imageButton.getPaddingStart() + imageButton.getPaddingEnd();
        imageButton.post(new Runnable() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzao
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzar zzarVar = this.zza;
                zzar.zzi(imageButton, 48);
            }
        });
    }

    public final void zzb(Place place, boolean z) {
        Intrinsics.checkNotNullParameter(place, "");
        View view = this.zza;
        TextView textView = (TextView) view.findViewById(R.id.place_address);
        TextView textView2 = (TextView) view.findViewById(R.id.place_name);
        if (z) {
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setMaxLines(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
        }
        Intrinsics.checkNotNull(textView2);
        zzj(textView2, place.getDisplayName());
        Intrinsics.checkNotNull(textView);
        zzj(textView, place.getFormattedAddress());
    }

    public final void zzc(final zzbp zzbpVar, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(zzbpVar, "");
        this.zza.post(new Runnable() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzam
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzar.zzg(this.zza, z, z2, zzbpVar);
            }
        });
    }

    public zzar(View view, Context context, zzoy zzoyVar, CoroutineScope coroutineScope, int i, Orientation orientation) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(orientation, "");
        this.zza = view;
        this.zzb = zzoyVar;
        this.zzc = coroutineScope;
        this.zzd = i;
        this.zze = orientation;
    }
}
