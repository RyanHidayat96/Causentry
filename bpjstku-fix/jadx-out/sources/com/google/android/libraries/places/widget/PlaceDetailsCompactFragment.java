package com.google.android.libraries.places.widget;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.p002lifecycle.LifecycleCoroutineScope;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.ViewModelProvider;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.internal.zzaiw;
import com.google.android.libraries.places.internal.zzaiz;
import com.google.android.libraries.places.internal.zzajb;
import com.google.android.libraries.places.internal.zzod;
import com.google.android.libraries.places.internal.zzof;
import com.google.android.libraries.places.internal.zzon;
import com.google.android.libraries.places.internal.zzoo;
import com.google.android.libraries.places.internal.zzoy;
import com.google.android.libraries.places.widget.internal.placedetails.zzbb;
import com.google.android.libraries.places.widget.internal.placedetails.zzbc;
import com.google.android.libraries.places.widget.internal.placedetails.zzbi;
import com.google.android.libraries.places.widget.internal.placedetails.zzbj;
import com.google.android.libraries.places.widget.internal.placedetails.zzbp;
import com.google.android.libraries.places.widget.model.Orientation;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.ViewPortBuilder;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 b2\u00020\u0001:\u0003`abB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J$\u00106\u001a\u00020\t2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001a\u0010;\u001a\u0002032\u0006\u0010<\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u0010=\u001a\u0002032\u0006\u0010>\u001a\u00020?H\u0007J\u0010\u0010@\u001a\u0002032\u0006\u0010A\u001a\u00020?H\u0007J\u0010\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020DH\u0007J\u000e\u0010E\u001a\u0002032\u0006\u0010F\u001a\u00020GJ\u000e\u0010H\u001a\u0002032\u0006\u0010\u0006\u001a\u00020IJ\b\u0010J\u001a\u000203H\u0002J\u0010\u0010K\u001a\u0002032\u0006\u0010L\u001a\u00020*H\u0007J\b\u0010M\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u0002032\u0006\u0010F\u001a\u00020GH\u0002J\u0014\u0010P\u001a\u0002032\n\u0010Q\u001a\u00060Rj\u0002`SH\u0002J\u0018\u0010T\u001a\u0002032\u0006\u0010U\u001a\u00020!2\u0006\u0010V\u001a\u00020!H\u0002J\b\u0010W\u001a\u000203H\u0002J\u000e\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0002J\f\u0010Y\u001a\u00020Z*\u00020\u0018H\u0002J\f\u0010[\u001a\u00020\\*\u00020\u001bH\u0002J\u0010\u0010]\u001a\u0002032\u0006\u0010^\u001a\u00020_H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aX\u0082.¢\u0006\u0002\n\u0000R+\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006c"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "viewModel", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceDetailsViewModel;", "image", "Landroid/widget/ImageView;", "imageContainer", "Landroid/view/View;", "imageLoadingFailureText", "Landroid/widget/TextView;", "displayName", PlaceTypes.ADDRESS, "legalDisclosuresIcon", "openInMaps", "loadingProgressBar", "Landroid/widget/ProgressBar;", "loadingFailedMessage", "metadataViewController", "Lcom/google/android/libraries/places/widget/internal/placedetails/MetadataViewController;", "compactViewController", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceDetailsCompactViewController;", "orientation", "Lcom/google/android/libraries/places/widget/model/Orientation;", FirebaseAnalytics.Param.CONTENT, "", "Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment$Content;", "analyticsReporter", "Lcom/google/android/libraries/places/widget/internal/placedetails/AnalyticsReporter;", "fieldsToLoad", "Lcom/google/android/libraries/places/api/model/Place$Field;", "<set-?>", "", "themeResId", "getThemeResId", "()I", "setThemeResId", "(I)V", "themeResId$delegate", "Lkotlin/properties/ReadWriteProperty;", "placeLoadListener", "Lcom/google/android/libraries/places/widget/PlaceLoadListener;", "hasSpaceForImage", "", "preferTruncation", "getPreferTruncation", "()Z", "setPreferTruncation", "(Z)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "loadWithPlaceId", "placeId", "", "loadWithResourceName", "resourceName", "loadWithCoordinates", "coordinates", "Lcom/google/android/gms/maps/model/LatLng;", "renderPlace", "place", "Lcom/google/android/libraries/places/api/model/Place;", "renderPlaceImage", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceImage;", "showLoadingState", "setPlaceLoadListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "createRequestConfigs", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceDetailsViewModel$RequestConfiguration;", "updateUi", "onPlaceLoadFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setUpLegalDisclosures", "lineHeight", TypedValues.Custom.S_COLOR, "hideAllContent", "contentToPlaceFields", "toAnalyticsOrientation", "Lcom/google/common/logging/location/PlacesProto$PlaceDetailsWidgetProto$PlaceDetailsWidgetOrientation;", "toAnalyticsContent", "Lcom/google/common/logging/location/PlacesProto$PlaceDetailsWidgetProto$PlaceDetailsWidgetContent;", "setTestComponent", "component", "Lcom/google/android/libraries/places/widget/internal/inject/PlacesWidgetComponent;", "Content", "ParcelableContentList", "Companion", "java.com.google.android.libraries.places.widget_place_details_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlaceDetailsCompactFragment extends Fragment {
    public static final List<Content> ALL_CONTENT;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final List<Content> STANDARD_CONTENT;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    static final /* synthetic */ KProperty[] zza;
    private zzbi zzb;
    private ImageView zzc;
    private View zzd;
    private TextView zze;
    private TextView zzf;
    private ImageView zzg;
    private View zzh;
    private ProgressBar zzi;
    private TextView zzj;
    private com.google.android.libraries.places.widget.internal.placedetails.zzaa zzk;
    private com.google.android.libraries.places.widget.internal.placedetails.zzar zzl;
    private Orientation zzm;
    private List zzn;
    private com.google.android.libraries.places.widget.internal.placedetails.zzp zzo;
    private List zzp;
    private final ReadWriteProperty zzq = Delegates.INSTANCE.notNull();
    private PlaceLoadListener zzr;
    private boolean zzs;
    private boolean zzt;
    private static final byte[] $$c = {22, 102, 43, -6};
    private static final int $$f = 180;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {23, -73, 107, 5, -4, -20, -6, 6, -26, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 128;
    private static final byte[] $$a = {22, 102, 43, -6, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 177;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int b = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        zza = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(PlaceDetailsCompactFragment.class, "themeResId", "getThemeResId()I", 0))};
        INSTANCE = new Companion(null);
        STANDARD_CONTENT = CollectionsKt.listOf((Object[]) new Content[]{Content.MEDIA, Content.RATING, Content.TYPE, Content.PRICE, Content.ACCESSIBLE_ENTRANCE_ICON, Content.OPEN_NOW_STATUS});
        ALL_CONTENT = CollectionsKt.toList(Content.getEntries());
        int i = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 1
            byte[] r1 = com.google.android.libraries.places.widget.PlaceDetailsCompactFragment.$$a
            int r5 = r5 * 52
            int r5 = r5 + 4
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r1[r5]
        L26:
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            int r5 = r5 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.PlaceDetailsCompactFragment.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 33
            int r6 = 117 - r6
            byte[] r0 = com.google.android.libraries.places.widget.PlaceDetailsCompactFragment.$$d
            int r5 = r5 * 5
            int r5 = r5 + 4
            int r7 = r7 * 47
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r5
            r4 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r5]
        L29:
            int r4 = -r4
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.PlaceDetailsCompactFragment.d(byte, byte, byte, java.lang.Object[]):void");
    }

    static /* synthetic */ void zzc(View view, PlaceDetailsCompactFragment placeDetailsCompactFragment) {
        int i = 2 % 2;
        boolean z = false;
        if (view.getMeasuredWidth() / placeDetailsCompactFragment.requireContext().getResources().getDisplayMetrics().density >= 350.0f) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                z = true;
            }
        } else {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
        }
        placeDetailsCompactFragment.zzs = z;
    }

    private final int zzf() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int iIntValue = ((Number) this.zzq.getValue(this, i2 % 2 == 0 ? zza[0] : zza[0])).intValue();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 22 / 0;
        }
        return iIntValue;
    }

    public final void loadWithCoordinates(LatLng coordinates) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(coordinates, "");
        zzbi zzbiVar = this.zzb;
        if (zzbiVar == null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar = null;
        }
        zzbiVar.zzg(coordinates, zzg());
    }

    public final void loadWithResourceName(String resourceName) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceName, "");
        loadWithPlaceId(StringsKt.removePrefix(resourceName, (CharSequence) "place/"));
        int i4 = TuitionPaymentFragmentbindingInflater1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ Unit zzd(PlaceDetailsCompactFragment placeDetailsCompactFragment, zzbp zzbpVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        com.google.android.libraries.places.widget.internal.placedetails.zzar zzarVar = placeDetailsCompactFragment.zzl;
        List list = null;
        if (zzarVar == null) {
            int i5 = i3 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzarVar = null;
        }
        Intrinsics.checkNotNull(zzbpVar);
        boolean z = placeDetailsCompactFragment.zzs;
        List list2 = placeDetailsCompactFragment.zzn;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            list = list2;
        }
        zzarVar.zzc(zzbpVar, z, list.contains(Content.MEDIA));
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle savedInstanceState) {
        int i = 2 % 2;
        super.onCreate(savedInstanceState);
        Application application = requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "");
        this.zzb = (zzbi) new ViewModelProvider(this, com.google.android.libraries.places.widget.internal.placedetails.zzat.zza(application)).get(zzbi.class);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void loadWithPlaceId(String placeId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(placeId, "");
        zzh();
        ProgressBar progressBar = this.zzi;
        zzbi zzbiVar = null;
        if (progressBar == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        zzbi zzbiVar2 = this.zzb;
        if (zzbiVar2 == null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i4 != 0) {
                zzbiVar.hashCode();
                throw null;
            }
        } else {
            zzbiVar = zzbiVar2;
        }
        zzbiVar.zzf(placeId, zzg());
    }

    private final zzbc zzg() {
        int i = 2 % 2;
        List list = this.zzn;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        boolean zContains = list.contains(Content.MEDIA);
        List list2 = this.zzp;
        if (list2 == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            list2 = null;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        zzbc zzbcVarZza = zzbb.zza(zContains, list2, contextRequireContext);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zzbcVarZza;
        }
        throw null;
    }

    public static final /* synthetic */ void zzb(PlaceDetailsCompactFragment placeDetailsCompactFragment, Exception exc) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ProgressBar progressBar = placeDetailsCompactFragment.zzi;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        ImageView imageView = placeDetailsCompactFragment.zzc;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        imageView.setVisibility(8);
        TextView textView = placeDetailsCompactFragment.zzj;
        if (textView == null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setVisibility(0);
        PlaceLoadListener placeLoadListener = placeDetailsCompactFragment.zzr;
        if (placeLoadListener != null) {
            placeLoadListener.onFailure(exc);
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = placeDetailsCompactFragment.zzo;
        if (zzpVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            zzpVar = zzpVar2;
        }
        zzpVar.zzd();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0003\u0010\u0019\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003R\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment$Companion;", "", "<init>", "()V", "REVIEW_DISCLOSURE_MIN_TOUCH_TARGET_WIDTH_DP", "", "REVIEW_DISCLOSURE_MIN_TOUCH_TARGET_HEIGHT_DP", "RESOURCE_NAME_PREFIX", "", "getRESOURCE_NAME_PREFIX$annotations", "ARG_ORIENTATION", "getARG_ORIENTATION$annotations", "ARG_CONTENT", "getARG_CONTENT$annotations", "ARG_THEME_RES_ID", "getARG_THEME_RES_ID$annotations", "STANDARD_CONTENT", "", "Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment$Content;", "ALL_CONTENT", "newInstance", "Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment;", FirebaseAnalytics.Param.CONTENT, "orientation", "Lcom/google/android/libraries/places/widget/model/Orientation;", "theme", "java.com.google.android.libraries.places.widget_place_details_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ PlaceDetailsCompactFragment newInstance$default(Companion companion, List list, Orientation orientation, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                orientation = Orientation.VERTICAL;
            }
            if ((i2 & 4) != 0) {
                i = R.style.PlacesMaterialTheme;
            }
            return companion.newInstance(list, orientation, i);
        }

        @JvmStatic
        public final PlaceDetailsCompactFragment newInstance(List<? extends Content> content, Orientation orientation, int theme) {
            Intrinsics.checkNotNullParameter(content, "");
            Intrinsics.checkNotNullParameter(orientation, "");
            PlaceDetailsCompactFragment placeDetailsCompactFragment = new PlaceDetailsCompactFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg-orientation", orientation);
            bundle.putParcelable("arg-content", new zzk(content));
            bundle.putInt("arg-theme-res-id", theme);
            placeDetailsCompactFragment.setArguments(bundle);
            return placeDetailsCompactFragment;
        }

        private Companion() {
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final PlaceDetailsCompactFragment newInstance(List<? extends Content> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return newInstance$default(this, list, null, 0, 6, null);
        }

        @JvmStatic
        public final PlaceDetailsCompactFragment newInstance(List<? extends Content> list, Orientation orientation) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(orientation, "");
            return newInstance$default(this, list, orientation, 0, 4, null);
        }
    }

    private static final void zzi(PlaceDetailsCompactFragment placeDetailsCompactFragment, View view) {
        List listEmptyList;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Context contextRequireContext = placeDetailsCompactFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iZzf = placeDetailsCompactFragment.zzf();
        List list = placeDetailsCompactFragment.zzn;
        if (list == null) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        if (list.contains(Content.RATING)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            listEmptyList = CollectionsKt.listOf(zzon.REVIEWS_ARENT_VERIFIED);
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        new zzoo(contextRequireContext, iZzf, listEmptyList).show();
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.places.widget.PlaceDetailsCompactFragment$Content[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.places.widget.PlaceDetailsCompactFragment$Content[]) from 0x004e: INVOKE (r0v1 com.google.android.libraries.places.widget.PlaceDetailsCompactFragment$Content[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment$Content;", "", "<init>", "(Ljava/lang/String;I)V", "MEDIA", "ADDRESS", "RATING", "PRICE", "TYPE", "ACCESSIBLE_ENTRANCE_ICON", "OPEN_NOW_STATUS"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content {
        MEDIA,
        ADDRESS,
        RATING,
        PRICE,
        TYPE,
        ACCESSIBLE_ENTRANCE_ICON,
        OPEN_NOW_STATUS;

        private static final /* synthetic */ EnumEntries zzb;

        static {
            zzb = EnumEntriesKt.enumEntries(contentArr);
        }

        private Content() {
            super(str, i);
        }

        public static Content valueOf(String str) {
            return (Content) Enum.valueOf(Content.class, str);
        }

        public static Content[] values() {
            return (Content[]) zza.clone();
        }

        public static EnumEntries<Content> getEntries() {
            return zzb;
        }
    }

    private final void zzh() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        ImageView imageView = this.zzc;
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        imageView.setVisibility(8);
        View view = this.zzd;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            view = null;
        }
        view.setVisibility(8);
        TextView textView = this.zze;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = TuitionPaymentFragmentbindingInflater1 + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
            textView = null;
        }
        textView.setVisibility(8);
        TextView textView2 = this.zzf;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView2 = null;
        }
        textView2.setVisibility(8);
        View view2 = this.zzh;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view2 = null;
        }
        view2.setVisibility(8);
        ProgressBar progressBar = this.zzi;
        if (progressBar == null) {
            int i8 = TuitionPaymentFragmentbindingInflater1 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        TextView textView3 = this.zzj;
        if (textView3 == null) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView3 = null;
        }
        textView3.setVisibility(8);
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar2 = this.zzk;
        if (zzaaVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            zzaaVar = zzaaVar2;
        }
        zzaaVar.zzc();
    }

    public static final /* synthetic */ void zza(PlaceDetailsCompactFragment placeDetailsCompactFragment, Place place) {
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar;
        int i = 2 % 2;
        ProgressBar progressBar = placeDetailsCompactFragment.zzi;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            progressBar = null;
        }
        progressBar.setVisibility(8);
        com.google.android.libraries.places.widget.internal.placedetails.zzar zzarVar = placeDetailsCompactFragment.zzl;
        if (zzarVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzarVar = null;
        }
        zzarVar.zzb(place, placeDetailsCompactFragment.zzt);
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar2 = placeDetailsCompactFragment.zzk;
        if (zzaaVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzaaVar = null;
        } else {
            zzaaVar = zzaaVar2;
        }
        List list = placeDetailsCompactFragment.zzn;
        if (list == null) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        boolean zContains = list.contains(Content.RATING);
        List list2 = placeDetailsCompactFragment.zzn;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list2 = null;
        }
        boolean zContains2 = list2.contains(Content.TYPE);
        List list3 = placeDetailsCompactFragment.zzn;
        if (list3 == null) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            list3 = null;
        }
        boolean zContains3 = list3.contains(Content.PRICE);
        List list4 = placeDetailsCompactFragment.zzn;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list4 = null;
        }
        boolean zContains4 = list4.contains(Content.ACCESSIBLE_ENTRANCE_ICON);
        List list5 = placeDetailsCompactFragment.zzn;
        if (list5 == null) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            list5 = null;
        }
        boolean zContains5 = list5.contains(Content.OPEN_NOW_STATUS);
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar3 = placeDetailsCompactFragment.zzo;
        if (zzpVar3 == null) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i12 = TuitionPaymentFragmentbindingInflater1 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
            int i13 = i12 % 2;
            zzpVar = null;
        } else {
            zzpVar = zzpVar3;
        }
        zzaaVar.zza(place, zContains, zContains2, zContains3, zContains4, zContains5, zzpVar);
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar3 = placeDetailsCompactFragment.zzk;
        if (zzaaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzaaVar3 = null;
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar4 = placeDetailsCompactFragment.zzo;
        if (zzpVar4 == null) {
            int i14 = TuitionPaymentFragmentbindingInflater1 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
            int i15 = i14 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzpVar4 = null;
        }
        zzaaVar3.zzb(place, zzpVar4);
        Place.Builder builder = Place.builder();
        builder.setId(place.getId());
        builder.setViewport(place.getViewport());
        builder.setLocation(place.getLocation());
        Place placeBuild = builder.build();
        PlaceLoadListener placeLoadListener = placeDetailsCompactFragment.zzr;
        if (placeLoadListener != null) {
            int i16 = TuitionPaymentFragmentbindingInflater1 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
            int i17 = i16 % 2;
            Intrinsics.checkNotNull(placeBuild);
            placeLoadListener.onSuccess(placeBuild);
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar5 = placeDetailsCompactFragment.zzo;
        if (zzpVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            zzpVar2 = zzpVar5;
        }
        zzpVar2.zzc();
        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentbindingInflater1 = i18 % 128;
        int i19 = i18 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(inflater, "");
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "");
        Orientation orientation = (Orientation) zzof.zza(bundleRequireArguments, "arg-orientation", Orientation.class);
        this.zzm = orientation;
        Orientation orientation2 = null;
        if (orientation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = TuitionPaymentFragmentbindingInflater1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            orientation = null;
        }
        int i6 = orientation == Orientation.VERTICAL ? R.layout.place_details_compact_vertical_fragment : R.layout.place_details_compact_horizontal_fragment;
        Bundle bundleRequireArguments2 = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments2, "");
        this.zzn = ((zzk) zzof.zza(bundleRequireArguments2, "arg-content", zzk.class)).zza();
        zzbj zzbjVar = new zzbj();
        List list = this.zzn;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        if (list.contains(Content.MEDIA)) {
            zzbjVar.zza();
        }
        List list2 = this.zzn;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list2 = null;
        }
        if (list2.contains(Content.ADDRESS)) {
            zzbjVar.zzb();
        }
        List list3 = this.zzn;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list3 = null;
        }
        if (list3.contains(Content.RATING)) {
            zzbjVar.zzc();
        }
        List list4 = this.zzn;
        if (list4 == null) {
            int i7 = TuitionPaymentFragmentbindingInflater1 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            list4 = null;
        }
        if (list4.contains(Content.PRICE)) {
            zzbjVar.zzd();
        }
        List list5 = this.zzn;
        if (list5 == null) {
            int i9 = TuitionPaymentFragmentbindingInflater1 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            int i10 = i9 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            list5 = null;
        }
        if (list5.contains(Content.TYPE)) {
            zzbjVar.zze();
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
            int i12 = i11 % 2;
        }
        List list6 = this.zzn;
        if (list6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list6 = null;
        }
        if (!(!list6.contains(Content.ACCESSIBLE_ENTRANCE_ICON))) {
            zzbjVar.zzf();
        }
        List list7 = this.zzn;
        if (list7 == null) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            if (i13 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            list7 = null;
        }
        if (list7.contains(Content.OPEN_NOW_STATUS)) {
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
            TuitionPaymentFragmentbindingInflater1 = i14 % 128;
            int i15 = i14 % 2;
            zzbjVar.zzg();
        }
        this.zzp = zzbjVar.zzo();
        this.zzq.setValue(this, zza[0], Integer.valueOf(requireArguments().getInt("arg-theme-res-id")));
        final View viewInflate = inflater.cloneInContext(new ContextThemeWrapper(getContext(), zzf())).inflate(i6, container, false);
        Orientation orientation3 = this.zzm;
        if (orientation3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            orientation2 = orientation3;
        }
        if (orientation2 == Orientation.HORIZONTAL) {
            viewInflate.post(new Runnable() { // from class: com.google.android.libraries.places.widget.zzn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    PlaceDetailsCompactFragment.zzc(viewInflate, this);
                }
            });
        } else {
            this.zzs = true;
        }
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        Orientation orientation;
        zzaiw zzaiwVar;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        this.zzc = (ImageView) view.findViewById(R.id.place_image);
        this.zzd = view.findViewById(R.id.place_image_container);
        this.zze = (TextView) view.findViewById(R.id.place_name);
        this.zzf = (TextView) view.findViewById(R.id.place_address);
        this.zzg = (ImageView) view.findViewById(R.id.legal_disclosures_icon);
        this.zzh = view.findViewById(R.id.open_in_maps);
        this.zzi = (ProgressBar) view.findViewById(R.id.loading_indicator);
        this.zzj = (TextView) view.findViewById(R.id.loading_failed_message);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iZza = zzod.zza(contextRequireContext, zzf());
        TextView textView = (TextView) view.findViewById(R.id.place_details_attribution);
        textView.setTextColor(iZza);
        int lineHeight = textView.getLineHeight();
        ImageView imageView = this.zzg;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        imageView.getLayoutParams().height = lineHeight;
        ImageView imageView2 = this.zzg;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = TuitionPaymentFragmentbindingInflater1 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            imageView2 = null;
        }
        imageView2.getLayoutParams().width = lineHeight;
        ImageView imageView3 = this.zzg;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView3 = null;
        }
        imageView3.setColorFilter(iZza);
        ImageView imageView4 = this.zzg;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView4 = null;
        }
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzm
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    PlaceDetailsCompactFragment.zze(this.zza, view2);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        float f = requireContext().getResources().getDisplayMetrics().density;
        Rect rect = new Rect();
        ImageView imageView5 = this.zzg;
        if (imageView5 == null) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 87 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            imageView5 = null;
        }
        imageView5.getHitRect(rect);
        float fHeight = rect.height() / f;
        float fWidth = rect.width() / f;
        int i6 = fHeight < 24.0f ? (int) (((24.0f - fHeight) * f) / 2.0f) : 0;
        int i7 = fWidth < 48.0f ? (int) (((48.0f - fWidth) * f) / 2.0f) : 0;
        rect.set(rect.left - i7, rect.top - i6, rect.right + i7, rect.bottom + i6);
        View viewRequireView = requireView();
        ImageView imageView6 = this.zzg;
        if (imageView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView6 = null;
        }
        viewRequireView.setTouchDelegate(new TouchDelegate(rect, imageView6));
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        int iZzf = zzf();
        zzbi zzbiVar = this.zzb;
        if (zzbiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar = null;
        }
        zzoy zzoyVarZze = zzbiVar.zze();
        this.zzk = new com.google.android.libraries.places.widget.internal.placedetails.zzaa(view, contextRequireContext2, iZzf, zzoyVarZze != null ? zzoyVarZze.zzb() : null);
        Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        zzbi zzbiVar2 = this.zzb;
        if (zzbiVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar2 = null;
        }
        zzoy zzoyVarZze2 = zzbiVar2.zze();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        int iZzf2 = zzf();
        Orientation orientation2 = this.zzm;
        if (orientation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            orientation = null;
        } else {
            orientation = orientation2;
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzar zzarVar = new com.google.android.libraries.places.widget.internal.placedetails.zzar(view, contextRequireContext3, zzoyVarZze2, lifecycleScope, iZzf2, orientation);
        this.zzl = zzarVar;
        zzarVar.zza();
        zzh();
        zzajb zzajbVar = zzajb.VARIANT_COMPACT;
        Orientation orientation3 = this.zzm;
        if (orientation3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            orientation3 = null;
        }
        zzaiz zzaizVar = orientation3 == Orientation.VERTICAL ? zzaiz.ORIENTATION_VERTICAL : zzaiz.ORIENTATION_HORIZONTAL;
        List list = this.zzn;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            int i9 = i8 % 2;
            switch ((Content) it.next()) {
                case Content.MEDIA:
                    zzaiwVar = zzaiw.PHOTO;
                    break;
                case Content.ADDRESS:
                    zzaiwVar = zzaiw.ADDRESS;
                    break;
                case Content.RATING:
                    zzaiwVar = zzaiw.RATING;
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                    int i11 = i10 % 2;
                    break;
                case Content.PRICE:
                    zzaiwVar = zzaiw.PRICE;
                    break;
                case Content.TYPE:
                    zzaiwVar = zzaiw.TYPE;
                    break;
                case Content.ACCESSIBLE_ENTRANCE_ICON:
                    zzaiwVar = zzaiw.ACCESSIBILITY;
                    break;
                case Content.OPEN_NOW_STATUS:
                    zzaiwVar = zzaiw.OPEN_NOW_STATUS;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(zzaiwVar);
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = new com.google.android.libraries.places.widget.internal.placedetails.zzp(zzajbVar, zzaizVar, arrayList);
        this.zzo = zzpVar2;
        zzbi zzbiVar3 = this.zzb;
        if (zzbiVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar3 = null;
        }
        zzpVar2.zza(zzbiVar3.zzi());
        zzbi zzbiVar4 = this.zzb;
        if (zzbiVar4 == null) {
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
            TuitionPaymentFragmentbindingInflater1 = i12 % 128;
            int i13 = i12 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar4 = null;
        }
        zzbiVar4.zza().observe(getViewLifecycleOwner(), new zzq(new zzo(this)));
        zzbi zzbiVar5 = this.zzb;
        if (zzbiVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar5 = null;
        }
        zzbiVar5.zzb().observe(getViewLifecycleOwner(), new zzq(new zzp(this)));
        zzbi zzbiVar6 = this.zzb;
        if (zzbiVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar6 = null;
        }
        ((LiveData) zzbiVar6.zzc().get(0)).observe(getViewLifecycleOwner(), new zzq(new Function1() { // from class: com.google.android.libraries.places.widget.zzl
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceDetailsCompactFragment.zzd(this.zza, (zzbp) obj);
            }
        }));
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar3 = this.zzo;
        if (zzpVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            zzpVar = zzpVar3;
        }
        zzpVar.zzb();
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int length;
        char[] cArr2;
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j = 0;
        if (cArr3 != null) {
            int i7 = $11 + 81;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i2] = Integer.valueOf(cArr3[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char mode = (char) View.MeasureSpec.getMode(i2);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(j) + 1270;
                        int i9 = (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 17;
                        byte b2 = (byte) i2;
                        byte b3 = (byte) (b2 + 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, packedPositionGroup, i9, 407021364, false, $$g(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 0;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr3, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i4) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i10 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.red(0), 3225 - ((Process.getThreadPriority(0) + 20) >> 6), 13 - (ViewConfiguration.getTouchSlop() >> 8), 2133916302, false, $$g(b4, (byte) (-$$c[3]), b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 29944);
                            int maxKeyCode = 1755 - (KeyEvent.getMaxKeyCode() >> 16);
                            int iRgb = Color.rgb(0, 0, 0) + 16777239;
                            byte length2 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, maxKeyCode, iRgb, 387247676, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr5[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 41241), 1706 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 21, -1434471773, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i12, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i12);
        }
        if (z) {
            int i13 = $10 + 81;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                cArr = new char[i4];
                setvideostabilizationmode.b = 1;
            } else {
                cArr = new char[i4];
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i4) {
                cArr[setvideostabilizationmode.b] = cArr4[(i4 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
                int i14 = $11 + 47;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = $10 + 3;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i18 = 0;
            while (true) {
                setvideostabilizationmode.b = i18;
                if (setvideostabilizationmode.b >= i4) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i18 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public final boolean getPreferTruncation() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 31533);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 921;
            int i3 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[37], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, iNormalizeMetaState, i3, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyTid = (char) (31533 - (Process.myTid() >> 22));
            int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 922;
            int iMyTid = 28 - (Process.myTid() >> 22);
            byte b3 = $$a[80];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, (byte) (b4 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, i4, iMyTid, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 31533);
                int i5 = 922 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i6 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b5 = bArr2[37];
                byte b6 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b5, b6, (byte) (b6 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, i5, i6, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ((((-247662358) + ((~((~iIdentityHashCode) | (-607690755))) * 433)) + (((~((-1132682574) | iIdentityHashCode)) | (-641397071)) * (-433))) + (((~(iIdentityHashCode | (-641397071))) | (-1740373328)) * 433)) - 247988604;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            int i10 = TuitionPaymentFragmentbindingInflater1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 26, 177, 3}, false, new byte[]{0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{63, 18, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new int[]{81, 16, 52, 12}, true, null, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{97, 16, 105, 5}, true, null, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -247988604};
                byte[] bArr3 = $$d;
                byte b7 = bArr3[12];
                Object[] objArr13 = new Object[1];
                d(b7, b7, bArr3[10], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr3[10];
                Object[] objArr14 = new Object[1];
                d(b8, b8, bArr3[12], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 31533);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 921;
                    int packedPositionChild = 27 - ExpandableListView.getPackedPositionChild(0L);
                    byte[] bArr4 = $$a;
                    byte b9 = bArr4[37];
                    byte b10 = bArr4[80];
                    Object[] objArr15 = new Object[1];
                    a(b9, b10, (byte) (b10 | 37), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, offsetBefore, packedPositionChild, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new int[]{0, 22, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char absoluteGravity = (char) (31533 - Gravity.getAbsoluteGravity(0, 0));
                        int i12 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
                        byte b11 = $$a[80];
                        byte b12 = b11;
                        Object[] objArr18 = new Object[1];
                        a(b11, b12, (byte) (b12 | 52), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity, i12, scrollBarSize, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char size = (char) (View.MeasureSpec.getSize(0) + 31533);
                        int i13 = 921 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int iMyPid = 28 - (Process.myPid() >> 22);
                        byte[] bArr5 = $$a;
                        byte b13 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        a(b13, bArr5[37], b13, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(size, i13, iMyPid, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            int i14 = TuitionPaymentFragmentbindingInflater1 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i17 = i16 + 440064755 + (((-1144785180) | iIdentityHashCode2) * 376) + (((~((~iIdentityHashCode2) | 383067097)) | (-1459432412)) * (-376)) + (((~(iIdentityHashCode2 | (-383067098))) | 1391012546) * 376);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr20[0])[0] = i19 ^ (i19 << 5);
            return this.zzt;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr == null) {
            throw null;
        }
        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentbindingInflater1 = i20 % 128;
        int i21 = i20 % 2;
        while (i2 < strArr.length) {
            int i22 = TuitionPaymentFragmentbindingInflater1 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
            if (i22 % 2 == 0) {
                arrayList.add(strArr[i2]);
                i2 += 29;
            } else {
                arrayList.add(strArr[i2]);
                i2++;
            }
        }
        throw null;
    }

    @JvmStatic
    public static final PlaceDetailsCompactFragment newInstance(List<? extends Content> list) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        PlaceDetailsCompactFragment placeDetailsCompactFragmentNewInstance = INSTANCE.newInstance(list);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return placeDetailsCompactFragmentNewInstance;
    }

    @JvmStatic
    public static final PlaceDetailsCompactFragment newInstance(List<? extends Content> list, Orientation orientation) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        PlaceDetailsCompactFragment placeDetailsCompactFragmentNewInstance = INSTANCE.newInstance(list, orientation);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return placeDetailsCompactFragmentNewInstance;
    }

    @JvmStatic
    public static final PlaceDetailsCompactFragment newInstance(List<? extends Content> list, Orientation orientation, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            INSTANCE.newInstance(list, orientation, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PlaceDetailsCompactFragment placeDetailsCompactFragmentNewInstance = INSTANCE.newInstance(list, orientation, i);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return placeDetailsCompactFragmentNewInstance;
    }

    static /* synthetic */ void zze(PlaceDetailsCompactFragment placeDetailsCompactFragment, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        zzi(placeDetailsCompactFragment, view);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setPlaceLoadListener(PlaceLoadListener listener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(listener, "");
        this.zzr = listener;
        if (i3 != 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
    }

    public final void setPreferTruncation(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzt = z;
        if (i4 != 0) {
            int i5 = 7 / 0;
        }
        int i6 = i3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{59710, 59756, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59705, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59747, 59776, 59423, 59416, 59416, 59411, 59409, 59415, 59434, 59414, 59420, 59889, 59891, 59410, 59434, 59403, 59875, 59400, 59415, 59412, 59435, 59435, 59412, 59436, 59420, 59396, 59413, 59706, 59751, 59768, 59769, 59744, 59746, 59770, 59729, 59731, 59771, 59749, 59745, 59757, 59753, 59745, 59749, 59751, 59749, 59814, 59788, 59753, 59792, 59817, 59806, 59819, 59753, 59806, 59809, 59806, 59797, 59818, 59794, 59811, 59820, 59862, 59868, 59845, 59846, 59865, 59845, 59846, 59859, 59815, 59866, 59863, 59841, 59834, 59881, 59862, 59865};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, byte r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.widget.PlaceDetailsCompactFragment.$$c
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r1 = 1 - r8
            int r7 = 105 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.PlaceDetailsCompactFragment.$$g(short, int, byte):java.lang.String");
    }
}
