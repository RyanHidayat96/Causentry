package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.databinding.ItemPromoBinding;
import com.bpjstku.domain.banner.model.Banner;
import com.google.android.material.card.MaterialCardView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u000fB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LFocusMeteringControlExternalSyntheticLambda0;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/banner/model/Banner;", "LFocusMeteringControlExternalSyntheticLambda0$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/view/ViewGroup;)LFocusMeteringControlExternalSyntheticLambda0$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FocusMeteringControlExternalSyntheticLambda0 extends setVirtualCameraRotationDegrees<Banner, TuitionPaymentFragmentspecialinlinedviewModeldefault1> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function1<Banner, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* bridge */ /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    public /* synthetic */ FocusMeteringControlExternalSyntheticLambda0(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FocusMeteringControlExternalSyntheticLambda0(Context context, List<Banner> list, Function1<? super Banner, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemPromoBinding itemPromoBindingInflate = ItemPromoBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemPromoBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, itemPromoBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends VirtualCameraInfo<Banner> {
        private /* synthetic */ FocusMeteringControlExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1;
        private final ItemPromoBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
        private static final int $$d = 183;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {65, -122, -65, 2, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
        private static final int $$b = 91;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int b = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6967719933741987339L;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 4
                int r7 = 84 - r7
                byte[] r0 = FocusMeteringControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                int r6 = r6 + 4
                int r8 = r8 * 15
                int r1 = r8 + 38
                byte[] r1 = new byte[r1]
                int r8 = r8 + 37
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
                int r6 = r6 + 1
                if (r3 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2e:
                int r7 = -r7
                int r3 = r3 + r7
                int r7 = r3 + (-11)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: FocusMeteringControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.a(short, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(FocusMeteringControlExternalSyntheticLambda0 focusMeteringControlExternalSyntheticLambda0, ItemPromoBinding itemPromoBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemPromoBinding, "");
            this.TuitionPaymentFragmentbindingInflater1 = focusMeteringControlExternalSyntheticLambda0;
            Context context = focusMeteringControlExternalSyntheticLambda0.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            MaterialCardView root = itemPromoBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemPromoBinding;
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            int i3 = $10 + 107;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 5;
            }
            while (abortcapture.b < cArrB.length) {
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i5 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 64838), 1356 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 38, 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - TextUtils.getOffsetAfter("", 0)), 468 - View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            int i6 = $11 + 93;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 48 / 0;
            }
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Banner banner) throws Throwable {
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            b = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
                int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte[] bArr = $$a;
                byte b2 = bArr[28];
                byte b3 = bArr[7];
                Object[] objArr = new Object[1];
                a(b2, b3, b3, objArr);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i4, longPressTimeout, 986134021, false, (String) objArr[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr2 = new Object[1];
            c(new char[]{17213, 33169, 17244, 57964, 8736, 58722, 12675, 6984, 52510, 28711, 30518, 41571, 24522, 457, 49584, 23626, 59808, 36757, 20574, 52912, 31328, 7441, 8730, 30926, 33826, 43765}, (Process.myTid() >> 22) + 1, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            c(new char[]{55557, 6600, 55648, 31287, 50084, 1251, 45312, 39881, 22330, 59506, 38578, 8862, 50680, 39298, 8310, 56556, 29576, 6098, 45515}, -((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29943);
                int modifierMetaStateMask = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
                int i5 = 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                byte[] bArr2 = $$a;
                Object[] objArr4 = new Object[1];
                a((byte) (bArr2[17] + 1), bArr2[7], bArr2[5], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, modifierMetaStateMask, i5, 1596667560, false, (String) objArr4[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                b = i6 % 128;
                int i7 = i6 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int iAxisFromString = 1754 - MotionEvent.axisFromString("");
                    int i8 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b4 = (byte) ($$b - 3);
                    byte[] bArr3 = $$a;
                    Object[] objArr5 = new Object[1];
                    a(b4, bArr3[7], bArr3[5], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, iAxisFromString, i8, 1599039318, false, (String) objArr5[0], null);
                }
                Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
                int iNextInt = new Random().nextInt(1030998247);
                int i9 = ~iNextInt;
                int i10 = (-1243658722) + (((~(465686773 | i9)) | (~((-327155921) | iNextInt))) * (-831)) + ((~(1005445119 | iNextInt)) * (-1662)) + (((~(iNextInt | (-465686774))) | (~(i9 | (-678289200))) | (~(678289199 | iNextInt))) * 831) + 307541058;
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i12 ^ (i12 << 5);
            } else {
                Object[] objArr7 = new Object[1];
                c(new char[]{30173, 54532, 30135, 46838, 52410, 3050, 61988, 55548, 64447, 9399, 39337, 24983, 26914, 21761, 12119, 40916, 57162, 56071, 48853, 3340}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c(new char[]{5012, 51038, 5117, 42153, 26775, 45012, 8094, 13641, 40364, 14056, 15761, 35893, 3908, 18196, 35674, 29296, 47411, 51526, 6905, 57521}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr8);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr9 = {1243994372};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getScrollBarSize() >> 8)), Drawable.resolveOpacity(0, 0) + 1726, 29 - (ViewConfiguration.getScrollBarSize() >> 8), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), 307541058, false, true);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
                        byte b5 = (byte) ($$b - 3);
                        byte[] bArr4 = $$a;
                        Object[] objArr10 = new Object[1];
                        a(b5, bArr4[7], bArr4[5], objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iCombineMeasuredStates, absoluteGravity, 1599039318, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                    try {
                        Object[] objArr11 = new Object[1];
                        c(new char[]{17213, 33169, 17244, 57964, 8736, 58722, 12675, 6984, 52510, 28711, 30518, 41571, 24522, 457, 49584, 23626, 59808, 36757, 20574, 52912, 31328, 7441, 8730, 30926, 33826, 43765}, ((Process.getThreadPriority(0) + 20) >> 6) + 1, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        c(new char[]{55557, 6600, 55648, 31287, 50084, 1251, 45312, 39881, 22330, 59506, 38578, 8862, 50680, 39298, 8310, 56556, 29576, 6098, 45515}, 1 - (ViewConfiguration.getEdgeSlop() >> 16), objArr12);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char longPressTimeout2 = (char) (29944 - (ViewConfiguration.getLongPressTimeout() >> 16));
                            int windowTouchSlop = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            byte[] bArr5 = $$a;
                            Object[] objArr13 = new Object[1];
                            a((byte) (bArr5[17] + 1), bArr5[7], bArr5[5], objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout2, windowTouchSlop, iIndexOf, 1596667560, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 29944);
                            int i13 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int scrollBarFadeDuration = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            byte[] bArr6 = $$a;
                            byte b6 = bArr6[28];
                            byte b7 = bArr6[7];
                            Object[] objArr14 = new Object[1];
                            a(b6, b7, b7, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maxKeyCode, i13, scrollBarFadeDuration, 986134021, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
            if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
                if (strArr == null) {
                    throw null;
                }
                for (String str : strArr) {
                    int i14 = b + 45;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    int i15 = i14 % 2;
                    arrayList.add(str);
                }
                throw null;
            }
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
            b = i16 % 128;
            int i17 = i16 % 2;
            int i18 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i19 = ~iIdentityHashCode;
            int i20 = i18 + 1353485922 + ((201064439 | i19) * (-369)) + (((~((-146480744) | i19)) | 66121682) * (-369)) + (((~(iIdentityHashCode | 146480743)) | 54583696 | (~(i19 | (-134942758)))) * 369);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr15[3])[0] = i22 ^ (i22 << 5);
            final Banner banner2 = banner;
            Intrinsics.checkNotNullParameter(banner2, "");
            ItemPromoBinding itemPromoBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final FocusMeteringControlExternalSyntheticLambda0 focusMeteringControlExternalSyntheticLambda0 = this.TuitionPaymentFragmentbindingInflater1;
            ImageView imageView = itemPromoBinding.imgPromo;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            Context context = itemPromoBinding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            String str2 = banner2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Drawable drawable = itemPromoBinding.getRoot().getContext().getResources().getDrawable(R.drawable.ic_placeholder_wide);
            Intrinsics.checkNotNullExpressionValue(drawable, "");
            Drawable drawable2 = itemPromoBinding.getRoot().getContext().getResources().getDrawable(R.drawable.ic_placeholder_wide);
            Intrinsics.checkNotNullExpressionValue(drawable2, "");
            lambdacreateCameraSelectorById0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageView, context, str2, drawable, drawable2);
            MaterialCardView root = itemPromoBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            MaterialCardView materialCardView = root;
            Function1 function1 = new Function1() { // from class: startFocusAndMeteringInternal
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FocusMeteringControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(banner2, focusMeteringControlExternalSyntheticLambda0, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(materialCardView, "");
            Intrinsics.checkNotNullParameter(function1, "");
            materialCardView.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Banner banner, FocusMeteringControlExternalSyntheticLambda0 focusMeteringControlExternalSyntheticLambda0, View view) {
            Function1 function1;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
            b = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            if (i3 == 0) {
                banner.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length();
                throw null;
            }
            if (banner.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length() > 0 && (function1 = focusMeteringControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
                function1.invoke(banner);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            b = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r6, int r7, int r8) {
            /*
                int r6 = r6 * 4
                int r0 = r6 + 1
                byte[] r1 = FocusMeteringControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                int r7 = r7 * 4
                int r7 = 107 - r7
                int r8 = r8 * 3
                int r8 = 3 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r4 = r6
                r7 = r8
                r3 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                r4 = r1[r8]
                int r3 = r3 + 1
                r5 = r8
                r8 = r7
                r7 = r5
            L2c:
                int r8 = r8 + r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: FocusMeteringControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$e(short, int, int):java.lang.String");
        }
    }
}
