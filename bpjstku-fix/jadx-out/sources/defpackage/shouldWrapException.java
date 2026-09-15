package defpackage;

import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.asik.model.request.AccountBankRequest;
import com.bpjstku.data.asik.model.request.AsikVerificationStepRequest;
import com.bpjstku.data.asik.model.request.OtpByPhoneRequest;
import com.bpjstku.data.asik.model.response.AccountBankItem;
import com.bpjstku.databinding.FragmentAsikActiveParticipantOthersMembershipDataBinding;
import com.bpjstku.domain.asik.model.SubmissionCheckItem;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.AsikAccountVerificationActivity;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantOthersMembershipDataFragment$bindingInflater$1;
import com.bpjstku.presentation.asik.active.model.AsikActiveParticipant;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getFocusY;
import defpackage.mapPoint;
import defpackage.select;
import defpackage.setTabListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J)\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0010\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0015\u0010\"\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0017\u0010\u001b\u001a\u0004\u0018\u00010#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0017\u0010\u0017\u001a\u0004\u0018\u00010$8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0018\u0010&\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b*\u0010+R\u0015\u0010%\u001a\u00020,8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0017\u0010!\u001a\u0004\u0018\u00010-8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR.\u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020/\u0012\u0006\u0012\u0004\u0018\u000100\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00020.8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u00102R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020)038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u00104R\u0014\u0010\u0006\u001a\u00020\u00078UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u00105"}, d2 = {"LshouldWrapException;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentAsikActiveParticipantOthersMembershipDataBinding;", "<init>", "()V", "", "cancelAll", "", "p0", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "onTransact", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "INotificationSideChannel", "cancel", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "LgetStringOrNull;", "d", "LgetStringOrNull;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/Calendar;", "b", "Ljava/util/Calendar;", "TuitionPaymentFragmentbindingInflater1", "Lselect;", "Lkotlin/Lazy;", "LsetTabListener;", "notify", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/asik/model/SubmissionCheckItem;", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "a", "asInterface", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "asBinder", "Ljava/lang/String;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/domain/user/model/User;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "", "Ljava/util/List;", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class shouldWrapException extends AutoValue_ImmutableImageInfo<FragmentAsikActiveParticipantOthersMembershipDataBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private CodeNamePair g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private getStringOrNull asInterface;
    private String asBinder;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final List<String> cancel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Calendar TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy notify;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getAsBinder() {
        return R.layout.fragment_asik_active_participant_others_membership_data;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public shouldWrapException() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.TuitionPaymentFragmentbindingInflater1 = calendar;
        final shouldWrapException shouldwrapexception = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantOthersMembershipDataFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, select] */
            @Override // kotlin.jvm.functions.Function0
            public final select invoke() {
                ComponentCallbacks componentCallbacks = shouldwrapexception;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(select.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final shouldWrapException shouldwrapexception2 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantOthersMembershipDataFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = shouldwrapexception2.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<setTabListener>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantOthersMembershipDataFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, setTabListener] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setTabListener invoke() {
                return getFocusY.b(shouldwrapexception2, Reflection.getOrCreateKotlinClass(setTabListener.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0() { // from class: uncaughtException
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((select) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d.TuitionPaymentFragmentbindingInflater1();
            }
        });
        this.d = LazyKt.lazy(new Function0() { // from class: AppCompatDelegateImpl4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((setTabListener) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            }
        });
        this.a = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantOthersMembershipDataFragment$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = shouldwrapexception;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.notify = LazyKt.lazy(new Function0() { // from class: onFitSystemWindows
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            }
        });
        this.cancel = CollectionsKt.listOf((Object[]) new String[]{"0000000000000000", "1111111111111111", "2222222222222222", "3333333333333333", "4444444444444444", "5555555555555555", "6666666666666666", "7777777777777777", "8888888888888888", "9999999999999999", "000000000000000", "111111111111111", "222222222222222", "333333333333333", "444444444444444", "555555555555555", "666666666666666", "777777777777777", "888888888888888", "999999999999999"});
    }

    /* JADX INFO: renamed from: shouldWrapException$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LshouldWrapException$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "LshouldWrapException;", "TuitionPaymentFragmentbindingInflater1", "()LshouldWrapException;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static shouldWrapException TuitionPaymentFragmentbindingInflater1() {
            return new shouldWrapException();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantOthersMembershipDataBinding> d() {
        return AsikActiveParticipantOthersMembershipDataFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int p0, int p1, Intent p2) {
        super.onActivityResult(p0, p1, p2);
        if (p0 == 200 && p1 == -1) {
            Intrinsics.checkNotNull(p2);
            this.asBinder = String.valueOf(p2.getStringExtra("KEY_PHONE_NUMBER"));
            EditText editText = INotificationSideChannelStub().tilPhoneNumber.getEditText();
            if (editText != null) {
                String str = this.asBinder;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str = null;
                }
                editText.setText(str);
            }
        }
    }

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static final byte[] $$c = {117, 57, 101, -72};
        private static final int $$f = 210;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {117, -15, -81, 1, 20, -37, 56, -7, 32, -8, 23, -21, 35, 7, 5, 11, -26, 55, 5, 14, -2, 29, -1, 16, 9, -31, 51, -3, 11, 20, 3, 9, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -57};
        private static final int $$e = 30;
        private static final byte[] $$a = {81, 125, 2, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
        private static final int $$b = 79;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int d = 1;
        private static long b = -6377398940819159759L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
        private static char TuitionPaymentFragmentbindingInflater1 = 46141;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 52
                int r0 = 53 - r5
                int r6 = r6 * 52
                int r6 = 56 - r6
                int r7 = r7 * 14
                int r7 = r7 + 84
                byte[] r1 = shouldWrapException.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$a
                byte[] r0 = new byte[r0]
                int r5 = 52 - r5
                r2 = 0
                if (r1 != 0) goto L18
                r4 = r5
                r3 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r5) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r1[r6]
            L2a:
                int r7 = r7 + r4
                int r6 = r6 + 1
                int r7 = r7 + (-11)
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: shouldWrapException.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a(short, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = shouldWrapException.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$d
                int r6 = r6 * 24
                int r1 = r6 + 29
                int r7 = r7 * 21
                int r7 = r7 + 84
                int r8 = r8 * 28
                int r8 = 32 - r8
                byte[] r1 = new byte[r1]
                int r6 = r6 + 28
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r8
                r4 = r2
                goto L2e
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                r3 = r0[r8]
                r5 = r8
                r8 = r7
                r7 = r3
                r3 = r5
            L2e:
                int r8 = r8 + r7
                int r7 = r3 + 1
                int r8 = r8 + (-10)
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: shouldWrapException.TuitionPaymentFragmentspecialinlinedviewModeldefault3.e(byte, byte, short, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
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
                int i4 = $10 + 103;
                $11 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8327);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1235;
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 35;
                        byte b2 = (byte) ($$f & 15);
                        byte b3 = (byte) (b2 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, scrollDefaultDelay, iNormalizeMetaState, -653973969, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 2764 - (ViewConfiguration.getEdgeSlop() >> 16), '>' - AndroidCharacter.getMirror('0'), 1504416861, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 253, 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65199 - Process.getGidForName("")), 2892 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Process.getGidForName("") + 18, 2012627446, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    int i6 = $11 + 75;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0268  */
        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Function1 function1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char longPressTimeout = (char) (37567 - (ViewConfiguration.getLongPressTimeout() >> 16));
                int iCombineMeasuredStates = 625 - View.combineMeasuredStates(0, 0);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 14;
                byte b2 = (byte) (-$$a[5]);
                byte b3 = b2;
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iCombineMeasuredStates, tapTimeout, -477065106, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{18034, 45497, 10518, 7992}, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{20874, 847, '\n', 10883, 53670, 37510, 7923, 4934, 60439, 35530, 39511, 29940, 29938, 63025, 21600, 21144, 43117, 42801, 41267, 44011, 10500, 54616}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{43132, 3845, 44868, 2933}, (char) (30128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1141835177, new char[]{36953, 44893, 48027, 60900, 4073, 16548, 38425, 6669, 56718, 4008, 26971, 13752, 17176, 55210, 1372}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (37568 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int iKeyCodeFromString = 625 - KeyEvent.keyCodeFromString("");
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 14;
                byte[] bArr = $$a;
                byte b4 = bArr[7];
                Object[] objArr5 = new Object[1];
                a(b4, (byte) (-bArr[5]), b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iKeyCodeFromString, iResolveOpacity, -976899241, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37566);
                    int capsMode = 625 - TextUtils.getCapsMode("", 0, 0);
                    int iArgb = Color.argb(0, 0, 0, 0) + 14;
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr6 = new Object[1];
                    a(b5, b6, b6, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, capsMode, iArgb, -973632554, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i2 = ((int[]) objArr7[2])[0];
                int i3 = ((int[]) objArr7[0])[0];
                String[] strArr = (String[]) objArr7[3];
                int[] iArr = {i3};
                int i4 = (int) Runtime.getRuntime().totalMemory();
                int i5 = (((378411976 + (((~((-1631352812) | i4)) | 20189449) * 336)) + (((~(i4 | 192385309)) | (-1803548672)) * (-168))) + (((~((~i4) | 192385309)) | (-1631352812)) * 168)) - 1010744660;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                objArr = new Object[]{iArr, new int[1], new int[]{i2}, strArr};
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{7048, 58972, 21308, 63962}, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 55891), (-1) - TextUtils.indexOf((CharSequence) "", '0'), new char[]{13679, 49319, 31222, 40419, 55460, 50689, 43358, 16699, 45386, 14164, 32747, 13689, 13943, 48343, 39425, 61670, 43910, 27377, 27326, 27830, 39476, 49121, 48399, 14631, 11921, 40136}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{29077, 30987, 23113, 18673}, (char) (TextUtils.getTrimmedLength("") + 61786), Color.red(0), new char[]{42639, 3531, 31329, 61438, 16885, 29735, 10522, 28172, 47948, 45116, 1553, 25260, 250, 15860, 48225, 13360, 2911, 24882}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i8 = d + 107;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                        int i9 = i8 % 2;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{56828, 43272, 3848, 30917}, (char) ((-16726769) - Color.rgb(0, 0, 0)), Color.alpha(0), new char[]{40344, 48243, 5407, 53321, 36666, 64942, 36031, 24832, 59138, 39813, 60003, 22584, 39370, 14271, 18899, 32562}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{29877, 18351, 39389, 8466}, (char) (Color.green(0) + 4761), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{3855, 34165, 50113, 9052, 51305, 539, 58258, 57694, 9584, 33437, 26691, 45150, 44461, 63881, 27757, 59346}, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr12 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{15625, 44058, 34856, 7016}, (char) View.MeasureSpec.getMode(0), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{33672, 63468, 64459, 63226, 20593, 39809, 31273, 44822, 59256, 5010, 36575, 1215, 47765, 59441, 35180, 32601, 9520, 179, 30169, 51921, 41755, 2356, 23875, 53722, 6099, 32407, 39020, 34837, 14690, 21561, 27486, 1878, 29702, 47119, 8027, 31362, 48036, 39110, 4497, 64277, 63176, 17530, 8121, 18278, 2531, 54470, 26790, 39319, 24802, 30766, 58833, 55017, 533, 20339, 20854, 13410, 47607, 19130, 29696, 36637, 12054, 53390, 56179, 3898}, objArr12);
                String str = (String) objArr12[0];
                Object[] objArr13 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{41273, 11180, 22604, 10620}, (char) View.resolveSize(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{25140, 37767, 3282, 18078, 39562, 2851, 7782, 56261, 52942, 3279, 40331, 6417, 14519, 43808, 64346, 23795, 30323, 56642, 41761, 10943, 52559, 21112, 5537, 18133, 27996, 53754, 45486, 3988, 63246, 31227, 58674, 23699, 14932, 53760, 16704, 34731, 3573, 63323, 4618, 51017, 14696, 62592, 2986, 17456, 34668, 38597, 61559, 27232, 4055, 51737, 6619, 1674, 49010, 1120, 1838, 43223, 64042, 25588, 59083, 32199, 25172, 4686, 62683, 58704}, objArr13);
                try {
                    Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -1010744660};
                    byte[] bArr2 = $$d;
                    byte b7 = bArr2[3];
                    byte b8 = (byte) (b7 - 1);
                    byte b9 = b7;
                    Object[] objArr15 = new Object[1];
                    e(b8, b9, b9, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    byte b10 = bArr2[3];
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr16 = new Object[1];
                    e(b10, b11, b11, objArr16);
                    objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                    int i10 = ((int[]) objArr[0])[0];
                    int i11 = ((int[]) objArr[2])[0];
                    if (applicationContext != null) {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
                        d = i12 % 128;
                        int i13 = i12 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char defaultSize = (char) (View.getDefaultSize(0, 0) + 37567);
                            int iCombineMeasuredStates2 = 625 - View.combineMeasuredStates(0, 0);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 14;
                            byte b12 = $$a[7];
                            byte b13 = b12;
                            Object[] objArr17 = new Object[1];
                            a(b12, b13, b13, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, iCombineMeasuredStates2, maxKeyCode, -973632554, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr18 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{18034, 45497, 10518, 7992}, (char) View.resolveSizeAndState(0, 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{20874, 847, '\n', 10883, 53670, 37510, 7923, 4934, 60439, 35530, 39511, 29940, 29938, 63025, 21600, 21144, 43117, 42801, 41267, 44011, 10500, 54616}, objArr18);
                            Class<?> cls5 = Class.forName((String) objArr18[0]);
                            Object[] objArr19 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{43132, 3845, 44868, 2933}, (char) (ImageFormat.getBitsPerPixel(0) + 30128), TextUtils.getTrimmedLength("") + 1141835176, new char[]{36953, 44893, 48027, 60900, 4073, 16548, 38425, 6669, 56718, 4008, 26971, 13752, 17176, 55210, 1372}, objArr19);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c3 = (char) (37566 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                int jumpTapTimeout = 625 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                int iMyPid = (Process.myPid() >> 22) + 14;
                                byte[] bArr3 = $$a;
                                byte b14 = bArr3[7];
                                Object[] objArr20 = new Object[1];
                                a(b14, (byte) (-bArr3[5]), b14, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, jumpTapTimeout, iMyPid, -976899241, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 37568);
                                int tapTimeout2 = 625 - (ViewConfiguration.getTapTimeout() >> 16);
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
                                byte b15 = (byte) (-$$a[5]);
                                byte b16 = b15;
                                Object[] objArr21 = new Object[1];
                                a(b15, b16, b16, objArr21);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, tapTimeout2, edgeSlop, -477065106, false, (String) objArr21[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i14 = ((int[]) objArr[0])[0];
            int i15 = ((int[]) objArr[2])[0];
            if (i15 == i14) {
                int i16 = d + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                int i17 = i16 % 2;
                int i18 = ((int[]) objArr[1])[0];
                int i19 = ((int[]) objArr[2])[0];
                int i20 = ((int[]) objArr[0])[0];
                String[] strArr2 = (String[]) objArr[3];
                int iIdentityHashCode = System.identityHashCode(this);
                int i21 = i18 + (-642587076) + (((~((~iIdentityHashCode) | (-65591))) | (~(1065346303 | iIdentityHashCode))) * (-302)) + ((~((-65591) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | 1065280713)) | 306888896) * 302);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr[1])[0] = i23 ^ (i23 << 5);
                Object[] objArr22 = {new int[]{i20}, new int[1], new int[]{i19}, strArr2};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[3];
                if (strArr3 != null) {
                    int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                    d = i24 % 128;
                    int i25 = 2;
                    int i26 = i24 % 2;
                    int i27 = 0;
                    while (i27 < strArr3.length) {
                        int i28 = d + 119;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                        int i29 = i28 % i25;
                        arrayList.add(strArr3[i27]);
                        i27++;
                        i25 = 2;
                    }
                }
                Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
                int i30 = ((int[]) objArr[1])[0];
                int i31 = ((int[]) objArr[2])[0];
                int i32 = ((int[]) objArr[0])[0];
                String[] strArr4 = (String[]) objArr[3];
                int[] iArr2 = {i31};
                int[] iArr3 = {i32};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i33 = ~((-1136808816) | iIdentityHashCode2);
                int i34 = ~iIdentityHashCode2;
                int i35 = i33 | (~(686929305 | i34));
                int i36 = ~(1136808815 | i34);
                int i37 = i30 + 2033331296 + ((i35 | i36) * (-516)) + (((~(iIdentityHashCode2 | (-12587274))) | (~((-674342033) | i34))) * 516) + ((674342032 | i36) * 516);
                int i38 = (i37 << 13) ^ i37;
                int i39 = i38 ^ (i38 >>> 17);
                ((int[]) objArr[1])[0] = i39 ^ (i39 << 5);
                Object[] objArr23 = {iArr3, new int[1], iArr2, strArr4};
            }
            return function1;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = d;
            int i3 = i2 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                boolean z = obj instanceof Observer;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                int i4 = i2 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = i2 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i7 == 0) {
                return Intrinsics.areEqual(functionDelegate, ((FunctionAdapter) obj).getFunctionDelegate());
            }
            Intrinsics.areEqual(functionDelegate, ((FunctionAdapter) obj).getFunctionDelegate());
            obj2.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = d + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            if (i3 != 0) {
                int i4 = 86 / 0;
            }
            return iHashCode;
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = d + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
            d = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, int r7, short r8) {
            /*
                int r6 = 104 - r6
                byte[] r0 = shouldWrapException.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$c
                int r7 = r7 * 4
                int r1 = r7 + 1
                int r8 = r8 + 4
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r8
                r4 = r2
                goto L28
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r8 = r8 + 1
                int r4 = r3 + 1
                if (r3 != r7) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L22:
                r3 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r5
            L28:
                int r6 = r6 + r8
                r8 = r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: shouldWrapException.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$g(int, int, short):java.lang.String");
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        FragmentAsikActiveParticipantOthersMembershipDataBinding fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilEmail.getEditText();
        if (editText != null) {
            User user = (User) this.notify.getValue();
            editText.setText(String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null));
        }
        EditText editText2 = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilPhoneNumber.getEditText();
        if (editText2 != null) {
            try {
                User user2 = (User) this.notify.getValue();
                strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(user2 != null ? user2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null));
            } catch (Exception unused) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = "-";
            }
            editText2.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        EditText editText3 = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilNpwp.getEditText();
        if (editText3 != null) {
            editText3.setText("");
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentAsikActiveParticipantOthersMembershipDataBinding fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        Button button = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AppCompatDelegateImpl2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return shouldWrapException.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilPhoneNumber.setEndIconOnClickListener(new View.OnClickListener() { // from class: AppCompatDelegateImpl61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                shouldWrapException.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.edtPassportExpired.setOnClickListener(new View.OnClickListener() { // from class: onAnimationEnd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                shouldWrapException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, view);
            }
        });
        TextInputEditText textInputEditText = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.edtPassportNumber;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        textInputEditText.addTextChangedListener(new suspendUseCases.b(new Function1() { // from class: onAnimationStart
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return shouldWrapException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub, (String) obj);
            }
        }));
        fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.edtBankName.setOnClickListener(new View.OnClickListener() { // from class: AppCompatDelegateImplActionBarMenuCallback
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                shouldWrapException.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub, view);
            }
        });
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_submit_asik_step_third_fill_npwp_banking_account", "submit_asik_step_third_fill_npwp_banking_account"));
        Intrinsics.checkNotNullParameter("submit_asik_step_third_fill_npwp_banking_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("submit_asik_step_third_fill_npwp_banking_account", mapMutableMapOf);
        AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) this.d.getValue();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = asikActiveParticipant != null ? asikActiveParticipant.TuitionPaymentFragmentspecialinlinedviewModeldefault1() : null;
        SubmissionCheckItem submissionCheckItem = (SubmissionCheckItem) this.b.getValue();
        ((select) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new AsikVerificationStepRequest(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, submissionCheckItem != null ? submissionCheckItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null));
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilNpwp;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_npwp_max_length);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: onAttachedFromWindow
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(shouldWrapException.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            }
        }, string))));
        TextInputLayout textInputLayout2 = INotificationSideChannelStub().tilPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
        TextInputLayout textInputLayout3 = INotificationSideChannelStub().tilEmail;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout4 = INotificationSideChannelStub().tilBankAccountNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout5 = INotificationSideChannelStub().tilBankAccountName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout5, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        TextInputLayout textInputLayout6 = INotificationSideChannelStub().tilBankName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
        String string6 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout6, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string6))));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        Button button = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        Button button = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setEnabled(true);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(shouldWrapException shouldwrapexception, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String strSubstring = str.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        if (strSubstring.equals("08")) {
            str = str.substring(1, str.length());
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        String strConcat = "62".concat(String.valueOf(str));
        shouldwrapexception.asBinder = strConcat;
        if (strConcat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            strConcat = null;
        }
        select selectVar = (select) shouldwrapexception.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        Context contextRequireContext = shouldwrapexception.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string, "");
        selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new OtpByPhoneRequest(strConcat, string));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final shouldWrapException shouldwrapexception, final FragmentAsikActiveParticipantOthersMembershipDataBinding fragmentAsikActiveParticipantOthersMembershipDataBinding, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getExposureControl.Companion companion = getExposureControl.INSTANCE;
            getExposureControl getexposurecontrolTuitionPaymentFragmentbindingInflater1 = getExposureControl.Companion.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: AppCompatDelegateImpl3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return shouldWrapException.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, fragmentAsikActiveParticipantOthersMembershipDataBinding, (CodeNamePair) obj);
                }
            });
            FragmentManager childFragmentManager = shouldwrapexception.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getexposurecontrolTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getexposurecontrolTuitionPaymentFragmentbindingInflater1.show(childFragmentManager, getexposurecontrolTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldWrapException shouldwrapexception) {
        getStringOrNull getstringornull = shouldwrapexception.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(shouldWrapException shouldwrapexception, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        AsikActiveParticipant asikActiveParticipantB;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            shouldwrapexception.IconCompatParcelizer();
            str = "loading_asik_step_third_fill_npwp_bank_account_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            shouldwrapexception.write();
            FragmentAsikActiveParticipantOthersMembershipDataBinding fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub = shouldwrapexception.INotificationSideChannelStub();
            AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) shouldwrapexception.d.getValue();
            if (asikActiveParticipant != null) {
                EditText editText = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilPhoneNumber.getEditText();
                String string = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
                EditText editText2 = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilEmail.getEditText();
                String strValueOf = String.valueOf(editText2 != null ? editText2.getText() : null);
                EditText editText3 = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilNpwp.getEditText();
                String strValueOf2 = String.valueOf(editText3 != null ? editText3.getText() : null);
                EditText editText4 = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilPassportNumber.getEditText();
                String strValueOf3 = String.valueOf(editText4 != null ? editText4.getText() : null);
                EditText editText5 = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilPassportExpired.getEditText();
                String strValueOf4 = String.valueOf(editText5 != null ? editText5.getText() : null);
                CodeNamePair codeNamePair = shouldwrapexception.g;
                String str2 = codeNamePair != null ? codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                String str3 = str2 == null ? "" : str2;
                EditText editText6 = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilBankAccountNumber.getEditText();
                String strValueOf5 = String.valueOf(editText6 != null ? editText6.getText() : null);
                EditText editText7 = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilBankAccountName.getEditText();
                String strValueOf6 = String.valueOf(editText7 != null ? editText7.getText() : null);
                CodeNamePair codeNamePair2 = shouldwrapexception.g;
                String str4 = codeNamePair2 != null ? codeNamePair2.b : null;
                asikActiveParticipantB = AsikActiveParticipant.b(asikActiveParticipant, null, null, null, null, null, null, null, strValueOf2, null, null, null, null, null, null, null, string, strValueOf, null, null, null, null, null, null, null, null, null, strValueOf3, strValueOf4, strValueOf5, strValueOf6, str4 == null ? "" : str4, str3, null, null, null, null, null, 67010431, 31);
            } else {
                asikActiveParticipantB = null;
            }
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
            lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol = new lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl(asikActiveParticipantB, null, 2, null);
            Intrinsics.checkNotNullParameter(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol, "");
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol);
            str = "success_asik_step_third_fill_npwp_bank_account_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            shouldwrapexception.write();
            getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
            String string2 = shouldwrapexception.getString(R.string.action_information);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String strValueOf7 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string3 = shouldwrapexception.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string2, strValueOf7, string3, null, 112);
            shouldwrapexception.asInterface = getstringornullB;
            if (getstringornullB != null) {
                FragmentManager childFragmentManager = shouldwrapexception.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            str = "failure_asik_step_third_fill_npwp_bank_account_result";
        } else {
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_step_third", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final shouldWrapException shouldwrapexception, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            setDefaultLocales.Companion companion = setDefaultLocales.INSTANCE;
            setDefaultLocales setdefaultlocalesTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setDefaultLocales.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: AppCompatDelegateImplActionModeCallbackWrapperV9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return shouldWrapException.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (String) obj);
                }
            });
            FragmentManager childFragmentManager = shouldwrapexception.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(setdefaultlocalesTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                setdefaultlocalesTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(childFragmentManager, setdefaultlocalesTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit b(shouldWrapException shouldwrapexception, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_otp_asik_result", "loading_otp_asik_result"));
            Intrinsics.checkNotNullParameter("loading_otp_asik_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_otp_asik_result", mapMutableMapOf);
            shouldwrapexception.IconCompatParcelizer();
        } else {
            String str = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_otp_asik_result", "success_otp_asik_result"));
                Intrinsics.checkNotNullParameter("success_otp_asik_result", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_otp_asik_result", mapMutableMapOf2);
                shouldwrapexception.write();
                Intent intent = new Intent(shouldwrapexception.requireContext(), (Class<?>) AsikAccountVerificationActivity.class);
                String str2 = shouldwrapexception.asBinder;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str = str2;
                }
                intent.putExtra("KEY_PHONE_NUMBER", str);
                shouldwrapexception.startActivityForResult(intent, 200);
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
                Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_otp_asik_result", "failure_otp_asik_result"));
                Intrinsics.checkNotNullParameter("failure_otp_asik_result", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_otp_asik_result", mapMutableMapOf3);
                shouldwrapexception.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
                shouldWrapException shouldwrapexception2 = shouldwrapexception;
                String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(shouldwrapexception2, "");
                Intrinsics.checkNotNullParameter(strValueOf, "");
                BaseActivity baseActivity = (BaseActivity) shouldwrapexception2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(shouldWrapException shouldwrapexception) {
        getStringOrNull getstringornull = shouldwrapexception.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(shouldWrapException shouldwrapexception, int i, int i2, int i3) {
        shouldwrapexception.TuitionPaymentFragmentbindingInflater1.set(1, i);
        shouldwrapexception.TuitionPaymentFragmentbindingInflater1.set(2, i2);
        shouldwrapexception.TuitionPaymentFragmentbindingInflater1.set(5, i3);
        shouldwrapexception.INotificationSideChannelStub().edtPassportExpired.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(shouldwrapexception.TuitionPaymentFragmentbindingInflater1.getTime()));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(shouldWrapException shouldwrapexception, FragmentAsikActiveParticipantOthersMembershipDataBinding fragmentAsikActiveParticipantOthersMembershipDataBinding, CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        shouldwrapexception.g = codeNamePair;
        EditText editText = fragmentAsikActiveParticipantOthersMembershipDataBinding.tilBankName.getEditText();
        if (editText != null) {
            editText.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final shouldWrapException shouldwrapexception, FragmentAsikActiveParticipantOthersMembershipDataBinding fragmentAsikActiveParticipantOthersMembershipDataBinding, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (String.valueOf(shouldwrapexception.INotificationSideChannelStub().edtPassportNumber.getText()).length() <= 0 || String.valueOf(shouldwrapexception.INotificationSideChannelStub().edtPassportExpired.getText()).length() > 0) {
            EditText editText = fragmentAsikActiveParticipantOthersMembershipDataBinding.tilNpwp.getEditText();
            if (String.valueOf(editText != null ? editText.getText() : null).length() == 0) {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = shouldwrapexception.getString(R.string.title_npwp_null);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = shouldwrapexception.getString(R.string.notif_npwp);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = shouldwrapexception.getString(R.string.action_ok_continue);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_info_blue, string, string2, string3, new Function0() { // from class: AppCompatDelegateImpl5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return shouldWrapException.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                }, shouldwrapexception.getString(R.string.action_return), new Function0() { // from class: onApplyWindowInsets
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                });
                shouldwrapexception.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                FragmentManager childFragmentManager = shouldwrapexception.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else {
                EditText editText2 = fragmentAsikActiveParticipantOthersMembershipDataBinding.tilNpwp.getEditText();
                int length = String.valueOf(editText2 != null ? editText2.getText() : null).length();
                if (15 > length || length >= 17) {
                    getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                    String string4 = shouldwrapexception.getString(R.string.action_back);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "Anda mengisi NPWP belum sesuai", "Pastikan Anda mengisi NPWP dengan benar", string4, new Function0() { // from class: onDetachedFromWindow
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return shouldWrapException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
                        }
                    }, 96);
                    shouldwrapexception.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getstringornullB;
                    if (getstringornullB != null) {
                        FragmentManager childFragmentManager2 = shouldwrapexception.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                        if (childFragmentManager2.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB.show(childFragmentManager2, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }
                } else {
                    EditText editText3 = fragmentAsikActiveParticipantOthersMembershipDataBinding.tilNpwp.getEditText();
                    if (Camera2CameraControlExternalSyntheticLambda5.b(String.valueOf(editText3 != null ? editText3.getText() : null), shouldwrapexception.cancel)) {
                        getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
                        String string5 = shouldwrapexception.getString(R.string.action_back);
                        Intrinsics.checkNotNullExpressionValue(string5, "");
                        getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "Anda mengisi NPWP belum sesuai", "Pastikan Anda mengisi NPWP dengan benar", string5, new Function0() { // from class: AppCompatDelegateImpl6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return shouldWrapException.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            }
                        }, 96);
                        shouldwrapexception.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getstringornullB2;
                        if (getstringornullB2 != null) {
                            FragmentManager childFragmentManager3 = shouldwrapexception.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                            Intrinsics.checkNotNullParameter(childFragmentManager3, "");
                            if (childFragmentManager3.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                getstringornullB2.show(childFragmentManager3, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        }
                    } else {
                        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_step_third_asik", "next_step_third_asik"));
                        Intrinsics.checkNotNullParameter("next_step_third_asik", "");
                        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("next_step_third_asik", mapMutableMapOf);
                        shouldwrapexception.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                }
            }
        } else {
            getStringOrNull.Companion companion4 = getStringOrNull.INSTANCE;
            String string6 = shouldwrapexception.getString(R.string.action_information);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            String string7 = shouldwrapexception.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string7, "");
            getStringOrNull getstringornullB3 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string6, "Harap Mengisi Tanggal Masa Berlaku Paspor", string7, null, 112);
            shouldwrapexception.asInterface = getstringornullB3;
            if (getstringornullB3 != null) {
                FragmentManager childFragmentManager4 = shouldwrapexception.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "");
                Intrinsics.checkNotNullParameter(childFragmentManager4, "");
                if (childFragmentManager4.findFragmentByTag(getstringornullB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB3.show(childFragmentManager4, getstringornullB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final shouldWrapException shouldwrapexception, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: updateStatusGuard
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    shouldWrapException.TuitionPaymentFragmentbindingInflater1(this.b, i, i2, i3);
                }
            }, shouldwrapexception.TuitionPaymentFragmentbindingInflater1.get(1), shouldwrapexception.TuitionPaymentFragmentbindingInflater1.get(2), shouldwrapexception.TuitionPaymentFragmentbindingInflater1.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        shouldWrapException shouldwrapexception = this;
        ((select) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancel.observe(shouldwrapexception, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: AppCompatDelegateImpl7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return shouldWrapException.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((select) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancelAll.observe(shouldwrapexception, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: AppCompatDelegateImplActionBarDrawableToggleImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return shouldWrapException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((select) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getInterfaceDescriptor.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: onCreatePanelView
            private static final byte[] $$c = {25, -93, -120, -48};
            private static final int $$f = 129;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {92, 126, -38, -95, 1, -22, 1, -12, -7, -28, -16, 1, 1, 7, -29, -22, -14, 6, -24, -11, 5, -9, 25, -55, 0, 7, -43, -5, -13, 3, -9, 14, -45, 2, -8, -21, -3, -24, 56};
            private static final int $$e = 77;
            private static final byte[] $$a = {117, -15, -81, 1, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
            private static final int $$b = 58;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int g = 1;
            private static long b = -6377398940819159759L;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 19468;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 52
                    int r8 = 55 - r8
                    byte[] r0 = defpackage.onCreatePanelView.$$a
                    int r6 = r6 * 52
                    int r1 = 53 - r6
                    int r7 = r7 + 84
                    byte[] r1 = new byte[r1]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L2e
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r8 = r8 + 1
                    if (r3 != r6) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2e:
                    int r8 = -r8
                    int r7 = r7 + r8
                    int r7 = r7 + (-11)
                    r8 = r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.onCreatePanelView.a(int, int, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r7, int r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 * 35
                    int r7 = 36 - r7
                    int r8 = r8 * 10
                    int r8 = r8 + 98
                    int r9 = r9 * 35
                    int r9 = 39 - r9
                    byte[] r0 = defpackage.onCreatePanelView.$$d
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r8 = r7
                    r3 = r9
                    r4 = r2
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r7) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    r3 = r0[r9]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L2c:
                    int r9 = -r9
                    int r8 = r8 + r9
                    int r8 = r8 + (-10)
                    int r9 = r3 + 1
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.onCreatePanelView.d(byte, int, byte, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2;
                int i4 = 2 % 2;
                SessionProcessor sessionProcessor = new SessionProcessor();
                int length = cArr2.length;
                char[] cArr4 = new char[length];
                int length2 = cArr.length;
                char[] cArr5 = new char[length2];
                int i5 = 0;
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr3.length;
                char[] cArr6 = new char[length3];
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                int i6 = $11 + 23;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 / 2;
                }
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    int i8 = $11 + 59;
                    $10 = i8 % 128;
                    int i9 = i8 % i3;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char mirror = (char) (8376 - AndroidCharacter.getMirror('0'));
                            int edgeSlop = 1235 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int scrollBarSize = 35 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte b2 = (byte) i3;
                            byte b3 = (byte) (b2 - 2);
                            String str$$g = $$g(b2, b3, b3);
                            Class[] clsArr = new Class[1];
                            clsArr[i5] = Object.class;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, edgeSlop, scrollBarSize, -653973969, false, str$$g, clsArr);
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cBlue = (char) Color.blue(i5);
                            int deadChar = KeyEvent.getDeadChar(i5, i5) + 2764;
                            int iMyTid = (Process.myTid() >> 22) + 14;
                            byte b4 = (byte) i5;
                            byte b5 = b4;
                            String str$$g2 = $$g(b4, b5, b5);
                            Class[] clsArr2 = new Class[1];
                            clsArr2[i5] = Object.class;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, deadChar, iMyTid, 1504416861, false, str$$g2, clsArr2);
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        int i10 = cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718;
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i10);
                        objArr4[i5] = sessionProcessor;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cResolveSizeAndState = (char) (View.resolveSizeAndState(i5, i5, i5) + 43325);
                            int iRgb = Color.rgb(i5, i5, i5) + 16777469;
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22;
                            Class[] clsArr3 = new Class[3];
                            clsArr3[i5] = Object.class;
                            clsArr3[1] = Integer.TYPE;
                            clsArr3[2] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, iRgb, scrollBarFadeDuration, -721491957, false, "j", clsArr3);
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i11 = cArr4[iIntValue2] * 32718;
                        Object[] objArr5 = new Object[2];
                        objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                        objArr5[i5] = Integer.valueOf(i11);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 65199);
                            int i12 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2890;
                            int trimmedLength = 17 - TextUtils.getTrimmedLength("");
                            byte b6 = (byte) ($$f & 7);
                            byte b7 = (byte) (b6 - 1);
                            String str$$g3 = $$g(b6, b7, b7);
                            i2 = 2;
                            Class[] clsArr4 = new Class[2];
                            clsArr4[i5] = Integer.TYPE;
                            clsArr4[1] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i12, trimmedLength, 2012627446, false, str$$g3, clsArr4);
                        } else {
                            i2 = 2;
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))) ^ (((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (b ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                        i3 = i2;
                        i5 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x024e  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int defaultSize = View.getDefaultSize(0, 0) + 876;
                    int iGreen = 10 - Color.green(0);
                    byte b2 = $$a[3];
                    Object[] objArr2 = new Object[1];
                    a(b2, (byte) ($$b >>> 2), b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, defaultSize, iGreen, 252381699, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{64247, 26346, 53771, 38814}, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{12368, 44045, 43355, 49680, 1614, 8884, 46819, 60111, 41213, 32155, 20386, 39223, 21456, 24609, 38987, 38618, 11349, 27207, 5552, 38559, 59735, 62972}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{54714, 27260, 38524, 63770}, (char) (6806 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 2087353557 - TextUtils.indexOf("", "", 0), new char[]{42227, 11295, 34571, 18894, 15633, 22918, 53332, 45025, 62535, 59556, 47771, 29631, 26860, 29581, 9063}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                    int iGreen2 = 10 - Color.green(0);
                    byte[] bArr = $$a;
                    byte b3 = bArr[7];
                    Object[] objArr5 = new Object[1];
                    a(b3, b3, bArr[3], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, iMakeMeasureSpec, iGreen2, 2009631821, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i2 = g + 101;
                    TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                        int modifierMetaStateMask = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                        byte[] bArr2 = $$a;
                        Object[] objArr6 = new Object[1];
                        a(bArr2[3], bArr2[10], bArr2[7], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, modifierMetaStateMask, windowTouchSlop, 256017550, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i4 = ~iIdentityHashCode;
                    int i5 = (((505081516 + ((((~(272617678 | i4)) | (-312927908)) | (~((-272617679) | iIdentityHashCode))) * (-564))) + ((~(iIdentityHashCode | (-270975107))) * 1128)) + (((~((-312927908) | i4)) | 1642572) * 564)) - 1766298604;
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{53828, 56530, 45223, 64070}, (char) (18096 - Color.blue(0)), View.MeasureSpec.getSize(0), new char[]{64489, 895, 26793, 59770, 35290, 29, 25584, 8083, 27923, 26917, 9182, 50910, 44967, 48944, 2215, 55524, 59596, 31482, 1757, 44148, 33765, 9251, 407, 13529, 33113, 34325}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{14699, 12739, 38898, 31010}, (char) (8856 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), KeyEvent.getMaxKeyCode() >> 16, new char[]{24478, 54387, 26048, 15318, 60853, 42024, 27802, 31543, 1266, 19279, 62548, 50023, 64729, 54121, 320, 36229, 47744, 9607}, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i8 = TuitionPaymentFragmentbindingInflater1 + 55;
                        int i9 = i8 % 128;
                        g = i9;
                        int i10 = i8 % 2;
                        if (!(applicationContext instanceof ContextWrapper)) {
                            applicationContext = applicationContext.getApplicationContext();
                            int i11 = g + 19;
                            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                            int i12 = i11 % 2;
                        } else {
                            int i13 = i9 + 93;
                            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                            int i14 = i13 % 2;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                                int i15 = g + 19;
                                TuitionPaymentFragmentbindingInflater1 = i15 % 128;
                                int i16 = i15 % 2;
                            } else {
                                applicationContext = null;
                            }
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{62556, 24896, 60950, 47729}, (char) (29166 - KeyEvent.normalizeMetaState(0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{60588, 18045, 61467, 37153, 33011, 13475, 25195, 6893, 55531, 16526, 17420, 41209, 33934, 31503, 39883, 62646}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{48540, 37773, 22019, 56041}, (char) (59734 - View.combineMeasuredStates(0, 0)), 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{21428, 44083, 49640, 40559, 18327, 22044, 40255, 44297, 38519, 15149, 41920, 609, 6260, 23990, 59149, 194}, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -1766298604};
                        byte[] bArr3 = $$d;
                        byte b4 = bArr3[24];
                        byte b5 = bArr3[4];
                        Object[] objArr13 = new Object[1];
                        d(b4, b5, b5, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b6 = bArr3[4];
                        byte b7 = bArr3[24];
                        Object[] objArr14 = new Object[1];
                        d(b6, b7, b7, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cResolveSize = (char) View.resolveSize(0, 0);
                                int size = View.MeasureSpec.getSize(0) + 876;
                                int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                byte[] bArr4 = $$a;
                                Object[] objArr16 = new Object[1];
                                a(bArr4[3], bArr4[10], bArr4[7], objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSize, size, keyRepeatTimeout, 256017550, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                            try {
                                Object[] objArr17 = new Object[1];
                                c(new char[]{0, 0, 0, 0}, new char[]{64247, 26346, 53771, 38814}, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getOffsetAfter("", 0), new char[]{12368, 44045, 43355, 49680, 1614, 8884, 46819, 60111, 41213, 32155, 20386, 39223, 21456, 24609, 38987, 38618, 11349, 27207, 5552, 38559, 59735, 62972}, objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                c(new char[]{0, 0, 0, 0}, new char[]{54714, 27260, 38524, 63770}, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6805), 2087353558 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{42227, 11295, 34571, 18894, 15633, 22918, 53332, 45025, 62535, 59556, 47771, 29631, 26860, 29581, 9063}, objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char cMyTid = (char) (Process.myTid() >> 22);
                                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                                    int i17 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    byte[] bArr5 = $$a;
                                    byte b8 = bArr5[7];
                                    Object[] objArr19 = new Object[1];
                                    a(b8, b8, bArr5[3], objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyTid, iMakeMeasureSpec2, i17, 2009631821, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                    int iRed = 876 - Color.red(0);
                                    int gidForName = Process.getGidForName("") + 11;
                                    byte b9 = $$a[3];
                                    Object[] objArr20 = new Object[1];
                                    a(b9, (byte) ($$b >>> 2), b9, objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, iRed, gidForName, 252381699, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                        objArr = objArr15;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i18 = ((int[]) objArr[2])[0];
                int i19 = ((int[]) objArr[0])[0];
                if (i19 == i18) {
                    int i20 = ((int[]) objArr[1])[0];
                    Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i21 = i20 + (((~(iIdentityHashCode2 | 284907892)) | (-244597664)) * 56) + 1794752780 + (((~((~iIdentityHashCode2) | (-244597664))) | 284907892) * 56);
                    int i22 = (i21 << 13) ^ i21;
                    int i23 = i22 ^ (i22 >>> 17);
                    ((int[]) objArr21[1])[0] = i23 ^ (i23 << 5);
                } else {
                    Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
                    int i24 = ((int[]) objArr[1])[0];
                    Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iIdentityHashCode3 = System.identityHashCode(this);
                    int i25 = i24 + 1858126516 + (((~(879754323 | iIdentityHashCode3)) | 42992168) * 336) + (((~(iIdentityHashCode3 | 920064552)) | 2681939) * (-168)) + (((~((~iIdentityHashCode3) | 920064552)) | 879754323) * 168);
                    int i26 = (i25 << 13) ^ i25;
                    int i27 = i26 ^ (i26 >>> 17);
                    ((int[]) objArr22[1])[0] = i27 ^ (i27 << 5);
                }
                return shouldWrapException.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(short r5, short r6, short r7) {
                /*
                    int r7 = r7 * 2
                    int r7 = r7 + 1
                    int r5 = 104 - r5
                    int r6 = r6 * 3
                    int r6 = r6 + 4
                    byte[] r0 = defpackage.onCreatePanelView.$$c
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r4 = r7
                    r3 = r2
                    goto L24
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r7) goto L22
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L22:
                    r4 = r0[r6]
                L24:
                    int r4 = -r4
                    int r5 = r5 + r4
                    int r6 = r6 + 1
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.onCreatePanelView.$$g(short, short, short):java.lang.String");
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        User user = (User) this.notify.getValue();
        String str = user != null ? user.b : null;
        if (str == null) {
            str = "";
        }
        User user2 = (User) this.notify.getValue();
        String str2 = user2 != null ? user2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
        if (str2 == null) {
            str2 = "";
        }
        User user3 = (User) this.notify.getValue();
        String str3 = user3 != null ? user3.asInterface : null;
        if (str3 == null) {
            str3 = "";
        }
        AccountBankRequest accountBankRequest = new AccountBankRequest(str, str2, str3);
        final select selectVar = (select) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        Intrinsics.checkNotNullParameter(accountBankRequest, "");
        MutableLiveData<VirtualCameraAdapter1<AccountBankItem>> mutableLiveData = selectVar.cancelAll;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVar.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(accountBankRequest)));
        final Function1 function1 = new Function1() { // from class: getView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.TuitionPaymentFragmentbindingInflater1(selectVar, (AccountBankItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: AlertControllerAlertParams
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: createListView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.INotificationSideChannelStubProxy(selectVar, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: AlertControllerAlertParams1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        selectVar.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit asInterface(shouldWrapException shouldwrapexception) {
        shouldwrapexception.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(FragmentAsikActiveParticipantOthersMembershipDataBinding fragmentAsikActiveParticipantOthersMembershipDataBinding, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (String.valueOf(fragmentAsikActiveParticipantOthersMembershipDataBinding.edtPassportNumber.getText()).length() == 0) {
            Editable text = fragmentAsikActiveParticipantOthersMembershipDataBinding.edtPassportExpired.getText();
            if (text != null) {
                text.clear();
            }
            TextInputLayout textInputLayout = fragmentAsikActiveParticipantOthersMembershipDataBinding.tilPassportExpired;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            textInputLayout.setEnabled(false);
        } else {
            TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantOthersMembershipDataBinding.tilPassportExpired;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
            textInputLayout2.setEnabled(true);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldWrapException shouldwrapexception, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_bank_account_asik_result", "loading_bank_account_asik_result"));
            Intrinsics.checkNotNullParameter("loading_bank_account_asik_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_bank_account_asik_result", mapMutableMapOf);
            shouldwrapexception.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_bank_account_asik_result", "success_bank_account_asik_result"));
            Intrinsics.checkNotNullParameter("success_bank_account_asik_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_bank_account_asik_result", mapMutableMapOf2);
            shouldwrapexception.write();
            AccountBankItem accountBankItem = (AccountBankItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            FragmentAsikActiveParticipantOthersMembershipDataBinding fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub = shouldwrapexception.INotificationSideChannelStub();
            String accountBankName = accountBankItem.getAccountBankName();
            if (accountBankName != null && accountBankName.length() != 0) {
                shouldwrapexception.g = new CodeNamePair(String.valueOf(accountBankItem.getBankCode()), String.valueOf(accountBankItem.getBankName()));
                EditText editText = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilBankName.getEditText();
                if (editText != null) {
                    String bankName = accountBankItem.getBankName();
                    if (bankName == null) {
                        bankName = "";
                    }
                    editText.setText(bankName);
                }
                EditText editText2 = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilBankAccountName.getEditText();
                if (editText2 != null) {
                    String accountBankName2 = accountBankItem.getAccountBankName();
                    if (accountBankName2 == null) {
                        accountBankName2 = "";
                    }
                    editText2.setText(accountBankName2);
                }
                EditText editText3 = fragmentAsikActiveParticipantOthersMembershipDataBindingINotificationSideChannelStub.tilBankAccountNumber.getEditText();
                if (editText3 != null) {
                    String accountBankNumber = accountBankItem.getAccountBankNumber();
                    editText3.setText(accountBankNumber != null ? accountBankNumber : "");
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_bank_account_asik_result", "failure_bank_account_asik_result"));
            Intrinsics.checkNotNullParameter("failure_bank_account_asik_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_bank_account_asik_result", mapMutableMapOf3);
            shouldwrapexception.write();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean d(shouldWrapException shouldwrapexception) {
        EditText editText = shouldwrapexception.INotificationSideChannelStub().tilNpwp.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        String str = strValueOf;
        if (str.length() == 0 || StringsKt.isBlank(str) || strValueOf == null) {
            return true;
        }
        int length = strValueOf.length();
        return 15 <= length && length < 17;
    }
}
