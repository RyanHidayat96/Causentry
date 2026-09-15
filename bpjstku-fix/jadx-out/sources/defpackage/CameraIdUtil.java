package defpackage;

import android.content.Context;
import android.graphics.Color;
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
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemJpnSimulationResultBinding;
import com.bpjstku.domain.simulation.model.Lumpsum;
import com.bpjstku.domain.simulation.model.LumpsumSummary;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"LCameraIdUtil;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/simulation/model/Lumpsum;", "LCameraIdUtil$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/view/ViewGroup;)LCameraIdUtil$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroid/content/Context;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraIdUtil extends setVirtualCameraRotationDegrees<Lumpsum, TuitionPaymentFragmentspecialinlinedviewModeldefault2> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    final Context TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {104, 27, -72, 120};
    private static final int $$f = 136;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {114, -59, 10, 31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 185;
    private static final byte[] $$a = {51, -5, 77, 89, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 56, 5, 16, 5, -67, 45, -32, -2, 12, 13, 37, 16, 5, -8, 0, 6, -3, 1, 22, -12, 1, 18, -44, 54, -1, -12, 12, 8, -7, 9, 2, -21, 14, 14, 12, -13};
    private static final int $$b = 175;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int g = 1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {-237006211, 1707098134, -1502039014, -549354657, 801366000, 1808943718, 671048299, 611489234, 498497848, -1365417290, -613568121, 1295412886, -267322925, 1049411971, 984835688, 2134625106, 122561470, -1747892995};
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {48485, 50246, 52033, 55897, 59692, 63539, 45558, 48891, 45030, 40175, 36266, 64247, 60364, 55519, 51648, 13956, 10229, 5259, 1437, 29334, 45533, 48884, 45044, 40188, 36331, 64235, 60380, 55549, 51657, 14035, 10227, 5290, 1467, 29344, 25517, 45558, 48891, 45030, 40175, 36266, 64241, 60381, 55509, 51673, 14040, 10185, 5290, 1453, 29436, 25475, 20643, 16773, 20137, 49028, 44161, 40342, 35463, 45551, 48895, 45028, 40154, 36333, 64239, 60381, 58951, 59716, 63566, 31801, 29481, 25125, 20776, 16480, 14177, 9816, 5394, 1099, 45529, 48857, 45558, 48891, 45030, 40175, 36266, 64241, 60381, 55509, 51673, 14040, 10185, 5290, 1453, 29436, 25475, 20643, 16773, 20138, 49041, 44167, 40342, 35493, 64381, 59512, 55657, 50808, 14177, 9290, 5467, 576, 45563, 48895, 45028, 40141, 36321, 64240, 60364, 55519, 51658, 14019, 10179, 5311, 1440, 29367, 25483, 20654, 16797, 20115, 49054, 45508, 48820, 44965, 40126, 36285, 17270, 19579, 23910, 28271, 32554, 2161, 6493, 10837, 15193, 50264, 54601, 58922, 63277, 32892, 37163, 41507, 45838, 48142, 19806, 24109, 28417, 30736, 2540, 6911, 11242, 13539, 50659, 55007, 59328, 61655, 28311, 24986, 28807, 17294, 21195, 9613, 13488, 1976, 5859, 59785, 63668, 52185, 56019, 44502, 48347, 45558, 48891, 45030, 40175, 36266, 64238, 60377, 55512, 51659, 13956, 10220, 5297, 1466, 29365, 53337, 57156, 52841, 64858, 60493, 39776, 35453, 47477, 43124, 22389, 18038, 45567, 48891, 45024, 40175, 36327, 64235, 60364, 55503, 45189, 49036, 44684, 40324, 35987, 64403, 60068, 55776, 51383, 14269, 9910, 5586, 1225, 29636, 25284, 20880, 16583, 20461, 48870, 44514, 40185, 35810, 64020, 55170, 55430, 51613, 64167, 60316, 40088, 36266, 48814, 44978, 20662, 16791, 29382, 25536, 5326, 45563, 48895, 45028, 40158, 36325, 64225, 60371, 55511, 51659, 14031, 10221, 5311, 1466, 29363, 25519, 20643, 16782, 54908, 55665, 51308, 64357, 59936, 40292, 35923, 48978, 44609, 20750, 16472, 29489, 25144, 5428, 1063, 14127, 9730, 10590, 55351, 51969, 64026, 60672, 40189, 36856, 33677, 35977, 40338, 44725, 49053, 51344, 55719, 60070, 64435, 1209, 5540, 9947, 45565, 48884, 45044, 40188, 36331, 64235, 60380, 55448, 51663, 14021, 10190, 5290, 1457, 29372, 25532, 20712, 16780, 20119, 49118, 44222, 40325, 35457, 64371, 59511, 55659, 50799, 14157, 9311, 5466, 595, 29519, 24643, 20782, 45521, 48862, 44965, 38925, 38660, 34308, 46348, 42011, 54043, 49708, 61800, 57407, 7989, 3646, 15706, 11329, 23372, 19020, 31000, 26748, 26471, 38446, 34126, 46197, 41841, 53891, 49543, 61595, 61343, 7865, 3488, 15522, 11181, 47005, 47248, 43405, 39556, 35777, 64666, 60854, 57022, 53170, 12467, 8610, 4801, 966, 29847, 26094, 22216, 18404, 18658, 47610, 43746, 39914, 36045, 64794, 60954, 57090, 49170, 12575, 45462, 45563, 48895, 45028, 40131, 36321, 64241, 60363, 55511, 51659, 14031, 37168, 40461, 36620, 48143, 44301, 55838, 52002, 63547, 59696, 5687, 1913, 13378, 9567, 21081, 17246, 28749, 24869, 28261, 40812, 35939, 48510, 43635, 56200, 51329, 63890, 59091, 6026, 1203, 13740, 8872, 21434, 16639, 29137, 32465, 28616, 40148, 36312, 47771, 44008, 55521, 51699, 63228, 59371, 5898, 1036, 13599, 8728, 21264, 16427, 29049, 32361, 28543, 45493, 48800, 44976};
    private static long b = 7865426916791860890L;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 93 - r6
            int r8 = 53 - r8
            int r7 = r7 + 84
            byte[] r0 = defpackage.CameraIdUtil.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r7 = r8
            r4 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r6]
        L23:
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CameraIdUtil.f(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.CameraIdUtil.$$a
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = 106 - r8
            int r6 = r6 * 17
            int r1 = 34 - r6
            byte[] r1 = new byte[r1]
            int r6 = 33 - r6
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L30
        L16:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L30:
            int r7 = r7 + r8
            int r7 = r7 + (-3)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CameraIdUtil.h(int, byte, int, java.lang.Object[]):void");
    }

    public static final /* synthetic */ Context TuitionPaymentFragmentbindingInflater1(CameraIdUtil cameraIdUtil) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
        g = i2 % 128;
        int i3 = i2 % 2;
        Context context = cameraIdUtil.asBinder;
        int i4 = g + 59;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return context;
    }

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = g + 117;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
        if (i4 == 0) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 21;
        g = i3 % 128;
        int i4 = i3 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 123;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public /* synthetic */ CameraIdUtil(Context context, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            list = new ArrayList();
            int i2 = g + 91;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this(context, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private CameraIdUtil(Context context, List<Lumpsum> list) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentbindingInflater1 = context;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewGroup viewGroup) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemJpnSimulationResultBinding itemJpnSimulationResultBindingInflate = ItemJpnSimulationResultBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemJpnSimulationResultBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, itemJpnSimulationResultBindingInflate, null, null);
        int i2 = g + 53;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends VirtualCameraInfo<Lumpsum> {
        private final ItemJpnSimulationResultBinding TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ CameraIdUtil TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraIdUtil cameraIdUtil, ItemJpnSimulationResultBinding itemJpnSimulationResultBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemJpnSimulationResultBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraIdUtil;
            Context contextTuitionPaymentFragmentbindingInflater1 = CameraIdUtil.TuitionPaymentFragmentbindingInflater1(cameraIdUtil);
            Intrinsics.checkNotNullExpressionValue(contextTuitionPaymentFragmentbindingInflater1, "");
            ConstraintLayout root = itemJpnSimulationResultBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(contextTuitionPaymentFragmentbindingInflater1, root, null, null);
            this.TuitionPaymentFragmentbindingInflater1 = itemJpnSimulationResultBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Lumpsum lumpsum) {
            Lumpsum lumpsum2 = lumpsum;
            Intrinsics.checkNotNullParameter(lumpsum2, "");
            ItemJpnSimulationResultBinding itemJpnSimulationResultBinding = this.TuitionPaymentFragmentbindingInflater1;
            View view = this.itemView;
            TextView textView = itemJpnSimulationResultBinding.tvDateTime;
            String string = view.getContext().getString(R.string.label_year);
            String str = lumpsum2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(" : ");
            sb.append(str);
            textView.setText(sb.toString());
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            LumpsumSummary lumpsumSummary = lumpsum2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getSelectedAvailableCameraIds getselectedavailablecameraids = new getSelectedAvailableCameraIds(context, CollectionsKt.listOf((Object[]) new Pair[]{new Pair(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.getString(R.string.label_tuition), getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(lumpsumSummary.b)), new Pair(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.getString(R.string.label_initial_balance), getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(lumpsumSummary.d)), new Pair(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.getString(R.string.label_development_percentage), lumpsumSummary.g), new Pair(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.getString(R.string.label_tuition_development), getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(lumpsumSummary.cancelAll)), new Pair(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.getString(R.string.label_final_balance), getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(lumpsumSummary.TuitionPaymentFragmentspecialinlinedviewModeldefault1))}));
            RecyclerView recyclerView = itemJpnSimulationResultBinding.rvJpnSimulationResultTable;
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(getselectedavailablecameraids);
        }
    }

    private static void c(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2187, 40 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 841711447, false, $$g((byte) 43, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getMode(0) + 33017), TextUtils.getOffsetBefore("", 0) + 3011, 26 - (Process.myTid() >> 22), 321985076, false, $$g((byte) 49, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 36505), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3376, 17 - Color.green(0), -968507904, false, $$g((byte) 46, b4, b4), new Class[]{Object.class, Object.class});
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
            int i5 = $11 + 45;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b5 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - (Process.myTid() >> 22)), (KeyEvent.getMaxKeyCode() >> 16) + 3376, 16 - TextUtils.indexOf((CharSequence) "", '0'), -968507904, false, $$g((byte) 46, b5, b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
        int i7 = $11 + 45;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = -1870535734;
        long j = 0;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) - 1), 3291 - Color.red(0), View.getDefaultSize(0, 0) + 31, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i8++;
                    i5 = -1870535734;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = $10 + 49;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = new Object[i6];
                objArr3[i7] = Integer.valueOf(iArr5[i11]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) i7;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getTrimmedLength(""), 3290 - TextUtils.indexOf("", c), 32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i11++;
                int i12 = $11 + 103;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                iArr5 = iArr5;
                c = '0';
                i6 = 1;
                i7 = 0;
            }
            int i14 = $10 + 119;
            $11 = i14 % 128;
            i2 = 2;
            int i15 = i14 % 2;
            iArr5 = iArr6;
            i3 = 0;
        } else {
            i2 = 2;
            i3 = 0;
        }
        System.arraycopy(iArr5, i3, iArr4, i3, length2);
        sessionConfigValidatingBuilder.b = i2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            for (int i16 = 17; i16 > 1; i16--) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2559, ExpandableListView.getPackedPositionChild(0L) + 30, 683220507, false, $$g((byte) 56, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
            }
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - Gravity.getAbsoluteGravity(0, 0)), 348 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 24 - TextUtils.lastIndexOf("", '0'), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 263921. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    public static java.lang.Object[] b(android.content.Context r64, java.lang.String[] r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instruction units count: 26392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CameraIdUtil.b(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
    }

    private static String $$g(int i, short s, byte b2) {
        byte[] bArr = $$c;
        int i2 = i + 66;
        int i3 = 3 - (b2 * 3);
        int i4 = s * 2;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 += i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            i3++;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i3];
        }
    }
}
