package com.google.android.libraries.places.internal;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.places.R;
import defpackage.ViewPortBuilder;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzoo extends Dialog {
    private static final Uri zzd = Uri.parse("https://support.google.com/contributionpolicy/answer/7422880");
    private static final Uri zze = Uri.parse("https://support.google.com/maps/answer/3092445");
    private static final Uri zzf = Uri.parse("https://policies.google.com/privacy");
    private static final Uri zzg = Uri.parse("https://www.google.com/help/terms_maps/");
    private final Context zza;
    private final int zzb;
    private final List zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzoo(Context context, int i, List list) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.zza = context;
        this.zzb = i;
        this.zzc = list;
    }

    private final void zze() {
        TextView textView = (TextView) findViewById(R.id.view_terms_link_text);
        int lineHeight = textView != null ? textView.getLineHeight() : (int) this.zza.getResources().getDimension(R.dimen.gmp_sys_measurement_icon_size_small);
        for (ImageView imageView : CollectionsKt.listOf((Object[]) new ImageView[]{(ImageView) findViewById(R.id.reviews_disclosure_learn_more_link_icon), (ImageView) findViewById(R.id.reviews_disclosure_learn_more_link_icon), (ImageView) findViewById(R.id.about_these_results_link_icon), (ImageView) findViewById(R.id.view_terms_link_icon), (ImageView) findViewById(R.id.view_privacy_link_icon)})) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.LayoutParams) marginLayoutParams).height = lineHeight;
            ((ViewGroup.LayoutParams) marginLayoutParams).width = lineHeight;
            imageView.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(Uri uri) {
        try {
            this.zza.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException unused) {
            new zzoq(this.zza, this.zzb).show();
        }
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.legal_disclosures_dialog);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -2);
            window.setFlags(2, 2);
            window.setDimAmount(0.6f);
        }
        zze();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.reviews_disclosure_learn_more_link);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzom
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        this.zza.zzf(zzoo.zzd);
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.about_these_results_link);
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzoi
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        this.zza.zzf(zzoo.zze);
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
        }
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.view_terms_link);
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzoj
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        this.zza.zzf(zzoo.zzg);
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
        }
        LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.view_privacy_link);
        if (linearLayout4 != null) {
            linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzok
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        this.zza.zzf(zzoo.zzf);
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
        }
        ((Button) findViewById(R.id.legal_disclosures_ok)).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzol
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    this.zza.dismiss();
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((zzon) it.next()).ordinal();
            if (iOrdinal == 0) {
                LinearLayout linearLayout5 = (LinearLayout) findViewById(R.id.reviews_disclosure_container);
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(0);
                }
            } else if (iOrdinal == 1) {
                LinearLayout linearLayout6 = (LinearLayout) findViewById(R.id.about_these_results_container);
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                LinearLayout linearLayout7 = (LinearLayout) findViewById(R.id.review_ordering_container);
                if (linearLayout7 != null) {
                    linearLayout7.setVisibility(0);
                }
            }
        }
    }
}
