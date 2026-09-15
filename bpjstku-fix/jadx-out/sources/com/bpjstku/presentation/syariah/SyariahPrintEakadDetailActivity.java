package com.bpjstku.presentation.syariah;

import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.provider.MediaStore;
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
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.android.volley.toolbox.HttpHeaderParser;
import com.bpjstku.R;
import com.bpjstku.data.syariah.model.request.SyariahEakadPdfRequest;
import com.bpjstku.databinding.ActivitySyariahPrintEakadDetailBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.auth.api.accounttransfer.zzn;
import com.google.android.material.button.MaterialButton;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.AutoValue_MediaSpec1;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.createCaptureSession;
import defpackage.deriveCodec;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.updateSession;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0013\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0015\u0010\u0016\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00178\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0015\u0010\u001a\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0015\u0010\u0006\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0015\u0010\n\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u001f8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\b\u001a\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\"R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010%"}, d2 = {"Lcom/bpjstku/presentation/syariah/SyariahPrintEakadDetailActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivitySyariahPrintEakadDetailBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "onDestroy", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LoutputFormatToAudioProfile;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LupdateSession;", "LupdateSession;", "LacquireBuffer;", "TuitionPaymentFragmentbindingInflater1", "LcreateCaptureSession;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/domain/user/model/User;", "d", "", "[B", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SyariahPrintEakadDetailActivity extends BindingBaseActivity<ActivitySyariahPrintEakadDetailBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asBinder;
    private static short[] cancel;
    private static byte[] cancelAll;
    private static int getInterfaceDescriptor;
    private static int notify;
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private updateSession b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private byte[] g;
    private static final byte[] $$c = {51, -99, -8, -59};
    private static final int $$f = 124;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {119, -103, 14, -22, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 133;
    private static int RemoteActionCompatParcelizer = 1;
    private static int onTransact = 0;
    private static int INotificationSideChannelStub = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: isZoomOverrideAvailable
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
            int iB = zzn.b();
            return (outputFormatToAudioProfile) SyariahPrintEakadDetailActivity.TuitionPaymentFragmentbindingInflater1(zzn.b(), 1432411252, -1432411252, zzn.b(), zzn.b(), iB, objArr);
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: toCameraCharacteristicsCompat
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1};
            int iB = zzn.b();
            return (String) SyariahPrintEakadDetailActivity.TuitionPaymentFragmentbindingInflater1(zzn.b(), -1219274539, 1219274540, zzn.b(), zzn.b(), iB, objArr);
        }
    });
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: isKeyNonCacheable
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SyariahPrintEakadDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = i2 | i3;
        int i8 = ~i6;
        int i9 = i7 | i8;
        int i10 = ~(i8 | i2);
        int i11 = (~i7) | i10;
        int i12 = i10 | (~((~i2) | (~i3)));
        int i13 = i2 + i3 + i4 + (1699743442 * i) + (2071835342 * i5);
        int i14 = i13 * i13;
        int i15 = ((i2 * (-557635572)) - 1375207424) + ((-557635572) * i3) + (i9 * (-2106796043)) + (2106796043 * i11) + ((-2106796043) * i12) + (1630535680 * i4) + ((-648019968) * i) + ((-1801453568) * i5) + (1296564224 * i14);
        int i16 = ((i2 * (-355764420)) - 259725689) + (i3 * (-355764420)) + (i9 * 521) + (i11 * (-521)) + (i12 * 521) + (i4 * (-355763899)) + (i * 2119243930) + (i5 * (-943812730)) + (i14 * (-597164032));
        int i17 = i15 + (i16 * i16 * 58195968);
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i17 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i17 == 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        int i18 = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile((SyariahPrintEakadDetailActivity) objArr[0]);
        int i19 = onTransact + 33;
        INotificationSideChannelStub = i19 % 128;
        int i20 = i19 % 2;
        return outputformattoaudioprofile;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r7 = r7 + 1
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity.c(byte, int, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ ActivitySyariahPrintEakadDetailBinding TuitionPaymentFragmentbindingInflater1(SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        ActivitySyariahPrintEakadDetailBinding activitySyariahPrintEakadDetailBinding = (ActivitySyariahPrintEakadDetailBinding) ((ViewBinding) syariahPrintEakadDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i4 = onTransact + 105;
        INotificationSideChannelStub = i4 % 128;
        int i5 = i4 % 2;
        return activitySyariahPrintEakadDetailBinding;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity, String str) {
        int i = 2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = syariahPrintEakadDetailActivity.getString(R.string.title_error_label);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = syariahPrintEakadDetailActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, str, string, string2, null, 112);
        FragmentManager supportFragmentManager = syariahPrintEakadDetailActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i2 = INotificationSideChannelStub + 65;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i4 = onTransact + 73;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
        }
        getstringornullB.INotificationSideChannel = syariahPrintEakadDetailActivity.new b();
        int i6 = INotificationSideChannelStub + 85;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ updateSession d(SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 73;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        updateSession updatesession = syariahPrintEakadDetailActivity.b;
        int i5 = i3 + 87;
        INotificationSideChannelStub = i5 % 128;
        if (i5 % 2 != 0) {
            return updatesession;
        }
        throw null;
    }

    public SyariahPrintEakadDetailActivity() {
        final SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = syariahPrintEakadDetailActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<createCaptureSession>() { // from class: com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, createCaptureSession] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ createCaptureSession invoke() {
                LifecycleOwner lifecycleOwner = syariahPrintEakadDetailActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(createCaptureSession.class);
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
        this.asBinder = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = syariahPrintEakadDetailActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/syariah/SyariahPrintEakadDetailActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, SyariahPrintEakadDetailActivity.class, new Pair[]{TuplesKt.to("worker_code", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivitySyariahPrintEakadDetailBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        SyariahPrintEakadDetailActivity$bindingInflater$1 syariahPrintEakadDetailActivity$bindingInflater$1 = SyariahPrintEakadDetailActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return syariahPrintEakadDetailActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivitySyariahPrintEakadDetailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnSaveEakad;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: CameraCharacteristicsCompat
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SyariahPrintEakadDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        int i2 = onTransact + 93;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((createCaptureSession) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(this, new Observer() { // from class: CameraCharacteristicsCompatCameraCharacteristicsCompatImpl
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws IOException {
                SyariahPrintEakadDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = onTransact + 59;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements getStringOrNull.b {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            SyariahPrintEakadDetailActivity.this.d_();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = onTransact + 5;
        INotificationSideChannelStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        final createCaptureSession createcapturesession = (createCaptureSession) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        User user = (User) this.d.getValue();
        if (user != null) {
            str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = onTransact + 101;
            INotificationSideChannelStub = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str = null;
        }
        SyariahEakadPdfRequest syariahEakadPdfRequest = new SyariahEakadPdfRequest(String.valueOf(str), (String) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        Intrinsics.checkNotNullParameter(syariahEakadPdfRequest, "");
        MutableLiveData<VirtualCameraAdapter1<InputStream>> mutableLiveData = createcapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(createcapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(syariahEakadPdfRequest)));
        final Function1 function1 = new Function1() { // from class: CameraDeviceCompatStateCallbackExecutorWrapperExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return createCaptureSession.b(createcapturesession, (InputStream) obj2);
            }
        };
        logToString logtostring = new logToString() { // from class: lambdaonOpened0androidxcameracamera2internalcompatCameraDeviceCompatStateCallbackExecutorWrapper
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function1.invoke(obj2);
            }
        };
        final Function1 function2 = new Function1() { // from class: CameraDeviceCompatApi23Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return createCaptureSession.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createcapturesession, (Throwable) obj2);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: CameraDeviceCompatStateCallbackExecutorWrapperExternalSyntheticLambda3
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function2.invoke(obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        createcapturesession.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity = this;
        Intrinsics.checkNotNullParameter(syariahPrintEakadDetailActivity, "");
        syariahPrintEakadDetailActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(((ActivitySyariahPrintEakadDetailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, "Layanan Syariah", true);
        this.b = new updateSession(this);
        int i2 = INotificationSideChannelStub + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01b4 A[PHI: r0
  0x01b4: PHI (r0v9 int) = (r0v8 int), (r0v41 int) binds: [B:38:0x01b2, B:35:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x01b6 A[PHI: r0
  0x01b6: PHI (r0v38 int) = (r0v8 int), (r0v41 int) binds: [B:38:0x01b2, B:35:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(notify)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 2268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 34, 1387473586, false, $$i(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 111;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = cancelAll;
                char c = '0';
                if (bArr != null) {
                    int i9 = $10 + 51;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 3357 - TextUtils.lastIndexOf("", c), 17 - ((byte) KeyEvent.getModifierMetaStateMask()), -1054011043, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i11++;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = cancelAll;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), View.getDefaultSize(0, 0) + 2267, 32 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1387473586, false, $$i(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) notify) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) cancel[i3 + ((int) (((long) asBinder) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) notify) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i12 = $10 + 103;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    i4 = ((i3 % iIntValue) % 5) % ((int) (((long) asBinder) | 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i3 + iIntValue) - 2) + ((int) (((long) asBinder) ^ 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                try {
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(INotificationSideChannel), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - TextUtils.getCapsMode("", 0, 0)), 2855 - View.MeasureSpec.makeMeasureSpec(0, 0), 13 - Color.green(0), -1529949196, false, $$i(b7, b8, (byte) (b8 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = cancelAll;
                    if (bArr4 != null) {
                        int i13 = $11 + 29;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i15 = 0; i15 < length2; i15++) {
                            bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 3046761265686732006L);
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i16 = $11 + 59;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i18 = $11 + 67;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        if (!z2) {
                            short[] sArr = cancel;
                            int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            byte[] bArr6 = cancelAll;
                            int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i21]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                        int i22 = $10 + 1;
                        $11 = i22 % 128;
                        int i23 = i22 % 2;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static final class b implements getStringOrNull.b {
        b() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            SyariahPrintEakadDetailActivity.this.d_();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity = (SyariahPrintEakadDetailActivity) objArr[0];
        int i = 2 % 2;
        super.onDestroy();
        updateSession updatesession = syariahPrintEakadDetailActivity.b;
        if (updatesession == null) {
            int i2 = onTransact + 45;
            INotificationSideChannelStub = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                throw null;
            }
            updatesession = null;
        }
        updatesession.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i4 = onTransact + 17;
        INotificationSideChannelStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        INotificationSideChannelStub = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
                int i3 = onTransact + 27;
                INotificationSideChannelStub = i3 % 128;
                int i4 = i3 % 2;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i2 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
            int jumpTapTimeout = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            short s = $$a[7];
            Object[] objArr2 = new Object[1];
            c((byte) 52, s, (byte) s, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, jumpTapTimeout, 1357589585, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 603659410, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step3).substring(97, 99).codePointAt(0) - 191, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlStatusCardWarningTitle).substring(0, 20).length() - 20), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98), (-1728971266) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_name_on_card).substring(0, 3).codePointAt(1) + 603659353, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 108, (short) Color.argb(0, 0, 0, 0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (-1728971244) - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
            int i3 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte b2 = (byte) 52;
            Object[] objArr5 = new Object[1];
            c(b2, b2, $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, threadPriority, i3, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                int i4 = 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte[] bArr = $$a;
                byte b3 = bArr[7];
                Object[] objArr6 = new Object[1];
                c(b3, (short) (b3 | 104), bArr[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iResolveSizeAndState, i4, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
            int i8 = ~i7;
            int i9 = ((((-1247104550) + (((~(i8 | (-622483424))) | 866763593) * (-1042))) + (((-622483424) | i7) * 521)) + ((((~(i7 | (-866763594))) | 312573952) | (~(i8 | (-68293783)))) * 521)) - 1145302722;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 603659419, View.MeasureSpec.makeMeasureSpec(0, 0) - 96, (short) View.resolveSizeAndState(0, 0, 0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step6).substring(6, 7).codePointAt(0) - 32), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1728971241, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 603659418, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.btn_save_card).substring(1, 2).codePointAt(0) - 197, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step4).substring(29, 32).codePointAt(2) - 116), (-1728971215) - Gravity.getAbsoluteGravity(0, 0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {804568335};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1133, 18 - (ViewConfiguration.getLongPressTimeout() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1145302722, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
                    int i12 = 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    short s2 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, s2, (byte) s2, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, packedPositionChild, i12, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45992), 1117 - (KeyEvent.getMaxKeyCode() >> 16), 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                    int packedPositionGroup = 1031 - ExpandableListView.getPackedPositionGroup(0L);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 16;
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[7];
                    Object[] objArr13 = new Object[1];
                    c(b4, (short) (b4 | 104), bArr2[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, packedPositionGroup, iIndexOf, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.retrofit_network_message).substring(4, 5).codePointAt(0) + 603659338, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_title).substring(18, 19).codePointAt(0) - 122, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step2).substring(17, 18).codePointAt(0) - 1728971362, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 603659343, (-98) - MotionEvent.axisFromString(""), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_telkomsel_cash).substring(1, 3).length() - 2), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step6).substring(0, 1).length() - 1728971245, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0');
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
                        byte b5 = (byte) 52;
                        Object[] objArr16 = new Object[1];
                        c(b5, b5, $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, iLastIndexOf, iLastIndexOf2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char mirror2 = (char) ('0' - AndroidCharacter.getMirror('0'));
                        int i13 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int i14 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                        short s3 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, s3, (byte) s3, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(mirror2, i13, i14, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i17 = INotificationSideChannelStub + 83;
                onTransact = i17 % 128;
                int i18 = i17 % 2;
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[3])[0];
        int i21 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i22 = ~(System.identityHashCode(this) | 130871728);
        int i23 = i19 + (-2129725557) + (((-113408442) | i22) * (-220)) + ((i22 | (-131004858)) * 220) + 1950249950;
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr18[2])[0] = i25 ^ (i25 << 5);
        int i26 = INotificationSideChannelStub + 1;
        onTransact = i26 % 128;
        if (i26 % 2 != 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
                int threadPriority2 = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                Object[] objArr19 = new Object[1];
                c((byte) 37, (short) 104, $$a[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(fadingEdgeLength, longPressTimeout, threadPriority2, 986134021, false, (String) objArr19[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null);
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
            int deadChar2 = 1755 - KeyEvent.getDeadChar(0, 0);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
            Object[] objArr20 = new Object[1];
            c((byte) 37, (short) 104, $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(keyRepeatTimeout, deadChar2, maximumDrawingCacheSize, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                int offsetAfter = 1755 - TextUtils.getOffsetAfter("", 0);
                int maxKeyCode = 23 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b6 = (byte) 52;
                Object[] objArr21 = new Object[1];
                c(b6, b6, $$a[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(bitsPerPixel, offsetAfter, maxKeyCode, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i27 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i28 = ((((-1624179305) + (((~((~i27) | (-805309746))) | (~((-2650631) | i27))) * (-302))) + ((~((-805309746) | i27)) * (-604))) + (((~(i27 | (-807960376))) | (-1023213432)) * 302)) - 1925609316;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 603659444, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_kioson).substring(1, 3).codePointAt(0) - 193, (short) ExpandableListView.getPackedPositionType(0L), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_address).substring(0, 6).codePointAt(1) - 108), (-1728971231) - TextUtils.lastIndexOf("", '0', 0), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 603659443, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step8).substring(31, 33).codePointAt(0) - 195, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 1728971324, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {804568335};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) (42049 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1726, 29 - KeyEvent.normalizeMetaState(0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).newInstance(objArr25), -1925609316);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char deadChar3 = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
                int absoluteGravity = 23 - Gravity.getAbsoluteGravity(0, 0);
                byte b7 = (byte) 52;
                Object[] objArr26 = new Object[1];
                c(b7, b7, $$a[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(deadChar3, iLastIndexOf3, absoluteGravity, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 603659337, View.resolveSize(0, 0) - 90, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_bank_transfer).substring(1, 3).codePointAt(1) - 121), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_2).substring(5, 6).length() - 1), ExpandableListView.getPackedPositionChild(0L) - 1728971264, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1064).substring(0, 61).length() + 603659389, (-97) - KeyEvent.getDeadChar(0, 0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step8).substring(31, 33).codePointAt(0) - 99), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1051).substring(0, 32).length() - 32), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1728971280, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                    int iIndexOf2 = 1755 - TextUtils.indexOf("", "");
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, (short) ($$b | 8), $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cArgb, iIndexOf2, doubleTapTimeout, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char doubleTapTimeout2 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1755;
                    int iIndexOf3 = 23 - TextUtils.indexOf("", "", 0);
                    Object[] objArr30 = new Object[1];
                    c((byte) 37, (short) 104, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(doubleTapTimeout2, iMakeMeasureSpec, iIndexOf3, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i32 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i32 == i31) {
            int i33 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int iNextInt = new Random().nextInt();
            int i34 = i33 + (-1171267291) + (((~(367015749 | iNextInt)) | 579618175) * (-366)) + (((~(iNextInt | 938243967)) | 8389957) * 366);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr31[3])[0] = i36 ^ (i36 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
        if (strArr4 != null) {
            int i37 = 0;
            while (i37 < strArr4.length) {
                int i38 = onTransact + 21;
                INotificationSideChannelStub = i38 % 128;
                if (i38 % 2 == 0) {
                    arrayList2.add(strArr4[i37]);
                    i37 += 88;
                } else {
                    arrayList2.add(strArr4[i37]);
                    i37++;
                }
            }
        }
        int[] iArr = new int[i32];
        int i39 = i32 - 1;
        iArr[i39] = 1;
        Toast.makeText((Context) null, iArr[((i32 * i39) % 2) - 1], 1).show();
        int i40 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int i41 = (int) Runtime.getRuntime().totalMemory();
        int i42 = i40 + 1747260619 + (((~((~i41) | (-554172449))) | (~((-67376211) | i41))) * (-302)) + ((~((-554172449) | i41)) * (-604)) + (((~(i41 | (-621548659))) | (-901527295)) * 302);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr32[3])[0] = i44 ^ (i44 << 5);
        int i45 = INotificationSideChannelStub + 105;
        onTransact = i45 % 128;
        if (i45 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x009e  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 25;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = 548470712 + ((~(iIdentityHashCode | 473039903)) * 216);
            int i5 = ~iIdentityHashCode;
            if (i3 != i4 + ((1572511487 | i5) * (-216)) + (((~(i5 | 473039903)) | (-1303027447)) * 216)) {
                int[] iArr = new int[333432612];
                iArr[333432611] = 1;
                int i6 = (-809421332) % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
                int i7 = onTransact + 77;
                INotificationSideChannelStub = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            int i9 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i11 = ~i10;
            int i12 = (-1829464504) + (((~((-966961451) | i11)) | 278964522 | (~(1796948993 | i11)) | (~((-1108952066) | i10))) * (-84));
            int i13 = (~(i10 | 1796948993)) | 966961450;
            int i14 = ~(i11 | (-1796948994));
            if (i9 != i12 + ((i13 | i14) * (-84)) + ((1108952065 | i14) * 84)) {
                int[] iArr2 = new int[333432612];
                iArr2[333432611] = 1;
                int i15 = (-809421332) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
                int i16 = onTransact + 77;
                INotificationSideChannelStub = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        int i18 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyTid = Process.myTid();
        int i19 = ~iMyTid;
        int i20 = 285486044 + (((~((-541853191) | i19)) | (~(1617704726 | iMyTid))) * 520);
        int i21 = ~((-1617704727) | i19);
        int i22 = ~(iMyTid | 961351238);
        if (i18 != i20 + ((i21 | i22) * (-1040)) + ((i22 | (~(i19 | (-961351239))) | 1075851536) * 520)) {
            throw null;
        }
        super.onResume();
        int i23 = INotificationSideChannelStub + 59;
        onTransact = i23 % 128;
        if (i23 % 2 != 0) {
            int i24 = 42 / 0;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1240604493
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            java.lang.String r4 = "android.app.ActivityThread"
            java.lang.Class r5 = java.lang.Class.forName(r4)
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.String r7 = "currentApplication"
            java.lang.reflect.Method r5 = r5.getMethod(r7, r6)
            r6 = r3
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.lang.Object r5 = r5.invoke(r3, r3)
            android.content.Context r5 = (android.content.Context) r5
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.keyboard
            int r6 = ~r5
            r8 = -913791778(0xffffffffc988a4de, float:-1119387.8)
            r8 = r8 | r6
            int r8 = ~r8
            r9 = 269486593(0x10100a01, float:2.84067E-29)
            r8 = r8 | r9
            r9 = -1099474137(0xffffffffbe775b27, float:-0.24155866)
            r5 = r5 | r9
            int r5 = ~r5
            r8 = r8 | r5
            int r8 = r8 * (-502)
            r9 = 1308295966(0x4dfb031e, float:5.264107E8)
            int r9 = r9 + r8
            r8 = -644305185(0xffffffffd998aedf, float:-5.3720587E15)
            r6 = r6 | r8
            int r6 = ~r6
            r5 = r5 | r6
            int r5 = r5 * 502
            int r9 = r9 + r5
            if (r1 == r9) goto L73
            int r1 = com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity.INotificationSideChannelStub
            int r1 = r1 + 121
            int r5 = r1 % 128
            com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity.onTransact = r5
            int r1 = r1 % r0
            r1 = -1240604493(0xffffffffb60de0b3, float:-2.114143E-6)
            int[] r1 = new int[r1]
            r5 = -1240604494(0xffffffffb60de0b2, float:-2.1141427E-6)
            r6 = 1
            r1[r5] = r6
            r5 = 1700387958(0x6559dc76, float:6.430127E22)
            int r5 = r5 % r0
            r5 = -1
            r1 = r1[r5]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r6)
            r1.show()
        L73:
            java.lang.reflect.Member[] r1 = defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            java.lang.Class r4 = java.lang.Class.forName(r4)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r2 = r4.getMethod(r7, r2)
            java.lang.Object r2 = r2.invoke(r3, r3)
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.densityDpi
            r3 = -1745928902(0xffffffff97ef3d3a, float:-1.5460469E-24)
            r4 = r3 | r2
            int r4 = ~r4
            r5 = 30017570(0x1ca0822, float:7.421475E-38)
            r4 = r4 | r5
            int r4 = r4 * (-756)
            r5 = 869825148(0x33d87a7c, float:1.00805636E-7)
            int r5 = r5 + r4
            int r2 = ~r2
            r2 = r2 | r3
            int r2 = r2 * 756
            int r5 = r5 + r2
            if (r1 != r5) goto Lbb
            super.onStart()
            int r1 = com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity.onTransact
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity.INotificationSideChannelStub = r2
            int r1 = r1 % r0
            return
        Lbb:
            r1 = -827556874(0xffffffffceac7bf6, float:-1.4469025E9)
            int r1 = r1 % r0
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i6 = ~i5;
        if (i4 != (-560596301) + (((~((-416509818) | i6)) | (~(i5 | (-1246497361)))) * 333) + (((~(i5 | (-416509818))) | (~(i6 | (-1246497361)))) * 333)) {
            int i7 = 892601324 % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i9 = ~iIdentityHashCode;
        if (i8 != 1308319110 + (((~((-169122788) | i9)) | 1885034118) * (-865)) + ((~(iIdentityHashCode | 169122787)) * 865) + (((~(1885034118 | i9)) | (~(i9 | 169122787))) * 865)) {
            throw new RuntimeException("1537492102");
        }
        super.onCreate(bundle);
        int i10 = onTransact + 19;
        INotificationSideChannelStub = i10 % 128;
        int i11 = i10 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity = (SyariahPrintEakadDetailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = syariahPrintEakadDetailActivity.getIntent().getStringExtra("worker_code");
        Intrinsics.checkNotNull(stringExtra);
        int i4 = INotificationSideChannelStub + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity, Boolean bool) {
        FileOutputStream fileOutputStreamOpenOutputStream;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (bool.booleanValue()) {
            byte[] bArr = syariahPrintEakadDetailActivity.g;
            if (bArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                bArr = null;
            }
            Intrinsics.checkNotNullParameter(bArr, "");
            syariahPrintEakadDetailActivity.MediaBrowserCompat();
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            String strReplace$default = StringsKt.replace$default(string, "-", "", false, 4, (Object) null);
            StringBuilder sb = new StringBuilder("E-Akad_");
            sb.append(strReplace$default);
            sb.append(".pdf");
            String string2 = sb.toString();
            if (Build.VERSION.SDK_INT < 30) {
                String path = Environment.getExternalStorageDirectory().getPath();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(path);
                sb2.append("/JMO");
                String string3 = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string3);
                sb3.append("/E-Akad");
                File file = new File(sb3.toString());
                Intrinsics.checkNotNullParameter(file, "");
                Intrinsics.checkNotNullParameter(string2, "");
                if (!file.exists()) {
                    file.mkdirs();
                    int i4 = INotificationSideChannelStub + 47;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                }
                fileOutputStreamOpenOutputStream = new FileOutputStream(new File(file, string2));
            } else {
                ContentResolver contentResolver = syariahPrintEakadDetailActivity.getContentResolver();
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", string2);
                contentValues.put("mime_type", "application/pdf");
                contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                fileOutputStreamOpenOutputStream = uriInsert != null ? contentResolver.openOutputStream(uriInsert) : null;
            }
            if (fileOutputStreamOpenOutputStream != null) {
                OutputStream outputStream = fileOutputStreamOpenOutputStream;
                try {
                    outputStream.write(bArr);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(outputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(outputStream, th);
                        throw th2;
                    }
                }
            }
            syariahPrintEakadDetailActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Simpan E-Akad berhasil", 0).show();
            int i6 = onTransact + 3;
            INotificationSideChannelStub = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 2;
            }
        } else {
            SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity2 = syariahPrintEakadDetailActivity;
            String string4 = syariahPrintEakadDetailActivity.getString(R.string.message_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            AutoValue_LifecycleCameraRepository_Key.b(syariahPrintEakadDetailActivity2, string4);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) syariahPrintEakadDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
        final Function1 function1 = new Function1() { // from class: CameraDeviceCompat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SyariahPrintEakadDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (Boolean) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: toCameraCharacteristics
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                SyariahPrintEakadDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) syariahPrintEakadDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 105;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws IOException {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 5;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            syariahPrintEakadDetailActivity.MediaBrowserCompat();
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i5 = i3 + 15;
                INotificationSideChannelStub = i5 % 128;
                int i6 = i5 % 2;
                syariahPrintEakadDetailActivity.IconCompatParcelizer();
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = syariahPrintEakadDetailActivity.getString(R.string.title_error_label);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string2 = syariahPrintEakadDetailActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_failed, string, strValueOf, string2, null, 112);
                FragmentManager supportFragmentManager = syariahPrintEakadDetailActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                getstringornullB.INotificationSideChannel = syariahPrintEakadDetailActivity.new TuitionPaymentFragmentbindingInflater1();
                return;
            }
            return;
        }
        syariahPrintEakadDetailActivity.IconCompatParcelizer();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i7 = ((InputStream) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).read(bArr);
            if (i7 < 0) {
                byteArrayOutputStream.flush();
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                syariahPrintEakadDetailActivity.g = ByteStreamsKt.readBytes(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                Intrinsics.checkNotNullParameter(byteArrayInputStream, "");
                kotlinx.coroutines.b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(syariahPrintEakadDetailActivity), null, null, new SyariahPrintEakadDetailActivity$showEakad$1(syariahPrintEakadDetailActivity, byteArrayInputStream, null), 3, null);
                return;
            }
            byteArrayOutputStream.write(bArr, 0, i7);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 31;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
        } else {
            function1.invoke(obj);
            int i3 = 94 / 0;
        }
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault1(SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) syariahPrintEakadDetailActivity.asBinder.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
        int i3 = 75 / 0;
        return ((ActivityResultContractsPickVisualMediaMediaCapabilities) syariahPrintEakadDetailActivity.asBinder.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity) {
        int iB = zzn.b();
        int iB2 = zzn.b();
        return (String) TuitionPaymentFragmentbindingInflater1(zzn.b(), -1219274539, 1219274540, iB2, zzn.b(), iB, new Object[]{syariahPrintEakadDetailActivity});
    }

    public static /* synthetic */ outputFormatToAudioProfile b(SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity) {
        int iB = zzn.b();
        int iB2 = zzn.b();
        return (outputFormatToAudioProfile) TuitionPaymentFragmentbindingInflater1(zzn.b(), 1432411252, -1432411252, iB2, zzn.b(), iB, new Object[]{syariahPrintEakadDetailActivity});
    }

    static {
        getInterfaceDescriptor = 0;
        g();
        INSTANCE = new Companion(null);
        int i = RemoteActionCompatParcelizer + 105;
        getInterfaceDescriptor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        int i3 = i2 % 128;
        INotificationSideChannelStub = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 99;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_syariah_print_eakad_detail;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int iB = zzn.b();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_via_xl_tunai).substring(19, 20).codePointAt(0) + 1187604772;
        TuitionPaymentFragmentbindingInflater1(HttpHeaderParser.TuitionPaymentFragmentbindingInflater1(), -749147508, 749147511, iCodePointAt, HttpHeaderParser.TuitionPaymentFragmentbindingInflater1(), iB, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iTuitionPaymentFragmentbindingInflater1 = HttpHeaderParser.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(zzn.b(), 1574552460, -1574552458, zzn.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_tablet_step5).substring(28, 29).codePointAt(0) - 651433777, iTuitionPaymentFragmentbindingInflater1, new Object[]{this});
    }

    static void g() {
        asBinder = -341614873;
        notify = -1934795626;
        INotificationSideChannel = 1353301837;
        cancelAll = new byte[]{-18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -26, -26, -26, -26};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        SyariahPrintEakadDetailActivity syariahPrintEakadDetailActivity = (SyariahPrintEakadDetailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 93;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = INotificationSideChannelStub + 61;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r7, short r8, int r9) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r9 = 121 - r9
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahPrintEakadDetailActivity.$$i(int, short, int):java.lang.String");
    }
}
