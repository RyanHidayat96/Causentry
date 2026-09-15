package com.google.android.libraries.places.widget;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.p002lifecycle.LifecycleCoroutineScope;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import com.google.android.libraries.places.internal.zzajp;
import com.google.android.libraries.places.internal.zzajr;
import com.google.android.libraries.places.internal.zzaju;
import com.google.android.libraries.places.internal.zzajw;
import com.google.android.libraries.places.internal.zzajz;
import com.google.android.libraries.places.internal.zzod;
import com.google.android.libraries.places.internal.zzof;
import com.google.android.libraries.places.internal.zzon;
import com.google.android.libraries.places.internal.zzoo;
import com.google.android.libraries.places.internal.zzoy;
import com.google.android.libraries.places.internal.zzpb;
import com.google.android.libraries.places.internal.zzpi;
import com.google.android.libraries.places.internal.zzpk;
import com.google.android.libraries.places.internal.zzpw;
import com.google.android.libraries.places.widget.internal.placedetails.zzbm;
import com.google.android.libraries.places.widget.model.AttributionPosition;
import com.google.android.libraries.places.widget.model.MediaSize;
import com.google.android.libraries.places.widget.model.Orientation;
import com.google.android.material.color.MaterialColors;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.ViewPortBuilder;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 m2\u00020\u0001:\u0003klmB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J$\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u001a\u0010B\u001a\u0002092\u0006\u0010C\u001a\u00020=2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020;H\u0016J\u0010\u0010F\u001a\u0002092\u0006\u0010G\u001a\u00020HH\u0007J\u0010\u0010I\u001a\u0002092\u0006\u0010G\u001a\u00020JH\u0007J\b\u0010K\u001a\u000209H\u0007J\u0010\u0010L\u001a\u0002092\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0014\u001a\u000209H\u0002J\b\u0010M\u001a\u000209H\u0002J\b\u0010N\u001a\u000209H\u0002J\u0016\u0010O\u001a\u0002092\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0019H\u0002J\"\u0010R\u001a\u0002092\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010\u00192\b\u0010S\u001a\u0004\u0018\u00010TH\u0002J\b\u0010U\u001a\u000209H\u0002J\u0018\u0010V\u001a\u0002092\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010\u0019H\u0002J\u0016\u0010W\u001a\u0002092\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0019H\u0002J\b\u0010X\u001a\u00020\u0017H\u0002J\b\u00104\u001a\u00020\u001cH\u0002J\u0012\u0010Y\u001a\u0002092\b\u0010S\u001a\u0004\u0018\u00010TH\u0002J\u0010\u0010Z\u001a\u00020Q2\u0006\u0010[\u001a\u00020QH\u0002J\u0010\u0010\\\u001a\u0002092\u0006\u0010]\u001a\u00020^H\u0007J\u001c\u0010_\u001a\b\u0012\u0004\u0012\u00020`0\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u000e\u0010a\u001a\b\u0012\u0004\u0012\u00020b0\u0019H\u0002J\f\u0010c\u001a\u00020d*\u00020\u0017H\u0002J\f\u0010e\u001a\u00020f*\u00020\u001aH\u0002J\f\u0010g\u001a\u00020h*\u000203H\u0002J\f\u0010i\u001a\u00020j*\u00020-H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082.¢\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u000203X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006n"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceSearchFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "viewModel", "Lcom/google/android/libraries/places/widget/internal/placesearch/PlaceSearchViewModel;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "fragmentAdapter", "Lcom/google/android/libraries/places/widget/internal/placesearch/PlaceSearchAdapter;", "loadingProgressBar", "Landroid/widget/ProgressBar;", "analyticsReporter", "Lcom/google/android/libraries/places/widget/internal/placesearch/AnalyticsReporter;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/google/android/libraries/places/widget/PlaceSearchFragmentListener;", "scrollState", "Landroid/os/Parcelable;", "showLegalDisclosuresDialog", "", "orientation", "Lcom/google/android/libraries/places/widget/model/Orientation;", FirebaseAnalytics.Param.CONTENT, "", "Lcom/google/android/libraries/places/widget/PlaceSearchFragment$Content;", "<set-?>", "", "themeResId", "getThemeResId", "()I", "setThemeResId", "(I)V", "themeResId$delegate", "Lkotlin/properties/ReadWriteProperty;", "selectable", "getSelectable", "()Z", "setSelectable", "(Z)V", "preferTruncation", "getPreferTruncation", "setPreferTruncation", "attributionPosition", "Lcom/google/android/libraries/places/widget/model/AttributionPosition;", "getAttributionPosition", "()Lcom/google/android/libraries/places/widget/model/AttributionPosition;", "setAttributionPosition", "(Lcom/google/android/libraries/places/widget/model/AttributionPosition;)V", "mediaSize", "Lcom/google/android/libraries/places/widget/model/MediaSize;", "getMediaSize", "()Lcom/google/android/libraries/places/widget/model/MediaSize;", "setMediaSize", "(Lcom/google/android/libraries/places/widget/model/MediaSize;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "onSaveInstanceState", "outState", "configureFromSearchByTextRequest", "request", "Lcom/google/android/libraries/places/api/net/SearchByTextRequest;", "configureFromSearchNearbyRequest", "Lcom/google/android/libraries/places/api/net/SearchNearbyRequest;", "unregisterListener", "registerListener", "updateAttributionAndDisclosureIcon", "showLoadingProgressBar", "onLoadPlaces", "places", "Lcom/google/android/libraries/places/api/model/Place;", "updateUi", "message", "", "updateAttributionPosition", "updateHorizontalGap", "updateRecyclerView", "getPlaceDetailsFragmentOrientation", "showText", "getReturnedPlace", "place", "setTestComponent", "component", "Lcom/google/android/libraries/places/widget/internal/inject/PlacesWidgetComponent;", "contentToPlaceFields", "Lcom/google/android/libraries/places/api/model/Place$Field;", "getPlaceDetailsContent", "Lcom/google/android/libraries/places/widget/PlaceDetailsCompactFragment$Content;", "toAnalyticsOrientation", "Lcom/google/common/logging/location/PlacesProto$PlaceSearchWidgetProto$PlaceSearchWidgetOrientation;", "toAnalyticsContent", "Lcom/google/common/logging/location/PlacesProto$PlaceSearchWidgetProto$PlaceSearchWidgetContent;", "toAnalyticsMediaSize", "Lcom/google/common/logging/location/PlacesProto$PlaceSearchWidgetProto$MediaSize;", "toAnalyticsAttributionPosition", "Lcom/google/common/logging/location/PlacesProto$PlaceWidgetAttributionPosition;", "ParcelableContentList", "Content", "Companion", "java.com.google.android.libraries.places.widget_place_search_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlaceSearchFragment extends Fragment {
    public static final List<Content> ALL_CONTENT;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final List<Content> STANDARD_CONTENT;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int b;
    static final /* synthetic */ KProperty[] zza;
    private zzpw zzb;
    private RecyclerView zzc;
    private LinearLayoutManager zzd;
    private zzpi zze;
    private ProgressBar zzf;
    private zzpb zzg;
    private PlaceSearchFragmentListener zzh;
    private Parcelable zzi;
    private boolean zzj;
    private Orientation zzk;
    private List zzl;
    private boolean zzn;
    private boolean zzo;
    private static final byte[] $$c = {83, ByteCompanionObject.MIN_VALUE, -37, -48};
    private static final int $$f = 14;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {87, 51, -85, 78, 20, 6, -55, 65, 16, 8, 0, 13, 1, -47, 64, 11, 17, -5, 5, 7, 26, -6, -47, Base64.padSymbol, 23, -9, 26, -3, 12, 21, 3, -3, 2, 24, -61, 67, 13, 14, -7, 21, 4, -5, 19, -54, 71, 10, -3, 9, 15, -54, 29, 55, -9, 26, -3, 12, 21, 3, -3, 2, 24, -25, 27, 19, 7, 11, 10, -72, 55, 26, 22, 8, -2, 14, 7, -66, 41, 57, -9, 17, 14, -72, 54, 37, 5, 8, 11, 14, 7, -43, 58, 8, -2, 6, 15, 7, 0, 17, 14, -72, 54, 37, 5, 8, 11, 14, 7, -22, 19, 25, -1, 0, 21, 14, -72, 38, 59, -4, 11, 0, 9, 21, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -58};
    private static final int $$e = 88;
    private static final byte[] $$a = {58, 66, -14, -31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 16;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private final ReadWriteProperty zzm = Delegates.INSTANCE.notNull();
    private AttributionPosition zzp = AttributionPosition.TOP;
    private MediaSize zzq = MediaSize.SMALL;

    static {
        b = 0;
        TuitionPaymentFragmentbindingInflater1();
        zza = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(PlaceSearchFragment.class, "themeResId", "getThemeResId()I", 0))};
        INSTANCE = new Companion(null);
        STANDARD_CONTENT = CollectionsKt.listOf((Object[]) new Content[]{Content.MEDIA, Content.RATING, Content.TYPE, Content.PRICE, Content.ACCESSIBLE_ENTRANCE_ICON});
        ALL_CONTENT = CollectionsKt.toList(Content.getEntries());
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        b = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 84
            byte[] r0 = com.google.android.libraries.places.widget.PlaceSearchFragment.$$a
            int r6 = r6 * 52
            int r6 = 107 - r6
            int r7 = r7 * 15
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r8 = r6
            r4 = r7
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L30:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.PlaceSearchFragment.a(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.widget.PlaceSearchFragment.$$d
            int r7 = r7 * 66
            int r1 = r7 + 53
            int r6 = r6 * 15
            int r6 = 99 - r6
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 52
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.PlaceSearchFragment.d(byte, short, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ int zzb(PlaceSearchFragment placeSearchFragment) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            placeSearchFragment.zzl();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iZzl = placeSearchFragment.zzl();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
        }
        return iZzl;
    }

    static /* synthetic */ Unit zze(PlaceSearchFragment placeSearchFragment, List list) {
        int i = 2 % 2;
        zzpi zzpiVar = placeSearchFragment.zze;
        if (zzpiVar == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                throw null;
            }
            zzpiVar = null;
        }
        Intrinsics.checkNotNull(list);
        zzpiVar.zzc(list);
        Unit unit = Unit.INSTANCE;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return unit;
    }

    static /* synthetic */ void zzh(PlaceSearchFragment placeSearchFragment, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        placeSearchFragment.zzm();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void zzi(PlaceSearchFragment placeSearchFragment, View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        placeSearchFragment.zzm();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void zzk(PlaceSearchFragment placeSearchFragment) {
        int i = 2 % 2;
        Parcelable parcelable = placeSearchFragment.zzi;
        if (parcelable != null) {
            RecyclerView recyclerView = placeSearchFragment.zzc;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView = null;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                layoutManager.onRestoreInstanceState(parcelable);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    private final int zzl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int iIntValue = ((Number) this.zzm.getValue(this, i2 % 2 != 0 ? zza[0] : zza[0])).intValue();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Unit zzj(PlaceSearchFragment placeSearchFragment, List list, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        PlaceSearchFragmentListener placeSearchFragmentListener = placeSearchFragment.zzh;
        if (placeSearchFragmentListener != null) {
            placeSearchFragmentListener.onPlaceSelected(zzr((Place) list.get(i)));
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        }
        zzpb zzpbVar = placeSearchFragment.zzg;
        if (zzpbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzpbVar = null;
        }
        zzpbVar.zze();
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0003\u0010 \u001a\u00020!H\u0007R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0003R\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceSearchFragment$Companion;", "", "<init>", "()V", "ARG_ORIENTATION", "", "getARG_ORIENTATION$annotations", "ARG_CONTENT", "getARG_CONTENT$annotations", "ARG_THEME_RES_ID", "getARG_THEME_RES_ID$annotations", "ARG_PREFER_TRUNCATION", "getARG_PREFER_TRUNCATION$annotations", "ARG_SELECTABLE", "getARG_SELECTABLE$annotations", "ARG_ATTRIBUTION_POSITION", "getARG_ATTRIBUTION_POSITION$annotations", "ARG_MEDIA_SIZE", "getARG_MEDIA_SIZE$annotations", "ARG_SCROLL_STATE", "getARG_SCROLL_STATE$annotations", "ARG_SHOW_LEGAL_DISCLOSURES", "getARG_SHOW_LEGAL_DISCLOSURES$annotations", "STANDARD_CONTENT", "", "Lcom/google/android/libraries/places/widget/PlaceSearchFragment$Content;", "ALL_CONTENT", "newInstance", "Lcom/google/android/libraries/places/widget/PlaceSearchFragment;", FirebaseAnalytics.Param.CONTENT, "orientation", "Lcom/google/android/libraries/places/widget/model/Orientation;", "theme", "", "java.com.google.android.libraries.places.widget_place_search_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ PlaceSearchFragment newInstance$default(Companion companion, List list, Orientation orientation, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                orientation = Orientation.VERTICAL;
            }
            if ((i2 & 4) != 0) {
                i = R.style.PlacesMaterialTheme;
            }
            return companion.newInstance(list, orientation, i);
        }

        @JvmStatic
        public final PlaceSearchFragment newInstance(List<? extends Content> content, Orientation orientation, int theme) {
            Intrinsics.checkNotNullParameter(content, "");
            Intrinsics.checkNotNullParameter(orientation, "");
            PlaceSearchFragment placeSearchFragment = new PlaceSearchFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg-orientation", orientation);
            bundle.putParcelable("arg-content", new zzaj(content));
            bundle.putInt("arg-theme-res-id", theme);
            placeSearchFragment.setArguments(bundle);
            return placeSearchFragment;
        }

        private Companion() {
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final PlaceSearchFragment newInstance(List<? extends Content> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return newInstance$default(this, list, null, 0, 6, null);
        }

        @JvmStatic
        public final PlaceSearchFragment newInstance(List<? extends Content> list, Orientation orientation) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(orientation, "");
            return newInstance$default(this, list, orientation, 0, 4, null);
        }
    }

    static /* synthetic */ Unit zzf(PlaceSearchFragment placeSearchFragment, Exception exc) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        ProgressBar progressBar = placeSearchFragment.zzf;
        zzpb zzpbVar = null;
        if (progressBar == null) {
            int i5 = i2 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        placeSearchFragment.zzp(null, placeSearchFragment.requireContext().getString(R.string.place_search_loading_failed));
        PlaceSearchFragmentListener placeSearchFragmentListener = placeSearchFragment.zzh;
        if (placeSearchFragmentListener != null) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.checkNotNull(exc);
            placeSearchFragmentListener.onRequestError(exc);
        }
        zzpb zzpbVar2 = placeSearchFragment.zzg;
        if (zzpbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            zzpbVar = zzpbVar2;
        }
        zzpbVar.zzf();
        Unit unit = Unit.INSTANCE;
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.places.widget.PlaceSearchFragment$Content[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.places.widget.PlaceSearchFragment$Content[]) from 0x004e: INVOKE (r0v1 com.google.android.libraries.places.widget.PlaceSearchFragment$Content[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED]
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceSearchFragment$Content;", "", "<init>", "(Ljava/lang/String;I)V", "MEDIA", "ADDRESS", "RATING", "PRICE", "TYPE", "ACCESSIBLE_ENTRANCE_ICON", "OPEN_NOW_STATUS"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    private final void zzm() {
        int i = 2 % 2;
        this.zzj = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzon.ABOUT_RESULTS);
        List list = this.zzl;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        if (list.contains(Content.RATING)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(zzon.REVIEWS_ARENT_VERIFIED);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        zzoo zzooVar = new zzoo(contextRequireContext, zzl(), arrayList);
        zzooVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.google.android.libraries.places.widget.zzam
            @Override // android.content.DialogInterface.OnDismissListener
            public final /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
                PlaceSearchFragment.zzg(this.zza, dialogInterface);
            }
        });
        zzooVar.show();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0153  */
    static /* synthetic */ Unit zzd(final PlaceSearchFragment placeSearchFragment, final List list) {
        int dimensionPixelSize;
        ProgressBar progressBar;
        zzpi zzpiVar;
        int i = 2 % 2;
        Object obj = null;
        if (list.isEmpty()) {
            placeSearchFragment.zzp(null, placeSearchFragment.requireContext().getString(R.string.place_search_no_places_to_display));
        } else {
            placeSearchFragment.zzp(list, null);
        }
        Intrinsics.checkNotNull(list);
        Orientation orientation = placeSearchFragment.zzk;
        if (orientation == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            orientation = null;
        }
        if (orientation == Orientation.VERTICAL) {
            placeSearchFragment.zzd = new LinearLayoutManager(placeSearchFragment.getContext(), 1, false);
        } else {
            placeSearchFragment.zzd = new LinearLayoutManager(placeSearchFragment.getContext(), 0, false);
        }
        RecyclerView recyclerView = placeSearchFragment.zzc;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView = null;
        }
        LinearLayoutManager linearLayoutManager = placeSearchFragment.zzd;
        if (linearLayoutManager == null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(placeSearchFragment);
        Orientation orientation2 = placeSearchFragment.zzk;
        if (orientation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            orientation2 = null;
        }
        Orientation orientation3 = Orientation.HORIZONTAL;
        if (orientation2 == orientation3) {
            orientation3 = Orientation.VERTICAL;
        }
        int iZzl = placeSearchFragment.zzl();
        int iOrdinal = placeSearchFragment.zzq.ordinal();
        if (iOrdinal == 1) {
            dimensionPixelSize = placeSearchFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.place_search_image_size_medium);
        } else if (iOrdinal != 2) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            dimensionPixelSize = placeSearchFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.place_search_image_size_small);
        } else {
            dimensionPixelSize = placeSearchFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.place_search_image_size_large);
        }
        int i9 = dimensionPixelSize;
        boolean z = placeSearchFragment.zzn;
        boolean z2 = placeSearchFragment.zzo;
        zzpw zzpwVar = placeSearchFragment.zzb;
        if (zzpwVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzpwVar = null;
        }
        placeSearchFragment.zze = new zzpi(lifecycleScope, orientation3, iZzl, i9, z, z2, list, zzpwVar.zze(), new Function1() { // from class: com.google.android.libraries.places.widget.zzap
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj2) {
                return PlaceSearchFragment.zzj(this.zza, list, ((Integer) obj2).intValue());
            }
        });
        RecyclerView recyclerView2 = placeSearchFragment.zzc;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView2 = null;
        }
        zzpi zzpiVar2 = placeSearchFragment.zze;
        if (zzpiVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzpiVar2 = null;
        }
        recyclerView2.setAdapter(zzpiVar2);
        List list2 = placeSearchFragment.zzl;
        if (list2 == null) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            if (i10 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i11 = 89 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            list2 = null;
        }
        if (list2.contains(Content.MEDIA)) {
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
            if (i12 % 2 == 0) {
                zzpiVar = placeSearchFragment.zze;
                int i13 = 63 / 0;
                if (zzpiVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    zzpiVar = null;
                }
            } else {
                zzpiVar = placeSearchFragment.zze;
                if (zzpiVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    zzpiVar = null;
                }
            }
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            int i14 = 0;
            while (i14 < size) {
                arrayList.add(zzbm.zza);
                i14++;
                int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                int i16 = i15 % 2;
            }
            zzpiVar.zzc(arrayList);
        }
        RecyclerView recyclerView3 = placeSearchFragment.zzc;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView3 = null;
        }
        recyclerView3.setItemViewCacheSize(10);
        Orientation orientation4 = placeSearchFragment.zzk;
        if (orientation4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            orientation4 = null;
        }
        if (orientation4 == Orientation.HORIZONTAL) {
            RecyclerView recyclerView4 = placeSearchFragment.zzc;
            if (recyclerView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView4 = null;
            }
            recyclerView4.addItemDecoration(new zzat(placeSearchFragment));
        } else {
            int color = MaterialColors.getColor(placeSearchFragment.requireView(), R.attr.placesColorOutlineDecorative);
            int dimensionPixelSize2 = placeSearchFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.place_widget_border_width);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{color, color});
            gradientDrawable.setSize(dimensionPixelSize2, dimensionPixelSize2);
            RecyclerView recyclerView5 = placeSearchFragment.zzc;
            if (recyclerView5 == null) {
                int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                int i18 = i17 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView5 = null;
            }
            Context context = recyclerView5.getContext();
            LinearLayoutManager linearLayoutManager2 = placeSearchFragment.zzd;
            if (linearLayoutManager2 == null) {
                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                if (i19 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i20 = 64 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                linearLayoutManager2 = null;
            }
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(context, linearLayoutManager2.getOrientation());
            dividerItemDecoration.setDrawable(gradientDrawable);
            RecyclerView recyclerView6 = placeSearchFragment.zzc;
            if (recyclerView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView6 = null;
            }
            recyclerView6.addItemDecoration(dividerItemDecoration);
        }
        RecyclerView recyclerView7 = placeSearchFragment.zzc;
        if (recyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView7 = null;
        }
        recyclerView7.post(new Runnable() { // from class: com.google.android.libraries.places.widget.zzaq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                PlaceSearchFragment.zzk(this.zza);
            }
        });
        RecyclerView recyclerView8 = placeSearchFragment.zzc;
        if (recyclerView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView8 = null;
        }
        recyclerView8.addOnScrollListener(new zzau(placeSearchFragment));
        ProgressBar progressBar2 = placeSearchFragment.zzf;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            progressBar = null;
        } else {
            progressBar = progressBar2;
        }
        progressBar.setVisibility(8);
        placeSearchFragment.zzo(list);
        return Unit.INSTANCE;
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i5 = $10 + 77;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3291, (KeyEvent.getMaxKeyCode() >> 16) + 31, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 1;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.argb(0, 0, 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 650, 44 - ExpandableListView.getPackedPositionGroup(0L), -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            int i8 = $10 + 59;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 650 - ImageFormat.getBitsPerPixel(0), 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
        int i10 = $10 + 97;
        $11 = i10 % 128;
        int i11 = i10 % 2;
    }

    private final void zzn() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43042);
            int iResolveSize = View.resolveSize(0, 0) + 3111;
            int i2 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22;
            byte[] bArr = $$a;
            byte b2 = bArr[37];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, iResolveSize, i2, -1272852037, false, (String) objArr2[0], null);
        }
        ProgressBar progressBar = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(true, 180 - Process.getGidForName(""), 21 - ImageFormat.getBitsPerPixel(0), 13 - KeyEvent.normalizeMetaState(0), new char[]{22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 184, 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 11, new char[]{'\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t'}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollDefaultDelay = (char) (43042 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 3112;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
            byte[] bArr2 = $$a;
            byte b4 = bArr2[132];
            byte b5 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, bitsPerPixel, threadPriority, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mode = (char) (43042 - View.MeasureSpec.getMode(0));
                int i3 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3110;
                int capsMode = 22 - TextUtils.getCapsMode("", 0, 0);
                byte[] bArr3 = $$a;
                byte b6 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b6, bArr3[132], b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, i3, capsMode, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iMyTid = Process.myTid();
            int i6 = ~iMyTid;
            int i7 = (-2072124576) + (((~(1688793865 | i6)) | 5702672) * (-1188));
            int i8 = (~(iMyTid | (-1688793866))) | 5702672;
            int i9 = ~(16237593 | i6);
            int i10 = i7 + ((i8 | i9) * 594) + (((~((-1688793866) | i6)) | 1678258944 | i9) * 594) + 1146471353;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i4}, strArr};
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            int i14 = i13 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(false, 180 - TextUtils.getCapsMode("", 0, 0), 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 3 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(true, TextUtils.lastIndexOf("", '0', 0, 0) + 185, 15 - ImageFormat.getBitsPerPixel(0), 15 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535}, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1146471353};
                byte[] bArr4 = $$d;
                Object[] objArr11 = new Object[1];
                d(bArr4[110], bArr4[10], bArr4[12], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                d((byte) 117, bArr4[12], bArr4[10], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 43042);
                    int scrollDefaultDelay2 = 3111 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 22;
                    byte[] bArr5 = $$a;
                    byte b7 = bArr5[7];
                    Object[] objArr13 = new Object[1];
                    a(b7, bArr5[132], b7, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, scrollDefaultDelay2, iMakeMeasureSpec, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(true, 181 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 22 - (ViewConfiguration.getTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12, new char[]{22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(false, (ViewConfiguration.getTouchSlop() >> 8) + 185, 15 - View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 11, new char[]{'\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t'}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (43043 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int tapTimeout = 3111 - (ViewConfiguration.getTapTimeout() >> 16);
                        int i15 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr6 = $$a;
                        byte b8 = bArr6[132];
                        byte b9 = bArr6[7];
                        Object[] objArr16 = new Object[1];
                        a(b8, b9, b9, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, tapTimeout, i15, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarSize = (char) (43042 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 3111;
                        int iAlpha = Color.alpha(0) + 22;
                        byte[] bArr7 = $$a;
                        byte b10 = bArr7[37];
                        byte b11 = bArr7[7];
                        Object[] objArr17 = new Object[1];
                        a(b10, b11, b11, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, iCombineMeasuredStates, iAlpha, -1272852037, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            for (String str : strArr2) {
                arrayList.add(str);
            }
            throw null;
        }
        int i16 = ((int[]) objArr[0])[0];
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i17};
        int iIdentityHashCode = System.identityHashCode(this);
        int i19 = i16 + 1338917667 + (((~(iIdentityHashCode | 780371373)) | (-924660086)) * (-465)) + ((780371373 | (~((-924660086) | iIdentityHashCode))) * 930) + ((iIdentityHashCode | (-287060049)) * 465);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr[0])[0] = i21 ^ (i21 << 5);
        Object[] objArr18 = {new int[1], new int[]{i18}, iArr2, strArr3};
        int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
        int i23 = i22 % 2;
        zzp(null, null);
        ProgressBar progressBar2 = this.zzf;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            progressBar = progressBar2;
        }
        int i24 = ((int[]) objArr18[0])[0];
        int i25 = i24 * i24;
        int i26 = -(329161765 * i24);
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        int i28 = -(i24 * 1059784697);
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        int i30 = (i29 & (-1777034015)) + ((-1777034015) | i29);
        int i31 = i30 >> 26;
        int i32 = ((i31 & ComposerKt.defaultsKey) + (i31 | ComposerKt.defaultsKey)) / 64;
        int i33 = (i30 - (~(((i32 | 1) << 1) - (i32 ^ 1)))) - 1;
        int i34 = (i31 + ComposerKt.defaultsKey) / 64;
        int i35 = (-(i33 ^ ((i34 ^ 1) + ((i34 & 1) << 1)))) + 3;
        int i36 = i35 >> 29;
        progressBar.setVisibility(0 / ((i35 & (-(((((i36 | (-15)) << 1) - (i36 ^ (-15))) / 8) + 2))) * 1387));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle savedInstanceState) {
        int i = 2 % 2;
        super.onCreate(savedInstanceState);
        Application application = requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "");
        this.zzb = (zzpw) new ViewModelProvider(this, zzpk.zza(application)).get(zzpw.class);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void configureFromSearchByTextRequest(SearchByTextRequest request) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(request, "");
        zzn();
        zzpw zzpwVar = this.zzb;
        zzpb zzpbVar = null;
        if (zzpwVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzpwVar = null;
        }
        List list = this.zzl;
        if (list == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        zzpwVar.zzf(request, zzq(list));
        zzpb zzpbVar2 = this.zzg;
        if (zzpbVar2 == null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 != 0) {
                zzpbVar.hashCode();
                throw null;
            }
        } else {
            zzpbVar = zzpbVar2;
        }
        zzpbVar.zzb(zzajw.SEARCH_BY_TEXT_REQUEST);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 0 / 0;
        }
    }

    public final void configureFromSearchNearbyRequest(SearchNearbyRequest request) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(request, "");
        zzn();
        zzpw zzpwVar = this.zzb;
        zzpb zzpbVar = null;
        if (zzpwVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzpwVar = null;
        }
        List list = this.zzl;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        zzpwVar.zzg(request, zzq(list));
        zzpb zzpbVar2 = this.zzg;
        if (zzpbVar2 == null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 == 0) {
                int i6 = 5 / 0;
            }
        } else {
            zzpbVar = zzpbVar2;
        }
        zzpbVar.zzb(zzajw.SEARCH_NEARBY_REQUEST);
    }

    private static final Place zzr(Place place) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Place.Builder builder = Place.builder();
        builder.setId(place.getId());
        builder.setLocation(place.getLocation());
        builder.setViewport(place.getViewport());
        Place placeBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(placeBuild, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return placeBuild;
    }

    private final void zzo(List list) {
        int i = 2 % 2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (!(!it.hasNext())) {
            arrayList.add(zzr((Place) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        PlaceSearchFragmentListener placeSearchFragmentListener = this.zzh;
        if (placeSearchFragmentListener != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            placeSearchFragmentListener.onLoad(arrayList2);
        }
        zzpb zzpbVar = this.zzg;
        if (zzpbVar == null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 != 0) {
                obj.hashCode();
                throw null;
            }
            zzpbVar = null;
        }
        zzpbVar.zzd();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(outState, "");
        super.onSaveInstanceState(outState);
        outState.putParcelable("arg-media-size", this.zzq);
        outState.putParcelable("arg-attribution-position", this.zzp);
        outState.putBoolean("arg-selectable", this.zzn);
        outState.putBoolean("arg-prefer-truncation", this.zzo);
        outState.putBoolean("arg-show-legal-disclosures", this.zzj);
        RecyclerView recyclerView = this.zzc;
        if (recyclerView == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView = null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Parcelable parcelableOnSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
        if (parcelableOnSaveInstanceState != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            outState.putParcelable("arg-scroll-state", parcelableOnSaveInstanceState);
            if (i4 != 0) {
                throw null;
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(inflater, "");
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "");
        Orientation orientation = (Orientation) zzof.zza(bundleRequireArguments, "arg-orientation", Orientation.class);
        this.zzk = orientation;
        if (orientation == null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            orientation = null;
        }
        if (orientation == Orientation.VERTICAL) {
            i = R.layout.place_search_vertical_fragment;
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i = R.layout.place_search_horizontal_fragment;
        }
        Bundle bundleRequireArguments2 = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments2, "");
        this.zzl = ((zzaj) zzof.zza(bundleRequireArguments2, "arg-content", zzaj.class)).zza();
        this.zzm.setValue(this, zza[0], Integer.valueOf(requireArguments().getInt("arg-theme-res-id")));
        View viewInflate = inflater.cloneInContext(new ContextThemeWrapper(getContext(), zzl())).inflate(i, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return viewInflate;
    }

    private static final List zzq(List list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Place.Field.DISPLAY_NAME);
        arrayList.add(Place.Field.ID);
        arrayList.add(Place.Field.LOCATION);
        arrayList.add(Place.Field.VIEWPORT);
        if (!(!list.contains(Content.MEDIA))) {
            arrayList.add(Place.Field.PHOTO_METADATAS);
        }
        if (list.contains(Content.ADDRESS)) {
            arrayList.add(Place.Field.FORMATTED_ADDRESS);
        }
        if (!(!list.contains(Content.RATING))) {
            arrayList.add(Place.Field.USER_RATING_COUNT);
            arrayList.add(Place.Field.RATING);
        }
        if (list.contains(Content.PRICE)) {
            arrayList.add(Place.Field.PRICE_LEVEL);
            arrayList.add(Place.Field.PRICE_RANGE);
        }
        if (list.contains(Content.TYPE)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(Place.Field.PRIMARY_TYPE_DISPLAY_NAME);
        }
        if (list.contains(Content.ACCESSIBLE_ENTRANCE_ICON)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                arrayList.add(Place.Field.ACCESSIBILITY_OPTIONS);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            arrayList.add(Place.Field.ACCESSIBILITY_OPTIONS);
        }
        if (list.contains(Content.OPEN_NOW_STATUS)) {
            arrayList.add(Place.Field.CURRENT_OPENING_HOURS);
            arrayList.add(Place.Field.UTC_OFFSET);
            arrayList.add(Place.Field.BUSINESS_STATUS);
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        zzajp zzajpVar;
        zzajz zzajzVar;
        zzajr zzajrVar;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            this.zzo = savedInstanceState.getBoolean("arg-prefer-truncation");
            this.zzn = savedInstanceState.getBoolean("arg-selectable");
            this.zzq = (MediaSize) zzof.zza(savedInstanceState, "arg-media-size", MediaSize.class);
            this.zzp = (AttributionPosition) zzof.zza(savedInstanceState, "arg-attribution-position", AttributionPosition.class);
            if (savedInstanceState.containsKey("arg-scroll-state")) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                this.zzi = zzof.zza(savedInstanceState, "arg-scroll-state", Parcelable.class);
            }
            boolean z = savedInstanceState.getBoolean("arg-show-legal-disclosures");
            this.zzj = z;
            if (z) {
                zzm();
            }
        }
        this.zzf = (ProgressBar) view.findViewById(R.id.loading_indicator);
        this.zzc = (RecyclerView) view.findViewById(R.id.place_search_list_recycler_view);
        Orientation orientation = this.zzk;
        zzpb zzpbVar = null;
        if (orientation == null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = 2 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            orientation = null;
        }
        zzaju zzajuVar = orientation == Orientation.VERTICAL ? zzaju.ORIENTATION_VERTICAL : zzaju.ORIENTATION_HORIZONTAL;
        List list = this.zzl;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            if (i8 % 2 == 0) {
                ((Content) it.next()).ordinal();
                throw null;
            }
            switch ((Content) it.next()) {
                case Content.MEDIA:
                    zzajrVar = zzajr.PHOTO;
                    break;
                case Content.ADDRESS:
                    zzajrVar = zzajr.ADDRESS;
                    break;
                case Content.RATING:
                    zzajrVar = zzajr.RATING;
                    break;
                case Content.PRICE:
                    zzajrVar = zzajr.PRICE;
                    break;
                case Content.TYPE:
                    zzajrVar = zzajr.TYPE;
                    break;
                case Content.ACCESSIBLE_ENTRANCE_ICON:
                    zzajrVar = zzajr.ACCESSIBILITY;
                    break;
                case Content.OPEN_NOW_STATUS:
                    zzajrVar = zzajr.OPEN_NOW_STATUS;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(zzajrVar);
        }
        ArrayList arrayList2 = arrayList;
        boolean z2 = this.zzn;
        boolean z3 = this.zzo;
        int iOrdinal = this.zzq.ordinal();
        if (iOrdinal == 0) {
            zzajpVar = zzajp.SMALL;
        } else if (iOrdinal == 1) {
            zzajpVar = zzajp.MEDIUM;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            zzajpVar = zzajp.LARGE;
        }
        zzajp zzajpVar2 = zzajpVar;
        int iOrdinal2 = this.zzp.ordinal();
        if (iOrdinal2 == 0) {
            zzajzVar = zzajz.POSITION_TOP;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            zzajzVar = zzajz.POSITION_BOTTOM;
        }
        zzpb zzpbVar2 = new zzpb(zzajuVar, arrayList2, z2, z3, zzajpVar2, zzajzVar);
        this.zzg = zzpbVar2;
        zzpw zzpwVar = this.zzb;
        if (zzpwVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 % 5;
            }
            zzpwVar = null;
        }
        zzoy zzoyVarZze = zzpwVar.zze();
        zzpbVar2.zza(zzoyVarZze != null ? zzoyVarZze.zzd() : null);
        zzp(null, "");
        zzpw zzpwVar2 = this.zzb;
        if (zzpwVar2 == null) {
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            int i12 = i11 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzpwVar2 = null;
        }
        zzpwVar2.zza().observe(getViewLifecycleOwner(), new zzas(new zzar(this)));
        zzpw zzpwVar3 = this.zzb;
        if (zzpwVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzpwVar3 = null;
        }
        zzpwVar3.zzc().observe(getViewLifecycleOwner(), new zzas(new Function1() { // from class: com.google.android.libraries.places.widget.zzak
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceSearchFragment.zze(this.zza, (List) obj);
            }
        }));
        zzpw zzpwVar4 = this.zzb;
        if (zzpwVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzpwVar4 = null;
        }
        zzpwVar4.zzb().observe(getViewLifecycleOwner(), new zzas(new Function1() { // from class: com.google.android.libraries.places.widget.zzal
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceSearchFragment.zzf(this.zza, (Exception) obj);
            }
        }));
        zzpb zzpbVar3 = this.zzg;
        if (zzpbVar3 == null) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            int i14 = i13 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            zzpbVar = zzpbVar3;
        }
        zzpbVar.zzc();
    }

    private final void zzp(List list, String str) {
        ImageView imageView;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = (LinearLayout) requireView().findViewById(R.id.place_search_attribution_container_top);
        Object obj = null;
        if (linearLayout != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                AttributionPosition attributionPosition = AttributionPosition.TOP;
                throw null;
            }
            linearLayout.setVisibility(this.zzp == AttributionPosition.TOP ? 0 : 8);
        }
        LinearLayout linearLayout2 = (LinearLayout) requireView().findViewById(R.id.place_search_attribution_container_bottom);
        if (linearLayout2 != null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                AttributionPosition attributionPosition2 = AttributionPosition.BOTTOM;
                throw null;
            }
            linearLayout2.setVisibility(this.zzp == AttributionPosition.BOTTOM ? 0 : 8);
        }
        if (list == null || list.size() == 0) {
            View viewFindViewById = requireView().findViewById(R.id.place_search_horizontal_top_gap);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            View viewFindViewById2 = requireView().findViewById(R.id.place_search_horizontal_bottom_gap);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
        } else {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            if (i6 % 2 != 0) {
                requireView().findViewById(R.id.place_search_horizontal_top_gap);
                obj.hashCode();
                throw null;
            }
            View viewFindViewById3 = requireView().findViewById(R.id.place_search_horizontal_top_gap);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(this.zzp == AttributionPosition.BOTTOM ? 0 : 8);
            }
            View viewFindViewById4 = requireView().findViewById(R.id.place_search_horizontal_bottom_gap);
            if (viewFindViewById4 != null) {
                viewFindViewById4.setVisibility(this.zzp == AttributionPosition.TOP ? 0 : 8);
            }
        }
        TextView textView = (TextView) requireView().findViewById(R.id.place_search_text_top);
        TextView textView2 = (TextView) requireView().findViewById(R.id.place_search_text_bottom);
        if (str == null) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else if (this.zzp == AttributionPosition.TOP) {
            if (textView != null) {
                textView.setText(str);
            } else {
                textView = null;
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView2 != null) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                if (i7 % 2 != 0) {
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
            }
        } else {
            if (textView2 != null) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                int i9 = i8 % 2;
                textView2.setText(str);
            } else {
                textView2 = null;
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iZza = zzod.zza(contextRequireContext, zzl());
        View viewFindViewById5 = requireView().findViewById(R.id.place_search_attribution_container_top);
        View viewFindViewById6 = requireView().findViewById(R.id.place_search_attribution_container_bottom);
        if (viewFindViewById5 != null) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            int i11 = i10 % 2;
            imageView = (ImageView) viewFindViewById5.findViewById(R.id.place_search_google_maps_attribution_image);
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setColorFilter(iZza);
        }
        ImageView imageView2 = viewFindViewById6 != null ? (ImageView) viewFindViewById6.findViewById(R.id.place_search_google_maps_attribution_image) : null;
        if (imageView2 != null) {
            imageView2.setColorFilter(iZza);
        }
        ImageView imageView3 = viewFindViewById5 != null ? (ImageView) viewFindViewById5.findViewById(R.id.place_search_disclosure_icon_image) : null;
        if (imageView3 != null) {
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
            int i13 = i12 % 2;
            imageView3.setColorFilter(iZza);
        }
        ImageView imageView4 = viewFindViewById6 != null ? (ImageView) viewFindViewById6.findViewById(R.id.place_search_disclosure_icon_image) : null;
        if (imageView4 != null) {
            imageView4.setColorFilter(iZza);
        }
        if (viewFindViewById5 != null) {
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
            int i15 = i14 % 2;
            View viewFindViewById7 = viewFindViewById5.findViewById(R.id.place_search_disclosure_icon);
            if (viewFindViewById7 != null) {
                viewFindViewById7.setOnClickListener(new zzan(this));
            }
        }
        if (viewFindViewById6 != null) {
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
            if (i16 % 2 != 0) {
                viewFindViewById6.findViewById(R.id.place_search_disclosure_icon);
                throw null;
            }
            View viewFindViewById8 = viewFindViewById6.findViewById(R.id.place_search_disclosure_icon);
            if (viewFindViewById8 != null) {
                viewFindViewById8.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzao
                    @Override // android.view.View.OnClickListener
                    public final /* synthetic */ void onClick(View view) {
                        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                        try {
                            PlaceSearchFragment.zzi(this.zza, view);
                        } finally {
                            ViewPortBuilder.b();
                        }
                    }
                });
            }
        }
    }

    public final AttributionPosition zza() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - View.MeasureSpec.makeMeasureSpec(0, 0)), ExpandableListView.getPackedPositionChild(0L) + 41, 19 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1513912262, false, "b", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37836), View.getDefaultSize(0, 0) + 59, 18 - View.combineMeasuredStates(0, 0), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 37836), 60 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -318;
        long j3 = -1;
        long j4 = j3 ^ 2999313694490097758L;
        long j5 = j3 ^ 2519939802669688481L;
        long jNextInt = new Random().nextInt();
        long j6 = (((long) (-317)) * 2999313694490097758L) + (((long) 319) * 2519939802669688481L) + (((((j4 | j5) | jNextInt) ^ j3) | (((jNextInt ^ j3) | 3170463692613484287L) ^ j3)) * j2) + (j2 * (((j5 | 2999313694490097758L) ^ j3) | ((2999313694490097758L | jNextInt) ^ j3))) + (((long) TypedValues.AttributesType.TYPE_PIVOT_TARGET) * (j5 | ((j4 | jNextInt) ^ j3)));
        int i7 = 0;
        while (true) {
            for (int i8 = 0; i8 != 8; i8++) {
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                int i10 = i9 % 2;
                i6 = (((((int) (j >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
            }
            if (i7 != 0) {
                break;
            }
            i7++;
            j = j6;
        }
        if (i6 != i4) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46401 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 39 - TextUtils.lastIndexOf("", '0', 0, 0), Drawable.resolveOpacity(0, 0) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw new RuntimeException(String.valueOf(i5));
        }
        return this.zzp;
    }

    @JvmStatic
    public static final PlaceSearchFragment newInstance(List<? extends Content> list) {
        PlaceSearchFragment placeSearchFragmentNewInstance;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            placeSearchFragmentNewInstance = INSTANCE.newInstance(list);
            int i3 = 44 / 0;
        } else {
            placeSearchFragmentNewInstance = INSTANCE.newInstance(list);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return placeSearchFragmentNewInstance;
    }

    @JvmStatic
    public static final PlaceSearchFragment newInstance(List<? extends Content> list, Orientation orientation) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Companion companion = INSTANCE;
        if (i3 != 0) {
            return companion.newInstance(list, orientation);
        }
        companion.newInstance(list, orientation);
        throw null;
    }

    @JvmStatic
    public static final PlaceSearchFragment newInstance(List<? extends Content> list, Orientation orientation, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        PlaceSearchFragment placeSearchFragmentNewInstance = INSTANCE.newInstance(list, orientation, i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return placeSearchFragmentNewInstance;
    }

    public static final /* synthetic */ Orientation zzc(PlaceSearchFragment placeSearchFragment) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        Orientation orientation = placeSearchFragment.zzk;
        int i5 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return orientation;
    }

    static /* synthetic */ void zzg(PlaceSearchFragment placeSearchFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        placeSearchFragment.zzj = i2 % 2 == 0;
    }

    public final boolean getPreferTruncation() {
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            z = this.zzo;
            int i4 = 24 / 0;
        } else {
            z = this.zzo;
        }
        int i5 = i3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean getSelectable() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.zzn;
        int i5 = i2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final void registerListener(PlaceSearchFragmentListener listener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(listener, "");
        this.zzh = listener;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAttributionPosition(AttributionPosition attributionPosition) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attributionPosition, "");
        this.zzp = attributionPosition;
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setMediaSize(MediaSize mediaSize) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mediaSize, "");
        this.zzq = mediaSize;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
    }

    public final void setPreferTruncation(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.zzo = z;
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
    }

    public final void setSelectable(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        this.zzn = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void unregisterListener() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.zzh = null;
        int i5 = i2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentbindingInflater1 = -83722448;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = 120 - r6
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r1 = com.google.android.libraries.places.widget.PlaceSearchFragment.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.PlaceSearchFragment.$$g(int, int, byte):java.lang.String");
    }
}
