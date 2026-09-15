package com.bpjstku.presentation.queueing;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.queueing.model.request.NearestOfficeRequest;
import com.bpjstku.data.queueing.model.response.DetailKuotaItem;
import com.bpjstku.data.queueing.model.response.NearestOfficeItem;
import com.bpjstku.data.queueing.model.response.NearestOfficeResponse;
import com.bpjstku.data.queueing.model.response.QuotaBookingItem;
import com.bpjstku.data.queueing.model.response.QuotaBookingResponse;
import com.bpjstku.databinding.ActivityBookingAntreanFormBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.queueing.BookingAntreanFormActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_common.zzbb;
import com.google.android.material.button.MaterialButton;
import defpackage.BufferProviderState;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.DecorContentParent;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.requestClose;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004R\u0015\u0010\u0014\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000e\u001a\u00020\u00158BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\u001a8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001dR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020$0\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u000b\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\n\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0016\u0010 \u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010-R\u0016\u0010%\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010-R\u0016\u0010\"\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010-R\u0016\u00102\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010-R\u0016\u0010+\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0016\u00104\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010-"}, d2 = {"Lcom/bpjstku/presentation/queueing/BookingAntreanFormActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityBookingAntreanFormBinding;", "<init>", "()V", "", "b", "asBinder", "onBackPressed", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Ljava/lang/String;", "onTransact", "LgetStreamUseCaseSupportedCombinationList;", "IconCompatParcelizer", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/data/lib/PreferenceManager;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "d", "I", "()I", "", "Lcom/bpjstku/data/queueing/model/response/NearestOfficeItem;", "cancelAll", "Ljava/util/List;", "notify", "g", "Lcom/bpjstku/data/queueing/model/response/QuotaBookingItem;", "cancel", "INotificationSideChannelStub", "Lcom/bpjstku/data/queueing/model/response/NearestOfficeItem;", "getInterfaceDescriptor", "Lcom/bpjstku/data/queueing/model/response/QuotaBookingItem;", "Lcom/bpjstku/data/queueing/model/response/DetailKuotaItem;", "RemoteActionCompatParcelizer", "Lcom/bpjstku/data/queueing/model/response/DetailKuotaItem;", "Ljava/lang/String;", "INotificationSideChannel", "", "Z", "INotificationSideChannelStubProxy", "INotificationSideChannelDefault", "MediaBrowserCompat", "write"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BookingAntreanFormActivity extends BindingBaseActivity<ActivityBookingAntreanFormBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char connect;
    private static int disconnect;
    private static long read;
    private static int write;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private NearestOfficeItem d;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private DetailKuotaItem asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private boolean INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private QuotaBookingItem a;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {68, -119, -76, 97};
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {58, 66, -1, 15, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 234;
    private static int getRoot = 1;
    private static int getItem = 0;
    private static int getNotifyChildrenChangedOptions = 1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.activity_booking_antrean_form;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private List<NearestOfficeItem> b = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private List<String> g = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private List<QuotaBookingItem> asBinder = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String INotificationSideChannel = "";

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String cancelAll = "";

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private String cancel = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String onTransact = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String notify = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String getInterfaceDescriptor = "";

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private String INotificationSideChannelStub = "";

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private String INotificationSideChannelDefault = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer = "0.0";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String write = "0.0";

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = (~(i7 | i6)) | i4;
        int i9 = (~(i7 | (~i6))) | (~((~i4) | i7)) | (~(i4 | i3 | i6));
        int i10 = ~(i6 | i4);
        int i11 = i4 + i3 + i2 + ((-813770285) * i5) + (135932771 * i);
        int i12 = i11 * i11;
        int i13 = (526900465 * i4) + 74317824 + ((-1745228167) * i3) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i2) + (1331953664 * i5) + ((-366739456) * i) + ((-1308753920) * i12);
        int i14 = (i4 * 1149714451) + 247108311 + (i3 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i2 * 1149713731) + (i5 * 1918847289) + (i * (-2006650391)) + (i12 * 460980224);
        int i15 = i13 + (i14 * i14 * (-1418592256));
        if (i15 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i15 == 2) {
            return b(objArr);
        }
        if (i15 != 3) {
            return i15 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        return TuitionPaymentFragmentbindingInflater1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            int r0 = 53 - r7
            byte[] r1 = com.bpjstku.presentation.queueing.BookingAntreanFormActivity.$$a
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r6 = r7
            r3 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r5 = r5 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r5]
        L29:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.BookingAntreanFormActivity.c(int, int, short, java.lang.Object[]):void");
    }

    public BookingAntreanFormActivity() {
        final BookingAntreanFormActivity bookingAntreanFormActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.queueing.BookingAntreanFormActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = bookingAntreanFormActivity;
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
        final BookingAntreanFormActivity bookingAntreanFormActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.queueing.BookingAntreanFormActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = bookingAntreanFormActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.queueing.BookingAntreanFormActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jk\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/bpjstku/presentation/queueing/BookingAntreanFormActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            Intrinsics.checkNotNullParameter(p5, "");
            Intrinsics.checkNotNullParameter(p6, "");
            Intrinsics.checkNotNullParameter(p7, "");
            Intrinsics.checkNotNullParameter(p10, "");
            Intent intent = new Intent(p0, (Class<?>) BookingAntreanFormActivity.class);
            intent.putExtra("extra_ocr_nik", p1);
            intent.putExtra("extra_ocr_nama", p2);
            intent.putExtra("extra_ocr_tgl_lahir", p3);
            intent.putExtra("extra_ocr_tempat_lahir", p4);
            intent.putExtra("extra_ocr_alamat", p5);
            intent.putExtra("extra_latitude", p6);
            intent.putExtra("extra_longitude", p7);
            intent.putExtra("extra_from_ocr", true);
            intent.putExtra("extra_activity", p8);
            intent.putExtra("extra_segment", p9);
            intent.putExtra("extra_transaction_id", p10);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityBookingAntreanFormBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 11;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        BookingAntreanFormActivity$bindingInflater$1 bookingAntreanFormActivity$bindingInflater$1 = BookingAntreanFormActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = getNotifyChildrenChangedOptions + 1;
        getItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return bookingAntreanFormActivity$bindingInflater$1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        BookingAntreanFormActivity bookingAntreanFormActivity = (BookingAntreanFormActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getItem + 101;
        int i3 = i2 % 128;
        getNotifyChildrenChangedOptions = i3;
        int i4 = i2 % 2;
        int i5 = bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i6 = i3 + 21;
        getItem = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(i5);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        String stringExtra = getIntent().getStringExtra("extra_ocr_nik");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.INotificationSideChannel = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("extra_ocr_nama");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.cancelAll = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("extra_ocr_tgl_lahir");
        if (stringExtra3 == null) {
            int i2 = getNotifyChildrenChangedOptions + 71;
            getItem = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 45 / 0;
            }
            stringExtra3 = "";
        }
        this.cancel = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("extra_ocr_tempat_lahir");
        Object obj = null;
        if (stringExtra4 == null) {
            int i4 = getNotifyChildrenChangedOptions + 79;
            getItem = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            stringExtra4 = "";
        }
        this.onTransact = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("extra_ocr_alamat");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.notify = stringExtra5;
        this.INotificationSideChannelStubProxy = getIntent().getBooleanExtra("extra_from_ocr", false);
        String stringExtra6 = getIntent().getStringExtra("extra_activity");
        if (stringExtra6 == null) {
            int i5 = getItem + 21;
            getNotifyChildrenChangedOptions = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            stringExtra6 = "";
        }
        this.getInterfaceDescriptor = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("extra_longitude");
        if (stringExtra7 == null) {
            int i6 = getItem + 85;
            getNotifyChildrenChangedOptions = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            stringExtra7 = "";
        }
        this.write = stringExtra7;
        String stringExtra8 = getIntent().getStringExtra("extra_latitude");
        if (stringExtra8 == null) {
            int i7 = getNotifyChildrenChangedOptions + 27;
            getItem = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            stringExtra8 = "";
        }
        this.RemoteActionCompatParcelizer = stringExtra8;
        String stringExtra9 = getIntent().getStringExtra("extra_segment");
        if (stringExtra9 == null) {
            int i8 = getItem + 113;
            getNotifyChildrenChangedOptions = i8 % 128;
            int i9 = i8 % 2;
            stringExtra9 = "";
        }
        this.INotificationSideChannelStub = stringExtra9;
        String stringExtra10 = getIntent().getStringExtra("extra_transaction_id");
        this.INotificationSideChannelDefault = stringExtra10 != null ? stringExtra10 : "";
        int i10 = getItem + 95;
        getNotifyChildrenChangedOptions = i10 % 128;
        int i11 = i10 % 2;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8328);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1235;
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 35;
                    byte b = (byte) $$f;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, offsetBefore, packedPositionGroup, -653973969, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2765;
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 14;
                        int i3 = $$f;
                        byte b3 = (byte) i3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, iLastIndexOf, packedPositionType, 1504416861, false, $$i(b3, (byte) (b3 + 2), (byte) i3), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43325), 253 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cIndexOf = (char) (65200 - TextUtils.indexOf("", ""));
                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2891;
                                int i4 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17;
                                int i5 = $$f;
                                byte b4 = (byte) i5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, threadPriority, i4, 2012627446, false, $$i(b4, (byte) (b4 + 1), (byte) i5), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (read ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) write) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) connect) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            int i6 = $11 + 63;
                            $10 = i6 % 128;
                            int i7 = i6 % 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
        int i8 = $11 + 113;
        $10 = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        ActivityBookingAntreanFormBinding activityBookingAntreanFormBinding = (ActivityBookingAntreanFormBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityBookingAntreanFormBinding.layoutToolbar.tvToolbarTitle.setText(getString(R.string.liveness_title));
        activityBookingAntreanFormBinding.layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: FocusMeteringControlExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {this.b, view};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                BookingAntreanFormActivity.TuitionPaymentFragmentbindingInflater1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, 1864313900, -1864313898, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        if (Intrinsics.areEqual(this.getInterfaceDescriptor, "REG")) {
            activityBookingAntreanFormBinding.etTopik.setText("AKTIVASI AKUN JMO");
            return;
        }
        if (Intrinsics.areEqual(this.getInterfaceDescriptor, "RES")) {
            activityBookingAntreanFormBinding.etTopik.setText("PEMULIHAN AKUN JMO");
            int i2 = getItem + 65;
            getNotifyChildrenChangedOptions = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        activityBookingAntreanFormBinding.etTopik.setText("GANTI PERANGKAT JMO");
        int i4 = getItem + 5;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = getItem + 85;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 == 0) {
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, true, 88);
            finishAffinity();
        } else {
            LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, false, 6);
            finishAffinity();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ActivityBookingAntreanFormBinding activityBookingAntreanFormBinding = (ActivityBookingAntreanFormBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TextView textView = activityBookingAntreanFormBinding.actvKantorCabang;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: FocusMeteringControlExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (View) obj);
            }
        }));
        TextView textView2 = activityBookingAntreanFormBinding.actvTanggal;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: FocusMeteringControl1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        TextView textView3 = activityBookingAntreanFormBinding.actvJam;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getDeviceDefaultViewAngleDegrees
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BookingAntreanFormActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        MaterialButton materialButton = activityBookingAntreanFormBinding.btnSelanjutnya;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: FocusMeteringControl2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BookingAntreanFormActivity.TuitionPaymentFragmentbindingInflater1(this.b, (View) obj);
            }
        }));
        int i2 = getNotifyChildrenChangedOptions + 103;
        getItem = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.write;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        System.out.print((Object) sb.toString());
        final getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        String str3 = this.RemoteActionCompatParcelizer;
        String str4 = this.write;
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        MutableLiveData<VirtualCameraAdapter1<NearestOfficeResponse>> mutableLiveData = getstreamusecasesupportedcombinationlist.d;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getstreamusecasesupportedcombinationlist.f988a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new NearestOfficeRequest(str3, str4, "JMREG123"))));
        final Function1 function1 = new Function1() { // from class: getUltraHighResolutionSupportedCombinationList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {getstreamusecasesupportedcombinationlist, (NearestOfficeResponse) obj};
                return (Unit) getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1130398758, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1130398754, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr);
            }
        };
        logToString logtostring = new logToString() { // from class: getUltraHdrSupportedCombinationList
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                getStreamUseCaseSupportedCombinationList.g(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: createSessionConfig
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getStreamUseCaseSupportedCombinationList.a(getstreamusecasesupportedcombinationlist, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: MeteringRepeatingSessionMeteringRepeatingConfig
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                getStreamUseCaseSupportedCombinationList.INotificationSideChannel(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = getItem + 105;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        BookingAntreanFormActivity bookingAntreanFormActivity = this;
        ((getStreamUseCaseSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.observe(bookingAntreanFormActivity, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: FocusMeteringControlExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getStreamUseCaseSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).asInterface.observe(bookingAntreanFormActivity, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: FocusMeteringControlExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = getItem + 65;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends ArrayAdapter<NearestOfficeItem> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(BookingAntreanFormActivity bookingAntreanFormActivity, List<NearestOfficeItem> list) {
            super(bookingAntreanFormActivity, android.R.layout.select_dialog_item, list);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            NearestOfficeItem item = getItem(i);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(60, 40, 60, 40);
            TextView textView = new TextView(getContext());
            String namaKantor = item != null ? item.getNamaKantor() : null;
            if (namaKantor == null) {
                namaKantor = "";
            }
            textView.setText(namaKantor);
            textView.setTextSize(16.0f);
            textView.setTextColor(Color.parseColor("#212121"));
            textView.setTypeface(null, 1);
            linearLayout.addView(textView);
            TextView textView2 = new TextView(getContext());
            String alamat = item != null ? item.getAlamat() : null;
            textView2.setText(alamat != null ? alamat : "");
            textView2.setTextSize(12.0f);
            textView2.setTextColor(Color.parseColor("#757575"));
            textView2.setPadding(0, 8, 0, 0);
            linearLayout.addView(textView2);
            return linearLayout;
        }
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        int i = 2 % 2;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", new Locale("id", "ID"));
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMMM yyyy", new Locale("id", "ID"));
            Date date = simpleDateFormat.parse(p0);
            if (date != null) {
                int i2 = getNotifyChildrenChangedOptions + 11;
                getItem = i2 % 128;
                if (i2 % 2 != 0) {
                    simpleDateFormat2.format(date);
                    throw null;
                }
                String str = simpleDateFormat2.format(date);
                if (str != null) {
                    return str;
                }
            }
        } catch (Exception unused) {
        }
        int i3 = getNotifyChildrenChangedOptions + 91;
        getItem = i3 % 128;
        int i4 = i3 % 2;
        return p0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    private final void onTransact() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityBookingAntreanFormBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnSelanjutnya;
        boolean z = false;
        if (this.d != null) {
            int i2 = getNotifyChildrenChangedOptions;
            int i3 = i2 + 13;
            getItem = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 32 / 0;
                if (this.a != null) {
                    if (this.asInterface != null) {
                        int i5 = i2 + 59;
                        getItem = i5 % 128;
                        int i6 = i5 % 2;
                        z = true;
                    }
                }
            } else if (this.a != null) {
                if (this.asInterface != null) {
                    int i7 = i2 + 59;
                    getItem = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                }
            }
        }
        materialButton.setEnabled(z);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
            int i3 = 1754 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[2], bArr[28], bArr[3], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, i3, scrollDefaultDelay, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char trimmedLength = (char) (29944 - TextUtils.getTrimmedLength(""));
                int trimmedLength2 = TextUtils.getTrimmedLength("") + 1755;
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                c((short) (bArr2[12] + 1), bArr2[28], bArr2[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength, trimmedLength2, absoluteGravity, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i4 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{i4}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i6 = ~i5;
            int i7 = (((1684277753 + ((i5 | 149172387) * 140)) + (((~(149172387 | i6)) | 50580756) * (-280))) + (((~(i5 | (-50580757))) | ((~(63430038 | i6)) | 136323105)) * 140)) - 81051201;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{20723, 6868, 57838, 43881}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 27094), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{26989, 47631, 62277, 21393, 45756, 28166, 635, 62070, 12299, 4392, 42784, 50289, 3651, 30674, 57510, 30042}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{18158, 38252, 50574, 17297}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step3).substring(2, 3).codePointAt(0) + 37209), Color.blue(0), new char[]{31378, 41638, 42954, 7781, 5361, 37173, 57875, 15422, 62269, 58347, 16741, 24104, 56970, 33720, 22565, 52353}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1499643258};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42048 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1726 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 29 - TextUtils.indexOf("", "", 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -81051201);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char mirror = (char) (29992 - AndroidCharacter.getMirror('0'));
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                    int i10 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    c((short) (bArr3[12] + 1), bArr3[28], bArr3[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, keyRepeatTimeout, i10, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{22640, 45377, 62462, 5209}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_general_network_error_timeout).substring(0, 37).length() - 37), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, new char[]{31193, 56420, 25027, 20036, 51588, 23320, 3586, 50699, 31103, 40055, 7655, 16083, 63363, 23043, 22645, 48051, 33302, 38980, 64332, 45325, 39163, 4654}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{16112, 49022, 59710, 50689}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_1).substring(1, 3).length() + 487), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minute).substring(0, 1).codePointAt(0) + 1052736977, new char[]{21831, 50250, 39497, 47719, 11665, 56318, 50911, 3569, 50883, 2461, 51871, 31345, 55301, 42260, 52532}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 29944);
                        int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
                        int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
                        byte[] bArr4 = $$a;
                        Object[] objArr11 = new Object[1];
                        c((short) 88, bArr4[28], bArr4[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iLastIndexOf, i11, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cRed = (char) (Color.red(0) + 29944);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1756;
                        int iKeyCodeFromString = 23 - KeyEvent.keyCodeFromString("");
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        c(bArr5[2], bArr5[28], bArr5[3], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, packedPositionChild, iKeyCodeFromString, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr == null) {
                throw null;
            }
            while (i2 < strArr.length) {
                int i12 = getItem + 35;
                getNotifyChildrenChangedOptions = i12 % 128;
                if (i12 % 2 == 0) {
                    arrayList.add(strArr[i2]);
                    i2 += 16;
                } else {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i13 = getItem + 59;
        getNotifyChildrenChangedOptions = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        Object[] objArr13 = {new int[]{i16}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int i17 = (int) Runtime.getRuntime().totalMemory();
        int i18 = ~i17;
        int i19 = i15 + 523750365 + (((~(209440237 | i18)) | 3162188) * 220) + (((~(i18 | 7981165)) | 204621260) * (-440)) + ((i17 | 209440237) * 220);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr13[3])[0] = i21 ^ (i21 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
            int iRgb = (-16776185) - Color.rgb(0, 0, 0);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
            byte[] bArr6 = $$a;
            Object[] objArr14 = new Object[1];
            c((short) 140, bArr6[28], bArr6[7], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf2, iRgb, touchSlop, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{22640, 45377, 62462, 5209}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (-1) - ExpandableListView.getPackedPositionChild(0L), new char[]{31193, 56420, 25027, 20036, 51588, 23320, 3586, 50699, 31103, 40055, 7655, 16083, 63363, 23043, 22645, 48051, 33302, 38980, 64332, 45325, 39163, 4654}, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{16112, 49022, 59710, 50689}, (char) (View.MeasureSpec.getSize(0) + 489), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1052737050, new char[]{21831, 50250, 39497, 47719, 11665, 56318, 50911, 3569, 50883, 2461, 51871, 31345, 55301, 42260, 52532}, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int iRed = Color.red(0) + 1031;
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 15;
            byte[] bArr7 = $$a;
            Object[] objArr17 = new Object[1];
            c((short) (bArr7[12] + 1), bArr7[28], bArr7[7], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMakeMeasureSpec, iRed, iIndexOf, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i22 = getNotifyChildrenChangedOptions + 113;
            getItem = i22 % 128;
            int i23 = i22 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1031;
                int touchSlop2 = 15 - (ViewConfiguration.getTouchSlop() >> 8);
                short s = (short) ($$b & 976);
                byte b = $$a[7];
                Object[] objArr18 = new Object[1];
                c(s, b, (byte) (b | 52), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c, packedPositionType, touchSlop2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr19[3])[0];
            int i25 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i26 = (((-827028363) + (((~(242153269 | iFreeMemory)) | 2126900) * (-756))) + (((~iFreeMemory) | 242153269) * 756)) - 1082104146;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr[2])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{20723, 6868, 57838, 43881}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 27069), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{26989, 47631, 62277, 21393, 45756, 28166, 635, 62070, 12299, 4392, 42784, 50289, 3651, 30674, 57510, 30042}, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{18158, 38252, 50574, 17297}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_bank_name).substring(1, 2).length() + 37316), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_gojek_app_tablet).substring(1, 2).length() - 1, new char[]{31378, 41638, 42954, 7781, 5361, 37173, 57875, 15422, 62269, 58347, 16741, 24104, 56970, 33720, 22565, 52353}, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-1499643258};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 46038), 1134 - TextUtils.getOffsetAfter("", 0), Color.red(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -1082104146, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1032;
                int iBlue = Color.blue(0) + 15;
                byte[] bArr8 = $$a;
                Object[] objArr24 = new Object[1];
                c((short) 140, bArr8[28], bArr8[7], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c2, bitsPerPixel, iBlue, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1116 - Process.getGidForName(""), 17 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                int i29 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                short s2 = (short) ($$b & 976);
                byte b2 = $$a[7];
                Object[] objArr25 = new Object[1];
                c(s2, b2, (byte) (b2 | 52), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(keyRepeatDelay, iIndexOf2, i29, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{22640, 45377, 62462, 5209}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), TextUtils.getCapsMode("", 0, 0), new char[]{31193, 56420, 25027, 20036, 51588, 23320, 3586, 50699, 31103, 40055, 7655, 16083, 63363, 23043, 22645, 48051, 33302, 38980, 64332, 45325, 39163, 4654}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{16112, 49022, 59710, 50689}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 453), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1052737050, new char[]{21831, 50250, 39497, 47719, 11665, 56318, 50911, 3569, 50883, 2461, 51871, 31345, 55301, 42260, 52532}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf3 = (char) TextUtils.indexOf("", "");
                    int iIndexOf3 = 1031 - TextUtils.indexOf("", "");
                    int iBlue2 = 15 - Color.blue(0);
                    byte[] bArr9 = $$a;
                    Object[] objArr28 = new Object[1];
                    c((short) (bArr9[12] + 1), bArr9[28], bArr9[7], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf3, iIndexOf3, iBlue2, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
                    byte[] bArr10 = $$a;
                    Object[] objArr29 = new Object[1];
                    c((short) 140, bArr10[28], bArr10[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetBefore, iNormalizeMetaState, iCombineMeasuredStates, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i30 = ((int[]) objArr[1])[0];
        int i31 = ((int[]) objArr[3])[0];
        if (i31 != i30) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i2 < strArr3.length) {
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i31));
        }
        int i32 = getNotifyChildrenChangedOptions + 115;
        getItem = i32 % 128;
        int i33 = i32 % 2;
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i34 = ((int[]) objArr[2])[0];
        int i35 = ((int[]) objArr[3])[0];
        int i36 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_card_number).substring(11, 12).codePointAt(0) + 1572771117;
        int i37 = ~iCodePointAt;
        int i38 = ~((-297627265) | i37);
        int i39 = ~(53347094 | iCodePointAt);
        int i40 = i34 + 1517103762 + ((i38 | i39) * 1150) + (((~((-53347095) | i37)) | i39) * (-575)) + (((~(iCodePointAt | (-297627265))) | (~(i37 | 297627264))) * 575);
        int i41 = i40 ^ (i40 << 13);
        int i42 = i41 ^ (i41 >>> 17);
        ((int[]) objArr30[2])[0] = i42 ^ (i42 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ab, code lost:
    
        if (r2 != (((1504525500 + ((r5 | (~(1841246424 | r6))) * (-1808))) + (((~((-700059777) | r4)) | (~(r6 | 1878996188))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(r4 | (-1841246425))) | 37749764) | (~(737809540 | r6))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ad, code lost:
    
        super.onResume();
        r10 = com.bpjstku.presentation.queueing.BookingAntreanFormActivity.getNotifyChildrenChangedOptions + 75;
        com.bpjstku.presentation.queueing.BookingAntreanFormActivity.getItem = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b9, code lost:
    
        if ((r10 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bb, code lost:
    
        r10 = 84 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00be, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
    
        throw new java.lang.RuntimeException("-247702130");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
    
        if (r2 == (((((~(r4 | 1045277215)) | (-1875264759)) * 56) + 1282028392) + (((~((~r4) | (-1875264759))) | 1045277215) * 56))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0068, code lost:
    
        if (r2 == ((((6766752 | r4) * (-374)) + 1503711120) + ((r4 | 526916) * 374))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        r2 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r4 = (int) android.os.Process.getElapsedCpuTime();
        r5 = ~((-737809541) | r4);
        r6 = ~r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[] r10) throws java.lang.IllegalAccessException {
        /*
            r0 = 0
            r10 = r10[r0]
            com.bpjstku.presentation.queueing.BookingAntreanFormActivity r10 = (com.bpjstku.presentation.queueing.BookingAntreanFormActivity) r10
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.bpjstku.presentation.queueing.BookingAntreanFormActivity.getNotifyChildrenChangedOptions
            int r2 = r2 + 103
            int r3 = r2 % 128
            com.bpjstku.presentation.queueing.BookingAntreanFormActivity.getItem = r3
            int r2 = r2 % r1
            r3 = 0
            if (r2 == 0) goto L3e
            java.lang.reflect.Member[] r2 = defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1
            r4 = 1
            r2 = r2[r4]
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r2 = r2.getInt(r3)
            long r4 = android.os.Process.getElapsedCpuTime()
            int r4 = (int) r4
            r5 = 1045277215(0x3e4daa1f, float:0.20084427)
            r6 = r4 | r5
            int r6 = ~r6
            r7 = -1875264759(0xffffffff9039bb09, float:-3.6628904E-29)
            r6 = r6 | r7
            int r6 = r6 * 56
            r8 = 1282028392(0x4c6a3368, float:6.1394336E7)
            int r6 = r6 + r8
            int r4 = ~r4
            r4 = r4 | r7
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 56
            int r6 = r6 + r4
            if (r2 != r6) goto Lc0
            goto L6a
        L3e:
            java.lang.reflect.Member[] r2 = defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1
            r2 = r2[r0]
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r2 = r2.getInt(r3)
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()
            long r4 = r4.maxMemory()
            int r4 = (int) r4
            int r4 = ~r4
            r5 = 7293668(0x6f4ae4, float:1.0220606E-38)
            r4 = r4 | r5
            int r4 = ~r4
            r5 = 6766752(0x6740a0, float:9.482239E-39)
            r5 = r5 | r4
            int r5 = r5 * (-374)
            r6 = 1503711120(0x59a0cf90, float:5.6580267E15)
            int r5 = r5 + r6
            r6 = 526916(0x80a44, float:7.38367E-40)
            r4 = r4 | r6
            int r4 = r4 * 374
            int r5 = r5 + r4
            if (r2 != r5) goto Lc0
        L6a:
            java.lang.reflect.Member[] r2 = defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1
            r2 = r2[r0]
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r2 = r2.getInt(r3)
            long r4 = android.os.Process.getElapsedCpuTime()
            int r4 = (int) r4
            r5 = -737809541(0xffffffffd405eb7b, float:-2.3007254E12)
            r5 = r5 | r4
            int r5 = ~r5
            int r6 = ~r4
            r7 = 1841246424(0x6dbf30d8, float:7.3963357E27)
            r7 = r7 | r6
            int r7 = ~r7
            r5 = r5 | r7
            int r5 = r5 * (-1808)
            r7 = 1504525500(0x59ad3cbc, float:6.0952436E15)
            int r7 = r7 + r5
            r5 = -700059777(0xffffffffd645ef7f, float:-5.4408105E13)
            r5 = r5 | r4
            int r5 = ~r5
            r8 = 737809540(0x2bfa1484, float:1.7769263E-12)
            r8 = r8 | r6
            r9 = 1878996188(0x6fff34dc, float:1.5796516E29)
            r6 = r6 | r9
            int r6 = ~r6
            r5 = r5 | r6
            int r5 = r5 * 904
            int r7 = r7 + r5
            r5 = -1841246425(0xffffffff9240cf27, float:-6.0839852E-28)
            r4 = r4 | r5
            int r4 = ~r4
            r5 = 37749764(0x2400404, float:1.4107085E-37)
            r4 = r4 | r5
            int r5 = ~r8
            r4 = r4 | r5
            int r4 = r4 * 904
            int r7 = r7 + r4
            if (r2 != r7) goto Lbf
            super.onResume()
            int r10 = com.bpjstku.presentation.queueing.BookingAntreanFormActivity.getNotifyChildrenChangedOptions
            int r10 = r10 + 75
            int r2 = r10 % 128
            com.bpjstku.presentation.queueing.BookingAntreanFormActivity.getItem = r2
            int r10 = r10 % r1
            if (r10 == 0) goto Lbe
            r10 = 84
            int r10 = r10 / r0
        Lbe:
            return r3
        Lbf:
            throw r3
        Lc0:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r0 = "-247702130"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.BookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a5, code lost:
    
        if (r0 != (((645208060 + (((~(1986062070 | r2)) | 1705985) * 104)) + ((~((~r2) | (-1717617317))) * (-104))) + ((r2 | 270150739) * 104))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a7, code lost:
    
        super.onStart();
        r8 = com.bpjstku.presentation.queueing.BookingAntreanFormActivity.getNotifyChildrenChangedOptions + 79;
        com.bpjstku.presentation.queueing.BookingAntreanFormActivity.getItem = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b3, code lost:
    
        if ((r8 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b5, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b7, code lost:
    
        r8 = (-1724949534) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c0, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c8, code lost:
    
        throw new java.lang.RuntimeException("-2101357162");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (r2 == (((550387624 + (((~((-158502435) | r4)) | 17860098) * 1504)) + ((~(r4 | (-140642337))) * (-1504))) + 1822808512)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0075, code lost:
    
        if (r2 == (((999030480 + (((~((-630957017) | r4)) | 1460944559) * (-933))) + (((~(r4 | 1460944559)) | (-2006958080)) * 933)) - 386229725)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
    
        r0 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = (int) android.os.Process.getStartElapsedRealtime();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Object[] r8) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.BookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Object[]):java.lang.Object");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = getItem + 69;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (-1074585944) + (((~((-810760452) | iIdentityHashCode)) | 269494273 | (~(1640747994 | iIdentityHashCode))) * (-880));
            int i5 = (~((-810760452) | (~iIdentityHashCode))) | (-1640747995);
            int i6 = ~(iIdentityHashCode | 810760451);
            if (i3 != i4 + ((i5 | i6) * (-880)) + (i6 * 880)) {
                throw null;
            }
        } else {
            int i7 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i9 = ~i8;
            if (i7 != 2142254032 + (((-1073758500) | i9) * (-369)) + (((~((-1050654429) | i9)) | (-1880641972)) * (-369)) + (((~(i8 | 1050654428)) | (-2124412928) | (~(i9 | (-806883473)))) * 369)) {
                throw null;
            }
        }
        int i10 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        if (i10 != 444474800 + (((-268511249) | iUptimeMillis) * (-627)) + (((~((-1739986924) | iUptimeMillis)) | 839069041) * (-627)) + (((~(iUptimeMillis | 839069041)) | (~((~iUptimeMillis) | 1739986923))) * 627)) {
            int i11 = (-1763312318) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i12 = getNotifyChildrenChangedOptions + 89;
        getItem = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 82 / 0;
        }
    }

    public static /* synthetic */ void b(BookingAntreanFormActivity bookingAntreanFormActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        if (i >= 0 && i < bookingAntreanFormActivity.b.size()) {
            NearestOfficeItem nearestOfficeItem = bookingAntreanFormActivity.b.get(i);
            bookingAntreanFormActivity.d = nearestOfficeItem;
            bookingAntreanFormActivity.a = null;
            bookingAntreanFormActivity.asInterface = null;
            TextView textView = ((ActivityBookingAntreanFormBinding) ((ViewBinding) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).actvKantorCabang;
            String namaKantor = nearestOfficeItem.getNamaKantor();
            if (namaKantor == null) {
                int i3 = getItem + 87;
                getNotifyChildrenChangedOptions = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 98 / 0;
                }
                namaKantor = "";
            }
            textView.setText(String.valueOf(namaKantor));
            TextView textView2 = ((ActivityBookingAntreanFormBinding) ((ViewBinding) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvAlamatKantor;
            String alamat = nearestOfficeItem.getAlamat();
            if (alamat == null) {
                alamat = "";
            }
            textView2.setText(alamat);
            ((ActivityBookingAntreanFormBinding) ((ViewBinding) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvAlamatKantor.setVisibility(0);
            ((ActivityBookingAntreanFormBinding) ((ViewBinding) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).actvTanggal.setText("");
            ((ActivityBookingAntreanFormBinding) ((ViewBinding) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).actvTanggal.setHint(bookingAntreanFormActivity.getString(R.string.hint_pilih_tanggal));
            ((ActivityBookingAntreanFormBinding) ((ViewBinding) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).actvJam.setText("");
            ((ActivityBookingAntreanFormBinding) ((ViewBinding) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).actvJam.setHint(bookingAntreanFormActivity.getString(R.string.label_jam_default));
            bookingAntreanFormActivity.onTransact();
            String kodeKantor = nearestOfficeItem.getKodeKantor();
            if (kodeKantor != null) {
                int i5 = getItem + 119;
                getNotifyChildrenChangedOptions = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr = {(getStreamUseCaseSupportedCombinationList) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue(), kodeKantor};
                    getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -179444067, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 179444068, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr);
                    int i6 = 20 / 0;
                } else {
                    Object[] objArr2 = {(getStreamUseCaseSupportedCombinationList) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue(), kodeKantor};
                    getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -179444067, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 179444068, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr2);
                }
                int i7 = getNotifyChildrenChangedOptions + 101;
                getItem = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        dialogInterface.dismiss();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(final BookingAntreanFormActivity bookingAntreanFormActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (!bookingAntreanFormActivity.b.isEmpty()) {
            new AlertDialog.Builder(bookingAntreanFormActivity).setTitle("Pilih Kantor Cabang").setAdapter(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(bookingAntreanFormActivity, bookingAntreanFormActivity.b), new DialogInterface.OnClickListener() { // from class: getDefaultFocalLength
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    BookingAntreanFormActivity.b(this.TuitionPaymentFragmentbindingInflater1, dialogInterface, i2);
                }
            }).setNegativeButton("Batal", (DialogInterface.OnClickListener) null).show();
            int i2 = getNotifyChildrenChangedOptions + 61;
            getItem = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = getItem + 37;
            getNotifyChildrenChangedOptions = i4 % 128;
            if (i4 % 2 == 0) {
                Toast.makeText(bookingAntreanFormActivity, "Daftar kantor cabang belum tersedia", 0).show();
            } else {
                Toast.makeText(bookingAntreanFormActivity, "Daftar kantor cabang belum tersedia", 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        BookingAntreanFormActivity bookingAntreanFormActivity = (BookingAntreanFormActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = getItem + 15;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bookingAntreanFormActivity, null, false, 6);
            bookingAntreanFormActivity.finishAffinity();
            ViewPortBuilder.b();
            int i4 = getItem + 111;
            getNotifyChildrenChangedOptions = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 78 / 0;
            }
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(BookingAntreanFormActivity bookingAntreanFormActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions;
        int i3 = i2 + 9;
        int i4 = i3 % 128;
        getItem = i4;
        int i5 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i6 = i4 + 39;
            getNotifyChildrenChangedOptions = i6 % 128;
            int i7 = i6 % 2;
            bookingAntreanFormActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            bookingAntreanFormActivity.IconCompatParcelizer();
            List<QuotaBookingItem> data = ((QuotaBookingResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
            if (data == null) {
                int i8 = getItem + 87;
                getNotifyChildrenChangedOptions = i8 % 128;
                int i9 = i8 % 2;
                data = CollectionsKt.emptyList();
            }
            bookingAntreanFormActivity.asBinder = data;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i10 = i2 + 15;
            getItem = i10 % 128;
            int i11 = i10 % 2;
            bookingAntreanFormActivity.IconCompatParcelizer();
            BookingAntreanFormActivity bookingAntreanFormActivity2 = bookingAntreanFormActivity;
            String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str == null) {
                int i12 = getItem;
                int i13 = i12 + 101;
                getNotifyChildrenChangedOptions = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
                int i14 = i12 + 27;
                getNotifyChildrenChangedOptions = i14 % 128;
                int i15 = i14 % 2;
                str = "";
            }
            Toast.makeText(bookingAntreanFormActivity2, str, 0).show();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(final BookingAntreanFormActivity bookingAntreanFormActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (bookingAntreanFormActivity.d == null) {
            Toast.makeText(bookingAntreanFormActivity, "Pilih kantor cabang terlebih dahulu", 0).show();
        } else if (bookingAntreanFormActivity.asBinder.isEmpty()) {
            int i2 = getNotifyChildrenChangedOptions + 63;
            getItem = i2 % 128;
            int i3 = i2 % 2;
            Toast.makeText(bookingAntreanFormActivity, "Kuota tanggal belum tersedia", 0).show();
        } else {
            List<QuotaBookingItem> list = bookingAntreanFormActivity.asBinder;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (QuotaBookingItem quotaBookingItem : list) {
                String tglBooking = quotaBookingItem.getTglBooking();
                if (tglBooking == null) {
                    int i4 = getNotifyChildrenChangedOptions + 117;
                    getItem = i4 % 128;
                    int i5 = i4 % 2;
                    tglBooking = "";
                }
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(tglBooking);
                String totalKuotaSisa = quotaBookingItem.getTotalKuotaSisa();
                if (totalKuotaSisa == null) {
                    int i6 = getNotifyChildrenChangedOptions + 39;
                    getItem = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                    totalKuotaSisa = "";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sb.append(" (Sisa ");
                sb.append(totalKuotaSisa);
                sb.append(" Antrean)");
                arrayList.add(sb.toString());
            }
            new AlertDialog.Builder(bookingAntreanFormActivity).setTitle("Pilih Tanggal Kedatangan").setItems((String[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: FovUtil
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    BookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, dialogInterface, i7);
                }
            }).setNegativeButton("Batal", (DialogInterface.OnClickListener) null).show();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(BookingAntreanFormActivity bookingAntreanFormActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = getNotifyChildrenChangedOptions + 25;
        int i4 = i3 % 128;
        getItem = i4;
        int i5 = i3 % 2;
        if (i >= 0) {
            int i6 = i4 + 123;
            getNotifyChildrenChangedOptions = i6 % 128;
            if (i6 % 2 == 0) {
                bookingAntreanFormActivity.asBinder.size();
                throw null;
            }
            if (i < bookingAntreanFormActivity.asBinder.size()) {
                QuotaBookingItem quotaBookingItem = bookingAntreanFormActivity.asBinder.get(i);
                bookingAntreanFormActivity.a = quotaBookingItem;
                bookingAntreanFormActivity.asInterface = null;
                String tglBooking = quotaBookingItem.getTglBooking();
                if (tglBooking == null) {
                    tglBooking = "";
                }
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(tglBooking);
                TextView textView = ((ActivityBookingAntreanFormBinding) ((ViewBinding) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).actvTanggal;
                String totalKuotaSisa = quotaBookingItem.getTotalKuotaSisa();
                if (totalKuotaSisa == null) {
                    int i7 = getItem + 89;
                    getNotifyChildrenChangedOptions = i7 % 128;
                    int i8 = i7 % 2;
                    totalKuotaSisa = "";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sb.append(" (Sisa ");
                sb.append(totalKuotaSisa);
                sb.append(" Antrean)");
                textView.setText(sb.toString());
                ((ActivityBookingAntreanFormBinding) ((ViewBinding) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).actvJam.setText("");
                ((ActivityBookingAntreanFormBinding) ((ViewBinding) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).actvJam.setHint(bookingAntreanFormActivity.getString(R.string.label_jam_default));
                bookingAntreanFormActivity.onTransact();
            }
        }
        dialogInterface.dismiss();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d5 A[PHI: r2
  0x00d5: PHI (r2v25 java.lang.String) = (r2v24 java.lang.String), (r2v28 java.lang.String) binds: [B:48:0x00d3, B:45:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x0119  */
    /* JADX WARN: Code duplicated, block: B:76:0x0138  */
    /* JADX WARN: Code duplicated, block: B:87:0x0164  */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(BookingAntreanFormActivity bookingAntreanFormActivity, View view) {
        DetailKuotaItem detailKuotaItem;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        NearestOfficeItem nearestOfficeItem = bookingAntreanFormActivity.d;
        if (nearestOfficeItem != null) {
            int i3 = getItem + 123;
            getNotifyChildrenChangedOptions = i3 % 128;
            if (i3 % 2 == 0) {
                QuotaBookingItem quotaBookingItem = bookingAntreanFormActivity.a;
                throw null;
            }
            QuotaBookingItem quotaBookingItem2 = bookingAntreanFormActivity.a;
            if (quotaBookingItem2 != null && (detailKuotaItem = bookingAntreanFormActivity.asInterface) != null) {
                User userTuitionPaymentFragmentbindingInflater1 = ((getStreamUseCaseSupportedCombinationList) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1();
                BookingAntreanConfirmationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = BookingAntreanConfirmationActivity.INSTANCE;
                BookingAntreanFormActivity bookingAntreanFormActivity2 = bookingAntreanFormActivity;
                String string = ((ActivityBookingAntreanFormBinding) ((ViewBinding) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).etKategori.getText().toString();
                String string2 = ((ActivityBookingAntreanFormBinding) ((ViewBinding) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).etTopik.getText().toString();
                String namaKantor = nearestOfficeItem.getNamaKantor();
                if (namaKantor == null) {
                    int i4 = getItem + 43;
                    getNotifyChildrenChangedOptions = i4 % 128;
                    int i5 = i4 % 2;
                    str = "";
                } else {
                    str = namaKantor;
                }
                String alamat = nearestOfficeItem.getAlamat();
                if (alamat == null) {
                    int i6 = getItem + 17;
                    getNotifyChildrenChangedOptions = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    str2 = "";
                } else {
                    str2 = alamat;
                }
                String kodeKantor = nearestOfficeItem.getKodeKantor();
                String str8 = kodeKantor == null ? "" : kodeKantor;
                String tglBooking = quotaBookingItem2.getTglBooking();
                if (tglBooking == null) {
                    tglBooking = "";
                }
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(tglBooking);
                String tglBooking2 = quotaBookingItem2.getTglBooking();
                String str9 = tglBooking2 == null ? "" : tglBooking2;
                String shift = detailKuotaItem.getShift();
                String str10 = shift == null ? "" : shift;
                String ketWaktu = detailKuotaItem.getKetWaktu();
                String str11 = ketWaktu == null ? "" : ketWaktu;
                if (userTuitionPaymentFragmentbindingInflater1 != null) {
                    int i7 = getItem + 91;
                    getNotifyChildrenChangedOptions = i7 % 128;
                    if (i7 % 2 == 0) {
                        str3 = userTuitionPaymentFragmentbindingInflater1.b;
                        int i8 = 80 / 0;
                        if (str3 != null) {
                            i = getItem + 39;
                            getNotifyChildrenChangedOptions = i % 128;
                            if (i % 2 == 0) {
                                int i9 = 98 / 0;
                                if (str3.length() <= 0) {
                                    str3 = null;
                                }
                            } else if (str3.length() <= 0) {
                                str3 = null;
                            }
                            if (str3 == null) {
                            }
                        }
                    } else {
                        str3 = userTuitionPaymentFragmentbindingInflater1.b;
                        if (str3 != null) {
                            i = getItem + 39;
                            getNotifyChildrenChangedOptions = i % 128;
                            if (i % 2 == 0) {
                                int i10 = 98 / 0;
                                if (str3.length() <= 0) {
                                    str3 = null;
                                }
                            } else if (str3.length() <= 0) {
                                str3 = null;
                            }
                            if (str3 == null) {
                            }
                        }
                    }
                    str3 = bookingAntreanFormActivity.INotificationSideChannel;
                } else {
                    str3 = bookingAntreanFormActivity.INotificationSideChannel;
                }
                String str12 = str3;
                if (userTuitionPaymentFragmentbindingInflater1 != null) {
                    int i11 = getNotifyChildrenChangedOptions + 83;
                    getItem = i11 % 128;
                    int i12 = i11 % 2;
                    str4 = userTuitionPaymentFragmentbindingInflater1.cancelAll;
                    if (str4 == null) {
                        str4 = bookingAntreanFormActivity.onTransact;
                    } else {
                        if (str4.length() <= 0) {
                            str4 = null;
                        }
                        if (str4 == null) {
                            str4 = bookingAntreanFormActivity.onTransact;
                        }
                    }
                } else {
                    str4 = bookingAntreanFormActivity.onTransact;
                }
                String str13 = str4;
                if (userTuitionPaymentFragmentbindingInflater1 == null || (str5 = userTuitionPaymentFragmentbindingInflater1.asInterface) == null) {
                    str5 = bookingAntreanFormActivity.cancel;
                    int i13 = getItem + 53;
                    getNotifyChildrenChangedOptions = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    if (str5.length() <= 0) {
                        int i15 = getNotifyChildrenChangedOptions + 73;
                        getItem = i15 % 128;
                        int i16 = i15 % 2;
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = bookingAntreanFormActivity.cancel;
                        int i17 = getItem + 53;
                        getNotifyChildrenChangedOptions = i17 % 128;
                        int i18 = i17 % 2;
                    }
                }
                String str14 = str5;
                if (userTuitionPaymentFragmentbindingInflater1 == null || (str7 = userTuitionPaymentFragmentbindingInflater1.asBinder) == null) {
                    str6 = bookingAntreanFormActivity.notify;
                } else {
                    int i19 = getItem + 87;
                    getNotifyChildrenChangedOptions = i19 % 128;
                    int i20 = i19 % 2;
                    String str15 = str7.length() > 0 ? str7 : null;
                    if (str15 == null) {
                        str6 = bookingAntreanFormActivity.notify;
                    } else {
                        str6 = str15;
                    }
                }
                BookingAntreanConfirmationActivity.Companion.TuitionPaymentFragmentbindingInflater1(bookingAntreanFormActivity2, string, string2, str, str2, str8, strTuitionPaymentFragmentspecialinlinedviewModeldefault1, str9, str10, str11, str12, str13, str14, str6, bookingAntreanFormActivity.RemoteActionCompatParcelizer, bookingAntreanFormActivity.write, bookingAntreanFormActivity.getInterfaceDescriptor, bookingAntreanFormActivity.INotificationSideChannelStub, bookingAntreanFormActivity.INotificationSideChannelDefault);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(final BookingAntreanFormActivity bookingAntreanFormActivity, View view) {
        String alamat;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        QuotaBookingItem quotaBookingItem = bookingAntreanFormActivity.a;
        if (quotaBookingItem == null) {
            int i2 = getItem + 71;
            getNotifyChildrenChangedOptions = i2 % 128;
            int i3 = i2 % 2;
            Toast.makeText(bookingAntreanFormActivity, "Pilih tanggal kedatangan terlebih dahulu", 0).show();
        } else {
            final List<DetailKuotaItem> detailKuota = quotaBookingItem != null ? quotaBookingItem.getDetailKuota() : null;
            if (detailKuota == null) {
                int i4 = getNotifyChildrenChangedOptions + 67;
                getItem = i4 % 128;
                int i5 = i4 % 2;
                detailKuota = CollectionsKt.emptyList();
            }
            if (detailKuota.isEmpty()) {
                Toast.makeText(bookingAntreanFormActivity, "Jam kedatangan belum tersedia", 0).show();
            } else {
                List<DetailKuotaItem> list = detailKuota;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (DetailKuotaItem detailKuotaItem : list) {
                    int i6 = getItem + 115;
                    getNotifyChildrenChangedOptions = i6 % 128;
                    int i7 = i6 % 2;
                    String ketWaktu = detailKuotaItem.getKetWaktu();
                    if (ketWaktu == null) {
                        ketWaktu = "";
                    }
                    String kuota = detailKuotaItem.getKuota();
                    if (kuota != null) {
                        int i8 = getNotifyChildrenChangedOptions + 95;
                        getItem = i8 % 128;
                        int i9 = i8 % 2;
                    } else {
                        kuota = "";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(ketWaktu);
                    sb.append(" (Kuota: ");
                    sb.append(kuota);
                    sb.append(")");
                    arrayList.add(sb.toString());
                    int i10 = getNotifyChildrenChangedOptions + 91;
                    getItem = i10 % 128;
                    int i11 = i10 % 2;
                }
                final String[] strArr = (String[]) arrayList.toArray(new String[0]);
                BookingAntreanFormActivity bookingAntreanFormActivity2 = bookingAntreanFormActivity;
                LinearLayout linearLayout = new LinearLayout(bookingAntreanFormActivity2);
                linearLayout.setOrientation(1);
                linearLayout.setPadding(60, 30, 60, 30);
                TextView textView = new TextView(bookingAntreanFormActivity2);
                NearestOfficeItem nearestOfficeItem = bookingAntreanFormActivity.d;
                String namaKantor = nearestOfficeItem != null ? nearestOfficeItem.getNamaKantor() : null;
                if (namaKantor == null) {
                    namaKantor = "";
                }
                textView.setText(namaKantor);
                textView.setTextSize(16.0f);
                textView.setTextColor(Color.parseColor("#212121"));
                textView.setTypeface(null, 1);
                linearLayout.addView(textView);
                TextView textView2 = new TextView(bookingAntreanFormActivity2);
                NearestOfficeItem nearestOfficeItem2 = bookingAntreanFormActivity.d;
                if (nearestOfficeItem2 != null) {
                    alamat = nearestOfficeItem2.getAlamat();
                    int i12 = getNotifyChildrenChangedOptions + 115;
                    getItem = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    alamat = null;
                }
                textView2.setText(alamat != null ? alamat : "");
                textView2.setTextSize(12.0f);
                textView2.setTextColor(Color.parseColor("#757575"));
                textView2.setPadding(0, 8, 0, 0);
                linearLayout.addView(textView2);
                new AlertDialog.Builder(bookingAntreanFormActivity2).setTitle("Pilih Jam Kedatangan").setItems(strArr, new DialogInterface.OnClickListener() { // from class: focalLengthToViewAngleDegrees
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i14) {
                        Object[] objArr = {detailKuota, bookingAntreanFormActivity, strArr, dialogInterface, Integer.valueOf(i14)};
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        BookingAntreanFormActivity.TuitionPaymentFragmentbindingInflater1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, -1195895534, 1195895537, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }).setNegativeButton("Batal", (DialogInterface.OnClickListener) null).show();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(BookingAntreanFormActivity bookingAntreanFormActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        List<NearestOfficeItem> data;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            bookingAntreanFormActivity.MediaBrowserCompat();
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i2 = getNotifyChildrenChangedOptions + 97;
                getItem = i2 % 128;
                if (i2 % 2 != 0) {
                    bookingAntreanFormActivity.IconCompatParcelizer();
                    data = ((NearestOfficeResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
                    int i3 = 76 / 0;
                    if (data == null) {
                        data = CollectionsKt.emptyList();
                    }
                } else {
                    bookingAntreanFormActivity.IconCompatParcelizer();
                    data = ((NearestOfficeResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
                    if (data == null) {
                        data = CollectionsKt.emptyList();
                    }
                }
                bookingAntreanFormActivity.b = data;
                List<NearestOfficeItem> list = data;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (!(!it.hasNext())) {
                    String namaKantor = ((NearestOfficeItem) it.next()).getNamaKantor();
                    if (namaKantor == null) {
                        namaKantor = "";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(namaKantor);
                    sb.append(" ");
                    arrayList.add(sb.toString());
                }
                bookingAntreanFormActivity.g = arrayList;
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i4 = getNotifyChildrenChangedOptions + 21;
                getItem = i4 % 128;
                int i5 = i4 % 2;
                bookingAntreanFormActivity.IconCompatParcelizer();
                BookingAntreanFormActivity bookingAntreanFormActivity2 = bookingAntreanFormActivity;
                String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Toast.makeText(bookingAntreanFormActivity2, str != null ? str : "", 0).show();
                int i6 = getItem + 99;
                getNotifyChildrenChangedOptions = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        List list = (List) objArr[0];
        BookingAntreanFormActivity bookingAntreanFormActivity = (BookingAntreanFormActivity) objArr[1];
        String[] strArr = (String[]) objArr[2];
        DialogInterface dialogInterface = (DialogInterface) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        if (iIntValue >= 0) {
            int i2 = getItem + 121;
            getNotifyChildrenChangedOptions = i2 % 128;
            if (i2 % 2 == 0) {
                list.size();
                throw null;
            }
            if (iIntValue < list.size()) {
                bookingAntreanFormActivity.asInterface = (DetailKuotaItem) list.get(iIntValue);
                ((ActivityBookingAntreanFormBinding) ((ViewBinding) bookingAntreanFormActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).actvJam.setText(strArr[iIntValue]);
                bookingAntreanFormActivity.onTransact();
            }
        }
        dialogInterface.dismiss();
        int i3 = getItem + 69;
        getNotifyChildrenChangedOptions = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(BookingAntreanFormActivity bookingAntreanFormActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentbindingInflater1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{bookingAntreanFormActivity, view}, 1864313900, -1864313898, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list, BookingAntreanFormActivity bookingAntreanFormActivity, String[] strArr, DialogInterface dialogInterface, int i) {
        Object[] objArr = {list, bookingAntreanFormActivity, strArr, dialogInterface, Integer.valueOf(i)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentbindingInflater1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr, -1195895534, 1195895537, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static {
        disconnect = 0;
        g();
        INSTANCE = new Companion(null);
        int i = getRoot + 33;
        disconnect = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzbb.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzbb.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, -264942095, 264942099, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).intValue();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        int length = 1812271254 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step2).substring(1, 2).length();
        int iCodePointAt = 942904689 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentbindingInflater1(zzbb.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iCodePointAt, new Object[]{this}, 749581148, -749581148, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, length);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzbb.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = 481622086 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentbindingInflater1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), i, new Object[]{this}, -1046659446, 1046659447, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = getItem + 113;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        read = -6377398940819159759L;
        write = -981105359;
        connect = (char) 6863;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, byte r6, byte r7) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r5 = r5 * 2
            int r0 = 1 - r5
            int r6 = r6 + 102
            byte[] r1 = com.bpjstku.presentation.queueing.BookingAntreanFormActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r7]
        L26:
            int r7 = r7 + 1
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.BookingAntreanFormActivity.$$i(int, byte, byte):java.lang.String");
    }
}
