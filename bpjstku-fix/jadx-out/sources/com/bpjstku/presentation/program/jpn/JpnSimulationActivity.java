package com.bpjstku.presentation.program.jpn;

import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
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
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.bpjstku.data.simulation.model.request.JpSimulationRequest;
import com.bpjstku.databinding.ActivityJpnSimulationBinding;
import com.bpjstku.domain.simulation.model.JpSimulation;
import com.bpjstku.presentation.program.jpn.JpnSimulationActivity;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.gms.internal.mlkit_vision_face.zzu;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.sessions.dagger.internal.Providers;
import defpackage.BufferProviderState;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.TargetAspectRatio;
import defpackage.TemplateParamsOverride;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCaptures;
import defpackage.accessconfigureInstanceInternal;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.deriveCodec;
import defpackage.generateCameraId;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRealtimeCaptureLatency;
import defpackage.hasProfile;
import defpackage.initSession;
import defpackage.isBound;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00138\u0015X\u0094D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0016\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0014\u0010\u001a\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010\b\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001f"}, d2 = {"Lcom/bpjstku/presentation/program/jpn/JpnSimulationActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityJpnSimulationBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "LhasProfile;", "Lkotlin/Lazy;", "Ljava/util/Calendar;", "Ljava/util/Calendar;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JpnSimulationActivity extends BindingReactiveFormActivity<ActivityJpnSimulationBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f609a;
    private static int cancelAll;
    private final Calendar TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int b = R.layout.activity_jpn_simulation;
    private final Calendar TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Calendar a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$a = {56, 94, 119, -19, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 199;
    private static int asInterface = 0;
    private static int g = 0;
    private static int asBinder = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i3);
        int i9 = (~(i | i2)) | i8;
        int i10 = (~(i2 | (~i3))) | (~((~i) | i7)) | i8;
        int i11 = i7 | i | i3;
        int i12 = i + i3 + i6 + (1050315579 * i5) + (2086215248 * i4);
        int i13 = i12 * i12;
        int i14 = (i * (-1156115713)) + 1671168000 + ((-1156115713) * i3) + ((-1856302338) * i9) + (i10 * 1856302338) + (1856302338 * i11) + (700186624 * i6) + ((-1303117824) * i5) + (314572800 * i4) + (431423488 * i13);
        int i15 = ((i * (-961373039)) - 1316831794) + (i3 * (-961373039)) + (i9 * (-990)) + (i10 * 990) + (i11 * 990) + (i6 * (-961372049)) + (i5 * 755842709) + (i4 * (-1858722640)) + (i13 * (-2040987648));
        int i16 = i14 + (i15 * i15 * 1361641472);
        if (i16 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i16 == 2) {
            return b(objArr);
        }
        if (i16 != 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        JpnSimulationActivity jpnSimulationActivity = (JpnSimulationActivity) objArr[0];
        int i17 = 2 % 2;
        JpnSimulationActivity jpnSimulationActivity2 = jpnSimulationActivity;
        Intrinsics.checkNotNullParameter(jpnSimulationActivity2, "");
        jpnSimulationActivity2.getWindow().addFlags(8192);
        jpnSimulationActivity.TuitionPaymentFragmentbindingInflater1((Toolbar) jpnSimulationActivity.INotificationSideChannelStub().layoutToolbar.toolbar, true);
        jpnSimulationActivity.INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(jpnSimulationActivity.getString(R.string.title_simulation_pension_ansurance));
        TextInputEditText textInputEditText = jpnSimulationActivity.INotificationSideChannelStub().edtAverageSalary;
        TextInputEditText textInputEditText2 = jpnSimulationActivity.INotificationSideChannelStub().edtAverageSalary;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "");
        textInputEditText.addTextChangedListener(new TemplateParamsOverride(textInputEditText2, "", new Locale("id", "ID")));
        int i18 = g + 81;
        asBinder = i18 % 128;
        int i19 = i18 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r6 = 53 - r6
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.program.jpn.JpnSimulationActivity.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r7]
        L25:
            int r7 = r7 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.JpnSimulationActivity.c(byte, short, short, java.lang.Object[]):void");
    }

    public JpnSimulationActivity() {
        final JpnSimulationActivity jpnSimulationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<hasProfile>() { // from class: com.bpjstku.presentation.program.jpn.JpnSimulationActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, hasProfile] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ hasProfile invoke() {
                LifecycleOwner lifecycleOwner = jpnSimulationActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(hasProfile.class);
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
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.TuitionPaymentFragmentbindingInflater1 = calendar;
        Calendar calendar2 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = calendar2;
        Calendar calendar3 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar3, "");
        this.a = calendar3;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jpn.JpnSimulationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/program/jpn/JpnSimulationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, JpnSimulationActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 49;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.b;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityJpnSimulationBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            JpnSimulationActivity$bindingInflater$1 jpnSimulationActivity$bindingInflater$1 = JpnSimulationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            throw null;
        }
        JpnSimulationActivity$bindingInflater$1 jpnSimulationActivity$bindingInflater$2 = JpnSimulationActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = asBinder + 47;
        g = i3 % 128;
        int i4 = i3 % 2;
        return jpnSimulationActivity$bindingInflater$2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 39;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 4;
        }
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $10 + 35;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19472), 2625 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() / (f609a - 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 39422), 481 - Drawable.resolveOpacity(0, 0), View.getDefaultSize(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                int i7 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 19472), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2624, '=' - AndroidCharacter.getMirror('0'), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (f609a ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 39422), 481 - (ViewConfiguration.getScrollBarSize() >> 8), 37 - (ViewConfiguration.getPressedStateDuration() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $11 + 93;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39470 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 481, (Process.myPid() >> 22) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 39422), 480 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityJpnSimulationBinding activityJpnSimulationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = activityJpnSimulationBindingINotificationSideChannelStub.btnCountSimulation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: Camera2RequestProcessor
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, activityJpnSimulationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        EditText editText = activityJpnSimulationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: Camera2PhysicalCameraInfoImpl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    JpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, activityJpnSimulationBindingINotificationSideChannelStub, view);
                }
            });
        }
        EditText editText2 = activityJpnSimulationBindingINotificationSideChannelStub.tilJpnStart.getEditText();
        if (editText2 != null) {
            editText2.setOnClickListener(new View.OnClickListener() { // from class: getCameraSelector
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr = {this.b, activityJpnSimulationBindingINotificationSideChannelStub, view};
                    int iTuitionPaymentFragmentbindingInflater1 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int iTuitionPaymentFragmentbindingInflater2 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    JpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-313547004, iTuitionPaymentFragmentbindingInflater1, 313547004, Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), objArr, iTuitionPaymentFragmentbindingInflater2);
                }
            });
            int i2 = asBinder + 33;
            g = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((hasProfile) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.observe(this, new Observer() { // from class: getAll
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                JpnSimulationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = g + 117;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:5:0x0016, B:14:0x0035, B:13:0x0032, B:11:0x0029), top: B:19:0x0011 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = g + 109;
        asBinder = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 90 / 0;
                if (p0.getItemId() == 16908332) {
                    onBackPressed();
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = asBinder + 75;
            g = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = g + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnCountSimulation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i4 = asBinder + 67;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = g + 73;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnCountSimulation;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
        } else {
            MaterialButton materialButton3 = INotificationSideChannelStub().btnCountSimulation;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
        }
        int i3 = asBinder + 15;
        g = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        ActivityJpnSimulationBinding activityJpnSimulationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = activityJpnSimulationBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        TextInputEditText textInputEditText = activityJpnSimulationBindingINotificationSideChannelStub.edtAverageSalary;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputEditText, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
        TextInputLayout textInputLayout2 = activityJpnSimulationBindingINotificationSideChannelStub.tilIncreaseSalaryperYear;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        int i2 = asBinder + 75;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
            int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
            int edgeSlop = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte[] bArr = $$a;
            byte b = (byte) (bArr[27] - 1);
            short s = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, s, (byte) s, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, i3, edgeSlop, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char tapTimeout = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr3 = new Object[1];
                c(b3, (short) (b3 | 37), b2, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, maxKeyCode, iRgb, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i5 = (((((~((-196805) | i4)) | 55086337) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1714447440) + ((~((~i4) | (-196805))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - 524616039;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{22192, 59674, 10734, 26712, 43120, 59539, 11133, 27603, 43957, 59997, 10947, 27976, 44325, 60803, 11377, 27864}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 49046, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{22195, 45617, 40865, 64281, 50322, 8312, 3572, 26954, 29418, 24508, 47935, 33943, 57389, 52726, 10604, 13022}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 58500, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-120591427};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 1726, 30 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -524616039, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                    int maxKeyCode2 = 1755 - (KeyEvent.getMaxKeyCode() >> 16);
                    int iMyTid = (Process.myTid() >> 22) + 23;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr8 = new Object[1];
                    c(b5, (short) (b5 | 37), b4, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, maxKeyCode2, iMyTid, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{22203, 31509, 3580, 56907, 57393, 45718, 18296, 27027, 15293, 52224, 40638, 41826, 29999, 1924, 10336, 64208, 36007, 20776, 25572, 13382, 50733, 59524}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_start_failed).substring(0, 30).codePointAt(25) + 11584, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{22207, 34939, 60193, 51917, 11677, 3262, 28272, 16659, 41175, 33678, 58036, 50273, 10031, 1758, 31113}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step3).substring(10, 11).codePointAt(0) + 56940, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int mirror = AndroidCharacter.getMirror('0') + 1707;
                        int iMyPid = (Process.myPid() >> 22) + 23;
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr11 = new Object[1];
                        c(b7, (short) (b7 | 89), b6, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, mirror, iMyPid, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
                        int defaultSize = 1755 - View.getDefaultSize(0, 0);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 23;
                        byte[] bArr2 = $$a;
                        byte b8 = (byte) (bArr2[27] - 1);
                        short s2 = bArr2[7];
                        Object[] objArr12 = new Object[1];
                        c(b8, s2, (byte) s2, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup, defaultSize, capsMode, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] == ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            int i8 = asBinder + 97;
            g = i8 % 128;
            int i9 = i8 % 2;
            int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_permata_transfer).substring(0, 12).codePointAt(10) - 865814207;
            int i11 = 2117682257 + ((~(iCodePointAt | 448740953)) * 216);
            int i12 = ~iCodePointAt;
            int i13 = i10 + i11 + ((515849823 | i12) * (-216)) + (((~(i12 | 448740953)) | (-236138528)) * 216);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr13[3])[0] = i15 ^ (i15 << 5);
            int i16 = g + 41;
            asBinder = i16 % 128;
            int i17 = i16 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
                int threadPriority = 15 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte b9 = $$a[7];
                byte b10 = b9;
                Object[] objArr14 = new Object[1];
                c(b10, (short) (b10 | 141), b9, objArr14);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(doubleTapTimeout, packedPositionType, threadPriority, 1357589585, false, (String) objArr14[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
            Object[] objArr15 = new Object[1];
            e(new char[]{22203, 31509, 3580, 56907, 57393, 45718, 18296, 27027, 15293, 52224, 40638, 41826, 29999, 1924, 10336, 64208, 36007, 20776, 25572, 13382, 50733, 59524}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unknown_error_while_generating_key_hash).substring(0, 35).codePointAt(25) + 11584, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            e(new char[]{22207, 34939, 60193, 51917, 11677, 3262, 28272, 16659, 41175, 33678, 58036, 50273, 10031, 1758, 31113}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.what_is_cvv).substring(7, 12).codePointAt(1) + 56970, objArr16);
            long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int iKeyCodeFromString = 1031 - KeyEvent.keyCodeFromString("");
                int iRgb2 = Color.rgb(0, 0, 0) + 16777231;
                byte b11 = $$a[7];
                byte b12 = b11;
                Object[] objArr17 = new Object[1];
                c(b12, (short) (b12 | 37), b11, objArr17);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumDrawingCacheSize, iKeyCodeFromString, iRgb2, 1344079056, false, (String) objArr17[0], null);
            }
            if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
                    int packedPositionGroup2 = 15 - ExpandableListView.getPackedPositionGroup(0L);
                    Object[] objArr18 = new Object[1];
                    c((byte) 52, (short) ($$b & PointerIconCompat.TYPE_VERTICAL_TEXT), $$a[28], objArr18);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(windowTouchSlop, modifierMetaStateMask, packedPositionGroup2, 632103528, false, (String) objArr18[0], null);
                }
                Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
                objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i18 = ((int[]) objArr19[3])[0];
                int i19 = ((int[]) objArr19[1])[0];
                String[] strArr = (String[]) objArr19[0];
                int i20 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
                int i21 = (-1560875166) + (((~((-1084547) | i20)) | (~(243195623 | i20))) * 69) + (((~(i20 | 41852066)) | (~((-202428104) | i20)) | 201343557) * (-69)) + 1510786707;
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr[2])[0] = i23 ^ (i23 << 5);
            } else {
                Object[] objArr20 = new Object[1];
                e(new char[]{22192, 59674, 10734, 26712, 43120, 59539, 11133, 27603, 43957, 59997, 10947, 27976, 44325, 60803, 11377, 27864}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 49021, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr21 = new Object[1];
                e(new char[]{22195, 45617, 40865, 64281, 50322, 8312, 3572, 26954, 29418, 24508, 47935, 33943, 57389, 52726, 10604, 13022}, 58511 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr21);
                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr22 = {-120591427};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46038), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1135, View.combineMeasuredStates(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -1302172173, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int i24 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int iRed = Color.red(0) + 15;
                    byte b13 = $$a[7];
                    byte b14 = b13;
                    Object[] objArr24 = new Object[1];
                    c(b14, (short) (b14 | 141), b13, objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf, i24, iRed, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1116 - TextUtils.lastIndexOf("", '0'), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int iResolveSize = View.resolveSize(0, 0) + 1031;
                    int i25 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14;
                    Object[] objArr25 = new Object[1];
                    c((byte) 52, (short) ($$b & PointerIconCompat.TYPE_VERTICAL_TEXT), $$a[28], objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, iResolveSize, i25, 632103528, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
                try {
                    Object[] objArr26 = new Object[1];
                    e(new char[]{22203, 31509, 3580, 56907, 57393, 45718, 18296, 27027, 15293, 52224, 40638, 41826, 29999, 1924, 10336, 64208, 36007, 20776, 25572, 13382, 50733, 59524}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11670, objArr26);
                    Class<?> cls5 = Class.forName((String) objArr26[0]);
                    Object[] objArr27 = new Object[1];
                    e(new char[]{22207, 34939, 60193, 51917, 11677, 3262, 28272, 16659, 41175, 33678, 58036, 50273, 10031, 1758, 31113}, 57036 - Process.getGidForName(""), objArr27);
                    long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char cBlue = (char) Color.blue(0);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1031;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 16;
                        byte b15 = $$a[7];
                        byte b16 = b15;
                        Object[] objArr28 = new Object[1];
                        c(b16, (short) (b16 | 37), b15, objArr28);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cBlue, offsetAfter, iIndexOf, 1344079056, false, (String) objArr28[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char c3 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int size = 1031 - View.MeasureSpec.getSize(0);
                        int iIndexOf2 = TextUtils.indexOf("", "", 0) + 15;
                        byte b17 = $$a[7];
                        byte b18 = b17;
                        Object[] objArr29 = new Object[1];
                        c(b18, (short) (b18 | 141), b17, objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, size, iIndexOf2, 1357589585, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                    int i26 = asBinder + 41;
                    g = i26 % 128;
                    int i27 = i26 % 2;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
            int i28 = ((int[]) objArr[1])[0];
            int i29 = ((int[]) objArr[3])[0];
            if (i29 == i28) {
                Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
                int i30 = ((int[]) objArr[2])[0];
                int i31 = ((int[]) objArr[3])[0];
                int i32 = ((int[]) objArr[1])[0];
                String[] strArr2 = (String[]) objArr[0];
                int i33 = (int) Runtime.getRuntime().totalMemory();
                int i34 = i30 + ((((-1301434946) + (((-7021641) | i33) * (-381))) + (((~((~i33) | (-409713775))) | 1049664438) * 381)) - 1619722456);
                int i35 = (i34 << 13) ^ i34;
                int i36 = i35 ^ (i35 >>> 17);
                ((int[]) objArr30[2])[0] = i36 ^ (i36 << 5);
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i37 = g + 95;
                asBinder = i37 % 128;
                for (int i38 = i37 % 2 == 0 ? 1 : 0; i38 < strArr3.length; i38++) {
                    arrayList.add(strArr3[i38]);
                }
            }
            Toast.makeText((Context) null, i29 / (((i29 - 1) * i29) % 2), 0).show();
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i39 = ((int[]) objArr[2])[0];
            int i40 = ((int[]) objArr[3])[0];
            int i41 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i42 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i43 = ~i42;
            int i44 = i39 + 1918448695 + (((~((-104269338) | i43)) | (~((-140010833) | i42))) * 217) + (((~(i42 | (-104269338))) | 1049616) * 217) + (((~((-140010833) | i43)) | 104269337) * 217);
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr31[2])[0] = i46 ^ (i46 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr5 == null) {
            throw null;
        }
        int i47 = asBinder + 29;
        g = i47 % 128;
        while (true) {
            int i48 = i47 % 2;
            if (i2 >= strArr5.length) {
                throw null;
            }
            arrayList2.add(strArr5[i2]);
            i2++;
            i47 = g + 57;
            asBinder = i47 % 128;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~((-195419365) | (~iIdentityHashCode));
        if (i4 != (((((-1069547520) | i5) | (~(195419364 | iIdentityHashCode))) * (-338)) - 1559796440) + (((~(iIdentityHashCode | (-874128156))) | i5) * 338)) {
            int i6 = 1926517118 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i8 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        if (i7 != 347296460 + (((-1350973441) | i8) * 184) + (((~(i8 | 691111918)) | (-1505114753)) * 184)) {
            int i9 = 445606812 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i10 = asBinder + 77;
        g = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0072  */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int iMyPid = Process.myPid();
            int i4 = ~((-410343797) | (~iMyPid));
            if (i3 != (((((-1509817728) | i4) | (~(410343796 | iMyPid))) * (-338)) - 47271384) + (((~(iMyPid | (-1099473932))) | i4) * 338)) {
                int[] iArr = new int[53515162];
                iArr[53515161] = 1;
                int i5 = 1202300170 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
                int i6 = g + 125;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            int i8 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int iMyUid = Process.myUid();
            int i9 = ~iMyUid;
            if (i8 != 751905958 + (((~(i9 | (-942334796))) | 940090123 | (~((-110102581) | iMyUid))) * 717) + (((~(iMyUid | (-942334796))) | (~(i9 | (-110102581))) | 940090123) * 717)) {
                int[] iArr2 = new int[53515162];
                iArr2[53515161] = 1;
                int i10 = 1202300170 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
                int i11 = g + 125;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        int i13 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i14 = (int) Runtime.getRuntime().totalMemory();
        int i15 = (-71032302) + ((i14 | 550491055) * (-859));
        int i16 = ~i14;
        if (i13 != i15 + (((~(i14 | (-550064558))) | (~(550491055 | i16))) * 859) + (((~((-2028564910) | i16)) | 1478500352) * 859)) {
            throw null;
        }
        super.onStart();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws IllegalAccessException {
        JpnSimulationActivity jpnSimulationActivity = (JpnSimulationActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i3 = ~iNextInt;
        if (i2 != 2102569620 + (((~((-582240011) | i3)) | 1412227553) * (-865)) + ((~(iNextInt | 582240010)) * 865) + (((~(1412227553 | i3)) | (~(i3 | 582240010))) * 865)) {
            int[] iArr = new int[1480565214];
            iArr[1480565213] = 1;
            int i4 = 1499290278 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i5 = asBinder + 39;
            g = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i8 = (-1113046346) + (((~((~startUptimeMillis) | (-1851733640))) | 1141190658) * (-245));
        int i9 = ~(startUptimeMillis | (-1851733640));
        if (i7 != i8 + (i9 * (-245)) + ((i9 | 727322325) * 245)) {
            int i10 = (-887500032) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i11 = g + 75;
        asBinder = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 23 / 0;
        }
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(JpnSimulationActivity jpnSimulationActivity, ActivityJpnSimulationBinding activityJpnSimulationBinding, int i, int i2, int i3) {
        int i4 = 2 % 2;
        jpnSimulationActivity.TuitionPaymentFragmentbindingInflater1.set(1, i);
        jpnSimulationActivity.TuitionPaymentFragmentbindingInflater1.set(2, i2);
        jpnSimulationActivity.TuitionPaymentFragmentbindingInflater1.set(5, i3);
        TextInputEditText textInputEditText = activityJpnSimulationBinding.edtBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(jpnSimulationActivity.TuitionPaymentFragmentbindingInflater1.getTime()));
        int i5 = asBinder + 91;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        final JpnSimulationActivity jpnSimulationActivity = (JpnSimulationActivity) objArr[0];
        final ActivityJpnSimulationBinding activityJpnSimulationBinding = (ActivityJpnSimulationBinding) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: areRequestsValid
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, activityJpnSimulationBinding, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    int iTuitionPaymentFragmentbindingInflater1 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    int iTuitionPaymentFragmentbindingInflater2 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
                    JpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1372321133, iTuitionPaymentFragmentbindingInflater1, -1372321131, Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), objArr2, iTuitionPaymentFragmentbindingInflater2);
                }
            }, jpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(1), jpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(2), jpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(5)).show();
            ViewPortBuilder.b();
            int i2 = asBinder + 119;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(JpnSimulationActivity jpnSimulationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 7;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            jpnSimulationActivity.MediaBrowserCompat();
            str = "loading_jpn_simulation_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = i3 + 51;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            jpnSimulationActivity.IconCompatParcelizer();
            abortCaptures.Companion companion = abortCaptures.INSTANCE;
            abortCaptures abortcapturesB = abortCaptures.Companion.b((JpSimulation) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            FragmentManager supportFragmentManager = jpnSimulationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(abortcapturesB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i6 = g + 89;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    abortcapturesB.show(supportFragmentManager, abortcapturesB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i7 = 90 / 0;
                } else {
                    abortcapturesB.show(supportFragmentManager, abortcapturesB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            str = "success_jpn_simulation_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            jpnSimulationActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            int i8 = g + 43;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            str = "failure_jpn_simulation_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_count_jpn_simulation_result", str));
        Intrinsics.checkNotNullParameter(jpnSimulationActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final JpnSimulationActivity jpnSimulationActivity, final ActivityJpnSimulationBinding activityJpnSimulationBinding, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: findSurface
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    JpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, activityJpnSimulationBinding, i2, i3, i4);
                }
            }, jpnSimulationActivity.TuitionPaymentFragmentbindingInflater1.get(1), jpnSimulationActivity.TuitionPaymentFragmentbindingInflater1.get(2), jpnSimulationActivity.TuitionPaymentFragmentbindingInflater1.get(5)).show();
            ViewPortBuilder.b();
            int i2 = asBinder + 23;
            g = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        JpnSimulationActivity jpnSimulationActivity = (JpnSimulationActivity) objArr[0];
        ActivityJpnSimulationBinding activityJpnSimulationBinding = (ActivityJpnSimulationBinding) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        jpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(1, iIntValue);
        jpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(2, iIntValue2);
        jpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(5, iIntValue3);
        TextInputEditText textInputEditText = activityJpnSimulationBinding.edtJpnStart;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        textInputEditText.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(jpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getTime()));
        int i2 = asBinder + 43;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0096  */
    /* JADX WARN: Code duplicated, block: B:12:0x009b  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:16:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:19:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:20:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(JpnSimulationActivity jpnSimulationActivity, ActivityJpnSimulationBinding activityJpnSimulationBinding, View view) {
        EditText editText;
        Editable text;
        EditText editText2;
        Editable text2;
        EditText editText3;
        Editable text3;
        int i = 2 % 2;
        int i2 = g + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            int i4 = 98 / 0;
            if (jpnSimulationActivity.RemoteActionCompatParcelizer()) {
                Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("Ïparams_count_jpn_simulation", "count_jpn_simulation"));
                Intrinsics.checkNotNullParameter(jpnSimulationActivity, "");
                Intrinsics.checkNotNullParameter("count_jpn_simulation", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("count_jpn_simulation", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("count_jpn_simulation", mapMutableMapOf);
                int i5 = Calendar.getInstance().get(5);
                int i6 = Calendar.getInstance().get(2);
                int i7 = Calendar.getInstance().get(1);
                StringBuilder sb = new StringBuilder();
                sb.append(i5);
                sb.append("-");
                sb.append(i6 + 1);
                sb.append("-");
                sb.append(i7);
                String string = sb.toString();
                final hasProfile hasprofile = (hasProfile) jpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                editText = activityJpnSimulationBinding.tilBirthDate.getEditText();
                if (editText != null) {
                    text = editText.getText();
                } else {
                    text = null;
                }
                String strValueOf = String.valueOf(text);
                editText2 = activityJpnSimulationBinding.tilAverageSalary.getEditText();
                if (editText2 != null) {
                    text2 = editText2.getText();
                } else {
                    text2 = null;
                }
                String string2 = StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), ".", "", false, 4, (Object) null)).toString();
                editText3 = activityJpnSimulationBinding.tilIncreaseSalaryperYear.getEditText();
                if (editText3 != null) {
                    int i8 = g + 37;
                    asBinder = i8 % 128;
                    int i9 = i8 % 2;
                    text3 = editText3.getText();
                } else {
                    text3 = null;
                }
                JpSimulationRequest jpSimulationRequest = new JpSimulationRequest(String.valueOf(text3), string, strValueOf, string2);
                Intrinsics.checkNotNullParameter(jpSimulationRequest, "");
                MutableLiveData<VirtualCameraAdapter1<JpSimulation>> mutableLiveData = hasprofile.TuitionPaymentFragmentbindingInflater1;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(hasprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(jpSimulationRequest)));
                final Function1 function1 = new Function1() { // from class: getAeMode
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hasProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault1(hasprofile, (JpSimulation) obj);
                    }
                };
                logToString logtostring = new logToString() { // from class: Camera2CameraCaptureFailure
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function1.invoke(obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: getCaptureFailure
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hasProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(hasprofile, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: Camera2CameraCaptureResult
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function2.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                hasprofile.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } else if (jpnSimulationActivity.RemoteActionCompatParcelizer()) {
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("Ïparams_count_jpn_simulation", "count_jpn_simulation"));
            Intrinsics.checkNotNullParameter(jpnSimulationActivity, "");
            Intrinsics.checkNotNullParameter("count_jpn_simulation", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("count_jpn_simulation", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("count_jpn_simulation", mapMutableMapOf2);
            int i10 = Calendar.getInstance().get(5);
            int i11 = Calendar.getInstance().get(2);
            int i12 = Calendar.getInstance().get(1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("-");
            sb2.append(i11 + 1);
            sb2.append("-");
            sb2.append(i12);
            String string3 = sb2.toString();
            final hasProfile hasprofile2 = (hasProfile) jpnSimulationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            editText = activityJpnSimulationBinding.tilBirthDate.getEditText();
            if (editText != null) {
                text = editText.getText();
            } else {
                text = null;
            }
            String strValueOf2 = String.valueOf(text);
            editText2 = activityJpnSimulationBinding.tilAverageSalary.getEditText();
            if (editText2 != null) {
                text2 = editText2.getText();
            } else {
                text2 = null;
            }
            String string4 = StringsKt.trim((CharSequence) StringsKt.replace$default(StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), ".", "", false, 4, (Object) null)).toString();
            editText3 = activityJpnSimulationBinding.tilIncreaseSalaryperYear.getEditText();
            if (editText3 != null) {
                int i13 = g + 37;
                asBinder = i13 % 128;
                int i14 = i13 % 2;
                text3 = editText3.getText();
            } else {
                text3 = null;
            }
            JpSimulationRequest jpSimulationRequest2 = new JpSimulationRequest(String.valueOf(text3), string3, strValueOf2, string4);
            Intrinsics.checkNotNullParameter(jpSimulationRequest2, "");
            MutableLiveData<VirtualCameraAdapter1<JpSimulation>> mutableLiveData2 = hasprofile2.TuitionPaymentFragmentbindingInflater1;
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(hasprofile2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(jpSimulationRequest2)));
            final Function1 function3 = new Function1() { // from class: getAeMode
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hasProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault1(hasprofile2, (JpSimulation) obj);
                }
            };
            logToString logtostring2 = new logToString() { // from class: Camera2CameraCaptureFailure
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function3.invoke(obj);
                }
            };
            final Function1 function4 = new Function1() { // from class: getCaptureFailure
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hasProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(hasprofile2, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: Camera2CameraCaptureResult
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function4.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
            hasprofile2.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(JpnSimulationActivity jpnSimulationActivity, ActivityJpnSimulationBinding activityJpnSimulationBinding, View view) {
        int iTuitionPaymentFragmentbindingInflater1 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(-313547004, iTuitionPaymentFragmentbindingInflater1, 313547004, Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater3, new Object[]{jpnSimulationActivity, activityJpnSimulationBinding, view}, iTuitionPaymentFragmentbindingInflater2);
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(JpnSimulationActivity jpnSimulationActivity, ActivityJpnSimulationBinding activityJpnSimulationBinding, int i, int i2, int i3) {
        Object[] objArr = {jpnSimulationActivity, activityJpnSimulationBinding, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iTuitionPaymentFragmentbindingInflater1 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(1372321133, iTuitionPaymentFragmentbindingInflater1, -1372321131, Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), objArr, iTuitionPaymentFragmentbindingInflater2);
    }

    static {
        cancelAll = 1;
        g();
        INSTANCE = new Companion(null);
        int i = asInterface + 125;
        cancelAll = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = (-1998557307) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        int iTuitionPaymentFragmentbindingInflater1 = zzu.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = zzu.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(1658510335, i, -1658510332, Providers.AnonymousClass1.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, new Object[]{this}, iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int length = (-169133526) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length();
        int iCodePointAt = 984169479 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(614904325, length, -614904324, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_expiration_message).substring(3, 4).codePointAt(0) - 21734554, zzu.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, bundle}, iCodePointAt);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
    }

    static void g() {
        f609a = 2230043605300150209L;
    }
}
