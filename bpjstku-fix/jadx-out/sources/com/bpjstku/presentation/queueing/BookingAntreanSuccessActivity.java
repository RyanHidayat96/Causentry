package com.bpjstku.presentation.queueing;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Insets;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityBookingAntreanSuccessBinding;
import com.bpjstku.databinding.DialogBarcodeZoomBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.queueing.BookingAntreanSuccessActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.internal.zzpu;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutStrategy;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.getBurstSupportedCombinationList;
import defpackage.getEventTime;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onCaptureSessionEnd;
import defpackage.setQuickZoomEnabled;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0006\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J/\u0010\u0017\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00122\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u001c\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010\n\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0016\u0010\u0007\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010\t\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010$\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0016\u0010'\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0016\u0010!\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001fR\u0016\u0010)\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0016\u0010#\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u0016\u0010\"\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001fR \u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00020*8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010,R\u001a\u0010\u001a\u001a\u00020\u00128\u0015X\u0095D¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b\u0011\u0010/"}, d2 = {"Lcom/bpjstku/presentation/queueing/BookingAntreanSuccessActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityBookingAntreanSuccessBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "", "p0", "Landroid/graphics/Bitmap;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "", "p1", "", "p2", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "LgetStreamUseCaseSupportedCombinationList;", "INotificationSideChannelStub", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Landroid/graphics/Bitmap;", "g", "Ljava/lang/String;", "INotificationSideChannelDefault", "cancelAll", "RemoteActionCompatParcelizer", "getInterfaceDescriptor", "d", "read", "cancel", "INotificationSideChannel", "notify", "onTransact", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "INotificationSideChannelStubProxy", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BookingAntreanSuccessActivity extends BindingBaseActivity<ActivityBookingAntreanSuccessBinding> {
    private static char IconCompatParcelizer;
    private static char MediaBrowserCompat;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char connect;
    private static int disconnect;
    private static char write;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {21, -108, 100, 114};
    private static final int $$f = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {68, 83, 49, -116, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 150;
    private static int getItem = 0;
    private static int getRoot = 0;
    private static int getNotifyChildrenChangedOptions = 1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1 = "";

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private String b = "";
    private String a = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String asBinder = "";

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String g = "";

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String asInterface = "";

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private String d = "";

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String cancel = "";
    private String INotificationSideChannel = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String notify = "";

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private String cancelAll = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String onTransact = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String getInterfaceDescriptor = "";

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private String INotificationSideChannelDefault = "";

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer = "";

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final int INotificationSideChannelStub = R.layout.activity_booking_antrean_success;

    /* JADX WARN: Code duplicated, block: B:18:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:19:0x0103  */
    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i);
        int i9 = (~(i7 | i4)) | i8;
        int i10 = ~i;
        int i11 = ~i4;
        int i12 = i9 | (~(i10 | i11 | i2));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i2;
        int i15 = (~(i4 | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = i2 + i + i5 + ((-327997910) * i6) + ((-604038433) * i3);
        int i18 = i17 * i17;
        int i19 = ((i2 * 234895570) - 128974848) + (234895570 * i) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i5) + (36700160 * i6) + ((-297271296) * i3) + (1302134784 * i18);
        int i20 = (i2 * (-238133666)) + 182491156 + (i * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i5 * (-238134313)) + (i6 * (-1022231738)) + (i3 * 4118089) + (i18 * (-35979264));
        int i21 = i19 + (i20 * i20 * 1404239872);
        if (i21 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i21 == 2) {
            BookingAntreanSuccessActivity bookingAntreanSuccessActivity = (BookingAntreanSuccessActivity) objArr[0];
            View view = (View) objArr[1];
            int i22 = 2 % 2;
            int i23 = getRoot + 91;
            getNotifyChildrenChangedOptions = i23 % 128;
            int i24 = i23 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) bookingAntreanSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            getstreamusecasesupportedcombinationlist.asBinder.saveString("ANTRIAN_ONLINE_URL", "");
            getstreamusecasesupportedcombinationlist.asBinder.saveString("STATUS_ANTRIAN_ONLINE_URL", "");
            getstreamusecasesupportedcombinationlist.asBinder.saveString("ANTRIAN_ONLINE_MESSAGE", "");
            ((getStreamUseCaseSupportedCombinationList) bookingAntreanSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).asBinder.saveString("ANTRIAN_ONLINE_URL_INFOPENGADUAN", "");
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bookingAntreanSuccessActivity, null, false, 6);
            bookingAntreanSuccessActivity.finishAffinity();
            Unit unit = Unit.INSTANCE;
            int i25 = getNotifyChildrenChangedOptions + 53;
            getRoot = i25 % 128;
            int i26 = i25 % 2;
            return unit;
        }
        if (i21 != 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        final BookingAntreanSuccessActivity bookingAntreanSuccessActivity2 = (BookingAntreanSuccessActivity) objArr[0];
        Bitmap bitmap = (Bitmap) objArr[1];
        int i27 = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[2], "");
        final Dialog dialog = new Dialog(bookingAntreanSuccessActivity2, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
        final DialogBarcodeZoomBinding dialogBarcodeZoomBindingInflate = DialogBarcodeZoomBinding.inflate(bookingAntreanSuccessActivity2.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(dialogBarcodeZoomBindingInflate, "");
        dialog.setContentView(dialogBarcodeZoomBindingInflate.getRoot());
        Window window = dialog.getWindow();
        if (window != null) {
            int i28 = getRoot + 53;
            getNotifyChildrenChangedOptions = i28 % 128;
            if (i28 % 2 == 0) {
                window.getDecorView().setSystemUiVisibility(27609);
                if (Build.VERSION.SDK_INT >= 96) {
                    window.setDecorFitsSystemWindows(false);
                    dialogBarcodeZoomBindingInflate.getRoot().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: get10BitSupportedCombinationList
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                            return BookingAntreanSuccessActivity.b(dialogBarcodeZoomBindingInflate, bookingAntreanSuccessActivity2, view2, windowInsets);
                        }
                    });
                    int i29 = getNotifyChildrenChangedOptions + 125;
                    getRoot = i29 % 128;
                    int i30 = i29 % 2;
                } else {
                    dialogBarcodeZoomBindingInflate.getRoot().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: GuaranteedConfigurationsUtil
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                            return BookingAntreanSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(dialogBarcodeZoomBindingInflate, bookingAntreanSuccessActivity2, view2, windowInsets);
                        }
                    });
                }
            } else {
                window.getDecorView().setSystemUiVisibility(1792);
                if (Build.VERSION.SDK_INT >= 30) {
                    window.setDecorFitsSystemWindows(false);
                    dialogBarcodeZoomBindingInflate.getRoot().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: get10BitSupportedCombinationList
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                            return BookingAntreanSuccessActivity.b(dialogBarcodeZoomBindingInflate, bookingAntreanSuccessActivity2, view2, windowInsets);
                        }
                    });
                    int i210 = getNotifyChildrenChangedOptions + 125;
                    getRoot = i210 % 128;
                    int i31 = i210 % 2;
                } else {
                    dialogBarcodeZoomBindingInflate.getRoot().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: GuaranteedConfigurationsUtil
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                            return BookingAntreanSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(dialogBarcodeZoomBindingInflate, bookingAntreanSuccessActivity2, view2, windowInsets);
                        }
                    });
                }
            }
        }
        dialogBarcodeZoomBindingInflate.photoView.setImageBitmap(bitmap);
        ImageView imageView = dialogBarcodeZoomBindingInflate.ivClose;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getSensorHorizontalLength
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BookingAntreanSuccessActivity.TuitionPaymentFragmentbindingInflater1(dialog, (View) obj);
            }
        }));
        MaterialButton materialButton = dialogBarcodeZoomBindingInflate.btnDownload;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new getBurstSupportedCombinationList(bookingAntreanSuccessActivity2, bitmap)));
        dialog.show();
        return Unit.INSTANCE;
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
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 196 - r7
            int r6 = r6 + 1
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r0 = com.bpjstku.presentation.queueing.BookingAntreanSuccessActivity.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r7]
        L26:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.BookingAntreanSuccessActivity.c(int, int, byte, java.lang.Object[]):void");
    }

    public BookingAntreanSuccessActivity() {
        final BookingAntreanSuccessActivity bookingAntreanSuccessActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.queueing.BookingAntreanSuccessActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = bookingAntreanSuccessActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.queueing.BookingAntreanSuccessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0095\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/bpjstku/presentation/queueing/BookingAntreanSuccessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            Intrinsics.checkNotNullParameter(p4, "");
            Intrinsics.checkNotNullParameter(p5, "");
            Intrinsics.checkNotNullParameter(p6, "");
            Intrinsics.checkNotNullParameter(p7, "");
            Intrinsics.checkNotNullParameter(p8, "");
            Intrinsics.checkNotNullParameter(p9, "");
            Intrinsics.checkNotNullParameter(p10, "");
            Intrinsics.checkNotNullParameter(p11, "");
            Intrinsics.checkNotNullParameter(p12, "");
            Intrinsics.checkNotNullParameter(p13, "");
            Intrinsics.checkNotNullParameter(p14, "");
            Intrinsics.checkNotNullParameter(p15, "");
            Intrinsics.checkNotNullParameter(p16, "");
            Intent intent = new Intent(p0, (Class<?>) BookingAntreanSuccessActivity.class);
            intent.putExtra("extra_nik", p1);
            intent.putExtra("extra_nama_lengkap", p2);
            intent.putExtra("extra_handphone", p3);
            intent.putExtra("extra_email", p4);
            intent.putExtra("extra_kode_booking", p5);
            intent.putExtra("extra_kategori", p6);
            intent.putExtra("extra_topik", p7);
            intent.putExtra("extra_kantor_cabang", p8);
            intent.putExtra("extra_alamat_kantor", p9);
            intent.putExtra("extra_tanggal_display", p10);
            intent.putExtra("extra_tgl_booking", p11);
            intent.putExtra("extra_waktu", p12);
            intent.putExtra("extra_waktu_expired", p13);
            intent.putExtra("extra_nama_wilayah", p14);
            intent.putExtra("extra_qr_code", p15);
            intent.putExtra("extra_status_antrean", p16);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $10 + 19;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
            int i5 = $11 + 103;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i7 = 58224;
            for (int i8 = 0; i8 < 16; i8++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i7) ^ ((c2 << 4) + ((char) (((long) IconCompatParcelizer) ^ 8611973335120459638L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(write)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 47773), (ViewConfiguration.getWindowTouchSlop() >> 8) + 468, 13 - ExpandableListView.getPackedPositionType(0L), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) MediaBrowserCompat) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(connect)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 47772), (Process.myPid() >> 22) + 468, 13 - Color.green(0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
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
                byte b = (byte) (-1);
                byte b2 = (byte) (b + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2322 - TextUtils.lastIndexOf("", '0', 0), 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1312321721, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityBookingAntreanSuccessBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 107;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        BookingAntreanSuccessActivity$bindingInflater$1 bookingAntreanSuccessActivity$bindingInflater$1 = BookingAntreanSuccessActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = getRoot + 15;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
        return bookingAntreanSuccessActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getRoot + 41;
        int i3 = i2 % 128;
        getNotifyChildrenChangedOptions = i3;
        int i4 = i2 % 2;
        int i5 = this.INotificationSideChannelStub;
        int i6 = i3 + 111;
        getRoot = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("extra_kode_booking");
            Object obj = null;
            if (stringExtra == null) {
                int i2 = getNotifyChildrenChangedOptions + 25;
                getRoot = i2 % 128;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                stringExtra = "";
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stringExtra;
            String stringExtra2 = intent.getStringExtra("extra_kategori");
            if (stringExtra2 == null) {
                int i3 = getRoot + 95;
                getNotifyChildrenChangedOptions = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                stringExtra2 = "";
            }
            this.TuitionPaymentFragmentbindingInflater1 = stringExtra2;
            String stringExtra3 = intent.getStringExtra("extra_topik");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            this.b = stringExtra3;
            String stringExtra4 = intent.getStringExtra("extra_kantor_cabang");
            if (stringExtra4 == null) {
                int i4 = getRoot + 57;
                int i5 = i4 % 128;
                getNotifyChildrenChangedOptions = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 93;
                getRoot = i7 % 128;
                int i8 = i7 % 2;
                stringExtra4 = "";
            }
            this.a = stringExtra4;
            String stringExtra5 = intent.getStringExtra("extra_alamat_kantor");
            if (stringExtra5 == null) {
                stringExtra5 = "";
            }
            this.asBinder = stringExtra5;
            String stringExtra6 = intent.getStringExtra("extra_tanggal_display");
            if (stringExtra6 == null) {
                stringExtra6 = "";
            }
            this.g = stringExtra6;
            String stringExtra7 = intent.getStringExtra("extra_tgl_booking");
            if (stringExtra7 == null) {
                stringExtra7 = "";
            }
            this.asInterface = stringExtra7;
            String stringExtra8 = intent.getStringExtra("extra_waktu");
            if (stringExtra8 == null) {
                stringExtra8 = "";
            }
            this.d = stringExtra8;
            String stringExtra9 = intent.getStringExtra("extra_waktu_expired");
            if (stringExtra9 == null) {
                stringExtra9 = "";
            }
            this.cancel = stringExtra9;
            String stringExtra10 = intent.getStringExtra("extra_nama_wilayah");
            if (stringExtra10 == null) {
                stringExtra10 = "";
            }
            this.INotificationSideChannel = stringExtra10;
            String stringExtra11 = intent.getStringExtra("extra_nama_lengkap");
            if (stringExtra11 == null) {
                int i9 = getRoot + 125;
                getNotifyChildrenChangedOptions = i9 % 128;
                int i10 = i9 % 2;
                stringExtra11 = "";
            }
            this.notify = stringExtra11;
            String stringExtra12 = intent.getStringExtra("extra_nik");
            if (stringExtra12 == null) {
                stringExtra12 = "";
            }
            this.cancelAll = stringExtra12;
            String stringExtra13 = intent.getStringExtra("extra_handphone");
            if (stringExtra13 == null) {
                int i11 = getRoot + 1;
                getNotifyChildrenChangedOptions = i11 % 128;
                if (i11 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                stringExtra13 = "";
            }
            this.onTransact = stringExtra13;
            String stringExtra14 = intent.getStringExtra("extra_email");
            if (stringExtra14 == null) {
                stringExtra14 = "";
            }
            this.getInterfaceDescriptor = stringExtra14;
            String stringExtra15 = intent.getStringExtra("extra_qr_code");
            if (stringExtra15 == null) {
                int i12 = getNotifyChildrenChangedOptions + 15;
                getRoot = i12 % 128;
                int i13 = i12 % 2;
                stringExtra15 = "";
            }
            this.INotificationSideChannelDefault = stringExtra15;
            String stringExtra16 = intent.getStringExtra("extra_status_antrean");
            this.RemoteActionCompatParcelizer = stringExtra16 != null ? stringExtra16 : "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044 A[PHI: r1
  0x0044: PHI (r1v42 com.bpjstku.domain.user.model.User) = (r1v7 com.bpjstku.domain.user.model.User), (r1v46 com.bpjstku.domain.user.model.User) binds: [B:8:0x003f, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:9:0x0041 A[PHI: r1
  0x0041: PHI (r1v8 com.bpjstku.domain.user.model.User) = (r1v7 com.bpjstku.domain.user.model.User), (r1v46 com.bpjstku.domain.user.model.User) binds: [B:8:0x003f, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        User userTuitionPaymentFragmentbindingInflater1;
        String str;
        final Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str2;
        String strA;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        int i2 = 2 % 2;
        int i3 = getNotifyChildrenChangedOptions + 47;
        getRoot = i3 % 128;
        if (i3 % 2 != 0) {
            userTuitionPaymentFragmentbindingInflater1 = ((getStreamUseCaseSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1();
            int i4 = 78 / 0;
            if (this.INotificationSideChannelDefault.length() > 0) {
                str = this.INotificationSideChannelDefault;
            } else {
                str = "";
            }
        } else {
            userTuitionPaymentFragmentbindingInflater1 = ((getStreamUseCaseSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1();
            if (this.INotificationSideChannelDefault.length() > 0) {
                str = this.INotificationSideChannelDefault;
            } else {
                str = "";
            }
        }
        String str7 = null;
        if (str.length() > 0) {
            int i5 = getNotifyChildrenChangedOptions + 61;
            getRoot = i5 % 128;
            if (i5 % 2 != 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
                str7.hashCode();
                throw null;
            }
            bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        } else {
            bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        }
        ActivityBookingAntreanSuccessBinding activityBookingAntreanSuccessBinding = (ActivityBookingAntreanSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        ImageView imageView = activityBookingAntreanSuccessBinding.ivBack;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: generateSupportedCombinationList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj};
                return (Unit) BookingAntreanSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(1566669510, -1566669510, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        }));
        if (Intrinsics.areEqual(this.RemoteActionCompatParcelizer, "902")) {
            String str8 = userTuitionPaymentFragmentbindingInflater1 != null ? userTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            if (str8 != null) {
                int i6 = getNotifyChildrenChangedOptions + 17;
                getRoot = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 67 / 0;
                    if (str8.length() != 0) {
                        i = getNotifyChildrenChangedOptions + 125;
                        getRoot = i % 128;
                        if (i % 2 == 0) {
                            String str9 = userTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            throw null;
                        }
                        strA = userTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        strA = this.getInterfaceDescriptor;
                    }
                } else if (str8.length() != 0) {
                    i = getNotifyChildrenChangedOptions + 125;
                    getRoot = i % 128;
                    if (i % 2 == 0) {
                        String str10 = userTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        throw null;
                    }
                    strA = userTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    strA = this.getInterfaceDescriptor;
                }
            } else {
                strA = this.getInterfaceDescriptor;
            }
            activityBookingAntreanSuccessBinding.tvNarasiConfirm.setVisibility(8);
            if (bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                activityBookingAntreanSuccessBinding.ivBarcodeImage.setImageBitmap(bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                activityBookingAntreanSuccessBinding.ivBarcodeImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ImageView imageView2 = activityBookingAntreanSuccessBinding.ivBarcodeImage;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getFullSupportedCombinationList
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj};
                        return (Unit) BookingAntreanSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(-663024909, 663024912, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    }
                }));
            } else {
                activityBookingAntreanSuccessBinding.ivBarcodeImage.setImageResource(R.drawable.ic_success_antrean);
            }
        } else {
            activityBookingAntreanSuccessBinding.ivBarcodeImage.setImageResource(R.drawable.ic_success_antrean);
            activityBookingAntreanSuccessBinding.linearNamaLengkap.setVisibility(8);
            activityBookingAntreanSuccessBinding.linearNikNomorKartu.setVisibility(8);
            activityBookingAntreanSuccessBinding.linearHandphone.setVisibility(8);
            String str11 = userTuitionPaymentFragmentbindingInflater1 != null ? userTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            if (str11 == null || str11.length() == 0) {
                str2 = this.getInterfaceDescriptor;
                int i8 = getNotifyChildrenChangedOptions + 45;
                getRoot = i8 % 128;
                int i9 = i8 % 2;
            } else {
                str2 = userTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            strA = Camera2CameraControlExternalSyntheticLambda5.a(str2);
            int i10 = getNotifyChildrenChangedOptions + 125;
            getRoot = i10 % 128;
            if (i10 % 2 != 0) {
                activityBookingAntreanSuccessBinding.tvNarasiConfirm.setText("Detail lengkap pengajuan telah dikirim ke email  Anda :  ".concat(String.valueOf(strA)));
                throw null;
            }
            activityBookingAntreanSuccessBinding.tvNarasiConfirm.setText("Detail lengkap pengajuan telah dikirim ke email  Anda :  ".concat(String.valueOf(strA)));
        }
        if (Intrinsics.areEqual(this.b, "IP")) {
            str3 = "INFORMASI PENGADUAN";
        } else {
            int i11 = getRoot + 59;
            getNotifyChildrenChangedOptions = i11 % 128;
            int i12 = i11 % 2;
            str3 = "KLAIM";
        }
        String str12 = userTuitionPaymentFragmentbindingInflater1 != null ? userTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
        String str13 = (str12 == null || str12.length() == 0) ? this.onTransact : userTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (userTuitionPaymentFragmentbindingInflater1 != null) {
            int i13 = getRoot + 61;
            getNotifyChildrenChangedOptions = i13 % 128;
            if (i13 % 2 == 0) {
                String str14 = userTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                str7.hashCode();
                throw null;
            }
            str4 = userTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        } else {
            str4 = null;
        }
        String str15 = str4;
        if (str15 == null || str15.length() == 0) {
            str5 = this.notify;
        } else {
            int i14 = getRoot + 5;
            getNotifyChildrenChangedOptions = i14 % 128;
            if (i14 % 2 == 0) {
                String str16 = userTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                throw null;
            }
            str5 = userTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        String str17 = userTuitionPaymentFragmentbindingInflater1 != null ? userTuitionPaymentFragmentbindingInflater1.b : null;
        if (str17 == null || str17.length() == 0) {
            str6 = this.cancelAll;
        } else {
            int i15 = getRoot + 13;
            getNotifyChildrenChangedOptions = i15 % 128;
            if (i15 % 2 == 0) {
                str6 = userTuitionPaymentFragmentbindingInflater1.b;
                int i16 = 67 / 0;
            } else {
                str6 = userTuitionPaymentFragmentbindingInflater1.b;
            }
        }
        activityBookingAntreanSuccessBinding.tvKodeBookingValue.setText(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        activityBookingAntreanSuccessBinding.tvSuccessNamaLengkap.setText(": ".concat(String.valueOf(str5)));
        activityBookingAntreanSuccessBinding.tvSuccessNik.setText(": ".concat(String.valueOf(str6)));
        activityBookingAntreanSuccessBinding.tvSuccessHandphone.setText(": ".concat(String.valueOf(str13)));
        activityBookingAntreanSuccessBinding.tvSuccessEmail.setText(": ".concat(String.valueOf(strA)));
        activityBookingAntreanSuccessBinding.tvSuccessTopik.setText(": ".concat(str3));
        activityBookingAntreanSuccessBinding.tvSuccessKantorCabang.setText(": ".concat(String.valueOf(this.a)));
        activityBookingAntreanSuccessBinding.tvSuccessAlamatKantor.setText(": ".concat(String.valueOf(this.asBinder)));
        activityBookingAntreanSuccessBinding.tvSuccessTanggal.setText(": ".concat(String.valueOf(this.g)));
        activityBookingAntreanSuccessBinding.tvSuccessJam.setText(": ".concat(String.valueOf(this.d)));
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityBookingAntreanSuccessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnKembaliHalamanAwal;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getLevel3SupportedCombinationList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, (View) obj};
                return (Unit) BookingAntreanSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(109401690, -109401688, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        }));
        int i2 = getNotifyChildrenChangedOptions + 93;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
    }

    private static Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        Bitmap bitmapDecodeByteArray;
        int i = 2 % 2;
        int i2 = getRoot + 7;
        getNotifyChildrenChangedOptions = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                byte[] bArrDecode = Base64.decode(p0, 1);
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            } else {
                byte[] bArrDecode2 = Base64.decode(p0, 0);
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode2, 0, bArrDecode2.length);
            }
            return bitmapDecodeByteArray;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private final void b(Bitmap p0) throws Throwable {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = getRoot + 11;
            getNotifyChildrenChangedOptions = i2 % 128;
            int i3 = i2 % 2;
            if (ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                int i4 = getNotifyChildrenChangedOptions + 103;
                getRoot = i4 % 128;
                if (i4 % 2 == 0) {
                    ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 100);
                    return;
                }
                String[] strArr = new String[0];
                strArr[0] = "android.permission.WRITE_EXTERNAL_STORAGE";
                ActivityCompat.requestPermissions(this, strArr, 110);
                return;
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Bitmap p0) throws Throwable {
        FileOutputStream fileOutputStream;
        int i = 2 % 2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        StringBuilder sb = new StringBuilder("QRCode_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append(".png");
        String string = sb.toString();
        OutputStream outputStreamOpenOutputStream = null;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentResolver contentResolver = getContentResolver();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", string);
                    contentValues.put("mime_type", "image/png");
                    String str3 = Environment.DIRECTORY_PICTURES;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append("/BPJS_QRCode");
                    contentValues.put("relative_path", sb2.toString());
                    Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    if (uriInsert != null) {
                        outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                    }
                } else {
                    File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(externalStoragePublicDirectory);
                    sb3.append("/BPJS_QRCode");
                    String string2 = sb3.toString();
                    File file = new File(string2);
                    if (!file.exists()) {
                        int i2 = getRoot + 33;
                        getNotifyChildrenChangedOptions = i2 % 128;
                        int i3 = i2 % 2;
                        file.mkdirs();
                    }
                    File file2 = new File(string2, string);
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("_data", file2.getAbsolutePath());
                        contentValues2.put("mime_type", "image/png");
                        getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues2);
                        outputStreamOpenOutputStream = fileOutputStream;
                    } catch (Exception e2) {
                        e = e2;
                        outputStreamOpenOutputStream = fileOutputStream;
                        e.printStackTrace();
                        String message = e.getMessage();
                        StringBuilder sb4 = new StringBuilder("Gagal menyimpan QR Code: ");
                        sb4.append(message);
                        Toast.makeText(this, sb4.toString(), 0).show();
                        if (outputStreamOpenOutputStream != null) {
                            outputStreamOpenOutputStream.close();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                }
                if (outputStreamOpenOutputStream != null) {
                    int i4 = getRoot + 87;
                    getNotifyChildrenChangedOptions = i4 % 128;
                    int i5 = i4 % 2;
                    p0.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
                    outputStreamOpenOutputStream.flush();
                    Toast.makeText(this, "QR Code berhasil disimpan ke galeri", 0).show();
                } else {
                    BookingAntreanSuccessActivity bookingAntreanSuccessActivity = this;
                    Toast.makeText(this, "Gagal membuat file untuk menyimpan QR Code", 0).show();
                }
                if (outputStreamOpenOutputStream != null) {
                    outputStreamOpenOutputStream.close();
                    int i6 = getNotifyChildrenChangedOptions + 101;
                    getRoot = i6 % 128;
                    int i7 = i6 % 2;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        BookingAntreanSuccessActivity bookingAntreanSuccessActivity = (BookingAntreanSuccessActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        String[] strArr = (String[]) objArr[2];
        int[] iArr = (int[]) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onRequestPermissionsResult(iIntValue, strArr, iArr);
        if (iIntValue == 100) {
            int i2 = getRoot;
            int i3 = i2 + 73;
            getNotifyChildrenChangedOptions = i3 % 128;
            if (i3 % 2 == 0) {
                int length = iArr.length;
                throw null;
            }
            if (!(!(iArr.length == 0))) {
                Toast.makeText(bookingAntreanSuccessActivity, "Permission ditolak. Tidak dapat menyimpan QR Code", 0).show();
            } else {
                int i4 = i2 + 115;
                getNotifyChildrenChangedOptions = i4 % 128;
                if (i4 % 2 != 0 ? iArr[0] != 0 : iArr[0] != 0) {
                    Toast.makeText(bookingAntreanSuccessActivity, "Permission ditolak. Tidak dapat menyimpan QR Code", 0).show();
                } else {
                    Bitmap bitmap = bookingAntreanSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (bitmap != null) {
                        int i5 = i2 + 105;
                        getNotifyChildrenChangedOptions = i5 % 128;
                        int i6 = i5 % 2;
                        bookingAntreanSuccessActivity.b(bitmap);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:17:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:19:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:22:0x0205 A[Catch: all -> 0x09dd, TryCatch #2 {all -> 0x09dd, blocks: (B:20:0x01f1, B:22:0x0205, B:23:0x0234, B:51:0x06d3, B:53:0x06e7, B:54:0x0719, B:56:0x074b, B:57:0x07bb), top: B:101:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x024e  */
    /* JADX WARN: Code duplicated, block: B:31:0x032e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0383  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 117;
        getRoot = i2 % 128;
        int i3 = 0;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char pressedStateDuration = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1755;
                int minimumFlingVelocity = 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr2 = new Object[1];
                c((byte) ($$b >>> 2), (short) 193, $$a[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, packedPositionType, minimumFlingVelocity, 986134021, false, (String) objArr2[0], null);
            }
            int i4 = 19 / 0;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                    int i5 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i6 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                    Object[] objArr3 = new Object[1];
                    c((byte) 52, (short) 156, $$a[7], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i5, i6, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                int i7 = ((int[]) objArr4[0])[0];
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{i7}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1910711902;
                int i8 = ~length;
                int i9 = (((1195884501 + (((~((-93598219) | i8)) | 306200644) * 220)) + (((~(i8 | (-227817356))) | 440419781) * (-440))) + ((length | (-93598219)) * 220)) - 210499880;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i11 ^ (i11 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                e(new char[]{502, 8347, 39332, 43350, 30903, 31289, 10269, 15994, 8636, 42600, 8209, 43994, 45977, 6455, 39711, 436, 41689, 40067}, 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                e(new char[]{10881, 56474, 60032, 36885, 27288, 2169, 39343, 49245, 47307, 40086, 49251, 48713, 16675, 13582, 42808, 56423, 26030, 17809}, 16 - Color.alpha(0), objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {312256265};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - (Process.myTid() >> 22)), 1725 - ImageFormat.getBitsPerPixel(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), -210499880, false, true);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char scrollDefaultDelay = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        int longPressTimeout = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
                        Object[] objArr8 = new Object[1];
                        c((byte) 52, (short) 156, $$a[7], objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, longPressTimeout, offsetBefore, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                    try {
                        Object[] objArr9 = new Object[1];
                        e(new char[]{62591, 32530, 9112, 34893, 41599, 1696, 42945, 39789, 59840, 2899, 2101, 276, 40234, 52732, 52253, 17865, 20473, 60547, 33638, 8408, 18064, 31875, 65347, 56247}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_dompetku).substring(0, 16).codePointAt(7) - 10, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        e(new char[]{30277, 21936, 32878, 56916, 41859, 45433, 17035, 34213, 22168, 23117, 48837, 16670, 62190, 12847, 56265, 64563, 9577, 28392}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_clicks).substring(0, 11).codePointAt(2) - 62, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                            int i12 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                            byte b = (byte) 52;
                            Object[] objArr11 = new Object[1];
                            c(b, (short) (b << 1), $$a[7], objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, fadingEdgeLength, i12, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29944);
                            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 23;
                            Object[] objArr12 = new Object[1];
                            c((byte) ($$b >>> 2), (short) 193, $$a[7], objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize, scrollDefaultDelay2, touchSlop, 986134021, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                        int i13 = getNotifyChildrenChangedOptions + 85;
                        getRoot = i13 % 128;
                        int i14 = i13 % 2;
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
        } else {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                int iMyTid = 1755 - (Process.myTid() >> 22);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
                Object[] objArr13 = new Object[1];
                c((byte) ($$b >>> 2), (short) 193, $$a[7], objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(absoluteGravity, iMyTid, iCombineMeasuredStates, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                    int i15 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i16 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                    Object[] objArr14 = new Object[1];
                    c((byte) 52, (short) 156, $$a[7], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, i15, i16, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                int i17 = ((int[]) objArr15[0])[0];
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{i17}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1910711902;
                int i18 = ~length2;
                int i19 = (((1195884501 + (((~((-93598219) | i18)) | 306200644) * 220)) + (((~(i18 | (-227817356))) | 440419781) * (-440))) + ((length2 | (-93598219)) * 220)) - 210499880;
                int i110 = (i19 << 13) ^ i19;
                int i111 = i110 ^ (i110 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i111 ^ (i111 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                e(new char[]{502, 8347, 39332, 43350, 30903, 31289, 10269, 15994, 8636, 42600, 8209, 43994, 45977, 6455, 39711, 436, 41689, 40067}, 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                e(new char[]{10881, 56474, 60032, 36885, 27288, 2169, 39343, 49245, 47307, 40086, 49251, 48713, 16675, 13582, 42808, 56423, 26030, 17809}, 16 - Color.alpha(0), objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {312256265};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - (Process.myTid() >> 22)), 1725 - ImageFormat.getBitsPerPixel(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = zzpu.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), -210499880, false, true);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollDefaultDelay3 = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int longPressTimeout2 = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 23;
                    Object[] objArr19 = new Object[1];
                    c((byte) 52, (short) 156, $$a[7], objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay3, longPressTimeout2, offsetBefore2, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                Object[] objArr20 = new Object[1];
                e(new char[]{62591, 32530, 9112, 34893, 41599, 1696, 42945, 39789, 59840, 2899, 2101, 276, 40234, 52732, 52253, 17865, 20473, 60547, 33638, 8408, 18064, 31875, 65347, 56247}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_dompetku).substring(0, 16).codePointAt(7) - 10, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                e(new char[]{30277, 21936, 32878, 56916, 41859, 45433, 17035, 34213, 22168, 23117, 48837, 16670, 62190, 12847, 56265, 64563, 9577, 28392}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_clicks).substring(0, 11).codePointAt(2) - 62, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
                    int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                    int i112 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    byte b2 = (byte) 52;
                    Object[] objArr111 = new Object[1];
                    c(b2, (short) (b2 << 1), $$a[7], objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay2, fadingEdgeLength2, i112, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29944);
                    int scrollDefaultDelay4 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 23;
                    Object[] objArr112 = new Object[1];
                    c((byte) ($$b >>> 2), (short) 193, $$a[7], objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize2, scrollDefaultDelay4, touchSlop2, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
                int i113 = getNotifyChildrenChangedOptions + 85;
                getRoot = i113 % 128;
                int i114 = i113 % 2;
            }
        }
        int i20 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i21 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i21 != i20) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                while (i3 < strArr.length) {
                    arrayList.add(strArr[i3]);
                    i3++;
                }
            }
            throw new RuntimeException(String.valueOf(i21));
        }
        int i22 = getNotifyChildrenChangedOptions + 119;
        getRoot = i22 % 128;
        int i23 = i22 % 2;
        int i24 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        int i25 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        Object[] objArr21 = {new int[]{i25}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int i26 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        int i27 = ~i26;
        int i28 = (~((-548913570) | i27)) | 229665;
        int i29 = ~(i26 | 884995047);
        int i30 = i24 + 17630282 + ((i28 | i29) * (-713)) + (i29 * 1426) + ((~(336311143 | i27)) * 713);
        int i31 = (i30 << 13) ^ i30;
        int i32 = i31 ^ (i31 >>> 17);
        ((int[]) objArr21[3])[0] = i32 ^ (i32 << 5);
        int i33 = getRoot + 81;
        getNotifyChildrenChangedOptions = i33 % 128;
        int i34 = i33 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char gidForName = (char) (Process.getGidForName("") + 1);
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
            int maximumDrawingCacheSize3 = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte b3 = (byte) 52;
            Object[] objArr22 = new Object[1];
            c(b3, b3, $$a[7], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(gidForName, tapTimeout, maximumDrawingCacheSize3, 1357589585, false, (String) objArr22[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr23 = new Object[1];
        e(new char[]{62591, 32530, 9112, 34893, 41599, 1696, 42945, 39789, 59840, 2899, 2101, 276, 40234, 52732, 52253, 17865, 20473, 60547, 33638, 8408, 18064, 31875, 65347, 56247}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr23);
        Class<?> cls5 = Class.forName((String) objArr23[0]);
        Object[] objArr24 = new Object[1];
        e(new char[]{30277, 21936, 32878, 56916, 41859, 45433, 17035, 34213, 22168, 23117, 48837, 16670, 62190, 12847, 56265, 64563, 9577, 28392}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr24);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int iRed = Color.red(0) + 1031;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
            Object[] objArr25 = new Object[1];
            c((byte) 52, (short) 156, $$a[7], objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(size, iRed, threadPriority, 1344079056, false, (String) objArr25[0], null);
        }
        if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i35 = getRoot + 121;
            getNotifyChildrenChangedOptions = i35 % 128;
            int i36 = i35 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int i37 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
                int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte[] bArr = $$a;
                byte b4 = bArr[7];
                Object[] objArr26 = new Object[1];
                c(b4, b4, bArr[28], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(pressedStateDuration2, i37, iIndexOf, 632103528, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i38 = ((int[]) objArr27[3])[0];
            int i39 = ((int[]) objArr27[1])[0];
            String[] strArr2 = (String[]) objArr27[0];
            int i40 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i41 = 1735288292 + (((~(i40 | 750612798)) | 302122176) * 305) + (((~((~i40) | 750612798)) | 506332628) * 305) + 1047789567;
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr[2])[0] = i43 ^ (i43 << 5);
        } else {
            Object[] objArr28 = new Object[1];
            e(new char[]{502, 8347, 39332, 43350, 30903, 31289, 10269, 15994, 8636, 42600, 8209, 43994, 45977, 6455, 39711, 436, 41689, 40067}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 101, objArr28);
            Class<?> cls6 = Class.forName((String) objArr28[0]);
            Object[] objArr29 = new Object[1];
            e(new char[]{10881, 56474, 60032, 36885, 27288, 2169, 39343, 49245, 47307, 40086, 49251, 48713, 16675, 13582, 42808, 56423, 26030, 17809}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr29);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr29[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr30 = {312256265};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - TextUtils.getTrimmedLength("")), 1133 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 18 - View.resolveSize(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr31 = {Integer.valueOf(iIntValue3), 0, 1047789567, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr30), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int iResolveSize = View.resolveSize(0, 0) + 1031;
                int scrollDefaultDelay5 = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte b5 = (byte) 52;
                Object[] objArr32 = new Object[1];
                c(b5, b5, $$a[7], objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cCombineMeasuredStates, iResolveSize, scrollDefaultDelay5, 1298546779, false, (String) objArr32[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - ExpandableListView.getPackedPositionGroup(0L)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1117, 17 - TextUtils.indexOf("", "")), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr31);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                int packedPositionGroup = 1031 - ExpandableListView.getPackedPositionGroup(0L);
                int i44 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                byte[] bArr2 = $$a;
                byte b6 = bArr2[7];
                Object[] objArr33 = new Object[1];
                c(b6, b6, bArr2[28], objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAxisFromString, packedPositionGroup, i44, 632103528, false, (String) objArr33[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr34 = new Object[1];
                e(new char[]{62591, 32530, 9112, 34893, 41599, 1696, 42945, 39789, 59840, 2899, 2101, 276, 40234, 52732, 52253, 17865, 20473, 60547, 33638, 8408, 18064, 31875, 65347, 56247}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_prima).substring(1, 3).codePointAt(0) - 75, objArr34);
                Class<?> cls7 = Class.forName((String) objArr34[0]);
                Object[] objArr35 = new Object[1];
                e(new char[]{30277, 21936, 32878, 56916, 41859, 45433, 17035, 34213, 22168, 23117, 48837, 16670, 62190, 12847, 56265, 64563, 9577, 28392}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr35);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr35[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int iResolveSize2 = 1031 - View.resolveSize(0, 0);
                    int size2 = View.MeasureSpec.getSize(0) + 15;
                    Object[] objArr36 = new Object[1];
                    c((byte) 52, (short) 156, $$a[7], objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(capsMode, iResolveSize2, size2, 1344079056, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int pressedStateDuration3 = 1031 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iResolveSize3 = 15 - View.resolveSize(0, 0);
                    byte b7 = (byte) 52;
                    Object[] objArr37 = new Object[1];
                    c(b7, b7, $$a[7], objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(keyRepeatTimeout, pressedStateDuration3, iResolveSize3, 1357589585, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i45 = ((int[]) objArr[1])[0];
        int i46 = ((int[]) objArr[3])[0];
        if (i46 != i45) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i3 < strArr3.length) {
                    arrayList2.add(strArr3[i3]);
                    i3++;
                }
            }
            throw new RuntimeException(String.valueOf(i46));
        }
        Object[] objArr38 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i47 = ((int[]) objArr[2])[0];
        int i48 = ((int[]) objArr[3])[0];
        int i49 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i50 = (~((-687159580) | iIdentityHashCode)) | 546320394;
        int i51 = i47 + (-659599367) + (i50 * 992) + ((i50 | (~((~iIdentityHashCode) | (-302040225)))) * (-496)) + ((iIdentityHashCode | (-442879410)) * 496);
        int i52 = (i51 << 13) ^ i51;
        int i53 = i52 ^ (i52 >>> 17);
        ((int[]) objArr38[2])[0] = i53 ^ (i53 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1510741703
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.BookingAntreanSuccessActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 97;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.akulaku_instruction_step4).substring(0, 1).codePointAt(0) - 1742648798;
        int i5 = ~iCodePointAt;
        if (i4 != (-1452760967) + (((~((-179705760) | i5)) | (~(1009693302 | iCodePointAt))) * 217) + (((~(iCodePointAt | (-179705760))) | 42993033) * 217) + (((~(1009693302 | i5)) | 179705759) * 217)) {
            throw new RuntimeException("497593777");
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i7 = 228399076 + ((startElapsedRealtime | 35690520) * 988);
        int i8 = ~startElapsedRealtime;
        if (i6 != i7 + (((~(467787386 | i8)) | 1679171712) * (-1976)) + (((~(startElapsedRealtime | (-2111268579))) | 35690520 | (~(2111268578 | i8))) * 988)) {
            throw null;
        }
        super.onStart();
        int i9 = getNotifyChildrenChangedOptions + 39;
        getRoot = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = getRoot + 99;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = (int) Runtime.getRuntime().totalMemory();
        int i6 = ~i5;
        if (i4 != (-666540044) + (((~(949828177 | i6)) | (~((-949559298) | i5))) * (-831)) + ((~(1069399931 | i5)) * (-1662)) + (((~(i5 | (-949828178))) | (~(i6 | (-119840635))) | (~(119840634 | i5))) * 831)) {
            int i7 = getRoot + 79;
            getNotifyChildrenChangedOptions = i7 % 128;
            if (i7 % 2 == 0) {
                int[] iArr = new int[996207645];
                iArr[996207644] = 0;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[996207645];
                iArr2[996207644] = 1;
                int i8 = 304385836 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i9 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i9 != (((~(iIdentityHashCode | 1616570537)) * TypedValues.CycleType.TYPE_EASING) - 1698704352) + (((~((~iIdentityHashCode) | 1616570537)) | 542787745) * TypedValues.CycleType.TYPE_EASING)) {
            throw null;
        }
        super.onCreate(bundle);
        int i10 = getRoot + 21;
        getNotifyChildrenChangedOptions = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(BookingAntreanSuccessActivity bookingAntreanSuccessActivity, Bitmap bitmap, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 93;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        bookingAntreanSuccessActivity.b(bitmap);
        Unit unit = Unit.INSTANCE;
        int i4 = getNotifyChildrenChangedOptions + 123;
        getRoot = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        BookingAntreanSuccessActivity bookingAntreanSuccessActivity = (BookingAntreanSuccessActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = getRoot + 11;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        bookingAntreanSuccessActivity.getOnBackPressedDispatcher().onBackPressed();
        Unit unit = Unit.INSTANCE;
        int i4 = getNotifyChildrenChangedOptions + 49;
        getRoot = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ WindowInsets TuitionPaymentFragmentspecialinlinedviewModeldefault2(DialogBarcodeZoomBinding dialogBarcodeZoomBinding, BookingAntreanSuccessActivity bookingAntreanSuccessActivity, View view, WindowInsets windowInsets) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 95;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsets, "");
        Insets systemWindowInsets = windowInsets.getSystemWindowInsets();
        Intrinsics.checkNotNullExpressionValue(systemWindowInsets, "");
        dialogBarcodeZoomBinding.ivClose.setPadding(dialogBarcodeZoomBinding.ivClose.getPaddingLeft(), systemWindowInsets.top + bookingAntreanSuccessActivity.getResources().getDimensionPixelSize(R.dimen.dimen_16dp), dialogBarcodeZoomBinding.ivClose.getPaddingRight(), dialogBarcodeZoomBinding.ivClose.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = dialogBarcodeZoomBinding.btnDownload.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = systemWindowInsets.bottom + bookingAntreanSuccessActivity.getResources().getDimensionPixelSize(R.dimen.dimen_16dp);
        dialogBarcodeZoomBinding.btnDownload.setLayoutParams(marginLayoutParams);
        WindowInsets windowInsetsConsumeSystemWindowInsets = windowInsets.consumeSystemWindowInsets();
        int i4 = getNotifyChildrenChangedOptions + 61;
        getRoot = i4 % 128;
        if (i4 % 2 == 0) {
            return windowInsetsConsumeSystemWindowInsets;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ WindowInsets b(DialogBarcodeZoomBinding dialogBarcodeZoomBinding, BookingAntreanSuccessActivity bookingAntreanSuccessActivity, View view, WindowInsets windowInsets) {
        int i = 2 % 2;
        int i2 = getRoot + 101;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsets, "");
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        dialogBarcodeZoomBinding.ivClose.setPadding(dialogBarcodeZoomBinding.ivClose.getPaddingLeft(), insets.top + bookingAntreanSuccessActivity.getResources().getDimensionPixelSize(R.dimen.dimen_16dp), dialogBarcodeZoomBinding.ivClose.getPaddingRight(), dialogBarcodeZoomBinding.ivClose.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = dialogBarcodeZoomBinding.btnDownload.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = insets.bottom + bookingAntreanSuccessActivity.getResources().getDimensionPixelSize(R.dimen.dimen_16dp);
        dialogBarcodeZoomBinding.btnDownload.setLayoutParams(marginLayoutParams);
        int i4 = getNotifyChildrenChangedOptions + 63;
        getRoot = i4 % 128;
        if (i4 % 2 == 0) {
            return windowInsets;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Dialog dialog, View view) {
        int i = 2 % 2;
        int i2 = getRoot + 75;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            dialog.dismiss();
            return Unit.INSTANCE;
        }
        dialog.dismiss();
        int i4 = 37 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(BookingAntreanSuccessActivity bookingAntreanSuccessActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(1566669510, -1566669510, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{bookingAntreanSuccessActivity, view}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(BookingAntreanSuccessActivity bookingAntreanSuccessActivity, Bitmap bitmap, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(-663024909, 663024912, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{bookingAntreanSuccessActivity, bitmap, view}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(BookingAntreanSuccessActivity bookingAntreanSuccessActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(109401690, -109401688, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{bookingAntreanSuccessActivity, view}, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    static {
        disconnect = 1;
        g();
        INSTANCE = new Companion(null);
        int i = getItem + 77;
        disconnect = i % 128;
        if (i % 2 == 0) {
            int i2 = 99 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 113;
        getRoot = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = getRoot + 125;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int p0, String[] p1, int[] p2) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1687702803, 1687702804, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_hat_text).substring(0, 4).codePointAt(2) + 2061328503, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this, Integer.valueOf(p0), p1, p2}, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 717893091);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 65;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        MediaBrowserCompat = (char) 63659;
        connect = (char) 64932;
        IconCompatParcelizer = (char) 41673;
        write = (char) 44319;
    }

    private static String $$i(int i, short s, byte b) {
        byte[] bArr = $$c;
        int i2 = 108 - (b * 2);
        int i3 = s * 4;
        int i4 = i + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = i4 + (-i3);
            i4 = i4;
        }
        while (true) {
            i5++;
            int i6 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i6];
            i4 = i6;
        }
    }
}
