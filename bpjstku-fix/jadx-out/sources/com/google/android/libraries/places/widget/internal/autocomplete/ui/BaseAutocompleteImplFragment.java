package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzdy;
import com.google.android.libraries.places.internal.zzmo;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.internal.zzni;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zznt;
import com.google.android.libraries.places.internal.zznx;
import com.google.android.libraries.places.internal.zzny;
import com.google.android.libraries.places.internal.zzoa;
import com.google.android.libraries.places.internal.zzod;
import com.google.android.libraries.places.internal.zzoh;
import com.google.android.libraries.places.internal.zzoo;
import com.google.android.libraries.places.internal.zzoz;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.listener.PredictionSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import com.google.common.collect.ImmutableList;
import defpackage.ViewPortBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseAutocompleteImplFragment extends Fragment {
    public static final /* synthetic */ int zza = 0;
    private final PlacesClient zzb;
    private final zzng zzc;
    private final zzoz zzd;
    private final zzdy zze;
    private String zzf;
    private zzny zzg;
    private PlaceSelectionListener zzh;
    private PredictionSelectionListener zzi;
    private EditText zzj;
    private RecyclerView zzk;
    private View zzl;
    private View zzm;
    private View zzn;
    private LinearLayout zzo;
    private LinearLayout zzp;
    private TextView zzq;
    private ImageButton zzr;
    private zzn zzs;
    private final zzac zzt;
    private boolean zzu;

    private BaseAutocompleteImplFragment(int i, PlacesClient placesClient, zzng zzngVar, zzoz zzozVar, zzdy zzdyVar) {
        super(i);
        this.zzt = new zzac(this, null);
        this.zzu = false;
        this.zzb = placesClient;
        this.zzc = zzngVar;
        this.zzd = zzozVar;
        this.zze = zzdyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzi() {
        this.zzu = true;
        zzoo zzooVar = new zzoo(requireContext(), R.style.PlacesMaterialTheme, ImmutableList.asInterface());
        zzooVar.setTitle(R.string.google_maps_terms_title);
        zzooVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzz
            @Override // android.content.DialogInterface.OnDismissListener
            public final /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
                this.zza.zzh(dialogInterface);
            }
        });
        zzooVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzd(zzni zzniVar) {
        try {
            this.zzm.setVisibility(0);
            this.zzp.setVisibility(8);
            this.zzo.setVisibility(8);
            int iZzg = zzniVar.zzg() - 1;
            if (iZzg == 0) {
                zzng zzngVar = this.zzc;
                if (TextUtils.isEmpty(zzngVar.zzf())) {
                    this.zzm.setVisibility(8);
                }
                this.zzj.requestFocus();
                this.zzj.setText(zzngVar.zzf());
                EditText editText = this.zzj;
                editText.setSelection(editText.getText().length());
                return;
            }
            if (iZzg == 1) {
                this.zzs.submitList(null);
                this.zzm.setVisibility(8);
                this.zzj.getText().clear();
                return;
            }
            switch (iZzg) {
                case 4:
                    this.zzs.submitList(zzniVar.zzb());
                    this.zzo.setVisibility(0);
                    return;
                case 5:
                    this.zzs.submitList(null);
                    this.zzq.setText(this.zzf);
                    this.zzp.setVisibility(0);
                    this.zzo.setVisibility(0);
                    return;
                case 6:
                    break;
                case 7:
                    PlaceSelectionListener placeSelectionListener = this.zzh;
                    if (placeSelectionListener != null) {
                        Place placeZzc = zzniVar.zzc();
                        Place place = placeZzc;
                        placeSelectionListener.onPlaceSelected(placeZzc);
                    }
                    PredictionSelectionListener predictionSelectionListener = this.zzi;
                    if (predictionSelectionListener != null) {
                        AutocompletePrediction autocompletePredictionZzd = zzniVar.zzd();
                        AutocompletePrediction autocompletePrediction = autocompletePredictionZzd;
                        AutocompleteSessionToken autocompleteSessionTokenZze = zzniVar.zze();
                        AutocompleteSessionToken autocompleteSessionToken = autocompleteSessionTokenZze;
                        predictionSelectionListener.onPredictionSelected(autocompletePredictionZzd, autocompleteSessionTokenZze);
                        return;
                    }
                    return;
                case 8:
                    AutocompletePrediction autocompletePredictionZzd2 = zzniVar.zzd();
                    if (autocompletePredictionZzd2 == null) {
                        throw new NullPointerException("Prediction should not be null.");
                    }
                    AutocompletePrediction autocompletePrediction2 = autocompletePredictionZzd2;
                    this.zzj.clearFocus();
                    EditText editText2 = this.zzj;
                    zzac zzacVar = this.zzt;
                    editText2.removeTextChangedListener(zzacVar);
                    this.zzj.setText(autocompletePredictionZzd2.getPrimaryText(null));
                    this.zzj.addTextChangedListener(zzacVar);
                    break;
                    break;
                case 9:
                    PlaceSelectionListener placeSelectionListener2 = this.zzh;
                    if (placeSelectionListener2 != null) {
                        Status statusZzf = zzniVar.zzf();
                        Status status = statusZzf;
                        placeSelectionListener2.onError(statusZzf);
                    }
                    PredictionSelectionListener predictionSelectionListener2 = this.zzi;
                    if (predictionSelectionListener2 != null) {
                        Status statusZzf2 = zzniVar.zzf();
                        Status status2 = statusZzf2;
                        predictionSelectionListener2.onError(statusZzf2);
                    }
                    Status statusZzf3 = zzniVar.zzf();
                    if (statusZzf3 == null || statusZzf3.equals(Status.RESULT_CANCELED)) {
                        return;
                    }
                    this.zzq.setText(zznj.zze(requireContext(), R.string.autocomplete_error_loading_results_message));
                    this.zzp.setVisibility(0);
                    return;
                default:
                    return;
            }
            this.zzs.submitList(null);
            PlaceSelectionListener placeSelectionListener3 = this.zzh;
            if (placeSelectionListener3 != null) {
                Status statusZzf4 = zzniVar.zzf();
                Status status3 = statusZzf4;
                placeSelectionListener3.onError(statusZzf4);
            }
            PredictionSelectionListener predictionSelectionListener3 = this.zzi;
            if (predictionSelectionListener3 != null) {
                Status statusZzf5 = zzniVar.zzf();
                Status status4 = statusZzf5;
                predictionSelectionListener3.onError(statusZzf5);
            }
            this.zzq.setText(zznj.zze(requireContext(), R.string.autocomplete_error_loading_results_message));
            this.zzp.setVisibility(0);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzng zzngVar = this.zzc;
            zzoa zzoaVar = new zzoa(zzngVar.zza(), zzngVar.zzp(), zzngVar.zzd(), zzngVar.zzb(), zzngVar.zzf(), zzngVar.zzr(), this.zze);
            zzny zznyVar = (zzny) new ViewModelProvider(this, new zznx(new zznt(this.zzb, zzngVar, zzoaVar.zze(), zzngVar.zza() == zzoh.JWT_AND_ONE_PLATFORM ? zzmo.PLACES_UI_KIT : zzmo.ONE_PLATFORM_AUTOCOMPLETE_WIDGET), zzoaVar, this.zzd)).get(zzny.class);
            this.zzg = zznyVar;
            zznyVar.zzb(bundle);
            requireActivity().getOnBackPressedDispatcher().addCallback(this, new zzr(this, true));
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.zzg.zzi();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzg.zzh();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("arg-show-legal-disclosures", this.zzu);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        try {
            this.zzj = (EditText) view.findViewById(R.id.autocomplete_search_bar_edit_text);
            this.zzk = (RecyclerView) view.findViewById(R.id.autocomplete_prediction_list);
            this.zzl = view.findViewById(R.id.autocomplete_back_image_button);
            this.zzm = view.findViewById(R.id.autocomplete_clear_image_button);
            this.zzn = view.findViewById(R.id.autocomplete_google_maps_attribution_image_separator);
            this.zzo = (LinearLayout) view.findViewById(R.id.autocomplete_google_maps_attribution_image_container);
            this.zzp = (LinearLayout) view.findViewById(R.id.autocomplete_message_container);
            this.zzq = (TextView) view.findViewById(R.id.autocomplete_message_text_view);
            ImageButton imageButton = (ImageButton) view.findViewById(R.id.autocomplete_disclosure_icon);
            this.zzr = imageButton;
            imageButton.setOnClickListener(new zzs(this));
            this.zzf = zznj.zze(requireContext(), R.string.autocomplete_no_matching_results_for_query);
            this.zzj.addTextChangedListener(this.zzt);
            this.zzj.setOnFocusChangeListener(new zzad(null));
            zzng zzngVar = this.zzc;
            int iOrdinal = zzngVar.zzb().ordinal();
            if (iOrdinal == 0) {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzu
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        View view3 = view;
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMargins(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
                            view3.setLayoutParams(marginLayoutParams);
                        }
                        return windowInsets;
                    }
                });
            } else if (iOrdinal == 1) {
                requireActivity().getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzv
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        View view3 = view;
                        view3.setPaddingRelative(view3.getPaddingStart(), windowInsets.getSystemWindowInsetTop(), view3.getPaddingEnd(), view3.getPaddingBottom());
                        return windowInsets;
                    }
                });
                this.zzn.setVisibility(8);
            }
            this.zzl.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzw
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                    try {
                        this.zza.zze(view2);
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
            this.zzm.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzx
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                    try {
                        this.zza.zzf(view2);
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
            this.zzs = new zzn(new zzp() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzy
                @Override // com.google.android.libraries.places.widget.internal.autocomplete.ui.zzp
                public final /* synthetic */ void zza(AutocompletePrediction autocompletePrediction, int i) {
                    this.zza.zzg(autocompletePrediction, i);
                }
            }, zzngVar);
            this.zzk.setLayoutManager(new LinearLayoutManager(requireContext()));
            this.zzk.setItemAnimator(new zzaf(getResources()));
            this.zzk.setAdapter(this.zzs);
            this.zzk.addOnScrollListener(new zzt(this));
            AutocompleteUiCustomization autocompleteUiCustomizationZzp = zzngVar.zzp();
            if (autocompleteUiCustomizationZzp != null) {
                String zzd = autocompleteUiCustomizationZzp.getZzd();
                if (zzd == null) {
                    zzd = zznj.zze(requireContext(), R.string.autocomplete_search_hint);
                }
                this.zzj.setHint(zzd);
                String zzb = autocompleteUiCustomizationZzp.getZzb();
                if (zzb != null) {
                    this.zzf = zzb;
                }
            }
            Context context = getContext();
            if (context != null) {
                int iZza = zzod.zza(context, R.style.AutocompleteFullscreen);
                ((ImageView) requireView().findViewById(R.id.autocomplete_google_maps_attribution_image)).setColorFilter(iZza);
                ((ImageButton) requireView().findViewById(R.id.autocomplete_disclosure_icon)).setColorFilter(iZza);
            }
            this.zzg.zza().observe(getViewLifecycleOwner(), new Observer() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzaa
                @Override // androidx.p002lifecycle.Observer
                public final /* synthetic */ void onChanged(Object obj) {
                    this.zza.zzd((zzni) obj);
                }
            });
            if (bundle != null) {
                boolean z = bundle.getBoolean("arg-show-legal-disclosures");
                this.zzu = z;
                if (z) {
                    zzi();
                }
            }
            this.zzg.zzl();
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public final void zza() {
        this.zzg.zzk();
    }

    final /* synthetic */ void zze(View view) {
        this.zzg.zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzg(AutocompletePrediction autocompletePrediction, int i) {
        try {
            this.zzg.zzd(autocompletePrediction, i);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzf(View view) {
        try {
            this.zzg.zzf();
            this.zzj.requestFocus();
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    /* synthetic */ BaseAutocompleteImplFragment(int i, PlacesClient placesClient, zzng zzngVar, zzoz zzozVar, zzdy zzdyVar, byte[] bArr) {
        this(i, placesClient, zzngVar, zzozVar, zzdyVar);
    }

    public final void zzb(PlaceSelectionListener placeSelectionListener) {
        this.zzh = placeSelectionListener;
    }

    public final void zzc(PredictionSelectionListener predictionSelectionListener) {
        this.zzi = predictionSelectionListener;
    }

    final /* synthetic */ void zzh(DialogInterface dialogInterface) {
        this.zzu = false;
    }

    final /* synthetic */ zzny zzj() {
        return this.zzg;
    }

    final /* synthetic */ EditText zzk() {
        return this.zzj;
    }
}
