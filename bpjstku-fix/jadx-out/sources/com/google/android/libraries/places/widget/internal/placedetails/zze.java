package com.google.android.libraries.places.widget.internal.placedetails;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Place;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class zze extends Fragment {
    static final /* synthetic */ KProperty[] zza = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(zze.class, "themeResId", "getThemeResId()I", 0))};
    private zzbi zzb;
    private RecyclerView zzc;
    private final ReadWriteProperty zzd = Delegates.INSTANCE.notNull();

    public static final /* synthetic */ void zza(final zze zzeVar, Place place) {
        Context contextRequireContext = zzeVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        zzm zzmVar = new zzm(zzn.zza(place, contextRequireContext));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(zzeVar.requireContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new zzd(zzmVar));
        RecyclerView recyclerView = zzeVar.zzc;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView3 = zzeVar.zzc;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(zzmVar);
        RecyclerView recyclerView4 = zzeVar.zzc;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            recyclerView2 = recyclerView4;
        }
        recyclerView2.post(new Runnable() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zza
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zze.zzb(this.zza);
            }
        });
    }

    static /* synthetic */ void zzb(zze zzeVar) {
        zzbi zzbiVar = zzeVar.zzb;
        if (zzbiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar = null;
        }
        zzbiVar.zzh();
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
        KProperty<?>[] kPropertyArr = zza;
        KProperty<?> kProperty = kPropertyArr[0];
        ReadWriteProperty readWriteProperty = this.zzd;
        readWriteProperty.setValue(this, kProperty, Integer.valueOf(i));
        View viewInflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), ((Number) readWriteProperty.getValue(this, kPropertyArr[0])).intValue())).inflate(R.layout.place_details_about_fragment, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.zzc = (RecyclerView) view.findViewById(R.id.features_list);
        zzbi zzbiVar = this.zzb;
        if (zzbiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar = null;
        }
        zzbiVar.zza().observe(getViewLifecycleOwner(), new zzc(new zzb(this)));
    }
}
