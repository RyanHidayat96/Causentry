package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.WorkInfo;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentChooseKpjBottomSheetBinding;
import com.bpjstku.domain.jht.model.JhtBalance;
import com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.ChooseKpjRsjhtBottomSheetFragment$chooseKpjAdapter$2$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.ChooseKpjRsjhtBottomSheetFragment$handleItemClicked$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjParcelItem;
import com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjRsjht;
import com.google.mlkit.common.MlKitException;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.mapPoint;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\tJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0015\u0010\r\u001a\u00020\u00198BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0015\u0010\u001d\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u001a\u0010\u0016\u001a\u00020 8\u0015X\u0095D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u0016\u0010\f\u001a\u00020$8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000b\u0010%"}, d2 = {"LlambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/model/KpjRsjht;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "a", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/model/KpjRsjht;", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/model/KpjParcelItem;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/model/KpjParcelItem;", "LCamera2CapturePipelinePipelineExternalSyntheticLambda0;", "", "asBinder", "I", "()I", "Lcom/bpjstku/databinding/FragmentChooseKpjBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentChooseKpjBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private KpjParcelItem TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentChooseKpjBottomSheetBinding d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<KpjRsjht, Unit> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final int a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private KpjRsjht TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    public /* synthetic */ lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline(Function1<? super KpjRsjht, Unit> function1) {
        this.TuitionPaymentFragmentbindingInflater1 = function1;
        final lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline = this;
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.ChooseKpjRsjhtBottomSheetFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: lambdasubmitConfigsInternal4androidxcameracamera2internalCamera2CapturePipelinePipeline
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        this.a = R.layout.fragment_choose_kpj_bottom_sheet;
    }

    /* JADX INFO: renamed from: lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"LlambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/model/KpjParcelItem;", "p0", "Lkotlin/Function1;", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/model/KpjRsjht;", "", "p1", "p2", "LlambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/model/KpjParcelItem;Lkotlin/jvm/functions/Function1;Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/model/KpjRsjht;)LlambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {1, -81, 2, 79};
        private static final int $$d = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {77, -106, 83, 4, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
        private static final int $$b = 35;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int asInterface = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47351, 47350, 47331, 47320, 47354, 47352, 47347, 47317, 47346, 47343, 47345, 47333, 47277, 47341, 47348, 47303, 47337, 47340, 47332, 47353, 47339, 47335, 47304, 47344, 47322, 47330, 47334};
        private static int b = 2047719579;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = defpackage.lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline.Companion.$$a
                int r9 = r9 * 52
                int r9 = r9 + 1
                int r8 = r8 * 3
                int r8 = 3 - r8
                int r7 = r7 * 14
                int r7 = 98 - r7
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r5 = r2
                goto L2d
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L26
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L26:
                int r8 = r8 + 1
                r3 = r0[r8]
                r6 = r3
                r3 = r8
                r8 = r6
            L2d:
                int r8 = -r8
                int r7 = r7 + r8
                int r7 = r7 + (-11)
                r8 = r3
                r3 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline.Companion.c(byte, int, short, java.lang.Object[]):void");
        }

        private Companion() {
        }

        @JvmStatic
        public static lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline TuitionPaymentFragmentbindingInflater1(KpjParcelItem p0, Function1<? super KpjRsjht, Unit> p1, KpjRsjht p2) {
            int i = 2 % 2;
            lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline = new lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline(p1);
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_kpj_rsjht", p2);
            bundle.putParcelable("jht_rsjht", p0);
            lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline.setArguments(bundle);
            int i2 = asInterface + 119;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            return lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline;
        }

        private static void a(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long j = 0;
            char c = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $11 + 15;
                    $10 = i5 % 128;
                    int i6 = i5 % i2;
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[c] = Integer.valueOf(cArr2[i4]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char packedPositionChild = (char) (31338 - ExpandableListView.getPackedPositionChild(j));
                            int i7 = 2994 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int trimmedLength = 17 - TextUtils.getTrimmedLength("");
                            byte b2 = (byte) ($$c[c] - 1);
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, i7, trimmedLength, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i4++;
                        int i8 = $11 + 91;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        i2 = 2;
                        j = 0;
                        c = 0;
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
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), View.MeasureSpec.makeMeasureSpec(0, 0) + 253, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i10 = $10 + 119;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 5 / 4;
                }
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i12 = $11 + 63;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >>> i] % iIntValue);
                        Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c2 = (char) (33603 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 3085;
                            int offsetBefore = 26 - TextUtils.getOffsetBefore("", 0);
                            byte b4 = $$c[0];
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iNormalizeMetaState, offsetBefore, -2146875848, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cMyPid = (char) ((Process.myPid() >> 22) + 33602);
                            int bitsPerPixel = 3084 - ImageFormat.getBitsPerPixel(0);
                            int mode = View.MeasureSpec.getMode(0) + 26;
                            byte b6 = $$c[0];
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, bitsPerPixel, mode, -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            int i13 = 0;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i14 = $10 + 17;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) (33602 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int i16 = 3086 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int tapTimeout = 26 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte b8 = $$c[0];
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, i16, tapTimeout, -2146875848, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            while (true) {
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13;
                while (true) {
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                    int i17 = $11 + 73;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 + getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] / i] * iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 %= 1;
                    }
                }
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i13 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:106:0x0903  */
        /* JADX WARN: Code duplicated, block: B:112:0x090c A[PHI: r5
  0x090c: PHI (r5v24 java.lang.CharSequence) = 
  (r5v23 java.lang.CharSequence)
  (r5v44 java.lang.CharSequence)
  (r5v44 java.lang.CharSequence)
  (r5v44 java.lang.CharSequence)
 binds: [B:111:0x090a, B:129:0x090c, B:102:0x08f4, B:99:0x08db] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:114:0x0915  */
        /* JADX WARN: Code duplicated, block: B:117:0x0956  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r19v1 */
        /* JADX WARN: Type inference failed for: r19v2 */
        /* JADX WARN: Type inference failed for: r19v7, types: [int] */
        /* JADX WARN: Type inference failed for: r8v122, types: [java.lang.CharSequence] */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Class cls, int i, int i2, int i3) throws Throwable {
            CharSequence charSequence;
            CharSequence charSequence2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            char c;
            String[] strArr;
            Object[] objArr;
            int i10;
            ?? r19;
            String string;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17 = 2 % 2;
            if ((i2 & 2) != 0) {
                String[][] strArr2 = new String[1][];
                try {
                    int i18 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                    Object[] objArr2 = new Object[1];
                    a(null, null, ((i18 | 127) << 1) - (i18 ^ 127), new byte[]{-126, -121, -122, -123, -124, -125, -126, -127}, objArr2);
                    Field declaredField = Class.class.getDeclaredField((String) objArr2[0]);
                    int i19 = TuitionPaymentFragmentbindingInflater1 + 65;
                    asInterface = i19 % 128;
                    int i20 = i19 % 2;
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(cls);
                    Class<?> cls2 = obj.getClass();
                    Object[] objArr3 = new Object[1];
                    a(null, null, 16777342 - (~(-(-Color.rgb(0, 0, 0)))), new byte[]{-126, -118, -119, -120, -125, -126, -127}, objArr3);
                    Field declaredField2 = cls2.getDeclaredField((String) objArr3[0]);
                    declaredField2.setAccessible(true);
                    try {
                        try {
                            Object[] objArr4 = {Long.valueOf(((Number) declaredField2.get(obj)).longValue() & 281474976710655L), strArr2};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486768121);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cMyTid = (char) (41241 - (Process.myTid() >> 22));
                                int i21 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1704;
                                r19 = 21 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                byte b2 = $$a[7];
                                byte b3 = b2;
                                Object[] objArr5 = new Object[1];
                                c(b2, b3, b3, objArr5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, i21, r19, -107095506, false, (String) objArr5[0], new Class[]{Long.TYPE, String[][].class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).longValue();
                            long j = -1979856442;
                            long j2 = i;
                            long j3 = -1;
                            long j4 = j2 ^ j3;
                            long j5 = jLongValue ^ j3;
                            long j6 = (((long) 758) * j) + (((long) (-756)) * jLongValue) + (((long) (-757)) * (j | j4)) + (((long) 1514) * (((j5 | j) | j2) ^ j3)) + (((long) 757) * ((((j ^ j3) | j5) ^ j3) | ((j5 | j4) ^ j3) | ((j2 | (jLongValue | j)) ^ j3))) + ((long) (-126160619));
                            int i22 = ~i;
                            int i23 = (~(1651570621 | i22)) | (-1744107456);
                            int i24 = ~((-1113633430) | i);
                            int i25 = ((int) (j6 >> 32)) & (((i23 | i24) * (-252)) + 8811690 + ((i24 | (~((-92536835) | i22))) * 252));
                            int i26 = (int) j6;
                            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                            int i27 = i26 & ((-484890492) + (((~((-1385704473) | iElapsedRealtime)) | (~(1472036413 | iElapsedRealtime))) * 69) + (((~(iElapsedRealtime | 1453092409)) | (~((-1404648477) | iElapsedRealtime)) | 18944004) * (-69)) + 354800357);
                            int i28 = (i25 & i27) | (i25 ^ i27);
                            if (i28 != 0) {
                                int i29 = (i28 & i22) | ((~i28) & i);
                                String[] strArr3 = new String[4];
                                strArr3[0] = cls.getName();
                                String[] strArr4 = strArr2[0];
                                int i30 = TuitionPaymentFragmentbindingInflater1;
                                int i31 = (i30 & 73) + (i30 | 73);
                                int i32 = i31 % 128;
                                asInterface = i32;
                                int i33 = i31 % 2;
                                strArr3[1] = strArr4[0];
                                strArr3[2] = strArr4[1];
                                strArr3[3] = strArr4[2];
                                int i34 = (i32 & 71) + (i32 | 71);
                                TuitionPaymentFragmentbindingInflater1 = i34 % 128;
                                int i35 = i34 % 2;
                                Object[] objArr6 = new Object[4];
                                int[] iArr = new int[1];
                                objArr6[0] = iArr;
                                int[] iArr2 = new int[1];
                                objArr6[1] = iArr2;
                                objArr6[2] = new int[]{i};
                                int i36 = i32 + 113;
                                TuitionPaymentFragmentbindingInflater1 = i36 % 128;
                                if (i36 % 2 != 0) {
                                    iArr[0] = i29;
                                    int iMyPid = Process.myPid();
                                    int i37 = 773968798 + ((iMyPid | 198960008) * (-50));
                                    int i38 = ~((-163627913) | iMyPid);
                                    int i39 = ~iMyPid;
                                    i15 = i37 + ((i38 | (~((-1342443539) | i39))) * 50);
                                    i16 = ((~(i39 | 198960008)) | (~((-1506071451) | i39)) | 1342443538) * 50;
                                } else {
                                    iArr2[0] = i29;
                                    int iNextInt = new Random().nextInt();
                                    int i40 = ~iNextInt;
                                    i15 = 22618738 + (((~(1454841508 | i40)) | 138969178) * 184) + ((iNextInt | 1343620736) * (-184));
                                    i16 = (~((-250189951) | i40)) * 184;
                                }
                                int i41 = i15 + i16;
                                int i42 = (i41 ^ 16) + ((i41 & 16) << 1) + i3;
                                int i43 = i42 << 13;
                                int i44 = ((~i42) & i43) | ((~i43) & i42);
                                int i45 = i44 >>> 17;
                                int i46 = (i44 | i45) & (~(i44 & i45));
                                int i47 = i46 << 5;
                                ((int[]) objArr6[0])[0] = ((~i46) & i47) | ((~i47) & i46);
                                objArr6[3] = strArr3;
                                return objArr6;
                            }
                            charSequence = "";
                        } catch (Throwable th) {
                            th = th;
                            try {
                                StringWriter stringWriter = new StringWriter();
                                try {
                                    Object[] objArr7 = {new PrintWriter(stringWriter)};
                                    int iMyPid2 = Process.myPid() >> 22;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i48 = ~((460179380 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (460179380 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                    int i49 = (i48 & (-1601040318)) | ((-1601040318) ^ i48);
                                    int i50 = ~((1191488409 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (1191488409 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                    int i51 = -(-(((i49 & i50) | (i49 ^ i50)) * (-744)));
                                    int i52 = (1171479429 ^ i51) + ((i51 & 1171479429) << 1);
                                    int i53 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i54 = -(-(((i53 & 50627472) | (i53 ^ 50627472)) * 744));
                                    int i55 = (i52 & i54) + (i54 | i52);
                                    int i56 = -(-((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 | 1601040317) * 744));
                                    int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                                    int i58 = ~i;
                                    int i59 = -(-(((~((i58 & 725594622) | (725594622 ^ i58))) | 152731920) * (-591)));
                                    int i60 = (((-137767042) | i59) << 1) - (i59 ^ (-137767042));
                                    int i61 = (723427794 & i) | (i ^ 723427794);
                                    int i62 = -(-(((i61 & 154898748) | (i61 ^ 154898748)) * 591));
                                    int i63 = (i60 ^ i62) + ((i62 & i60) << 1);
                                    int i64 = iMyPid2 * (-405);
                                    if (i57 <= i63) {
                                        i12 = i64 >> 51689;
                                        i13 = ~(((-128) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | ((-128) & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                    } else {
                                        i12 = i64 + 51689;
                                        i13 = ~((-128) | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                    }
                                    int i65 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i66 = ~((i65 & iMyPid2) | (i65 ^ iMyPid2) | 127);
                                    int i67 = -(-((-406) * ((i13 & i66) | (i13 ^ i66))));
                                    int i68 = ((i12 | i67) << 1) - (i12 ^ i67);
                                    int i69 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i70 = (i69 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i69);
                                    int i71 = ((i68 + ((~((i70 & iMyPid2) | (i70 ^ iMyPid2))) * (-406))) - (~(-(-(((~((~iMyPid2) | iTuitionPaymentFragmentspecialinlinedviewModeldefault1)) | (~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | 127))) * 406))))) - 1;
                                    Object[] objArr8 = new Object[1];
                                    a(null, null, i71, new byte[]{-126, -118, -108, -123, -109, -110, -111, -121, -112, -115, -113, -114, -123, -118, -115, -123, -116, -123, -117}, objArr8);
                                    Class<?> cls3 = Class.forName((String) objArr8[0]);
                                    int i72 = -TextUtils.lastIndexOf(r19, '0');
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i73 = (i72 * 765) - 192402;
                                    int i74 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i75 = (i74 ^ i72) | (i74 & i72);
                                    int i76 = TuitionPaymentFragmentbindingInflater1;
                                    int i77 = ((i76 | 33) << 1) - (i76 ^ 33);
                                    asInterface = i77 % 128;
                                    if (i77 % 2 == 0) {
                                        int i78 = -((~i75) | 126);
                                        int i79 = i73 >> (((i78 | 764) << 1) - (i78 ^ 764));
                                        int i80 = ~i72;
                                        int i81 = ~((i80 & 126) | (i80 ^ 126));
                                        int i82 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        i14 = i79 / ((-1528) / ((~((i82 & 126) | (i82 ^ 126))) | i81));
                                    } else {
                                        int i83 = ((~i75) | 126) * 764;
                                        i14 = (i73 & i83) + (i83 | i73) + (((~((~i72) | 126)) | (~((i74 ^ 126) | (i74 & 126)))) * (-1528));
                                    }
                                    int i84 = ~((~i72) | 126);
                                    int i85 = ~(i72 | ComposerKt.defaultsKey);
                                    int i86 = -(-(764 * ((i85 & i84) | (i84 ^ i85) | (~i75))));
                                    Object[] objArr9 = new Object[1];
                                    a(null, null, (i14 ^ i86) + ((i86 & i14) << 1), new byte[]{-126, -122, -123, -111, -112, -104, -122, -123, -106, -105, -106, -114, -119, -111, -107}, objArr9);
                                    cls3.getMethod((String) objArr9[0], PrintWriter.class).invoke(th, objArr7);
                                    string = stringWriter.toString();
                                    int i87 = ~i;
                                    String[] strArr5 = {cls.getName(), string};
                                    Object[] objArr10 = new Object[4];
                                    objArr10[0] = new int[1];
                                    int i88 = asInterface;
                                    int i89 = (i88 & 113) + (i88 | 113);
                                    int i90 = i89 % 128;
                                    TuitionPaymentFragmentbindingInflater1 = i90;
                                    int i91 = i89 % 2;
                                    objArr10[1] = new int[]{(i & (-32)) | (i87 & 31)};
                                    objArr10[2] = new int[]{i};
                                    int i92 = i90 + 23;
                                    asInterface = i92 % 128;
                                    int i93 = i92 % 2;
                                    int i94 = 2101027134 + (((~((-671168548) | i87)) | (-1033862912)) * (-591)) + (((-671168548) | i) * 591);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i95 = asInterface;
                                    int i96 = (i95 ^ 99) + ((i95 & 99) << 1);
                                    int i97 = i96 % 128;
                                    TuitionPaymentFragmentbindingInflater1 = i97;
                                    int i98 = i96 % 2;
                                    int i99 = -(-(i94 * (-1343)));
                                    int i100 = (10768 ^ i99) + ((i99 & 10768) << 1);
                                    int i101 = ~((16 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (16 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                    int i102 = -(-(((i101 & i94) | (i94 ^ i101)) * 672));
                                    int i103 = (i100 ^ i102) + ((i102 & i100) << 1);
                                    int i104 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    int i105 = ~((-17) | i104);
                                    int i106 = i97 + 15;
                                    asInterface = i106 % 128;
                                    if (i106 % 2 == 0) {
                                        int i107 = ~((i94 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i94 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                        int i108 = i103 % ((-672) << ((i107 & i105) | (i105 ^ i107)));
                                        int i109 = ~i94;
                                        int i110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        i11 = i108 / (672 - ((~((i110 & i109) | (i109 ^ i110))) | (~((~i94) | 16))));
                                    } else {
                                        int i111 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i94) | (i94 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                        int i112 = i103 + (((i111 & i105) | (i105 ^ i111)) * (-672));
                                        int i113 = ~i94;
                                        int i114 = ((~((i113 & 16) | (i113 ^ 16))) | (~((i113 ^ i104) | (i104 & i113)))) * 672;
                                        i11 = (i112 & i114) + (i114 | i112);
                                    }
                                    int i115 = ((i11 * 1773) - (~(-(-(i3 * (-885)))))) - 1;
                                    int i116 = ~i11;
                                    int i117 = ~i3;
                                    int i118 = (~((i116 & i117) | (i116 ^ i117))) | (~((~i3) | i));
                                    int i119 = (i87 ^ i11) | (i87 & i11);
                                    int i120 = ~((i119 & i3) | (i119 ^ i3));
                                    int i121 = -(-(((i118 & i120) | (i118 ^ i120)) * 886));
                                    int i122 = (i115 ^ i121) + ((i115 & i121) << 1);
                                    int i123 = ~(i3 | i87);
                                    int i124 = ((i123 & i11) | (i11 ^ i123)) * (-1772);
                                    int i125 = ~i;
                                    int i126 = (((i122 & i124) + (i124 | i122)) - (~((~((i125 & i11) | (i125 ^ i11))) * 886))) - 1;
                                    int i127 = (i97 & 113) + (i97 | 113);
                                    int i128 = i127 % 128;
                                    asInterface = i128;
                                    int i129 = i127 % 2;
                                    int i130 = i126 << 13;
                                    int i131 = (i130 | i126) & (~(i126 & i130));
                                    int i132 = i131 >>> 17;
                                    int i133 = (i131 | i132) & (~(i131 & i132));
                                    int i134 = i133 << 5;
                                    ((int[]) objArr10[0])[0] = ((~i133) & i134) | ((~i134) & i133);
                                    objArr10[3] = strArr5;
                                    int i135 = (i128 ^ 27) + ((i128 & 27) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i135 % 128;
                                    if (i135 % 2 == 0) {
                                        return objArr10;
                                    }
                                    throw null;
                                } catch (Throwable th2) {
                                    Throwable cause = th2.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th2;
                                }
                            } catch (Throwable unused) {
                                int i136 = -ExpandableListView.getPackedPositionChild(0L);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i137 = i136 * 628;
                                int i138 = ((i137 | 79128) << 1) - (i137 ^ 79128);
                                int i139 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ 126) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & 126);
                                int i140 = ~i136;
                                int i141 = ~(((-127) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-127) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                int i142 = ((i138 + (((i139 & i140) | (i139 ^ i140)) * (-627))) - (~(((i141 & i136) | (i136 ^ i141)) * (-627)))) - 1;
                                int i143 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                int i144 = ~((i143 & 126) | (i143 ^ 126));
                                int i145 = ~((i136 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i136 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                int i146 = -(-(((i145 & i144) | (i144 ^ i145)) * 627));
                                Object[] objArr11 = new Object[1];
                                a(null, null, ((i142 | i146) << 1) - (i146 ^ i142), new byte[]{-115}, objArr11);
                                string = (String) objArr11[0];
                            }
                        }
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r19 = "";
                }
            } else {
                charSequence = "";
            }
            int[] iArr3 = {-1844476378, 1276062274, -797088743, 965014536, -30564408, 800164665, 427080095, -63109426, -2128711273, 443823261, -421827424, -1596256068, -554832609, -49350782, -437871410, 1291703475, -587285223, 1359539528, -706062319, 1866472215};
            String[][] strArr6 = new String[1][];
            int iCurrentTimeMillis = ((int) System.currentTimeMillis()) ^ 343337308;
            try {
                Object[] objArr12 = {Integer.valueOf(i ^ iCurrentTimeMillis), iArr3, Integer.valueOf(i2), strArr6};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-561316232);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c2 = (char) (43043 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int absoluteGravity = 3111 - Gravity.getAbsoluteGravity(0, 0);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    c(b4, b5, b5, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, absoluteGravity, pressedStateDuration, 974412207, false, (String) objArr13[0], new Class[]{Integer.TYPE, int[].class, Integer.TYPE, String[][].class});
                }
                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr12)).longValue();
                long j7 = -497654657;
                long j8 = 371;
                long j9 = (j8 * j7) + (j8 * jLongValue2);
                long j10 = -370;
                CharSequence charSequence3 = charSequence;
                long j11 = -1;
                long j12 = jLongValue2 ^ j11;
                long jNextInt = new Random().nextInt(1351579153);
                long j13 = jNextInt ^ j11;
                long j14 = j7 ^ j11;
                long j15 = (jLongValue2 | j7) ^ j11;
                long j16 = j9 + ((((j12 | j13) ^ j11) | ((j14 | jNextInt) ^ j11)) * j10) + (j10 * (((j14 | j13) ^ j11) | ((j12 | jNextInt) ^ j11) | j15)) + (((long) 370) * j15) + ((long) 601388722);
                int i147 = (int) Runtime.getRuntime().totalMemory();
                int i148 = ((int) (j16 >> 32)) & ((-2072279902) + ((~((~i147) | (-341847190))) * (-116)) + (((-359673270) | i147) * 116) + (((~(i147 | (-1796899681))) | 1779073600) * 116));
                int i149 = ~i;
                int i150 = ((int) j16) & (1874331217 + (((~(478111920 | i149)) | (~(959114489 | i))) * 217) + (((~(478111920 | i)) | (-1031793914)) * 217) + (((~(959114489 | i149)) | (-478111921)) * 217));
                int i151 = (i148 & i150) | (i148 ^ i150);
                int i152 = (i151 | iCurrentTimeMillis) & (~(i151 & iCurrentTimeMillis));
                if (i152 != i) {
                    int i153 = TuitionPaymentFragmentbindingInflater1 + 17;
                    int i154 = i153 % 128;
                    asInterface = i154;
                    if (i153 % 2 == 0) {
                        i9 = 1;
                        strArr = strArr6[1];
                        objArr = new Object[2];
                        c = 0;
                        objArr[1] = new int[0];
                        i10 = 0;
                    } else {
                        i9 = 1;
                        c = 0;
                        strArr = strArr6[0];
                        objArr = new Object[4];
                        objArr[0] = new int[1];
                        i10 = 1;
                    }
                    objArr[i10] = new int[i10];
                    int[] iArr4 = new int[i9];
                    objArr[2] = iArr4;
                    iArr4[c] = i;
                    ((int[]) objArr[i9])[c] = i152;
                    int i155 = (-872315614) + (((~(1436540625 | i)) | 268490833) * (-756)) + ((1436540625 | i149) * 756);
                    int i156 = i155 * 949;
                    int i157 = ((-15152) ^ i156) + ((i156 & (-15152)) << 1);
                    int i158 = ~i155;
                    int i159 = ~((i158 ^ i) | (i158 & i));
                    int i160 = (i157 - (~(((i159 & (-17)) | ((-17) ^ i159)) * (-948)))) - 1;
                    int i161 = (~((~i) | (-17) | (~i155))) * (-948);
                    int i162 = (i160 & i161) + (i161 | i160);
                    int i163 = (i158 | 16) * 948;
                    int i164 = -(-(((i162 | i163) << 1) - (i163 ^ i162)));
                    int i165 = (i3 & i164) + (i3 | i164);
                    int i166 = i165 << 13;
                    int i167 = (i166 & (~i165)) | ((~i166) & i165);
                    int i168 = i167 ^ (i167 >>> 17);
                    ((int[]) objArr[0])[0] = i168 ^ (i168 << 5);
                    objArr[3] = strArr;
                    int i169 = (i154 ^ 85) + ((i154 & 85) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i169 % 128;
                    int i170 = i169 % 2;
                    return objArr;
                }
                int i171 = 16;
                try {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i172 = asInterface;
                    int i173 = i172 + 15;
                    TuitionPaymentFragmentbindingInflater1 = i173 % 128;
                    if (i173 % 2 != 0) {
                        i6 = (868 >> iMakeMeasureSpec) / 0;
                        int i174 = ~iMakeMeasureSpec;
                        int i175 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        i7 = (i174 & i175) | (i174 ^ i175);
                    } else {
                        int i176 = iMakeMeasureSpec * 868;
                        i6 = (i176 | 110236) + (i176 & 110236);
                        i7 = (~iMakeMeasureSpec) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                    }
                    int i177 = ~i7;
                    int i178 = (i172 ^ 83) + ((i172 & 83) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i178 % 128;
                    int i179 = i178 % 2;
                    int i180 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    int i181 = ~(((-128) ^ i180) | ((-128) & i180));
                    int i182 = (-867) * ((i177 & i181) | (i177 ^ i181));
                    int i183 = (i6 & i182) + (i6 | i182);
                    int i184 = ~iMakeMeasureSpec;
                    int i185 = (i172 ^ 75) + ((i172 & 75) << 1);
                    int i186 = i185 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i186;
                    int i187 = i185 % 2;
                    int i188 = ~((i184 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i184 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                    int i189 = ~(i184 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                    int i190 = (i188 & i189) | (i188 ^ i189);
                    int i191 = ~(((-128) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | ((-128) & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                    int i192 = (i190 & i191) | (i190 ^ i191);
                    int i193 = i186 + 79;
                    int i194 = i193 % 128;
                    asInterface = i194;
                    int i195 = i193 % 2;
                    int i196 = (-1734) * i192;
                    int i197 = (i183 ^ i196) + ((i196 & i183) << 1);
                    int i198 = ~iMakeMeasureSpec;
                    int i199 = (i198 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i198 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                    int i200 = ~((i199 & i180) | (i199 ^ i180));
                    int i201 = i184 | 127;
                    int i202 = ~((i201 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i201 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                    int i203 = (i200 & i202) | (i200 ^ i202);
                    int i204 = ~((iMakeMeasureSpec & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ iMakeMeasureSpec) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                    int i205 = ((i204 & i203) | (i203 ^ i204)) * 867;
                    int i206 = (i194 ^ 43) + ((i194 & 43) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i206 % 128;
                    int i207 = i206 % 2;
                    Object[] objArr14 = new Object[1];
                    a(null, null, (i197 & i205) + (i205 | i197), new byte[]{-127, -123, -126, -111, -121, -112, -102, -106, -119, -116, -119, -106, -122, -103, -115, -107, -107, -123, -115, -127, -119, -110, -111, -127, -114, -123}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    charSequence2 = charSequence3;
                    try {
                        int i208 = -TextUtils.lastIndexOf(charSequence2, '0', 0);
                        int i209 = (i208 & 126) + (i208 | 126);
                        byte[] bArr = {-114, -110, -119, -106, -123, -122, -119, -118, -107, -107, -103, -106, -114, -126, -111, -111, -101, -122};
                        int i210 = TuitionPaymentFragmentbindingInflater1;
                        int i211 = ((i210 | 67) << 1) - (i210 ^ 67);
                        asInterface = i211 % 128;
                        if (i211 % 2 == 0) {
                            Object[] objArr15 = new Object[1];
                            a(null, null, i209, bArr, objArr15);
                            if (cls4.getMethod((String) objArr15[0], new Class[0]).invoke(null, null) == null) {
                                i8 = TuitionPaymentFragmentbindingInflater1 + 15;
                                asInterface = i8 % 128;
                                if (i8 % 2 == 0) {
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                i4 = i;
                            } else {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cLastIndexOf = (char) (22877 - TextUtils.lastIndexOf(charSequence2, '0', 0));
                                    int iIndexOf = 593 - TextUtils.indexOf(charSequence2, '0', 0);
                                    int capsMode = TextUtils.getCapsMode(charSequence2, 0, 0) + 17;
                                    byte[] bArr2 = $$a;
                                    byte b6 = bArr2[5];
                                    Object[] objArr16 = new Object[1];
                                    c(b6, bArr2[7], b6, objArr16);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iIndexOf, capsMode, -1471475267, false, (String) objArr16[0], null);
                                }
                                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null) != 0) {
                                    i4 = i ^ 9;
                                } else {
                                    i4 = i;
                                }
                            }
                        } else {
                            Object[] objArr17 = new Object[1];
                            a(null, null, i209, bArr, objArr17);
                            if (cls4.getMethod((String) objArr17[0], new Class[0]).invoke(null, null) == null) {
                                i8 = TuitionPaymentFragmentbindingInflater1 + 15;
                                asInterface = i8 % 128;
                                if (i8 % 2 == 0) {
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                            } else {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cLastIndexOf2 = (char) (22877 - TextUtils.lastIndexOf(charSequence2, '0', 0));
                                    int iIndexOf2 = 593 - TextUtils.indexOf(charSequence2, '0', 0);
                                    int capsMode2 = TextUtils.getCapsMode(charSequence2, 0, 0) + 17;
                                    byte[] bArr3 = $$a;
                                    byte b7 = bArr3[5];
                                    Object[] objArr18 = new Object[1];
                                    c(b7, bArr3[7], b7, objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf2, iIndexOf2, capsMode2, -1471475267, false, (String) objArr18[0], null);
                                }
                                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null) != 0) {
                                    i4 = i ^ 9;
                                }
                            }
                            i4 = i;
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    charSequence2 = charSequence3;
                }
                if (i4 != i) {
                    int i212 = asInterface;
                    int i213 = (i212 & 121) + (i212 | 121);
                    TuitionPaymentFragmentbindingInflater1 = i213 % 128;
                    int i214 = i213 % 2;
                    i5 = 0;
                } else {
                    i5 = 0;
                    i171 = 0;
                }
                Object[] objArr19 = new Object[4];
                objArr19[i5] = new int[]{i};
                objArr19[1] = new int[]{i4};
                objArr19[2] = new int[]{i};
                int i215 = TuitionPaymentFragmentbindingInflater1;
                int i216 = ((i215 | 23) << 1) - (i215 ^ 23);
                asInterface = i216 % 128;
                int i217 = i216 % 2;
                int i218 = 966888383 + (((~((-1072400148) | i149)) | 632631311) * (-602)) + (((~((-1072400148) | i)) | 631308291 | (~(1073723167 | i149))) * (-301)) + ((~(i149 | 632631311)) * 301) + i171;
                int i219 = ((i3 | i218) << 1) - (i3 ^ i218);
                int i220 = i219 << 13;
                int i221 = ((~i219) & i220) | ((~i220) & i219);
                int i222 = i221 >>> 17;
                int i223 = (i221 | i222) & (~(i221 & i222));
                int i224 = i223 << 5;
                int i225 = ((~i223) & i224) | ((~i224) & i223);
                int i226 = (i215 ^ 51) + ((i215 & 51) << 1);
                asInterface = i226 % 128;
                int i227 = i226 % 2;
                objArr19[3] = new String[i5];
                int i228 = i215 + 69;
                asInterface = i228 % 128;
                int i229 = i228 % 2;
                return objArr19;
            } catch (Throwable th5) {
                Throwable cause3 = th5.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th5;
            }
        }

        private static String $$e(byte b2, byte b3, byte b4) {
            int i = 68 - b2;
            byte[] bArr = $$c;
            int i2 = b4 * 2;
            int i3 = (b3 * 4) + 4;
            byte[] bArr2 = new byte[i2 + 1];
            int i4 = -1;
            if (bArr == null) {
                i3++;
                i = i2 + i;
            }
            while (true) {
                i4++;
                bArr2[i4] = (byte) i;
                if (i4 == i2) {
                    return new String(bArr2, 0);
                }
                int i5 = bArr[i3];
                i3++;
                i += i5;
            }
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments != null ? (KpjRsjht) arguments.getParcelable("key_kpj_klaim") : null;
        }
        Bundle arguments2 = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = arguments2 != null ? (KpjParcelItem) arguments2.getParcelable("jht_rsjht") : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentChooseKpjBottomSheetBinding fragmentChooseKpjBottomSheetBinding = this.d;
        if (fragmentChooseKpjBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseKpjBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentChooseKpjBottomSheetBinding.rvChooseKpj;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((Camera2CapturePipelinePipelineExternalSyntheticLambda0) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        KpjRsjht kpjRsjht = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (kpjRsjht != null) {
            Iterable iterable = ((Camera2CapturePipelinePipelineExternalSyntheticLambda0) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d;
            Intrinsics.checkNotNullExpressionValue(iterable, "");
            int i = 0;
            for (Object obj : iterable) {
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                KpjRsjht kpjRsjht2 = (KpjRsjht) obj;
                kpjRsjht2.b = Intrinsics.areEqual(kpjRsjht.TuitionPaymentFragmentspecialinlinedviewModeldefault3, kpjRsjht2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                ((Camera2CapturePipelinePipelineExternalSyntheticLambda0) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d.set(i, (Data) kpjRsjht2);
                FragmentChooseKpjBottomSheetBinding fragmentChooseKpjBottomSheetBinding2 = this.d;
                if (fragmentChooseKpjBottomSheetBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fragmentChooseKpjBottomSheetBinding2 = null;
                }
                fragmentChooseKpjBottomSheetBinding2.rvChooseKpj.scrollToPosition(i);
                i++;
            }
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getA() {
        return this.a;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentChooseKpjBottomSheetBinding fragmentChooseKpjBottomSheetBindingInflate = FragmentChooseKpjBottomSheetBinding.inflate(p0, p1, false);
        this.d = fragmentChooseKpjBottomSheetBindingInflate;
        if (fragmentChooseKpjBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseKpjBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentChooseKpjBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static /* synthetic */ Camera2CapturePipelinePipelineExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline) {
        ArrayList arrayListEmptyList;
        List<JhtBalance> list;
        ChooseKpjRsjhtBottomSheetFragment$chooseKpjAdapter$2$1 chooseKpjRsjhtBottomSheetFragment$chooseKpjAdapter$2$1 = new ChooseKpjRsjhtBottomSheetFragment$chooseKpjAdapter$2$1(lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline);
        Context contextRequireContext = lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        KpjParcelItem kpjParcelItem = lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (kpjParcelItem == null || (list = kpjParcelItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
            arrayListEmptyList = null;
        } else {
            List<JhtBalance> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (JhtBalance jhtBalance : list2) {
                arrayList.add(new KpjRsjht(jhtBalance.TuitionPaymentFragmentbindingInflater1, jhtBalance.b.toString(), false, jhtBalance.a, jhtBalance.notify, jhtBalance.TuitionPaymentFragmentspecialinlinedviewModeldefault2, jhtBalance.TuitionPaymentFragmentspecialinlinedviewModeldefault3, jhtBalance.cancelAll));
            }
            arrayListEmptyList = arrayList;
        }
        if (arrayListEmptyList == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        return new Camera2CapturePipelinePipelineExternalSyntheticLambda0(contextRequireContext, arrayListEmptyList, chooseKpjRsjhtBottomSheetFragment$chooseKpjAdapter$2$1);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline, KpjRsjht kpjRsjht) {
        lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kpjRsjht;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ChooseKpjRsjhtBottomSheetFragment$handleItemClicked$1(lambdaexecuteprecapture1androidxcameracamera2internalcamera2capturepipelinepipeline, kpjRsjht, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lambdaexecutePreCapture1androidxcameracamera2internalCamera2CapturePipelinePipeline() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
