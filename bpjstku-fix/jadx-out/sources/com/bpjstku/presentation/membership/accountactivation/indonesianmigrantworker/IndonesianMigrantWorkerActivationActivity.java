package com.bpjstku.presentation.membership.accountactivation.indonesianmigrantworker;

import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.registration.general.model.request.ActivationRequest;
import com.bpjstku.data.registration.general.model.request.MembershipCheckRequest;
import com.bpjstku.data.registration.general.model.response.ActivationItem;
import com.bpjstku.databinding.ActivityIndonesianMigrantWorkerActivationBinding;
import com.bpjstku.domain.registration.general.model.MembershipCheckNew;
import com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity;
import com.bpjstku.presentation.membership.accountactivation.indonesianmigrantworker.IndonesianMigrantWorkerActivationActivity;
import com.bpjstku.presentation.membership.registration.EmailVerificationActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.libraries.places.api.net.kotlin.zzo;
import com.google.android.libraries.places.widget.zzw;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.BufferProviderState;
import defpackage.EncoderImplByteBufferInput;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.measureChildConstrained;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setInactive;
import defpackage.setSessionCaptureCallback;
import defpackage.setSplitTrack;
import defpackage.share;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0014\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0017\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u001c8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\b\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010\n\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010#"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/indonesianmigrantworker/IndonesianMigrantWorkerActivationActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityIndonesianMigrantWorkerActivationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "LsetSplitTrack;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "I", "()I", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "Z", "", "Ljava/lang/String;", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IndonesianMigrantWorkerActivationActivity extends BindingReactiveFormActivity<ActivityIndonesianMigrantWorkerActivationBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancelAll;
    private static long d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private boolean a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String g;
    private String asBinder;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Calendar b;
    private static final byte[] $$a = {68, -119, -76, 97, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 62;
    private static int INotificationSideChannel = 0;
    private static int g = 0;
    private static int notify = 1;
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: ActivityChooserModelActivityChooserModelClient
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IndonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.activity_indonesian_migrant_worker_activation;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.b.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~(i8 | i3)) | i7;
        int i10 = ~i3;
        int i11 = ~(i8 | i10 | i2);
        int i12 = (~(i3 | i7)) | i8 | (~(i10 | i2));
        int i13 = i2 + i5 + i4 + (325770565 * i) + ((-1284996642) * i6);
        int i14 = i13 * i13;
        int i15 = ((789042555 * i2) - 1205338112) + ((-1364710777) * i5) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i4) + ((-667418624) * i) + ((-145752064) * i6) + (1116340224 * i14);
        int i16 = (i2 * (-1991011123)) + 595473426 + (i5 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * TypedValues.Custom.TYPE_REFERENCE) + (i4 * (-1991010217)) + (i * (-1223611789)) + (i6 * (-291900814)) + (i14 * (-1931083776));
        int i17 = i15 + (i16 * i16 * (-1558839296));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i17 == 2) {
            return b(objArr);
        }
        if (i17 != 3) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        final IndonesianMigrantWorkerActivationActivity indonesianMigrantWorkerActivationActivity = (IndonesianMigrantWorkerActivationActivity) objArr[0];
        int i18 = 2 % 2;
        IndonesianMigrantWorkerActivationActivity indonesianMigrantWorkerActivationActivity2 = indonesianMigrantWorkerActivationActivity;
        ((setSplitTrack) indonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(indonesianMigrantWorkerActivationActivity2, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: getHistoryMaxSize
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndonesianMigrantWorkerActivationActivity.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) indonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.observe(indonesianMigrantWorkerActivationActivity2, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: setHistoryMaxSize
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        int i19 = g + 3;
        notify = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.indonesianmigrantworker.IndonesianMigrantWorkerActivationActivity.$$a
            int r7 = r7 + 4
            int r8 = r8 + 1
            int r9 = r9 * 14
            int r9 = 98 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r9 = r7
            r3 = r8
            r5 = r2
            goto L28
        L13:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
        L28:
            int r7 = r7 + r3
            int r9 = r9 + 1
            int r7 = r7 + (-11)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.indonesianmigrantworker.IndonesianMigrantWorkerActivationActivity.c(int, int, byte, java.lang.Object[]):void");
    }

    public IndonesianMigrantWorkerActivationActivity() {
        final IndonesianMigrantWorkerActivationActivity indonesianMigrantWorkerActivationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.indonesianmigrantworker.IndonesianMigrantWorkerActivationActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final setSplitTrack invoke() {
                ComponentCallbacks componentCallbacks = indonesianMigrantWorkerActivationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(setSplitTrack.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.b = calendar;
        this.g = "";
        this.asBinder = "";
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.indonesianmigrantworker.IndonesianMigrantWorkerActivationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/indonesianmigrantworker/IndonesianMigrantWorkerActivationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, IndonesianMigrantWorkerActivationActivity.class, new Pair[]{TuplesKt.to("registration_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityIndonesianMigrantWorkerActivationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 123;
        g = i2 % 128;
        int i3 = i2 % 2;
        IndonesianMigrantWorkerActivationActivity$bindingInflater$1 indonesianMigrantWorkerActivationActivity$bindingInflater$1 = IndonesianMigrantWorkerActivationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return indonesianMigrantWorkerActivationActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 43;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = i2 + 31;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return i4;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 45;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 19472), 2624 - ExpandableListView.getPackedPositionGroup(0L), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() % (d * 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Color.green(0) + 481, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 19472), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2625, 13 - (ViewConfiguration.getPressedStateDuration() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (d ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 39423), 481 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 37 - TextUtils.getCapsMode("", 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.indexOf("", "", 0) + 481, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
        int i6 = $11 + 11;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityIndonesianMigrantWorkerActivationBinding activityIndonesianMigrantWorkerActivationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        activityIndonesianMigrantWorkerActivationBindingINotificationSideChannelStub.btnNext.setOnClickListener(new View.OnClickListener() { // from class: getHistorySize
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndonesianMigrantWorkerActivationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, activityIndonesianMigrantWorkerActivationBindingINotificationSideChannelStub, view);
            }
        });
        EditText editText = activityIndonesianMigrantWorkerActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: setActivitySorter
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IndonesianMigrantWorkerActivationActivity.b(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
            int i2 = notify + 37;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 3;
            }
        }
        activityIndonesianMigrantWorkerActivationBindingINotificationSideChannelStub.rgChooseIdentity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: setDefaultActivity
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i4) {
                IndonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzo.TuitionPaymentFragmentbindingInflater1(), new Object[]{activityIndonesianMigrantWorkerActivationBindingINotificationSideChannelStub, this, radioGroup, Integer.valueOf(i4)}, 1590164221, zzo.TuitionPaymentFragmentbindingInflater1(), zzo.TuitionPaymentFragmentbindingInflater1(), -1590164219, zzo.TuitionPaymentFragmentbindingInflater1());
            }
        });
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = notify + 111;
        g = i2 % 128;
        int i3 = i2 % 2;
        IndonesianMigrantWorkerActivationActivity indonesianMigrantWorkerActivationActivity = this;
        Intrinsics.checkNotNullParameter(indonesianMigrantWorkerActivationActivity, "");
        indonesianMigrantWorkerActivationActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = INotificationSideChannelStub().layoutToolbar.toolbar;
        String string = getString(R.string.action_account_activation);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        EditText editText = INotificationSideChannelStub().tilFullName.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText2 = INotificationSideChannelStub().tilIdPassport.getEditText();
        if (editText2 != null) {
            Intrinsics.checkNotNullParameter(editText2, "");
            editText2.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        int i4 = notify + 87;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = g + 75;
        notify = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        int i4 = g + 71;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i;
        int i2 = 2 % 2;
        int i3 = g + 69;
        notify = i3 % 128;
        int i4 = i3 % 2;
        ActivityIndonesianMigrantWorkerActivationBinding activityIndonesianMigrantWorkerActivationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        if (this.a) {
            TextInputLayout textInputLayout = activityIndonesianMigrantWorkerActivationBindingINotificationSideChannelStub.tilIdPassport;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            String string = getString(R.string.error_field_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Paspor Minimal 6 Karakter", 6, null)})));
            i = notify + 97;
            g = i % 128;
        } else {
            TextInputLayout textInputLayout2 = activityIndonesianMigrantWorkerActivationBindingINotificationSideChannelStub.tilIdentityNumber;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
            String string2 = getString(R.string.error_field_required);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = getString(R.string.error_field_nik);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string2), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string3, 16, 16)})));
            i = g + 111;
            notify = i % 128;
        }
        int i5 = i % 2;
        TextInputLayout textInputLayout3 = activityIndonesianMigrantWorkerActivationBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout4 = activityIndonesianMigrantWorkerActivationBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = notify + 55;
        g = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
                int i4 = notify + 51;
                g = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 3;
                }
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        IndonesianMigrantWorkerActivationActivity indonesianMigrantWorkerActivationActivity = (IndonesianMigrantWorkerActivationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 37;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
            int edgeSlop = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
            int i4 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            Object[] objArr2 = new Object[1];
            c((short) 104, (byte) 37, $$a[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, edgeSlop, i4, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{48553, 4983, 57358, 45513, 1763, 55220, 42314, 31313, 52015, 39138, 27084, 16224, 35965, 23846, 13010, 33682, 20661, 9834, 63254, 17444, 5631, 60038}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step4).substring(16, 17).codePointAt(0) + 44654, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{48557, 43905, 37347, 65495, 58671, 54036, 14706, 9881, 3205, 31460, 24790, 20011, 46109, 41540, 35755}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 5562, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int scrollDefaultDelay = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
            Object[] objArr5 = new Object[1];
            c((short) 141, (byte) ($$b & 245), $$a[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, scrollDefaultDelay, maximumDrawingCacheSize, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (29944 - TextUtils.indexOf("", ""));
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                int i5 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                short s = (short) ($$b & 245);
                Object[] objArr6 = new Object[1];
                c(s, (byte) s, $$a[132], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iIndexOf, i5, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i6 = ((631833220 + (((~(iUptimeMillis | 171695913)) | (-175898426)) * 305)) + (((~((~iUptimeMillis) | 171695913)) | (-40906513)) * 305)) - 2007920158;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{48546, 24608, 1708, 9522, 52162, 60937, 35999, 45849, 20967, 29751, 6849, 14674, 57303, 33353, 41171, 18082}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 56667, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{48545, 49115, 47427, 47811, 46176, 45554, 45942, 44272, 44600, 43910, 42269, 42685, 40991, 40364, 40750, 39252}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 595, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, indonesianMigrantWorkerActivationActivity)).intValue();
            try {
                Object[] objArr10 = {135324325};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getFadingEdgeLength() >> 16)), KeyEvent.keyCodeFromString("") + 1726, ImageFormat.getBitsPerPixel(0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -2007920158, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                    int scrollDefaultDelay2 = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i9 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    short s2 = (short) ($$b & 245);
                    Object[] objArr11 = new Object[1];
                    c(s2, (byte) s2, $$a[132], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, scrollDefaultDelay2, i9, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    e(new char[]{48553, 4983, 57358, 45513, 1763, 55220, 42314, 31313, 52015, 39138, 27084, 16224, 35965, 23846, 13010, 33682, 20661, 9834, 63254, 17444, 5631, 60038}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44753, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(new char[]{48557, 43905, 37347, 65495, 58671, 54036, 14706, 9881, 3205, 31460, 24790, 20011, 46109, 41540, 35755}, 5669 - KeyEvent.normalizeMetaState(0), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf("", "") + 29944);
                        int iArgb = 1755 - Color.argb(0, 0, 0, 0);
                        int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22;
                        Object[] objArr14 = new Object[1];
                        c((short) 141, (byte) ($$b & 245), $$a[132], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, iArgb, i10, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29943);
                        int i11 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                        Object[] objArr15 = new Object[1];
                        c((short) 104, (byte) 37, $$a[132], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, i11, packedPositionType, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr16 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i15 = ~new Random().nextInt(2013369615);
            int i16 = i14 + (-767765393) + ((~((-612388906) | i15)) * (-783)) + (((~(i15 | (-669274160))) | (-881876586)) * 783);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr16[3])[0] = i18 ^ (i18 << 5);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr != null) {
            for (String str : strArr) {
                int i19 = notify + 89;
                g = i19 % 128;
                int i20 = i19 % 2;
                arrayList.add(str);
            }
        }
        int[] iArr = new int[i13];
        int i21 = i13 - 1;
        iArr[i21] = 1;
        Toast.makeText((Context) null, iArr[((i13 * i21) % 2) - 1], 1).show();
        int i22 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr17 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iNextInt = new Random().nextInt();
        int i23 = ~iNextInt;
        int i24 = i22 + (((~(502723439 | i23)) | (~((-140775947) | iNextInt))) * 988) + 88960369 + (((~(iNextInt | 149345067)) | 353378372 | (~(i23 | (-140775947)))) * 988);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr17[3])[0] = i26 ^ (i26 << 5);
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int iMyPid = (Process.myPid() >> 22) + 1031;
            int keyRepeatDelay = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr = $$a;
            short s = bArr[7];
            Object[] objArr2 = new Object[1];
            c(s, (byte) (s | 52), bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, iMyPid, keyRepeatDelay, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{48553, 4983, 57358, 45513, 1763, 55220, 42314, 31313, 52015, 39138, 27084, 16224, 35965, 23846, 13010, 33682, 20661, 9834, 63254, 17444, 5631, 60038}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 44742, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{48557, 43905, 37347, 65495, 58671, 54036, 14706, 9881, 3205, 31460, 24790, 20011, 46109, 41540, 35755}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_xl_tunai).substring(1, 3).codePointAt(1) + 5548, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
            int mirror = '?' - AndroidCharacter.getMirror('0');
            short s2 = (short) ($$b & 245);
            Object[] objArr5 = new Object[1];
            c(s2, (byte) s2, $$a[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, iCombineMeasuredStates, mirror, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = notify + 105;
            g = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
                byte b = $$a[7];
                Object[] objArr6 = new Object[1];
                c((short) 104, b, b, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iIndexOf, touchSlop, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i8 = 320980596 + ((~(225400297 | i7)) * (-301)) + (((~((-86595009) | i7)) | (~((~i7) | 157685161))) * (-301)) + (((~(i7 | (-157685162))) | (-86595009)) * 301) + 686010332;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{48546, 24608, 1708, 9522, 52162, 60937, 35999, 45849, 20967, 29751, 6849, 14674, 57303, 33353, 41171, 18082}, 56713 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{48545, 49115, 47427, 47811, 46176, 45554, 45942, 44272, 44600, 43910, 42269, 42685, 40991, 40364, 40750, 39252}, 631 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1692803536};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46038), TextUtils.lastIndexOf("", '0') + 1135, (ViewConfiguration.getScrollBarSize() >> 8) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 686010332, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
                    byte[] bArr2 = $$a;
                    short s3 = bArr2[7];
                    Object[] objArr12 = new Object[1];
                    c(s3, (byte) (s3 | 52), bArr2[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iIndexOf2, iKeyCodeFromString, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1117, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 16;
                    byte b2 = $$a[7];
                    Object[] objArr13 = new Object[1];
                    c((short) 104, b2, b2, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, iLastIndexOf, iIndexOf3, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{48553, 4983, 57358, 45513, 1763, 55220, 42314, 31313, 52015, 39138, 27084, 16224, 35965, 23846, 13010, 33682, 20661, 9834, 63254, 17444, 5631, 60038}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step1).substring(2, 4).length() + 44751, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{48557, 43905, 37347, 65495, 58671, 54036, 14706, 9881, 3205, 31460, 24790, 20011, 46109, 41540, 35755}, TextUtils.indexOf("", "", 0, 0) + 5669, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i11 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        short s4 = (short) ($$b & 245);
                        Object[] objArr16 = new Object[1];
                        c(s4, (byte) s4, $$a[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, keyRepeatTimeout, i11, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i12 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
                        int iRgb = Color.rgb(0, 0, 0) + 16777231;
                        byte[] bArr3 = $$a;
                        short s5 = bArr3[7];
                        Object[] objArr17 = new Object[1];
                        c(s5, (byte) (s5 | 52), bArr3[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(windowTouchSlop, i12, iRgb, 1357589585, false, (String) objArr17[0], null);
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
            while (i2 < strArr2.length) {
                arrayList.add(strArr2[i2]);
                i2++;
            }
            throw null;
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[3])[0];
        int i15 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i16 = ~startUptimeMillis;
        int i17 = (~((-837603082) | i16)) | 558646025;
        int i18 = ~(startUptimeMillis | 872279967);
        int i19 = i13 + (-1707703270) + ((i17 | i18) * (-713)) + (i18 * 1426) + ((~(593322911 | i16)) * 713);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
        int i22 = notify + 93;
        g = i22 % 128;
        int i23 = i22 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char offsetBefore2 = (char) (29944 - TextUtils.getOffsetBefore("", 0));
            int iRgb2 = (-16775461) - Color.rgb(0, 0, 0);
            int iResolveOpacity = 23 - Drawable.resolveOpacity(0, 0);
            Object[] objArr19 = new Object[1];
            c((short) 104, (byte) 37, $$a[132], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(offsetBefore2, iRgb2, iResolveOpacity, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i24 = notify + 11;
            g = i24 % 128;
            int i25 = i24 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                int windowTouchSlop2 = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int i26 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23;
                short s6 = (short) ($$b & 245);
                Object[] objArr20 = new Object[1];
                c(s6, (byte) s6, $$a[132], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c3, windowTouchSlop2, i26, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i27 = ((int[]) objArr21[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{i27}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int i28 = ~((int) Runtime.getRuntime().totalMemory());
            int i29 = (((-1273581284) + (((~((-1007770129) | i28)) | 795167702) * (-933))) + (((~(i28 | 795167702)) | (-1064655831)) * 933)) - 169672463;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i31 ^ (i31 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{48546, 24608, 1708, 9522, 52162, 60937, 35999, 45849, 20967, 29751, 6849, 14674, 57303, 33353, 41171, 18082}, ((Process.getThreadPriority(0) + 20) >> 6) + 56713, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{48545, 49115, 47427, 47811, 46176, 45554, 45942, 44272, 44600, 43910, 42269, 42685, 40991, 40364, 40750, 39252}, Color.argb(0, 0, 0, 0) + 631, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-1692803536};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1727 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -1704424877, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                int iMyPid2 = (Process.myPid() >> 22) + 1755;
                int windowTouchSlop3 = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                short s7 = (short) ($$b & 245);
                Object[] objArr25 = new Object[1];
                c(s7, (byte) s7, $$a[132], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cNormalizeMetaState, iMyPid2, windowTouchSlop3, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{48553, 4983, 57358, 45513, 1763, 55220, 42314, 31313, 52015, 39138, 27084, 16224, 35965, 23846, 13010, 33682, 20661, 9834, 63254, 17444, 5631, 60038}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 44644, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{48557, 43905, 37347, 65495, 58671, 54036, 14706, 9881, 3205, 31460, 24790, 20011, 46109, 41540, 35755}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step4).substring(16, 17).codePointAt(0) + 5570, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c4 = (char) (29945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int i32 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i33 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    Object[] objArr28 = new Object[1];
                    c((short) 141, (byte) ($$b & 245), $$a[132], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c4, i32, i33, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c5 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                    int iArgb = Color.argb(0, 0, 0, 0) + 1755;
                    int i34 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    Object[] objArr29 = new Object[1];
                    c((short) 104, (byte) 37, $$a[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c5, iArgb, i34, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i35 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i36 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i36 != i35) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr4 != null) {
                while (i2 < strArr4.length) {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i36));
        }
        int i37 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        int i38 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        Object[] objArr30 = {new int[]{i38}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int i39 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 547262631;
        int i40 = (~(206376630 | i39)) | 279973952;
        int i41 = ~i39;
        int i42 = i37 + 2075216083 + ((i40 | (~((-67371527) | i41))) * 886) + (((~(i41 | (-206376631))) | 418979056) * (-1772)) + ((~(i41 | 418979056)) * 886);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr30[3])[0] = i44 ^ (i44 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = notify + 83;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i5 = (-1316836496) + (((~((-941612483) | i4)) | 1771600025) * (-318));
            int i6 = ~(1771600025 | i4);
            int i7 = ~i4;
            if (i3 != i5 + ((i6 | (~(i7 | (-1098915866)))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i4 | (-1098915866))) | (~(2040528347 | i7))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
                throw null;
            }
        } else {
            int i8 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode;
            if (i8 != 475278640 + (((~(1638699151 | i9)) | 808711608) * (-90)) + (((~(1638699151 | iIdentityHashCode)) | 1099694087) * (-45)) + (((~(iIdentityHashCode | (-808711609))) | 1638699151 | (~(i9 | 808711608))) * 45)) {
                throw null;
            }
        }
        int i10 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i11 = ~iIdentityHashCode2;
        if (i10 != (-272272950) + (((~(2074252872 | i11)) | (~((-1788871753) | iIdentityHashCode2))) * (-831)) + ((~(2147213293 | iIdentityHashCode2)) * (-1662)) + (((~(iIdentityHashCode2 | (-2074252873))) | (~(i11 | (-358341542))) | (~(358341541 | iIdentityHashCode2))) * 831)) {
            throw null;
        }
        super.onResume();
        int i12 = notify + 9;
        g = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = notify + 79;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[1]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1830244465;
            int i5 = ~i4;
            int i6 = 1427592856 + (((~((-268437802) | i5)) | (~((-1342022677) | i4))) * 520);
            int i7 = ~(1342022676 | i5);
            int i8 = ~(i4 | 512035133);
            if (i3 != i6 + ((i7 | i8) * (-1040)) + ((i8 | (~(i5 | (-512035134))) | (-1610460478)) * 520)) {
                throw null;
            }
        } else {
            int i9 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i10 = ~iIdentityHashCode;
            if (i9 != (-39651216) + ((924514088 | i10) * (-757)) + ((~(2140927999 | iIdentityHashCode)) * 1514) + (((~(iIdentityHashCode | (-1216413912))) | (~(i10 | 1754501631)) | 386426368) * 757)) {
                throw null;
            }
        }
        int i11 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        if (i11 != (-131916912) + (((~(2041344058 | layoutDirection)) | 1753759784) * (-502)) + ((~((~layoutDirection) | 2079192511)) * (-502)) + (((~(layoutDirection | (-325432728))) | 2041344058) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            throw null;
        }
        super.onStart();
        int i12 = notify + 67;
        g = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = g + 125;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1770939184;
        if (i4 != 593327044 + (((~(i5 | 37017047)) | 867004590) * (-668)) + ((37017047 | (~(867004590 | i5))) * 1336) + ((i5 | 868087295) * 668)) {
            throw new RuntimeException("581845121");
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1707227499;
        if (i6 != 1148801205 + (((~((~i7) | (-65066734))) | (-1780978065)) * (-235)) + (((~((-65066734) | i7)) | (-1780978065)) * (-470)) + (((~(i7 | (-35688577))) | (-1810356222)) * 235)) {
            throw null;
        }
        super.onCreate(bundle);
        int i8 = g + 109;
        notify = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(final IndonesianMigrantWorkerActivationActivity indonesianMigrantWorkerActivationActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: setOnChooseActivityListener
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    IndonesianMigrantWorkerActivationActivity.b(this.b, i2, i3, i4);
                }
            }, indonesianMigrantWorkerActivationActivity.b.get(1), indonesianMigrantWorkerActivationActivity.b.get(2), indonesianMigrantWorkerActivationActivity.b.get(5)).show();
            ViewPortBuilder.b();
            int i2 = g + 87;
            notify = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void b(IndonesianMigrantWorkerActivationActivity indonesianMigrantWorkerActivationActivity, int i, int i2, int i3) {
        int i4 = 2 % 2;
        indonesianMigrantWorkerActivationActivity.b.set(1, i);
        indonesianMigrantWorkerActivationActivity.b.set(2, i2);
        indonesianMigrantWorkerActivationActivity.b.set(5, i3);
        indonesianMigrantWorkerActivationActivity.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(indonesianMigrantWorkerActivationActivity.b.getTime()));
        int i5 = g + 47;
        notify = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = g + 13;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = g + 9;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault3(IndonesianMigrantWorkerActivationActivity indonesianMigrantWorkerActivationActivity) {
        int i = 2 % 2;
        int i2 = notify + 125;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Parcelable parcelableExtra = indonesianMigrantWorkerActivationActivity.getIntent().getParcelableExtra("registration_data");
            Intrinsics.checkNotNull(parcelableExtra);
            return (RegisteredMemberRegistration) parcelableExtra;
        }
        Parcelable parcelableExtra2 = indonesianMigrantWorkerActivationActivity.getIntent().getParcelableExtra("registration_data");
        Intrinsics.checkNotNull(parcelableExtra2);
        int i3 = 48 / 0;
        return (RegisteredMemberRegistration) parcelableExtra2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0225 A[Catch: all -> 0x02bf, TRY_LEAVE, TryCatch #0 {all -> 0x02bf, blocks: (B:3:0x000a, B:8:0x0020, B:13:0x0044, B:15:0x004a, B:25:0x0098, B:27:0x009d, B:29:0x00b5, B:43:0x00ea, B:72:0x0173, B:75:0x0184, B:77:0x018a, B:79:0x01a4, B:81:0x01aa, B:88:0x01c7, B:111:0x02bb, B:89:0x01d8, B:92:0x01f1, B:94:0x01f7, B:96:0x020d, B:98:0x0215, B:100:0x021a, B:102:0x0225, B:105:0x0234, B:110:0x0254, B:99:0x0218, B:46:0x00f0, B:52:0x0115, B:55:0x0122, B:57:0x012b, B:59:0x0138, B:63:0x0149, B:65:0x0155, B:67:0x015b, B:70:0x0169, B:71:0x0172, B:31:0x00be, B:32:0x00c2, B:34:0x00c8, B:36:0x00d4, B:38:0x00da, B:11:0x0034, B:16:0x0064, B:20:0x007c, B:24:0x0086, B:21:0x0081, B:22:0x0084), top: B:116:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0233  */
    /* JADX WARN: Code duplicated, block: B:107:0x0246  */
    /* JADX WARN: Code duplicated, block: B:109:0x0252  */
    /* JADX WARN: Code duplicated, block: B:117:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[LOOP:0: B:59:0x0138->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:57:0x012b A[Catch: all -> 0x02bf, TRY_LEAVE, TryCatch #0 {all -> 0x02bf, blocks: (B:3:0x000a, B:8:0x0020, B:13:0x0044, B:15:0x004a, B:25:0x0098, B:27:0x009d, B:29:0x00b5, B:43:0x00ea, B:72:0x0173, B:75:0x0184, B:77:0x018a, B:79:0x01a4, B:81:0x01aa, B:88:0x01c7, B:111:0x02bb, B:89:0x01d8, B:92:0x01f1, B:94:0x01f7, B:96:0x020d, B:98:0x0215, B:100:0x021a, B:102:0x0225, B:105:0x0234, B:110:0x0254, B:99:0x0218, B:46:0x00f0, B:52:0x0115, B:55:0x0122, B:57:0x012b, B:59:0x0138, B:63:0x0149, B:65:0x0155, B:67:0x015b, B:70:0x0169, B:71:0x0172, B:31:0x00be, B:32:0x00c2, B:34:0x00c8, B:36:0x00d4, B:38:0x00da, B:11:0x0034, B:16:0x0064, B:20:0x007c, B:24:0x0086, B:21:0x0081, B:22:0x0084), top: B:116:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0149 A[Catch: all -> 0x02bf, TRY_ENTER, TryCatch #0 {all -> 0x02bf, blocks: (B:3:0x000a, B:8:0x0020, B:13:0x0044, B:15:0x004a, B:25:0x0098, B:27:0x009d, B:29:0x00b5, B:43:0x00ea, B:72:0x0173, B:75:0x0184, B:77:0x018a, B:79:0x01a4, B:81:0x01aa, B:88:0x01c7, B:111:0x02bb, B:89:0x01d8, B:92:0x01f1, B:94:0x01f7, B:96:0x020d, B:98:0x0215, B:100:0x021a, B:102:0x0225, B:105:0x0234, B:110:0x0254, B:99:0x0218, B:46:0x00f0, B:52:0x0115, B:55:0x0122, B:57:0x012b, B:59:0x0138, B:63:0x0149, B:65:0x0155, B:67:0x015b, B:70:0x0169, B:71:0x0172, B:31:0x00be, B:32:0x00c2, B:34:0x00c8, B:36:0x00d4, B:38:0x00da, B:11:0x0034, B:16:0x0064, B:20:0x007c, B:24:0x0086, B:21:0x0081, B:22:0x0084), top: B:116:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0155 A[Catch: all -> 0x02bf, TryCatch #0 {all -> 0x02bf, blocks: (B:3:0x000a, B:8:0x0020, B:13:0x0044, B:15:0x004a, B:25:0x0098, B:27:0x009d, B:29:0x00b5, B:43:0x00ea, B:72:0x0173, B:75:0x0184, B:77:0x018a, B:79:0x01a4, B:81:0x01aa, B:88:0x01c7, B:111:0x02bb, B:89:0x01d8, B:92:0x01f1, B:94:0x01f7, B:96:0x020d, B:98:0x0215, B:100:0x021a, B:102:0x0225, B:105:0x0234, B:110:0x0254, B:99:0x0218, B:46:0x00f0, B:52:0x0115, B:55:0x0122, B:57:0x012b, B:59:0x0138, B:63:0x0149, B:65:0x0155, B:67:0x015b, B:70:0x0169, B:71:0x0172, B:31:0x00be, B:32:0x00c2, B:34:0x00c8, B:36:0x00d4, B:38:0x00da, B:11:0x0034, B:16:0x0064, B:20:0x007c, B:24:0x0086, B:21:0x0081, B:22:0x0084), top: B:116:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:66:0x015a  */
    /* JADX WARN: Code duplicated, block: B:74:0x017b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0189  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a4 A[Catch: all -> 0x02bf, TryCatch #0 {all -> 0x02bf, blocks: (B:3:0x000a, B:8:0x0020, B:13:0x0044, B:15:0x004a, B:25:0x0098, B:27:0x009d, B:29:0x00b5, B:43:0x00ea, B:72:0x0173, B:75:0x0184, B:77:0x018a, B:79:0x01a4, B:81:0x01aa, B:88:0x01c7, B:111:0x02bb, B:89:0x01d8, B:92:0x01f1, B:94:0x01f7, B:96:0x020d, B:98:0x0215, B:100:0x021a, B:102:0x0225, B:105:0x0234, B:110:0x0254, B:99:0x0218, B:46:0x00f0, B:52:0x0115, B:55:0x0122, B:57:0x012b, B:59:0x0138, B:63:0x0149, B:65:0x0155, B:67:0x015b, B:70:0x0169, B:71:0x0172, B:31:0x00be, B:32:0x00c2, B:34:0x00c8, B:36:0x00d4, B:38:0x00da, B:11:0x0034, B:16:0x0064, B:20:0x007c, B:24:0x0086, B:21:0x0081, B:22:0x0084), top: B:116:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:96:0x020d A[Catch: all -> 0x02bf, TryCatch #0 {all -> 0x02bf, blocks: (B:3:0x000a, B:8:0x0020, B:13:0x0044, B:15:0x004a, B:25:0x0098, B:27:0x009d, B:29:0x00b5, B:43:0x00ea, B:72:0x0173, B:75:0x0184, B:77:0x018a, B:79:0x01a4, B:81:0x01aa, B:88:0x01c7, B:111:0x02bb, B:89:0x01d8, B:92:0x01f1, B:94:0x01f7, B:96:0x020d, B:98:0x0215, B:100:0x021a, B:102:0x0225, B:105:0x0234, B:110:0x0254, B:99:0x0218, B:46:0x00f0, B:52:0x0115, B:55:0x0122, B:57:0x012b, B:59:0x0138, B:63:0x0149, B:65:0x0155, B:67:0x015b, B:70:0x0169, B:71:0x0172, B:31:0x00be, B:32:0x00c2, B:34:0x00c8, B:36:0x00d4, B:38:0x00da, B:11:0x0034, B:16:0x0064, B:20:0x007c, B:24:0x0086, B:21:0x0081, B:22:0x0084), top: B:116:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0218 A[Catch: all -> 0x02bf, TryCatch #0 {all -> 0x02bf, blocks: (B:3:0x000a, B:8:0x0020, B:13:0x0044, B:15:0x004a, B:25:0x0098, B:27:0x009d, B:29:0x00b5, B:43:0x00ea, B:72:0x0173, B:75:0x0184, B:77:0x018a, B:79:0x01a4, B:81:0x01aa, B:88:0x01c7, B:111:0x02bb, B:89:0x01d8, B:92:0x01f1, B:94:0x01f7, B:96:0x020d, B:98:0x0215, B:100:0x021a, B:102:0x0225, B:105:0x0234, B:110:0x0254, B:99:0x0218, B:46:0x00f0, B:52:0x0115, B:55:0x0122, B:57:0x012b, B:59:0x0138, B:63:0x0149, B:65:0x0155, B:67:0x015b, B:70:0x0169, B:71:0x0172, B:31:0x00be, B:32:0x00c2, B:34:0x00c8, B:36:0x00d4, B:38:0x00da, B:11:0x0034, B:16:0x0064, B:20:0x007c, B:24:0x0086, B:21:0x0081, B:22:0x0084), top: B:116:0x000a }] */
    public static /* synthetic */ void b(IndonesianMigrantWorkerActivationActivity indonesianMigrantWorkerActivationActivity, ActivityIndonesianMigrantWorkerActivationBinding activityIndonesianMigrantWorkerActivationBinding, View view) {
        Editable text;
        boolean z;
        Iterator it;
        int i;
        EditText editText;
        Editable text2;
        EditText editText2;
        Editable text3;
        EditText editText3;
        Editable text4;
        EditText editText4;
        Editable text5;
        String str;
        EditText editText5;
        Editable text6;
        String str2;
        EditText editText6;
        Editable text7;
        int i2 = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            boolean z2 = true;
            if (indonesianMigrantWorkerActivationActivity.a) {
                int i3 = g + 43;
                notify = i3 % 128;
                if (i3 % 2 == 0) {
                    indonesianMigrantWorkerActivationActivity.asBinder = "-";
                    editText6 = indonesianMigrantWorkerActivationActivity.INotificationSideChannelStub().tilIdPassport.getEditText();
                    int i4 = 82 / 0;
                    if (editText6 != null) {
                        text7 = editText6.getText();
                    } else {
                        text7 = null;
                    }
                } else {
                    indonesianMigrantWorkerActivationActivity.asBinder = "-";
                    editText6 = indonesianMigrantWorkerActivationActivity.INotificationSideChannelStub().tilIdPassport.getEditText();
                    if (editText6 != null) {
                        text7 = editText6.getText();
                    } else {
                        text7 = null;
                    }
                }
                String upperCase = StringsKt.trim((CharSequence) String.valueOf(text7)).toString().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                indonesianMigrantWorkerActivationActivity.g = upperCase;
            } else {
                EditText editText7 = indonesianMigrantWorkerActivationActivity.INotificationSideChannelStub().tilIdentityNumber.getEditText();
                if (editText7 != null) {
                    int i5 = notify + 1;
                    g = i5 % 128;
                    if (i5 % 2 != 0) {
                        editText7.getText();
                        throw null;
                    }
                    text = editText7.getText();
                } else {
                    text = null;
                }
                indonesianMigrantWorkerActivationActivity.asBinder = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                indonesianMigrantWorkerActivationActivity.g = "-";
            }
            if (indonesianMigrantWorkerActivationActivity.a) {
                z = false;
            } else {
                List listListOf = CollectionsKt.listOf((Object[]) new TextInputLayout[]{activityIndonesianMigrantWorkerActivationBinding.tilIdentityNumber, activityIndonesianMigrantWorkerActivationBinding.tilFullName, activityIndonesianMigrantWorkerActivationBinding.tilBirthDate});
                if (!(listListOf instanceof Collection) || !listListOf.isEmpty()) {
                    Iterator it2 = listListOf.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            EditText editText8 = ((TextInputLayout) it2.next()).getEditText();
                            if (String.valueOf(editText8 != null ? editText8.getText() : null).length() <= 0) {
                                z = false;
                            }
                        }
                    }
                }
                z = true;
            }
            if (indonesianMigrantWorkerActivationActivity.a) {
                List listListOf2 = CollectionsKt.listOf((Object[]) new TextInputLayout[]{activityIndonesianMigrantWorkerActivationBinding.tilIdPassport, activityIndonesianMigrantWorkerActivationBinding.tilFullName, activityIndonesianMigrantWorkerActivationBinding.tilBirthDate});
                if (!(listListOf2 instanceof Collection)) {
                    it = listListOf2.iterator();
                    int i6 = g + 19;
                    notify = i6 % 128;
                    int i7 = i6 % 2;
                    while (it.hasNext()) {
                        i = notify + 27;
                        g = i % 128;
                        if (i % 2 != 0) {
                            ((TextInputLayout) it.next()).getEditText();
                            throw null;
                        }
                        editText = ((TextInputLayout) it.next()).getEditText();
                        if (editText != null) {
                            text2 = editText.getText();
                        } else {
                            text2 = null;
                        }
                        if (String.valueOf(text2).length() <= 0) {
                        }
                    }
                } else {
                    int i8 = notify + 81;
                    g = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 40 / 0;
                        if (!listListOf2.isEmpty()) {
                            it = listListOf2.iterator();
                            int i10 = g + 19;
                            notify = i10 % 128;
                            int i11 = i10 % 2;
                            while (it.hasNext()) {
                                i = notify + 27;
                                g = i % 128;
                                if (i % 2 != 0) {
                                    ((TextInputLayout) it.next()).getEditText();
                                    throw null;
                                }
                                editText = ((TextInputLayout) it.next()).getEditText();
                                if (editText != null) {
                                    text2 = editText.getText();
                                } else {
                                    text2 = null;
                                }
                                if (String.valueOf(text2).length() <= 0) {
                                }
                            }
                        }
                    } else if (!listListOf2.isEmpty()) {
                        it = listListOf2.iterator();
                        int i12 = g + 19;
                        notify = i12 % 128;
                        int i13 = i12 % 2;
                        while (it.hasNext()) {
                            i = notify + 27;
                            g = i % 128;
                            if (i % 2 != 0) {
                                ((TextInputLayout) it.next()).getEditText();
                                throw null;
                            }
                            editText = ((TextInputLayout) it.next()).getEditText();
                            if (editText != null) {
                                text2 = editText.getText();
                            } else {
                                text2 = null;
                            }
                            if (String.valueOf(text2).length() <= 0) {
                            }
                        }
                    }
                }
                editText2 = activityIndonesianMigrantWorkerActivationBinding.tilIdPassport.getEditText();
                if (editText2 != null) {
                    int i14 = g + 5;
                    notify = i14 % 128;
                    int i15 = i14 % 2;
                    text3 = editText2.getText();
                } else {
                    text3 = null;
                }
                int length = StringsKt.trim((CharSequence) String.valueOf(text3)).toString().length();
                editText3 = activityIndonesianMigrantWorkerActivationBinding.tilIdentityNumber.getEditText();
                if (editText3 != null) {
                    text4 = editText3.getText();
                } else {
                    text4 = null;
                }
                int length2 = StringsKt.trim((CharSequence) String.valueOf(text4)).toString().length();
                if ((!z || z2) && (length >= 6 || length2 == 16)) {
                    final setSplitTrack setsplittrack = (setSplitTrack) indonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    editText4 = activityIndonesianMigrantWorkerActivationBinding.tilBirthDate.getEditText();
                    if (editText4 != null) {
                        int i16 = g + 35;
                        notify = i16 % 128;
                        int i17 = i16 % 2;
                        text5 = editText4.getText();
                    } else {
                        text5 = null;
                    }
                    String string = StringsKt.trim((CharSequence) String.valueOf(text5)).toString();
                    if (!Intrinsics.areEqual(indonesianMigrantWorkerActivationActivity.g, "-") || Intrinsics.areEqual(indonesianMigrantWorkerActivationActivity.g, "")) {
                        str = indonesianMigrantWorkerActivationActivity.asBinder;
                    } else {
                        str = indonesianMigrantWorkerActivationActivity.g;
                    }
                    String str3 = str;
                    editText5 = activityIndonesianMigrantWorkerActivationBinding.tilFullName.getEditText();
                    if (editText5 != null) {
                        text6 = editText5.getText();
                        int i18 = notify + 123;
                        g = i18 % 128;
                        int i19 = i18 % 2;
                    } else {
                        text6 = null;
                    }
                    String string2 = StringsKt.trim((CharSequence) String.valueOf(text6)).toString();
                    if (indonesianMigrantWorkerActivationActivity.a) {
                        str2 = "PASSPORT";
                    } else {
                        int i20 = notify + 111;
                        g = i20 % 128;
                        int i21 = i20 % 2;
                        str2 = "KTP";
                    }
                    String str4 = str2;
                    String strValueOf = String.valueOf(((RegisteredMemberRegistration) indonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    setSessionCaptureCallback setsessioncapturecallback = setSessionCaptureCallback.INSTANCE;
                    ActivationRequest activationRequest = new ActivationRequest(str3, "", string2, string, str4, strValueOf, setSessionCaptureCallback.b(indonesianMigrantWorkerActivationActivity));
                    Intrinsics.checkNotNullParameter(activationRequest, "");
                    MutableLiveData<VirtualCameraAdapter1<ActivationItem>> mutableLiveData = setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setsplittrack.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activationRequest)));
                    final measureChildConstrained measurechildconstrained = new measureChildConstrained(setsplittrack);
                    logToString logtostring = new logToString() { // from class: getContentInsetEnd
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            measurechildconstrained.invoke(obj);
                        }
                    };
                    final Function1 function1 = new Function1() { // from class: getContentInsetStartWithNavigation
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return setSplitTrack.RemoteActionCompatParcelizer(setsplittrack, (Throwable) obj);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: inflateMenu
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function1.invoke(obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    setsplittrack.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Silakan lengkapi data diri anda terlebih dahulu.", 0).show();
                }
                ViewPortBuilder.b();
            }
            z2 = false;
            editText2 = activityIndonesianMigrantWorkerActivationBinding.tilIdPassport.getEditText();
            if (editText2 != null) {
                int i110 = g + 5;
                notify = i110 % 128;
                int i111 = i110 % 2;
                text3 = editText2.getText();
            } else {
                text3 = null;
            }
            int length3 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString().length();
            editText3 = activityIndonesianMigrantWorkerActivationBinding.tilIdentityNumber.getEditText();
            if (editText3 != null) {
                text4 = editText3.getText();
            } else {
                text4 = null;
            }
            int length4 = StringsKt.trim((CharSequence) String.valueOf(text4)).toString().length();
            if (z) {
                final setSplitTrack setsplittrack2 = (setSplitTrack) indonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                editText4 = activityIndonesianMigrantWorkerActivationBinding.tilBirthDate.getEditText();
                if (editText4 != null) {
                    int i112 = g + 35;
                    notify = i112 % 128;
                    int i113 = i112 % 2;
                    text5 = editText4.getText();
                } else {
                    text5 = null;
                }
                String string3 = StringsKt.trim((CharSequence) String.valueOf(text5)).toString();
                if (Intrinsics.areEqual(indonesianMigrantWorkerActivationActivity.g, "-")) {
                    str = indonesianMigrantWorkerActivationActivity.asBinder;
                } else {
                    str = indonesianMigrantWorkerActivationActivity.asBinder;
                }
                String str5 = str;
                editText5 = activityIndonesianMigrantWorkerActivationBinding.tilFullName.getEditText();
                if (editText5 != null) {
                    text6 = editText5.getText();
                    int i114 = notify + 123;
                    g = i114 % 128;
                    int i115 = i114 % 2;
                } else {
                    text6 = null;
                }
                String string4 = StringsKt.trim((CharSequence) String.valueOf(text6)).toString();
                if (indonesianMigrantWorkerActivationActivity.a) {
                    int i22 = notify + 111;
                    g = i22 % 128;
                    int i23 = i22 % 2;
                    str2 = "KTP";
                } else {
                    str2 = "PASSPORT";
                }
                String str6 = str2;
                String strValueOf2 = String.valueOf(((RegisteredMemberRegistration) indonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                setSessionCaptureCallback setsessioncapturecallback2 = setSessionCaptureCallback.INSTANCE;
                ActivationRequest activationRequest2 = new ActivationRequest(str5, "", string4, string3, str6, strValueOf2, setSessionCaptureCallback.b(indonesianMigrantWorkerActivationActivity));
                Intrinsics.checkNotNullParameter(activationRequest2, "");
                MutableLiveData<VirtualCameraAdapter1<ActivationItem>> mutableLiveData2 = setsplittrack2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setsplittrack2.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activationRequest2)));
                final Function1 measurechildconstrained2 = new measureChildConstrained(setsplittrack2);
                logToString logtostring2 = new logToString() { // from class: getContentInsetEnd
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        measurechildconstrained2.invoke(obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: getContentInsetStartWithNavigation
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return setSplitTrack.RemoteActionCompatParcelizer(setsplittrack2, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: inflateMenu
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function2.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                setsplittrack2.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            } else {
                final setSplitTrack setsplittrack3 = (setSplitTrack) indonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                editText4 = activityIndonesianMigrantWorkerActivationBinding.tilBirthDate.getEditText();
                if (editText4 != null) {
                    int i116 = g + 35;
                    notify = i116 % 128;
                    int i117 = i116 % 2;
                    text5 = editText4.getText();
                } else {
                    text5 = null;
                }
                String string5 = StringsKt.trim((CharSequence) String.valueOf(text5)).toString();
                if (Intrinsics.areEqual(indonesianMigrantWorkerActivationActivity.g, "-")) {
                    str = indonesianMigrantWorkerActivationActivity.asBinder;
                } else {
                    str = indonesianMigrantWorkerActivationActivity.asBinder;
                }
                String str7 = str;
                editText5 = activityIndonesianMigrantWorkerActivationBinding.tilFullName.getEditText();
                if (editText5 != null) {
                    text6 = editText5.getText();
                    int i118 = notify + 123;
                    g = i118 % 128;
                    int i119 = i118 % 2;
                } else {
                    text6 = null;
                }
                String string6 = StringsKt.trim((CharSequence) String.valueOf(text6)).toString();
                if (indonesianMigrantWorkerActivationActivity.a) {
                    int i24 = notify + 111;
                    g = i24 % 128;
                    int i25 = i24 % 2;
                    str2 = "KTP";
                } else {
                    str2 = "PASSPORT";
                }
                String str8 = str2;
                String strValueOf3 = String.valueOf(((RegisteredMemberRegistration) indonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                setSessionCaptureCallback setsessioncapturecallback3 = setSessionCaptureCallback.INSTANCE;
                ActivationRequest activationRequest3 = new ActivationRequest(str7, "", string6, string5, str8, strValueOf3, setSessionCaptureCallback.b(indonesianMigrantWorkerActivationActivity));
                Intrinsics.checkNotNullParameter(activationRequest3, "");
                MutableLiveData<VirtualCameraAdapter1<ActivationItem>> mutableLiveData3 = setsplittrack3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB3 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setsplittrack3.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activationRequest3)));
                final Function1 measurechildconstrained3 = new measureChildConstrained(setsplittrack3);
                logToString logtostring3 = new logToString() { // from class: getContentInsetEnd
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        measurechildconstrained3.invoke(obj);
                    }
                };
                final Function1 function3 = new Function1() { // from class: getContentInsetStartWithNavigation
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return setSplitTrack.RemoteActionCompatParcelizer(setsplittrack3, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault5 = derivecodecB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring3, new logToString() { // from class: inflateMenu
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function3.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault5, "");
                setsplittrack3.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault5);
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(IndonesianMigrantWorkerActivationActivity indonesianMigrantWorkerActivationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        Editable text;
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 27;
        int i4 = i3 % 128;
        notify = i4;
        Editable text2 = null;
        if (i3 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            text2.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i5 = i2 + 1;
            notify = i5 % 128;
            if (i5 % 2 == 0) {
                indonesianMigrantWorkerActivationActivity.MediaBrowserCompat();
                int i6 = 35 / 0;
            } else {
                indonesianMigrantWorkerActivationActivity.MediaBrowserCompat();
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i7 = i4 + 81;
            g = i7 % 128;
            int i8 = i7 % 2;
            indonesianMigrantWorkerActivationActivity.IconCompatParcelizer();
            MembershipCheckNew membershipCheckNew = (MembershipCheckNew) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) indonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            String str = indonesianMigrantWorkerActivationActivity.asBinder;
            String str2 = indonesianMigrantWorkerActivationActivity.g;
            EditText editText = indonesianMigrantWorkerActivationActivity.INotificationSideChannelStub().tilFullName.getEditText();
            if (editText != null) {
                int i9 = notify + 17;
                g = i9 % 128;
                if (i9 % 2 != 0) {
                    text = editText.getText();
                    int i10 = 35 / 0;
                } else {
                    text = editText.getText();
                }
            } else {
                text = null;
            }
            String string = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
            EditText editText2 = indonesianMigrantWorkerActivationActivity.INotificationSideChannelStub().tilBirthDate.getEditText();
            if (editText2 != null) {
                text2 = editText2.getText();
                int i11 = notify + 81;
                g = i11 % 128;
                int i12 = i11 % 2;
            }
            RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, "", string, str, null, str2, null, null, StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), membershipCheckNew.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null, membershipCheckNew.b, null, null, null, null, null, null, null, 8342815);
            EmailVerificationActivity.Companion companion = EmailVerificationActivity.INSTANCE;
            EmailVerificationActivity.Companion.b(indonesianMigrantWorkerActivationActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i13 = i4 + 57;
            g = i13 % 128;
            int i14 = i13 % 2;
            indonesianMigrantWorkerActivationActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            String string2 = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
            String string3 = indonesianMigrantWorkerActivationActivity.getString(R.string.error_data_membership_not_found);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            if (StringsKt.contains$default((CharSequence) string2, (CharSequence) string3, false, 2, (Object) null)) {
                getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                String string4 = indonesianMigrantWorkerActivationActivity.getString(R.string.title_data_membership_not_found);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                String string5 = indonesianMigrantWorkerActivationActivity.getString(R.string.message_membership_not_found);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                String string6 = indonesianMigrantWorkerActivationActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string4, string5, string6, new Function0() { // from class: setActivityChooserModel
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IndonesianMigrantWorkerActivationActivity.g();
                    }
                }, 96);
                FragmentManager supportFragmentManager = indonesianMigrantWorkerActivationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                int i15 = g + 79;
                notify = i15 % 128;
                int i16 = i15 % 2;
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(indonesianMigrantWorkerActivationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        ActivityIndonesianMigrantWorkerActivationBinding activityIndonesianMigrantWorkerActivationBinding = (ActivityIndonesianMigrantWorkerActivationBinding) objArr[0];
        IndonesianMigrantWorkerActivationActivity indonesianMigrantWorkerActivationActivity = (IndonesianMigrantWorkerActivationActivity) objArr[1];
        RadioGroup radioGroup = (RadioGroup) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = g + 15;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(radioGroup, "");
        Object obj = null;
        if (iIntValue != activityIndonesianMigrantWorkerActivationBinding.rbNIK.getId()) {
            if (iIntValue == activityIndonesianMigrantWorkerActivationBinding.rbPaspor.getId()) {
                activityIndonesianMigrantWorkerActivationBinding.tilIdPassport.setVisibility(0);
                activityIndonesianMigrantWorkerActivationBinding.tilIdentityNumber.setVisibility(8);
                indonesianMigrantWorkerActivationActivity.a = true;
                indonesianMigrantWorkerActivationActivity.g = "";
                indonesianMigrantWorkerActivationActivity.asBinder = "";
                EditText editText = activityIndonesianMigrantWorkerActivationBinding.tilIdPassport.getEditText();
                if (editText != null) {
                    int i4 = g + 105;
                    notify = i4 % 128;
                    if (i4 % 2 == 0) {
                        editText.requestFocus();
                        int i5 = 71 / 0;
                    } else {
                        editText.requestFocus();
                    }
                }
                indonesianMigrantWorkerActivationActivity.d();
            }
            return null;
        }
        int i6 = notify + 3;
        g = i6 % 128;
        int i7 = i6 % 2;
        activityIndonesianMigrantWorkerActivationBinding.tilIdPassport.setVisibility(8);
        activityIndonesianMigrantWorkerActivationBinding.tilIdentityNumber.setVisibility(0);
        indonesianMigrantWorkerActivationActivity.a = false;
        indonesianMigrantWorkerActivationActivity.g = "";
        indonesianMigrantWorkerActivationActivity.asBinder = "";
        EditText editText2 = activityIndonesianMigrantWorkerActivationBinding.tilIdentityNumber.getEditText();
        if (editText2 != null) {
            int i8 = notify + 71;
            g = i8 % 128;
            if (i8 % 2 != 0) {
                editText2.requestFocus();
                obj.hashCode();
                throw null;
            }
            editText2.requestFocus();
        }
        indonesianMigrantWorkerActivationActivity.d();
        return null;
    }

    public static /* synthetic */ Unit cancelAll() {
        int i = 2 % 2;
        int i2 = g + 119;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = g + 125;
        notify = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x014c  */
    /* JADX WARN: Code duplicated, block: B:48:0x021f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0234  */
    /* JADX WARN: Code duplicated, block: B:52:0x0294  */
    /* JADX WARN: Code duplicated, block: B:53:0x029a  */
    public static /* synthetic */ Unit b(IndonesianMigrantWorkerActivationActivity indonesianMigrantWorkerActivationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        getStringOrNull getstringornullB;
        FragmentManager supportFragmentManager;
        String strName;
        Editable text;
        String str;
        StringBuilder sb;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = notify + 27;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                indonesianMigrantWorkerActivationActivity.MediaBrowserCompat();
                int i3 = 90 / 0;
            } else {
                indonesianMigrantWorkerActivationActivity.MediaBrowserCompat();
            }
        } else {
            Editable text2 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                indonesianMigrantWorkerActivationActivity.IconCompatParcelizer();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                if (Intrinsics.areEqual(String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleResetAcc()), "Y")) {
                    int i4 = g + 9;
                    notify = i4 % 128;
                    int i5 = i4 % 2;
                    if (Intrinsics.areEqual(String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleRegistration()), ExifInterface.GPS_DIRECTION_TRUE)) {
                        int i6 = notify + 121;
                        g = i6 % 128;
                        int i7 = i6 % 2;
                        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) indonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                        IndonesianMigrantWorkerActivationActivity indonesianMigrantWorkerActivationActivity2 = indonesianMigrantWorkerActivationActivity;
                        String string = Settings.Secure.getString(indonesianMigrantWorkerActivationActivity2.getContentResolver(), "android_id");
                        Intrinsics.checkExpressionValueIsNotNull(string, "");
                        EditText editText = indonesianMigrantWorkerActivationActivity.INotificationSideChannelStub().tilBirthDate.getEditText();
                        if (editText != null) {
                            int i8 = g + 87;
                            notify = i8 % 128;
                            int i9 = i8 % 2;
                            text = editText.getText();
                        } else {
                            text = null;
                        }
                        String string2 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                        if (Intrinsics.areEqual(indonesianMigrantWorkerActivationActivity.g, "-") || Intrinsics.areEqual(indonesianMigrantWorkerActivationActivity.g, "")) {
                            str = indonesianMigrantWorkerActivationActivity.asBinder;
                            sb = new StringBuilder();
                        } else {
                            str = indonesianMigrantWorkerActivationActivity.g;
                            sb = new StringBuilder();
                        }
                        sb.append(str);
                        sb.append("#T");
                        String string3 = sb.toString();
                        EditText editText2 = indonesianMigrantWorkerActivationActivity.INotificationSideChannelStub().tilFullName.getEditText();
                        if (editText2 != null) {
                            int i10 = g + 109;
                            notify = i10 % 128;
                            int i11 = i10 % 2;
                            text2 = editText2.getText();
                        }
                        RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, string, null, null, null, MembershipType.PMI, null, StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), string3, null, indonesianMigrantWorkerActivationActivity.g, null, null, string2, String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum()), null, String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature()), null, null, null, null, null, null, null, 8342830);
                        EmailActivationVerificationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = EmailActivationVerificationActivity.INSTANCE;
                        EmailActivationVerificationActivity.Companion.b(indonesianMigrantWorkerActivationActivity2, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    } else if (!Intrinsics.areEqual(String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleResetAcc()), ExifInterface.GPS_DIRECTION_TRUE) && Intrinsics.areEqual(String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleRegistration()), "Y")) {
                        int i12 = g + 21;
                        notify = i12 % 128;
                        int i13 = i12 % 2;
                        setSplitTrack setsplittrack = (setSplitTrack) indonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                        Context applicationContext = indonesianMigrantWorkerActivationActivity.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                        String string4 = Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
                        Intrinsics.checkExpressionValueIsNotNull(string4, "");
                        Citizenship citizenship = ((RegisteredMemberRegistration) indonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (citizenship != null) {
                            strName = citizenship.name();
                            int i14 = notify + 73;
                            g = i14 % 128;
                            int i15 = i14 % 2;
                        } else {
                            strName = null;
                        }
                        String strValueOf = String.valueOf(strName);
                        MembershipType membershipType = ((RegisteredMemberRegistration) indonesianMigrantWorkerActivationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        String strValueOf2 = String.valueOf(membershipType != null ? membershipType.name() : null);
                        EditText editText3 = indonesianMigrantWorkerActivationActivity.INotificationSideChannelStub().tilFullName.getEditText();
                        String string5 = StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString();
                        String str2 = indonesianMigrantWorkerActivationActivity.asBinder;
                        String str3 = indonesianMigrantWorkerActivationActivity.g;
                        EditText editText4 = indonesianMigrantWorkerActivationActivity.INotificationSideChannelStub().tilBirthDate.getEditText();
                        setsplittrack.b(new MembershipCheckRequest(string4, strValueOf, strValueOf2, "", string5, str2, str3, StringsKt.trim((CharSequence) String.valueOf(editText4 != null ? editText4.getText() : null)).toString()));
                    } else if (StringsKt.contains$default((CharSequence) ((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage(), (CharSequence) "|", false, 2, (Object) null)) {
                        List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) ((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString()).toString(), new String[]{"|"}, false, 0, 6, (Object) null);
                        String str4 = (String) listSplit$default.get(0);
                        String str5 = (String) listSplit$default.get(1);
                        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                        String string6 = indonesianMigrantWorkerActivationActivity.getString(R.string.action_ok);
                        Intrinsics.checkNotNullExpressionValue(string6, "");
                        getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, str4, str5, string6, new Function0() { // from class: getActivityIndex
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IndonesianMigrantWorkerActivationActivity.cancelAll();
                            }
                        }, 96);
                        supportFragmentManager = indonesianMigrantWorkerActivationActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    } else {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(indonesianMigrantWorkerActivationActivity, ((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage(), null);
                    }
                } else if (!Intrinsics.areEqual(String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleResetAcc()), ExifInterface.GPS_DIRECTION_TRUE)) {
                    if (StringsKt.contains$default((CharSequence) ((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage(), (CharSequence) "|", false, 2, (Object) null)) {
                        List listSplit$default2 = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) ((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString()).toString(), new String[]{"|"}, false, 0, 6, (Object) null);
                        String str6 = (String) listSplit$default2.get(0);
                        String str7 = (String) listSplit$default2.get(1);
                        getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                        String string7 = indonesianMigrantWorkerActivationActivity.getString(R.string.action_ok);
                        Intrinsics.checkNotNullExpressionValue(string7, "");
                        getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, str6, str7, string7, new Function0() { // from class: getActivityIndex
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IndonesianMigrantWorkerActivationActivity.cancelAll();
                            }
                        }, 96);
                        supportFragmentManager = indonesianMigrantWorkerActivationActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    } else {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(indonesianMigrantWorkerActivationActivity, ((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage(), null);
                    }
                } else if (StringsKt.contains$default((CharSequence) ((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage(), (CharSequence) "|", false, 2, (Object) null)) {
                    List listSplit$default3 = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) ((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString()).toString(), new String[]{"|"}, false, 0, 6, (Object) null);
                    String str8 = (String) listSplit$default3.get(0);
                    String str9 = (String) listSplit$default3.get(1);
                    getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
                    String string8 = indonesianMigrantWorkerActivationActivity.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string8, "");
                    getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, str8, str9, string8, new Function0() { // from class: getActivityIndex
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IndonesianMigrantWorkerActivationActivity.cancelAll();
                        }
                    }, 96);
                    supportFragmentManager = indonesianMigrantWorkerActivationActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                    if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(indonesianMigrantWorkerActivationActivity, ((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage(), null);
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                indonesianMigrantWorkerActivationActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(indonesianMigrantWorkerActivationActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    static {
        cancelAll = 1;
        onTransact();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 43;
        cancelAll = i % 128;
        if (i % 2 == 0) {
            int i2 = 77 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step7).substring(0, 3).length() - 2111600679, new Object[]{this}, -1959335329, 1323316517 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3), zzw.b(), 1959335330, zzo.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentbindingInflater1 = zzo.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = zzo.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzo.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, -1155175833, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater2, 1155175836, zzo.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentbindingInflater1 = zzo.TuitionPaymentFragmentbindingInflater1();
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 424404289;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzo.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 1347853461, iTuitionPaymentFragmentbindingInflater1, i, -1347853461, zzw.b());
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = notify + 37;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 63;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = notify + 115;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
    }

    static void onTransact() {
        d = -6167883582258670381L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = notify + 97;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
