package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzdy;
import com.google.android.libraries.places.internal.zzmo;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.internal.zzni;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zznk;
import com.google.android.libraries.places.internal.zznt;
import com.google.android.libraries.places.internal.zznx;
import com.google.android.libraries.places.internal.zzny;
import com.google.android.libraries.places.internal.zzoa;
import com.google.android.libraries.places.internal.zzoz;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import defpackage.ViewPortBuilder;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AutocompleteImplFragment extends Fragment {
    public static final /* synthetic */ int zza = 0;
    private final PlacesClient zzb;
    private final zzng zzc;
    private final zzoz zzd;
    private final zzdy zze;
    private zzny zzf;
    private PlaceSelectionListener zzg;
    private EditText zzh;
    private RecyclerView zzi;
    private View zzj;
    private View zzk;
    private View zzl;
    private View zzm;
    private View zzn;
    private View zzo;
    private View zzp;
    private View zzq;
    private TextView zzr;
    private TextView zzs;
    private zzah zzt;
    private final zzk zzu;

    private AutocompleteImplFragment(int i, PlacesClient placesClient, zzng zzngVar, zzoz zzozVar, zzdy zzdyVar) {
        super(i);
        this.zzu = new zzk(this, null);
        this.zzb = placesClient;
        this.zzc = zzngVar;
        this.zzd = zzozVar;
        this.zze = zzdyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzb(zzni zzniVar) {
        try {
            this.zzk.setVisibility(0);
            this.zzl.setVisibility(0);
            this.zzm.setVisibility(8);
            this.zzn.setVisibility(8);
            this.zzo.setVisibility(0);
            this.zzp.setVisibility(8);
            this.zzq.setVisibility(8);
            this.zzr.setVisibility(8);
            this.zzs.setVisibility(8);
            switch (zzniVar.zzg() - 1) {
                case 0:
                    zzng zzngVar = this.zzc;
                    if (TextUtils.isEmpty(zzngVar.zzf())) {
                        this.zzk.setVisibility(8);
                    }
                    this.zzh.requestFocus();
                    this.zzh.setText(zzngVar.zzf());
                    EditText editText = this.zzh;
                    editText.setSelection(editText.getText().length());
                    return;
                case 1:
                    this.zzt.submitList(null);
                    this.zzk.setVisibility(8);
                    this.zzh.getText().clear();
                    return;
                case 2:
                    this.zzm.setVisibility(0);
                    return;
                case 3:
                    this.zzs.setVisibility(8);
                    this.zzn.setVisibility(0);
                    this.zzo.setVisibility(8);
                    this.zzq.setVisibility(0);
                    this.zzr.setVisibility(0);
                    return;
                case 4:
                    this.zzt.submitList(zzniVar.zzb());
                    this.zzp.setVisibility(0);
                    return;
                case 5:
                    this.zzt.submitList(null);
                    this.zzo.setVisibility(8);
                    this.zzq.setVisibility(0);
                    this.zzs.setVisibility(4);
                    this.zzr.setText(getString(R.string.places_autocomplete_no_results_for_query, zzniVar.zza()));
                    this.zzr.setVisibility(0);
                    return;
                case 6:
                    break;
                case 7:
                default:
                    PlaceSelectionListener placeSelectionListener = this.zzg;
                    Place placeZzc = zzniVar.zzc();
                    Place place = placeZzc;
                    placeSelectionListener.onPlaceSelected(placeZzc);
                    return;
                case 8:
                    AutocompletePrediction autocompletePredictionZzd = zzniVar.zzd();
                    if (autocompletePredictionZzd == null) {
                        throw new NullPointerException("Prediction should not be null.");
                    }
                    AutocompletePrediction autocompletePrediction = autocompletePredictionZzd;
                    this.zzh.clearFocus();
                    EditText editText2 = this.zzh;
                    zzk zzkVar = this.zzu;
                    editText2.removeTextChangedListener(zzkVar);
                    this.zzh.setText(autocompletePredictionZzd.getPrimaryText(null));
                    this.zzh.addTextChangedListener(zzkVar);
                    break;
                    break;
                case 9:
                    PlaceSelectionListener placeSelectionListener2 = this.zzg;
                    Status statusZzf = zzniVar.zzf();
                    Status status = statusZzf;
                    placeSelectionListener2.onError(statusZzf);
                    return;
            }
            this.zzt.submitList(null);
            this.zzo.setVisibility(8);
            this.zzq.setVisibility(0);
            this.zzs.setVisibility(0);
            this.zzr.setText(getString(R.string.places_search_error));
            this.zzr.setVisibility(0);
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
            zzoa zzoaVar = new zzoa(zzngVar.zza(), null, zzngVar.zzd(), zzngVar.zzb(), zzngVar.zzf(), zzngVar.zzr(), this.zze);
            zzny zznyVar = (zzny) new ViewModelProvider(this, new zznx(new zznt(this.zzb, zzngVar, zzoaVar.zze(), zzmo.AUTOCOMPLETE_WIDGET), zzoaVar, this.zzd)).get(zzny.class);
            this.zzf = zznyVar;
            zznyVar.zzb(bundle);
            requireActivity().getOnBackPressedDispatcher().addCallback(this, new zza(this, true));
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.zzf.zzk();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.zzf.zzi();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzf.zzh();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        try {
            this.zzh = (EditText) view.findViewById(R.id.places_autocomplete_search_bar);
            this.zzi = (RecyclerView) view.findViewById(R.id.places_autocomplete_list);
            this.zzj = view.findViewById(R.id.places_autocomplete_back_button);
            this.zzk = view.findViewById(R.id.places_autocomplete_clear_button);
            this.zzl = view.findViewById(R.id.places_autocomplete_search_bar_separator);
            this.zzm = view.findViewById(R.id.places_autocomplete_progress);
            this.zzn = view.findViewById(R.id.places_autocomplete_try_again_progress);
            this.zzo = view.findViewById(R.id.places_autocomplete_powered_by_google);
            this.zzp = view.findViewById(R.id.places_autocomplete_powered_by_google_separator);
            this.zzq = view.findViewById(R.id.places_autocomplete_sad_cloud);
            this.zzr = (TextView) view.findViewById(R.id.places_autocomplete_error_message);
            this.zzs = (TextView) view.findViewById(R.id.places_autocomplete_try_again);
            this.zzh.addTextChangedListener(this.zzu);
            this.zzh.setOnFocusChangeListener(new zzl(null));
            EditText editText = this.zzh;
            zzng zzngVar = this.zzc;
            editText.setHint(TextUtils.isEmpty(zzngVar.zzg()) ? zznj.zze(requireContext(), R.string.places_autocomplete_search_hint) : zzngVar.zzg());
            int iOrdinal = zzngVar.zzb().ordinal();
            if (iOrdinal == 0) {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzc
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
                int iZzm = zzngVar.zzm();
                int iZzn = zzngVar.zzn();
                if (Color.alpha(iZzm) < 255) {
                    iZzm = 0;
                }
                if (iZzm != 0 && iZzn != 0) {
                    int iZza = zznk.zza(iZzm, ContextCompat.getColor(requireContext(), R.color.places_text_white_alpha_87), ContextCompat.getColor(requireContext(), R.color.places_text_black_alpha_87));
                    int iZza2 = zznk.zza(iZzm, ContextCompat.getColor(requireContext(), R.color.places_text_white_alpha_60), ContextCompat.getColor(requireContext(), R.color.places_text_black_alpha_60));
                    view.findViewById(R.id.places_autocomplete_search_bar_container).setBackgroundColor(iZzm);
                    Window window = requireActivity().getWindow();
                    window.setStatusBarColor(iZzn);
                    if (zznk.zzb(iZzn, -1, ViewCompat.MEASURED_STATE_MASK)) {
                        window.getDecorView().setSystemUiVisibility(8192);
                    }
                    this.zzh.setTextColor(iZza);
                    this.zzh.setHintTextColor(iZza2);
                    zznk.zzc((ImageView) this.zzj, iZza);
                    zznk.zzc((ImageView) this.zzk, iZza);
                }
            } else if (iOrdinal == 1) {
                requireActivity().getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzd
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        View view3 = view;
                        view3.setPaddingRelative(view3.getPaddingStart(), windowInsets.getSystemWindowInsetTop(), view3.getPaddingEnd(), view3.getPaddingBottom());
                        return windowInsets;
                    }
                });
            }
            this.zzj.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zze
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                    try {
                        this.zza.zzc(view2);
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
            this.zzk.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzf
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                    try {
                        this.zza.zzd(view2);
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
            this.zzs.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzh
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
            this.zzt = new zzah(new zzai() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzg
                private static final byte[] $$c = {12, -88, 33, 118};
                private static final int $$f = 230;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, -3, 26, -37, 48, 21, 8, 7, 0, 35, -33, 45, 0, 12, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
                private static final int $$e = 134;
                private static final byte[] $$a = {110, -73, -111, 99, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
                private static final int $$b = 143;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                private static int d = 1;
                private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 43627;
                private static char TuitionPaymentFragmentbindingInflater1 = 49982;
                private static char b = 5079;
                private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 47673;

                /* JADX WARN: Code duplicated, block: B:10:0x0028  */
                /* JADX WARN: Code duplicated, block: B:8:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
                    /*
                        byte[] r0 = com.google.android.libraries.places.widget.internal.autocomplete.ui.zzg.$$a
                        int r8 = r8 * 52
                        int r8 = 107 - r8
                        int r7 = r7 * 2
                        int r7 = 84 - r7
                        int r6 = r6 * 15
                        int r6 = r6 + 38
                        byte[] r1 = new byte[r6]
                        r2 = 0
                        if (r0 != 0) goto L16
                        r3 = r8
                        r4 = r2
                        goto L2f
                    L16:
                        r3 = r2
                    L17:
                        int r8 = r8 + 1
                        byte r4 = (byte) r7
                        r1[r3] = r4
                        int r3 = r3 + 1
                        if (r3 != r6) goto L28
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L28:
                        r4 = r0[r8]
                        r5 = r8
                        r8 = r7
                        r7 = r4
                        r4 = r3
                        r3 = r5
                    L2f:
                        int r8 = r8 + r7
                        int r7 = r8 + (-11)
                        r8 = r3
                        r3 = r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzg.a(short, short, int, java.lang.Object[]):void");
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0028  */
                /* JADX WARN: Code duplicated, block: B:8:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void e(byte r6, short r7, int r8, java.lang.Object[] r9) {
                    /*
                        int r7 = r7 * 31
                        int r7 = r7 + 84
                        int r8 = r8 * 13
                        int r8 = 16 - r8
                        int r6 = r6 * 39
                        int r0 = r6 + 14
                        byte[] r1 = com.google.android.libraries.places.widget.internal.autocomplete.ui.zzg.$$d
                        byte[] r0 = new byte[r0]
                        int r6 = r6 + 13
                        r2 = 0
                        if (r1 != 0) goto L18
                        r3 = r8
                        r4 = r2
                        goto L30
                    L18:
                        r3 = r2
                    L19:
                        int r8 = r8 + 1
                        byte r4 = (byte) r7
                        r0[r3] = r4
                        if (r3 != r6) goto L28
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        r9[r2] = r6
                        return
                    L28:
                        r4 = r1[r8]
                        int r3 = r3 + 1
                        r5 = r3
                        r3 = r8
                        r8 = r4
                        r4 = r5
                    L30:
                        int r7 = r7 + r8
                        int r7 = r7 + (-11)
                        r8 = r3
                        r3 = r4
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzg.e(byte, short, int, java.lang.Object[]):void");
                }

                private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                    int i2 = 2 % 2;
                    onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                    char[] cArr2 = new char[cArr.length - 2];
                    oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                    char[] cArr3 = new char[2];
                    while (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                        cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        int i3 = $10 + 15;
                        $11 = i3 % 128;
                        int i4 = i3 % 2;
                        int i5 = 58224;
                        for (int i6 = 0; i6 < 16; i6++) {
                            int i7 = $11 + 99;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            char c = cArr3[1];
                            char c2 = cArr3[0];
                            try {
                                Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (47773 - (ViewConfiguration.getTouchSlop() >> 8)), ((byte) KeyEvent.getModifierMetaStateMask()) + 469, View.combineMeasuredStates(0, 0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                }
                                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                cArr3[1] = cCharValue;
                                Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 47773), 468 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 13 - View.resolveSizeAndState(0, 0, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                }
                                cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                                i5 -= 40503;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr3[0] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2]);
                        cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                        Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 2323 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    }
                    objArr[0] = new String(cArr2, 0, i);
                }

                /* JADX WARN: Code duplicated, block: B:26:0x0208  */
                @Override // com.google.android.libraries.places.widget.internal.autocomplete.ui.zzai
                public final /* synthetic */ void zza(AutocompletePrediction autocompletePrediction, int i) throws Throwable {
                    Object[] objArr;
                    char c;
                    int i2 = 2 % 2;
                    AutocompleteImplFragment autocompleteImplFragment = this.zza;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iIndexOf = 2267 - TextUtils.indexOf("", "", 0, 0);
                        int windowTouchSlop = 33 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte[] bArr = $$a;
                        Object[] objArr2 = new Object[1];
                        a(bArr[132], bArr[7], bArr[37], objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, iIndexOf, windowTouchSlop, -887667012, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    c(new char[]{34425, 49471, 57648, 53906, 43207, 52838, 5097, 32295, 56507, 57724, 24478, 30300, 62662, 39767, 29898, 22546, 7493, 56515, 58661, 21874, 52981, 59337, 37845, 53378}, 22 - TextUtils.indexOf("", "", 0, 0), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(new char[]{5612, 41638, 18209, 34621, 60754, 24006, 10076, 31672, 49320, 1400, 48939, 63290, 12108, 24777, 33564, 10291, 65397, 60445}, KeyEvent.getDeadChar(0, 0) + 15, objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2267;
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 34;
                        byte[] bArr2 = $$a;
                        byte b2 = bArr2[132];
                        Object[] objArr5 = new Object[1];
                        a(b2, bArr2[7], b2, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, scrollBarSize, modifierMetaStateMask, -874156483, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
                        d = i3 % 128;
                        int i4 = i3 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int maximumDrawingCacheSize = 2267 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 33;
                            byte b3 = $$a[7];
                            byte b4 = b3;
                            Object[] objArr6 = new Object[1];
                            a(b3, b4, b4, objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, maximumDrawingCacheSize, iNormalizeMetaState, -654680577, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[]{i}, strArr, new int[]{i ^ (i << 5)}, new int[]{i}};
                        int i5 = ((int[]) objArr7[0])[0];
                        int i6 = ((int[]) objArr7[3])[0];
                        String[] strArr = (String[]) objArr7[1];
                        int i7 = (((((~((-981259313) | i)) | 172545024) * (-283)) - 1900652445) + ((~((-808714289) | i)) * 283)) - 1741937597;
                        int i8 = i7 ^ (i7 << 13);
                        int i9 = i8 ^ (i8 >>> 17);
                        c = 3;
                    } else {
                        Object[] objArr8 = new Object[1];
                        c(new char[]{2702, 43945, 14432, 4890, 2628, 2605, 26097, 30692, 52207, 41728, 13763, 3285, 41178, 15995, 27186, 23742, 32404, 23775, 26614, 32181, 30997, 25878, 19457, 22370, 37177, 54751, 39579, 63124}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25, objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        c(new char[]{38123, 52829, 23656, 53353, 48892, 35868, 27588, 50249, 5211, 42081, 41163, 28086, 7715, 48796, 16809, 64290, 49761, 17000, 47046, 50926}, 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr9);
                        Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            if (applicationContext instanceof ContextWrapper) {
                                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
                                d = i10 % 128;
                                if (i10 % 2 == 0) {
                                    ((ContextWrapper) applicationContext).getBaseContext();
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                    applicationContext = applicationContext.getApplicationContext();
                                } else {
                                    applicationContext = null;
                                }
                            } else {
                                applicationContext = applicationContext.getApplicationContext();
                            }
                        }
                        int i11 = d + 21;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                        int i12 = i11 % 2;
                        try {
                            Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, -1741937597};
                            byte[] bArr3 = $$d;
                            byte b5 = bArr3[11];
                            byte b6 = (byte) (-bArr3[18]);
                            Object[] objArr11 = new Object[1];
                            e(b5, b6, b6, objArr11);
                            Class<?> cls3 = Class.forName((String) objArr11[0]);
                            byte b7 = (byte) (-bArr3[18]);
                            byte b8 = bArr3[11];
                            Object[] objArr12 = new Object[1];
                            e(b7, b8, b8, objArr12);
                            objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                            if (applicationContext != null) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                    int iKeyCodeFromString = 2267 - KeyEvent.keyCodeFromString("");
                                    int i13 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32;
                                    byte b9 = $$a[7];
                                    byte b10 = b9;
                                    Object[] objArr13 = new Object[1];
                                    a(b9, b10, b10, objArr13);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, iKeyCodeFromString, i13, -654680577, false, (String) objArr13[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                                try {
                                    Object[] objArr14 = new Object[1];
                                    c(new char[]{34425, 49471, 57648, 53906, 43207, 52838, 5097, 32295, 56507, 57724, 24478, 30300, 62662, 39767, 29898, 22546, 7493, 56515, 58661, 21874, 52981, 59337, 37845, 53378}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 22, objArr14);
                                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                                    Object[] objArr15 = new Object[1];
                                    c(new char[]{5612, 41638, 18209, 34621, 60754, 24006, 10076, 31672, 49320, 1400, 48939, 63290, 12108, 24777, 33564, 10291, 65397, 60445}, 14 - ExpandableListView.getPackedPositionChild(0L), objArr15);
                                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i14 = 2267 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int mirror = AndroidCharacter.getMirror('0') - 15;
                                        byte[] bArr4 = $$a;
                                        byte b11 = bArr4[132];
                                        Object[] objArr16 = new Object[1];
                                        a(b11, bArr4[7], b11, objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i14, mirror, -874156483, false, (String) objArr16[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        int keyRepeatTimeout2 = 2267 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                        int iResolveSize = View.resolveSize(0, 0) + 33;
                                        byte[] bArr5 = $$a;
                                        Object[] objArr17 = new Object[1];
                                        a(bArr5[132], bArr5[7], bArr5[37], objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, keyRepeatTimeout2, iResolveSize, -887667012, false, (String) objArr17[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                } catch (Exception unused) {
                                    throw new RuntimeException();
                                }
                            }
                            c = 3;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i15 = ((int[]) objArr[c])[0];
                    int i16 = ((int[]) objArr[0])[0];
                    if (i16 == i15) {
                        int i17 = ((int[]) objArr[2])[0];
                        int i18 = ((int[]) objArr[0])[0];
                        int i19 = ((int[]) objArr[3])[0];
                        new int[1][0] = i18;
                        new int[1][0] = i19;
                        int i20 = i17 + (((~((-540699) | i)) * 521) - 1710993104) + (((~((~i) | (-540699))) | 235119169) * 521);
                        int i21 = (i20 << 13) ^ i20;
                        int i22 = i21 ^ (i21 >>> 17);
                        int[] iArr = {i22 ^ (i22 << 5)};
                    } else {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr2 = (String[]) objArr[1];
                        if (strArr2 != null) {
                            for (String str : strArr2) {
                                arrayList.add(str);
                            }
                        }
                        Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
                        int i23 = ((int[]) objArr[2])[0];
                        int i24 = ((int[]) objArr[0])[0];
                        int i25 = ((int[]) objArr[3])[0];
                        new int[1][0] = i24;
                        new int[1][0] = i25;
                        int i26 = ~i;
                        int i27 = i23 + (-1468645474) + ((967382505 | i26) * (-757)) + ((~(972889581 | i)) * 1514) + (((~(i26 | 158669189)) | 814220392 | (~((-5507077) | i))) * 757);
                        int i28 = (i27 << 13) ^ i27;
                        int i29 = i28 ^ (i28 >>> 17);
                        int[] iArr2 = {i29 ^ (i29 << 5)};
                        int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
                        d = i30 % 128;
                        int i31 = i30 % 2;
                    }
                    autocompleteImplFragment.zze(autocompletePrediction, i);
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$g(short r6, byte r7, int r8) {
                    /*
                        byte[] r0 = com.google.android.libraries.places.widget.internal.autocomplete.ui.zzg.$$c
                        int r7 = r7 * 3
                        int r7 = 4 - r7
                        int r6 = r6 * 3
                        int r6 = r6 + 1
                        int r8 = r8 * 2
                        int r8 = r8 + 108
                        byte[] r1 = new byte[r6]
                        r2 = 0
                        if (r0 != 0) goto L16
                        r3 = r6
                        r4 = r2
                        goto L2a
                    L16:
                        r3 = r2
                    L17:
                        byte r4 = (byte) r8
                        r1[r3] = r4
                        int r3 = r3 + 1
                        if (r3 != r6) goto L24
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        return r6
                    L24:
                        r4 = r0[r7]
                        r5 = r3
                        r3 = r8
                        r8 = r4
                        r4 = r5
                    L2a:
                        int r7 = r7 + 1
                        int r8 = -r8
                        int r8 = r8 + r3
                        r3 = r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzg.$$g(short, byte, int):java.lang.String");
                }
            });
            this.zzi.setLayoutManager(new LinearLayoutManager(requireContext()));
            this.zzi.setItemAnimator(new zzaf(getResources()));
            this.zzi.setAdapter(this.zzt);
            this.zzi.addOnScrollListener(new zzb(this));
            this.zzf.zza().observe(getViewLifecycleOwner(), new Observer() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzi
                @Override // androidx.p002lifecycle.Observer
                public final /* synthetic */ void onChanged(Object obj) {
                    this.zza.zzb((zzni) obj);
                }
            });
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    final /* synthetic */ void zzc(View view) {
        this.zzf.zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zze(AutocompletePrediction autocompletePrediction, int i) {
        try {
            this.zzf.zzd(autocompletePrediction, i);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzd(View view) {
        try {
            this.zzf.zzf();
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzf(View view) {
        try {
            this.zzf.zzg(this.zzh.getText().toString(), this.zzh.getSelectionEnd());
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    /* synthetic */ AutocompleteImplFragment(int i, PlacesClient placesClient, zzng zzngVar, zzoz zzozVar, zzdy zzdyVar, byte[] bArr) {
        this(i, placesClient, zzngVar, zzozVar, zzdyVar);
    }

    public final void zza(PlaceSelectionListener placeSelectionListener) {
        this.zzg = placeSelectionListener;
    }

    final /* synthetic */ zzny zzg() {
        return this.zzf;
    }

    final /* synthetic */ EditText zzh() {
        return this.zzh;
    }
}
