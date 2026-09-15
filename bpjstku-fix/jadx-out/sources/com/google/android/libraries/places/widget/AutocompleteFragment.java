package com.google.android.libraries.places.widget;

import android.app.Fragment;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.common.collect.ImmutableList;
import defpackage.ViewPortBuilder;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class AutocompleteFragment extends Fragment {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int b;
    private View zza;
    private View zzb;
    private EditText zzc;
    private LocationBias zzd;
    private LocationRestriction zze;
    private String zzf;
    private TypeFilter zzg;
    private ImmutableList zzh;
    private PlaceSelectionListener zzi;
    private static final byte[] $$c = {99, -43, -44, -62};
    private static final int $$f = 219;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = r6 + 84
            int r8 = 53 - r8
            byte[] r0 = com.google.android.libraries.places.widget.AutocompleteFragment.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r6 = r7
            r4 = r8
            r3 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L29:
            int r4 = -r4
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.AutocompleteFragment.c(int, short, int, java.lang.Object[]):void");
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
    private static void d(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = 108 - r7
            int r8 = 653 - r8
            int r9 = r9 + 76
            byte[] r0 = com.google.android.libraries.places.widget.AutocompleteFragment.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r9 = r8
            r4 = r2
            goto L28
        L11:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
        L28:
            int r8 = r8 + r3
            int r8 = r8 + (-1)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.AutocompleteFragment.d(int, int, short, java.lang.Object[]):void");
    }

    private final void zzb() {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 3;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0 ? true == this.zzc.getText().toString().isEmpty() : true == this.zzc.getText().toString().isEmpty()) {
            i = 8;
        } else {
            int i4 = b + 61;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        }
        this.zzb.setVisibility(i);
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = b + 81;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            super.onDestroyView();
            int i4 = b + 103;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public void setText(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 47;
        b = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.zzc.setText(charSequence);
                zzb();
                throw null;
            }
            this.zzc.setText(charSequence);
            zzb();
            int i3 = b + 17;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public void setHint(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 63;
        b = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (charSequence == null) {
                int i5 = i2 + 79;
                b = i5 % 128;
                if (i5 % 2 != 0) {
                    getString(R.string.places_autocomplete_search_hint);
                    throw null;
                }
                charSequence = getString(R.string.places_autocomplete_search_hint);
            }
            this.zzc.setHint(charSequence);
            this.zza.setContentDescription(charSequence);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public void setPlaceFields(List<Place.Field> list) {
        int i = 2 % 2;
        int i2 = b + 105;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (list == null) {
                throw new NullPointerException("Place Fields must not be null.");
            }
            this.zzh = ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(list);
            getView().setEnabled(true);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 73;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        try {
            getView().setEnabled(true);
            if (i == 30421) {
                if (this.zzi == null) {
                    int i4 = TuitionPaymentFragmentbindingInflater1 + 61;
                    b = i4 % 128;
                    if (i4 % 2 != 0) {
                        Log.isLoggable("Places", 2);
                    } else {
                        Log.isLoggable("Places", 5);
                    }
                } else if (i2 == -1) {
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    this.zzi.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
                } else if (i2 == 2) {
                    this.zzi.onError(Autocomplete.getStatusFromIntent(intent));
                    i2 = 2;
                }
                i = 30421;
            }
            super.onActivityResult(i, i2, intent);
            int i5 = TuitionPaymentFragmentbindingInflater1 + 9;
            b = i5 % 128;
            int i6 = i5 % 2;
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        try {
            View viewInflate = layoutInflater.inflate(R.layout.places_autocomplete_fragment, viewGroup, false);
            this.zza = viewInflate.findViewById(R.id.places_autocomplete_search_button);
            this.zzb = viewInflate.findViewById(R.id.places_autocomplete_clear_button);
            this.zzc = (EditText) viewInflate.findViewById(R.id.places_autocomplete_search_input);
            this.zzc.setHint(zznj.zze(layoutInflater.getContext(), R.string.places_autocomplete_search_hint));
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzd
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        this.zza.zza(view);
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            };
            this.zza.setOnClickListener(onClickListener);
            this.zzc.setOnClickListener(onClickListener);
            this.zzb.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzc
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                    try {
                        this.zza.setText("");
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
            zzb();
            viewInflate.setEnabled(false);
            int i2 = b + 73;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            return viewInflate;
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r4.zzh == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        throw new java.lang.NullPointerException("Place Fields must be set.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r0 = new com.google.android.libraries.places.widget.Autocomplete.IntentBuilder(com.google.android.libraries.places.widget.model.AutocompleteActivityMode.OVERLAY, r4.zzh);
        r0.setInitialQuery(r4.zzc.getText().toString());
        r0.setHint(r4.zzc.getHint().toString());
        r0.setCountry(r4.zzf);
        r0.setLocationBias(r4.zzd);
        r0.setLocationRestriction(r4.zze);
        r0.setTypeFilter(r4.zzg);
        r0.zza(com.google.android.libraries.places.internal.zzoc.FRAGMENT);
        r0 = r0.build(getActivity());
        getView().setEnabled(false);
        startActivityForResult(r0, 30421);
        r0 = com.google.android.libraries.places.widget.AutocompleteFragment.TuitionPaymentFragmentbindingInflater1 + 19;
        com.google.android.libraries.places.widget.AutocompleteFragment.b = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (getView().isEnabled() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (getView().isEnabled() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void zza(android.view.View r5) {
        /*
            r4 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.google.android.libraries.places.widget.AutocompleteFragment.TuitionPaymentFragmentbindingInflater1
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.google.android.libraries.places.widget.AutocompleteFragment.b = r1
            int r0 = r0 % r5
            r1 = 0
            if (r0 == 0) goto L1d
            android.view.View r0 = r4.getView()
            boolean r0 = r0.isEnabled()
            r2 = 66
            int r2 = r2 / r1
            if (r0 == 0) goto L27
            goto L34
        L1d:
            android.view.View r0 = r4.getView()
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L34
        L27:
            com.google.common.collect.ImmutableList r5 = r4.zzh
            if (r5 == 0) goto L2c
            return
        L2c:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "Place Fields must be set."
            r5.<init>(r0)
            throw r5
        L34:
            com.google.android.libraries.places.widget.Autocomplete$IntentBuilder r0 = new com.google.android.libraries.places.widget.Autocomplete$IntentBuilder
            com.google.android.libraries.places.widget.model.AutocompleteActivityMode r2 = com.google.android.libraries.places.widget.model.AutocompleteActivityMode.OVERLAY
            com.google.common.collect.ImmutableList r3 = r4.zzh
            r0.<init>(r2, r3)
            android.widget.EditText r2 = r4.zzc
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r0.setInitialQuery(r2)
            android.widget.EditText r2 = r4.zzc
            java.lang.CharSequence r2 = r2.getHint()
            java.lang.String r2 = r2.toString()
            r0.setHint(r2)
            java.lang.String r2 = r4.zzf
            r0.setCountry(r2)
            com.google.android.libraries.places.api.model.LocationBias r2 = r4.zzd
            r0.setLocationBias(r2)
            com.google.android.libraries.places.api.model.LocationRestriction r2 = r4.zze
            r0.setLocationRestriction(r2)
            com.google.android.libraries.places.api.model.TypeFilter r2 = r4.zzg
            r0.setTypeFilter(r2)
            com.google.android.libraries.places.internal.zzoc r2 = com.google.android.libraries.places.internal.zzoc.FRAGMENT
            r0.zza(r2)
            android.app.Activity r2 = r4.getActivity()
            android.content.Intent r0 = r0.build(r2)
            android.view.View r2 = r4.getView()
            r2.setEnabled(r1)
            r1 = 30421(0x76d5, float:4.2629E-41)
            r4.startActivityForResult(r0, r1)
            int r0 = com.google.android.libraries.places.widget.AutocompleteFragment.TuitionPaymentFragmentbindingInflater1
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.google.android.libraries.places.widget.AutocompleteFragment.b = r1
            int r0 = r0 % r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.AutocompleteFragment.zza(android.view.View):void");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 117;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 5;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 64838), 1355 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 39, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - View.MeasureSpec.getMode(0)), 468 - TextUtils.getOffsetAfter("", 0), 13 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1489695626
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instruction units count: 12356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.AutocompleteFragment.onCreate(android.os.Bundle):void");
    }

    public void setCountry(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 71;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.zzf = str;
        int i5 = i2 + 55;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLocationBias(LocationBias locationBias) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 111;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzd = locationBias;
        int i5 = i2 + 79;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setLocationRestriction(LocationRestriction locationRestriction) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.zze = locationRestriction;
        int i5 = i3 + 47;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.zzi = placeSelectionListener;
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
    }

    public void setTypeFilter(TypeFilter typeFilter) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 103;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.zzg = typeFilter;
        int i5 = i2 + 19;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        byte[] bArr = new byte[691];
        System.arraycopy("\u0013Nrq\rÿÂ:\t\u0001ù\u0006úÊ4\u000e÷\u000fþûüË@õ\u0014ò\u000eøù\fÃ6\rþ\u0004\u0004½H\u0000ö\u0004þ\föý\u000f¼ \u0015\u0014ò\u000eøù\fÙ6öô\rýûá-þ\u0004\u0004\u0002²\u0001\"4ýò\u000eýô\fè'ö\u0007õþ\u0010öûê\u0016\rö\u0003þÑ\u0006ü\"õ\fö\u0007\u0000ã\u0012\u0019õù\n\u0007Ó-ð\u0007\u0007ù\n\u0007\u0000þöÿ\u0007ù\fþ\u0006ÿþ\u0006ø\u0000\u0013ôý\u0013×#ö\u0002\bù\u0002\u0002ü\u0015ø\t¿\rÿÂ:\t\u0001ù\u0006úÊ4\u000e÷\u000fþûüË?þú\u0011ð\u0012øý\u000f¼Cýö\u0003\u0003\u000f¼%ÓFü\"õ\fö\u0007\u0000ã\u0012\u0019õù\n\u0007Ó-ð\u0007\u0007ù\n\u0007\u0000þöÿ\u0007ù\fþ\u0006ÿþ\u0006ø\u0000\u0013ôý\u0013×#ö\u0002\bù\u0002\u0002ü\u0015ø\t¾\rÿÂ5\u000fû\n\u0002ø\u000bºC\u0003ô\u000fó\n\u0007î\u0014ö\u0007\u0000ÁFñ\u0006\bþö\u0012\u0002ö\u0002\b¿6\r\u0000ù\u0004\nüÂ&\u0011\u0006\bþö\u0012Ò-\u0000ù\u0004\nüÕ#\u0012ö\u000eô\f\u0006¬Pþöÿ\u0007ù\f¹\u0001F\u0006ÿþ\u0006ø\u0000ÁSôý\u0013×#ö\u0002\b¹A\u0002\u0002ü\u0015ø\t±\u000e\"õ\fö\u0007\u0000ã\u0012\u0019õù\n\u0007Ó-ð\u0007\u0007ù\n\u0007\u0000þöÿ\u0007ù\fþ\u0006ÿþ\u0006ø\u0000\u0013ôý\u0013×#ö\u0002\bù\u0002\u0002ü\u0015ø\tÀ\rÿÂ5\u000fû\n\u0002ø\u000bº7þ\u0014îÎC\u0003þÿ\u0003À##þÿ\u0003Ö\u001e\u0014îó\"ü\u0004ôÀ\u0001\"4ýò\u000eýô\fè'ö\u0007õþ\u0010öûê\u0016\rö\u0003þÔ\rÿÂ:\t\u0001ù\u0006úÊ9\u0004\nôþ\u0000\u0013óÊ6\u0010ð\u0013ö\u0005\u000eüöû\u0011¼<\u0006\u0007ò\u000eýô\fÃ@\u0003ö\u0002\bÃ\u00145\u0000üè\f\f\nñûå0ð\u0013ö\u0005\u000eüöû\u0011à\u0014\f\u0000\u0004\u0003ìõ\u0013\u000f\u0001÷\u0007\u0000òç2ð\n\u0007ìô\u001eþ\u0001\u0004\u0007\u0000Î3\u0001÷ÿ\b\u0000ù\n\u0007±\u000e\rÿÂ:\t\u0001ù\u0006úÊ4\u000e÷\u000fþûüË@õ\u0014ò\u000eøù\fÃ<\u0006\u0007ò\u000eýô\fÃ%\u0014\u0012ð\u000e\u0002ï\u0002\u000búÝ.ü\u0005õ\u0014ò\u0000ó\f\f\nñå&\u0007ò\u000eÿ\u0000þö\u0014ü\u0004\u0016\u0019÷\u0007\u0000Ö&ö\n\nð\u0002à\"\u0010òÿ\u0012ü\u0004\"õ\fö\u0007\u0000ã\u0012\u0019õù\n\u0007Ó-ð\u0007\u0007ù\n\u0007ï\b\u0006÷\u0006\u0006úã&ù\u0007ö\u0014ò\u000eÀ".getBytes("ISO-8859-1"), 0, bArr, 0, 691);
        $$d = bArr;
        $$e = 51;
        $$a = new byte[]{31, 115, -100, -11, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
        $$b = 29;
        b = 0;
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -8355991872155933553L;
    }

    private static String $$g(byte b2, short s, short s2) {
        int i = s * 2;
        byte[] bArr = $$c;
        int i2 = 4 - (b2 * 4);
        int i3 = (s2 * 2) + 107;
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = i2 + i4;
            i2++;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i3;
            i5 = i6;
            i3 = bArr[i2] + i7;
            i2++;
        }
    }
}
