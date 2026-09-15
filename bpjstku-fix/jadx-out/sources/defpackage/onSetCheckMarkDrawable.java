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
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
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
import com.bpjstku.data.registration.general.model.request.ActivationRequest;
import com.bpjstku.data.registration.general.model.request.MembershipCheckRequest;
import com.bpjstku.data.registration.general.model.request.OcrKtpRequest;
import com.bpjstku.data.registration.general.model.response.ActivationItem;
import com.bpjstku.data.registration.general.model.response.OcrKtpResponse;
import com.bpjstku.data.registration.general.model.response.ResultOcr;
import com.bpjstku.databinding.FragmentSalariedWorkerPersonalDataActivationBinding;
import com.bpjstku.domain.registration.general.model.MembershipCheckNew;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPersonalDataActivationFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.salariedworker.KtpCameraActivity;
import com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity;
import com.bpjstku.presentation.queueing.BookingAntreanFormActivity;
import com.bpjstku.presentation.queueing.BookingAntreanSuccessActivity;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0015\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0015\u0010\u001b\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0015\u0010\u001e\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0015\u0010!\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\u0014R\u001d\u0010%\u001a\u0004\u0018\u00010\"8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0016\u0010)\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\t\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010\u0018R\u0016\u0010+\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0016\u00100\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u0018\u0010/\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0018\u00101\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010\u0018R\u001e\u0010.\u001a\f\u0012\b\u0012\u0006*\u00020303028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u0006*\u00020303028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u00104R.\u0010\u001d\u001a\u001c\u0012\u0004\u0012\u000206\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002058UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b)\u00108R\u001a\u0010 \u001a\u0002098\u0015X\u0095D¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b-\u0010;"}, d2 = {"LonSetCheckMarkDrawable;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentSalariedWorkerPersonalDataActivationBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "p0", "TuitionPaymentFragmentbindingInflater1", "(Z)V", "Lcom/bpjstku/data/lib/PreferenceManager;", "connect", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "getRoot", "Ljava/lang/String;", "LsetSplitTrack;", "MediaBrowserCompat", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetUntrustedCreatorPackageName;", "read", "b", "LgetStreamUseCaseSupportedCombinationList;", "disconnect", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "asInterface", "()Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "a", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "Z", "d", "Ljava/io/File;", "notify", "Ljava/io/File;", "asBinder", "IconCompatParcelizer", "INotificationSideChannelStub", "RemoteActionCompatParcelizer", "write", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResultLauncher;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "()Lkotlin/jvm/functions/Function3;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onSetCheckMarkDrawable extends AutoValue_ImmutableImageInfo<FragmentSalariedWorkerPersonalDataActivationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int[] getExtras;
    private static int getServiceComponent;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> connect;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private String cancelAll;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private String onTransact;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private String cancel;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String INotificationSideChannel;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Calendar asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String INotificationSideChannelStub;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String getInterfaceDescriptor;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> IconCompatParcelizer;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private boolean d;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1 = "";

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private File asBinder;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final int disconnect;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String MediaBrowserCompat;
    private static final byte[] $$c = {115, 25, -47, -94};
    private static final int $$f = 53;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {97, 58, 103, -72, -52, 17, -5, -6, 28, -33, 2, 13, 4, -12, 36, -36, -3, 4, 39, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 12, -64, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 18, -7, -5, 10, -5, -5, 7, 30, -37, 8, -6, 11, -19, 15, -13, 65};
    private static final int $$e = 212;
    private static final byte[] $$a = {91, -9, 99, 11, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 254;
    private static int isConnected = 1;
    private static int getNotifyChildrenChangedOptions = 0;
    private static int getItem = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
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

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i);
        int i9 = (~(i7 | i6)) | i8 | (~(i | i6));
        int i10 = (~((~i) | i5)) | (~(i5 | i6));
        int i11 = (~((~i6) | i7)) | i8;
        int i12 = i5 + i + i4 + (1821889583 * i3) + ((-349070011) * i2);
        int i13 = i12 * i12;
        int i14 = (575745661 * i5) + 325058560 + (1920428227 * i) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i4) + (473956352 * i3) + (1723858944 * i2) + ((-1436549120) * i13);
        int i15 = (i5 * 921699331) + 387174459 + (i * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i4 * 921699455) + (i3 * 347275089) + (i2 * 1925323067) + (i13 * 94371840);
        int i16 = i14 + (i15 * i15 * (-174063616));
        if (i16 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i16 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i16 == 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i16 == 4) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i16 == 5) {
            return b(objArr);
        }
        int i17 = 2 % 2;
        int i18 = getNotifyChildrenChangedOptions + 35;
        getItem = i18 % 128;
        int i19 = i18 % 2;
        SalariedWorkerPersonalDataActivationFragment$bindingInflater$1 salariedWorkerPersonalDataActivationFragment$bindingInflater$1 = SalariedWorkerPersonalDataActivationFragment$bindingInflater$1.b;
        int i20 = getItem + 11;
        getNotifyChildrenChangedOptions = i20 % 128;
        int i21 = i20 % 2;
        return salariedWorkerPersonalDataActivationFragment$bindingInflater$1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 14
            int r9 = r9 + 84
            byte[] r0 = defpackage.onSetCheckMarkDrawable.$$a
            int r8 = r8 * 52
            int r8 = 55 - r8
            int r7 = r7 * 52
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2e
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2e:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onSetCheckMarkDrawable.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.onSetCheckMarkDrawable.$$d
            int r6 = r6 * 40
            int r6 = r6 + 4
            int r8 = r8 * 19
            int r8 = r8 + 65
            int r7 = r7 * 3
            int r1 = 41 - r7
            byte[] r1 = new byte[r1]
            int r7 = 40 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r6
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L31:
            int r4 = -r4
            int r6 = r6 + 1
            int r8 = r8 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onSetCheckMarkDrawable.f(byte, short, int, java.lang.Object[]):void");
    }

    public onSetCheckMarkDrawable() {
        final onSetCheckMarkDrawable onsetcheckmarkdrawable = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPersonalDataActivationFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = onsetcheckmarkdrawable;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final onSetCheckMarkDrawable onsetcheckmarkdrawable2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPersonalDataActivationFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = onsetcheckmarkdrawable2;
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
        final onSetCheckMarkDrawable onsetcheckmarkdrawable3 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPersonalDataActivationFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = onsetcheckmarkdrawable3.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.b = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPersonalDataActivationFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                return getFocusY.b(onsetcheckmarkdrawable3, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPersonalDataActivationFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = onsetcheckmarkdrawable2;
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
        this.a = LazyKt.lazy(new Function0() { // from class: createDrawableFor
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.asInterface = calendar;
        this.g = "";
        this.cancel = "";
        this.cancelAll = "";
        this.INotificationSideChannel = "";
        this.onTransact = "";
        this.notify = "";
        this.INotificationSideChannelStubProxy = "0.0";
        this.RemoteActionCompatParcelizer = "0.0";
        this.MediaBrowserCompat = "902";
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: getTintModeForDrawableRes
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.IconCompatParcelizer = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: preload
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) throws Throwable {
                onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.connect = activityResultLauncherRegisterForActivityResult2;
        this.disconnect = R.layout.fragment_salaried_worker_personal_data_activation;
    }

    /* JADX INFO: renamed from: onSetCheckMarkDrawable$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LonSetCheckMarkDrawable$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "LonSetCheckMarkDrawable;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LonSetCheckMarkDrawable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static onSetCheckMarkDrawable TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new onSetCheckMarkDrawable();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getExtras;
        char c = '0';
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $10 + 59;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr3[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i5;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", c) + 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3291, 31 - Color.green(i5), 1948206109, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr2[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    c = '0';
                    i3 = -1870535734;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getExtras;
        float f = 0.0f;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                try {
                    Object[] objArr3 = new Object[i4];
                    objArr3[0] = Integer.valueOf(iArr5[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 3291, TextUtils.getCapsMode("", 0, 0) + 31, 1948206109, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i8++;
                    iArr5 = iArr5;
                    f = 0.0f;
                    i4 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            for (int i9 = 17; i9 > 1; i9--) {
                int i10 = $11 + 117;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i9];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int scrollDefaultDelay = 2559 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int maximumDrawingCacheSize = 29 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    byte b5 = (byte) ($$f & 3);
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, scrollDefaultDelay, maximumDrawingCacheSize, 683220507, false, $$g(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
            }
            int i12 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i13 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28879), 396 - AndroidCharacter.getMirror('0'), TextUtils.getCapsMode("", 0, 0) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            int i14 = $11 + 107;
            $10 = i14 % 128;
            int i15 = i14 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final RegisteredMemberRegistration asInterface() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 37567);
            int i2 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 624;
            int iGreen = Color.green(0) + 14;
            byte[] bArr = $$a;
            byte b = bArr[7];
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, i2, iGreen, -477065106, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{1948669049, -1380374693, -1460070043, -1588573818, 950765801, -1015767830, 2006573765, -1158593894, 501789251, -1568760522, 2054997732, 1944126963, -232142023, 2012416599}, (ViewConfiguration.getScrollBarSize() >> 8) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{1115794071, 1261153081, 1837269971, -2025366447, 64379275, -1754136231, 217876010, -420981777, -855313540, -885231421}, 14 - TextUtils.lastIndexOf("", '0', 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout = (char) (37567 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int iBlue = Color.blue(0) + 625;
            int iRgb = (-16777202) - Color.rgb(0, 0, 0);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(b3, b3, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, iBlue, iRgb, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode2 = (char) (37567 - TextUtils.getCapsMode("", 0, 0));
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 625;
                int scrollBarFadeDuration2 = 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[5];
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode2, scrollBarFadeDuration, scrollBarFadeDuration2, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i4};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i5 = ~iMaxMemory;
            int i6 = ~((-1030721454) | i5);
            int i7 = ~((-793016668) | iMaxMemory);
            int i8 = 1146339344 + ((i6 | i7) * 1150) + (((~(793016667 | i5)) | i7) * (-575)) + (((~(iMaxMemory | (-1030721454))) | (~(i5 | 1030721453))) * 575) + 548695501;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i3}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{-1837110725, -882784050, -813038062, 951232953, -765707772, 1303576049, 1929892403, 1651240834, 1117732117, 42154977, -285913525, 823670588, -185142749, 1542686113, -714020439, 617668440}, 26 - (ViewConfiguration.getTouchSlop() >> 8), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{-673911673, -104777338, 1343018748, 410209188, 1064669182, 1133668280, -781796976, 896197321, -1963870896, 237982278, -2089269575, -716015787}, 18 - (ViewConfiguration.getEdgeSlop() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = getItem + 75;
                getNotifyChildrenChangedOptions = i11 % 128;
                if (i11 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i12 = getNotifyChildrenChangedOptions + 101;
                    getItem = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            e(new int[]{-803873049, 789017816, -997837880, -1697227653, 797934235, -1761883181, 906146876, -873455622, -955512180, 906248474}, 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new int[]{-35725732, -1706181488, -1722327128, -83161179, 647742250, -741359332, -678669861, -1914046377, 1231242985, -1749452216}, TextUtils.getCapsMode("", 0, 0) + 16, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e(new int[]{-1151500846, -454800399, -695218244, 976893702, -176039716, -1214124678, -1457665771, 475777635, 1874298612, -1644689847, -1457372191, -531848981, -448150758, 1349867488, 2135725351, 475108010, -1711190318, 1760373342, -21465282, -138670268, -1257749525, -1127509995, -208929648, 310419589, -230432231, -417042402, -1710400662, 1666378143, -599496677, 1565173843, -1036821892, -2070045987, -1263866834, -435300954}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 65, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e(new int[]{1758775752, 1607479483, 957503924, -2009114780, -1053266662, -1388331547, -1058543740, 876826423, -1949630275, -1544550841, 1641415322, 580618439, -1513924454, 1129333550, 354431595, -583926297, -1641889620, -592435193, 724715624, -1202119361, 616943577, 277990667, -632465306, 818051154, -1062646217, 948676576, 1403155458, -166498338, 1648846118, -1922441532, 1965463145, -108169011, 275607537, 623597652}, 63 - MotionEvent.axisFromString(""), objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i14 = getItem + 77;
            getNotifyChildrenChangedOptions = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 548695501};
                byte[] bArr4 = $$d;
                byte b6 = (byte) (bArr4[49] - 1);
                byte b7 = b6;
                Object[] objArr15 = new Object[1];
                f(b6, b7, b7, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b8 = bArr4[49];
                byte b9 = b8;
                Object[] objArr16 = new Object[1];
                f(b8, b9, b9, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i16 = ((int[]) objArr17[0])[0];
                int i17 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char capsMode3 = (char) (37567 - TextUtils.getCapsMode("", 0, 0));
                        int size = View.MeasureSpec.getSize(0) + 625;
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 15;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[5];
                        byte b11 = bArr5[7];
                        Object[] objArr18 = new Object[1];
                        c(b10, b11, b11, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode3, size, packedPositionChild, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        e(new int[]{1948669049, -1380374693, -1460070043, -1588573818, 950765801, -1015767830, 2006573765, -1158593894, 501789251, -1568760522, 2054997732, 1944126963, -232142023, 2012416599}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        e(new int[]{1115794071, 1261153081, 1837269971, -2025366447, 64379275, -1754136231, 217876010, -420981777, -855313540, -885231421}, 15 - KeyEvent.keyCodeFromString(""), objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37567);
                            int iIndexOf = 625 - TextUtils.indexOf("", "", 0, 0);
                            int i18 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15;
                            byte[] bArr6 = $$a;
                            byte b12 = bArr6[5];
                            Object[] objArr21 = new Object[1];
                            c(b12, b12, bArr6[7], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iIndexOf, i18, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37567);
                            int modifierMetaStateMask = 624 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int iIndexOf2 = 13 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            byte[] bArr7 = $$a;
                            byte b13 = bArr7[7];
                            byte b14 = bArr7[5];
                            Object[] objArr22 = new Object[1];
                            c(b13, b14, b14, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, modifierMetaStateMask, iIndexOf2, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 == null) {
                throw null;
            }
            for (String str2 : strArr3) {
                arrayList.add(str2);
            }
            throw null;
        }
        int i19 = getNotifyChildrenChangedOptions + 83;
        getItem = i19 % 128;
        int i20 = i19 % 2;
        int i21 = ((int[]) objArr[1])[0];
        int i22 = ((int[]) objArr[2])[0];
        int i23 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int[] iArr2 = {i22};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i24 = (~((-1314945737) | elapsedCpuTime)) | 239077952;
        int i25 = ~((~elapsedCpuTime) | 1584660168);
        int i26 = i21 + (-1773741432) + ((i24 | i25) * (-470)) + (((~(elapsedCpuTime | (-1075867785))) | i25) * 470);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr[1])[0] = i28 ^ (i28 << 5);
        Object[] objArr23 = {new int[]{i23}, new int[1], iArr2, strArr4};
        return (RegisteredMemberRegistration) this.a.getValue();
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getCancel() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 95;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.disconnect;
        if (i3 == 0) {
            int i5 = 35 / 0;
        }
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:39:0x0121  */
    /* JADX WARN: Code duplicated, block: B:53:0x0156  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a2 A[PHI: r1
  0x01a2: PHI (r1v20 android.widget.EditText) = (r1v19 android.widget.EditText), (r1v26 android.widget.EditText) binds: [B:73:0x01a0, B:70:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() throws Throwable {
        String strName;
        EditText editText;
        EditText editText2;
        EditText editText3;
        Citizenship citizenship;
        Citizenship citizenship2;
        int i = 2 % 2;
        EditText editText4 = INotificationSideChannelStub().tilFullName.getEditText();
        if (editText4 != null) {
            Intrinsics.checkNotNullParameter(editText4, "");
            editText4.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        FragmentSalariedWorkerPersonalDataActivationBinding fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        RegisteredMemberRegistration registeredMemberRegistrationAsInterface = asInterface();
        String str = null;
        if (registeredMemberRegistrationAsInterface == null || (citizenship2 = registeredMemberRegistrationAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
            strName = null;
        } else {
            int i2 = getNotifyChildrenChangedOptions + 105;
            getItem = i2 % 128;
            int i3 = i2 % 2;
            strName = citizenship2.name();
        }
        this.g = String.valueOf(strName);
        RegisteredMemberRegistration registeredMemberRegistrationAsInterface2 = asInterface();
        if (Intrinsics.areEqual((registeredMemberRegistrationAsInterface2 == null || (citizenship = registeredMemberRegistrationAsInterface2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship.name(), "WNA")) {
            fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.setHint(getString(R.string.label_passport_no));
            fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.edtIdNumber.setInputType(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.edtIdNumber.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(20)});
        } else {
            fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.setHint(getString(R.string.hint_id_number));
            fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.edtIdNumber.setInputType(3);
            fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.edtIdNumber.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
            fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.edtIdNumber.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
        }
        RegisteredMemberRegistration registeredMemberRegistrationAsInterface3 = asInterface();
        boolean z = false;
        if (registeredMemberRegistrationAsInterface3 != null) {
            FragmentSalariedWorkerPersonalDataActivationBinding fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub2 = INotificationSideChannelStub();
            String str2 = registeredMemberRegistrationAsInterface3.asInterface;
            if (str2 != null) {
                int i4 = getItem + 41;
                getNotifyChildrenChangedOptions = i4 % 128;
                int i5 = i4 % 2;
                if (str2.length() <= 0) {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            if (str2 != null) {
                int i6 = getItem + 109;
                getNotifyChildrenChangedOptions = i6 % 128;
                int i7 = i6 % 2;
                fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub2.edtIdNumber.setText(str2);
                int i8 = getNotifyChildrenChangedOptions + 117;
                getItem = i8 % 128;
                int i9 = i8 % 2;
            }
            String str3 = registeredMemberRegistrationAsInterface3.d;
            if (str3 != null) {
                int i10 = getNotifyChildrenChangedOptions + 23;
                getItem = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 27 / 0;
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                } else if (str3.length() <= 0) {
                    str3 = null;
                }
            } else {
                str3 = null;
            }
            if (str3 != null && (editText3 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub2.tilJamsostekIdNumber.getEditText()) != null) {
                editText3.setText(str3);
            }
            String str4 = registeredMemberRegistrationAsInterface3.asBinder;
            if (str4 != null) {
                int i12 = getNotifyChildrenChangedOptions + 71;
                getItem = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 26 / 0;
                    if (str4.length() <= 0) {
                        str4 = null;
                    }
                } else if (str4.length() <= 0) {
                    str4 = null;
                }
            } else {
                str4 = null;
            }
            if (str4 != null && (editText2 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub2.tilFullName.getEditText()) != null) {
                editText2.setText(str4);
            }
            String str5 = registeredMemberRegistrationAsInterface3.notify;
            if (str5 != null && str5.length() > 0) {
                int i14 = getItem + 35;
                getNotifyChildrenChangedOptions = i14 % 128;
                if (i14 % 2 != 0) {
                    throw null;
                }
                str = str5;
            }
            if (str != null) {
                int i15 = getItem + 115;
                getNotifyChildrenChangedOptions = i15 % 128;
                if (i15 % 2 != 0) {
                    editText = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub2.tilBirthDate.getEditText();
                    int i16 = 41 / 0;
                    if (editText != null) {
                        editText.setText(str);
                    }
                } else {
                    editText = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub2.tilBirthDate.getEditText();
                    if (editText != null) {
                        editText.setText(str);
                    }
                }
                Date date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(str);
                if (date != null) {
                    int i17 = getNotifyChildrenChangedOptions + 17;
                    getItem = i17 % 128;
                    if (i17 % 2 == 0) {
                        this.asInterface.setTime(date);
                        int i18 = 29 / 0;
                    } else {
                        this.asInterface.setTime(date);
                    }
                }
            }
        }
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        experimentalCamera2Interop.b(contextRequireContext, new Function1() { // from class: setPorterDuffColorFilter
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: createSwitchThumbColorStateList
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        if (this.asBinder != null) {
            int i19 = getItem + 17;
            getNotifyChildrenChangedOptions = i19 % 128;
            int i20 = i19 % 2;
            z = true;
        }
        TuitionPaymentFragmentbindingInflater1(z);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        int i = 2 % 2;
        CardView cardView = INotificationSideChannelStub().cvFotoKtp;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AppCompatDrawableManager
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        final FragmentSalariedWorkerPersonalDataActivationBinding fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: createDefaultButtonColorStateList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        EditText editText = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: createColoredButtonColorStateList
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view};
                    int iB = SearchView9.b();
                    int iB2 = SearchView9.b();
                    onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, -1617693842, SearchView9.b(), SearchView9.b(), iB2, 1617693847, iB);
                }
            });
            int i2 = getNotifyChildrenChangedOptions + 21;
            getItem = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = getItem + 51;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    private static final Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(onSetCheckMarkDrawable onsetcheckmarkdrawable, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            onsetcheckmarkdrawable.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            onsetcheckmarkdrawable.write();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            String transactionId = ((OcrKtpResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getTransactionId();
            if (transactionId != null) {
                ((PreferenceManager) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).saveString("OCR_TRANSACTION_ID", transactionId);
            }
            ResultOcr data = ((OcrKtpResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
            RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (data != null) {
                String nik = data.getNik();
                if (nik != null) {
                    if (nik.length() <= 0) {
                        nik = null;
                    }
                    if (nik != null) {
                        EditText editText = onsetcheckmarkdrawable.INotificationSideChannelStub().tilIdNumber.getEditText();
                        if (editText != null) {
                            editText.setText(nik);
                        }
                        onsetcheckmarkdrawable.cancel = nik;
                    }
                }
                String nama = data.getNama();
                if (nama != null) {
                    if (nama.length() <= 0) {
                        nama = null;
                    }
                    if (nama != null) {
                        int i2 = getItem + 25;
                        getNotifyChildrenChangedOptions = i2 % 128;
                        int i3 = i2 % 2;
                        EditText editText2 = onsetcheckmarkdrawable.INotificationSideChannelStub().tilFullName.getEditText();
                        if (editText2 != null) {
                            editText2.setText(nama);
                            int i4 = getItem + 101;
                            getNotifyChildrenChangedOptions = i4 % 128;
                            int i5 = i4 % 2;
                        }
                        onsetcheckmarkdrawable.cancelAll = nama;
                    }
                }
                String tglLahir = data.getTglLahir();
                if (tglLahir != null) {
                    if (tglLahir.length() <= 0) {
                        tglLahir = null;
                    }
                    if (tglLahir != null) {
                        EditText editText3 = onsetcheckmarkdrawable.INotificationSideChannelStub().tilBirthDate.getEditText();
                        if (editText3 != null) {
                            editText3.setText(tglLahir);
                        }
                        onsetcheckmarkdrawable.INotificationSideChannel = tglLahir;
                        try {
                            Date date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(tglLahir);
                            if (date != null) {
                                onsetcheckmarkdrawable.asInterface.setTime(date);
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
                        onsetcheckmarkdrawable.onTransact = tempatLahir;
                    }
                }
                String alamat = data.getAlamat();
                if (alamat != null) {
                    if (alamat.length() <= 0) {
                        alamat = null;
                    }
                    if (alamat != null) {
                        int i6 = getItem + 87;
                        getNotifyChildrenChangedOptions = i6 % 128;
                        if (i6 % 2 != 0) {
                            onsetcheckmarkdrawable.notify = alamat;
                            registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
                            throw null;
                        }
                        onsetcheckmarkdrawable.notify = alamat;
                    }
                }
            }
            File file = onsetcheckmarkdrawable.asBinder;
            if (file != null) {
                getUntrustedCreatorPackageName getuntrustedcreatorpackagename = (getUntrustedCreatorPackageName) onsetcheckmarkdrawable.b.getValue();
                RegisteredMemberRegistration registeredMemberRegistrationAsInterface = onsetcheckmarkdrawable.asInterface();
                if (registeredMemberRegistrationAsInterface != null) {
                    int i7 = getItem + 23;
                    getNotifyChildrenChangedOptions = i7 % 128;
                    int i8 = i7 % 2;
                    registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistrationAsInterface, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, file, null, null, null, 7864319);
                }
                getuntrustedcreatorpackagename.b.setValue(registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            onsetcheckmarkdrawable.TuitionPaymentFragmentbindingInflater1 = ((PreferenceManager) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "");
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i9 = getItem + 93;
            getNotifyChildrenChangedOptions = i9 % 128;
            int i10 = i9 % 2;
            onsetcheckmarkdrawable.write();
            Toast.makeText(onsetcheckmarkdrawable.requireContext(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        int i = 2 % 2;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).INotificationSideChannelStubProxy.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: applyButtonTint
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        onSetCheckMarkDrawable onsetcheckmarkdrawable = this;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(onsetcheckmarkdrawable, new Observer() { // from class: tintDrawable
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.observe(getViewLifecycleOwner(), new Observer() { // from class: getTintList
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                onSetCheckMarkDrawable.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        ((getStreamUseCaseSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(onsetcheckmarkdrawable, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: getPorterDuffColorFilter
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj};
                int iB = SearchView9.b();
                int iB2 = SearchView9.b();
                return (Unit) onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, 117691720, SearchView9.b(), SearchView9.b(), iB2, -117691718, iB);
            }
        }));
        int i2 = getItem + 25;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() throws Throwable {
        RegisteredMemberRegistration registeredMemberRegistration;
        String strName;
        Citizenship citizenship;
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 99;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        final FragmentSalariedWorkerPersonalDataActivationBinding fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        Bundle arguments = getArguments();
        String strName2 = null;
        if (arguments != null) {
            int i4 = getNotifyChildrenChangedOptions + 11;
            getItem = i4 % 128;
            int i5 = i4 % 2;
            registeredMemberRegistration = (RegisteredMemberRegistration) arguments.getParcelable("registration_data");
        } else {
            registeredMemberRegistration = null;
        }
        if (registeredMemberRegistration != null) {
            Citizenship citizenship2 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        if (registeredMemberRegistration != null) {
            int i6 = getNotifyChildrenChangedOptions + 69;
            getItem = i6 % 128;
            int i7 = i6 % 2;
            Citizenship citizenship3 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (citizenship3 != null) {
                int i8 = getNotifyChildrenChangedOptions + 33;
                getItem = i8 % 128;
                if (i8 % 2 == 0) {
                    citizenship3.name();
                    strName2.hashCode();
                    throw null;
                }
                strName = citizenship3.name();
            } else {
                strName = null;
            }
        } else {
            strName = null;
        }
        String string = Intrinsics.areEqual(strName, "WNA") ? getString(R.string.label_min_identity_number) : getString(R.string.error_field_nik);
        Intrinsics.checkNotNull(string);
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        List listMutableListOf = CollectionsKt.mutableListOf(new accessconfigureInstanceInternal("^.{1,}$", string2), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: createBorderlessButtonColorStateList
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub));
            }
        }, string));
        RegisteredMemberRegistration registeredMemberRegistrationAsInterface = asInterface();
        if (registeredMemberRegistrationAsInterface != null && (citizenship = registeredMemberRegistrationAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
            int i9 = getItem + 21;
            getNotifyChildrenChangedOptions = i9 % 128;
            int i10 = i9 % 2;
            strName2 = citizenship.name();
        }
        if (Intrinsics.areEqual(strName2, "WNI")) {
            String string3 = getString(R.string.error_invalid_field);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            listMutableListOf.add(new accessconfigureInstanceInternal("^[0-9]{0,}$", string3));
            int i11 = getNotifyChildrenChangedOptions + 47;
            getItem = i11 % 128;
            int i12 = i11 % 2;
        }
        TextInputLayout textInputLayout = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, listMutableListOf));
        TextInputLayout textInputLayout2 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout3 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilJamsostekIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        String string6 = getString(R.string.error_field_kpj_max_length);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string5), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string6, 11, 11)})));
        TextInputLayout textInputLayout4 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string7 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string7))));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 67;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i4 = getItem + 9;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        onSetCheckMarkDrawable onsetcheckmarkdrawable = (onSetCheckMarkDrawable) objArr[0];
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 11;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = onsetcheckmarkdrawable.INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
        int i4 = getNotifyChildrenChangedOptions + 27;
        getItem = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void TuitionPaymentFragmentbindingInflater1(boolean p0) throws Throwable {
        Citizenship citizenship;
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 7;
        getItem = i2 % 128;
        String strName = null;
        if (i2 % 2 == 0) {
            asInterface();
            throw null;
        }
        RegisteredMemberRegistration registeredMemberRegistrationAsInterface = asInterface();
        if (registeredMemberRegistrationAsInterface == null || (citizenship = registeredMemberRegistrationAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
            int i3 = getNotifyChildrenChangedOptions + 107;
            getItem = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = getNotifyChildrenChangedOptions + 5;
            getItem = i5 % 128;
            int i6 = i5 % 2;
            strName = citizenship.name();
        }
        if (!Intrinsics.areEqual(strName, "WNI")) {
            p0 = true;
        }
        FragmentSalariedWorkerPersonalDataActivationBinding fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.setEnabled(p0);
        fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.setEnabled(p0);
        fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.setEnabled(p0);
        EditText editText = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
        if (editText != null) {
            editText.setEnabled(p0);
        }
        EditText editText2 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
        if (editText2 != null) {
            int i7 = getNotifyChildrenChangedOptions + 69;
            getItem = i7 % 128;
            int i8 = i7 % 2;
            editText2.setEnabled(p0);
        }
        EditText editText3 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText3 != null) {
            editText3.setEnabled(p0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:103:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:106:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:108:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:110:0x0403  */
    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:18:0x0078  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:25:0x012a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0131  */
    /* JADX WARN: Code duplicated, block: B:28:0x0171  */
    /* JADX WARN: Code duplicated, block: B:29:0x0178  */
    /* JADX WARN: Code duplicated, block: B:31:0x0190  */
    /* JADX WARN: Code duplicated, block: B:62:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0314  */
    /* JADX WARN: Code duplicated, block: B:71:0x031d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0324  */
    /* JADX WARN: Code duplicated, block: B:76:0x032c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0331  */
    /* JADX WARN: Code duplicated, block: B:79:0x034a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0356  */
    /* JADX WARN: Code duplicated, block: B:83:0x035b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0370  */
    /* JADX WARN: Code duplicated, block: B:88:0x037d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0388  */
    /* JADX WARN: Code duplicated, block: B:91:0x0390  */
    /* JADX WARN: Code duplicated, block: B:93:0x0396  */
    /* JADX WARN: Code duplicated, block: B:96:0x039f  */
    /* JADX WARN: Code duplicated, block: B:97:0x03a4  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final onSetCheckMarkDrawable onsetcheckmarkdrawable, final VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        String str;
        EditText editText;
        Editable text;
        RegisteredMemberRegistration registeredMemberRegistrationAsInterface;
        String strName;
        String upperCase;
        EditText editText2;
        Editable text2;
        RegisteredMemberRegistration registeredMemberRegistrationAsInterface2;
        String str2;
        EditText editText3;
        Editable text3;
        RegisteredMemberRegistration registeredMemberRegistrationAsInterface3;
        String strName2;
        String str3;
        Citizenship citizenship;
        Citizenship citizenship2;
        int i;
        String strName3;
        EditText editText4;
        Editable text4;
        Citizenship citizenship3;
        Editable text5;
        Editable text6;
        Citizenship citizenship4;
        getStringOrNull getstringornullB;
        FragmentManager childFragmentManager;
        OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB;
        FragmentManager childFragmentManager2;
        OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB2;
        FragmentManager childFragmentManager3;
        int i2 = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i3 = getNotifyChildrenChangedOptions + 59;
            getItem = i3 % 128;
            int i4 = i3 % 2;
            onsetcheckmarkdrawable.IconCompatParcelizer();
            str = "loading_activation_account_step_first_result";
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                onsetcheckmarkdrawable.write();
                final FragmentSalariedWorkerPersonalDataActivationBinding fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub = onsetcheckmarkdrawable.INotificationSideChannelStub();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                String strValueOf = String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getResetAccCheckSum());
                onsetcheckmarkdrawable.MediaBrowserCompat = strValueOf;
                if (!Intrinsics.areEqual(strValueOf, "900")) {
                    int i5 = getNotifyChildrenChangedOptions + 121;
                    getItem = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 13 / 0;
                        if (Intrinsics.areEqual(onsetcheckmarkdrawable.MediaBrowserCompat, "901")) {
                            if (Intrinsics.areEqual(String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleResetAcc()), "Y") || !Intrinsics.areEqual(String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleRegistration()), ExifInterface.GPS_DIRECTION_TRUE)) {
                                String string = ((PreferenceManager) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "");
                                setSplitTrack setsplittrack = (setSplitTrack) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                                Context contextRequireContext = onsetcheckmarkdrawable.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                                String string2 = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                                Intrinsics.checkExpressionValueIsNotNull(string2, "");
                                editText = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                                if (editText != null) {
                                    text = editText.getText();
                                } else {
                                    text = null;
                                }
                                String string3 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                                registeredMemberRegistrationAsInterface = onsetcheckmarkdrawable.asInterface();
                                if (registeredMemberRegistrationAsInterface != null || (citizenship3 = registeredMemberRegistrationAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
                                    strName = null;
                                } else {
                                    strName = citizenship3.name();
                                }
                                if (Intrinsics.areEqual(strName, "WNI")) {
                                    editText4 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                                    if (editText4 != null) {
                                        text4 = editText4.getText();
                                    } else {
                                        text4 = null;
                                    }
                                    upperCase = StringsKt.trim((CharSequence) String.valueOf(text4)).toString().toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                                } else {
                                    upperCase = "-";
                                }
                                String str4 = upperCase;
                                editText2 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilJamsostekIdNumber.getEditText();
                                if (editText2 != null) {
                                    text2 = editText2.getText();
                                } else {
                                    text2 = null;
                                }
                                String string4 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
                                registeredMemberRegistrationAsInterface2 = onsetcheckmarkdrawable.asInterface();
                                if (registeredMemberRegistrationAsInterface2 != null) {
                                    int i7 = getItem + 113;
                                    getNotifyChildrenChangedOptions = i7 % 128;
                                    int i8 = i7 % 2;
                                    citizenship2 = registeredMemberRegistrationAsInterface2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    if (citizenship2 != null) {
                                        i = getItem + 17;
                                        getNotifyChildrenChangedOptions = i % 128;
                                        if (i % 2 != 0) {
                                            strName3 = citizenship2.name();
                                            int i9 = 92 / 0;
                                        } else {
                                            strName3 = citizenship2.name();
                                        }
                                        str2 = strName3;
                                    } else {
                                        str2 = null;
                                    }
                                } else {
                                    str2 = null;
                                }
                                editText3 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                                if (editText3 != null) {
                                    text3 = editText3.getText();
                                } else {
                                    text3 = null;
                                }
                                String string5 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                                registeredMemberRegistrationAsInterface3 = onsetcheckmarkdrawable.asInterface();
                                if (registeredMemberRegistrationAsInterface3 != null || (citizenship = registeredMemberRegistrationAsInterface3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
                                    strName2 = null;
                                } else {
                                    int i10 = getItem + 71;
                                    getNotifyChildrenChangedOptions = i10 % 128;
                                    int i11 = i10 % 2;
                                    strName2 = citizenship.name();
                                    int i12 = getNotifyChildrenChangedOptions + 111;
                                    getItem = i12 % 128;
                                    int i13 = i12 % 2;
                                }
                                if (Intrinsics.areEqual(strName2, "WNA")) {
                                    EditText editText5 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                                    String upperCase2 = StringsKt.trim((CharSequence) String.valueOf(editText5 != null ? editText5.getText() : null)).toString().toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                                    str3 = upperCase2;
                                } else {
                                    str3 = "";
                                }
                                setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string, new MembershipCheckRequest(string2, str2, "PU", string4, string5, str4, str3, string3));
                            } else {
                                RegisteredMemberRegistration registeredMemberRegistrationAsInterface4 = onsetcheckmarkdrawable.asInterface();
                                if (registeredMemberRegistrationAsInterface4 != null) {
                                    Context contextRequireContext2 = onsetcheckmarkdrawable.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                                    String string6 = Settings.Secure.getString(contextRequireContext2.getContentResolver(), "android_id");
                                    Intrinsics.checkExpressionValueIsNotNull(string6, "");
                                    EditText editText6 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilJamsostekIdNumber.getEditText();
                                    String string7 = StringsKt.trim((CharSequence) String.valueOf(editText6 != null ? editText6.getText() : null)).toString();
                                    EditText editText7 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                                    if (editText7 != null) {
                                        int i14 = getNotifyChildrenChangedOptions + 25;
                                        getItem = i14 % 128;
                                        int i15 = i14 % 2;
                                        text5 = editText7.getText();
                                    } else {
                                        text5 = null;
                                    }
                                    String string8 = StringsKt.trim((CharSequence) String.valueOf(text5)).toString();
                                    EditText editText8 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                                    String string9 = StringsKt.trim((CharSequence) String.valueOf(editText8 != null ? editText8.getText() : null)).toString();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(string9);
                                    sb.append("#T");
                                    String string10 = sb.toString();
                                    EditText editText9 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                                    if (editText9 != null) {
                                        int i16 = getItem + 77;
                                        getNotifyChildrenChangedOptions = i16 % 128;
                                        int i17 = i16 % 2;
                                        text6 = editText9.getText();
                                    } else {
                                        text6 = null;
                                    }
                                    String string11 = StringsKt.trim((CharSequence) String.valueOf(text6)).toString();
                                    MembershipType membershipType = MembershipType.PU;
                                    String strValueOf2 = String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum());
                                    String strValueOf3 = String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum());
                                    String strValueOf4 = String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature());
                                    RegisteredMemberRegistration registeredMemberRegistrationAsInterface5 = onsetcheckmarkdrawable.asInterface();
                                    if (registeredMemberRegistrationAsInterface5 != null && (citizenship4 = registeredMemberRegistrationAsInterface5.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = citizenship4.name();
                                    }
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistrationAsInterface4, string6, null, null, null, membershipType, string7, string11, string10, null, Intrinsics.areEqual(objTuitionPaymentFragmentspecialinlinedviewModeldefault3, "WNI") ? "KTP" : "PASSPOR", null, null, string8, strValueOf2, strValueOf3, strValueOf4, null, null, null, onsetcheckmarkdrawable.asBinder, null, null, null, 7802126);
                                }
                                ((getUntrustedCreatorPackageName) onsetcheckmarkdrawable.b.getValue()).b.setValue((RegisteredMemberRegistration) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                ((getUntrustedCreatorPackageName) onsetcheckmarkdrawable.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            }
                        } else if (Intrinsics.areEqual(onsetcheckmarkdrawable.MediaBrowserCompat, "902")) {
                            OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
                            String string12 = onsetcheckmarkdrawable.getString(R.string.label_title_validation_account_dialog);
                            Intrinsics.checkNotNullExpressionValue(string12, "");
                            String string13 = onsetcheckmarkdrawable.getString(R.string.label_message_validation_reset_dialog);
                            Intrinsics.checkNotNullExpressionValue(string13, "");
                            String string14 = onsetcheckmarkdrawable.getString(R.string.action_booking_antrean_online);
                            Intrinsics.checkNotNullExpressionValue(string14, "");
                            outputConfigurationCompatApi33ImplB2 = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string12, string13, string14, (128 & 16) != 0 ? null : new Function0() { // from class: createButtonColorStateList
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub, virtualCameraAdapter1};
                                    int iB = SearchView9.b();
                                    int iB2 = SearchView9.b();
                                    return (Unit) onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, 386221000, SearchView9.b(), SearchView9.b(), iB2, -386220997, iB);
                                }
                            }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
                            childFragmentManager3 = onsetcheckmarkdrawable.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                            Intrinsics.checkNotNullParameter(childFragmentManager3, "");
                            if (childFragmentManager3.findFragmentByTag(outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                int i18 = getItem + 109;
                                getNotifyChildrenChangedOptions = i18 % 128;
                                int i19 = i18 % 2;
                                outputConfigurationCompatApi33ImplB2.show(childFragmentManager3, outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        } else if (Intrinsics.areEqual(onsetcheckmarkdrawable.MediaBrowserCompat, "903")) {
                            onsetcheckmarkdrawable.MediaBrowserCompat = String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getResetAccCheckSum());
                            OutputConfigurationCompatApi33Impl.Companion companion2 = OutputConfigurationCompatApi33Impl.INSTANCE;
                            String string15 = onsetcheckmarkdrawable.getString(R.string.label_title_validation_account_dialog);
                            Intrinsics.checkNotNullExpressionValue(string15, "");
                            String string16 = onsetcheckmarkdrawable.getString(R.string.label_narasi_datang_ke_cabang);
                            Intrinsics.checkNotNullExpressionValue(string16, "");
                            String string17 = onsetcheckmarkdrawable.getString(R.string.action_booking_antrean_online);
                            Intrinsics.checkNotNullExpressionValue(string17, "");
                            outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string15, string16, string17, (128 & 16) != 0 ? null : new Function0() { // from class: arrayContains
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return onSetCheckMarkDrawable.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub);
                                }
                            }, (128 & 32) != 0 ? null : onsetcheckmarkdrawable.getString(R.string.action_halaman_awal), (128 & 64) != 0 ? null : new Function0() { // from class: AppCompatDrawableManager1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return onSetCheckMarkDrawable.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                }
                            }, (128 & 128) != 0 ? false : false);
                            childFragmentManager2 = onsetcheckmarkdrawable.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                            Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                            if (childFragmentManager2.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                outputConfigurationCompatApi33ImplB.show(childFragmentManager2, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        } else {
                            getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
                            String string18 = onsetcheckmarkdrawable.getString(R.string.title_data_membership_not_found);
                            Intrinsics.checkNotNullExpressionValue(string18, "");
                            String string19 = onsetcheckmarkdrawable.getString(R.string.message_membership_not_found);
                            Intrinsics.checkNotNullExpressionValue(string19, "");
                            String string20 = onsetcheckmarkdrawable.getString(R.string.action_ok);
                            Intrinsics.checkNotNullExpressionValue(string20, "");
                            getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_information, string18, string19, string20, new Function0() { // from class: tintDrawableUsingColorFilter
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                }
                            }, 96);
                            childFragmentManager = onsetcheckmarkdrawable.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            Intrinsics.checkNotNullParameter(childFragmentManager, "");
                            if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        }
                    } else if (Intrinsics.areEqual(onsetcheckmarkdrawable.MediaBrowserCompat, "901")) {
                        if (Intrinsics.areEqual(String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleResetAcc()), "Y")) {
                            String string21 = ((PreferenceManager) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "");
                            setSplitTrack setsplittrack2 = (setSplitTrack) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                            Context contextRequireContext3 = onsetcheckmarkdrawable.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                            String string22 = Settings.Secure.getString(contextRequireContext3.getContentResolver(), "android_id");
                            Intrinsics.checkExpressionValueIsNotNull(string22, "");
                            editText = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                            if (editText != null) {
                                text = editText.getText();
                            } else {
                                text = null;
                            }
                            String string23 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                            registeredMemberRegistrationAsInterface = onsetcheckmarkdrawable.asInterface();
                            if (registeredMemberRegistrationAsInterface != null) {
                                strName = null;
                            } else {
                                strName = null;
                            }
                            if (Intrinsics.areEqual(strName, "WNI")) {
                                editText4 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                                if (editText4 != null) {
                                    text4 = editText4.getText();
                                } else {
                                    text4 = null;
                                }
                                upperCase = StringsKt.trim((CharSequence) String.valueOf(text4)).toString().toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                            } else {
                                upperCase = "-";
                            }
                            String str5 = upperCase;
                            editText2 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilJamsostekIdNumber.getEditText();
                            if (editText2 != null) {
                                text2 = editText2.getText();
                            } else {
                                text2 = null;
                            }
                            String string24 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
                            registeredMemberRegistrationAsInterface2 = onsetcheckmarkdrawable.asInterface();
                            if (registeredMemberRegistrationAsInterface2 != null) {
                                int i20 = getItem + 113;
                                getNotifyChildrenChangedOptions = i20 % 128;
                                int i21 = i20 % 2;
                                citizenship2 = registeredMemberRegistrationAsInterface2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                if (citizenship2 != null) {
                                    i = getItem + 17;
                                    getNotifyChildrenChangedOptions = i % 128;
                                    if (i % 2 != 0) {
                                        strName3 = citizenship2.name();
                                        int i22 = 92 / 0;
                                    } else {
                                        strName3 = citizenship2.name();
                                    }
                                    str2 = strName3;
                                } else {
                                    str2 = null;
                                }
                            } else {
                                str2 = null;
                            }
                            editText3 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                            if (editText3 != null) {
                                text3 = editText3.getText();
                            } else {
                                text3 = null;
                            }
                            String string25 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                            registeredMemberRegistrationAsInterface3 = onsetcheckmarkdrawable.asInterface();
                            if (registeredMemberRegistrationAsInterface3 != null) {
                                strName2 = null;
                            } else {
                                strName2 = null;
                            }
                            if (Intrinsics.areEqual(strName2, "WNA")) {
                                EditText editText10 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                                String upperCase3 = StringsKt.trim((CharSequence) String.valueOf(editText10 != null ? editText10.getText() : null)).toString().toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                                str3 = upperCase3;
                            } else {
                                str3 = "";
                            }
                            setsplittrack2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string21, new MembershipCheckRequest(string22, str2, "PU", string24, string25, str5, str3, string23));
                        } else {
                            String string26 = ((PreferenceManager) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "");
                            setSplitTrack setsplittrack3 = (setSplitTrack) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                            Context contextRequireContext4 = onsetcheckmarkdrawable.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
                            String string27 = Settings.Secure.getString(contextRequireContext4.getContentResolver(), "android_id");
                            Intrinsics.checkExpressionValueIsNotNull(string27, "");
                            editText = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                            if (editText != null) {
                                text = editText.getText();
                            } else {
                                text = null;
                            }
                            String string28 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                            registeredMemberRegistrationAsInterface = onsetcheckmarkdrawable.asInterface();
                            if (registeredMemberRegistrationAsInterface != null) {
                                strName = null;
                            } else {
                                strName = null;
                            }
                            if (Intrinsics.areEqual(strName, "WNI")) {
                                editText4 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                                if (editText4 != null) {
                                    text4 = editText4.getText();
                                } else {
                                    text4 = null;
                                }
                                upperCase = StringsKt.trim((CharSequence) String.valueOf(text4)).toString().toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                            } else {
                                upperCase = "-";
                            }
                            String str6 = upperCase;
                            editText2 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilJamsostekIdNumber.getEditText();
                            if (editText2 != null) {
                                text2 = editText2.getText();
                            } else {
                                text2 = null;
                            }
                            String string29 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
                            registeredMemberRegistrationAsInterface2 = onsetcheckmarkdrawable.asInterface();
                            if (registeredMemberRegistrationAsInterface2 != null) {
                                int i23 = getItem + 113;
                                getNotifyChildrenChangedOptions = i23 % 128;
                                int i24 = i23 % 2;
                                citizenship2 = registeredMemberRegistrationAsInterface2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                if (citizenship2 != null) {
                                    i = getItem + 17;
                                    getNotifyChildrenChangedOptions = i % 128;
                                    if (i % 2 != 0) {
                                        strName3 = citizenship2.name();
                                        int i25 = 92 / 0;
                                    } else {
                                        strName3 = citizenship2.name();
                                    }
                                    str2 = strName3;
                                } else {
                                    str2 = null;
                                }
                            } else {
                                str2 = null;
                            }
                            editText3 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                            if (editText3 != null) {
                                text3 = editText3.getText();
                            } else {
                                text3 = null;
                            }
                            String string210 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                            registeredMemberRegistrationAsInterface3 = onsetcheckmarkdrawable.asInterface();
                            if (registeredMemberRegistrationAsInterface3 != null) {
                                strName2 = null;
                            } else {
                                strName2 = null;
                            }
                            if (Intrinsics.areEqual(strName2, "WNA")) {
                                EditText editText11 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                                String upperCase4 = StringsKt.trim((CharSequence) String.valueOf(editText11 != null ? editText11.getText() : null)).toString().toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase4, "");
                                str3 = upperCase4;
                            } else {
                                str3 = "";
                            }
                            setsplittrack3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string26, new MembershipCheckRequest(string27, str2, "PU", string29, string210, str6, str3, string28));
                        }
                    } else if (Intrinsics.areEqual(onsetcheckmarkdrawable.MediaBrowserCompat, "902")) {
                        OutputConfigurationCompatApi33Impl.Companion companion4 = OutputConfigurationCompatApi33Impl.INSTANCE;
                        String string110 = onsetcheckmarkdrawable.getString(R.string.label_title_validation_account_dialog);
                        Intrinsics.checkNotNullExpressionValue(string110, "");
                        String string111 = onsetcheckmarkdrawable.getString(R.string.label_message_validation_reset_dialog);
                        Intrinsics.checkNotNullExpressionValue(string111, "");
                        String string112 = onsetcheckmarkdrawable.getString(R.string.action_booking_antrean_online);
                        Intrinsics.checkNotNullExpressionValue(string112, "");
                        outputConfigurationCompatApi33ImplB2 = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string110, string111, string112, (128 & 16) != 0 ? null : new Function0() { // from class: createButtonColorStateList
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub, virtualCameraAdapter1};
                                int iB = SearchView9.b();
                                int iB2 = SearchView9.b();
                                return (Unit) onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, 386221000, SearchView9.b(), SearchView9.b(), iB2, -386220997, iB);
                            }
                        }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
                        childFragmentManager3 = onsetcheckmarkdrawable.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager3, "");
                        if (childFragmentManager3.findFragmentByTag(outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            int i110 = getItem + 109;
                            getNotifyChildrenChangedOptions = i110 % 128;
                            int i111 = i110 % 2;
                            outputConfigurationCompatApi33ImplB2.show(childFragmentManager3, outputConfigurationCompatApi33ImplB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    } else if (Intrinsics.areEqual(onsetcheckmarkdrawable.MediaBrowserCompat, "903")) {
                        onsetcheckmarkdrawable.MediaBrowserCompat = String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getResetAccCheckSum());
                        OutputConfigurationCompatApi33Impl.Companion companion5 = OutputConfigurationCompatApi33Impl.INSTANCE;
                        String string113 = onsetcheckmarkdrawable.getString(R.string.label_title_validation_account_dialog);
                        Intrinsics.checkNotNullExpressionValue(string113, "");
                        String string114 = onsetcheckmarkdrawable.getString(R.string.label_narasi_datang_ke_cabang);
                        Intrinsics.checkNotNullExpressionValue(string114, "");
                        String string115 = onsetcheckmarkdrawable.getString(R.string.action_booking_antrean_online);
                        Intrinsics.checkNotNullExpressionValue(string115, "");
                        outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string113, string114, string115, (128 & 16) != 0 ? null : new Function0() { // from class: arrayContains
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return onSetCheckMarkDrawable.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub);
                            }
                        }, (128 & 32) != 0 ? null : onsetcheckmarkdrawable.getString(R.string.action_halaman_awal), (128 & 64) != 0 ? null : new Function0() { // from class: AppCompatDrawableManager1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return onSetCheckMarkDrawable.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            }
                        }, (128 & 128) != 0 ? false : false);
                        childFragmentManager2 = onsetcheckmarkdrawable.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                        if (childFragmentManager2.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            outputConfigurationCompatApi33ImplB.show(childFragmentManager2, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    } else {
                        getStringOrNull.Companion companion6 = getStringOrNull.INSTANCE;
                        String string116 = onsetcheckmarkdrawable.getString(R.string.title_data_membership_not_found);
                        Intrinsics.checkNotNullExpressionValue(string116, "");
                        String string117 = onsetcheckmarkdrawable.getString(R.string.message_membership_not_found);
                        Intrinsics.checkNotNullExpressionValue(string117, "");
                        String string211 = onsetcheckmarkdrawable.getString(R.string.action_ok);
                        Intrinsics.checkNotNullExpressionValue(string211, "");
                        getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_information, string116, string117, string211, new Function0() { // from class: tintDrawableUsingColorFilter
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            }
                        }, 96);
                        childFragmentManager = onsetcheckmarkdrawable.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager, "");
                        if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }
                } else if (Intrinsics.areEqual(String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleResetAcc()), "Y")) {
                    String string212 = ((PreferenceManager) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "");
                    setSplitTrack setsplittrack4 = (setSplitTrack) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    Context contextRequireContext5 = onsetcheckmarkdrawable.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
                    String string213 = Settings.Secure.getString(contextRequireContext5.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string213, "");
                    editText = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                    if (editText != null) {
                        text = editText.getText();
                    } else {
                        text = null;
                    }
                    String string214 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                    registeredMemberRegistrationAsInterface = onsetcheckmarkdrawable.asInterface();
                    if (registeredMemberRegistrationAsInterface != null) {
                        strName = null;
                    } else {
                        strName = null;
                    }
                    if (Intrinsics.areEqual(strName, "WNI")) {
                        editText4 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                        if (editText4 != null) {
                            text4 = editText4.getText();
                        } else {
                            text4 = null;
                        }
                        upperCase = StringsKt.trim((CharSequence) String.valueOf(text4)).toString().toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    } else {
                        upperCase = "-";
                    }
                    String str7 = upperCase;
                    editText2 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilJamsostekIdNumber.getEditText();
                    if (editText2 != null) {
                        text2 = editText2.getText();
                    } else {
                        text2 = null;
                    }
                    String string215 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
                    registeredMemberRegistrationAsInterface2 = onsetcheckmarkdrawable.asInterface();
                    if (registeredMemberRegistrationAsInterface2 != null) {
                        int i26 = getItem + 113;
                        getNotifyChildrenChangedOptions = i26 % 128;
                        int i27 = i26 % 2;
                        citizenship2 = registeredMemberRegistrationAsInterface2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (citizenship2 != null) {
                            i = getItem + 17;
                            getNotifyChildrenChangedOptions = i % 128;
                            if (i % 2 != 0) {
                                strName3 = citizenship2.name();
                                int i28 = 92 / 0;
                            } else {
                                strName3 = citizenship2.name();
                            }
                            str2 = strName3;
                        } else {
                            str2 = null;
                        }
                    } else {
                        str2 = null;
                    }
                    editText3 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                    if (editText3 != null) {
                        text3 = editText3.getText();
                    } else {
                        text3 = null;
                    }
                    String string216 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                    registeredMemberRegistrationAsInterface3 = onsetcheckmarkdrawable.asInterface();
                    if (registeredMemberRegistrationAsInterface3 != null) {
                        strName2 = null;
                    } else {
                        strName2 = null;
                    }
                    if (Intrinsics.areEqual(strName2, "WNA")) {
                        EditText editText12 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                        String upperCase5 = StringsKt.trim((CharSequence) String.valueOf(editText12 != null ? editText12.getText() : null)).toString().toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase5, "");
                        str3 = upperCase5;
                    } else {
                        str3 = "";
                    }
                    setsplittrack4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string212, new MembershipCheckRequest(string213, str2, "PU", string215, string216, str7, str3, string214));
                } else {
                    String string217 = ((PreferenceManager) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "");
                    setSplitTrack setsplittrack5 = (setSplitTrack) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    Context contextRequireContext6 = onsetcheckmarkdrawable.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "");
                    String string218 = Settings.Secure.getString(contextRequireContext6.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string218, "");
                    editText = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                    if (editText != null) {
                        text = editText.getText();
                    } else {
                        text = null;
                    }
                    String string219 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                    registeredMemberRegistrationAsInterface = onsetcheckmarkdrawable.asInterface();
                    if (registeredMemberRegistrationAsInterface != null) {
                        strName = null;
                    } else {
                        strName = null;
                    }
                    if (Intrinsics.areEqual(strName, "WNI")) {
                        editText4 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                        if (editText4 != null) {
                            text4 = editText4.getText();
                        } else {
                            text4 = null;
                        }
                        upperCase = StringsKt.trim((CharSequence) String.valueOf(text4)).toString().toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    } else {
                        upperCase = "-";
                    }
                    String str8 = upperCase;
                    editText2 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilJamsostekIdNumber.getEditText();
                    if (editText2 != null) {
                        text2 = editText2.getText();
                    } else {
                        text2 = null;
                    }
                    String string2110 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
                    registeredMemberRegistrationAsInterface2 = onsetcheckmarkdrawable.asInterface();
                    if (registeredMemberRegistrationAsInterface2 != null) {
                        int i29 = getItem + 113;
                        getNotifyChildrenChangedOptions = i29 % 128;
                        int i210 = i29 % 2;
                        citizenship2 = registeredMemberRegistrationAsInterface2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (citizenship2 != null) {
                            i = getItem + 17;
                            getNotifyChildrenChangedOptions = i % 128;
                            if (i % 2 != 0) {
                                strName3 = citizenship2.name();
                                int i211 = 92 / 0;
                            } else {
                                strName3 = citizenship2.name();
                            }
                            str2 = strName3;
                        } else {
                            str2 = null;
                        }
                    } else {
                        str2 = null;
                    }
                    editText3 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                    if (editText3 != null) {
                        text3 = editText3.getText();
                    } else {
                        text3 = null;
                    }
                    String string2111 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                    registeredMemberRegistrationAsInterface3 = onsetcheckmarkdrawable.asInterface();
                    if (registeredMemberRegistrationAsInterface3 != null) {
                        strName2 = null;
                    } else {
                        strName2 = null;
                    }
                    if (Intrinsics.areEqual(strName2, "WNA")) {
                        EditText editText13 = fragmentSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                        String upperCase6 = StringsKt.trim((CharSequence) String.valueOf(editText13 != null ? editText13.getText() : null)).toString().toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase6, "");
                        str3 = upperCase6;
                    } else {
                        str3 = "";
                    }
                    setsplittrack5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string217, new MembershipCheckRequest(string218, str2, "PU", string2110, string2111, str8, str3, string219));
                }
                str = "success_activation_account_step_first_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i30 = getNotifyChildrenChangedOptions + 33;
                getItem = i30 % 128;
                int i31 = i30 % 2;
                onsetcheckmarkdrawable.write();
                onSetCheckMarkDrawable onsetcheckmarkdrawable2 = onsetcheckmarkdrawable;
                String strValueOf5 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(onsetcheckmarkdrawable2, "");
                Intrinsics.checkNotNullParameter(strValueOf5, "");
                BaseActivity baseActivity = (BaseActivity) onsetcheckmarkdrawable2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf5, null);
                }
                str = "failure_activation_account_step_first_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = onsetcheckmarkdrawable.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_activation_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = getItem + 25;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = getItem + 83;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        final onSetCheckMarkDrawable onsetcheckmarkdrawable = (onSetCheckMarkDrawable) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: getTintListForDrawableRes
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    onSetCheckMarkDrawable.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i2, i3, i4);
                }
            }, onsetcheckmarkdrawable.asInterface.get(1), onsetcheckmarkdrawable.asInterface.get(2), onsetcheckmarkdrawable.asInterface.get(5)).show();
            ViewPortBuilder.b();
            int i2 = getItem + 29;
            getNotifyChildrenChangedOptions = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSetCheckMarkDrawable onsetcheckmarkdrawable, ActivityResult activityResult) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            int i2 = getItem + 125;
            getNotifyChildrenChangedOptions = i2 % 128;
            int i3 = i2 % 2;
            Intent data = activityResult.getData();
            String stringExtra = data != null ? data.getStringExtra("extra_photo_path") : null;
            if (stringExtra != null) {
                File file = new File(stringExtra);
                if (file.exists()) {
                    onsetcheckmarkdrawable.asBinder = file;
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(stringExtra);
                    onsetcheckmarkdrawable.INotificationSideChannelStub().imgKtpPhoto.setImageBitmap(bitmapDecodeFile);
                    onsetcheckmarkdrawable.INotificationSideChannelStub().imgKtpPhoto.setVisibility(0);
                    onsetcheckmarkdrawable.INotificationSideChannelStub().clKtpPlaceholder.setVisibility(8);
                    onsetcheckmarkdrawable.TuitionPaymentFragmentbindingInflater1(true);
                    Intrinsics.checkNotNull(bitmapDecodeFile);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                    String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
                    ((setSplitTrack) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new OcrKtpRequest(UUID.randomUUID().toString(), strEncodeToString));
                    int i4 = getNotifyChildrenChangedOptions + 73;
                    getItem = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getItem + 27;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = getNotifyChildrenChangedOptions + 85;
        getItem = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 70 / 0;
        }
        return unit2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x014d  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(onSetCheckMarkDrawable onsetcheckmarkdrawable, FragmentSalariedWorkerPersonalDataActivationBinding fragmentSalariedWorkerPersonalDataActivationBinding, View view) throws Throwable {
        String strName;
        Editable text;
        Editable text2;
        Editable text3;
        String strName2;
        Citizenship citizenship;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, onsetcheckmarkdrawable.requireContext());
        fragmentSalariedWorkerPersonalDataActivationBinding.salariedWorkerPersonalDataContainer.requestFocus();
        if (onsetcheckmarkdrawable.asBinder == null) {
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String string = onsetcheckmarkdrawable.getString(R.string.error_field_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = onsetcheckmarkdrawable.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, "Anda wajib mengambil foto KTP terlebih dahulu", string2, new Function0() { // from class: onDrawableLoadedFromResources
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return onSetCheckMarkDrawable.TuitionPaymentFragmentbindingInflater1();
                }
            }, 96);
            FragmentManager childFragmentManager = onsetcheckmarkdrawable.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            return Unit.INSTANCE;
        }
        RegisteredMemberRegistration registeredMemberRegistrationAsInterface = onsetcheckmarkdrawable.asInterface();
        MembershipType membershipType = null;
        if (registeredMemberRegistrationAsInterface == null || (citizenship = registeredMemberRegistrationAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
            strName = null;
        } else {
            strName = citizenship.name();
            int i2 = getNotifyChildrenChangedOptions + 117;
            getItem = i2 % 128;
            int i3 = i2 % 2;
        }
        if (Intrinsics.areEqual(strName, "WNI") && onsetcheckmarkdrawable.TuitionPaymentFragmentbindingInflater1.length() == 0) {
            String string3 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "");
            ((PreferenceManager) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).saveString("OCR_TRANSACTION_ID", string3);
            onsetcheckmarkdrawable.TuitionPaymentFragmentbindingInflater1 = string3;
        }
        setSplitTrack setsplittrack = (setSplitTrack) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        String str = onsetcheckmarkdrawable.TuitionPaymentFragmentbindingInflater1;
        EditText editText = fragmentSalariedWorkerPersonalDataActivationBinding.tilBirthDate.getEditText();
        if (editText != null) {
            int i4 = getItem + 73;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            text = editText.getText();
        } else {
            text = null;
        }
        String string4 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
        EditText editText2 = fragmentSalariedWorkerPersonalDataActivationBinding.tilIdNumber.getEditText();
        String strValueOf = String.valueOf(editText2 != null ? editText2.getText() : null);
        EditText editText3 = fragmentSalariedWorkerPersonalDataActivationBinding.tilJamsostekIdNumber.getEditText();
        if (editText3 != null) {
            int i6 = getNotifyChildrenChangedOptions + 13;
            getItem = i6 % 128;
            if (i6 % 2 == 0) {
                editText3.getText();
                throw null;
            }
            text2 = editText3.getText();
        } else {
            text2 = null;
        }
        String string5 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
        EditText editText4 = fragmentSalariedWorkerPersonalDataActivationBinding.tilFullName.getEditText();
        if (editText4 != null) {
            int i7 = getItem + 39;
            getNotifyChildrenChangedOptions = i7 % 128;
            int i8 = i7 % 2;
            text3 = editText4.getText();
        } else {
            text3 = null;
        }
        String string6 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
        RegisteredMemberRegistration registeredMemberRegistrationAsInterface2 = onsetcheckmarkdrawable.asInterface();
        if (registeredMemberRegistrationAsInterface2 != null) {
            int i9 = getItem + 83;
            getNotifyChildrenChangedOptions = i9 % 128;
            int i10 = i9 % 2;
            Citizenship citizenship2 = registeredMemberRegistrationAsInterface2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (citizenship2 != null) {
                strName2 = citizenship2.name();
            } else {
                strName2 = null;
            }
        } else {
            strName2 = null;
        }
        String str2 = Intrinsics.areEqual(strName2, "WNI") ? "KTP" : "PASSPOR";
        RegisteredMemberRegistration registeredMemberRegistrationAsInterface3 = onsetcheckmarkdrawable.asInterface();
        if (registeredMemberRegistrationAsInterface3 != null) {
            membershipType = registeredMemberRegistrationAsInterface3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i11 = getNotifyChildrenChangedOptions + 115;
            getItem = i11 % 128;
            int i12 = i11 % 2;
        }
        String strValueOf2 = String.valueOf(membershipType);
        setSessionCaptureCallback setsessioncapturecallback = setSessionCaptureCallback.INSTANCE;
        Context contextRequireContext = onsetcheckmarkdrawable.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        setsplittrack.TuitionPaymentFragmentbindingInflater1(str, new ActivationRequest(strValueOf, string5, string6, string4, str2, strValueOf2, setSessionCaptureCallback.b(contextRequireContext)));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(onSetCheckMarkDrawable onsetcheckmarkdrawable, int i, int i2, int i3) {
        int i4 = 2 % 2;
        onsetcheckmarkdrawable.asInterface.set(1, i);
        onsetcheckmarkdrawable.asInterface.set(2, i2);
        onsetcheckmarkdrawable.asInterface.set(5, i3);
        onsetcheckmarkdrawable.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(onsetcheckmarkdrawable.asInterface.getTime()));
        int i5 = getNotifyChildrenChangedOptions + 83;
        getItem = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(onSetCheckMarkDrawable onsetcheckmarkdrawable, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = getItem + 31;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (i3 != 0) {
            int i4 = 2 / 0;
            if (activityResult.getResultCode() != -1) {
                return;
            }
        } else if (activityResult.getResultCode() != -1) {
            return;
        }
        onsetcheckmarkdrawable.d = true;
        ActivityResultLauncher<Intent> activityResultLauncher = onsetcheckmarkdrawable.connect;
        KtpCameraActivity.Companion bVar = KtpCameraActivity.INSTANCE;
        Context contextRequireContext = onsetcheckmarkdrawable.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        activityResultLauncher.launch(KtpCameraActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext));
        int i5 = getItem + 103;
        getNotifyChildrenChangedOptions = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(onSetCheckMarkDrawable onsetcheckmarkdrawable, FragmentSalariedWorkerPersonalDataActivationBinding fragmentSalariedWorkerPersonalDataActivationBinding) {
        int i = 2 % 2;
        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String str = onsetcheckmarkdrawable.TuitionPaymentFragmentbindingInflater1;
        EditText editText = fragmentSalariedWorkerPersonalDataActivationBinding.tilIdNumber.getEditText();
        Editable text = null;
        if (editText != null) {
            int i2 = getNotifyChildrenChangedOptions + 5;
            getItem = i2 % 128;
            if (i2 % 2 == 0) {
                editText.getText();
                throw null;
            }
            text = editText.getText();
            int i3 = getNotifyChildrenChangedOptions + 107;
            getItem = i3 % 128;
            int i4 = i3 % 2;
        }
        getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1(str, StringsKt.trim((CharSequence) String.valueOf(text)).toString());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(onSetCheckMarkDrawable onsetcheckmarkdrawable) {
        int i = 2 % 2;
        ((PreferenceManager) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).saveString("OCR_TRANSACTION_ID", "");
        Object obj = null;
        ((getUntrustedCreatorPackageName) onsetcheckmarkdrawable.b.getValue()).b.setValue(null);
        LoginActivity.Companion companion = LoginActivity.INSTANCE;
        Context contextRequireContext = onsetcheckmarkdrawable.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, null, false, 6);
        FragmentActivity activity = onsetcheckmarkdrawable.getActivity();
        if (activity != null) {
            int i2 = getItem + 21;
            getNotifyChildrenChangedOptions = i2 % 128;
            if (i2 % 2 != 0) {
                activity.finishAffinity();
                obj.hashCode();
                throw null;
            }
            activity.finishAffinity();
        }
        Unit unit = Unit.INSTANCE;
        int i3 = getItem + 71;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault3(onSetCheckMarkDrawable onsetcheckmarkdrawable) {
        RegisteredMemberRegistration value;
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 59;
        getItem = i2 % 128;
        if (i2 % 2 == 0) {
            value = ((getUntrustedCreatorPackageName) onsetcheckmarkdrawable.b.getValue()).b.getValue();
            int i3 = 47 / 0;
        } else {
            value = ((getUntrustedCreatorPackageName) onsetcheckmarkdrawable.b.getValue()).b.getValue();
        }
        int i4 = getNotifyChildrenChangedOptions + 1;
        getItem = i4 % 128;
        int i5 = i4 % 2;
        return value;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(onSetCheckMarkDrawable onsetcheckmarkdrawable, View view) {
        int i = 2 % 2;
        int i2 = getItem + 19;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (onsetcheckmarkdrawable.d) {
            ActivityResultLauncher<Intent> activityResultLauncher = onsetcheckmarkdrawable.connect;
            KtpCameraActivity.Companion bVar = KtpCameraActivity.INSTANCE;
            Context contextRequireContext = onsetcheckmarkdrawable.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            activityResultLauncher.launch(KtpCameraActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext));
        } else {
            ActivityResultLauncher<Intent> activityResultLauncher2 = onsetcheckmarkdrawable.IconCompatParcelizer;
            KtpGuidanceActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = KtpGuidanceActivity.INSTANCE;
            Context contextRequireContext2 = onsetcheckmarkdrawable.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            activityResultLauncher2.launch(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(contextRequireContext2));
        }
        Unit unit = Unit.INSTANCE;
        int i4 = getItem + 115;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(onSetCheckMarkDrawable onsetcheckmarkdrawable, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        int i2 = getItem + 89;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        onsetcheckmarkdrawable.INotificationSideChannelStubProxy = String.valueOf(userLocationComplete.b);
        onsetcheckmarkdrawable.RemoteActionCompatParcelizer = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null || (str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            int i4 = getNotifyChildrenChangedOptions + 59;
            getItem = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        }
        onsetcheckmarkdrawable.getInterfaceDescriptor = str;
        onsetcheckmarkdrawable.INotificationSideChannelDefault = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i6 = getNotifyChildrenChangedOptions + 117;
            getItem = i6 % 128;
            int i7 = i6 % 2;
            str2 = "";
        }
        onsetcheckmarkdrawable.INotificationSideChannelStub = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 == null || (str3 = locationAddressInfo3.d) == null) {
            int i8 = getItem + 59;
            getNotifyChildrenChangedOptions = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str4 = str3;
        }
        onsetcheckmarkdrawable.write = str4;
        String str5 = onsetcheckmarkdrawable.INotificationSideChannelStubProxy;
        String str6 = onsetcheckmarkdrawable.RemoteActionCompatParcelizer;
        String str7 = onsetcheckmarkdrawable.getInterfaceDescriptor;
        String str8 = onsetcheckmarkdrawable.INotificationSideChannelDefault;
        String str9 = onsetcheckmarkdrawable.INotificationSideChannelStub;
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

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        Editable text;
        String str;
        onSetCheckMarkDrawable onsetcheckmarkdrawable = (onSetCheckMarkDrawable) objArr[0];
        FragmentSalariedWorkerPersonalDataActivationBinding fragmentSalariedWorkerPersonalDataActivationBinding = (FragmentSalariedWorkerPersonalDataActivationBinding) objArr[1];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[2];
        int i = 2 % 2;
        BookingAntreanFormActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = BookingAntreanFormActivity.INSTANCE;
        Context contextRequireContext = onsetcheckmarkdrawable.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        EditText editText = fragmentSalariedWorkerPersonalDataActivationBinding.tilIdNumber.getEditText();
        Editable editable = null;
        String string = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
        EditText editText2 = fragmentSalariedWorkerPersonalDataActivationBinding.tilFullName.getEditText();
        if (editText2 != null) {
            int i2 = getNotifyChildrenChangedOptions + 73;
            getItem = i2 % 128;
            if (i2 % 2 == 0) {
                editText2.getText();
                editable.hashCode();
                throw null;
            }
            text = editText2.getText();
        } else {
            int i3 = getItem + 81;
            getNotifyChildrenChangedOptions = i3 % 128;
            int i4 = i3 % 2;
            text = null;
        }
        String string2 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
        EditText editText3 = fragmentSalariedWorkerPersonalDataActivationBinding.tilBirthDate.getEditText();
        String string3 = StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString();
        String str2 = onsetcheckmarkdrawable.onTransact;
        String str3 = onsetcheckmarkdrawable.notify;
        String str4 = onsetcheckmarkdrawable.INotificationSideChannelStubProxy;
        String str5 = onsetcheckmarkdrawable.RemoteActionCompatParcelizer;
        if (Intrinsics.areEqual(String.valueOf(((ActivationItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleResetAcc()), "Y")) {
            int i5 = getItem + 37;
            getNotifyChildrenChangedOptions = i5 % 128;
            int i6 = i5 % 2;
            str = "RES";
        } else {
            str = "REG";
        }
        BookingAntreanFormActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, string, string2, string3, str2, str3, str4, str5, str, "PU", onsetcheckmarkdrawable.TuitionPaymentFragmentbindingInflater1);
        Unit unit = Unit.INSTANCE;
        int i7 = getItem + 15;
        getNotifyChildrenChangedOptions = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 73 / 0;
        }
        return unit;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ void b(onSetCheckMarkDrawable onsetcheckmarkdrawable, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        String str;
        Editable text;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            onsetcheckmarkdrawable.IconCompatParcelizer();
            str = "loading_registration_account_step_first_result";
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                onsetcheckmarkdrawable.write();
                RegisteredMemberRegistration registeredMemberRegistrationAsInterface = onsetcheckmarkdrawable.asInterface();
                if (registeredMemberRegistrationAsInterface != null) {
                    Context contextRequireContext = onsetcheckmarkdrawable.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string, "");
                    EditText editText = onsetcheckmarkdrawable.INotificationSideChannelStub().tilJamsostekIdNumber.getEditText();
                    String string2 = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
                    EditText editText2 = onsetcheckmarkdrawable.INotificationSideChannelStub().tilBirthDate.getEditText();
                    if (editText2 != null) {
                        int i2 = getItem + 121;
                        getNotifyChildrenChangedOptions = i2 % 128;
                        int i3 = i2 % 2;
                        text = editText2.getText();
                    } else {
                        text = null;
                    }
                    String string3 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                    EditText editText3 = onsetcheckmarkdrawable.INotificationSideChannelStub().tilIdNumber.getEditText();
                    String string4 = StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append(string4);
                    sb.append("#Y");
                    String string5 = sb.toString();
                    EditText editText4 = onsetcheckmarkdrawable.INotificationSideChannelStub().tilFullName.getEditText();
                    VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistrationAsInterface, string, null, null, null, MembershipType.PU, string2, StringsKt.trim((CharSequence) String.valueOf(editText4 != null ? editText4.getText() : null)).toString(), string5, null, null, null, null, string3, String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b), null, null, null, onsetcheckmarkdrawable.asBinder, null, null, null, 7802638);
                }
                ((getUntrustedCreatorPackageName) onsetcheckmarkdrawable.b.getValue()).b.setValue((RegisteredMemberRegistration) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                ((getUntrustedCreatorPackageName) onsetcheckmarkdrawable.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                str = "success_registration_account_step_first_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                onsetcheckmarkdrawable.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                String string6 = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                String string7 = onsetcheckmarkdrawable.getString(R.string.error_data_membership_not_found);
                Intrinsics.checkNotNullExpressionValue(string7, "");
                if (StringsKt.contains$default((CharSequence) string6, (CharSequence) string7, false, 2, (Object) null)) {
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string8 = onsetcheckmarkdrawable.getString(R.string.title_data_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string8, "");
                    String string9 = onsetcheckmarkdrawable.getString(R.string.message_membership_not_found);
                    Intrinsics.checkNotNullExpressionValue(string9, "");
                    String string10 = onsetcheckmarkdrawable.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string10, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string8, string9, string10, new Function0() { // from class: getRatingBarLayerDrawable
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return onSetCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        }
                    }, 96);
                    FragmentManager childFragmentManager = onsetcheckmarkdrawable.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        int i4 = getItem + 91;
                        getNotifyChildrenChangedOptions = i4 % 128;
                        int i5 = i4 % 2;
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                    int i6 = getItem + 25;
                    getNotifyChildrenChangedOptions = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 4 % 5;
                    }
                } else {
                    onSetCheckMarkDrawable onsetcheckmarkdrawable2 = onsetcheckmarkdrawable;
                    String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Intrinsics.checkNotNullParameter(onsetcheckmarkdrawable2, "");
                    Intrinsics.checkNotNullParameter(strValueOf, "");
                    BaseActivity baseActivity = (BaseActivity) onsetcheckmarkdrawable2.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                    }
                }
                str = "failure_registration_account_step_first_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = onsetcheckmarkdrawable.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = getItem + 65;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = getItem + 37;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        onSetCheckMarkDrawable onsetcheckmarkdrawable = (onSetCheckMarkDrawable) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            Object obj = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i2 = getItem + 25;
                getNotifyChildrenChangedOptions = i2 % 128;
                if (i2 % 2 != 0) {
                    onsetcheckmarkdrawable.write();
                    GetDataAntrianResponse getDataAntrianResponse = (GetDataAntrianResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    getDataAntrianResponse.getData();
                    Intrinsics.areEqual(getDataAntrianResponse.isSuccessful(), Boolean.TRUE);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                onsetcheckmarkdrawable.write();
                GetDataAntrianResponse getDataAntrianResponse2 = (GetDataAntrianResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                AntrianData data = getDataAntrianResponse2.getData();
                if (!Intrinsics.areEqual(getDataAntrianResponse2.isSuccessful(), Boolean.TRUE) || data == null) {
                    onSetCheckMarkDrawable onsetcheckmarkdrawable2 = onsetcheckmarkdrawable;
                    String message = getDataAntrianResponse2.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    Intrinsics.checkNotNullParameter(onsetcheckmarkdrawable2, "");
                    Intrinsics.checkNotNullParameter(message, "");
                    BaseActivity baseActivity = (BaseActivity) onsetcheckmarkdrawable2.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, message, null);
                    }
                } else {
                    int i3 = getNotifyChildrenChangedOptions + 75;
                    getItem = i3 % 128;
                    int i4 = i3 % 2;
                    BookingAntreanSuccessActivity.Companion companion = BookingAntreanSuccessActivity.INSTANCE;
                    Context contextRequireContext = onsetcheckmarkdrawable.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    String nomorIdentitas = data.getNomorIdentitas();
                    String str9 = nomorIdentitas == null ? "" : nomorIdentitas;
                    String nama = data.getNama();
                    if (nama == null) {
                        int i5 = getNotifyChildrenChangedOptions + 25;
                        getItem = i5 % 128;
                        if (i5 % 2 == 0) {
                            throw null;
                        }
                        str = "";
                    } else {
                        str = nama;
                    }
                    String handphone = data.getHandphone();
                    if (handphone == null) {
                        int i6 = getItem + 21;
                        getNotifyChildrenChangedOptions = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 56 / 0;
                        }
                        str2 = "";
                    } else {
                        str2 = handphone;
                    }
                    String email = data.getEmail();
                    String str10 = email == null ? "" : email;
                    String kodePengajuan = data.getKodePengajuan();
                    if (kodePengajuan == null) {
                        int i8 = getNotifyChildrenChangedOptions + 19;
                        getItem = i8 % 128;
                        if (i8 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        str3 = "";
                    } else {
                        str3 = kodePengajuan;
                    }
                    String layanan = data.getLayanan();
                    String str11 = layanan == null ? "" : layanan;
                    String layanan2 = data.getLayanan();
                    if (layanan2 == null) {
                        int i9 = getItem + 89;
                        getNotifyChildrenChangedOptions = i9 % 128;
                        if (i9 % 2 != 0) {
                            throw null;
                        }
                        str4 = "";
                    } else {
                        str4 = layanan2;
                    }
                    String namaKantorCabang = data.getNamaKantorCabang();
                    if (namaKantorCabang == null && (namaKantorCabang = data.getKantorCabang()) == null) {
                        int i10 = getItem + 51;
                        getNotifyChildrenChangedOptions = i10 % 128;
                        int i11 = i10 % 2;
                        str5 = "";
                    } else {
                        str5 = namaKantorCabang;
                    }
                    String alamatKantor = data.getAlamatKantor();
                    String str12 = alamatKantor == null ? "" : alamatKantor;
                    String tanggalBooking = data.getTanggalBooking();
                    if (tanggalBooking == null) {
                        int i12 = getNotifyChildrenChangedOptions + 65;
                        getItem = i12 % 128;
                        int i13 = i12 % 2;
                        str6 = "";
                    } else {
                        str6 = tanggalBooking;
                    }
                    String tanggalBooking2 = data.getTanggalBooking();
                    if (tanggalBooking2 == null) {
                        int i14 = getItem + 103;
                        getNotifyChildrenChangedOptions = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i15 = 43 / 0;
                        }
                        str7 = "";
                    } else {
                        str7 = tanggalBooking2;
                    }
                    String namaShift = data.getNamaShift();
                    if (namaShift == null) {
                        int i16 = getItem + 53;
                        getNotifyChildrenChangedOptions = i16 % 128;
                        if (i16 % 2 != 0) {
                            throw null;
                        }
                        str8 = "";
                    } else {
                        str8 = namaShift;
                    }
                    String qrCode = getDataAntrianResponse2.getQrCode();
                    BookingAntreanSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext, str9, str, str2, str10, str3, str11, str4, str5, str12, str6, str7, str8, "", "", qrCode == null ? "" : qrCode, onsetcheckmarkdrawable.MediaBrowserCompat);
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                onsetcheckmarkdrawable.write();
                onSetCheckMarkDrawable onsetcheckmarkdrawable3 = onsetcheckmarkdrawable;
                String str13 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str13 == null) {
                    str13 = "";
                }
                Intrinsics.checkNotNullParameter(onsetcheckmarkdrawable3, "");
                Intrinsics.checkNotNullParameter(str13, "");
                BaseActivity baseActivity2 = (BaseActivity) onsetcheckmarkdrawable3.getContext();
                if (baseActivity2 != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, str13, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f A[PHI: r5
  0x004f: PHI (r5v14 android.widget.EditText) = (r5v13 android.widget.EditText), (r5v18 android.widget.EditText) binds: [B:16:0x004d, B:13:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSetCheckMarkDrawable onsetcheckmarkdrawable, FragmentSalariedWorkerPersonalDataActivationBinding fragmentSalariedWorkerPersonalDataActivationBinding) throws Throwable {
        String strName;
        EditText editText;
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 73;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration registeredMemberRegistrationAsInterface = onsetcheckmarkdrawable.asInterface();
        Editable text = null;
        if (registeredMemberRegistrationAsInterface != null) {
            int i4 = getNotifyChildrenChangedOptions + 11;
            getItem = i4 % 128;
            int i5 = i4 % 2;
            Citizenship citizenship = registeredMemberRegistrationAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (citizenship != null) {
                strName = citizenship.name();
            } else {
                strName = null;
            }
        } else {
            strName = null;
        }
        if (Intrinsics.areEqual(strName, "WNI")) {
            int i6 = getNotifyChildrenChangedOptions + 121;
            getItem = i6 % 128;
            if (i6 % 2 == 0) {
                editText = fragmentSalariedWorkerPersonalDataActivationBinding.tilIdNumber.getEditText();
                int i7 = 16 / 0;
                if (editText != null) {
                    text = editText.getText();
                }
            } else {
                editText = fragmentSalariedWorkerPersonalDataActivationBinding.tilIdNumber.getEditText();
                if (editText != null) {
                    text = editText.getText();
                }
            }
            return String.valueOf(text).length() == 16;
        }
        EditText editText2 = fragmentSalariedWorkerPersonalDataActivationBinding.tilIdNumber.getEditText();
        if (editText2 != null) {
            int i8 = getItem + 85;
            getNotifyChildrenChangedOptions = i8 % 128;
            if (i8 % 2 != 0) {
                editText2.getText();
                text.hashCode();
                throw null;
            }
            text = editText2.getText();
        }
        int length = String.valueOf(text).length();
        return 6 <= length && length < 21;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(onSetCheckMarkDrawable onsetcheckmarkdrawable) throws IOException {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 83;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) onsetcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B == null || !camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            onsetcheckmarkdrawable.INotificationSideChannelStubProxy = "0.0";
            onsetcheckmarkdrawable.RemoteActionCompatParcelizer = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        } else {
            onsetcheckmarkdrawable.INotificationSideChannelStubProxy = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            onsetcheckmarkdrawable.RemoteActionCompatParcelizer = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            onsetcheckmarkdrawable.getInterfaceDescriptor = camera2CameraControlExternalSyntheticLambda4B.b;
            onsetcheckmarkdrawable.INotificationSideChannelDefault = camera2CameraControlExternalSyntheticLambda4B.g;
            onsetcheckmarkdrawable.INotificationSideChannelStub = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            onsetcheckmarkdrawable.write = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = onsetcheckmarkdrawable.INotificationSideChannelStubProxy;
            String str2 = onsetcheckmarkdrawable.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
            int i4 = getNotifyChildrenChangedOptions + 79;
            getItem = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(onSetCheckMarkDrawable onsetcheckmarkdrawable, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 95;
        getItem = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(onsetcheckmarkdrawable, virtualCameraAdapter1);
            throw null;
        }
        Unit unitTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(onsetcheckmarkdrawable, virtualCameraAdapter1);
        int i3 = getNotifyChildrenChangedOptions + 97;
        getItem = i3 % 128;
        if (i3 % 2 != 0) {
            return unitTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSetCheckMarkDrawable onsetcheckmarkdrawable, View view) {
        int iB = SearchView9.b();
        int iB2 = SearchView9.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{onsetcheckmarkdrawable, view}, -1617693842, SearchView9.b(), SearchView9.b(), iB2, 1617693847, iB);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(onSetCheckMarkDrawable onsetcheckmarkdrawable, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iB = SearchView9.b();
        int iB2 = SearchView9.b();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{onsetcheckmarkdrawable, virtualCameraAdapter1}, 117691720, SearchView9.b(), SearchView9.b(), iB2, -117691718, iB);
    }

    public static /* synthetic */ Unit b(onSetCheckMarkDrawable onsetcheckmarkdrawable, FragmentSalariedWorkerPersonalDataActivationBinding fragmentSalariedWorkerPersonalDataActivationBinding, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iB = SearchView9.b();
        int iB2 = SearchView9.b();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{onsetcheckmarkdrawable, fragmentSalariedWorkerPersonalDataActivationBinding, virtualCameraAdapter1}, 386221000, SearchView9.b(), SearchView9.b(), iB2, -386220997, iB);
    }

    static {
        getServiceComponent = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        int i = isConnected + 1;
        getServiceComponent = i % 128;
        int i2 = i % 2;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentSalariedWorkerPersonalDataActivationBinding> d() {
        int iB = SearchView9.b();
        int iB2 = SearchView9.b();
        return (Function3) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -125826818, SearchView9.b(), SearchView9.b(), iB2, 125826818, iB);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 103;
        getItem = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        int iB = SearchView9.b();
        int iB2 = SearchView9.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -203702811, SearchView9.b(), SearchView9.b(), iB2, 203702812, iB);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int iB = SearchView9.b();
        int iB2 = SearchView9.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -7915202, SearchView9.b(), SearchView9.b(), iB2, 7915206, iB);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        getExtras = new int[]{1234123529, 305925015, -1876129676, 218792933, 1466258021, -1860614519, -1088427835, -1804522882, -1182481002, 1142310410, -1188733377, -1296012623, -456083891, -1148658056, -1455275050, 2100345549, 1624821353, -709663882};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 3;
        getItem = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = defpackage.onSetCheckMarkDrawable.$$c
            int r6 = r6 * 56
            int r6 = r6 + 66
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onSetCheckMarkDrawable.$$g(byte, byte, short):java.lang.String");
    }
}
