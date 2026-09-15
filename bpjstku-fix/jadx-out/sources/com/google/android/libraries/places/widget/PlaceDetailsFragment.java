package com.google.android.libraries.places.widget;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzaiw;
import com.google.android.libraries.places.internal.zzaiz;
import com.google.android.libraries.places.internal.zzajb;
import com.google.android.libraries.places.internal.zzod;
import com.google.android.libraries.places.internal.zzof;
import com.google.android.libraries.places.internal.zzon;
import com.google.android.libraries.places.internal.zzoo;
import com.google.android.libraries.places.internal.zzoy;
import com.google.android.libraries.places.widget.internal.photoviewer.PlacesLightboxActivity;
import com.google.android.libraries.places.widget.internal.placedetails.zzbb;
import com.google.android.libraries.places.widget.internal.placedetails.zzbc;
import com.google.android.libraries.places.widget.internal.placedetails.zzbi;
import com.google.android.libraries.places.widget.internal.placedetails.zzbj;
import com.google.android.libraries.places.widget.internal.placedetails.zzbk;
import com.google.android.libraries.places.widget.internal.placedetails.zzbl;
import com.google.android.libraries.places.widget.internal.placedetails.zzbm;
import com.google.android.libraries.places.widget.internal.placedetails.zzbn;
import com.google.android.libraries.places.widget.internal.placedetails.zzbo;
import com.google.android.libraries.places.widget.internal.placedetails.zzbp;
import com.google.android.libraries.places.widget.internal.placedetails.zzcf;
import com.google.android.libraries.places.widget.model.Orientation;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.ViewPortBuilder;
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
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 x2\u00020\u0001:\u0003vwxB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J$\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u001a\u0010A\u001a\u0002092\u0006\u0010B\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010C\u001a\u000209H\u0002J\u0010\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020FH\u0007J\u0010\u0010G\u001a\u0002092\u0006\u0010H\u001a\u00020FH\u0007J\u0010\u0010I\u001a\u0002092\u0006\u0010J\u001a\u00020KH\u0007J\u0010\u0010L\u001a\u0002092\u0006\u0010M\u001a\u00020.H\u0007J\b\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u000209H\u0002J\b\u0010Q\u001a\u000209H\u0002J\u0010\u0010T\u001a\u0002092\u0006\u0010U\u001a\u000200H\u0002J\u0010\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020XH\u0002J\b\u0010Y\u001a\u000209H\u0002J\u0014\u0010Z\u001a\u0002092\n\u0010[\u001a\u00060\\j\u0002`]H\u0002J\"\u0010^\u001a\u0002092\u0006\u0010B\u001a\u00020\u00052\b\u0010_\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u00020bH\u0002J1\u0010c\u001a\u0002092\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\b2\u0012\u0010g\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050h\"\u00020\u0005H\u0002¢\u0006\u0002\u0010iJ\u0010\u0010j\u001a\u0002092\u0006\u0010f\u001a\u00020\bH\u0002J\u000e\u0010k\u001a\b\u0012\u0004\u0012\u00020*0%H\u0002J\u0010\u0010l\u001a\u0002092\u0006\u0010W\u001a\u00020XH\u0002J\b\u0010m\u001a\u000209H\u0002J\u0010\u0010n\u001a\u0002092\u0006\u0010B\u001a\u00020\u0005H\u0002J\f\u0010o\u001a\u00020p*\u00020#H\u0002J\f\u0010q\u001a\u00020r*\u00020&H\u0002J\u0010\u0010s\u001a\u0002092\u0006\u0010t\u001a\u00020uH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0%X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R+\u00101\u001a\u0002002\u0006\u0010/\u001a\u0002008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u0010R\u001a\u00020SX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006y"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "collageLayout", "Landroid/view/View;", "collageCardView", "image", "Landroid/widget/ImageView;", "image2", "image3", "displayName", "Landroid/widget/TextView;", "summary", "summaryAndTabsDivider", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "tabsAndTabContentDivider", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "pagerAdapter", "Lcom/google/android/libraries/places/widget/internal/placedetails/TabsPagerAdapter;", "loadingProgressBar", "Landroid/widget/ProgressBar;", "loadingFailedMessage", "metadataViewController", "Lcom/google/android/libraries/places/widget/internal/placedetails/MetadataViewController;", "attributionImage", "legalDisclosuresIcon", "numberOfPhotosChipLabel", "numberOfPhotosChip", "loadFailureUi", "image2CardView", "image3CardView", "orientation", "Lcom/google/android/libraries/places/widget/model/Orientation;", FirebaseAnalytics.Param.CONTENT, "", "Lcom/google/android/libraries/places/widget/PlaceDetailsFragment$Content;", "analyticsReporter", "Lcom/google/android/libraries/places/widget/internal/placedetails/AnalyticsReporter;", "fieldsToLoad", "Lcom/google/android/libraries/places/api/model/Place$Field;", "viewModel", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceDetailsViewModel;", "_placeLoadListener", "Lcom/google/android/libraries/places/widget/PlaceLoadListener;", "<set-?>", "", "themeResId", "getThemeResId", "()I", "setThemeResId", "(I)V", "themeResId$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "updateNumberOfPhotosChipLabel", "loadWithPlaceId", "placeId", "", "loadWithResourceName", "resourceName", "loadWithCoordinates", "coordinates", "Lcom/google/android/gms/maps/model/LatLng;", "setPlaceLoadListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "createRequestConfigs", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceDetailsViewModel$RequestConfiguration;", "showLoadingState", "updateImageButton", "onClickListener", "Landroid/view/View$OnClickListener;", "startPhotoPager", FirebaseAnalytics.Param.INDEX, "updateUi", "place", "Lcom/google/android/libraries/places/api/model/Place;", "hideAllContent", "onPlaceLoadFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setContent", "text", "", "contentSelected", "", "updateImage", "placeImage", "Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceImage;", "imageView", "wrapperViews", "", "(Lcom/google/android/libraries/places/widget/internal/placedetails/PlaceImage;Landroid/widget/ImageView;[Landroid/view/View;)V", "handleFailureForViewTarget", "contentToPlaceFields", "setUpTabs", "onTabsContentUpdated", "updatePagerViewHeight", "toAnalyticsOrientation", "Lcom/google/common/logging/location/PlacesProto$PlaceDetailsWidgetProto$PlaceDetailsWidgetOrientation;", "toAnalyticsContent", "Lcom/google/common/logging/location/PlacesProto$PlaceDetailsWidgetProto$PlaceDetailsWidgetContent;", "setTestComponent", "component", "Lcom/google/android/libraries/places/widget/internal/inject/PlacesWidgetComponent;", "Content", "ParcelableContentList", "Companion", "java.com.google.android.libraries.places.widget_place_details_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlaceDetailsFragment extends Fragment {
    private List zzA;
    private zzbi zzB;
    private PlaceLoadListener zzC;
    private final ReadWriteProperty zzD = Delegates.INSTANCE.notNull();
    private final View.OnClickListener zzE = new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzab
        @Override // android.view.View.OnClickListener
        public final /* synthetic */ void onClick(View view) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
            try {
                PlaceDetailsFragment.zzf(this.zza, view);
            } finally {
                ViewPortBuilder.b();
            }
        }
    };
    private View zzb;
    private View zzc;
    private ImageView zzd;
    private ImageView zze;
    private ImageView zzf;
    private TextView zzg;
    private TextView zzh;
    private View zzi;
    private TabLayout zzj;
    private View zzk;
    private ViewPager2 zzl;
    private zzcf zzm;
    private ProgressBar zzn;
    private TextView zzo;
    private com.google.android.libraries.places.widget.internal.placedetails.zzaa zzp;
    private ImageView zzq;
    private ImageView zzr;
    private TextView zzs;
    private View zzt;
    private View zzu;
    private View zzv;
    private View zzw;
    private Orientation zzx;
    private List zzy;
    private com.google.android.libraries.places.widget.internal.placedetails.zzp zzz;
    static final /* synthetic */ KProperty[] zza = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PlaceDetailsFragment.class, "themeResId", "getThemeResId()I", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final List<Content> STANDARD_CONTENT = CollectionsKt.listOf((Object[]) new Content[]{Content.MEDIA, Content.ADDRESS, Content.RATING, Content.TYPE, Content.PRICE, Content.ACCESSIBLE_ENTRANCE_ICON, Content.SUMMARY, Content.OPENING_HOURS, Content.WEBSITE, Content.PHONE_NUMBER, Content.TYPE_SPECIFIC_HIGHLIGHTS, Content.REVIEWS, Content.FEATURES});
    public static final List<Content> ALL_CONTENT = CollectionsKt.toList(Content.getEntries());

    public static final /* synthetic */ void zza(final PlaceDetailsFragment placeDetailsFragment, Place place) {
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar;
        ProgressBar progressBar = placeDetailsFragment.zzn;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        TextView textView = placeDetailsFragment.zzg;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        placeDetailsFragment.zzt(textView, place.getDisplayName(), true);
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar2 = placeDetailsFragment.zzp;
        if (zzaaVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzaaVar = null;
        } else {
            zzaaVar = zzaaVar2;
        }
        List list = placeDetailsFragment.zzy;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        boolean zContains = list.contains(Content.RATING);
        List list2 = placeDetailsFragment.zzy;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list2 = null;
        }
        boolean zContains2 = list2.contains(Content.TYPE);
        List list3 = placeDetailsFragment.zzy;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list3 = null;
        }
        boolean zContains3 = list3.contains(Content.PRICE);
        List list4 = placeDetailsFragment.zzy;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list4 = null;
        }
        boolean zContains4 = list4.contains(Content.ACCESSIBLE_ENTRANCE_ICON);
        List list5 = placeDetailsFragment.zzy;
        if (list5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list5 = null;
        }
        boolean zContains5 = list5.contains(Content.OPEN_NOW_STATUS);
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar3 = placeDetailsFragment.zzz;
        if (zzpVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzpVar = null;
        } else {
            zzpVar = zzpVar3;
        }
        zzaaVar.zza(place, zContains, zContains2, zContains3, zContains4, zContains5, zzpVar);
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar3 = placeDetailsFragment.zzp;
        if (zzaaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzaaVar3 = null;
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar4 = placeDetailsFragment.zzz;
        if (zzpVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzpVar4 = null;
        }
        zzaaVar3.zzb(place, zzpVar4);
        TextView textView2 = placeDetailsFragment.zzh;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView2 = null;
        }
        TextView textView3 = textView2;
        String editorialSummary = place.getEditorialSummary();
        List list6 = placeDetailsFragment.zzy;
        if (list6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list6 = null;
        }
        placeDetailsFragment.zzt(textView3, editorialSummary, list6.contains(Content.SUMMARY));
        FragmentManager childFragmentManager = placeDetailsFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Lifecycle lifecycle = placeDetailsFragment.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        Context contextRequireContext = placeDetailsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        List list7 = placeDetailsFragment.zzy;
        if (list7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list7 = null;
        }
        boolean zContains6 = list7.contains(Content.FEATURES);
        List list8 = placeDetailsFragment.zzy;
        if (list8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list8 = null;
        }
        placeDetailsFragment.zzm = new zzcf(childFragmentManager, lifecycle, contextRequireContext, zContains6, list8.contains(Content.OPENING_HOURS), place, placeDetailsFragment.zzo());
        ViewPager2 viewPager2 = placeDetailsFragment.zzl;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager2 = null;
        }
        zzcf zzcfVar = placeDetailsFragment.zzm;
        if (zzcfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzcfVar = null;
        }
        viewPager2.setAdapter(zzcfVar);
        ViewPager2 viewPager3 = placeDetailsFragment.zzl;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager3 = null;
        }
        viewPager3.registerOnPageChangeCallback(new zzaf(placeDetailsFragment));
        zzcf zzcfVar2 = placeDetailsFragment.zzm;
        if (zzcfVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzcfVar2 = null;
        }
        int itemCount = zzcfVar2.getItemCount();
        if (itemCount < 2) {
            TabLayout tabLayout = placeDetailsFragment.zzj;
            if (tabLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                tabLayout = null;
            }
            tabLayout.setVisibility(8);
            View view = placeDetailsFragment.zzk;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view = null;
            }
            view.setVisibility(8);
        } else {
            TabLayout tabLayout2 = placeDetailsFragment.zzj;
            if (tabLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                tabLayout2 = null;
            }
            tabLayout2.setVisibility(0);
            View view2 = placeDetailsFragment.zzk;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view2 = null;
            }
            view2.setVisibility(0);
        }
        if (itemCount == 0) {
            ViewPager2 viewPager4 = placeDetailsFragment.zzl;
            if (viewPager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewPager4 = null;
            }
            viewPager4.setVisibility(8);
            View view3 = placeDetailsFragment.zzi;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view3 = null;
            }
            view3.setVisibility(8);
        } else {
            ViewPager2 viewPager5 = placeDetailsFragment.zzl;
            if (viewPager5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewPager5 = null;
            }
            viewPager5.setVisibility(0);
            View view4 = placeDetailsFragment.zzi;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view4 = null;
            }
            view4.setVisibility(0);
        }
        TabLayout tabLayout3 = placeDetailsFragment.zzj;
        if (tabLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tabLayout3 = null;
        }
        ViewPager2 viewPager6 = placeDetailsFragment.zzl;
        if (viewPager6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager6 = null;
        }
        new TabLayoutMediator(tabLayout3, viewPager6, new TabLayoutMediator.TabConfigurationStrategy() { // from class: com.google.android.libraries.places.widget.zzz
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final /* synthetic */ void onConfigureTab(TabLayout.Tab tab, int i) {
                PlaceDetailsFragment.zzm(this.zza, tab, i);
            }
        }).attach();
        ImageView imageView = placeDetailsFragment.zzd;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        View.OnClickListener onClickListener = placeDetailsFragment.zzE;
        imageView.setOnClickListener(onClickListener);
        ImageView imageView2 = placeDetailsFragment.zze;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView2 = null;
        }
        imageView2.setOnClickListener(onClickListener);
        ImageView imageView3 = placeDetailsFragment.zzf;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView3 = null;
        }
        imageView3.setOnClickListener(onClickListener);
        Place.Builder builder = Place.builder();
        builder.setId(place.getId());
        builder.setViewport(place.getViewport());
        builder.setLocation(place.getLocation());
        Place placeBuild = builder.build();
        PlaceLoadListener placeLoadListener = placeDetailsFragment.zzC;
        if (placeLoadListener != null) {
            Intrinsics.checkNotNull(placeBuild);
            placeLoadListener.onSuccess(placeBuild);
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar5 = placeDetailsFragment.zzz;
        if (zzpVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            zzpVar2 = zzpVar5;
        }
        zzpVar2.zzc();
    }

    public static final /* synthetic */ void zzb(PlaceDetailsFragment placeDetailsFragment, Exception exc) {
        ProgressBar progressBar = placeDetailsFragment.zzn;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        View view = placeDetailsFragment.zzb;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        view.setVisibility(8);
        TextView textView = placeDetailsFragment.zzo;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setVisibility(0);
        PlaceLoadListener placeLoadListener = placeDetailsFragment.zzC;
        if (placeLoadListener != null) {
            placeLoadListener.onFailure(exc);
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = placeDetailsFragment.zzz;
        if (zzpVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            zzpVar = zzpVar2;
        }
        zzpVar.zzd();
    }

    public static final /* synthetic */ void zze(PlaceDetailsFragment placeDetailsFragment, ImageView imageView) {
        ImageView imageView2 = placeDetailsFragment.zzd;
        View view = null;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView2 = null;
        }
        if (Intrinsics.areEqual(imageView, imageView2)) {
            View view2 = placeDetailsFragment.zzu;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view2 = null;
            }
            view2.setVisibility(0);
            View view3 = placeDetailsFragment.zzv;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view3 = null;
            }
            view3.setVisibility(8);
            View view4 = placeDetailsFragment.zzw;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                view = view4;
            }
            view.setVisibility(8);
            return;
        }
        ImageView imageView3 = placeDetailsFragment.zze;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView3 = null;
        }
        if (Intrinsics.areEqual(imageView, imageView3)) {
            View view5 = placeDetailsFragment.zzv;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view5 = null;
            }
            view5.setVisibility(8);
            View view6 = placeDetailsFragment.zzw;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                view = view6;
            }
            view.setVisibility(8);
            return;
        }
        ImageView imageView4 = placeDetailsFragment.zzf;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView4 = null;
        }
        if (Intrinsics.areEqual(imageView, imageView4)) {
            View view7 = placeDetailsFragment.zzw;
            if (view7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                view = view7;
            }
            view.setVisibility(8);
        }
    }

    static /* synthetic */ void zzf(PlaceDetailsFragment placeDetailsFragment, View view) {
        ImageView imageView = placeDetailsFragment.zzd;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        if (Intrinsics.areEqual(view, imageView)) {
            placeDetailsFragment.zzr(0);
            return;
        }
        ImageView imageView3 = placeDetailsFragment.zze;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView3 = null;
        }
        if (Intrinsics.areEqual(view, imageView3)) {
            placeDetailsFragment.zzr(1);
            return;
        }
        ImageView imageView4 = placeDetailsFragment.zzf;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            imageView2 = imageView4;
        }
        if (Intrinsics.areEqual(view, imageView2)) {
            placeDetailsFragment.zzr(2);
        }
    }

    static /* synthetic */ void zzg(PlaceDetailsFragment placeDetailsFragment, View view) {
        ArrayList arrayList = new ArrayList();
        List list = placeDetailsFragment.zzy;
        List list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        if (list.contains(Content.REVIEWS)) {
            arrayList.add(zzon.REVIEWS_ARENT_VERIFIED);
            arrayList.add(zzon.REVIEW_ORDERING);
        } else {
            List list3 = placeDetailsFragment.zzy;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                list2 = list3;
            }
            if (list2.contains(Content.RATING)) {
                arrayList.add(zzon.REVIEWS_ARENT_VERIFIED);
            }
        }
        Context contextRequireContext = placeDetailsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        new zzoo(contextRequireContext, placeDetailsFragment.zzo(), arrayList).show();
    }

    static /* synthetic */ Unit zzh(PlaceDetailsFragment placeDetailsFragment, Unit unit) {
        placeDetailsFragment.zzv();
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit zzi(PlaceDetailsFragment placeDetailsFragment, zzbp zzbpVar) {
        List<PhotoMetadata> photoMetadatas;
        zzbi zzbiVar = placeDetailsFragment.zzB;
        ImageView imageView = null;
        if (zzbiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar = null;
        }
        Place place = (Place) zzbiVar.zza().getValue();
        int size = (place == null || (photoMetadatas = place.getPhotoMetadatas()) == null) ? 0 : photoMetadatas.size();
        if (size == 0) {
            View view = placeDetailsFragment.zzt;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view = null;
            }
            view.setVisibility(8);
        } else {
            TextView textView = placeDetailsFragment.zzs;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView = null;
            }
            textView.setText(placeDetailsFragment.getResources().getQuantityString(R.plurals.place_details_photo_count, size, Integer.valueOf(size)));
            View view2 = placeDetailsFragment.zzt;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view2 = null;
            }
            view2.setVisibility(0);
        }
        Intrinsics.checkNotNull(zzbpVar);
        ImageView imageView2 = placeDetailsFragment.zzd;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView2 = null;
        }
        View[] viewArr = new View[2];
        View view3 = placeDetailsFragment.zzc;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view3 = null;
        }
        viewArr[0] = view3;
        ImageView imageView3 = placeDetailsFragment.zzd;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            imageView = imageView3;
        }
        Object parent = imageView.getParent();
        Intrinsics.checkNotNull(parent, "");
        viewArr[1] = (View) parent;
        placeDetailsFragment.zzu(zzbpVar, imageView2, viewArr);
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit zzj(PlaceDetailsFragment placeDetailsFragment, zzbp zzbpVar) {
        Intrinsics.checkNotNull(zzbpVar);
        ImageView imageView = placeDetailsFragment.zze;
        View view = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        View[] viewArr = new View[1];
        View view2 = placeDetailsFragment.zzv;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view = view2;
        }
        viewArr[0] = view;
        placeDetailsFragment.zzu(zzbpVar, imageView, viewArr);
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit zzk(PlaceDetailsFragment placeDetailsFragment, zzbp zzbpVar) {
        Intrinsics.checkNotNull(zzbpVar);
        ImageView imageView = placeDetailsFragment.zzf;
        View view = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        View[] viewArr = new View[1];
        View view2 = placeDetailsFragment.zzw;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view = view2;
        }
        viewArr[0] = view;
        placeDetailsFragment.zzu(zzbpVar, imageView, viewArr);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void zzl(PlaceDetailsFragment placeDetailsFragment, zzbp zzbpVar, View[] viewArr, ImageView imageView) {
        List list = placeDetailsFragment.zzy;
        Orientation orientation = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        if (list.contains(Content.MEDIA)) {
            if (zzbpVar instanceof zzbl) {
                b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(placeDetailsFragment), null, null, new zzah(placeDetailsFragment, zzbpVar, imageView, null), 3, null);
                return;
            }
            if (zzbpVar instanceof zzbm) {
                for (View view : viewArr) {
                    view.setVisibility(0);
                }
                imageView.setImageDrawable(placeDetailsFragment.getResources().getDrawable(R.drawable.place_details_image_loading_background, new ContextThemeWrapper(placeDetailsFragment.requireContext(), placeDetailsFragment.zzo()).getTheme()));
                return;
            }
            if (zzbpVar instanceof zzbn) {
                for (View view2 : viewArr) {
                    view2.setVisibility(8);
                }
                return;
            }
            if (!(zzbpVar instanceof zzbo) && !(zzbpVar instanceof zzbk)) {
                throw new NoWhenBranchMatchedException();
            }
            Orientation orientation2 = placeDetailsFragment.zzx;
            if (orientation2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                orientation = orientation2;
            }
            imageView.setImageDrawable(placeDetailsFragment.getResources().getDrawable(orientation == Orientation.HORIZONTAL ? R.drawable.place_details_placeholder_horizontal : R.drawable.place_details_placeholder_vertical, placeDetailsFragment.requireContext().getTheme()));
        }
    }

    static /* synthetic */ void zzm(PlaceDetailsFragment placeDetailsFragment, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        zzcf zzcfVar = placeDetailsFragment.zzm;
        String string = null;
        if (zzcfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzcfVar = null;
        }
        int itemViewType = zzcfVar.getItemViewType(i);
        if (itemViewType == 1) {
            string = placeDetailsFragment.getString(R.string.place_details_overview_tab_name);
        } else if (itemViewType == 2) {
            string = placeDetailsFragment.getString(R.string.place_details_reviews_tab_name);
        } else if (itemViewType == 3) {
            string = placeDetailsFragment.getString(R.string.place_details_about_tab_name);
        }
        tab.setText(string);
    }

    static /* synthetic */ void zzn(View view, PlaceDetailsFragment placeDetailsFragment) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewPager2 viewPager2 = placeDetailsFragment.zzl;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager2 = null;
        }
        if (viewPager2.getLayoutParams().height != view.getMeasuredHeight()) {
            ViewPager2 viewPager4 = placeDetailsFragment.zzl;
            if (viewPager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewPager4 = null;
            }
            ViewGroup.LayoutParams layoutParams = viewPager4.getLayoutParams();
            layoutParams.height = view.getMeasuredHeight();
            ViewPager2 viewPager5 = placeDetailsFragment.zzl;
            if (viewPager5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                viewPager3 = viewPager5;
            }
            viewPager3.setLayoutParams(layoutParams);
        }
    }

    private final int zzo() {
        return ((Number) this.zzD.getValue(this, zza[0])).intValue();
    }

    private final zzbc zzp() {
        List list = this.zzy;
        List list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        boolean zContains = list.contains(Content.MEDIA);
        List list3 = this.zzA;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            list2 = list3;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return zzbb.zza(zContains, list2, contextRequireContext);
    }

    private final void zzq() {
        zzs();
        ProgressBar progressBar = this.zzn;
        View view = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        List list = this.zzy;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        if (list.contains(Content.MEDIA)) {
            View view2 = this.zzb;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                view = view2;
            }
            view.setVisibility(0);
        }
    }

    private final void zzr(int i) {
        zzbi zzbiVar = this.zzB;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = null;
        if (zzbiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar = null;
        }
        ArrayList arrayListZzj = zzbiVar.zzj();
        if (arrayListZzj.isEmpty()) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        com.google.android.libraries.places.widget.internal.photoviewer.zzm zzmVar = new com.google.android.libraries.places.widget.internal.photoviewer.zzm(arrayListZzj);
        int iZzo = zzo();
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = this.zzz;
        if (zzpVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzpVar2 = null;
        }
        Intrinsics.checkNotNullParameter(contextRequireContext, "");
        Intrinsics.checkNotNullParameter(zzmVar, "");
        Intrinsics.checkNotNullParameter(zzpVar2, "");
        Intent intent = new Intent(contextRequireContext, (Class<?>) PlacesLightboxActivity.class);
        intent.putExtra("extra-photo-page-data-list", zzmVar);
        intent.putExtra("extra-start-index", i);
        intent.putExtra("extra-theme-res-id", iZzo);
        intent.putExtra("extra-analytics-reporter", zzpVar2);
        fragmentActivityRequireActivity.startActivity(intent);
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar3 = this.zzz;
        if (zzpVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            zzpVar = zzpVar3;
        }
        zzpVar.zzg();
    }

    private final void zzs() {
        TextView textView = this.zzg;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        textView.setVisibility(8);
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar = this.zzp;
        if (zzaaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzaaVar = null;
        }
        zzaaVar.zzc();
        TextView textView3 = this.zzh;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView3 = null;
        }
        textView3.setVisibility(8);
        View view = this.zzi;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        view.setVisibility(8);
        TabLayout tabLayout = this.zzj;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tabLayout = null;
        }
        tabLayout.setVisibility(8);
        View view2 = this.zzk;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view2 = null;
        }
        view2.setVisibility(8);
        ViewPager2 viewPager2 = this.zzl;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager2 = null;
        }
        viewPager2.setVisibility(8);
        ProgressBar progressBar = this.zzn;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            progressBar = null;
        }
        progressBar.setVisibility(8);
        TextView textView4 = this.zzo;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            textView2 = textView4;
        }
        textView2.setVisibility(8);
    }

    private final void zzt(View view, CharSequence charSequence, boolean z) {
        if (!z || charSequence == null || StringsKt.isBlank(charSequence)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
        view.setVisibility(0);
    }

    private final void zzu(final zzbp zzbpVar, final ImageView imageView, final View... viewArr) {
        requireView().post(new Runnable() { // from class: com.google.android.libraries.places.widget.zzy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                PlaceDetailsFragment.zzl(this.zza, zzbpVar, viewArr, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        ViewPager2 viewPager2 = this.zzl;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager2 = null;
        }
        int currentItem = viewPager2.getCurrentItem();
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder(String.valueOf(currentItem).length() + 1);
        sb.append("f");
        sb.append(currentItem);
        Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(sb.toString());
        final View view = fragmentFindFragmentByTag != null ? fragmentFindFragmentByTag.getView() : null;
        if (view != null) {
            view.post(new Runnable() { // from class: com.google.android.libraries.places.widget.zzaa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    PlaceDetailsFragment.zzn(view, this);
                }
            });
        } else {
            new StringBuilder(String.valueOf(currentItem).length() + 34);
        }
    }

    public final void loadWithCoordinates(LatLng coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "");
        zzq();
        zzbi zzbiVar = this.zzB;
        if (zzbiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar = null;
        }
        zzbiVar.zzg(coordinates, zzp());
    }

    public final void loadWithPlaceId(String placeId) {
        Intrinsics.checkNotNullParameter(placeId, "");
        zzq();
        zzbi zzbiVar = this.zzB;
        if (zzbiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar = null;
        }
        zzbiVar.zzf(placeId, zzp());
    }

    public final void loadWithResourceName(String resourceName) {
        Intrinsics.checkNotNullParameter(resourceName, "");
        loadWithPlaceId(StringsKt.removePrefix(resourceName, (CharSequence) "place/"));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Application application = requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "");
        this.zzB = (zzbi) new ViewModelProvider(this, com.google.android.libraries.places.widget.internal.placedetails.zzat.zza(application)).get(zzbi.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "");
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "");
        this.zzy = ((zzs) zzof.zza(bundleRequireArguments, "arg-content", zzs.class)).zza();
        zzbj zzbjVar = new zzbj();
        List list = this.zzy;
        List list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        if (list.contains(Content.MEDIA)) {
            zzbjVar.zza();
        }
        List list3 = this.zzy;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list3 = null;
        }
        if (list3.contains(Content.ADDRESS)) {
            zzbjVar.zzb();
        }
        List list4 = this.zzy;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list4 = null;
        }
        if (list4.contains(Content.RATING)) {
            zzbjVar.zzc();
        }
        List list5 = this.zzy;
        if (list5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list5 = null;
        }
        if (list5.contains(Content.PRICE)) {
            zzbjVar.zzd();
        }
        List list6 = this.zzy;
        if (list6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list6 = null;
        }
        if (list6.contains(Content.TYPE)) {
            zzbjVar.zze();
        }
        List list7 = this.zzy;
        if (list7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list7 = null;
        }
        if (list7.contains(Content.ACCESSIBLE_ENTRANCE_ICON)) {
            zzbjVar.zzf();
        }
        List list8 = this.zzy;
        if (list8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list8 = null;
        }
        if (list8.contains(Content.OPEN_NOW_STATUS)) {
            zzbjVar.zzg();
        }
        List list9 = this.zzy;
        if (list9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list9 = null;
        }
        if (list9.contains(Content.SUMMARY)) {
            zzbjVar.zzh();
        }
        List list10 = this.zzy;
        if (list10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list10 = null;
        }
        if (list10.contains(Content.OPENING_HOURS)) {
            zzbjVar.zzg();
        }
        List list11 = this.zzy;
        if (list11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list11 = null;
        }
        if (list11.contains(Content.WEBSITE)) {
            zzbjVar.zzi();
        }
        List list12 = this.zzy;
        if (list12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list12 = null;
        }
        if (list12.contains(Content.PHONE_NUMBER)) {
            zzbjVar.zzj();
        }
        List list13 = this.zzy;
        if (list13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list13 = null;
        }
        if (list13.contains(Content.TYPE_SPECIFIC_HIGHLIGHTS)) {
            zzbjVar.zzk();
        }
        List list14 = this.zzy;
        if (list14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list14 = null;
        }
        if (list14.contains(Content.REVIEWS)) {
            zzbjVar.zzl();
        }
        List list15 = this.zzy;
        if (list15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list15 = null;
        }
        if (list15.contains(Content.PLUS_CODE)) {
            zzbjVar.zzm();
        }
        List list16 = this.zzy;
        if (list16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            list2 = list16;
        }
        if (list2.contains(Content.FEATURES)) {
            zzbjVar.zzn();
        }
        this.zzA = zzbjVar.zzo();
        Bundle bundleRequireArguments2 = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments2, "");
        this.zzx = (Orientation) zzof.zza(bundleRequireArguments2, "arg-orientation", Orientation.class);
        this.zzD.setValue(this, zza[0], Integer.valueOf(requireArguments().getInt("arg-theme-res-id")));
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), zzo());
        if (this.zzx == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        View viewInflate = inflater.cloneInContext(contextThemeWrapper).inflate(R.layout.place_details_vertical_fragment, container, false);
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        zzaiw zzaiwVar;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        this.zzb = view.findViewById(R.id.place_collage_card);
        this.zzc = view.findViewById(R.id.place_collage);
        this.zzd = (ImageView) view.findViewById(R.id.place_image);
        this.zze = (ImageView) view.findViewById(R.id.place_image2);
        this.zzf = (ImageView) view.findViewById(R.id.place_image3);
        this.zzg = (TextView) view.findViewById(R.id.place_name);
        this.zzh = (TextView) view.findViewById(R.id.place_summary);
        this.zzi = view.findViewById(R.id.summary_and_tabs_divider);
        this.zzl = (ViewPager2) view.findViewById(R.id.tabs_view_pager);
        this.zzk = view.findViewById(R.id.tabs_and_tab_content_divider);
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        this.zzj = tabLayout;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = null;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tabLayout = null;
        }
        tabLayout.setTabGravity(0);
        this.zzn = (ProgressBar) view.findViewById(R.id.loading_indicator);
        this.zzo = (TextView) view.findViewById(R.id.loading_failed_message);
        this.zzq = (ImageView) view.findViewById(R.id.google_maps_attribution);
        this.zzr = (ImageView) view.findViewById(R.id.legal_disclosures_icon);
        this.zzs = (TextView) view.findViewById(R.id.place_image_card_number_of_photos_text);
        this.zzt = view.findViewById(R.id.place_image_card_number_of_photos);
        this.zzu = view.findViewById(R.id.place_collage_error);
        this.zzv = view.findViewById(R.id.place_image_card2);
        this.zzw = view.findViewById(R.id.place_image_card3);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iZzo = zzo();
        zzbi zzbiVar = this.zzB;
        if (zzbiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar = null;
        }
        zzoy zzoyVarZze = zzbiVar.zze();
        this.zzp = new com.google.android.libraries.places.widget.internal.placedetails.zzaa(view, contextRequireContext, iZzo, zzoyVarZze != null ? zzoyVarZze.zzb() : null);
        zzs();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        int iZza = zzod.zza(contextRequireContext2, zzo());
        ImageView imageView = this.zzq;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        imageView.setColorFilter(iZza);
        ImageView imageView2 = this.zzr;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView2 = null;
        }
        imageView2.setColorFilter(iZza);
        ImageView imageView3 = this.zzr;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView3 = null;
        }
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzt
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    PlaceDetailsFragment.zzg(this.zza, view2);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        zzbi zzbiVar2 = this.zzB;
        if (zzbiVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar2 = null;
        }
        zzbiVar2.zza().observe(getViewLifecycleOwner(), new zzae(new zzac(this)));
        zzbi zzbiVar3 = this.zzB;
        if (zzbiVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar3 = null;
        }
        zzbiVar3.zzb().observe(getViewLifecycleOwner(), new zzae(new zzad(this)));
        zzbi zzbiVar4 = this.zzB;
        if (zzbiVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar4 = null;
        }
        zzbiVar4.zzd().observe(getViewLifecycleOwner(), new zzae(new Function1() { // from class: com.google.android.libraries.places.widget.zzu
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceDetailsFragment.zzh(this.zza, (Unit) obj);
            }
        }));
        zzbi zzbiVar5 = this.zzB;
        if (zzbiVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar5 = null;
        }
        ((LiveData) zzbiVar5.zzc().get(0)).observe(getViewLifecycleOwner(), new zzae(new Function1() { // from class: com.google.android.libraries.places.widget.zzv
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceDetailsFragment.zzi(this.zza, (zzbp) obj);
            }
        }));
        zzbi zzbiVar6 = this.zzB;
        if (zzbiVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar6 = null;
        }
        ((LiveData) zzbiVar6.zzc().get(1)).observe(getViewLifecycleOwner(), new zzae(new zzw(this)));
        zzbi zzbiVar7 = this.zzB;
        if (zzbiVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar7 = null;
        }
        ((LiveData) zzbiVar7.zzc().get(2)).observe(getViewLifecycleOwner(), new zzae(new Function1() { // from class: com.google.android.libraries.places.widget.zzx
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return PlaceDetailsFragment.zzk(this.zza, (zzbp) obj);
            }
        }));
        zzajb zzajbVar = zzajb.VARIANT_FULL;
        Orientation orientation = this.zzx;
        if (orientation == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            orientation = null;
        }
        zzaiz zzaizVar = orientation == Orientation.VERTICAL ? zzaiz.ORIENTATION_VERTICAL : zzaiz.ORIENTATION_HORIZONTAL;
        List list = this.zzy;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            switch ((Content) it.next()) {
                case Content.MEDIA:
                    zzaiwVar = zzaiw.PHOTO;
                    break;
                case Content.ADDRESS:
                    zzaiwVar = zzaiw.ADDRESS;
                    break;
                case Content.RATING:
                    zzaiwVar = zzaiw.RATING;
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
                case Content.SUMMARY:
                    zzaiwVar = zzaiw.SUMMARY;
                    break;
                case Content.OPENING_HOURS:
                    zzaiwVar = zzaiw.OPENING_HOURS;
                    break;
                case Content.WEBSITE:
                    zzaiwVar = zzaiw.WEBSITE;
                    break;
                case Content.PHONE_NUMBER:
                    zzaiwVar = zzaiw.PHONE_NUMBER;
                    break;
                case Content.TYPE_SPECIFIC_HIGHLIGHTS:
                    zzaiwVar = zzaiw.TYPE_SPECIFIC_HIGHLIGHTS;
                    break;
                case Content.REVIEWS:
                    zzaiwVar = zzaiw.REVIEWS;
                    break;
                case Content.PLUS_CODE:
                    zzaiwVar = zzaiw.PLUS_CODE;
                    break;
                case Content.FEATURES:
                    zzaiwVar = zzaiw.FEATURES;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(zzaiwVar);
        }
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = new com.google.android.libraries.places.widget.internal.placedetails.zzp(zzajbVar, zzaizVar, arrayList);
        this.zzz = zzpVar2;
        zzbi zzbiVar8 = this.zzB;
        if (zzbiVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zzbiVar8 = null;
        }
        zzpVar2.zza(zzbiVar8.zzi());
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar3 = this.zzz;
        if (zzpVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            zzpVar = zzpVar3;
        }
        zzpVar.zzb();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0003\u0010\u0018\u001a\u00020\u0019H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsFragment$Companion;", "", "<init>", "()V", "TAG", "", "VIEW_PAGER_FRAGMENT_TAG_PREFIX", "RESOURCE_NAME_PREFIX", "getRESOURCE_NAME_PREFIX$annotations", "ARG_ORIENTATION", "getARG_ORIENTATION$annotations", "ARG_CONTENT", "getARG_CONTENT$annotations", "ARG_THEME_RES_ID", "getARG_THEME_RES_ID$annotations", "STANDARD_CONTENT", "", "Lcom/google/android/libraries/places/widget/PlaceDetailsFragment$Content;", "ALL_CONTENT", "newInstance", "Lcom/google/android/libraries/places/widget/PlaceDetailsFragment;", FirebaseAnalytics.Param.CONTENT, "orientation", "Lcom/google/android/libraries/places/widget/model/Orientation;", "theme", "", "java.com.google.android.libraries.places.widget_place_details_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ PlaceDetailsFragment newInstance$default(Companion companion, List list, Orientation orientation, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                orientation = Orientation.VERTICAL;
            }
            if ((i2 & 4) != 0) {
                i = R.style.PlacesMaterialTheme;
            }
            return companion.newInstance(list, orientation, i);
        }

        @JvmStatic
        public final PlaceDetailsFragment newInstance(List<? extends Content> content, Orientation orientation, int theme) {
            Intrinsics.checkNotNullParameter(content, "");
            Intrinsics.checkNotNullParameter(orientation, "");
            PlaceDetailsFragment placeDetailsFragment = new PlaceDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg-content", new zzs(content));
            bundle.putParcelable("arg-orientation", orientation);
            bundle.putInt("arg-theme-res-id", theme);
            placeDetailsFragment.setArguments(bundle);
            return placeDetailsFragment;
        }

        private Companion() {
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final PlaceDetailsFragment newInstance(List<? extends Content> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return newInstance$default(this, list, null, 0, 6, null);
        }

        @JvmStatic
        public final PlaceDetailsFragment newInstance(List<? extends Content> list, Orientation orientation) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(orientation, "");
            return newInstance$default(this, list, orientation, 0, 4, null);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.places.widget.PlaceDetailsFragment$Content[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.places.widget.PlaceDetailsFragment$Content[]) from 0x00a9: INVOKE (r0v1 com.google.android.libraries.places.widget.PlaceDetailsFragment$Content[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED]
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceDetailsFragment$Content;", "", "<init>", "(Ljava/lang/String;I)V", "MEDIA", "ADDRESS", "RATING", "PRICE", "TYPE", "ACCESSIBLE_ENTRANCE_ICON", "OPEN_NOW_STATUS", "SUMMARY", "OPENING_HOURS", "WEBSITE", "PHONE_NUMBER", "TYPE_SPECIFIC_HIGHLIGHTS", "REVIEWS", "PLUS_CODE", "FEATURES"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content {
        MEDIA,
        ADDRESS,
        RATING,
        PRICE,
        TYPE,
        ACCESSIBLE_ENTRANCE_ICON,
        OPEN_NOW_STATUS,
        SUMMARY,
        OPENING_HOURS,
        WEBSITE,
        PHONE_NUMBER,
        TYPE_SPECIFIC_HIGHLIGHTS,
        REVIEWS,
        PLUS_CODE,
        FEATURES;

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

    @JvmStatic
    public static final PlaceDetailsFragment newInstance(List<? extends Content> list) {
        return INSTANCE.newInstance(list);
    }

    @JvmStatic
    public static final PlaceDetailsFragment newInstance(List<? extends Content> list, Orientation orientation) {
        return INSTANCE.newInstance(list, orientation);
    }

    @JvmStatic
    public static final PlaceDetailsFragment newInstance(List<? extends Content> list, Orientation orientation, int i) {
        return INSTANCE.newInstance(list, orientation, i);
    }

    public final void setPlaceLoadListener(PlaceLoadListener listener) {
        Intrinsics.checkNotNullParameter(listener, "");
        this.zzC = listener;
    }
}
