package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemMasterDataBinding;
import com.bpjstku.domain.report.model.ReportStatus;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LgenerateConcurrentSupportedCombinationList;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/report/model/ReportStatus;", "LgenerateConcurrentSupportedCombinationList$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/view/ViewGroup;)LgenerateConcurrentSupportedCombinationList$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class generateConcurrentSupportedCombinationList extends setVirtualCameraRotationDegrees<ReportStatus, TuitionPaymentFragmentspecialinlinedviewModeldefault3> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function1<ReportStatus, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    public /* synthetic */ generateConcurrentSupportedCombinationList(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private generateConcurrentSupportedCombinationList(Context context, List<ReportStatus> list, Function1<? super ReportStatus, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemMasterDataBinding itemMasterDataBindingInflate = ItemMasterDataBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemMasterDataBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, itemMasterDataBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends VirtualCameraInfo<ReportStatus> {
        private /* synthetic */ generateConcurrentSupportedCombinationList TuitionPaymentFragmentbindingInflater1;
        private final ItemMasterDataBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static final byte[] $$c = {56, 94, 119, -19};
        private static final int $$f = 65;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {49, 89, 41, 48, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 55, -2, 20, -18, -50, 67, -14, 25, -11, -7, 10, 7, -69, 64, 3, -10, 2, 8, -61, 69, -12, 13, 5, -15, 15, 2, -69, 28, 38, -9, 6, 14, -12, -4, 18, -19, 12, -39, 34, 16, -18, 9, 4, -40, 51, -1, 2, -4, -1, -7, 14, -34, 20, 9, -4, -1, 18, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, -17, 8, 6, -9, 6, 6, -6, -29, 38, -7, 7, -10, 20, -14, 14, -64};
        private static final int $$e = 35;
        private static final byte[] $$a = {25, 31, 20, 1, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 52;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int b = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59697, 59749, 59744, 59746, 59758, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59747, 59845, 59844, 59868, 59858, 59841, 59865, 59881, 59857, 59856, 59856, 59857, 59868, 59829, 59816, 59824, 59863, 59871, 59832, 59838, 59865, 59859, 59863, 59868, 59870, 59864, 59696, 59761, 59765, 59785, 59791, 59751, 59749, 59790, 59766, 59764, 59789, 59788, 59787, 59767, 59785, 59787, 59785, 59765, 59676, 59724, 59744, 59744, 59758, 59744, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59705, 59759, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59746, 59759, 59757};

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 14
                int r7 = 98 - r7
                int r8 = r8 + 4
                int r0 = r6 + 1
                byte[] r1 = generateConcurrentSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L13
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2a
            L13:
                r3 = r2
            L14:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L25:
                r3 = r1[r8]
                r5 = r3
                r3 = r8
                r8 = r5
            L2a:
                int r7 = r7 + r8
                int r7 = r7 + (-10)
                r8 = r3
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: generateConcurrentSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a(byte, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 31
                int r0 = 69 - r6
                byte[] r1 = generateConcurrentSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$d
                int r7 = r7 * 15
                int r7 = 99 - r7
                int r8 = r8 * 68
                int r8 = 72 - r8
                byte[] r0 = new byte[r0]
                int r6 = 68 - r6
                r2 = 0
                if (r1 != 0) goto L18
                r3 = r8
                r4 = r2
                goto L2f
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L26:
                r4 = r1[r8]
                int r3 = r3 + 1
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2f:
                int r8 = r8 + r7
                int r7 = r8 + (-1)
                int r8 = r3 + 1
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: generateConcurrentSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d(int, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(generateConcurrentSupportedCombinationList generateconcurrentsupportedcombinationlist, ItemMasterDataBinding itemMasterDataBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) throws Throwable {
            Intrinsics.checkNotNullParameter(itemMasterDataBinding, "");
            this.TuitionPaymentFragmentbindingInflater1 = generateconcurrentsupportedcombinationlist;
            Context context = generateconcurrentsupportedcombinationlist.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            RelativeLayout root = itemMasterDataBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemMasterDataBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ReportStatus reportStatus) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = b + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            final ReportStatus reportStatus2 = reportStatus;
            Intrinsics.checkNotNullParameter(reportStatus2, "");
            ItemMasterDataBinding itemMasterDataBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            final generateConcurrentSupportedCombinationList generateconcurrentsupportedcombinationlist = this.TuitionPaymentFragmentbindingInflater1;
            itemMasterDataBinding.tvName.setText(reportStatus2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 31533);
                int tapTimeout = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr = $$a;
                byte b2 = bArr[80];
                Object[] objArr2 = new Object[1];
                a(b2, b2, bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, tapTimeout, maximumDrawingCacheSize, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{22, 15, 0, 4}, false, new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 920;
                int gidForName = Process.getGidForName("") + 29;
                byte b3 = (byte) $$b;
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                a(b3, bArr2[3], bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, i4, gidForName, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i5 = b + 45;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31532);
                    int iMakeMeasureSpec = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i7 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b4 = $$a[3];
                    Object[] objArr6 = new Object[1];
                    a((byte) 37, b4, (byte) (b4 | 50), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iMakeMeasureSpec, i7, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i8 = ~iIdentityHashCode;
                int i9 = (~((-794098612) | i8)) | 85240083 | (~(979981032 | i8));
                int i10 = (-522366347) + (((~(iIdentityHashCode | (-271122505))) | i9) * 590) + (i9 * (-1180)) + (((~((-979981033) | i8)) | (~(i8 | 794098611))) * 590) + 241740142;
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
                int i13 = b + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                int i14 = i13 % 2;
            } else {
                Object[] objArr8 = new Object[1];
                c(new int[]{37, 26, 108, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{63, 18, 20, 13}, true, new byte[]{1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i15 = b + 57;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                    int i16 = i15 % 2;
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(new int[]{81, 16, 0, 5}, true, new byte[]{0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new int[]{97, 16, 0, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 241740142};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[77];
                    Object[] objArr13 = new Object[1];
                    d(b5, b5, (byte) (-bArr3[5]), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = (byte) (-bArr3[5]);
                    Object[] objArr14 = new Object[1];
                    d(b6, b6, bArr3[77], objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
                        int iIndexOf = TextUtils.indexOf("", "") + 921;
                        int iMyPid = (Process.myPid() >> 22) + 28;
                        byte b7 = $$a[3];
                        Object[] objArr16 = new Object[1];
                        a((byte) 37, b7, (byte) (b7 | 50), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iIndexOf, iMyPid, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new int[]{22, 15, 0, 4}, false, new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
                            int tapTimeout2 = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                            int iIndexOf2 = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            byte b8 = (byte) $$b;
                            byte[] bArr4 = $$a;
                            Object[] objArr19 = new Object[1];
                            a(b8, bArr4[3], bArr4[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, tapTimeout2, iIndexOf2, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cAlpha = (char) (Color.alpha(0) + 31533);
                            int iBlue = Color.blue(0) + 921;
                            int iCombineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
                            byte[] bArr5 = $$a;
                            byte b9 = bArr5[80];
                            Object[] objArr20 = new Object[1];
                            a(b9, b9, bArr5[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, iBlue, iCombineMeasuredStates, -1048449946, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr15;
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
            int i17 = ((int[]) objArr[1])[0];
            int i18 = ((int[]) objArr[3])[0];
            if (i18 != i17) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i18));
            }
            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
            b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i22 = i21 + (-893950133) + (((~((-63128031) | iIdentityHashCode2)) | 29556892) * 1504) + ((~(iIdentityHashCode2 | (-33571139))) * (-1504)) + 1164137168;
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr21[0])[0] = i24 ^ (i24 << 5);
            if (reportStatus2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                AppCompatImageView appCompatImageView = itemMasterDataBinding.imgSelected;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                appCompatImageView.setVisibility(0);
            } else {
                AppCompatImageView appCompatImageView2 = itemMasterDataBinding.imgSelected;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                appCompatImageView2.setVisibility(4);
            }
            RelativeLayout root = itemMasterDataBinding.getRoot();
            int i25 = ((int[]) objArr21[0])[0];
            int i26 = i25 * i25;
            int i27 = -(2075606886 * i25);
            int i28 = (i26 & i27) + (i26 | i27);
            int i29 = -(i25 * (-665355734));
            int i30 = (i28 & i29) + (i29 | i28);
            int i31 = ((i30 | (-728736704)) << 1) - ((-728736704) ^ i30);
            int i32 = i31 >> 25;
            int i33 = ((i32 & (-255)) + (i32 | (-255))) / 128;
            int i34 = (i33 ^ 1) + ((i33 & 1) << 1);
            int i35 = (i31 & i34) + (i34 | i31);
            int i36 = i31 >> 21;
            int i37 = -(i35 ^ ((((i36 ^ (-4095)) + ((i36 & (-4095)) << 1)) / 2048) + 1));
            int i38 = ((i37 | 2) << 1) - (i37 ^ 2);
            int i39 = i38 >> 16;
            int i40 = (((-131071) ^ i39) + ((i39 & (-131071)) << 1)) / 65536;
            Intrinsics.checkNotNullExpressionValue(root, "22,getRoot(...)".substring(1686 / (((-(((i40 ^ 1) + ((i40 & 1) << 1)) + 1)) & i38) * 281)));
            RelativeLayout relativeLayout = root;
            Function1 function1 = new Function1() { // from class: generateStreamUseCaseSupportedCombinationList
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return generateConcurrentSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(generateconcurrentsupportedcombinationlist, reportStatus2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(relativeLayout, "");
            Intrinsics.checkNotNullParameter(function1, "");
            relativeLayout.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            char[] cArr;
            int i2 = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i3 = 0;
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (cArr2 != null) {
                int i8 = $10 + 5;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i10 = 0;
                while (i10 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr2[i10]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i3;
                            byte b3 = (byte) (b2 + 5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(i3) + 1), 1270 - (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, 407021364, false, $$g(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i10++;
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
            char[] cArr4 = new char[i5];
            System.arraycopy(cArr2, i4, cArr4, 0, i5);
            if (bArr != null) {
                int i11 = $11 + 17;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr = new char[i5];
                    setvideostabilizationmode.b = 1;
                } else {
                    cArr = new char[i5];
                    setvideostabilizationmode.b = 0;
                }
                char c = 0;
                while (setvideostabilizationmode.b < i5) {
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i12 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Drawable.resolveOpacity(0, 0), MotionEvent.axisFromString("") + 3226, Color.blue(0) + 13, 2133916302, false, $$g(b4, (byte) (b4 | 6), b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } else {
                        int i13 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                            int i14 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                            byte length2 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, i14, scrollBarFadeDuration, 387247676, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    }
                    c = cArr[setvideostabilizationmode.b];
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 41241), (ViewConfiguration.getPressedStateDuration() >> 16) + 1705, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20, -1434471773, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                cArr4 = cArr;
            }
            if (i7 > 0) {
                char[] cArr5 = new char[i5];
                i = 0;
                System.arraycopy(cArr4, 0, cArr5, 0, i5);
                int i15 = i5 - i7;
                System.arraycopy(cArr5, 0, cArr4, i15, i7);
                System.arraycopy(cArr5, i7, cArr4, 0, i15);
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr6 = new char[i5];
                while (true) {
                    setvideostabilizationmode.b = i;
                    if (setvideostabilizationmode.b >= i5) {
                        break;
                    }
                    cArr6[setvideostabilizationmode.b] = cArr4[(i5 - setvideostabilizationmode.b) - 1];
                    i = setvideostabilizationmode.b + 1;
                }
                cArr4 = cArr6;
            }
            if (i6 > 0) {
                int i16 = 0;
                while (true) {
                    setvideostabilizationmode.b = i16;
                    if (setvideostabilizationmode.b >= i5) {
                        break;
                    }
                    cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                    i16 = setvideostabilizationmode.b + 1;
                }
            }
            objArr[0] = new String(cArr4);
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(generateConcurrentSupportedCombinationList generateconcurrentsupportedcombinationlist, ReportStatus reportStatus, View view) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = generateconcurrentsupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (function1 != null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                b = i2 % 128;
                int i3 = i2 % 2;
                function1.invoke(reportStatus);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = b + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 58 / 0;
            }
            return unit;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r7, byte r8, byte r9) {
            /*
                int r9 = r9 * 2
                int r9 = 4 - r9
                byte[] r0 = generateConcurrentSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$c
                int r7 = r7 * 3
                int r7 = r7 + 1
                int r8 = 105 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r8 = r9
                r4 = r2
                goto L2b
            L15:
                r3 = r2
            L16:
                r6 = r9
                r9 = r8
                r8 = r6
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L26
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L26:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L2b:
                int r9 = r9 + 1
                int r8 = r8 + r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: generateConcurrentSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$g(int, byte, byte):java.lang.String");
        }
    }
}
