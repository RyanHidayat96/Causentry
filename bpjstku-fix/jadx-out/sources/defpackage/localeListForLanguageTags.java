package defpackage;

import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.asik.model.request.AsikFirstStepRequest;
import com.bpjstku.data.asik.model.request.AsikListKpjMobileRequest;
import com.bpjstku.data.asik.model.request.AsikListKpjRequest;
import com.bpjstku.data.asik.model.request.EmployeeKpjRequest;
import com.bpjstku.data.config.model.AntreanMenuConfig;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.databinding.FragmentAsikActiveParticipantMembershipDataBinding;
import com.bpjstku.databinding.ItemAsikAddKpjBinding;
import com.bpjstku.domain.asik.model.AsikListKpj;
import com.bpjstku.domain.asik.model.AsikListKpjMobile;
import com.bpjstku.domain.asik.model.EmployeeKpj;
import com.bpjstku.domain.asik.model.SubmissionCheckItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantMembershipDataFragment$bindingInflater$1;
import com.bpjstku.presentation.asik.active.model.AsikActiveParticipant;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.CoordinateTransform;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.ZoomGestureDetectorZoomEvent;
import defpackage.getEventTime;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.select;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0015\u0010\u0007\u001a\u00020%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u0015\u0010\"\u001a\u00020'8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0016\u0010\u0006\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010(R\u0017\u0010\t\u001a\u0004\u0018\u00010)8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010&R\u0017\u0010\n\u001a\u0004\u0018\u00010*8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010\u0015\u001a\u00020\u001f8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\u000b\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010-R\u0015\u0010\f\u001a\u00020.8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010&R\u0015\u0010\u0017\u001a\u00020/8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010&R.\u0010\r\u001a\u001c\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0002008UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u00104R\u0014\u0010+\u001a\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u00105"}, d2 = {"LlocaleListForLanguageTags;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentAsikActiveParticipantMembershipDataBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "INotificationSideChannelDefault", "", "Lcom/bpjstku/domain/asik/model/EmployeeKpj;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetStringOrNull;", "LgetStringOrNull;", "INotificationSideChannelStub", "TuitionPaymentFragmentbindingInflater1", "RemoteActionCompatParcelizer", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "b", "asInterface", "Lcom/bpjstku/domain/asik/model/AsikListKpj;", "asBinder", "Ljava/util/List;", "", "I", "a", "notify", "", "", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "LgetStreamUseCaseSupportedCombinationList;", "Ljava/lang/String;", "Lcom/bpjstku/domain/asik/model/SubmissionCheckItem;", "Lcom/bpjstku/domain/user/model/User;", "read", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "LstartAsSupportActionMode;", "Lselect;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class localeListForLanguageTags extends AutoValue_ImmutableImageInfo<FragmentAsikActiveParticipantMembershipDataBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private getStringOrNull TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Calendar INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int a;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy getInterfaceDescriptor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private getStringOrNull b;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy notify;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private List<AsikListKpj> d = new ArrayList();

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private List<AsikListKpj> asBinder = new ArrayList();

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final List<String> asInterface = new ArrayList();

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private List<String> g = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String cancelAll = "";

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final Lazy cancel = LazyKt.lazy(new Function0() { // from class: localeManagerGetApplicationLocales
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((select) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.RemoteActionCompatParcelizer.getValue()).d.TuitionPaymentFragmentbindingInflater1();
        }
    });

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Lazy INotificationSideChannel = LazyKt.lazy(new Function0() { // from class: AppCompatDelegateApi33Impl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
    });

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final int INotificationSideChannelStub = 1;

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getCancel() {
        return R.layout.fragment_asik_active_participant_membership_data;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    /* JADX INFO: renamed from: localeListForLanguageTags$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LlocaleListForLanguageTags$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "LlocaleListForLanguageTags;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LlocaleListForLanguageTags;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static localeListForLanguageTags TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return new localeListForLanguageTags();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public localeListForLanguageTags() {
        final localeListForLanguageTags localelistforlanguagetags = this;
        this.onTransact = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantMembershipDataFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = localelistforlanguagetags;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.notify = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantMembershipDataFragment$special$$inlined$inject$default$2
            private static final byte[] $$a = {89, 92, -72, 43};
            private static final int $$b = 237;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int $asInterface = 0;
            private static int $g = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = -4189435692089900538L;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47408, 47410, 47395, 47367, 47414, 47412, 47404, 47370, 47401, 47397, 47369, 47402, 47411, 47400, 47406, 47337, 47399, 47423, 47330, 47335, 47390, 47405, 47393, 47396, 47394, 47454, 47380, 47409};
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719639;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            private static boolean b = true;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [getStreamUseCaseSupportedCombinationList, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getStreamUseCaseSupportedCombinationList invoke() {
                ZoomGestureDetectorZoomEvent koin;
                int i = 2 % 2;
                int i2 = $asInterface;
                int i3 = i2 + 79;
                $g = i3 % 128;
                if (i3 % 2 == 0) {
                    boolean z = localelistforlanguagetags instanceof getEventTime;
                    throw null;
                }
                ComponentCallbacks componentCallbacks = localelistforlanguagetags;
                mapPoint mappoint = this.$qualifier;
                Function0<CoordinateTransform> function0 = this.$parameters;
                if (componentCallbacks instanceof getEventTime) {
                    int i4 = i2 + 21;
                    $g = i4 % 128;
                    if (i4 % 2 == 0) {
                        koin = ((getEventTime) componentCallbacks).getKoin();
                        int i5 = 79 / 0;
                    } else {
                        koin = ((getEventTime) componentCallbacks).getKoin();
                    }
                } else {
                    koin = ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
                }
                return koin.b.b(Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class), mappoint, function0);
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i3 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 19472), 2624 - (KeyEvent.getMaxKeyCode() >> 16), 14 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 39422), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 481, 37 - TextUtils.getCapsMode("", 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                int i4 = $10 + 117;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                while (getrealtimecapturelatency.b < cArr.length) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    try {
                        Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 39422), TextUtils.lastIndexOf("", '0', 0, 0) + 482, 37 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr2);
                int i6 = $11 + 11;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            }

            private static void c(int i, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                char c = '0';
                long j = 0;
                int i3 = 0;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i4 = 0;
                    while (i4 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i3] = Integer.valueOf(cArr2[i4]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", c, i3) + 31340);
                                int i5 = (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 2993;
                                int packedPositionGroup = 17 - ExpandableListView.getPackedPositionGroup(j);
                                byte b2 = (byte) i3;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i5, packedPositionGroup, 1182129903, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i4++;
                            int i6 = $10 + 85;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            c = '0';
                            j = 0;
                            i3 = 0;
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
                try {
                    Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - ExpandableListView.getPackedPositionGroup(0L)), 253 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getTouchSlop() >> 8) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    int i8 = 1687675375;
                    if (b) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                        char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            int i9 = $11 + 29;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                            Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cLastIndexOf2 = (char) (33601 - TextUtils.lastIndexOf("", '0'));
                                int deadChar = 3085 - KeyEvent.getDeadChar(0, 0);
                                int fadingEdgeLength = 26 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                byte b4 = (byte) ($$b & 3);
                                byte b5 = (byte) (b4 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf2, deadChar, fadingEdgeLength, -2146875848, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            int i11 = $11 + 5;
                            $10 = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i12 = 5 % 5;
                            }
                        }
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                        char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        int i13 = $10 + 109;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                        }
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cLastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0') + 33603);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 3085;
                            int packedPositionType = 26 - ExpandableListView.getPackedPositionType(0L);
                            byte b6 = (byte) ($$b & 3);
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf3, maxKeyCode, packedPositionType, -2146875848, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        i8 = 1687675375;
                    }
                    objArr[0] = new String(cArr6);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v117 */
            /* JADX WARN: Type inference failed for: r6v118 */
            /* JADX WARN: Type inference failed for: r6v119 */
            /* JADX WARN: Type inference failed for: r6v120 */
            /* JADX WARN: Type inference failed for: r6v121 */
            /* JADX WARN: Type inference failed for: r6v122 */
            /* JADX WARN: Type inference failed for: r6v123 */
            /* JADX WARN: Type inference failed for: r6v124 */
            /* JADX WARN: Type inference failed for: r6v125 */
            /* JADX WARN: Type inference failed for: r6v126 */
            /* JADX WARN: Type inference failed for: r6v3 */
            /* JADX WARN: Type inference failed for: r6v32 */
            /* JADX WARN: Type inference failed for: r6v38 */
            /* JADX WARN: Type inference failed for: r6v39, types: [java.io.ByteArrayInputStream, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v4 */
            /* JADX WARN: Type inference failed for: r6v42 */
            /* JADX WARN: Type inference failed for: r6v5, types: [int] */
            /* JADX WARN: Type inference failed for: r6v6 */
            /* JADX WARN: Type inference failed for: r6v61, types: [java.lang.Class] */
            /* JADX WARN: Type inference failed for: r6v62 */
            /* JADX WARN: Type inference failed for: r6v66 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] b(android.content.Context r26, int r27, int r28) {
                /*
                    Method dump skipped, instruction units count: 3281
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.AsikActiveParticipantMembershipDataFragment$special$$inlined$inject$default$2.b(android.content.Context, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(byte r6, int r7, short r8) {
                /*
                    int r6 = 68 - r6
                    int r8 = r8 * 4
                    int r0 = 1 - r8
                    int r7 = r7 * 3
                    int r7 = 3 - r7
                    byte[] r1 = com.bpjstku.presentation.asik.active.AsikActiveParticipantMembershipDataFragment$special$$inlined$inject$default$2.$$a
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r1 != 0) goto L17
                    r6 = r7
                    r4 = r8
                    r3 = r2
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    int r7 = r7 + 1
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r8) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L25:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L2c:
                    int r4 = -r4
                    int r7 = r7 + r4
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.AsikActiveParticipantMembershipDataFragment$special$$inlined$inject$default$2.$$c(byte, int, short):java.lang.String");
            }
        });
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.INotificationSideChannelStubProxy = calendar;
        this.getInterfaceDescriptor = LazyKt.lazy(new Function0() { // from class: AppCompatDelegateNightMode
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return localeListForLanguageTags.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        this.RemoteActionCompatParcelizer = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantMembershipDataFragment$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, select] */
            @Override // kotlin.jvm.functions.Function0
            public final select invoke() {
                ComponentCallbacks componentCallbacks = localelistforlanguagetags;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(select.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantMembershipDataBinding> d() {
        return AsikActiveParticipantMembershipDataFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        FragmentAsikActiveParticipantMembershipDataBinding fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilFullName.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText2 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
        if (editText2 != null) {
            User user = (User) this.INotificationSideChannel.getValue();
            editText2.setText(String.valueOf(user != null ? user.b : null));
        }
        EditText editText3 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilFullName.getEditText();
        if (editText3 != null) {
            User user2 = (User) this.INotificationSideChannel.getValue();
            editText3.setText(String.valueOf(user2 != null ? user2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null));
        }
        EditText editText4 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilBirthPlace.getEditText();
        if (editText4 != null) {
            User user3 = (User) this.INotificationSideChannel.getValue();
            editText4.setText(String.valueOf(user3 != null ? user3.cancelAll : null));
        }
        EditText editText5 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText5 != null) {
            User user4 = (User) this.INotificationSideChannel.getValue();
            editText5.setText(String.valueOf(user4 != null ? user4.asInterface : null));
        }
        RecyclerView recyclerView = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.rvMultipleKpj;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((startAsSupportActionMode) this.getInterfaceDescriptor.getValue());
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            getStringOrNull getstringornull = localeListForLanguageTags.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (getstringornull != null) {
                getstringornull.dismiss();
            }
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        MaterialButton materialButton = INotificationSideChannelStub().btnYes;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AppCompatDelegateSerialExecutor
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return localeListForLanguageTags.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        MaterialButton materialButton2 = INotificationSideChannelStub().btnNo;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AppCompatDelegateSerialExecutorExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return localeListForLanguageTags.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        EditText editText = INotificationSideChannelStub().tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: scheduleNext
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    localeListForLanguageTags.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
        }
    }

    public static final class b implements getStringOrNull.b {
        b() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_step_first", "asik_step_first_membership_data_confirm_no"));
            Intrinsics.checkNotNullParameter("asik_step_first_membership_data_confirm_no", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_step_first_membership_data_confirm_no", mapMutableMapOf);
            MainActivity.Companion companion = MainActivity.INSTANCE;
            Context contextRequireContext = localeListForLanguageTags.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext, null, null, 6);
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        MaterialButton materialButton = INotificationSideChannelStub().btnYes;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        MaterialButton materialButton = INotificationSideChannelStub().btnYes;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        FragmentAsikActiveParticipantMembershipDataBinding fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16)})));
        TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout3 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout4 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilBirthPlace;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
    }

    private final List<EmployeeKpj> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        ArrayList arrayList = new ArrayList();
        LinearLayout linearLayout = INotificationSideChannelStub().kpjContainer;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        LinearLayout linearLayout2 = linearLayout;
        int childCount = linearLayout2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            linearLayout2.getChildAt(i);
            TextInputLayout textInputLayout = (TextInputLayout) INotificationSideChannelStub().kpjContainer.getChildAt(i).findViewById(R.id.tilKpj);
            String str = this.asBinder.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (textInputLayout != null) {
                EditText editText = textInputLayout.getEditText();
                if (!Intrinsics.areEqual(StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), "")) {
                    EditText editText2 = textInputLayout.getEditText();
                    arrayList.add(new EmployeeKpj(StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString(), "", "", String.valueOf(str)));
                }
            }
        }
        return arrayList;
    }

    private final List<EmployeeKpj> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (!this.asBinder.isEmpty()) {
            if (Intrinsics.areEqual(((AsikListKpj) CollectionsKt.first((List) this.asBinder)).TuitionPaymentFragmentspecialinlinedviewModeldefault1, Boolean.TRUE)) {
                LinearLayout linearLayout = INotificationSideChannelStub().kpjContainer;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                LinearLayout linearLayout2 = linearLayout;
                int childCount = linearLayout2.getChildCount();
                while (i < childCount) {
                    linearLayout2.getChildAt(i);
                    if (i != 0) {
                        TextInputLayout textInputLayout = (TextInputLayout) INotificationSideChannelStub().kpjContainer.getChildAt(i).findViewById(R.id.tilKpj);
                        String str = this.asBinder.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (textInputLayout != null) {
                            EditText editText = textInputLayout.getEditText();
                            arrayList.add(new EmployeeKpj(StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), "", "", String.valueOf(str)));
                        }
                    }
                    i++;
                }
            } else {
                LinearLayout linearLayout3 = INotificationSideChannelStub().kpjContainer;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                LinearLayout linearLayout4 = linearLayout3;
                int childCount2 = linearLayout4.getChildCount();
                while (i < childCount2) {
                    linearLayout4.getChildAt(i);
                    TextInputLayout textInputLayout2 = (TextInputLayout) INotificationSideChannelStub().kpjContainer.getChildAt(i).findViewById(R.id.tilKpj);
                    String str2 = this.asBinder.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (textInputLayout2 != null) {
                        EditText editText2 = textInputLayout2.getEditText();
                        arrayList.add(new EmployeeKpj(StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString(), "", "", String.valueOf(str2)));
                    }
                    i++;
                }
            }
        } else {
            LinearLayout linearLayout5 = INotificationSideChannelStub().kpjContainer;
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
            LinearLayout linearLayout6 = linearLayout5;
            int childCount3 = linearLayout6.getChildCount();
            while (i < childCount3) {
                linearLayout6.getChildAt(i);
                TextInputLayout textInputLayout3 = (TextInputLayout) INotificationSideChannelStub().kpjContainer.getChildAt(i).findViewById(R.id.tilKpj);
                String str3 = this.asBinder.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (textInputLayout3 != null) {
                    EditText editText3 = textInputLayout3.getEditText();
                    arrayList.add(new EmployeeKpj(StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString(), "", "", String.valueOf(str3)));
                }
                i++;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ Unit b(AsikListKpj asikListKpj) {
        Intrinsics.checkNotNullParameter(asikListKpj, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(localeListForLanguageTags localelistforlanguagetags, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_step_first", "asik_step_first_membership_data_confirm_yes"));
        Intrinsics.checkNotNullParameter("asik_step_first_membership_data_confirm_yes", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("asik_step_first_membership_data_confirm_yes", mapMutableMapOf);
        ArrayList<EmployeeKpj> arrayList = new ArrayList();
        if (localelistforlanguagetags.asBinder.isEmpty()) {
            LinearLayout linearLayout = localelistforlanguagetags.INotificationSideChannelStub().kpjContainer;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            LinearLayout linearLayout2 = linearLayout;
            int childCount = linearLayout2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                linearLayout2.getChildAt(i);
                TextInputLayout textInputLayout = (TextInputLayout) localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getChildAt(i).findViewById(R.id.tilKpj);
                String str = localelistforlanguagetags.asBinder.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (textInputLayout != null) {
                    EditText editText = textInputLayout.getEditText();
                    if (Intrinsics.areEqual(StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), "")) {
                        arrayList.add(new EmployeeKpj(String.valueOf(localelistforlanguagetags.asBinder.get(i).b), "", "", String.valueOf(localelistforlanguagetags.asBinder.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2)));
                    } else {
                        EditText editText2 = textInputLayout.getEditText();
                        arrayList.add(new EmployeeKpj(StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString(), "", "", String.valueOf(str)));
                    }
                }
            }
        } else if (Intrinsics.areEqual(((AsikListKpj) CollectionsKt.first((List) localelistforlanguagetags.asBinder)).TuitionPaymentFragmentspecialinlinedviewModeldefault1, Boolean.FALSE) || Intrinsics.areEqual(((AsikListKpj) CollectionsKt.first((List) localelistforlanguagetags.asBinder)).TuitionPaymentFragmentspecialinlinedviewModeldefault2, "BPU")) {
            LinearLayout linearLayout3 = localelistforlanguagetags.INotificationSideChannelStub().kpjContainer;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            LinearLayout linearLayout4 = linearLayout3;
            int childCount2 = linearLayout4.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                linearLayout4.getChildAt(i2);
                TextInputLayout textInputLayout2 = (TextInputLayout) localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getChildAt(i2).findViewById(R.id.tilKpj);
                String str2 = localelistforlanguagetags.asBinder.get(i2).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (textInputLayout2 != null) {
                    EditText editText3 = textInputLayout2.getEditText();
                    if (!Intrinsics.areEqual(StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString(), "")) {
                        EditText editText4 = textInputLayout2.getEditText();
                        arrayList.add(new EmployeeKpj(StringsKt.trim((CharSequence) String.valueOf(editText4 != null ? editText4.getText() : null)).toString(), "", "", String.valueOf(str2)));
                    } else if (Intrinsics.areEqual(localelistforlanguagetags.asBinder.get(i2).TuitionPaymentFragmentspecialinlinedviewModeldefault2, "BPU") && i2 == 0) {
                        arrayList.add(new EmployeeKpj(String.valueOf(localelistforlanguagetags.asBinder.get(i2).b), "", "", String.valueOf(localelistforlanguagetags.asBinder.get(i2).TuitionPaymentFragmentspecialinlinedviewModeldefault2)));
                    }
                }
            }
        } else {
            LinearLayout linearLayout5 = localelistforlanguagetags.INotificationSideChannelStub().kpjContainer;
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
            LinearLayout linearLayout6 = linearLayout5;
            int childCount3 = linearLayout6.getChildCount();
            for (int i3 = 0; i3 < childCount3; i3++) {
                linearLayout6.getChildAt(i3);
                TextInputLayout textInputLayout3 = (TextInputLayout) localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getChildAt(i3).findViewById(R.id.tilKpj);
                String str3 = localelistforlanguagetags.asBinder.get(i3).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (textInputLayout3 != null) {
                    EditText editText5 = textInputLayout3.getEditText();
                    if (Intrinsics.areEqual(StringsKt.trim((CharSequence) String.valueOf(editText5 != null ? editText5.getText() : null)).toString(), "")) {
                        arrayList.add(new EmployeeKpj(String.valueOf(localelistforlanguagetags.asBinder.get(i3).b), "", "", String.valueOf(localelistforlanguagetags.asBinder.get(i3).TuitionPaymentFragmentspecialinlinedviewModeldefault2)));
                    } else {
                        EditText editText6 = textInputLayout3.getEditText();
                        arrayList.add(new EmployeeKpj(StringsKt.trim((CharSequence) String.valueOf(editText6 != null ? editText6.getText() : null)).toString(), "", "", String.valueOf(str3)));
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (EmployeeKpj employeeKpj : arrayList) {
            arrayList2.add(new EmployeeKpjRequest(employeeKpj.b, employeeKpj.TuitionPaymentFragmentspecialinlinedviewModeldefault1, employeeKpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3, employeeKpj.TuitionPaymentFragmentbindingInflater1));
        }
        FragmentAsikActiveParticipantMembershipDataBinding fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub = localelistforlanguagetags.INotificationSideChannelStub();
        EditText editText7 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
        String string = StringsKt.trim((CharSequence) String.valueOf(editText7 != null ? editText7.getText() : null)).toString();
        EditText editText8 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilFullName.getEditText();
        String string2 = StringsKt.trim((CharSequence) String.valueOf(editText8 != null ? editText8.getText() : null)).toString();
        EditText editText9 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        String string3 = StringsKt.trim((CharSequence) String.valueOf(editText9 != null ? editText9.getText() : null)).toString();
        EditText editText10 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilBirthPlace.getEditText();
        String string4 = StringsKt.trim((CharSequence) String.valueOf(editText10 != null ? editText10.getText() : null)).toString();
        SubmissionCheckItem submissionCheckItem = (SubmissionCheckItem) localelistforlanguagetags.cancel.getValue();
        AsikFirstStepRequest asikFirstStepRequest = new AsikFirstStepRequest(string, string2, string3, string4, submissionCheckItem != null ? submissionCheckItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null, arrayList2);
        List<EmployeeKpj> listTuitionPaymentFragmentspecialinlinedviewModeldefault2 = localelistforlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (listTuitionPaymentFragmentspecialinlinedviewModeldefault2.size() != CollectionsKt.distinct(listTuitionPaymentFragmentspecialinlinedviewModeldefault2).size()) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "kpj yang diinput tidak boleh sama dengan inputan sebelumnya", 0).show();
        } else {
            final select selectVar = (select) localelistforlanguagetags.RemoteActionCompatParcelizer.getValue();
            Intrinsics.checkNotNullParameter(asikFirstStepRequest, "");
            MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = selectVar.g;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVar.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asikFirstStepRequest)));
            final Function1 function1 = new Function1() { // from class: onClick
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return select.TuitionPaymentFragmentbindingInflater1(selectVar, (BaseItem) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: resolvePanel
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: shouldCenterSingleButton
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return select.onTransact(selectVar, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setMessage
                public static int TuitionPaymentFragmentbindingInflater1 = 1987650629;

                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            selectVar.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(localeListForLanguageTags localelistforlanguagetags, Ref.ObjectRef objectRef) {
        WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
        Context contextRequireContext = localelistforlanguagetags.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (String) objectRef.element, "Appointment Online", 0, null, false, 56);
        BaseActivity baseActivity = localelistforlanguagetags.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(localeListForLanguageTags localelistforlanguagetags, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_list_kpj_mobile_result", "loading_asik_list_kpj_mobile_result"));
            Intrinsics.checkNotNullParameter("loading_asik_list_kpj_mobile_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_asik_list_kpj_mobile_result", mapMutableMapOf);
            localelistforlanguagetags.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_asik_list_kpj_mobile_result", "success_asik_list_kpj_mobile_result"));
            Intrinsics.checkNotNullParameter("success_asik_list_kpj_mobile_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_asik_list_kpj_mobile_result", mapMutableMapOf2);
            localelistforlanguagetags.write();
            List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            list.size();
            if (!list.isEmpty()) {
                if (Intrinsics.areEqual(((AsikListKpjMobile) CollectionsKt.first(list)).TuitionPaymentFragmentspecialinlinedviewModeldefault1, Boolean.TRUE) || Intrinsics.areEqual(((AsikListKpjMobile) CollectionsKt.first(list)).TuitionPaymentFragmentspecialinlinedviewModeldefault2, "BPU")) {
                    int i = 0;
                    for (Object obj : list) {
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        AsikListKpjMobile asikListKpjMobile = (AsikListKpjMobile) obj;
                        View childAt = localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getChildAt(i);
                        if ((childAt instanceof TextInputLayout) && i == 0) {
                            retrieveConcurrentCameraIds.b((TextInputLayout) childAt, asikListKpjMobile.b);
                            localelistforlanguagetags.cancelAll = String.valueOf(asikListKpjMobile.b);
                            Intrinsics.checkNotNullParameter(childAt, "");
                            childAt.setEnabled(false);
                        }
                        i++;
                    }
                } else {
                    int i2 = 0;
                    for (Object obj2 : list) {
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        AsikListKpjMobile asikListKpjMobile2 = (AsikListKpjMobile) obj2;
                        if ((localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getChildAt(i2) instanceof TextInputLayout) && i2 == 0) {
                            localelistforlanguagetags.INotificationSideChannelStub().cvInformationKpj2.setVisibility(0);
                            String strAsInterface = Camera2CameraControlExternalSyntheticLambda5.asInterface(String.valueOf(asikListKpjMobile2.b));
                            StringBuilder sb = new StringBuilder("Ketik ulang Nomor Kartu <b>(");
                            sb.append(strAsInterface);
                            sb.append(")</b> dengan benar dan sesuai tanpa sensor.");
                            localelistforlanguagetags.INotificationSideChannelStub().tvTitleInformationKpj7.setText(Html.fromHtml(sb.toString()));
                            String strValueOf = String.valueOf(asikListKpjMobile2.b);
                            localelistforlanguagetags.cancelAll = strValueOf;
                            localelistforlanguagetags.asInterface.add(strValueOf);
                        }
                        i2++;
                    }
                }
            } else {
                int i3 = 0;
                for (Object obj3 : list) {
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    AsikListKpjMobile asikListKpjMobile3 = (AsikListKpjMobile) obj3;
                    if ((localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getChildAt(i3) instanceof TextInputLayout) && i3 == 0) {
                        localelistforlanguagetags.INotificationSideChannelStub().cvInformationKpj2.setVisibility(0);
                        String strAsInterface2 = Camera2CameraControlExternalSyntheticLambda5.asInterface(String.valueOf(asikListKpjMobile3.b));
                        StringBuilder sb2 = new StringBuilder("Ketik ulang Nomor Kartu <b>(");
                        sb2.append(strAsInterface2);
                        sb2.append(")</b> dengan benar dan sesuai tanpa sensor.");
                        localelistforlanguagetags.INotificationSideChannelStub().tvTitleInformationKpj7.setText(Html.fromHtml(sb2.toString()));
                        String strValueOf2 = String.valueOf(asikListKpjMobile3.b);
                        localelistforlanguagetags.cancelAll = strValueOf2;
                        localelistforlanguagetags.asInterface.add(strValueOf2);
                    }
                    i3++;
                }
            }
            User user = (User) localelistforlanguagetags.INotificationSideChannel.getValue();
            String str = user != null ? user.b : null;
            User user2 = (User) localelistforlanguagetags.INotificationSideChannel.getValue();
            String str2 = user2 != null ? user2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
            User user3 = (User) localelistforlanguagetags.INotificationSideChannel.getValue();
            AsikListKpjRequest asikListKpjRequest = new AsikListKpjRequest(str, str2, user3 != null ? user3.asInterface : null);
            final select selectVar = (select) localelistforlanguagetags.RemoteActionCompatParcelizer.getValue();
            Intrinsics.checkNotNullParameter(asikListKpjRequest, "");
            MutableLiveData<VirtualCameraAdapter1<List<AsikListKpj>>> mutableLiveData = selectVar.TuitionPaymentFragmentbindingInflater1;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVar.d.TuitionPaymentFragmentbindingInflater1(asikListKpjRequest)));
            final Function1 function1 = new Function1() { // from class: getToolbarNavigationClickListener
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return select.b(selectVar, (List) obj4);
                }
            };
            logToString logtostring = new logToString() { // from class: onDrawerOpened
                @Override // defpackage.logToString
                public final void accept(Object obj4) {
                    function1.invoke(obj4);
                }
            };
            final Function1 function2 = new Function1() { // from class: isDrawerSlideAnimationEnabled
                private static final byte[] $$c = {117, -15, -81, 1};
                private static final int $$f = 10;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {8, -36, 87, -65, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
                private static final int $$e = 113;
                private static final byte[] $$a = {90, 46, 113, 8, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 56, 5, 16, 5, -67, 45, -32, -2, 12, 13, 37, 16, 5, -8, 0, 6, -3, 1, 22, -12, 1, 18, -44, 54, -1, -12, 12, 8, -7, 9, 2, -21, 14, 14, 12, -13};
                private static final int $$b = 219;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                private static int asBinder = 1;
                private static long TuitionPaymentFragmentbindingInflater1 = 8252167502075056825L;
                private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {18355, 45558, 9555, 39094, 4087, 58122, 22159, 52732, 41271, 5248, 35756, 32532, 53895, 18880, 15663, 60656, 30805, 50608, 21233, 48652, 2953, 37114, 64561, 18822, 54954, 8707, 36789, 5371, 24584, 39176, 3509, 45128, 10004, 52141, 32369, 58683, 35309, 15427, 41760, 57796, 30057, 51349, 24518, 21121, 50730, 31704, 45529, 9585, 4089, 39772, 9913, 45560, 23813, 59526, 29666, 7986, 43670, 13823, 49462, 27805, 63426, 33643, 11892, 47556, 17665, 53353, 31617, 1850, 37486, 15783, 51475, 21592, 65445, 35588, 5724, 41384, 19695, 55360, 45563, 9559, 39086, 4083, 58198, 22171, 52732, 41275, 5295, 35815, 32546, 53906, 18909, 15660, 36977, 1997, 64285, 28262, 50629, 53665, 17680, 63743, 28596, 33566, 14040, 44469, 49532, 29908, 60320, 8045, 45764, 10633, 23927, 61477, 26512, 39753, 3632, 42398, 55636, 19513, 58360, 5973, 35333, 63839, 28154, 53279, 18270, 43939, 7741, 34120, 59800, 23659, 50025, 14208, 39483, 376, 30113, 55492, 20321, 46003, 9950, 36219, 45547, 9536, 39073, 4070, 61049, 31429, 50952, 20605, 48334, 2329, 37454, 65199, 19214, 54368, 8369, 36112, 18004, 54001, 28436, 63573, 5288, 41270, 14915, 22163, 58208, 31842, 34951, 9506, 48752, 51853, 26568, 28803, 58415, 22988, 45488, 49708, 22144, 60259, 31761, 37010, 9550, 48692, 53992, 26460, 63536, 3278, 41311, 14853, 20210, 10351, 48323, 288, 38482, 31441, 53005, 21623, 14507, 36127, 4723, 59018, 19219, 53325, 42171, 20686, 50289, 31124, 61126, 609, 47012, 11467, 45496, 45496, 9578, 45557, 9537, 39054, 4087, 58192, 22163, 52734, 41275, 45563, 9559, 39092, 4036, 58177, 22158, 52733, 41260, 5250, 35798, 32553, 53910, 18897, 45560, 9563, 39079, 4083, 58199, 22158, 45548, 9536, 39081, 4088, 58192, 22185, 52732, 41279, 5263, 35817, 32516, 53908, 18901, 15657, 36989, 52114, 24382, 58077, 30130, 39208, 11488, 46994, 56150, 28386, 61838, 45513, 9564, 39077, 4078, 58196, 22175, 52715, 41258, 5257, 35814, 32624, 53891, 18886, 15672, 36983, 2012, 64348, 28276, 50629, 47362, 11367, 33714, 30465, 59984, 16811, 13634, 43075, 8114, 62197, 26185, 56723, 45230, 9256, 39808, 3809, 57909, 22913, 52378, 40993, 6000, 35530, 32301, 54626, 18635, 15381, 37758, 1713, 64001, 20818, 50408, 47168, 12062, 42503, 12986, 36690};
                private static long b = -1389633612155902670L;

                /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void d(short r5, short r6, int r7, java.lang.Object[] r8) {
                    /*
                        int r7 = r7 + 4
                        byte[] r0 = defpackage.isDrawerSlideAnimationEnabled.$$d
                        int r1 = 53 - r5
                        int r6 = r6 + 84
                        byte[] r1 = new byte[r1]
                        int r5 = 52 - r5
                        r2 = 0
                        if (r0 != 0) goto L12
                        r3 = r5
                        r4 = r2
                        goto L26
                    L12:
                        r3 = r2
                    L13:
                        byte r4 = (byte) r6
                        r1[r3] = r4
                        int r7 = r7 + 1
                        int r4 = r3 + 1
                        if (r3 != r5) goto L24
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r1, r2)
                        r8[r2] = r5
                        return
                    L24:
                        r3 = r0[r7]
                    L26:
                        int r3 = -r3
                        int r6 = r6 + r3
                        int r6 = r6 + (-11)
                        r3 = r4
                        goto L13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.isDrawerSlideAnimationEnabled.d(short, short, int, java.lang.Object[]):void");
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0026  */
                /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void e(int r5, byte r6, byte r7, java.lang.Object[] r8) {
                    /*
                        byte[] r0 = defpackage.isDrawerSlideAnimationEnabled.$$a
                        int r5 = r5 * 17
                        int r1 = r5 + 17
                        int r7 = r7 * 3
                        int r7 = 106 - r7
                        int r6 = r6 + 4
                        byte[] r1 = new byte[r1]
                        int r5 = r5 + 16
                        r2 = 0
                        if (r0 != 0) goto L16
                        r4 = r5
                        r3 = r2
                        goto L2a
                    L16:
                        r3 = r2
                    L17:
                        int r6 = r6 + 1
                        byte r4 = (byte) r7
                        r1[r3] = r4
                        if (r3 != r5) goto L26
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r1, r2)
                        r8[r2] = r5
                        return
                    L26:
                        int r3 = r3 + 1
                        r4 = r0[r6]
                    L2a:
                        int r7 = r7 + r4
                        int r7 = r7 + (-3)
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.isDrawerSlideAnimationEnabled.e(int, byte, byte, java.lang.Object[]):void");
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    int i4 = 2 % 2;
                    int i5 = asBinder + 121;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                    int i6 = i5 % 2;
                    select selectVar2 = selectVar;
                    Throwable th = (Throwable) obj4;
                    if (i6 == 0) {
                        return select.INotificationSideChannel(selectVar2, th);
                    }
                    select.INotificationSideChannel(selectVar2, th);
                    throw null;
                }

                private static void a(char[] cArr, int i4, Object[] objArr) throws Throwable {
                    int i5 = 2 % 2;
                    getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                    getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
                    int length = cArr.length;
                    long[] jArr = new long[length];
                    getrealtimecapturelatency.b = 0;
                    while (getrealtimecapturelatency.b < cArr.length) {
                        int i6 = $10 + 7;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        int i8 = getrealtimecapturelatency.b;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19473 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 2625, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                            try {
                                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 482 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
                    char[] cArr2 = new char[length];
                    getrealtimecapturelatency.b = 0;
                    while (getrealtimecapturelatency.b < cArr.length) {
                        int i9 = $10 + 17;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39421), 481 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    }
                    objArr[0] = new String(cArr2);
                }

                private static void c(char c, int i4, int i5, Object[] objArr) throws Throwable {
                    int i6 = 2 % 2;
                    lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                    long[] jArr = new long[i5];
                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i5) {
                        int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i4 + i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                int i8 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2186;
                                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 41;
                                byte b2 = (byte) ($$c[3] - 1);
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, i8, bitsPerPixel, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(b), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 33017);
                                int i9 = 3012 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 26;
                                byte b4 = (byte) ($$c[3] - 1);
                                byte b5 = (byte) (b4 + 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, i9, touchSlop, 321985076, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cMakeMeasureSpec = (char) (36505 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                int mode = 3376 - View.MeasureSpec.getMode(0);
                                int deadChar = 17 - KeyEvent.getDeadChar(0, 0);
                                byte b6 = $$c[3];
                                byte b7 = (byte) (b6 - 1);
                                byte b8 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, mode, deadChar, -968507904, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    char[] cArr = new char[i5];
                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i5) {
                        int i10 = $10 + 103;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cKeyCodeFromString = (char) (36505 - KeyEvent.keyCodeFromString(""));
                            int iAlpha = 3376 - Color.alpha(0);
                            int iRed = 17 - Color.red(0);
                            byte b9 = $$c[3];
                            byte b10 = (byte) (b9 - 1);
                            byte b11 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, iAlpha, iRed, -968507904, false, $$g(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr);
                    int i12 = $11 + 99;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                }

                /* JADX WARN: Multi-variable search skipped. Vars limit reached: 8013 (expected less than 5000) */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v275 */
                /* JADX WARN: Type inference failed for: r10v302, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r10v448 */
                /* JADX WARN: Type inference failed for: r10v561 */
                /* JADX WARN: Type inference failed for: r10v562 */
                /* JADX WARN: Type inference failed for: r10v563, types: [java.lang.Object, java.security.KeyStore] */
                /* JADX WARN: Type inference failed for: r10v565, types: [java.lang.Object, java.security.KeyStore] */
                /* JADX WARN: Type inference failed for: r10v568, types: [java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r10v569 */
                /* JADX WARN: Type inference failed for: r10v586 */
                /* JADX WARN: Type inference failed for: r10v587 */
                /* JADX WARN: Type inference failed for: r10v596 */
                /* JADX WARN: Type inference failed for: r10v598, types: [java.lang.Object, java.security.KeyStore] */
                /* JADX WARN: Type inference failed for: r10v614 */
                /* JADX WARN: Type inference failed for: r10v74, types: [java.lang.reflect.Method] */
                /* JADX WARN: Type inference failed for: r10v825 */
                /* JADX WARN: Type inference failed for: r11v140, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r11v152, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r11v249, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r11v276 */
                /* JADX WARN: Type inference failed for: r11v360, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r11v410, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r11v477 */
                /* JADX WARN: Type inference failed for: r11v521, types: [java.lang.Object, java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r11v580, types: [java.lang.reflect.Method] */
                /* JADX WARN: Type inference failed for: r11v585, types: [java.nio.LongBuffer] */
                /* JADX WARN: Type inference failed for: r11v647, types: [java.lang.reflect.Method] */
                /* JADX WARN: Type inference failed for: r12v104, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r12v120 */
                /* JADX WARN: Type inference failed for: r13v140 */
                /* JADX WARN: Type inference failed for: r14v140 */
                /* JADX WARN: Type inference failed for: r14v222, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r14v326, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r14v345 */
                /* JADX WARN: Type inference failed for: r15v144 */
                /* JADX WARN: Type inference failed for: r1v333 */
                /* JADX WARN: Type inference failed for: r1v374 */
                /* JADX WARN: Type inference failed for: r1v379 */
                /* JADX WARN: Type inference failed for: r1v440, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r1v539, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r1v616 */
                /* JADX WARN: Type inference failed for: r1v686, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r1v778, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r1v884, types: [java.lang.reflect.Method] */
                /* JADX WARN: Type inference failed for: r1v924, types: [java.lang.Class] */
                /* JADX WARN: Type inference failed for: r1v925, types: [java.lang.reflect.Method] */
                /* JADX WARN: Type inference failed for: r1v947, types: [java.lang.reflect.Method] */
                /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r23v10 */
                /* JADX WARN: Type inference failed for: r23v18 */
                /* JADX WARN: Type inference failed for: r23v19 */
                /* JADX WARN: Type inference failed for: r23v20 */
                /* JADX WARN: Type inference failed for: r23v21 */
                /* JADX WARN: Type inference failed for: r2v114 */
                /* JADX WARN: Type inference failed for: r2v132 */
                /* JADX WARN: Type inference failed for: r2v141 */
                /* JADX WARN: Type inference failed for: r2v152 */
                /* JADX WARN: Type inference failed for: r2v153 */
                /* JADX WARN: Type inference failed for: r2v163 */
                /* JADX WARN: Type inference failed for: r2v172, types: [int[]] */
                /* JADX WARN: Type inference failed for: r2v202, types: [java.nio.LongBuffer[]] */
                /* JADX WARN: Type inference failed for: r2v203 */
                /* JADX WARN: Type inference failed for: r2v215 */
                /* JADX WARN: Type inference failed for: r2v216 */
                /* JADX WARN: Type inference failed for: r2v229 */
                /* JADX WARN: Type inference failed for: r2v436 */
                /* JADX WARN: Type inference failed for: r2v437 */
                /* JADX WARN: Type inference failed for: r2v85, types: [int[]] */
                /* JADX WARN: Type inference failed for: r32v0 */
                /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r32v11 */
                /* JADX WARN: Type inference failed for: r32v12 */
                /* JADX WARN: Type inference failed for: r32v13 */
                /* JADX WARN: Type inference failed for: r32v14 */
                /* JADX WARN: Type inference failed for: r32v23 */
                /* JADX WARN: Type inference failed for: r32v24 */
                /* JADX WARN: Type inference failed for: r32v25 */
                /* JADX WARN: Type inference failed for: r32v27, types: [int] */
                /* JADX WARN: Type inference failed for: r32v28 */
                /* JADX WARN: Type inference failed for: r32v29 */
                /* JADX WARN: Type inference failed for: r32v3 */
                /* JADX WARN: Type inference failed for: r32v30 */
                /* JADX WARN: Type inference failed for: r32v31 */
                /* JADX WARN: Type inference failed for: r32v32 */
                /* JADX WARN: Type inference failed for: r32v33 */
                /* JADX WARN: Type inference failed for: r32v34 */
                /* JADX WARN: Type inference failed for: r32v4 */
                /* JADX WARN: Type inference failed for: r32v5, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r32v6 */
                /* JADX WARN: Type inference failed for: r32v7 */
                /* JADX WARN: Type inference failed for: r33v1 */
                /* JADX WARN: Type inference failed for: r33v2 */
                /* JADX WARN: Type inference failed for: r33v43 */
                /* JADX WARN: Type inference failed for: r33v45 */
                /* JADX WARN: Type inference failed for: r33v46 */
                /* JADX WARN: Type inference failed for: r33v47 */
                /* JADX WARN: Type inference failed for: r33v48 */
                /* JADX WARN: Type inference failed for: r33v49 */
                /* JADX WARN: Type inference failed for: r33v5 */
                /* JADX WARN: Type inference failed for: r33v54 */
                /* JADX WARN: Type inference failed for: r33v55 */
                /* JADX WARN: Type inference failed for: r33v59 */
                /* JADX WARN: Type inference failed for: r33v6 */
                /* JADX WARN: Type inference failed for: r33v60 */
                /* JADX WARN: Type inference failed for: r33v61 */
                /* JADX WARN: Type inference failed for: r33v62 */
                /* JADX WARN: Type inference failed for: r33v68 */
                /* JADX WARN: Type inference failed for: r33v69 */
                /* JADX WARN: Type inference failed for: r33v70 */
                /* JADX WARN: Type inference failed for: r33v72, types: [int] */
                /* JADX WARN: Type inference failed for: r33v74 */
                /* JADX WARN: Type inference failed for: r33v75 */
                /* JADX WARN: Type inference failed for: r33v76 */
                /* JADX WARN: Type inference failed for: r33v77 */
                /* JADX WARN: Type inference failed for: r33v78 */
                /* JADX WARN: Type inference failed for: r33v79 */
                /* JADX WARN: Type inference failed for: r33v80 */
                /* JADX WARN: Type inference failed for: r33v81 */
                /* JADX WARN: Type inference failed for: r33v82 */
                /* JADX WARN: Type inference failed for: r33v83 */
                /* JADX WARN: Type inference failed for: r33v84 */
                /* JADX WARN: Type inference failed for: r33v85 */
                /* JADX WARN: Type inference failed for: r33v86 */
                /* JADX WARN: Type inference failed for: r33v87 */
                /* JADX WARN: Type inference failed for: r34v0 */
                /* JADX WARN: Type inference failed for: r34v25 */
                /* JADX WARN: Type inference failed for: r34v26 */
                /* JADX WARN: Type inference failed for: r34v27 */
                /* JADX WARN: Type inference failed for: r34v28 */
                /* JADX WARN: Type inference failed for: r34v29 */
                /* JADX WARN: Type inference failed for: r34v30 */
                /* JADX WARN: Type inference failed for: r34v31 */
                /* JADX WARN: Type inference failed for: r34v32 */
                /* JADX WARN: Type inference failed for: r34v33, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r34v35, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r34v36 */
                /* JADX WARN: Type inference failed for: r34v40 */
                /* JADX WARN: Type inference failed for: r34v43, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r34v49 */
                /* JADX WARN: Type inference failed for: r34v50 */
                /* JADX WARN: Type inference failed for: r34v52 */
                /* JADX WARN: Type inference failed for: r34v53 */
                /* JADX WARN: Type inference failed for: r34v54 */
                /* JADX WARN: Type inference failed for: r36v0 */
                /* JADX WARN: Type inference failed for: r36v1 */
                /* JADX WARN: Type inference failed for: r3v206 */
                /* JADX WARN: Type inference failed for: r3v345 */
                /* JADX WARN: Type inference failed for: r3v348 */
                /* JADX WARN: Type inference failed for: r3v435, types: [java.lang.reflect.Method] */
                /* JADX WARN: Type inference failed for: r3v483, types: [java.lang.Class] */
                /* JADX WARN: Type inference failed for: r3v484, types: [java.lang.reflect.Method] */
                /* JADX WARN: Type inference failed for: r3v60 */
                /* JADX WARN: Type inference failed for: r3v93 */
                /* JADX WARN: Type inference failed for: r41v9 */
                /* JADX WARN: Type inference failed for: r43v16 */
                /* JADX WARN: Type inference failed for: r4v359 */
                /* JADX WARN: Type inference failed for: r4v383, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r4v488, types: [int[]] */
                /* JADX WARN: Type inference failed for: r4v546, types: [android.security.keystore.KeyGenParameterSpec$Builder] */
                /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v131 */
                /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v22 */
                /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object[]] */
                /* JADX WARN: Type inference failed for: r5v280 */
                /* JADX WARN: Type inference failed for: r5v330 */
                /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.CharSequence] */
                /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.CharSequence, java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v39 */
                /* JADX WARN: Type inference failed for: r5v397 */
                /* JADX WARN: Type inference failed for: r5v450 */
                /* JADX WARN: Type inference failed for: r5v46 */
                /* JADX WARN: Type inference failed for: r5v638 */
                /* JADX WARN: Type inference failed for: r5v639 */
                /* JADX WARN: Type inference failed for: r5v677 */
                /* JADX WARN: Type inference failed for: r5v678 */
                /* JADX WARN: Type inference failed for: r5v679 */
                /* JADX WARN: Type inference failed for: r5v680 */
                /* JADX WARN: Type inference failed for: r5v7 */
                /* JADX WARN: Type inference failed for: r5v8 */
                /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.CharSequence, java.lang.String] */
                /* JADX WARN: Type inference failed for: r6v162 */
                /* JADX WARN: Type inference failed for: r6v163, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r6v165, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r6v166 */
                /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r6v240, types: [java.lang.Object, java.nio.LongBuffer] */
                /* JADX WARN: Type inference failed for: r6v245, types: [java.lang.Object, java.nio.LongBuffer] */
                /* JADX WARN: Type inference failed for: r6v400 */
                /* JADX WARN: Type inference failed for: r6v407 */
                /* JADX WARN: Type inference failed for: r6v650 */
                /* JADX WARN: Type inference failed for: r6v75, types: [java.lang.Object, java.nio.LongBuffer] */
                /* JADX WARN: Type inference failed for: r7v10 */
                /* JADX WARN: Type inference failed for: r7v106, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r7v11 */
                /* JADX WARN: Type inference failed for: r7v119 */
                /* JADX WARN: Type inference failed for: r7v12 */
                /* JADX WARN: Type inference failed for: r7v121 */
                /* JADX WARN: Type inference failed for: r7v123, types: [int] */
                /* JADX WARN: Type inference failed for: r7v130, types: [java.lang.reflect.Method] */
                /* JADX WARN: Type inference failed for: r7v132 */
                /* JADX WARN: Type inference failed for: r7v133 */
                /* JADX WARN: Type inference failed for: r7v134 */
                /* JADX WARN: Type inference failed for: r7v135 */
                /* JADX WARN: Type inference failed for: r7v136 */
                /* JADX WARN: Type inference failed for: r7v138 */
                /* JADX WARN: Type inference failed for: r7v139 */
                /* JADX WARN: Type inference failed for: r7v144, types: [java.lang.reflect.Method] */
                /* JADX WARN: Type inference failed for: r7v145 */
                /* JADX WARN: Type inference failed for: r7v148 */
                /* JADX WARN: Type inference failed for: r7v149 */
                /* JADX WARN: Type inference failed for: r7v150 */
                /* JADX WARN: Type inference failed for: r7v155, types: [java.lang.reflect.Method] */
                /* JADX WARN: Type inference failed for: r7v157 */
                /* JADX WARN: Type inference failed for: r7v158 */
                /* JADX WARN: Type inference failed for: r7v159 */
                /* JADX WARN: Type inference failed for: r7v161 */
                /* JADX WARN: Type inference failed for: r7v162 */
                /* JADX WARN: Type inference failed for: r7v163 */
                /* JADX WARN: Type inference failed for: r7v164 */
                /* JADX WARN: Type inference failed for: r7v166 */
                /* JADX WARN: Type inference failed for: r7v167 */
                /* JADX WARN: Type inference failed for: r7v168 */
                /* JADX WARN: Type inference failed for: r7v173, types: [java.lang.reflect.Method] */
                /* JADX WARN: Type inference failed for: r7v174 */
                /* JADX WARN: Type inference failed for: r7v177 */
                /* JADX WARN: Type inference failed for: r7v178 */
                /* JADX WARN: Type inference failed for: r7v179, types: [int] */
                /* JADX WARN: Type inference failed for: r7v183 */
                /* JADX WARN: Type inference failed for: r7v2 */
                /* JADX WARN: Type inference failed for: r7v207 */
                /* JADX WARN: Type inference failed for: r7v228 */
                /* JADX WARN: Type inference failed for: r7v248 */
                /* JADX WARN: Type inference failed for: r7v249 */
                /* JADX WARN: Type inference failed for: r7v250 */
                /* JADX WARN: Type inference failed for: r7v251 */
                /* JADX WARN: Type inference failed for: r7v252 */
                /* JADX WARN: Type inference failed for: r7v253 */
                /* JADX WARN: Type inference failed for: r7v254 */
                /* JADX WARN: Type inference failed for: r7v260 */
                /* JADX WARN: Type inference failed for: r7v261 */
                /* JADX WARN: Type inference failed for: r7v262 */
                /* JADX WARN: Type inference failed for: r7v263 */
                /* JADX WARN: Type inference failed for: r7v264 */
                /* JADX WARN: Type inference failed for: r7v265 */
                /* JADX WARN: Type inference failed for: r7v266 */
                /* JADX WARN: Type inference failed for: r7v267 */
                /* JADX WARN: Type inference failed for: r7v268 */
                /* JADX WARN: Type inference failed for: r7v269 */
                /* JADX WARN: Type inference failed for: r7v270 */
                /* JADX WARN: Type inference failed for: r7v271 */
                /* JADX WARN: Type inference failed for: r7v272 */
                /* JADX WARN: Type inference failed for: r7v273 */
                /* JADX WARN: Type inference failed for: r7v274 */
                /* JADX WARN: Type inference failed for: r7v275 */
                /* JADX WARN: Type inference failed for: r7v276 */
                /* JADX WARN: Type inference failed for: r7v277 */
                /* JADX WARN: Type inference failed for: r7v278 */
                /* JADX WARN: Type inference failed for: r7v279 */
                /* JADX WARN: Type inference failed for: r7v280 */
                /* JADX WARN: Type inference failed for: r7v281 */
                /* JADX WARN: Type inference failed for: r7v282 */
                /* JADX WARN: Type inference failed for: r7v283 */
                /* JADX WARN: Type inference failed for: r7v284 */
                /* JADX WARN: Type inference failed for: r7v285 */
                /* JADX WARN: Type inference failed for: r7v286 */
                /* JADX WARN: Type inference failed for: r7v287 */
                /* JADX WARN: Type inference failed for: r7v288 */
                /* JADX WARN: Type inference failed for: r7v289 */
                /* JADX WARN: Type inference failed for: r7v29 */
                /* JADX WARN: Type inference failed for: r7v290 */
                /* JADX WARN: Type inference failed for: r7v291 */
                /* JADX WARN: Type inference failed for: r7v292 */
                /* JADX WARN: Type inference failed for: r7v293 */
                /* JADX WARN: Type inference failed for: r7v294 */
                /* JADX WARN: Type inference failed for: r7v295 */
                /* JADX WARN: Type inference failed for: r7v296 */
                /* JADX WARN: Type inference failed for: r7v297 */
                /* JADX WARN: Type inference failed for: r7v298 */
                /* JADX WARN: Type inference failed for: r7v299 */
                /* JADX WARN: Type inference failed for: r7v300 */
                /* JADX WARN: Type inference failed for: r7v301 */
                /* JADX WARN: Type inference failed for: r7v31 */
                /* JADX WARN: Type inference failed for: r7v33 */
                /* JADX WARN: Type inference failed for: r7v34 */
                /* JADX WARN: Type inference failed for: r7v35 */
                /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Class[]] */
                /* JADX WARN: Type inference failed for: r7v4, types: [int] */
                /* JADX WARN: Type inference failed for: r7v5, types: [int] */
                /* JADX WARN: Type inference failed for: r7v6 */
                /* JADX WARN: Type inference failed for: r7v7 */
                /* JADX WARN: Type inference failed for: r7v72, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r7v73 */
                /* JADX WARN: Type inference failed for: r7v79, types: [java.lang.String[]] */
                /* JADX WARN: Type inference failed for: r7v8 */
                /* JADX WARN: Type inference failed for: r7v82, types: [java.lang.Class<java.lang.String>] */
                /* JADX WARN: Type inference failed for: r7v83 */
                /* JADX WARN: Type inference failed for: r7v9 */
                /* JADX WARN: Type inference failed for: r7v90 */
                /* JADX WARN: Type inference failed for: r7v91 */
                /* JADX WARN: Type inference failed for: r7v92, types: [int] */
                /* JADX WARN: Type inference failed for: r7v93 */
                /* JADX WARN: Type inference failed for: r8v103 */
                /* JADX WARN: Type inference failed for: r8v136 */
                /* JADX WARN: Type inference failed for: r8v137, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v138 */
                /* JADX WARN: Type inference failed for: r8v139 */
                /* JADX WARN: Type inference failed for: r8v140, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r8v16, types: [java.nio.LongBuffer[]] */
                /* JADX WARN: Type inference failed for: r8v17 */
                /* JADX WARN: Type inference failed for: r8v249 */
                /* JADX WARN: Type inference failed for: r8v298 */
                /* JADX WARN: Type inference failed for: r8v400, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r8v449 */
                /* JADX WARN: Type inference failed for: r8v464, types: [java.lang.reflect.Field] */
                /* JADX WARN: Type inference failed for: r8v504 */
                /* JADX WARN: Type inference failed for: r8v514 */
                /* JADX WARN: Type inference failed for: r8v517 */
                /* JADX WARN: Type inference failed for: r8v533, types: [java.lang.reflect.Method] */
                /* JADX WARN: Type inference failed for: r8v537 */
                /* JADX WARN: Type inference failed for: r8v549 */
                /* JADX WARN: Type inference failed for: r8v550 */
                /* JADX WARN: Type inference failed for: r8v551 */
                /* JADX WARN: Type inference failed for: r8v553 */
                /* JADX WARN: Type inference failed for: r8v628, types: [java.lang.Class[]] */
                /* JADX WARN: Type inference failed for: r8v74 */
                /* JADX WARN: Type inference failed for: r8v854 */
                /* JADX WARN: Type inference failed for: r8v855 */
                /* JADX WARN: Type inference failed for: r8v856 */
                /* JADX WARN: Type inference failed for: r8v857 */
                /* JADX WARN: Type inference failed for: r8v858 */
                /* JADX WARN: Type inference failed for: r8v859 */
                /* JADX WARN: Type inference failed for: r8v860 */
                /* JADX WARN: Type inference failed for: r8v861 */
                /* JADX WARN: Type inference failed for: r8v862 */
                /* JADX WARN: Type inference failed for: r8v863 */
                /* JADX WARN: Type inference failed for: r8v864 */
                /* JADX WARN: Type inference failed for: r8v96 */
                /* JADX WARN: Type inference failed for: r8v97 */
                /* JADX WARN: Type inference failed for: r9v120, types: [java.lang.Object, java.lang.StringBuilder] */
                /* JADX WARN: Type inference failed for: r9v195, types: [java.lang.String[]] */
                /* JADX WARN: Type inference failed for: r9v197 */
                /* JADX WARN: Type inference failed for: r9v229, types: [java.lang.Object, java.nio.LongBuffer] */
                /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                    java.util.NoSuchElementException
                    	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                    	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                    	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                    */
                public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context r63, java.lang.String[] r64, int r65, int r66, int r67) {
                    /*
                        Method dump skipped, instruction units count: 27073
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.isDrawerSlideAnimationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
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
                private static java.lang.String $$g(short r6, short r7, int r8) {
                    /*
                        byte[] r0 = defpackage.isDrawerSlideAnimationEnabled.$$c
                        int r8 = r8 * 2
                        int r8 = r8 + 1
                        int r6 = r6 * 3
                        int r6 = r6 + 4
                        int r7 = r7 * 3
                        int r7 = r7 + 109
                        byte[] r1 = new byte[r8]
                        r2 = 0
                        if (r0 != 0) goto L16
                        r3 = r6
                        r5 = r2
                        goto L26
                    L16:
                        r3 = r2
                    L17:
                        byte r4 = (byte) r7
                        int r5 = r3 + 1
                        r1[r3] = r4
                        if (r5 != r8) goto L24
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        return r6
                    L24:
                        r3 = r0[r6]
                    L26:
                        int r6 = r6 + 1
                        int r3 = -r3
                        int r7 = r7 + r3
                        r3 = r5
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.isDrawerSlideAnimationEnabled.$$g(short, short, int):java.lang.String");
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: onDrawerSlide
                @Override // defpackage.logToString
                public final void accept(Object obj4) {
                    function2.invoke(obj4);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            selectVar.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_asik_list_kpj_mobile_result", "failure_asik_list_kpj_mobile_result"));
            Intrinsics.checkNotNullParameter("failure_asik_list_kpj_mobile_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_asik_list_kpj_mobile_result", mapMutableMapOf3);
            localelistforlanguagetags.write();
            getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
            String string = localelistforlanguagetags.getString(R.string.action_information);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String strValueOf3 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string2 = localelistforlanguagetags.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, strValueOf3, string2, null, 112);
            localelistforlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getstringornullB;
            if (getstringornullB != null) {
                FragmentManager childFragmentManager = localelistforlanguagetags.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    return;
                }
                return;
            }
            return;
        }
        localelistforlanguagetags.write();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final localeListForLanguageTags localelistforlanguagetags, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: AppCompatDelegateExternalSyntheticLambda1
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    localeListForLanguageTags.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, i, i2, i3);
                }
            }, localelistforlanguagetags.INotificationSideChannelStubProxy.get(1), localelistforlanguagetags.INotificationSideChannelStubProxy.get(2), localelistforlanguagetags.INotificationSideChannelStubProxy.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(localeListForLanguageTags localelistforlanguagetags) {
        BaseActivity baseActivity = localelistforlanguagetags.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(localeListForLanguageTags localelistforlanguagetags) {
        BaseActivity baseActivity = localelistforlanguagetags.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ startAsSupportActionMode b(localeListForLanguageTags localelistforlanguagetags) {
        Context contextRequireContext = localelistforlanguagetags.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new startAsSupportActionMode(contextRequireContext, null, new Function1() { // from class: localeManagerSetApplicationLocales
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return localeListForLanguageTags.b((AsikListKpj) obj);
            }
        }, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        User user = (User) this.INotificationSideChannel.getValue();
        if (Intrinsics.areEqual(String.valueOf(user != null ? user.cancelAll : null), "")) {
            TextInputLayout textInputLayout = INotificationSideChannelStub().tilBirthPlace;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            TextInputLayout textInputLayout2 = textInputLayout;
            Intrinsics.checkNotNullParameter(textInputLayout2, "");
            textInputLayout2.setEnabled(true);
        } else {
            User user2 = (User) this.INotificationSideChannel.getValue();
            String str = user2 != null ? user2.cancelAll : null;
            if (str == null || str.length() == 0) {
                TextInputLayout textInputLayout3 = INotificationSideChannelStub().tilBirthPlace;
                Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
                TextInputLayout textInputLayout4 = textInputLayout3;
                Intrinsics.checkNotNullParameter(textInputLayout4, "");
                textInputLayout4.setEnabled(true);
            } else {
                TextInputLayout textInputLayout5 = INotificationSideChannelStub().tilBirthPlace;
                Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
                TextInputLayout textInputLayout6 = textInputLayout5;
                Intrinsics.checkNotNullParameter(textInputLayout6, "");
                textInputLayout6.setEnabled(false);
            }
        }
        User user3 = (User) this.INotificationSideChannel.getValue();
        String str2 = user3 != null ? user3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        User user4 = (User) this.INotificationSideChannel.getValue();
        String str3 = user4 != null ? user4.b : null;
        User user5 = (User) this.INotificationSideChannel.getValue();
        String str4 = user5 != null ? user5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
        User user6 = (User) this.INotificationSideChannel.getValue();
        AsikListKpjMobileRequest asikListKpjMobileRequest = new AsikListKpjMobileRequest(str2, str3, str4, user6 != null ? user6.asInterface : null);
        final select selectVar = (select) this.RemoteActionCompatParcelizer.getValue();
        Intrinsics.checkNotNullParameter(asikListKpjMobileRequest, "");
        MutableLiveData<VirtualCameraAdapter1<List<AsikListKpjMobile>>> mutableLiveData = selectVar.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVar.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asikListKpjMobileRequest)));
        final Function1 function1 = new Function1() { // from class: setupCustomContent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.TuitionPaymentFragmentspecialinlinedviewModeldefault2(selectVar, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: setupButtons
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setupContent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.a(selectVar, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setupView
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        selectVar.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        localeListForLanguageTags localelistforlanguagetags = this;
        ((select) this.RemoteActionCompatParcelizer.getValue()).g.observe(localelistforlanguagetags, new Observer() { // from class: lambdaexecute0androidxappcompatappAppCompatDelegateSerialExecutor
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                localeListForLanguageTags.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((select) this.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentbindingInflater1.observe(localelistforlanguagetags, new Observer() { // from class: AppCompatDelegateThreadPerTaskExecutor
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                localeListForLanguageTags.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        ((select) this.RemoteActionCompatParcelizer.getValue()).b.observe(localelistforlanguagetags, new Observer() { // from class: AppCompatDelegateImpl
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                localeListForLanguageTags.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(localeListForLanguageTags localelistforlanguagetags, int i, int i2, int i3) {
        localelistforlanguagetags.INotificationSideChannelStubProxy.set(1, i);
        localelistforlanguagetags.INotificationSideChannelStubProxy.set(2, i2);
        localelistforlanguagetags.INotificationSideChannelStubProxy.set(5, i3);
        localelistforlanguagetags.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(localelistforlanguagetags.INotificationSideChannelStubProxy.getTime()));
    }

    public static /* synthetic */ Unit b(localeListForLanguageTags localelistforlanguagetags, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = localelistforlanguagetags.getString(R.string.label_not_correct);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = localelistforlanguagetags.getString(R.string.label_reminder_fixing_data_to_branch_office);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = localelistforlanguagetags.getString(R.string.label_back_to_homescreen);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, string2, string3, null, 112);
        localelistforlanguagetags.b = getstringornullB;
        if (getstringornullB != null) {
            FragmentManager childFragmentManager = localelistforlanguagetags.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        getStringOrNull getstringornull = localelistforlanguagetags.b;
        if (getstringornull != null) {
            getstringornull.INotificationSideChannel = localelistforlanguagetags.new b();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x055e  */
    /* JADX WARN: Code duplicated, block: B:140:0x057c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0583  */
    /* JADX WARN: Code duplicated, block: B:164:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0202  */
    /* JADX WARN: Code duplicated, block: B:47:0x0208  */
    /* JADX WARN: Code duplicated, block: B:56:0x0250  */
    /* JADX WARN: Code duplicated, block: B:59:0x025d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0263  */
    /* JADX WARN: Code duplicated, block: B:63:0x0275  */
    /* JADX WARN: Code duplicated, block: B:64:0x027a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0291  */
    /* JADX WARN: Code duplicated, block: B:68:0x0296  */
    /* JADX WARN: Code duplicated, block: B:71:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:72:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x0359  */
    /* JADX WARN: Code duplicated, block: B:84:0x038e  */
    /* JADX WARN: Code duplicated, block: B:86:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:89:0x03a9  */
    /* JADX WARN: Type inference failed for: r1v18, types: [T, java.lang.String] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final localeListForLanguageTags localelistforlanguagetags, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        Function1 function1;
        String string;
        int i;
        int i2;
        int i3;
        int size;
        getStringOrNull getstringornullB;
        getStringOrNull getstringornull;
        FragmentManager childFragmentManager;
        EditText editText;
        Editable text;
        EditText editText2;
        Editable text2;
        EditText editText3;
        Editable text3;
        EditText editText4;
        Editable text4;
        User user;
        String str2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            localelistforlanguagetags.IconCompatParcelizer();
            str = "loading_asik_step_first_verify_membership_data_result";
        } else {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder;
            int i4 = R.id.tilKpj;
            if (z) {
                localelistforlanguagetags.write();
                BaseItem baseItem = (BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                List<EmployeeKpj> listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = localelistforlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                CollectionsKt.toMutableList((Collection) localelistforlanguagetags.d);
                localelistforlanguagetags.g = new ArrayList();
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                List mutableList = CollectionsKt.toMutableList((Collection) localelistforlanguagetags.asBinder);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (!localelistforlanguagetags.asBinder.isEmpty()) {
                    if (Intrinsics.areEqual(((AsikListKpj) CollectionsKt.first((List) localelistforlanguagetags.asBinder)).TuitionPaymentFragmentspecialinlinedviewModeldefault1, Boolean.TRUE)) {
                        int size2 = listTuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
                        int i5 = 0;
                        i2 = 0;
                        while (i5 < size2) {
                            arrayList4.add(listTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i5).b.toString());
                            int i6 = i5 + 1;
                            TextInputLayout textInputLayout = (TextInputLayout) localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getChildAt(i6).findViewById(i4);
                            arrayList3.add(String.valueOf(((AsikListKpj) mutableList.get(i5)).b));
                            int i7 = size2;
                            if (localelistforlanguagetags.asInterface.contains(listTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i5).b)) {
                                i2++;
                                arrayList2.add(String.valueOf(((AsikListKpj) mutableList.get(i5)).b));
                                if (textInputLayout != null) {
                                    textInputLayout.setError(null);
                                }
                            } else if (textInputLayout != null) {
                                textInputLayout.setError("Kpj tidak sesuai");
                            }
                            size2 = i7;
                            i5 = i6;
                            i4 = R.id.tilKpj;
                        }
                    } else {
                        int size3 = listTuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
                        i = 0;
                        int i8 = 0;
                        while (i8 < size3) {
                            arrayList4.add(listTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i8).b.toString());
                            TextInputLayout textInputLayout2 = (TextInputLayout) localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getChildAt(i8).findViewById(R.id.tilKpj);
                            arrayList3.add(String.valueOf(((AsikListKpj) mutableList.get(i8)).b));
                            int i9 = size3;
                            if (localelistforlanguagetags.asInterface.contains(listTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i8).b)) {
                                i++;
                                arrayList2.add(String.valueOf(((AsikListKpj) mutableList.get(i8)).b));
                                if (textInputLayout2 != null) {
                                    textInputLayout2.setError(null);
                                }
                            } else if (textInputLayout2 != null) {
                                textInputLayout2.setError("Kpj tidak sesuai");
                            }
                            i8++;
                            size3 = i9;
                        }
                    }
                    arrayList3.removeAll(arrayList2);
                    i3 = 0;
                    for (Object obj : arrayList3) {
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        arrayList.add(Camera2CameraControlExternalSyntheticLambda5.asInterface((String) arrayList3.get(i3)));
                        i3++;
                    }
                    if (localelistforlanguagetags.asBinder.isEmpty() && (Intrinsics.areEqual(((AsikListKpj) CollectionsKt.first((List) localelistforlanguagetags.asBinder)).TuitionPaymentFragmentspecialinlinedviewModeldefault1, Boolean.TRUE) || Intrinsics.areEqual(((AsikListKpj) CollectionsKt.first((List) localelistforlanguagetags.asBinder)).TuitionPaymentFragmentspecialinlinedviewModeldefault2, "BPU"))) {
                        size = mutableList.size() - 1;
                    } else {
                        size = mutableList.size();
                    }
                    if ((i2 + localelistforlanguagetags.a) - 1 == size) {
                        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                        List listDistinct = CollectionsKt.distinct(arrayList);
                        StringBuilder sb = new StringBuilder("Terdapat nomor KPJ yang tidak berhasil terkonfirmasi: ");
                        sb.append(listDistinct);
                        sb.append(". Tolong isi KPJ dengan benar.");
                        String string2 = sb.toString();
                        String string3 = localelistforlanguagetags.getString(R.string.action_return);
                        Intrinsics.checkNotNullExpressionValue(string3, "");
                        getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "Nomor KPJ Belum Terkonfirmasi", string2, string3, null, 112);
                        localelistforlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getstringornullB;
                        if (getstringornullB != null) {
                            childFragmentManager = localelistforlanguagetags.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            Intrinsics.checkNotNullParameter(childFragmentManager, "");
                            if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        }
                        getstringornull = localelistforlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (getstringornull != null) {
                            getstringornull.INotificationSideChannel = localelistforlanguagetags.new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        }
                    } else if (baseItem.getIsSuccessful()) {
                        FragmentAsikActiveParticipantMembershipDataBinding fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub = localelistforlanguagetags.INotificationSideChannelStub();
                        List<EmployeeKpj> listTuitionPaymentFragmentspecialinlinedviewModeldefault2 = localelistforlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        editText = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                        if (editText != null) {
                            text = editText.getText();
                        } else {
                            text = null;
                        }
                        String string4 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                        editText2 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilFullName.getEditText();
                        if (editText2 != null) {
                            text2 = editText2.getText();
                        } else {
                            text2 = null;
                        }
                        String string5 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
                        editText3 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilBirthPlace.getEditText();
                        if (editText3 != null) {
                            text3 = editText3.getText();
                        } else {
                            text3 = null;
                        }
                        String string6 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                        editText4 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                        if (editText4 != null) {
                            text4 = editText4.getText();
                        } else {
                            text4 = null;
                        }
                        String string7 = StringsKt.trim((CharSequence) String.valueOf(text4)).toString();
                        user = (User) localelistforlanguagetags.INotificationSideChannel.getValue();
                        if (user != null) {
                            str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        } else {
                            str2 = null;
                        }
                        String lowerCase = String.valueOf(str2).toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        AsikActiveParticipant asikActiveParticipant = new AsikActiveParticipant(string4, listTuitionPaymentFragmentspecialinlinedviewModeldefault2, string5, string6, string7, null, null, null, null, null, null, null, null, null, lowerCase, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16416, 31, null);
                        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion2 = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                        lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol = new lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl(asikActiveParticipant, null, 2, null);
                        Intrinsics.checkNotNullParameter(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol, "");
                        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol);
                    }
                    str = "success_asik_step_first_verify_membership_data_result";
                } else {
                    int size4 = listTuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
                    i = 0;
                    int i10 = 0;
                    while (i10 < size4) {
                        arrayList4.add(listTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i10).b.toString());
                        TextInputLayout textInputLayout3 = (TextInputLayout) localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getChildAt(i10).findViewById(R.id.tilKpj);
                        arrayList3.add(String.valueOf(((AsikListKpj) mutableList.get(i10)).b));
                        List<EmployeeKpj> list = listTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (localelistforlanguagetags.asInterface.contains(listTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i10).b)) {
                            i++;
                            arrayList2.add(String.valueOf(((AsikListKpj) mutableList.get(i10)).b));
                            if (textInputLayout3 != null) {
                                textInputLayout3.setError(null);
                            }
                        } else if (textInputLayout3 != null) {
                            textInputLayout3.setError("Kpj tidak sesuai");
                        }
                        i10++;
                        listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
                    }
                }
                i2 = i;
                arrayList3.removeAll(arrayList2);
                i3 = 0;
                while (r2.hasNext()) {
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(Camera2CameraControlExternalSyntheticLambda5.asInterface((String) arrayList3.get(i3)));
                    i3++;
                }
                if (localelistforlanguagetags.asBinder.isEmpty()) {
                    size = mutableList.size();
                } else {
                    size = mutableList.size();
                }
                if ((i2 + localelistforlanguagetags.a) - 1 == size) {
                    getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
                    List listDistinct2 = CollectionsKt.distinct(arrayList);
                    StringBuilder sb2 = new StringBuilder("Terdapat nomor KPJ yang tidak berhasil terkonfirmasi: ");
                    sb2.append(listDistinct2);
                    sb2.append(". Tolong isi KPJ dengan benar.");
                    String string8 = sb2.toString();
                    String string9 = localelistforlanguagetags.getString(R.string.action_return);
                    Intrinsics.checkNotNullExpressionValue(string9, "");
                    getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "Nomor KPJ Belum Terkonfirmasi", string8, string9, null, 112);
                    localelistforlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getstringornullB;
                    if (getstringornullB != null) {
                        childFragmentManager = localelistforlanguagetags.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager, "");
                        if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }
                    getstringornull = localelistforlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (getstringornull != null) {
                        getstringornull.INotificationSideChannel = localelistforlanguagetags.new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    }
                } else if (baseItem.getIsSuccessful()) {
                    FragmentAsikActiveParticipantMembershipDataBinding fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub2 = localelistforlanguagetags.INotificationSideChannelStub();
                    List<EmployeeKpj> listTuitionPaymentFragmentspecialinlinedviewModeldefault4 = localelistforlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    editText = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub2.tilIdNumber.getEditText();
                    if (editText != null) {
                        text = editText.getText();
                    } else {
                        text = null;
                    }
                    String string10 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                    editText2 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub2.tilFullName.getEditText();
                    if (editText2 != null) {
                        text2 = editText2.getText();
                    } else {
                        text2 = null;
                    }
                    String string11 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
                    editText3 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub2.tilBirthPlace.getEditText();
                    if (editText3 != null) {
                        text3 = editText3.getText();
                    } else {
                        text3 = null;
                    }
                    String string12 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                    editText4 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub2.tilBirthDate.getEditText();
                    if (editText4 != null) {
                        text4 = editText4.getText();
                    } else {
                        text4 = null;
                    }
                    String string13 = StringsKt.trim((CharSequence) String.valueOf(text4)).toString();
                    user = (User) localelistforlanguagetags.INotificationSideChannel.getValue();
                    if (user != null) {
                        str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        str2 = null;
                    }
                    String lowerCase2 = String.valueOf(str2).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    AsikActiveParticipant asikActiveParticipant2 = new AsikActiveParticipant(string10, listTuitionPaymentFragmentspecialinlinedviewModeldefault4, string11, string12, string13, null, null, null, null, null, null, null, null, null, lowerCase2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16416, 31, null);
                    lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion4 = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                    lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol2 = new lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl(asikActiveParticipant2, null, 2, null);
                    Intrinsics.checkNotNullParameter(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol2, "");
                    lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol2);
                }
                str = "success_asik_step_first_verify_membership_data_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                localelistforlanguagetags.write();
                List<EmployeeKpj> listTuitionPaymentFragmentspecialinlinedviewModeldefault5 = localelistforlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                localelistforlanguagetags.g = new ArrayList();
                if (!localelistforlanguagetags.asBinder.isEmpty()) {
                    if (Intrinsics.areEqual(((AsikListKpj) CollectionsKt.first((List) localelistforlanguagetags.asBinder)).TuitionPaymentFragmentspecialinlinedviewModeldefault1, Boolean.TRUE) || Intrinsics.areEqual(((AsikListKpj) CollectionsKt.first((List) localelistforlanguagetags.asBinder)).TuitionPaymentFragmentspecialinlinedviewModeldefault2, "BPU")) {
                        int size5 = listTuitionPaymentFragmentspecialinlinedviewModeldefault5.size();
                        int i11 = 0;
                        while (i11 < size5) {
                            int i12 = i11 + 1;
                            TextInputLayout textInputLayout4 = (TextInputLayout) localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getChildAt(i12).findViewById(R.id.tilKpj);
                            if (localelistforlanguagetags.asInterface.contains(listTuitionPaymentFragmentspecialinlinedviewModeldefault5.get(i11).b)) {
                                if (textInputLayout4 != null) {
                                    textInputLayout4.setError(null);
                                }
                            } else if (textInputLayout4 != null) {
                                textInputLayout4.setError("Kpj tidak sesuai");
                            }
                            i11 = i12;
                        }
                    } else {
                        int size6 = listTuitionPaymentFragmentspecialinlinedviewModeldefault5.size();
                        for (int i13 = 0; i13 < size6; i13++) {
                            TextInputLayout textInputLayout5 = (TextInputLayout) localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getChildAt(i13).findViewById(R.id.tilKpj);
                            if (localelistforlanguagetags.asInterface.contains(listTuitionPaymentFragmentspecialinlinedviewModeldefault5.get(i13).b)) {
                                if (textInputLayout5 != null) {
                                    textInputLayout5.setError(null);
                                }
                            } else if (textInputLayout5 != null) {
                                textInputLayout5.setError("Kpj tidak sesuai");
                            }
                        }
                    }
                } else {
                    int size7 = listTuitionPaymentFragmentspecialinlinedviewModeldefault5.size();
                    for (int i14 = 0; i14 < size7; i14++) {
                        TextInputLayout textInputLayout6 = (TextInputLayout) localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getChildAt(i14).findViewById(R.id.tilKpj);
                        if (localelistforlanguagetags.asInterface.contains(listTuitionPaymentFragmentspecialinlinedviewModeldefault5.get(i14).b)) {
                            if (textInputLayout6 != null) {
                                textInputLayout6.setError(null);
                            }
                        } else if (textInputLayout6 != null) {
                            textInputLayout6.setError("Kpj tidak sesuai");
                        }
                    }
                }
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Anda telah mencoba memasukkan nomor Kartu Peserta BPJS Ketenagakerjaan (KPJ) yang tidak benar sebanyak 3 (tiga)", false, 2, (Object) null)) {
                    getMaxImages getmaximages = getMaxImages.INSTANCE;
                    String strB = getMaxImages.b();
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = "";
                    if (strB.length() > 0) {
                        try {
                            AntreanMenuConfig antreanMenuConfig = (AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class);
                            if (antreanMenuConfig.getStatus()) {
                                try {
                                    objectRef.element = antreanMenuConfig.getLinkAntreanKlaim();
                                } catch (Exception unused) {
                                }
                                if (((CharSequence) objectRef.element).length() > 0) {
                                    OutputConfigurationCompatApi33Impl.Companion companion5 = OutputConfigurationCompatApi33Impl.INSTANCE;
                                    String string14 = localelistforlanguagetags.getString(R.string.label_title_confirm_asik_dialog);
                                    Intrinsics.checkNotNullExpressionValue(string14, "");
                                    String string15 = localelistforlanguagetags.getString(R.string.label_message_confirm_asik_dialog);
                                    Intrinsics.checkNotNullExpressionValue(string15, "");
                                    String string16 = localelistforlanguagetags.getString(R.string.action_booking_antrean_online);
                                    Intrinsics.checkNotNullExpressionValue(string16, "");
                                    OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.pay, string14, string15, string16, (128 & 16) != 0 ? null : new Function0() { // from class: cleanupAutoManagers
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return localeListForLanguageTags.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, objectRef);
                                        }
                                    }, (128 & 32) != 0 ? null : localelistforlanguagetags.getString(R.string.action_return), (128 & 64) != 0 ? null : new Function0() { // from class: setLocalNightMode
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return localeListForLanguageTags.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                                        }
                                    }, (128 & 128) != 0 ? false : false);
                                    FragmentManager childFragmentManager2 = localelistforlanguagetags.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                                    Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                                    if (childFragmentManager2.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                        outputConfigurationCompatApi33ImplB.show(childFragmentManager2, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    }
                                } else {
                                    function1 = new Function1() { // from class: AppCompatDelegateExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return localeListForLanguageTags.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (String) obj2);
                                        }
                                    };
                                    string = ((getStreamUseCaseSupportedCombinationList) localelistforlanguagetags.notify.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL_INFOPENGADUAN", "");
                                    if (string.length() > 0) {
                                        function1.invoke(string);
                                        function1.invoke(string);
                                    } else {
                                        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
                                        function1.invoke(getMaxImages.run());
                                        getMaxImages getmaximages3 = getMaxImages.INSTANCE;
                                        function1.invoke(getMaxImages.run());
                                    }
                                }
                            } else {
                                function1 = new Function1() { // from class: AppCompatDelegateExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return localeListForLanguageTags.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (String) obj2);
                                    }
                                };
                                string = ((getStreamUseCaseSupportedCombinationList) localelistforlanguagetags.notify.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL_INFOPENGADUAN", "");
                                if (string.length() > 0) {
                                    function1.invoke(string);
                                    function1.invoke(string);
                                } else {
                                    getMaxImages getmaximages4 = getMaxImages.INSTANCE;
                                    function1.invoke(getMaxImages.run());
                                    getMaxImages getmaximages5 = getMaxImages.INSTANCE;
                                    function1.invoke(getMaxImages.run());
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    } else {
                        function1 = new Function1() { // from class: AppCompatDelegateExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return localeListForLanguageTags.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (String) obj2);
                            }
                        };
                        string = ((getStreamUseCaseSupportedCombinationList) localelistforlanguagetags.notify.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL_INFOPENGADUAN", "");
                        if (string.length() > 0) {
                            function1.invoke(string);
                            function1.invoke(string);
                        } else {
                            getMaxImages getmaximages6 = getMaxImages.INSTANCE;
                            function1.invoke(getMaxImages.run());
                            getMaxImages getmaximages7 = getMaxImages.INSTANCE;
                            function1.invoke(getMaxImages.run());
                        }
                    }
                } else {
                    getStringOrNull.Companion companion6 = getStringOrNull.INSTANCE;
                    String string17 = localelistforlanguagetags.getString(R.string.action_information);
                    Intrinsics.checkNotNullExpressionValue(string17, "");
                    String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    String string18 = localelistforlanguagetags.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string18, "");
                    getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string17, strValueOf, string18, null, 112);
                    localelistforlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getstringornullB2;
                    if (getstringornullB2 != null) {
                        FragmentManager childFragmentManager3 = localelistforlanguagetags.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager3, "");
                        if (childFragmentManager3.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB2.show(childFragmentManager3, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }
                }
                str = "failure_asik_step_first_verify_membership_data_result";
            } else {
                localelistforlanguagetags.write();
                str = "";
            }
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_step_first", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final localeListForLanguageTags localelistforlanguagetags, final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
        String string = localelistforlanguagetags.getString(R.string.label_title_confirm_asik_dialog);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = localelistforlanguagetags.getString(R.string.label_message_confirm_asik_dialog);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = localelistforlanguagetags.getString(R.string.action_booking_antrean_online);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.pay, string, string2, string3, (128 & 16) != 0 ? null : new Function0() { // from class: AppCompatDelegateApi24Impl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return localeListForLanguageTags.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, str);
            }
        }, (128 & 32) != 0 ? null : localelistforlanguagetags.getString(R.string.action_return), (128 & 64) != 0 ? null : new Function0() { // from class: applyApplicationSpecificConfig
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return localeListForLanguageTags.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
            }
        }, (128 & 128) != 0 ? false : false);
        FragmentManager childFragmentManager = localelistforlanguagetags.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(localeListForLanguageTags localelistforlanguagetags, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 0;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_list_kpj_result", "loading_asik_list_kpj_smile_result"));
            Intrinsics.checkNotNullParameter("loading_asik_list_kpj_smile_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_asik_list_kpj_smile_result", mapMutableMapOf);
            localelistforlanguagetags.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            localelistforlanguagetags.write();
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_asik_list_kpj_result", "success_asik_list_kpj_smile_result"));
            Intrinsics.checkNotNullParameter("success_asik_list_kpj_smile_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_asik_list_kpj_smile_result", mapMutableMapOf2);
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            List<AsikListKpj> list = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            FragmentAsikActiveParticipantMembershipDataBinding fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub = localelistforlanguagetags.INotificationSideChannelStub();
            localelistforlanguagetags.d = list;
            startAsSupportActionMode startassupportactionmode = (startAsSupportActionMode) localelistforlanguagetags.getInterfaceDescriptor.getValue();
            startassupportactionmode.d.clear();
            startassupportactionmode.notifyDataSetChanged();
            ((startAsSupportActionMode) localelistforlanguagetags.getInterfaceDescriptor.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(list);
            if (list.size() > localelistforlanguagetags.INotificationSideChannelStub) {
                MaterialCardView materialCardView = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.cvReminderMultipleKpj;
                Intrinsics.checkNotNullExpressionValue(materialCardView, "");
                materialCardView.setVisibility(0);
                TextView textView = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tvReminderMultipleKpj;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
                TextView textView2 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tvReminderAddKpj;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
                RecyclerView recyclerView = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.rvMultipleKpj;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                recyclerView.setVisibility(0);
            } else {
                MaterialCardView materialCardView2 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.cvReminderMultipleKpj;
                Intrinsics.checkNotNullExpressionValue(materialCardView2, "");
                materialCardView2.setVisibility(8);
                TextView textView3 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.tvReminderMultipleKpj;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(8);
                RecyclerView recyclerView2 = fragmentAsikActiveParticipantMembershipDataBindingINotificationSideChannelStub.rvMultipleKpj;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                recyclerView2.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "");
                ((ConstraintLayout.LayoutParams) layoutParams).topToBottom = R.id.cvInformationKpj2;
            }
            localelistforlanguagetags.asBinder = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            List list2 = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int size = list2.size();
            if (!list2.isEmpty()) {
                int i2 = 1;
                for (Object obj : list2) {
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    AsikListKpj asikListKpj = (AsikListKpj) obj;
                    if (size > localelistforlanguagetags.INotificationSideChannelStub && i >= 0 && !Intrinsics.areEqual(String.valueOf(asikListKpj.b), localelistforlanguagetags.cancelAll) && Intrinsics.areEqual(asikListKpj.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "PU")) {
                        localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.addView(localelistforlanguagetags.getLayoutInflater().inflate(R.layout.item_asik_add_kpj, (ViewGroup) null));
                        localelistforlanguagetags.asInterface.add(String.valueOf(asikListKpj.b));
                        String strAsInterface = Camera2CameraControlExternalSyntheticLambda5.asInterface(String.valueOf(asikListKpj.b));
                        StringBuilder sb = new StringBuilder("Ketik ulang Nomor Kartu <b>(");
                        sb.append(strAsInterface);
                        sb.append(")</b> dengan benar dan sesuai tanpa sensor.");
                        String string = sb.toString();
                        ItemAsikAddKpjBinding itemAsikAddKpjBindingBind = ItemAsikAddKpjBinding.bind(localelistforlanguagetags.INotificationSideChannelStub().kpjContainer.getChildAt(i2));
                        Intrinsics.checkNotNullExpressionValue(itemAsikAddKpjBindingBind, "");
                        itemAsikAddKpjBindingBind.tvTitleInformationKpj.setText(Html.fromHtml(string));
                        i2++;
                    } else {
                        localelistforlanguagetags.a++;
                    }
                    i++;
                }
            }
            List list3 = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            List list4 = list3;
            if (!list4.isEmpty() && list4.size() == 1 && Intrinsics.areEqual(((AsikListKpj) CollectionsKt.first(list3)).TuitionPaymentFragmentspecialinlinedviewModeldefault2, "BPU")) {
                localelistforlanguagetags.INotificationSideChannelStub().tilKpj.setVisibility(8);
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            localelistforlanguagetags.write();
            TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_asik_list_kpj_result", "failure_asik_list_kpj_smile_result"));
            Intrinsics.checkNotNullParameter("failure_asik_list_kpj_smile_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_asik_list_kpj_smile_result", mapMutableMapOf3);
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String string2 = localelistforlanguagetags.getString(R.string.action_information);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string3 = localelistforlanguagetags.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string2, strValueOf, string3, null, 112);
            localelistforlanguagetags.TuitionPaymentFragmentbindingInflater1 = getstringornullB;
            if (getstringornullB != null) {
                FragmentManager childFragmentManager = localelistforlanguagetags.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    return;
                }
                return;
            }
            return;
        }
        localelistforlanguagetags.write();
    }

    public static /* synthetic */ Unit b(localeListForLanguageTags localelistforlanguagetags, String str) {
        WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
        Context contextRequireContext = localelistforlanguagetags.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, str, "Appointment Online", 0, null, false, 56);
        return Unit.INSTANCE;
    }
}
