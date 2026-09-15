package com.bpjstku.presentation.digitalcard;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.registration.bpu.model.request.UpdateProfileBpuRequest;
import com.bpjstku.databinding.ActivityChangeTuitionBpuMembershipBinding;
import com.bpjstku.domain.digitalcard.model.BPUMembershipInformation;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.digitalcard.ChangeTuitionBpuMembership;
import com.bpjstku.presentation.membership.payment.PaymentActivity;
import com.bpjstku.presentation.membership.registration.model.TuitionRate;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityWorkTerminationParticipantActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.auth.zzgx;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.BufferProviderState;
import defpackage.CameraUseCaseAdapter;
import defpackage.CustomTabsIntent;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.deInitSession;
import defpackage.deriveCodec;
import defpackage.getCameraOperatingMode;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getImeOptions;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00158\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00188\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\r8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0015\u0010\n\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010 R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010#R\u0014\u0010%\u001a\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010$"}, d2 = {"Lcom/bpjstku/presentation/digitalcard/ChangeTuitionBpuMembership;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityChangeTuitionBpuMembershipBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "Lcom/bpjstku/domain/user/model/User;", "TuitionPaymentFragmentbindingInflater1", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "Ljava/lang/String;", "Z", "Lcom/bpjstku/presentation/membership/registration/model/TuitionRate;", "Lcom/bpjstku/presentation/membership/registration/model/TuitionRate;", "g", "LgetImeOptions;", "Lcom/bpjstku/domain/digitalcard/model/BPUMembershipInformation;", "Lcom/bpjstku/domain/digitalcard/model/BPUMembershipInformation;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "()I", "d"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangeTuitionBpuMembership extends BindingBaseActivity<ActivityChangeTuitionBpuMembershipBinding> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char cancelAll;
    private static char[] d;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private TuitionRate g;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private BPUMembershipInformation a;
    private static final byte[] $$c = {58, -103, 118, 14};
    private static final int $$f = 51;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {93, -122, -23, -24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 85;
    private static int onTransact = 1;
    private static int INotificationSideChannel = 0;
    private static int cancel = 1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: setVerticalOffset
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3};
            return (User) ChangeTuitionBpuMembership.TuitionPaymentFragmentbindingInflater1(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), objArr, 559320241, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), -559320238, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "L";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public boolean b = true;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        String str;
        String str2;
        String str3;
        String str4;
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i);
        int i11 = (~i) | i7;
        int i12 = i10 | (~(i11 | i5));
        int i13 = (~(i | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i2));
        int i15 = i2 + i5 + i3 + (783392123 * i6) + ((-786872706) * i4);
        int i16 = i15 * i15;
        int i17 = (i2 * 375823119) + 1642083618 + (i5 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (375824245 * i3) + ((-117547465) * i6) + (763984278 * i4) + (i16 * (-763691008));
        int i18 = ((-1525980173) * i2) + 1729888256 + (218870266 * i5) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i3) + ((-1731985408) * i6) + ((-471334912) * i4) + ((-600899584) * i16) + (i17 * i17 * 1830354944);
        if (i18 == 1) {
            return b(objArr);
        }
        if (i18 == 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i18 == 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        ChangeTuitionBpuMembership changeTuitionBpuMembership = (ChangeTuitionBpuMembership) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i19 = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i20 = INotificationSideChannel + 43;
            cancel = i20 % 128;
            int i21 = i20 % 2;
            changeTuitionBpuMembership.MediaBrowserCompat();
            return null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return null;
            }
            changeTuitionBpuMembership.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(changeTuitionBpuMembership, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            return null;
        }
        changeTuitionBpuMembership.IconCompatParcelizer();
        VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
        Registration registration = (Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        User user = (User) changeTuitionBpuMembership.TuitionPaymentFragmentbindingInflater1.getValue();
        if (user != null) {
            str = user.b;
            int i22 = INotificationSideChannel + 101;
            cancel = i22 % 128;
            int i23 = i22 % 2;
        } else {
            str = null;
        }
        String strValueOf = String.valueOf(str);
        User user2 = (User) changeTuitionBpuMembership.TuitionPaymentFragmentbindingInflater1.getValue();
        String strValueOf2 = String.valueOf(user2 != null ? user2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
        User user3 = (User) changeTuitionBpuMembership.TuitionPaymentFragmentbindingInflater1.getValue();
        String strValueOf3 = String.valueOf(user3 != null ? user3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
        User user4 = (User) changeTuitionBpuMembership.TuitionPaymentFragmentbindingInflater1.getValue();
        String strValueOf4 = String.valueOf(user4 != null ? user4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
        User user5 = (User) changeTuitionBpuMembership.TuitionPaymentFragmentbindingInflater1.getValue();
        if (user5 != null) {
            str2 = user5.asBinder;
        } else {
            int i24 = INotificationSideChannel + 91;
            cancel = i24 % 128;
            int i25 = i24 % 2;
            str2 = null;
        }
        String strValueOf5 = String.valueOf(str2);
        User user6 = (User) changeTuitionBpuMembership.TuitionPaymentFragmentbindingInflater1.getValue();
        if (user6 != null) {
            int i26 = cancel + 1;
            INotificationSideChannel = i26 % 128;
            int i27 = i26 % 2;
            str3 = user6.g;
        } else {
            str3 = null;
        }
        String strValueOf6 = String.valueOf(str3);
        String str5 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancel;
        Intrinsics.checkNotNull(str5);
        String str6 = (String) StringsKt.split$default((CharSequence) str5, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
        Double d2 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelStubProxy;
        Double d3 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelStub;
        String str7 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a;
        String str8 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).IconCompatParcelizer;
        String str9 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).MediaBrowserCompat;
        User user7 = (User) changeTuitionBpuMembership.TuitionPaymentFragmentbindingInflater1.getValue();
        if (user7 != null) {
            int i28 = INotificationSideChannel + 43;
            cancel = i28 % 128;
            int i29 = i28 % 2;
            str4 = user7.asInterface;
        } else {
            str4 = null;
        }
        Registration registrationTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Registration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registration, false, null, null, null, null, null, str7, strValueOf2, String.valueOf(str4), strValueOf3, strValueOf4, strValueOf5, strValueOf6, str6, null, null, null, strValueOf, d3, d2, null, null, str9, ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).connect, str8, null, null, null, null, false, false, 2117189695);
        PaymentActivity.Companion companion = PaymentActivity.INSTANCE;
        PaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(changeTuitionBpuMembership, registrationTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return null;
    }

    private static void c(short s, short s2, short s3, Object[] objArr) {
        int i = 145 - s2;
        byte[] bArr = $$a;
        int i2 = (s3 * 14) + 84;
        byte[] bArr2 = new byte[s + 1];
        int i3 = -1;
        if (bArr == null) {
            i2 = (i2 + s) - 11;
            i++;
        }
        while (true) {
            i3++;
            bArr2[i3] = (byte) i2;
            if (i3 == s) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + bArr[i]) - 11;
                i++;
            }
        }
    }

    public ChangeTuitionBpuMembership() {
        final ChangeTuitionBpuMembership changeTuitionBpuMembership = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.digitalcard.ChangeTuitionBpuMembership$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = changeTuitionBpuMembership;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
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
        final ChangeTuitionBpuMembership changeTuitionBpuMembership2 = this;
        this.asBinder = LazyKt.lazy(new Function0<getImeOptions>() { // from class: com.bpjstku.presentation.digitalcard.ChangeTuitionBpuMembership$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getImeOptions, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getImeOptions invoke() {
                ComponentCallbacks componentCallbacks = changeTuitionBpuMembership2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getImeOptions.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.digitalcard.ChangeTuitionBpuMembership$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/digitalcard/ChangeTuitionBpuMembership$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/digitalcard/model/BPUMembershipInformation;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bpjstku/domain/digitalcard/model/BPUMembershipInformation;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, BPUMembershipInformation p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ChangeTuitionBpuMembership.class, new Pair[]{TuplesKt.to("bpu_info", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityChangeTuitionBpuMembershipBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = cancel + 57;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ChangeTuitionBpuMembership$bindingInflater$1 changeTuitionBpuMembership$bindingInflater$1 = ChangeTuitionBpuMembership$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = INotificationSideChannel + 39;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            return changeTuitionBpuMembership$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityChangeTuitionBpuMembershipBinding activityChangeTuitionBpuMembershipBinding = (ActivityChangeTuitionBpuMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        Button button = activityChangeTuitionBpuMembershipBinding.btnChangeTuitionBpu;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setForceShowIcon
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChangeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        EditText editText = activityChangeTuitionBpuMembershipBinding.tilChoseTuitionRate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: setGravity
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChangeTuitionBpuMembership.b(this.TuitionPaymentFragmentbindingInflater1, activityChangeTuitionBpuMembershipBinding, view);
                }
            });
        }
        AppCompatRadioButton appCompatRadioButton = activityChangeTuitionBpuMembershipBinding.rbProgramJkkJkmJht;
        Intrinsics.checkNotNullExpressionValue(appCompatRadioButton, "");
        appCompatRadioButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onGlobalLayout
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChangeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, activityChangeTuitionBpuMembershipBinding, (View) obj);
            }
        }));
        AppCompatRadioButton appCompatRadioButton2 = activityChangeTuitionBpuMembershipBinding.rbProgramJkkJkm;
        Intrinsics.checkNotNullExpressionValue(appCompatRadioButton2, "");
        appCompatRadioButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CascadingMenuPopup2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChangeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, activityChangeTuitionBpuMembershipBinding, (View) obj);
            }
        }));
        activityChangeTuitionBpuMembershipBinding.tvTitleBenefitProgram.setOnClickListener(new View.OnClickListener() { // from class: onItemHoverEnter
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, activityChangeTuitionBpuMembershipBinding, view);
            }
        });
        int i2 = cancel + 121;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r1
  0x001f: PHI (r1v5 android.content.Intent) = (r1v4 android.content.Intent), (r1v13 android.content.Intent) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        Intent intent;
        BPUMembershipInformation bPUMembershipInformation;
        int i = 2 % 2;
        int i2 = cancel + 67;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            intent = getIntent();
            int i3 = 35 / 0;
            if (intent != null) {
                bPUMembershipInformation = (BPUMembershipInformation) intent.getParcelableExtra("bpu_info");
                int i4 = INotificationSideChannel + 53;
                cancel = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = INotificationSideChannel + 41;
                cancel = i6 % 128;
                int i7 = i6 % 2;
                bPUMembershipInformation = null;
            }
        } else {
            intent = getIntent();
            if (intent != null) {
                bPUMembershipInformation = (BPUMembershipInformation) intent.getParcelableExtra("bpu_info");
                int i8 = INotificationSideChannel + 53;
                cancel = i8 % 128;
                int i9 = i8 % 2;
            } else {
                int i10 = INotificationSideChannel + 41;
                cancel = i10 % 128;
                int i11 = i10 % 2;
                bPUMembershipInformation = null;
            }
        }
        this.a = bPUMembershipInformation;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((getImeOptions) this.asBinder.getValue()).f943a.observe(this, new Observer() { // from class: CascadingMenuPopup3
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj};
                ChangeTuitionBpuMembership.TuitionPaymentFragmentbindingInflater1(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), objArr, 1329124860, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), -1329124860, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
            }
        });
        int i2 = INotificationSideChannel + 95;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = cancel + 115;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ChangeTuitionBpuMembership changeTuitionBpuMembership = this;
        Intrinsics.checkNotNullParameter(changeTuitionBpuMembership, "");
        changeTuitionBpuMembership.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityChangeTuitionBpuMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityChangeTuitionBpuMembershipBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_change_amount_tuition));
        int i4 = INotificationSideChannel + 81;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = cancel + 81;
        INotificationSideChannel = i2 % 128;
        try {
            if (i2 % 2 != 0) {
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
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = INotificationSideChannel + 97;
            cancel = i3 % 128;
            int i4 = i3 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        char c;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = d;
        int i5 = 1770390596;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 113;
                $11 = i7 % 128;
                if (i7 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 2268 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 33, -1927765101, false, $$i(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(obj, objArr2)).charValue();
                        i3 = 2;
                        i5 = 1770390596;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), Color.blue(0) + 2267, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33, -1927765101, false, $$i(b4, b5, (byte) (b5 + 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6++;
                    i3 = 2;
                    i5 = 1770390596;
                    obj = null;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(cancelAll)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b6 = (byte) 0;
            byte b7 = b6;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getOffsetBefore("", 0), 2267 - View.resolveSizeAndState(0, 0, 0), TextUtils.lastIndexOf("", '0', 0) + 34, -1927765101, false, $$i(b6, b7, (byte) (b7 + 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            char c2 = 11;
            int i8 = $10 + 11;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i9 = $11 + 51;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b * b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / b);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    }
                    c = c2;
                } else {
                    try {
                        Object[] objArr5 = new Object[13];
                        objArr5[12] = deinitsession;
                        objArr5[c2] = Integer.valueOf(cCharValue);
                        objArr5[10] = deinitsession;
                        objArr5[9] = deinitsession;
                        objArr5[8] = Integer.valueOf(cCharValue);
                        objArr5[7] = deinitsession;
                        objArr5[6] = deinitsession;
                        objArr5[5] = Integer.valueOf(cCharValue);
                        objArr5[4] = deinitsession;
                        objArr5[3] = deinitsession;
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[1] = deinitsession;
                        objArr5[0] = deinitsession;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (49266 - MotionEvent.axisFromString("")), 3261 - TextUtils.indexOf("", "", 0), 30 - View.MeasureSpec.getMode(0), -127612708, false, $$i(b8, b9, (byte) (b9 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                            int i10 = $10 + 11;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char deadChar = (char) (22878 - KeyEvent.getDeadChar(0, 0));
                                int i12 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 593;
                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 17;
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                String str$$i = $$i(b10, b11, b11);
                                c = 11;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, i12, jumpTapTimeout, 1570859318, false, str$$i, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c = 11;
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                        } else {
                            c = 11;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                            } else {
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                c2 = c;
            }
        }
        int i18 = $11 + 125;
        $10 = i18 % 128;
        int i19 = i18 % 2;
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int deadChar = 1031 - KeyEvent.getDeadChar(0, 0);
            int iGreen = 15 - Color.green(0);
            Object[] objArr2 = new Object[1];
            c((byte) 52, (short) 141, $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, deadChar, iGreen, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{24, 16, 7, '\n', '\r', 4, '\n', 5, 19, '\t', 3, 15, 14, 1, 24, '\b', 20, '\f', 4, 11, 7, '\t'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 47), TextUtils.getCapsMode("", 0, 0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{6, 4, 22, 1, '\t', 14, '\t', 20, 6, 24, 3, 21, 2, 23, 13842}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_4).substring(51, 53).codePointAt(1) - 95, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
            Object[] objArr5 = new Object[1];
            c((byte) 52, (short) ($$b + 4), $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iMakeMeasureSpec, scrollBarSize, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = INotificationSideChannel + 19;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 15;
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr6 = new Object[1];
                c(b, (short) (b | 37), bArr[132], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, keyRepeatTimeout, packedPositionType, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = (((-2095113071) + (((~(iIdentityHashCode | (-86364640))) | 330644809) * 191)) + (((~((~iIdentityHashCode) | (-86364640))) | 19206473) * 191)) - 703221580;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{21, 22, 16, 22, 1, 2, 24, 16, 5, 2, 16, '\r', 3, 24, 7, 24}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 96, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, '\b', 14, 24, 3, '\b', 21, '\r', 21, 1, 3, 14, 11, '\n', 6, 5}, (byte) (82 - TextUtils.indexOf("", "")), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_bank_transfer).substring(0, 7).length() + 9, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1460719335};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46039 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1134, (ViewConfiguration.getFadingEdgeLength() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -703221580, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                    int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, (short) 141, $$a[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, tapTimeout, iLastIndexOf, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - MotionEvent.axisFromString("")), 1117 - KeyEvent.getDeadChar(0, 0), View.resolveSize(0, 0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
                    int i9 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[7];
                    Object[] objArr13 = new Object[1];
                    c(b2, (short) (b2 | 37), bArr2[132], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, longPressTimeout, i9, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{24, 16, 7, '\n', '\r', 4, '\n', 5, 19, '\t', 3, 15, 14, 1, 24, '\b', 20, '\f', 4, 11, 7, '\t'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 72), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 89, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{6, 4, 22, 1, '\t', 14, '\t', 20, 6, 24, 3, 21, 2, 23, 13842}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 19), 15 - TextUtils.getOffsetAfter("", 0), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                        int i11 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        Object[] objArr16 = new Object[1];
                        c((byte) 52, (short) ($$b + 4), $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetAfter, i10, i11, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i12 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int i13 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, (short) 141, $$a[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatTimeout2, i12, i13, 1357589585, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 == null) {
                throw null;
            }
            int i14 = INotificationSideChannel + 67;
            cancel = i14 % 128;
            int i15 = i14 % 2;
            for (String str : strArr2) {
                arrayList.add(str);
            }
            throw null;
        }
        int i16 = INotificationSideChannel + 39;
        cancel = i16 % 128;
        int i17 = i16 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[3])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i21 = i18 + (-301799657) + (((~((~iIdentityHashCode2) | (-36634626))) | (~((-25203883) | iIdentityHashCode2))) * (-302)) + ((~((-36634626) | iIdentityHashCode2)) * (-604)) + (((~(iIdentityHashCode2 | (-61838508))) | (-331322560)) * 302);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr18[2])[0] = i23 ^ (i23 << 5);
        int i24 = INotificationSideChannel + 55;
        cancel = i24 % 128;
        int i25 = i24 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char scrollBarSize2 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
            int iAlpha = 1755 - Color.alpha(0);
            int i26 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
            byte b3 = (byte) 37;
            Object[] objArr19 = new Object[1];
            c(b3, b3, $$a[7], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarSize2, iAlpha, i26, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cCombineMeasuredStates = (char) (29944 - View.combineMeasuredStates(0, 0));
                int fadingEdgeLength = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int i27 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                Object[] objArr20 = new Object[1];
                c((byte) 52, (short) ($$b + 4), $$a[7], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cCombineMeasuredStates, fadingEdgeLength, i27, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i28 = ~iIdentityHashCode3;
            int i29 = (-484876560) + (((~((-75612231) | i28)) | 75595780) * 98) + (((~(i28 | (-136990196))) | (-75612231) | (~(136990195 | iIdentityHashCode3))) * (-49)) + (((~(iIdentityHashCode3 | (-75612231))) | (-212585976)) * 49) + 1666813380;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i31 ^ (i31 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{21, 22, 16, 22, 1, 2, 24, 16, 5, 2, 16, '\r', 3, 24, 7, 24}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step1).substring(1, 3).length() + 1), 15 - TextUtils.indexOf((CharSequence) "", '0'), objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{0, '\b', 14, 24, 3, '\b', 21, '\r', 21, 1, 3, 14, 11, '\n', 6, 5}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 46), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-1460719335};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1726 - Color.alpha(0), Color.blue(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 1666813380);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf2 = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
                int windowTouchSlop = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int i32 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22;
                Object[] objArr25 = new Object[1];
                c((byte) 52, (short) ($$b + 4), $$a[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf2, windowTouchSlop, i32, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{24, 16, 7, '\n', '\r', 4, '\n', 5, 19, '\t', 3, 15, 14, 1, 24, '\b', 20, '\f', 4, 11, 7, '\t'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 24), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{6, 4, 22, 1, '\t', 14, '\t', 20, 6, 24, 3, 21, 2, 23, 13842}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 19), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step3).substring(18, 19).length() + 14, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
                    int defaultSize = View.getDefaultSize(0, 0) + 1755;
                    int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                    short s = $$a[7];
                    Object[] objArr28 = new Object[1];
                    c((byte) 52, s, (byte) s, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(tapTimeout2, defaultSize, longPressTimeout2, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                    int pressedStateDuration = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int mirror = 'G' - AndroidCharacter.getMirror('0');
                    byte b4 = (byte) 37;
                    Object[] objArr29 = new Object[1];
                    c(b4, b4, $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollBarFadeDuration, pressedStateDuration, mirror, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i33 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0];
        int i34 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        if (i34 == i33) {
            int i35 = cancel + 43;
            INotificationSideChannel = i35 % 128;
            int i36 = i35 % 2;
            int i37 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
            int i38 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i39 = i37 + (-942315341) + (((~((~i38) | (-10569857))) | (~(111672311 | i38))) * (-302)) + ((~((-10569857) | i38)) * (-604)) + (((~(i38 | 101102455)) | 172341) * 302);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr30[3])[0] = i41 ^ (i41 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
        if (strArr4 != null) {
            int i42 = cancel + 115;
            INotificationSideChannel = i42 % 128;
            for (int i43 = i42 % 2 != 0 ? 1 : 0; i43 < strArr4.length; i43++) {
                arrayList2.add(strArr4[i43]);
            }
        }
        int[] iArr = new int[i34];
        int i44 = i34 - 1;
        iArr[i44] = 1;
        Toast.makeText((Context) null, iArr[((i34 * i44) % 2) - 1], 1).show();
        int i45 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i46 = (-984126977) + ((startElapsedRealtime | 609729994) * (-50));
        int i47 = ~((-542380107) | startElapsedRealtime);
        int i48 = ~startElapsedRealtime;
        int i49 = i45 + i46 + ((i47 | (~(939507674 | i48))) * 50) + (((~(i48 | 609729994)) | (~(397127568 | i48)) | (-939507675)) * 50);
        int i50 = (i49 << 13) ^ i49;
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr31[3])[0] = i51 ^ (i51 << 5);
        int i52 = cancel + 9;
        INotificationSideChannel = i52 % 128;
        if (i52 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 87;
        cancel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i3 != ((((~((-761996534) | iIdentityHashCode)) | 207824068) * (-283)) - 2145318444) + ((~(iIdentityHashCode | (-554172466))) * 283)) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iIdentityHashCode2 = System.identityHashCode(this);
            if (i4 != 1061083388 + ((~((-1150852378) | iIdentityHashCode2)) * (-301)) + (((~(1289395609 | iIdentityHashCode2)) | (~((~iIdentityHashCode2) | 459408066))) * (-301)) + (((~(iIdentityHashCode2 | (-459408067))) | 1289395609) * 301)) {
                throw null;
            }
        }
        int i5 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode3 = System.identityHashCode(this);
        if (i5 != (((~((-2066594156) | iIdentityHashCode3)) | 1705390746) * 398) + 237001142 + (((~((~iIdentityHashCode3) | (-2066594156))) | 1705390746) * 398)) {
            int i6 = 1500546334 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i7 = INotificationSideChannel + 35;
        cancel = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 117;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ~Process.myPid();
        if (i4 != 180779418 + (((~((-57395866) | i5)) | 887383408) * (-933)) + (((~(i5 | 887383408)) | (-938471418)) * 933) + 1704736480) {
            int i6 = cancel + 57;
            INotificationSideChannel = i6 % 128;
            int i7 = i6 % 2;
            int[] iArr = new int[1771839840];
            iArr[1771839839] = 1;
            int i8 = 129876640 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i9 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i10 = ~iIdentityHashCode;
        if (i9 != (((~((-1075118081) | i10)) | (~(1874281279 | iIdentityHashCode))) * 988) + 1345628272 + (((~(iIdentityHashCode | (-1779892766))) | 704774685 | (~(i10 | 1874281279))) * 988)) {
            throw null;
        }
        super.onStart();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b4, code lost:
    
        if (r0 != ((((-441534708) + (((~((-1670766845) | r3)) | (-908289121)) * (-948))) + ((~((~r3) | (-570515553))) * (-948))) + 638827164)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b6, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.digitalcard.ChangeTuitionBpuMembership.INotificationSideChannel + 71;
        com.bpjstku.presentation.digitalcard.ChangeTuitionBpuMembership.cancel = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cb, code lost:
    
        throw new java.lang.RuntimeException("1704851030");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0048, code lost:
    
        if (r3 == (((170862032 + (((~(r6 | (-1099473241))) | 269485697) * 220)) + (((~(r6 | (-1676474751))) | 846487207) * (-440))) + ((r5 | (-1099473241)) * 220))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0088, code lost:
    
        if (r3 == ((r8 + (((~(561665357 | r7)) | (-1945826670)) * (-1976))) + ((((~(r5 | 1391652900)) | 7491588) | (~((-1391652901) | r7))) * 988))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008a, code lost:
    
        r0 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = android.os.Process.myPid();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r11) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.ChangeTuitionBpuMembership.b(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ChangeTuitionBpuMembership changeTuitionBpuMembership, View view) {
        String str;
        int i = 2 % 2;
        int i2 = cancel + 37;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        final getImeOptions getimeoptions = (getImeOptions) changeTuitionBpuMembership.asBinder.getValue();
        User user = (User) changeTuitionBpuMembership.TuitionPaymentFragmentbindingInflater1.getValue();
        String strValueOf = String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
        User user2 = (User) changeTuitionBpuMembership.TuitionPaymentFragmentbindingInflater1.getValue();
        String strValueOf2 = String.valueOf(user2 != null ? user2.b : null);
        User user3 = (User) changeTuitionBpuMembership.TuitionPaymentFragmentbindingInflater1.getValue();
        if (user3 != null) {
            str = user3.asInterface;
        } else {
            int i4 = INotificationSideChannel + 27;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            str = null;
        }
        String strValueOf3 = String.valueOf(str);
        TuitionRate tuitionRate = changeTuitionBpuMembership.g;
        UpdateProfileBpuRequest updateProfileBpuRequest = new UpdateProfileBpuRequest(strValueOf, strValueOf2, strValueOf3, String.valueOf(tuitionRate != null ? tuitionRate.TuitionPaymentFragmentbindingInflater1 : null), changeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Intrinsics.checkNotNullParameter(updateProfileBpuRequest, "");
        MutableLiveData<VirtualCameraAdapter1<Registration>> mutableLiveData = getimeoptions.f943a;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getimeoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(updateProfileBpuRequest)));
        final Function1 function1 = new Function1() { // from class: setSearchableInfo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getImeOptions.b(getimeoptions, (Registration) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: setSuggestionsAdapter
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: SearchView10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getImeOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getimeoptions, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getMaxWidth
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        getimeoptions.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ChangeTuitionBpuMembership changeTuitionBpuMembership = (ChangeTuitionBpuMembership) objArr[0];
        int i = 2 % 2;
        int i2 = cancel + 9;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) changeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = cancel + 105;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return userAsBinder;
    }

    public static /* synthetic */ void b(final ChangeTuitionBpuMembership changeTuitionBpuMembership, final ActivityChangeTuitionBpuMembershipBinding activityChangeTuitionBpuMembershipBinding, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            CustomTabsIntent.Companion companion = CustomTabsIntent.INSTANCE;
            CustomTabsIntent customTabsIntentTuitionPaymentFragmentbindingInflater1 = CustomTabsIntent.Companion.TuitionPaymentFragmentbindingInflater1(changeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault3, changeTuitionBpuMembership.g, new Function1() { // from class: setHorizontalOffset
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, activityChangeTuitionBpuMembershipBinding, (TuitionRate) obj};
                    return (Unit) ChangeTuitionBpuMembership.TuitionPaymentFragmentbindingInflater1(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), objArr, -104116958, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), 104116960, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
                }
            });
            FragmentManager supportFragmentManager = changeTuitionBpuMembership.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(customTabsIntentTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i2 = cancel + 53;
                INotificationSideChannel = i2 % 128;
                int i3 = i2 % 2;
                customTabsIntentTuitionPaymentFragmentbindingInflater1.show(supportFragmentManager, customTabsIntentTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
            int i4 = INotificationSideChannel + 71;
            cancel = i4 % 128;
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

    /* JADX WARN: Code duplicated, block: B:13:0x0038 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0015, B:11:0x0026, B:13:0x0038, B:17:0x0064, B:14:0x0043, B:15:0x004e, B:9:0x001f), top: B:21:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0015, B:11:0x0026, B:13:0x0038, B:17:0x0064, B:14:0x0043, B:15:0x004e, B:9:0x001f), top: B:21:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x004e A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0015, B:11:0x0026, B:13:0x0038, B:17:0x0064, B:14:0x0043, B:15:0x004e, B:9:0x001f), top: B:21:0x0013 }] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChangeTuitionBpuMembership changeTuitionBpuMembership, ActivityChangeTuitionBpuMembershipBinding activityChangeTuitionBpuMembershipBinding, View view) {
        int i = 2 % 2;
        int i2 = cancel + 71;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                boolean z = !changeTuitionBpuMembership.b;
                changeTuitionBpuMembership.b = z;
                if (!z) {
                    activityChangeTuitionBpuMembershipBinding.tvTitleBenefitProgram.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_up_green, 0);
                    activityChangeTuitionBpuMembershipBinding.containerBenefitDescription.setVisibility(0);
                    if (changeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == 3) {
                        activityChangeTuitionBpuMembershipBinding.tvInfoJht.setVisibility(0);
                        activityChangeTuitionBpuMembershipBinding.viewLineJht.setVisibility(0);
                    } else {
                        activityChangeTuitionBpuMembershipBinding.tvInfoJht.setVisibility(8);
                        activityChangeTuitionBpuMembershipBinding.viewLineJht.setVisibility(8);
                    }
                } else {
                    activityChangeTuitionBpuMembershipBinding.tvTitleBenefitProgram.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
                    activityChangeTuitionBpuMembershipBinding.containerBenefitDescription.setVisibility(8);
                    int i4 = INotificationSideChannel + 67;
                    cancel = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                boolean z2 = !changeTuitionBpuMembership.b;
                changeTuitionBpuMembership.b = z2;
                if (z2) {
                    activityChangeTuitionBpuMembershipBinding.tvTitleBenefitProgram.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_up_green, 0);
                    activityChangeTuitionBpuMembershipBinding.containerBenefitDescription.setVisibility(0);
                    if (changeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == 3) {
                        activityChangeTuitionBpuMembershipBinding.tvInfoJht.setVisibility(0);
                        activityChangeTuitionBpuMembershipBinding.viewLineJht.setVisibility(0);
                    } else {
                        activityChangeTuitionBpuMembershipBinding.tvInfoJht.setVisibility(8);
                        activityChangeTuitionBpuMembershipBinding.viewLineJht.setVisibility(8);
                    }
                } else {
                    activityChangeTuitionBpuMembershipBinding.tvTitleBenefitProgram.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
                    activityChangeTuitionBpuMembershipBinding.containerBenefitDescription.setVisibility(8);
                    int i6 = INotificationSideChannel + 67;
                    cancel = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        ChangeTuitionBpuMembership changeTuitionBpuMembership = (ChangeTuitionBpuMembership) objArr[0];
        ActivityChangeTuitionBpuMembershipBinding activityChangeTuitionBpuMembershipBinding = (ActivityChangeTuitionBpuMembershipBinding) objArr[1];
        TuitionRate tuitionRate = (TuitionRate) objArr[2];
        int i = 2 % 2;
        changeTuitionBpuMembership.g = tuitionRate;
        EditText editText = activityChangeTuitionBpuMembershipBinding.tilChoseTuitionRate.getEditText();
        if (editText != null) {
            int i2 = cancel + 43;
            int i3 = i2 % 128;
            INotificationSideChannel = i3;
            int i4 = i2 % 2;
            String str = null;
            if (tuitionRate != null) {
                int i5 = i3 + 31;
                cancel = i5 % 128;
                if (i5 % 2 == 0) {
                    String str2 = tuitionRate.b;
                    str.hashCode();
                    throw null;
                }
                str = tuitionRate.b;
            }
            editText.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(str)));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ChangeTuitionBpuMembership changeTuitionBpuMembership, ActivityChangeTuitionBpuMembershipBinding activityChangeTuitionBpuMembershipBinding, View view) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        String str = changeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = "L";
        if (activityChangeTuitionBpuMembershipBinding.rgProgram.getCheckedRadioButtonId() == R.id.rbProgramJkkJkm) {
            obj = ExifInterface.GPS_DIRECTION_TRUE;
        } else {
            int i2 = INotificationSideChannel + 9;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            obj = "L";
        }
        if (!Intrinsics.areEqual(str, obj)) {
            activityChangeTuitionBpuMembershipBinding.edtChoseTuitionRate.setText("");
        }
        changeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 3;
        activityChangeTuitionBpuMembershipBinding.tvInfoJht.setVisibility(0);
        activityChangeTuitionBpuMembershipBinding.viewLineJht.setVisibility(0);
        if (activityChangeTuitionBpuMembershipBinding.rgProgram.getCheckedRadioButtonId() == R.id.rbProgramJkkJkm) {
            int i4 = cancel + 41;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            }
            str2 = ExifInterface.GPS_DIRECTION_TRUE;
        }
        changeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        changeTuitionBpuMembership.g = null;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ChangeTuitionBpuMembership changeTuitionBpuMembership, ActivityChangeTuitionBpuMembershipBinding activityChangeTuitionBpuMembershipBinding, View view) {
        Object obj;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 101;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            String str = changeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            activityChangeTuitionBpuMembershipBinding.rgProgram.getCheckedRadioButtonId();
            throw null;
        }
        String str2 = changeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int checkedRadioButtonId = activityChangeTuitionBpuMembershipBinding.rgProgram.getCheckedRadioButtonId();
        String str3 = ExifInterface.GPS_DIRECTION_TRUE;
        if (checkedRadioButtonId == R.id.rbProgramJkkJkm) {
            int i4 = INotificationSideChannel + 21;
            cancel = i4 % 128;
            if (i4 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            obj = ExifInterface.GPS_DIRECTION_TRUE;
        } else {
            obj = "L";
        }
        if (!Intrinsics.areEqual(str2, obj)) {
            activityChangeTuitionBpuMembershipBinding.edtChoseTuitionRate.setText("");
        }
        changeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2;
        activityChangeTuitionBpuMembershipBinding.tvInfoJht.setVisibility(8);
        activityChangeTuitionBpuMembershipBinding.viewLineJht.setVisibility(8);
        if (activityChangeTuitionBpuMembershipBinding.rgProgram.getCheckedRadioButtonId() != R.id.rbProgramJkkJkm) {
            str3 = "L";
        }
        changeTuitionBpuMembership.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
        changeTuitionBpuMembership.g = null;
        Unit unit = Unit.INSTANCE;
        int i5 = cancel + 99;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChangeTuitionBpuMembership changeTuitionBpuMembership) {
        return (User) TuitionPaymentFragmentbindingInflater1(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), new Object[]{changeTuitionBpuMembership}, 559320241, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), -559320238, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ChangeTuitionBpuMembership changeTuitionBpuMembership, ActivityChangeTuitionBpuMembershipBinding activityChangeTuitionBpuMembershipBinding, TuitionRate tuitionRate) {
        return (Unit) TuitionPaymentFragmentbindingInflater1(lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), new Object[]{changeTuitionBpuMembership, activityChangeTuitionBpuMembershipBinding, tuitionRate}, -104116958, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), 104116960, lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
    }

    static {
        notify = 0;
        d();
        INSTANCE = new Companion(null);
        int i = onTransact + 75;
        notify = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancel + 69;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 19;
        cancel = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_change_tuition_bpu_membership;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 27;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TuitionPaymentFragmentbindingInflater1(ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this, bundle}, -1480846665, ClaimOldDaySecurityWorkTerminationParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), lambdastopMediaCodec12androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), 1480846666, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 383120925);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 27;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void d() {
        d = new char[]{60117, 60055, 60043, 60050, 60040, 60063, 60056, 60060, 60048, 60062, 60088, 60034, 60041, 60051, 60052, 60116, 60083, 60045, 60072, 60053, 60049, 60058, 60054, 60047, 60073};
        cancelAll = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r7, int r8, int r9) {
        /*
            int r9 = 116 - r9
            byte[] r0 = com.bpjstku.presentation.digitalcard.ChangeTuitionBpuMembership.$$c
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.ChangeTuitionBpuMembership.$$i(byte, int, int):java.lang.String");
    }
}
