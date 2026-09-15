package com.google.android.libraries.places.widget.internal.placedetails;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.ConnectorAggregation;
import com.google.android.libraries.places.api.model.EVChargeOptions;
import com.google.android.libraries.places.api.model.FuelOptions;
import com.google.android.libraries.places.api.model.FuelPrice;
import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlusCode;
import com.google.android.libraries.places.internal.zzdy;
import com.google.android.libraries.places.internal.zzoq;
import com.google.android.libraries.places.internal.zzoy;
import defpackage.ViewPortBuilder;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zzal extends Fragment {
    static final /* synthetic */ KProperty[] zza = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(zzal.class, "themeResId", "getThemeResId()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(zzal.class, "openingHoursRequested", "getOpeningHoursRequested()Z", 0))};
    private zzbi zzb;
    private final ReadWriteProperty zzc = Delegates.INSTANCE.notNull();
    private final ReadWriteProperty zzd = Delegates.INSTANCE.notNull();
    private RecyclerView zze;
    private TextView zzf;
    private RecyclerView zzg;
    private TextView zzh;
    private View zzi;
    private TextView zzj;
    private ImageView zzk;
    private TextView zzl;
    private TextView zzm;
    private TextView zzn;
    private ImageView zzo;
    private RecyclerView zzp;
    private ImageView zzq;
    private TextView zzr;
    private ImageView zzs;
    private TextView zzt;
    private ImageView zzu;
    private TextView zzv;
    private ImageView zzw;
    private boolean zzx;

    /* JADX WARN: Code duplicated, block: B:170:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:172:0x02c1  */
    public static final /* synthetic */ void zza(final zzal zzalVar, final Place place) {
        ArrayList arrayList;
        boolean z;
        RecyclerView recyclerView;
        zzdy zzdyVarZzb;
        String strZzc;
        String strZzb;
        TextView textView;
        zzdy zzdyVarZzb2;
        zzdy zzdyVarZzb3;
        List<FuelPrice> fuelPrices;
        EVChargeOptions evChargeOptions = place.getEvChargeOptions();
        List<ConnectorAggregation> connectorAggregations = evChargeOptions != null ? evChargeOptions.getConnectorAggregations() : null;
        FuelOptions fuelOptions = place.getFuelOptions();
        if (fuelOptions == null || (fuelPrices = fuelOptions.getFuelPrices()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : fuelPrices) {
                FuelPrice.FuelType type = ((FuelPrice) obj).getType();
                Intrinsics.checkNotNullExpressionValue(type, "");
                if (zzx.zza(type)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        if (connectorAggregations == null || connectorAggregations.isEmpty()) {
            if (arrayList == null || arrayList.isEmpty()) {
                RecyclerView recyclerView2 = zzalVar.zze;
                if (recyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    recyclerView2 = null;
                }
                recyclerView2.setVisibility(8);
                RecyclerView recyclerView3 = zzalVar.zzg;
                if (recyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    recyclerView3 = null;
                }
                recyclerView3.setVisibility(8);
                TextView textView2 = zzalVar.zzh;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    textView2 = null;
                }
                textView2.setVisibility(8);
                TextView textView3 = zzalVar.zzf;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    textView3 = null;
                }
                textView3.setVisibility(8);
                View view = zzalVar.zzi;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    view = null;
                }
                view.setVisibility(8);
            } else {
                GridLayoutManager gridLayoutManager = new GridLayoutManager(zzalVar.requireContext(), arrayList.size());
                zzbi zzbiVar = zzalVar.zzb;
                if (zzbiVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    zzbiVar = null;
                }
                zzoy zzoyVarZze = zzbiVar.zze();
                Instant instantZza = (zzoyVarZze == null || (zzdyVarZzb = zzoyVarZze.zzb()) == null) ? null : zzdyVarZzb.zza();
                RecyclerView recyclerView4 = zzalVar.zzg;
                if (recyclerView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    recyclerView4 = null;
                }
                recyclerView4.setAdapter(new zzw(arrayList, instantZza));
                RecyclerView recyclerView5 = zzalVar.zzg;
                if (recyclerView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    recyclerView5 = null;
                }
                recyclerView5.setLayoutManager(gridLayoutManager);
                ArrayList arrayList3 = arrayList;
                if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
                    Iterator it = arrayList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        FuelPrice fuelPrice = (FuelPrice) it.next();
                        Intrinsics.checkNotNull(fuelPrice);
                        if (zzx.zzb(fuelPrice, instantZza)) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                TextView textView4 = zzalVar.zzh;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    textView4 = null;
                }
                zzalVar.zzj(textView4, z ? zzalVar.requireContext().getString(R.string.fuel_price_updated_over_24_hours_ago) : null);
                RecyclerView recyclerView6 = zzalVar.zze;
                if (recyclerView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    recyclerView6 = null;
                }
                recyclerView6.setVisibility(8);
                TextView textView5 = zzalVar.zzf;
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    textView5 = null;
                }
                textView5.setVisibility(8);
                RecyclerView recyclerView7 = zzalVar.zzg;
                if (recyclerView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    recyclerView7 = null;
                }
                recyclerView7.setVisibility(0);
                View view2 = zzalVar.zzi;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    view2 = null;
                }
                view2.setVisibility(0);
                recyclerView = zzalVar.zzg;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
            }
            recyclerView = null;
        } else {
            RecyclerView recyclerView8 = zzalVar.zze;
            if (recyclerView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView8 = null;
            }
            recyclerView8.setLayoutManager(new LinearLayoutManager(zzalVar.requireContext()));
            RecyclerView recyclerView9 = zzalVar.zze;
            if (recyclerView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView9 = null;
            }
            recyclerView9.setAdapter(new zzr(connectorAggregations, zzalVar.zzg()));
            TextView textView6 = zzalVar.zzf;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView6 = null;
            }
            TextView textView7 = textView6;
            Context contextRequireContext = zzalVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            zzbi zzbiVar2 = zzalVar.zzb;
            if (zzbiVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                zzbiVar2 = null;
            }
            zzoy zzoyVarZze2 = zzbiVar2.zze();
            zzalVar.zzj(textView7, zzs.zza(connectorAggregations, contextRequireContext, (zzoyVarZze2 == null || (zzdyVarZzb3 = zzoyVarZze2.zzb()) == null) ? null : zzdyVarZzb3.zza()));
            RecyclerView recyclerView10 = zzalVar.zze;
            if (recyclerView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView10 = null;
            }
            recyclerView10.setVisibility(0);
            RecyclerView recyclerView11 = zzalVar.zzg;
            if (recyclerView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView11 = null;
            }
            recyclerView11.setVisibility(8);
            TextView textView8 = zzalVar.zzh;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView8 = null;
            }
            textView8.setVisibility(8);
            View view3 = zzalVar.zzi;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view3 = null;
            }
            view3.setVisibility(0);
            recyclerView = zzalVar.zze;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView = null;
            }
        }
        TextView textView9 = zzalVar.zzj;
        if (textView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView9 = null;
        }
        zzalVar.zzj(textView9, place.getFormattedAddress());
        ImageView imageView = zzalVar.zzk;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        zzalVar.zzj(imageView, place.getFormattedAddress());
        if (zzalVar.zzh()) {
            Context contextRequireContext2 = zzalVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            strZzc = zzad.zzc(place, contextRequireContext2);
        } else {
            strZzc = null;
        }
        if (zzalVar.zzh()) {
            zzbi zzbiVar3 = zzalVar.zzb;
            if (zzbiVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                zzbiVar3 = null;
            }
            zzoy zzoyVarZze3 = zzbiVar3.zze();
            Instant instantZza2 = (zzoyVarZze3 == null || (zzdyVarZzb2 = zzoyVarZze3.zzb()) == null) ? null : zzdyVarZzb2.zza();
            Context contextRequireContext3 = zzalVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            strZzb = zzad.zzb(place, instantZza2, contextRequireContext3);
        } else {
            strZzb = null;
        }
        TextView textView10 = zzalVar.zzl;
        if (textView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView10 = null;
        }
        String str = strZzc;
        zzalVar.zzj(textView10, str);
        TextView textView11 = zzalVar.zzl;
        if (textView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView11 = null;
        }
        Context contextRequireContext4 = zzalVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
        textView11.setTextColor(zzad.zza(place, contextRequireContext4, zzalVar.zzg()));
        TextView textView12 = zzalVar.zzn;
        if (textView12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView12 = null;
        }
        zzalVar.zzj(textView12, strZzb);
        TextView textView13 = zzalVar.zzl;
        if (textView13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView13 = null;
        }
        if (textView13.getVisibility() != 0) {
            textView = zzalVar.zzm;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView = null;
            }
            textView.setVisibility(8);
        } else {
            TextView textView14 = zzalVar.zzn;
            if (textView14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView14 = null;
            }
            if (textView14.getVisibility() == 0) {
                TextView textView15 = zzalVar.zzm;
                if (textView15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    textView15 = null;
                }
                textView15.setVisibility(0);
            } else {
                textView = zzalVar.zzm;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    textView = null;
                }
                textView.setVisibility(8);
            }
        }
        ImageView imageView2 = zzalVar.zzq;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView2 = null;
        }
        zzalVar.zzj(imageView2, str);
        OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
        List<String> weekdayText = currentOpeningHours != null ? currentOpeningHours.getWeekdayText() : null;
        List<String> list = weekdayText;
        if (list == null || list.isEmpty() || str == null || str.length() == 0) {
            ImageView imageView3 = zzalVar.zzo;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageView3 = null;
            }
            imageView3.setVisibility(8);
        } else {
            ImageView imageView4 = zzalVar.zzo;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageView4 = null;
            }
            imageView4.setVisibility(0);
            RecyclerView recyclerView12 = zzalVar.zzp;
            if (recyclerView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView12 = null;
            }
            recyclerView12.setLayoutManager(new LinearLayoutManager(zzalVar.requireContext()));
            RecyclerView recyclerView13 = zzalVar.zzp;
            if (recyclerView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView13 = null;
            }
            recyclerView13.setAdapter(new zzu(weekdayText));
            ImageView imageView5 = zzalVar.zzo;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageView5 = null;
            }
            imageView5.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzah
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view4) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view4);
                    try {
                        zzal.zzf(this.zza, view4);
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
        }
        TextView textView16 = zzalVar.zzt;
        if (textView16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView16 = null;
        }
        zzalVar.zzj(textView16, place.getInternationalPhoneNumber());
        ImageView imageView6 = zzalVar.zzu;
        if (imageView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView6 = null;
        }
        zzalVar.zzj(imageView6, place.getInternationalPhoneNumber());
        TextView textView17 = zzalVar.zzt;
        if (textView17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView17 = null;
        }
        if (textView17.getVisibility() == 0) {
            TextView textView18 = zzalVar.zzt;
            if (textView18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView18 = null;
            }
            textView18.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzai
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view4) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view4);
                    try {
                        zzal.zzl(place, zzalVar, view4);
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
        }
        TextView textView19 = zzalVar.zzr;
        if (textView19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView19 = null;
        }
        TextView textView20 = textView19;
        Uri websiteUri = place.getWebsiteUri();
        zzalVar.zzj(textView20, websiteUri != null ? websiteUri.getHost() : null);
        ImageView imageView7 = zzalVar.zzs;
        if (imageView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView7 = null;
        }
        ImageView imageView8 = imageView7;
        Uri websiteUri2 = place.getWebsiteUri();
        zzalVar.zzj(imageView8, websiteUri2 != null ? websiteUri2.toString() : null);
        TextView textView21 = zzalVar.zzr;
        if (textView21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView21 = null;
        }
        textView21.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzae
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view4) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view4);
                try {
                    this.zza.zzi(place.getWebsiteUri());
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        ImageView imageView9 = zzalVar.zzs;
        if (imageView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView9 = null;
        }
        imageView9.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzaf
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view4) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view4);
                try {
                    this.zza.zzi(place.getWebsiteUri());
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        TextView textView22 = zzalVar.zzv;
        if (textView22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView22 = null;
        }
        TextView textView23 = textView22;
        PlusCode plusCode = place.getPlusCode();
        zzalVar.zzj(textView23, plusCode != null ? plusCode.getCompoundCode() : null);
        ImageView imageView10 = zzalVar.zzw;
        if (imageView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView10 = null;
        }
        ImageView imageView11 = imageView10;
        PlusCode plusCode2 = place.getPlusCode();
        zzalVar.zzj(imageView11, plusCode2 != null ? plusCode2.getCompoundCode() : null);
        if (recyclerView != null) {
            recyclerView.post(new Runnable() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzag
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzk();
                }
            });
        } else {
            zzalVar.zzk();
        }
    }

    static /* synthetic */ void zzf(zzal zzalVar, View view) {
        RecyclerView recyclerView = null;
        if (zzalVar.zzx) {
            ImageView imageView = zzalVar.zzo;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageView = null;
            }
            imageView.setContentDescription(zzalVar.requireContext().getString(R.string.show_weekly_hours_content_description));
            RecyclerView recyclerView2 = zzalVar.zzp;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                recyclerView = recyclerView2;
            }
            recyclerView.setVisibility(8);
        } else {
            ImageView imageView2 = zzalVar.zzo;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageView2 = null;
            }
            imageView2.setContentDescription(zzalVar.requireContext().getString(R.string.hide_weekly_hours_content_description));
            RecyclerView recyclerView3 = zzalVar.zzp;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                recyclerView = recyclerView3;
            }
            recyclerView.setVisibility(0);
        }
        zzalVar.zzx = !zzalVar.zzx;
        zzalVar.zzk();
    }

    private final int zzg() {
        return ((Number) this.zzc.getValue(this, zza[0])).intValue();
    }

    private final boolean zzh() {
        return ((Boolean) this.zzd.getValue(this, zza[1])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        try {
            requireContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            new zzoq(contextRequireContext, zzg()).show();
        }
    }

    private final void zzj(View view, CharSequence charSequence) {
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
        view.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk() {
        zzbi zzbiVar = this.zzb;
        if (zzbiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar = null;
        }
        zzbiVar.zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzl(Place place, zzal zzalVar, View view) {
        try {
            zzalVar.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(place.getInternationalPhoneNumber())))));
        } catch (ActivityNotFoundException unused) {
        }
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
        boolean z = requireArguments().getBoolean("arg-opening-hours-requested");
        KProperty<?>[] kPropertyArr = zza;
        this.zzd.setValue(this, kPropertyArr[1], Boolean.valueOf(z));
        int i = requireArguments().getInt("arg-theme-res-id");
        this.zzc.setValue(this, kPropertyArr[0], Integer.valueOf(i));
        View viewInflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), zzg())).inflate(R.layout.place_details_overview_fragment, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.zze = (RecyclerView) view.findViewById(R.id.ev_charging_options);
        this.zzf = (TextView) view.findViewById(R.id.ev_chargers_availability_last_updated);
        this.zzg = (RecyclerView) view.findViewById(R.id.fuel_options);
        this.zzh = (TextView) view.findViewById(R.id.stale_fuel_prices_message);
        this.zzi = view.findViewById(R.id.type_specific_info_divider);
        this.zzj = (TextView) view.findViewById(R.id.address_text);
        this.zzk = (ImageView) view.findViewById(R.id.address_icon);
        this.zzt = (TextView) view.findViewById(R.id.phone_text);
        this.zzu = (ImageView) view.findViewById(R.id.phone_icon);
        this.zzr = (TextView) view.findViewById(R.id.website_text);
        this.zzs = (ImageView) view.findViewById(R.id.website_icon);
        this.zzv = (TextView) view.findViewById(R.id.plus_code_text);
        this.zzw = (ImageView) view.findViewById(R.id.plus_code_icon);
        this.zzl = (TextView) view.findViewById(R.id.open_status);
        this.zzm = (TextView) view.findViewById(R.id.open_status_and_time_spacer);
        this.zzn = (TextView) view.findViewById(R.id.next_open_or_close_time);
        this.zzo = (ImageView) view.findViewById(R.id.expand_open_hours);
        this.zzp = (RecyclerView) view.findViewById(R.id.expanded_open_hours);
        this.zzq = (ImageView) view.findViewById(R.id.open_hours_icon);
        zzbi zzbiVar = this.zzb;
        if (zzbiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar = null;
        }
        zzbiVar.zza().observe(getViewLifecycleOwner(), new zzak(new zzaj(this)));
    }
}
