package com.bpjstku.presentation.queueing;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.data.queueing.model.request.InsertAntrianRequest;
import com.bpjstku.data.queueing.model.response.AntrianData;
import com.bpjstku.data.queueing.model.response.GetDataAntrianResponse;
import com.bpjstku.data.queueing.model.response.InsertAntrianData;
import com.bpjstku.data.queueing.model.response.InsertAntrianResponse;
import com.bpjstku.databinding.ActivityBookingAntreanConfirmationBinding;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity;
import com.bpjstku.presentation.queueing.BookingAntreanConfirmationActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_vision_common.zzhe;
import com.google.android.material.button.MaterialButton;
import defpackage.BufferProviderState;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionProcessor;
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
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u0015\u0010\u000e\u001a\u00020\u000b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\b\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0016\u0010\n\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0016\u0010\t\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0016\u0010\u001a\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u0016\u0010\u0018\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0016\u0010\u001b\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u0016\u0010\u001f\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\"R\u001a\u0010&\u001a\u00020#8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b\u000e\u0010%"}, d2 = {"Lcom/bpjstku/presentation/queueing/BookingAntreanConfirmationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityBookingAntreanConfirmationBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "LgetStreamUseCaseSupportedCombinationList;", "MediaBrowserCompat", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "INotificationSideChannelStub", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "onTransact", "g", "getInterfaceDescriptor", "INotificationSideChannel", "IconCompatParcelizer", "notify", "cancel", "INotificationSideChannelDefault", "cancelAll", "RemoteActionCompatParcelizer", "INotificationSideChannelStubProxy", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "I", "()I", "write"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BookingAntreanConfirmationActivity extends BindingBaseActivity<ActivityBookingAntreanConfirmationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long connect;
    private static int getRoot;
    private static int read;
    private static char write;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {5, 11, -122, -94};
    private static final int $$f = 132;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {7, 15, 25, 25, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 251;
    private static int getNotifyChildrenChangedOptions = 0;
    private static int getItem = 0;
    private static int disconnect = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1 = "";

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String b = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";
    private String d = "";

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private String g = "";

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private String a = "";

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private String asBinder = "";

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String asInterface = "";

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private String onTransact = "";

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private String notify = "";

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private String INotificationSideChannel = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String cancel = "";

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String cancelAll = "";

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String getInterfaceDescriptor = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String INotificationSideChannelDefault = "";

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String INotificationSideChannelStub = "";

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String INotificationSideChannelStubProxy = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int write = R.layout.activity_booking_antrean_confirmation;

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c1, code lost:
    
        if (r13 == ((((-1075032728) + (((-288932901) | r1) * (-220))) + ((r1 | 1115757275) * 220)) + 450851776)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f2, code lost:
    
        if (((java.lang.reflect.Field) defpackage.cacheInteropConfig.b[0]).getInt(null) == (((1211686772 + ((~(1409261551 | r7)) * 623)) + ((393348 | r2) * (-623))) + ((((~(1119821221 | r7)) | (-1409261552)) | (~(289833678 | r7))) * 623))) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f4, code lost:
    
        r11 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r1 = ~((-871346528) | r2);
        r3 = ~((-1707709438) | r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0124, code lost:
    
        if (r11 == (((1385593784 + ((r1 | r3) * 1150)) + (((~(1707709437 | r2)) | r3) * (-575))) + (((~(r7 | (-871346528))) | (~(871346527 | r2))) * 575))) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0126, code lost:
    
        r7 = new int[1179940327];
        r7[1179940326(0x465475e6, float:13597.475)] = 1;
        r11 = (-1550810998) % 2;
        android.widget.Toast.makeText((android.content.Context) null, r7[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x013e, code lost:
    
        super.onCreate(r10);
        r7 = com.bpjstku.presentation.queueing.BookingAntreanConfirmationActivity.getItem + 107;
        com.bpjstku.presentation.queueing.BookingAntreanConfirmationActivity.disconnect = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x014b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x014c, code lost:
    
        r7 = 1139279188 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0155, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int r7, int r8, int r9, java.lang.Object[] r10, int r11, int r12, int r13) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.BookingAntreanConfirmationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(int, int, int, java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 1
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = com.bpjstku.presentation.queueing.BookingAntreanConfirmationActivity.$$a
            int r7 = 197 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.BookingAntreanConfirmationActivity.c(byte, int, short, java.lang.Object[]):void");
    }

    public BookingAntreanConfirmationActivity() {
        final BookingAntreanConfirmationActivity bookingAntreanConfirmationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.queueing.BookingAntreanConfirmationActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = bookingAntreanConfirmationActivity;
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.queueing.BookingAntreanConfirmationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¥\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/bpjstku/presentation/queueing/BookingAntreanConfirmationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18) {
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
            Intrinsics.checkNotNullParameter(p17, "");
            Intrinsics.checkNotNullParameter(p18, "");
            Intent intent = new Intent(p0, (Class<?>) BookingAntreanConfirmationActivity.class);
            intent.putExtra("extra_kategori", p1);
            intent.putExtra("extra_topik", p2);
            intent.putExtra("extra_kantor_cabang", p3);
            intent.putExtra("extra_alamat_kantor", p4);
            intent.putExtra("extra_kode_kantor", p5);
            intent.putExtra("extra_tanggal_display", p6);
            intent.putExtra("extra_tgl_booking", p7);
            intent.putExtra("extra_shift", p8);
            intent.putExtra("extra_waktu", p9);
            intent.putExtra("extra_nik", p10);
            intent.putExtra("extra_tempat_lahir", p11);
            intent.putExtra("extra_tgl_lahir", p12);
            intent.putExtra("extra_alamat_user", p13);
            intent.putExtra("extra_latitude", p14);
            intent.putExtra("extra_longitude", p15);
            intent.putExtra("extra_activity", p16);
            intent.putExtra("extra_segment", p17);
            intent.putExtra("extra_transaction_id", p18);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityBookingAntreanConfirmationBinding> TuitionPaymentFragmentbindingInflater1() {
        BookingAntreanConfirmationActivity$bindingInflater$1 bookingAntreanConfirmationActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = getItem + 85;
        disconnect = i2 % 128;
        if (i2 % 2 == 0) {
            bookingAntreanConfirmationActivity$bindingInflater$1 = BookingAntreanConfirmationActivity$bindingInflater$1.b;
            int i3 = 17 / 0;
        } else {
            bookingAntreanConfirmationActivity$bindingInflater$1 = BookingAntreanConfirmationActivity$bindingInflater$1.b;
        }
        int i4 = disconnect + 19;
        getItem = i4 % 128;
        int i5 = i4 % 2;
        return bookingAntreanConfirmationActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = disconnect + 35;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.write;
        if (i3 != 0) {
            int i5 = 67 / 0;
        }
        return i4;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
            int i5 = $10 + 123;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (KeyEvent.getMaxKeyCode() >> 16)), 1235 - ExpandableListView.getPackedPositionType(0L), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35, -653973969, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myTid() >> 22), 2764 - ExpandableListView.getPackedPositionGroup(0L), 14 - Drawable.resolveOpacity(0, 0), 1504416861, false, $$i(b4, b5, (byte) (b5 + 3)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - TextUtils.indexOf("", "")), MotionEvent.axisFromString("") + 254, 22 - KeyEvent.normalizeMetaState(0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char maxKeyCode = (char) (65200 - (KeyEvent.getMaxKeyCode() >> 16));
                            int i7 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2892;
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 17;
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 - 1);
                            String str$$i = $$i(b6, b7, (byte) (-b7));
                            i2 = 2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, i7, iCombineMeasuredStates, 2012627446, false, str$$i, new Class[]{Integer.TYPE, Integer.TYPE});
                        } else {
                            i2 = 2;
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (connect ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) read) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) write) ^ (-6377398940819159759L)))));
                        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                        int i8 = $10 + 67;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        i3 = i2;
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
        }
        objArr[0] = new String(cArr6);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("extra_kategori");
            String str = "";
            if (stringExtra == null) {
                int i2 = getItem + 29;
                disconnect = i2 % 128;
                int i3 = i2 % 2;
                stringExtra = "";
            }
            this.TuitionPaymentFragmentbindingInflater1 = stringExtra;
            String stringExtra2 = intent.getStringExtra("extra_topik");
            if (stringExtra2 == null) {
                int i4 = disconnect + 13;
                getItem = i4 % 128;
                int i5 = i4 % 2;
                stringExtra2 = "";
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stringExtra2;
            String stringExtra3 = intent.getStringExtra("extra_kantor_cabang");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            this.b = stringExtra3;
            String stringExtra4 = intent.getStringExtra("extra_alamat_kantor");
            Object obj = null;
            if (stringExtra4 == null) {
                int i6 = getItem + 49;
                disconnect = i6 % 128;
                if (i6 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                stringExtra4 = "";
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stringExtra4;
            String stringExtra5 = intent.getStringExtra("extra_kode_kantor");
            if (stringExtra5 == null) {
                int i7 = getItem + 29;
                disconnect = i7 % 128;
                int i8 = i7 % 2;
                stringExtra5 = "";
            }
            this.d = stringExtra5;
            String stringExtra6 = intent.getStringExtra("extra_tanggal_display");
            if (stringExtra6 == null) {
                int i9 = disconnect + 69;
                getItem = i9 % 128;
                int i10 = i9 % 2;
                stringExtra6 = "";
            }
            this.g = stringExtra6;
            String stringExtra7 = intent.getStringExtra("extra_tgl_booking");
            if (stringExtra7 == null) {
                stringExtra7 = "";
            }
            this.a = stringExtra7;
            String stringExtra8 = intent.getStringExtra("extra_shift");
            if (stringExtra8 == null) {
                int i11 = getItem + 73;
                disconnect = i11 % 128;
                int i12 = i11 % 2;
                stringExtra8 = "";
            }
            this.asBinder = stringExtra8;
            String stringExtra9 = intent.getStringExtra("extra_waktu");
            if (stringExtra9 == null) {
                int i13 = disconnect + 27;
                getItem = i13 % 128;
                int i14 = i13 % 2;
                stringExtra9 = "";
            }
            this.asInterface = stringExtra9;
            String stringExtra10 = intent.getStringExtra("extra_nik");
            if (stringExtra10 == null) {
                stringExtra10 = "";
            }
            this.onTransact = stringExtra10;
            String stringExtra11 = intent.getStringExtra("extra_tempat_lahir");
            if (stringExtra11 == null) {
                stringExtra11 = "";
            }
            this.notify = stringExtra11;
            String stringExtra12 = intent.getStringExtra("extra_tgl_lahir");
            if (stringExtra12 == null) {
                stringExtra12 = "";
            }
            this.INotificationSideChannel = stringExtra12;
            String stringExtra13 = intent.getStringExtra("extra_alamat_user");
            if (stringExtra13 == null) {
                stringExtra13 = "";
            }
            this.cancel = stringExtra13;
            String stringExtra14 = intent.getStringExtra("extra_latitude");
            if (stringExtra14 == null) {
                stringExtra14 = "";
            }
            this.cancelAll = stringExtra14;
            String stringExtra15 = intent.getStringExtra("extra_longitude");
            if (stringExtra15 == null) {
                int i15 = getItem + 93;
                disconnect = i15 % 128;
                if (i15 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                stringExtra15 = "";
            }
            this.getInterfaceDescriptor = stringExtra15;
            String stringExtra16 = intent.getStringExtra("extra_activity");
            if (stringExtra16 == null) {
                stringExtra16 = "";
            }
            this.INotificationSideChannelDefault = stringExtra16;
            String stringExtra17 = intent.getStringExtra("extra_segment");
            if (stringExtra17 == null) {
                stringExtra17 = "";
            }
            this.INotificationSideChannelStub = stringExtra17;
            String stringExtra18 = intent.getStringExtra("extra_transaction_id");
            if (stringExtra18 == null) {
                int i16 = disconnect + 91;
                getItem = i16 % 128;
                int i17 = i16 % 2;
            } else {
                str = stringExtra18;
            }
            this.INotificationSideChannelStubProxy = str;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        ActivityBookingAntreanConfirmationBinding activityBookingAntreanConfirmationBinding = (ActivityBookingAntreanConfirmationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        ImageView imageView = activityBookingAntreanConfirmationBinding.ivBack;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: FocusMeteringControlExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BookingAntreanConfirmationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        activityBookingAntreanConfirmationBinding.tvConfirmValueTopik.setText(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        activityBookingAntreanConfirmationBinding.tvConfirmValueKantorCabang.setText(this.b);
        activityBookingAntreanConfirmationBinding.tvConfirmValueTanggal.setText(this.g);
        activityBookingAntreanConfirmationBinding.tvConfirmValueJam.setText(this.asInterface);
        int i2 = getItem + 121;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityBookingAntreanConfirmationBinding activityBookingAntreanConfirmationBinding = (ActivityBookingAntreanConfirmationBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityBookingAntreanConfirmationBinding.cbPersetujuan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: FocusMeteringControlExternalSyntheticLambda4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BookingAntreanConfirmationActivity.TuitionPaymentFragmentbindingInflater1(activityBookingAntreanConfirmationBinding, compoundButton, z);
            }
        });
        MaterialButton materialButton = activityBookingAntreanConfirmationBinding.btnSubmit;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: FocusMeteringControlExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BookingAntreanConfirmationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activityBookingAntreanConfirmationBinding, this, (View) obj);
            }
        }));
        int i2 = disconnect + 115;
        getItem = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        BookingAntreanConfirmationActivity bookingAntreanConfirmationActivity = this;
        ((getStreamUseCaseSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(bookingAntreanConfirmationActivity, new b(new Function1() { // from class: FocusMeteringControlExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BookingAntreanConfirmationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getStreamUseCaseSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(bookingAntreanConfirmationActivity, new b(new Function1() { // from class: FocusMeteringControlExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BookingAntreanConfirmationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = disconnect + 95;
        getItem = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mirror = (char) (29992 - AndroidCharacter.getMirror('0'));
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1756;
            int offsetBefore = 23 - TextUtils.getOffsetBefore("", 0);
            Object[] objArr2 = new Object[1];
            c((byte) 37, (short) ($$b & 965), $$a[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, packedPositionChild, offsetBefore, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                int iAlpha = Color.alpha(0) + 1755;
                int trimmedLength = TextUtils.getTrimmedLength("") + 23;
                Object[] objArr3 = new Object[1];
                c((byte) 52, (short) 156, $$a[5], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, iAlpha, trimmedLength, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i2 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{i2}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i3 = ((((-1604511881) + (((~((-78676253) | layoutDirection)) | (~((~layoutDirection) | 133926173))) * (-318))) + (((~(95652124 | layoutDirection)) | 38274049) * (-318))) + (((~(layoutDirection | (-95652125))) | (-116950302)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) - 509760062;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{58839, 27636, 46151, 18163}, new char[]{17411, 11325, 31162, 1322}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1041).substring(0, 25).codePointAt(1) + 10772), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106, new char[]{45606, 4361, 18489, 16442, 35934, 32525, 37576, 36210, 36327, 64562, 27756, 27503, 21039, 27651, 6080, 41711}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{58839, 27636, 46151, 18163}, new char[]{54695, 10328, 10567, 18815}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 32454), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_shopeepay_deeplink).substring(0, 9).length() - 9, new char[]{23567, 45590, 15441, 18943, 18305, 24219, 14773, 63163, 17321, 10035, 51583, 45040, 2365, 49953, 26491, 13883}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1528105333};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 42049), 1725 - TextUtils.lastIndexOf("", '0', 0), 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -509760062, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int iBlue = Color.blue(0) + 1755;
                    int maximumFlingVelocity = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    Object[] objArr8 = new Object[1];
                    c((byte) 52, (short) 156, $$a[5], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iBlue, maximumFlingVelocity, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{58839, 27636, 46151, 18163}, new char[]{65478, 59515, 50217, 56872}, (char) ExpandableListView.getPackedPositionGroup(0L), ViewConfiguration.getDoubleTapTimeout() >> 16, new char[]{56059, 8010, 62509, 21252, 48762, 21047, 18615, 44878, 48052, 23747, 36041, 50040, 11792, 15794, 14190, 10925, 44721, 51071, 14977, 33591, 49988, 7720}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{58839, 27636, 46151, 18163}, new char[]{61465, 42561, 46896, Typography.mdash}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_payment_cant_open_deeplink).substring(5, 6).length() + 5302), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_authentication_error).substring(33, 34).length() + 816202223, new char[]{23508, 36841, 58249, 26501, 10528, 19564, 61147, 37621, 36315, 54474, 55604, 45299, 20386, 7127, 31769}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int i6 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 23;
                        byte b2 = (byte) 52;
                        Object[] objArr11 = new Object[1];
                        c(b2, (short) (b2 << 1), $$a[5], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(modifierMetaStateMask, i6, touchSlop, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 29944);
                        int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                        int packedPositionGroup2 = 23 - ExpandableListView.getPackedPositionGroup(0L);
                        Object[] objArr12 = new Object[1];
                        c((byte) 37, (short) ($$b & 965), $$a[5], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(absoluteGravity, packedPositionGroup, packedPositionGroup2, 986134021, false, (String) objArr12[0], null);
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
        int i7 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i8 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i8 == i7) {
            int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
            Object[] objArr13 = {new int[]{i10}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int i11 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i12 = (~(99393828 | i11)) | 303042138;
            int i13 = ~i11;
            int i14 = i9 + 1182769903 + ((i12 | (~((-90439713) | i13))) * 886) + (((~(i13 | (-99393829))) | 311996254) * (-1772)) + ((~(i13 | 311996254)) * 886);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr13[3])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                int i17 = getItem + 5;
                disconnect = i17 % 128;
                int i18 = 2;
                int i19 = i17 % 2;
                int i20 = 0;
                while (i20 < strArr.length) {
                    int i21 = getItem + 23;
                    disconnect = i21 % 128;
                    int i22 = i21 % i18;
                    arrayList.add(strArr[i20]);
                    i20++;
                    i18 = 2;
                }
            }
            int[] iArr = new int[i8];
            int i23 = i8 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i8 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
            int i25 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
            Object[] objArr14 = {new int[]{i25}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
            int i26 = ~(((int) SystemClock.uptimeMillis()) | 58049538);
            int i27 = i24 + (((172199477 | i26) * (-658)) - 653175239) + ((i26 | 134351413) * 658);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr14[3])[0] = i29 ^ (i29 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
            int mirror2 = '?' - AndroidCharacter.getMirror('0');
            byte b3 = (byte) 52;
            Object[] objArr15 = new Object[1];
            c(b3, b3, $$a[5], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iResolveSizeAndState, mirror2, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{58839, 27636, 46151, 18163}, new char[]{65478, 59515, 50217, 56872}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{56059, 8010, 62509, 21252, 48762, 21047, 18615, 44878, 48052, 23747, 36041, 50040, 11792, 15794, 14190, 10925, 44721, 51071, 14977, 33591, 49988, 7720}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{58839, 27636, 46151, 18163}, new char[]{61465, 42561, 46896, Typography.mdash}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_mobile_instruction_1).substring(14, 15).length() + 5302), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 816202188, new char[]{23508, 36841, 58249, 26501, 10528, 19564, 61147, 37621, 36315, 54474, 55604, 45299, 20386, 7127, 31769}, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1031;
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
            Object[] objArr18 = new Object[1];
            c((byte) 52, (short) 156, $$a[5], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(bitsPerPixel, keyRepeatDelay, scrollDefaultDelay, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i30 = disconnect + 57;
            getItem = i30 % 128;
            int i31 = i30 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
                int trimmedLength2 = 15 - TextUtils.getTrimmedLength("");
                byte b4 = $$a[7];
                short s = b4;
                Object[] objArr19 = new Object[1];
                c(b4, s, (byte) s, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(doubleTapTimeout, iCombineMeasuredStates, trimmedLength2, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i32 = ((int[]) objArr20[3])[0];
            int i33 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i34 = ~(743048490 | startUptimeMillis);
            int i35 = ~startUptimeMillis;
            int i36 = i34 | (~(987328660 | i35));
            int i37 = ~((-743048491) | i35);
            int i38 = (((722867821 + ((i36 | i37) * (-516))) + (((~(startUptimeMillis | (-311521429))) | (~((-675807233) | i35))) * 516)) + ((675807232 | i37) * 516)) - 261510048;
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr[2])[0] = i40 ^ (i40 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{58839, 27636, 46151, 18163}, new char[]{17411, 11325, 31162, 1322}, (char) (10874 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{45606, 4361, 18489, 16442, 35934, 32525, 37576, 36210, 36327, 64562, 27756, 27503, 21039, 27651, 6080, 41711}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{58839, 27636, 46151, 18163}, new char[]{54695, 10328, 10567, 18815}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_internet_instruction_step3).substring(2, 3).codePointAt(0) + 32445), Process.myPid() >> 22, new char[]{23567, 45590, 15441, 18943, 18305, 24219, 14773, 63163, 17321, 10035, 51583, 45040, 2365, 49953, 26491, 13883}, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-1528105333};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46038), 1134 - Color.blue(0), MotionEvent.axisFromString("") + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -261510048, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int scrollDefaultDelay2 = 1031 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte b5 = (byte) 52;
                Object[] objArr25 = new Object[1];
                c(b5, b5, $$a[5], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(offsetAfter, scrollDefaultDelay2, iLastIndexOf, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getCapsMode("", 0, 0) + 45993), (KeyEvent.getMaxKeyCode() >> 16) + 1117, 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                int i41 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i42 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
                byte b6 = $$a[7];
                short s2 = b6;
                Object[] objArr26 = new Object[1];
                c(b6, s2, (byte) s2, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, i41, i42, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{58839, 27636, 46151, 18163}, new char[]{65478, 59515, 50217, 56872}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_error_dialog_screen_primary_cta_text).substring(8, 13).length() - 5, new char[]{56059, 8010, 62509, 21252, 48762, 21047, 18615, 44878, 48052, 23747, 36041, 50040, 11792, 15794, 14190, 10925, 44721, 51071, 14977, 33591, 49988, 7720}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{58839, 27636, 46151, 18163}, new char[]{61465, 42561, 46896, Typography.mdash}, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 5303), KeyEvent.keyCodeFromString("") + 816202224, new char[]{23508, 36841, 58249, 26501, 10528, 19564, 61147, 37621, 36315, 54474, 55604, 45299, 20386, 7127, 31769}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i43 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                    int mirror3 = '?' - AndroidCharacter.getMirror('0');
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, (short) 156, $$a[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(maximumFlingVelocity2, i43, mirror3, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char gidForName = (char) ((-1) - Process.getGidForName(""));
                    int iBlue2 = Color.blue(0) + 1031;
                    int iResolveSizeAndState2 = 15 - View.resolveSizeAndState(0, 0, 0);
                    byte b7 = (byte) 52;
                    Object[] objArr30 = new Object[1];
                    c(b7, b7, $$a[5], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(gidForName, iBlue2, iResolveSizeAndState2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i44 = disconnect + 115;
                getItem = i44 % 128;
                int i45 = i44 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i46 = ((int[]) objArr[1])[0];
        int i47 = ((int[]) objArr[3])[0];
        if (i47 == i46) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i48 = ((int[]) objArr[2])[0];
            int i49 = ((int[]) objArr[3])[0];
            int i50 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i51 = i48 + 1527329922 + ((~(519536374 | iMaxMemory)) * 623) + (((~iMaxMemory) | 268440064) * (-623)) + (((~(iMaxMemory | 516128304)) | (~(271848134 | iMaxMemory)) | (-519536375)) * 623);
            int i52 = (i51 << 13) ^ i51;
            int i53 = i52 ^ (i52 >>> 17);
            ((int[]) objArr31[2])[0] = i53 ^ (i53 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i54 = 0;
            while (i54 < strArr4.length) {
                int i55 = disconnect + 99;
                getItem = i55 % 128;
                if (i55 % 2 != 0) {
                    arrayList2.add(strArr4[i54]);
                    i54 += 9;
                } else {
                    arrayList2.add(strArr4[i54]);
                    i54++;
                }
            }
        }
        int[] iArr2 = new int[i47];
        int i56 = i47 - 1;
        iArr2[i56] = 1;
        Toast.makeText((Context) null, iArr2[((i47 * i56) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i57 = ((int[]) objArr[2])[0];
        int i58 = ((int[]) objArr[3])[0];
        int i59 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i60 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        int i61 = i57 + (-1004191809) + (((~((~i60) | (-201982482))) | (~(233748223 | i60))) * (-302)) + ((~((-201982482) | i60)) * (-604)) + (((~(i60 | 31765742)) | 21233796) * 302);
        int i62 = i61 ^ (i61 << 13);
        int i63 = i62 ^ (i62 >>> 17);
        ((int[]) objArr32[2])[0] = i63 ^ (i63 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = disconnect + 95;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        int i6 = (-1717419676) + (((~((-1047426882) | i5)) | 207901760) * (-1188));
        int i7 = (~(iIdentityHashCode | 1047426881)) | 207901760;
        int i8 = ~(217439338 | i5);
        if (i4 != i6 + ((i7 | i8) * 594) + (((~(1047426881 | i5)) | (-1056964460) | i8) * 594)) {
            throw null;
        }
        int i9 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        if (i9 != ((~(iFreeMemory | 1983754234)) * TypedValues.CycleType.TYPE_EASING) + 1888430176 + (((~((~iFreeMemory) | 1983754234)) | 574195042) * TypedValues.CycleType.TYPE_EASING)) {
            int i10 = (-1112591800) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i11 = disconnect + 1;
        getItem = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f3, code lost:
    
        if (r1 != ((((-238692436) + ((~((~r2) | 2129638647)) * (-116))) + ((988647525 | r2) * 116)) + (((~(r2 | (-1590408440))) | 449417317) * 116))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f5, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.queueing.BookingAntreanConfirmationActivity.getItem + 79;
        com.bpjstku.presentation.queueing.BookingAntreanConfirmationActivity.disconnect = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0101, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0102, code lost:
    
        r1 = 882060356 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x010b, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0113, code lost:
    
        throw new java.lang.RuntimeException("-1421793673");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0055, code lost:
    
        if (r1 == ((1918893511 + (((~(r6 | (-1071156572))) | 241169028) * 191)) + (((~((~r6) | (-1071156572))) | 240680960) * 191))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ab, code lost:
    
        if (r1 == ((421518216 + (((~(r6 | 596722128)) | 1409850407) * (-160))) + (((~(r6 | 1426709671)) | 596722128) * 160))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ad, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.BookingAntreanConfirmationActivity.onStart():void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        String str;
        String str2;
        String str3;
        String str4;
        BookingAntreanConfirmationActivity bookingAntreanConfirmationActivity = (BookingAntreanConfirmationActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = getItem;
        int i3 = i2 + 117;
        disconnect = i3 % 128;
        int i4 = i3 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            int i5 = i2 + 115;
            int i6 = i5 % 128;
            disconnect = i6;
            int i7 = i5 % 2;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                bookingAntreanConfirmationActivity.IconCompatParcelizer();
                GetDataAntrianResponse getDataAntrianResponse = (GetDataAntrianResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                AntrianData data = getDataAntrianResponse.getData();
                if (!Intrinsics.areEqual(getDataAntrianResponse.isSuccessful(), Boolean.TRUE) || data == null) {
                    BookingAntreanConfirmationActivity bookingAntreanConfirmationActivity2 = bookingAntreanConfirmationActivity;
                    String message = getDataAntrianResponse.getMessage();
                    Toast.makeText(bookingAntreanConfirmationActivity2, message != null ? message : "", 0).show();
                } else {
                    BookingAntreanSuccessActivity.Companion companion = BookingAntreanSuccessActivity.INSTANCE;
                    BookingAntreanConfirmationActivity bookingAntreanConfirmationActivity3 = bookingAntreanConfirmationActivity;
                    String nomorIdentitas = data.getNomorIdentitas();
                    String str5 = nomorIdentitas == null ? "" : nomorIdentitas;
                    String nama = data.getNama();
                    if (nama == null) {
                        int i8 = getItem + 97;
                        disconnect = i8 % 128;
                        if (i8 % 2 == 0) {
                            throw null;
                        }
                        str2 = "";
                    } else {
                        str2 = nama;
                    }
                    String handphone = data.getHandphone();
                    String str6 = handphone == null ? "" : handphone;
                    String email = data.getEmail();
                    String str7 = email == null ? "" : email;
                    String kodePengajuan = data.getKodePengajuan();
                    String str8 = kodePengajuan == null ? "" : kodePengajuan;
                    String str9 = bookingAntreanConfirmationActivity.TuitionPaymentFragmentbindingInflater1;
                    String layanan = data.getLayanan();
                    String str10 = layanan == null ? "" : layanan;
                    String namaKantorCabang = data.getNamaKantorCabang();
                    String str11 = (namaKantorCabang == null && (namaKantorCabang = data.getKantorCabang()) == null) ? "" : namaKantorCabang;
                    String alamatKantor = data.getAlamatKantor();
                    String str12 = alamatKantor == null ? "" : alamatKantor;
                    String str13 = bookingAntreanConfirmationActivity.g;
                    String tanggalBooking = data.getTanggalBooking();
                    if (tanggalBooking == null) {
                        int i9 = disconnect + 113;
                        str3 = "";
                        getItem = i9 % 128;
                        if (i9 % 2 != 0) {
                            throw null;
                        }
                        str4 = str3;
                    } else {
                        str3 = "";
                        str4 = tanggalBooking;
                    }
                    String namaShift = data.getNamaShift();
                    String str14 = namaShift == null ? str3 : namaShift;
                    String qrCode = getDataAntrianResponse.getQrCode();
                    BookingAntreanSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bookingAntreanConfirmationActivity3, str5, str2, str6, str7, str8, str9, str10, str11, str12, str13, str4, str14, "", "", qrCode == null ? str3 : qrCode, "902");
                    bookingAntreanConfirmationActivity.finish();
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i10 = i6 + 109;
                getItem = i10 % 128;
                int i11 = i10 % 2;
                bookingAntreanConfirmationActivity.IconCompatParcelizer();
                BookingAntreanConfirmationActivity bookingAntreanConfirmationActivity4 = bookingAntreanConfirmationActivity;
                String str15 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str15 != null) {
                    int i12 = getItem + 71;
                    disconnect = i12 % 128;
                    int i13 = i12 % 2;
                    str = str15;
                } else {
                    str = "";
                }
                Toast.makeText(bookingAntreanConfirmationActivity4, str, 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(BookingAntreanConfirmationActivity bookingAntreanConfirmationActivity, View view) {
        int i = 2 % 2;
        int i2 = disconnect + 19;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            bookingAntreanConfirmationActivity.getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }
        bookingAntreanConfirmationActivity.getOnBackPressedDispatcher().onBackPressed();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(BookingAntreanConfirmationActivity bookingAntreanConfirmationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = disconnect + 67;
        int i3 = i2 % 128;
        getItem = i3;
        int i4 = i2 % 2;
        String msg = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i5 = i3 + 17;
            disconnect = i5 % 128;
            if (i5 % 2 == 0) {
                bookingAntreanConfirmationActivity.MediaBrowserCompat();
                msg.hashCode();
                throw null;
            }
            bookingAntreanConfirmationActivity.MediaBrowserCompat();
        } else {
            String str = "";
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                InsertAntrianData data = ((InsertAntrianResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
                String ret = data != null ? data.getRet() : null;
                if (ret == null) {
                    int i6 = getItem + 93;
                    disconnect = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    ret = "";
                }
                if (!Intrinsics.areEqual(ret, "0")) {
                    if (Intrinsics.areEqual(ret, "-2")) {
                        String msg2 = data != null ? data.getMsg() : null;
                        if (msg2 == null) {
                            int i7 = disconnect + 55;
                            getItem = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 86 / 0;
                            }
                            msg2 = "";
                        }
                        if (StringsKt.contains((CharSequence) msg2, (CharSequence) "DATA EXIST", true)) {
                            ((getStreamUseCaseSupportedCombinationList) bookingAntreanConfirmationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1(bookingAntreanConfirmationActivity.INotificationSideChannelStubProxy, bookingAntreanConfirmationActivity.onTransact);
                        }
                    }
                    bookingAntreanConfirmationActivity.IconCompatParcelizer();
                    BookingAntreanConfirmationActivity bookingAntreanConfirmationActivity2 = bookingAntreanConfirmationActivity;
                    if (data != null) {
                        int i9 = disconnect + 7;
                        getItem = i9 % 128;
                        int i10 = i9 % 2;
                        msg = data.getMsg();
                    }
                    if (msg != null) {
                        int i11 = getItem + 1;
                        disconnect = i11 % 128;
                        int i12 = i11 % 2;
                        str = msg;
                    }
                    Toast.makeText(bookingAntreanConfirmationActivity2, str, 0).show();
                } else {
                    ((getStreamUseCaseSupportedCombinationList) bookingAntreanConfirmationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1(bookingAntreanConfirmationActivity.INotificationSideChannelStubProxy, bookingAntreanConfirmationActivity.onTransact);
                }
            } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
                bookingAntreanConfirmationActivity.IconCompatParcelizer();
                BookingAntreanConfirmationActivity bookingAntreanConfirmationActivity3 = bookingAntreanConfirmationActivity;
                String str2 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Toast.makeText(bookingAntreanConfirmationActivity3, str2 != null ? str2 : "", 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ActivityBookingAntreanConfirmationBinding activityBookingAntreanConfirmationBinding, CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = getItem + 105;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(compoundButton, "");
        if (i3 != 0) {
            activityBookingAntreanConfirmationBinding.btnSubmit.setEnabled(z);
        } else {
            activityBookingAntreanConfirmationBinding.btnSubmit.setEnabled(z);
            throw null;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityBookingAntreanConfirmationBinding activityBookingAntreanConfirmationBinding, BookingAntreanConfirmationActivity bookingAntreanConfirmationActivity, View view) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (activityBookingAntreanConfirmationBinding.cbPersetujuan.isChecked()) {
            int i2 = disconnect + 57;
            getItem = i2 % 128;
            int i3 = i2 % 2;
            String str2 = bookingAntreanConfirmationActivity.onTransact;
            if (bookingAntreanConfirmationActivity.notify.length() == 0) {
                int i4 = disconnect + 11;
                getItem = i4 % 128;
                int i5 = i4 % 2;
                str = "-";
            } else {
                str = bookingAntreanConfirmationActivity.notify;
            }
            InsertAntrianRequest insertAntrianRequest = new InsertAntrianRequest(str2, str, bookingAntreanConfirmationActivity.INotificationSideChannel, bookingAntreanConfirmationActivity.INotificationSideChannelStub, bookingAntreanConfirmationActivity.cancel.length() != 0 ? bookingAntreanConfirmationActivity.cancel : "-", bookingAntreanConfirmationActivity.a, bookingAntreanConfirmationActivity.d, bookingAntreanConfirmationActivity.asBinder, bookingAntreanConfirmationActivity.asInterface, bookingAntreanConfirmationActivity.getInterfaceDescriptor, bookingAntreanConfirmationActivity.cancelAll, bookingAntreanConfirmationActivity.INotificationSideChannelDefault);
            final getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) bookingAntreanConfirmationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            String str3 = bookingAntreanConfirmationActivity.INotificationSideChannelStubProxy;
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(insertAntrianRequest, "");
            MutableLiveData<VirtualCameraAdapter1<InsertAntrianResponse>> mutableLiveData = getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getstreamusecasesupportedcombinationlist.f988a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str3, insertAntrianRequest)));
            final Function1 function1 = new Function1() { // from class: MeteringRepeatingSessionExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getstreamusecasesupportedcombinationlist, (InsertAntrianResponse) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: MeteringRepeatingSession1
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    getStreamUseCaseSupportedCombinationList.asInterface(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: getRAWSupportedCombinationList
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getstreamusecasesupportedcombinationlist, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getLensFacingInt
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(BookingAntreanConfirmationActivity bookingAntreanConfirmationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        int iB2 = ClaimOldDaySecurityTermsConditionActivity.b.b();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(-588215995, ClaimOldDaySecurityTermsConditionActivity.b.b(), iB2, new Object[]{bookingAntreanConfirmationActivity, virtualCameraAdapter1}, ClaimOldDaySecurityTermsConditionActivity.b.b(), 588215995, iB);
    }

    static {
        getRoot = 1;
        g();
        INSTANCE = new Companion(null);
        int i = getNotifyChildrenChangedOptions + 121;
        getRoot = i % 128;
        if (i % 2 == 0) {
            int i2 = 95 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = disconnect + 85;
        getItem = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzhe.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(868106714, ClaimOldDaySecurityTermsConditionActivity.b.b(), iB, new Object[]{this, bundle}, ClaimOldDaySecurityTermsConditionActivity.b.b(), -868106713, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws IllegalAccessException {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzhe.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1422903857, zzhe.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this}, zzhe.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1422903859, iB);
    }

    static void g() {
        connect = -2193999360659726106L;
        read = -981105359;
        write = (char) 34097;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        BookingAntreanConfirmationActivity bookingAntreanConfirmationActivity = (BookingAntreanConfirmationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getItem + 109;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = disconnect + 7;
        getItem = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001e -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, int r6, int r7) {
        /*
            int r7 = r7 + 102
            int r6 = r6 + 4
            byte[] r0 = com.bpjstku.presentation.queueing.BookingAntreanConfirmationActivity.$$c
            int r5 = r5 * 2
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L1e
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L1e:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
        L24:
            int r7 = r7 + r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.queueing.BookingAntreanConfirmationActivity.$$i(int, int, int):java.lang.String");
    }
}
