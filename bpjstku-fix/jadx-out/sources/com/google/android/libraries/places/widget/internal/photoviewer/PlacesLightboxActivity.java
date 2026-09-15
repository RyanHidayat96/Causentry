package com.google.android.libraries.places.widget.internal.photoviewer;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.EdgeToEdge;
import androidx.viewpager2.widget.ViewPager2;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.internal.zzof;
import com.google.android.libraries.places.internal.zzoq;
import defpackage.ByteOrderedDataOutputStream;
import defpackage.CameraUseCaseAdapter;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.ViewPortBuilder;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.initSession;
import defpackage.onCaptureSessionStart;
import defpackage.peek;
import defpackage.readBoolean;
import defpackage.readByte;
import defpackage.readFloat;
import defpackage.readFully;
import defpackage.readInt;
import defpackage.readLine;
import defpackage.readUTF;
import defpackage.readUnsignedByte;
import defpackage.readUnsignedInt;
import defpackage.seek;
import defpackage.setByteOrder;
import defpackage.skipBytes;
import defpackage.writeByte;
import defpackage.writeShort;
import defpackage.writeUnsignedInt;
import defpackage.writeUnsignedShort;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0003<=>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020 H\u0014J\b\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0002J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020(H\u0002J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020(H\u0002J\u0010\u0010/\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020(H\u0002J\u0018\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u0002022\u0006\u0010-\u001a\u00020(H\u0002J\u0018\u00103\u001a\u00020\u00112\u0006\u00101\u001a\u0002022\u0006\u0010-\u001a\u00020(H\u0002J\u0010\u00104\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020(H\u0002J\u0010\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u0011H\u0002J\b\u00107\u001a\u00020\u001eH\u0014J\b\u00108\u001a\u00020\u001eH\u0016J\u001e\u00109\u001a\u00020\u001e2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010;\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/google/android/libraries/places/widget/internal/photoviewer/PlacesLightboxActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/libraries/places/widget/internal/photoviewer/PhotoViewerFragment$PhotoNavigationListener;", "<init>", "()V", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "userProfileImageView", "Landroid/widget/ImageView;", "userName", "Landroid/widget/TextView;", "pageDataList", "", "Lcom/google/android/libraries/places/widget/model/PhotoPageData;", "analyticsReporter", "Lcom/google/android/libraries/places/widget/internal/placedetails/AnalyticsReporter;", "numberOfPhotosShownInGallery", "", "previousPhotoIndex", "<set-?>", "themeResId", "getThemeResId", "()I", "setThemeResId", "(I)V", "themeResId$delegate", "Lkotlin/properties/ReadWriteProperty;", "themeDimensionHelper", "Lcom/google/android/libraries/places/widget/internal/photoviewer/PlacesLightboxActivity$ThemeDimensionHelper;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "onGoToPreviousImage", "onGoToNextImage", "openUserProfile", "showPopupMenu", "anchorView", "Landroid/view/View;", "openUriInBrowser", "uri", "", "adjustBottomMarginForEdgeToEdge", "view", "adjustStartMargin", "adjustEndMargin", "getStartInset", "insets", "Landroidx/core/graphics/Insets;", "getEndInset", "adjustIndicatorMargins", "updateUI", "selectedItem", "onDestroy", "finish", "hookupThePhotos", "photoPageDataList", "initialIndex", "ParcelablePhotoPageDataList", "ThemeDimensionHelper", "Companion", "java.com.google.android.libraries.places.widget.internal.photoviewer_ui_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlacesLightboxActivity extends AppCompatActivity implements zzc {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private static int d;
    static final /* synthetic */ KProperty[] zza;
    private ViewPager2 zzb;
    private ImageView zzc;
    private TextView zzd;
    private List zze;
    private com.google.android.libraries.places.widget.internal.placedetails.zzp zzf;
    private int zzg;
    private int zzh = -1;
    private final ReadWriteProperty zzi = Delegates.INSTANCE.notNull();
    private zzv zzj;
    private static final byte[] $$c = {58, -103, 118, 14};
    private static final int $$f = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {27, 65, -33, 120, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -59, -8, -8, 67, -65, 6, 2, -20, -4, 1, 11, -10, 6, -11, -8, 68, -61, -7, -8, 13, -15, 2, 11, -13, 60, -78, -2, 22, -6, -14, -3, -11, 49, -37, -5, 5, 15, -29, 30, -40, -1, 2, -7, -1, 31, -35, 0, 11, 2, -14, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 63, -14, 0, Base64.padSymbol, -56, 1, -21, 17, -5, -13, 6, 55, -53, -15, 8, -16, 1, 4, 3, 52, -55, -14, -5, 11, 53, -61, -7, -8, 13, -15, 2, 11, -13, 60, -23, -46, -5, 11, 29, -33, 2, -21, -3, 1, 11, 63, -78, -4, 11, -13, 13, -19, 11, 21, -24, -9, 38, -49, 15, -20, 9, 34, -31, -21, 17, 59, -15, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 64, -14, 0, Base64.padSymbol, -54, -16, 4, -11, -3, 7, -12, 69, -56, 1, -21, 17, 49, -73, 0, 12, -15, 66, -65, -4, 9, -3, -9, 60, -70, 11, -14, -6, 14, -16, -3, 68, -41, -29, 10, 1, -21, 13, 31, -35, -19, 11, 4, -4, 15, -29, 2, 4, -11, 0, -17, 37, -22, -25, 53, -56, 19, 14, -21, -4, -4, -8, -1, 41, -46, -8, 5, -8, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, 16, -9, -7, 8, -7, -7, 5, 28, -39, 6, -8, 9, -21, 13, -15, 63, -14, 0, Base64.padSymbol, -53, -17, -2, -5, 11, -8, -15, 18, -15, 66, -61, -7, -8, 13, -15, 2, 11, -13, 60, -21, -7, -36, 53, -61, 23, 13, -9, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 65, -15, 8, -16, 1, 4, 3, 52, -71, -4, 3, -2, -1, -5, -4, 68, -74, 64, 4, -65, 6, -1, -7, 6, 49, -71, 12, -16, -2, 8, -8, -1, 62, -33, -26, -1, -7, 6, 28, -46, -1, -8, 0, 1, 1, -2, 5, -15, 45, -46, 0, -5, 13, -21, 78, -43, -26, -1, -7, 6, 28, -46, -1, -8, 0, 1, 1, -2, 5, -15, 39, -38, -5, 2, 41, -49, 5, 53, -4};
    private static final int $$e = 251;
    private static final byte[] $$a = {23, -73, 107, 5, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
    private static final int $$b = 74;
    private static int asInterface = 0;
    private static int g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f795a = 1;

    static {
        d = 0;
        TuitionPaymentFragmentbindingInflater1();
        zza = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(PlacesLightboxActivity.class, "themeResId", "getThemeResId()I", 0))};
        INSTANCE = new Companion(null);
        int i = f795a + 43;
        d = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ int access$getNumberOfPhotosShownInGallery$p(PlacesLightboxActivity placesLightboxActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = placesLightboxActivity.zzg;
        if (i3 == 0) {
            int i5 = 88 / 0;
        }
        return i4;
    }

    public static final /* synthetic */ int access$getPreviousPhotoIndex$p(PlacesLightboxActivity placesLightboxActivity) {
        int i = 2 % 2;
        int i2 = g + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = placesLightboxActivity.zzh;
        if (i3 != 0) {
            int i5 = 37 / 0;
        }
        return i4;
    }

    public static final /* synthetic */ void access$setNumberOfPhotosShownInGallery$p(PlacesLightboxActivity placesLightboxActivity, int i) {
        int i2 = 2 % 2;
        int i3 = g + 41;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        placesLightboxActivity.zzg = i;
        if (i4 != 0) {
            int i5 = 85 / 0;
        }
    }

    public static final /* synthetic */ void access$setPreviousPhotoIndex$p(PlacesLightboxActivity placesLightboxActivity, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 47;
        g = i3 % 128;
        int i4 = i3 % 2;
        placesLightboxActivity.zzh = i;
        if (i4 == 0) {
            int i5 = 2 / 0;
        }
    }

    public static final /* synthetic */ void access$updateUI(PlacesLightboxActivity placesLightboxActivity, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 81;
        g = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        placesLightboxActivity.zzj(i);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = asInterface + 125;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = 53 - r7
            int r9 = r9 + 84
            byte[] r0 = com.google.android.libraries.places.widget.internal.photoviewer.PlacesLightboxActivity.$$a
            int r8 = 214 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r8
            goto L26
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L26:
            int r8 = r8 + r3
            int r9 = r9 + 1
            int r8 = r8 + (-11)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.photoviewer.PlacesLightboxActivity.e(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = 103 - r9
            int r7 = 79 - r7
            byte[] r0 = com.google.android.libraries.places.widget.internal.photoviewer.PlacesLightboxActivity.$$d
            int r8 = 431 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r5 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            int r8 = r8 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-2)
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.photoviewer.PlacesLightboxActivity.f(short, int, byte, java.lang.Object[]):void");
    }

    static /* synthetic */ void zzb(PlacesLightboxActivity placesLightboxActivity, View view) {
        int i = 2 % 2;
        int i2 = g + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        placesLightboxActivity.zzh();
        int i4 = g + 19;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private final int zzg() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        g = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.zzi.getValue(this, zza[0])).intValue();
        int i4 = asInterface + 85;
        g = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private final void zzh() {
        String strZzf;
        int i = 2 % 2;
        List list = this.zze;
        ViewPager2 viewPager2 = null;
        if (list == null) {
            int i2 = asInterface + 75;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                viewPager2.hashCode();
                throw null;
            }
            list = null;
        }
        ViewPager2 viewPager3 = this.zzb;
        if (viewPager3 == null) {
            int i4 = g + 123;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            viewPager2 = viewPager3;
        }
        com.google.android.libraries.places.widget.model.zzi zziVar = (com.google.android.libraries.places.widget.model.zzi) CollectionsKt.getOrNull(list, viewPager2.getCurrentItem());
        if (zziVar == null || (strZzf = zziVar.zzf()) == null) {
            return;
        }
        zzi(strZzf);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    static /* synthetic */ void zza(PlacesLightboxActivity placesLightboxActivity, View view) {
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar;
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 79;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            zzpVar = placesLightboxActivity.zzf;
            int i5 = 29 / 0;
            if (zzpVar == null) {
                i = i3 + 69;
                g = i % 128;
                zzpVar = null;
                if (i % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        } else {
            zzpVar = placesLightboxActivity.zzf;
            if (zzpVar == null) {
                i = i3 + 69;
                g = i % 128;
                zzpVar = null;
                if (i % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        }
        zzpVar.zzh();
        placesLightboxActivity.finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        int i = 2 % 2;
        int i2 = g + 117;
        asInterface = i2 % 128;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = null;
        if (i2 % 2 != 0) {
            super.finish();
            throw null;
        }
        super.finish();
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = this.zzf;
        if (zzpVar2 == null) {
            int i3 = asInterface + 49;
            g = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i4 == 0) {
                int i5 = 57 / 0;
            }
        } else {
            zzpVar = zzpVar2;
        }
        zzpVar.zzj(this.zzg);
    }

    static /* synthetic */ WindowInsetsCompat zzd(PlacesLightboxActivity placesLightboxActivity, float f, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = g + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(zzm(insets, view) + ((int) f));
        view.setLayoutParams(marginLayoutParams);
        int i4 = g + 63;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return windowInsetsCompat;
    }

    static /* synthetic */ WindowInsetsCompat zze(PlacesLightboxActivity placesLightboxActivity, float f, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        int i2 = g + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(zzl(insets, view) + ((int) f));
        view.setLayoutParams(marginLayoutParams);
        int i4 = asInterface + 99;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return windowInsetsCompat;
    }

    static /* synthetic */ WindowInsetsCompat zzf(PlacesLightboxActivity placesLightboxActivity, float f, View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        g = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()), "");
            view.getLayoutParams();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        marginLayoutParams2.topMargin = insets.top;
        int i3 = (int) f;
        marginLayoutParams2.setMarginStart(zzm(insets, view) + i3);
        marginLayoutParams2.setMarginEnd(zzl(insets, view) + i3);
        view.setLayoutParams(marginLayoutParams);
        int i4 = g + 111;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return windowInsetsCompat;
        }
        obj.hashCode();
        throw null;
    }

    private final void zzj(int i) {
        int i2 = 2 % 2;
        int i3 = g + 61;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        List list = this.zze;
        ImageView imageView = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        com.google.android.libraries.places.widget.model.zzi zziVar = (com.google.android.libraries.places.widget.model.zzi) CollectionsKt.getOrNull(list, i);
        if (zziVar != null) {
            TextView textView = this.zzd;
            if (textView == null) {
                int i5 = asInterface + 73;
                g = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView = null;
            }
            textView.setText(zziVar.zzd());
            RequestBuilder requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Glide.with(this).TuitionPaymentFragmentspecialinlinedviewModeldefault2(zziVar.zze()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            ImageView imageView2 = this.zzc;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                imageView = imageView2;
            }
            requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.into(imageView);
        }
    }

    private static final int zzl(Insets insets, View view) {
        int i = 2 % 2;
        int i2 = g + 71;
        asInterface = i2 % 128;
        if (i2 % 2 == 0 ? view.getLayoutDirection() != 1 : view.getLayoutDirection() != 0) {
            return insets.right;
        }
        int i3 = asInterface + 9;
        g = i3 % 128;
        int i4 = i3 % 2;
        return insets.left;
    }

    private static final int zzm(Insets insets, View view) {
        int i = 2 % 2;
        if (view.getLayoutDirection() != 1) {
            return insets.left;
        }
        int i2 = asInterface + 97;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = insets.right;
        int i5 = asInterface + 101;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void zzi(String str) {
        int i = 2 % 2;
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            int i2 = asInterface + 75;
            g = i2 % 128;
            int i3 = i2 % 2;
        } catch (ActivityNotFoundException unused) {
            new zzoq(this, zzg()).show();
        }
    }

    private static final boolean zzk(PlacesLightboxActivity placesLightboxActivity, MenuItem menuItem) {
        String strZzc;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() != R.id.report_a_photo) {
            return false;
        }
        List list = placesLightboxActivity.zze;
        com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = null;
        if (list == null) {
            int i2 = g + 93;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            list = null;
        }
        ViewPager2 viewPager2 = placesLightboxActivity.zzb;
        if (viewPager2 == null) {
            int i3 = g + 43;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager2 = null;
        }
        com.google.android.libraries.places.widget.model.zzi zziVar = (com.google.android.libraries.places.widget.model.zzi) CollectionsKt.getOrNull(list, viewPager2.getCurrentItem());
        if (zziVar != null && (strZzc = zziVar.zzc()) != null) {
            int i4 = asInterface + 77;
            int i5 = i4 % 128;
            g = i5;
            if (i4 % 2 == 0) {
                com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar2 = placesLightboxActivity.zzf;
                zzpVar.hashCode();
                throw null;
            }
            com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar3 = placesLightboxActivity.zzf;
            if (zzpVar3 == null) {
                int i6 = i5 + 111;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                zzpVar = zzpVar3;
            }
            zzpVar.zzi();
            placesLightboxActivity.zzi(strZzc);
        }
        int i7 = g + 75;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0187  */
    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), 2267 - Color.alpha(0), View.MeasureSpec.getSize(0) + 33, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            char c = '0';
            if (z) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int iResolveSize = View.resolveSize(0, 0) + 3358;
                            int iIndexOf = TextUtils.indexOf("", c, 0) + 19;
                            byte length2 = (byte) $$c.length;
                            byte b5 = (byte) (length2 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, iResolveSize, iIndexOf, -1054011043, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i6++;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getTrimmedLength(""), 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.MeasureSpec.getMode(0) + 33, 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i7 = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L));
                if (z) {
                    int i8 = $10 + 87;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i7 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 1;
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 2855 - TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 14, -1529949196, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i9 = 0; i9 < length3; i9++) {
                        int i10 = $10 + 59;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        bArr5[i9] = (byte) (((long) bArr4[i9]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (!z2) {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i12 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i12]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        int i13 = $10 + 91;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 >>> 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i14]) + 3046761265686732006L)) << s)) ^ b2));
                        } else {
                            byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // com.google.android.libraries.places.widget.internal.photoviewer.zzc
    public final void onGoToNextImage() {
        ViewPager2 viewPager2;
        int i = 2 % 2;
        int i2 = g + 65;
        asInterface = i2 % 128;
        ViewPager2 viewPager3 = null;
        if (i2 % 2 != 0) {
            viewPager2 = this.zzb;
            int i3 = 47 / 0;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewPager2 = null;
            }
        } else {
            viewPager2 = this.zzb;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewPager2 = null;
            }
        }
        List list = this.zze;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = asInterface + 73;
            g = i4 % 128;
            int i5 = i4 % 2;
            list = null;
        }
        int size = list.size();
        ViewPager2 viewPager4 = this.zzb;
        if (viewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            viewPager3 = viewPager4;
        }
        viewPager2.setCurrentItem(Math.min(size - 1, viewPager3.getCurrentItem() + 1), false);
    }

    @Override // com.google.android.libraries.places.widget.internal.photoviewer.zzc
    public final void onGoToPreviousImage() {
        int i = 2 % 2;
        ViewPager2 viewPager2 = this.zzb;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            int i2 = asInterface + 107;
            g = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                throw null;
            }
            viewPager2 = null;
        }
        ViewPager2 viewPager4 = this.zzb;
        if (viewPager4 == null) {
            int i4 = g + 7;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 != 0) {
                int i6 = 17 / 0;
            }
        } else {
            viewPager3 = viewPager4;
        }
        viewPager2.setCurrentItem(Math.max(0, viewPager3.getCurrentItem() - 1), false);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ViewPager2 viewPager2;
        int i = 2 % 2;
        int i2 = g + 85;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            viewPager2 = this.zzb;
            int i3 = 37 / 0;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewPager2 = null;
            }
        } else {
            super.onDestroy();
            viewPager2 = this.zzb;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewPager2 = null;
            }
        }
        viewPager2.setAdapter(null);
        int i4 = g + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:463:0x2bc4  */
    /* JADX WARN: Code duplicated, block: B:464:0x2bc6  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        String str;
        int i;
        String str2;
        Object[] objArr3;
        int i2;
        String str3;
        Object[] objArr4;
        int i3;
        Object[] objArr5;
        String str4;
        int i4;
        String str5;
        Object[] objArr6;
        char c;
        Object[] objArr7;
        char c2;
        int i5;
        Object[] objArr8;
        Object[] objArr9;
        Object[] objArr10;
        String str6;
        Object[] objArr11;
        int i6;
        char c3;
        int i7;
        Object[] objArr12;
        Object[] objArr13;
        char c4;
        char c5;
        Object[] objArr14;
        int i8 = 2 % 2;
        String str7 = "android.app.ActivityThread";
        String str8 = "currentApplication";
        Object[] objArr15 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_review_screen_backend_error_message).substring(0, 25).codePointAt(18) + 2022943011, 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((-2) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 784802563, objArr15);
        String str9 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_camera_screen_instructions_text_face_too_far).substring(0, 25).codePointAt(20) + 2022943002, 7 - TextUtils.getOffsetAfter("", 0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.alfamart_instruction_step6).substring(20, 21).codePointAt(0) - 115), (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 25), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.mandiri_instruction_step2).substring(13, 14).length() + 784802619, objArr16);
        String str10 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.save_time_save_credit).substring(12, 14).length() + 2022943115, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.mandiri_click_pay).substring(0, 16).length() - 8, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) (Process.getGidForName("") - 42), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.timeout_message).substring(3, 4).length() + 784802568, objArr17);
        String str11 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_invalid_parameter).substring(0, 23).length() + 2022943093, Color.alpha(0) + 8, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), (byte) (60 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 784802583 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr18);
        String str12 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        c(KeyEvent.keyCodeFromString("") + 2022943108, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 98, (short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.tnc_title).substring(18, 19).codePointAt(0) - 47), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_network_not_available).substring(0, 23).codePointAt(3) + 784802537, objArr19);
        String str13 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        c(2022943109 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.tab_atm_bni).substring(0, 7).codePointAt(2) - 38), KeyEvent.normalizeMetaState(0) + 784802659, objArr20);
        String str14 = (String) objArr20[0];
        int i9 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.mandiri_click_pay_instruction_step5).substring(0, 3).codePointAt(1) - 1537019964;
        if (i9 != (-573117390) + ((1140901208 | (~(iCodePointAt | 867052197))) * 305) + (((~((~iCodePointAt) | 867052197)) | 1697039740) * 305)) {
            throw null;
        }
        int i10 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bri_mobile_instruction_3).substring(3, 4).codePointAt(0) - 1943647892;
        int i11 = ~iCodePointAt2;
        int i12 = 31016544 | (~(2049313047 | i11));
        int i13 = ~((-1746927876) | iCodePointAt2);
        if (i10 != ((i12 | i13) * (-252)) + 1805290460 + ((i13 | (~(i11 | 2080329591))) * 252)) {
            int i14 = (-719435024) % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c6 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
            int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte[] bArr = $$a;
            Object[] objArr21 = new Object[1];
            e((byte) (bArr[27] - 1), (short) 210, bArr[7], objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c6, doubleTapTimeout, iIndexOf, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c7 = (char) (29945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int longPressTimeout = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr22 = new Object[1];
                e(b3, (short) (b3 | 173), b2, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c7, longPressTimeout, iIndexOf2, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i15 = (~(781346446 | iIdentityHashCode)) | 288100416;
            int i16 = ~iIdentityHashCode;
            int i17 = 1336629635 + ((i15 | (~((-75497991) | i16))) * 886) + (((~(i16 | (-781346447))) | 993948872) * (-1772)) + ((~(i16 | 993948872)) * 886) + 697303319;
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr[3])[0] = i19 ^ (i19 << 5);
            str8 = "currentApplication";
            str13 = str13;
            str14 = str14;
        } else {
            int iIntValue = ((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr24 = {-264844276};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1725 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 28 - ExpandableListView.getPackedPositionChild(0L), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr24), 697303319);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29944);
                    int doubleTapTimeout2 = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iMyPid = (Process.myPid() >> 22) + 23;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr25 = new Object[1];
                    e(b5, (short) (b5 | 173), b4, objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, doubleTapTimeout2, iMyPid, 1599039318, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrB$5f1425da);
                try {
                    long jLongValue = ((Long) Class.forName(str9).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAlpha = (char) (29944 - Color.alpha(0));
                        int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
                        int iIndexOf3 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr26 = new Object[1];
                        e(b7, (short) (b7 | 121), b6, objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, packedPositionType, iIndexOf3, 1596667560, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c8 = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int iArgb = 1755 - Color.argb(0, 0, 0, 0);
                        int i20 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                        byte[] bArr2 = $$a;
                        Object[] objArr27 = new Object[1];
                        e((byte) (bArr2[27] - 1), (short) 210, bArr2[7], objArr27);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c8, iArgb, i20, 986134021, false, (String) objArr27[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArrB$5f1425da;
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
        int i21 = ((int[]) objArr[1])[0];
        int i22 = ((int[]) objArr[0])[0];
        if (i22 != i21) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str15 : strArr) {
                    arrayList.add(str15);
                }
            }
            throw new RuntimeException(String.valueOf(i22));
        }
        int i23 = ((int[]) objArr[3])[0];
        Object[] objArr28 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i24 = ~iIdentityHashCode2;
        int i25 = i23 + 103761587 + (((~(684745352 | i24)) | (~((-897347779) | iIdentityHashCode2))) * 1900) + (((~(i24 | 897347778)) | (~(iIdentityHashCode2 | (-684745353)))) * (-950)) + (((~(iIdentityHashCode2 | 897347778)) | (~(i24 | (-684745353)))) * 950);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr28[3])[0] = i27 ^ (i27 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 43042);
            int iLastIndexOf = 3110 - TextUtils.lastIndexOf("", '0', 0, 0);
            int jumpTapTimeout = 22 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte b8 = $$a[7];
            byte b9 = b8;
            Object[] objArr29 = new Object[1];
            e(b9, (short) (b9 | 69), b8, objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cCombineMeasuredStates, iLastIndexOf, jumpTapTimeout, -1272852037, false, (String) objArr29[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cIndexOf = (char) (43041 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int deadChar = KeyEvent.getDeadChar(0, 0) + 3111;
                int i28 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                byte[] bArr3 = $$a;
                Object[] objArr30 = new Object[1];
                e((byte) (bArr3[27] - 1), (short) 210, bArr3[7], objArr30);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, deadChar, i28, 154975793, false, (String) objArr30[0], null);
            }
            Object[] objArr31 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            int i29 = ((int[]) objArr31[2])[0];
            int i30 = ((int[]) objArr31[1])[0];
            String[] strArr2 = (String[]) objArr31[3];
            int[] iArr = {i30};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i31 = ~iMaxMemory;
            int i32 = 1122035740 + (((~((-1115997205) | i31)) | 589034254) * (-90)) + (((~((-1115997205) | iMaxMemory)) | (-1671427871)) * (-45)) + (((~(iMaxMemory | (-589034255))) | (-1115997205) | (~(i31 | 589034254))) * 45) + 1504666629;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr2[0])[0] = i34 ^ (i34 << 5);
            objArr2 = new Object[]{new int[1], iArr, new int[]{i29}, strArr2};
        } else {
            try {
                Object[] objArr32 = {null, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue()), 0, 1504666629};
                byte[] bArr4 = $$d;
                Object[] objArr33 = new Object[1];
                f(bArr4[66], (short) 428, bArr4[19], objArr33);
                Class<?> cls = Class.forName((String) objArr33[0]);
                Object[] objArr34 = new Object[1];
                f(bArr4[485], (short) 381, bArr4[12], objArr34);
                Object[] objArr35 = (Object[]) cls.getMethod((String) objArr34[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr32);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 43043);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 3111;
                    int iArgb2 = 22 - Color.argb(0, 0, 0, 0);
                    byte[] bArr5 = $$a;
                    Object[] objArr36 = new Object[1];
                    e((byte) (bArr5[27] - 1), (short) 210, bArr5[7], objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(bitsPerPixel, offsetBefore, iArgb2, 154975793, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr35);
                try {
                    long jLongValue2 = ((Long) Class.forName(str9).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 43042);
                        int gidForName = 3110 - Process.getGidForName("");
                        int i35 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr37 = new Object[1];
                        e(b11, (short) (b11 | 173), b10, objArr37);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cKeyCodeFromString, gidForName, i35, -1269618118, false, (String) objArr37[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43042);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 3112;
                        int iBlue = Color.blue(0) + 22;
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr38 = new Object[1];
                        e(b13, (short) (b13 | 69), b12, objArr38);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(scrollBarFadeDuration, modifierMetaStateMask, iBlue, -1272852037, false, (String) objArr38[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                    objArr2 = objArr35;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i36 = ((int[]) objArr2[1])[0];
        int i37 = ((int[]) objArr2[2])[0];
        if (i37 == i36) {
            int i38 = ((int[]) objArr2[0])[0];
            int i39 = ((int[]) objArr2[2])[0];
            int i40 = ((int[]) objArr2[1])[0];
            String[] strArr3 = (String[]) objArr2[3];
            int[] iArr2 = {i39};
            int[] iArr3 = {i40};
            str = str8;
            int i41 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i42 = ~i41;
            int i43 = (~((-578095007) | i42)) | 35719044;
            int i44 = ~(i41 | 1669312414);
            int i45 = i38 + (-1838844934) + ((i43 | i44) * (-502)) + ((i44 | (~(i42 | (-542375963)))) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr[0])[0] = i47 ^ (i47 << 5);
            Object[] objArr39 = {new int[1], iArr3, iArr2, strArr3};
            i = 0;
        } else {
            str = str8;
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr2[3];
            if (strArr4 != null) {
                for (String str16 : strArr4) {
                    arrayList2.add(str16);
                }
            }
            int[] iArr4 = new int[i37];
            int i48 = i37 - 1;
            iArr4[i48] = 1;
            Toast.makeText((Context) null, iArr4[((i37 * i48) % 2) - 1], 1).show();
            int i49 = ((int[]) objArr2[0])[0];
            int i50 = ((int[]) objArr2[2])[0];
            int i51 = ((int[]) objArr2[1])[0];
            String[] strArr5 = (String[]) objArr2[3];
            int[] iArr5 = {i50};
            int i52 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i53 = ~i52;
            int i54 = i49 + 1289282978 + (((~(i53 | 537350293)) | (~((-1167681166) | i53)) | 1167599112) * 464) + (((-82054) | i52) * (-464)) + (((~(i52 | 537350293)) | 1167599112) * 464);
            int i55 = (i54 << 13) ^ i54;
            int i56 = i55 ^ (i55 >>> 17);
            i = 0;
            ((int[]) objArr[0])[0] = i56 ^ (i56 << 5);
            Object[] objArr40 = {new int[1], new int[]{i51}, iArr5, strArr5};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char absoluteGravity = (char) (Gravity.getAbsoluteGravity(i, i) + 31533);
            int mode = View.MeasureSpec.getMode(i) + 921;
            int i57 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27;
            short s = $$a[8];
            Object[] objArr41 = new Object[1];
            e((byte) 52, s, (byte) (s - 3), objArr41);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(absoluteGravity, mode, i57, -1048449946, false, (String) objArr41[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cGreen = (char) (31533 - Color.green(0));
                int longPressTimeout2 = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 28;
                byte[] bArr6 = $$a;
                Object[] objArr42 = new Object[1];
                e((byte) (bArr6[27] - 1), (short) 210, bArr6[7], objArr42);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cGreen, longPressTimeout2, capsMode, -1142834547, false, (String) objArr42[0], null);
            }
            Object[] objArr43 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).get(null);
            objArr3 = new Object[]{new int[1], new int[]{((int[]) objArr43[1])[0]}, (Object[]) objArr43[2], new int[]{((int[]) objArr43[3])[0]}, (String[]) objArr43[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i58 = (((1725486140 + (((-16777553) | iIdentityHashCode3) * (-627))) + (((~((-1551627948) | iIdentityHashCode3)) | 222451696) * (-627))) + (((~(iIdentityHashCode3 | 222451696)) | (~((~iIdentityHashCode3) | 1551627947))) * 627)) - 1151262989;
            int i59 = (i58 << 13) ^ i58;
            int i60 = i59 ^ (i59 >>> 17);
            ((int[]) objArr3[0])[0] = i60 ^ (i60 << 5);
            str7 = "android.app.ActivityThread";
            str = str;
            str2 = str14;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i61 = asInterface + 89;
                g = i61 % 128;
                if (i61 % 2 == 0) {
                    str2 = str14;
                    baseContext = (Context) Class.forName(str13).getMethod(str2, new Class[1]).invoke(null, null);
                } else {
                    str2 = str14;
                    baseContext = (Context) Class.forName(str13).getMethod(str2, new Class[0]).invoke(null, null);
                }
            } else {
                str2 = str14;
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            Object[] objArr44 = {baseContext, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue()), 0, -1151262989};
            byte b14 = (byte) ($$e & 61);
            byte[] bArr7 = $$d;
            Object[] objArr45 = new Object[1];
            f(b14, (short) (b14 | 324), bArr7[19], objArr45);
            Class<?> cls2 = Class.forName((String) objArr45[0]);
            Object[] objArr46 = new Object[1];
            f((byte) (-bArr7[80]), (short) 360, bArr7[301], objArr46);
            Object[] objArr47 = (Object[]) cls2.getMethod((String) objArr46[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr44);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char size = (char) (View.MeasureSpec.getSize(0) + 31533);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 921;
                int iLastIndexOf2 = 27 - TextUtils.lastIndexOf("", '0');
                byte[] bArr8 = $$a;
                Object[] objArr48 = new Object[1];
                e((byte) (bArr8[27] - 1), (short) 210, bArr8[7], objArr48);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(size, iResolveSizeAndState, iLastIndexOf2, -1142834547, false, (String) objArr48[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArr47);
            try {
                long jLongValue3 = ((Long) Class.forName(str9).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cCombineMeasuredStates2 = (char) (31533 - View.combineMeasuredStates(0, 0));
                    int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i62 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
                    byte b15 = $$a[7];
                    byte b16 = b15;
                    Object[] objArr49 = new Object[1];
                    e(b16, (short) (b16 | 173), b15, objArr49);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cCombineMeasuredStates2, maximumFlingVelocity, i62, -778300370, false, (String) objArr49[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char maximumDrawingCacheSize = (char) (31533 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 28;
                    short s2 = $$a[8];
                    Object[] objArr50 = new Object[1];
                    e((byte) 52, s2, (byte) (s2 - 3), objArr50);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(maximumDrawingCacheSize, keyRepeatTimeout2, offsetAfter, -1048449946, false, (String) objArr50[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf6);
                objArr3 = objArr47;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        int i63 = ((int[]) objArr3[1])[0];
        int i64 = ((int[]) objArr3[3])[0];
        if (i64 == i63) {
            int i65 = ((int[]) objArr3[0])[0];
            Object[] objArr51 = {new int[1], new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[]{((int[]) objArr3[3])[0]}, (String[]) objArr3[4]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i66 = i65 + 1926569138 + ((~(1471922167 | iIdentityHashCode4)) * (-301)) + (((~((-1379573432) | iIdentityHashCode4)) | (~((~iIdentityHashCode4) | 394506212))) * (-301)) + (((~(iIdentityHashCode4 | (-394506213))) | (-1379573432)) * 301);
            int i67 = (i66 << 13) ^ i66;
            int i68 = i67 ^ (i67 >>> 17);
            ((int[]) objArr51[0])[0] = i68 ^ (i68 << 5);
            i2 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr6 = (String[]) objArr3[4];
            if (strArr6 != null) {
                for (String str17 : strArr6) {
                    arrayList3.add(str17);
                }
            }
            int[] iArr6 = new int[i64];
            int i69 = i64 - 1;
            iArr6[i69] = 1;
            Toast.makeText((Context) null, iArr6[((i64 * i69) % 2) - 1], 1).show();
            int i70 = ((int[]) objArr3[0])[0];
            Object[] objArr52 = {new int[1], new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[]{((int[]) objArr3[3])[0]}, (String[]) objArr3[4]};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i71 = ~iIdentityHashCode5;
            int i72 = i70 + 1358083267 + (((~(1131002639 | i71)) | 605290624) * 184) + ((iIdentityHashCode5 | 1093216259) * (-184)) + ((~((-643077005) | i71)) * 184);
            int i73 = (i72 << 13) ^ i72;
            int i74 = i73 ^ (i73 >>> 17);
            i2 = 0;
            ((int[]) objArr52[0])[0] = i74 ^ (i74 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int capsMode2 = 876 - TextUtils.getCapsMode("", i2, i2);
            int i75 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            byte[] bArr9 = $$a;
            Object[] objArr53 = new Object[1];
            e((byte) (bArr9[27] - 1), (short) 210, bArr9[7], objArr53);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(packedPositionChild, capsMode2, i75, -1650998592, false, (String) objArr53[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null);
        long jLongValue4 = ((Long) Class.forName(str9).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
            int i76 = 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte b17 = $$a[7];
            byte b18 = b17;
            Object[] objArr54 = new Object[1];
            e(b18, (short) (b18 | 173), b17, objArr54);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(packedPositionChild2, minimumFlingVelocity, i76, 2012020043, false, (String) objArr54[0], null);
        }
        if (j == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 876;
                int iArgb3 = Color.argb(0, 0, 0, 0) + 10;
                byte b19 = $$a[7];
                byte b20 = b19;
                Object[] objArr55 = new Object[1];
                e(b20, (short) (b20 | 69), b19, objArr55);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(absoluteGravity2, keyRepeatDelay, iArgb3, 2012931276, false, (String) objArr55[0], null);
            }
            Object[] objArr56 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).get(null);
            objArr4 = new Object[]{new int[]{((int[]) objArr56[0])[0]}, new int[1], new int[]{((int[]) objArr56[2])[0]}, (String[]) objArr56[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i77 = ~iIdentityHashCode6;
            int i78 = 1992203954 + (((~((-41945175) | i77)) | (~((-201524257) | iIdentityHashCode6)) | (~(245104375 | iIdentityHashCode6))) * 765) + (((~((-243469431) | i77)) | 41945174) * 1530) + (((~(iIdentityHashCode6 | (-243469431))) | (~(i77 | 245104375))) * 765) + 63502365;
            int i79 = (i78 << 13) ^ i78;
            int i80 = i79 ^ (i79 >>> 17);
            ((int[]) objArr4[1])[0] = i80 ^ (i80 << 5);
            str3 = "";
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                baseContext2 = (Context) Class.forName(str13).getMethod(str2, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            Object[] objArr57 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue()), 0, 63502365};
            byte[] bArr10 = $$d;
            Object[] objArr58 = new Object[1];
            f(bArr10[260], (short) 308, bArr10[19], objArr58);
            Class<?> cls3 = Class.forName((String) objArr58[0]);
            Object[] objArr59 = new Object[1];
            f((byte) (-bArr10[80]), (short) ($$e & PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW), bArr10[301], objArr59);
            Object[] objArr60 = (Object[]) cls3.getMethod((String) objArr59[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr57);
            if (baseContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char defaultSize = (char) View.getDefaultSize(0, 0);
                    int iArgb4 = Color.argb(0, 0, 0, 0) + 876;
                    int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                    byte b21 = $$a[7];
                    byte b22 = b21;
                    Object[] objArr61 = new Object[1];
                    e(b22, (short) (b22 | 69), b21, objArr61);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(defaultSize, iArgb4, doubleTapTimeout3, 2012931276, false, (String) objArr61[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, objArr60);
                try {
                    long jLongValue5 = ((Long) Class.forName(str9).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue5);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                        char c9 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                        str3 = r9;
                        int iIndexOf4 = TextUtils.indexOf(str3, str3, 0) + 10;
                        byte b23 = $$a[7];
                        byte b24 = b23;
                        Object[] objArr62 = new Object[1];
                        e(b24, (short) (b24 | 173), b23, objArr62);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c9, windowTouchSlop, iIndexOf4, 2012020043, false, (String) objArr62[0], null);
                    } else {
                        str3 = r9;
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int i81 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int touchSlop = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte[] bArr11 = $$a;
                        Object[] objArr63 = new Object[1];
                        e((byte) (bArr11[27] - 1), (short) 210, bArr11[7], objArr63);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(packedPositionGroup, i81, touchSlop, -1650998592, false, (String) objArr63[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf8);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } else {
                str3 = r9;
                objArr60 = objArr60;
            }
            objArr4 = objArr60;
        }
        int i82 = ((int[]) objArr4[2])[0];
        int i83 = ((int[]) objArr4[0])[0];
        if (i83 == i82) {
            int i84 = asInterface + 21;
            g = i84 % 128;
            int i85 = i84 % 2;
            int i86 = ((int[]) objArr4[1])[0];
            Object[] objArr64 = {new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i87 = i86 + 114271668 + (((~(1048478857 | iIdentityHashCode7)) | 92724 | (~((-1008168629) | iIdentityHashCode7))) * (-744)) + (((~iIdentityHashCode7) | 40402953) * 744) + ((iIdentityHashCode7 | (-92725)) * 744);
            int i88 = i87 ^ (i87 << 13);
            int i89 = i88 ^ (i88 >>> 17);
            ((int[]) objArr64[1])[0] = i89 ^ (i89 << 5);
            i3 = 0;
        } else {
            int[] iArr7 = new int[i83];
            int i90 = i83 - 1;
            iArr7[i90] = 1;
            Toast.makeText((Context) null, iArr7[((i83 * i90) % 2) - 1], 1).show();
            int i91 = ((int[]) objArr4[1])[0];
            Object[] objArr65 = {new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
            int iMyTid = Process.myTid();
            int i92 = i91 + (((627836754 + (((~((-42474006) | iMyTid)) | (~((-2163777) | iMyTid))) * 69)) + (((~(iMyTid | (-606561353))) | ((~((-646871582) | iMyTid)) | 604397576)) * (-69))) - 1833766742);
            int i93 = (i92 << 13) ^ i92;
            int i94 = i93 ^ (i93 >>> 17);
            i3 = 0;
            ((int[]) objArr65[1])[0] = i94 ^ (i94 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
            char cCombineMeasuredStates3 = (char) (53893 - View.combineMeasuredStates(i3, i3));
            int scrollBarFadeDuration2 = 1320 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int size2 = 36 - View.MeasureSpec.getSize(i3);
            short s3 = $$a[8];
            Object[] objArr66 = new Object[1];
            e((byte) 52, s3, (byte) (s3 - 3), objArr66);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cCombineMeasuredStates3, scrollBarFadeDuration2, size2, -1433084963, false, (String) objArr66[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char cMyPid = (char) (53893 - (Process.myPid() >> 22));
                int iNormalizeMetaState = 1320 - KeyEvent.normalizeMetaState(0);
                int iIndexOf5 = TextUtils.indexOf((CharSequence) str3, '0', 0, 0) + 37;
                byte b25 = $$a[7];
                byte b26 = b25;
                Object[] objArr67 = new Object[1];
                e(b26, (short) (b26 | 173), b25, objArr67);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cMyPid, iNormalizeMetaState, iIndexOf5, -1920778747, false, (String) objArr67[0], null);
            }
            Object[] objArr68 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).get(null);
            objArr5 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i95 = ((int[]) objArr68[0])[0];
            int i96 = ((int[]) objArr68[3])[0];
            String[] strArr7 = (String[]) objArr68[2];
            int i97 = ~Process.myUid();
            int i98 = (-1716788624) + (((~(i97 | (-71813))) | (~((-203457609) | i97))) * (-184)) + ((583549202 | (~((-787006811) | i97)) | (~((-583621015) | i97))) * 184) + 1564870517;
            int i99 = (i98 << 13) ^ i98;
            int i100 = i99 ^ (i99 >>> 17);
            ((int[]) objArr5[1])[0] = i100 ^ (i100 << 5);
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                baseContext3 = (Context) Class.forName(str13).getMethod(str2, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            int iIntValue2 = ((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue();
            Object[] objArr69 = {-264844276};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 47977), 1300 - TextUtils.getOffsetAfter(str3, 0), (Process.myPid() >> 22) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr70 = {baseContext3, "com.bpjstku", -1523675163, Integer.valueOf(iIntValue2), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).newInstance(objArr69), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char cResolveSize = (char) (53893 - View.resolveSize(0, 0));
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1320;
                int scrollDefaultDelay = 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte b27 = $$a[7];
                byte b28 = b27;
                Object[] objArr71 = new Object[1];
                e(b28, (short) (b28 | 173), b27, objArr71);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cResolveSize, fadingEdgeLength, scrollDefaultDelay, 819724799, false, (String) objArr71[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - View.resolveSize(0, 0)), 1394 - TextUtils.getCapsMode(str3, 0, 0), 75 - KeyEvent.normalizeMetaState(0)), Boolean.TYPE});
            }
            Object[] objArr72 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).invoke(null, objArr70);
            if (baseContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char threadPriority = (char) (53893 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int i101 = 1321 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 36;
                    byte b29 = $$a[7];
                    byte b30 = b29;
                    Object[] objArr73 = new Object[1];
                    e(b30, (short) (b30 | 173), b29, objArr73);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(threadPriority, i101, jumpTapTimeout2, -1920778747, false, (String) objArr73[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, objArr72);
                try {
                    long jLongValue6 = ((Long) Class.forName(str9).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char maxKeyCode = (char) (53893 - (KeyEvent.getMaxKeyCode() >> 16));
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1320;
                        int i102 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35;
                        byte[] bArr12 = $$a;
                        Object[] objArr74 = new Object[1];
                        e((byte) (bArr12[27] - 1), (short) 210, bArr12[7], objArr74);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(maxKeyCode, iResolveOpacity, i102, -1273706634, false, (String) objArr74[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                        char c10 = (char) (53894 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int offsetAfter2 = TextUtils.getOffsetAfter(str3, 0) + 1320;
                        int offsetBefore2 = TextUtils.getOffsetBefore(str3, 0) + 36;
                        short s4 = $$a[8];
                        Object[] objArr75 = new Object[1];
                        e((byte) 52, s4, (byte) (s4 - 3), objArr75);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c10, offsetAfter2, offsetBefore2, -1433084963, false, (String) objArr75[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                objArr72 = objArr72;
            }
            objArr5 = objArr72;
        }
        int i103 = ((int[]) objArr5[3])[0];
        int i104 = ((int[]) objArr5[0])[0];
        if (i104 == i103) {
            Object[] objArr76 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i105 = ((int[]) objArr5[1])[0];
            int i106 = ((int[]) objArr5[0])[0];
            int i107 = ((int[]) objArr5[3])[0];
            String[] strArr8 = (String[]) objArr5[2];
            str4 = str;
            int i108 = ((Context) Class.forName(str7).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i109 = i105 + (-943739892) + (((~(i108 | 703322804)) | (-667305021)) * (-465)) + ((703322804 | (~((-667305021) | i108))) * 930) + ((i108 | (-100926473)) * 465);
            int i110 = i109 ^ (i109 << 13);
            int i111 = i110 ^ (i110 >>> 17);
            ((int[]) objArr76[1])[0] = i111 ^ (i111 << 5);
        } else {
            str4 = str;
            Toast.makeText((Context) null, i104 / (((i104 - 1) * i104) % 2), 0).show();
            Object[] objArr77 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i112 = ((int[]) objArr5[1])[0];
            int i113 = ((int[]) objArr5[0])[0];
            int i114 = ((int[]) objArr5[3])[0];
            String[] strArr9 = (String[]) objArr5[2];
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i115 = ~iIdentityHashCode8;
            int i116 = i112 + (((1696781776 + (((~((-835994590) | i115)) | (~((-534633236) | iIdentityHashCode8))) * (-370))) + ((((~(iIdentityHashCode8 | (-835994590))) | (~(i115 | (-534633236)))) | (-1071504352)) * (-370))) - 1319619008);
            int i117 = i116 ^ (i116 << 13);
            int i118 = i117 ^ (i117 >>> 17);
            ((int[]) objArr77[1])[0] = i118 ^ (i118 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b((char) (46401 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 40, 18 - ImageFormat.getBitsPerPixel(0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b((char) (MotionEvent.axisFromString(str3) + 46401), 39 - TextUtils.lastIndexOf(str3, '0'), (-16777197) - Color.rgb(0, 0, 0), 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).invoke(obj, null);
        if (savedInstanceState != null) {
            int i119 = g + 11;
            asInterface = i119 % 128;
            if (i119 % 2 != 0) {
                savedInstanceState.getInt("extra-number-of-photos-shown-in-gallery");
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i4 = savedInstanceState.getInt("extra-number-of-photos-shown-in-gallery");
        } else {
            i4 = 0;
        }
        this.zzg = i4;
        this.zzh = savedInstanceState != null ? savedInstanceState.getInt("extra-previous-photo-index") : -1;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.zzi.setValue(this, zza[0], Integer.valueOf(extras.getInt("extra-theme-res-id")));
        setTheme(zzg());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_lightbox_activity);
        PlacesLightboxActivity placesLightboxActivity = this;
        this.zzj = new zzv(placesLightboxActivity, zzg());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        EdgeToEdge.enable$default(this, null, null, 3, null);
        this.zzb = (ViewPager2) findViewById(R.id.photo_pager);
        this.zzc = (ImageView) findViewById(R.id.profile_image);
        this.zzd = (TextView) findViewById(R.id.user_name);
        PageSelectionIndicator pageSelectionIndicator = (PageSelectionIndicator) findViewById(R.id.selection_indicator);
        View viewFindViewById = findViewById(R.id.close_button);
        View viewFindViewById2 = findViewById(R.id.more_button);
        View viewFindViewById3 = findViewById(R.id.user_profile_container);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzu
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    PlacesLightboxActivity.zza(this.zza, view);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzn
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    Intrinsics.checkNotNull(view);
                    final PlacesLightboxActivity placesLightboxActivity2 = this.zza;
                    PopupMenu popupMenu = new PopupMenu(placesLightboxActivity2, view);
                    popupMenu.getMenuInflater().inflate(R.menu.photo_more_menu, popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzp
                        @Override // android.widget.PopupMenu.OnMenuItemClickListener
                        public final /* synthetic */ boolean onMenuItemClick(MenuItem menuItem) {
                            return PlacesLightboxActivity.zzc(placesLightboxActivity2, menuItem);
                        }
                    });
                    popupMenu.show();
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzo
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    PlacesLightboxActivity.zzb(this.zza, view);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        Intrinsics.checkNotNull(pageSelectionIndicator);
        PageSelectionIndicator pageSelectionIndicator2 = pageSelectionIndicator;
        zzv zzvVar = this.zzj;
        if (zzvVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
            zzvVar = null;
        }
        final float fZza = zzvVar.zza();
        ViewCompat.setOnApplyWindowInsetsListener(pageSelectionIndicator2, new OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzt
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final /* synthetic */ WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                PlacesLightboxActivity.zzf(this.zza, fZza, view, windowInsetsCompat);
                return windowInsetsCompat;
            }
        });
        Intrinsics.checkNotNull(viewFindViewById);
        zzv zzvVar2 = this.zzj;
        if (zzvVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
            zzvVar2 = null;
        }
        final float fZza2 = zzvVar2.zza();
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzs
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final /* synthetic */ WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                PlacesLightboxActivity.zze(this.zza, fZza2, view, windowInsetsCompat);
                return windowInsetsCompat;
            }
        });
        Intrinsics.checkNotNull(viewFindViewById3);
        zzv zzvVar3 = this.zzj;
        if (zzvVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
            zzvVar3 = null;
        }
        final float fZza3 = zzvVar3.zza();
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById3, new OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzr
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final /* synthetic */ WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                PlacesLightboxActivity.zzd(this.zza, fZza3, view, windowInsetsCompat);
                return windowInsetsCompat;
            }
        });
        final View viewFindViewById4 = findViewById(R.id.google_maps_logo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, str3);
        int iZzg = zzg();
        int[] iArr8 = R.styleable.PlacesMaterialThemeAttrs;
        Intrinsics.checkNotNullExpressionValue(iArr8, str3);
        TypedArray typedArrayObtainStyledAttributes = placesLightboxActivity.obtainStyledAttributes(iZzg, iArr8);
        zzv zzvVar4 = this.zzj;
        if (zzvVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
            zzvVar4 = null;
        }
        final float fZzb = zzvVar4.zzb();
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById4, new OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzq
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final /* synthetic */ WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
                ViewGroup.LayoutParams layoutParams = viewFindViewById4.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom + ((int) fZzb));
                return windowInsetsCompat;
            }
        });
        typedArrayObtainStyledAttributes.recycle();
        ViewPager2 viewPager2 = this.zzb;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
            viewPager2 = null;
        }
        viewPager2.setOffscreenPageLimit(4);
        ViewPager2 viewPager3 = this.zzb;
        if (viewPager3 == null) {
            int i120 = asInterface + 91;
            g = i120 % 128;
            if (i120 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(str3);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(str3);
            viewPager3 = null;
        }
        viewPager3.registerOnPageChangeCallback(new zzw(this));
        ViewPager2 viewPager4 = this.zzb;
        if (viewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str3);
            viewPager4 = null;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, str3);
        viewPager4.setAdapter(new zzk(supportFragmentManager, getLifecycle()));
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            int i121 = extras2.getInt("extra-start-index", 0);
            this.zzf = (com.google.android.libraries.places.widget.internal.placedetails.zzp) zzof.zza(extras2, "extra-analytics-reporter", com.google.android.libraries.places.widget.internal.placedetails.zzp.class);
            List listZza = ((zzm) zzof.zza(extras2, "extra-photo-page-data-list", zzm.class)).zza();
            this.zze = listZza;
            if (listZza == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str3);
                listZza = null;
            }
            ViewPager2 viewPager5 = (ViewPager2) findViewById(R.id.photo_pager);
            if (viewPager5 != null) {
                int i122 = g + 25;
                asInterface = i122 % 128;
                if (i122 % 2 != 0) {
                    viewPager5.getAdapter();
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                RecyclerView.Adapter adapter = viewPager5.getAdapter();
                if (adapter != null && (adapter instanceof zzk)) {
                    zzk zzkVar = (zzk) adapter;
                    zzkVar.zza(listZza);
                    zzkVar.notifyDataSetChanged();
                    ViewPager2 viewPager6 = this.zzb;
                    if (viewPager6 == null) {
                        int i123 = asInterface + 87;
                        g = i123 % 128;
                        int i124 = i123 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException(str3);
                        viewPager6 = null;
                    }
                    viewPager6.setCurrentItem(i121, false);
                    zzj(i121);
                }
            }
            ViewPager2 viewPager7 = this.zzb;
            if (viewPager7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str3);
                viewPager7 = null;
            }
            com.google.android.libraries.places.widget.internal.placedetails.zzp zzpVar = this.zzf;
            if (zzpVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str3);
                zzpVar = null;
            }
            Intrinsics.checkNotNullParameter(viewPager7, str3);
            Intrinsics.checkNotNullParameter(zzpVar, str3);
            RecyclerView.Adapter adapter2 = viewPager7.getAdapter();
            Integer numValueOf = adapter2 != null ? Integer.valueOf(adapter2.getItemCount()) : null;
            if (numValueOf == null) {
                zzpVar.zzk();
            } else {
                pageSelectionIndicator.removeAllViews();
                int iIntValue3 = numValueOf.intValue();
                for (int i125 = 0; i125 < iIntValue3; i125++) {
                    View viewInflate = LayoutInflater.from(pageSelectionIndicator.getContext()).inflate(R.layout.page_indicator, (ViewGroup) pageSelectionIndicator, false);
                    Intrinsics.checkNotNull(viewInflate, str3);
                    pageSelectionIndicator.addView(viewInflate);
                }
                viewPager7.registerOnPageChangeCallback(new zzb(pageSelectionIndicator));
            }
            pageSelectionIndicator.zza(i121);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37567);
            int i126 = 625 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iIndexOf6 = TextUtils.indexOf((CharSequence) str3, '0', 0, 0) + 15;
            short s5 = $$a[8];
            Object[] objArr78 = new Object[1];
            e((byte) 52, s5, (byte) (s5 - 3), objArr78);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(keyRepeatDelay2, i126, iIndexOf6, -477065106, false, (String) objArr78[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str9).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 37567);
            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 625;
            int iIndexOf7 = 14 - TextUtils.indexOf(str3, str3, 0);
            byte b31 = $$a[7];
            byte b32 = b31;
            Object[] objArr79 = new Object[1];
            e(b32, (short) (b32 | 69), b31, objArr79);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cNormalizeMetaState, scrollDefaultDelay2, iIndexOf7, -976899241, false, (String) objArr79[0], null);
        }
        if (j2 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char packedPositionGroup2 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 37567);
                int iIndexOf8 = TextUtils.indexOf((CharSequence) str3, '0') + 626;
                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14;
                byte b33 = $$a[7];
                byte b34 = b33;
                Object[] objArr80 = new Object[1];
                e(b34, (short) (b34 | 173), b33, objArr80);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(packedPositionGroup2, iIndexOf8, maximumDrawingCacheSize2, -973632554, false, (String) objArr80[0], null);
            }
            Object[] objArr81 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).get(null);
            int i127 = ((int[]) objArr81[2])[0];
            int i128 = ((int[]) objArr81[0])[0];
            String[] strArr10 = (String[]) objArr81[3];
            int[] iArr9 = {i127};
            int[] iArr10 = {i128};
            int iMyTid2 = Process.myTid();
            int i129 = (-530163983) + (((~((~iMyTid2) | (-130136726))) | 1693601395) * (-235)) + (((~((-130136726) | iMyTid2)) | 1693601395) * (-470)) + (((~(iMyTid2 | (-50442373))) | 1613907042) * 235) + 681006173;
            int i130 = (i129 << 13) ^ i129;
            int i131 = i130 ^ (i130 >>> 17);
            ((int[]) objArr6[1])[0] = i131 ^ (i131 << 5);
            objArr6 = new Object[]{iArr10, new int[1], iArr9, strArr10};
            c = 0;
            str5 = str10;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                baseContext4 = (Context) Class.forName(str13).getMethod(str2, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            int iIntValue4 = ((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue();
            Object[] objArr82 = new Object[1];
            c(((Context) Class.forName(str7).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2022943025, ((Context) Class.forName(str7).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.uikit_shopeepay_instruction_tablet_step2).substring(0, 5).codePointAt(0) - 27, (short) (AndroidCharacter.getMirror('0') - '0'), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 11), ((Context) Class.forName(str7).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 784802578, objArr82);
            String str18 = (String) objArr82[0];
            Object[] objArr83 = new Object[1];
            c((ViewConfiguration.getWindowTouchSlop() >> 8) + 2022943110, ((Context) Class.forName(str7).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.gopay_status_title).substring(1, 3).length() + 54, (short) (((Context) Class.forName(str7).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.payment_method_bca_klikpay).substring(0, 11).length() - 11), (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 127), ((Context) Class.forName(str7).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 784802630, objArr83);
            Object[] objArr84 = {baseContext4, new String[]{str18, (String) objArr83[0]}, Integer.valueOf(iIntValue4), 17, 681006173};
            byte[] bArr13 = $$d;
            byte b35 = (byte) (-bArr13[80]);
            Object[] objArr85 = new Object[1];
            f(b35, (short) (b35 | 164), bArr13[19], objArr85);
            Class<?> cls4 = Class.forName((String) objArr85[0]);
            Object[] objArr86 = new Object[1];
            f(bArr13[485], (short) 381, bArr13[12], objArr86);
            Object[] objArr87 = (Object[]) cls4.getMethod((String) objArr86[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr84);
            int i132 = ((int[]) objArr87[0])[0];
            int i133 = ((int[]) objArr87[2])[0];
            if (baseContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char jumpTapTimeout3 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 37567);
                    int i134 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 625;
                    int iLastIndexOf3 = TextUtils.lastIndexOf(str3, '0', 0, 0) + 15;
                    byte b36 = $$a[7];
                    byte b37 = b36;
                    Object[] objArr88 = new Object[1];
                    e(b37, (short) (b37 | 173), b36, objArr88);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(jumpTapTimeout3, i134, iLastIndexOf3, -973632554, false, (String) objArr88[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, objArr87);
                try {
                    str5 = str10;
                    long jLongValue8 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char packedPositionType2 = (char) (ExpandableListView.getPackedPositionType(0L) + 37567);
                        int i135 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 624;
                        int iArgb5 = 14 - Color.argb(0, 0, 0, 0);
                        byte b38 = $$a[7];
                        byte b39 = b38;
                        Object[] objArr89 = new Object[1];
                        e(b39, (short) (b39 | 69), b38, objArr89);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(packedPositionType2, i135, iArgb5, -976899241, false, (String) objArr89[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                        char packedPositionGroup3 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 37567);
                        int minimumFlingVelocity2 = 625 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i136 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13;
                        short s6 = $$a[8];
                        Object[] objArr90 = new Object[1];
                        e((byte) 52, s6, (byte) (s6 - 3), objArr90);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(packedPositionGroup3, minimumFlingVelocity2, i136, -477065106, false, (String) objArr90[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                str5 = str10;
                objArr87 = objArr87;
            }
            objArr6 = objArr87;
            c = 0;
        }
        int i137 = ((int[]) objArr6[c])[c];
        int i138 = ((int[]) objArr6[2])[c];
        if (i138 == i137) {
            objArr7 = new Object[4];
            int[] iArr11 = new int[1];
            objArr7[c] = iArr11;
            objArr7[1] = new int[1];
            int[] iArr12 = new int[1];
            objArr7[2] = iArr12;
            int i139 = ((int[]) objArr6[1])[c];
            int i140 = ((int[]) objArr6[2])[c];
            int i141 = ((int[]) objArr6[c])[c];
            String[] strArr11 = (String[]) objArr6[3];
            iArr12[c] = i140;
            iArr11[c] = i141;
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i142 = (~((-1351841746) | iIdentityHashCode9)) | 268439825;
            int i143 = ~((~iIdentityHashCode9) | 1555298295);
            int i144 = i139 + (-858563010) + ((i142 | i143) * (-470)) + (((~(iIdentityHashCode9 | (-1083401921))) | i143) * 470);
            int i145 = (i144 << 13) ^ i144;
            int i146 = i145 ^ (i145 >>> 17);
            ((int[]) objArr7[1])[0] = i146 ^ (i146 << 5);
            objArr7[3] = strArr11;
            c2 = 1;
            i5 = 0;
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr12 = (String[]) objArr6[3];
            if (strArr12 != null) {
                int i147 = g + 5;
                asInterface = i147 % 128;
                int i148 = i147 % 2;
                for (String str19 : strArr12) {
                    arrayList4.add(str19);
                }
            }
            int[] iArr13 = new int[i138];
            int i149 = i138 - 1;
            iArr13[i149] = 1;
            Toast.makeText((Context) null, iArr13[((i138 * i149) % 2) - 1], 1).show();
            int i150 = ((int[]) objArr6[1])[0];
            int i151 = ((int[]) objArr6[2])[0];
            int i152 = ((int[]) objArr6[0])[0];
            String[] strArr13 = (String[]) objArr6[3];
            int[] iArr14 = {i151};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i153 = ~startElapsedRealtime;
            int i154 = i150 + 1807134364 + (((~((-1748487239) | i153)) | (~((-75250883) | startElapsedRealtime))) * 210) + (((~(startElapsedRealtime | (-1745076229))) | (~(i153 | (-71839873)))) * 210);
            int i155 = (i154 << 13) ^ i154;
            int i156 = i155 ^ (i155 >>> 17);
            c2 = 1;
            i5 = 0;
            ((int[]) objArr7[1])[0] = i156 ^ (i156 << 5);
            objArr7 = new Object[]{new int[]{i152}, new int[1], iArr14, strArr13};
        }
        ((Field) writeByte.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i5]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1644518221, 2061544890, 527884471}, ((int[]) objArr7[c2])[i5], Integer.MAX_VALUE) + 1264673347);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char c11 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1));
            int windowTouchSlop2 = 2267 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int doubleTapTimeout4 = 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte b40 = $$a[7];
            byte b41 = b40;
            Object[] objArr91 = new Object[1];
            e(b41, (short) (b41 | 173), b40, objArr91);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c11, windowTouchSlop2, doubleTapTimeout4, -887667012, false, (String) objArr91[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) != -1) {
            int i157 = g + 9;
            asInterface = i157 % 128;
            int i158 = i157 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char c12 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267;
                int i159 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32;
                byte[] bArr14 = $$a;
                Object[] objArr92 = new Object[1];
                e((byte) (bArr14[27] - 1), (short) 210, bArr14[7], objArr92);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(c12, jumpTapTimeout4, i159, -654680577, false, (String) objArr92[0], null);
            }
            Object[] objArr93 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
            objArr8 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i160 = ((int[]) objArr93[0])[0];
            int i161 = ((int[]) objArr93[3])[0];
            String[] strArr14 = (String[]) objArr93[1];
            int i162 = ~Process.myPid();
            int i163 = (((~((-1049802162) | i162)) | 813696176) * (-241)) + 141115953 + (((~(i162 | (-236105986))) | (-1054785022)) * 241) + 1704773562;
            int i164 = (i163 << 13) ^ i163;
            int i165 = i164 ^ (i164 >>> 17);
            ((int[]) objArr8[2])[0] = i165 ^ (i165 << 5);
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str13).getMethod(str2, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            Object[] objArr94 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue()), 0, 1704773562};
            byte[] bArr15 = $$d;
            Object[] objArr95 = new Object[1];
            f(bArr15[188], (short) ($$e & 910), bArr15[5], objArr95);
            Class<?> cls5 = Class.forName((String) objArr95[0]);
            Object[] objArr96 = new Object[1];
            f(bArr15[308], (short) (bArr15[3] - 1), bArr15[301], objArr96);
            Object[] objArr97 = (Object[]) cls5.getMethod((String) objArr96[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr94);
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char packedPositionType3 = (char) ExpandableListView.getPackedPositionType(0L);
                    int i166 = 2267 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int offsetAfter3 = 33 - TextUtils.getOffsetAfter(str3, 0);
                    byte[] bArr16 = $$a;
                    Object[] objArr98 = new Object[1];
                    e((byte) (bArr16[27] - 1), (short) 210, bArr16[7], objArr98);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(packedPositionType3, i166, offsetAfter3, -654680577, false, (String) objArr98[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, objArr97);
                try {
                    long jLongValue9 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2267;
                        int edgeSlop2 = 33 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b42 = $$a[7];
                        byte b43 = b42;
                        Object[] objArr99 = new Object[1];
                        e(b43, (short) (b43 | 69), b42, objArr99);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(edgeSlop, keyRepeatDelay3, edgeSlop2, -874156483, false, (String) objArr99[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char c13 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                        int iLastIndexOf4 = 2266 - TextUtils.lastIndexOf(str3, '0', 0, 0);
                        int iIndexOf9 = TextUtils.indexOf((CharSequence) str3, '0') + 34;
                        byte b44 = $$a[7];
                        byte b45 = b44;
                        Object[] objArr100 = new Object[1];
                        e(b45, (short) (b45 | 173), b44, objArr100);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(c13, iLastIndexOf4, iIndexOf9, -887667012, false, (String) objArr100[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            } else {
                objArr97 = objArr97;
            }
            objArr8 = objArr97;
        }
        if (((int[]) objArr8[0])[0] != ((int[]) objArr8[3])[0]) {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr15 = (String[]) objArr8[1];
            if (strArr15 != null) {
                for (String str20 : strArr15) {
                    arrayList5.add(str20);
                }
            }
            throw null;
        }
        Object[] objArr101 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i167 = ((int[]) objArr8[2])[0];
        int i168 = ((int[]) objArr8[0])[0];
        int i169 = ((int[]) objArr8[3])[0];
        String[] strArr16 = (String[]) objArr8[1];
        int iCodePointAt3 = ((Context) Class.forName(str7).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 1729325130;
        int i170 = i167 + ((((~((-328883616) | iCodePointAt3)) | 50479387) * (-283)) - 2085489348) + ((~(iCodePointAt3 | (-278404229))) * 283);
        int i171 = (i170 << 13) ^ i170;
        int i172 = i171 ^ (i171 >>> 17);
        Object obj5 = objArr101[2];
        ((int[]) obj5)[0] = i172 ^ (i172 << 5);
        ((Field) setByteOrder.b[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1026024478, 1731581727, 30929159}, ((int[]) obj5)[0], Integer.MAX_VALUE) - (-966444217));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
            char absoluteGravity3 = (char) Gravity.getAbsoluteGravity(0, 0);
            int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 876;
            int capsMode3 = TextUtils.getCapsMode(str3, 0, 0) + 10;
            byte[] bArr17 = $$a;
            Object[] objArr102 = new Object[1];
            e((byte) 42, bArr17[8], bArr17[205], objArr102);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(absoluteGravity3, maximumDrawingCacheSize3, capsMode3, -1199417970, false, (String) objArr102[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int scrollDefaultDelay3 = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
            byte[] bArr18 = $$a;
            Object[] objArr103 = new Object[1];
            e((byte) 52, bArr18[78], bArr18[27], objArr103);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cMakeMeasureSpec, scrollDefaultDelay3, keyRepeatTimeout3, 254769921, false, (String) objArr103[0], null);
        }
        if (j3 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int mirror = 924 - AndroidCharacter.getMirror('0');
                int i173 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte[] bArr19 = $$a;
                Object[] objArr104 = new Object[1];
                e(bArr19[81], bArr19[78], bArr19[205], objArr104);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(threadPriority2, mirror, i173, 1324201839, false, (String) objArr104[0], null);
            }
            Object[] objArr105 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
            objArr9 = new Object[]{new int[]{((int[]) objArr105[0])[0]}, new int[1], new int[]{((int[]) objArr105[2])[0]}, (String[]) objArr105[3]};
            int i174 = ((Context) Class.forName(str7).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i175 = ~i174;
            int i176 = (-2052369232) + (((~(895916547 | i175)) | (~((-2232324) | i174))) * (-831)) + ((~(938459099 | i174)) * (-1662)) + (((~(i174 | (-895916548))) | (~(i175 | (-936226777))) | (~(936226776 | i174))) * 831) + 1640332600;
            int i177 = (i176 << 13) ^ i176;
            int i178 = i177 ^ (i177 >>> 17);
            ((int[]) objArr9[1])[0] = i178 ^ (i178 << 5);
        } else {
            Object[] objArr106 = {Integer.valueOf(((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue()), 1640332600};
            int i179 = $$e;
            byte[] bArr20 = $$d;
            Object[] objArr107 = new Object[1];
            f((byte) (i179 & 52), (short) (i179 & 342), bArr20[19], objArr107);
            Class<?> cls6 = Class.forName((String) objArr107[0]);
            Object[] objArr108 = new Object[1];
            f((byte) (-bArr20[80]), bArr20[21], bArr20[301], objArr108);
            objArr9 = (Object[]) cls6.getMethod((String) objArr108[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr106);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                int iAlpha = Color.alpha(0) + 10;
                byte[] bArr21 = $$a;
                Object[] objArr109 = new Object[1];
                e(bArr21[81], bArr21[78], bArr21[205], objArr109);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(threadPriority3, iMakeMeasureSpec, iAlpha, 1324201839, false, (String) objArr109[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, objArr9);
            try {
                long jLongValue11 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char c14 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int i180 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                    int i181 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9;
                    byte[] bArr22 = $$a;
                    Object[] objArr110 = new Object[1];
                    e((byte) 52, bArr22[78], bArr22[27], objArr110);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(c14, i180, i181, 254769921, false, (String) objArr110[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue11 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char doubleTapTimeout5 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iArgb6 = 876 - Color.argb(0, 0, 0, 0);
                    int i182 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte[] bArr23 = $$a;
                    Object[] objArr111 = new Object[1];
                    e((byte) 42, bArr23[8], bArr23[205], objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(doubleTapTimeout5, iArgb6, i182, -1199417970, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf16);
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr9[0])[0] != ((int[]) objArr9[2])[0]) {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr17 = (String[]) objArr9[3];
            if (strArr17 != null) {
                for (String str21 : strArr17) {
                    arrayList6.add(str21);
                }
            }
            throw null;
        }
        int i183 = ((int[]) objArr9[1])[0];
        Object[] objArr112 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
        int i184 = ((Context) Class.forName(str7).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i185 = ~i184;
        int i186 = i183 + (((2070192700 + (((~(318059768 | i185)) | (~((-358369998) | i184))) * (-370))) + ((((~(i184 | 318059768)) | (~(i185 | (-358369998)))) | 44119088) * (-370))) - 855806624);
        int i187 = (i186 << 13) ^ i186;
        int i188 = i187 ^ (i187 >>> 17);
        Object obj6 = objArr112[1];
        ((int[]) obj6)[0] = i188 ^ (i188 << 5);
        ((Field) readUnsignedInt.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{496361526, 1465584680, 656249613}, ((int[]) obj6)[0], Integer.MAX_VALUE));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
            char modifierMetaStateMask2 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
            short s7 = $$a[8];
            Object[] objArr113 = new Object[1];
            e((byte) 52, s7, (byte) (s7 - 3), objArr113);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(modifierMetaStateMask2, maximumFlingVelocity2, pressedStateDuration, 252381699, false, (String) objArr113[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null);
        long jLongValue12 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength(str3);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 876;
            int size3 = View.MeasureSpec.getSize(0) + 10;
            byte b46 = $$a[7];
            byte b47 = b46;
            Object[] objArr114 = new Object[1];
            e(b47, (short) (b47 | 121), b46, objArr114);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(trimmedLength, iCombineMeasuredStates, size3, 2009631821, false, (String) objArr114[0], null);
        }
        if (j4 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) str3, '0'));
                int windowTouchSlop3 = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iMyPid2 = (Process.myPid() >> 22) + 10;
                byte[] bArr24 = $$a;
                Object[] objArr115 = new Object[1];
                e((byte) 52, bArr24[7], bArr24[91], objArr115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cIndexOf2, windowTouchSlop3, iMyPid2, 256017550, false, (String) objArr115[0], null);
            }
            Object[] objArr116 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
            objArr10 = new Object[]{new int[]{((int[]) objArr116[0])[0]}, new int[1], new int[]{((int[]) objArr116[2])[0]}, (String[]) objArr116[3]};
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i189 = ~iIdentityHashCode10;
            int i190 = ((((-1621235103) + (((~((-46516568) | i189)) | (~(6206338 | iIdentityHashCode10))) * 217)) + (((~(iIdentityHashCode10 | (-46516568))) | 42027093) * 217)) + (((~(6206338 | i189)) | 46516567) * 217)) - 897870946;
            int i191 = (i190 << 13) ^ i190;
            int i192 = i191 ^ (i191 >>> 17);
            ((int[]) objArr10[1])[0] = i192 ^ (i192 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                baseContext6 = (Context) Class.forName(str13).getMethod(str6, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                if (baseContext6 instanceof ContextWrapper) {
                    int i193 = asInterface + 89;
                    g = i193 % 128;
                    if (i193 % 2 == 0) {
                        int i194 = 97 / 0;
                        if (((ContextWrapper) baseContext6).getBaseContext() != null) {
                            str6 = str2;
                            str6 = str2;
                            str6 = str2;
                            baseContext6 = baseContext6.getApplicationContext();
                        } else {
                            str6 = str2;
                            str6 = str2;
                            baseContext6 = null;
                        }
                    } else if (((ContextWrapper) baseContext6).getBaseContext() != null) {
                        str6 = str2;
                        str6 = str2;
                        str6 = str2;
                        baseContext6 = baseContext6.getApplicationContext();
                    } else {
                        str6 = str2;
                        str6 = str2;
                        baseContext6 = null;
                    }
                } else {
                    str6 = str2;
                    str6 = str2;
                    str6 = str2;
                    baseContext6 = baseContext6.getApplicationContext();
                }
            }
            str6 = str2;
            Object[] objArr117 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue()), -897870946};
            byte[] bArr25 = $$d;
            byte b48 = bArr25[5];
            Object[] objArr118 = new Object[1];
            f(b48, b48, bArr25[10], objArr118);
            Class<?> cls7 = Class.forName((String) objArr118[0]);
            Object[] objArr119 = new Object[1];
            f((byte) (-bArr25[80]), bArr25[21], bArr25[301], objArr119);
            objArr10 = (Object[]) cls7.getMethod((String) objArr119[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr117);
            if (baseContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                    char c15 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                    int iMyTid3 = 876 - (Process.myTid() >> 22);
                    int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10;
                    byte[] bArr26 = $$a;
                    Object[] objArr120 = new Object[1];
                    e((byte) 52, bArr26[7], bArr26[91], objArr120);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c15, iMyTid3, maximumFlingVelocity3, 256017550, false, (String) objArr120[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, objArr10);
                try {
                    long jLongValue13 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue13);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                        char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                        int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L) + 876;
                        int i195 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte b49 = $$a[7];
                        byte b50 = b49;
                        Object[] objArr121 = new Object[1];
                        e(b50, (short) (b50 | 121), b49, objArr121);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(deadChar2, packedPositionGroup4, i195, 2009631821, false, (String) objArr121[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue13 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int iCombineMeasuredStates2 = 876 - View.combineMeasuredStates(0, 0);
                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
                        short s8 = $$a[8];
                        Object[] objArr122 = new Object[1];
                        e((byte) 52, s8, (byte) (s8 - 3), objArr122);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(tapTimeout, iCombineMeasuredStates2, pressedStateDuration2, 252381699, false, (String) objArr122[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
        }
        if (((int[]) objArr10[0])[0] != ((int[]) objArr10[2])[0]) {
            throw null;
        }
        int i196 = ((int[]) objArr10[1])[0];
        Object[] objArr123 = {new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
        int length = ((Context) Class.forName(str7).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bri_internet_instruction_4).substring(3, 4).length() + 833039963;
        int i197 = i196 + (-1691610562) + ((~((-1845805) | length)) * (-301)) + (((~(410791660 | length)) | (~((~length) | 451101889))) * (-301)) + (((~(length | (-451101890))) | 410791660) * 301);
        int i198 = (i197 << 13) ^ i197;
        int i199 = i198 ^ (i198 >>> 17);
        Object obj7 = objArr123[1];
        ((int[]) obj7)[0] = i199 ^ (i199 << 5);
        ((Field) readUTF.b[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{366239479, 660152476, 1614740481}, ((int[]) obj7)[0], Integer.MAX_VALUE) + 1518255825);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString(str3) + 1);
            int i200 = 651 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int keyRepeatDelay4 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44;
            byte b51 = $$a[7];
            byte b52 = b51;
            Object[] objArr124 = new Object[1];
            e(b52, (short) (b52 | 121), b51, objArr124);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cAxisFromString, i200, keyRepeatDelay4, -459846511, false, (String) objArr124[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).getLong(null);
        long jLongValue14 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
            int iIndexOf10 = TextUtils.indexOf((CharSequence) str3, '0', 0, 0) + 652;
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 44;
            short s9 = $$a[8];
            Object[] objArr125 = new Object[1];
            e((byte) 52, s9, (byte) (s9 - 3), objArr125);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cNormalizeMetaState2, iIndexOf10, scrollBarSize, -873460649, false, (String) objArr125[0], null);
        }
        if (j5 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                char c16 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iKeyCodeFromString = 651 - KeyEvent.keyCodeFromString(str3);
                int keyRepeatTimeout4 = 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte[] bArr27 = $$a;
                Object[] objArr126 = new Object[1];
                e((byte) (bArr27[27] - 1), (short) 210, bArr27[7], objArr126);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(c16, iKeyCodeFromString, keyRepeatTimeout4, -1595579076, false, (String) objArr126[0], null);
            }
            Object[] objArr127 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).get(null);
            objArr11 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i201 = ((int[]) objArr127[2])[0];
            int i202 = ((int[]) objArr127[0])[0];
            int iCodePointAt4 = ((Context) Class.forName(str7).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 30828863;
            int i203 = (-394543035) + ((~((~iCodePointAt4) | (-1059431))) * (-116)) + ((952534296 | iCodePointAt4) * 116) + (((~(iCodePointAt4 | 949103486)) | 4490240) * 116) + 377570266;
            int i204 = (i203 << 13) ^ i203;
            int i205 = i204 ^ (i204 >>> 17);
            ((int[]) objArr11[3])[0] = i205 ^ (i205 << 5);
            i6 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 1609 - MotionEvent.axisFromString(str3), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr128 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).newInstance(null), 377570266, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char keyRepeatTimeout5 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int doubleTapTimeout6 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 651;
                int packedPositionGroup5 = ExpandableListView.getPackedPositionGroup(0L) + 44;
                short s10 = $$a[8];
                Object[] objArr129 = new Object[1];
                e((byte) 52, s10, (byte) (s10 - 3), objArr129);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(keyRepeatTimeout5, doubleTapTimeout6, packedPositionGroup5, 2075921419, false, (String) objArr129[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.indexOf((CharSequence) str3, '0', 0, 0)), 696 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 97), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - TextUtils.indexOf(str3, str3, 0, 0)), Color.alpha(0) + 793, 83 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Integer.TYPE, Integer.TYPE});
            }
            objArr11 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).invoke(null, objArr128);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char packedPositionChild3 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                int iMyTid4 = 651 - (Process.myTid() >> 22);
                int iMyPid3 = 44 - (Process.myPid() >> 22);
                byte[] bArr28 = $$a;
                Object[] objArr130 = new Object[1];
                e((byte) (bArr28[27] - 1), (short) 210, bArr28[7], objArr130);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(packedPositionChild3, iMyTid4, iMyPid3, -1595579076, false, (String) objArr130[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr11);
            try {
                long jLongValue15 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue15);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char maximumFlingVelocity4 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int offsetBefore3 = 651 - TextUtils.getOffsetBefore(str3, 0);
                    int i206 = 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    short s11 = $$a[8];
                    Object[] objArr131 = new Object[1];
                    e((byte) 52, s11, (byte) (s11 - 3), objArr131);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(maximumFlingVelocity4, offsetBefore3, i206, -873460649, false, (String) objArr131[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char c17 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                    int fadingEdgeLength2 = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iAxisFromString = MotionEvent.axisFromString(str3) + 45;
                    byte b53 = $$a[7];
                    byte b54 = b53;
                    Object[] objArr132 = new Object[1];
                    e(b54, (short) (b54 | 121), b53, objArr132);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(c17, fadingEdgeLength2, iAxisFromString, -459846511, false, (String) objArr132[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf20);
                i6 = 0;
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i207 = ((int[]) objArr11[i6])[i6];
        int i208 = ((int[]) objArr11[2])[i6];
        if (i208 == i207) {
            objArr12 = new Object[4];
            int[] iArr15 = new int[1];
            objArr12[i6] = iArr15;
            int[] iArr16 = new int[1];
            objArr12[2] = iArr16;
            objArr12[3] = new int[1];
            int i209 = ((int[]) objArr11[3])[i6];
            int i210 = ((int[]) objArr11[2])[i6];
            int i211 = ((int[]) objArr11[i6])[i6];
            iArr16[i6] = i210;
            iArr15[i6] = i211;
            objArr12[1] = new String[i6];
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i212 = ~(474889108 | iIdentityHashCode11);
            int i213 = ~iIdentityHashCode11;
            int i214 = i209 + (-452377513) + ((i212 | (~((-4991633) | i213))) * (-406)) + ((~(483311550 | i213)) * (-406)) + (((~(iIdentityHashCode11 | (-478319919))) | (~((-474889109) | i213))) * 406);
            int i215 = (i214 << 13) ^ i214;
            int i216 = i215 ^ (i215 >>> 17);
            ((int[]) objArr12[3])[0] = i216 ^ (i216 << 5);
            i7 = 0;
            c3 = 3;
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr18 = (String[]) objArr11[1];
            if (strArr18 != null) {
                int i217 = asInterface + 83;
                g = i217 % 128;
                int i218 = i217 % 2;
                for (String str22 : strArr18) {
                    arrayList7.add(str22);
                }
            }
            int[] iArr17 = new int[i208];
            int i219 = i208 - 1;
            iArr17[i219] = 1;
            Toast.makeText((Context) null, iArr17[((i208 * i219) % 2) - 1], 1).show();
            Object[] objArr133 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i220 = ((int[]) objArr11[3])[0];
            int i221 = ((int[]) objArr11[2])[0];
            int i222 = ((int[]) objArr11[0])[0];
            int i223 = ~(((Context) Class.forName(str7).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_camera_screen_instructions_text_eye_closed).substring(0, 28).codePointAt(24) - 1815445610);
            int i224 = i220 + 875370620 + (((~(242965116 | i223)) | (-246395927)) * (-983)) + (((~(i223 | (-246395927))) | 237703188) * 983);
            int i225 = (i224 << 13) ^ i224;
            int i226 = i225 ^ (i225 >>> 17);
            c3 = 3;
            i7 = 0;
            ((int[]) objArr133[3])[0] = i226 ^ (i226 << 5);
            objArr12 = objArr133;
        }
        ((Field) readInt.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i7]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{507696526, 1602334870, 1626976519}, ((int[]) objArr12[c3])[i7], Integer.MAX_VALUE) + 702950080);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char cIndexOf3 = (char) TextUtils.indexOf(str3, str3, i7, i7);
            int iLastIndexOf5 = 1030 - TextUtils.lastIndexOf(str3, '0');
            int offsetAfter4 = 15 - TextUtils.getOffsetAfter(str3, i7);
            byte b55 = $$a[7];
            byte b56 = b55;
            Object[] objArr134 = new Object[1];
            e(b56, (short) (b56 | 69), b55, objArr134);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cIndexOf3, iLastIndexOf5, offsetAfter4, 1357589585, false, (String) objArr134[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null);
        long jLongValue16 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char cResolveSize2 = (char) View.resolveSize(0, 0);
            int i227 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i228 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte b57 = $$a[7];
            byte b58 = b57;
            Object[] objArr135 = new Object[1];
            e(b58, (short) (b58 | 173), b57, objArr135);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cResolveSize2, i227, i228, 1344079056, false, (String) objArr135[0], null);
        }
        if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char size4 = (char) View.MeasureSpec.getSize(0);
                int iBlue2 = 1031 - Color.blue(0);
                int iRed = 15 - Color.red(0);
                short s12 = $$a[8];
                Object[] objArr136 = new Object[1];
                e((byte) 52, s12, (byte) (s12 - 3), objArr136);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(size4, iBlue2, iRed, 632103528, false, (String) objArr136[0], null);
            }
            Object[] objArr137 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            objArr13 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i229 = ((int[]) objArr137[3])[0];
            int i230 = ((int[]) objArr137[1])[0];
            String[] strArr19 = (String[]) objArr137[0];
            int i231 = (int) Runtime.getRuntime().totalMemory();
            int i232 = 364476799 + (((~((-238992775) | i231)) | 237899780 | (~(5287395 | i231))) * (-754));
            int i233 = ~((-237899781) | i231);
            int i234 = ~i231;
            int i235 = ((i232 + ((i233 | (~(243187175 | i234))) * (-754))) + ((i234 | (-238992775)) * 754)) - 1086225853;
            int i236 = (i235 << 13) ^ i235;
            int i237 = i236 ^ (i236 >>> 17);
            ((int[]) objArr13[2])[0] = i237 ^ (i237 << 5);
        } else {
            int iIntValue5 = ((Integer) Class.forName(str11).getMethod(str12, Object.class).invoke(null, this)).intValue();
            Object[] objArr138 = {-1972758467};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b((char) (46038 - Color.argb(0, 0, 0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 1134, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr139 = {Integer.valueOf(iIntValue5), 0, -1086225853, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).newInstance(objArr138), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                char cRed = (char) Color.red(0);
                int maxKeyCode2 = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
                int edgeSlop3 = 15 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte b59 = $$a[7];
                byte b60 = b59;
                Object[] objArr140 = new Object[1];
                e(b60, (short) (b60 | 69), b59, objArr140);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cRed, maxKeyCode2, edgeSlop3, 1298546779, false, (String) objArr140[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - ((Process.getThreadPriority(0) + 20) >> 6)), 1117 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - Gravity.getAbsoluteGravity(0, 0)), Boolean.TYPE});
            }
            objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).invoke(null, objArr139);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) str3, '0', 0, 0) + 1);
                int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L) + 1032;
                int maximumFlingVelocity5 = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                short s13 = $$a[8];
                Object[] objArr141 = new Object[1];
                e((byte) 52, s13, (byte) (s13 - 3), objArr141);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cIndexOf4, packedPositionChild4, maximumFlingVelocity5, 632103528, false, (String) objArr141[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr13);
            try {
                long jLongValue17 = ((Long) Class.forName(str9).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue17);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                    char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int size5 = 1031 - View.MeasureSpec.getSize(0);
                    int trimmedLength2 = 15 - TextUtils.getTrimmedLength(str3);
                    byte b61 = $$a[7];
                    byte b62 = b61;
                    Object[] objArr142 = new Object[1];
                    e(b62, (short) (b62 | 173), b61, objArr142);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(touchSlop2, size5, trimmedLength2, 1344079056, false, (String) objArr142[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                    char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int iBlue3 = 1031 - Color.blue(0);
                    int keyRepeatTimeout6 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
                    byte b63 = $$a[7];
                    byte b64 = b63;
                    Object[] objArr143 = new Object[1];
                    e(b64, (short) (b64 | 69), b63, objArr143);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(tapTimeout2, iBlue3, keyRepeatTimeout6, 1357589585, false, (String) objArr143[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf22);
            } catch (Exception unused11) {
                throw new RuntimeException();
            }
        }
        int i238 = ((int[]) objArr13[1])[0];
        int i239 = ((int[]) objArr13[3])[0];
        if (i239 == i238) {
            objArr14 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i240 = ((int[]) objArr13[2])[0];
            int i241 = ((int[]) objArr13[3])[0];
            int i242 = ((int[]) objArr13[1])[0];
            String[] strArr20 = (String[]) objArr13[0];
            int iNextInt = new Random().nextInt();
            int i243 = (-1678836126) + (((~((~iNextInt) | 583003792)) | (-872415227)) * (-245));
            int i244 = ~(iNextInt | 583003792);
            int i245 = i240 + i243 + (i244 * (-245)) + ((i244 | 827283962) * 245);
            int i246 = (i245 << 13) ^ i245;
            int i247 = i246 ^ (i246 >>> 17);
            c5 = 0;
            ((int[]) objArr14[2])[0] = i247 ^ (i247 << 5);
            c4 = 2;
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr21 = (String[]) objArr13[0];
            if (strArr21 != null) {
                for (String str23 : strArr21) {
                    arrayList8.add(str23);
                }
            }
            int[] iArr18 = new int[i239];
            int i248 = i239 - 1;
            iArr18[i248] = 1;
            Toast.makeText((Context) null, iArr18[((i239 * i248) % 2) - 1], 1).show();
            Object[] objArr144 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i249 = ((int[]) objArr13[2])[0];
            int i250 = ((int[]) objArr13[3])[0];
            int i251 = ((int[]) objArr13[1])[0];
            String[] strArr22 = (String[]) objArr13[0];
            int iIdentityHashCode12 = System.identityHashCode(this);
            int i252 = i249 + 1866967784 + (((~((-679358367) | iIdentityHashCode12)) | 537930634) * 345) + (((~((-679358367) | (~iIdentityHashCode12))) | (-973008831)) * 345) + ((~(iIdentityHashCode12 | (-537930635))) * 345);
            int i253 = (i252 << 13) ^ i252;
            int i254 = i253 ^ (i253 >>> 17);
            c4 = 2;
            c5 = 0;
            ((int[]) objArr144[2])[0] = i254 ^ (i254 << 5);
            objArr14 = objArr144;
        }
        ((Field) readByte.b[c5]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{395085583, 1733600400, 395565648}, ((int[]) objArr14[c4])[c5], Integer.MAX_VALUE) - Integer.MAX_VALUE);
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        int i = 2 % 2;
        int i2 = g + 101;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(outState, "");
            super.onSaveInstanceState(outState);
            outState.putInt("extra-number-of-photos-shown-in-gallery", this.zzg);
            outState.putInt("extra-previous-photo-index", this.zzh);
            throw null;
        }
        Intrinsics.checkNotNullParameter(outState, "");
        super.onSaveInstanceState(outState);
        outState.putInt("extra-number-of-photos-shown-in-gallery", this.zzg);
        outState.putInt("extra-previous-photo-index", this.zzh);
        int i3 = asInterface + 1;
        g = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) peek.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        int i6 = ~i5;
        int i7 = ~(316608902 | i6);
        if (i4 != (-666195051) + (((-534738879) | i7) * (-712)) + (((~(i5 | (-218129977))) | (~(i6 | 534738878))) * (-712)) + ((492402360 | i7) * 712)) {
            throw null;
        }
        int i8 = ((Field) readLine.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        if (i8 != 1967847911 + (((~((-655033596) | i9)) | 67830848) * 336) + (((~(i9 | 207607364)) | (-794810112)) * (-168)) + (((~((~i9) | 207607364)) | (-655033596)) * 168)) {
            int i10 = 1765665892 % 2;
            throw new ArithmeticException();
        }
        int i11 = ((Field) readFully.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 794896526;
        int i12 = ~length;
        if (i11 != (-925330026) + ((846986495 | i12) * (-369)) + (((~((-846880997) | i12)) | 845388991) * (-369)) + (((~(length | 846880996)) | 105499 | (~(i12 | (-1597505)))) * 369)) {
            throw new RuntimeException("570464690");
        }
        int i13 = ((Field) skipBytes.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i14 = ~iMaxMemory;
        if (i13 != 2120205044 + (((~(264723493 | i14)) | 310814908) * (-90)) + (((~(264723493 | iMaxMemory)) | 222385153) * (-45)) + (((~(iMaxMemory | (-310814909))) | 264723493 | (~(i14 | 310814908))) * 45)) {
            int i15 = 2046851098 % 2;
            throw new ArithmeticException();
        }
        int i16 = ((Field) writeUnsignedShort.b[0]).getInt(null);
        int iMyTid = Process.myTid();
        int i17 = ~iMyTid;
        if (i16 != 1139286081 + ((~(90843415 | i17)) * (-560)) + ((~(iMyTid | 1433075575)) * (-560)) + (((~((-1430976358) | i17)) | 88744197) * 560)) {
            throw new RuntimeException("-153012077");
        }
        int i18 = ((Field) writeUnsignedInt.b[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i19 = ~iUptimeMillis;
        if (i18 != (-1648957102) + ((~((-727054746) | i19)) * 979) + ((iUptimeMillis | 688827393) * (-979)) + (((~(iUptimeMillis | (-727054746))) | (~(i19 | 688827393))) * 979)) {
            int i20 = 1823920630 % 2;
            throw new ArithmeticException();
        }
        int i21 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iMyPid = Process.myPid();
        if (i21 != (((~(903771263 | iMyPid)) | (-834383320)) * 398) + 1039412168 + (((~((~iMyPid) | 903771263)) | (-834383320)) * 398)) {
            throw null;
        }
        int i22 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i23 = ~((-819551759) | (~iNextInt));
        if (i22 != ((((1208394048 | i23) | (~(819551758 | iNextInt))) * (-338)) - 1300616228) + (((~(iNextInt | 2027945806)) | i23) * 338)) {
            throw new RuntimeException("-725262421");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 46400), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40, View.MeasureSpec.getMode(0) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46400 - Color.green(0)), 40 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0') + 20, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onResume();
            int i24 = g + 109;
            asInterface = i24 % 128;
            int i25 = i24 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 46400), (ViewConfiguration.getJumpTapTimeout() >> 16) + 40, 18 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46399 - ExpandableListView.getPackedPositionChild(0L)), 40 - (ViewConfiguration.getFadingEdgeLength() >> 16), 19 - (KeyEvent.getMaxKeyCode() >> 16), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onPause();
            int i4 = asInterface + 73;
            g = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asInterface + 55;
        g = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                int i3 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1754;
                int trimmedLength = 23 - TextUtils.getTrimmedLength("");
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                e((byte) (bArr[27] - 1), (short) 210, bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, i3, trimmedLength, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            obj.hashCode();
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
            int size = 1755 - View.MeasureSpec.getSize(0);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
            byte[] bArr2 = $$a;
            Object[] objArr3 = new Object[1];
            e((byte) (bArr2[27] - 1), (short) 210, bArr2[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, size, iMakeMeasureSpec, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
                int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 24;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr4 = new Object[1];
                e(b3, (short) (b3 | 173), b2, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, packedPositionType, iLastIndexOf, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1632920177;
            int i5 = ~i4;
            int i6 = 1459089146 + (((~((-104539086) | i5)) | (-108063341)) * (-865)) + ((~(i4 | 104539085)) * 865) + (((~((-108063341) | i5)) | (~(i5 | 104539085))) * 865) + 20237724;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            c(2022943117 - Color.green(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.validation_billingcity_empty).substring(15, 16).length() + 7, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bri_instruction_step2).substring(8, 9).codePointAt(0) - 110), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 79), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.permata_bank_transfer).substring(0, 7).codePointAt(3) + 784802460, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2022943080, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 90, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_review_screen_backend_error_message_1054).substring(0, 34).length() - 34), (byte) (61 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bank_bni_transfer).substring(0, 8).length() + 784802576, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {-607477721};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - TextUtils.indexOf("", "")), (ViewConfiguration.getTouchSlop() >> 8) + 1726, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), 20237724);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                    int windowTouchSlop = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i9 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr9 = new Object[1];
                    e(b5, (short) (b5 | 173), b4, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, windowTouchSlop, i9, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_review_screen_backend_error_message_1060).substring(0, 31).codePointAt(12) + 2022943011, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 22, (short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) ((-2) - Color.alpha(0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 784802493, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 2022943014, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 92, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.indosat_instruction_step1).substring(3, 4).codePointAt(0) - 117), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.mandiri_internet_instruction_step1).substring(33, 69).length() - 61), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.fetching_offers).substring(1, 2).length() + 784802619, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
                        int keyRepeatTimeout = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr12 = new Object[1];
                        e(b7, (short) (b7 | 121), b6, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, iLastIndexOf2, keyRepeatTimeout, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29943);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1755;
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 23;
                        byte[] bArr3 = $$a;
                        Object[] objArr13 = new Object[1];
                        e((byte) (bArr3[27] - 1), (short) 210, bArr3[7], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, doubleTapTimeout, offsetAfter, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iNextInt = new Random().nextInt();
            int i13 = ~iNextInt;
            int i14 = i12 + 1246077345 + ((iNextInt | (-391768247)) * 140) + (((~((-391768247) | i13)) | 67231920) * (-280)) + (((~(iNextInt | (-67231921))) | (~(604370672 | i13)) | (-928906999)) * 140);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr14[3])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr != null) {
                int i17 = asInterface + 67;
                g = i17 % 128;
                for (int i18 = i17 % 2 == 0 ? 1 : 0; i18 < strArr.length; i18++) {
                    arrayList.add(strArr[i18]);
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i19 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iMyPid = Process.myPid();
            int i20 = i19 + 1217171233 + (((~(iMyPid | (-352047192))) | 564649617) * 191) + (((~((~iMyPid) | (-352047192))) | 10735633) * 191);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr15[3])[0] = i22 ^ (i22 << 5);
            int i23 = g + 37;
            asInterface = i23 % 128;
            int i24 = i23 % 2;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int i25 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1030;
            int i26 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            byte b8 = $$a[7];
            byte b9 = b8;
            Object[] objArr16 = new Object[1];
            e(b9, (short) (b9 | 69), b8, objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(offsetBefore, i25, i26, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr17 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2022943072, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bbm_money).substring(0, 9).length() + 5, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 13), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.payment_method_bank_transfer).substring(0, 4).length() + 784802595, objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        c(2022943113 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 7 - View.getDefaultSize(0, 0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_general_network_error_timeout).substring(0, 37).length() - 37), (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 25), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.error_message_status_code_500).substring(13, 15).length() + 784802618, objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iMakeMeasureSpec2 = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
            byte b10 = $$a[7];
            byte b11 = b10;
            Object[] objArr19 = new Object[1];
            e(b11, (short) (b11 | 173), b10, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maximumDrawingCacheSize, iMakeMeasureSpec2, iIndexOf, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i27 = asInterface + 1;
            g = i27 % 128;
            int i28 = i27 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                int mode = 1031 - View.MeasureSpec.getMode(0);
                int i29 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                short s = $$a[8];
                Object[] objArr20 = new Object[1];
                e((byte) 52, s, (byte) (s - 3), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf, mode, i29, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr21[3])[0];
            int i31 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int i32 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 611718340;
            int i33 = (-1111539135) + (((~(245755220 | i32)) | 1179818 | (~((-1475051) | i32))) * (-744)) + (((~i32) | 245459988) * 744) + ((i32 | (-1179819)) * 744) + 1579861362;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr[2])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            c((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2022943116, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 104, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.payment_method_unavailable).substring(4, 5).length() - 1), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.uikit_uob_web_instruction_6).substring(13, 14).codePointAt(0) - 152), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 784802533, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 2022943001, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_camera_screen_instructions_text_face_too_close).substring(18, 19).codePointAt(0) - 24, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.vida_error_image_signing_failed).substring(0, 24).codePointAt(1) - 50), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 784802548, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-607477721};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1134, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, 1579861362, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i36 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
                int iIndexOf2 = TextUtils.indexOf("", "") + 15;
                byte b12 = $$a[7];
                byte b13 = b12;
                Object[] objArr26 = new Object[1];
                e(b13, (short) (b13 | 69), b12, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollDefaultDelay2, i36, iIndexOf2, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1116 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getWindowTouchSlop() >> 8) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i37 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int scrollBarSize = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
                short s2 = $$a[8];
                Object[] objArr27 = new Object[1];
                e((byte) 52, s2, (byte) (s2 - 3), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, i37, scrollBarSize, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr28 = new Object[1];
                c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2022943072, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 3, (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 38), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 784802563, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2022943076, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.bca_instruction_step5).substring(28, 30).length() - 2), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 61), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.preview_alto).substring(1, 3).codePointAt(0) + 784802523, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int offsetAfter2 = 1031 - TextUtils.getOffsetAfter("", 0);
                    int i38 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14;
                    byte b14 = $$a[7];
                    byte b15 = b14;
                    Object[] objArr30 = new Object[1];
                    e(b15, (short) (b15 | 173), b14, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, offsetAfter2, i38, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0') + 1032;
                    int i39 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
                    byte b16 = $$a[7];
                    byte b17 = b16;
                    Object[] objArr31 = new Object[1];
                    e(b17, (short) (b17 | 69), b16, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(tapTimeout2, iLastIndexOf3, i39, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
                int i40 = g + 41;
                asInterface = i40 % 128;
                int i41 = i40 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i42 = ((int[]) objArr[1])[0];
        int i43 = ((int[]) objArr[3])[0];
        if (i43 != i42) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i44 = asInterface + 31;
                g = i44 % 128;
                int i45 = i44 % 2;
                for (String str : strArr3) {
                    arrayList2.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i43));
        }
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i46 = ((int[]) objArr[2])[0];
        int i47 = ((int[]) objArr[3])[0];
        int i48 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i49 = i46 + 918811329 + (((~(37903023 | startUptimeMillis)) | (-282183194)) * (-964)) + (((~((~startUptimeMillis) | 37903023)) | (-315875008)) * (-964));
        int i50 = (i49 << 13) ^ i49;
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr32[2])[0] = i51 ^ (i51 << 5);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = ((Field) readBoolean.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i3 = ~System.identityHashCode(this);
        if (i2 != 296110553 + (((~(i3 | (-285913609))) | 110120150) * (-828)) + ((i3 | (-285913609)) * (-828)) + 513266144) {
            throw null;
        }
        int i4 = ((Field) readFloat.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        int i6 = ~((-340387191) | i5);
        int i7 = ~((-522253770) | iIdentityHashCode);
        if (i4 != (-1234671426) + ((i6 | i7) * 1150) + (((~(522253769 | i5)) | i7) * (-575)) + (((~(iIdentityHashCode | (-340387191))) | (~(i5 | 340387190))) * 575)) {
            throw null;
        }
        int i8 = ((Field) readUnsignedByte.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        if (i8 != (-980727489) + (((~(iIdentityHashCode2 | 1675560321)) | (-16709667)) * (-465)) + ((1675560321 | (~((-16709667) | iIdentityHashCode2))) * 930) + ((iIdentityHashCode2 | (-2160675)) * 465)) {
            throw null;
        }
        int i9 = ((Field) seek.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i11 = ~(861745693 | i10);
        if (i9 != 1700924095 + (((-870184864) | i11) * (-814)) + ((i11 | (~((~i10) | 815654278)) | 807215108) * 407) + (((~(i10 | (-815654279))) | (~((-861745694) | i10)) | 807215108) * 407)) {
            throw new RuntimeException("415246187");
        }
        int i12 = ((Field) ByteOrderedDataOutputStream.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i13 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1650526179;
        if (i12 != (-1410669262) + ((~((-1610683153) | i13)) * (-301)) + (((~(1619071764 | i13)) | (~((~i13) | 278938822))) * (-301)) + (((~(i13 | (-278938823))) | 1619071764) * 301)) {
            throw new RuntimeException("1951941286");
        }
        int i14 = ((Field) writeShort.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.save_card_message).substring(0, 1).codePointAt(0) + 1040629995;
        int i15 = ~((-740594855) | iCodePointAt);
        int i16 = ~iCodePointAt;
        if (i14 != 324383274 + ((i15 | (~(675287284 | i16))) * (-1808)) + (((~((-671092901) | iCodePointAt)) | (~(i16 | 744789238))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iCodePointAt | (-675287285))) | 69501954 | (~(740594854 | i16))) * TypedValues.Custom.TYPE_BOOLEAN)) {
            int i17 = g + 65;
            asInterface = i17 % 128;
            if (i17 % 2 != 0) {
                int[] iArr = new int[1913083168];
                iArr[1913083167] = 0;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[1913083168];
                iArr2[1913083167] = 1;
                int i18 = (-771297568) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i19 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        if (i19 != (-410628888) + (((~(1079176973 | elapsedCpuTime)) | 243798066) * 104) + ((~((~elapsedCpuTime) | (-1073785610))) * (-104)) + ((elapsedCpuTime | 249189430) * 104)) {
            throw new RuntimeException("-1076634759");
        }
        int i20 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i21 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i22 = ~((-101823599) | i21);
        int i23 = 734310236 + ((68166656 | i22) * (-280)) + ((i22 | (~(1817734929 | i21))) * 140);
        int i24 = ~((-33656943) | i21);
        int i25 = ~i21;
        if (i20 != i23 + (((~(i25 | 1851391871)) | i24 | (~((-68166657) | i25))) * 140)) {
            int i26 = (-1214782866) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i27 = asInterface + 63;
        g = i27 % 128;
        int i28 = i27 % 2;
    }

    static /* synthetic */ boolean zzc(PlacesLightboxActivity placesLightboxActivity, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = g + 45;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            zzk(placesLightboxActivity, menuItem);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zZzk = zzk(placesLightboxActivity, menuItem);
        int i3 = g + 93;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return zZzk;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        b = 1570078737;
        TuitionPaymentFragmentbindingInflater1 = -1934795538;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 197200443;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new byte[]{59, -62, 50, -55, 21, 22, -12, -54, 62, -58, 13, -2, -40, 38, -60, -37, 47, -10, 1, 47, -56, -61, 21, -33, -47, 47, -36, -45, -37, 33, 16, -20, 27, 49, -50, 16, -23, 25, -30, 62, Base64.padSymbol, -93, 28, 89, -46, -29, -30, -27, 22, -18, 21, -7, 5, -12, 9, 10, -3, 18, -17, -2, -13, 2, 14, -12, 6, 20, -21, -28, 29, 3, -52, 18, 28, -28, 26, -30, 6, 53, 4, -87, 23, 24, 36, -35, -20, -19, -22, 25, -31, 26, 62, -57, 52, -46, 63, 59, 60, Base64.padSymbol, -63, -18, 12, -57, -56, 50, -63, 60, -45, 35, -33, 23, 19, Base64.padSymbol, -17, -20, -60, 35, -23, 23, -64, 58, 27, -36, 63, 17, -35, -20, Base64.padSymbol, 23, -20, -36, 22, 58, 20, 19, -21, 20, -62, 59, 19, 22, -61, 34, 17, -36, 56, -63, 16, 56, 19, 17, -61, 60, 22, -23, 17, -57, -17, 19, 35, -36, 19, 62, 16, -61, 23, 18, 19, -24, 18, 32, -87, -97, 86, -76, -101, 85, -102, -88, 102, 102, 75, -80, -103, 79, -77, -97, -103, 102, 100, -104, 73, -104, -86, -103, 72, 101, -88, -102, 101, 74, -80, -104, 102, -103, -97, 99, 78, -73, 75, -75, 73, -74, -101, -101, 100, -102, -104, 103, 87, -83, 84, -102, -85, 83, -104, -73, 76, -76, -100, 99, 75, -102, 103, -26, -26, -26, -26, -26, -26, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, byte r6, byte r7) {
        /*
            byte[] r0 = com.google.android.libraries.places.widget.internal.photoviewer.PlacesLightboxActivity.$$c
            int r5 = r5 + 117
            int r6 = r6 * 2
            int r1 = 1 - r6
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r4 = -r4
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.photoviewer.PlacesLightboxActivity.$$g(short, byte, byte):java.lang.String");
    }
}
