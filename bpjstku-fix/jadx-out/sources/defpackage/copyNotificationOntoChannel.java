package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.jht.model.response.ClaimEvidenceJhtItem;
import com.bpjstku.data.jht.model.response.ClaimEvidenceJhtResponse;
import com.bpjstku.databinding.FragmentEvidenceClaimButtomSheetBinding;
import com.bpjstku.domain.notification.model.Notification;
import com.bpjstku.presentation.program.jht.olddaysecurity.evidence.ReceiptClaimOldDaySecurityActivity;
import com.bpjstku.util.enums.NotificationType;
import com.kennyc.view.MultiStateView;
import defpackage.CoordinateTransform;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.ZoomGestureDetectorZoomEvent;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isModeInList;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.mapPoint;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Locale;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0015\u0010\u001c\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0016\u0010\u001a\u001a\u00020\u001f8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\u0012\u001a\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\""}, d2 = {"LcopyNotificationOntoChannel;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/notification/model/Notification;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "asInterface", "Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/domain/notification/model/Notification;", "LisModeInList;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;", "Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;", "Lcom/bpjstku/databinding/FragmentEvidenceClaimButtomSheetBinding;", "Lcom/bpjstku/databinding/FragmentEvidenceClaimButtomSheetBinding;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class copyNotificationOntoChannel extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private FragmentEvidenceClaimButtomSheetBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private Notification b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private ClaimEvidenceJhtItem TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Function1<Notification, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
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

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_evidence_claim_buttom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    public /* synthetic */ copyNotificationOntoChannel(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public copyNotificationOntoChannel(Function1<? super Notification, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        final copyNotificationOntoChannel copynotificationontochannel = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<isModeInList>() { // from class: com.bpjstku.presentation.notification.NotificationBottomSheet$special$$inlined$inject$default$1
            private static short[] TuitionPaymentFragmentbindingInflater1;
            private static char[] asBinder;
            private static long asInterface;
            private static final byte[] $$c = {42, -104, -68, 105};
            private static final int $$f = 86;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {70, -114, 113, 8, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
            private static final int $$e = 195;
            private static final byte[] $$a = {114, -59, 10, 31, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 56, 5, 16, 5, -67, 45, -32, -2, 12, 13, 37, 16, 5, -8, 0, 6, -3, 1, 22, -12, 1, 18, -44, 54, -1, -12, 12, 8, -7, 9, 2, -21, 14, 14, 12, -13};
            private static final int $$b = 39;
            private static int $d = 0;
            private static int $a = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 270345626;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795561;
            private static int b = -1977145934;
            private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-21, 25, -26, 23, -43, Base64.padSymbol, 31, 25, -59, -8, 89, -32, 29, -90, 43, 13, -13, 17, 23, -11, -5, -16, 36, -27, 19, 25, -95, 43, 13, -13, 17, -19, 1, 20, 25, 29, 18, -26, -63, 36, -27, 19, 25, -95, 43, 13, -13, 17, 29, 18, -26, 14, 24, -19, 16, -21, 9, 21, -27, 29, -57, 60, -14, -4, 1, 29, 28, 27, -24, 16, -53, 21, -27, 29, -57, 60, -14, -4, -5, 83, -29, -19, 17, 27, -12, 24, 20, -93, 43, 13, -13, 17, -9, 27, 16, -17, 31, -19, -8, -13, 36, -27, 19, 25, -95, 43, 13, -13, 17, 89, -38, -25, -27, 36, -21, 24, 20, -17, 29, -31, 48, -31, -27, 29, -9, -28, -3, 7, 23, -11, 24, 28, -27, 27, 19, -28, -21, -60, -13, 92, -28, -21, -28, -45, 83, -29, -19, 17, 27, -12, 24, 20, -93, 43, 13, -13, 17, 25, -25, 19, -22, 19, -49, 55, -23, 24, 23, -11, 24, 28, -27, 27, 19, -28, -21, -60, 56, 23, -11, 9, -21, 17, -17, 24, -32, -27, 27, -27, 26, -30, 19, -31, -25, -26, -26, -27, 27, -27, 28, -32, 27, -27, 30, -18, 29, -29, 27, -21, 25, -26, 23, -43, -14, 89, -32, 29, -90, 43, 13, -13, 17, -19, 26, -30, 27, -2, 9, -26, -41, 58, 23, 29, -47, 53, 29, 30, -22, -11, 15, 24, -32, 16, -18, -28, -9, 58, -23, 24, -21, 24, -32, 21, -21, -14, 14, 24, -32, 16, -18, -28, -9, 58, -23, 24, 19, -31, 18, -23, -2, -7, 92, -9, 24, 31, -32, -25, 21, -94, 33, 31, -21, 19, -40, 43, 13, -13, 17, -27, 29, -11, 26, 21, -23, -46, 9, -21, 19, -11, -11, Base64.padSymbol, -20, -25, -24, 24, 24, -61, 57, 24, -32, 8, -26, -24, -2, -7, 83, -29, -19, 17, 27, -12, 24, 20, -93, 43, 13, -13, 17, 13, -13, -15, -28, -28, 9, -8, 15, -18, -28, 11, -57, 57, -32, -29, 17, -28, 24, -32, 8, -26, -24, -2, 63, -23, 24, 0, -9, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26, -26};
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 + 84
                    int r6 = r6 + 1
                    int r8 = 92 - r8
                    byte[] r0 = com.bpjstku.presentation.notification.NotificationBottomSheet$special$$inlined$inject$default$1.$$d
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L10
                    r3 = r6
                    r4 = r2
                    goto L24
                L10:
                    r3 = r2
                L11:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    int r8 = r8 + 1
                    if (r4 != r6) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L22:
                    r3 = r0[r8]
                L24:
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    r3 = r4
                    goto L11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.notification.NotificationBottomSheet$special$$inlined$inject$default$1.d(byte, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void e(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 17
                    int r6 = r6 + 17
                    int r8 = r8 * 3
                    int r8 = r8 + 103
                    byte[] r0 = com.bpjstku.presentation.notification.NotificationBottomSheet$special$$inlined$inject$default$1.$$a
                    int r7 = r7 * 33
                    int r7 = 37 - r7
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r8
                    r4 = r2
                    r8 = r6
                    goto L29
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r6) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    r3 = r0[r7]
                L29:
                    int r8 = r8 + r3
                    int r7 = r7 + 1
                    int r8 = r8 + (-3)
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.notification.NotificationBottomSheet$special$$inlined$inject$default$1.e(byte, byte, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [isModeInList, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final isModeInList invoke() {
                ZoomGestureDetectorZoomEvent koin;
                int i = 2 % 2;
                int i2 = $d + 25;
                int i3 = i2 % 128;
                $a = i3;
                int i4 = i2 % 2;
                ComponentCallbacks componentCallbacks = copynotificationontochannel;
                mapPoint mappoint = this.$qualifier;
                Function0<CoordinateTransform> function0 = this.$parameters;
                if (!(!(componentCallbacks instanceof getEventTime))) {
                    int i5 = i3 + 1;
                    $d = i5 % 128;
                    int i6 = i5 % 2;
                    koin = ((getEventTime) componentCallbacks).getKoin();
                } else {
                    ZoomGestureDetectorZoomEvent zoomGestureDetectorZoomEvent = ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
                    int i7 = $a + 125;
                    $d = i7 % 128;
                    int i8 = i7 % 2;
                    koin = zoomGestureDetectorZoomEvent;
                }
                return koin.b.b(Reflection.getOrCreateKotlinClass(isModeInList.class), mappoint, function0);
            }

            private static void c(char c, int i, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i4 = $11 + 13;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = {Integer.valueOf(asBinder[i + i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 2187 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 40, 841711447, false, $$g(b2, (byte) (b2 | 12), b2), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(asInterface), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33018 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3011, 26 - Color.argb(0, 0, 0, 0), 321985076, false, $$g(b3, (byte) (b3 | 6), b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 36505), KeyEvent.getDeadChar(0, 0) + 3376, AndroidCharacter.getMirror('0') - 31, -968507904, false, $$g(b4, (byte) (b4 | 9), b4), new Class[]{Object.class, Object.class});
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
                    int i7 = $10 + 59;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        try {
                            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b5 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - View.resolveSize(0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 3377, 17 - (ViewConfiguration.getScrollBarSize() >> 8), -968507904, false, $$g(b5, (byte) (b5 | 9), b5), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                            throw null;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b6 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf("", "") + 36505), 3376 - (ViewConfiguration.getFadingEdgeLength() >> 16), Process.getGidForName("") + 18, -968507904, false, $$g(b6, (byte) (b6 | 9), b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr);
            }

            /* JADX WARN: Code duplicated, block: B:39:0x01ad A[PHI: r3
  0x01ad: PHI (r3v9 int) = (r3v8 int), (r3v50 int) binds: [B:38:0x01ab, B:35:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:40:0x01b7 A[PHI: r3
  0x01b7: PHI (r3v47 int) = (r3v8 int), (r3v50 int) binds: [B:38:0x01ab, B:35:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
            private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
                int i4;
                int i5;
                int i6 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int edgeSlop = 2267 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 33;
                        byte length = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, edgeSlop, iCombineMeasuredStates, 1387473586, false, $$g((byte) 0, length, (byte) (length - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    boolean z = iIntValue == -1;
                    if (z) {
                        byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (bArr != null) {
                            int length2 = bArr.length;
                            byte[] bArr2 = new byte[length2];
                            for (int i7 = 0; i7 < length2; i7++) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 3358 - Color.argb(0, 0, 0, 0), 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1054011043, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                                }
                                bArr2[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2267;
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 34;
                                byte length3 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, minimumFlingVelocity, iIndexOf, 1387473586, false, $$g((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                            int i8 = $10 + 67;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                        } else {
                            iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue > 0) {
                        int i10 = $10;
                        int i11 = i10 + 63;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            i4 = ((i3 * iIntValue) >> 4) % ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) % 3046761265686732006L));
                            if (z) {
                                int i12 = i10 + 63;
                                $11 = i12 % 128;
                                int i13 = i12 % 2;
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                        } else {
                            i4 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                            if (z) {
                                int i14 = i10 + 63;
                                $11 = i14 % 128;
                                int i15 = i14 % 2;
                                i5 = 1;
                            } else {
                                i5 = 0;
                            }
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                        Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(b), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - (ViewConfiguration.getTapTimeout() >> 16)), 2855 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 13, -1529949196, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (bArr4 != null) {
                            int length4 = bArr4.length;
                            byte[] bArr5 = new byte[length4];
                            for (int i16 = 0; i16 < length4; i16++) {
                                bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 3046761265686732006L);
                            }
                            bArr4 = bArr5;
                        }
                        boolean z2 = bArr4 != null;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            if (z2) {
                                int i17 = $11 + 67;
                                $10 = i17 % 128;
                                if (i17 % 2 != 0) {
                                    byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / (((byte) (((byte) (((long) bArr6[i18]) + 3046761265686732006L)) >>> s)) ^ b2));
                                } else {
                                    byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                                }
                            } else {
                                short[] sArr = TuitionPaymentFragmentbindingInflater1;
                                int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 272591. Try increasing type updates limit count.
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context r64, java.lang.String[] r65, int r66, int r67, int r68) {
                /*
                    Method dump skipped, instruction units count: 27259
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.notification.NotificationBottomSheet$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
            }

            static {
                char[] cArr = new char[524];
                ByteBuffer.wrap("±¦/\u0087T\u0090Ù¾^\u0096ÃÚHúÍêr\u0012÷&|>áW±ðÊæG×ÀÇ±ïÊìGÂÀ÷]¡Ö\u0098S\u0087<BGRÊm±ûÊìGÂÀ÷]¡Ö\u0098S\u0087±öÊèGÀÀÂ]æÖ\u0086S\u0087ìliAâS\u007f'ø\u000fu\u0019ñ£\nÉ\u0087×\u0000©\u009d\u009a\u0016È\u0093V,{©b\"7¿\u001184´ð1ÌJÊÇ½@\u0098Ý\u009eVrÓNlzé&b&ÿ\u000by_\u0002Q\u008fg\b\u001e\u0095j\u001eP\u009bDÏý´î±öÊèGÀÀÂ]æÖ\u0086S\u0087ìliAâS\u007f'ø\u000fu\u0019ñ£\nñ\u0087Â\u0000µ\u009d©\u0016\u0087\u0093z,J©b\"7¿\u00118\u0001´ã1ßJßÇ¿@\u008f±ûÊìGÂÀà]\u00adÖ\u0087S\u0096ìfiRâH\u007f-ø\u001au\u0014ñè\nù\u0087Ï\u0000\u00ad\u009d\u0090\u0016\u0088úf\u0081x\fP\u008bR\u0016v\u009d\u0016\u0018\u0017§ü\"Ñ©Ã4·³\u009f>\u0089º3AIÌRK.Ö\u001d]XØÀgÍâÇi¶ô\u0086s\u0092ÿhzM\u0001Z\u008c4\u000b\b±öÊèGÀÀÂ]æÖ\u009bS\u008bì`i\u001aâc\u007f7ø\u000fu\u0005ñÏ\nÏ\u0087Á\u0000ª\u009d\u009c\u0016\u0094±ëÊûG×ÀÓ\u008c.÷)z)ý\u001f`uëAnsÑ©T\u0081ß\u0094BøÅÚ\u008c°÷§z\u0089±öÊèGÀÀÂ]æÖ\u0099S\u0083ìaiSâ\u000f\u007f\u0002ø\u0014u\u000eñê±èÊæGþÀÆ]°Ö¦S\u0096ì}i]âO\u007f)±ÿÊèGÆÀÂ]«Ö\u009cS\u0096ìvqF\n\\\u0087i\u0000j\u009d\u001c\u0016'\u0093=,\u009a©ì\"õ¿\u009b8´µ¾1XÊuG2À\u0007]/ÖsSûìêiùâ\u0087\u007f¥ø«t_ñw\u008auQ;*,§\u0002 3½i6V³I\f®\u0089\u0093\u0002\u0084\u009fÇ\u0018Õ\u0095Æ\u0011\"|µ\u0007¯\u008a\u009a\r\u0099\u0090ï\u001bÔ\u009eÎ!i¤\u001f/\u0006²h5G¸M<«Ç\u0086JÁÍÇPÞÛÀ^/á\u0015d\u0015ïn±ûÊìGÂÀî]§Ö\u0091S\u008bìii]âD\u007f<ø\b±¸±íÊóGÛÀÙ]ýÖ\u0082S\u0098ìziHâ\u0014\u007f'ø\u0005u\u001dñú\nÄ\u0087ß\u0000£\u009dÌ\u0016°\u0093g,G©W\"/¿\r8\u001a´ø¼\u001eÇ\tJ'Í\u0014PHÛd^rá\u0098d¿ï\u0090rÒõîxà±ûÊìGÂÀó]©Ö\u0087S\u0083ìbiQâU\u007f+ø\tu4ñô\nÊ\u0087Â\u0000¿e-\u001e7\u0093\u0002\u0014\u0001\u0089w\u0002L\u0087V8ñ½\u00876\u009e«ð,ß¡Õ%3Þ\u001eSYÔlIDÂ\u0018G\u0093ø\u0089}\u0096öékÎìÓ`$å#\u009e\u001a\u0013n\u0094L\t]\u0082¢\u0007\u009e±ÑÊÍG\u0083\u0017òlèáÝfÞû¨p\u0093õ\u0089J.ÏXDAÙ/^\u0000Ó\nWì¬Á!\u0086¦³;\u009b°Ç5L\u008aV\u000fI\u00846\u0019\u0011\u009e\f\u0012û\u0097øìÊa¹æ\u009d±ïÊàGÑÀÍ]©Ö\u0081S\u0097ì}iQâR±øÊàGÑÀÆ]»Ö\u0081±öÊèGÀÀÂ]æÖ\u0099S\u0083ìaiSâ\u000f\u007f\u001aø\u0013u\u0012ñâ\nÍ\u0087Æ\u0000®\u009d\u0095\u0016\u0083X&#1®\u001f)=´t?]ºL\u0005·±ÉÊçGÓÀÛ]¸Ö\u0090S\u0081ì{iQâE\u007fnø\u001eu\u0012ñÿ\nÕ\u0087Õ\u0000ì\u009d\u009f\u0016\u0083\u0093g,[©M\";¿\u00118\u0003´±1ÍJßÇ±@\u009eÝ\u0081V7ÓHl[é7b ÿ\r{µôëqÁ\u008a²\u0007®\u0080\u009c\u001dv\u0096a\u0013Y¬3)(¢\u0002>£»¦4\u009b".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 524);
                asBinder = cArr;
                asInterface = -5525025194865341815L;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0020  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(int r5, int r6, int r7) {
                /*
                    int r5 = r5 * 2
                    int r5 = 4 - r5
                    byte[] r0 = com.bpjstku.presentation.notification.NotificationBottomSheet$special$$inlined$inject$default$1.$$c
                    int r6 = 121 - r6
                    int r7 = r7 * 3
                    int r1 = r7 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r4 = r7
                    r3 = r2
                    goto L24
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r7) goto L20
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L20:
                    r4 = r0[r5]
                    int r3 = r3 + 1
                L24:
                    int r6 = r6 + r4
                    int r5 = r5 + 1
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.notification.NotificationBottomSheet$special$$inlined$inject$default$1.$$g(int, int, int):java.lang.String");
            }
        });
    }

    /* JADX INFO: renamed from: copyNotificationOntoChannel$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LcopyNotificationOntoChannel$b;", "", "<init>", "()V", "Lcom/bpjstku/domain/notification/model/Notification;", "p0", "Lkotlin/Function1;", "", "p1", "LcopyNotificationOntoChannel;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/domain/notification/model/Notification;Lkotlin/jvm/functions/Function1;)LcopyNotificationOntoChannel;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static copyNotificationOntoChannel TuitionPaymentFragmentspecialinlinedviewModeldefault3(Notification p0, Function1<? super Notification, Unit> p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            copyNotificationOntoChannel copynotificationontochannel = new copyNotificationOntoChannel(p1);
            Bundle bundle = new Bundle();
            bundle.putParcelable("notification", p0);
            copynotificationontochannel.setArguments(bundle);
            return copynotificationontochannel;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentEvidenceClaimButtomSheetBinding fragmentEvidenceClaimButtomSheetBindingInflate = FragmentEvidenceClaimButtomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = fragmentEvidenceClaimButtomSheetBindingInflate;
        if (fragmentEvidenceClaimButtomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEvidenceClaimButtomSheetBindingInflate = null;
        }
        MultiStateView root = fragmentEvidenceClaimButtomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bundle arguments = getArguments();
        this.b = arguments != null ? (Notification) arguments.getParcelable("notification") : null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentEvidenceClaimButtomSheetBinding fragmentEvidenceClaimButtomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentEvidenceClaimButtomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEvidenceClaimButtomSheetBinding = null;
        }
        Notification notification = this.b;
        if (notification != null) {
            if (Intrinsics.areEqual(notification.type, NotificationType.APPROVED_CLAIM.getType())) {
                fragmentEvidenceClaimButtomSheetBinding.iconNotification.setImageResource(R.drawable.ic_notif_approved_claim);
                fragmentEvidenceClaimButtomSheetBinding.tvNotificationClaim.setText(notification.title);
                fragmentEvidenceClaimButtomSheetBinding.tvInfoMessageNotification.setText(notification.message);
                String lowerCase = notification.title.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (StringsKt.startsWith$default(lowerCase, "pembayaran klaim", false, 2, (Object) null)) {
                    ((isModeInList) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1("NOTIFIKASI", (String) StringsKt.split$default((CharSequence) notification.notificationCode, new String[]{"#"}, false, 0, 6, (Object) null).get(0));
                    return;
                } else {
                    fragmentEvidenceClaimButtomSheetBinding.btnDownloadEvidenceTransaction.setVisibility(8);
                    return;
                }
            }
            fragmentEvidenceClaimButtomSheetBinding.iconNotification.setImageResource(R.drawable.ic_sample_notification);
            TextView textView = fragmentEvidenceClaimButtomSheetBinding.tvNotificationClaim;
            Notification notification2 = this.b;
            textView.setText(notification2 != null ? notification2.title : null);
            TextView textView2 = fragmentEvidenceClaimButtomSheetBinding.tvInfoMessageNotification;
            Notification notification3 = this.b;
            textView2.setText(notification3 != null ? notification3.message : null);
            fragmentEvidenceClaimButtomSheetBinding.btnDownloadEvidenceTransaction.setVisibility(8);
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentEvidenceClaimButtomSheetBinding fragmentEvidenceClaimButtomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        FragmentEvidenceClaimButtomSheetBinding fragmentEvidenceClaimButtomSheetBinding2 = null;
        if (fragmentEvidenceClaimButtomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEvidenceClaimButtomSheetBinding = null;
        }
        fragmentEvidenceClaimButtomSheetBinding.btnDownloadEvidenceTransaction.setOnClickListener(new View.OnClickListener() { // from class: isChannelEnabled
            public static int b = 871204188;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                copyNotificationOntoChannel.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        FragmentEvidenceClaimButtomSheetBinding fragmentEvidenceClaimButtomSheetBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentEvidenceClaimButtomSheetBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEvidenceClaimButtomSheetBinding3 = null;
        }
        fragmentEvidenceClaimButtomSheetBinding3.btnCloseNotification.setOnClickListener(new View.OnClickListener() { // from class: PackageIdentityUtilsPre28Implementation
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                copyNotificationOntoChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        FragmentEvidenceClaimButtomSheetBinding fragmentEvidenceClaimButtomSheetBinding4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentEvidenceClaimButtomSheetBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentEvidenceClaimButtomSheetBinding2 = fragmentEvidenceClaimButtomSheetBinding4;
        }
        fragmentEvidenceClaimButtomSheetBinding2.deleteNotification.setOnClickListener(new View.OnClickListener() { // from class: PackageIdentityUtilsApi28Implementation
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                copyNotificationOntoChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
    }

    public static /* synthetic */ void b(copyNotificationOntoChannel copynotificationontochannel, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            ReceiptClaimOldDaySecurityActivity.Companion companion = ReceiptClaimOldDaySecurityActivity.INSTANCE;
            Context contextRequireContext = copynotificationontochannel.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ReceiptClaimOldDaySecurityActivity.Companion.b(contextRequireContext, copynotificationontochannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(copyNotificationOntoChannel copynotificationontochannel, View view) {
        Function1<Notification, Unit> function1;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Notification notification = copynotificationontochannel.b;
            if (notification != null && (function1 = copynotificationontochannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
                function1.invoke(notification);
            }
            copynotificationontochannel.dismiss();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(copyNotificationOntoChannel copynotificationontochannel, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            copynotificationontochannel.dismiss();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit b(copyNotificationOntoChannel copynotificationontochannel, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentEvidenceClaimButtomSheetBinding fragmentEvidenceClaimButtomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentEvidenceClaimButtomSheetBinding fragmentEvidenceClaimButtomSheetBinding2 = copynotificationontochannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (fragmentEvidenceClaimButtomSheetBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentEvidenceClaimButtomSheetBinding = fragmentEvidenceClaimButtomSheetBinding2;
            }
            MultiStateView multiStateView = fragmentEvidenceClaimButtomSheetBinding.msvEvidence;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentEvidenceClaimButtomSheetBinding fragmentEvidenceClaimButtomSheetBinding3 = copynotificationontochannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (fragmentEvidenceClaimButtomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentEvidenceClaimButtomSheetBinding3 = null;
            }
            MultiStateView multiStateView2 = fragmentEvidenceClaimButtomSheetBinding3.msvEvidence;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            ClaimEvidenceJhtResponse claimEvidenceJhtResponse = (ClaimEvidenceJhtResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (Intrinsics.areEqual(claimEvidenceJhtResponse.isEvidence(), "Y") && claimEvidenceJhtResponse.getData() != null) {
                FragmentEvidenceClaimButtomSheetBinding fragmentEvidenceClaimButtomSheetBinding4 = copynotificationontochannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (fragmentEvidenceClaimButtomSheetBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    fragmentEvidenceClaimButtomSheetBinding = fragmentEvidenceClaimButtomSheetBinding4;
                }
                fragmentEvidenceClaimButtomSheetBinding.btnDownloadEvidenceTransaction.setVisibility(0);
                copynotificationontochannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = claimEvidenceJhtResponse.getData();
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentEvidenceClaimButtomSheetBinding fragmentEvidenceClaimButtomSheetBinding5 = copynotificationontochannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (fragmentEvidenceClaimButtomSheetBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentEvidenceClaimButtomSheetBinding = fragmentEvidenceClaimButtomSheetBinding5;
            }
            MultiStateView multiStateView3 = fragmentEvidenceClaimButtomSheetBinding.msvEvidence;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            multiStateView3.setViewState(MultiStateView.ViewState.CONTENT);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        ((isModeInList) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getFingerprintsForPackage
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return copyNotificationOntoChannel.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public copyNotificationOntoChannel() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
