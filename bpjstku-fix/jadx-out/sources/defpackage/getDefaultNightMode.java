package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import androidx.core.view.PointerIconCompat;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.asik.model.request.OtpByEmailRequest;
import com.bpjstku.databinding.FragmentAsikActiveParticipantDataEmailBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantDataEmailFragment$bindingInflater$1;
import com.bpjstku.presentation.asik.active.model.AsikActiveParticipant;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity$special$$inlined$inject$default$2;
import com.bpjstku.util.enums.VerificationActionType;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.core.Constants;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.select;
import defpackage.setQuickZoomEnabled;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0014\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0017\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R.\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"LgetDefaultNightMode;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentAsikActiveParticipantDataEmailBinding;", "<init>", "()V", "", "g", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "Lselect;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "b", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/domain/user/model/User;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;", "", "asBinder", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getDefaultNightMode extends AutoValue_ImmutableImageInfo<FragmentAsikActiveParticipantDataEmailBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: lambdaasyncExecuteSyncRequestedAndStoredLocales0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
    });
    private AsikActiveParticipant TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_asik_active_participant_data_email;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    public getDefaultNightMode() {
        final getDefaultNightMode getdefaultnightmode = this;
        this.b = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantDataEmailFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, select] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ select invoke() {
                LifecycleOwner lifecycleOwner = getdefaultnightmode;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(select.class);
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
        final getDefaultNightMode getdefaultnightmode2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantDataEmailFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = getdefaultnightmode2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantDataEmailBinding> d() {
        return AsikActiveParticipantDataEmailFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentAsikActiveParticipantDataEmailBinding fragmentAsikActiveParticipantDataEmailBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentAsikActiveParticipantDataEmailBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: lambdasyncRequestedAndStoredLocales1
            private static final byte[] $$a = {46, 126, -84, 108};
            private static final int $$b = 167;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int asInterface = 0;
            private static int g = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -5140172825992238613L;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {57184, 60082, 57187, 60090, 60040, 60061, 60051, 57186, 60086, 60047, 60055, 60053, 60043, 60085, 57189, 60062, 60052, 60089, 60063, 60046, 60057, 60056, 57191, 60035, 60050, 60117, 60088, 60084, 57188, 60110, 60049, 60095, 60078, 60041, 60102, 60060, 60067, 60123, 60034, 60119, 60093, 60098, 60107, 60072, 60045, 60058, 60075, 60054, 60048};
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57190;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = asInterface + 65;
                g = i2 % 128;
                int i3 = i2 % 2;
                FragmentAsikActiveParticipantDataEmailBinding fragmentAsikActiveParticipantDataEmailBinding = fragmentAsikActiveParticipantDataEmailBindingINotificationSideChannelStub;
                if (i3 != 0) {
                    return getDefaultNightMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fragmentAsikActiveParticipantDataEmailBinding, this, (View) obj);
                }
                Unit unitTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getDefaultNightMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fragmentAsikActiveParticipantDataEmailBinding, this, (View) obj);
                int i4 = 25 / 0;
                return unitTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                while (abortcapture.b < cArrB.length) {
                    int i3 = $11 + 67;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i5 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64837 - Process.getGidForName("")), View.resolveSizeAndState(0, 0, 0) + 1356, 38 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 894276454, false, $$c(b, b2, (byte) (b2 & 9)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        try {
                            Object[] objArr3 = {abortcapture, abortcapture};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 47773), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 468, 13 - KeyEvent.normalizeMetaState(0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                            int i6 = $10 + 89;
                            $11 = i6 % 128;
                            if (i6 % 2 == 0) {
                                int i7 = 2 % 5;
                            }
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
                }
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            }

            /* JADX WARN: Code duplicated, block: B:38:0x0133  */
            /* JADX WARN: Code duplicated, block: B:39:0x0149  */
            /* JADX WARN: Code duplicated, block: B:42:0x0195 A[Catch: all -> 0x0340, TryCatch #0 {all -> 0x0340, blocks: (B:40:0x014b, B:42:0x0195, B:43:0x0207), top: B:72:0x014b }] */
            /* JADX WARN: Code duplicated, block: B:46:0x021a  */
            /* JADX WARN: Code duplicated, block: B:49:0x0261 A[Catch: all -> 0x035e, TryCatch #1 {all -> 0x035e, blocks: (B:11:0x002d, B:13:0x003b, B:14:0x006a, B:18:0x0081, B:21:0x0093, B:22:0x00c8, B:47:0x0226, B:49:0x0261, B:50:0x02c4), top: B:74:0x002d }] */
            /* JADX WARN: Code duplicated, block: B:52:0x02e5  */
            /* JADX WARN: Code duplicated, block: B:54:0x02ec  */
            /* JADX WARN: Code duplicated, block: B:55:0x031e  */
            private static void c(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int length;
                char[] cArr2;
                int i3 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
                long j = 0;
                Object obj2 = null;
                if (cArr3 != null) {
                    int i4 = $10 + 19;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        length = cArr3.length;
                        cArr2 = new char[length];
                    } else {
                        length = cArr3.length;
                        cArr2 = new char[length];
                    }
                    int i5 = 0;
                    while (i5 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[i5])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionGroup(j), 2267 - ExpandableListView.getPackedPositionGroup(j), 33 - Color.argb(0, 0, 0, 0), -1927765101, false, $$c(b2, b3, (byte) (b3 + 4)), new Class[]{Integer.TYPE});
                            }
                            cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                            i5++;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr2;
                }
                Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 2268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1927765101, false, $$c(b4, b5, (byte) (b5 + 4)), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    int i6 = $10 + 123;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    int i8 = $10 + 121;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i10 = $11 + 103;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                                obj = obj2;
                            } else {
                                try {
                                    objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        byte b6 = (byte) 0;
                                        byte b7 = (byte) (b6 - 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.getGidForName("") + 49268), 3260 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31, -127612708, false, $$c(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                        int i11 = $11 + 25;
                                        $10 = i11 % 128;
                                        int i12 = i11 % 2;
                                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            byte b8 = (byte) 0;
                                            byte b9 = (byte) (b8 - 1);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - View.resolveSizeAndState(0, 0, 0)), 594 - Color.red(0), 16 - MotionEvent.axisFromString(""), 1570859318, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj = null;
                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                        int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i13];
                                    } else {
                                        obj = null;
                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                            int i14 = $10 + 57;
                                            $11 = i14 % 128;
                                            int i15 = i14 % 2;
                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                            int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i16];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i17];
                                        } else {
                                            int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                            int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i18];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i19];
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
                        } else {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                                obj = obj2;
                            } else {
                                objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b10 = (byte) 0;
                                    byte b11 = (byte) (b10 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.getGidForName("") + 49268), 3260 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31, -127612708, false, $$c(b10, b11, (byte) (b11 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    int i110 = $11 + 25;
                                    $10 = i110 % 128;
                                    int i111 = i110 % 2;
                                    Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b12 = (byte) 0;
                                        byte b13 = (byte) (b12 - 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - View.resolveSizeAndState(0, 0, 0)), 594 - Color.red(0), 16 - MotionEvent.axisFromString(""), 1570859318, false, $$c(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                    int i112 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue2];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i112];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        int i113 = $10 + 57;
                                        $11 = i113 % 128;
                                        int i114 = i113 % 2;
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i115 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i116 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i115];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i116];
                                    } else {
                                        int i117 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i118 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i117];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i118];
                                    }
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                    }
                }
                for (int i20 = 0; i20 < i; i20++) {
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r19v4 */
            /* JADX WARN: Type inference failed for: r19v5 */
            /* JADX WARN: Type inference failed for: r19v6 */
            /* JADX WARN: Type inference failed for: r3v138, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1 */
            /* JADX WARN: Type inference failed for: r4v2, types: [int] */
            /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v51 */
            /* JADX WARN: Type inference failed for: r4v59, types: [int] */
            /* JADX WARN: Type inference failed for: r4v8 */
            /* JADX WARN: Type inference failed for: r4v93 */
            /* JADX WARN: Type inference failed for: r9v3 */
            public static Object[] b(Context context, int i, int i2) {
                int i3;
                int i4;
                int i5;
                Object obj;
                Class<?> cls;
                Class<?>[] clsArr;
                int i6;
                int i7;
                int i8;
                Object[] objArr;
                int gidForName;
                char[] cArr;
                int i9;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i10;
                Object objInvoke;
                Class<?> cls2;
                int jumpTapTimeout;
                char[] cArr2;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                char[] cArr3;
                int i19;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i20;
                int i21;
                String str = "";
                ?? NewInstance = 2;
                NewInstance = 2;
                int i22 = 2 % 2;
                if (context != null) {
                    int i23 = g;
                    int i24 = (i23 & 99) + (i23 | 99);
                    asInterface = i24 % 128;
                    try {
                        if (i24 % 2 != 0) {
                            int iMyTid = Process.myTid();
                            Object[] objArr2 = new Object[1];
                            a(new char[]{11866, 11801, 52450, 7151, 53025, 7368, 16470, 19120, 8192, 56647, 3795, 20996, 12891, 54131, 14413, 28155, 1187, 58025, 10796, 32660, 5798, 61680, 9272, 2438, 26928, 34327, 21891, 7028, 31499, 37955, 18321, 5420, 19723, 43598, 28986}, 1 / (((iMyTid | 51) << 1) - (iMyTid ^ 51)), objArr2);
                            obj = objArr2[0];
                        } else {
                            int iMyTid2 = Process.myTid() >> 22;
                            int i25 = (iMyTid2 & 1) + (iMyTid2 | 1);
                            Object[] objArr3 = new Object[1];
                            a(new char[]{11866, 11801, 52450, 7151, 53025, 7368, 16470, 19120, 8192, 56647, 3795, 20996, 12891, 54131, 14413, 28155, 1187, 58025, 10796, 32660, 5798, 61680, 9272, 2438, 26928, 34327, 21891, 7028, 31499, 37955, 18321, 5420, 19723, 43598, 28986}, i25, objArr3);
                            obj = objArr3[0];
                        }
                        try {
                            try {
                                int iMyTid3 = Process.myTid() >> 22;
                                int i26 = iMyTid3 * (-300);
                                int i27 = (i26 & 11476) + (i26 | 11476);
                                int i28 = iMyTid3 | 38;
                                int i29 = i27 + ((~((i28 & i) | (i28 ^ i))) * (-301));
                                int i30 = ~(((-39) ^ i) | ((-39) & i));
                                int i31 = ~i;
                                int i32 = ~(i31 | iMyTid3);
                                int i33 = ((i30 ^ i32) | (i30 & i32)) * (-301);
                                int i34 = (i29 & i33) + (i29 | i33);
                                int i35 = ~((~iMyTid3) | i);
                                int i36 = ((i35 & (-39)) | ((-39) ^ i35)) * 301;
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
                                Object[] objArr4 = new Object[1];
                                c(((i34 | i36) << 1) - (i36 ^ i34), new char[]{31, ',', '-', '.', 24, 26, 1, 18, 26, 14, 31, 26, '\n', '%', 24, '.', 16, '\f', 4, 27, 22, 30, 13804, 13804, 22, '\'', 28, '+', '+', '/', 31, 26, 7, 25, 26, '\n', 3, 17}, (byte) ((iIndexOf ^ 67) + ((iIndexOf & 67) << 1)), objArr4);
                                Object objNewInstance = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance((String) obj);
                                int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i37 = tapTimeout * (-523);
                                int i38 = (i37 ^ 8153) + ((i37 & 8153) << 1);
                                int i39 = g;
                                int i40 = (i39 & 97) + (i39 | 97);
                                asInterface = i40 % 128;
                                int i41 = i40 % 2;
                                int i42 = ~tapTimeout;
                                int i43 = ~((i42 & 31) | (i42 ^ 31));
                                int i44 = ~(((-32) ^ tapTimeout) | ((-32) & tapTimeout));
                                int i45 = 262 * ((~(((-32) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-32) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | (i43 ^ i44) | (i44 & i43));
                                int i46 = ((i38 | i45) << 1) - (i45 ^ i38);
                                int i47 = ~(((-32) & tapTimeout) | ((-32) ^ tapTimeout));
                                int i48 = -(-(i47 * (-786)));
                                int i49 = ((i46 | i48) << 1) - (i46 ^ i48);
                                int i50 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (-32));
                                int i51 = (i50 & i43) | (i50 ^ i43);
                                int i52 = (i49 - (~(((i51 & i47) | (i51 ^ i47)) * 262))) - 1;
                                int i53 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                Object[] objArr5 = new Object[1];
                                c(i52, new char[]{27, '!', 29, '.', ')', 25, 31, 6, 18, 25, 30, 19, 25, 17, '(', 25, 20, ')', 4, '\n', 19, ' ', 17, 23, 16, '\'', 29, 17, 14, 20, 13896}, (byte) ((i53 & 75) + (i53 | 75)), objArr5);
                                try {
                                    Object[] objArr6 = {(String) objArr5[0]};
                                    int i54 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    int i55 = (((i54 * 471) + 17427) - (~(((i54 ^ 37) | (i54 & 37)) * (-470)))) - 1;
                                    int i56 = ~i54;
                                    int i57 = g + 75;
                                    int i58 = i57 % 128;
                                    asInterface = i58;
                                    if (i57 % 2 == 0) {
                                        int i59 = (~((i56 & (-38)) | (i56 ^ (-38)))) | (~(((-38) ^ i) | ((-38) & i)));
                                        int i60 = ~i;
                                        int i61 = (i60 & i54) | (i60 ^ i54);
                                        int i62 = ~((i61 & 37) | (i61 ^ 37));
                                        int i63 = i55 + (((i59 & i62) | (i59 ^ i62)) * (-470));
                                        int i64 = ~(((-38) & i54) | ((-38) ^ i54) | i);
                                        int i65 = ~i;
                                        int i66 = ~((i54 & i65) | (i65 ^ i54) | 37);
                                        int i67 = ((i66 & i64) | (i64 ^ i66)) * 470;
                                        int i68 = (i63 & i67) + (i67 | i63);
                                        char[] cArr4 = {31, ',', '-', '.', 24, 26, 1, 18, 26, 14, 31, 26, '\n', '%', 24, '.', 16, '\f', 4, 27, 22, 30, 13804, 13804, 22, '\'', 28, '+', '+', '/', 31, 26, 7, 25, 26, '\n', 3, 17};
                                        int i69 = ((i58 | 35) << 1) - (i58 ^ 35);
                                        g = i69 % 128;
                                        if (i69 % 2 == 0) {
                                            Object[] objArr7 = new Object[1];
                                            c(i68, cArr4, (byte) (66 >>> Color.argb(0, 0, 1, 0)), objArr7);
                                            cls = Class.forName((String) objArr7[0]);
                                            clsArr = new Class[0];
                                        } else {
                                            Object[] objArr8 = new Object[1];
                                            c(i68, cArr4, (byte) (65 - (~Color.argb(0, 0, 0, 0))), objArr8);
                                            cls = Class.forName((String) objArr8[0]);
                                            clsArr = new Class[1];
                                        }
                                        clsArr[0] = String.class;
                                        NewInstance = cls.getDeclaredConstructor(clsArr).newInstance(objArr6);
                                        int i70 = asInterface;
                                        int i71 = (i70 ^ 35) + ((i70 & 35) << 1);
                                        g = i71 % 128;
                                        int i72 = i71 % 2;
                                        try {
                                            Object[] objArr9 = new Object[1];
                                            a(new char[]{683, 714, 45179, 54898, 45976, 53516, 4636, 6345, 3312, 41427, 50008, Typography.less, 7840, 45025, 62878, 16306, 10322, 40508, 59312, 11684, 14904, 35913, 59894, 23498, 17866, 64146, 38936}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr9);
                                            Class<?> cls3 = Class.forName((String) objArr9[0]);
                                            Object[] objArr10 = new Object[1];
                                            a(new char[]{60486, 60449, 12935, 36668, 12655, 34898, 18769, 17318, 57875, 8997, 39449, 23324, 61513, 11543, 44275, 25800, 50868, 7375, 48877, 30336, 54500}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr10);
                                            Object objInvoke2 = cls3.getMethod((String) objArr10[0], null).invoke(context, null);
                                            try {
                                                char[] cArr5 = {683, 714, 45179, 54898, 45976, 53516, 4636, 6345, 3312, 41427, 50008, Typography.less, 7840, 45025, 62878, 16306, 10322, 40508, 59312, 11684, 14904, 35913, 59894, 23498, 17866, 64146, 38936};
                                                int i73 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                int i74 = (i73 & 1) + (i73 | 1);
                                                Object[] objArr11 = new Object[1];
                                                a(cArr5, i74, objArr11);
                                                Class<?> cls4 = Class.forName((String) objArr11[0]);
                                                char[] cArr6 = {2406, 2305, 28401, 9512, 27929, 8774, 53572, 56243, 1843, 32595, 12301, 49929, 5481, 29025, 1764, 64733, 9111, 16573};
                                                int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                int i75 = windowTouchSlop * (-1965);
                                                int i76 = (((i75 | 984) << 1) - (i75 ^ 984)) + (((windowTouchSlop ^ (-2)) | (windowTouchSlop & (-2))) * 983);
                                                int i77 = ~windowTouchSlop;
                                                int i78 = (~(((-2) ^ i65) | ((-2) & i65))) | i77;
                                                int i79 = g;
                                                int i80 = ((i79 | 41) << 1) - (i79 ^ 41);
                                                asInterface = i80 % 128;
                                                try {
                                                    if (i80 % 2 != 0) {
                                                        i7 = i76 / (((i78 | (-983)) << 1) - (i78 ^ (-983)));
                                                        i8 = ~((i77 ^ i65) | (i77 & i65));
                                                        i6 = 1;
                                                    } else {
                                                        int i81 = -(-(i78 * (-983)));
                                                        i6 = 1;
                                                        i7 = (i76 ^ i81) + ((i81 & i76) << 1);
                                                        int i82 = ~windowTouchSlop;
                                                        i8 = ~((i82 & i65) | (i82 ^ i65));
                                                    }
                                                    int i83 = ~windowTouchSlop;
                                                    int i84 = ~((i83 & i6) | (i83 ^ 1));
                                                    int i85 = 983 * ((i8 & i84) | (i8 ^ i84));
                                                    int i86 = (i7 & i85) + (i85 | i7);
                                                    Object[] objArr12 = new Object[i6];
                                                    a(cArr6, i86, objArr12);
                                                    String str2 = (String) objArr12[0];
                                                    int i87 = asInterface + 63;
                                                    g = i87 % 128;
                                                    int i88 = i87 % 2;
                                                    Object objInvoke3 = cls4.getMethod(str2, null).invoke(context, null);
                                                    int i89 = g;
                                                    int i90 = ((i89 | 63) << 1) - (i89 ^ 63);
                                                    asInterface = i90 % 128;
                                                    try {
                                                        if (i90 % 2 != 0) {
                                                            objArr = new Object[]{objInvoke3, 64};
                                                            gidForName = Process.getGidForName("") + 49;
                                                            cArr = new char[]{'.', '\n', 19, ' ', 17, 23, 25, ' ', 23, 14, '\f', '\n', 18, '\b', 11, 23, 19, 5, ' ', 4, '*', 24, '*', '.', Typography.dollar, 14, '\n', '+', '\n', '.', Typography.dollar, 14, 13862};
                                                            i9 = -TextUtils.indexOf("", "", 1);
                                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                            i10 = 102;
                                                        } else {
                                                            objArr = new Object[]{objInvoke3, 64};
                                                            gidForName = 33 - (~(-(-Process.getGidForName(""))));
                                                            cArr = new char[]{'.', '\n', 19, ' ', 17, 23, 25, ' ', 23, 14, '\f', '\n', 18, '\b', 11, 23, 19, 5, ' ', 4, '*', 24, '*', '.', Typography.dollar, 14, '\n', '+', '\n', '.', Typography.dollar, 14, 13862};
                                                            i9 = -TextUtils.indexOf("", "", 0);
                                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                            i10 = 62;
                                                        }
                                                        int i91 = i9 * (-721);
                                                        int i92 = -(-(i10 * (-721)));
                                                        int i93 = ((i91 | i92) << 1) - (i91 ^ i92);
                                                        int i94 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                        int i95 = ~i9;
                                                        ?? r19 = NewInstance;
                                                        int i96 = ~i10;
                                                        int i97 = ~((i95 ^ i96) | (i95 & i96));
                                                        int i98 = (i94 ^ i97) | (i94 & i97);
                                                        int i99 = ~(i9 | i10);
                                                        int i100 = ((i98 ^ i99) | (i98 & i99)) * 1444;
                                                        int i101 = (i93 & i100) + (i100 | i93);
                                                        int i102 = ~((i9 ^ i10) | (i9 & i10));
                                                        int i103 = ~(i9 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                                        int i104 = (i102 ^ i103) | (i102 & i103);
                                                        int i105 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & i10) | (i10 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                                        int i106 = i101 + (((i105 & i104) | (i104 ^ i105)) * (-1444));
                                                        int i107 = ~i9;
                                                        int i108 = ~((i107 & i10) | (i107 ^ i10));
                                                        int i109 = ~((i96 & i9) | (i96 ^ i9));
                                                        byte b = (byte) ((i106 - (~(-(-(((i109 & i108) | (i108 ^ i109)) * 722))))) - 1);
                                                        Object[] objArr13 = new Object[1];
                                                        c(gidForName, cArr, b, objArr13);
                                                        Class<?> cls5 = Class.forName((String) objArr13[0]);
                                                        Object[] objArr14 = new Object[1];
                                                        a(new char[]{52734, 52633, 52149, 9254, 51293, 9032, 61905, 64294, 50091, 55831, 12547, 58268, 53745, 54309, 2029, 56391, 59140, 58867}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr14);
                                                        String str3 = (String) objArr14[0];
                                                        Class<?>[] clsArr2 = new Class[2];
                                                        clsArr2[0] = String.class;
                                                        int i110 = asInterface;
                                                        int i111 = ((i110 | 97) << 1) - (i110 ^ 97);
                                                        g = i111 % 128;
                                                        try {
                                                            if (i111 % 2 == 0) {
                                                                clsArr2[1] = Integer.TYPE;
                                                                objInvoke = cls5.getMethod(str3, clsArr2).invoke(objInvoke2, objArr);
                                                                CdmaCellLocation.convertQuartSecToDecDegrees(0);
                                                                Object[] objArr15 = new Object[1];
                                                                a(new char[]{16882, 16787, 45278, 52851, 45885, 51469, 20314, 17807, 20393, 41334, 56153, 23930, 24057, 44868, 60831, 25332, 27403, 40601, 65457, 28898, 31058, 36078, 61879, 1704, 1687, 64044, 32774, 5189, 5293, 59518, 37480, 6718, 8952, 54856}, 0, objArr15);
                                                                cls2 = Class.forName((String) objArr15[0]);
                                                                int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout();
                                                                jumpTapTimeout = ((jumpTapTimeout2 & (-60)) + (jumpTapTimeout2 | (-60))) * 14;
                                                                cArr2 = new char[]{3, 25, '\'', 7, ',', '\n', 26, '(', 18, 1};
                                                                i11 = 2;
                                                            } else {
                                                                clsArr2[1] = Integer.TYPE;
                                                                objInvoke = cls5.getMethod(str3, clsArr2).invoke(objInvoke2, objArr);
                                                                Object[] objArr16 = new Object[1];
                                                                a(new char[]{16882, 16787, 45278, 52851, 45885, 51469, 20314, 17807, 20393, 41334, 56153, 23930, 24057, 44868, 60831, 25332, 27403, 40601, 65457, 28898, 31058, 36078, 61879, 1704, 1687, 64044, 32774, 5189, 5293, 59518, 37480, 6718, 8952, 54856}, 0 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))), objArr16);
                                                                cls2 = Class.forName((String) objArr16[0]);
                                                                jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                                                                cArr2 = new char[]{3, 25, '\'', 7, ',', '\n', 26, '(', 18, 1};
                                                                i11 = 68;
                                                            }
                                                            int iIndexOf2 = TextUtils.indexOf("", "", 0);
                                                            int i112 = ((iIndexOf2 * 483) - (~(i11 * 242))) - 1;
                                                            int i113 = ~iIndexOf2;
                                                            int i114 = ~((~i11) | i113);
                                                            int i115 = ~iIndexOf2;
                                                            int i116 = ~((i115 ^ i31) | (i115 & i31));
                                                            int i117 = i112 + (((i114 ^ i116) | (i114 & i116)) * (-241)) + (((iIndexOf2 ^ i11) | (iIndexOf2 & i11)) * (-482));
                                                            int i118 = ~i11;
                                                            int i119 = ~((iIndexOf2 & i118) | (i118 ^ iIndexOf2));
                                                            int i120 = (i113 & i31) | (i113 ^ i31);
                                                            int i121 = ~((i11 & i120) | (i120 ^ i11));
                                                            int i122 = ((i121 & i119) | (i119 ^ i121)) * 241;
                                                            Object[] objArr17 = new Object[1];
                                                            c(jumpTapTimeout, cArr2, (byte) ((i117 & i122) + (i122 | i117)), objArr17);
                                                            Object[] objArr18 = (Object[]) cls2.getField((String) objArr17[0]).get(objInvoke);
                                                            NewInstance = objArr18.length;
                                                            int i123 = 0;
                                                            while (true) {
                                                                if (i123 < NewInstance) {
                                                                    Object obj2 = objArr18[i123];
                                                                    int i124 = -View.resolveSize(0, 0);
                                                                    int i125 = (i124 & 5) + (i124 | 5);
                                                                    char[] cArr7 = {'\'', 22, 28, '+', 13821};
                                                                    int i126 = -KeyEvent.keyCodeFromString(str);
                                                                    int i127 = i126 * 495;
                                                                    int i128 = asInterface;
                                                                    int i129 = (i128 & 19) + (i128 | 19);
                                                                    int i130 = i129 % 128;
                                                                    g = i130;
                                                                    if (i129 % 2 == 0) {
                                                                        int i131 = -((i126 ^ (-91)) | (i126 & (-91)));
                                                                        i12 = (((-201326592) * i126) - (~((i131 ^ (-988)) + ((i131 & (-988)) << 1)))) - 1;
                                                                    } else {
                                                                        int i132 = i127 - 44370;
                                                                        int i133 = ((i126 ^ (-91)) | (i126 & (-91))) * (-988);
                                                                        i12 = (i132 & i133) + (i133 | i132);
                                                                    }
                                                                    int i134 = (~i126) | 90;
                                                                    int i135 = (i12 - (~(-(-(494 * ((i134 & i31) | (i134 ^ i31))))))) - 1;
                                                                    int i136 = (i130 & 109) + (i130 | 109);
                                                                    asInterface = i136 % 128;
                                                                    int i137 = i136 % 2;
                                                                    int i138 = (~((~i126) | (-91))) | (~((i65 ^ 90) | (i65 & 90)));
                                                                    int i139 = ~((i126 & 90) | (i126 ^ 90));
                                                                    byte b2 = (byte) ((i135 - (~(-(-(((i138 & i139) | (i138 ^ i139)) * 494))))) - 1);
                                                                    Object[] objArr19 = new Object[1];
                                                                    c(i125, cArr7, b2, objArr19);
                                                                    try {
                                                                        Object[] objArr20 = {(String) objArr19[0]};
                                                                        int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                                        Object[] objArr21 = new Object[1];
                                                                        c((fadingEdgeLength ^ 37) + ((fadingEdgeLength & 37) << 1), new char[]{31, ',', '-', '.', ' ', 11, 14, 22, 26, '(', 23, '\n', '\'', 24, 22, 14, 30, '\f', 26, 27, 19, 29, '\n', 23, 3, 26, 24, '*', '\b', 16, Typography.amp, '/', 23, 7, 19, 30, 13825}, (byte) (29 - Process.getGidForName(str)), objArr21);
                                                                        Class<?> cls6 = Class.forName((String) objArr21[0]);
                                                                        int i140 = -ImageFormat.getBitsPerPixel(0);
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        int i141 = ~i140;
                                                                        int i142 = ~((i141 & (-11)) | (i141 ^ (-11)));
                                                                        int i143 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | i140 | 10);
                                                                        int i144 = (i140 * 829) + 8290 + (((i142 ^ i143) | (i142 & i143)) * (-828));
                                                                        int i145 = ((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i140 ^ 10) | (i140 & 10)) * (-828);
                                                                        int i146 = (((i144 | i145) << 1) - (i145 ^ i144)) + ((~(i140 | 10)) * 828);
                                                                        char[] cArr8 = {Typography.dollar, 14, '\b', 2, 18, 11, '\n', ',', 7, 25, 13856};
                                                                        int iGreen = Color.green(0);
                                                                        byte b3 = (byte) ((iGreen ^ 33) + ((iGreen & 33) << 1));
                                                                        Object[] objArr22 = new Object[1];
                                                                        c(i146, cArr8, b3, objArr22);
                                                                        Object objInvoke4 = cls6.getMethod((String) objArr22[0], String.class).invoke(null, objArr20);
                                                                        try {
                                                                            int i147 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                            int i148 = ((i147 | 28) << 1) - (i147 ^ 28);
                                                                            char[] cArr9 = {'.', '\n', 19, ' ', 17, 23, 25, ' ', 23, 14, '\f', '\n', 18, '\b', 11, 23, 19, 5, 22, '.', 21, Typography.amp, '\n', '.', '\f', 16, 29, 19};
                                                                            int i149 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                            int i150 = asInterface;
                                                                            int i151 = ((i150 | 97) << 1) - (i150 ^ 97);
                                                                            g = i151 % 128;
                                                                            if (i151 % 2 == 0) {
                                                                                i13 = 85 % i149;
                                                                                i14 = ~i149;
                                                                                i15 = ~(i14 | (-13));
                                                                                i16 = i31;
                                                                            } else {
                                                                                i13 = (i149 * 85) + PointerIconCompat.TYPE_GRAB;
                                                                                i14 = ~i149;
                                                                                i15 = ~((i14 ^ (-13)) | (i14 & (-13)));
                                                                                i16 = i65;
                                                                            }
                                                                            int i152 = ~(i14 | i16);
                                                                            int i153 = (i15 ^ i152) | (i15 & i152);
                                                                            int i154 = ~(((-13) ^ i65) | ((-13) & i65));
                                                                            int i155 = (i153 ^ i154) | (i153 & i154);
                                                                            int i156 = (i149 ^ 12) | (i149 & 12);
                                                                            String str4 = str;
                                                                            int i157 = -(-((-84) * (i155 | (~((i156 ^ i) | (i156 & i))))));
                                                                            int i158 = (i13 & i157) + (i157 | i13);
                                                                            int i159 = ~(((-13) & i) | ((-13) ^ i));
                                                                            int i160 = (i159 & i149) | (i149 ^ i159);
                                                                            int i161 = ~((i31 ^ 12) | (i31 & 12));
                                                                            int i162 = ((i160 & i161) | (i160 ^ i161)) * (-84);
                                                                            int i163 = ((i158 | i162) << 1) - (i162 ^ i158);
                                                                            int i164 = ~((i65 ^ 12) | (i65 & 12));
                                                                            int i165 = ~i156;
                                                                            int i166 = ((i164 & i165) | (i164 ^ i165)) * 84;
                                                                            byte b4 = (byte) ((i163 & i166) + (i166 | i163));
                                                                            Object[] objArr23 = new Object[1];
                                                                            c(i148, cArr9, b4, objArr23);
                                                                            Class<?> cls7 = Class.forName((String) objArr23[0]);
                                                                            int i167 = 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                            char[] cArr10 = {16, 23, 24, '-', '\b', 16, 5, 31, 31, '/', 13823};
                                                                            int i168 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                            int i169 = g;
                                                                            int i170 = (i169 ^ 71) + ((i169 & 71) << 1);
                                                                            asInterface = i170 % 128;
                                                                            if (i170 % 2 != 0) {
                                                                                i17 = ((-115) << i168) << (-144);
                                                                                i18 = i65 | i168;
                                                                            } else {
                                                                                int i171 = i168 * (-115);
                                                                                i17 = ((i171 | (-3335)) << 1) - (i171 ^ (-3335));
                                                                                i18 = (i65 ^ i168) | (i65 & i168);
                                                                            }
                                                                            int i172 = (-116) * (~((i18 & 29) | (i18 ^ 29)));
                                                                            int i173 = (i17 & i172) + (i17 | i172);
                                                                            int i174 = (i168 | i) * 116;
                                                                            int i175 = (i173 & i174) + (i174 | i173);
                                                                            int i176 = ~i168;
                                                                            int i177 = -(-(((~((i176 & (-30)) | (i176 ^ (-30)))) | (~((-30) | i))) * 116));
                                                                            Object[] objArr24 = new Object[1];
                                                                            c(i167, cArr10, (byte) ((i175 ^ i177) + ((i177 & i175) << 1)), objArr24);
                                                                            try {
                                                                                Object[] objArr25 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr24[0], null).invoke(obj2, null))};
                                                                                int i178 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                int i179 = i178 * 881;
                                                                                int i180 = (i179 ^ 32597) + ((i179 & 32597) << 1);
                                                                                int i181 = asInterface + 123;
                                                                                g = i181 % 128;
                                                                                try {
                                                                                    if (i181 % 2 == 0) {
                                                                                        throw null;
                                                                                    }
                                                                                    int i182 = ~i178;
                                                                                    int i183 = ~((i182 & (-38)) | (i182 ^ (-38)));
                                                                                    int i184 = ~i178;
                                                                                    int i185 = ~((i184 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i184 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                                                    int i186 = (i183 & i185) | (i183 ^ i185);
                                                                                    int i187 = ~(((-38) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-38) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                                                    int i188 = (i180 - (~(((i186 & i187) | (i186 ^ i187)) * (-880)))) - 1;
                                                                                    int i189 = ~i178;
                                                                                    int i190 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                                                    int i191 = ~((i189 & i190) | (i189 ^ i190));
                                                                                    int i192 = (i191 & 37) | (i191 ^ 37);
                                                                                    int i193 = ~(i178 | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                                                                                    int i194 = i188 + (((i192 & i193) | (i192 ^ i193)) * (-880));
                                                                                    int i195 = (~((i178 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i178 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * 880;
                                                                                    Object[] objArr26 = new Object[1];
                                                                                    c((i194 ^ i195) + ((i195 & i194) << 1), new char[]{31, ',', '-', '.', ' ', 11, 14, 22, 26, '(', 23, '\n', '\'', 24, 22, 14, 30, '\f', 26, 27, 19, 29, '\n', 23, 3, 26, 24, '*', '\b', 16, Typography.amp, '/', 23, 7, 19, 30, 13825}, (byte) (29 - (~(-(-KeyEvent.normalizeMetaState(0))))), objArr26);
                                                                                    Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                                                    Object[] objArr27 = new Object[1];
                                                                                    a(new char[]{45279, 45240, 16545, 64665, 17225, 64493, 4764, 6238, 48793, 20737, 59811, 224, 44276, 24369, 57193, 16165, 39466, 28398, 52550, 11646, 34926, 31880, 49942}, 0 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), objArr27);
                                                                                    Method method = cls8.getMethod((String) objArr27[0], InputStream.class);
                                                                                    int i196 = g + 17;
                                                                                    asInterface = i196 % 128;
                                                                                    if (i196 % 2 != 0) {
                                                                                        method.invoke(objInvoke4, objArr25);
                                                                                        throw null;
                                                                                    }
                                                                                    Object objInvoke5 = method.invoke(objInvoke4, objArr25);
                                                                                    int i197 = g + 107;
                                                                                    int i198 = i197 % 128;
                                                                                    asInterface = i198;
                                                                                    int i199 = i197 % 2;
                                                                                    int i200 = i198 + 71;
                                                                                    g = i200 % 128;
                                                                                    if (i200 % 2 == 0) {
                                                                                        try {
                                                                                            cArr3 = new char[]{62537, 62499, 816, 285, 220, 1649, 63707, 61981, 64083, 4738, 5174, 60069, 59476, 7351, 8950, 54630, 57004, 11575, 12488, 51003, 52459, 16153, 16089, 45362, 45944, 18833, 20282, 41973, 41236, 23431, 23867, 44459, 38723, 26016, 27640, 40047, 34205, 30328};
                                                                                            i19 = -(ViewConfiguration.getMaximumDrawingCacheSize() * 9);
                                                                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                            i20 = (-559) / i19;
                                                                                        } catch (Throwable th) {
                                                                                            Throwable cause = th.getCause();
                                                                                            if (cause != null) {
                                                                                                throw cause;
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } else {
                                                                                        cArr3 = new char[]{62537, 62499, 816, 285, 220, 1649, 63707, 61981, 64083, 4738, 5174, 60069, 59476, 7351, 8950, 54630, 57004, 11575, 12488, 51003, 52459, 16153, 16089, 45362, 45944, 18833, 20282, 41973, 41236, 23431, 23867, 44459, 38723, 26016, 27640, 40047, 34205, 30328};
                                                                                        i19 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                        i20 = i19 * (-559);
                                                                                    }
                                                                                    int i201 = ((i20 | 561) << 1) - (i20 ^ 561);
                                                                                    int i202 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                                                    int i203 = (~((i202 & i19) | (i202 ^ i19))) * (-560);
                                                                                    int i204 = (i201 & i203) + (i203 | i201);
                                                                                    int i205 = asInterface;
                                                                                    int i206 = (i205 ^ 113) + ((i205 & 113) << 1);
                                                                                    g = i206 % 128;
                                                                                    int i207 = i206 % 2;
                                                                                    int i208 = ((-2) & i19) | ((-2) ^ i19);
                                                                                    int i209 = -(-((-560) * (~((i208 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i208 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2)))));
                                                                                    int i210 = ~i19;
                                                                                    int i211 = ~((i210 & 1) | (i210 ^ 1));
                                                                                    int i212 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                                                    int i213 = (i204 & i209) + (i209 | i204) + ((i211 | (~((i212 & 1) | (i212 ^ 1)))) * 560);
                                                                                    Object[] objArr28 = new Object[1];
                                                                                    a(cArr3, i213, objArr28);
                                                                                    Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                                                    char[] cArr11 = {46314, 46221, 26880, 39318, 27368, 40696, 57688, 60332, 47787, 30883, 36018, 62226, 43233, 30337, 47692, 52374, 40518, 18201, 43120, 56989, 35923, 21811, 42527, 43186, 62366, 9200, 55268};
                                                                                    int i214 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                    int i215 = i214 * 673;
                                                                                    int i216 = ((i215 | (-1343)) << 1) - (i215 ^ (-1343));
                                                                                    int i217 = ~(i214 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                                                                    int i218 = i216 + (((i217 & 1) | (i217 ^ 1)) * 672);
                                                                                    int i219 = ~i214;
                                                                                    int i220 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                                    int i221 = ~((i219 & i220) | (i219 ^ i220));
                                                                                    int i222 = asInterface + 83;
                                                                                    g = i222 % 128;
                                                                                    if (i222 % 2 == 0) {
                                                                                        int i223 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault6 | 1);
                                                                                        int i224 = -(-((i223 & i221) | (i221 ^ i223)));
                                                                                        i21 = i218 * (((i224 | (-672)) << 1) - (i224 ^ (-672)));
                                                                                    } else {
                                                                                        int i225 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 1) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ 1));
                                                                                        int i226 = -(-(((i225 & i221) | (i221 ^ i225)) * (-672)));
                                                                                        i21 = (i218 & i226) + (i226 | i218);
                                                                                    }
                                                                                    int i227 = ~(((-2) ^ i220) | ((-2) & i220));
                                                                                    int i228 = ~(i214 | (-2));
                                                                                    int i229 = i21 + (672 * ((i228 & i227) | (i227 ^ i228)));
                                                                                    Object[] objArr29 = new Object[1];
                                                                                    a(cArr11, i229, objArr29);
                                                                                    if (!objNewInstance.equals(cls9.getMethod((String) objArr29[0], null).invoke(objInvoke5, null))) {
                                                                                        int i230 = asInterface;
                                                                                        int i231 = (i230 & 83) + (i230 | 83);
                                                                                        g = i231 % 128;
                                                                                        int i232 = i231 % 2;
                                                                                        int i233 = ((i230 | 113) << 1) - (i230 ^ 113);
                                                                                        g = i233 % 128;
                                                                                        int i234 = i233 % 2;
                                                                                        try {
                                                                                            int i235 = -View.MeasureSpec.getSize(0);
                                                                                            int i236 = (i235 & 1) + (i235 | 1);
                                                                                            Object[] objArr30 = new Object[1];
                                                                                            a(new char[]{62537, 62499, 816, 285, 220, 1649, 63707, 61981, 64083, 4738, 5174, 60069, 59476, 7351, 8950, 54630, 57004, 11575, 12488, 51003, 52459, 16153, 16089, 45362, 45944, 18833, 20282, 41973, 41236, 23431, 23867, 44459, 38723, 26016, 27640, 40047, 34205, 30328}, i236, objArr30);
                                                                                            Class<?> cls10 = Class.forName((String) objArr30[0]);
                                                                                            Object[] objArr31 = new Object[1];
                                                                                            a(new char[]{46314, 46221, 26880, 39318, 27368, 40696, 57688, 60332, 47787, 30883, 36018, 62226, 43233, 30337, 47692, 52374, 40518, 18201, 43120, 56989, 35923, 21811, 42527, 43186, 62366, 9200, 55268}, 1 - (Process.myPid() >> 22), objArr31);
                                                                                            Object objInvoke6 = cls10.getMethod((String) objArr31[0], null).invoke(objInvoke5, null);
                                                                                            ?? r3 = r19;
                                                                                            if (!r3.equals(objInvoke6)) {
                                                                                                i123++;
                                                                                                int i237 = g + 125;
                                                                                                asInterface = i237 % 128;
                                                                                                int i238 = i237 % 2;
                                                                                                r19 = r3;
                                                                                                objArr18 = objArr18;
                                                                                                str = str4;
                                                                                            }
                                                                                        } catch (Throwable th2) {
                                                                                            Throwable cause2 = th2.getCause();
                                                                                            if (cause2 != null) {
                                                                                                throw cause2;
                                                                                            }
                                                                                            throw th2;
                                                                                        }
                                                                                    }
                                                                                    int[] iArr = new int[1];
                                                                                    Object[] objArr32 = {new int[]{i}, iArr, new int[]{(i & (-2)) | (i65 & 1)}, null};
                                                                                    int i239 = 1945315922 + (((~(823737364 | i65)) | (~((-1649685) | i))) * (-831)) + ((~(865697277 | i)) * (-1662)) + (((~((-864047594) | i65)) | (~(864047593 | i)) | (~((-823737365) | i))) * 831);
                                                                                    int i240 = -(-(i239 * (-463)));
                                                                                    int i241 = ((7440 | i240) << 1) - (i240 ^ 7440);
                                                                                    int i242 = ~i239;
                                                                                    int i243 = ~((i242 & i31) | (i242 ^ i31));
                                                                                    int i244 = ~i239;
                                                                                    int i245 = ~((i244 ^ 16) | (i244 & 16));
                                                                                    int i246 = (i243 & i245) | (i243 ^ i245);
                                                                                    int i247 = ~(i65 | 16);
                                                                                    int i248 = (i241 - (~(((i246 & i247) | (i246 ^ i247)) * 464))) - 1;
                                                                                    int i249 = (i ^ (-17)) | (i & (-17));
                                                                                    int i250 = (i248 - (~(((i249 & i244) | (i249 ^ i244)) * (-464)))) - 1;
                                                                                    int i251 = ~((i244 ^ 16) | (i244 & 16));
                                                                                    int i252 = ~((i ^ 16) | (i & 16));
                                                                                    int i253 = i250 + (((i251 & i252) | (i251 ^ i252)) * 464);
                                                                                    int i254 = (i253 * (-519)) + (i2 * 521);
                                                                                    int i255 = ~i253;
                                                                                    int i256 = ~i2;
                                                                                    int i257 = (i255 ^ i256) | (i255 & i256);
                                                                                    int i258 = ~((i257 & i31) | (i257 ^ i31));
                                                                                    int i259 = ~((i2 ^ i) | (i2 & i));
                                                                                    int i260 = -(-(((i258 & i259) | (i258 ^ i259)) * 520));
                                                                                    int i261 = (i254 & i260) + (i254 | i260);
                                                                                    int i262 = ~((i256 ^ i65) | (i256 & i65));
                                                                                    int i263 = ~((i253 ^ i) | (i253 & i));
                                                                                    int i264 = (i262 | i263) * (-1040);
                                                                                    int i265 = (i261 & i264) + (i264 | i261);
                                                                                    int i266 = ~((i255 ^ i65) | (i255 & i65));
                                                                                    int i267 = ~i2;
                                                                                    int i268 = ~((i267 & i253) | (i267 ^ i253));
                                                                                    int i269 = (i266 & i268) | (i266 ^ i268);
                                                                                    int i270 = ((i269 & i263) | (i269 ^ i263)) * 520;
                                                                                    int i271 = (i265 ^ i270) + ((i270 & i265) << 1);
                                                                                    int i272 = (i271 << 13) ^ i271;
                                                                                    int i273 = i272 ^ (i272 >>> 17);
                                                                                    iArr[0] = i273 ^ (i273 << 5);
                                                                                    return objArr32;
                                                                                } catch (Throwable th3) {
                                                                                    th = th3;
                                                                                }
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                            }
                                                                            Throwable cause3 = th.getCause();
                                                                            if (cause3 != null) {
                                                                                throw cause3;
                                                                            }
                                                                            throw th;
                                                                        } catch (Throwable th5) {
                                                                            Throwable cause4 = th5.getCause();
                                                                            if (cause4 != null) {
                                                                                throw cause4;
                                                                            }
                                                                            throw th5;
                                                                        }
                                                                    } catch (Throwable th6) {
                                                                        Throwable cause5 = th6.getCause();
                                                                        if (cause5 != null) {
                                                                            throw cause5;
                                                                        }
                                                                        throw th6;
                                                                    }
                                                                }
                                                                NewInstance = i2;
                                                            }
                                                        } catch (Throwable unused) {
                                                        }
                                                    } catch (Throwable th7) {
                                                        Throwable cause6 = th7.getCause();
                                                        if (cause6 != null) {
                                                            throw cause6;
                                                        }
                                                        throw th7;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    Throwable cause7 = th.getCause();
                                                    if (cause7 != null) {
                                                        throw cause7;
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                            }
                                        } catch (Throwable th10) {
                                            Throwable cause8 = th10.getCause();
                                            if (cause8 != null) {
                                                throw cause8;
                                            }
                                            throw th10;
                                        }
                                    } else {
                                        try {
                                            throw null;
                                        } catch (Throwable th11) {
                                            th = th11;
                                        }
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                }
                                Throwable cause9 = th.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th;
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable th13) {
                            Throwable cause10 = th13.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th13;
                        }
                    } catch (Throwable unused3) {
                        NewInstance = i2;
                    }
                } else {
                    NewInstance = i2;
                }
                int[] iArr2 = new int[1];
                Object[] objArr33 = {new int[]{i}, iArr2, new int[]{i}, null};
                int i274 = ~i;
                int i275 = 1719670276 + (((~((-652205601) | i274)) | 541512224) * 184) + (((-803209206) | i) * (-184)) + ((~(i274 | (-692515830))) * 184);
                int i276 = g;
                int i277 = i276 + 43;
                asInterface = i277 % 128;
                if (i277 % 2 != 0) {
                    i3 = (-751) >> ((-751) >>> i275);
                    int i278 = ~i275;
                    i5 = ~(i278 | ((-1) ^ i278));
                    i4 = ~(((-1) ^ i) | i);
                } else {
                    int i279 = -(-(i275 * (-751)));
                    i3 = (i279 << 1) - i279;
                    i4 = ~(((-1) ^ i) | i);
                    i5 = 0;
                }
                int i280 = 1504 * ((i5 & i4) | (i5 ^ i4));
                int i281 = ((i3 | i280) << 1) - (i3 ^ i280);
                int i282 = ((-1) ^ i275) | i275;
                int i283 = -(-((~((i282 & i) | (i282 ^ i))) * (-1504)));
                int i284 = ((i281 | i283) << 1) - (i283 ^ i281);
                int i285 = (~(~i275)) * 752;
                int i286 = (i284 ^ i285) + ((i285 & i284) << 1);
                int i287 = i286 * 284;
                int i288 = NewInstance * (-282);
                int i289 = (i287 ^ i288) + ((i287 & i288) << 1);
                int i290 = ~i286;
                int i291 = ~((i290 ^ NewInstance) | ((i290 & NewInstance) == true ? 1 : 0));
                int i292 = ~((i290 ^ i) | (i290 & i));
                int i293 = -(-(((i291 & i292) | (i291 ^ i292)) * (-283)));
                int i294 = (i289 ^ i293) + ((i293 & i289) << 1);
                int i295 = ~NewInstance;
                int i296 = (~(i286 | i295)) * 283;
                int i297 = ((i294 | i296) << 1) - (i296 ^ i294);
                int i298 = ((i276 | 17) << 1) - (i276 ^ 17);
                int i299 = i298 % 128;
                asInterface = i299;
                int i300 = i298 % 2;
                int i301 = i297 + (283 * (~(i | (i290 & i295) | (i290 ^ i295))));
                int i302 = i301 << 13;
                int i303 = (i302 & (~i301)) | ((~i302) & i301);
                int i304 = i303 >>> 17;
                int i305 = (i303 | i304) & (~(i303 & i304));
                iArr2[0] = i305 ^ (i305 << 5);
                int i306 = i299 + 23;
                g = i306 % 128;
                if (i306 % 2 != 0) {
                    return objArr33;
                }
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(short r6, short r7, int r8) {
                /*
                    byte[] r0 = defpackage.lambdasyncRequestedAndStoredLocales1.$$a
                    int r6 = r6 * 3
                    int r6 = 1 - r6
                    int r8 = 116 - r8
                    int r7 = r7 + 4
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r3 = r8
                    r5 = r2
                    r8 = r6
                    goto L25
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r6) goto L21
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L21:
                    int r7 = r7 + 1
                    r3 = r0[r7]
                L25:
                    int r8 = r8 + r3
                    r3 = r5
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdasyncRequestedAndStoredLocales1.$$c(short, short, int):java.lang.String");
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = arguments != null ? (AsikActiveParticipant) arguments.getParcelable("asik_active_participant") : null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilContactEmail;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        User user = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        retrieveConcurrentCameraIds.b(textInputLayout, String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null));
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilContactEmail;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^.{1,}$", string);
        String string2 = getString(R.string.error_email_invalid);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new accessconfigureInstanceInternal[]{accessconfigureinstanceinternal, new accessconfigureInstanceInternal(Constants.EMAIL_PATTERN, string2)})));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(FragmentAsikActiveParticipantDataEmailBinding fragmentAsikActiveParticipantDataEmailBinding, getDefaultNightMode getdefaultnightmode, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        TextInputLayout textInputLayout = fragmentAsikActiveParticipantDataEmailBinding.tilContactEmail;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(textInputLayout, getdefaultnightmode.requireContext());
        select selectVar = (select) getdefaultnightmode.b.getValue();
        EditText editText = fragmentAsikActiveParticipantDataEmailBinding.tilContactEmail.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        Context contextRequireContext = getdefaultnightmode.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string, "");
        selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new OtpByEmailRequest(strValueOf, string));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultNightMode getdefaultnightmode, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getdefaultnightmode.IconCompatParcelizer();
        } else {
            AsikActiveParticipant asikActiveParticipantB = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                getdefaultnightmode.write();
                AsikActiveParticipant asikActiveParticipant = getdefaultnightmode.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (asikActiveParticipant != null) {
                    EditText editText = getdefaultnightmode.INotificationSideChannelStub().tilContactEmail.getEditText();
                    asikActiveParticipantB = AsikActiveParticipant.b(asikActiveParticipant, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(editText != null ? editText.getText() : null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, 31);
                }
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol = new lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl(asikActiveParticipantB, VerificationActionType.EMAIL_VERIFICATION);
                Intrinsics.checkNotNullParameter(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol, "");
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol);
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                getdefaultnightmode.write();
                getDefaultNightMode getdefaultnightmode2 = getdefaultnightmode;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(getdefaultnightmode2, "");
                Intrinsics.checkNotNullParameter(strValueOf, "");
                BaseActivity baseActivity = (BaseActivity) getdefaultnightmode2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                }
            } else {
                getdefaultnightmode.write();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((select) this.b.getValue()).getInterfaceDescriptor.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: getStoredAppLocales
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getDefaultNightMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
    }
}
