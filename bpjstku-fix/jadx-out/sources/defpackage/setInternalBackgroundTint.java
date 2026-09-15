package defpackage;

import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
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
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.registration.general.model.request.ActivationRequest;
import com.bpjstku.data.registration.general.model.request.MembershipCheckRequest;
import com.bpjstku.data.registration.general.model.request.OcrKtpRequest;
import com.bpjstku.data.registration.general.model.response.ActivationItem;
import com.bpjstku.data.registration.general.model.response.OcrKtpResponse;
import com.bpjstku.data.registration.general.model.response.ResultOcr;
import com.bpjstku.databinding.FragmentNonSalariedWorkerPersonalDataActivationBinding;
import com.bpjstku.domain.registration.general.model.MembershipCheckNew;
import com.bpjstku.presentation.membership.accountactivation.nonsalariedworker.NonSalariedWorkerPersonalDataActivationFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.salariedworker.KtpCameraActivity;
import com.bpjstku.presentation.membership.registration.salariedworker.KtpGuidanceActivity;
import com.bpjstku.presentation.queueing.BookingAntreanFormActivity;
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
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0015\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0018\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0015\u0010\u001b\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0015\u0010\u0010\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0014R.\u0010#\u001a\u001c\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010)\u001a\u00020%8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010+R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0016\u0010\u0006\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u0007\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u00102R\u0016\u0010\n\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u00102R\u0016\u00104\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u0010\t\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0016\u0010\r\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u00102R\u0016\u0010\u000b\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u00102R\u0018\u0010\f\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00102R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u00102R\u0018\u0010\u001a\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u00102R\u0016\u0010\u001d\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00102R\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u0006*\u00020707068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u001e\u00105\u001a\f\u0012\b\u0012\u0006*\u00020707068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00108"}, d2 = {"LsetInternalBackgroundTint;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentNonSalariedWorkerPersonalDataActivationBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "INotificationSideChannel", "cancel", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Z)V", "LsetSplitTrack;", "connect", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LgetUntrustedCreatorPackageName;", "write", "b", "LgetStreamUseCaseSupportedCombinationList;", "read", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/data/lib/PreferenceManager;", "IconCompatParcelizer", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "d", "()Lkotlin/jvm/functions/Function3;", "", "I", "asBinder", "()I", "a", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "Z", "Ljava/io/File;", "Ljava/io/File;", "asInterface", "", "INotificationSideChannelStub", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "notify", "MediaBrowserCompat", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResultLauncher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setInternalBackgroundTint extends AutoValue_ImmutableImageInfo<FragmentNonSalariedWorkerPersonalDataActivationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char getItem;
    private static int getNotifyChildrenChangedOptions;
    private static char[] getRoot;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> write;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private String INotificationSideChannel;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private String cancelAll;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private String onTransact;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Calendar g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String getInterfaceDescriptor;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String INotificationSideChannelStub;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final int a;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean asBinder;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private String cancel;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final ActivityResultLauncher<Intent> MediaBrowserCompat;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private File asInterface;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Lazy b;
    private static final byte[] $$c = {48, -110, 22, 55};
    private static final int $$f = 255;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {49, 89, 41, 48, 9, 2, 7, 6, 10, 9, -40, 58, 3, 5, -10, -14, 32, 24, -10, 14, -50, 23, 51, 6, -1, 10, 5, 21, 4, -10, 26, -4, 13, 6, 12, -25, 21, 19, 13, 9, 0, 0, -28, 40, 24, -6, 1, 9, 40, -5, 18, -4, 13, 6, -23, 24, 31, -5, -1, 16, 13, -39, 51, -10, 13, 13, -1, 16, 13, 6, 4, -4, 5, 13, -1, 18, 4, 12, 5, 4, 12, -2, 6, 25, -6, 3, 25, -35, 41, -4, 8, 14, -1, 8, 8, 2, 27, -2, 15, -59};
    private static final int $$e = 190;
    private static final byte[] $$a = {49, 84, -120, 101, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 183;
    private static int isConnected = 1;
    private static int getExtras = 0;
    private static int disconnect = 1;

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
        }
    }

    public static /* synthetic */ Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i5);
        int i9 = (~(i7 | (~i5) | i6)) | (~(i6 | i4 | i5));
        int i10 = ~i6;
        int i11 = (~(i5 | i4)) | (~(i10 | i5)) | (~(i10 | i4));
        int i12 = i6 + i4 + i + (1698977638 * i3) + (1466394737 * i2);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i6) - 490274816) + ((-1116082190) * i4) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i) + (1553727488 * i3) + (1859780608 * i2) + (925827072 * i13);
        int i15 = ((i6 * (-1787956080)) - 1478154965) + (i4 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i * (-1787955639)) + (i3 * 552005654) + (i2 * (-2013897159)) + (i13 * (-429457408));
        int i16 = i14 + (i15 * i15 * (-402587648));
        if (i16 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i16 == 2) {
            return b(objArr);
        }
        if (i16 != 3) {
            return i16 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        return TuitionPaymentFragmentbindingInflater1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.setInternalBackgroundTint.$$a
            int r9 = r9 * 15
            int r9 = 53 - r9
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = r8 + 84
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L2e
        L14:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2e:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setInternalBackgroundTint.c(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 8
            int r8 = r8 + 45
            int r9 = r9 * 44
            int r9 = 48 - r9
            byte[] r0 = defpackage.setInternalBackgroundTint.$$d
            int r7 = r7 * 31
            int r7 = 115 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            r6 = r9
            r9 = r7
            r7 = r6
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r9 = r9 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-7)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setInternalBackgroundTint.f(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: setInternalBackgroundTint$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LsetInternalBackgroundTint$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "LsetInternalBackgroundTint;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LsetInternalBackgroundTint;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static setInternalBackgroundTint TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return new setInternalBackgroundTint();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public setInternalBackgroundTint() {
        final setInternalBackgroundTint setinternalbackgroundtint = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.nonsalariedworker.NonSalariedWorkerPersonalDataActivationFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = setinternalbackgroundtint;
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
        final setInternalBackgroundTint setinternalbackgroundtint2 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.membership.accountactivation.nonsalariedworker.NonSalariedWorkerPersonalDataActivationFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = setinternalbackgroundtint2.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.b = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.accountactivation.nonsalariedworker.NonSalariedWorkerPersonalDataActivationFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                return getFocusY.b(setinternalbackgroundtint2, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.membership.accountactivation.nonsalariedworker.NonSalariedWorkerPersonalDataActivationFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getStreamUseCaseSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getStreamUseCaseSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = setinternalbackgroundtint;
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
        final setInternalBackgroundTint setinternalbackgroundtint3 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.accountactivation.nonsalariedworker.NonSalariedWorkerPersonalDataActivationFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = setinternalbackgroundtint3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: getAutoSizeStepGranularity
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1};
                int iTuitionPaymentFragmentbindingInflater1 = isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1();
                return (RegisteredMemberRegistration) setInternalBackgroundTint.b(objArr, isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), 1030348398, iTuitionPaymentFragmentbindingInflater1, -1030348398);
            }
        });
        this.a = R.layout.fragment_non_salaried_worker_personal_data_activation;
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.g = calendar;
        this.cancelAll = "";
        this.onTransact = "";
        this.cancel = "";
        this.notify = "";
        this.INotificationSideChannel = "";
        this.getInterfaceDescriptor = "0.0";
        this.INotificationSideChannelDefault = "0.0";
        this.IconCompatParcelizer = "902";
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: setFilters
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                setInternalBackgroundTint.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.write = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: getAutoSizeTextAvailableSizes
            private static short[] g;
            private static final byte[] $$c = {59, -124, -78, 46};
            private static final int $$f = 119;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {101, 89, 94, -73, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
            private static final int $$e = 226;
            private static final byte[] $$a = {27, -8, 5, 78, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -21, -49, -2, 2, 1, 4, 0, -21, 9, -8, -1, 35, -39, 6, -11, 1, -21, 17, 27, -39, -11, 7, -23, 19, 49, -64, 9, -15, 5, 55, -40, -22, -12, 11, 2, -5, -3, 17, -19, -4, 5, 5, -2, -13, -7, 4, -7};
            private static final int $$b = 140;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f911a = 0;
            private static int asInterface = 1;
            private static int TuitionPaymentFragmentbindingInflater1 = 529925133;
            private static int b = -1934795581;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -2035126975;
            private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {20, 20, -17, 1, 26, 19, -60, -19, 86, 26, 25, 1, 26, 19, -28, -51, 38, 23, 22, 21, -30, 10, -27, 58, 13, -124, -76, -68, -84, -70, -80, -93, 66, -26, -77, -72, -73, 70, -31, -73, 59, -77, 58, 16, 103, 32, 50, 46, 92, 37, 46, -16, 99, -31, 103, 81, 63, 36, 95, 51, -17, -111, 39, -4, 100, 35, 89, 47, 40, 7, 8, 11, -5, -49, -6, -62, -54, -69, 3, -60, -42, -85, 31, -60, -52, -4, -54, -64, -13, 5, -39, -114, -106, -122, -108, -118, -67, 58, 14, 77, 105, 116, 116, 114, 64, 105, 113, 105, 110, 64, 112, 13, -17, -25, 28, -19, -14, -1, 11, -23, 30, -18, -25, -53, 0, -16, -29, -26, -61, -16, -8, -19, -61, -54, 10, -56, -12, -13, -13, -47, -27, -4, -12, -19, -49, -33, -56, 62, -5, -14, -57, -3, -83, 48, -2, -63, -83, 4, -11, -12, -13, -64, -24, -61, 10, -83, -100, -4, -66, -92, -92, -107, -45, -94, -88, -88, -92, -82, -117, -50, -77, 1, -72, -85, -100, -83, -65, -42, -80, -123, -93, -123, 107, 9, 55, 55, 38, 42, 5, 47, 32, 40, 48, 33, 47, -16, 119, 49, 38, 54, 47, 51, -11, 11, -62, -110, 9, -38, -6, -36, -62, -109, 15, -36, -52, -46, -113, 29, -8, -40, -125};
            private static char[] d = {57184, 57188, 60070, 60060, 57189, 60062, 60117, 60052, 60054, 60078, 57194, 57186, 60079, 60093, 60040, 60097, 60064, 60145, 60041, 60055, 60063, 60082, 57190, 60118, 60116, 57187, 60075, 60056, 60085, 60057, 60058, 60050, 60048, 60099, 57192, 60046, 57193, 57191, 57195, 60047, 60045, 60053, 60088, 60090, 57197, 60035, 60043, 60068, 60061};
            private static char asBinder = 57190;

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void f(int r6, short r7, short r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 3
                    int r8 = 115 - r8
                    byte[] r0 = defpackage.getAutoSizeTextAvailableSizes.$$a
                    int r7 = 65 - r7
                    int r1 = r6 + 4
                    byte[] r1 = new byte[r1]
                    int r6 = r6 + 3
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r6
                    r4 = r2
                    goto L2c
                L14:
                    r3 = r2
                L15:
                    int r7 = r7 + 1
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r6) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L24:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2c:
                    int r8 = -r8
                    int r3 = r3 + r8
                    int r8 = r3 + (-2)
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getAutoSizeTextAvailableSizes.f(int, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void h(short r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 52
                    int r6 = 55 - r6
                    int r8 = r8 * 52
                    int r0 = 53 - r8
                    int r7 = r7 + 84
                    byte[] r1 = defpackage.getAutoSizeTextAvailableSizes.$$d
                    byte[] r0 = new byte[r0]
                    int r8 = 52 - r8
                    r2 = 0
                    if (r1 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L2d
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L26:
                    int r6 = r6 + 1
                    r3 = r1[r6]
                    r5 = r3
                    r3 = r7
                    r7 = r5
                L2d:
                    int r7 = -r7
                    int r3 = r3 + r7
                    int r7 = r3 + (-10)
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getAutoSizeTextAvailableSizes.h(short, int, byte, java.lang.Object[]):void");
            }

            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i = 2 % 2;
                int i2 = f911a + 39;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (ActivityResult) obj};
                int iTuitionPaymentFragmentbindingInflater1 = isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1();
                setInternalBackgroundTint.b(objArr, isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), -1267162873, iTuitionPaymentFragmentbindingInflater1, 1267162876);
                int i4 = asInterface + 45;
                f911a = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:39:0x01b9 A[PHI: r0
  0x01b9: PHI (r0v9 int) = (r0v8 int), (r0v36 int) binds: [B:38:0x01b7, B:35:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:40:0x01c3 A[PHI: r0
  0x01c3: PHI (r0v33 int) = (r0v8 int), (r0v36 int) binds: [B:38:0x01b7, B:35:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
            private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
                boolean z;
                int i4;
                int i5;
                int i6 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    int i7 = -1;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 2267 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 33, 1387473586, false, $$g(b3, (byte) (b3 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    if (iIntValue == -1) {
                        int i8 = $10 + 43;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (bArr != null) {
                            int i10 = $11 + 89;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i12 = 0;
                            while (i12 < length) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) i7;
                                    byte b5 = (byte) (b4 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 3358, View.MeasureSpec.getSize(0) + 18, -1054011043, false, $$g(b4, b5, (byte) (b5 | 8)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i12] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                i12++;
                                i7 = -1;
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) (-1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), KeyEvent.normalizeMetaState(0) + 2267, TextUtils.getCapsMode("", 0, 0) + 33, 1387473586, false, $$g(b6, (byte) (b6 + 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                        } else {
                            iIntValue = (short) (((short) (((long) g[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue > 0) {
                        int i13 = $11 + 75;
                        int i14 = i13 % 128;
                        $10 = i14;
                        if (i13 % 2 != 0) {
                            i4 = ((i3 >> iIntValue) >> 5) / ((int) (((long) TuitionPaymentFragmentbindingInflater1) * 3046761265686732006L));
                            if (z) {
                                int i15 = i14 + 57;
                                $11 = i15 % 128;
                                int i16 = i15 % 2;
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                        } else {
                            i4 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                            if (z) {
                                int i17 = i14 + 57;
                                $11 = i17 % 128;
                                int i18 = i17 % 2;
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                        Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) (-1);
                            byte b8 = (byte) (b7 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 55904), Color.blue(0) + 2855, TextUtils.indexOf((CharSequence) "", '0') + 14, -1529949196, false, $$g(b7, b8, (byte) (b8 + 5)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            int i19 = $10 + 33;
                            $11 = i19 % 128;
                            int i20 = i19 % 2;
                            for (int i21 = 0; i21 < length2; i21++) {
                                bArr5[i21] = (byte) (((long) bArr4[i21]) ^ 3046761265686732006L);
                            }
                            bArr4 = bArr5;
                        }
                        boolean z2 = bArr4 != null;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            if (z2) {
                                byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i22 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i22 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i22]) ^ 3046761265686732006L)) + s)) ^ b2));
                                int i23 = $10 + 67;
                                $11 = i23 % 128;
                                if (i23 % 2 == 0) {
                                    int i24 = 3 / 4;
                                }
                            } else {
                                short[] sArr = g;
                                int i25 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i25 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i25]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            /* JADX WARN: Code duplicated, block: B:34:0x0121  */
            /* JADX WARN: Code duplicated, block: B:35:0x0142  */
            /* JADX WARN: Code duplicated, block: B:38:0x018f A[Catch: all -> 0x0354, TryCatch #0 {all -> 0x0354, blocks: (B:7:0x001f, B:9:0x002d, B:10:0x005f, B:14:0x0077, B:17:0x0087, B:18:0x00b7, B:36:0x0144, B:38:0x018f, B:39:0x0207, B:43:0x021c, B:45:0x0256, B:47:0x02c1), top: B:64:0x001f }] */
            /* JADX WARN: Code duplicated, block: B:42:0x021a  */
            /* JADX WARN: Code duplicated, block: B:45:0x0256 A[Catch: all -> 0x0354, TryCatch #0 {all -> 0x0354, blocks: (B:7:0x001f, B:9:0x002d, B:10:0x005f, B:14:0x0077, B:17:0x0087, B:18:0x00b7, B:36:0x0144, B:38:0x018f, B:39:0x0207, B:43:0x021c, B:45:0x0256, B:47:0x02c1), top: B:64:0x001f }] */
            /* JADX WARN: Code duplicated, block: B:46:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:49:0x02e2  */
            /* JADX WARN: Code duplicated, block: B:51:0x02ea  */
            /* JADX WARN: Code duplicated, block: B:52:0x031c  */
            private static void e(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i3 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = d;
                char c = '0';
                Object obj2 = null;
                int i4 = -1;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i5 = 0;
                    while (i5 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2267;
                                int mirror = AndroidCharacter.getMirror(c) - 15;
                                byte b3 = (byte) i4;
                                byte b4 = (byte) (b3 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, absoluteGravity, mirror, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                            i5++;
                            c = '0';
                            i4 = -1;
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
                Object[] objArr4 = {Integer.valueOf(asBinder)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), View.resolveSize(0, 0) + 2267, TextUtils.lastIndexOf("", '0', 0) + 34, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    int i6 = $11 + 47;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    int i8 = $10 + 89;
                    $11 = i8 % 128;
                    int i9 = 2;
                    int i10 = i8 % 2;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i11 = $10 + 31;
                        $11 = i11 % 128;
                        if (i11 % i9 == 0) {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                int i12 = $10 + 119;
                                $11 = i12 % 128;
                                int i13 = i12 % 2;
                                obj = obj2;
                            } else {
                                objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b7 = (byte) (-1);
                                    byte b8 = (byte) (b7 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 3261 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 31 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -127612708, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b9 = (byte) (-1);
                                        byte b10 = (byte) (b9 + 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 22879), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 593, 17 - View.resolveSizeAndState(0, 0, 0), 1570859318, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                    int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        int i15 = $10 + 27;
                                        $11 = i15 % 128;
                                        int i16 = i15 % 2;
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                                    } else {
                                        int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i20];
                                    }
                                }
                            }
                        } else {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                int i110 = $10 + 119;
                                $11 = i110 % 128;
                                int i111 = i110 % 2;
                                obj = obj2;
                            } else {
                                objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b11 = (byte) (-1);
                                    byte b12 = (byte) (b11 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 3261 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 31 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -127612708, false, $$g(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b13 = (byte) (-1);
                                        byte b14 = (byte) (b13 + 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 22879), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 593, 17 - View.resolveSizeAndState(0, 0, 0), 1570859318, false, $$g(b13, b14, (byte) (b14 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                    int i112 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i112];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        int i113 = $10 + 27;
                                        $11 = i113 % 128;
                                        int i114 = i113 % 2;
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i115 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i116 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i115];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i116];
                                    } else {
                                        int i117 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i117];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                                    }
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                        i9 = 2;
                    }
                }
                for (int i22 = 0; i22 < i; i22++) {
                    cArr4[i22] = (char) (cArr4[i22] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            /*  JADX ERROR: Types fix failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 81021. Try increasing type updates limit count.
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
                */
            public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r48, int r49, int r50, int r51) {
                /*
                    Method dump skipped, instruction units count: 8102
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getAutoSizeTextAvailableSizes.TuitionPaymentFragmentbindingInflater1(android.content.Context, int, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r7, int r8, byte r9) {
                /*
                    byte[] r0 = defpackage.getAutoSizeTextAvailableSizes.$$c
                    int r8 = r8 * 2
                    int r8 = r8 + 1
                    int r7 = r7 + 4
                    int r9 = r9 + 113
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r3 = r9
                    r5 = r2
                    r9 = r7
                    goto L29
                L13:
                    r3 = r2
                L14:
                    int r7 = r7 + 1
                    byte r4 = (byte) r9
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r8) goto L23
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L23:
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r3
                    r3 = r6
                L29:
                    int r7 = -r7
                    int r7 = r7 + r3
                    r3 = r5
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getAutoSizeTextAvailableSizes.$$g(byte, int, byte):java.lang.String");
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.MediaBrowserCompat = activityResultLauncherRegisterForActivityResult2;
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        char c;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = getRoot;
        int i4 = 1770390596;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getTrimmedLength(""), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 2267, (ViewConfiguration.getScrollBarSize() >> 8) + 33, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 1770390596;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 95;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(getItem)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 2266 - Process.getGidForName(""), Color.blue(0) + 33, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        char c2 = '\t';
        if (i % 2 != 0) {
            int i8 = $10 + 9;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                i2 = i + 116;
                cArr4[i2] = (char) (cArr[i2] + b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i9 = $10 + 95;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    c = c2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = deinitsession;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = deinitsession;
                    objArr4[c2] = deinitsession;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = deinitsession;
                    objArr4[6] = deinitsession;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = deinitsession;
                    objArr4[3] = deinitsession;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = deinitsession;
                    objArr4[0] = deinitsession;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char scrollBarSize = (char) (49267 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int i11 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3260;
                        int threadPriority = 30 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b7 = (byte) ($$f & 1);
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, i11, threadPriority, -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        try {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22878);
                                int windowTouchSlop = 594 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int scrollDefaultDelay = 17 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                byte b9 = (byte) ($$f & 3);
                                byte b10 = (byte) (b9 - 3);
                                c = '\t';
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration, windowTouchSlop, scrollDefaultDelay, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c = '\t';
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        c = '\t';
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        } else {
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                c2 = c;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentNonSalariedWorkerPersonalDataActivationBinding> d() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = disconnect + 69;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int scrollDefaultDelay = 2267 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int mode = View.MeasureSpec.getMode(0) + 33;
            byte[] bArr = $$a;
            byte b2 = bArr[132];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, scrollDefaultDelay, mode, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{25, 31, 2, 22, 24, 25, 5, Typography.quote, '#', 29, 30, 11, 11, 29, 17, '\t', 15, 27, 11, 25, '!', 0}, (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 96), 22 - KeyEvent.normalizeMetaState(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{6, '\b', 21, 25, 29, 17, 2, 16, 7, 23, '\t', '\r', 27, 6, 13828}, (byte) (5 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 16, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int mode2 = View.MeasureSpec.getMode(0) + 2267;
            int edgeSlop = 33 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte b4 = (byte) ($$b & 123);
            byte b5 = $$a[7];
            Object[] objArr5 = new Object[1];
            c(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, mode2, edgeSlop, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                int iRgb = (-16774949) - Color.rgb(0, 0, 0);
                int packedPositionGroup = 33 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) 103, bArr2[7], bArr2[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, iRgb, packedPositionGroup, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[0])[0];
            int i5 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = ((((-1453893174) + (((~((-345830661) | i6)) | 462882655) * (-90))) + (((~((-345830661) | iIdentityHashCode)) | (-530577248)) * (-45))) + ((((~(iIdentityHashCode | (-462882656))) | (-345830661)) | (~(i6 | 462882655))) * 45)) - 108695626;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{25, 31, 2, 22, 24, 25, 5, Typography.quote, 21, 25, 29, '!', 24, Typography.quote, '\f', 27, 27, 25, 17, 3, 1, 19, 23, '\b', 22, 1}, (byte) (20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 26 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 6, 13864, 13864, 7, 29, 16, 27, 13866, 13866, 6, 25, 31, 18, '\f', 27, 24, 26}, (byte) (64 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 18 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i10 = disconnect + 93;
                    getExtras = i10 % 128;
                    int i11 = i10 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{'\r', 22, 25, 20, 31, 11, 25, 31, 23, 30, 11, 0, 21, 17, 6, '\n'}, (byte) (20 - KeyEvent.getDeadChar(0, 0)), 16 - Color.green(0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{28, 0, 7, 29, '\f', 27, 17, 3, 31, 20, 19, 17, 23, 27, 5, '\n'}, (byte) (ExpandableListView.getPackedPositionChild(0L) + 124), ExpandableListView.getPackedPositionGroup(0L) + 16, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = getExtras + 19;
            int i13 = i12 % 128;
            disconnect = i13;
            int i14 = i12 % 2;
            int i15 = i13 + 109;
            getExtras = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -108695626};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[40];
                Object[] objArr13 = new Object[1];
                f(b6, b6, bArr3[46], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[46];
                Object[] objArr14 = new Object[1];
                f(b7, b7, bArr3[40], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i17 = getExtras + 25;
                    disconnect = i17 % 128;
                    int i18 = i17 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                        int iKeyCodeFromString = 2267 - KeyEvent.keyCodeFromString("");
                        int iAlpha = 33 - Color.alpha(0);
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        c((byte) 103, bArr4[7], bArr4[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter2, iKeyCodeFromString, iAlpha, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new char[]{25, 31, 2, 22, 24, 25, 5, Typography.quote, '#', 29, 30, 11, 11, 29, 17, '\t', 15, 27, 11, 25, '!', 0}, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 96), View.resolveSizeAndState(0, 0, 0) + 22, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new char[]{6, '\b', 21, 25, 29, 17, 2, 16, 7, 23, '\t', '\r', 27, 6, 13828}, (byte) (5 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                            int pressedStateDuration = 2267 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            int i19 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                            byte b8 = (byte) ($$b & 123);
                            byte b9 = $$a[7];
                            Object[] objArr19 = new Object[1];
                            c(b8, b9, b9, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, pressedStateDuration, i19, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2268;
                            int i20 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32;
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[132];
                            byte b11 = bArr5[7];
                            Object[] objArr20 = new Object[1];
                            c(b10, b11, b11, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, iLastIndexOf, i20, -887667012, false, (String) objArr20[0], null);
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
        int i21 = ((int[]) objArr[3])[0];
        int i22 = ((int[]) objArr[0])[0];
        if (i22 == i21) {
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[0])[0];
            int i25 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int i26 = ~((int) Runtime.getRuntime().freeMemory());
            int i27 = i23 + (-1965648581) + (((~(i26 | (-654955345))) | (~((-136454148) | i26))) * (-184)) + ((8651912 | (~((-145106060) | i26)) | (~((-663607257) | i26))) * 184) + 1182410088;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr21[2])[0] = i29 ^ (i29 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i22];
            int i30 = i22 - 1;
            iArr[i30] = 1;
            Toast.makeText((Context) null, iArr[((i22 * i30) % 2) - 1], 1).show();
            Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr[2])[0];
            int i32 = ((int[]) objArr[0])[0];
            int i33 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i34 = ~iIdentityHashCode2;
            int i35 = (~((-306981836) | i34)) | 34089795;
            int i36 = ~(iIdentityHashCode2 | (-228839441));
            int i37 = i31 + (-608830098) + ((i35 | i36) * (-713)) + (i36 * 1426) + ((~((-501731481) | i34)) * 713);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr22[2])[0] = i39 ^ (i39 << 5);
        }
        return NonSalariedWorkerPersonalDataActivationFragment$bindingInflater$1.b;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getCancel() {
        int i = 2 % 2;
        int i2 = disconnect + 61;
        int i3 = i2 % 128;
        getExtras = i3;
        int i4 = i2 % 2;
        int i5 = this.a;
        int i6 = i3 + 21;
        disconnect = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() throws ParseException {
        EditText editText;
        EditText editText2;
        int i = 2 % 2;
        EditText editText3 = INotificationSideChannelStub().tilFullName.getEditText();
        if (editText3 != null) {
            Intrinsics.checkNotNullParameter(editText3, "");
            editText3.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (registeredMemberRegistration != null) {
            FragmentNonSalariedWorkerPersonalDataActivationBinding fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub = INotificationSideChannelStub();
            String str = registeredMemberRegistration.asInterface;
            String str2 = null;
            if (str != null) {
                int i2 = getExtras + 115;
                disconnect = i2 % 128;
                int i3 = i2 % 2;
                if (str.length() <= 0) {
                    str = null;
                }
            } else {
                str = null;
            }
            if (str != null && (editText2 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText()) != null) {
                int i4 = getExtras + 93;
                disconnect = i4 % 128;
                int i5 = i4 % 2;
                editText2.setText(str);
            }
            String str3 = registeredMemberRegistration.asBinder;
            if (str3 == null || str3.length() <= 0) {
                str3 = null;
            }
            if (str3 != null && (editText = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText()) != null) {
                editText.setText(str3);
                int i6 = disconnect + 17;
                getExtras = i6 % 128;
                int i7 = i6 % 2;
            }
            String str4 = registeredMemberRegistration.notify;
            if (str4 != null && str4.length() > 0) {
                str2 = str4;
            }
            if (str2 != null) {
                int i8 = getExtras + 69;
                disconnect = i8 % 128;
                int i9 = i8 % 2;
                EditText editText4 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                if (editText4 != null) {
                    editText4.setText(str2);
                }
                Date date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(str2);
                if (date != null) {
                    this.g.setTime(date);
                    int i10 = disconnect + 111;
                    getExtras = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
        }
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        experimentalCamera2Interop.b(contextRequireContext, new Function1() { // from class: getEmojiTextViewHelper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setInternalBackgroundTint.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: AppCompatCheckBox
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
                int iTuitionPaymentFragmentbindingInflater1 = isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1();
                return (Unit) setInternalBackgroundTint.b(objArr, isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), 955701921, iTuitionPaymentFragmentbindingInflater1, -955701920);
            }
        });
        boolean z = false;
        if (this.asInterface != null) {
            int i12 = getExtras + 13;
            disconnect = i12 % 128;
            if (i12 % 2 != 0) {
                z = true;
            }
        } else {
            int i13 = getExtras + 125;
            disconnect = i13 % 128;
            int i14 = i13 % 2;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(z);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        int i = 2 % 2;
        final FragmentNonSalariedWorkerPersonalDataActivationBinding fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        CardView cardView = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.cvFotoKtp;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setAutoSizeTextTypeUniformWithConfiguration
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.b, (View) obj};
                int iTuitionPaymentFragmentbindingInflater1 = isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1();
                return (Unit) setInternalBackgroundTint.b(objArr, isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), -1176963141, iTuitionPaymentFragmentbindingInflater1, 1176963143);
            }
        }));
        MaterialButton materialButton = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setAutoSizeTextTypeWithDefaults
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setInternalBackgroundTint.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        EditText editText = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: setAutoSizeTextTypeUniformWithPresetSizes
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setInternalBackgroundTint.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
                }
            });
            int i2 = getExtras + 27;
            disconnect = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 2;
            }
        }
        int i4 = getExtras + 67;
        disconnect = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005c A[PHI: r5
  0x005c: PHI (r5v6 java.lang.String) = (r5v5 java.lang.String), (r5v30 java.lang.String) binds: [B:17:0x005a, B:14:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9 A[PHI: r6
  0x00d9: PHI (r6v19 android.widget.EditText) = (r6v18 android.widget.EditText), (r6v23 android.widget.EditText) binds: [B:42:0x00d7, B:39:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    private static final Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setInternalBackgroundTint setinternalbackgroundtint, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        String nik;
        EditText editText;
        int i;
        EditText editText2;
        int i2;
        int i3 = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setinternalbackgroundtint.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            setinternalbackgroundtint.write();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            String transactionId = ((OcrKtpResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getTransactionId();
            if (transactionId != null) {
                int i4 = disconnect + 93;
                getExtras = i4 % 128;
                int i5 = i4 % 2;
                ((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).saveString("OCR_TRANSACTION_ID", transactionId);
            }
            ResultOcr data = ((OcrKtpResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
            RegisteredMemberRegistration registeredMemberRegistration = null;
            if (data != null) {
                int i6 = getExtras + 93;
                disconnect = i6 % 128;
                if (i6 % 2 == 0) {
                    nik = data.getNik();
                    int i7 = 94 / 0;
                    if (nik != null) {
                        if (nik.length() <= 0) {
                            nik = null;
                        }
                        if (nik != null) {
                            editText = setinternalbackgroundtint.INotificationSideChannelStub().tilIdNumber.getEditText();
                            if (editText != null) {
                                i = getExtras + 91;
                                disconnect = i % 128;
                                if (i % 2 != 0) {
                                    editText.setText(nik);
                                    registeredMemberRegistration.hashCode();
                                    throw null;
                                }
                                editText.setText(nik);
                            }
                            setinternalbackgroundtint.cancelAll = nik;
                        }
                    }
                } else {
                    nik = data.getNik();
                    if (nik != null) {
                        if (nik.length() <= 0) {
                            nik = null;
                        }
                        if (nik != null) {
                            editText = setinternalbackgroundtint.INotificationSideChannelStub().tilIdNumber.getEditText();
                            if (editText != null) {
                                i = getExtras + 91;
                                disconnect = i % 128;
                                if (i % 2 != 0) {
                                    editText.setText(nik);
                                    registeredMemberRegistration.hashCode();
                                    throw null;
                                }
                                editText.setText(nik);
                            }
                            setinternalbackgroundtint.cancelAll = nik;
                        }
                    }
                }
                String nama = data.getNama();
                if (nama != null) {
                    if (nama.length() <= 0) {
                        int i8 = disconnect + 13;
                        getExtras = i8 % 128;
                        int i9 = i8 % 2;
                        nama = null;
                    }
                    if (nama != null) {
                        int i10 = getExtras + 111;
                        disconnect = i10 % 128;
                        if (i10 % 2 == 0) {
                            editText2 = setinternalbackgroundtint.INotificationSideChannelStub().tilFullName.getEditText();
                            int i11 = 88 / 0;
                            if (editText2 != null) {
                                i2 = getExtras + 11;
                                disconnect = i2 % 128;
                                if (i2 % 2 != 0) {
                                    editText2.setText(nama);
                                    registeredMemberRegistration.hashCode();
                                    throw null;
                                }
                                editText2.setText(nama);
                            }
                        } else {
                            editText2 = setinternalbackgroundtint.INotificationSideChannelStub().tilFullName.getEditText();
                            if (editText2 != null) {
                                i2 = getExtras + 11;
                                disconnect = i2 % 128;
                                if (i2 % 2 != 0) {
                                    editText2.setText(nama);
                                    registeredMemberRegistration.hashCode();
                                    throw null;
                                }
                                editText2.setText(nama);
                            }
                        }
                        setinternalbackgroundtint.onTransact = nama;
                    }
                }
                String tglLahir = data.getTglLahir();
                if (tglLahir != null) {
                    if (tglLahir.length() <= 0) {
                        tglLahir = null;
                    }
                    if (tglLahir != null) {
                        EditText editText3 = setinternalbackgroundtint.INotificationSideChannelStub().tilBirthDate.getEditText();
                        if (editText3 != null) {
                            editText3.setText(tglLahir);
                        }
                        setinternalbackgroundtint.cancel = tglLahir;
                        try {
                            Date date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).parse(tglLahir);
                            if (date != null) {
                                setinternalbackgroundtint.g.setTime(date);
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
                        int i12 = getExtras + 117;
                        disconnect = i12 % 128;
                        int i13 = i12 % 2;
                        tempatLahir = null;
                    }
                    if (tempatLahir != null) {
                        setinternalbackgroundtint.notify = tempatLahir;
                    }
                }
                String alamat = data.getAlamat();
                if (alamat != null) {
                    if (alamat.length() <= 0) {
                        int i14 = getExtras + 111;
                        disconnect = i14 % 128;
                        if (i14 % 2 == 0) {
                            registeredMemberRegistration.hashCode();
                            throw null;
                        }
                        alamat = null;
                    }
                    if (alamat != null) {
                        setinternalbackgroundtint.INotificationSideChannel = alamat;
                    }
                }
            }
            File file = setinternalbackgroundtint.asInterface;
            if (file != null) {
                int i15 = disconnect + 35;
                getExtras = i15 % 128;
                int i16 = i15 % 2;
                getUntrustedCreatorPackageName getuntrustedcreatorpackagename = (getUntrustedCreatorPackageName) setinternalbackgroundtint.b.getValue();
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) setinternalbackgroundtint.TuitionPaymentFragmentbindingInflater1.getValue();
                if (registeredMemberRegistration2 != null) {
                    RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, file, null, null, null, 7864319);
                    int i17 = getExtras + 99;
                    disconnect = i17 % 128;
                    int i18 = i17 % 2;
                    getuntrustedcreatorpackagename = getuntrustedcreatorpackagename;
                    registeredMemberRegistration = registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
                getuntrustedcreatorpackagename.b.setValue(registeredMemberRegistration);
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            setinternalbackgroundtint.write();
            Toast.makeText(setinternalbackgroundtint.requireContext(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        int i = 2 % 2;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannelStubProxy.observe(getViewLifecycleOwner(), new b(new Function1() { // from class: AppCompatButtonInspectionCompanion1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setInternalBackgroundTint.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(this, new Observer() { // from class: setTextSize
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                setInternalBackgroundTint.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d.observe(getViewLifecycleOwner(), new Observer() { // from class: AppCompatButtonInspectionCompanion
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                setInternalBackgroundTint.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = getExtras + 49;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        int i = 2 % 2;
        FragmentNonSalariedWorkerPersonalDataActivationBinding fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = getString(R.string.error_invalid_field);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16), new accessconfigureInstanceInternal("^[0-9]{0,}$", string3)})));
        TextInputLayout textInputLayout2 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout3 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        int i2 = getExtras + 13;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = getExtras + 51;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
        int i4 = getExtras + 99;
        disconnect = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = disconnect + 111;
        getExtras = i2 % 128;
        if (i2 % 2 != 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
            return;
        }
        MaterialButton materialButton3 = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "");
        MaterialButton materialButton4 = materialButton3;
        Intrinsics.checkNotNullParameter(materialButton4, "");
        materialButton4.setEnabled(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean p0) {
        String strName;
        int i = 2 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (registeredMemberRegistration != null) {
            int i2 = disconnect + 101;
            getExtras = i2 % 128;
            int i3 = i2 % 2;
            Citizenship citizenship = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (citizenship != null) {
                strName = citizenship.name();
            } else {
                strName = null;
            }
        } else {
            strName = null;
        }
        if (!Intrinsics.areEqual(strName, "WNI")) {
            int i4 = getExtras + 25;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            p0 = true;
        }
        FragmentNonSalariedWorkerPersonalDataActivationBinding fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.setEnabled(p0);
        fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.setEnabled(p0);
        fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.setEnabled(p0);
        EditText editText = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
        if (editText != null) {
            int i6 = getExtras + 99;
            disconnect = i6 % 128;
            int i7 = i6 % 2;
            editText.setEnabled(p0);
        }
        EditText editText2 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
        if (editText2 != null) {
            editText2.setEnabled(p0);
        }
        EditText editText3 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText3 != null) {
            int i8 = getExtras + 19;
            disconnect = i8 % 128;
            int i9 = i8 % 2;
            editText3.setEnabled(p0);
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        RegisteredMemberRegistration value;
        setInternalBackgroundTint setinternalbackgroundtint = (setInternalBackgroundTint) objArr[0];
        int i = 2 % 2;
        int i2 = getExtras + 37;
        disconnect = i2 % 128;
        if (i2 % 2 == 0) {
            value = ((getUntrustedCreatorPackageName) setinternalbackgroundtint.b.getValue()).b.getValue();
            int i3 = 50 / 0;
        } else {
            value = ((getUntrustedCreatorPackageName) setinternalbackgroundtint.b.getValue()).b.getValue();
        }
        int i4 = getExtras + 41;
        disconnect = i4 % 128;
        int i5 = i4 % 2;
        return value;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        String stringExtra;
        setInternalBackgroundTint setinternalbackgroundtint = (setInternalBackgroundTint) objArr[0];
        ActivityResult activityResult = (ActivityResult) objArr[1];
        int i = 2 % 2;
        int i2 = getExtras + 13;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (i3 == 0) {
            activityResult.getResultCode();
            throw null;
        }
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            if (data != null) {
                stringExtra = data.getStringExtra("extra_photo_path");
                int i4 = disconnect + 109;
                getExtras = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 5;
                }
            } else {
                stringExtra = null;
            }
            if (stringExtra != null) {
                File file = new File(stringExtra);
                if (file.exists()) {
                    setinternalbackgroundtint.asInterface = file;
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(stringExtra);
                    setinternalbackgroundtint.INotificationSideChannelStub().imgKtpPhoto.setImageBitmap(bitmapDecodeFile);
                    setinternalbackgroundtint.INotificationSideChannelStub().imgKtpPhoto.setVisibility(0);
                    setinternalbackgroundtint.INotificationSideChannelStub().clKtpPlaceholder.setVisibility(8);
                    setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1(true);
                    Intrinsics.checkNotNull(bitmapDecodeFile);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                    String strEncodeToString = android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
                    ((setSplitTrack) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new OcrKtpRequest(UUID.randomUUID().toString(), strEncodeToString));
                    int i6 = disconnect + 103;
                    getExtras = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035 A[PHI: r2
  0x0035: PHI (r2v11 java.lang.String) = (r2v10 java.lang.String), (r2v12 java.lang.String) binds: [B:10:0x0033, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setInternalBackgroundTint setinternalbackgroundtint, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        int i;
        int i2 = 2 % 2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        setinternalbackgroundtint.getInterfaceDescriptor = String.valueOf(userLocationComplete.b);
        setinternalbackgroundtint.INotificationSideChannelDefault = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object obj = null;
        if (locationAddressInfo != null) {
            int i3 = disconnect + 89;
            getExtras = i3 % 128;
            if (i3 % 2 != 0) {
                str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i4 = 59 / 0;
                if (str != null) {
                    i = getExtras + 47;
                    disconnect = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                } else {
                    str = "";
                }
            } else {
                str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str != null) {
                    i = getExtras + 47;
                    disconnect = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                } else {
                    str = "";
                }
            }
        } else {
            str = "";
        }
        setinternalbackgroundtint.INotificationSideChannelStubProxy = str;
        setinternalbackgroundtint.INotificationSideChannelStub = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 != null) {
            int i5 = disconnect + 75;
            getExtras = i5 % 128;
            if (i5 % 2 != 0) {
                String str5 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                obj.hashCode();
                throw null;
            }
            str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        setinternalbackgroundtint.RemoteActionCompatParcelizer = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        setinternalbackgroundtint.read = str4;
        String str6 = setinternalbackgroundtint.getInterfaceDescriptor;
        String str7 = setinternalbackgroundtint.INotificationSideChannelDefault;
        String str8 = setinternalbackgroundtint.INotificationSideChannelStubProxy;
        String str9 = setinternalbackgroundtint.INotificationSideChannelStub;
        String str10 = setinternalbackgroundtint.RemoteActionCompatParcelizer;
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = getExtras + 93;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = disconnect + 47;
        getExtras = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ void b(setInternalBackgroundTint setinternalbackgroundtint, VirtualCameraAdapter1 virtualCameraAdapter1) {
        Editable text;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setinternalbackgroundtint.IconCompatParcelizer();
            return;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = disconnect + 61;
            getExtras = i2 % 128;
            int i3 = i2 % 2;
            setinternalbackgroundtint.write();
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setinternalbackgroundtint.TuitionPaymentFragmentbindingInflater1.getValue();
            if (registeredMemberRegistration != null) {
                Context contextRequireContext = setinternalbackgroundtint.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                Intrinsics.checkExpressionValueIsNotNull(string, "");
                EditText editText = setinternalbackgroundtint.INotificationSideChannelStub().tilBirthDate.getEditText();
                if (editText != null) {
                    int i4 = getExtras + 45;
                    disconnect = i4 % 128;
                    if (i4 % 2 == 0) {
                        editText.getText();
                        throw null;
                    }
                    text = editText.getText();
                } else {
                    text = null;
                }
                String string2 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                EditText editText2 = setinternalbackgroundtint.INotificationSideChannelStub().tilIdNumber.getEditText();
                String string3 = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
                StringBuilder sb = new StringBuilder();
                sb.append(string3);
                sb.append("#Y");
                String string4 = sb.toString();
                EditText editText3 = setinternalbackgroundtint.INotificationSideChannelStub().tilFullName.getEditText();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, string, null, null, null, MembershipType.BPU, null, StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString(), string4, null, null, null, null, string2, String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), String.valueOf(((MembershipCheckNew) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b), null, null, null, null, null, null, null, 8326958);
            }
            ((getUntrustedCreatorPackageName) setinternalbackgroundtint.b.getValue()).b.setValue((RegisteredMemberRegistration) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            ((getUntrustedCreatorPackageName) setinternalbackgroundtint.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i5 = getExtras + 55;
            disconnect = i5 % 128;
            int i6 = i5 % 2;
            setinternalbackgroundtint.write();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            String string5 = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
            String string6 = setinternalbackgroundtint.getString(R.string.error_data_membership_not_found);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            if (!StringsKt.contains$default((CharSequence) string5, (CharSequence) string6, false, 2, (Object) null)) {
                setInternalBackgroundTint setinternalbackgroundtint2 = setinternalbackgroundtint;
                String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(setinternalbackgroundtint2, "");
                Intrinsics.checkNotNullParameter(strValueOf, "");
                BaseActivity baseActivity = (BaseActivity) setinternalbackgroundtint2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                    return;
                }
                return;
            }
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String string7 = setinternalbackgroundtint.getString(R.string.title_data_membership_not_found);
            Intrinsics.checkNotNullExpressionValue(string7, "");
            String string8 = setinternalbackgroundtint.getString(R.string.message_membership_not_found);
            Intrinsics.checkNotNullExpressionValue(string8, "");
            String string9 = setinternalbackgroundtint.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string9, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string7, string8, string9, new Function0() { // from class: setAllCaps
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return setInternalBackgroundTint.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }, 96);
            FragmentManager childFragmentManager = setinternalbackgroundtint.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
    }

    public static /* synthetic */ void b(setInternalBackgroundTint setinternalbackgroundtint, int i, int i2, int i3) {
        int i4 = 2 % 2;
        setinternalbackgroundtint.g.set(1, i);
        setinternalbackgroundtint.g.set(2, i2);
        setinternalbackgroundtint.g.set(5, i3);
        setinternalbackgroundtint.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(setinternalbackgroundtint.g.getTime()));
        int i5 = getExtras + 103;
        disconnect = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setInternalBackgroundTint setinternalbackgroundtint, FragmentNonSalariedWorkerPersonalDataActivationBinding fragmentNonSalariedWorkerPersonalDataActivationBinding, View view) {
        Editable text;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, setinternalbackgroundtint.requireContext());
        fragmentNonSalariedWorkerPersonalDataActivationBinding.nonSalariedWorkerPersonalDataContainer.requestFocus();
        if (setinternalbackgroundtint.asInterface == null) {
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String string = setinternalbackgroundtint.getString(R.string.error_field_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = setinternalbackgroundtint.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, "Anda wajib mengambil foto KTP terlebih dahulu", string2, new Function0() { // from class: onInitializeAccessibilityEvent
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return setInternalBackgroundTint.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
            }, 96);
            FragmentManager childFragmentManager = setinternalbackgroundtint.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            return Unit.INSTANCE;
        }
        if (((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getString("OCR_TRANSACTION_ID", "").length() == 0) {
            String string3 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "");
            ((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).saveString("OCR_TRANSACTION_ID", string3);
        }
        setSplitTrack setsplittrack = (setSplitTrack) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        String string4 = ((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getString("OCR_TRANSACTION_ID", "");
        EditText editText = fragmentNonSalariedWorkerPersonalDataActivationBinding.tilBirthDate.getEditText();
        Editable text2 = null;
        String string5 = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
        EditText editText2 = fragmentNonSalariedWorkerPersonalDataActivationBinding.tilIdNumber.getEditText();
        if (editText2 != null) {
            int i2 = getExtras + 109;
            disconnect = i2 % 128;
            int i3 = i2 % 2;
            text = editText2.getText();
        } else {
            text = null;
        }
        String strValueOf = String.valueOf(text);
        EditText editText3 = fragmentNonSalariedWorkerPersonalDataActivationBinding.tilFullName.getEditText();
        if (editText3 != null) {
            int i4 = getExtras + 3;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            text2 = editText3.getText();
        }
        String string6 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
        setSessionCaptureCallback setsessioncapturecallback = setSessionCaptureCallback.INSTANCE;
        Context contextRequireContext = setinternalbackgroundtint.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        setsplittrack.TuitionPaymentFragmentbindingInflater1(string4, new ActivationRequest(strValueOf, "", string6, string5, "KTP", "BPU", setSessionCaptureCallback.b(contextRequireContext)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:33:0x0102  */
    /* JADX WARN: Code duplicated, block: B:35:0x010c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0136  */
    /* JADX WARN: Code duplicated, block: B:39:0x0156  */
    /* JADX WARN: Code duplicated, block: B:41:0x0196  */
    /* JADX WARN: Code duplicated, block: B:42:0x019d  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x030e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0313  */
    /* JADX WARN: Code duplicated, block: B:71:0x032a  */
    /* JADX WARN: Code duplicated, block: B:72:0x032f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0348  */
    /* JADX WARN: Code duplicated, block: B:78:0x0352  */
    /* JADX WARN: Code duplicated, block: B:81:0x035b  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(setInternalBackgroundTint setinternalbackgroundtint, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        EditText editText;
        Editable text;
        EditText editText2;
        Editable text2;
        EditText editText3;
        Editable text3;
        RegisteredMemberRegistration registeredMemberRegistration;
        String strName;
        Citizenship citizenship;
        Editable text4;
        getStringOrNull getstringornullB;
        FragmentManager childFragmentManager;
        EditText editText4;
        EditText editText5;
        Editable text5;
        EditText editText6;
        Editable text6;
        int i;
        int i2 = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setinternalbackgroundtint.IconCompatParcelizer();
            str = "loading_activation_account_step_first_result";
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
                setinternalbackgroundtint.write();
                FragmentNonSalariedWorkerPersonalDataActivationBinding fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub = setinternalbackgroundtint.INotificationSideChannelStub();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                String strValueOf = String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getResetAccCheckSum());
                setinternalbackgroundtint.IconCompatParcelizer = strValueOf;
                if (!Intrinsics.areEqual(strValueOf, "900")) {
                    int i3 = disconnect + 123;
                    getExtras = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 88 / 0;
                        if (Intrinsics.areEqual(setinternalbackgroundtint.IconCompatParcelizer, "901")) {
                            if (Intrinsics.areEqual(String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleResetAcc()), "Y") || !Intrinsics.areEqual(String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleRegistration()), ExifInterface.GPS_DIRECTION_TRUE)) {
                                setSplitTrack setsplittrack = (setSplitTrack) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                                String string = ((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getString("OCR_TRANSACTION_ID", "");
                                Context contextRequireContext = setinternalbackgroundtint.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                                String string2 = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
                                Intrinsics.checkExpressionValueIsNotNull(string2, "");
                                editText = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                                if (editText != null) {
                                    text = editText.getText();
                                } else {
                                    text = null;
                                }
                                String string3 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                                editText2 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                                if (editText2 != null) {
                                    text2 = editText2.getText();
                                } else {
                                    text2 = null;
                                }
                                String string4 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
                                editText3 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                                if (editText3 != null) {
                                    text3 = editText3.getText();
                                } else {
                                    text3 = null;
                                }
                                String string5 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                                registeredMemberRegistration = (RegisteredMemberRegistration) setinternalbackgroundtint.TuitionPaymentFragmentbindingInflater1.getValue();
                                if (registeredMemberRegistration != null || (citizenship = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
                                    strName = null;
                                } else {
                                    strName = citizenship.name();
                                }
                                EditText editText7 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                                setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string, new MembershipCheckRequest(string2, strName, "BPU", string5, StringsKt.trim((CharSequence) String.valueOf(editText7 != null ? editText7.getText() : null)).toString(), string4, "", string3));
                            } else {
                                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) setinternalbackgroundtint.TuitionPaymentFragmentbindingInflater1.getValue();
                                if (registeredMemberRegistration2 != null) {
                                    int i5 = disconnect + 81;
                                    getExtras = i5 % 128;
                                    int i6 = i5 % 2;
                                    Context contextRequireContext2 = setinternalbackgroundtint.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                                    String string6 = Settings.Secure.getString(contextRequireContext2.getContentResolver(), "android_id");
                                    Intrinsics.checkExpressionValueIsNotNull(string6, "");
                                    EditText editText8 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                                    String string7 = StringsKt.trim((CharSequence) String.valueOf(editText8 != null ? editText8.getText() : null)).toString();
                                    EditText editText9 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                                    if (editText9 != null) {
                                        int i7 = getExtras + 89;
                                        disconnect = i7 % 128;
                                        int i8 = i7 % 2;
                                        text4 = editText9.getText();
                                    } else {
                                        text4 = null;
                                    }
                                    String string8 = StringsKt.trim((CharSequence) String.valueOf(text4)).toString();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(string8);
                                    sb.append("#T");
                                    String string9 = sb.toString();
                                    EditText editText10 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                                    if (editText10 != null) {
                                        int i9 = getExtras + 29;
                                        disconnect = i9 % 128;
                                        int i10 = i9 % 2;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = editText10.getText();
                                    }
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration2, string6, null, null, null, MembershipType.BPU, null, StringsKt.trim((CharSequence) String.valueOf(objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).toString(), string9, null, "KTP", null, null, string7, String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum()), String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum()), String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature()), null, null, null, null, null, null, null, 8326446);
                                }
                                ((getUntrustedCreatorPackageName) setinternalbackgroundtint.b.getValue()).b.setValue((RegisteredMemberRegistration) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                ((getUntrustedCreatorPackageName) setinternalbackgroundtint.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            }
                        } else if (Intrinsics.areEqual(setinternalbackgroundtint.IconCompatParcelizer, "902")) {
                            BookingAntreanFormActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = BookingAntreanFormActivity.INSTANCE;
                            Context contextRequireContext3 = setinternalbackgroundtint.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                            editText5 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                            if (editText5 != null) {
                                int i11 = getExtras + 101;
                                disconnect = i11 % 128;
                                int i12 = i11 % 2;
                                text5 = editText5.getText();
                            } else {
                                text5 = null;
                            }
                            String string10 = StringsKt.trim((CharSequence) String.valueOf(text5)).toString();
                            editText6 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                            if (editText6 != null) {
                                i = getExtras + 33;
                                disconnect = i % 128;
                                if (i % 2 == 0) {
                                    text6 = editText6.getText();
                                    int i13 = 85 / 0;
                                } else {
                                    text6 = editText6.getText();
                                }
                            } else {
                                text6 = null;
                            }
                            String string11 = StringsKt.trim((CharSequence) String.valueOf(text6)).toString();
                            EditText editText11 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                            BookingAntreanFormActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext3, string10, string11, StringsKt.trim((CharSequence) String.valueOf(editText11 != null ? editText11.getText() : null)).toString(), setinternalbackgroundtint.notify, setinternalbackgroundtint.INotificationSideChannel, setinternalbackgroundtint.getInterfaceDescriptor, setinternalbackgroundtint.INotificationSideChannelDefault, "RES", "BPU", ((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getString("OCR_TRANSACTION_ID", ""));
                        } else if (Intrinsics.areEqual(setinternalbackgroundtint.IconCompatParcelizer, "903")) {
                            setinternalbackgroundtint.IconCompatParcelizer = String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getResetAccCheckSum());
                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                            String string12 = ((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getString("OCR_TRANSACTION_ID", "");
                            editText4 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                            if (editText4 != null) {
                                int i14 = getExtras + 115;
                                disconnect = i14 % 128;
                                int i15 = i14 % 2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = editText4.getText();
                            }
                            getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1(string12, StringsKt.trim((CharSequence) String.valueOf(objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).toString());
                        } else {
                            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                            String string13 = setinternalbackgroundtint.getString(R.string.title_data_membership_not_found);
                            Intrinsics.checkNotNullExpressionValue(string13, "");
                            String string14 = setinternalbackgroundtint.getString(R.string.message_membership_not_found);
                            Intrinsics.checkNotNullExpressionValue(string14, "");
                            String string15 = setinternalbackgroundtint.getString(R.string.action_ok);
                            Intrinsics.checkNotNullExpressionValue(string15, "");
                            getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_information, string13, string14, string15, new Function0() { // from class: onTextChanged
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return setInternalBackgroundTint.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                }
                            }, 96);
                            childFragmentManager = setinternalbackgroundtint.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            Intrinsics.checkNotNullParameter(childFragmentManager, "");
                            if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        }
                    } else if (!Intrinsics.areEqual(setinternalbackgroundtint.IconCompatParcelizer, "901")) {
                        if (Intrinsics.areEqual(setinternalbackgroundtint.IconCompatParcelizer, "902")) {
                            BookingAntreanFormActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = BookingAntreanFormActivity.INSTANCE;
                            Context contextRequireContext4 = setinternalbackgroundtint.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
                            editText5 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                            if (editText5 != null) {
                                int i16 = getExtras + 101;
                                disconnect = i16 % 128;
                                int i17 = i16 % 2;
                                text5 = editText5.getText();
                            } else {
                                text5 = null;
                            }
                            String string16 = StringsKt.trim((CharSequence) String.valueOf(text5)).toString();
                            editText6 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                            if (editText6 != null) {
                                i = getExtras + 33;
                                disconnect = i % 128;
                                if (i % 2 == 0) {
                                    text6 = editText6.getText();
                                    int i18 = 85 / 0;
                                } else {
                                    text6 = editText6.getText();
                                }
                            } else {
                                text6 = null;
                            }
                            String string17 = StringsKt.trim((CharSequence) String.valueOf(text6)).toString();
                            EditText editText12 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                            BookingAntreanFormActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext4, string16, string17, StringsKt.trim((CharSequence) String.valueOf(editText12 != null ? editText12.getText() : null)).toString(), setinternalbackgroundtint.notify, setinternalbackgroundtint.INotificationSideChannel, setinternalbackgroundtint.getInterfaceDescriptor, setinternalbackgroundtint.INotificationSideChannelDefault, "RES", "BPU", ((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getString("OCR_TRANSACTION_ID", ""));
                        } else if (Intrinsics.areEqual(setinternalbackgroundtint.IconCompatParcelizer, "903")) {
                            setinternalbackgroundtint.IconCompatParcelizer = String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getResetAccCheckSum());
                            getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist2 = (getStreamUseCaseSupportedCombinationList) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                            String string18 = ((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getString("OCR_TRANSACTION_ID", "");
                            editText4 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                            if (editText4 != null) {
                                int i19 = getExtras + 115;
                                disconnect = i19 % 128;
                                int i110 = i19 % 2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = editText4.getText();
                            }
                            getstreamusecasesupportedcombinationlist2.TuitionPaymentFragmentbindingInflater1(string18, StringsKt.trim((CharSequence) String.valueOf(objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).toString());
                        } else {
                            getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                            String string19 = setinternalbackgroundtint.getString(R.string.title_data_membership_not_found);
                            Intrinsics.checkNotNullExpressionValue(string19, "");
                            String string110 = setinternalbackgroundtint.getString(R.string.message_membership_not_found);
                            Intrinsics.checkNotNullExpressionValue(string110, "");
                            String string111 = setinternalbackgroundtint.getString(R.string.action_ok);
                            Intrinsics.checkNotNullExpressionValue(string111, "");
                            getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_information, string19, string110, string111, new Function0() { // from class: onTextChanged
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return setInternalBackgroundTint.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                }
                            }, 96);
                            childFragmentManager = setinternalbackgroundtint.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            Intrinsics.checkNotNullParameter(childFragmentManager, "");
                            if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                                getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                        }
                    } else if (Intrinsics.areEqual(String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleResetAcc()), "Y")) {
                        setSplitTrack setsplittrack2 = (setSplitTrack) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                        String string20 = ((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getString("OCR_TRANSACTION_ID", "");
                        Context contextRequireContext5 = setinternalbackgroundtint.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
                        String string21 = Settings.Secure.getString(contextRequireContext5.getContentResolver(), "android_id");
                        Intrinsics.checkExpressionValueIsNotNull(string21, "");
                        editText = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                        if (editText != null) {
                            text = editText.getText();
                        } else {
                            text = null;
                        }
                        String string22 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                        editText2 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                        if (editText2 != null) {
                            text2 = editText2.getText();
                        } else {
                            text2 = null;
                        }
                        String string23 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
                        editText3 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                        if (editText3 != null) {
                            text3 = editText3.getText();
                        } else {
                            text3 = null;
                        }
                        String string24 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                        registeredMemberRegistration = (RegisteredMemberRegistration) setinternalbackgroundtint.TuitionPaymentFragmentbindingInflater1.getValue();
                        if (registeredMemberRegistration != null) {
                            strName = null;
                        } else {
                            strName = null;
                        }
                        EditText editText13 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                        setsplittrack2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string20, new MembershipCheckRequest(string21, strName, "BPU", string24, StringsKt.trim((CharSequence) String.valueOf(editText13 != null ? editText13.getText() : null)).toString(), string23, "", string22));
                    } else {
                        setSplitTrack setsplittrack3 = (setSplitTrack) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                        String string25 = ((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getString("OCR_TRANSACTION_ID", "");
                        Context contextRequireContext6 = setinternalbackgroundtint.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "");
                        String string26 = Settings.Secure.getString(contextRequireContext6.getContentResolver(), "android_id");
                        Intrinsics.checkExpressionValueIsNotNull(string26, "");
                        editText = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                        if (editText != null) {
                            text = editText.getText();
                        } else {
                            text = null;
                        }
                        String string27 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                        editText2 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                        if (editText2 != null) {
                            text2 = editText2.getText();
                        } else {
                            text2 = null;
                        }
                        String string28 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
                        editText3 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                        if (editText3 != null) {
                            text3 = editText3.getText();
                        } else {
                            text3 = null;
                        }
                        String string29 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                        registeredMemberRegistration = (RegisteredMemberRegistration) setinternalbackgroundtint.TuitionPaymentFragmentbindingInflater1.getValue();
                        if (registeredMemberRegistration != null) {
                            strName = null;
                        } else {
                            strName = null;
                        }
                        EditText editText14 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                        setsplittrack3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string25, new MembershipCheckRequest(string26, strName, "BPU", string29, StringsKt.trim((CharSequence) String.valueOf(editText14 != null ? editText14.getText() : null)).toString(), string28, "", string27));
                    }
                } else if (Intrinsics.areEqual(String.valueOf(((ActivationItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getEligibleResetAcc()), "Y")) {
                    setSplitTrack setsplittrack4 = (setSplitTrack) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    String string210 = ((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getString("OCR_TRANSACTION_ID", "");
                    Context contextRequireContext7 = setinternalbackgroundtint.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext7, "");
                    String string211 = Settings.Secure.getString(contextRequireContext7.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string211, "");
                    editText = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                    if (editText != null) {
                        text = editText.getText();
                    } else {
                        text = null;
                    }
                    String string212 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                    editText2 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                    if (editText2 != null) {
                        text2 = editText2.getText();
                    } else {
                        text2 = null;
                    }
                    String string213 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
                    editText3 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                    if (editText3 != null) {
                        text3 = editText3.getText();
                    } else {
                        text3 = null;
                    }
                    String string214 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                    registeredMemberRegistration = (RegisteredMemberRegistration) setinternalbackgroundtint.TuitionPaymentFragmentbindingInflater1.getValue();
                    if (registeredMemberRegistration != null) {
                        strName = null;
                    } else {
                        strName = null;
                    }
                    EditText editText15 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                    setsplittrack4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string210, new MembershipCheckRequest(string211, strName, "BPU", string214, StringsKt.trim((CharSequence) String.valueOf(editText15 != null ? editText15.getText() : null)).toString(), string213, "", string212));
                } else {
                    setSplitTrack setsplittrack5 = (setSplitTrack) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    String string215 = ((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getString("OCR_TRANSACTION_ID", "");
                    Context contextRequireContext8 = setinternalbackgroundtint.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext8, "");
                    String string216 = Settings.Secure.getString(contextRequireContext8.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string216, "");
                    editText = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
                    if (editText != null) {
                        text = editText.getText();
                    } else {
                        text = null;
                    }
                    String string217 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                    editText2 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                    if (editText2 != null) {
                        text2 = editText2.getText();
                    } else {
                        text2 = null;
                    }
                    String string218 = StringsKt.trim((CharSequence) String.valueOf(text2)).toString();
                    editText3 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilIdNumber.getEditText();
                    if (editText3 != null) {
                        text3 = editText3.getText();
                    } else {
                        text3 = null;
                    }
                    String string219 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                    registeredMemberRegistration = (RegisteredMemberRegistration) setinternalbackgroundtint.TuitionPaymentFragmentbindingInflater1.getValue();
                    if (registeredMemberRegistration != null) {
                        strName = null;
                    } else {
                        strName = null;
                    }
                    EditText editText16 = fragmentNonSalariedWorkerPersonalDataActivationBindingINotificationSideChannelStub.tilFullName.getEditText();
                    setsplittrack5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string215, new MembershipCheckRequest(string216, strName, "BPU", string219, StringsKt.trim((CharSequence) String.valueOf(editText16 != null ? editText16.getText() : null)).toString(), string218, "", string217));
                }
                str = "success_activation_account_step_first_result";
            } else {
                if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    setinternalbackgroundtint.write();
                    setInternalBackgroundTint setinternalbackgroundtint2 = setinternalbackgroundtint;
                    String strValueOf2 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Intrinsics.checkNotNullParameter(setinternalbackgroundtint2, "");
                    Intrinsics.checkNotNullParameter(strValueOf2, "");
                    BaseActivity baseActivity = (BaseActivity) setinternalbackgroundtint2.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf2, null);
                    }
                }
                str = "";
            }
        }
        FragmentActivity activity = setinternalbackgroundtint.getActivity();
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

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final setInternalBackgroundTint setinternalbackgroundtint, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: getAutoSizeTextType
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    setInternalBackgroundTint.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i2, i3, i4);
                }
            }, setinternalbackgroundtint.g.get(1), setinternalbackgroundtint.g.get(2), setinternalbackgroundtint.g.get(5)).show();
            ViewPortBuilder.b();
            int i2 = disconnect + 67;
            getExtras = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 94 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(setInternalBackgroundTint setinternalbackgroundtint, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = disconnect + 123;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            int i4 = getExtras + 25;
            disconnect = i4 % 128;
            if (i4 % 2 == 0) {
                setinternalbackgroundtint.asBinder = true;
                ActivityResultLauncher<Intent> activityResultLauncher = setinternalbackgroundtint.MediaBrowserCompat;
                KtpCameraActivity.Companion bVar = KtpCameraActivity.INSTANCE;
                Context contextRequireContext = setinternalbackgroundtint.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                activityResultLauncher.launch(KtpCameraActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext));
                return;
            }
            setinternalbackgroundtint.asBinder = true;
            ActivityResultLauncher<Intent> activityResultLauncher2 = setinternalbackgroundtint.MediaBrowserCompat;
            KtpCameraActivity.Companion bVar2 = KtpCameraActivity.INSTANCE;
            Context contextRequireContext2 = setinternalbackgroundtint.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            activityResultLauncher2.launch(KtpCameraActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext2));
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        setInternalBackgroundTint setinternalbackgroundtint = (setInternalBackgroundTint) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        if (setinternalbackgroundtint.asBinder) {
            ActivityResultLauncher<Intent> activityResultLauncher = setinternalbackgroundtint.MediaBrowserCompat;
            KtpCameraActivity.Companion bVar = KtpCameraActivity.INSTANCE;
            Context contextRequireContext = setinternalbackgroundtint.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            activityResultLauncher.launch(KtpCameraActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext));
            int i2 = getExtras + 57;
            disconnect = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = getExtras + 95;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            ActivityResultLauncher<Intent> activityResultLauncher2 = setinternalbackgroundtint.write;
            KtpGuidanceActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = KtpGuidanceActivity.INSTANCE;
            Context contextRequireContext2 = setinternalbackgroundtint.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            activityResultLauncher2.launch(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(contextRequireContext2));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getExtras + 81;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = disconnect + 19;
        getExtras = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = getExtras + 49;
        disconnect = i2 % 128;
        if (i2 % 2 != 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x005f  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws IOException {
        setInternalBackgroundTint setinternalbackgroundtint = (setInternalBackgroundTint) objArr[0];
        int i = 2 % 2;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) setinternalbackgroundtint.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null) {
            int i2 = disconnect + 81;
            getExtras = i2 % 128;
            int i3 = i2 % 2;
            if (camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                setinternalbackgroundtint.getInterfaceDescriptor = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
                setinternalbackgroundtint.INotificationSideChannelDefault = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                setinternalbackgroundtint.INotificationSideChannelStubProxy = camera2CameraControlExternalSyntheticLambda4B.b;
                setinternalbackgroundtint.INotificationSideChannelStub = camera2CameraControlExternalSyntheticLambda4B.g;
                setinternalbackgroundtint.RemoteActionCompatParcelizer = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                setinternalbackgroundtint.read = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str = setinternalbackgroundtint.getInterfaceDescriptor;
                String str2 = setinternalbackgroundtint.INotificationSideChannelDefault;
                StringBuilder sb = new StringBuilder("Location from cache: ");
                sb.append(str);
                sb.append(", ");
                sb.append(str2);
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
            } else {
                setinternalbackgroundtint.getInterfaceDescriptor = "0.0";
                setinternalbackgroundtint.INotificationSideChannelDefault = "0.0";
                ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
            }
        } else {
            setinternalbackgroundtint.getInterfaceDescriptor = "0.0";
            setinternalbackgroundtint.INotificationSideChannelDefault = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop3 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = disconnect + 87;
        getExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault2(setInternalBackgroundTint setinternalbackgroundtint) {
        int iTuitionPaymentFragmentbindingInflater1 = isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1();
        return (RegisteredMemberRegistration) b(new Object[]{setinternalbackgroundtint}, isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), 1030348398, iTuitionPaymentFragmentbindingInflater1, -1030348398);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(setInternalBackgroundTint setinternalbackgroundtint, ActivityResult activityResult) {
        int iTuitionPaymentFragmentbindingInflater1 = isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1();
        b(new Object[]{setinternalbackgroundtint, activityResult}, isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), -1267162873, iTuitionPaymentFragmentbindingInflater1, 1267162876);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setInternalBackgroundTint setinternalbackgroundtint, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        int i = 2 % 2;
        int i2 = getExtras + 41;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        Unit unitTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(setinternalbackgroundtint, virtualCameraAdapter1);
        int i4 = getExtras + 43;
        disconnect = i4 % 128;
        if (i4 % 2 != 0) {
            return unitTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setInternalBackgroundTint setinternalbackgroundtint, View view) {
        int iTuitionPaymentFragmentbindingInflater1 = isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1();
        return (Unit) b(new Object[]{setinternalbackgroundtint, view}, isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), -1176963141, iTuitionPaymentFragmentbindingInflater1, 1176963143);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setInternalBackgroundTint setinternalbackgroundtint) {
        int iTuitionPaymentFragmentbindingInflater1 = isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1();
        return (Unit) b(new Object[]{setinternalbackgroundtint}, isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), 955701921, iTuitionPaymentFragmentbindingInflater1, -955701920);
    }

    static {
        getNotifyChildrenChangedOptions = 0;
        TuitionPaymentFragmentbindingInflater1();
        INSTANCE = new Companion(null);
        int i = isConnected + 5;
        getNotifyChildrenChangedOptions = i % 128;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        int iTuitionPaymentFragmentbindingInflater1 = isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1();
        b(new Object[]{this}, isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), isAffectedXiaoMiDevices.TuitionPaymentFragmentbindingInflater1(), 1860261399, iTuitionPaymentFragmentbindingInflater1, -1860261395);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        int i = 2 % 2;
        int i2 = getExtras + 31;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        getRoot = new char[]{60046, 59744, 59747, 60048, 60063, 60034, 60072, 60055, 60057, 60054, 60061, 60062, 59746, 60051, 60073, 60047, 60049, 60059, 60060, 60058, 60041, 60088, 59745, 60040, 60050, 60053, 60045, 60043, 60090, 60052, 60056, 60079, 60083, 59748, 59749, 60117};
        getItem = (char) 57191;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = disconnect + 45;
        getExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static String $$g(int i, short s, byte b2) {
        int i2 = b2 * 3;
        byte[] bArr = $$c;
        int i3 = (s * 3) + 4;
        int i4 = i + 113;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i4 = i3 + i2;
        }
        while (true) {
            int i6 = i3;
            int i7 = i4;
            i5++;
            bArr2[i5] = (byte) i7;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            i3 = i6 + 1;
            i4 = i7 + bArr[i6];
        }
    }
}
