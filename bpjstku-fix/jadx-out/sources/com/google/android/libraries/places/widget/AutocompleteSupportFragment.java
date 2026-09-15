package com.google.android.libraries.places.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zznf;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zzoc;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.common.collect.ImmutableList;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.abortCapture;
import defpackage.initSession;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public class AutocompleteSupportFragment extends Fragment {
    private final MutableLiveData zza;
    private final MutableLiveData zzb;
    private zznf zzc;
    private PlaceSelectionListener zzd;

    public AutocompleteSupportFragment() {
        super(R.layout.places_autocomplete_fragment);
        this.zza = new MutableLiveData();
        this.zzb = new MutableLiveData();
        this.zzc = zzng.zzt(AutocompleteActivityMode.OVERLAY, ImmutableList.asInterface(), zzoc.FRAGMENT);
    }

    public static AutocompleteSupportFragment newInstance() {
        return new AutocompleteSupportFragment();
    }

    private final void zze(View view) {
        view.setVisibility(true != TextUtils.isEmpty((CharSequence) this.zza.getValue()) ? 0 : 8);
    }

    private final void zzf() {
        Intent intentBuild = new Autocomplete.IntentBuilder(this.zzc.zzs()).build(requireContext());
        if (requireView().isEnabled()) {
            requireView().setEnabled(false);
            startActivityForResult(intentBuild, 30421);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzg(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setHint(charSequence);
            view.setContentDescription(charSequence);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzc(EditText editText, View view, CharSequence charSequence) {
        try {
            editText.setText(charSequence);
            zze(view);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 30421) {
            try {
                PlaceSelectionListener placeSelectionListener = this.zzd;
                if (placeSelectionListener == null) {
                    Log.isLoggable("Places", 5);
                    return;
                }
                if (intent == null) {
                    Log.isLoggable("Places", 6);
                } else {
                    if (i2 != -1) {
                        placeSelectionListener.onError(Autocomplete.getStatusFromIntent(intent));
                        return;
                    }
                    Place placeFromIntent = Autocomplete.getPlaceFromIntent(intent);
                    placeSelectionListener.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getName());
                }
            } catch (Error | RuntimeException e2) {
                zzmr.zzb(e2);
                throw e2;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                zzng zzngVar = (zzng) bundle.getParcelable("options");
                if (zzngVar != null) {
                    MutableLiveData mutableLiveData = this.zza;
                    if (mutableLiveData.getValue() == null) {
                        mutableLiveData.postValue(zzngVar.zzf());
                    }
                    MutableLiveData mutableLiveData2 = this.zzb;
                    if (mutableLiveData2.getValue() == null) {
                        mutableLiveData2.postValue(zzngVar.zzg());
                    }
                    this.zzc = zzngVar.zzs();
                }
            } catch (Error | RuntimeException e2) {
                zzmr.zzb(e2);
                throw e2;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requireView().setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("options", this.zzc.zzs());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        final View viewFindViewById = view.findViewById(R.id.places_autocomplete_search_button);
        final View viewFindViewById2 = view.findViewById(R.id.places_autocomplete_clear_button);
        final EditText editText = (EditText) view.findViewById(R.id.places_autocomplete_search_input);
        editText.setHint(zznj.zze(requireContext(), R.string.places_autocomplete_search_hint));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzi
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    this.zza.zza(view2);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        editText.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zze
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    this.zza.zzb(view2);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzf
            private static final byte[] $$a = {114, -115, 48, 84};
            private static final int $$b = 110;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int asBinder = 1;
            private static long b = 1815927262432542538L;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
            private static char TuitionPaymentFragmentbindingInflater1 = 34097;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1056375429723561437L;

            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    this.zza.setText(null);
                    ViewPortBuilder.b();
                    int i4 = asBinder + 31;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                } catch (Throwable th) {
                    ViewPortBuilder.b();
                    throw th;
                }
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                Object obj;
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                while (true) {
                    obj = null;
                    if (abortcapture.b >= cArrB.length) {
                        break;
                    }
                    int i3 = $10 + 31;
                    $11 = i3 % 128;
                    int i4 = i3 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i5 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.getSize(0) + 64838), TextUtils.indexOf((CharSequence) "", '0', 0) + 1357, 38 - (Process.myTid() >> 22), 894276454, false, $$c(b2, (byte) (b2 + 5), (byte) (-1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 468 - View.MeasureSpec.getMode(0), ImageFormat.getBitsPerPixel(0) + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
                int i6 = $11 + 109;
                $10 = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                SessionProcessor sessionProcessor = new SessionProcessor();
                int length = cArr2.length;
                char[] cArr4 = new char[length];
                int length2 = cArr.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr3.length;
                char[] cArr6 = new char[length3];
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    int i3 = $11 + 59;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - View.getDefaultSize(0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1235, 35 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -653973969, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getTrimmedLength(""), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2764, (Process.myPid() >> 22) + 14, 1504416861, false, $$c(b4, b5, (byte) (b5 - 3)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43324), MotionEvent.axisFromString("") + 254, 22 - (ViewConfiguration.getScrollBarSize() >> 8), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 65200), (KeyEvent.getMaxKeyCode() >> 16) + 2891, 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2012627446, false, $$c(b6, b7, (byte) (-b7)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr6);
                int i5 = $11 + 73;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r3v32 */
            /* JADX WARN: Type inference failed for: r4v40 */
            /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Class] */
            /* JADX WARN: Type inference failed for: r7v112 */
            /* JADX WARN: Type inference failed for: r7v12, types: [int] */
            /* JADX WARN: Type inference failed for: r7v127, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r7v138, types: [int] */
            /* JADX WARN: Type inference failed for: r7v139 */
            /* JADX WARN: Type inference failed for: r7v14 */
            /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Class[]] */
            /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r7v43 */
            /* JADX WARN: Type inference failed for: r7v58, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v62 */
            /* JADX WARN: Type inference failed for: r7v82 */
            /* JADX WARN: Type inference failed for: r7v85, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v89, types: [int] */
            public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2) {
                ?? Invoke;
                char c;
                int maximumDrawingCacheSize;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                Object obj;
                char[] cArr;
                char[] cArr2;
                char mirror;
                int i10;
                int i11;
                int i12;
                Class<?> cls;
                Object obj2;
                Object obj3;
                int i13;
                int i14;
                int i15 = 2 % 2;
                if (context != null) {
                    try {
                        char[] cArr3 = {47739, 37560, 38218, 48717};
                        char[] cArr4 = {7085, 14348, 50186, 1224};
                        int i16 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int iTuitionPaymentFragmentbindingInflater1 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                        int i17 = i16 * 371;
                        int i18 = (i17 & 19068287) + (i17 | 19068287);
                        int i19 = ~iTuitionPaymentFragmentbindingInflater1;
                        int i20 = ~(((-51398) ^ i19) | ((-51398) & i19));
                        int i21 = ~i16;
                        int i22 = ~((i21 ^ iTuitionPaymentFragmentbindingInflater1) | (i21 & iTuitionPaymentFragmentbindingInflater1));
                        int i23 = -(-(((i20 ^ i22) | (i20 & i22)) * (-370)));
                        int i24 = (i18 ^ i23) + ((i18 & i23) << 1);
                        int i25 = ~((i21 ^ i19) | (i21 & i19));
                        int i26 = ~(((-51398) ^ iTuitionPaymentFragmentbindingInflater1) | (iTuitionPaymentFragmentbindingInflater1 & (-51398)));
                        int i27 = (i25 & i26) | (i25 ^ i26);
                        int i28 = ~((51397 & i16) | (i16 ^ 51397));
                        int i29 = -(-(((i27 & i28) | (i27 ^ i28)) * (-370)));
                        int i30 = ((i24 | i29) << 1) - (i29 ^ i24);
                        int i31 = -(-(i28 * 370));
                        char c2 = (char) ((i30 & i31) + (i31 | i30));
                        long elapsedCpuTime = Process.getElapsedCpuTime();
                        int i32 = asBinder;
                        int i33 = ((i32 | 19) << 1) - (i32 ^ 19);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i33 % 128;
                        int i34 = i33 % 2;
                        int i35 = -(elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1));
                        int i36 = ((171445276 | i35) << 1) - (i35 ^ 171445276);
                        Object[] objArr = new Object[1];
                        a(cArr3, cArr4, c2, i36, new char[]{64087, 38451, 15152, 40002, 25784, 44510, 8119, 2071, 16719, 55505, 39550, 33325, 34793, 31817, 58304, 11937, 30984, 31676, 39455, 24555, 25690, 6737, 51841, 10656, 51610, 5765, 31434, 23411, 21394, 49410, 65495}, objArr);
                        String str = (String) objArr[0];
                        int i37 = asBinder;
                        int i38 = (i37 & 113) + (i37 | 113);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i38 % 128;
                        Invoke = i38 % 2;
                        try {
                            try {
                                int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                                int i39 = ~edgeSlop;
                                int i40 = ~((i39 ^ (-2)) | (i39 & (-2)));
                                int i41 = ~edgeSlop;
                                int i42 = ~((i41 ^ i) | (i41 & i));
                                int i43 = ((edgeSlop * (-495)) - 495) + (((i40 & i42) | (i40 ^ i42)) * 992);
                                int i44 = ~((i41 ^ (-2)) | (i41 & (-2)));
                                int i45 = ~((i39 & i) | (i39 ^ i));
                                int i46 = (i45 & i44) | (i44 ^ i45);
                                int i47 = ~i;
                                int i48 = (edgeSlop & i47) | (i47 ^ edgeSlop);
                                int i49 = ~((i48 & 1) | (i48 ^ 1));
                                int i50 = (i43 - (~(-(-(((i49 & i46) | (i46 ^ i49)) * (-496)))))) - 1;
                                int i51 = i & 1;
                                int i52 = -(-(((i ^ 1) | i51) * 496));
                                int i53 = (i50 ^ i52) + ((i52 & i50) << 1);
                                Object[] objArr2 = new Object[1];
                                c(new char[]{56954, 16996, 56848, 8084, 43461, 13758, 61588, 52885, 238, 5357, 53637, 61373, 25537, 30594, 45736, 36005, 17098, 22114, 37760, 43601, 42431, 45435, 29914, 19210, 33950, 36870, 21942, 26680, 59356, 62335, 14175, 2380, 50750, 53787, 6156, 54793, 10612, 11548, 63787, 63268, 2135, 3087}, i53, objArr2);
                                ?? cls2 = Class.forName((String) objArr2[0]);
                                Invoke = new Class[]{String.class};
                                Object objNewInstance = cls2.getDeclaredConstructor(Invoke).newInstance(str);
                                char[] cArr5 = {47739, 37560, 38218, 48717};
                                char[] cArr6 = {39237, 22252, 62917, 373};
                                int i54 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                                asBinder = i54 % 128;
                                if (i54 % 2 == 0) {
                                    c = (char) (27039 / (TypedValue.complexToFloat(0) > 2.0f ? 1 : (TypedValue.complexToFloat(0) == 2.0f ? 0 : -1)));
                                    maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() << 123;
                                } else {
                                    int i55 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                    c = (char) ((i55 ^ 30197) + ((i55 & 30197) << 1));
                                    maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                }
                                int i56 = -maximumDrawingCacheSize;
                                char c3 = c;
                                int i57 = ((-496) * i56) - 1483368560;
                                int i58 = ~i56;
                                int i59 = -(-((~(i58 | 984159078)) * 497));
                                int i60 = ((i57 | i59) << 1) - (i57 ^ i59);
                                int i61 = (i58 ^ 984159078) | (i58 & 984159078);
                                int i62 = ~((i61 ^ i) | (i61 & i));
                                int i63 = ~i;
                                int i64 = ~(984159078 | i63 | i56);
                                int i65 = -(-(((i62 ^ i64) | (i64 & i62)) * 497));
                                int i66 = (i60 & i65) + (i60 | i65);
                                int i67 = ~((i58 ^ i63) | (i58 & i63));
                                int i68 = ~((i58 ^ (-984159079)) | (i58 & (-984159079)));
                                int i69 = ((~(984159078 | i56 | i)) | (i67 ^ i68) | (i67 & i68)) * 497;
                                Object[] objArr3 = new Object[1];
                                a(cArr5, cArr6, c3, ((i66 | i69) << 1) - (i69 ^ i66), new char[]{1941, 34881, 51789, 17508, 62488, 39244, 22352, 10751, 6447, 62774, 17673, 23698, 49499, 47315, 11832, 37537, 21142, 46012, 7677, 29821, 40052, 14592, 41379, 56345, 10922, 36125, 48136, 10404, 14532, 11924, 1688}, objArr3);
                                Invoke = (String) objArr3[0];
                                int i70 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i71 = ((i70 | 35) << 1) - (i70 ^ 35);
                                asBinder = i71 % 128;
                                int i72 = i71 % 2;
                                try {
                                    Object[] objArr4 = {Invoke};
                                    char[] cArr7 = {56954, 16996, 56848, 8084, 43461, 13758, 61588, 52885, 238, 5357, 53637, 61373, 25537, 30594, 45736, 36005, 17098, 22114, 37760, 43601, 42431, 45435, 29914, 19210, 33950, 36870, 21942, 26680, 59356, 62335, 14175, 2380, 50750, 53787, 6156, 54793, 10612, 11548, 63787, 63268, 2135, 3087};
                                    int trimmedLength = TextUtils.getTrimmedLength("");
                                    int i73 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                                    asBinder = i73 % 128;
                                    int i74 = i73 % 2;
                                    int iTuitionPaymentFragmentbindingInflater2 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                    int i75 = trimmedLength * (-109);
                                    int i76 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i77 = ((i76 | 75) << 1) - (i76 ^ 75);
                                    asBinder = i77 % 128;
                                    if (i77 % 2 == 0) {
                                        i3 = i75 << 111;
                                        i4 = ~trimmedLength;
                                        i5 = (iTuitionPaymentFragmentbindingInflater2 ^ 1) | (iTuitionPaymentFragmentbindingInflater2 & 1);
                                    } else {
                                        i3 = i75 + 111;
                                        i4 = ~trimmedLength;
                                        i5 = iTuitionPaymentFragmentbindingInflater2 | 1;
                                    }
                                    int i78 = ~i5;
                                    int i79 = (i3 - (~(-(-((-220) * ((i4 ^ i78) | (i4 & i78))))))) - 1;
                                    int i80 = ~((trimmedLength ^ 1) | (trimmedLength & 1));
                                    int i81 = ~((iTuitionPaymentFragmentbindingInflater2 & 1) | (iTuitionPaymentFragmentbindingInflater2 ^ 1));
                                    int i82 = i79 + (((i81 & i80) | (i80 ^ i81)) * 220);
                                    int i83 = ~trimmedLength;
                                    int i84 = ~((i83 & 1) | (i83 ^ 1));
                                    int i85 = ~((trimmedLength & (-2)) | ((-2) ^ trimmedLength));
                                    int i86 = ((i85 & i84) | (i84 ^ i85)) * 110;
                                    int i87 = (i82 ^ i86) + ((i86 & i82) << 1);
                                    Object[] objArr5 = new Object[1];
                                    c(cArr7, i87, objArr5);
                                    Invoke = 0;
                                    Object objNewInstance2 = Class.forName((String) objArr5[0]).getDeclaredConstructor(String.class).newInstance(objArr4);
                                    try {
                                        char[] cArr8 = {50948, 4029, 51045, 40248, 12029, 30824, 29226, 18878, 6535, 22899, 21310, 26830, 31423, 14913, 12312, 2944, 23461, 7084, 4470, 11558, 48375, 64697, 63088, 52328, 40445, 56722, 55134};
                                        int i88 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int i89 = i88 * (-958);
                                        int i90 = (i89 ^ (-958)) + ((i89 & (-958)) << 1);
                                        int i91 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i92 = i91 + 39;
                                        asBinder = i92 % 128;
                                        if (i92 % 2 != 0) {
                                            int i93 = ~(((-2) ^ i47) | ((-2) & i47));
                                            int i94 = ~i88;
                                            int i95 = ~((i94 ^ i) | (i94 & i));
                                            int i96 = (i93 ^ i95) | (i93 & i95);
                                            int i97 = i91 + 109;
                                            asBinder = i97 % 128;
                                            int i98 = i97 % 2;
                                            int i99 = ~(i47 | i88);
                                            int i100 = (i90 - (~(-(-(959 * ((i96 & i99) | (i96 ^ i99))))))) - 1;
                                            int i101 = -(-((~((i88 ^ 1) | (i88 & 1))) * (-959)));
                                            int i102 = (i100 & i101) + (i101 | i100);
                                            int i103 = i91 + 27;
                                            asBinder = i103 % 128;
                                            int i104 = i103 % 2;
                                            int i105 = ~i88;
                                            int i106 = ~((i105 & i47) | (i105 ^ i47));
                                            int i107 = ~(((-2) ^ i) | ((-2) & i));
                                            int i108 = ((~(i88 | i)) | (i106 & i107) | (i106 ^ i107)) * 959;
                                            int i109 = (i102 ^ i108) + ((i108 & i102) << 1);
                                            Object[] objArr6 = new Object[1];
                                            c(cArr8, i109, objArr6);
                                            Class<?> cls3 = Class.forName((String) objArr6[0]);
                                            int i110 = -(-View.resolveSize(0, 0));
                                            int i111 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                            Object[] objArr7 = new Object[1];
                                            a(new char[]{47739, 37560, 38218, 48717}, new char[]{20007, 17477, 10209, 40751}, (char) ((i110 & 12071) + (i110 | 12071)), (i111 & (-515619506)) + (i111 | (-515619506)), new char[]{41754, 9738, 16492, 61772, 24561, 38961, 33634, 15870, 45229, 60717, 28779, 12651, 23932, 56873, 3855, 39955, 57252}, objArr7);
                                            String str2 = (String) objArr7[0];
                                            int i112 = asBinder + 77;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i112 % 128;
                                            int i113 = i112 % 2;
                                            Invoke = cls3.getMethod(str2, null).invoke(context, null);
                                            try {
                                                char[] cArr9 = {50948, 4029, 51045, 40248, 12029, 30824, 29226, 18878, 6535, 22899, 21310, 26830, 31423, 14913, 12312, 2944, 23461, 7084, 4470, 11558, 48375, 64697, 63088, 52328, 40445, 56722, 55134};
                                                int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                int iTuitionPaymentFragmentbindingInflater3 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                                int i114 = scrollDefaultDelay * 50;
                                                int i115 = asBinder + 125;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i115 % 128;
                                                if (i115 % 2 != 0) {
                                                    int i116 = ~iTuitionPaymentFragmentbindingInflater3;
                                                    i6 = (scrollDefaultDelay * (-4850)) - (98 >>> ((~(((-2) ^ i116) | (i116 & (-2)))) | (~(((-2) ^ scrollDefaultDelay) | ((-2) & scrollDefaultDelay)))));
                                                } else {
                                                    int i117 = (i114 ^ (-97)) + ((i114 & (-97)) << 1);
                                                    int i118 = ~((~iTuitionPaymentFragmentbindingInflater3) | (-2));
                                                    int i119 = ~((-2) | scrollDefaultDelay);
                                                    i6 = i117 + (((i119 & i118) | (i118 ^ i119)) * 98);
                                                }
                                                int i120 = ~scrollDefaultDelay;
                                                int i121 = ~iTuitionPaymentFragmentbindingInflater3;
                                                int i122 = ~((i120 & i121) | (i120 ^ i121));
                                                int i123 = (i122 & (-2)) | ((-2) ^ i122);
                                                int i124 = ~((scrollDefaultDelay ^ iTuitionPaymentFragmentbindingInflater3) | (scrollDefaultDelay & iTuitionPaymentFragmentbindingInflater3));
                                                int i125 = -(-((-49) * ((i123 & i124) | (i123 ^ i124))));
                                                int i126 = (i6 ^ i125) + ((i125 & i6) << 1);
                                                int i127 = ~(iTuitionPaymentFragmentbindingInflater3 | (-2));
                                                int i128 = ~((scrollDefaultDelay & 1) | (scrollDefaultDelay ^ 1));
                                                int i129 = -(-(((i127 & i128) | (i127 ^ i128)) * 49));
                                                int i130 = (i126 ^ i129) + ((i129 & i126) << 1);
                                                try {
                                                    Object[] objArr8 = new Object[1];
                                                    c(cArr9, i130, objArr8);
                                                    Class<?> cls4 = Class.forName((String) objArr8[0]);
                                                    char[] cArr10 = {55861, 41249, 55890, 6937, 65430, 55039, 62491, 39159, 1208, 63461, 54544, 47594, 26506, 38103, 46617, 56062, 18076, 46395};
                                                    int i131 = -View.combineMeasuredStates(0, 0);
                                                    int i132 = i131 * (-344);
                                                    int i133 = (i132 & (-344)) + (i132 | (-344));
                                                    int i134 = ~i131;
                                                    int i135 = ~((i134 ^ (-2)) | (i134 & (-2)));
                                                    int i136 = ~i131;
                                                    int i137 = ~((i136 ^ i) | (i136 & i));
                                                    int i138 = (i133 - (~(-(-(((i135 ^ i137) | (i135 & i137)) * 345))))) - 1;
                                                    int i139 = asBinder;
                                                    int i140 = (i139 ^ 1) + ((i139 & 1) << 1);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i140 % 128;
                                                    if (i140 % 2 != 0) {
                                                        int i141 = ~((i134 ^ i47) | (i134 & i47));
                                                        int i142 = ~(((-2) ^ i131) | (i131 & (-2)));
                                                        i8 = i138 >> (344 - (~((i142 & i141) | (i141 ^ i142))));
                                                        i9 = i134 ^ (-2);
                                                        i7 = -2;
                                                    } else {
                                                        i7 = -2;
                                                        int i143 = ~(i134 | i63);
                                                        int i144 = ~(((-2) ^ i131) | (i131 & (-2)));
                                                        i8 = (((i143 ^ i144) | (i144 & i143)) * 345) + i138;
                                                        i9 = i134 ^ (-2);
                                                    }
                                                    int i145 = (i134 & i7) | i9;
                                                    int i146 = -(-(345 * (~((i145 & i) | (i145 ^ i)))));
                                                    int i147 = (i8 & i146) + (i8 | i146);
                                                    Object[] objArr9 = new Object[1];
                                                    c(cArr10, i147, objArr9);
                                                    try {
                                                        Object[] objArr10 = {cls4.getMethod((String) objArr9[0], null).invoke(context, null), 64};
                                                        char[] cArr11 = {47739, 37560, 38218, 48717};
                                                        char[] cArr12 = {26827, 1009, 44418, 55734};
                                                        char c4 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                                        int iTuitionPaymentFragmentbindingInflater4 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                                        int i148 = iResolveSizeAndState * 569;
                                                        int i149 = (i148 ^ (-87846872)) + ((i148 & (-87846872)) << 1);
                                                        int i150 = ~iResolveSizeAndState;
                                                        int i151 = (i150 ^ 2113670807) | (2113670807 & i150);
                                                        int i152 = i51;
                                                        int i153 = ~i151;
                                                        Object obj4 = objNewInstance2;
                                                        int i154 = ~iTuitionPaymentFragmentbindingInflater4;
                                                        int i155 = ~((i150 ^ i154) | (i154 & i150));
                                                        int i156 = (i155 & i153) | (i153 ^ i155);
                                                        int i157 = ~iTuitionPaymentFragmentbindingInflater4;
                                                        int i158 = i149 + ((i156 | (~((2113670807 ^ i157) | (2113670807 & i157)))) * (-1136));
                                                        int i159 = ~iResolveSizeAndState;
                                                        int i160 = ~((i159 & iTuitionPaymentFragmentbindingInflater4) | (i159 ^ iTuitionPaymentFragmentbindingInflater4));
                                                        int i161 = ~(2113670807 | iTuitionPaymentFragmentbindingInflater4);
                                                        int i162 = (i160 ^ i161) | (i160 & i161);
                                                        int i163 = (iResolveSizeAndState & i157) | (i157 ^ iResolveSizeAndState);
                                                        int i164 = ~((i163 ^ (-2113670808)) | (i163 & (-2113670808)));
                                                        int i165 = -(-(((i162 ^ i164) | (i162 & i164)) * (-568)));
                                                        int i166 = (i158 ^ i165) + ((i158 & i165) << 1);
                                                        int i167 = ~i163;
                                                        int i168 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
                                                        Object obj5 = objNewInstance;
                                                        asBinder = i168 % 128;
                                                        int i169 = i168 % 2;
                                                        int i170 = -(-(568 * ((~(((-2113670808) & i157) | (i157 ^ (-2113670808)))) | i167 | (~(i151 | iTuitionPaymentFragmentbindingInflater4)))));
                                                        Object[] objArr11 = new Object[1];
                                                        a(cArr11, cArr12, c4, (i166 & i170) + (i170 | i166), new char[]{31047, 37762, 7571, 348, 29168, 16836, 57776, 23730, 4460, 37238, 60918, 48312, 46546, 27958, 62283, 42942, 21472, 26427, 38948, 54109, 28810, 61936, 45079, 23592, 15655, 20186, 6459, 58596, 42178, 34426, 42527, 24784, 14553}, objArr11);
                                                        Class<?> cls5 = Class.forName((String) objArr11[0]);
                                                        int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                                                        int i171 = longPressTimeout * 471;
                                                        int i172 = ((i171 | 20226624) << 1) - (i171 ^ 20226624);
                                                        int i173 = -(-(((longPressTimeout ^ 42944) | (longPressTimeout & 42944)) * (-470)));
                                                        int i174 = (i172 & i173) + (i173 | i172);
                                                        int i175 = ~longPressTimeout;
                                                        int i176 = (~((i175 & (-42945)) | (i175 ^ (-42945)))) | (~(((-42945) & i) | ((-42945) ^ i)));
                                                        int i177 = 42944 | (i63 ^ longPressTimeout) | (i63 & longPressTimeout);
                                                        int i178 = ~i177;
                                                        int i179 = i174 + (((i176 & i178) | (i176 ^ i178)) * (-470));
                                                        int i180 = (longPressTimeout & (-42945)) | ((-42945) ^ longPressTimeout);
                                                        int i181 = ~((i180 & i) | (i180 ^ i));
                                                        int i182 = ~i177;
                                                        Object[] objArr12 = new Object[1];
                                                        a(new char[]{47739, 37560, 38218, 48717}, new char[]{22017, 1546, 49274, 37799}, (char) ((i179 - (~(-(-(((i181 & i182) | (i181 ^ i182)) * 470))))) - 1), TextUtils.indexOf("", "", 0), new char[]{60502, 42201, 64249, 59791, 22156, 8558, 22790, 56101, 41038, 14126, 17897, 57450, 22964, 44558}, objArr12);
                                                        Object objInvoke = cls5.getMethod((String) objArr12[0], String.class, Integer.TYPE).invoke(Invoke, objArr10);
                                                        try {
                                                            Object[] objArr13 = new Object[1];
                                                            c(new char[]{29762, 51437, 29731, 1040, 8885, 48952, 60162, 17910, 43713, 40483, 51734, 25734, 51705, 64785, 43312, 1992, 59619, 56572, 34910, 8558, 3970, 15339, 28440, 49156, 11967, 6873, 20073, 58137, 19885, 31179, 11431, 33378, 27728, 22701}, 0 - (~(-((Process.getThreadPriority(0) + 20) >> 6))), objArr13);
                                                            Class<?> cls6 = Class.forName((String) objArr13[0]);
                                                            Object[] objArr14 = new Object[1];
                                                            a(new char[]{47739, 37560, 38218, 48717}, new char[]{59252, 15143, 53310, 51870}, (char) View.getDefaultSize(0, 0), Process.myTid() >> 22, new char[]{28199, 52992, 38260, 11357, 32510, 34118, 37223, 48998, 13379, 51070}, objArr14);
                                                            Object[] objArr15 = (Object[]) cls6.getField((String) objArr14[0]).get(objInvoke);
                                                            int length = objArr15.length;
                                                            int i183 = 0;
                                                            while (true) {
                                                                if (i183 < length) {
                                                                    int i184 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                                                                    asBinder = i184 % 128;
                                                                    if (i184 % 2 == 0) {
                                                                        obj = objArr15[i183];
                                                                        cArr = new char[]{47739, 37560, 38218, 48717};
                                                                        cArr2 = new char[]{52403, 46125, 54309, 2233};
                                                                        mirror = AndroidCharacter.getMirror('h');
                                                                    } else {
                                                                        obj = objArr15[i183];
                                                                        cArr = new char[]{47739, 37560, 38218, 48717};
                                                                        cArr2 = new char[]{52403, 46125, 54309, 2233};
                                                                        mirror = AndroidCharacter.getMirror('0');
                                                                    }
                                                                    char[] cArr13 = cArr;
                                                                    char[] cArr14 = cArr2;
                                                                    int iTuitionPaymentFragmentbindingInflater5 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                                                    int i185 = mirror * 868;
                                                                    int i186 = (i185 ^ 41250832) + ((i185 & 41250832) << 1);
                                                                    int i187 = ~((-335942299) | i47);
                                                                    int i188 = -(-(((i187 & (-770073440)) | ((-770073440) ^ i187)) * (-602)));
                                                                    int i189 = ((-2122457460) ^ i188) + ((i188 & (-2122457460)) << 1);
                                                                    int i190 = ~(((-335942299) & i) | ((-335942299) ^ i));
                                                                    int i191 = (335942298 & i47) | (i47 ^ 335942298);
                                                                    int i192 = -(-(((i190 & 268439680) | (268439680 ^ i190) | (~((i191 & (-770073440)) | (i191 ^ (-770073440))))) * (-301)));
                                                                    int i193 = ((((i189 | i192) << 1) - (i192 ^ i189)) - (~((~((i47 ^ (-770073440)) | ((-770073440) & i47))) * 301))) - 1;
                                                                    int i194 = ~(((-153421410) ^ i63) | ((-153421410) & i63));
                                                                    int i195 = ~((-879266138) | i47);
                                                                    int i196 = (-1275374936) + (((i194 ^ i195) | (i194 & i195)) * (-867));
                                                                    int i197 = ~(((-153421410) & i) | ((-153421410) ^ i));
                                                                    int i198 = ((2097217 ^ i197) | (i197 & 2097217) | (~(((-879266138) ^ i) | ((-879266138) & i)))) * (-1734);
                                                                    int i199 = ((i196 | i198) << 1) - (i198 ^ i196);
                                                                    int i200 = ~(((-2097218) & i47) | ((-2097218) ^ i47));
                                                                    int i201 = ~(((-151324193) & i) | ((-151324193) ^ i));
                                                                    int i202 = (i200 & i201) | (i200 ^ i201);
                                                                    int i203 = ~(((-877168921) & i) | ((-877168921) ^ i));
                                                                    if (i193 > (i199 - (~(-(-(((i202 & i203) | (i202 ^ i203)) * 867))))) - 1) {
                                                                        throw null;
                                                                    }
                                                                    int i204 = ~mirror;
                                                                    int i205 = ~iTuitionPaymentFragmentbindingInflater5;
                                                                    int i206 = ~((i204 & i205) | (i204 ^ i205));
                                                                    int i207 = ~iTuitionPaymentFragmentbindingInflater5;
                                                                    int i208 = ~((i207 & (-47525)) | ((-47525) ^ i207));
                                                                    int i209 = ((i206 & i208) | (i206 ^ i208)) * (-867);
                                                                    int i210 = (i186 ^ i209) + ((i209 & i186) << 1);
                                                                    int i211 = ~mirror;
                                                                    int i212 = ~((i211 ^ (-47525)) | (i211 & (-47525)));
                                                                    int i213 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                                                                    asBinder = i213 % 128;
                                                                    if (i213 % 2 == 0) {
                                                                        int i214 = (~(i211 | iTuitionPaymentFragmentbindingInflater5)) | i212;
                                                                        int i215 = ~((-47525) | iTuitionPaymentFragmentbindingInflater5);
                                                                        i10 = i210 * ((-1734) / ((i214 & i215) | (i214 ^ i215)));
                                                                    } else {
                                                                        int i216 = ~((i211 & iTuitionPaymentFragmentbindingInflater5) | (i211 ^ iTuitionPaymentFragmentbindingInflater5));
                                                                        int i217 = (i216 & i212) | (i212 ^ i216);
                                                                        int i218 = ~((-47525) | iTuitionPaymentFragmentbindingInflater5);
                                                                        int i219 = ((i217 & i218) | (i217 ^ i218)) * (-1734);
                                                                        i10 = ((i210 | i219) << 1) - (i219 ^ i210);
                                                                    }
                                                                    int i220 = ((mirror ^ 65535) & (-47525)) | (47524 ^ mirror);
                                                                    int i221 = ~iTuitionPaymentFragmentbindingInflater5;
                                                                    int i222 = ~((i220 & i221) | (i220 ^ i221));
                                                                    int i223 = ~mirror;
                                                                    int i224 = (i223 & 47524) | (i223 ^ 47524);
                                                                    int i225 = (mirror & 18011) | (18011 ^ mirror);
                                                                    int i226 = -(-(867 * ((~((i225 & iTuitionPaymentFragmentbindingInflater5) | (i225 ^ iTuitionPaymentFragmentbindingInflater5))) | i222 | (~((i224 & iTuitionPaymentFragmentbindingInflater5) | (i224 ^ iTuitionPaymentFragmentbindingInflater5))))));
                                                                    char c5 = (char) ((i10 & i226) + (i226 | i10));
                                                                    int i227 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                    Object[] objArr16 = new Object[1];
                                                                    a(cArr13, cArr14, c5, ((i227 | 632565196) << 1) - (i227 ^ 632565196), new char[]{13750, 6097, 3845, 44227, 26243}, objArr16);
                                                                    Invoke = 0;
                                                                    try {
                                                                        Object[] objArr17 = {(String) objArr16[0]};
                                                                        Object[] objArr18 = new Object[1];
                                                                        c(new char[]{6785, 15753, 6891, 29484, 29649, 19027, 39980, 5249, 50243, 27485, 48427, 13743, 42796, 2152, 56843, 22188, 34364, 10712, 65397, 28737, 24899, 52886, 6180, 37235, 16504, 61356, 14666, 45685, 9071, 36003, 23473, 54025, 641, 44483, 29824, 3093, 60802, 21222, 38293, 11570, 52404}, -((byte) KeyEvent.getModifierMetaStateMask()), objArr18);
                                                                        Class<?> cls7 = Class.forName((String) objArr18[0]);
                                                                        Object[] objArr19 = new Object[1];
                                                                        c(new char[]{29351, 43551, 29376, 53683, 18079, 56769, 16049, 8679, 44069, 64715, 8101, 227, 53009, 40943, 31896}, 0 - (~(-(-TextUtils.indexOf("", "")))), objArr19);
                                                                        Invoke = cls7.getMethod((String) objArr19[0], String.class).invoke(null, objArr17);
                                                                        try {
                                                                            int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                                            Object[] objArr20 = new Object[1];
                                                                            a(new char[]{47739, 37560, 38218, 48717}, new char[]{58761, 38696, 27745, 64864}, (char) (((windowTouchSlop | 24684) << 1) - (windowTouchSlop ^ 24684)), (-2) - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), new char[]{35699, 65075, 29725, 34729, 45729, 63794, 36246, 36237, 40479, 32091, 61217, 7768, 44010, Typography.almostEqual, 42624, 2946, 57849, 47452, 53897, 64717, 4075, 23892, 30299, 16010, 53444, 25490, 27532, 34228}, objArr20);
                                                                            Class<?> cls8 = Class.forName((String) objArr20[0]);
                                                                            Object[] objArr21 = new Object[1];
                                                                            c(new char[]{63822, 8410, 63802, 26357, 8497, 22286, 35265, 18041, 10198, 30232, 43222, 26462, 17636, 5416, 52162}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr21);
                                                                            try {
                                                                                Object[] objArr22 = {new ByteArrayInputStream((byte[]) cls8.getMethod((String) objArr21[0], null).invoke(obj, null))};
                                                                                Object[] objArr23 = new Object[1];
                                                                                c(new char[]{6785, 15753, 6891, 29484, 29649, 19027, 39980, 5249, 50243, 27485, 48427, 13743, 42796, 2152, 56843, 22188, 34364, 10712, 65397, 28737, 24899, 52886, 6180, 37235, 16504, 61356, 14666, 45685, 9071, 36003, 23473, 54025, 641, 44483, 29824, 3093, 60802, 21222, 38293, 11570, 52404}, -Process.getGidForName(""), objArr23);
                                                                                Class<?> cls9 = Class.forName((String) objArr23[0]);
                                                                                char[] cArr15 = {47739, 37560, 38218, 48717};
                                                                                char[] cArr16 = {14449, 21964, 44124, 55414};
                                                                                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                                                                                int iTuitionPaymentFragmentbindingInflater6 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                                                                                int i228 = iCombineMeasuredStates * (-721);
                                                                                int i229 = (i228 & (-21903980)) + (i228 | (-21903980));
                                                                                int i230 = ~iTuitionPaymentFragmentbindingInflater6;
                                                                                int i231 = ~iCombineMeasuredStates;
                                                                                Object[] objArr24 = objArr15;
                                                                                int i232 = ~(i231 | (-30381));
                                                                                int i233 = (i230 ^ i232) | (i232 & i230);
                                                                                int i234 = length;
                                                                                int i235 = (iCombineMeasuredStates & 30380) | (iCombineMeasuredStates ^ 30380);
                                                                                int i236 = ~i235;
                                                                                int i237 = (i229 - (~(((i233 ^ i236) | (i233 & i236)) * 1444))) - 1;
                                                                                int i238 = ~i235;
                                                                                int i239 = ~((iCombineMeasuredStates ^ iTuitionPaymentFragmentbindingInflater6) | (iCombineMeasuredStates & iTuitionPaymentFragmentbindingInflater6));
                                                                                int i240 = ((i238 & i239) | (i238 ^ i239) | (~((iTuitionPaymentFragmentbindingInflater6 ^ 30380) | (iTuitionPaymentFragmentbindingInflater6 & 30380)))) * (-1444);
                                                                                int i241 = (i237 ^ i240) + ((i237 & i240) << 1);
                                                                                int i242 = ~((i231 ^ 30380) | (i231 & 30380));
                                                                                int i243 = ~((-30381) | iCombineMeasuredStates);
                                                                                char c6 = (char) ((i241 - (~(((i242 & i243) | (i242 ^ i243)) * 722))) - 1);
                                                                                int i244 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                                int i245 = ~i244;
                                                                                int i246 = (i245 & i63) | (i245 ^ i63);
                                                                                int i247 = ((i244 * 784) - (-1549127496)) + ((~((i246 & 1549126713) | (i246 ^ 1549126713))) * (-783));
                                                                                int i248 = ~i244;
                                                                                int i249 = ~((i63 ^ 1549126713) | (1549126713 & i63));
                                                                                int i250 = -(-(((i248 & i249) | (i248 ^ i249)) * 783));
                                                                                int i251 = ((i247 | i250) << 1) - (i250 ^ i247);
                                                                                char[] cArr17 = {7083, 28432, 26982, 57293, 39335, 22476, 33777, 14715, 36863, 24889, 13461, 36064, 56182, 15758, 62522, 51281, 56956, 43483, 4197};
                                                                                int i252 = asBinder;
                                                                                int i253 = ((i252 | 83) << 1) - (i252 ^ 83);
                                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i253 % 128;
                                                                                int i254 = i253 % 2;
                                                                                Object[] objArr25 = new Object[1];
                                                                                a(cArr15, cArr16, c6, i251, cArr17, objArr25);
                                                                                Object objInvoke2 = cls9.getMethod((String) objArr25[0], InputStream.class).invoke(Invoke, objArr22);
                                                                                int i255 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 - (-1);
                                                                                asBinder = i255 % 128;
                                                                                int i256 = i255 % 2;
                                                                                try {
                                                                                    char[] cArr18 = {15508, 31890, 15614, 18487, 15203, 2888, 42807, 23603, 57942, 10822, 34352, 32029, 33081, 18803, 58640, 7710, 41001, 26819, 50286, 14579, 18262, 36749, 9023, 55770, 26173, 44789, 540, 64237, 1401, 52643, 24765, 39859, 9350, 60628, 20414, 17575, 52096, 5100};
                                                                                    Invoke = Color.blue(0);
                                                                                    int i257 = -Invoke;
                                                                                    int i258 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
                                                                                    int i259 = i258 % 128;
                                                                                    asBinder = i259;
                                                                                    if (i258 % 2 == 0) {
                                                                                        i11 = (483 % i257) >>> 242;
                                                                                    } else {
                                                                                        int i260 = i257 * 483;
                                                                                        i11 = (i260 | 242) + (i260 & 242);
                                                                                    }
                                                                                    int i261 = ~i257;
                                                                                    int i262 = ~(i261 | (-2));
                                                                                    int i263 = i259 + 43;
                                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i263 % 128;
                                                                                    if (i263 % 2 != 0) {
                                                                                        int i264 = ~i257;
                                                                                        int i265 = ~((i264 & i63) | (i264 ^ i63));
                                                                                        i12 = i11 * ((-241) >> ((i265 & i262) | (i262 ^ i265)));
                                                                                    } else {
                                                                                        int i266 = ~((i261 ^ i63) | (i261 & i63));
                                                                                        int i267 = ((i266 & i262) | (i262 ^ i266)) * (-241);
                                                                                        i12 = ((i11 | i267) << 1) - (i11 ^ i267);
                                                                                    }
                                                                                    int i268 = (i261 & i47) | (i261 ^ i47);
                                                                                    int i269 = i12 + ((-482) * ((i257 ^ 1) | (i257 & 1))) + (((~((i257 & (-2)) | ((-2) ^ i257))) | (~((i268 & 1) | (i268 ^ 1)))) * 241);
                                                                                    Object[] objArr26 = new Object[1];
                                                                                    c(cArr18, i269, objArr26);
                                                                                    String str3 = (String) objArr26[0];
                                                                                    int i270 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                                    int i271 = ((i270 | 5) << 1) - (i270 ^ 5);
                                                                                    asBinder = i271 % 128;
                                                                                    if (i271 % 2 == 0) {
                                                                                        cls = Class.forName(str3);
                                                                                        int i272 = -(-(ViewConfiguration.getMinimumFlingVelocity() << 71));
                                                                                        int i273 = (i272 ^ 1) + ((i272 & 1) << 1);
                                                                                        Object[] objArr27 = new Object[1];
                                                                                        c(new char[]{35511, 55908, 35536, 22951, 32089, 44474, 46757, 6715, 21550, 36001, 38831, 15137, 14092, 61315, 62641, 22629, 5699, 52779, 54733, 32478, 61806, 10593, 13026, 40913, 53339, 2130, 5081}, i273, objArr27);
                                                                                        obj2 = objArr27[0];
                                                                                    } else {
                                                                                        cls = Class.forName(str3);
                                                                                        Object[] objArr28 = new Object[1];
                                                                                        c(new char[]{35511, 55908, 35536, 22951, 32089, 44474, 46757, 6715, 21550, 36001, 38831, 15137, 14092, 61315, 62641, 22629, 5699, 52779, 54733, 32478, 61806, 10593, 13026, 40913, 53339, 2130, 5081}, 0 - (~(-(-(ViewConfiguration.getMinimumFlingVelocity() >> 16)))), objArr28);
                                                                                        obj2 = objArr28[0];
                                                                                    }
                                                                                    Object objInvoke3 = cls.getMethod((String) obj2, null).invoke(objInvoke2, null);
                                                                                    Object obj6 = obj5;
                                                                                    if (!obj6.equals(objInvoke3)) {
                                                                                        int i274 = asBinder + 111;
                                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i274 % 128;
                                                                                        Invoke = 2;
                                                                                        if (i274 % 2 != 0) {
                                                                                            try {
                                                                                                Object[] objArr29 = new Object[1];
                                                                                                c(new char[]{15508, 31890, 15614, 18487, 15203, 2888, 42807, 23603, 57942, 10822, 34352, 32029, 33081, 18803, 58640, 7710, 41001, 26819, 50286, 14579, 18262, 36749, 9023, 55770, 26173, 44789, 540, 64237, 1401, 52643, 24765, 39859, 9350, 60628, 20414, 17575, 52096, 5100}, -TextUtils.indexOf((CharSequence) "", 'Z', 1, 1), objArr29);
                                                                                                Class<?> cls10 = Class.forName((String) objArr29[0]);
                                                                                                Object[] objArr30 = new Object[1];
                                                                                                c(new char[]{35511, 55908, 35536, 22951, 32089, 44474, 46757, 6715, 21550, 36001, 38831, 15137, 14092, 61315, 62641, 22629, 5699, 52779, 54733, 32478, 61806, 10593, 13026, 40913, 53339, 2130, 5081}, 0 % View.MeasureSpec.getSize(0), objArr30);
                                                                                                Invoke = cls10.getMethod((String) objArr30[0], null);
                                                                                                obj3 = obj4;
                                                                                                if (!obj3.equals(Invoke.invoke(objInvoke2, null))) {
                                                                                                    int i275 = i183 + 86;
                                                                                                    i183 = (i275 | (-85)) + (i275 & (-85));
                                                                                                    i152 = i152;
                                                                                                    obj4 = obj3;
                                                                                                    obj5 = obj6;
                                                                                                    objArr15 = objArr24;
                                                                                                    length = i234;
                                                                                                }
                                                                                            } catch (Throwable th) {
                                                                                                Throwable cause = th.getCause();
                                                                                                if (cause != null) {
                                                                                                    throw cause;
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } else {
                                                                                            obj3 = obj4;
                                                                                            Object[] objArr31 = new Object[1];
                                                                                            c(new char[]{15508, 31890, 15614, 18487, 15203, 2888, 42807, 23603, 57942, 10822, 34352, 32029, 33081, 18803, 58640, 7710, 41001, 26819, 50286, 14579, 18262, 36749, 9023, 55770, 26173, 44789, 540, 64237, 1401, 52643, 24765, 39859, 9350, 60628, 20414, 17575, 52096, 5100}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr31);
                                                                                            Class<?> cls11 = Class.forName((String) objArr31[0]);
                                                                                            int i276 = -(-View.MeasureSpec.getSize(0));
                                                                                            int i277 = (i276 & 1) + (i276 | 1);
                                                                                            Object[] objArr32 = new Object[1];
                                                                                            c(new char[]{35511, 55908, 35536, 22951, 32089, 44474, 46757, 6715, 21550, 36001, 38831, 15137, 14092, 61315, 62641, 22629, 5699, 52779, 54733, 32478, 61806, 10593, 13026, 40913, 53339, 2130, 5081}, i277, objArr32);
                                                                                            if (!obj3.equals(cls11.getMethod((String) objArr32[0], null).invoke(objInvoke2, null))) {
                                                                                                int i278 = i183 + 86;
                                                                                                i183 = (i278 | (-85)) + (i278 & (-85));
                                                                                                i152 = i152;
                                                                                                obj4 = obj3;
                                                                                                obj5 = obj6;
                                                                                                objArr15 = objArr24;
                                                                                                length = i234;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    int i279 = (~i152) & (i | 1);
                                                                                    Object[] objArr33 = new Object[4];
                                                                                    int[] iArr = new int[1];
                                                                                    int i280 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                                    int i281 = (i280 ^ 119) + ((i280 & 119) << 1);
                                                                                    asBinder = i281 % 128;
                                                                                    int i282 = i281 % 2;
                                                                                    objArr33[0] = iArr;
                                                                                    objArr33[1] = new int[1];
                                                                                    objArr33[2] = new int[]{i279};
                                                                                    iArr[0] = i;
                                                                                    objArr33[3] = null;
                                                                                    int iMyTid = Process.myTid();
                                                                                    int i283 = ~iMyTid;
                                                                                    int i284 = 174850196 + (((~((-43194473) | i283)) | (~((-943742981) | iMyTid)) | (~(989821695 | iMyTid))) * 765) + (((~((-986937453) | i283)) | 43194472) * 1530) + (((~(iMyTid | (-986937453))) | (~(i283 | 989821695))) * 765);
                                                                                    int i285 = (i284 ^ 16) + ((i284 & 16) << 1);
                                                                                    int i286 = (i2 & i285) + (i285 | i2);
                                                                                    int i287 = i286 << 13;
                                                                                    int i288 = (i287 | i286) & (~(i286 & i287));
                                                                                    int i289 = i288 >>> 17;
                                                                                    int i290 = ((~i288) & i289) | ((~i289) & i288);
                                                                                    int i291 = i290 << 5;
                                                                                    ((int[]) objArr33[1])[0] = ((~i290) & i291) | ((~i291) & i290);
                                                                                    return objArr33;
                                                                                } catch (Throwable th2) {
                                                                                    Throwable cause2 = th2.getCause();
                                                                                    if (cause2 != null) {
                                                                                        throw cause2;
                                                                                    }
                                                                                    throw th2;
                                                                                }
                                                                            } catch (Throwable th3) {
                                                                                Throwable cause3 = th3.getCause();
                                                                                if (cause3 != null) {
                                                                                    throw cause3;
                                                                                }
                                                                                throw th3;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            Throwable cause4 = th4.getCause();
                                                                            if (cause4 != null) {
                                                                                throw cause4;
                                                                            }
                                                                            throw th4;
                                                                        }
                                                                    } catch (Throwable th5) {
                                                                        Throwable cause5 = th5.getCause();
                                                                        if (cause5 != null) {
                                                                            throw cause5;
                                                                        }
                                                                        throw th5;
                                                                    }
                                                                }
                                                                Invoke = i2;
                                                            }
                                                        } catch (Throwable unused) {
                                                        }
                                                    } catch (Throwable th6) {
                                                        Throwable cause6 = th6.getCause();
                                                        if (cause6 != null) {
                                                            throw cause6;
                                                        }
                                                        throw th6;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    Throwable cause7 = th.getCause();
                                                    if (cause7 != null) {
                                                        throw cause7;
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                            }
                                        } else {
                                            Object obj7 = null;
                                            try {
                                                obj7.hashCode();
                                                throw null;
                                            } catch (Throwable th9) {
                                                th = th9;
                                            }
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                    }
                                    Throwable cause8 = th.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th;
                                } catch (Throwable th11) {
                                    Throwable cause9 = th11.getCause();
                                    if (cause9 != null) {
                                        throw cause9;
                                    }
                                    throw th11;
                                }
                            } catch (Throwable th12) {
                                Throwable cause10 = th12.getCause();
                                if (cause10 != null) {
                                    throw cause10;
                                }
                                throw th12;
                            }
                        } catch (Throwable unused2) {
                        }
                    } catch (Throwable unused3) {
                        Invoke = i2;
                    }
                } else {
                    Invoke = i2;
                }
                int i292 = asBinder;
                int i293 = (i292 ^ 105) + ((i292 & 105) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i293 % 128;
                int i294 = i293 % 2;
                Object[] objArr34 = {new int[]{i}, new int[1], new int[]{i}, null};
                int i295 = (int) Runtime.getRuntime().totalMemory();
                int i296 = (-340708924) + ((~((~i295) | (-103416401))) * (-116)) + ((970266663 | i295) * 116) + (((~(i295 | 929956434)) | 143726629) * 116);
                int iTuitionPaymentFragmentbindingInflater7 = com.google.android.libraries.places.api.net.kotlin.zzo.TuitionPaymentFragmentbindingInflater1();
                int i297 = i296 * 253;
                int i298 = ~i296;
                int i299 = ~(((-1) ^ i298) | i298);
                int i300 = ~i296;
                int i301 = ~iTuitionPaymentFragmentbindingInflater7;
                int i302 = ~((i300 ^ i301) | (i300 & i301));
                int i303 = (i299 & i302) | (i299 ^ i302);
                int i304 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i305 = (i304 & 121) + (i304 | 121);
                asBinder = i305 % 128;
                if (i305 % 2 == 0) {
                    i13 = (i297 >>> ((-252) >>> ((~((i296 ^ iTuitionPaymentFragmentbindingInflater7) | (i296 & iTuitionPaymentFragmentbindingInflater7))) | i303))) * ((-252) << i296);
                    i14 = (~iTuitionPaymentFragmentbindingInflater7) | i300;
                } else {
                    i13 = (((i297 - (~(-(-((i303 | (~((i296 ^ iTuitionPaymentFragmentbindingInflater7) | (i296 & iTuitionPaymentFragmentbindingInflater7)))) * (-252)))))) - 1) - (~(-(-(i296 * (-252)))))) - 1;
                    i14 = (i298 & i301) | (i298 ^ i301);
                }
                int i306 = ~i14;
                int i307 = ~((iTuitionPaymentFragmentbindingInflater7 & i296) | (i296 ^ iTuitionPaymentFragmentbindingInflater7));
                int i308 = 252 * ((i307 & i306) | (i306 ^ i307));
                int i309 = (i13 & i308) + (i13 | i308);
                int i310 = (i309 * 628) + (Invoke * 628);
                int i311 = Invoke | i;
                int i312 = ~i309;
                int i313 = ((i311 & i312) | (i311 ^ i312)) * (-627);
                int i314 = (i310 ^ i313) + ((i310 & i313) << 1);
                int i315 = ~Invoke;
                int i316 = i314 + (((~((i315 & i) | (i315 ^ i))) | i309) * (-627));
                int i317 = ~i;
                int i318 = ~(((i317 & Invoke) == true ? 1 : 0) | ((i317 ^ Invoke) == true ? 1 : 0));
                int i319 = ~(i | i309);
                int i320 = -(-(((i319 & i318) | (i318 ^ i319)) * 627));
                int i321 = ((i316 | i320) << 1) - (i320 ^ i316);
                int i322 = i321 << 13;
                int i323 = (i322 & (~i321)) | ((~i322) & i321);
                int i324 = i323 ^ (i323 >>> 17);
                int i325 = i324 << 5;
                ((int[]) objArr34[1])[0] = ((~i324) & i325) | ((~i325) & i324);
                return objArr34;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(short r6, byte r7, short r8) {
                /*
                    byte[] r0 = com.google.android.libraries.places.widget.zzf.$$a
                    int r8 = r8 + 4
                    int r7 = r7 + 102
                    int r6 = r6 * 3
                    int r1 = r6 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L29
                L13:
                    r3 = r2
                L14:
                    int r8 = r8 + 1
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r6) goto L21
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L21:
                    int r3 = r3 + 1
                    r4 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L29:
                    int r8 = -r8
                    int r7 = r7 + r8
                    r8 = r3
                    r3 = r4
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.zzf.$$c(short, byte, short):java.lang.String");
            }
        });
        zze(viewFindViewById2);
        this.zza.observe(getViewLifecycleOwner(), new Observer() { // from class: com.google.android.libraries.places.widget.zzg
            @Override // androidx.p002lifecycle.Observer
            public final /* synthetic */ void onChanged(Object obj) {
                this.zza.zzc(editText, viewFindViewById2, (CharSequence) obj);
            }
        });
        this.zzb.observe(getViewLifecycleOwner(), new Observer() { // from class: com.google.android.libraries.places.widget.zzh
            @Override // androidx.p002lifecycle.Observer
            public final /* synthetic */ void onChanged(Object obj) {
                AutocompleteSupportFragment.zzg(editText, viewFindViewById, (CharSequence) obj);
            }
        });
    }

    public AutocompleteSupportFragment setActivityMode(AutocompleteActivityMode autocompleteActivityMode) {
        this.zzc.zzb(autocompleteActivityMode);
        return this;
    }

    public AutocompleteSupportFragment setCountries(List<String> list) {
        this.zzc.zzj(list);
        return this;
    }

    @Deprecated
    public AutocompleteSupportFragment setCountry(String str) {
        this.zzc.zzt(str);
        return this;
    }

    public AutocompleteSupportFragment setHint(CharSequence charSequence) {
        try {
            if (charSequence != null) {
                this.zzc.zzg(charSequence.toString());
                this.zzb.postValue(charSequence);
                return this;
            }
            String string = getString(R.string.places_autocomplete_search_hint);
            this.zzc.zzg(string);
            this.zzb.postValue(string);
            return this;
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public AutocompleteSupportFragment setLocationBias(LocationBias locationBias) {
        this.zzc.zzh(locationBias);
        return this;
    }

    public AutocompleteSupportFragment setLocationRestriction(LocationRestriction locationRestriction) {
        this.zzc.zzi(locationRestriction);
        return this;
    }

    public AutocompleteSupportFragment setPlaceFields(List<Place.Field> list) {
        this.zzc.zzc(list);
        return this;
    }

    public AutocompleteSupportFragment setRegionCode(String str) {
        this.zzc.zzo(str);
        return this;
    }

    public AutocompleteSupportFragment setText(CharSequence charSequence) {
        try {
            this.zzc.zzf(TextUtils.isEmpty(charSequence) ? null : charSequence.toString());
            this.zza.postValue(charSequence);
            return this;
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Deprecated
    public AutocompleteSupportFragment setTypeFilter(TypeFilter typeFilter) {
        this.zzc.zzk(typeFilter);
        return this;
    }

    public AutocompleteSupportFragment setTypesFilter(List<String> list) {
        this.zzc.zzl(list);
        return this;
    }

    final /* synthetic */ void zza(View view) {
        zzf();
    }

    final /* synthetic */ void zzb(View view) {
        zzf();
    }

    public AutocompleteSupportFragment setCountries(String... strArr) {
        this.zzc.zzj(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) strArr));
        return this;
    }

    public AutocompleteSupportFragment setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        this.zzd = placeSelectionListener;
        return this;
    }
}
