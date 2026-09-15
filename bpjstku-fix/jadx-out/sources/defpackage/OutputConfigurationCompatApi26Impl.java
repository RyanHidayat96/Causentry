package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemPaymentHistoryBinding;
import com.bpjstku.domain.tuition.model.PaymentHistoryItem;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LOutputConfigurationCompatApi26Impl;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/tuition/model/PaymentHistoryItem;", "LOutputConfigurationCompatApi26Impl$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/view/ViewGroup;I)LOutputConfigurationCompatApi26Impl$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "b", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OutputConfigurationCompatApi26Impl extends setVirtualCameraRotationDegrees<PaymentHistoryItem, TuitionPaymentFragmentspecialinlinedviewModeldefault2> {
    private static short[] g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    final Function1<PaymentHistoryItem, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {74, 60, 122, -26};
    private static final int $$f = 248;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {81, -102, -70, -91, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 48, 17, -4, -15, -61, 48, 12, -10, -62, 66, -13, -5, 4, -8, 2, -67, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -27, 17};
    private static final int $$e = 29;
    private static final byte[] $$a = {106, -66, 28, 119, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 101;
    private static int INotificationSideChannel = 0;
    private static int onTransact = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -117941266;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795551;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 785220760;
    private static byte[] TuitionPaymentFragmentbindingInflater1 = {52, -104, 33, 87, 122, 52, -97, 47, 102, 74, 75, -39, 40, -17, 118, -103, 102, 99, 50, -102, 51, -112, -92, -105, -96, -91, -100, -83, -114, -111, -118, -35, -95, -105, -39, -26, -26};

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.OutputConfigurationCompatApi26Impl.$$a
            int r9 = r9 * 4
            int r9 = 84 - r9
            int r8 = r8 * 15
            int r8 = r8 + 38
            int r7 = r7 * 52
            int r7 = 107 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.OutputConfigurationCompatApi26Impl.c(byte, short, short, java.lang.Object[]):void");
    }

    private static void f(short s, int i, byte b, Object[] objArr) {
        int i2 = 53 - (b * 50);
        int i3 = 99 - i;
        int i4 = s * 50;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[51 - i4];
        int i5 = 50 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i3 + 3;
        }
        while (true) {
            i2++;
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = i3 + bArr[i2] + 3;
        }
    }

    public static final /* synthetic */ Context TuitionPaymentFragmentspecialinlinedviewModeldefault3(OutputConfigurationCompatApi26Impl outputConfigurationCompatApi26Impl) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Context context = outputConfigurationCompatApi26Impl.asBinder;
        int i4 = INotificationSideChannel + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return context;
    }

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 59;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(viewGroup, i);
        int i5 = INotificationSideChannel + 73;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = INotificationSideChannel + 15;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(viewGroup, i);
        int i5 = onTransact + 73;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ OutputConfigurationCompatApi26Impl(Context context, List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            list = new ArrayList();
            int i2 = onTransact + 117;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 4) != 0) {
            int i5 = onTransact + 49;
            INotificationSideChannel = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            function1 = null;
        }
        this(context, list, function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private OutputConfigurationCompatApi26Impl(Context context, List<PaymentHistoryItem> list, Function1<? super PaymentHistoryItem, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends VirtualCameraInfo<PaymentHistoryItem> {
        private /* synthetic */ OutputConfigurationCompatApi26Impl TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final ItemPaymentHistoryBinding b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(OutputConfigurationCompatApi26Impl outputConfigurationCompatApi26Impl, ItemPaymentHistoryBinding itemPaymentHistoryBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemPaymentHistoryBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = outputConfigurationCompatApi26Impl;
            Context contextTuitionPaymentFragmentspecialinlinedviewModeldefault3 = OutputConfigurationCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(outputConfigurationCompatApi26Impl);
            Intrinsics.checkNotNullExpressionValue(contextTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            ConstraintLayout root = itemPaymentHistoryBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(contextTuitionPaymentFragmentspecialinlinedviewModeldefault3, root, null, null);
            this.b = itemPaymentHistoryBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentHistoryItem paymentHistoryItem) {
            String string;
            final PaymentHistoryItem paymentHistoryItem2 = paymentHistoryItem;
            Intrinsics.checkNotNullParameter(paymentHistoryItem2, "");
            ItemPaymentHistoryBinding itemPaymentHistoryBinding = this.b;
            final OutputConfigurationCompatApi26Impl outputConfigurationCompatApi26Impl = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            itemPaymentHistoryBinding.tvTitlePaymentHistory.setText("Pembayaran Iuran BPU");
            AppCompatTextView appCompatTextView = itemPaymentHistoryBinding.tvValuePayment;
            Double d = paymentHistoryItem2.b;
            appCompatTextView.setText((d == null || (string = d.toString()) == null) ? null : getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(string));
            itemPaymentHistoryBinding.tvPaymentDate.setText(paymentHistoryItem2.asBinder);
            itemPaymentHistoryBinding.imgPaymentHistory.setImageResource(R.drawable.ic_sample_notification);
            ConstraintLayout root = itemPaymentHistoryBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: OutputConfigurationCompatApi24ImplOutputConfigurationParamsApi24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OutputConfigurationCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(outputConfigurationCompatApi26Impl, paymentHistoryItem2, (View) obj);
                }
            }));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(OutputConfigurationCompatApi26Impl outputConfigurationCompatApi26Impl, PaymentHistoryItem paymentHistoryItem, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1<PaymentHistoryItem, Unit> function1 = outputConfigurationCompatApi26Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function1 != null) {
                function1.invoke(paymentHistoryItem);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(ViewGroup p0, int p1) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(p0.getContext());
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetAfter = (char) (43042 - TextUtils.getOffsetAfter("", 0));
            int bitsPerPixel = 3110 - ImageFormat.getBitsPerPixel(0);
            int i3 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[40], bArr[5], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, bitsPerPixel, i3, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(1570711522 - ImageFormat.getBitsPerPixel(0), 14 - Process.getGidForName(""), (short) ((-40) - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) (View.getDefaultSize(0, 0) - 93), (-1951729416) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1570711527, View.MeasureSpec.makeMeasureSpec(0, 0) + 8, (short) (37 - TextUtils.indexOf("", "")), (byte) (Color.argb(0, 0, 0, 0) + 99), (-1951729396) - TextUtils.indexOf((CharSequence) "", '0'), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumFlingVelocity = (char) (43042 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 3112;
            int iIndexOf2 = 22 - TextUtils.indexOf("", "", 0);
            byte[] bArr2 = $$a;
            byte b = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(b, b, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, iIndexOf, iIndexOf2, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char deadChar = (char) (43042 - KeyEvent.getDeadChar(0, 0));
                int scrollDefaultDelay = 3111 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b2, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, scrollDefaultDelay, i4, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int i7 = ((1920285656 + (((-442171539) | p1) * (-381))) + (((~((~p1) | 1168438856)) | (-1516189331)) * 381)) - 2035874260;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            objArr = new Object[]{new int[]{i9 ^ (i9 << 5)}, new int[]{i6}, new int[]{i5}, strArr};
        } else {
            try {
                Object[] objArr8 = {null, Integer.valueOf(p1), 0, 1295461602};
                byte b4 = (byte) 0;
                byte b5 = b4;
                Object[] objArr9 = new Object[1];
                f(b4, b5, (byte) (b5 + 1), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b6 = (byte) ($$e & 3);
                byte b7 = b6;
                Object[] objArr10 = new Object[1];
                f(b6, b7, (byte) (b7 - 1), objArr10);
                objArr = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char defaultSize = (char) (43042 - View.getDefaultSize(0, 0));
                    int offsetBefore = 3111 - TextUtils.getOffsetBefore("", 0);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                    byte b8 = $$a[7];
                    byte b9 = b8;
                    Object[] objArr11 = new Object[1];
                    c(b8, b9, b9, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, offsetBefore, threadPriority, 154975793, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    e((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1570711522, 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 39), (byte) ((-94) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) - 1951729416, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(Drawable.resolveOpacity(0, 0) + 1570711527, (ViewConfiguration.getJumpTapTimeout() >> 16) + 8, (short) (37 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 99), (ViewConfiguration.getFadingEdgeLength() >> 16) - 1951729395, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMakeMeasureSpec = (char) (43042 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3111;
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 22;
                        byte[] bArr3 = $$a;
                        byte b10 = bArr3[5];
                        Object[] objArr14 = new Object[1];
                        c(b10, b10, bArr3[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, minimumFlingVelocity, touchSlop, -1269618118, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char gidForName = (char) (43041 - Process.getGidForName(""));
                        int iMakeMeasureSpec = 3111 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22;
                        byte[] bArr4 = $$a;
                        Object[] objArr15 = new Object[1];
                        c(bArr4[40], bArr4[5], bArr4[7], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(gidForName, iMakeMeasureSpec, doubleTapTimeout, -1272852037, false, (String) objArr15[0], null);
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i10 = onTransact + 51;
                INotificationSideChannel = i10 % 128;
                int i11 = i10 % 2;
                while (i2 < strArr2.length) {
                    int i12 = INotificationSideChannel + 7;
                    onTransact = i12 % 128;
                    if (i12 % 2 == 0) {
                        arrayList.add(strArr2[i2]);
                        i2 += 127;
                    } else {
                        arrayList.add(strArr2[i2]);
                        i2++;
                    }
                }
            }
            throw null;
        }
        int i13 = onTransact + 105;
        INotificationSideChannel = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((int[]) objArr[0])[0];
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr = {i16};
        int iIdentityHashCode = System.identityHashCode(this);
        int i18 = 1778001642 + ((358396060 | iIdentityHashCode) * 614);
        int i19 = ~iIdentityHashCode;
        int i20 = i15 + i18 + (((~((-947008472) | i19)) | 273690772 | (~(758022987 | i19))) * (-1228)) + (((~(i19 | 1031713759)) | (~((-673317700) | i19))) * 614);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        Object obj = new Object[]{new int[1], new int[]{i17}, iArr, strArr3}[0];
        ((int[]) obj)[0] = i22 ^ (i22 << 5);
        int i23 = ((int[]) obj)[0];
        int i24 = ((i23 * i23) - (~(-(412988310 * i23)))) - 1;
        int i25 = -(i23 * 1126233772);
        int i26 = (i24 & i25) + (i25 | i24);
        int i27 = (i26 ^ 97316417) + ((97316417 & i26) << 1);
        int i28 = i27 >> 23;
        int i29 = ((i28 ^ (-1023)) + ((i28 & (-1023)) << 1)) / 512;
        int i30 = (i29 ^ 1) + ((i29 & 1) << 1);
        int i31 = ((i27 | i30) << 1) - (i30 ^ i27);
        int i32 = i27 >> 21;
        int i33 = (((i32 | (-4095)) << 1) - (i32 ^ (-4095))) / 2048;
        int i34 = -(((i33 ^ 1) + ((i33 & 1) << 1)) ^ i31);
        int i35 = ((i34 | 1) << 1) - (i34 ^ 1);
        int i36 = i35 >> 22;
        int i37 = (((i36 ^ (-2047)) + ((i36 & (-2047)) << 1)) / 1024) + 1;
        ItemPaymentHistoryBinding itemPaymentHistoryBindingInflate = ItemPaymentHistoryBinding.inflate(layoutInflaterFrom, p0, 0 / (((-((i37 ^ 1) + ((i37 & 1) << 1))) & i35) * 652));
        Intrinsics.checkNotNullExpressionValue(itemPaymentHistoryBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, itemPaymentHistoryBindingInflate, null, null);
        int i38 = INotificationSideChannel + 7;
        onTransact = i38 % 128;
        if (i38 % 2 != 0) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01bb  */
    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), AndroidCharacter.getMirror('0') + 2219, 'Q' - AndroidCharacter.getMirror('0'), 1387473586, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 21;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i9 = $10;
                int i10 = i9 + 71;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                byte[] bArr = TuitionPaymentFragmentbindingInflater1;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i12 = i9 + 19;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 3 % 4;
                    }
                    for (int i14 = 0; i14 < length; i14++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i14])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                            int i15 = 3358 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int maximumDrawingCacheSize = 18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            byte length2 = (byte) $$c.length;
                            byte b4 = (byte) (length2 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, i15, maximumDrawingCacheSize, -1054011043, false, $$g(length2, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr2[i14] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentbindingInflater1;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), (Process.myPid() >> 22) + 2267, 33 - KeyEvent.getDeadChar(0, 0), 1387473586, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) g[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    int i16 = $10 + 109;
                    $11 = i16 % 128;
                    i4 = 2;
                    int i17 = i16 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                int i18 = $10 + 55;
                int i19 = i18 % 128;
                $11 = i19;
                int i20 = i18 % i4;
                int i21 = ((i3 + iIntValue) - i4) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                if (z) {
                    int i22 = i19 + 79;
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        i5 = 0;
                    } else {
                        i5 = 1;
                    }
                } else {
                    i5 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 1;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2855, 12 - TextUtils.indexOf((CharSequence) "", '0', 0), -1529949196, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i23 = 0; i23 < length3; i23++) {
                        int i24 = $11 + 123;
                        $10 = i24 % 128;
                        int i25 = i24 % 2;
                        bArr5[i23] = (byte) (((long) bArr4[i23]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i26 = $10;
                    int i27 = i26 + 109;
                    $11 = i27 % 128;
                    int i28 = i27 % 2;
                    int i29 = i26 + 99;
                    $11 = i29 % 128;
                    int i30 = i29 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (!(!z2)) {
                        int i31 = $10 + 101;
                        $11 = i31 % 128;
                        int i32 = i31 % 2;
                        byte[] bArr6 = TuitionPaymentFragmentbindingInflater1;
                        int i33 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i33 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i33]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = g;
                        int i34 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i34 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i34]) ^ 3046761265686732006L)) + s)) ^ b));
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

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, int r6, byte r7) {
        /*
            int r5 = r5 + 117
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = defpackage.OutputConfigurationCompatApi26Impl.$$c
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r5 = r6
            r4 = r7
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
        L25:
            int r7 = r7 + 1
            int r4 = -r4
            int r5 = r5 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.OutputConfigurationCompatApi26Impl.$$g(byte, int, byte):java.lang.String");
    }
}
