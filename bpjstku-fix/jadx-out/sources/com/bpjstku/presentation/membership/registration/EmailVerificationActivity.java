package com.bpjstku.presentation.membership.registration;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.databinding.ActivityVerifyAccountBinding;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.presentation.membership.registration.EmailVerificationActivity;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.registeredmember.SalariedWorkerRegistrationActivity;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.core.Constants;
import defpackage.CameraUseCaseAdapter;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SearchView9;
import defpackage.UseTorchAsFlash;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setSplitTrack;
import defpackage.setVideoStabilizationMode;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0015\u0010\t\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0017\u0010\u0006\u001a\u0004\u0018\u00010 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010#R\u001a\u0010\u0014\u001a\u00020$8\u0015X\u0095D¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b\u001e\u0010&"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/EmailVerificationActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityVerifyAccountBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "asInterface", "onBackPressed", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "onDestroy", "LUseTorchAsFlash;", "onClosePageEvent", "(LUseTorchAsFlash;)V", "LsetSplitTrack;", "g", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmailVerificationActivity extends BindingReactiveFormActivity<ActivityVerifyAccountBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f544a;
    private static int notify;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {117, -15, -81, 1};
    private static final int $$f = 212;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {107, 48, 57, 107, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -58, -5, -11, 11, 1, -1, -20, 12, 53, -55, -17, 15, -20, 9, -6, -15, 3, 9, 4, -18, 67, -61, -7, -8, 13, -15, 2, 11, -13, 60, -66, 7, -17, -5, 6, -5, 5, 59, -28, -46, -2, 2, 39, -32, -17, 32, -21, -14, -6, 14, -16, -3};
    private static final int $$n = 4;
    private static final byte[] $$a = {43, 23, 22, -14, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 202;
    private static int asBinder = 0;
    private static int d = 0;
    private static int asInterface = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: onClose
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EmailVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: SearchViewOnQueryTextListener
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EmailVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: refreshAutoCompleteResults
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EmailVerificationActivity.TuitionPaymentFragmentbindingInflater1(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int d = R.layout.activity_verify_account;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i3) | i6);
        int i8 = ~((~i6) | i);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i) | i6));
        int i11 = i6 + i + i5 + (762724209 * i2) + (1201824936 * i4);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i6) + 43253760 + (1339426419 * i) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i5) + (1302855680 * i2) + (1514143744 * i4) + (1905524736 * i12);
        int i14 = ((i6 * 162561953) - 555857873) + (i * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i5 * 162560975) + (i2 * 701011807) + (i4 * 237771736) + (i12 * (-223608832));
        int i15 = i13 + (i14 * i14 * 703332352);
        if (i15 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i15 != 3) {
            return i15 != 4 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.registration.EmailVerificationActivity.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r8 = r8 + 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2b
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.EmailVerificationActivity.c(byte, byte, int, java.lang.Object[]):void");
    }

    private static void f(byte b, int i, short s, Object[] objArr) {
        byte[] bArr = $$m;
        int i2 = 99 - b;
        int i3 = 65 - (s * 62);
        int i4 = i * 62;
        byte[] bArr2 = new byte[63 - i4];
        int i5 = 62 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i5 + (-i3)) - 2;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i3 + 1;
            i2 = (i2 + (-bArr[i8])) - 2;
            i3 = i8;
            i6 = i7;
        }
    }

    public EmailVerificationActivity() {
        final EmailVerificationActivity emailVerificationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.EmailVerificationActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final setSplitTrack invoke() {
                ComponentCallbacks componentCallbacks = emailVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(setSplitTrack.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.EmailVerificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/EmailVerificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "b", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, EmailVerificationActivity.class, new Pair[]{TuplesKt.to("registration_data", p1)});
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, MigrantWorkerRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, EmailVerificationActivity.class, new Pair[]{TuplesKt.to("migration_worker_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        char c;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        char c2 = 3;
        int i8 = iArr[3];
        char[] cArr2 = f544a;
        char c3 = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i3] = Integer.valueOf(cArr2[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1));
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1270;
                        int iIndexOf = 17 - TextUtils.indexOf("", c3);
                        byte b = $$c[c2];
                        byte b2 = (byte) (b - 1);
                        byte b3 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, minimumFlingVelocity, iIndexOf, 407021364, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 0;
                    i5 = 1;
                    c2 = 3;
                    c3 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i6];
        System.arraycopy(cArr2, i4, cArr4, 0, i6);
        if (bArr != null) {
            int i10 = $10 + 75;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr = new char[i6];
                setvideostabilizationmode.b = 0;
                c = 1;
            } else {
                cArr = new char[i6];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i11 = $10 + 125;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int packedPositionType = 3225 - ExpandableListView.getPackedPositionType(0L);
                        int packedPositionType2 = 13 - ExpandableListView.getPackedPositionType(0L);
                        byte b4 = (byte) ($$c[3] - 1);
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, packedPositionType, packedPositionType2, 2133916302, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                        int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23;
                        byte b6 = (byte) ($$c[3] - 1);
                        byte b7 = (byte) (b6 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, keyRepeatDelay, keyRepeatTimeout, 387247676, false, $$i(b6, b7, (byte) (b7 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr[setvideostabilizationmode.b];
                try {
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollBarSize = (char) (41241 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int iIndexOf2 = 1704 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21;
                        byte b8 = $$c[3];
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, iIndexOf2, keyRepeatTimeout2, -1434471773, false, $$i(b9, (byte) (b9 | 6), (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr4 = cArr;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            i = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i6);
            int i15 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr4, i15, i8);
            System.arraycopy(cArr5, i8, cArr4, 0, i15);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i6];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr4[(i6 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr4 = cArr6;
        }
        if (i7 > 0) {
            int i16 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i16;
                while (true) {
                    if (setvideostabilizationmode.b >= i6) {
                        break loop3;
                    }
                    int i17 = $10 + 69;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                        setvideostabilizationmode.b %= 0;
                    }
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i16 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0239  */
    /* JADX WARN: Code duplicated, block: B:28:0x0243  */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityVerifyAccountBinding> TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asInterface + 29;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState = (char) (31533 - View.resolveSizeAndState(0, 0, 0));
            int iBlue = 921 - Color.blue(0);
            int iArgb = 28 - Color.argb(0, 0, 0, 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[7], bArr[80], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, iBlue, iArgb, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{0, 22, 146, 3}, false, new byte[]{1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{22, 15, 0, 7}, false, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
            int i4 = 921 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int scrollDefaultDelay = 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) 52, bArr2[7], bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, i4, scrollDefaultDelay, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = asInterface + 35;
            d = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cCombineMeasuredStates = (char) (31533 - View.combineMeasuredStates(0, 0));
                int capsMode = 921 - TextUtils.getCapsMode("", 0, 0);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 28;
                byte b = $$a[7];
                Object[] objArr6 = new Object[1];
                c((byte) 37, b, (short) (b | 51), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, capsMode, iResolveSizeAndState, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i7}, (String[]) objArr7[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1041).substring(0, 25).length() - 1307864677;
            int i8 = ~length;
            int i9 = ((((-720528378) + ((1740106619 | i8) * (-369))) + (((~((-570878753) | i8)) | 1203200891) * (-369))) + ((((~(length | 570878752)) | 1169227867) | (~(i8 | (-536905729)))) * 369)) - 123456986;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr8 = new Object[1];
                e(new int[]{37, 26, 157, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new int[]{63, 18, 0, 12}, true, new byte[]{1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0}, objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i12 = d + 1;
                asInterface = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 72 / 0;
                    if (baseContext instanceof ContextWrapper) {
                        if (((ContextWrapper) baseContext).getBaseContext() != null) {
                            baseContext = null;
                        }
                    }
                } else if (baseContext instanceof ContextWrapper) {
                    if (((ContextWrapper) baseContext).getBaseContext() != null) {
                        baseContext = null;
                    }
                }
                baseContext = baseContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new int[]{81, 16, 0, 14}, true, new byte[]{0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new int[]{97, 16, 174, 10}, false, new byte[]{0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i14 = d + 95;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(iIntValue), 0, -123456986};
                byte[] bArr3 = $$m;
                byte b2 = bArr3[5];
                Object[] objArr13 = new Object[1];
                f(b2, b2, bArr3[18], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b3 = bArr3[18];
                Object[] objArr14 = new Object[1];
                f(b3, b3, bArr3[5], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionChild = (char) (31532 - ExpandableListView.getPackedPositionChild(0L));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 921;
                    int iBlue2 = Color.blue(0) + 28;
                    byte b4 = $$a[7];
                    Object[] objArr15 = new Object[1];
                    c((byte) 37, b4, (short) (b4 | 51), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionChild, minimumFlingVelocity, iBlue2, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new int[]{0, 22, 146, 3}, false, new byte[]{1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1}, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new int[]{22, 15, 0, 7}, false, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0}, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 921;
                        int i16 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
                        byte[] bArr4 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, bArr4[7], bArr4[5], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild2, threadPriority, i16, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 31533);
                        int mode = 921 - View.MeasureSpec.getMode(0);
                        int iBlue3 = 28 - Color.blue(0);
                        byte[] bArr5 = $$a;
                        Object[] objArr19 = new Object[1];
                        c(bArr5[7], bArr5[80], bArr5[5], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, mode, iBlue3, -1048449946, false, (String) objArr19[0], null);
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[3])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[3])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i20}, (String[]) objArr[4]};
            int iMyUid = Process.myUid();
            int i21 = i19 + ((~((-18482180) | iMyUid)) * 521) + 1576364968 + (((~((~iMyUid) | (-18482180))) | 1680099352) * 521);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr20[0])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i24 = asInterface + 73;
                d = i24 % 128;
                int i25 = i24 % 2;
                int i26 = 0;
                while (i26 < strArr.length) {
                    arrayList.add(strArr[i26]);
                    i26++;
                    int i27 = asInterface + 15;
                    d = i27 % 128;
                    if (i27 % 2 != 0) {
                        int i28 = 3 % 4;
                    }
                }
            }
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            int i29 = ((int[]) objArr[0])[0];
            int i30 = ((int[]) objArr[3])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i30}, (String[]) objArr[4]};
            int i31 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels | 735394377);
            int i32 = i29 + ((34875913 | i31) * (-196)) + 157158527 + ((i31 | 700518464) * 196);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr21[0])[0] = i34 ^ (i34 << 5);
            int i35 = d + 3;
            asInterface = i35 % 128;
            int i36 = i35 % 2;
        }
        return EmailVerificationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.d;
        if (i3 == 0) {
            int i5 = 35 / 0;
        }
        return i4;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        } else {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        d = i2 % 128;
        int i3 = i2 % 2;
        EmailVerificationActivity emailVerificationActivity = this;
        Intrinsics.checkNotNullParameter(emailVerificationActivity, "");
        emailVerificationActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_email_verification));
        MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        if (migrantWorkerRegistration != null) {
            int i4 = d + 71;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            EditText editText = INotificationSideChannelStub().tilEmail.getEditText();
            if (editText != null) {
                int i6 = asInterface + 13;
                d = i6 % 128;
                int i7 = i6 % 2;
                editText.setText(migrantWorkerRegistration.getItem);
            }
        }
        if (((RegistrationForUnregistered) this.b.getValue()) != null) {
            INotificationSideChannelStub().tvEnterEmailInstruction.setText(getString(R.string.label_edit_email_instruction_registration_unregistered));
            int i8 = asInterface + 59;
            d = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onSuggestionSelect
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) EmailVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(165551128, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj}, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -165551127);
            }
        }));
        int i2 = d + 7;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        EmailVerificationActivity emailVerificationActivity = this;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).f1390a.observe(emailVerificationActivity, new Observer() { // from class: SearchViewOnCloseListener
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                EmailVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(1089684836, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this.b, (VirtualCameraAdapter1) obj}, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1089684833);
            }
        });
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).onTransact.observe(emailVerificationActivity, new Observer() { // from class: SearchViewInspectionCompanion
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                EmailVerificationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = d + 47;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        MembershipType membershipType;
        int i = 2 % 2;
        int i2 = asInterface + 3;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 11 / 0;
            if (((RegistrationForUnregistered) this.b.getValue()) != null) {
                d_();
            }
        } else if (((RegistrationForUnregistered) this.b.getValue()) != null) {
            d_();
        }
        if (((RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            String strName = null;
            if (registeredMemberRegistration == null || (membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
                int i4 = d + 7;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = d + 87;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    membershipType.name();
                    strName.hashCode();
                    throw null;
                }
                strName = membershipType.name();
            }
            if (Intrinsics.areEqual(strName, "PU")) {
                int i7 = d + 51;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                SalariedWorkerRegistrationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = SalariedWorkerRegistrationActivity.INSTANCE;
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                Intrinsics.checkNotNull(registeredMemberRegistration2);
                SalariedWorkerRegistrationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, registeredMemberRegistration2);
                d_();
                int i9 = asInterface + 87;
                d = i9 % 128;
                int i10 = i9 % 2;
                return;
            }
        }
        d_();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = asInterface + 69;
                d = i2 % 128;
                if (i2 % 2 != 0) {
                    onBackPressed();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                onBackPressed();
                int i3 = d + 123;
                asInterface = i3 % 128;
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

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        EmailVerificationActivity emailVerificationActivity = (EmailVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = emailVerificationActivity.INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        if (i3 == 0) {
            materialButton2.setEnabled(true);
            return null;
        }
        materialButton2.setEnabled(false);
        return null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = d + 103;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
        } else {
            MaterialButton materialButton3 = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
        }
        int i3 = asInterface + 121;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilEmail;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^.{1,}$", string);
        String string2 = getString(R.string.error_email_invalid);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new accessconfigureInstanceInternal[]{accessconfigureinstanceinternal, new accessconfigureInstanceInternal(Constants.EMAIL_PATTERN, string2)})));
        int i2 = d + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onDestroy();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this);
            obj.hashCode();
            throw null;
        }
        super.onDestroy();
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this);
        int i3 = asInterface + 83;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Subscribe(TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ThreadMode.MAIN)
    public final void onClosePageEvent(UseTorchAsFlash p0) {
        int i = 2 % 2;
        int i2 = d + 75;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            d_();
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            d_();
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
            int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
            int i4 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c((byte) 52, b, (short) (b | 88), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, i3, i4, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{0, 22, 146, 3}, false, new byte[]{1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{22, 15, 0, 7}, false, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int iResolveSize = View.resolveSize(0, 0) + 1031;
            int iArgb = Color.argb(0, 0, 0, 0) + 15;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) 52, bArr[7], bArr[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, iResolveSize, iArgb, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int iResolveSize2 = View.resolveSize(0, 0) + 1031;
                int mode = 15 - View.MeasureSpec.getMode(0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr2[7], bArr2[80], bArr2[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, iResolveSize2, mode, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i7 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation | 339883944);
            int i8 = (((-301005719) | i7) * (-658)) + 1539185209 + ((i7 | (-368246719)) * 658) + 1119275596;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{81, 16, 0, 14}, true, new byte[]{0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{97, 16, 174, 10}, false, new byte[]{0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1900666972};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Color.red(0) + 1134, 17 - TextUtils.lastIndexOf("", '0'), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1119275596, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1031;
                    int i11 = 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte b2 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, b2, (short) (b2 | 88), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, fadingEdgeLength, i11, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getScrollBarSize() >> 8)), AndroidCharacter.getMirror('0') + 1069, View.resolveSizeAndState(0, 0, 0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i12 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i13 = 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte[] bArr3 = $$a;
                    Object[] objArr13 = new Object[1];
                    c(bArr3[7], bArr3[80], bArr3[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i12, i13, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new int[]{0, 22, 146, 3}, false, new byte[]{1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new int[]{22, 15, 0, 7}, false, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1031;
                        int iRed = Color.red(0) + 15;
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        c((byte) 52, bArr4[7], bArr4[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMakeMeasureSpec, offsetBefore, iRed, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int iMyTid = (Process.myTid() >> 22) + 1031;
                        int iRgb = (-16777201) - Color.rgb(0, 0, 0);
                        byte b3 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, b3, (short) (b3 | 88), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(size, iMyTid, iRgb, 1357589585, false, (String) objArr17[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i19 = ~System.identityHashCode(this);
            int i20 = i16 + ((((~((-247259654) | i19)) | 244350980) * (-241)) - 1519576115) + (((~(i19 | (-2908674))) | (-247330464)) * 241);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i23 = i15 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i23) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[3])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i27 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i28 = ~i27;
            int i29 = i24 + (-59458627) + ((i27 | 4457472) * 988) + (((~(584347570 | i28)) | (-919957499)) * (-1976)) + (((~(i27 | 340067400)) | 4457472 | (~((-340067401) | i28))) * 988);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr19[2])[0] = i31 ^ (i31 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char longPressTimeout = (char) (29944 - (ViewConfiguration.getLongPressTimeout() >> 16));
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1755;
            int iIndexOf = 23 - TextUtils.indexOf("", "", 0);
            byte b4 = $$a[7];
            Object[] objArr20 = new Object[1];
            c((byte) 37, b4, (short) (b4 | 51), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(longPressTimeout, touchSlop, iIndexOf, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29943);
                int iNormalizeMetaState = 1755 - KeyEvent.normalizeMetaState(0);
                int i32 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                byte[] bArr5 = $$a;
                Object[] objArr21 = new Object[1];
                c((byte) 52, bArr5[7], bArr5[5], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, iNormalizeMetaState, i32, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i33 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1537952823;
            int i34 = (((386773724 + (((~(i33 | (-499308140))) | (-711910566)) * (-465))) + (((-499308140) | (~((-711910566) | i33))) * 930)) + ((i33 | (-138593314)) * 465)) - 2065366284;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i36 ^ (i36 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new int[]{81, 16, 0, 14}, true, new byte[]{0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new int[]{97, 16, 174, 10}, false, new byte[]{0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {1900666972};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1725, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -2065366284, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                int i37 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i38 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                byte[] bArr6 = $$a;
                Object[] objArr26 = new Object[1];
                c((byte) 52, bArr6[7], bArr6[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, i37, i38, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new int[]{0, 22, 146, 3}, false, new byte[]{1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new int[]{22, 15, 0, 7}, false, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                    int i39 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                    byte b5 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, b5, (short) (b5 | 140), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(keyRepeatDelay, iResolveOpacity, i39, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char longPressTimeout2 = (char) (29944 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int i40 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
                    int i41 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                    byte b6 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c((byte) 37, b6, (short) (b6 | 51), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(longPressTimeout2, i40, i41, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0] == ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]) {
            int i42 = asInterface + 71;
            d = i42 % 128;
            int i43 = i42 % 2;
            int i44 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i45 = i44 + 1878469249 + ((213155406 | iIdentityHashCode) * 376) + (((~((~iIdentityHashCode) | 519620597)) | 276490) * (-376)) + (((~(iIdentityHashCode | (-519620598))) | (-307018172)) * 376);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr31[3])[0] = i47 ^ (i47 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
        if (strArr5 == null) {
            throw null;
        }
        int i48 = asInterface + 47;
        d = i48 % 128;
        while (true) {
            int i49 = i48 % 2;
            if (i2 >= strArr5.length) {
                throw null;
            }
            int i50 = d + 61;
            asInterface = i50 % 128;
            int i51 = i50 % 2;
            arrayList2.add(strArr5[i2]);
            i2++;
            i48 = d + 103;
            asInterface = i48 % 128;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws IllegalAccessException {
        EmailVerificationActivity emailVerificationActivity = (EmailVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 7;
        d = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iMyUid = Process.myUid();
        if (i4 != 757974534 + (((~(1550109170 | iMyUid)) | 720121627) * (-366)) + (((~(iMyUid | 2129457147)) | 140773650) * 366)) {
            throw new RuntimeException("-910435213");
        }
        int i5 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        if (i5 != (-1064083328) + (((~(1794156870 | elapsedCpuTime)) | 1783628100) * (-502)) + ((~((~elapsedCpuTime) | 1861873639)) * (-502)) + (((~(elapsedCpuTime | (-78245540))) | 1794156870) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            throw null;
        }
        super.onResume();
        int i6 = d + 53;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != 436818192 + (((~((-345162289) | i5)) | (-1175149832)) * 519) + (((~(i5 | (-67256321))) | (~((-1107893512) | iIdentityHashCode))) * (-519)) + (((~(iIdentityHashCode | (-1175149832))) | 345162288) * 519)) {
            int i6 = (-1779945748) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        if (i7 != (((~((-933498757) | iElapsedRealtime)) | 362809860) * (-566)) + 1771006516 + ((~(iElapsedRealtime | (-570688897))) * 566)) {
            int i8 = 348858772 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i9 = asInterface + 61;
        d = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i3 != (-573117390) + (((~(iIdentityHashCode | 350255877)) | 1108935896) * 305) + (((~((~iIdentityHashCode) | 350255877)) | 1180243420) * 305)) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlTrustedGoBackButtonTitle).substring(0, 7).codePointAt(4) + 881796781;
            if (i4 != 100907706 + ((~(922599419 | iCodePointAt)) * 623) + (((~iCodePointAt) | 71632018) * (-623)) + (((~(iCodePointAt | 82121947)) | (~(912109490 | iCodePointAt)) | (-922599420)) * 623)) {
                throw null;
            }
        }
        int i5 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i6 = 2009066480 + ((1361360018 | iIdentityHashCode2) * 614);
        int i7 = ~iIdentityHashCode2;
        if (i5 != i6 + (((~((-628030582) | i7)) | 19182608 | (~(1951025383 | i7))) * (-1228)) + (((~(i7 | 1970207991)) | (~((-608847974) | i7))) * 614)) {
            int i8 = asInterface + 95;
            d = i8 % 128;
            if (i8 % 2 != 0) {
                int[] iArr = new int[81574473];
                iArr[81574472] = 0;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[81574473];
                iArr2[81574472] = 1;
                int i9 = (-131502456) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentspecialinlinedviewModeldefault3(EmailVerificationActivity emailVerificationActivity) {
        int i = 2 % 2;
        int i2 = d + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) emailVerificationActivity.getIntent().getParcelableExtra("unregistered_data");
        int i4 = d + 37;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return registrationForUnregistered;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault2(EmailVerificationActivity emailVerificationActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        d = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) emailVerificationActivity.getIntent().getParcelableExtra("registration_data");
        int i4 = asInterface + 57;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return registeredMemberRegistration;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = d + 85;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = asInterface + 29;
        d = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        EmailVerificationActivity emailVerificationActivity = (EmailVerificationActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 97;
        d = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, emailVerificationActivity);
        EditText editText = emailVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
        String str = null;
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String lowerCase = strValueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String string = StringsKt.trim((CharSequence) lowerCase).toString();
        String string2 = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string2, "");
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) emailVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (registeredMemberRegistration != null) {
            int i4 = asInterface + 39;
            d = i4 % 128;
            int i5 = i4 % 2;
            str = registeredMemberRegistration.INotificationSideChannel;
        }
        EmailVerificationRequest emailVerificationRequest = new EmailVerificationRequest(string2, string, String.valueOf(str));
        if (((RegistrationForUnregistered) emailVerificationActivity.b.getValue()) != null) {
            ((setSplitTrack) emailVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1(emailVerificationRequest);
        } else {
            ((setSplitTrack) emailVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailVerificationRequest);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ MigrantWorkerRegistration TuitionPaymentFragmentbindingInflater1(EmailVerificationActivity emailVerificationActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        d = i2 % 128;
        int i3 = i2 % 2;
        MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) emailVerificationActivity.getIntent().getParcelableExtra("migration_worker_data");
        int i4 = asInterface + 61;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return migrantWorkerRegistration;
        }
        throw null;
    }

    public static /* synthetic */ Unit onTransact() {
        Unit unit;
        int i = 2 % 2;
        int i2 = asInterface + 97;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 19 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = asInterface + 25;
        d = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052 A[PHI: r3
  0x0052: PHI (r3v33 com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration) = 
  (r3v32 com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration)
  (r3v55 com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration)
 binds: [B:18:0x0050, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x008f A[PHI: r3 r4
  0x008f: PHI (r3v42 java.lang.String) = (r3v41 java.lang.String), (r3v52 java.lang.String) binds: [B:25:0x008d, B:22:0x0075] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r4v15 android.widget.EditText) = (r4v14 android.widget.EditText), (r4v28 android.widget.EditText) binds: [B:25:0x008d, B:22:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0096 A[PHI: r3
  0x0096: PHI (r3v47 java.lang.String) = (r3v41 java.lang.String), (r3v52 java.lang.String) binds: [B:25:0x008d, B:22:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void b(EmailVerificationActivity emailVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        MigrantWorkerRegistration migrantWorkerRegistration;
        RegistrationForUnregistered registrationForUnregistered;
        Editable text;
        RegisteredMemberRegistration registeredMemberRegistration;
        int i;
        String str;
        EditText editText;
        Editable text2;
        String str2;
        int i2 = 2 % 2;
        int i3 = d + 25;
        int i4 = i3 % 128;
        asInterface = i4;
        Editable editable = null;
        if (i3 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            editable.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            emailVerificationActivity.MediaBrowserCompat();
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i5 = i4 + 113;
                d = i5 % 128;
                int i6 = i5 % 2;
                emailVerificationActivity.IconCompatParcelizer();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                String string2 = emailVerificationActivity.getString(R.string.error_email_not_match);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                if (!StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailVerificationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                    return;
                }
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string3 = emailVerificationActivity.getString(R.string.title_email_not_match);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                String string4 = emailVerificationActivity.getString(R.string.message_email_not_match);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                String string5 = emailVerificationActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string3, string4, string5, new Function0() { // from class: SearchView7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EmailVerificationActivity.g();
                    }
                }, 96);
                FragmentManager supportFragmentManager = emailVerificationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    return;
                }
                return;
            }
            return;
        }
        emailVerificationActivity.IconCompatParcelizer();
        if (((RegisteredMemberRegistration) emailVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
            int i7 = d + 23;
            asInterface = i7 % 128;
            if (i7 % 2 == 0) {
                registeredMemberRegistration = (RegisteredMemberRegistration) emailVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                int i8 = 88 / 0;
                if (registeredMemberRegistration != null) {
                    RegisteredMemberRegistration registeredMemberRegistration2 = registeredMemberRegistration;
                    i = asInterface + 121;
                    d = i % 128;
                    if (i % 2 != 0) {
                        str = ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
                        editText = emailVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
                        int i9 = 7 / 0;
                        if (editText != null) {
                            text2 = editText.getText();
                            str2 = str;
                        } else {
                            int i10 = asInterface + 3;
                            d = i10 % 128;
                            int i11 = i10 % 2;
                            str2 = str;
                            text2 = null;
                        }
                    } else {
                        str = ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
                        editText = emailVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
                        if (editText != null) {
                            text2 = editText.getText();
                            str2 = str;
                        } else {
                            int i12 = asInterface + 3;
                            d = i12 % 128;
                            int i13 = i12 % 2;
                            str2 = str;
                            text2 = null;
                        }
                    }
                    RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration2, null, StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), null, null, null, null, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, 8380413);
                    RegistrationVerifyEmailOtpActivity.Companion bVar = RegistrationVerifyEmailOtpActivity.INSTANCE;
                    RegistrationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailVerificationActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    emailVerificationActivity.d_();
                }
            } else {
                registeredMemberRegistration = (RegisteredMemberRegistration) emailVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                if (registeredMemberRegistration != null) {
                    RegisteredMemberRegistration registeredMemberRegistration3 = registeredMemberRegistration;
                    i = asInterface + 121;
                    d = i % 128;
                    if (i % 2 != 0) {
                        str = ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
                        editText = emailVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
                        int i14 = 7 / 0;
                        if (editText != null) {
                            text2 = editText.getText();
                            str2 = str;
                        } else {
                            int i15 = asInterface + 3;
                            d = i15 % 128;
                            int i16 = i15 % 2;
                            str2 = str;
                            text2 = null;
                        }
                    } else {
                        str = ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
                        editText = emailVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
                        if (editText != null) {
                            text2 = editText.getText();
                            str2 = str;
                        } else {
                            int i17 = asInterface + 3;
                            d = i17 % 128;
                            int i18 = i17 % 2;
                            str2 = str;
                            text2 = null;
                        }
                    }
                    RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault4 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration3, null, StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), null, null, null, null, null, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, 8380413);
                    RegistrationVerifyEmailOtpActivity.Companion bVar2 = RegistrationVerifyEmailOtpActivity.INSTANCE;
                    RegistrationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailVerificationActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    emailVerificationActivity.d_();
                }
            }
        }
        if (((RegistrationForUnregistered) emailVerificationActivity.b.getValue()) != null && (registrationForUnregistered = (RegistrationForUnregistered) emailVerificationActivity.b.getValue()) != null) {
            String str3 = ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
            EditText editText2 = emailVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
            if (editText2 != null) {
                int i19 = asInterface + 65;
                d = i19 % 128;
                if (i19 % 2 != 0) {
                    editText2.getText();
                    throw null;
                }
                text = editText2.getText();
            } else {
                text = null;
            }
            String strValueOf = String.valueOf(text);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = strValueOf.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, null, StringsKt.trim((CharSequence) lowerCase).toString(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str3, null, false, false, 15728635);
            RegistrationVerifyEmailOtpActivity.Companion bVar3 = RegistrationVerifyEmailOtpActivity.INSTANCE;
            RegistrationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            emailVerificationActivity.d_();
        }
        if (((MigrantWorkerRegistration) emailVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) == null || (migrantWorkerRegistration = (MigrantWorkerRegistration) emailVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) == null) {
            return;
        }
        EditText editText3 = emailVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
        String strValueOf2 = String.valueOf(editText3 != null ? editText3.getText() : null);
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        String lowerCase2 = strValueOf2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        MigrantWorkerRegistration migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1 = MigrantWorkerRegistration.TuitionPaymentFragmentbindingInflater1(migrantWorkerRegistration, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) lowerCase2).toString(), null, null, null, null, null, null, null, -268435457, 15);
        RegistrationVerifyEmailOtpActivity.Companion bVar4 = RegistrationVerifyEmailOtpActivity.INSTANCE;
        RegistrationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailVerificationActivity, migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1);
        emailVerificationActivity.d_();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        EmailVerificationActivity emailVerificationActivity = (EmailVerificationActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            emailVerificationActivity.MediaBrowserCompat();
            return null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i2 = d + 59;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                emailVerificationActivity.IconCompatParcelizer();
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) emailVerificationActivity.b.getValue();
                if (registrationForUnregistered != null) {
                    int i4 = d + 119;
                    asInterface = i4 % 128;
                    if (i4 % 2 == 0) {
                        String str = ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
                        emailVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
                        throw null;
                    }
                    String str2 = ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
                    EditText editText = emailVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
                    RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, null, StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str2, null, false, false, 15728635);
                    RegistrationVerifyEmailOtpActivity.Companion bVar = RegistrationVerifyEmailOtpActivity.INSTANCE;
                    RegistrationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    emailVerificationActivity.d_();
                }
            }
            int i5 = d + 67;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        emailVerificationActivity.IconCompatParcelizer();
        VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
        String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
        String string2 = emailVerificationActivity.getString(R.string.error_email_not_match);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        if (!StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailVerificationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            return null;
        }
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string3 = emailVerificationActivity.getString(R.string.title_email_not_match);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = emailVerificationActivity.getString(R.string.message_email_not_match);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        String string5 = emailVerificationActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string3, string4, string5, new SearchView9(), 96);
        FragmentManager supportFragmentManager = emailVerificationActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i7 = d + 47;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(EmailVerificationActivity emailVerificationActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(165551128, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{emailVerificationActivity, view}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -165551127);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(EmailVerificationActivity emailVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(1089684836, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{emailVerificationActivity, virtualCameraAdapter1}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1089684833);
    }

    static {
        notify = 1;
        cancelAll();
        INSTANCE = new Companion(null);
        int i = asBinder + 13;
        notify = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = d + 37;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int iTuitionPaymentFragmentbindingInflater1 = TypeReference.Companion.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1993687934, TypeReference.Companion.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, iTuitionPaymentFragmentbindingInflater1, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1993687938);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iTuitionPaymentFragmentbindingInflater1 = TypeReference.Companion.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = TypeReference.Companion.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1883923943, 857261714 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_invalid_merchant_url).substring(0, 13).codePointAt(11), new Object[]{this}, iTuitionPaymentFragmentbindingInflater1, TypeReference.Companion.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, 1883923945);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_content_desc_image).substring(0, 5).length() + 1599283095;
        int iTuitionPaymentFragmentbindingInflater1 = TypeReference.Companion.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1731713512, ZExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, length, TypeReference.Companion.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, 1731713512);
    }

    static void cancelAll() {
        f544a = new char[]{59787, 59888, 59890, 59891, 59890, 59888, 59894, 59401, 59893, 59891, 59856, 59883, 59400, 59881, 59865, 59891, 59395, 59406, 59893, 59888, 59873, 59874, 59705, 59752, 59757, 59771, 59749, 59744, 59746, 59758, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59764, 59407, 59405, 59395, 59398, 59394, 59400, 59885, 59887, 59406, 59398, 59879, 59871, 59876, 59395, 59392, 59399, 59399, 59392, 59416, 59400, 59888, 59393, 59395, 59403, 59892, 59711, 59745, 59749, 59771, 59731, 59729, 59770, 59746, 59744, 59769, 59768, 59751, 59747, 59749, 59751, 59749, 59745, 59753, 59697, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59744, 59746, 59802, 59439, 59397, 59401, 59411, 59408, 59400, 59404, 59420, 59417, 59422, 59423, 59417, 59420, 59412, 59415};
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        EmailVerificationActivity emailVerificationActivity = (EmailVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = d + 9;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, byte r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = com.bpjstku.presentation.membership.registration.EmailVerificationActivity.$$c
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r7 = r7 + 99
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.EmailVerificationActivity.$$i(int, byte, short):java.lang.String");
    }
}
