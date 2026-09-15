package com.bpjstku.presentation.membership.registration.indonesianmigranworker;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.registration.pmi.model.request.PmiRegistrationRequest;
import com.bpjstku.databinding.ActivityIndonesianMigrantWorkerRegistrationSuccessBinding;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.presentation.membership.payment.PaymentActivity;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import defpackage.AppCompatDelegateImplApi26Impl;
import defpackage.BufferProviderState;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.UseTorchAsFlash;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.deriveCodec;
import defpackage.generateCameraId;
import defpackage.getActivitySideSheetRoundedCornersPosition;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onCaptureSessionEnd;
import defpackage.onResume;
import defpackage.onScroll;
import defpackage.onSuggestionClick;
import defpackage.share;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u0015\u0010\u0007\u001a\u00020\f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\rR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00148\u0015X\u0095D¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0013\u0010\u0016"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/indonesianmigranworker/IndonesianMigrantWorkerRegistrationSuccessActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityIndonesianMigrantWorkerRegistrationSuccessBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "a", "asBinder", "LonSuggestionClick;", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IndonesianMigrantWorkerRegistrationSuccessActivity extends BindingBaseActivity<ActivityIndonesianMigrantWorkerRegistrationSuccessBinding> {
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f552a;
    private static char asInterface;
    private static int cancel;
    private static char g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy b;
    private static final byte[] $$c = {68, 104, -93, -37};
    private static final int $$f = 22;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {68, -119, -76, 97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 207;
    private static int cancelAll = 1;
    private static int asBinder = 0;
    private static int d = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: WithHint
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IndonesianMigrantWorkerRegistrationSuccessActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.layout.activity_indonesian_migrant_worker_registration_success;

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~(i7 | i8 | i5);
        int i10 = ~i5;
        int i11 = (~(i7 | i10)) | (~(i8 | i | i5));
        int i12 = (~(i5 | i7)) | (~(i8 | i10));
        int i13 = i + i6 + i4 + ((-1255669517) * i3) + (533247121 * i2);
        int i14 = i13 * i13;
        int i15 = ((i * (-1895547823)) - 858849280) + ((-1895547823) * i6) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i4) + (760610816 * i3) + ((-1057882112) * i2) + (1344208896 * i14);
        int i16 = ((i * (-122328301)) - 2132886715) + (i6 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i4 * (-122328029)) + (i3 * (-1196579527)) + (i2 * 656595923) + (i14 * 138215424);
        int i17 = i15 + (i16 * i16 * (-833028096));
        if (i17 != 1) {
            return i17 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        return b(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            byte[] r1 = com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity.$$a
            int r6 = r6 + 4
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity.c(short, short, int, java.lang.Object[]):void");
    }

    public IndonesianMigrantWorkerRegistrationSuccessActivity() {
        final IndonesianMigrantWorkerRegistrationSuccessActivity indonesianMigrantWorkerRegistrationSuccessActivity = this;
        this.b = LazyKt.lazy(new Function0<onSuggestionClick>() { // from class: com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, onSuggestionClick] */
            @Override // kotlin.jvm.functions.Function0
            public final onSuggestionClick invoke() {
                ComponentCallbacks componentCallbacks = indonesianMigrantWorkerRegistrationSuccessActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(onSuggestionClick.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/indonesianmigranworker/IndonesianMigrantWorkerRegistrationSuccessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, MigrantWorkerRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, IndonesianMigrantWorkerRegistrationSuccessActivity.class, new Pair[]{TuplesKt.to("migration_worker_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityIndonesianMigrantWorkerRegistrationSuccessBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        d = i2 % 128;
        int i3 = i2 % 2;
        IndonesianMigrantWorkerRegistrationSuccessActivity$bindingInflater$1 indonesianMigrantWorkerRegistrationSuccessActivity$bindingInflater$1 = IndonesianMigrantWorkerRegistrationSuccessActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = d + 119;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return indonesianMigrantWorkerRegistrationSuccessActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 75;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i6 = i2 + 87;
        d = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        PmiRegistrationRequest pmiRegistrationRequest;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i = 2 % 2;
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().b(new UseTorchAsFlash());
        MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        Object obj = null;
        if (migrantWorkerRegistration != null) {
            int i2 = d + 113;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            String str8 = migrantWorkerRegistration.TuitionPaymentFragmentbindingInflater1;
            if (str8 == null) {
                int i4 = asBinder + 115;
                d = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                str = "";
            } else {
                str = str8;
            }
            String str9 = migrantWorkerRegistration.onTransact;
            String str10 = str9 == null ? "" : str9;
            String str11 = migrantWorkerRegistration.getItem;
            String str12 = str11 == null ? "" : str11;
            String str13 = migrantWorkerRegistration.getRoot;
            String str14 = str13 == null ? "" : str13;
            String str15 = migrantWorkerRegistration.getInterfaceDescriptor;
            String str16 = str15 == null ? "" : str15;
            String str17 = migrantWorkerRegistration.MediaBrowserCompat;
            String str18 = str17 == null ? "" : str17;
            String str19 = migrantWorkerRegistration.notify;
            String str20 = str19 == null ? "" : str19;
            String str21 = migrantWorkerRegistration.cancel;
            String str22 = str21 == null ? "" : str21;
            String str23 = migrantWorkerRegistration.b;
            String str24 = str23 == null ? "" : str23;
            String str25 = migrantWorkerRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str26 = str25 == null ? "" : str25;
            String str27 = migrantWorkerRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str28 = str27 == null ? "" : str27;
            String str29 = migrantWorkerRegistration.isConnected;
            String str30 = str29 == null ? "" : str29;
            String str31 = migrantWorkerRegistration.com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String;
            String str32 = str31 == null ? "" : str31;
            String str33 = migrantWorkerRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str33 == null) {
                int i5 = asBinder + 85;
                d = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 56 / 0;
                }
                str2 = "";
            } else {
                str2 = str33;
            }
            String str34 = migrantWorkerRegistration.asInterface;
            String str35 = str34 == null ? "" : str34;
            String str36 = migrantWorkerRegistration.cancelAll;
            String str37 = str36 == null ? "" : str36;
            String str38 = migrantWorkerRegistration.asBinder;
            String str39 = str38 == null ? "" : str38;
            File file = migrantWorkerRegistration.getServiceComponent;
            String str40 = migrantWorkerRegistration.disconnect;
            String str41 = str40 == null ? "" : str40;
            String str42 = migrantWorkerRegistration.getExtras;
            String str43 = str42 == null ? "" : str42;
            String str44 = migrantWorkerRegistration.read;
            if (str44 == null) {
                int i7 = d + 25;
                asBinder = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 87 / 0;
                }
                str3 = "";
            } else {
                str3 = str44;
            }
            String str45 = migrantWorkerRegistration.getNotifyChildrenChangedOptions;
            String str46 = str45 == null ? "" : str45;
            String str47 = migrantWorkerRegistration.RemoteActionCompatParcelizer;
            String str48 = str47 == null ? "" : str47;
            String str49 = migrantWorkerRegistration.INotificationSideChannelDefault;
            String str50 = str49 == null ? "" : str49;
            String str51 = migrantWorkerRegistration.IconCompatParcelizer;
            if (str51 == null) {
                int i9 = d + 103;
                asBinder = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
                str4 = "";
            } else {
                str4 = str51;
            }
            String str52 = migrantWorkerRegistration.write;
            String str53 = str52 == null ? "" : str52;
            String str54 = migrantWorkerRegistration.INotificationSideChannelStub;
            if (str54 == null) {
                int i10 = d + 99;
                asBinder = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 35 / 0;
                }
                str5 = "";
            } else {
                str5 = str54;
            }
            String str55 = migrantWorkerRegistration.INotificationSideChannelStubProxy;
            if (str55 == null) {
                int i12 = asBinder + 23;
                d = i12 % 128;
                if (i12 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                str6 = "";
            } else {
                str6 = str55;
            }
            String str56 = migrantWorkerRegistration.INotificationSideChannel;
            String str57 = str56 == null ? "" : str56;
            String str58 = migrantWorkerRegistration.a;
            String str59 = str58 == null ? "" : str58;
            String str60 = migrantWorkerRegistration.g;
            String str61 = str60 == null ? "" : str60;
            File file2 = migrantWorkerRegistration.sendCustomAction;
            String str62 = migrantWorkerRegistration.getSessionToken;
            if (str62 == null) {
                int i13 = d + 7;
                asBinder = i13 % 128;
                int i14 = i13 % 2;
                str7 = "";
            } else {
                str7 = str62;
            }
            String str63 = migrantWorkerRegistration.connect;
            if (str63 == null) {
                str63 = "";
            }
            pmiRegistrationRequest = new PmiRegistrationRequest(str, str28, str26, str24, str2, str35, str39, str61, str59, str10, str57, str37, str22, str20, str16, str6, str5, str48, str50, str53, str4, str63, str18, str3, str46, str43, str41, str12, str14, str7, str32, str30, file, file2);
        } else {
            pmiRegistrationRequest = null;
        }
        final onSuggestionClick onsuggestionclick = (onSuggestionClick) this.b.getValue();
        MutableLiveData<VirtualCameraAdapter1<Registration>> mutableLiveData = onsuggestionclick.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        if (pmiRegistrationRequest != null) {
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(onsuggestionclick.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(pmiRegistrationRequest)));
            final Function1 function1 = new Function1() { // from class: ensureImeVisible
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return onSuggestionClick.b(onsuggestionclick, (Registration) obj2);
                }
            };
            logToString logtostring = new logToString() { // from class: SearchViewPreQAutoCompleteTextViewReflector
                @Override // defpackage.logToString
                public final void accept(Object obj2) {
                    function1.invoke(obj2);
                }
            };
            final Function1 function2 = new Function1() { // from class: doBeforeTextChanged
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return onSuggestionClick.b(onsuggestionclick, (Throwable) obj2);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: doAfterTextChanged
                @Override // defpackage.logToString
                public final void accept(Object obj2) {
                    function2.invoke(obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            onsuggestionclick.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final IndonesianMigrantWorkerRegistrationSuccessActivity indonesianMigrantWorkerRegistrationSuccessActivity = (IndonesianMigrantWorkerRegistrationSuccessActivity) objArr[0];
        int i = 2 % 2;
        ((onSuggestionClick) indonesianMigrantWorkerRegistrationSuccessActivity.b.getValue()).asInterface.observe(indonesianMigrantWorkerRegistrationSuccessActivity, new Observer() { // from class: ViewUtilsApi29Impl
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                IndonesianMigrantWorkerRegistrationSuccessActivity.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = d + 101;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 48 / 0;
        }
        return null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                break;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $10 + 101;
                $11 = i6 % 128;
                int i7 = i6 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i8 = (c3 + i4) ^ ((c3 << 4) + ((char) (((long) f552a) ^ 8611973335120459638L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(g);
                    objArr2[i2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cResolveSize = (char) (47773 - View.resolveSize(0, 0));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 469;
                        int iLastIndexOf = 12 - TextUtils.lastIndexOf("", '0');
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, iIndexOf, iLastIndexOf, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asInterface)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 47774), 468 - View.combineMeasuredStates(0, 0), AndroidCharacter.getMirror('0') - '#', -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    oncapturesessionend = oncapturesessionend2;
                    i2 = 2;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 2323 - (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43, -1312321721, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            oncapturesessionend = oncapturesessionend3;
            i2 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
        int i10 = $11 + 101;
        $10 = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = d + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IndonesianMigrantWorkerRegistrationSuccessActivity indonesianMigrantWorkerRegistrationSuccessActivity = this;
        Intrinsics.checkNotNullParameter(indonesianMigrantWorkerRegistrationSuccessActivity, "");
        indonesianMigrantWorkerRegistrationSuccessActivity.getWindow().addFlags(8192);
        int i4 = d + 43;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iArgb = Color.argb(0, 0, 0, 0) + 1031;
            int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr = $$a;
            short s = bArr[132];
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(s, b, (byte) (b | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iArgb, modifierMetaStateMask, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{28131, 3201, 49628, 11817, 17489, 57072, 51511, 42803, 33539, 46273, 12610, 27749, 17706, 10118, 20006, 14508, 33885, 22037, 8937, 9133, 58126, 23205, 9353, 16857}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{38985, 14395, 23250, 3832, 20293, 59113, 36041, 53096, 55069, 41573, 63842, 64485, 41575, 65290, 26320, 24005, 31385, 39355}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.promo_unavailable).substring(0, 6).codePointAt(4) - 96, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0);
            int maxKeyCode = 15 - (KeyEvent.getMaxKeyCode() >> 16);
            short s2 = (short) ($$b >>> 2);
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c(s2, b2, (byte) (b2 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, iLastIndexOf, maxKeyCode, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = d + 3;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char modifierMetaStateMask2 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
                int i4 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                short s3 = (short) ($$b >>> 1);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c(s3, bArr2[5], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask2, minimumFlingVelocity, i4, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i7 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step2).substring(4, 5).codePointAt(0) + 1062088494);
            int i8 = 1610055538 + (((~((-424394368) | i7)) | 180114197) * (-933)) + (((~(i7 | 180114197)) | (-469761920)) * 933) + 552217483;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{17773, 23622, 34843, 56854, 6374, 850, 54527, 46462, 35830, 10824, 48961, 52559, 46349, 18537, 25954, 49600, 59298, 21110}, 15 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{42602, 49729, 51021, 59153, 46949, 2098, 65240, 19924, 32847, 49598, 37241, 52495, 42165, 59066, 57125, 42372, 2764, 26623}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-2001380738};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46039 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1134 - ((Process.getThreadPriority(0) + 20) >> 6), 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1173964427, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                    int i11 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
                    byte[] bArr3 = $$a;
                    short s4 = bArr3[132];
                    byte b3 = bArr3[7];
                    Object[] objArr12 = new Object[1];
                    c(s4, b3, (byte) (b3 | 52), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, maxKeyCode2, i11, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45993), TextUtils.lastIndexOf("", '0') + 1118, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 1);
                    int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int doubleTapTimeout = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    short s5 = (short) ($$b >>> 1);
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    c(s5, bArr4[5], bArr4[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(gidForName, iIndexOf, doubleTapTimeout, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{28131, 3201, 49628, 11817, 17489, 57072, 51511, 42803, 33539, 46273, 12610, 27749, 17706, 10118, 20006, 14508, 33885, 22037, 8937, 9133, 58126, 23205, 9353, 16857}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 89, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{38985, 14395, 23250, 3832, 20293, 59113, 36041, 53096, 55069, 41573, 63842, 64485, 41575, 65290, 26320, 24005, 31385, 39355}, Process.getGidForName("") + 16, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int minimumFlingVelocity2 = 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        short s6 = (short) ($$b >>> 2);
                        byte b4 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c(s6, b4, (byte) (b4 | 52), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cCombineMeasuredStates, maximumDrawingCacheSize, minimumFlingVelocity2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                        int iIndexOf3 = 14 - TextUtils.indexOf((CharSequence) "", '0');
                        byte[] bArr5 = $$a;
                        short s7 = bArr5[132];
                        byte b5 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        c(s7, b5, (byte) (b5 | 52), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, iIndexOf2, iIndexOf3, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i12 = d + 61;
                    asBinder = i12 % 128;
                    int i13 = i12 % 2;
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i20 = i16 + 1735288292 + (((~(i19 | 243166158)) | (-243204064)) * 305) + (((~((~i19) | 243166158)) | (-1114012)) * 305);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
            int i23 = asBinder + 63;
            d = i23 % 128;
            int i24 = i23 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i25 = i15 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i25) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i29 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i30 = ~i29;
            int i31 = (-1388989053) + (((~((-91190772) | i30)) | 24011089) * (-1188));
            int i32 = (~(i29 | 91190771)) | 24011089;
            int i33 = ~(335470941 | i30);
            int i34 = i26 + i31 + ((i32 | i33) * 594) + (((~(91190771 | i30)) | (-402650624) | i33) * 594);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr19[2])[0] = i36 ^ (i36 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cMyPid = (char) (29944 - (Process.myPid() >> 22));
            int modifierMetaStateMask3 = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
            int size = View.MeasureSpec.getSize(0) + 23;
            short s8 = (short) ($$b >>> 1);
            byte b6 = $$a[7];
            Object[] objArr20 = new Object[1];
            c(s8, b6, (byte) (b6 | 37), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMyPid, modifierMetaStateMask3, size, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i37 = d + 33;
            asBinder = i37 % 128;
            int i38 = i37 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
                int jumpTapTimeout = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iIndexOf4 = TextUtils.indexOf("", "", 0) + 23;
                short s9 = (short) ($$b >>> 2);
                byte b7 = $$a[7];
                Object[] objArr21 = new Object[1];
                c(s9, b7, (byte) (b7 | 52), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(defaultSize, jumpTapTimeout, iIndexOf4, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i39 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2082133181);
            int i40 = ((((-1312140803) + ((~(212470775 | i39)) * 52)) + (((~(203557730 | i39)) | ((~((-9044696) | i39)) | 8913045)) * (-52))) + (((~(i39 | (-203557731))) | 203426080) * 52)) - 1589026046;
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i42 ^ (i42 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{17773, 23622, 34843, 56854, 6374, 850, 54527, 46462, 35830, 10824, 48961, 52559, 46349, 18537, 25954, 49600, 59298, 21110}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_expired).substring(7, 9).codePointAt(0) - 16, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{42602, 49729, 51021, 59153, 46949, 2098, 65240, 19924, 32847, 49598, 37241, 52495, 42165, 59066, 57125, 42372, 2764, 26623}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bbm_money).substring(0, 9).codePointAt(6) - 94, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-2001380738};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 42049), 1726 - View.resolveSize(0, 0), Color.rgb(0, 0, 0) + 16777245, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$7879113 = onScroll.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1589026046, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                int i43 = 1755 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                short s10 = (short) ($$b >>> 2);
                byte b8 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(s10, b8, (byte) (b8 | 52), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cNormalizeMetaState, i43, minimumFlingVelocity3, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{28131, 3201, 49628, 11817, 17489, 57072, 51511, 42803, 33539, 46273, 12610, 27749, 17706, 10118, 20006, 14508, 33885, 22037, 8937, 9133, 58126, 23205, 9353, 16857}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step3).substring(3, 4).codePointAt(0) - 95, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{38985, 14395, 23250, 3832, 20293, 59113, 36041, 53096, 55069, 41573, 63842, 64485, 41575, 65290, 26320, 24005, 31385, 39355}, 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                    int iRgb = Color.rgb(0, 0, 0) + 16778971;
                    int size2 = View.MeasureSpec.getSize(0) + 23;
                    short s11 = (short) ($$b & 956);
                    byte b9 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c(s11, b9, (byte) (b9 | 52), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cArgb, iRgb, size2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
                    int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 24;
                    short s12 = (short) ($$b >>> 1);
                    byte b10 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c(s12, b10, (byte) (b10 | 37), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, capsMode, packedPositionChild, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i44 = ((int[]) objArrB$7879113[1])[0];
        int i45 = ((int[]) objArrB$7879113[0])[0];
        if (i45 != i44) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrB$7879113[4];
            if (strArr5 != null) {
                for (String str2 : strArr5) {
                    int i46 = asBinder + 29;
                    d = i46 % 128;
                    int i47 = i46 % 2;
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i45));
        }
        int i48 = ((int[]) objArrB$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int i49 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        int i50 = ~((-376923715) | i49);
        int i51 = ~i49;
        int i52 = i48 + (-128186607) + ((i50 | (~((-164321289) | i51))) * (-1808)) + (((~((-372516419) | i49)) | (~(i51 | (-159913993)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(i49 | 164321288)) | 4407296 | (~(376923714 | i51))) * TypedValues.Custom.TYPE_BOOLEAN);
        int i53 = (i52 << 13) ^ i52;
        int i54 = i53 ^ (i53 >>> 17);
        ((int[]) objArr31[3])[0] = i54 ^ (i54 << 5);
        int i55 = d + 53;
        asBinder = i55 % 128;
        int i56 = i55 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != 2007683688 + ((1585937705 | iIdentityHashCode) * 376) + (((~((~iIdentityHashCode) | 933196601)) | 1207962624) * (-376)) + (((~(iIdentityHashCode | (-933196602))) | (-1763184145)) * 376)) {
            int[] iArr = new int[892849435];
            iArr[892849434] = 1;
            int i5 = (-1095339074) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i6 = d + 35;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step2).substring(28, 29).length() + 759876663;
        if (i8 != (-238692436) + ((~((~length) | 1996485595)) * (-116)) + ((855593939 | length) * 116) + (((~(length | (-1723462026))) | 582570369) * 116)) {
            throw new RuntimeException("-537181004");
        }
        super.onResume();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != ((((~((-34018595) | iIdentityHashCode)) | (-866123772)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 557121078) + ((~((~iIdentityHashCode) | (-34018595))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) {
            int i5 = 572589992 % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        if (i6 != ((346024308 + (((~i7) | 570705446) * 1324)) + (((~(i7 | 1647595302)) | (~(931460662 | i7))) * (-1324))) - 1761702048) {
            throw null;
        }
        super.onStart();
        int i8 = d + 27;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cf, code lost:
    
        if (r0 != ((((-971544597) + (((~((-1877232864) | r4)) | 1176503426) * 98)) + ((((~(r4 | (-701823102))) | (-1877232864)) | (~(701823101 | r2))) * (-49))) + (((~(r2 | (-1877232864))) | (-1878326528)) * 49))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d1, code lost:
    
        super.onCreate(r10);
        r10 = com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity.asBinder + 35;
        com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity.d = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00dd, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e5, code lost:
    
        throw new java.lang.RuntimeException("552034115");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ed, code lost:
    
        throw new java.lang.RuntimeException("-1832857379");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004c, code lost:
    
        if (r2 == (((501467944 + (((~(1723296947 | r4)) | 285774156) * 576)) + (((~((~r4) | 2009071103)) | 607535248) * 576)) + 1397156608)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0095, code lost:
    
        if (r2 == ((r9 + ((r4 | r6) * (-84))) + ((1409330283 | r6) * 84))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0097, code lost:
    
        r0 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = (int) android.os.SystemClock.elapsedRealtime();
        r4 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r10) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity.b(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ MigrantWorkerRegistration TuitionPaymentFragmentbindingInflater1(IndonesianMigrantWorkerRegistrationSuccessActivity indonesianMigrantWorkerRegistrationSuccessActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) indonesianMigrantWorkerRegistrationSuccessActivity.getIntent().getParcelableExtra("migration_worker_data");
        int i3 = asBinder + 19;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 15 / 0;
        }
        return migrantWorkerRegistration;
    }

    public static /* synthetic */ void b(final IndonesianMigrantWorkerRegistrationSuccessActivity indonesianMigrantWorkerRegistrationSuccessActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = asBinder + 63;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                indonesianMigrantWorkerRegistrationSuccessActivity.MediaBrowserCompat();
                return;
            }
            indonesianMigrantWorkerRegistrationSuccessActivity.MediaBrowserCompat();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i3 = d + 91;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                indonesianMigrantWorkerRegistrationSuccessActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            }
            int i5 = asBinder + 19;
            d = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        indonesianMigrantWorkerRegistrationSuccessActivity.IconCompatParcelizer();
        final Registration registration = (Registration) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        ActivityIndonesianMigrantWorkerRegistrationSuccessBinding activityIndonesianMigrantWorkerRegistrationSuccessBinding = (ActivityIndonesianMigrantWorkerRegistrationSuccessBinding) ((ViewBinding) indonesianMigrantWorkerRegistrationSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        ImageView imageView = activityIndonesianMigrantWorkerRegistrationSuccessBinding.imgSuccess;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        TextView textView = activityIndonesianMigrantWorkerRegistrationSuccessBinding.tvRegistrationSuccess;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        TextView textView2 = activityIndonesianMigrantWorkerRegistrationSuccessBinding.tvRegistrationSuccessMessage;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        MaterialButton materialButton = activityIndonesianMigrantWorkerRegistrationSuccessBinding.btnPaymentProcess;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setVisibility(0);
        activityIndonesianMigrantWorkerRegistrationSuccessBinding.btnPaymentProcess.setOnClickListener(new View.OnClickListener() { // from class: ArchTaskExecutor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndonesianMigrantWorkerRegistrationSuccessActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, registration, view);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(IndonesianMigrantWorkerRegistrationSuccessActivity indonesianMigrantWorkerRegistrationSuccessActivity, Registration registration, View view) {
        int i = 2 % 2;
        int i2 = d + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            PaymentActivity.Companion companion = PaymentActivity.INSTANCE;
            PaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(indonesianMigrantWorkerRegistrationSuccessActivity, registration);
            ViewPortBuilder.b();
            int i4 = asBinder + 123;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    static {
        cancel = 0;
        g();
        INSTANCE = new Companion(null);
        int i = cancelAll + 19;
        cancel = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentbindingInflater1 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_password_empty).substring(7, 8).length() + 1806847703;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(1081481732, getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, length, iTuitionPaymentFragmentbindingInflater1, -1081481730, new Object[]{this});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentbindingInflater1 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(-2110087328, getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 2110087328, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2023229294;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(1365662643, getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, i, -1365662642, new Object[]{this, bundle});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = d + 7;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 56189;
        asInterface = (char) 6948;
        f552a = (char) 40490;
        g = (char) 284;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
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
    private static java.lang.String $$i(byte r7, byte r8, byte r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity.$$c
            int r7 = r7 * 4
            int r7 = 108 - r7
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2a:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity.$$i(byte, byte, byte):java.lang.String");
    }
}
