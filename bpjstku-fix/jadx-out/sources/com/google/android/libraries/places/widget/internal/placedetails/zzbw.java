package com.google.android.libraries.places.widget.internal.placedetails;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.Review;
import com.google.android.libraries.places.internal.zzon;
import com.google.android.libraries.places.internal.zzoo;
import com.google.android.libraries.places.internal.zzoy;
import defpackage.ViewPortBuilder;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbw extends Fragment {
    static final /* synthetic */ KProperty[] zza = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(zzbw.class, "themeResId", "getThemeResId()I", 0))};
    private zzbi zzb;
    private RecyclerView zzc;
    private final ReadWriteProperty zzd = Delegates.INSTANCE.notNull();

    public static final /* synthetic */ void zza(final zzbw zzbwVar, Place place) {
        List<Review> reviews = place.getReviews();
        if (reviews != null) {
            RecyclerView recyclerView = zzbwVar.zzc;
            RecyclerView recyclerView2 = null;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView = null;
            }
            zzbi zzbiVar = zzbwVar.zzb;
            if (zzbiVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                zzbiVar = null;
            }
            zzoy zzoyVarZze = zzbiVar.zze();
            recyclerView.setAdapter(new zzcd(reviews, zzoyVarZze != null ? zzoyVarZze.zze() : null, LifecycleOwnerKt.getLifecycleScope(zzbwVar), zzbwVar.zzd()));
            RecyclerView recyclerView3 = zzbwVar.zzc;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                recyclerView2 = recyclerView3;
            }
            recyclerView2.post(new Runnable() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbw.zzc(this.zza);
                }
            });
        }
    }

    static /* synthetic */ void zzc(zzbw zzbwVar) {
        zzbi zzbiVar = zzbwVar.zzb;
        if (zzbiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar = null;
        }
        zzbiVar.zzh();
    }

    private final int zzd() {
        return ((Number) this.zzd.getValue(this, zza[0])).intValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        Application application = requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "");
        this.zzb = (zzbi) new ViewModelProvider(fragmentRequireParentFragment, zzat.zza(application)).get(zzbi.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        int i = requireArguments().getInt("arg-theme-res-id");
        this.zzd.setValue(this, zza[0], Integer.valueOf(i));
        View viewInflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), zzd())).inflate(R.layout.place_details_reviews_fragment, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.reviews_list);
        this.zzc = recyclerView;
        zzbi zzbiVar = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        ((ImageView) view.findViewById(R.id.about_reviews_icon)).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbt
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    zzbw.zze(this.zza, view2);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        zzbi zzbiVar2 = this.zzb;
        if (zzbiVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            zzbiVar = zzbiVar2;
        }
        zzbiVar.zza().observe(getViewLifecycleOwner(), new zzbv(new zzbu(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzbw zzbwVar, View view) {
        Context contextRequireContext = zzbwVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        new zzoo(contextRequireContext, zzbwVar.zzd(), CollectionsKt.listOf((Object[]) new zzon[]{zzon.REVIEWS_ARENT_VERIFIED, zzon.REVIEW_ORDERING})).show();
    }
}
