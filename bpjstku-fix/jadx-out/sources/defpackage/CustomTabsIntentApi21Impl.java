package defpackage;

import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.queueing.model.response.AntrianData;
import com.bpjstku.data.queueing.model.response.GetDataAntrianResponse;
import com.bpjstku.data.registration.general.model.request.MembershipCheckRequest;
import com.bpjstku.data.registration.general.model.request.OcrKtpRequest;
import com.bpjstku.data.registration.general.model.response.MembershipCheckItem;
import com.bpjstku.data.registration.general.model.response.OcrKtpResponse;
import com.bpjstku.data.registration.general.model.response.ResultOcr;
import com.bpjstku.databinding.FragmentNonSalariedWorkerPersonalDataBinding;
import com.bpjstku.domain.registration.general.model.MembershipCheckNew;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.salariedworker.KtpCameraActivity;
import com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity;
import com.bpjstku.presentation.membership.registration.salariedworker.NonSalariedWorkerPersonalDataFragment$bindingInflater$1;
import com.bpjstku.presentation.queueing.BookingAntreanFormActivity;
import com.bpjstku.presentation.queueing.BookingAntreanSuccessActivity;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.google.android.gms.common.internal.zaq;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getFocusY;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.getUntrustedCreatorPackageName;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import defpackage.setSplitTrack;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0015\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0018\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0015\u0010\u001b\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0015\u0010\u0010\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001a\u0010%\u001a\u00020 8\u0015X\u0095D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R.\u0010#\u001a\u001c\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020&8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010,R\u0016\u0010\b\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010)\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u00100R\u0016\u0010!\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u00102R\u0016\u0010\n\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u00102R\u0016\u0010\t\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u0010\u0007\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0016\u0010\u0006\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u00102R\u0016\u0010\u000b\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u00102R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0018\u0010\r\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u00102R\u0018\u0010\f\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0018\u0010\u001a\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u00102R\u0018\u0010\u0017\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00102R\u001e\u00105\u001a\f\u0012\b\u0012\u0006*\u00020707068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006*\u00020707068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108"}, d2 = {"LCustomTabsIntentApi21Impl;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentNonSalariedWorkerPersonalDataBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "INotificationSideChannel", "cancel", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Z)V", "Lcom/bpjstku/data/lib/PreferenceManager;", "read", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LsetSplitTrack;", "write", "TuitionPaymentFragmentbindingInflater1", "LgetUntrustedCreatorPackageName;", "connect", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetStreamUseCaseSupportedCombinationList;", "MediaBrowserCompat", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "b", "", "notify", "I", "asBinder", "()I", "asInterface", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "d", "()Lkotlin/jvm/functions/Function3;", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "a", "Z", "Ljava/io/File;", "Ljava/io/File;", "", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "INotificationSideChannelStub", "IconCompatParcelizer", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResultLauncher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomTabsIntentApi21Impl extends AutoValue_ImmutableImageInfo<FragmentNonSalariedWorkerPersonalDataBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int disconnect;
    private static long getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> IconCompatParcelizer;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private String onTransact;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private String cancelAll;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private String cancel;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Calendar a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String connect;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String INotificationSideChannelStub;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean g;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private File d;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String getInterfaceDescriptor;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private String notify;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final int asInterface;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> MediaBrowserCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$d = {104, 27, -72, 120, -7, -8, 5, 0, -8, Base64.padSymbol, -72, 11, -15, -7, 13, -12, 8, -5, -17, 66, -40, -21, -15, -7, 13, -12, 8, -5, -17, 37, -44, 18, -3, -3, 9, -21, -15, -7, 13, -12, 8, -5, -17, 37, -44, 77, -76, 1, -8, -10, -1, 76, -16, 10, -3, -36, -54, 1, 12, -16, 1, 10, -14, 22, -41, 8, -9, 9, 0, -18, 8, 3, 20, -24, -15, 8, -5, 0, 46, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 62};
    private static final int $$e = 249;
    private static final byte[] $$a = {56, 94, 119, -19, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 90;
    private static int getRoot = 1;
    private static int getExtras = 0;
    private static int getItem = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~i2;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i5 | i2 | i4));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i4 | i2)) | (~(i13 | i8)) | (~(i5 | i4));
        int i16 = i5 + i2 + i + ((-298151579) * i6) + ((-427515960) * i3);
        int i17 = i16 * i16;
        int i18 = (i5 * (-431502880)) + 875560960 + ((-431502880) * i2) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i) + ((-16252928) * i6) + (423624704 * i3) + (1109590016 * i17);
        int i19 = ((i5 * (-2003555040)) - 1632655964) + (i2 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * TypedValues.CycleType.TYPE_WAVE_PERIOD) + (i * (-2003554617)) + (i6 * 1812671363) + (i3 * (-1519508360)) + (i17 * (-1288372224));
        int i20 = i18 + (i19 * i19 * (-1796407296));
        if (i20 == 1) {
            return b(objArr);
        }
        if (i20 != 2) {
            if (i20 == 3) {
                return TuitionPaymentFragmentbindingInflater1(objArr);
            }
            if (i20 != 4) {
                return i20 != 5 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            }
            int i21 = 2 % 2;
            int i22 = getExtras + 43;
            getItem = i22 % 128;
            int i23 = i22 % 2;
            return null;
        }
        CustomTabsIntentApi21Impl customTabsIntentApi21Impl = (CustomTabsIntentApi21Impl) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int i24 = 2 % 2;
        customTabsIntentApi21Impl.a.set(1, iIntValue);
        customTabsIntentApi21Impl.a.set(2, iIntValue2);
        customTabsIntentApi21Impl.a.set(5, iIntValue3);
        customTabsIntentApi21Impl.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(customTabsIntentApi21Impl.a.getTime()));
        int i25 = getExtras + 75;
        getItem = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 1
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r5 = r5 * 52
            int r5 = r5 + 4
            byte[] r1 = defpackage.CustomTabsIntentApi21Impl.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r6 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r5]
        L27:
            int r6 = r6 + r4
            int r6 = r6 + (-10)
            int r5 = r5 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CustomTabsIntentApi21Impl.c(int, short, short, java.lang.Object[]):void");
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
    private static void f(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 23
            int r5 = r5 + 84
            int r6 = r6 * 75
            int r6 = 79 - r6
            int r7 = r7 * 23
            int r0 = 76 - r7
            byte[] r1 = defpackage.CustomTabsIntentApi21Impl.$$d
            byte[] r0 = new byte[r0]
            int r7 = 75 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-3)
            int r6 = r6 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CustomTabsIntentApi21Impl.f(int, short, int, java.lang.Object[]):void");
    }

    public CustomTabsIntentApi21Impl() {
        final CustomTabsIntentApi21Impl customTabsIntentApi21Impl = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.NonSalariedWorkerPersonalDataFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = customTabsIntentApi21Impl;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final CustomTabsIntentApi21Impl customTabsIntentApi21Impl2 = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.NonSalariedWorkerPersonalDataFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = customTabsIntentApi21Impl2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setSplitTrack.class);
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
        final CustomTabsIntentApi21Impl customTabsIntentApi21Impl3 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.NonSalariedWorkerPersonalDataFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = customTabsIntentApi21Impl3.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.NonSalariedWorkerPersonalDataFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                return getFocusY.b(customTabsIntentApi21Impl3, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.NonSalariedWorkerPersonalDataFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = customTabsIntentApi21Impl2;
                mapPoint mappoint = this.$qualifier;
                Function0 function1 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class);
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
        this.b = LazyKt.lazy(new Function0() { // from class: setActivitySideSheetDecorationType
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CustomTabsIntentApi21Impl.b(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        this.asInterface = R.layout.fragment_non_salaried_worker_personal_data;
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.a = calendar;
        this.notify = "";
        this.cancel = "";
        this.INotificationSideChannel = "";
        this.onTransact = "";
        this.cancelAll = "";
        this.RemoteActionCompatParcelizer = "0.0";
        this.INotificationSideChannelDefault = "0.0";
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: setActionButton
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                CustomTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.IconCompatParcelizer = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: enableUrlBarHiding
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                CustomTabsIntentApi21Impl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.MediaBrowserCompat = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX INFO: renamed from: CustomTabsIntentApi21Impl$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LCustomTabsIntentApi21Impl$b;", "", "<init>", "()V", "LCustomTabsIntentApi21Impl;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LCustomTabsIntentApi21Impl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static CustomTabsIntentApi21Impl TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new CustomTabsIntentApi21Impl();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 83;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - Color.blue(0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2624, Color.rgb(0, 0, 0) + 16777229, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() % (getNotifyChildrenChangedOptions | 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 39422), KeyEvent.getDeadChar(0, 0) + 481, 37 - KeyEvent.keyCodeFromString(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "") + 19472), 2624 - (ViewConfiguration.getWindowTouchSlop() >> 8), 13 - (Process.myPid() >> 22), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (getNotifyChildrenChangedOptions ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 39423), (KeyEvent.getMaxKeyCode() >> 16) + 481, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((-16737794) - Color.rgb(0, 0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 480, TextUtils.indexOf((CharSequence) "", '0', 0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
        int i6 = $11 + 57;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getCancel() {
        int i = 2 % 2;
        int i2 = getItem + 115;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.asInterface;
        if (i3 != 0) {
            int i5 = 81 / 0;
        }
        return i4;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentNonSalariedWorkerPersonalDataBinding> d() {
        int i = 2 % 2;
        int i2 = getExtras + 123;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        NonSalariedWorkerPersonalDataFragment$bindingInflater$1 nonSalariedWorkerPersonalDataFragment$bindingInflater$1 = NonSalariedWorkerPersonalDataFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 != 0) {
            return nonSalariedWorkerPersonalDataFragment$bindingInflater$1;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws ParseException {
        boolean z = false;
        final CustomTabsIntentApi21Impl customTabsIntentApi21Impl = (CustomTabsIntentApi21Impl) objArr[0];
        int i = 2 % 2;
        int i2 = getItem + 55;
        getExtras = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            customTabsIntentApi21Impl.INotificationSideChannelStub().tilFullName.getEditText();
            obj.hashCode();
            throw null;
        }
        EditText editText = customTabsIntentApi21Impl.INotificationSideChannelStub().tilFullName.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) customTabsIntentApi21Impl.b.getValue();
        if (registeredMemberRegistration != null) {
            FragmentNonSalariedWorkerPersonalDataBinding fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub = customTabsIntentApi21Impl.INotificationSideChannelStub();
            String str = registeredMemberRegistration.asInterface;
            if (str == null || str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                int i3 = getItem + 111;
                getExtras = i3 % 128;
                if (i3 % 2 != 0) {
                    fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                    obj.hashCode();
                    throw null;
                }
                EditText editText2 = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                if (editText2 != null) {
                    editText2.setText(str);
                }
            }
            String str2 = registeredMemberRegistration.asBinder;
            if (str2 == null || str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                int i4 = getItem + 93;
                getExtras = i4 % 128;
                if (i4 % 2 != 0) {
                    fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilFullName.getEditText();
                    throw null;
                }
                EditText editText3 = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilFullName.getEditText();
                if (editText3 != null) {
                    editText3.setText(str2);
                }
            }
            String str3 = registeredMemberRegistration.notify;
            if (str3 == null || str3.length() <= 0) {
                str3 = null;
            } else {
                int i5 = getExtras + 13;
                getItem = i5 % 128;
                int i6 = i5 % 2;
            }
            if (str3 != null) {
                EditText editText4 = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                if (editText4 != null) {
                    editText4.setText(str3);
                }
                Date date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(str3);
                if (date != null) {
                    customTabsIntentApi21Impl.a.setTime(date);
                }
            }
        }
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Context contextRequireContext = customTabsIntentApi21Impl.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        experimentalCamera2Interop.b(contextRequireContext, new Function1() { // from class: setActivitySideSheetBreakpointDp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CustomTabsIntentApi21Impl.b(this.TuitionPaymentFragmentbindingInflater1, (UserLocationComplete) obj2);
            }
        }, new Function0() { // from class: setActivitySideSheetMaximizationEnabled
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CustomTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        if (customTabsIntentApi21Impl.d != null) {
            int i7 = getExtras + 15;
            getItem = i7 % 128;
            if (i7 % 2 != 0) {
                z = true;
            }
        }
        customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(z);
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final CustomTabsIntentApi21Impl customTabsIntentApi21Impl = (CustomTabsIntentApi21Impl) objArr[0];
        int i = 2 % 2;
        CardView cardView = customTabsIntentApi21Impl.INotificationSideChannelStub().cvFotoKtp;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setSessionParameters
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsIntentApi21Impl.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        final FragmentNonSalariedWorkerPersonalDataBinding fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub = customTabsIntentApi21Impl.INotificationSideChannelStub();
        MaterialButton materialButton = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: addToolbarItem
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsIntentApi21Impl.TuitionPaymentFragmentbindingInflater1(this.b, fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        EditText editText = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: CustomTabsIntentActivitySideSheetRoundedCornersPosition
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view};
                    int iTuitionPaymentFragmentbindingInflater1 = zaq.TuitionPaymentFragmentbindingInflater1();
                    CustomTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaq.TuitionPaymentFragmentbindingInflater1(), objArr2, 386449033, zaq.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, -386449032, zaq.TuitionPaymentFragmentbindingInflater1());
                }
            });
        }
        int i2 = getItem + 11;
        getExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[PHI: r5
  0x0060: PHI (r5v6 java.lang.String) = (r5v5 java.lang.String), (r5v35 java.lang.String) binds: [B:18:0x005e, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    private static final Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CustomTabsIntentApi21Impl customTabsIntentApi21Impl, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        String nik;
        EditText editText;
        int i;
        int i2 = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i3 = getItem + 89;
            getExtras = i3 % 128;
            int i4 = i3 % 2;
            customTabsIntentApi21Impl.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            customTabsIntentApi21Impl.write();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            String transactionId = ((OcrKtpResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getTransactionId();
            if (transactionId != null) {
                ((PreferenceManager) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).saveString("OCR_TRANSACTION_ID", transactionId);
            }
            ResultOcr data = ((OcrKtpResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
            RegisteredMemberRegistration registeredMemberRegistration = null;
            if (data != null) {
                int i5 = getExtras + 99;
                getItem = i5 % 128;
                if (i5 % 2 == 0) {
                    nik = data.getNik();
                    int i6 = 57 / 0;
                    if (nik != null) {
                        if (nik.length() <= 0) {
                            i = getItem + 19;
                            getExtras = i % 128;
                            if (i % 2 == 0) {
                                registeredMemberRegistration.hashCode();
                                throw null;
                            }
                            nik = null;
                        }
                        if (nik != null) {
                            editText = customTabsIntentApi21Impl.INotificationSideChannelStub().tilIdNumber.getEditText();
                            if (editText != null) {
                                editText.setText(nik);
                            }
                            customTabsIntentApi21Impl.notify = nik;
                        }
                    }
                } else {
                    nik = data.getNik();
                    if (nik != null) {
                        if (nik.length() <= 0) {
                            i = getItem + 19;
                            getExtras = i % 128;
                            if (i % 2 == 0) {
                                registeredMemberRegistration.hashCode();
                                throw null;
                            }
                            nik = null;
                        }
                        if (nik != null) {
                            editText = customTabsIntentApi21Impl.INotificationSideChannelStub().tilIdNumber.getEditText();
                            if (editText != null) {
                                editText.setText(nik);
                            }
                            customTabsIntentApi21Impl.notify = nik;
                        }
                    }
                }
                String nama = data.getNama();
                if (nama != null) {
                    if (nama.length() <= 0) {
                        nama = null;
                    }
                    if (nama != null) {
                        int i7 = getItem + 9;
                        getExtras = i7 % 128;
                        int i8 = i7 % 2;
                        EditText editText2 = customTabsIntentApi21Impl.INotificationSideChannelStub().tilFullName.getEditText();
                        if (editText2 != null) {
                            int i9 = getExtras + 17;
                            getItem = i9 % 128;
                            if (i9 % 2 == 0) {
                                editText2.setText(nama);
                                registeredMemberRegistration.hashCode();
                                throw null;
                            }
                            editText2.setText(nama);
                        }
                        customTabsIntentApi21Impl.cancel = nama;
                    }
                }
                String tglLahir = data.getTglLahir();
                if (tglLahir != null) {
                    if (tglLahir.length() <= 0) {
                        tglLahir = null;
                    }
                    if (tglLahir != null) {
                        int i10 = getItem + 33;
                        getExtras = i10 % 128;
                        if (i10 % 2 != 0) {
                            customTabsIntentApi21Impl.INotificationSideChannelStub().tilBirthDate.getEditText();
                            throw null;
                        }
                        EditText editText3 = customTabsIntentApi21Impl.INotificationSideChannelStub().tilBirthDate.getEditText();
                        if (editText3 != null) {
                            editText3.setText(tglLahir);
                        }
                        customTabsIntentApi21Impl.INotificationSideChannel = tglLahir;
                        try {
                            Date date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(tglLahir);
                            if (date != null) {
                                customTabsIntentApi21Impl.a.setTime(date);
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (Exception unused) {
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
                String tempatLahir = data.getTempatLahir();
                if (tempatLahir != null) {
                    if (tempatLahir.length() <= 0) {
                        tempatLahir = null;
                    }
                    if (tempatLahir != null) {
                        customTabsIntentApi21Impl.onTransact = tempatLahir;
                    }
                }
                String alamat = data.getAlamat();
                if (alamat != null) {
                    if (alamat.length() <= 0) {
                        int i11 = getExtras + 87;
                        getItem = i11 % 128;
                        if (i11 % 2 == 0) {
                            throw null;
                        }
                        alamat = null;
                    }
                    if (alamat != null) {
                        customTabsIntentApi21Impl.cancelAll = alamat;
                    }
                }
            }
            File file = customTabsIntentApi21Impl.d;
            if (file != null) {
                getUntrustedCreatorPackageName getuntrustedcreatorpackagename = (getUntrustedCreatorPackageName) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) customTabsIntentApi21Impl.b.getValue();
                getuntrustedcreatorpackagename.b.setValue(registeredMemberRegistration2 != null ? RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, file, null, null, null, 7864319) : null);
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i12 = getItem + 21;
            getExtras = i12 % 128;
            if (i12 % 2 != 0) {
                customTabsIntentApi21Impl.write();
                Toast.makeText(customTabsIntentApi21Impl.requireContext(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 1).show();
            } else {
                customTabsIntentApi21Impl.write();
                Toast.makeText(customTabsIntentApi21Impl.requireContext(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x024e  */
    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        ((setSplitTrack) this.TuitionPaymentFragmentbindingInflater1.getValue()).INotificationSideChannelStubProxy.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: CustomTabsIntentBuilder
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31533);
            int i2 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 920;
            int minimumFlingVelocity2 = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte b = $$a[80];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, i2, minimumFlingVelocity2, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{47283, 45779, 44136, 42989, 37121, 35984, 34348, 61941, 60357, 58694, 53418, 51780, 50591, 16130, 10932, 9270, 7759, 2510, 880, 32384, 26653, 25506}, 2671 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{47287, 21905, 25325, 32559, 3101, 6492, 14252, 50377, 53711, 60948, 64360, 35235, 42639, 46044, 16421}, KeyEvent.normalizeMetaState(0) + 60719, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 31533);
            int iMyTid = 921 - (Process.myTid() >> 22);
            int i3 = 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr[80], bArr[37], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iMyTid, i3, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = getItem + 39;
            getExtras = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char threadPriority = (char) (31533 - ((Process.getThreadPriority(0) + 20) >> 6));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 922;
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                byte b3 = $$a[37];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                c(b3, b4, (byte) (b4 | 36), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, iLastIndexOf, doubleTapTimeout, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = 1897058383 + (((~((-736758835) | i6)) | 1037320809) * (-602)) + (((~(iIdentityHashCode | (-736758835))) | 700448800 | (~(1073630843 | i6))) * (-301)) + ((~(i6 | 1037320809)) * 301) + 1275665251;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            int i10 = getExtras + 91;
            getItem = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 % 5;
            }
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{47283, 29549, 12052, 56275, 38905, 17326, 32336, 10827, 58939, 37627, 20104, 30983, 13663, 57644, 40392, 18820, 1460, 12378, 60436, 38952, 21714, 159, 15190, 63344, 41771, 24543}, Color.green(0) + 52177, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{47281, 32072, 13182, 59757, 44811, 25879, 6972, 53530, 38874, 19909, 1000, 14846, 65413, 46480, 27572, 8634, 58957, 40035}, 50671 - (ViewConfiguration.getEdgeSlop() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(!(applicationContext instanceof ContextWrapper))) {
                    int i12 = getExtras + 119;
                    getItem = i12 % 128;
                    int i13 = i12 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i14 = getExtras + 5;
                        getItem = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = 5 / 2;
                        }
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{47288, 9070, 36638, 27428, 55176, 46063, 8093, 64439, 26205, 49721, 44579, 2772, 63229, 21151, 16033, 39244}, 39901 - TextUtils.indexOf("", ""), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{47291, 58379, 461, 44683, 51794, 30474, 38088, 12672, 23922, 64022, 10179, 17573, 57421, 3364, 43744, 55204}, TextUtils.lastIndexOf("", '0', 0) + 23742, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i16 = getExtras + 41;
            getItem = i16 % 128;
            int i17 = i16 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1275665251};
                byte[] bArr2 = $$d;
                byte b5 = bArr2[47];
                Object[] objArr13 = new Object[1];
                f(b5, b5, bArr2[7], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr2[7];
                Object[] objArr14 = new Object[1];
                f(b6, b6, bArr2[47], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char pressedStateDuration = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int iAlpha = 921 - Color.alpha(0);
                    int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    byte b7 = $$a[37];
                    byte b8 = b7;
                    Object[] objArr15 = new Object[1];
                    c(b7, b8, (byte) (b8 | 36), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, iAlpha, maximumDrawingCacheSize, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{47283, 45779, 44136, 42989, 37121, 35984, 34348, 61941, 60357, 58694, 53418, 51780, 50591, 16130, 10932, 9270, 7759, 2510, 880, 32384, 26653, 25506}, KeyEvent.getDeadChar(0, 0) + 2671, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{47287, 21905, 25325, 32559, 3101, 6492, 14252, 50377, 53711, 60948, 64360, 35235, 42639, 46044, 16421}, 60719 - Color.alpha(0), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31533);
                        int i18 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iIndexOf = 28 - TextUtils.indexOf("", "", 0, 0);
                        byte[] bArr3 = $$a;
                        Object[] objArr18 = new Object[1];
                        c(bArr3[80], bArr3[37], (byte) 52, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, i18, iIndexOf, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMakeMeasureSpec = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int iGreen = Color.green(0) + 921;
                        int i19 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b9 = $$a[80];
                        byte b10 = b9;
                        Object[] objArr19 = new Object[1];
                        c(b9, b10, b10, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, iGreen, i19, -1048449946, false, (String) objArr19[0], null);
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
        int i20 = ((int[]) objArr[1])[0];
        int i21 = ((int[]) objArr[3])[0];
        if (i21 == i20) {
            int i22 = getItem + 11;
            getExtras = i22 % 128;
            int i23 = i22 % 2;
            int i24 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i25 = (-830463493) + (((~(729774519 | iElapsedRealtime)) | 1044305124) * 672);
            int i26 = ~iElapsedRealtime;
            int i27 = i24 + i25 + (((~(iElapsedRealtime | 1044305124)) | (~((-729774520) | i26))) * (-672)) + (((~((-1044305125) | i26)) | 335578176) * 672);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr20[0])[0] = i29 ^ (i29 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
            int i30 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i31 = ~elapsedCpuTime;
            int i32 = i30 + (-271259433) + ((elapsedCpuTime | 1301831506) * 140) + (((~(1301831506 | i31)) | 270901257) * (-280)) + (((~(elapsedCpuTime | (-270901258))) | (~(472248137 | i31)) | 1100484626) * 140);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr21[0])[0] = i34 ^ (i34 << 5);
        }
        ((setSplitTrack) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: setShareIdentityEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentbindingInflater1.getValue()).d.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: CustomTabsIntentApi24Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsIntentApi21Impl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getStreamUseCaseSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: addMenuItem
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsIntentApi21Impl.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        int i = 2 % 2;
        FragmentNonSalariedWorkerPersonalDataBinding fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = getString(R.string.error_invalid_field);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16), new accessconfigureInstanceInternal("^[0-9]{0,}$", string3)})));
        TextInputLayout textInputLayout2 = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout3 = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        int i2 = getItem + 59;
        getExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = getExtras + 5;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i4 = getExtras + 65;
        getItem = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = getExtras + 63;
        getItem = i2 % 128;
        if (i2 % 2 == 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
        } else {
            MaterialButton materialButton3 = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
        }
        int i3 = getItem + 45;
        getExtras = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r1
  0x0028: PHI (r1v7 com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration) = 
  (r1v6 com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration)
  (r1v20 com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration)
 binds: [B:8:0x0026, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean p0) {
        RegisteredMemberRegistration registeredMemberRegistration;
        Citizenship citizenship;
        int i;
        String strName;
        EditText editText;
        EditText editText2;
        EditText editText3;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = getExtras + 81;
        getItem = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            registeredMemberRegistration = (RegisteredMemberRegistration) this.b.getValue();
            if (registeredMemberRegistration != null) {
                int i6 = getExtras + 61;
                getItem = i6 % 128;
                int i7 = i6 % 2;
                citizenship = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (citizenship != null) {
                    i = getExtras + 7;
                    getItem = i % 128;
                    if (i % 2 != 0) {
                        citizenship.name();
                        throw null;
                    }
                    strName = citizenship.name();
                }
            }
            if (!Intrinsics.areEqual(strName, "WNI")) {
                p0 = true;
            }
            FragmentNonSalariedWorkerPersonalDataBinding fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
            fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilFullName.setEnabled(p0);
            fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.setEnabled(p0);
            fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilBirthDate.setEnabled(p0);
            editText = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilFullName.getEditText();
            if (editText != null) {
                int i8 = getItem + 69;
                getExtras = i8 % 128;
                int i9 = i8 % 2;
                editText.setEnabled(p0);
            }
            editText2 = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
            if (editText2 != null) {
                editText2.setEnabled(p0);
            }
            editText3 = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
            if (editText3 != null) {
                int i10 = getExtras + 71;
                getItem = i10 % 128;
                i2 = i10 % 2;
                editText3.setEnabled(p0);
                if (i2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                i3 = getExtras + 81;
                getItem = i3 % 128;
                if (i3 % 2 == 0) {
                    int i11 = 2 / 4;
                }
            }
        }
        registeredMemberRegistration = (RegisteredMemberRegistration) this.b.getValue();
        int i12 = 19 / 0;
        if (registeredMemberRegistration != null) {
            int i13 = getExtras + 61;
            getItem = i13 % 128;
            int i14 = i13 % 2;
            citizenship = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (citizenship != null) {
                i = getExtras + 7;
                getItem = i % 128;
                if (i % 2 != 0) {
                    citizenship.name();
                    throw null;
                }
                strName = citizenship.name();
            }
        }
        if (!Intrinsics.areEqual(strName, "WNI")) {
            p0 = true;
        }
        FragmentNonSalariedWorkerPersonalDataBinding fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub2 = INotificationSideChannelStub();
        fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub2.tilFullName.setEnabled(p0);
        fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub2.tilIdNumber.setEnabled(p0);
        fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub2.tilBirthDate.setEnabled(p0);
        editText = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub2.tilFullName.getEditText();
        if (editText != null) {
            int i15 = getItem + 69;
            getExtras = i15 % 128;
            int i16 = i15 % 2;
            editText.setEnabled(p0);
        }
        editText2 = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub2.tilIdNumber.getEditText();
        if (editText2 != null) {
            editText2.setEnabled(p0);
        }
        editText3 = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub2.tilBirthDate.getEditText();
        if (editText3 != null) {
            int i17 = getExtras + 71;
            getItem = i17 % 128;
            i2 = i17 % 2;
            editText3.setEnabled(p0);
            if (i2 == 0) {
                obj.hashCode();
                throw null;
            }
            i3 = getExtras + 81;
            getItem = i3 % 128;
            if (i3 % 2 == 0) {
                int i18 = 2 / 4;
            }
        }
        strName = null;
        if (!Intrinsics.areEqual(strName, "WNI")) {
            p0 = true;
        }
        FragmentNonSalariedWorkerPersonalDataBinding fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub3 = INotificationSideChannelStub();
        fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub3.tilFullName.setEnabled(p0);
        fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub3.tilIdNumber.setEnabled(p0);
        fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub3.tilBirthDate.setEnabled(p0);
        editText = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub3.tilFullName.getEditText();
        if (editText != null) {
            int i19 = getItem + 69;
            getExtras = i19 % 128;
            int i110 = i19 % 2;
            editText.setEnabled(p0);
        }
        editText2 = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub3.tilIdNumber.getEditText();
        if (editText2 != null) {
            editText2.setEnabled(p0);
        }
        editText3 = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub3.tilBirthDate.getEditText();
        if (editText3 != null) {
            int i111 = getExtras + 71;
            getItem = i111 % 128;
            i2 = i111 % 2;
            editText3.setEnabled(p0);
            if (i2 == 0) {
                obj.hashCode();
                throw null;
            }
            i3 = getExtras + 81;
            getItem = i3 % 128;
            if (i3 % 2 == 0) {
                int i112 = 2 / 4;
            }
        }
    }

    public static /* synthetic */ RegisteredMemberRegistration b(CustomTabsIntentApi21Impl customTabsIntentApi21Impl) {
        int i = 2 % 2;
        int i2 = getItem + 7;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration value = ((getUntrustedCreatorPackageName) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.getValue();
        int i4 = getExtras + 119;
        getItem = i4 % 128;
        if (i4 % 2 != 0) {
            return value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(CustomTabsIntentApi21Impl customTabsIntentApi21Impl, ActivityResult activityResult) {
        String stringExtra;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            if (data != null) {
                int i2 = getExtras + 61;
                getItem = i2 % 128;
                int i3 = i2 % 2;
                stringExtra = data.getStringExtra("extra_photo_path");
                int i4 = getExtras + 89;
                getItem = i4 % 128;
                int i5 = i4 % 2;
            } else {
                stringExtra = null;
            }
            if (stringExtra != null) {
                File file = new File(stringExtra);
                if (file.exists()) {
                    customTabsIntentApi21Impl.d = file;
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(stringExtra);
                    customTabsIntentApi21Impl.INotificationSideChannelStub().imgKtpPhoto.setImageBitmap(bitmapDecodeFile);
                    customTabsIntentApi21Impl.INotificationSideChannelStub().imgKtpPhoto.setVisibility(0);
                    customTabsIntentApi21Impl.INotificationSideChannelStub().clKtpPlaceholder.setVisibility(8);
                    customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(true);
                    Intrinsics.checkNotNull(bitmapDecodeFile);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                    String strEncodeToString = android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
                    ((setSplitTrack) customTabsIntentApi21Impl.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new OcrKtpRequest(UUID.randomUUID().toString(), strEncodeToString));
                }
            }
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getExtras + 71;
        getItem = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = getItem + 93;
        getExtras = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ Unit b(CustomTabsIntentApi21Impl customTabsIntentApi21Impl, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (customTabsIntentApi21Impl.g) {
            ActivityResultLauncher<Intent> activityResultLauncher = customTabsIntentApi21Impl.MediaBrowserCompat;
            KtpCameraActivity.Companion companion = KtpCameraActivity.INSTANCE;
            Context contextRequireContext = customTabsIntentApi21Impl.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            activityResultLauncher.launch(KtpCameraActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext));
        } else {
            int i2 = getItem + 87;
            getExtras = i2 % 128;
            if (i2 % 2 != 0) {
                ActivityResultLauncher<Intent> activityResultLauncher2 = customTabsIntentApi21Impl.IconCompatParcelizer;
                KtpGuidanceActivity.Companion companion2 = KtpGuidanceActivity.INSTANCE;
                Context contextRequireContext2 = customTabsIntentApi21Impl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                activityResultLauncher2.launch(companion2.TuitionPaymentFragmentbindingInflater1(contextRequireContext2));
                int i3 = 97 / 0;
            } else {
                ActivityResultLauncher<Intent> activityResultLauncher3 = customTabsIntentApi21Impl.IconCompatParcelizer;
                KtpGuidanceActivity.Companion companion3 = KtpGuidanceActivity.INSTANCE;
                Context contextRequireContext3 = customTabsIntentApi21Impl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                activityResultLauncher3.launch(companion3.TuitionPaymentFragmentbindingInflater1(contextRequireContext3));
            }
            int i4 = getExtras + 85;
            getItem = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getExtras + 43;
        getItem = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = getExtras + 97;
        getItem = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 92 / 0;
        }
        return unit2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(CustomTabsIntentApi21Impl customTabsIntentApi21Impl, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        Editable text;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            customTabsIntentApi21Impl.IconCompatParcelizer();
            int i2 = getItem + 75;
            getExtras = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 2;
            }
            str = "loading_registration_account_step_first_result";
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                FragmentNonSalariedWorkerPersonalDataBinding fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub = customTabsIntentApi21Impl.INotificationSideChannelStub();
                customTabsIntentApi21Impl.write();
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) customTabsIntentApi21Impl.b.getValue();
                if (registeredMemberRegistration != null) {
                    Context contextRequireContext = customTabsIntentApi21Impl.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string, "");
                    EditText editText = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                    if (editText != null) {
                        int i4 = getExtras + 17;
                        getItem = i4 % 128;
                        int i5 = i4 % 2;
                        text = editText.getText();
                    } else {
                        text = null;
                    }
                    String string2 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                    EditText editText2 = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                    String string3 = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
                    EditText editText3 = fragmentNonSalariedWorkerPersonalDataBindingINotificationSideChannelStub.tilFullName.getEditText();
                    VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, string, null, null, null, MembershipType.BPU, null, StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString(), string3, null, null, null, null, string2, String.valueOf(((MembershipCheckItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum()), null, String.valueOf(((MembershipCheckItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature()), null, null, null, null, null, null, null, 8343342);
                }
                ((getUntrustedCreatorPackageName) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.setValue((RegisteredMemberRegistration) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                ((getUntrustedCreatorPackageName) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                str = "success_registration_account_step_first_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                customTabsIntentApi21Impl.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                String string4 = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                String string5 = customTabsIntentApi21Impl.getString(R.string.error_data_membership_not_found);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                if (StringsKt.contains$default((CharSequence) string4, (CharSequence) string5, false, 2, (Object) null)) {
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string6 = customTabsIntentApi21Impl.getString(R.string.title_data_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    String string7 = customTabsIntentApi21Impl.getString(R.string.message_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string7, "");
                    String string8 = customTabsIntentApi21Impl.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string8, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_information, string6, string7, string8, new Function0() { // from class: setCloseButtonIcon
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CustomTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        }
                    }, 96);
                    FragmentManager childFragmentManager = customTabsIntentApi21Impl.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        int i6 = getItem + 29;
                        getExtras = i6 % 128;
                        int i7 = i6 % 2;
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                    int i8 = getExtras + 125;
                    getItem = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    String string9 = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                    String string10 = customTabsIntentApi21Impl.getString(R.string.error_data_membership_already_registered);
                    Intrinsics.checkNotNullExpressionValue(string10, "");
                    if (StringsKt.contains$default((CharSequence) string9, (CharSequence) string10, false, 2, (Object) null)) {
                        getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                        String string11 = customTabsIntentApi21Impl.getString(R.string.tittle_already_registered);
                        Intrinsics.checkNotNullExpressionValue(string11, "");
                        String string12 = customTabsIntentApi21Impl.getString(R.string.message_already_registered);
                        Intrinsics.checkNotNullExpressionValue(string12, "");
                        String string13 = customTabsIntentApi21Impl.getString(R.string.action_ok);
                        Intrinsics.checkNotNullExpressionValue(string13, "");
                        getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_information, string11, string12, string13, new Function0() { // from class: CustomTabsIntentApi34Impl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CustomTabsIntentApi21Impl.TuitionPaymentFragmentbindingInflater1();
                            }
                        }, 96);
                        FragmentManager childFragmentManager2 = customTabsIntentApi21Impl.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                        if (childFragmentManager2.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB2.show(childFragmentManager2, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    } else {
                        CustomTabsIntentApi21Impl customTabsIntentApi21Impl2 = customTabsIntentApi21Impl;
                        String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        Intrinsics.checkNotNullParameter(customTabsIntentApi21Impl2, "");
                        Intrinsics.checkNotNullParameter(strValueOf, "");
                        BaseActivity baseActivity = (BaseActivity) customTabsIntentApi21Impl2.getContext();
                        if (baseActivity != null) {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                        }
                    }
                }
                str = "failure_registration_account_step_first_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = customTabsIntentApi21Impl.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0165  */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(CustomTabsIntentApi21Impl customTabsIntentApi21Impl, FragmentNonSalariedWorkerPersonalDataBinding fragmentNonSalariedWorkerPersonalDataBinding, View view) {
        Editable text;
        Editable text2;
        String strName;
        int i = 2 % 2;
        int i2 = getExtras + 21;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        Editable editable = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, customTabsIntentApi21Impl.requireContext());
            fragmentNonSalariedWorkerPersonalDataBinding.nonSalariedWorkerPersonalDataContainer.requestFocus();
            File file = customTabsIntentApi21Impl.d;
            throw null;
        }
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, customTabsIntentApi21Impl.requireContext());
        fragmentNonSalariedWorkerPersonalDataBinding.nonSalariedWorkerPersonalDataContainer.requestFocus();
        if (customTabsIntentApi21Impl.d == null) {
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String string = customTabsIntentApi21Impl.getString(R.string.error_field_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = customTabsIntentApi21Impl.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, "Anda wajib mengambil foto KTP terlebih dahulu", string2, new Function0() { // from class: makeBasicActivityOptions
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int iTuitionPaymentFragmentbindingInflater1 = zaq.TuitionPaymentFragmentbindingInflater1();
                    return (Unit) CustomTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaq.TuitionPaymentFragmentbindingInflater1(), new Object[0], -1926499962, zaq.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, 1926499967, zaq.TuitionPaymentFragmentbindingInflater1());
                }
            }, 96);
            FragmentManager childFragmentManager = customTabsIntentApi21Impl.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i4 = getItem + 79;
                getExtras = i4 % 128;
                if (i4 % 2 != 0) {
                    getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    editable.hashCode();
                    throw null;
                }
                getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            return Unit.INSTANCE;
        }
        if (((PreferenceManager) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "").length() == 0) {
            int i5 = getExtras + 51;
            getItem = i5 % 128;
            int i6 = i5 % 2;
            String string3 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "");
            ((PreferenceManager) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).saveString("OCR_TRANSACTION_ID", string3);
        }
        setSplitTrack setsplittrack = (setSplitTrack) customTabsIntentApi21Impl.TuitionPaymentFragmentbindingInflater1.getValue();
        String string4 = ((PreferenceManager) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "");
        Context contextRequireContext = customTabsIntentApi21Impl.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        String string5 = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string5, "");
        EditText editText = fragmentNonSalariedWorkerPersonalDataBinding.tilBirthDate.getEditText();
        if (editText != null) {
            int i7 = getItem + 99;
            getExtras = i7 % 128;
            if (i7 % 2 != 0) {
                editText.getText();
                throw null;
            }
            text = editText.getText();
        } else {
            text = null;
        }
        String string6 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
        EditText editText2 = fragmentNonSalariedWorkerPersonalDataBinding.tilIdNumber.getEditText();
        if (editText2 != null) {
            text2 = editText2.getText();
        } else {
            int i8 = getExtras + 21;
            getItem = i8 % 128;
            int i9 = i8 % 2;
            text2 = null;
        }
        String string7 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
        EditText editText3 = fragmentNonSalariedWorkerPersonalDataBinding.tilIdNumber.getEditText();
        String string8 = StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString();
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) customTabsIntentApi21Impl.b.getValue();
        if (registeredMemberRegistration != null) {
            int i10 = getItem + 13;
            getExtras = i10 % 128;
            int i11 = i10 % 2;
            Citizenship citizenship = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (citizenship != null) {
                strName = citizenship.name();
            } else {
                strName = null;
            }
        } else {
            strName = null;
        }
        EditText editText4 = fragmentNonSalariedWorkerPersonalDataBinding.tilFullName.getEditText();
        setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string4, new MembershipCheckRequest(string5, strName, "BPU", string8, StringsKt.trim((CharSequence) String.valueOf(editText4 != null ? editText4.getText() : null)).toString(), string7, "", string6));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Code duplicated, block: B:17:0x0070  */
    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6 A[PHI: r4
  0x00d6: PHI (r4v10 java.lang.String) = (r4v9 java.lang.String), (r4v14 java.lang.String) binds: [B:47:0x00cc, B:49:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:71:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0126  */
    /* JADX WARN: Code duplicated, block: B:76:0x012f  */
    /* JADX WARN: Code duplicated, block: B:79:0x013e  */
    public static /* synthetic */ Unit b(CustomTabsIntentApi21Impl customTabsIntentApi21Impl, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String message;
        BaseActivity baseActivity;
        String nomorIdentitas;
        String str;
        String nama;
        String str2;
        String handphone;
        String str3;
        String email;
        String str4;
        String kodePengajuan;
        String str5;
        String layanan;
        String str6;
        String layanan2;
        String str7;
        String namaKantorCabang;
        String str8;
        String alamatKantor;
        String str9;
        String tanggalBooking;
        String str10;
        String tanggalBooking2;
        String str11;
        String namaShift;
        String str12;
        String qrCode;
        String str13;
        int i;
        int i2 = 2 % 2;
        int i3 = getExtras + 37;
        int i4 = i3 % 128;
        getItem = i4;
        int i5 = i3 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            int i6 = i4 + 89;
            getExtras = i6 % 128;
            int i7 = i6 % 2;
            Object obj = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                customTabsIntentApi21Impl.write();
                GetDataAntrianResponse getDataAntrianResponse = (GetDataAntrianResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                AntrianData data = getDataAntrianResponse.getData();
                if (Intrinsics.areEqual(getDataAntrianResponse.isSuccessful(), Boolean.TRUE)) {
                    int i8 = getExtras + 37;
                    int i9 = i8 % 128;
                    getItem = i9;
                    if (i8 % 2 == 0) {
                        int i10 = 22 / 0;
                        if (data != null) {
                            int i11 = i9 + 59;
                            getExtras = i11 % 128;
                            int i12 = i11 % 2;
                            BookingAntreanSuccessActivity.Companion companion = BookingAntreanSuccessActivity.INSTANCE;
                            Context contextRequireContext = customTabsIntentApi21Impl.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                            nomorIdentitas = data.getNomorIdentitas();
                            if (nomorIdentitas == null) {
                                int i13 = getExtras + 61;
                                getItem = i13 % 128;
                                int i14 = i13 % 2;
                                str = "";
                            } else {
                                str = nomorIdentitas;
                            }
                            nama = data.getNama();
                            if (nama == null) {
                                i = getExtras + 21;
                                getItem = i % 128;
                                if (i % 2 != 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                str2 = "";
                            } else {
                                str2 = nama;
                            }
                            handphone = data.getHandphone();
                            if (handphone == null) {
                                int i15 = getExtras + 51;
                                getItem = i15 % 128;
                                int i16 = i15 % 2;
                                str3 = "";
                            } else {
                                str3 = handphone;
                            }
                            email = data.getEmail();
                            if (email == null) {
                                str4 = "";
                            } else {
                                str4 = email;
                            }
                            kodePengajuan = data.getKodePengajuan();
                            if (kodePengajuan == null) {
                                int i17 = getExtras + 9;
                                getItem = i17 % 128;
                                int i18 = i17 % 2;
                                str5 = "";
                            } else {
                                str5 = kodePengajuan;
                            }
                            layanan = data.getLayanan();
                            if (layanan == null) {
                                str6 = "";
                            } else {
                                str6 = layanan;
                            }
                            layanan2 = data.getLayanan();
                            if (layanan2 == null) {
                                str7 = "";
                            } else {
                                str7 = layanan2;
                            }
                            namaKantorCabang = data.getNamaKantorCabang();
                            if (namaKantorCabang == null || (namaKantorCabang = data.getKantorCabang()) != null) {
                                str8 = namaKantorCabang;
                            } else {
                                str8 = "";
                            }
                            alamatKantor = data.getAlamatKantor();
                            if (alamatKantor == null) {
                                str9 = "";
                            } else {
                                str9 = alamatKantor;
                            }
                            tanggalBooking = data.getTanggalBooking();
                            if (tanggalBooking == null) {
                                str10 = "";
                            } else {
                                str10 = tanggalBooking;
                            }
                            tanggalBooking2 = data.getTanggalBooking();
                            if (tanggalBooking2 == null) {
                                str11 = "";
                            } else {
                                str11 = tanggalBooking2;
                            }
                            namaShift = data.getNamaShift();
                            if (namaShift == null) {
                                str12 = "";
                            } else {
                                str12 = namaShift;
                            }
                            qrCode = getDataAntrianResponse.getQrCode();
                            if (qrCode == null) {
                                str13 = "";
                            } else {
                                str13 = qrCode;
                            }
                            String str14 = customTabsIntentApi21Impl.write;
                            Intrinsics.checkNotNull(str14);
                            BookingAntreanSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, "", "", str13, str14);
                            int i19 = getItem + 87;
                            getExtras = i19 % 128;
                            int i20 = i19 % 2;
                        } else {
                            CustomTabsIntentApi21Impl customTabsIntentApi21Impl2 = customTabsIntentApi21Impl;
                            message = getDataAntrianResponse.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            Intrinsics.checkNotNullParameter(customTabsIntentApi21Impl2, "");
                            Intrinsics.checkNotNullParameter(message, "");
                            baseActivity = (BaseActivity) customTabsIntentApi21Impl2.getContext();
                            if (baseActivity != null) {
                                int i21 = getItem + 113;
                                getExtras = i21 % 128;
                                int i22 = i21 % 2;
                                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, message, null);
                            }
                        }
                    } else if (data != null) {
                        int i110 = i9 + 59;
                        getExtras = i110 % 128;
                        int i111 = i110 % 2;
                        BookingAntreanSuccessActivity.Companion companion2 = BookingAntreanSuccessActivity.INSTANCE;
                        Context contextRequireContext2 = customTabsIntentApi21Impl.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                        nomorIdentitas = data.getNomorIdentitas();
                        if (nomorIdentitas == null) {
                            int i112 = getExtras + 61;
                            getItem = i112 % 128;
                            int i113 = i112 % 2;
                            str = "";
                        } else {
                            str = nomorIdentitas;
                        }
                        nama = data.getNama();
                        if (nama == null) {
                            i = getExtras + 21;
                            getItem = i % 128;
                            if (i % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            str2 = "";
                        } else {
                            str2 = nama;
                        }
                        handphone = data.getHandphone();
                        if (handphone == null) {
                            int i114 = getExtras + 51;
                            getItem = i114 % 128;
                            int i115 = i114 % 2;
                            str3 = "";
                        } else {
                            str3 = handphone;
                        }
                        email = data.getEmail();
                        if (email == null) {
                            str4 = "";
                        } else {
                            str4 = email;
                        }
                        kodePengajuan = data.getKodePengajuan();
                        if (kodePengajuan == null) {
                            int i116 = getExtras + 9;
                            getItem = i116 % 128;
                            int i117 = i116 % 2;
                            str5 = "";
                        } else {
                            str5 = kodePengajuan;
                        }
                        layanan = data.getLayanan();
                        if (layanan == null) {
                            str6 = "";
                        } else {
                            str6 = layanan;
                        }
                        layanan2 = data.getLayanan();
                        if (layanan2 == null) {
                            str7 = "";
                        } else {
                            str7 = layanan2;
                        }
                        namaKantorCabang = data.getNamaKantorCabang();
                        if (namaKantorCabang == null) {
                            str8 = namaKantorCabang;
                        } else {
                            str8 = namaKantorCabang;
                        }
                        alamatKantor = data.getAlamatKantor();
                        if (alamatKantor == null) {
                            str9 = "";
                        } else {
                            str9 = alamatKantor;
                        }
                        tanggalBooking = data.getTanggalBooking();
                        if (tanggalBooking == null) {
                            str10 = "";
                        } else {
                            str10 = tanggalBooking;
                        }
                        tanggalBooking2 = data.getTanggalBooking();
                        if (tanggalBooking2 == null) {
                            str11 = "";
                        } else {
                            str11 = tanggalBooking2;
                        }
                        namaShift = data.getNamaShift();
                        if (namaShift == null) {
                            str12 = "";
                        } else {
                            str12 = namaShift;
                        }
                        qrCode = getDataAntrianResponse.getQrCode();
                        if (qrCode == null) {
                            str13 = "";
                        } else {
                            str13 = qrCode;
                        }
                        String str15 = customTabsIntentApi21Impl.write;
                        Intrinsics.checkNotNull(str15);
                        BookingAntreanSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, "", "", str13, str15);
                        int i118 = getItem + 87;
                        getExtras = i118 % 128;
                        int i23 = i118 % 2;
                    } else {
                        CustomTabsIntentApi21Impl customTabsIntentApi21Impl3 = customTabsIntentApi21Impl;
                        message = getDataAntrianResponse.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        Intrinsics.checkNotNullParameter(customTabsIntentApi21Impl3, "");
                        Intrinsics.checkNotNullParameter(message, "");
                        baseActivity = (BaseActivity) customTabsIntentApi21Impl3.getContext();
                        if (baseActivity != null) {
                            int i24 = getItem + 113;
                            getExtras = i24 % 128;
                            int i25 = i24 % 2;
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, message, null);
                        }
                    }
                } else {
                    CustomTabsIntentApi21Impl customTabsIntentApi21Impl4 = customTabsIntentApi21Impl;
                    message = getDataAntrianResponse.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    Intrinsics.checkNotNullParameter(customTabsIntentApi21Impl4, "");
                    Intrinsics.checkNotNullParameter(message, "");
                    baseActivity = (BaseActivity) customTabsIntentApi21Impl4.getContext();
                    if (baseActivity != null) {
                        int i26 = getItem + 113;
                        getExtras = i26 % 128;
                        int i27 = i26 % 2;
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, message, null);
                    }
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                customTabsIntentApi21Impl.write();
                CustomTabsIntentApi21Impl customTabsIntentApi21Impl5 = customTabsIntentApi21Impl;
                String str16 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str16 == null) {
                    str16 = "";
                }
                Intrinsics.checkNotNullParameter(customTabsIntentApi21Impl5, "");
                Intrinsics.checkNotNullParameter(str16, "");
                BaseActivity baseActivity2 = (BaseActivity) customTabsIntentApi21Impl5.getContext();
                if (baseActivity2 != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, str16, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = getItem + 71;
        getExtras = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = getItem + 57;
        getExtras = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        final CustomTabsIntentApi21Impl customTabsIntentApi21Impl = (CustomTabsIntentApi21Impl) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: getDefaultLocale
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    int iTuitionPaymentFragmentbindingInflater1 = zaq.TuitionPaymentFragmentbindingInflater1();
                    CustomTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaq.TuitionPaymentFragmentbindingInflater1(), objArr2, -1756767926, zaq.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, 1756767928, zaq.TuitionPaymentFragmentbindingInflater1());
                }
            }, customTabsIntentApi21Impl.a.get(1), customTabsIntentApi21Impl.a.get(2), customTabsIntentApi21Impl.a.get(5)).show();
            ViewPortBuilder.b();
            int i2 = getExtras + 9;
            getItem = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(CustomTabsIntentApi21Impl customTabsIntentApi21Impl, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = getExtras + 107;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            customTabsIntentApi21Impl.g = true;
            ActivityResultLauncher<Intent> activityResultLauncher = customTabsIntentApi21Impl.MediaBrowserCompat;
            KtpCameraActivity.Companion companion = KtpCameraActivity.INSTANCE;
            Context contextRequireContext = customTabsIntentApi21Impl.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            activityResultLauncher.launch(KtpCameraActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext));
        }
        int i4 = getItem + 23;
        getExtras = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = getItem + 47;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = getExtras + 31;
        getItem = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(CustomTabsIntentApi21Impl customTabsIntentApi21Impl, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i;
        int i2 = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            customTabsIntentApi21Impl.IconCompatParcelizer();
        } else {
            Object text = null;
            if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
                customTabsIntentApi21Impl.write();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                String str = ((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
                if (str == null) {
                    int i3 = getExtras + 55;
                    getItem = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    str = null;
                }
                customTabsIntentApi21Impl.write = str;
                if (Intrinsics.areEqual(str, "900")) {
                    RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) customTabsIntentApi21Impl.b.getValue();
                    if (registeredMemberRegistration != null) {
                        int i4 = getExtras + 115;
                        getItem = i4 % 128;
                        int i5 = i4 % 2;
                        Context contextRequireContext = customTabsIntentApi21Impl.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                        Intrinsics.checkExpressionValueIsNotNull(string, "");
                        EditText editText = customTabsIntentApi21Impl.INotificationSideChannelStub().tilBirthDate.getEditText();
                        String string2 = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
                        EditText editText2 = customTabsIntentApi21Impl.INotificationSideChannelStub().tilIdNumber.getEditText();
                        String string3 = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
                        EditText editText3 = customTabsIntentApi21Impl.INotificationSideChannelStub().tilFullName.getEditText();
                        if (editText3 != null) {
                            int i6 = getExtras + 91;
                            getItem = i6 % 128;
                            if (i6 % 2 == 0) {
                                editText3.getText();
                                text.hashCode();
                                throw null;
                            }
                            text = editText3.getText();
                        }
                        text = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, string, null, null, null, MembershipType.BPU, null, StringsKt.trim((CharSequence) String.valueOf(text)).toString(), string3, null, null, null, null, string2, String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b), null, null, null, customTabsIntentApi21Impl.d, null, customTabsIntentApi21Impl.onTransact, customTabsIntentApi21Impl.cancelAll, 1511214);
                    }
                    ((getUntrustedCreatorPackageName) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.setValue((RegisteredMemberRegistration) text);
                    ((getUntrustedCreatorPackageName) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                } else if (Intrinsics.areEqual(customTabsIntentApi21Impl.write, "901")) {
                    int i7 = getExtras + 9;
                    getItem = i7 % 128;
                    if (i7 % 2 == 0) {
                        text.hashCode();
                        throw null;
                    }
                    RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) customTabsIntentApi21Impl.b.getValue();
                    if (registeredMemberRegistration2 != null) {
                        Context contextRequireContext2 = customTabsIntentApi21Impl.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                        String string4 = Settings.Secure.getString(contextRequireContext2.getContentResolver(), "android_id");
                        Intrinsics.checkExpressionValueIsNotNull(string4, "");
                        EditText editText4 = customTabsIntentApi21Impl.INotificationSideChannelStub().tilBirthDate.getEditText();
                        String string5 = StringsKt.trim((CharSequence) String.valueOf(editText4 != null ? editText4.getText() : null)).toString();
                        EditText editText5 = customTabsIntentApi21Impl.INotificationSideChannelStub().tilIdNumber.getEditText();
                        String string6 = StringsKt.trim((CharSequence) String.valueOf(editText5 != null ? editText5.getText() : null)).toString();
                        EditText editText6 = customTabsIntentApi21Impl.INotificationSideChannelStub().tilFullName.getEditText();
                        text = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration2, string4, null, null, null, MembershipType.BPU, null, StringsKt.trim((CharSequence) String.valueOf(editText6 != null ? editText6.getText() : null)).toString(), string6, null, null, null, null, string5, String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b), null, null, null, customTabsIntentApi21Impl.d, null, customTabsIntentApi21Impl.onTransact, customTabsIntentApi21Impl.cancelAll, 1511214);
                    }
                    ((getUntrustedCreatorPackageName) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.setValue((RegisteredMemberRegistration) text);
                    ((getUntrustedCreatorPackageName) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                } else if (Intrinsics.areEqual(customTabsIntentApi21Impl.write, "902")) {
                    BookingAntreanFormActivity.Companion companion = BookingAntreanFormActivity.INSTANCE;
                    Context contextRequireContext3 = customTabsIntentApi21Impl.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                    EditText editText7 = customTabsIntentApi21Impl.INotificationSideChannelStub().tilIdNumber.getEditText();
                    String string7 = StringsKt.trim((CharSequence) String.valueOf(editText7 != null ? editText7.getText() : null)).toString();
                    EditText editText8 = customTabsIntentApi21Impl.INotificationSideChannelStub().tilFullName.getEditText();
                    String string8 = StringsKt.trim((CharSequence) String.valueOf(editText8 != null ? editText8.getText() : null)).toString();
                    EditText editText9 = customTabsIntentApi21Impl.INotificationSideChannelStub().tilBirthDate.getEditText();
                    BookingAntreanFormActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext3, string7, string8, StringsKt.trim((CharSequence) String.valueOf(editText9 != null ? editText9.getText() : null)).toString(), customTabsIntentApi21Impl.onTransact, customTabsIntentApi21Impl.cancelAll, customTabsIntentApi21Impl.RemoteActionCompatParcelizer, customTabsIntentApi21Impl.INotificationSideChannelDefault, "REG", "BPU", ((PreferenceManager) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", ""));
                } else if (Intrinsics.areEqual(customTabsIntentApi21Impl.write, "903")) {
                    String string9 = ((PreferenceManager) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "");
                    getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    EditText editText10 = customTabsIntentApi21Impl.INotificationSideChannelStub().tilIdNumber.getEditText();
                    if (editText10 != null) {
                        int i8 = getExtras + 39;
                        getItem = i8 % 128;
                        if (i8 % 2 == 0) {
                            editText10.getText();
                            throw null;
                        }
                        text = editText10.getText();
                    }
                    getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1(string9, StringsKt.trim((CharSequence) String.valueOf(text)).toString());
                } else {
                    getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                    String string10 = customTabsIntentApi21Impl.getString(R.string.title_data_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string10, "");
                    String string11 = customTabsIntentApi21Impl.getString(R.string.message_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string11, "");
                    String string12 = customTabsIntentApi21Impl.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string12, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_information, string10, string11, string12, new Function0() { // from class: setCurrentLocaleAsDefaultAcceptLanguage
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CustomTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        }
                    }, 96);
                    FragmentManager childFragmentManager = customTabsIntentApi21Impl.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                    i = getItem + 91;
                    getExtras = i % 128;
                    int i9 = i % 2;
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i10 = getExtras + 11;
                getItem = i10 % 128;
                int i11 = i10 % 2;
                customTabsIntentApi21Impl.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                String string13 = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                String string14 = customTabsIntentApi21Impl.getString(R.string.error_data_membership_not_found);
                Intrinsics.checkNotNullExpressionValue(string14, "");
                if (StringsKt.contains$default((CharSequence) string13, (CharSequence) string14, false, 2, (Object) null)) {
                    getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
                    String string15 = customTabsIntentApi21Impl.getString(R.string.title_data_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string15, "");
                    String string16 = customTabsIntentApi21Impl.getString(R.string.message_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string16, "");
                    String string17 = customTabsIntentApi21Impl.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string17, "");
                    getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string15, string16, string17, new Function0() { // from class: addDefaultShareMenuItem
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CustomTabsIntentApi21Impl.asInterface();
                        }
                    }, 96);
                    FragmentManager childFragmentManager2 = customTabsIntentApi21Impl.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                    if (childFragmentManager2.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        int i12 = getItem + 109;
                        getExtras = i12 % 128;
                        int i13 = i12 % 2;
                        getstringornullB2.show(childFragmentManager2, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    CustomTabsIntentApi21Impl customTabsIntentApi21Impl2 = customTabsIntentApi21Impl;
                    String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Intrinsics.checkNotNullParameter(customTabsIntentApi21Impl2, "");
                    Intrinsics.checkNotNullParameter(strValueOf, "");
                    BaseActivity baseActivity = (BaseActivity) customTabsIntentApi21Impl2.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                        i = getItem + 65;
                        getExtras = i % 128;
                        int i14 = i % 2;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    public static /* synthetic */ Unit b(CustomTabsIntentApi21Impl customTabsIntentApi21Impl, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        customTabsIntentApi21Impl.RemoteActionCompatParcelizer = String.valueOf(userLocationComplete.b);
        customTabsIntentApi21Impl.INotificationSideChannelDefault = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo != null) {
            int i2 = getItem + 69;
            getExtras = i2 % 128;
            int i3 = i2 % 2;
            str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        customTabsIntentApi21Impl.INotificationSideChannelStub = str;
        customTabsIntentApi21Impl.getInterfaceDescriptor = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 != null) {
            int i4 = getExtras + 107;
            getItem = i4 % 128;
            int i5 = i4 % 2;
            str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        customTabsIntentApi21Impl.INotificationSideChannelStubProxy = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 == null || (str3 = locationAddressInfo3.d) == null) {
            int i6 = getItem + 53;
            getExtras = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int i8 = getItem + 61;
            getExtras = i8 % 128;
            int i9 = i8 % 2;
            str4 = str3;
        }
        customTabsIntentApi21Impl.connect = str4;
        String str5 = customTabsIntentApi21Impl.RemoteActionCompatParcelizer;
        String str6 = customTabsIntentApi21Impl.INotificationSideChannelDefault;
        String str7 = customTabsIntentApi21Impl.INotificationSideChannelStub;
        String str8 = customTabsIntentApi21Impl.getInterfaceDescriptor;
        String str9 = customTabsIntentApi21Impl.INotificationSideChannelStubProxy;
        StringBuilder sb = new StringBuilder("Location from GPS: ");
        sb.append(str5);
        sb.append(", ");
        sb.append(str6);
        sb.append(", City: ");
        sb.append(str7);
        sb.append(", Province: ");
        sb.append(str8);
        sb.append(", Country: ");
        sb.append(str9);
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface() {
        int i = 2 % 2;
        int i2 = getExtras + 113;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = getItem + 103;
        getExtras = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0064  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CustomTabsIntentApi21Impl customTabsIntentApi21Impl) throws IOException {
        int i = 2 % 2;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) customTabsIntentApi21Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null) {
            int i2 = getItem + 99;
            getExtras = i2 % 128;
            if (i2 % 2 != 0) {
                camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                throw null;
            }
            if (camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                customTabsIntentApi21Impl.RemoteActionCompatParcelizer = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
                customTabsIntentApi21Impl.INotificationSideChannelDefault = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                customTabsIntentApi21Impl.INotificationSideChannelStub = camera2CameraControlExternalSyntheticLambda4B.b;
                customTabsIntentApi21Impl.getInterfaceDescriptor = camera2CameraControlExternalSyntheticLambda4B.g;
                customTabsIntentApi21Impl.INotificationSideChannelStubProxy = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                customTabsIntentApi21Impl.connect = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str = customTabsIntentApi21Impl.RemoteActionCompatParcelizer;
                String str2 = customTabsIntentApi21Impl.INotificationSideChannelDefault;
                StringBuilder sb = new StringBuilder("Location from cache: ");
                sb.append(str);
                sb.append(", ");
                sb.append(str2);
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
            } else {
                customTabsIntentApi21Impl.RemoteActionCompatParcelizer = "0.0";
                customTabsIntentApi21Impl.INotificationSideChannelDefault = "0.0";
                ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
                int i3 = getExtras + 17;
                getItem = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            customTabsIntentApi21Impl.RemoteActionCompatParcelizer = "0.0";
            customTabsIntentApi21Impl.INotificationSideChannelDefault = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop3 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
            int i5 = getExtras + 17;
            getItem = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentbindingInflater1 = zaq.TuitionPaymentFragmentbindingInflater1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaq.TuitionPaymentFragmentbindingInflater1(), new Object[0], -1926499962, zaq.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, 1926499967, zaq.TuitionPaymentFragmentbindingInflater1());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(CustomTabsIntentApi21Impl customTabsIntentApi21Impl, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        int i = 2 % 2;
        int i2 = getItem + 83;
        getExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(customTabsIntentApi21Impl, virtualCameraAdapter1);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(customTabsIntentApi21Impl, virtualCameraAdapter1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CustomTabsIntentApi21Impl customTabsIntentApi21Impl, View view) {
        int iTuitionPaymentFragmentbindingInflater1 = zaq.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaq.TuitionPaymentFragmentbindingInflater1(), new Object[]{customTabsIntentApi21Impl, view}, 386449033, zaq.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, -386449032, zaq.TuitionPaymentFragmentbindingInflater1());
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CustomTabsIntentApi21Impl customTabsIntentApi21Impl, int i, int i2, int i3) {
        Object[] objArr = {customTabsIntentApi21Impl, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iTuitionPaymentFragmentbindingInflater1 = zaq.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaq.TuitionPaymentFragmentbindingInflater1(), objArr, -1756767926, zaq.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, 1756767928, zaq.TuitionPaymentFragmentbindingInflater1());
    }

    static {
        disconnect = 0;
        a();
        INSTANCE = new Companion(null);
        int i = getRoot + 125;
        disconnect = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        int iTuitionPaymentFragmentbindingInflater1 = zaq.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaq.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, -988975153, zaq.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, 988975153, zaq.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        int i = 2 % 2;
        int i2 = getExtras + 105;
        getItem = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        int iTuitionPaymentFragmentbindingInflater1 = zaq.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaq.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, -474781011, zaq.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, 474781015, zaq.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        int iTuitionPaymentFragmentbindingInflater1 = zaq.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zaq.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 711045584, zaq.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, -711045581, zaq.TuitionPaymentFragmentbindingInflater1());
    }

    static void a() {
        getNotifyChildrenChangedOptions = -8172422276612484663L;
    }
}
