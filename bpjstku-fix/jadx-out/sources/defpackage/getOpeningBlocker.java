package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
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
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import androidx.work.WorkInfo;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.ScholarshipInsertRequest;
import com.bpjstku.data.scholarship.model.response.ScholarshipInsertResponse;
import com.bpjstku.databinding.FragmentScholarBenefitStep3Binding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.scholarship.model.ScholarDocument;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.scholarship.benefit.ScholarBenefitActivity;
import com.bpjstku.presentation.scholarship.benefit.fragment.ScholarBenefitStep3Fragment$bindingInflater$1;
import com.bpjstku.presentation.scholarship.benefit.fragment.ScholarBenefitStep3Fragment$captureImageCamera$1$1;
import com.bpjstku.presentation.scholarship.benefit.fragment.ScholarBenefitStep3Fragment$onActivityResult$1;
import com.bpjstku.util.custom.WrapContentLinearLayoutManager;
import com.esafirm.imagepicker.model.Image;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u001f\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J)\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR.\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010'\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010*\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010,R\u001e\u0010!\u001a\f\u0012\b\u0012\u0006*\u00020\b0\b0-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R\u0015\u00101\u001a\u00020/8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b)\u00100"}, d2 = {"LgetOpeningBlocker;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentScholarBenefitStep3Binding;", "<init>", "()V", "", "INotificationSideChannelDefault", "g", "Landroid/net/Uri;", "p0", "", "p1", "Ljava/io/File;", "TuitionPaymentFragmentbindingInflater1", "(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/File;", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "asBinder", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;", "LupdateMaximumSizeByFormat;", "LupdateMaximumSizeByFormat;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "b", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "Landroid/net/Uri;", "Ljava/io/File;", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/ActivityResultLauncher;", "LActivityResultContractsTakePicture;", "Lkotlin/Lazy;", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getOpeningBlocker extends AutoValue_ImmutableImageInfo<FragmentScholarBenefitStep3Binding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final ActivityResultLauncher<Uri> d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private File asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private updateMaximumSizeByFormat TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private Uri b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List<File> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList();

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
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

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getWrite() {
        return R.layout.fragment_scholar_benefit_step3;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public getOpeningBlocker() {
        ActivityResultLauncher<Uri> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.TakePicture(), new ActivityResultCallback() { // from class: setRepeatingBurstRequests
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            private static final byte[] $$c = {23, -73, 107, 5};
            private static final int $$f = 39;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {65, -122, -65, 2, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
            private static final int $$e = 36;
            private static final byte[] $$a = {119, -103, 14, -22, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 56, 5, 16, 5, -67, 45, -32, -2, 12, 13, 37, 16, 5, -8, 0, 6, -3, 1, 22, -12, 1, 18, -44, 54, -1, -12, 12, 8, -7, 9, 2, -21, 14, 14, 12, -13};
            private static final int $$b = 30;
            private static int b = 0;
            private static int asInterface = 1;

            /* JADX WARN: Code duplicated, block: B:10:0x001f  */
            /* JADX WARN: Code duplicated, block: B:8:0x0017  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0023). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r5, short r6, short r7, java.lang.Object[] r8) {
                /*
                    int r7 = 93 - r7
                    byte[] r0 = defpackage.setRepeatingBurstRequests.$$d
                    int r5 = 103 - r5
                    int r1 = r6 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L11
                    r4 = r5
                    r5 = r6
                    r3 = r2
                    goto L23
                L11:
                    r3 = r2
                L12:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    if (r3 != r6) goto L1f
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L1f:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                L23:
                    int r5 = r5 + r4
                    int r7 = r7 + 1
                    int r5 = r5 + (-11)
                    goto L12
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setRepeatingBurstRequests.d(byte, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x002a  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void e(short r7, int r8, int r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 * 33
                    int r8 = r8 + 4
                    byte[] r0 = defpackage.setRepeatingBurstRequests.$$a
                    int r9 = r9 * 17
                    int r9 = r9 + 17
                    int r7 = r7 * 3
                    int r7 = 106 - r7
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r7 = r8
                    r3 = r9
                    r4 = r2
                    goto L2c
                L17:
                    r3 = r2
                    r6 = r8
                    r8 = r7
                    r7 = r6
                L1b:
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
                L2c:
                    int r8 = r8 + r3
                    int r8 = r8 + (-3)
                    int r7 = r7 + 1
                    r3 = r4
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setRepeatingBurstRequests.e(short, int, int, java.lang.Object[]):void");
            }

            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i = 2 % 2;
                int i2 = b + 91;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    getOpeningBlocker.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (Boolean) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                getOpeningBlocker.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (Boolean) obj);
                int i3 = b + 67;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
            }

            /* JADX WARN: Code duplicated, block: B:44:0x01e6  */
            /* JADX WARN: Code duplicated, block: B:45:0x01e7  */
            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                Object obj;
                Throwable cause;
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                int i3 = $10 + 25;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 / 4;
                }
                while (true) {
                    obj = null;
                    if (getrealtimecapturelatency.b >= cArr.length) {
                        break;
                    }
                    int i5 = $11 + 39;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = getrealtimecapturelatency.b;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getTapTimeout() >> 16)), Drawable.resolveOpacity(0, 0) + 2624, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() + TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9053247990562531611L;
                            Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.getTrimmedLength("")), View.MeasureSpec.getSize(0) + 481, TextUtils.indexOf("", "") + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            cause = th.getCause();
                            if (cause != null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i7 = getrealtimecapturelatency.b;
                        Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19473 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 2624 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - View.getDefaultSize(0, 0)), 481 - View.getDefaultSize(0, 0), 36 - TextUtils.lastIndexOf("", '0', 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 39422), (-16776735) - Color.rgb(0, 0, 0), 37 - (ViewConfiguration.getEdgeSlop() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr2);
                int i8 = $11 + 47;
                $10 = i8 % 128;
                if (i8 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
                int i3 = 2;
                int i4 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i5 = $11 + 61;
                    $10 = i5 % 128;
                    if (i5 % i3 != 0) {
                        int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), ExpandableListView.getPackedPositionGroup(0L) + 2187, TextUtils.indexOf("", "", 0, 0) + 40, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - TextUtils.indexOf("", "")), 3012 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 321985076, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.getDefaultSize(0, 0) + 36505), KeyEvent.normalizeMetaState(0) + 3376, TextUtils.indexOf((CharSequence) "", '0', 0) + 18, -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 2186 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getScrollBarSize() >> 8) + 40, 841711447, false, $$g(b8, b9, b9), new Class[]{Integer.TYPE});
                            }
                            try {
                                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    byte b10 = (byte) 0;
                                    byte b11 = b10;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 33017), 3010 - MotionEvent.axisFromString(""), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27, 321985076, false, $$g(b10, b11, (byte) (b11 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                }
                                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    byte b12 = (byte) 0;
                                    byte b13 = b12;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 36505), 3376 - View.MeasureSpec.getMode(0), View.MeasureSpec.getMode(0) + 17, -968507904, false, $$g(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    i3 = 2;
                }
                char[] cArr = new char[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i8 = $11 + 55;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - (Process.myPid() >> 22)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3375, 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -968507904, false, $$g(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                }
                objArr[0] = new String(cArr);
            }

            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 260331. Try increasing type updates limit count.
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                */
            public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r61, java.lang.String[] r62, int r63, int r64, int r65) {
                /*
                    Method dump skipped, instruction units count: 26033
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setRepeatingBurstRequests.TuitionPaymentFragmentbindingInflater1(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
            }

            static {
                char[] cArr = new char[544];
                ByteBuffer.wrap("\u009am bîy4jr9¸}Æv\ftJ\t\u0090oÞ@äE\"Phq¶Jü]:!@&\u008e=\u0080ïºàôû.èh»¢äÜé\u0016ðPÉ\u008a\u008fÄéþÈ8ÁrÔ±î\u008bùÅú\u001fôYã\u0093åíÑ'Õaõ»ü±Ý\u008böÅð\u001fâYã\u0093áíà'ËaÙ»ÁõçÏÄ\tÃCÚ\u009dÁ±ö\u008bùÅâ\u001fñY¢\u0093ûíá'ãaÉ»ÊõÝÏÄ\tÕC\u0086\u009dï×Å\u0011¥k\u008b¥ ÿ¿9¾s\u00ad±ï\u008býÅà\u001fÄYå\u0093åíá±û\u008býÅà\u001fÄYå\u0093åíá±ö\u008bùÅâ\u001fñY¢\u0093ûíá'ãaÉ»ÊõÝÏÄ\tÕC\u0086\u009d××Ð\u0011¹k»¥úÿ\u00959\u008fs\u008fM¡\u0087®Á¬\u001b\u0099U\u0086¯\u0091é\u0081#\u008d}\u0090·\u0085ñnËK\u0005d_u\u0099o±û\u008býÅà\u001fÓYé\u0093úíð'éaÚ»Ñõ×ÏÑ\tØCÍ\u009dç×È\u0011½k±¥º±ö\u008bùÅâ\u001fñY¢\u0093ûíá'ãaÉ»ÊõÝÏÄ\tÕC\u0086\u009dÇ×Å\u0011®k¬¥úÿ\u00939©sºM°\u0087©Á\u009a\u001b\u0091U\u0097¯\u0091é\u0098#\u008dò¥È£\u0086¾\\\u008b\u001a¼Ðµ®µdº\"\u0087ø\u0082Ãhùs·bm{+\u007fác\u009fpUk\u0013MÉS\u0087@½[{X1\\ïP¥Wc \u00193×#\u008d;K8\u0001#?0õ2±ö\u008bùÅâ\u001fñY¢\u0093æíí'ïa\u0092»úõÍÏÄ\tÉCê\u009dÑ×Æ\u0011ºk½¥¦±ë\u008bêÅõ\u001fà7\u0016\r\u0017C\u001f\u0099\u001fß\u001e±ö\u008bùÅâ\u001fñY¢\u0093äíå'îaÛ»\u0096õøÏß\tÂCÏu±Oº\u0001¼Û®\u009d¯W\u00ad)¬ãâ¥\u0093\u007f\u009b1\u0096\u000b\u0088Í\u0085\u0087\u008aY\u009c\u0013ÂÕà¯ùa¶;Ïýé·ã\u0089æCí\u0005ÄßÁ\u0091ÊkÙ±è\u008b÷ÅÖ\u001féYø\u0093ííÅ'òaÎ»ÙõÍâcØh\u0096nL|\n}À\u007f¾~t02AèI¦D\u009cZZW\u0010XÎN\u0084\u0010B\u00018)ö$¬:j7 .\u001e.IÙsß=Âçâ¡ÏkÉ\u0015ÍßÃ\u0099ùCÿ\rØ7óñã»ï\u0088\u0015²\u0013ü\u000e&.`\u0003ª\u0005Ô\u0001\u001e\u000fX5\u00823Ì\u0017ö?0,z'¤-î+(@Ãúùõ·îmý+®áè\u009féUâ\u0013×É\u009a\u0087Ê½Ù{Æ1ÈïÍ¥Ïc¤\u0019ú×\u0095\u008d¹K´\u0001¬?§õ¨\u001fT%AkZ±Z÷S=LC]±¸\u0082Ð¸¨±õ\u008bëÅÚ\u001fñYø\u0093áíò'å±û\u008býÅà\u001fÂYé\u0093üíñ'òaÒ»ìõÍÏÀ\tÉ±û\u008býÅà\u001fÀYí\u0093úíå'íaÙ»ÌõÑÏÂ\tøCÑ\u009dÔ×Å\u0011¯±ý\u008böÅð\u001fâYã\u0093áíà'®aß»×õÚÏÄ\tÉCÆ\u009dÐ×\u008e\u0011¬kµ¥úÿ\u00809\u00ads«M¯\u0087¡Á\u009b\u001b\u009dU¹¯\u0091é\u0082#\u0089}\u0083·\u0085ñn¼7\u0086:ÈGláVê\u0018ìÂþ\u0084ÿNý0üú²¼ÃfË(Æ\u0012ØÔÕ\u009eÚ@Ì\n\u0092Ì°¶©xæ\"\u009cä±®·\u0090³Z½\u001c\u0087Æ\u0081\u0088¡r\u00824\u0096þ\u009b±ö\u008bùÅâ\u001fñY¢\u0093ûíá'ãaÉ»ÊõÝÏÄ\tÕC\u0086\u009dé×Å\u0011¯k«¥µÿ·9©s\u008cM\u00ad\u0087§Á\u0099\u001b\u008bU\u0080¥Ô\u009fûÑà\u000bó\u001b\u0087!\u0081o\u0096µ\u0095ó\u00939°G\u009b\u008d\u008aË´\u0011¸_\u008be©£¦é 7ª\u001e=±û\u008býÅà\u001fÝYé\u0093ûí÷'áaÛ»Ý".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 544);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1648135851404981352L;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -7663146031709639692L;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(short r6, int r7, short r8) {
                /*
                    int r7 = r7 * 3
                    int r7 = 4 - r7
                    int r6 = r6 * 3
                    int r0 = r6 + 1
                    int r8 = r8 * 3
                    int r8 = r8 + 109
                    byte[] r1 = defpackage.setRepeatingBurstRequests.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L17
                    r3 = r8
                    r4 = r2
                    r8 = r7
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    if (r3 != r6) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L23:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r7 = r7 + r3
                    int r8 = r8 + 1
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setRepeatingBurstRequests.$$g(short, int, short):java.lang.String");
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.d = activityResultLauncherRegisterForActivityResult;
        this.a = LazyKt.lazy(new Function0() { // from class: SynchronizedCaptureSessionOpener
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getOpeningBlocker.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentScholarBenefitStep3Binding> d() {
        return ScholarBenefitStep3Fragment$bindingInflater$1.b;
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        FragmentScholarBenefitStep3Binding fragmentScholarBenefitStep3BindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentScholarBenefitStep3BindingINotificationSideChannelStub.fragScholarKindLay;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        TextInputLayout textInputLayout2 = fragmentScholarBenefitStep3BindingINotificationSideChannelStub.fragScholarEduLay;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
        TextInputLayout textInputLayout3 = fragmentScholarBenefitStep3BindingINotificationSideChannelStub.fragScholarYearLay;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout4 = fragmentScholarBenefitStep3BindingINotificationSideChannelStub.fragScholarLevelLay;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout5 = fragmentScholarBenefitStep3BindingINotificationSideChannelStub.fragScholarInstitutionLay;
        Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout5, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        TextInputLayout textInputLayout6 = fragmentScholarBenefitStep3BindingINotificationSideChannelStub.fragScholarAmountLay;
        Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
        String string6 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout6, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string6))));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final ArrayList<CodeNamePair> arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        CodeNamePair codeNamePair;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
        final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = (generateUltraHdrSupportedCombinationList) ((ScholarBenefitActivity) fragmentActivityRequireActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        String str = (value == null || (codeNamePair = value.getExtras) == null) ? null : codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str == null) {
            str = "";
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        String string = StringsKt.trim((CharSequence) upperCase).toString();
        int iHashCode = string.hashCode();
        if (iHashCode != -2066945330) {
            if (iHashCode != 2641) {
                if (iHashCode != 2679) {
                    if (iHashCode != 82215) {
                        if (iHashCode == 82230 && string.equals("SMP")) {
                            isTorchResetRequired istorchresetrequired = isTorchResetRequired.INSTANCE;
                            arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isTorchResetRequired.TuitionPaymentFragmentbindingInflater1();
                        } else {
                            arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList<>();
                        }
                    } else if (string.equals("SMA")) {
                        isTorchResetRequired istorchresetrequired2 = isTorchResetRequired.INSTANCE;
                        arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isTorchResetRequired.b();
                    } else {
                        arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList<>();
                    }
                } else if (string.equals("TK")) {
                    isTorchResetRequired istorchresetrequired3 = isTorchResetRequired.INSTANCE;
                    arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isTorchResetRequired.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                } else {
                    arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList<>();
                }
            } else if (string.equals("SD")) {
                isTorchResetRequired istorchresetrequired4 = isTorchResetRequired.INSTANCE;
                arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isTorchResetRequired.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else {
                arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList<>();
            }
        } else if (string.equals("KULIAH")) {
            isTorchResetRequired istorchresetrequired5 = isTorchResetRequired.INSTANCE;
            arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isTorchResetRequired.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } else {
            arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList<>();
        }
        EditText editText = INotificationSideChannelStub().fragScholarLevelNewLay.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: holdDeferrableSurfaces
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    getOpeningBlocker.b(generateultrahdrsupportedcombinationlist, arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault2, this, view);
                }
            });
        }
        INotificationSideChannelStub().fragScholarSn.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: SynchronizedCaptureSessionBaseImpl
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                getOpeningBlocker.TuitionPaymentFragmentspecialinlinedviewModeldefault2(generateultrahdrsupportedcombinationlist, radioGroup, i);
            }
        });
        MaterialButton materialButton = INotificationSideChannelStub().fragScholarStep3Next;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: lambdaopenCaptureSession0androidxcameracamera2internalSynchronizedCaptureSessionBaseImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getOpeningBlocker.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, generateultrahdrsupportedcombinationlist, (View) obj);
            }
        }));
    }

    public static final class b implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        private static final byte[] $$a = {118, 35, -100, -35};
        private static final int $$b = 55;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int asBinder = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {60119, 60107, 60078, 60041, 60088, 60123, 60048, 60110, 60098, 60061, 60067, 60050, 60058, 60052, 60043, 60062, 60090, 60054, 60072, 60046, 60035, 60086, 60056, 60060, 60082, 60085, 60063, 60117, 60053, 60102, 60047, 60075, 60084, 60095, 60057, 60040};
        private static char b = 57191;
        private static char[] TuitionPaymentFragmentbindingInflater1 = {59665, 59725, 59720, 59684, 59707, 59705, 59741, 59736, 59712, 59749, 59775, 59744, 59724, 59736, 59773, 59749, 59750, 59768, 59751, 59759, 59751, 59739, 59736, 59751, 59744, 59744, 59758, 59744, 59757, 59747, 59751, 59757, 59747, 59744, 59750, 59754, 59723, 59707, 59704, 59749, 59744, 59752, 59743, 59705, 59721, 59757, 59751, 59771, 59744, 59746, 59740, 59700, 59726, 59715, 59708, 59715, 59757, 59751, 59771, 59744, 59746, 59740, 59700, 59725, 59702, 59700, 59743, 59714, 59723, 59725, 59806, 59796, 59823, 59816, 59818, 59816, 59807, 59795, 59820, 59820, 59811, 59816, 59810, 59707, 59758, 59770, 59774, 59771, 59770, 59744, 59753, 59736, 59742, 59751, 59745, 59753, 59757, 59756, 59756, 59749, 59768, 59744, 59743, 59699, 59738, 59768, 59744, 59759, 59715, 59736, 59773, 59749, 59750, 59768, 59751, 59759, 59751, 59739, 59724, 59744, 59720, 59789, 59777, 59778, 59783, 59806, 59801, 59766, 59787, 59781, 59779, 59723, 59767, 59765, 59784, 59764, 59762, 59735, 59728, 59767, 59786, 59791, 59764, 59767, 59791, 59759, 59753, 59786, 59755, 59736, 59770, 59760, 59766, 59761, 59766, 59788, 59789, 59765, 59773, 59708, 59770, 59773, 59750, 59746, 59769, 59730, 59736, 59751, 59773, 59734, 59713, 59799, 59793, 59801, 59805, 59804, 59804, 59797, 59816, 59792, 59791, 59749, 59759, 59753, 59773, 59768, 59786, 59816, 59792, 59807, 59763, 59784, 59821, 59797, 59798, 59816, 59799, 59807, 59799, 59787, 59772, 59792, 59792, 59806, 59698, 59750, 59744, 59747, 59757, 59751, 59747, 59757, 59746, 59757, 59751, 59752, 59759, 59744, 59757, 59756, 59759, 59744, 59757, 59725, 59705, 59707, 59723};

        private static void c(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
            char[] cArr;
            int length;
            char[] cArr2;
            int i = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i2 = 0;
            int i3 = iArr[0];
            byte b2 = 1;
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
            if (cArr3 != null) {
                int i7 = $10 + 123;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i2] = Integer.valueOf(cArr3[i8]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) i2;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1270 - View.resolveSizeAndState(i2, i2, i2), (ViewConfiguration.getScrollBarSize() >> 8) + 18, 407021364, false, $$c(b3, b4, (byte) (b4 | 16)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i8++;
                        i2 = 0;
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
            char[] cArr4 = new char[i4];
            System.arraycopy(cArr3, i3, cArr4, 0, i4);
            if (bArr != null) {
                char[] cArr5 = new char[i4];
                setvideostabilizationmode.b = 0;
                char c = 0;
                while (setvideostabilizationmode.b < i4) {
                    int i9 = $10 + 109;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    if (bArr[setvideostabilizationmode.b] == b2) {
                        int i11 = setvideostabilizationmode.b;
                        char c2 = cArr4[setvideostabilizationmode.b];
                        Object[] objArr3 = new Object[2];
                        objArr3[b2] = Integer.valueOf(c);
                        objArr3[0] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.keyCodeFromString(""), Color.rgb(0, 0, 0) + 16780441, (KeyEvent.getMaxKeyCode() >> 16) + 13, 2133916302, false, $$c(b5, b6, (byte) (b6 | 17)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } else {
                        int i12 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944), Drawable.resolveOpacity(0, 0) + 1755, 23 - (ViewConfiguration.getEdgeSlop() >> 16), 387247676, false, $$c(b7, b8, (byte) (b8 | 15)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    }
                    c = cArr5[setvideostabilizationmode.b];
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 41241), 1705 - KeyEvent.keyCodeFromString(""), 21 - Color.blue(0), -1434471773, false, $$c(b9, b10, (byte) (b10 | 11)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i13 = $10 + 11;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    b2 = 1;
                }
                cArr4 = cArr5;
            }
            if (i6 > 0) {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr4, 0, cArr6, 0, i4);
                int i15 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr4, i15, i6);
                System.arraycopy(cArr6, i6, cArr4, 0, i15);
            }
            if (z) {
                int i16 = $10 + 35;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    cArr = new char[i4];
                    setvideostabilizationmode.b = 0;
                } else {
                    cArr = new char[i4];
                    setvideostabilizationmode.b = 0;
                }
                while (setvideostabilizationmode.b < i4) {
                    cArr[setvideostabilizationmode.b] = cArr4[(i4 - setvideostabilizationmode.b) - 1];
                    setvideostabilizationmode.b++;
                }
                cArr4 = cArr;
            }
            if (i5 > 0) {
                int i17 = $10 + 95;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                int i19 = 0;
                loop3: while (true) {
                    setvideostabilizationmode.b = i19;
                    while (true) {
                        if (setvideostabilizationmode.b >= i4) {
                            break loop3;
                        }
                        int i20 = $10 + 19;
                        $11 = i20 % 128;
                        if (i20 % 2 == 0) {
                            cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] << iArr[5]);
                            setvideostabilizationmode.b--;
                        }
                    }
                    cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                    i19 = setvideostabilizationmode.b + 1;
                }
            }
            objArr[0] = new String(cArr4);
        }

        private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2;
            int i4 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i5 = 1770390596;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 27;
                    $10 = i7 % 128;
                    int i8 = i7 % i3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), (Process.myPid() >> 22) + 2267, Color.argb(0, 0, 0, 0) + 33, -1927765101, false, $$c(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i6++;
                        i3 = 2;
                        i5 = 1770390596;
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
            Object[] objArr3 = {Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), MotionEvent.axisFromString("") + 2268, 33 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1927765101, false, $$c(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AndroidCharacter.getMirror('0') + 49219), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3260, 30 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -127612708, false, $$c(b7, b8, (byte) (b8 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            int i9 = $11 + 79;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getSize(0) + 22878), View.combineMeasuredStates(0, 0) + 594, 17 - View.getDefaultSize(0, 0), 1570859318, false, $$c(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i12 = $11 + 81;
                                $10 = i12 % 128;
                                int i13 = i12 % 2;
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
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            int i18 = $10 + 15;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (i20 < i) {
                int i21 = $11 + 61;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr4[i20] = (char) (cArr4[i20] ^ 28551);
                    i20 += 72;
                } else {
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                    i20++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        b() {
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = 2 % 2;
            Intent intent = new Intent(getOpeningBlocker.this.requireActivity(), (Class<?>) MainActivity.class);
            intent.setFlags(335544320);
            getOpeningBlocker.this.startActivity(intent);
            getOpeningBlocker.this.requireActivity().finish();
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:207:0x086a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x0823  */
        /* JADX WARN: Code duplicated, block: B:92:0x086b A[Catch: all -> 0x0a67, LOOP:0: B:43:0x054d->B:92:0x086b, LOOP_END, TryCatch #6 {all -> 0x0a67, blocks: (B:38:0x040a, B:40:0x0481, B:42:0x04f7, B:45:0x0550, B:55:0x05f2, B:57:0x0649, B:62:0x069e, B:78:0x07cf, B:98:0x088b, B:101:0x08a9, B:106:0x08d0, B:107:0x090f, B:102:0x08b7, B:89:0x0864, B:92:0x086b, B:94:0x0883, B:96:0x0889, B:97:0x088a, B:85:0x081d, B:88:0x0825), top: B:191:0x040a, inners: #2 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v125 */
        /* JADX WARN: Type inference failed for: r0v134 */
        /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r0v29 */
        /* JADX WARN: Type inference failed for: r1v14, types: [int] */
        /* JADX WARN: Type inference failed for: r25v1 */
        /* JADX WARN: Type inference failed for: r5v113, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v104, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v136, types: [int[]] */
        /* JADX WARN: Type inference failed for: r6v138 */
        /* JADX WARN: Type inference failed for: r6v139 */
        /* JADX WARN: Type inference failed for: r6v140 */
        /* JADX WARN: Type inference failed for: r6v141 */
        /* JADX WARN: Type inference failed for: r6v142 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3, types: [int] */
        /* JADX WARN: Type inference failed for: r6v30, types: [int] */
        /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Class[]] */
        /* JADX WARN: Type inference failed for: r6v37 */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v83 */
        /* JADX WARN: Type inference failed for: r6v84, types: [java.lang.Object] */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2) {
            int i3;
            ?? r6;
            int i4;
            int i5;
            Object[] objArr;
            Method method;
            Object objInvoke;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i18;
            int i19;
            Class<?> cls;
            Object[] objArr2;
            int i20 = 2 % 2;
            int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ?? r7 = 1;
            r7 = 1;
            r7 = 1;
            r7 = 1;
            int i22 = ((i21 | 57) << 1) - (i21 ^ 57);
            asBinder = i22 % 128;
            int i23 = i22 % 2;
            if (context != null) {
                try {
                    char[] cArr = {1, 28, 28, 17, 29, 27, 1, 15, '\b', 29, 3, '#', 16, '!', 20, 18, 2, 30, 28, 17, 29, 27, 1, 15, '\b', 29, 1, 5, 26, 5, 13770};
                    int i24 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b2 = (byte) (((i24 | 1) << 1) - (i24 ^ 1));
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                    int i25 = (iNormalizeMetaState * 193) + 5983;
                    int i26 = ~i;
                    int i27 = ~iNormalizeMetaState;
                    int i28 = ~(i27 | 31);
                    int i29 = -(-(((i26 ^ i28) | (i28 & i26)) * (-192)));
                    int i30 = (i25 ^ i29) + ((i25 & i29) << 1);
                    int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i32 = (i31 & 51) + (i31 | 51);
                    asBinder = i32 % 128;
                    int i33 = i32 % 2;
                    int i34 = (i30 - (~(-(-((-384) * ((~((i27 ^ (-32)) | (i27 & (-32)))) | (~(((-32) ^ i26) | ((-32) & i26))))))))) - 1;
                    int i35 = ~iNormalizeMetaState;
                    int i36 = (i35 & (-32)) | (i35 ^ (-32));
                    int i37 = ((-32) & i26) | ((-32) ^ i26);
                    int i38 = (~((i36 & i) | (i36 ^ i))) | (~((i37 & iNormalizeMetaState) | (i37 ^ iNormalizeMetaState)));
                    int i39 = ~((iNormalizeMetaState & 31) | (iNormalizeMetaState ^ 31) | i);
                    int i40 = i34 + (((i39 & i38) | (i38 ^ i39)) * DerHeader.TAG_CLASS_PRIVATE);
                    Object[] objArr3 = new Object[1];
                    a(cArr, b2, i40, objArr3);
                    try {
                        try {
                            Object[] objArr4 = {(String) objArr3[0]};
                            Object[] objArr5 = new Object[1];
                            c(new byte[]{1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0}, new int[]{0, 38, 0, 27}, true, objArr5);
                            Object objNewInstance = Class.forName((String) objArr5[0]).getDeclaredConstructor(String.class).newInstance(objArr4);
                            Object[] objArr6 = new Object[1];
                            c(new byte[]{1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0}, new int[]{38, 31, 0, 0}, true, objArr6);
                            try {
                                Object[] objArr7 = {(String) objArr6[0]};
                                Object[] objArr8 = new Object[1];
                                c(new byte[]{1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0}, new int[]{0, 38, 0, 27}, true, objArr8);
                                String str = (String) objArr8[0];
                                int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i42 = (i41 ^ 107) + ((i41 & 107) << 1);
                                asBinder = i42 % 128;
                                int i43 = i42 % 2;
                                Object objNewInstance2 = Class.forName(str).getDeclaredConstructor(String.class).newInstance(objArr7);
                                int i44 = asBinder + 59;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i44 % 128;
                                int i45 = i44 % 2;
                                try {
                                    char[] cArr2 = {16, 24, 27, 2, 17, 7, 27, 28, 19, 16, 24, Typography.quote, 16, 27, '!', 24, 1, 16, 24, Typography.quote, 14, 21, 13885};
                                    int i46 = -AndroidCharacter.getMirror('0');
                                    int i47 = i46 * (-716);
                                    int i48 = asBinder;
                                    int i49 = (i48 ^ 53) + ((i48 & 53) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i49 % 128;
                                    if (i49 % 2 != 0) {
                                        int i50 = ~i46;
                                        int i51 = -(-((i50 & 127) | (i50 ^ 127)));
                                        i4 = (i47 - 182245) << (((i51 | (-1434)) << 1) - (i51 ^ (-1434)));
                                        int i52 = ~i;
                                        i5 = (~((i52 & 127) | (i52 ^ 127))) | (~((i46 ^ 127) | (i46 & 127)));
                                    } else {
                                        int i53 = i47 - (-182245);
                                        int i54 = -(-(((~i46) | 127) * (-1434)));
                                        i4 = (i54 | i53) + (i53 & i54);
                                        int i55 = ~(i26 | 127);
                                        int i56 = ~((i46 ^ 127) | (i46 & 127));
                                        i5 = (i55 ^ i56) | (i55 & i56);
                                    }
                                    int i57 = ~i46;
                                    int i58 = ~((i57 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i57 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | i);
                                    int i59 = 717 * ((i5 ^ i58) | (i5 & i58));
                                    int i60 = ((i4 | i59) << 1) - (i4 ^ i59);
                                    int i61 = (i57 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i57 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                    int i62 = ~i;
                                    int i63 = ~((i61 & i62) | (i61 ^ i62));
                                    int i64 = ~((i46 ^ 127) | (i46 & 127));
                                    int i65 = (i63 & i64) | (i63 ^ i64);
                                    int i66 = ~((i ^ 127) | (i & 127));
                                    int i67 = ((i65 & i66) | (i65 ^ i66)) * 717;
                                    byte b3 = (byte) (((i60 | i67) << 1) - (i67 ^ i60));
                                    int i68 = -Drawable.resolveOpacity(0, 0);
                                    int i69 = (i68 ^ 23) + ((i68 & 23) << 1);
                                    Object[] objArr9 = new Object[1];
                                    a(cArr2, b3, i69, objArr9);
                                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                                    char[] cArr3 = {21, 17, 31, ' ', 16, 18, '\f', 18, 21, 17, 18, 15, 24, 16, 21, 17, 13909};
                                    byte b4 = (byte) (108 - (~TextUtils.getTrimmedLength("")));
                                    int i70 = -ImageFormat.getBitsPerPixel(0);
                                    int i71 = (i70 * 765) - 24432;
                                    int i72 = ~((i62 ^ i70) | (i62 & i70));
                                    int i73 = ((i72 ^ 16) | (i72 & 16)) * 764;
                                    int i74 = (i71 & i73) + (i73 | i71);
                                    int i75 = ~i70;
                                    int i76 = ~((i75 & 16) | (i75 ^ 16));
                                    int i77 = ~((i62 ^ 16) | (i62 & 16));
                                    int i78 = -(-(((i76 ^ i77) | (i76 & i77)) * (-1528)));
                                    int i79 = (i74 ^ i78) + ((i74 & i78) << 1);
                                    int i80 = ~i70;
                                    int i81 = ~((i80 ^ 16) | (i80 & 16));
                                    int i82 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                                    asBinder = i82 % 128;
                                    int i83 = i82 % 2;
                                    int i84 = ~(((-17) ^ i70) | ((-17) & i70));
                                    try {
                                        if (i83 == 0) {
                                            int i85 = i84 | i81;
                                            int i86 = ~(i62 | i70);
                                            int i87 = (i79 - (~(-(763 - (~(-((i85 & i86) | (i85 ^ i86)))))))) - 1;
                                            Object[] objArr10 = new Object[1];
                                            a(cArr3, b4, i87, objArr10);
                                            objArr = null;
                                            method = cls2.getMethod((String) objArr10[0], null);
                                        } else {
                                            int i88 = (i84 & i81) | (i81 ^ i84);
                                            int i89 = ~((i26 ^ i70) | (i26 & i70));
                                            int i90 = i79 + (((i88 & i89) | (i88 ^ i89)) * 764);
                                            Object[] objArr11 = new Object[1];
                                            a(cArr3, b4, i90, objArr11);
                                            objArr = null;
                                            method = cls2.getMethod((String) objArr11[0], null);
                                        }
                                        Object objInvoke2 = method.invoke(context, objArr);
                                        int i91 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        r7 = 17;
                                        int i92 = ((i91 | 17) << 1) - (i91 ^ 17);
                                        asBinder = i92 % 128;
                                        int i93 = i92 % 2;
                                        try {
                                            char[] cArr4 = {16, 24, 27, 2, 17, 7, 27, 28, 19, 16, 24, Typography.quote, 16, 27, '!', 24, 1, 16, 24, Typography.quote, 14, 21, 13885};
                                            int i94 = -(-Gravity.getAbsoluteGravity(0, 0));
                                            int iAlpha = Color.alpha(0);
                                            int i95 = (iAlpha * 567) - 12995;
                                            int i96 = ~iAlpha;
                                            int i97 = ~((i96 ^ 23) | (i96 & 23));
                                            int i98 = ~((i96 ^ i) | (i96 & i));
                                            int i99 = -(-(((i97 & i98) | (i97 ^ i98)) * (-566)));
                                            int i100 = (((i95 | i99) << 1) - (i95 ^ i99)) + ((~(((-24) & iAlpha) | ((-24) ^ iAlpha))) * 566);
                                            int i101 = (i96 ^ (-24)) | (i96 & (-24));
                                            Object[] objArr12 = new Object[1];
                                            a(cArr4, (byte) ((i94 & 79) + (i94 | 79)), (i100 - (~(-(-((~((i101 & i) | (i101 ^ i))) * 566))))) - 1, objArr12);
                                            Class<?> cls3 = Class.forName((String) objArr12[0]);
                                            int i102 = -ExpandableListView.getPackedPositionGroup(0L);
                                            Object[] objArr13 = new Object[1];
                                            a(new char[]{21, 17, 31, ' ', 16, 18, '\f', 18, 21, 17, 24, '\r', '\f', 16}, (byte) ((i102 & 19) + (i102 | 19)), 14 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), objArr13);
                                            Method method2 = cls3.getMethod((String) objArr13[0], null);
                                            int i103 = asBinder + 123;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i103 % 128;
                                            r7 = i103 % 2;
                                            if (r7 != 0) {
                                                objInvoke = method2.invoke(context, null);
                                                i6 = 97;
                                            } else {
                                                objInvoke = method2.invoke(context, null);
                                                i6 = 64;
                                            }
                                            try {
                                                Object[] objArr14 = {objInvoke, Integer.valueOf(i6)};
                                                char[] cArr5 = {16, 24, 27, 2, 17, 7, 27, 28, 19, 16, 24, Typography.quote, 16, 27, '!', 24, 15, '\f', 25, '!', 16, 18, '\f', 18, 21, 17, 18, 15, 24, 16, 21, 17, 13856};
                                                int i104 = -TextUtils.lastIndexOf("", '0', 0);
                                                int iMyTid = Process.myTid() >> 22;
                                                int i105 = iMyTid * 765;
                                                int i106 = (i105 ^ (-50391)) + ((i105 & (-50391)) << 1);
                                                int i107 = ~FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                int i108 = ~(i107 | iMyTid);
                                                int i109 = (i106 - (~(-(-(((i108 & 33) | (i108 ^ 33)) * 764))))) - 1;
                                                int i110 = ~iMyTid;
                                                int i111 = ~((i110 & 33) | (i110 ^ 33));
                                                int i112 = ~((i107 ^ 33) | (i107 & 33));
                                                int i113 = i109 + (((i111 ^ i112) | (i111 & i112)) * (-1528));
                                                int i114 = ~iMyTid;
                                                int i115 = ~((33 & i114) | (i114 ^ 33));
                                                int i116 = ~(((-34) & iMyTid) | ((-34) ^ iMyTid));
                                                int i117 = (i115 & i116) | (i115 ^ i116);
                                                int i118 = ~((iMyTid & i107) | (i107 ^ iMyTid));
                                                int i119 = ((i117 & i118) | (i117 ^ i118)) * 764;
                                                int i120 = ((i113 | i119) << 1) - (i113 ^ i119);
                                                Object[] objArr15 = new Object[1];
                                                a(cArr5, (byte) ((i104 & 55) + (i104 | 55)), i120, objArr15);
                                                ?? cls4 = Class.forName((String) objArr15[0]);
                                                Object[] objArr16 = new Object[1];
                                                c(new byte[]{1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1}, new int[]{69, 14, 61, 11}, false, objArr16);
                                                String str2 = (String) objArr16[0];
                                                r7 = new Class[]{String.class, Integer.TYPE};
                                                Object objInvoke3 = cls4.getMethod(str2, r7).invoke(objInvoke2, objArr14);
                                                try {
                                                    char[] cArr6 = {16, 24, 27, 2, 17, 7, 27, 28, 19, 16, 24, Typography.quote, 16, 27, '!', 24, 15, '\f', 25, '!', 16, 18, '\f', 18, 21, 17, 25, 29, 7, 15};
                                                    byte b5 = (byte) (7 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))));
                                                    int i121 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                    int i122 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                    int i123 = (i122 & 17) + (i122 | 17);
                                                    asBinder = i123 % 128;
                                                    int i124 = i123 % 2;
                                                    int i125 = i121 * (-496);
                                                    int i126 = (i125 & (-14880)) + (i125 | (-14880));
                                                    int i127 = ~i121;
                                                    int i128 = i126 + ((~(i127 | (-31))) * 497);
                                                    int i129 = ~i121;
                                                    int i130 = (i129 ^ (-31)) | (i129 & (-31));
                                                    int i131 = (-31) | i26;
                                                    int i132 = ((~((i130 & i) | (i130 ^ i))) | (~((i131 ^ i121) | (i131 & i121)))) * 497;
                                                    int i133 = ((i128 | i132) << 1) - (i128 ^ i132);
                                                    int i134 = ~((i127 & i62) | (i127 ^ i62));
                                                    int i135 = ~((i129 ^ 30) | (i129 & 30));
                                                    int i136 = (i134 & i135) | (i134 ^ i135);
                                                    int i137 = (i121 & (-31)) | ((-31) ^ i121);
                                                    int i138 = ~((i137 & i) | (i137 ^ i));
                                                    int i139 = (i133 - (~(-(-(((i138 & i136) | (i136 ^ i138)) * 497))))) - 1;
                                                    Object[] objArr17 = new Object[1];
                                                    a(cArr6, b5, i139, objArr17);
                                                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                                                    char[] cArr7 = {5, 17, 22, 29, 18, 0, 21, 1, 17, '!'};
                                                    int iAxisFromString = MotionEvent.axisFromString("");
                                                    int i140 = iAxisFromString * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                                                    int i141 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                    int i142 = (i141 & 73) + (i141 | 73);
                                                    asBinder = i142 % 128;
                                                    int i143 = i142 % 2;
                                                    int i144 = i140 + 27665;
                                                    int i145 = iAxisFromString | 55;
                                                    int i146 = i145 * (-502);
                                                    int i147 = (i144 & i146) + (i144 | i146);
                                                    int i148 = ~iAxisFromString;
                                                    int i149 = ~((i148 ^ (-56)) | (i148 & (-56)));
                                                    int i150 = ~((i148 & i62) | (i148 ^ i62));
                                                    int i151 = (i150 & i149) | (i149 ^ i150);
                                                    int i152 = ~((i145 & i) | (i145 ^ i));
                                                    int i153 = ((i151 & i152) | (i151 ^ i152)) * (-502);
                                                    int i154 = ((i147 | i153) << 1) - (i153 ^ i147);
                                                    int i155 = ~iAxisFromString;
                                                    int i156 = (i155 & i62) | (i155 ^ i62);
                                                    int i157 = (iAxisFromString & 55) | (iAxisFromString ^ 55);
                                                    int i158 = -(-(((~((i157 & i) | (i157 ^ i))) | (~((i156 & 55) | (i156 ^ 55)))) * TypedValues.PositionType.TYPE_DRAWPATH));
                                                    byte b6 = (byte) (((i154 | i158) << 1) - (i158 ^ i154));
                                                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                                                    int i159 = bitsPerPixel * 592;
                                                    int i160 = (i159 ^ (-6490)) + ((i159 & (-6490)) << 1);
                                                    int i161 = ~bitsPerPixel;
                                                    int i162 = (~((i161 ^ 11) | (i161 & 11))) * (-1182);
                                                    int i163 = (i160 ^ i162) + ((i160 & i162) << 1);
                                                    int i164 = (i161 ^ (-12)) | (i161 & (-12));
                                                    int i165 = ~((i164 & i26) | (i164 ^ i26));
                                                    int i166 = ~(bitsPerPixel | 11);
                                                    int i167 = (i163 - (~(((i166 & i165) | (i165 ^ i166)) * (-591)))) - 1;
                                                    int i168 = ((i161 & i) | (i ^ i161) | (-12)) * 591;
                                                    int i169 = ((i167 | i168) << 1) - (i168 ^ i167);
                                                    Object[] objArr18 = new Object[1];
                                                    a(cArr7, b6, i169, objArr18);
                                                    Object[] objArr19 = (Object[]) cls5.getField((String) objArr18[0]).get(objInvoke3);
                                                    int length = objArr19.length;
                                                    int i170 = 0;
                                                    ?? r0 = objArr19;
                                                    while (true) {
                                                        if (i170 < length) {
                                                            r7 = r0[i170];
                                                            char[] cArr8 = {'\t', 28, '\r', 7, 13817};
                                                            int i171 = -(-KeyEvent.getDeadChar(0, 0));
                                                            byte b7 = (byte) ((i171 & 86) + (i171 | 86));
                                                            int i172 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                            int i173 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                            int i174 = (i173 & 71) + (i173 | 71);
                                                            ?? r25 = r0;
                                                            asBinder = i174 % 128;
                                                            int i175 = i174 % 2;
                                                            int i176 = i172 * (-559);
                                                            int i177 = ((i173 | 123) << 1) - (i173 ^ 123);
                                                            int i178 = length;
                                                            asBinder = i177 % 128;
                                                            if (i177 % 2 == 0) {
                                                                i7 = i176 >>> 2244;
                                                                int i179 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                i8 = (-560) >>> (~((i179 & i172) | (i179 ^ i172)));
                                                            } else {
                                                                i7 = i176 + 2244;
                                                                int i180 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                i8 = (~((i180 & i172) | (i180 ^ i172))) * (-560);
                                                            }
                                                            int i181 = -(-i8);
                                                            int i182 = (i7 ^ i181) + ((i7 & i181) << 1);
                                                            int i183 = ((-5) & i172) | ((-5) ^ i172);
                                                            int i184 = (i183 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i183 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                                            int i185 = i173 + 47;
                                                            asBinder = i185 % 128;
                                                            if (i185 % 2 == 0) {
                                                                int i186 = -((-560) >>> (~i184));
                                                                i10 = (i182 & i186) + (i186 | i182);
                                                                i11 = ~i172;
                                                                i12 = i11 ^ 4;
                                                                i9 = 4;
                                                            } else {
                                                                i9 = 4;
                                                                i10 = i182 + ((~i184) * (-560));
                                                                i11 = ~i172;
                                                                i12 = i11 ^ 4;
                                                            }
                                                            int i187 = ~((i11 & i9) | i12);
                                                            int i188 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                            int i189 = ~((i188 & i9) | (i188 ^ 4));
                                                            int i190 = 560 * ((i187 & i189) | (i187 ^ i189));
                                                            int i191 = (i10 ^ i190) + ((i10 & i190) << 1);
                                                            Object[] objArr20 = new Object[1];
                                                            a(cArr8, b7, i191, objArr20);
                                                            try {
                                                                Object[] objArr21 = {(String) objArr20[0]};
                                                                Object[] objArr22 = new Object[1];
                                                                c(new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1}, new int[]{83, 37, 0, 2}, true, objArr22);
                                                                Class<?> cls6 = Class.forName((String) objArr22[0]);
                                                                Object[] objArr23 = new Object[1];
                                                                c(new byte[]{1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0}, new int[]{120, 11, 34, 0}, true, objArr23);
                                                                Object objInvoke4 = cls6.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                                                try {
                                                                    Object[] objArr24 = new Object[1];
                                                                    c(new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0}, new int[]{131, 28, 19, 27}, false, objArr24);
                                                                    Class<?> cls7 = Class.forName((String) objArr24[0]);
                                                                    int i192 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                                    int i193 = (i192 ^ 105) + ((i192 & 105) << 1);
                                                                    asBinder = i193 % 128;
                                                                    int i194 = i193 % 2;
                                                                    Object[] objArr25 = new Object[1];
                                                                    c(new byte[]{1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1}, new int[]{159, 11, 0, 2}, true, objArr25);
                                                                    try {
                                                                        Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr25[0], null).invoke(r7, null))};
                                                                        Object[] objArr27 = new Object[1];
                                                                        c(new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1}, new int[]{83, 37, 0, 2}, true, objArr27);
                                                                        Class<?> cls8 = Class.forName((String) objArr27[0]);
                                                                        char[] cArr9 = {21, 17, 27, 16, 0, 15, '!', '\f', 3, 16, 0, '!', 6, '\n', '\n', 23, 18, 0, 13839};
                                                                        int i195 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                        int i196 = asBinder;
                                                                        int i197 = ((i196 | 69) << 1) - (i196 ^ 69);
                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i197 % 128;
                                                                        if (i197 % 2 != 0) {
                                                                            i13 = ((-515) << i195) >>> 8789;
                                                                            i14 = ~((-18) | i);
                                                                            i15 = i62;
                                                                        } else {
                                                                            i13 = (i195 * (-515)) + 8789;
                                                                            i14 = ~((-18) | i);
                                                                            i15 = i26;
                                                                        }
                                                                        int i198 = i196 + 5;
                                                                        int i199 = i170;
                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i198 % 128;
                                                                        if (i198 % 2 != 0) {
                                                                            int i200 = ~(i15 | i195);
                                                                            int i201 = (i200 & i14) | (i14 ^ i200);
                                                                            int i202 = ~((i62 ^ 17) | (i62 & 17));
                                                                            i16 = i13 >>> ((-516) << ((i201 & i202) | (i201 ^ i202)));
                                                                        } else {
                                                                            int i203 = ~(i15 | i195);
                                                                            int i204 = -(-((-516) * ((i203 & i14) | (i14 ^ i203) | (~((i62 ^ 17) | (i62 & 17))))));
                                                                            i16 = (i204 | i13) + (i13 & i204);
                                                                        }
                                                                        int i205 = ~i195;
                                                                        int i206 = (i205 & (-18)) | (i205 ^ (-18));
                                                                        int i207 = ~((i206 & i) | (i206 ^ i));
                                                                        int i208 = ~i195;
                                                                        int i209 = (i208 ^ i26) | (i208 & i26);
                                                                        int i210 = i16 + (516 * (i207 | (~((i209 & 17) | (i209 ^ 17)))));
                                                                        int i211 = ~((i208 & 17) | (i208 ^ 17));
                                                                        int i212 = ~((i26 ^ 17) | (i26 & 17));
                                                                        Object[] objArr28 = new Object[1];
                                                                        a(cArr9, (byte) (i210 + (((i211 & i212) | (i211 ^ i212)) * 516)), 18 - TextUtils.indexOf((CharSequence) "", '0'), objArr28);
                                                                        r7 = (String) objArr28[0];
                                                                        Object objInvoke5 = cls8.getMethod(r7, InputStream.class).invoke(objInvoke4, objArr26);
                                                                        int i213 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                                                                        asBinder = i213 % 128;
                                                                        if (i213 % 2 == 0) {
                                                                            try {
                                                                                Object[] objArr29 = new Object[1];
                                                                                c(new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, new int[]{170, 34, 48, 0}, false, objArr29);
                                                                                Class<?> cls9 = Class.forName((String) objArr29[0]);
                                                                                r7 = new int[]{204, 23, 0, 8};
                                                                                Object[] objArr30 = new Object[1];
                                                                                c(new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0}, r7, true, objArr30);
                                                                                if (!objNewInstance.equals(cls9.getMethod((String) objArr30[0], null).invoke(objInvoke5, null))) {
                                                                                    try {
                                                                                        Object[] objArr31 = new Object[1];
                                                                                        c(new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, new int[]{170, 34, 48, 0}, true, objArr31);
                                                                                        cls = Class.forName((String) objArr31[0]);
                                                                                        objArr2 = new Object[1];
                                                                                        c(new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0}, new int[]{204, 23, 0, 8}, false, objArr2);
                                                                                        if (objNewInstance2.equals(cls.getMethod((String) objArr2[0], null).invoke(objInvoke5, null))) {
                                                                                            int i214 = ((i199 | 34) << 1) - (i199 ^ 34);
                                                                                            i170 = ((i214 | (-33)) << 1) - (i214 ^ (-33));
                                                                                            length = i178;
                                                                                            r0 = r25;
                                                                                        }
                                                                                    } catch (Throwable th) {
                                                                                        Throwable cause = th.getCause();
                                                                                        if (cause != null) {
                                                                                            throw cause;
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th2) {
                                                                                Throwable cause2 = th2.getCause();
                                                                                if (cause2 != null) {
                                                                                    throw cause2;
                                                                                }
                                                                                throw th2;
                                                                            }
                                                                        } else {
                                                                            Object[] objArr32 = new Object[1];
                                                                            c(new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, new int[]{170, 34, 48, 0}, true, objArr32);
                                                                            Class<?> cls10 = Class.forName((String) objArr32[0]);
                                                                            Object[] objArr33 = new Object[1];
                                                                            c(new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0}, new int[]{204, 23, 0, 8}, false, objArr33);
                                                                            if (!objNewInstance.equals(cls10.getMethod((String) objArr33[0], null).invoke(objInvoke5, null))) {
                                                                                Object[] objArr34 = new Object[1];
                                                                                c(new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1}, new int[]{170, 34, 48, 0}, true, objArr34);
                                                                                cls = Class.forName((String) objArr34[0]);
                                                                                objArr2 = new Object[1];
                                                                                c(new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0}, new int[]{204, 23, 0, 8}, false, objArr2);
                                                                                if (objNewInstance2.equals(cls.getMethod((String) objArr2[0], null).invoke(objInvoke5, null))) {
                                                                                    int i215 = ((i199 | 34) << 1) - (i199 ^ 34);
                                                                                    i170 = ((i215 | (-33)) << 1) - (i215 ^ (-33));
                                                                                    length = i178;
                                                                                    r0 = r25;
                                                                                }
                                                                            }
                                                                        }
                                                                        int i216 = i ^ 1;
                                                                        Object[] objArr35 = new Object[4];
                                                                        int[] iArr = new int[1];
                                                                        objArr35[0] = iArr;
                                                                        objArr35[1] = new int[1];
                                                                        int[] iArr2 = new int[1];
                                                                        objArr35[2] = iArr2;
                                                                        int i217 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                                        int i218 = i217 + 95;
                                                                        asBinder = i218 % 128;
                                                                        if (i218 % 2 == 0) {
                                                                            iArr[1] = i;
                                                                            ((int[]) objArr35[3])[0] = i216;
                                                                        } else {
                                                                            iArr[0] = i;
                                                                            iArr2[0] = i216;
                                                                        }
                                                                        int i219 = ((i217 | 67) << 1) - (i217 ^ 67);
                                                                        asBinder = i219 % 128;
                                                                        if (i219 % 2 == 0) {
                                                                            objArr35[4] = null;
                                                                            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                                                            int i220 = 1291502556 + (((~((-35628585) | iMaxMemory)) | (-4681645)) * (-318));
                                                                            int i221 = ~((-4681645) | iMaxMemory);
                                                                            int i222 = ~iMaxMemory;
                                                                            i17 = i220 + ((i221 | (~(39841708 | i222))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMaxMemory | 39841708)) | (~((-4213125) | i222))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                                                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                                            i18 = (-216) >> i17;
                                                                            i19 = -449;
                                                                        } else {
                                                                            objArr35[3] = null;
                                                                            int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                                                            int i223 = (~((-93975259) | iUptimeMillis)) | 76096218;
                                                                            i17 = 1521273620 + (i223 * 992) + ((i223 | (~((~iUptimeMillis) | (-35785990)))) * (-496)) + ((iUptimeMillis | (-53665030)) * 496);
                                                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                                            i18 = i17 * (-216);
                                                                            i19 = -6928;
                                                                        }
                                                                        int i224 = -(-i18);
                                                                        int i225 = (i19 ^ i224) + ((i224 & i19) << 1);
                                                                        int i226 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                        int i227 = ~((-17) | i226);
                                                                        int i228 = ~i17;
                                                                        int i229 = ~((i228 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i228 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                                                        int i230 = -(-(((i227 & i229) | (i227 ^ i229)) * 217));
                                                                        int i231 = (i225 & i230) + (i230 | i225);
                                                                        int i232 = ~(((-17) ^ i228) | ((-17) & i228));
                                                                        int i233 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & (-17)) | ((-17) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                                                        int i234 = (((i231 - (~(((i233 & i232) | (i232 ^ i233)) * 217))) - 1) - (~(((~((i228 ^ i226) | (i226 & i228))) | 16) * 217))) - 1;
                                                                        int i235 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                                        int i236 = i235 + 15;
                                                                        asBinder = i236 % 128;
                                                                        int i237 = i236 % 2;
                                                                        int i238 = ~i234;
                                                                        int i239 = ((-716) * i234) + (i2 * 1435) + ((i2 | i238) * (-1434));
                                                                        int i240 = ~((i26 ^ i2) | (i26 & i2));
                                                                        int i241 = ~((i234 ^ i2) | (i234 & i2));
                                                                        int i242 = (i235 ^ 19) + ((i235 & 19) << 1);
                                                                        int i243 = i242 % 128;
                                                                        asBinder = i243;
                                                                        int i244 = i242 % 2;
                                                                        int i245 = ~i234;
                                                                        int i246 = ~i2;
                                                                        int i247 = i245 | i246;
                                                                        int i248 = 717 * ((i240 & i241) | (i240 ^ i241) | (~((i247 & i) | (i247 ^ i))));
                                                                        int i249 = (i239 & i248) + (i239 | i248);
                                                                        int i250 = (i238 ^ i246) | (i238 & i246);
                                                                        int i251 = (~((i250 & i26) | (i250 ^ i26))) | i241;
                                                                        int i252 = (i243 ^ 43) + ((i243 & 43) << 1);
                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i252 % 128;
                                                                        if (i252 % 2 != 0) {
                                                                            int i253 = ~(i2 | i);
                                                                            int i254 = i249 << (717 / ((i251 & i253) | (i251 ^ i253)));
                                                                            int i255 = i254 ^ (i254 >> 3);
                                                                            int i256 = i255 + 50;
                                                                            int i257 = (i255 | i256) & (~(i255 & i256));
                                                                            ((int[]) objArr35[0])[1] = i257 ^ (i257 + 3);
                                                                            return objArr35;
                                                                        }
                                                                        int i258 = ~(i2 | i);
                                                                        int i259 = ((i251 & i258) | (i251 ^ i258)) * 717;
                                                                        int i260 = (i249 & i259) + (i259 | i249);
                                                                        int i261 = i260 << 13;
                                                                        int i262 = ((~i260) & i261) | ((~i261) & i260);
                                                                        int i263 = i262 >>> 17;
                                                                        int i264 = ((~i262) & i263) | ((~i263) & i262);
                                                                        int i265 = i264 << 5;
                                                                        ((int[]) objArr35[1])[0] = (i264 | i265) & (~(i264 & i265));
                                                                        return objArr35;
                                                                    } catch (Throwable th3) {
                                                                        Throwable cause3 = th3.getCause();
                                                                        if (cause3 != null) {
                                                                            throw cause3;
                                                                        }
                                                                        throw th3;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    Throwable cause4 = th4.getCause();
                                                                    if (cause4 != null) {
                                                                        throw cause4;
                                                                    }
                                                                    throw th4;
                                                                }
                                                            } catch (Throwable th5) {
                                                                Throwable cause5 = th5.getCause();
                                                                if (cause5 != null) {
                                                                    throw cause5;
                                                                }
                                                                throw th5;
                                                            }
                                                        }
                                                        r7 = i2;
                                                        int i266 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
                                                        asBinder = i266 % 128;
                                                        if (i266 % 2 == 0) {
                                                            i3 = 4;
                                                            int i267 = 4 % 5;
                                                            r6 = r7;
                                                        } else {
                                                            i3 = 4;
                                                            r6 = r7;
                                                        }
                                                    }
                                                } catch (Throwable unused) {
                                                    r7 = i2;
                                                }
                                            } catch (Throwable th6) {
                                                Throwable cause6 = th6.getCause();
                                                if (cause6 != null) {
                                                    throw cause6;
                                                }
                                                throw th6;
                                            }
                                        } catch (Throwable th7) {
                                            Throwable cause7 = th7.getCause();
                                            if (cause7 != null) {
                                                throw cause7;
                                            }
                                            throw th7;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        Throwable cause8 = th.getCause();
                                        if (cause8 != null) {
                                            throw cause8;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                }
                            } catch (Throwable th10) {
                                Throwable cause9 = th10.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th10;
                            }
                        } catch (Throwable unused2) {
                        }
                    } catch (Throwable th11) {
                        Throwable cause10 = th11.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th11;
                    }
                } catch (Throwable unused3) {
                    r7 = i2;
                }
            } else {
                r7 = i2;
                i3 = 4;
                r6 = r7;
            }
            Object[] objArr36 = new Object[i3];
            objArr36[0] = new int[1];
            int i268 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
            int i269 = i268 % 128;
            asBinder = i269;
            if (i268 % 2 == 0) {
                objArr36[0] = new int[1];
                objArr36[4] = new int[0];
            } else {
                objArr36[1] = new int[1];
                objArr36[2] = new int[1];
            }
            ((int[]) objArr36[0])[0] = i;
            ((int[]) objArr36[2])[0] = i;
            int i270 = (i269 ^ 125) + ((i269 & 125) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i270 % 128;
            int i271 = i270 % 2;
            objArr36[3] = null;
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i272 = ~elapsedCpuTime;
            int i273 = 1961362732 + ((elapsedCpuTime | 339755304) * 988) + (((~(382294910 | i272)) | (-384524288)) * (-1976)) + (((~(elapsedCpuTime | 341984681)) | 339755304 | (~((-341984682) | i272))) * 988);
            ?? r1 = ((i273 << 1) - i273) + r6;
            int i274 = r1 << 13;
            int i275 = ((~r1) & i274) | ((~i274) & r1);
            int i276 = i275 ^ (i275 >>> 17);
            int i277 = i276 << 5;
            ((int[]) objArr36[1])[0] = ((~i276) & i277) | ((~i277) & i276);
            return objArr36;
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
        private static java.lang.String $$c(int r7, short r8, int r9) {
            /*
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r8 = 1 - r8
                byte[] r0 = getOpeningBlocker.b.$$a
                int r9 = 116 - r9
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r7
                goto L29
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L23
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
                int r9 = r9 + 1
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: getOpeningBlocker.b.$$c(int, short, int):java.lang.String");
        }
    }

    private File TuitionPaymentFragmentbindingInflater1(Uri p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        try {
            File file = new File(requireActivity().getCacheDir(), p1);
            InputStream inputStreamOpenInputStream = requireActivity().getContentResolver().openInputStream(p0);
            if (inputStreamOpenInputStream != null) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamOpenInputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
                fileOutputStream.close();
                inputStreamOpenInputStream.close();
            }
            return file;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        final FragmentScholarBenefitStep3Binding fragmentScholarBenefitStep3BindingINotificationSideChannelStub = INotificationSideChannelStub();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
        final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = (generateUltraHdrSupportedCombinationList) ((ScholarBenefitActivity) fragmentActivityRequireActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        generateultrahdrsupportedcombinationlist.TuitionPaymentFragmentbindingInflater1.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: startWithDeferrableSurface
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getOpeningBlocker.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fragmentScholarBenefitStep3BindingINotificationSideChannelStub, (CodeNamePair) obj);
            }
        }));
        generateultrahdrsupportedcombinationlist.asBinder.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: toCameraCaptureSessionCompat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getOpeningBlocker.b(fragmentScholarBenefitStep3BindingINotificationSideChannelStub, this, generateultrahdrsupportedcombinationlist, (ScholarPersonDetail) obj);
            }
        }));
        generateultrahdrsupportedcombinationlist.cancelAll.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: getStateCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getOpeningBlocker.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        generateultrahdrsupportedcombinationlist.onTransact.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: SynchronizedCaptureSessionStateCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getOpeningBlocker.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, generateultrahdrsupportedcombinationlist, (VirtualCameraAdapter1) obj);
            }
        }));
        generateultrahdrsupportedcombinationlist.asInterface.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: SynchronizedCaptureSessionOpenerBuilder
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getOpeningBlocker.b(this.b, (Boolean) obj);
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
        final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = (generateUltraHdrSupportedCombinationList) ((ScholarBenefitActivity) fragmentActivityRequireActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        ArrayList value = generateultrahdrsupportedcombinationlist.INotificationSideChannelStubProxy.getValue();
        if (value == null) {
            value = new ArrayList();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = value;
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new updateMaximumSizeByFormat(fragmentActivityRequireActivity2, new Function2() { // from class: getExecutor
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return getOpeningBlocker.TuitionPaymentFragmentbindingInflater1(generateultrahdrsupportedcombinationlist, this, ((Integer) obj).intValue(), (ScholarDocument) obj2);
            }
        }, new Function2() { // from class: createSessionConfigurationCompat
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return getOpeningBlocker.TuitionPaymentFragmentspecialinlinedviewModeldefault1(generateultrahdrsupportedcombinationlist, ((Integer) obj).intValue(), (ScholarDocument) obj2);
            }
        });
        RecyclerView recyclerView = INotificationSideChannelStub().fragScholarProveImgs;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(context));
        updateMaximumSizeByFormat updatemaximumsizebyformat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (updatemaximumsizebyformat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            updatemaximumsizebyformat = null;
        }
        recyclerView.setAdapter(updatemaximumsizebyformat);
        recyclerView.setNestedScrollingEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
        ((generateUltraHdrSupportedCombinationList) ((ScholarBenefitActivity) fragmentActivityRequireActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).g.setValue(Boolean.FALSE);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
        ((generateUltraHdrSupportedCombinationList) ((ScholarBenefitActivity) fragmentActivityRequireActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).g.setValue(Boolean.TRUE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int p0, int p1, Intent p2) throws IOException {
        Image imageB;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
        generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = (generateUltraHdrSupportedCombinationList) ((ScholarBenefitActivity) fragmentActivityRequireActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        if (p1 == -1 && p0 == 553 && p2 != null) {
            imageB = getCaptureNode.b(p2);
            if (imageB != null) {
                File file = new File(imageB.TuitionPaymentFragmentbindingInflater1);
                if (file.length() / 1048576.0d > 2.0d) {
                    kotlinx.coroutines.b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ScholarBenefitStep3Fragment$onActivityResult$1(this, file, generateultrahdrsupportedcombinationlist, value, null), 3, null);
                } else {
                    ScholarDocument value2 = generateultrahdrsupportedcombinationlist.INotificationSideChannel.getValue();
                    Intrinsics.checkNotNull(value2);
                    ScholarDocument scholarDocument = value2;
                    Intrinsics.checkNotNullParameter("image/*", "");
                    scholarDocument.TuitionPaymentFragmentbindingInflater1 = "image/*";
                    scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = file;
                    generateultrahdrsupportedcombinationlist.asBinder.setValue(value);
                }
            }
        } else {
            imageB = null;
        }
        if (p1 == -1 || imageB == null) {
            Uri data = p2 != null ? p2.getData() : null;
            if (data != null) {
                InputStream inputStreamOpenInputStream = requireActivity().getContentResolver().openInputStream(data);
                Intrinsics.checkNotNull(inputStreamOpenInputStream);
                byte[] bytes = ByteStreamsKt.readBytes(inputStreamOpenInputStream);
                if (bytes.length <= 6000000) {
                    String strValueOf = String.valueOf(requireActivity().getContentResolver().getType(data));
                    ScholarDocument value3 = generateultrahdrsupportedcombinationlist.INotificationSideChannel.getValue();
                    Intrinsics.checkNotNull(value3);
                    ScholarDocument scholarDocument2 = value3;
                    Intrinsics.checkNotNullParameter(strValueOf, "");
                    scholarDocument2.TuitionPaymentFragmentbindingInflater1 = strValueOf;
                    scholarDocument2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = data;
                    generateultrahdrsupportedcombinationlist.asBinder.setValue(value);
                } else {
                    getContentPaddingRight.b bVarB = getContentPaddingRight.b("docsize");
                    Intrinsics.checkExpressionValueIsNotNull(bVarB, "");
                    bVarB.TuitionPaymentFragmentbindingInflater1(String.valueOf(bytes.length), new Object[0]);
                    getOpeningBlocker getopeningblocker = this;
                    Intrinsics.checkNotNullParameter(getopeningblocker, "");
                    Intrinsics.checkNotNullParameter("File tidak boleh melebihi 6 MB", "");
                    BaseActivity baseActivity = (BaseActivity) getopeningblocker.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, "File tidak boleh melebihi 6 MB", null);
                    }
                }
            }
        }
        super.onActivityResult(p0, p1, p2);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, getOpeningBlocker getopeningblocker) {
        String str;
        generateultrahdrsupportedcombinationlist.a.clear();
        FragmentActivity fragmentActivityRequireActivity = getopeningblocker.requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
        ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = (ActivityResultContractsPickVisualMediaMediaCapabilities) ((ScholarBenefitActivity) fragmentActivityRequireActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        ArrayList<ScholarDocument> arrayList = value != null ? value.setCallbacksMessenger : null;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            for (ScholarDocument scholarDocument : arrayList) {
                if (scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    if (!(scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof Uri)) {
                        if (scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof File) {
                            Object obj = scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            Intrinsics.checkNotNull(obj, "");
                            arrayList2.add((File) obj);
                        }
                    } else {
                        Object obj2 = scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Intrinsics.checkNotNull(obj2, "");
                        long timeInMillis = Calendar.getInstance().getTimeInMillis();
                        CaptureRequestOptions captureRequestOptions = CaptureRequestOptions.INSTANCE;
                        String str2 = CaptureRequestOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3().get(scholarDocument.TuitionPaymentFragmentbindingInflater1);
                        StringBuilder sb = new StringBuilder();
                        sb.append(timeInMillis);
                        sb.append(".");
                        sb.append((Object) str2);
                        File fileTuitionPaymentFragmentbindingInflater1 = getopeningblocker.TuitionPaymentFragmentbindingInflater1((Uri) obj2, sb.toString());
                        if (fileTuitionPaymentFragmentbindingInflater1 != null) {
                            arrayList2.add(fileTuitionPaymentFragmentbindingInflater1);
                        }
                    }
                }
            }
        }
        User userAsBinder = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str3 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        String str4 = str3 == null ? "" : str3;
        String str5 = value != null ? value.INotificationSideChannelStub : null;
        String str6 = str5 == null ? "" : str5;
        String str7 = value != null ? value.connect : null;
        String str8 = str7 == null ? "" : str7;
        String str9 = value != null ? value.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
        String str10 = str9 == null ? "" : str9;
        User userAsBinder2 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str11 = userAsBinder2 != null ? userAsBinder2.b : null;
        String str12 = str11 == null ? "" : str11;
        User userAsBinder3 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str13 = userAsBinder3 != null ? userAsBinder3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
        String str14 = str13 == null ? "" : str13;
        User userAsBinder4 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str15 = userAsBinder4 != null ? userAsBinder4.asInterface : null;
        String str16 = str15 == null ? "" : str15;
        String str17 = value != null ? value.INotificationSideChannelDefault : null;
        String str18 = str17 == null ? "" : str17;
        String str19 = value != null ? value.getServiceComponent : null;
        Intrinsics.checkNotNull(str19);
        Double doubleOrNull = StringsKt.toDoubleOrNull(str19);
        int iDoubleValue = (int) (doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d);
        CodeNamePair codeNamePair = value.MediaBrowserCompat;
        String str20 = codeNamePair != null ? codeNamePair.b : null;
        if (str20 == null) {
            str20 = "";
        }
        String str21 = Intrinsics.areEqual(str20, "1") ? "Y" : ExifInterface.GPS_DIRECTION_TRUE;
        String str22 = value.RemoteActionCompatParcelizer;
        Calendar calendar = value.getNotifyChildrenChangedOptions;
        String strValueOf = String.valueOf(calendar != null ? Integer.valueOf(calendar.get(1)) : null);
        String str23 = value.getRoot;
        String str24 = value.getRoot;
        CodeNamePair codeNamePair2 = value.getExtras;
        String str25 = codeNamePair2 != null ? codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str25 == null) {
            str25 = "";
        }
        String string = StringsKt.trim((CharSequence) str25).toString();
        CodeNamePair codeNamePair3 = value.getExtras;
        String str26 = codeNamePair3 != null ? codeNamePair3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str26 == null) {
            str26 = "";
        }
        String string2 = StringsKt.trim((CharSequence) str26).toString();
        if (Intrinsics.areEqual(value.RemoteActionCompatParcelizer, "Y")) {
            CodeNamePair value2 = generateultrahdrsupportedcombinationlist.TuitionPaymentFragmentbindingInflater1.getValue();
            str = value2 != null ? value2.b : null;
            if (str == null) {
                str = "";
            }
        } else {
            str = value.disconnect;
        }
        ScholarshipInsertRequest scholarshipInsertRequest = new ScholarshipInsertRequest(str4, str6, str8, str10, str12, str14, str16, str18, String.valueOf(iDoubleValue), str21, str22, strValueOf, str23, str24, string, string2, StringsKt.trim((CharSequence) str).toString(), StringsKt.trim((CharSequence) value.disconnect).toString(), value.INotificationSideChannelStubProxy, value.getInterfaceDescriptor, (File) CollectionsKt.getOrNull(getopeningblocker.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 0), (File) CollectionsKt.getOrNull(getopeningblocker.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 1), (File) CollectionsKt.getOrNull(getopeningblocker.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 2), (File) CollectionsKt.getOrNull(arrayList2, 0), (File) CollectionsKt.getOrNull(arrayList2, 1), (File) CollectionsKt.getOrNull(arrayList2, 2));
        Intrinsics.checkNotNullParameter(scholarshipInsertRequest, "");
        MutableLiveData<VirtualCameraAdapter1<ScholarshipInsertResponse>> mutableLiveData = generateultrahdrsupportedcombinationlist.cancelAll;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(generateultrahdrsupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(scholarshipInsertRequest)));
        final Function1 function1 = new Function1() { // from class: getSurfaceCombinationsByFeatureSettings
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return generateUltraHdrSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(generateultrahdrsupportedcombinationlist, (ScholarshipInsertResponse) obj3);
            }
        };
        logToString logtostring = new logToString() { // from class: getRecordSize
            @Override // defpackage.logToString
            public final void accept(Object obj3) {
                function1.invoke(obj3);
            }
        };
        final Function1 function2 = new Function1() { // from class: getMaxOutputSizeByFormat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return generateUltraHdrSupportedCombinationList.b(generateultrahdrsupportedcombinationlist, (Throwable) obj3);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getRecordSizeFromStreamConfigurationMap
            @Override // defpackage.logToString
            public final void accept(Object obj3) {
                function2.invoke(obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        generateultrahdrsupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final getOpeningBlocker getopeningblocker, final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = getopeningblocker.getString(R.string.action_ok_continue);
        Intrinsics.checkNotNullExpressionValue(string, "");
        getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_document_success, "Konfirmasi Data", "Mohon dapat dipastikan pilihan \"Tingkat Kelas Sekarang\" sudah benar sesuai Jenjang Pendidikan Anda, dan Dokumen yang diupload tampak jelas dan tidak buram sebelum melanjutkan Konfirmasi Beasiswa ini.", string, new Function0() { // from class: lambdaonClosed3androidxcameracamera2internalSynchronizedCaptureSessionBaseImpl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getOpeningBlocker.TuitionPaymentFragmentspecialinlinedviewModeldefault3(generateultrahdrsupportedcombinationlist, getopeningblocker);
            }
        }, getopeningblocker.getString(R.string.action_return), new Function0() { // from class: setSingleRepeatingRequest
            private static long TuitionPaymentFragmentbindingInflater1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private static final byte[] $$c = {99, -43, -44, -62};
            private static final int $$d = 56;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {108, -26, -110, 50};
            private static final int $$b = 80;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 3
                    int r8 = 4 - r8
                    int r6 = r6 + 97
                    byte[] r0 = defpackage.setSingleRepeatingRequest.$$a
                    int r7 = r7 * 4
                    int r1 = 1 - r7
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r0 != 0) goto L17
                    r4 = r7
                    r6 = r8
                    r3 = r2
                    goto L2c
                L17:
                    r3 = r2
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L1b:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r7) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L28:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                L2c:
                    int r4 = -r4
                    int r8 = r8 + r4
                    int r6 = r6 + 1
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setSingleRepeatingRequest.c(byte, byte, byte, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = Unit.INSTANCE;
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i4 = $10 + 95;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 % 3;
                }
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 2;
                            byte b3 = (byte) (b2 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2187, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 40, 841711447, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33016 - TextUtils.lastIndexOf("", '0', 0)), 3011 - KeyEvent.normalizeMetaState(0), 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 321985076, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 1;
                            byte b7 = (byte) (-b6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 36505), 3376 - View.combineMeasuredStates(0, 0), 17 - View.MeasureSpec.getMode(0), -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
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
                char[] cArr = new char[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i7 = $10 + 67;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        try {
                            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 1;
                                byte b9 = (byte) (-b8);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 36506), 3375 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.getCapsMode("", 0, 0) + 17, -968507904, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                            int i8 = 58 / 0;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b10 = (byte) 1;
                            byte b11 = (byte) (-b10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36505 - View.getDefaultSize(0, 0)), 3376 - ExpandableListView.getPackedPositionType(0L), (Process.myPid() >> 22) + 17, -968507904, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    }
                }
                objArr[0] = new String(cArr);
            }

            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 142041. Try increasing type updates limit count.
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                */
            public static java.lang.Object[] b(android.content.Context r55, int r56, int r57, int r58) {
                /*
                    Method dump skipped, instruction units count: 14204
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setSingleRepeatingRequest.b(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static {
                char[] cArr = new char[2154];
                ByteBuffer.wrap("D¡¤\u0000\u0085?æFÇ\t {\u0001\u009db\u0084Cº¬Ò\u008dÃîóÎ\u001e/3\b#i\\JJ«v\u0094\u009fõ£Öµ7ã\u0010áqøQ\u001f²7\u0093/±³Q\u0012p-\u0013T2\u001bÕiô\u008f\u0097\u0096¶¨YÀxÑ\u001bá;\fÚ!ý \u009cC¿L^sa·\u0000¦#¤ÂÜåã\u0084î¤\b²$R\u0085sº\u0010Ã1\u008cÖþ÷\u0018\u0094\u0001µ?ZW{F\u0018v8\u009bÙ¶þ´\u009fÄ¼Å]â±³Q\u0005p1\u0013Q2\u001bÕcô\u008f\u0097\u009e¶¹YÊxÝ\u001b½;\u0003Ú\u0011ý<\u009cN¿Z^\u007fa\u009b\u0000ª#\u008bÂÌåá\u0084î¤\u0018G#f*\tK\u001c\u0096ü6Ý\u0019¾d\u009f>xOY¢:ñ\u001b\u0099ôñÕò¶Ç±³Q\u0013p<\u0013A2\u001bÕ}ô\u0089\u0097\u0097¶âYÖxÊ\u001bý;\u0014,¦Ì\u0010í9\u008eT¯@Hii\u0091\nÀ+\u008bÄõåà\u0086è¦\u0007G\u000e`\u0001\u0001^\"]Ãbho\u0088Î©õÊ\u008aë\u0089\fý-\u0012NEo`\u0080\u000f¡\rÂ âÞ\u0003Í±îQ\u0019pf\u0013@2[Õaô\u0094\u0097Ô¶¾YÃxÜ\u001bà;\u000bÚ\u0017ý4\u009cu¿R^sa\u009c\u0000\u009d#°ÂÀåó\u0084«Ö»6L\u00173t\u0015U\u000e²4\u0093Áð\u0081Ñë>\u0096\u001f\u0089|µ\\^½B\u009aaû Ø\u00079&\u0006ÉgÈDå¥\u0095\u0082¦ãýUaµ×\u0094ã÷\u0083Ö\u00921¹\u0010_s\u0007Rr½\u001d\u009c\bÿoßÚ>Å\u0019àx\u0096[\u008cºê\u0085Iä\u007f±þQ\u001fp/\u0013L2[Õvå\\\u0005ê$ÞG¾f¯\u0081\u0084 bÃ:âA\r ,9ORoå\u008eô©ÒÈ°ë\u0085\n´5*TCw^\u0096,±\u001aÐXðà\u0013Æ2Ù]©|\u0099\u009f\u009e¾s±³Q\u0005p1\u0013Q2@Õkô\u008d\u0097Õ¶®YÏxÖ\u001b½;\nÚ\u001bý=\u009c_¿j^[aÅ\u0000²#¦ÂÁåð±³Q\u0005p1\u0013Q2@Õkô\u008d\u0097Õ¶ YÏxÚ\u001b½;\bÚ\u0017ý2\u009cD¿Y^{a\u009d\u0000\u0094#\u0099ÂÞåò\u0084õ¤\u001cGhf+\t]\u008fÞo\u007fN@-9\fvë\rÊè©ú\u0088Ôg¬F %\u009a\u0005zäg±îQ\u0019pf\u0013@2AÕgô\u008c\u0097\u009e¶âYÎx×\u001bá;\u0010ò½\u0012\\3fP\u001eq\u001e\u0096o·ÁÔÐõ÷±³Q\u0006p:\u0013M2WÕ!ô\u0086\u0097\u0093¶ YÃxË\u001bë;\u0017Ú\ný5\u009cG¿OâE\u0002¤#\u0092@àað\u0086ß=1ÝÆü¹\u009f\u008d¾\u0099Y¾x[\u001bP:pÕ\rôI\u0097 ·ÚVÏqú\u0010\u00933\u0082ÒªíC\u008ch¯yN\u0014i-\u009d¾}V\\c?\u001eÓù3\u0006\u0012/qDPH·h\u0096\u0081õÁÔª;Ê\u001aÞy©Y\u0013¸\u000f\u009fkþ[ÝL<a\u0003\u0088b°Aï Ü\u0087åæúÆW%5\u0004,kLJt©T\u0088\u0082ï¯Î¼-ü\fïl\u0012s\u000fR?±P\u0090]÷|Ö\u0081±ìQ\u0013p:\u0013Q2]Õ}ô\u0094\u0097Ô¶¿YßxË\u001b¼;\u0006Ú\u001aý~\u009cN¿Y^ta\u009d\u0000¥#úÂÉåð\u0084ï¤BG f9\tY(aËAê\u0097\u008dº¬©Oénþ\u000e\u0007\u0011\u001a0*ÓOòH \u0006@ùaÐ\u0002»#·Ä\u0097å~\u0086>§UH5i!\nV*ìËðì\u0094\u008d¤®³O\u009epw\u0011O2\u0010Ó6ô\u0005\u0095^µåVÝwÛ\u0093¼sCRj1\u0001\u0010\r÷-ÖÄµ\u0084\u0094ï{\u008fZ\u009b9ì\u0019VøJß.¾\u001e\u009d\t|$CÍ\"õ\u0001ªà\u008cÇ¿¦ä\u0086PewDkà_\u0000 !\u0089Bâcî\u0084Î¥'Ægç\f\bl)xJ\u000fjµ\u008b©¬ÍÍýîê\u000fÇ0.Q\u0016rI\u0093o´\\Õ\u0007õ²\u0016\u00967\u0088±ìQ\u0013p:\u0013Q2]Õ}ô\u0094\u0097Ô¶¿YßxË\u001b¼;\u0006Ú\u001aý~\u009cN¿Y^ta\u009d\u0000¥#úÂÜåï\u0084´¤\u0001G(f;\u0099Ay¿X\u008c;ñ\u001aìýÃmy\u008dÌ¬ðÏ\u0087î\u009d\të(GK_jb\u0085\u0019¤\u001eÇ=çÝ=\u0016ÝèüÛ\u009f¦¾¯Y\u0087xy\u001bu:D¼¯\\\u0019}-\u001eM?\\Øwù\u0091\u009aÉ»¶TÈuÅ\u0016ã6\u001d×\u0015ð#\u0091D²KS%l\u0083\r·.¦ÏÖèó\u0089ñ©\u0003Jwk7\u0004W%kÆvç\u0089\u0080»¡\u009fBÙcñ\u0003\f\u001c\u001e=7ÞNÿ\b\u0098z¹\u009bZ\u0096qÚ\u0091i°DÓ%ò9\u0015\b4ûW¼vÉ\u0099¦¸³ÛÍû9\u001a8=Q\\4\u007fz\u009e\u001e¡ôÀÏãÔ\u0002¨%ÇD\u0083dw\u0087F¦\\É:è\u001f\u000b\u000e*·MÔlÜ\u008f±®\u0085ÎdÑjðT\u0013g2 U\nþç\u001eT?y\\\u0018}\u0004\u009a5»ÆØ\u0081ùô\u0016\u009b7\u008eTðt\u0004\u0095\u0005²lÓ\tðG\u0011*.ËOõlï\u008d\u0097ª¤Ë¡ëK\bw)~FHg'\u0084#¥ÊÂúãç\u0000\u0095!¯A\u0018^S\u007fu±³Q\u0005p1\u0013Q2@Õkô\u008d\u0097Õ¶ YÏxÚ\u001b¤;PÚQý3\u009cF¿S^ca\u008c\u0000\u009d#µÂÇåä\u0084ö¤3G/f6\tF(aËlê\u0096\u008d«¬¿OÓn¥\u000e\u0001\u0011\u00040>Ó\u000eòI\u0095c±³Q\u0013p<\u0013A2\u001bÕgô\u008e\u0097\u0093¶¸Y\u0089xÑ\u001bü;\rÚ\ný~\u009cI¿P^ya\u009d\u0000¦#§ÂËåò\u0084ì¤\u0005G%f=\t\u001c(vË}±ÛQ\u0013p&\u0013[2YÕaô\u0094\u0097\u0093¶£YÈ~\u0011\u009eà¿ÛÜ´ý£\u001a\u0081;vÌ\u0007,æ\rÂnµO¡¨\u009f\u0089mêo±îQ\u0019pf\u0013R2FÕaô\u0084\u0097\u008f¶¯YÒx\u0096\u001bö;\u0001Ú\bý9\u009cI¿Y\u000eeî\u009bÏ¨¬Õ\u008d\u0083j·K\u001fo¨\u008f@®uÍ\u0014ì\u0015\u000b4*Ð±ûQ\u0013p&\u0013G2FÕgô\u0083\u0097¥¶´Y\u009ex\u008e±ûQ\u0013p&\u0013G2FÕgô\u0083\u0097¥¶´Y\u009ex\u008e\u001bÍ;RÚJ\u000bèë\u001fÊ`©T\u0088@ogN\u0082-\u0089\f©ãÔÂ\u0090¡ù\u0081\r`\u001cG3&@±ïQ\u0012p#%ïÅ\rä+\u0087X¦CAl`\u0099\u0003\u009e±ÝQ\u0006p8\u0013\u00022fÕ{ô\u008e\u0097\u008e¶¥YËxÝ\u001b²;\u0002Ú\u0011ý\"\u009c\n¿\u007f^~a\u009a\u0000\u00ad#¹ÂË±ÝQ\u0018p,\u0013P2[Õgô\u0084\u0097Ú¶\u009fYâxó\u001b²;\u0006Ú\u000bý9\u009cF¿H^6a\u008e\u0000\u00ad#¦Â\u008eåø\u0084¢¤Z±ÝQ\u0018p,\u0013P2[Õgô\u0084\u0097Ú¶\u009fYâxó\u001b²;\u0006Ú\u000bý9\u009cF¿H^6a\u008e\u0000\u00ad#¦Â\u008eåø\u0084¢¤ZG\u0019fn\t\u0006²yR\u008esñ\u0010Ý1ÂÖë÷\u0013\u0094\u001aµ:ZC{J±ûQ\u0019p$\u0013F2RÕgô\u0093\u0097\u0092±êQ\u0014p'\u0013Z2\fÕ8±îQ\u0017p&\u0013A2\\Õ{±îQ\u0019pf\u0013R2FÕaô\u0084\u0097\u008f¶¯YÒx\u0096\u001bð;\u0016Ú\u001fý>\u009cN±îQ\u0019pf\u0013I2QÕ|ô\u008e\u0097\u009f¶ Y\u0088xÉ\u001b÷;\tÚ\u000b±\u00ad±îQ\u0019pf\u0013Q2QÕmô\u0095\u0097\u0088¶©S>±îQ\u0019pf\u0013@2AÕgô\u008c\u0097\u009e¶âYÖxÊ\u001bý;\u0000Ú\u000bý3\u009c^Ú\u009c:e\u001bBx(Y\r¾\u0010\u009f¾üªãC\u0003´\"ËAí`ì\u0087Ê¦!Å3äO\u000bm*|IQi®\u0088¶¯\u008fÎ÷íã\fÒ3+R\u001b:AÚ©û\u009c\u0098ý¹ü^Ý\u007f9\u001co=\u0005Òxói\u0090\u0007°¹Q¡v\u0084\u0017õ4ôÕÅê1o×\u008f?®\nÍkìj\u000bK*¯I\u0089h\u0098\u0087²¦¢Å\u0091å;\u00046#\u0017BYah\u0080\u0002¿òÞÁý\u009f\u001cç;ÂZÓz2\u0099\u0003¸\u0017×AöP\u0015\n4ê\u0002!âÉÃü \u009d\u0081\u009cf½GY$\u000f\u0005qê\u0013Ë\r¨/\u0088ÒiÁNÕ/\u0083\f\u0082í§Ò\u001d³\u007f\u0090kq\u001aV?72\u0017ßôÿ[ª»B\u009awù\u0016Ø\u0017?6\u001eÒ}\u0084\\ë³\u0095\u0092\u0086ñ»Ñ\r0\u0019\u0017qvTU\u001b´%\u008bÖêëÉ½(É\u000f¡±ûQ\u0019p'\u0013E2XÕkôÏ\u0097\u0089¶¨YÍxç\u001bõ;\u0014Ú\u0016ý?\u009cD¿Y^Ia\u0090\u0000ú#âÂ\u0081åç\u0084ÿ¤\u0002G#f*\t[(gËAê\u0088\u008dò¬ê£$CÓb¬\u0001\u008a \u0091Ç«æ^\u0085\\¤iK\rj\u0016\t=)Üßû?\f\u001es}U\\N»t\u009a\u0081ù\u0086Ø´7Ò\u0016ÊuâU_´\t\u00930òVÑE0g\u000fÓn±M¨¬Õ\u008bòêêÊ\u000b)#\b?gNF\u007f¥\u007f±ÝQ\u0018p,\u0013P2[Õgô\u0084\u0097×¶´Y\u009ex\u008e±îQ\u0019pf\u0013@2AÕgô\u008c\u0097\u009e¶âYÂxÑ\u001bá;\u0014Ú\u0012ý1\u009cS¿\u0012^\u007fa\u008c\bdè\u009fÉ·ªÚ\u008b\u0095±õQ\u0018p!\u0013V2\u001aÕ}ô\u0096\u0097\u0099¶âY×xÝ\u001bÿ;\u0011ÚSý \u009cX¿S^fa\u009b\u008b*kÔJâ)\u0090\bÝï¡ÎP\u00ad\u0013\u008cfc\u0000B\u0016!;\u0001ÈàÜÇî¦\u009e)áÉ\u001fè)\u008b[ª\u0016Mql\u008a\u000fØ.¦ÁËàß\u0083û£7B\u0011e=\u0004K'UÆhù\u0085\u0085ee\u009bD\u00ad'ß\u0006\u0092áõÀ\u000e£\\\u0082(mMLT/E\u000f\u0088î\u0093É¶¨Ñ\u008bÝjêU\u0019±îQ\u0019pf\u0013I2QÕ|ô\u008e\u0097\u009f¶ Y\u0088xÙ\u001bü;\u0000Ú\fý?\u009cC¿X^8a\u0099\u0000§#¹ÂÛåä\fÎì9ÍF®`\u008f{hAI´*ô\u000b\u009däãÅõ¦Ç\u0086jg?@\u0006!n\u0002CãXÜ©½\u008f\u009e\u0091~Ä\u009e3¿LÜgýz\u001aI;äX²y\u0093\u0096å·þÔÜô`\u001522\u0013Snpq\u0091Y®°Ï\u0098ì\u008c\rí*ÄKÄôä\u0014\u00135lVXwL\u0090k±\u008eÒ\u0085ó¥\u001cØ=\u009c^ú~\u001b\u009f\u001d¸6ÙDú\u0018\u001bz$\u008bE¦f¹\u0087Á øÁàá\u0014\u0002%#<LLÖI6¾\u0017ÁtöUê²Ú\u00933ð8Ñ\u0006>/\u001f}|@\\ª½µ\u009a\u0093û£Øý9Ø\u0006!g\u0002D\u0016¥{\u0082WãOÃ¢ \u008f\u0001\u008bC7£À\u0082¿á\u0088À\u0094'¤\u0006MeFDx« \u008a\u0004é3ÉÉ(\u0089\u000fën\u0086M\u008c¬£\u0093Uò5Ñk0\u001e\u00177v$VÐµí\u0094ñû\u0099Ú´9©\u0018]É2)Å\bºk\u0088J\u008d\u00ad¼\u008cXïIÎb!T\u0000\u0006c;CÑ¢Î\u0085èäØÇ\u0086&£\u0019Zxy[mº\u0000\u009d,ü4ÜÙ?ô\u001eð¸\u0090Xgy\u0018\u001a*;/Ü\u001eýú\u009eë¿ÀP\u0087q¢\u0012\u00802qÓmô\u0000\u00956¶7W\u0001hú\tØ*\u0084Ë¶ì\u0097\u008d\u008a\u00aduN]oT\u0000<!\bÂ\tãà\u0084À±´êí\n\u000b\u0005\u0088±µ±³Q\u0012p-\u0013T2\u001bÕ\u007fô\u0085\u0097\u0097¶¹YùxÈ\u001bû;\u0014Ú\u001b±³Q\u0012p-\u0013T2\u001bÕ}ô\u008f\u0097\u0099¶§YÃxÌ\u001b½;\u0006Ú\u001fý#\u009cO¿^^wa\u0086\u0000¦#\u008bÂÉåå\u0084ô¤\u0015G\"±³Q\u0012p-\u0013T2\u001bÕ}ô\u008f\u0097\u0099¶§YÃxÌ\u001b½;\u0003Ú\u001bý>\u009cS¿XLP¬ñ\u008dÎî·Ïø(\u009e\tljzKD¤ \u0085/æ^Æö'ø\u0000Þa¼B»±³Q\u0005p1\u0013Q2\u001bÕ\u007fô\u0085\u0097\u0097¶¹YùxÌ\u001bà;\u0005Ú\u001dý5Ì},Ë\rÿn\u009fO\u008e¨¥\u0089Cê\u001bËn$\u0001\u0005\u0014fsFÆ§Ù\u0080üá\u0087Â\u00ad#µ\u001cG}`^v¿\u000f\u0098-ù\u000bÙÆ:í\u001bôt\u0089U\u00ad¶\u008f\u0097OðaÑ\u007f2\r\u0013hsßlÕ±³Q\u0012p-\u0013T2\u001bÕlô\u0093\u0097\u008e¶\u0093YÁxÈ\u001bá±³Q\u0012p-\u0013T2\u001bÕlô\u0093\u0097\u008e¶\u0093YÒxÑ\u001bÿ;\u0001±³Q\u0012p-\u0013T2\u001bÕ}ô\u008f\u0097\u0099¶§YÃxÌ\u001b½;\u0006Ú\rý$\u009cL¿S^za\u008c\u0000§#¦ÂÊó(\u0013\u009e2ªQÊpÛ\u0097ð¶\u0016ÕNô;\u001bT:AY&y\u0093\u0098\u008c¿©ÞÓýÔ\u001cù#\u0015B6a#\u0080Q§~Æsæ¨\u0005·$\u00adKÀj±\u0089ö¨\u0004\u0091ÂqcP\\3%\u0012jõ\u001dÔâ·ÿ\u0096Üy´Xª;\u0086±³Q\u0012p-\u0013T2\u001bÕlô\u0093\u0097\u008e¶«YßxÊ\u001bý\u001c¤ü\u0005Ý:¾C\u009f\fx{Y\u0084:\u0099\u001b¶ôÔÕÈ¶ë±³Q\u0012p-\u0013T2\u001bÕlô\u0093\u0097\u008e¶£YÔxÑ\u001b÷±³Q\u0012p-\u0013T2\u001bÕlô\u0093\u0097\u008e¶ºYËxË\u001bõr\u0004\u0092¥³\u009aÐãñ¬\u0016Û7$T9u\u000b\u009av»nØLø£\u0019ª±³Q\u0012p-\u0013T2\u001bÕlô\u0093\u0097\u008e¶\u0093YÏxÕ\u001b÷ýQ\u001dð<Ë_´~·\u0099Ã¸fÛwúY\u0015*46W\u001fwç\u0096ø±ÁÐçóð\u0012\u008c-hL\u000foT\u008e?©\u0016È\u0013¢´B\u001cc!\u0000Q!\u001cÆ~ç\u008e\u0084\u0093¥¯JÎkÈ\bæ(LÉ;î$\u008fY¬hMyr\u008e\u0013·0¶ÑÍöÁ\u0097ò·\u0007T%u:\u001aGQL±ù\u0090Åó²Ò¨5Þ\u0014vwjVC¹6\u00985û\u0019Ûè±¬Q\u0010p.\u0013\u00022\u000e±³Q\u0006p:\u0013M2WÕ!ô\u0093\u0097\u009f¶ YÀx\u0097\u001bÿ;\u0005Ú\u000eý#±ûQ\u0004p)\u0013N2XÕaô\u0083\u0097Ô¶«YÉxÔ\u001bö;\u0002Ú\u0017ý#\u009cB¿\u0012^ea\u0087±ðQ\u001fp*\u0013e2xÕKô³\u0097¥¶®YÕxÌ\u001b¼;\u0017Ú\u0011Ó£3\u0003\u0012,qQP\u000b·s\u0096\u0095õ\u008eÔµ;×\u001a÷yáY\u001b¸\n\u009f%þYÝ_<(\u0003\u0080b¿A¨±þQ\u001ap=\u0013G2GÕzô\u0081\u0097\u0099¶§YÕ±³Q\u0013p<\u0013A2\u001bÕcô\u008f\u0097\u008f¶¢YÒxË|9\u009c\u0098½£ÞÜÿß\u0018«9\u000eZ\u001f{1\u0094Bµ^Öwö\u008f\u0017\u00900©Q\u008fr\u0098\u0093ø¬\u0012Ígî?\u000fT(zIciÈ\u008a´«¿ÄÔ\u000eýîHÏt¬\u0003\u008d\u0019joKÍ(Ä\t÷æ\u0081Ç\u0098¤º\u0084EM8\u00adú\u008cÇï¥Î±)\u0084\bpkq+\u001aË»ê\u0080\u0089ÿ¨üO\u0088n$\r:,\u0016Ãlâ>\u0081K¡¿@¸g\u009f\u0006ê%ùÄÚû2\u009aD¹\u001eXr\u007f[\u001e\u001c>õÝÀü\u0092\u0093ô²ÀQ\u0099p4\u0017\n6\u0016ÕmôN\u0094½\u008b´ª\u0095Iýh½\u000fÈ.*Í<ì\u000e\u0083d¢zA\\".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr;
                TuitionPaymentFragmentbindingInflater1 = -243390201566768778L;
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
            private static java.lang.String $$e(short r6, byte r7, short r8) {
                /*
                    int r7 = r7 + 4
                    int r8 = r8 * 3
                    int r0 = r8 + 1
                    int r6 = r6 * 3
                    int r6 = 115 - r6
                    byte[] r1 = defpackage.setSingleRepeatingRequest.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L15
                    r3 = r7
                    r6 = r8
                    r4 = r2
                    goto L2a
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L23:
                    int r7 = r7 + 1
                    r3 = r1[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r5
                L2a:
                    int r7 = -r7
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setSingleRepeatingRequest.$$e(short, byte, short):java.lang.String");
            }
        });
        FragmentManager childFragmentManager = getopeningblocker.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getOpeningBlocker getopeningblocker) {
        Context context = getopeningblocker.getContext();
        File file = new File(context != null ? context.getExternalFilesDir(Environment.DIRECTORY_PICTURES) : null, "CameraDemo");
        if (!file.exists()) {
            file.mkdirs();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("IMG_");
        sb.append(jCurrentTimeMillis);
        sb.append(".jpg");
        getopeningblocker.asInterface = new File(file, sb.toString());
        Context contextRequireContext = getopeningblocker.requireContext();
        String packageName = getopeningblocker.requireContext().getApplicationContext().getPackageName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(packageName);
        sb2.append(".provider");
        String string = sb2.toString();
        File file2 = getopeningblocker.asInterface;
        Intrinsics.checkNotNull(file2);
        Uri uriForFile = FileProvider.getUriForFile(contextRequireContext, string, file2);
        getopeningblocker.b = uriForFile;
        getopeningblocker.d.launch(uriForFile);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, ArrayList arrayList, final getOpeningBlocker getopeningblocker, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getOrderedSupportedStreamUseCaseSurfaceConfigList.Companion companion = getOrderedSupportedStreamUseCaseSurfaceConfigList.INSTANCE;
            getOrderedSupportedStreamUseCaseSurfaceConfigList getorderedsupportedstreamusecasesurfaceconfiglistTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getOrderedSupportedStreamUseCaseSurfaceConfigList.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Tingkat Kelas Sekarang", "Cari Tingkat Kelas", generateultrahdrsupportedcombinationlist.TuitionPaymentFragmentbindingInflater1.getValue(), arrayList, new Function1() { // from class: createCaptureSessionCompat
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getOpeningBlocker.TuitionPaymentFragmentbindingInflater1(generateultrahdrsupportedcombinationlist, getopeningblocker, (CodeNamePair) obj);
                }
            });
            FragmentManager childFragmentManager = getopeningblocker.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getorderedsupportedstreamusecasesurfaceconfiglistTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getorderedsupportedstreamusecasesurfaceconfiglistTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(childFragmentManager, getorderedsupportedstreamusecasesurfaceconfiglistTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, getOpeningBlocker getopeningblocker, CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        Integer intOrNull = StringsKt.toIntOrNull(codeNamePair.b);
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        String str = value != null ? value.disconnect : null;
        if (str == null) {
            str = "";
        }
        Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) str).toString());
        if (iIntValue > (intOrNull2 != null ? intOrNull2.intValue() : -1)) {
            generateultrahdrsupportedcombinationlist.TuitionPaymentFragmentbindingInflater1.setValue(codeNamePair);
        } else {
            getCameraState.Companion companion = getCameraState.INSTANCE;
            String string = getopeningblocker.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", "Tingkat pendidikan tidak boleh lebih kecil atau sama dengan dari yang lama", string);
            FragmentManager childFragmentManager = getopeningblocker.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(FragmentScholarBenefitStep3Binding fragmentScholarBenefitStep3Binding, getOpeningBlocker getopeningblocker, generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, ScholarPersonDetail scholarPersonDetail) {
        ArrayList<ScholarDocument> arrayList;
        CodeNamePair codeNamePair = scholarPersonDetail.getItem;
        List list = null;
        String str = codeNamePair != null ? codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            TextInputEditText textInputEditText = fragmentScholarBenefitStep3Binding.fragScholarKind;
            CodeNamePair codeNamePair2 = scholarPersonDetail.getItem;
            textInputEditText.setText(codeNamePair2 != null ? codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
        }
        CodeNamePair codeNamePair3 = scholarPersonDetail.getExtras;
        String str2 = codeNamePair3 != null ? codeNamePair3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            TextInputEditText textInputEditText2 = fragmentScholarBenefitStep3Binding.fragScholarEdu;
            CodeNamePair codeNamePair4 = scholarPersonDetail.getExtras;
            textInputEditText2.setText(codeNamePair4 != null ? codeNamePair4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
        }
        if (Intrinsics.areEqual(scholarPersonDetail.RemoteActionCompatParcelizer, "Y")) {
            TextInputLayout textInputLayout = fragmentScholarBenefitStep3Binding.fragScholarLevelNewLay;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            TextInputLayout textInputLayout2 = textInputLayout;
            Intrinsics.checkNotNullParameter(textInputLayout2, "");
            textInputLayout2.setEnabled(true);
        } else {
            TextInputLayout textInputLayout3 = fragmentScholarBenefitStep3Binding.fragScholarLevelNewLay;
            Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
            TextInputLayout textInputLayout4 = textInputLayout3;
            Intrinsics.checkNotNullParameter(textInputLayout4, "");
            textInputLayout4.setEnabled(false);
        }
        fragmentScholarBenefitStep3Binding.fragScholarYear.setText(String.valueOf(Calendar.getInstance().get(1)));
        fragmentScholarBenefitStep3Binding.fragScholarLevel.setText(scholarPersonDetail.disconnect);
        fragmentScholarBenefitStep3Binding.fragScholarInstitution.setText(scholarPersonDetail.getRoot);
        fragmentScholarBenefitStep3Binding.fragScholarAmount.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(scholarPersonDetail.getServiceComponent));
        updateMaximumSizeByFormat updatemaximumsizebyformat = getopeningblocker.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (updatemaximumsizebyformat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            updatemaximumsizebyformat = null;
        }
        updatemaximumsizebyformat.submitList(null);
        updateMaximumSizeByFormat updatemaximumsizebyformat2 = getopeningblocker.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (updatemaximumsizebyformat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            updatemaximumsizebyformat2 = null;
        }
        ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        if (value != null && (arrayList = value.setCallbacksMessenger) != null) {
            list = CollectionsKt.toList(arrayList);
        }
        updatemaximumsizebyformat2.submitList(list);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, getOpeningBlocker getopeningblocker, int i, ScholarDocument scholarDocument) {
        ArrayList<ScholarDocument> arrayList;
        Intrinsics.checkNotNullParameter(scholarDocument, "");
        MutableLiveData<ScholarDocument> mutableLiveData = generateultrahdrsupportedcombinationlist.INotificationSideChannel;
        ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        mutableLiveData.setValue((value == null || (arrayList = value.setCallbacksMessenger) == null) ? null : arrayList.get(i));
        ActivityResultContractsTakePicture activityResultContractsTakePicture = (ActivityResultContractsTakePicture) getopeningblocker.a.getValue();
        FragmentManager childFragmentManager = getopeningblocker.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(activityResultContractsTakePicture.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            activityResultContractsTakePicture.show(childFragmentManager, activityResultContractsTakePicture.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getOpeningBlocker getopeningblocker, Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (!bool.booleanValue()) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Gagal mengambil gambar", 0).show();
            return;
        }
        if (getopeningblocker.asInterface == null) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Gagal mengambil gambar", 0).show();
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = getopeningblocker.requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
        generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = (generateUltraHdrSupportedCombinationList) ((ScholarBenefitActivity) fragmentActivityRequireActivity).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        File file = getopeningblocker.asInterface;
        if ((file != null ? file.length() / 1048576.0d : 0.0d) > 2.0d) {
            kotlinx.coroutines.b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(getopeningblocker), null, null, new ScholarBenefitStep3Fragment$captureImageCamera$1$1(getopeningblocker, generateultrahdrsupportedcombinationlist, null), 3, null);
            return;
        }
        ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        ScholarDocument value2 = generateultrahdrsupportedcombinationlist.INotificationSideChannel.getValue();
        Intrinsics.checkNotNull(value2);
        ScholarDocument scholarDocument = value2;
        Intrinsics.checkNotNullParameter("image/*", "");
        scholarDocument.TuitionPaymentFragmentbindingInflater1 = "image/*";
        scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getopeningblocker.asInterface;
        generateultrahdrsupportedcombinationlist.asBinder.setValue(value);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(radioGroup, "");
        ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        if (i != R.id.frag_scholar_sn_n) {
            if (i == R.id.frag_scholar_sn_tn && value != null) {
                Intrinsics.checkNotNullParameter(ExifInterface.GPS_DIRECTION_TRUE, "");
                value.RemoteActionCompatParcelizer = ExifInterface.GPS_DIRECTION_TRUE;
            }
        } else if (value != null) {
            Intrinsics.checkNotNullParameter("Y", "");
            value.RemoteActionCompatParcelizer = "Y";
        }
        generateultrahdrsupportedcombinationlist.asBinder.setValue(value);
    }

    public static /* synthetic */ ActivityResultContractsTakePicture TuitionPaymentFragmentspecialinlinedviewModeldefault2(final getOpeningBlocker getopeningblocker) {
        ActivityResultContractsTakePicture.Companion companion = ActivityResultContractsTakePicture.INSTANCE;
        return ActivityResultContractsTakePicture.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function0() { // from class: onCameraDeviceError
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getOpeningBlocker.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
            }
        }, new Function0() { // from class: lambdaclose2androidxcameracamera2internalSynchronizedCaptureSessionBaseImpl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getOpeningBlocker.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
    }

    public static /* synthetic */ Unit b(getOpeningBlocker getopeningblocker) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/png", "image/jpg", "image/jpeg", "application/pdf"});
        getopeningblocker.startActivityForResult(intent, 301);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, int i, ScholarDocument scholarDocument) {
        ArrayList<ScholarDocument> arrayList;
        Intrinsics.checkNotNullParameter(scholarDocument, "");
        scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        Intrinsics.checkNotNullParameter("", "");
        scholarDocument.TuitionPaymentFragmentbindingInflater1 = "";
        ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        if (value != null && (arrayList = value.setCallbacksMessenger) != null) {
            arrayList.set(i, scholarDocument);
        }
        generateultrahdrsupportedcombinationlist.asBinder.setValue(value);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(FragmentScholarBenefitStep3Binding fragmentScholarBenefitStep3Binding, CodeNamePair codeNamePair) {
        fragmentScholarBenefitStep3Binding.fragScholarLevelNew.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getOpeningBlocker getopeningblocker, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getopeningblocker.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            getopeningblocker.write();
            getopeningblocker.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
            getCameraState.Companion companion = getCameraState.INSTANCE;
            String string = getopeningblocker.getString(R.string.label_success);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = getopeningblocker.getString(R.string.message_success_scholarship_confirmation);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = getopeningblocker.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_success, string, string2, string3);
            FragmentManager childFragmentManager = getopeningblocker.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            getcamerastateB.g = getopeningblocker.new b();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getopeningblocker.write();
            getCameraState.Companion companion2 = getCameraState.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string4 = getopeningblocker.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            getCameraState getcamerastateB2 = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string4);
            FragmentManager childFragmentManager2 = getopeningblocker.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            Intrinsics.checkNotNullParameter(childFragmentManager2, "");
            if (childFragmentManager2.findFragmentByTag(getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB2.show(childFragmentManager2, getcamerastateB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getOpeningBlocker getopeningblocker, generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getopeningblocker.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            getopeningblocker.write();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getopeningblocker.write();
            generateultrahdrsupportedcombinationlist.d.setValue(0);
            getCameraState.Companion companion = getCameraState.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string = getopeningblocker.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string);
            FragmentManager childFragmentManager = getopeningblocker.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(getOpeningBlocker getopeningblocker, Boolean bool) {
        getopeningblocker.INotificationSideChannelStub().fragScholarStep3Next.setEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }
}
