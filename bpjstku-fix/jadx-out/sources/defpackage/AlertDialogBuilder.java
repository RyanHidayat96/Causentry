package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.asik.model.request.AsikVerificationLivenessBegin;
import com.bpjstku.data.asik.model.request.AsikVerificationLivenessOnly;
import com.bpjstku.data.asik.model.response.AsikVerifivationLivenessOnlyResponse;
import com.bpjstku.data.config.model.AntreanMenuConfig;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.setting.model.request.KeyRequest;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.databinding.FragmentAsikActiveParticipantBiometricDataBinding;
import com.bpjstku.domain.asik.model.SubmissionCheckItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantBiometricDataFragment$bindingInflater$1;
import com.bpjstku.presentation.asik.active.model.AsikActiveParticipant;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.IntegerRes;
import defpackage.ToolbarActionBarActionMenuPresenterCallback;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.getEventTime;
import defpackage.getFocusY;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.select;
import defpackage.setQuickZoomEnabled;
import defpackage.setTabListener;
import id.vida.liveness.dto.VidaLivenessResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.FileTreeWalk;
import kotlin.io.FilesKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J#\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0014H\u0002¢\u0006\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0017\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u0011\u0010\u001cR\u0015\u0010\f\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0015\u0010\u0011\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0015\u0010 \u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0015\u0010\b\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0015\u0010\u0013\u001a\u00020%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010\u001bR\u0017\u0010(\u001a\u0004\u0018\u00010'8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0017\u0010/\u001a\u0004\u0018\u00010-8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b.\u0010\u001bR\u0015\u00102\u001a\u0002008CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b1\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u000f\u001a\u00020\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u000e\u001a\u00020\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000e\u00107R\u0018\u0010\u0006\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010$\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u00107R\u0018\u0010=\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u00107R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u00107R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u00101\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010DR\u0018\u00104\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u00107R\u0018\u0010<\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00107R\u0018\u0010E\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0018\u0010>\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u00107R\u0018\u00109\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u00107R\u0018\u0010@\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00107R\u0015\u0010G\u001a\u00020F8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\bE\u0010\u001bR\u0017\u00106\u001a\u0004\u0018\u00010H8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\bG\u0010\u001bR\u0015\u0010\"\u001a\u00020I8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b,\u0010\u001bR\u0015\u0010\u001e\u001a\u00020J8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b=\u0010\u001bR.\u0010*\u001a\u001c\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010M\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00020K8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010NR\u001a\u0010P\u001a\u00020\u00168\u0015X\u0095D¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b/\u0010O"}, d2 = {"LAlertDialogBuilder;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentAsikActiveParticipantBiometricDataBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "onDestroy", "Lid/vida/liveness/dto/VidaLivenessResponse;", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lid/vida/liveness/dto/VidaLivenessResponse;)V", "cancel", "INotificationSideChannel", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)V", "d", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "", "TuitionPaymentFragmentbindingInflater1", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lselect;", "Lkotlin/Lazy;", "()Lselect;", "LsetTabListener;", "getItem", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "b", "LIntegerRes;", "getExtras", "LToolbarActionBarActionMenuPresenterCallback;", "INotificationSideChannelDefault", "LgetStreamUseCaseSupportedCombinationList;", "INotificationSideChannelStub", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "asInterface", "LgetCameraState;", "sendCustomAction", "LgetCameraState;", "a", "Lcom/bpjstku/domain/user/model/User;", FirebaseAnalytics.Event.SEARCH, "asBinder", "LgenerateConfigDelta_colorMode;", "INotificationSideChannelStubProxy", "notify", "Ljava/io/File;", "IconCompatParcelizer", "Ljava/io/File;", "getRoot", "Ljava/lang/String;", "", "MediaBrowserCompat", "[B", "getServiceComponent", "connect", "getInterfaceDescriptor", "read", "", "disconnect", "Z", "RemoteActionCompatParcelizer", "LgetStringOrNull;", "LgetStringOrNull;", "write", "LoutputFormatToAudioProfile;", "getNotifyChildrenChangedOptions", "Lcom/bpjstku/domain/asik/model/SubmissionCheckItem;", "LacquireBuffer;", "Lcom/bpjstku/data/lib/PreferenceManager;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "()Lkotlin/jvm/functions/Function3;", "()I", "isConnected"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AlertDialogBuilder extends AutoValue_CameraState_StateError<FragmentAsikActiveParticipantBiometricDataBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] getSessionToken;
    private static int handleMessage;
    private static char isConnected;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final Lazy notify;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private File onTransact;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private byte[] cancelAll;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getStringOrNull INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1001;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy getExtras;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String disconnect;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String MediaBrowserCompat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private String cancel;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private String getInterfaceDescriptor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final Lazy getItem;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    private final Lazy getRoot;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    private String INotificationSideChannel;

    /* JADX INFO: renamed from: getServiceComponent, reason: from kotlin metadata */
    private String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private String connect;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final int isConnected;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String INotificationSideChannelStub;

    /* JADX INFO: renamed from: search, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    private getCameraState a;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Lazy getNotifyChildrenChangedOptions;
    private static final byte[] $$c = {1, -81, 2, 79};
    private static final int $$f = 8;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {43, 23, 22, -14, -13, 1, 62, -58, -9, -1, 7, -6, 6, 54, -57, -4, -10, 12, 2, 0, -19, 13, 54, -54, -16, 16, -19, 10, -5, -14, 4, 10, 5, -17, 68, -60, -6, -7, 14, -14, 3, 12, -12, Base64.padSymbol, -67, 10, -14, -2, 9, -11, -2, 14, -10, 10, -3, 54, -25, -36, -4, 6, 17, -34, 4, -4, 12, 64, -1, -34, -52, 3, 14, -14, 3, 12, -12, 24, -39, 10, -7, 11, 2, -16, 10, 5, 22, -22, -13, 10, -3, 2, 48, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 0, 2, 10, 1, -7, 7, -12, 2, -6, 1, 2, -6, 8, 0, -19, 12, 3, -19, 41, -35, 10, -2, -8, 7, -2, -2, 4, -21, 8, -9, 64};
    private static final int $$e = 179;
    private static final byte[] $$a = {2, -84, 82, -15, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 44;
    private static int setCallbacksMessenger = 1;
    private static int unsubscribe = 0;
    private static int subscribe = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
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

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i4);
        int i11 = ~i4;
        int i12 = i11 | i5;
        int i13 = ~(i3 | i12);
        int i14 = i9 | i10 | i13;
        int i15 = i13 | (~(i7 | i11 | i8));
        int i16 = (~i12) | i10;
        int i17 = i5 + i4 + i + ((-573665793) * i2) + ((-1595597844) * i6);
        int i18 = i17 * i17;
        int i19 = ((-1787860089) * i5) + 959184896 + (1033409659 * i4) + ((-1473697548) * i14) + (1473697548 * i15) + ((-1410634874) * i16) + ((-377225216) * i) + (1316749312 * i2) + (833617920 * i6) + (497221632 * i18);
        int i20 = ((i5 * 2143800573) - 1595758) + (i4 * 2143800249) + (i14 * (-324)) + (i15 * 324) + (i16 * 162) + (i * 2143800411) + (i2 * 1405922725) + (i6 * (-1943733020)) + (i18 * 1827733504);
        switch (i19 + (i20 * i20 * (-911933440))) {
            case 1:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                final AlertDialogBuilder alertDialogBuilder = (AlertDialogBuilder) objArr[0];
                int i21 = 2 % 2;
                alertDialogBuilder.onTransact = null;
                alertDialogBuilder.RemoteActionCompatParcelizer = false;
                Camera2CameraControlImplExternalSyntheticLambda5.Companion companion = Camera2CameraControlImplExternalSyntheticLambda5.INSTANCE;
                String string = alertDialogBuilder.getString(R.string.title_term_and_condition);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = alertDialogBuilder.getString(R.string.term_and_condition_biometric_dukcapil);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = alertDialogBuilder.getString(R.string.action_next);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                String string4 = alertDialogBuilder.getString(R.string.action_cancel_id);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                Camera2CameraControlImplExternalSyntheticLambda5 camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlImplExternalSyntheticLambda5.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(R.drawable.ic_info_blue, string, string2, string3, new Function0() { // from class: setAdapter
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AlertDialogBuilder.asBinder(this.TuitionPaymentFragmentbindingInflater1);
                    }
                }, string4, new Function0() { // from class: setInverseBackgroundForced
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    }
                });
                camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.setCancelable(false);
                int i22 = alertDialogBuilder.requireContext().getResources().getDisplayMetrics().heightPixels;
                FragmentManager childFragmentManager = alertDialogBuilder.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i23 = unsubscribe + 65;
                    subscribe = i23 % 128;
                    int i24 = i23 % 2;
                    camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.show(childFragmentManager, camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    int i25 = subscribe + 39;
                    unsubscribe = i25 % 128;
                    int i26 = i25 % 2;
                }
                camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(i22));
                return Unit.INSTANCE;
            case 7:
                final AlertDialogBuilder alertDialogBuilder2 = (AlertDialogBuilder) objArr[0];
                int i27 = 2 % 2;
                MaterialButton materialButton = alertDialogBuilder2.asInterface().btnNext;
                Intrinsics.checkNotNullExpressionValue(materialButton, "");
                AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: setOnKeyListener
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AlertDialogBuilder.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                });
                CardView cardView = alertDialogBuilder2.asInterface().cvLivenessCheck;
                Intrinsics.checkNotNullExpressionValue(cardView, "");
                AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cardView, new Function0() { // from class: setPositiveButton
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
                        return (Unit) AlertDialogBuilder.b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1124669720, 1124669726, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr2);
                    }
                });
                int i28 = subscribe + 85;
                unsubscribe = i28 % 128;
                int i29 = i28 % 2;
                return null;
            default:
                return b(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 10
            int r6 = 14 - r6
            int r8 = r8 * 3
            int r8 = 100 - r8
            int r0 = r7 + 1
            byte[] r1 = defpackage.AlertDialogBuilder.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-5)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AlertDialogBuilder.c(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 87
            int r8 = 91 - r8
            int r9 = r9 * 35
            int r9 = 88 - r9
            byte[] r0 = defpackage.AlertDialogBuilder.$$d
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2f:
            int r3 = -r3
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AlertDialogBuilder.f(int, short, int, java.lang.Object[]):void");
    }

    public AlertDialogBuilder() {
        final AlertDialogBuilder alertDialogBuilder = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantBiometricDataFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, select] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ select invoke() {
                LifecycleOwner lifecycleOwner = alertDialogBuilder;
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
        final AlertDialogBuilder alertDialogBuilder2 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantBiometricDataFragment$special$$inlined$sharedViewModel$default$1
            public static int $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -889180038;

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = alertDialogBuilder2.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<setTabListener>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantBiometricDataFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, setTabListener] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setTabListener invoke() {
                return getFocusY.b(alertDialogBuilder2, Reflection.getOrCreateKotlinClass(setTabListener.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final AlertDialogBuilder alertDialogBuilder3 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantBiometricDataFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = alertDialogBuilder3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantBiometricDataFragment$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = alertDialogBuilder3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.g = LazyKt.lazy(new Function0<ToolbarActionBarActionMenuPresenterCallback>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantBiometricDataFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ToolbarActionBarActionMenuPresenterCallback, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ToolbarActionBarActionMenuPresenterCallback invoke() {
                LifecycleOwner lifecycleOwner = alertDialogBuilder;
                mapPoint mappoint = this.$qualifier;
                Function0 function1 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ToolbarActionBarActionMenuPresenterCallback.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function1, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.d = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantBiometricDataFragment$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getStreamUseCaseSupportedCombinationList, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getStreamUseCaseSupportedCombinationList invoke() {
                ComponentCallbacks componentCallbacks = alertDialogBuilder3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.asInterface = LazyKt.lazy(new Function0() { // from class: dispatchKeyEvent
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertDialogBuilder.g(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        this.asBinder = LazyKt.lazy(new Function0() { // from class: findViewById
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
            }
        });
        this.notify = LazyKt.lazy(new Function0() { // from class: getDelegate
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertDialogBuilder.d(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        this.getNotifyChildrenChangedOptions = LazyKt.lazy(new Function0() { // from class: attachBaseContext
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertDialogBuilder.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        this.getRoot = LazyKt.lazy(new Function0() { // from class: getMenuInflater
            private static final byte[] $$c = {36, -74, -79, -21};
            private static final int $$f = 221;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {32, 1, 70, -122, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 50, 6, 0, 3, -20, 6, -11, 11, -3, -21, 3, -1, 2, -10, -60, 73, -3, -17, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
            private static final int $$e = 17;
            private static final byte[] $$a = {106, -93, -11, -74, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$b = 242;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int b = 1;
            private static int TuitionPaymentFragmentbindingInflater1 = -83722261;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r5, int r6, byte r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = defpackage.getMenuInflater.$$a
                    int r7 = r7 * 15
                    int r1 = 53 - r7
                    int r6 = r6 + 4
                    int r5 = r5 * 2
                    int r5 = r5 + 84
                    byte[] r1 = new byte[r1]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r0 != 0) goto L17
                    r4 = r5
                    r5 = r7
                    r3 = r2
                    goto L2b
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    int r6 = r6 + 1
                    if (r3 != r7) goto L27
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L27:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                L2b:
                    int r5 = r5 + r4
                    int r5 = r5 + (-11)
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getMenuInflater.a(short, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 15
                    int r6 = 99 - r6
                    int r8 = r8 * 12
                    int r0 = r8 + 41
                    int r7 = r7 + 4
                    byte[] r1 = defpackage.getMenuInflater.$$d
                    byte[] r0 = new byte[r0]
                    int r8 = r8 + 40
                    r2 = 0
                    if (r1 != 0) goto L16
                    r3 = r7
                    r4 = r2
                    goto L2e
                L16:
                    r3 = r2
                L17:
                    int r7 = r7 + 1
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L26:
                    r4 = r1[r7]
                    int r3 = r3 + 1
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2e:
                    int r6 = r6 + r7
                    int r6 = r6 + 3
                    r7 = r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getMenuInflater.d(byte, byte, int, java.lang.Object[]):void");
            }

            private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                int i4 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i5 = $10 + 103;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.getGidForName("") + 1), 3291 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31, 1199271174, false, $$g(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getOffsetBefore("", 0), 652 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 44, -450685997, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
                if (i3 > 0) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i8 = $11 + 11;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i2 / setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), MotionEvent.axisFromString("") + 652, 44 - TextUtils.getTrimmedLength(""), -450685997, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } else {
                            cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                            Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), ((Process.getThreadPriority(0) + 20) >> 6) + 651, Process.getGidForName("") + 45, -450685997, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        }
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = b + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int i4 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int scrollDefaultDelay = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a(bArr[7], bArr[5], bArr[28], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, i4, scrollDefaultDelay, -1650998592, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(true, Process.getGidForName("") + 237, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, new char[]{15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f'}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(true, 241 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 14 - TextUtils.indexOf((CharSequence) "", '0'), 5 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{'\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int mirror = AndroidCharacter.getMirror('0') + 828;
                    int iMakeMeasureSpec = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    Object[] objArr5 = new Object[1];
                    a(b3, (byte) (b3 | 36), b2, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, mirror, iMakeMeasureSpec, 2012020043, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int iMakeMeasureSpec2 = 876 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iMyTid = (Process.myTid() >> 22) + 10;
                        byte b4 = $$a[7];
                        byte b5 = b4;
                        Object[] objArr6 = new Object[1];
                        a(b5, (byte) (b5 | 88), b4, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, iMakeMeasureSpec2, iMyTid, 2012931276, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i7 = ~iIdentityHashCode;
                    int i8 = 400299292 + (((~(872741582 | i7)) | (~((-913051812) | iIdentityHashCode))) * 1900) + (((~(i7 | 913051811)) | (~(iIdentityHashCode | (-872741583)))) * (-950)) + (((~(iIdentityHashCode | 913051811)) | (~(i7 | (-872741583)))) * 950) + 1136042305;
                    int i9 = (i8 << 13) ^ i8;
                    int i10 = i9 ^ (i9 >>> 17);
                    ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(true, 236 - Drawable.resolveOpacity(0, 0), 25 - Process.getGidForName(""), 7 - View.getDefaultSize(0, 0), new char[]{1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(false, 243 - TextUtils.getOffsetAfter("", 0), 18 - View.MeasureSpec.getMode(0), 11 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{'\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4}, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(true, Process.getGidForName("") + 236, 16 - TextUtils.indexOf("", "", 0, 0), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(false, TextUtils.indexOf("", "", 0) + 239, 16 - TextUtils.getTrimmedLength(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2, new char[]{'\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501}, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1136042305};
                        byte[] bArr2 = $$d;
                        byte b6 = bArr2[28];
                        Object[] objArr13 = new Object[1];
                        d(b6, bArr2[37], b6, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b7 = bArr2[1];
                        byte b8 = b7;
                        Object[] objArr14 = new Object[1];
                        d(b8, (byte) (b8 | 38), b7, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                            b = i11 % 128;
                            int i12 = i11 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char mirror2 = (char) ('0' - AndroidCharacter.getMirror('0'));
                                int iAlpha = Color.alpha(0) + 876;
                                int iArgb = 10 - Color.argb(0, 0, 0, 0);
                                byte b9 = $$a[7];
                                byte b10 = b9;
                                Object[] objArr16 = new Object[1];
                                a(b10, (byte) (b10 | 88), b9, objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror2, iAlpha, iArgb, 2012931276, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                            try {
                                Object[] objArr17 = new Object[1];
                                c(true, View.resolveSizeAndState(0, 0, 0) + 236, Color.red(0) + 22, ExpandableListView.getPackedPositionGroup(0L) + 4, new char[]{15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f'}, objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                c(true, 288 - AndroidCharacter.getMirror('0'), 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.blue(0) + 5, new char[]{'\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534}, objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 876;
                                    int packedPositionType = 10 - ExpandableListView.getPackedPositionType(0L);
                                    byte b11 = $$a[7];
                                    byte b12 = b11;
                                    Object[] objArr19 = new Object[1];
                                    a(b12, (byte) (b12 | 36), b11, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, packedPositionGroup, packedPositionType, 2012020043, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 876;
                                    int i13 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    byte[] bArr3 = $$a;
                                    Object[] objArr20 = new Object[1];
                                    a(bArr3[7], bArr3[5], bArr3[28], objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, touchSlop, i13, -1650998592, false, (String) objArr20[0], null);
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
                int i14 = ((int[]) objArr[2])[0];
                int i15 = ((int[]) objArr[0])[0];
                if (i15 != i14) {
                    throw new RuntimeException(String.valueOf(i15));
                }
                int i16 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i17 = ~Process.myUid();
                int i18 = i16 + 1816466036 + ((127924861 | i17) * 184) + (((~(i17 | 117893165)) | 60373621) * 184);
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                ((int[]) objArr21[1])[0] = i20 ^ (i20 << 5);
                return AlertDialogBuilder.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r7, short r8, int r9) {
                /*
                    int r7 = r7 * 3
                    int r7 = r7 + 1
                    int r9 = r9 + 4
                    byte[] r0 = defpackage.getMenuInflater.$$c
                    int r8 = r8 + 119
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r8 = r7
                    r3 = r9
                    r4 = r2
                    goto L28
                L13:
                    r3 = r2
                L14:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r7) goto L21
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L21:
                    int r9 = r9 + 1
                    r3 = r0[r9]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L28:
                    int r8 = r8 + r9
                    r9 = r3
                    r3 = r4
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getMenuInflater.$$g(byte, short, int):java.lang.String");
            }
        });
        this.getExtras = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantBiometricDataFragment$special$$inlined$inject$default$4
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = alertDialogBuilder3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.getItem = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantBiometricDataFragment$special$$inlined$inject$default$5
            public static long[] TuitionPaymentFragmentbindingInflater1;
            public static long[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-6296109296750749083L, 6296109296697581370L, 6296109297846175212L, -6296109297119378901L, -6296109297287242623L, 6296109296697578030L, 6296109298367245629L, -6296109297885369617L, 6296109298471340260L, 6296109296699807738L, -6296109296563333959L, -6296109296775505217L, -6296109297221158411L, 6296109296697593074L, -6296109297363923175L, 6296109297319475409L, -6296109296626798250L, 6296109296695598058L, 6296109297737319561L, 6296109296622274096L, 6296109298522348860L, 6296109296697578554L, -6296109297089074043L, -6296109297846722773L, 6296109298086582541L, 6296109296697585362L, 6296109297380799404L, -6296109297612253223L, -6296109298082890828L, 6296109296697576990L, 6296109297811177367L, -6296109296667724075L, -6296109297290907078L, 6296109296697576454L, 6296109298355973462L, 6296109296954929651L};
            public static long[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-6296109296750749083L, 6296109296697582622L, -6296109296686871606L, 6296109297118551900L, -6296109297287242623L, 6296109296697579686L, -6296109296911400924L, -6296109298418745858L, 6296109298471340260L, 6296109296699408902L, 6296109297687191820L, -6296109296802581869L, -6296109297221158411L, 6296109296697602622L, 6296109297213755855L, -6296109297189770296L, -6296109296626798250L, 6296109296694380998L, 6296109297868983660L, 6296109298490691182L, 6296109298522348860L, 6296109296697582366L, 6296109296633756302L, -6296109296531168181L, 6296109298086582541L, 6296109296697587670L, 6296109297380015615L, 6296109296713425519L, -6296109298082890828L, 6296109296697577870L, 6296109297758421477L, 6296109297141076248L, -6296109297290907078L, 6296109296697579238L, -6296109296810473587L, 6296109296928598948L};
            public static long[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            public static long[] b;
            public static long[] d;
            public static long[] g;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = alertDialogBuilder3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.isConnected = R.layout.fragment_asik_active_participant_biometric_data;
    }

    /* JADX INFO: renamed from: AlertDialogBuilder$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAlertDialogBuilder$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "LAlertDialogBuilder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LAlertDialogBuilder;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static AlertDialogBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new AlertDialogBuilder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0183  */
    /* JADX WARN: Code duplicated, block: B:43:0x0199  */
    /* JADX WARN: Code duplicated, block: B:46:0x01e6 A[Catch: all -> 0x0382, TryCatch #0 {all -> 0x0382, blocks: (B:44:0x019b, B:46:0x01e6, B:47:0x025b), top: B:76:0x019b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x026e  */
    /* JADX WARN: Code duplicated, block: B:53:0x02aa A[Catch: all -> 0x03aa, TryCatch #1 {all -> 0x03aa, blocks: (B:9:0x002b, B:11:0x0039, B:12:0x006e, B:15:0x0081, B:17:0x0092, B:18:0x00c5, B:23:0x00e0, B:25:0x00f1, B:26:0x0122, B:51:0x0270, B:53:0x02aa, B:54:0x0310), top: B:78:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0331  */
    /* JADX WARN: Code duplicated, block: B:58:0x0338  */
    /* JADX WARN: Code duplicated, block: B:59:0x0360  */
    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = getSessionToken;
        long j = 0;
        int i5 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 49;
                $11 = i7 % 128;
                if (i7 % i3 == 0) {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char gidForName = (char) (Process.getGidForName("") + 1);
                            int packedPositionType = ExpandableListView.getPackedPositionType(j) + 2267;
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 34;
                            byte b2 = (byte) ($$c[0] - 1);
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, packedPositionType, iLastIndexOf, -1927765101, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                        i6 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                        int i8 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2267;
                        int iCombineMeasuredStates = 33 - View.combineMeasuredStates(0, 0);
                        byte b4 = (byte) ($$c[0] - 1);
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, i8, iCombineMeasuredStates, -1927765101, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                    i6++;
                }
                i3 = 2;
                j = 0;
                i5 = 1770390596;
            }
            cArr2 = cArr3;
        }
        Object[] objArr5 = {Integer.valueOf(isConnected)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int iNormalizeMetaState = 2267 - KeyEvent.normalizeMetaState(0);
            int i9 = 33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte b6 = (byte) ($$c[0] - 1);
            byte b7 = b6;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, iNormalizeMetaState, i9, -1927765101, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr5)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i10 = $10 + 119;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i12 = $10 + 53;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
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
                                char c = (char) (49268 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                int iCombineMeasuredStates2 = 3261 - View.combineMeasuredStates(0, 0);
                                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 30;
                                byte b8 = $$c[0];
                                byte b9 = (byte) (b8 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iCombineMeasuredStates2, offsetBefore, -127612708, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22878);
                                    int iAxisFromString = 593 - MotionEvent.axisFromString("");
                                    int defaultSize = 17 - View.getDefaultSize(0, 0);
                                    byte b10 = (byte) ($$f - 5);
                                    byte b11 = (byte) (b10 - 3);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, iAxisFromString, defaultSize, 1570859318, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            } else {
                                obj = null;
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
                            char c2 = (char) (49268 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int iCombineMeasuredStates3 = 3261 - View.combineMeasuredStates(0, 0);
                            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 30;
                            byte b12 = $$c[0];
                            byte b13 = (byte) (b12 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iCombineMeasuredStates3, offsetBefore2, -127612708, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr7 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char maximumFlingVelocity2 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22878);
                                int iAxisFromString2 = 593 - MotionEvent.axisFromString("");
                                int defaultSize2 = 17 - View.getDefaultSize(0, 0);
                                byte b14 = (byte) ($$f - 5);
                                byte b15 = (byte) (b14 - 3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity2, iAxisFromString2, defaultSize2, 1570859318, false, $$g(b14, b15, b15), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr7)).intValue();
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i110];
                            } else {
                                int i111 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i112 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i111];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i112];
                            }
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            int i21 = $10 + 117;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private final select TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i2 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iIndexOf = TextUtils.indexOf("", "", 0) + 10;
            byte[] bArr = $$a;
            byte b = bArr[0];
            Object[] objArr2 = new Object[1];
            c((byte) (b - 1), bArr[17], (byte) (b - 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, i2, iIndexOf, -1199417970, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{11, '\t', 20, 24, 0, 6, 20, 14, 2, 11, 11, 15, 17, 14, '\r', 16, 5, 2, 6, 3, 22, 23}, (byte) (Gravity.getAbsoluteGravity(0, 0) + 72), 22 - TextUtils.indexOf("", "", 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{23, '\r', '\f', 4, '\r', 17, 20, 21, 19, '\r', 6, '\r', 6, '\b', 13899}, (byte) (76 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 15 - TextUtils.getCapsMode("", 0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 876;
            int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
            byte b2 = $$a[11];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, pressedStateDuration, tapTimeout, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int gidForName = Process.getGidForName("") + 877;
                int defaultSize = View.getDefaultSize(0, 0) + 10;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[11];
                byte b5 = bArr2[12];
                Object[] objArr6 = new Object[1];
                c(b4, b5, (byte) (b5 >>> 2), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, gidForName, defaultSize, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = (-1813686000) + (((~(252583477 | iIdentityHashCode)) | (-292893707)) * (-964)) + (((~((~iIdentityHashCode) | 252583477)) | (-528432704)) * (-964)) + 1408320133;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{14, '\n', 14, 19, '\r', 5, 11, '\t', 0, 14, 17, 15, '\r', '\f', 17, '\b'}, (byte) (43 - View.resolveSize(0, 0)), MotionEvent.axisFromString("") + 17, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{'\t', 20, 16, '\b', '\n', 6, 14, 16, 19, '\n', 17, 22, 1, 2, 23, 19}, (byte) (43 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr9);
            try {
                Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 1408320133};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[19];
                Object[] objArr11 = new Object[1];
                f(b6, bArr3[5], b6, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr3[5];
                byte b8 = b7;
                Object[] objArr12 = new Object[1];
                f(b7, bArr3[19], b8, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i6 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                    int i7 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte[] bArr4 = $$a;
                    byte b9 = bArr4[11];
                    byte b10 = bArr4[12];
                    Object[] objArr13 = new Object[1];
                    c(b9, b10, (byte) (b10 >>> 2), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, i6, i7, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{11, '\t', 20, 24, 0, 6, 20, 14, 2, 11, 11, 15, 17, 14, '\r', 16, 5, 2, 6, 3, 22, 23}, (byte) (72 - Color.blue(0)), View.resolveSize(0, 0) + 22, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{23, '\r', '\f', 4, '\r', 17, 20, 21, 19, '\r', 6, '\r', 6, '\b', 13899}, (byte) (KeyEvent.normalizeMetaState(0) + 76), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 877;
                        int edgeSlop = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b11 = $$a[11];
                        byte b12 = b11;
                        Object[] objArr16 = new Object[1];
                        c(b11, b12, b12, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, packedPositionChild, edgeSlop, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int iRgb = (-16776340) - Color.rgb(0, 0, 0);
                        int scrollDefaultDelay = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte[] bArr5 = $$a;
                        byte b13 = bArr5[0];
                        Object[] objArr17 = new Object[1];
                        c((byte) (b13 - 1), bArr5[17], (byte) (b13 - 1), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, iRgb, scrollDefaultDelay, -1199417970, false, (String) objArr17[0], null);
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
        int i8 = ((int[]) objArr[2])[0];
        int i9 = ((int[]) objArr[0])[0];
        if (i9 != i8) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i10 = subscribe + 67;
                unsubscribe = i10 % 128;
                int i11 = i10 % 2;
                for (String str : strArr) {
                    int i12 = subscribe + 5;
                    unsubscribe = i12 % 128;
                    int i13 = i12 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i9));
        }
        int i14 = subscribe + 15;
        unsubscribe = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((int[]) objArr[1])[0];
        Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iMyUid = Process.myUid();
        int i17 = i16 + (-1540950884) + (((~((-40901081) | iMyUid)) | (~((~iMyUid) | (-590852)))) * (-318)) + (((~(846518748 | iMyUid)) | (-847109600)) * (-318)) + (((~(iMyUid | (-846518749))) | 806208519) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr18[1])[0] = i19 ^ (i19 << 5);
        select selectVar = (select) this.TuitionPaymentFragmentbindingInflater1.getValue();
        int i20 = subscribe + 69;
        unsubscribe = i20 % 128;
        if (i20 % 2 == 0) {
            return selectVar;
        }
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantBiometricDataBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = unsubscribe + 5;
        subscribe = i2 % 128;
        int i3 = i2 % 2;
        AsikActiveParticipantBiometricDataFragment$bindingInflater$1 asikActiveParticipantBiometricDataFragment$bindingInflater$1 = AsikActiveParticipantBiometricDataFragment$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        if (i3 != 0) {
            return asikActiveParticipantBiometricDataFragment$bindingInflater$1;
        }
        throw null;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getCancel() {
        int i = 2 % 2;
        int i2 = subscribe + 29;
        unsubscribe = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isConnected;
        }
        throw null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        int i = 2 % 2;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        experimentalCamera2Interop.b(contextRequireContext, new Function1() { // from class: setOnItemSelectedListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: setOnDismissListener
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertDialogBuilder.INotificationSideChannel(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        MaterialButton materialButton = asInterface().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i2 = unsubscribe + 89;
        subscribe = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        AlertDialogBuilder alertDialogBuilder = (AlertDialogBuilder) objArr[0];
        int i = 2 % 2;
        if (!((acquireBuffer) alertDialogBuilder.getExtras.getValue()).isDisposed()) {
            int i2 = subscribe + 33;
            unsubscribe = i2 % 128;
            int i3 = i2 % 2;
            ((acquireBuffer) alertDialogBuilder.getExtras.getValue()).dispose();
        }
        super.onDestroy();
        int i4 = unsubscribe + 91;
        subscribe = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(VidaLivenessResponse p0) {
        Bitmap bitmapDecodeByteArray;
        int i = 2 % 2;
        byte[] imageBytes = p0.getImageBytes();
        if (imageBytes != null) {
            int i2 = subscribe + 87;
            unsubscribe = i2 % 128;
            bitmapDecodeByteArray = i2 % 2 != 0 ? BitmapFactory.decodeByteArray(p0.getImageBytes(), 0, imageBytes.length) : BitmapFactory.decodeByteArray(p0.getImageBytes(), 0, imageBytes.length);
        } else {
            bitmapDecodeByteArray = null;
        }
        FragmentAsikActiveParticipantBiometricDataBinding fragmentAsikActiveParticipantBiometricDataBindingAsInterface = asInterface();
        fragmentAsikActiveParticipantBiometricDataBindingAsInterface.imgLivenessCheck.setVisibility(8);
        fragmentAsikActiveParticipantBiometricDataBindingAsInterface.tvLivenessCheckLabel.setVisibility(8);
        fragmentAsikActiveParticipantBiometricDataBindingAsInterface.imgSelfiePhoto.setVisibility(0);
        fragmentAsikActiveParticipantBiometricDataBindingAsInterface.imgSelfiePhoto.setImageBitmap(bitmapDecodeByteArray);
        this.INotificationSideChannelDefault = p0.getTransactionId();
        this.getInterfaceDescriptor = String.valueOf(p0.getLivenessScore());
        this.INotificationSideChannelStub = String.valueOf(p0.getManipulationScore());
        this.cancelAll = p0.getImageBytes();
        int i3 = unsubscribe + 1;
        subscribe = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements getStringOrNull.b {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            BaseActivity baseActivity = AlertDialogBuilder.this.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                baseActivity.d_();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:31:0x0104  */
    /* JADX WARN: Code duplicated, block: B:32:0x010e A[PHI: r1
  0x010e: PHI (r1v36 VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2) = 
  (r1v17 VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2)
  (r1v40 VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2)
 binds: [B:15:0x0055, B:12:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0122  */
    /* JADX WARN: Code duplicated, block: B:53:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v31, types: [T, java.lang.String] */
    private static final Unit d(final AlertDialogBuilder alertDialogBuilder, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String strB;
        final Ref.ObjectRef objectRef;
        AntreanMenuConfig antreanMenuConfig;
        OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB;
        FragmentManager childFragmentManager;
        int i;
        int i2;
        int i3 = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            alertDialogBuilder.IconCompatParcelizer();
        } else {
            if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
                int i4 = subscribe + 85;
                unsubscribe = i4 % 128;
                int i5 = i4 % 2;
                alertDialogBuilder.write();
                List listSplit$default = StringsKt.split$default((CharSequence) ((AsikVerifivationLivenessOnlyResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuccessful(), new String[]{"#"}, false, 0, 6, (Object) null);
                SubmissionCheckItem submissionCheckItem = (SubmissionCheckItem) alertDialogBuilder.getRoot.getValue();
                List listSplit$default2 = (submissionCheckItem == null || (str = submissionCheckItem.g) == null) ? null : StringsKt.split$default((CharSequence) str, new String[]{"#"}, false, 0, 6, (Object) null);
                if (Intrinsics.areEqual(listSplit$default.get(2), listSplit$default2 != null ? (String) listSplit$default2.get(2) : null)) {
                    outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) alertDialogBuilder.getNotifyChildrenChangedOptions.getValue();
                    String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
                    final Function1 function1 = new Function1() { // from class: setNeutralButtonIcon
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Boolean) obj};
                            return (Unit) AlertDialogBuilder.b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1449358011, 1449358011, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr);
                        }
                    };
                    BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: setNegativeButton
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
                    ((acquireBuffer) alertDialogBuilder.getExtras.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
                } else {
                    alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Permintaan ditolak");
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i6 = subscribe + 39;
                unsubscribe = i6 % 128;
                if (i6 % 2 != 0) {
                    alertDialogBuilder.write();
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                    if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Anda telah mencoba verifikasi biometrik sebanyak 3 (tiga) kali sehingga proses Pengkinian Data tidak bisa dilanjutkan. Untuk informasi lebih lanjut, silakan menghubungi Kantor Cabang terdekat di kota Anda.", true, 5, (Object) null)) {
                        getMaxImages getmaximages = getMaxImages.INSTANCE;
                        strB = getMaxImages.b();
                        objectRef = new Ref.ObjectRef();
                        objectRef.element = "";
                        if (strB.length() > 0) {
                            try {
                                antreanMenuConfig = (AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class);
                                if (!antreanMenuConfig.getStatus()) {
                                    alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setPositiveButtonIcon
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Object[] objArr = {this.b, (String) obj};
                                            return (Unit) AlertDialogBuilder.b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1906754168, -1906754164, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr);
                                        }
                                    });
                                } else {
                                    try {
                                        objectRef.element = antreanMenuConfig.getLinkAntreanKlaim();
                                        int i7 = subscribe + 99;
                                        unsubscribe = i7 % 128;
                                        int i8 = i7 % 2;
                                    } catch (Exception unused) {
                                    }
                                    if (((CharSequence) objectRef.element).length() > 0) {
                                        OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
                                        String string = alertDialogBuilder.getString(R.string.label_title_confirm_asik_dialog);
                                        Intrinsics.checkNotNullExpressionValue(string, "");
                                        String string2 = alertDialogBuilder.getString(R.string.label_message_failed_biometrik_asik);
                                        Intrinsics.checkNotNullExpressionValue(string2, "");
                                        String string3 = alertDialogBuilder.getString(R.string.action_booking_antrean_online);
                                        Intrinsics.checkNotNullExpressionValue(string3, "");
                                        outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.img_failed_biometric, string, string2, string3, (128 & 16) != 0 ? null : new Function0() { // from class: setNeutralButton
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, objectRef};
                                                return (Unit) AlertDialogBuilder.b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1646141838, 1646141841, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr);
                                            }
                                        }, (128 & 32) != 0 ? null : alertDialogBuilder.getString(R.string.action_return), (128 & 64) != 0 ? null : new Function0() { // from class: setOnCancelListener
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AlertDialogBuilder.notify(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                            }
                                        }, (128 & 128) != 0 ? false : false);
                                        childFragmentManager = alertDialogBuilder.getChildFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                                        Intrinsics.checkNotNullParameter(childFragmentManager, "");
                                        if (childFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                            i = unsubscribe + 91;
                                            subscribe = i % 128;
                                            if (i % 2 == 0) {
                                                outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                                int i9 = 14 / 0;
                                            } else {
                                                outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                            }
                                        }
                                    } else {
                                        alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setPositiveButtonIcon
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Object[] objArr = {this.b, (String) obj};
                                                return (Unit) AlertDialogBuilder.b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1906754168, -1906754164, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr);
                                            }
                                        });
                                    }
                                }
                            } catch (Exception unused2) {
                            }
                        } else {
                            alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setPositiveButtonIcon
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Object[] objArr = {this.b, (String) obj};
                                    return (Unit) AlertDialogBuilder.b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1906754168, -1906754164, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr);
                                }
                            });
                        }
                    } else {
                        alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        i2 = subscribe + 29;
                        unsubscribe = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i10 = 3 / 5;
                        }
                    }
                } else {
                    alertDialogBuilder.write();
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                    if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Anda telah mencoba verifikasi biometrik sebanyak 3 (tiga) kali sehingga proses Pengkinian Data tidak bisa dilanjutkan. Untuk informasi lebih lanjut, silakan menghubungi Kantor Cabang terdekat di kota Anda.", false, 2, (Object) null)) {
                        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
                        strB = getMaxImages.b();
                        objectRef = new Ref.ObjectRef();
                        objectRef.element = "";
                        if (strB.length() > 0) {
                            antreanMenuConfig = (AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class);
                            if (!antreanMenuConfig.getStatus()) {
                                alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setPositiveButtonIcon
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Object[] objArr = {this.b, (String) obj};
                                        return (Unit) AlertDialogBuilder.b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1906754168, -1906754164, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr);
                                    }
                                });
                            } else {
                                objectRef.element = antreanMenuConfig.getLinkAntreanKlaim();
                                int i11 = subscribe + 99;
                                unsubscribe = i11 % 128;
                                int i12 = i11 % 2;
                                if (((CharSequence) objectRef.element).length() > 0) {
                                    OutputConfigurationCompatApi33Impl.Companion companion2 = OutputConfigurationCompatApi33Impl.INSTANCE;
                                    String string4 = alertDialogBuilder.getString(R.string.label_title_confirm_asik_dialog);
                                    Intrinsics.checkNotNullExpressionValue(string4, "");
                                    String string5 = alertDialogBuilder.getString(R.string.label_message_failed_biometrik_asik);
                                    Intrinsics.checkNotNullExpressionValue(string5, "");
                                    String string6 = alertDialogBuilder.getString(R.string.action_booking_antrean_online);
                                    Intrinsics.checkNotNullExpressionValue(string6, "");
                                    outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.img_failed_biometric, string4, string5, string6, (128 & 16) != 0 ? null : new Function0() { // from class: setNeutralButton
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, objectRef};
                                            return (Unit) AlertDialogBuilder.b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1646141838, 1646141841, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr);
                                        }
                                    }, (128 & 32) != 0 ? null : alertDialogBuilder.getString(R.string.action_return), (128 & 64) != 0 ? null : new Function0() { // from class: setOnCancelListener
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AlertDialogBuilder.notify(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                        }
                                    }, (128 & 128) != 0 ? false : false);
                                    childFragmentManager = alertDialogBuilder.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                                    if (childFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                        i = unsubscribe + 91;
                                        subscribe = i % 128;
                                        if (i % 2 == 0) {
                                            outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                            int i13 = 14 / 0;
                                        } else {
                                            outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                        }
                                    }
                                } else {
                                    alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setPositiveButtonIcon
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Object[] objArr = {this.b, (String) obj};
                                            return (Unit) AlertDialogBuilder.b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1906754168, -1906754164, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr);
                                        }
                                    });
                                }
                            }
                        } else {
                            alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setPositiveButtonIcon
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Object[] objArr = {this.b, (String) obj};
                                    return (Unit) AlertDialogBuilder.b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1906754168, -1906754164, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr);
                                }
                            });
                        }
                    } else {
                        alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        i2 = subscribe + 29;
                        unsubscribe = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i14 = 3 / 5;
                        }
                    }
                }
            } else {
                alertDialogBuilder.write();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:55:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x01fb  */
    /* JADX WARN: Type inference failed for: r2v43, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v44, types: [T, java.lang.String] */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        getStringOrNull getstringornullB;
        getStringOrNull getstringornull;
        FragmentManager childFragmentManager;
        int i;
        final AlertDialogBuilder alertDialogBuilder = (AlertDialogBuilder) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i2 = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            alertDialogBuilder.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            alertDialogBuilder.write();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            List listSplit$default = StringsKt.split$default((CharSequence) ((AsikVerifivationLivenessOnlyResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuccessful(), new String[]{"#"}, false, 0, 6, (Object) null);
            if (Intrinsics.areEqual(StringsKt.split$default((CharSequence) ((AsikVerifivationLivenessOnlyResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuspend(), new String[]{"#"}, false, 0, 6, (Object) null).get(0), "false")) {
                int i3 = unsubscribe + 71;
                subscribe = i3 % 128;
                if (i3 % 2 != 0 ? !Intrinsics.areEqual(listSplit$default.get(0), "true") : !Intrinsics.areEqual(listSplit$default.get(1), "true")) {
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string = alertDialogBuilder.getString(R.string.action_information);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    String string2 = alertDialogBuilder.getString(R.string.message_integrity_data);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    String string3 = alertDialogBuilder.getString(R.string.action_back);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, string2, string3, null, 112);
                    alertDialogBuilder.INotificationSideChannelStubProxy = getstringornullB;
                    if (getstringornullB != null) {
                        childFragmentManager = alertDialogBuilder.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager, "");
                        if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            i = unsubscribe + 51;
                            subscribe = i % 128;
                            if (i % 2 != 0) {
                                getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                throw null;
                            }
                            getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }
                    getstringornull = alertDialogBuilder.INotificationSideChannelStubProxy;
                    if (getstringornull != null) {
                        getstringornull.INotificationSideChannel = alertDialogBuilder.new TuitionPaymentFragmentbindingInflater1();
                    }
                } else {
                    alertDialogBuilder.d();
                }
            } else {
                getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                String string4 = alertDialogBuilder.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                String string5 = alertDialogBuilder.getString(R.string.message_integrity_data);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                String string6 = alertDialogBuilder.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string4, string5, string6, null, 112);
                alertDialogBuilder.INotificationSideChannelStubProxy = getstringornullB;
                if (getstringornullB != null) {
                    childFragmentManager = alertDialogBuilder.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        i = unsubscribe + 51;
                        subscribe = i % 128;
                        if (i % 2 != 0) {
                            getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            throw null;
                        }
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                getstringornull = alertDialogBuilder.INotificationSideChannelStubProxy;
                if (getstringornull != null) {
                    getstringornull.INotificationSideChannel = alertDialogBuilder.new TuitionPaymentFragmentbindingInflater1();
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            alertDialogBuilder.write();
            alertDialogBuilder.cancelAll = null;
            File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraCoordinatorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.exists()) {
                int i4 = unsubscribe + 113;
                subscribe = i4 % 128;
                if (i4 % 2 == 0) {
                    FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    throw null;
                }
                FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            FragmentAsikActiveParticipantBiometricDataBinding fragmentAsikActiveParticipantBiometricDataBindingAsInterface = alertDialogBuilder.asInterface();
            fragmentAsikActiveParticipantBiometricDataBindingAsInterface.imgSelfiePhoto.setImageResource(0);
            fragmentAsikActiveParticipantBiometricDataBindingAsInterface.imgLivenessCheck.setVisibility(0);
            fragmentAsikActiveParticipantBiometricDataBindingAsInterface.tvLivenessCheckLabel.setVisibility(0);
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Anda telah mencoba verifikasi biometrik sebanyak 3 (tiga) kali sehingga proses Pengkinian Data tidak bisa dilanjutkan. Untuk informasi lebih lanjut, silakan menghubungi Kantor Cabang terdekat di kota Anda.", false, 2, (Object) null)) {
                getMaxImages getmaximages = getMaxImages.INSTANCE;
                String strB = getMaxImages.b();
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = "";
                if (strB.length() > 0) {
                    try {
                        AntreanMenuConfig antreanMenuConfig = (AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class);
                        if (antreanMenuConfig.getStatus()) {
                            int i5 = subscribe + 59;
                            unsubscribe = i5 % 128;
                            try {
                                if (i5 % 2 != 0) {
                                    objectRef.element = antreanMenuConfig.getLinkAntreanKlaim();
                                    int i6 = 34 / 0;
                                } else {
                                    objectRef.element = antreanMenuConfig.getLinkAntreanKlaim();
                                }
                            } catch (Exception unused) {
                            }
                            if (((CharSequence) objectRef.element).length() > 0) {
                                OutputConfigurationCompatApi33Impl.Companion companion3 = OutputConfigurationCompatApi33Impl.INSTANCE;
                                String string7 = alertDialogBuilder.getString(R.string.label_title_failed_biometric);
                                Intrinsics.checkNotNullExpressionValue(string7, "");
                                String string8 = alertDialogBuilder.getString(R.string.label_message_failed_biometrik);
                                Intrinsics.checkNotNullExpressionValue(string8, "");
                                String string9 = alertDialogBuilder.getString(R.string.action_queueing);
                                Intrinsics.checkNotNullExpressionValue(string9, "");
                                OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.img_failed_biometric, string7, string8, string9, (128 & 16) != 0 ? null : new Function0() { // from class: setSingleChoiceItems
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, objectRef);
                                    }
                                }, (128 & 32) != 0 ? null : alertDialogBuilder.getString(R.string.action_return), (128 & 64) != 0 ? null : new Function0() { // from class: performMenuItemShortcut
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                                    }
                                }, (128 & 128) != 0 ? false : false);
                                FragmentManager childFragmentManager2 = alertDialogBuilder.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                                Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                                if (childFragmentManager2.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                    outputConfigurationCompatApi33ImplB.show(childFragmentManager2, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                }
                            } else {
                                alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: initDelegate
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (String) obj);
                                    }
                                });
                            }
                        } else {
                            alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: initDelegate
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (String) obj);
                                }
                            });
                        }
                    } catch (Exception unused2) {
                    }
                } else {
                    alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: initDelegate
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (String) obj);
                        }
                    });
                }
            } else {
                alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                Toast.makeText(alertDialogBuilder.getContext(), String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            }
        } else {
            alertDialogBuilder.write();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = unsubscribe + 99;
        subscribe = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 73 / 0;
        }
        return unit;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        int i = 2 % 2;
        AlertDialogBuilder alertDialogBuilder = this;
        ((IntegerRes) this.b.getValue()).MediaBrowserCompat.observe(alertDialogBuilder, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: getResources
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.b.getValue()).b.observe(alertDialogBuilder, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: resolveDialogTheme
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertDialogBuilder.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        TuitionPaymentFragmentspecialinlinedviewModeldefault2().asInterface.observe(alertDialogBuilder, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: setCancelable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertDialogBuilder.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        TuitionPaymentFragmentspecialinlinedviewModeldefault2().notify.observe(alertDialogBuilder, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: setCursor
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        TuitionPaymentFragmentspecialinlinedviewModeldefault2().connect.observe(alertDialogBuilder, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: setMultiChoiceItems
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((ToolbarActionBarActionMenuPresenterCallback) this.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(alertDialogBuilder, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: setItems
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (TwilightManager) obj};
                return (Unit) AlertDialogBuilder.b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1730192603, -1730192598, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr);
            }
        }));
        int i2 = subscribe + 109;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        int i = 2 % 2;
        int i2 = subscribe + 125;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
        getCameraState.Companion companion = getCameraState.INSTANCE;
        String string = getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string, "");
        getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", p0, string);
        this.a = getcamerastateB;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i4 = subscribe + 49;
            unsubscribe = i4 % 128;
            int i5 = i4 % 2;
            getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        int i6 = subscribe + 25;
        unsubscribe = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void d() {
        AsikActiveParticipant asikActiveParticipantB;
        int i = 2 % 2;
        int i2 = unsubscribe + 113;
        subscribe = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = asInterface().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) this.asInterface.getValue();
        if (asikActiveParticipant != null) {
            asikActiveParticipantB = AsikActiveParticipant.b(asikActiveParticipant, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.cancelAll, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073, 31);
        } else {
            int i4 = subscribe + 87;
            unsubscribe = i4 % 128;
            int i5 = i4 % 2;
            asikActiveParticipantB = null;
        }
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol = new lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl(asikActiveParticipantB, null, 2, null);
        Intrinsics.checkNotNullParameter(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1<? super String, Unit> p0) {
        int i = 2 % 2;
        String string = ((getStreamUseCaseSupportedCombinationList) this.d.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL_INFOPENGADUAN", "");
        if (string.length() <= 0) {
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            p0.invoke(getMaxImages.run());
            getMaxImages getmaximages2 = getMaxImages.INSTANCE;
            p0.invoke(getMaxImages.run());
            int i2 = unsubscribe + 89;
            subscribe = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = unsubscribe + 35;
        subscribe = i4 % 128;
        if (i4 % 2 != 0) {
            p0.invoke(string);
            p0.invoke(string);
        } else {
            p0.invoke(string);
            p0.invoke(string);
            int i5 = 29 / 0;
        }
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentbindingInflater1(AlertDialogBuilder alertDialogBuilder) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(alertDialogBuilder.requireActivity());
        int i2 = unsubscribe + 87;
        subscribe = i2 % 128;
        int i3 = i2 % 2;
        return outputformattoaudioprofile;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        AlertDialogBuilder alertDialogBuilder = (AlertDialogBuilder) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = subscribe + 39;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
        if (bool.booleanValue()) {
            int i4 = subscribe + 51;
            unsubscribe = i4 % 128;
            if (i4 % 2 != 0) {
                ToolbarActionBarActionMenuPresenterCallback toolbarActionBarActionMenuPresenterCallback = (ToolbarActionBarActionMenuPresenterCallback) alertDialogBuilder.g.getValue();
                FragmentActivity fragmentActivityRequireActivity = alertDialogBuilder.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                toolbarActionBarActionMenuPresenterCallback.TuitionPaymentFragmentbindingInflater1(fragmentActivityRequireActivity);
                int i5 = 28 / 0;
            } else {
                ToolbarActionBarActionMenuPresenterCallback toolbarActionBarActionMenuPresenterCallback2 = (ToolbarActionBarActionMenuPresenterCallback) alertDialogBuilder.g.getValue();
                FragmentActivity fragmentActivityRequireActivity2 = alertDialogBuilder.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                toolbarActionBarActionMenuPresenterCallback2.TuitionPaymentFragmentbindingInflater1(fragmentActivityRequireActivity2);
            }
        } else {
            Context contextRequireContext = alertDialogBuilder.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String string = alertDialogBuilder.getString(R.string.message_camera_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(contextRequireContext, string);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault1(AlertDialogBuilder alertDialogBuilder) {
        int i = 2 % 2;
        int i2 = subscribe + 53;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = unsubscribe + 79;
        subscribe = i4 % 128;
        int i5 = i4 % 2;
        return userAsBinder;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        final AlertDialogBuilder alertDialogBuilder = (AlertDialogBuilder) objArr[0];
        final String str = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
        String string = alertDialogBuilder.getString(R.string.label_title_confirm_asik_dialog);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = alertDialogBuilder.getString(R.string.label_message_failed_biometrik_asik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = alertDialogBuilder.getString(R.string.action_booking_antrean_online);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.img_failed_biometric, string, string2, string3, (128 & 16) != 0 ? null : new Function0() { // from class: setRecycleOnMeasureEnabled
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertDialogBuilder.b(this.b, str);
            }
        }, (128 & 32) != 0 ? null : alertDialogBuilder.getString(R.string.action_return), (128 & 64) != 0 ? null : new Function0() { // from class: getContext
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
            }
        }, (128 & 128) != 0 ? false : false);
        FragmentManager childFragmentManager = alertDialogBuilder.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i2 = subscribe + 89;
            unsubscribe = i2 % 128;
            int i3 = i2 % 2;
            outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = subscribe + 33;
        unsubscribe = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0107  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x011d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    /* JADX WARN: Code duplicated, block: B:60:0x016d  */
    /* JADX WARN: Code duplicated, block: B:61:0x017a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0186  */
    /* JADX WARN: Code duplicated, block: B:65:0x018b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0191  */
    /* JADX WARN: Code duplicated, block: B:69:0x0194  */
    /* JADX WARN: Code duplicated, block: B:72:0x019a  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:88:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0231  */
    /* JADX WARN: Code duplicated, block: B:92:0x024c  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AlertDialogBuilder alertDialogBuilder, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        String str;
        User user;
        String str2;
        String string;
        BaseActivity baseActivity;
        User user2;
        String str3;
        SubmissionCheckItem submissionCheckItem;
        String str4;
        String str5;
        byte[] bArr;
        String str6;
        SubmissionCheckItem submissionCheckItem2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        int i;
        int i2 = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            alertDialogBuilder.IconCompatParcelizer();
        } else {
            Object obj = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i3 = subscribe + 75;
                unsubscribe = i3 % 128;
                int i4 = i3 % 2;
                alertDialogBuilder.write();
                String checkSum = ((KeyResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum();
                alertDialogBuilder.cancel = checkSum;
                if (checkSum == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    checkSum = null;
                }
                List listSplit$default = StringsKt.split$default((CharSequence) checkSum, new String[]{"#"}, false, 0, 6, (Object) null);
                String strJoinToString$default = alertDialogBuilder.write;
                if (strJoinToString$default == null) {
                    strJoinToString$default = "";
                }
                String str18 = alertDialogBuilder.MediaBrowserCompat;
                if (str18 == null) {
                    int i5 = unsubscribe + 13;
                    subscribe = i5 % 128;
                    if (i5 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    str18 = "";
                }
                String str19 = strJoinToString$default;
                if (!(!StringsKt.isBlank(str19)) || StringsKt.isBlank(str18) || StringsKt.equals(str18, "Indonesia", true)) {
                    if (StringsKt.isBlank(str19)) {
                        str = !StringsKt.isBlank(str18) ? str18 : "";
                    }
                    user = (User) alertDialogBuilder.asBinder.getValue();
                    if (user != null) {
                        str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.areEqual(String.valueOf(str2), listSplit$default.get(0))) {
                        final select selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        user2 = (User) alertDialogBuilder.asBinder.getValue();
                        if (user2 != null) {
                            str3 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        } else {
                            str3 = null;
                        }
                        String strValueOf = String.valueOf(str3);
                        submissionCheckItem = (SubmissionCheckItem) alertDialogBuilder.getRoot.getValue();
                        if (submissionCheckItem != null) {
                            str4 = submissionCheckItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        } else {
                            str4 = null;
                        }
                        str5 = alertDialogBuilder.INotificationSideChannel;
                        if (str5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str5 = null;
                        }
                        Object obj2 = listSplit$default.get(2);
                        StringBuilder sb = new StringBuilder("JMO#");
                        sb.append(str5);
                        sb.append("#true#70#");
                        sb.append(obj2);
                        String string2 = sb.toString();
                        String str20 = Build.BRAND;
                        Intrinsics.checkNotNullExpressionValue(str20, "");
                        Context contextRequireContext = alertDialogBuilder.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        String string3 = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                        Intrinsics.checkExpressionValueIsNotNull(string3, "");
                        String str21 = Build.MODEL;
                        Intrinsics.checkNotNullExpressionValue(str21, "");
                        String strValueOf2 = String.valueOf(Build.VERSION.SDK_INT);
                        String str22 = Build.MANUFACTURER;
                        Intrinsics.checkNotNullExpressionValue(str22, "");
                        bArr = alertDialogBuilder.cancelAll;
                        if (bArr != null) {
                            Intrinsics.checkNotNullParameter(bArr, "");
                            String strEncodeToString = android.util.Base64.encodeToString(bArr, 2);
                            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
                            str6 = strEncodeToString;
                        } else {
                            str6 = null;
                        }
                        submissionCheckItem2 = (SubmissionCheckItem) alertDialogBuilder.getRoot.getValue();
                        if (submissionCheckItem2 != null) {
                            str7 = submissionCheckItem2.g;
                        } else {
                            str7 = null;
                        }
                        str8 = alertDialogBuilder.INotificationSideChannelDefault;
                        if (str8 == null) {
                            str9 = "";
                        } else {
                            str9 = str8;
                        }
                        str10 = alertDialogBuilder.getInterfaceDescriptor;
                        if (str10 == null) {
                            int i6 = unsubscribe;
                            int i7 = i6 + 9;
                            subscribe = i7 % 128;
                            int i8 = i7 % 2;
                            i = i6 + 31;
                            subscribe = i % 128;
                            if (i % 2 == 0) {
                                int i9 = 4 % 5;
                            }
                            str11 = "";
                        } else {
                            str11 = str10;
                        }
                        str12 = alertDialogBuilder.INotificationSideChannelStub;
                        if (str12 == null) {
                            str13 = "";
                        } else {
                            str13 = str12;
                        }
                        str14 = alertDialogBuilder.IconCompatParcelizer;
                        if (str14 == null) {
                            str15 = "";
                        } else {
                            str15 = str14;
                        }
                        str16 = alertDialogBuilder.connect;
                        if (str16 == null) {
                            int i10 = subscribe;
                            int i11 = i10 + 59;
                            unsubscribe = i11 % 128;
                            int i12 = i11 % 2;
                            int i13 = i10 + 93;
                            unsubscribe = i13 % 128;
                            int i14 = i13 % 2;
                            str17 = "";
                        } else {
                            str17 = str16;
                        }
                        AsikVerificationLivenessOnly asikVerificationLivenessOnly = new AsikVerificationLivenessOnly(strValueOf, str4, string2, str20, string3, str21, strValueOf2, str22, str6, str7, str9, str11, str13, str15, str17, str);
                        Intrinsics.checkNotNullParameter(asikVerificationLivenessOnly, "");
                        MutableLiveData<VirtualCameraAdapter1<AsikVerifivationLivenessOnlyResponse>> mutableLiveData = selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.notify;
                        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.d.TuitionPaymentFragmentbindingInflater1(asikVerificationLivenessOnly)));
                        final Function1 function1 = new Function1() { // from class: onOptionsItemSelected
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return select.TuitionPaymentFragmentbindingInflater1(selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, (AsikVerifivationLivenessOnlyResponse) obj3);
                            }
                        };
                        logToString logtostring = new logToString() { // from class: setDrawerArrowDrawable
                            @Override // defpackage.logToString
                            public final void accept(Object obj3) {
                                function1.invoke(obj3);
                            }
                        };
                        final Function1 function2 = new Function1() { // from class: setToolbarNavigationClickListener
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return select.d(selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj3);
                            }
                        };
                        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: syncState
                            @Override // defpackage.logToString
                            public final void accept(Object obj3) {
                                function2.invoke(obj3);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                        selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    } else {
                        AlertDialogBuilder alertDialogBuilder2 = alertDialogBuilder;
                        string = alertDialogBuilder.getString(R.string.message_integrity_data);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        Intrinsics.checkNotNullParameter(alertDialogBuilder2, "");
                        Intrinsics.checkNotNullParameter(string, "");
                        baseActivity = (BaseActivity) alertDialogBuilder2.getContext();
                        if (baseActivity != null) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, string, null);
                            int i15 = unsubscribe + 123;
                            subscribe = i15 % 128;
                            int i16 = i15 % 2;
                        }
                    }
                } else {
                    List listListOf = CollectionsKt.listOf((Object[]) new String[]{strJoinToString$default, str18});
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listListOf.iterator();
                    while (!(!it.hasNext())) {
                        Object next = it.next();
                        if (!StringsKt.isBlank((String) next)) {
                            arrayList.add(next);
                        }
                    }
                    strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
                }
                str = strJoinToString$default;
                user = (User) alertDialogBuilder.asBinder.getValue();
                if (user != null) {
                    str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    str2 = null;
                }
                if (Intrinsics.areEqual(String.valueOf(str2), listSplit$default.get(0))) {
                    final select selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    user2 = (User) alertDialogBuilder.asBinder.getValue();
                    if (user2 != null) {
                        str3 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        str3 = null;
                    }
                    String strValueOf3 = String.valueOf(str3);
                    submissionCheckItem = (SubmissionCheckItem) alertDialogBuilder.getRoot.getValue();
                    if (submissionCheckItem != null) {
                        str4 = submissionCheckItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    } else {
                        str4 = null;
                    }
                    str5 = alertDialogBuilder.INotificationSideChannel;
                    if (str5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str5 = null;
                    }
                    Object obj3 = listSplit$default.get(2);
                    StringBuilder sb2 = new StringBuilder("JMO#");
                    sb2.append(str5);
                    sb2.append("#true#70#");
                    sb2.append(obj3);
                    String string4 = sb2.toString();
                    String str23 = Build.BRAND;
                    Intrinsics.checkNotNullExpressionValue(str23, "");
                    Context contextRequireContext2 = alertDialogBuilder.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    String string5 = Settings.Secure.getString(contextRequireContext2.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string5, "");
                    String str24 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(str24, "");
                    String strValueOf4 = String.valueOf(Build.VERSION.SDK_INT);
                    String str25 = Build.MANUFACTURER;
                    Intrinsics.checkNotNullExpressionValue(str25, "");
                    bArr = alertDialogBuilder.cancelAll;
                    if (bArr != null) {
                        Intrinsics.checkNotNullParameter(bArr, "");
                        String strEncodeToString2 = android.util.Base64.encodeToString(bArr, 2);
                        Intrinsics.checkNotNullExpressionValue(strEncodeToString2, "");
                        str6 = strEncodeToString2;
                    } else {
                        str6 = null;
                    }
                    submissionCheckItem2 = (SubmissionCheckItem) alertDialogBuilder.getRoot.getValue();
                    if (submissionCheckItem2 != null) {
                        str7 = submissionCheckItem2.g;
                    } else {
                        str7 = null;
                    }
                    str8 = alertDialogBuilder.INotificationSideChannelDefault;
                    if (str8 == null) {
                        str9 = "";
                    } else {
                        str9 = str8;
                    }
                    str10 = alertDialogBuilder.getInterfaceDescriptor;
                    if (str10 == null) {
                        int i17 = unsubscribe;
                        int i18 = i17 + 9;
                        subscribe = i18 % 128;
                        int i19 = i18 % 2;
                        i = i17 + 31;
                        subscribe = i % 128;
                        if (i % 2 == 0) {
                            int i20 = 4 % 5;
                        }
                        str11 = "";
                    } else {
                        str11 = str10;
                    }
                    str12 = alertDialogBuilder.INotificationSideChannelStub;
                    if (str12 == null) {
                        str13 = "";
                    } else {
                        str13 = str12;
                    }
                    str14 = alertDialogBuilder.IconCompatParcelizer;
                    if (str14 == null) {
                        str15 = "";
                    } else {
                        str15 = str14;
                    }
                    str16 = alertDialogBuilder.connect;
                    if (str16 == null) {
                        int i110 = subscribe;
                        int i111 = i110 + 59;
                        unsubscribe = i111 % 128;
                        int i112 = i111 % 2;
                        int i113 = i110 + 93;
                        unsubscribe = i113 % 128;
                        int i114 = i113 % 2;
                        str17 = "";
                    } else {
                        str17 = str16;
                    }
                    AsikVerificationLivenessOnly asikVerificationLivenessOnly2 = new AsikVerificationLivenessOnly(strValueOf3, str4, string4, str23, string5, str24, strValueOf4, str25, str6, str7, str9, str11, str13, str15, str17, str);
                    Intrinsics.checkNotNullParameter(asikVerificationLivenessOnly2, "");
                    MutableLiveData<VirtualCameraAdapter1<AsikVerifivationLivenessOnlyResponse>> mutableLiveData2 = selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault3.notify;
                    VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault3.d.TuitionPaymentFragmentbindingInflater1(asikVerificationLivenessOnly2)));
                    final Function1 function3 = new Function1() { // from class: onOptionsItemSelected
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return select.TuitionPaymentFragmentbindingInflater1(selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, (AsikVerifivationLivenessOnlyResponse) obj4);
                        }
                    };
                    logToString logtostring2 = new logToString() { // from class: setDrawerArrowDrawable
                        @Override // defpackage.logToString
                        public final void accept(Object obj4) {
                            function3.invoke(obj4);
                        }
                    };
                    final Function1 function4 = new Function1() { // from class: setToolbarNavigationClickListener
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return select.d(selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj4);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: syncState
                        @Override // defpackage.logToString
                        public final void accept(Object obj4) {
                            function4.invoke(obj4);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                    selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                } else {
                    AlertDialogBuilder alertDialogBuilder3 = alertDialogBuilder;
                    string = alertDialogBuilder.getString(R.string.message_integrity_data);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    Intrinsics.checkNotNullParameter(alertDialogBuilder3, "");
                    Intrinsics.checkNotNullParameter(string, "");
                    baseActivity = (BaseActivity) alertDialogBuilder3.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, string, null);
                        int i115 = unsubscribe + 123;
                        subscribe = i115 % 128;
                        int i116 = i115 % 2;
                    }
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                alertDialogBuilder.write();
                AlertDialogBuilder alertDialogBuilder4 = alertDialogBuilder;
                String strValueOf5 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(alertDialogBuilder4, "");
                Intrinsics.checkNotNullParameter(strValueOf5, "");
                BaseActivity baseActivity2 = (BaseActivity) alertDialogBuilder4.getContext();
                if (baseActivity2 != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strValueOf5, null);
                }
            } else {
                alertDialogBuilder.write();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(AlertDialogBuilder alertDialogBuilder) {
        int i = 2 % 2;
        int i2 = subscribe + 81;
        unsubscribe = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            BaseActivity baseActivity = alertDialogBuilder.TuitionPaymentFragmentbindingInflater1;
            throw null;
        }
        BaseActivity baseActivity2 = alertDialogBuilder.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity2 != null) {
            int i3 = subscribe + 117;
            unsubscribe = i3 % 128;
            if (i3 % 2 != 0) {
                baseActivity2.d_();
                obj.hashCode();
                throw null;
            }
            baseActivity2.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(AlertDialogBuilder alertDialogBuilder, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        int i2 = subscribe + 23;
        unsubscribe = i2 % 128;
        String str4 = null;
        if (i2 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            str4.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_time_server_biometric", "loading_time_server_biometric_asik"));
            Intrinsics.checkNotNullParameter("loading_time_server_biometric_asik", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_time_server_biometric_asik", mapMutableMapOf);
            alertDialogBuilder.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_time_server_asik", "success_time_server_biometric_asik"));
            Intrinsics.checkNotNullParameter("success_time_server_asik", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_time_server_asik", mapMutableMapOf2);
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            alertDialogBuilder.INotificationSideChannel = ((BaseItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
            if (alertDialogBuilder.RemoteActionCompatParcelizer) {
                alertDialogBuilder.INotificationSideChannel = ((BaseItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
                IntegerRes integerRes = (IntegerRes) alertDialogBuilder.b.getValue();
                User user = (User) alertDialogBuilder.asBinder.getValue();
                str4 = user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append("#pengkinian");
                integerRes.b(new KeyRequest(sb.toString()));
            } else {
                final select selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                User user2 = (User) alertDialogBuilder.asBinder.getValue();
                if (user2 != null) {
                    int i3 = unsubscribe + 125;
                    subscribe = i3 % 128;
                    int i4 = i3 % 2;
                    str = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    str = null;
                }
                String strValueOf = String.valueOf(str);
                SubmissionCheckItem submissionCheckItem = (SubmissionCheckItem) alertDialogBuilder.getRoot.getValue();
                if (submissionCheckItem != null) {
                    int i5 = subscribe + 103;
                    unsubscribe = i5 % 128;
                    if (i5 % 2 != 0) {
                        String str5 = submissionCheckItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        throw null;
                    }
                    str2 = submissionCheckItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    str2 = null;
                }
                SubmissionCheckItem submissionCheckItem2 = (SubmissionCheckItem) alertDialogBuilder.getRoot.getValue();
                if (submissionCheckItem2 != null) {
                    int i6 = subscribe + 79;
                    unsubscribe = i6 % 128;
                    int i7 = i6 % 2;
                    str3 = submissionCheckItem2.g;
                } else {
                    str3 = null;
                }
                AsikVerificationLivenessBegin asikVerificationLivenessBegin = new AsikVerificationLivenessBegin(strValueOf, str2, str3);
                Intrinsics.checkNotNullParameter(asikVerificationLivenessBegin, "");
                MutableLiveData<VirtualCameraAdapter1<AsikVerifivationLivenessOnlyResponse>> mutableLiveData = selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.d.b(asikVerificationLivenessBegin)));
                final Function1 function1 = new Function1() { // from class: getThemeUpIndicator
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return select.TuitionPaymentFragmentspecialinlinedviewModeldefault2(selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, (AsikVerifivationLivenessOnlyResponse) obj);
                    }
                };
                logToString logtostring = new logToString() { // from class: isDrawerIndicatorEnabled
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function1.invoke(obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: setPosition
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return select.g(selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getDrawerArrowDrawable
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function2.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                selectVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_time_server_asik", "failure_time_server_asik"));
            Intrinsics.checkNotNullParameter("failure_time_server_asik", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_time_server_asik", mapMutableMapOf3);
            alertDialogBuilder.write();
            AlertDialogBuilder alertDialogBuilder2 = alertDialogBuilder;
            String strValueOf2 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(alertDialogBuilder2, "");
            Intrinsics.checkNotNullParameter(strValueOf2, "");
            BaseActivity baseActivity = (BaseActivity) alertDialogBuilder2.getContext();
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf2, null);
            }
        } else {
            alertDialogBuilder.write();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r3
  0x001b: PHI (r3v2 com.nbs.nucleosnucleo.presentation.BaseActivity) = (r3v1 com.nbs.nucleosnucleo.presentation.BaseActivity), (r3v5 com.nbs.nucleosnucleo.presentation.BaseActivity) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Unit b(AlertDialogBuilder alertDialogBuilder) {
        BaseActivity baseActivity;
        int i;
        int i2 = 2 % 2;
        int i3 = unsubscribe + 67;
        subscribe = i3 % 128;
        if (i3 % 2 == 0) {
            baseActivity = alertDialogBuilder.TuitionPaymentFragmentbindingInflater1;
            int i4 = 71 / 0;
            if (baseActivity != null) {
                i = unsubscribe + 1;
                subscribe = i % 128;
                if (i % 2 != 0) {
                    baseActivity.d_();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                baseActivity.d_();
            }
        } else {
            baseActivity = alertDialogBuilder.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                i = unsubscribe + 1;
                subscribe = i % 128;
                if (i % 2 != 0) {
                    baseActivity.d_();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                baseActivity.d_();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i5 = unsubscribe + 3;
        subscribe = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(AlertDialogBuilder alertDialogBuilder) {
        int i = 2 % 2;
        BaseActivity baseActivity = alertDialogBuilder.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            int i2 = subscribe + 85;
            unsubscribe = i2 % 128;
            int i3 = i2 % 2;
            baseActivity.d_();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = subscribe + 109;
        unsubscribe = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit notify(AlertDialogBuilder alertDialogBuilder) {
        int i = 2 % 2;
        int i2 = subscribe + 97;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity baseActivity = alertDialogBuilder.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            int i4 = unsubscribe + 95;
            subscribe = i4 % 128;
            int i5 = i4 % 2;
            baseActivity.d_();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = subscribe + 97;
        unsubscribe = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit asBinder(AlertDialogBuilder alertDialogBuilder) {
        int i = 2 % 2;
        int i2 = subscribe + 73;
        unsubscribe = i2 % 128;
        if (i2 % 2 == 0) {
            ((IntegerRes) alertDialogBuilder.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return Unit.INSTANCE;
        }
        ((IntegerRes) alertDialogBuilder.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ generateConfigDelta_colorMode d(AlertDialogBuilder alertDialogBuilder) {
        int i = 2 % 2;
        int i2 = subscribe + 3;
        unsubscribe = i2 % 128;
        if (i2 % 2 == 0) {
            generateConfigDelta_colorMode.Companion companion = generateConfigDelta_colorMode.INSTANCE;
            String string = alertDialogBuilder.getString(R.string.label_process_verification_ekyc);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = alertDialogBuilder.getString(R.string.info_sending_data);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return generateConfigDelta_colorMode.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string, string2);
        }
        generateConfigDelta_colorMode.Companion companion2 = generateConfigDelta_colorMode.INSTANCE;
        String string3 = alertDialogBuilder.getString(R.string.label_process_verification_ekyc);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = alertDialogBuilder.getString(R.string.info_sending_data);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        generateConfigDelta_colorMode.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string3, string4);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AsikActiveParticipant g(AlertDialogBuilder alertDialogBuilder) {
        AsikActiveParticipant value;
        int i = 2 % 2;
        int i2 = unsubscribe + 51;
        subscribe = i2 % 128;
        if (i2 % 2 == 0) {
            value = ((setTabListener) alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            int i3 = 9 / 0;
        } else {
            value = ((setTabListener) alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        }
        int i4 = unsubscribe + 47;
        subscribe = i4 % 128;
        if (i4 % 2 != 0) {
            return value;
        }
        throw null;
    }

    public static /* synthetic */ SubmissionCheckItem a(AlertDialogBuilder alertDialogBuilder) {
        int i = 2 % 2;
        int i2 = unsubscribe + 35;
        subscribe = i2 % 128;
        int i3 = i2 % 2;
        SubmissionCheckItem submissionCheckItemTuitionPaymentFragmentbindingInflater1 = alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2().d.TuitionPaymentFragmentbindingInflater1();
        int i4 = subscribe + 51;
        unsubscribe = i4 % 128;
        if (i4 % 2 == 0) {
            return submissionCheckItemTuitionPaymentFragmentbindingInflater1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = unsubscribe + 69;
        subscribe = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = unsubscribe + 15;
        subscribe = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit asInterface(AlertDialogBuilder alertDialogBuilder) {
        int i = 2 % 2;
        if (alertDialogBuilder.cancelAll != null) {
            int i2 = subscribe + 63;
            unsubscribe = i2 % 128;
            int i3 = i2 % 2;
            if (alertDialogBuilder.asInterface().btnNext.isEnabled()) {
                int i4 = subscribe + 69;
                unsubscribe = i4 % 128;
                int i5 = i4 % 2;
                AsikActiveParticipant asikActiveParticipant = (AsikActiveParticipant) alertDialogBuilder.asInterface.getValue();
                AsikActiveParticipant asikActiveParticipantB = asikActiveParticipant != null ? AsikActiveParticipant.b(asikActiveParticipant, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, alertDialogBuilder.cancelAll, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073, 31) : null;
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol = new lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl(asikActiveParticipantB, null, 2, null);
                Intrinsics.checkNotNullParameter(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol, "");
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol);
            }
        } else {
            String string = alertDialogBuilder.getString(R.string.error_message_selfie_photo_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getCameraState.Companion companion2 = getCameraState.INSTANCE;
            String string2 = alertDialogBuilder.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", string, string2);
            FragmentManager childFragmentManager = alertDialogBuilder.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AlertDialogBuilder alertDialogBuilder, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        alertDialogBuilder.IconCompatParcelizer = String.valueOf(userLocationComplete.b);
        alertDialogBuilder.connect = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object obj = null;
        if (locationAddressInfo != null) {
            int i2 = subscribe + 29;
            unsubscribe = i2 % 128;
            if (i2 % 2 != 0) {
                String str5 = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                obj.hashCode();
                throw null;
            }
            str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        alertDialogBuilder.write = str;
        alertDialogBuilder.read = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        } else {
            int i3 = unsubscribe + 81;
            subscribe = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        alertDialogBuilder.MediaBrowserCompat = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        alertDialogBuilder.disconnect = str4;
        String str6 = alertDialogBuilder.IconCompatParcelizer;
        String str7 = alertDialogBuilder.connect;
        String str8 = alertDialogBuilder.write;
        String str9 = alertDialogBuilder.read;
        String str10 = alertDialogBuilder.MediaBrowserCompat;
        StringBuilder sb = new StringBuilder("Location from GPS: ");
        sb.append(str6);
        sb.append(", ");
        sb.append(str7);
        sb.append(", City: ");
        sb.append(str8);
        sb.append(", Province: ");
        sb.append(str9);
        sb.append(", Country: ");
        sb.append(str10);
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(AlertDialogBuilder alertDialogBuilder, String str) {
        int i = 2 % 2;
        int i2 = subscribe + 81;
        unsubscribe = i2 % 128;
        if (i2 % 2 != 0) {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            Context contextRequireContext = alertDialogBuilder.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, str, "Appointment Online", 0, null, false, 38);
            return Unit.INSTANCE;
        }
        WebviewCustomActivity.Companion companion2 = WebviewCustomActivity.INSTANCE;
        Context contextRequireContext2 = alertDialogBuilder.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext2, str, "Appointment Online", 0, null, false, 56);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0062  */
    /* JADX WARN: Code duplicated, block: B:9:0x0053 A[PHI: r12
  0x0053: PHI (r12v5 com.nbs.nucleosnucleo.presentation.BaseActivity) = (r12v4 com.nbs.nucleosnucleo.presentation.BaseActivity), (r12v8 com.nbs.nucleosnucleo.presentation.BaseActivity) binds: [B:8:0x0051, B:5:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        BaseActivity baseActivity;
        int i;
        AlertDialogBuilder alertDialogBuilder = (AlertDialogBuilder) objArr[0];
        Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[1];
        int i2 = 2 % 2;
        int i3 = subscribe + 59;
        unsubscribe = i3 % 128;
        if (i3 % 2 != 0) {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            Context contextRequireContext = alertDialogBuilder.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (String) objectRef.element, "Appointment Online", 0, null, true, 0);
            baseActivity = alertDialogBuilder.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                i = unsubscribe + 49;
                subscribe = i % 128;
                if (i % 2 != 0) {
                    baseActivity.d_();
                    throw null;
                }
                baseActivity.d_();
            }
        } else {
            WebviewCustomActivity.Companion companion2 = WebviewCustomActivity.INSTANCE;
            Context contextRequireContext2 = alertDialogBuilder.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext2, (String) objectRef.element, "Appointment Online", 0, null, false, 56);
            baseActivity = alertDialogBuilder.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                i = unsubscribe + 49;
                subscribe = i % 128;
                if (i % 2 != 0) {
                    baseActivity.d_();
                    throw null;
                }
                baseActivity.d_();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = unsubscribe + 31;
        subscribe = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
    /* JADX WARN: Code duplicated, block: B:12:0x0057  */
    /* JADX WARN: Code duplicated, block: B:9:0x0048 A[PHI: r10
  0x0048: PHI (r10v2 com.nbs.nucleosnucleo.presentation.BaseActivity) = (r10v1 com.nbs.nucleosnucleo.presentation.BaseActivity), (r10v5 com.nbs.nucleosnucleo.presentation.BaseActivity) binds: [B:8:0x0046, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AlertDialogBuilder alertDialogBuilder, Ref.ObjectRef objectRef) {
        BaseActivity baseActivity;
        int i;
        int i2 = 2 % 2;
        int i3 = unsubscribe + 97;
        subscribe = i3 % 128;
        if (i3 % 2 == 0) {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            Context contextRequireContext = alertDialogBuilder.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (String) objectRef.element, "Appointment Online", 1, null, false, 6);
            baseActivity = alertDialogBuilder.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                i = subscribe + 3;
                unsubscribe = i % 128;
                if (i % 2 == 0) {
                    baseActivity.d_();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                baseActivity.d_();
            }
        } else {
            WebviewCustomActivity.Companion companion2 = WebviewCustomActivity.INSTANCE;
            Context contextRequireContext2 = alertDialogBuilder.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext2, (String) objectRef.element, "Appointment Online", 0, null, false, 56);
            baseActivity = alertDialogBuilder.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                i = subscribe + 3;
                unsubscribe = i % 128;
                if (i % 2 == 0) {
                    baseActivity.d_();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                baseActivity.d_();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = subscribe + 123;
        unsubscribe = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(final AlertDialogBuilder alertDialogBuilder, final String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
        String string = alertDialogBuilder.getString(R.string.label_title_confirm_asik_dialog);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = alertDialogBuilder.getString(R.string.label_message_failed_biometrik_asik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = alertDialogBuilder.getString(R.string.action_booking_antrean_online);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.img_failed_biometric, string, string2, string3, (128 & 16) != 0 ? null : new Function0() { // from class: setNegativeButtonIcon
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, str);
            }
        }, (128 & 32) != 0 ? null : alertDialogBuilder.getString(R.string.action_return), (128 & 64) != 0 ? null : new Function0() { // from class: AppCompatActivity
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertDialogBuilder.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }, (128 & 128) != 0 ? false : false);
        FragmentManager childFragmentManager = alertDialogBuilder.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            outputConfigurationCompatApi33ImplB.show(childFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i2 = subscribe + 57;
            unsubscribe = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = unsubscribe + 7;
        subscribe = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(AlertDialogBuilder alertDialogBuilder, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = unsubscribe + 83;
            subscribe = i2 % 128;
            int i3 = i2 % 2;
            ((generateConfigDelta_colorMode) alertDialogBuilder.notify.getValue()).setCancelable(false);
            generateConfigDelta_colorMode generateconfigdelta_colormode = (generateConfigDelta_colorMode) alertDialogBuilder.notify.getValue();
            FragmentManager childFragmentManager = alertDialogBuilder.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(generateconfigdelta_colormode.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                generateconfigdelta_colormode.show(childFragmentManager, generateconfigdelta_colormode.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            str = "loading_asik_step_second_ekyc_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = subscribe + 93;
            unsubscribe = i4 % 128;
            int i5 = i4 % 2;
            ((generateConfigDelta_colorMode) alertDialogBuilder.notify.getValue()).dismiss();
            alertDialogBuilder.d();
            str = "success_asik_step_second_ekyc_result";
        } else if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            str = "";
        } else {
            ((generateConfigDelta_colorMode) alertDialogBuilder.notify.getValue()).dismiss();
            alertDialogBuilder.onTransact = null;
            File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraCoordinatorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.exists()) {
                int i6 = subscribe + 5;
                unsubscribe = i6 % 128;
                if (i6 % 2 != 0) {
                    FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i7 = 18 / 0;
                } else {
                    FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                int i8 = unsubscribe + 23;
                subscribe = i8 % 128;
                int i9 = i8 % 2;
            }
            FragmentAsikActiveParticipantBiometricDataBinding fragmentAsikActiveParticipantBiometricDataBindingAsInterface = alertDialogBuilder.asInterface();
            fragmentAsikActiveParticipantBiometricDataBindingAsInterface.imgSelfiePhoto.setImageResource(0);
            fragmentAsikActiveParticipantBiometricDataBindingAsInterface.imgLivenessCheck.setVisibility(0);
            fragmentAsikActiveParticipantBiometricDataBindingAsInterface.tvLivenessCheckLabel.setVisibility(0);
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            Toast.makeText(alertDialogBuilder.getContext(), String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            str = "failure_asik_step_second_ekyc_result";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_asik_step_second", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(AlertDialogBuilder alertDialogBuilder, String str) {
        Unit unit;
        int i = 2 % 2;
        int i2 = subscribe + 39;
        unsubscribe = i2 % 128;
        if (i2 % 2 != 0) {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            Context contextRequireContext = alertDialogBuilder.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, str, "Appointment Online", 1, null, false, 102);
            unit = Unit.INSTANCE;
        } else {
            WebviewCustomActivity.Companion companion2 = WebviewCustomActivity.INSTANCE;
            Context contextRequireContext2 = alertDialogBuilder.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext2, str, "Appointment Online", 0, null, false, 56);
            unit = Unit.INSTANCE;
        }
        int i3 = subscribe + 39;
        unsubscribe = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AlertDialogBuilder alertDialogBuilder = (AlertDialogBuilder) objArr[0];
        TwilightManager twilightManager = (TwilightManager) objArr[1];
        int i = 2 % 2;
        if (twilightManager instanceof TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) twilightManager).TuitionPaymentFragmentbindingInflater1);
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_next_step_second_asik", "submit_asik_step_second_ekyc"));
            Intrinsics.checkNotNullParameter("submit_asik_step_second_ekyc", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("submit_asik_step_second_ekyc", mapMutableMapOf);
            alertDialogBuilder.RemoteActionCompatParcelizer = true;
            ((IntegerRes) alertDialogBuilder.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i2 = unsubscribe + 33;
            subscribe = i2 % 128;
            int i3 = i2 % 2;
        } else {
            if (!(twilightManager instanceof TwilightManager.TuitionPaymentFragmentbindingInflater1)) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = subscribe + 85;
            unsubscribe = i4 % 128;
            if (i4 % 2 != 0) {
                ((TwilightManager.TuitionPaymentFragmentbindingInflater1) twilightManager).b.getImageBytes();
                throw null;
            }
            TwilightManager.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TwilightManager.TuitionPaymentFragmentbindingInflater1) twilightManager;
            if (tuitionPaymentFragmentbindingInflater1.b.getImageBytes() != null) {
                alertDialogBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1.b);
                alertDialogBuilder.RemoteActionCompatParcelizer = true;
                ((IntegerRes) alertDialogBuilder.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                MaterialButton materialButton = alertDialogBuilder.asInterface().btnNext;
                Intrinsics.checkNotNullExpressionValue(materialButton, "");
                MaterialButton materialButton2 = materialButton;
                Intrinsics.checkNotNullParameter(materialButton2, "");
                materialButton2.setEnabled(false);
            } else if (!alertDialogBuilder.asInterface().btnNext.isEnabled()) {
                alertDialogBuilder.cancelAll = null;
                File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraCoordinatorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.exists()) {
                    FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                FragmentAsikActiveParticipantBiometricDataBinding fragmentAsikActiveParticipantBiometricDataBindingAsInterface = alertDialogBuilder.asInterface();
                fragmentAsikActiveParticipantBiometricDataBindingAsInterface.imgSelfiePhoto.setImageResource(0);
                fragmentAsikActiveParticipantBiometricDataBindingAsInterface.imgLivenessCheck.setVisibility(0);
                fragmentAsikActiveParticipantBiometricDataBindingAsInterface.tvLivenessCheckLabel.setVisibility(0);
                int i5 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                StringBuilder sb = new StringBuilder();
                sb.append(i5);
                sb.append(": ");
                sb.append(str);
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), sb.toString(), 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = unsubscribe + 53;
        subscribe = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
        } else {
            function1.invoke(obj);
            int i3 = 99 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0064  */
    public static /* synthetic */ Unit INotificationSideChannel(AlertDialogBuilder alertDialogBuilder) throws IOException {
        int i = 2 % 2;
        int i2 = unsubscribe + 71;
        subscribe = i2 % 128;
        int i3 = i2 % 2;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) alertDialogBuilder.getItem.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null) {
            int i4 = unsubscribe + 19;
            subscribe = i4 % 128;
            int i5 = i4 % 2;
            if (camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                alertDialogBuilder.IconCompatParcelizer = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
                alertDialogBuilder.connect = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                alertDialogBuilder.write = camera2CameraControlExternalSyntheticLambda4B.b;
                alertDialogBuilder.read = camera2CameraControlExternalSyntheticLambda4B.g;
                alertDialogBuilder.MediaBrowserCompat = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                alertDialogBuilder.disconnect = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str = alertDialogBuilder.IconCompatParcelizer;
                String str2 = alertDialogBuilder.connect;
                StringBuilder sb = new StringBuilder("Location from cache: ");
                sb.append(str);
                sb.append(", ");
                sb.append(str2);
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
            } else {
                alertDialogBuilder.IconCompatParcelizer = "0.0";
                alertDialogBuilder.connect = "0.0";
                ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
            }
        } else {
            alertDialogBuilder.IconCompatParcelizer = "0.0";
            alertDialogBuilder.connect = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop3 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(AlertDialogBuilder alertDialogBuilder, Boolean bool) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1449358011, 1449358011, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{alertDialogBuilder, bool});
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(AlertDialogBuilder alertDialogBuilder, String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1906754168, -1906754164, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{alertDialogBuilder, str});
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(AlertDialogBuilder alertDialogBuilder, TwilightManager twilightManager) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1730192603, -1730192598, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{alertDialogBuilder, twilightManager});
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(AlertDialogBuilder alertDialogBuilder, Ref.ObjectRef objectRef) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1646141838, 1646141841, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{alertDialogBuilder, objectRef});
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(AlertDialogBuilder alertDialogBuilder, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = subscribe + 99;
        unsubscribe = i2 % 128;
        int i3 = i2 % 2;
        Unit unitD = d(alertDialogBuilder, virtualCameraAdapter1);
        int i4 = unsubscribe + 121;
        subscribe = i4 % 128;
        int i5 = i4 % 2;
        return unitD;
    }

    public static /* synthetic */ Unit onTransact(AlertDialogBuilder alertDialogBuilder) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1124669720, 1124669726, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{alertDialogBuilder});
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(AlertDialogBuilder alertDialogBuilder, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = unsubscribe + 39;
        subscribe = i2 % 128;
        if (i2 % 2 != 0) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            return (Unit) b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1854389353, 1854389355, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{alertDialogBuilder, virtualCameraAdapter1});
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        handleMessage = 0;
        TuitionPaymentFragmentbindingInflater1();
        INSTANCE = new Companion(null);
        int i = setCallbacksMessenger + 49;
        handleMessage = i % 128;
        int i2 = i % 2;
    }

    private static final Unit g(AlertDialogBuilder alertDialogBuilder, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1854389353, 1854389355, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{alertDialogBuilder, virtualCameraAdapter1});
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1215522107, 1215522114, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this});
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        int i = 2 % 2;
        int i2 = unsubscribe + 75;
        subscribe = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        int i = 2 % 2;
        int i2 = unsubscribe + 59;
        subscribe = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        b(FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1134018812, 1134018813, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this});
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        getSessionToken = new char[]{60088, 60052, 60043, 60091, 60060, 60050, 60053, 60054, 60055, 60045, 60117, 60047, 60040, 60049, 60058, 60083, 60072, 60051, 60062, 60034, 60073, 60056, 60048, 60041, 60063};
        isConnected = (char) 57188;
    }

    private static String $$g(short s, int i, short s2) {
        int i2 = s + 113;
        int i3 = 3 - (s2 * 2);
        int i4 = i * 2;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = i5 + i2;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            i3++;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i3];
        }
    }
}
