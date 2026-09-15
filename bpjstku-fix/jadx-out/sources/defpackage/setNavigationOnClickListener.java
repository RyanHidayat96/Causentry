package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.bpjstku.presentation.membership.registration.model.ProgramChoosen;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class setNavigationOnClickListener extends setVirtualCameraRotationDegrees<ProgramChoosen, TuitionPaymentFragmentspecialinlinedviewModeldefault2> {
    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setNavigationOnClickListener(Context context, List<ProgramChoosen> list) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemProgramChosenBinding itemProgramChosenBindingInflate = ItemProgramChosenBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemProgramChosenBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, itemProgramChosenBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends VirtualCameraInfo<ProgramChoosen> {
        private static final byte[] $$a = {84, 10, 24, -102, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 24;
        private /* synthetic */ setNavigationOnClickListener TuitionPaymentFragmentbindingInflater1;
        private final ItemProgramChosenBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 + 4
                int r5 = r5 * 2
                int r5 = r5 + 84
                int r6 = r6 * 3
                int r0 = 53 - r6
                byte[] r1 = setNavigationOnClickListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                byte[] r0 = new byte[r0]
                int r6 = 52 - r6
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r5
                r5 = r6
                r4 = r2
                goto L2b
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r5
                int r7 = r7 + 1
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L29
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L29:
                r3 = r1[r7]
            L2b:
                int r5 = r5 + r3
                int r5 = r5 + (-11)
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: setNavigationOnClickListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2.a(int, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(setNavigationOnClickListener setnavigationonclicklistener, ItemProgramChosenBinding itemProgramChosenBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemProgramChosenBinding, "");
            this.TuitionPaymentFragmentbindingInflater1 = setnavigationonclicklistener;
            Context context = setnavigationonclicklistener.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemProgramChosenBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemProgramChosenBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ProgramChoosen programChoosen) throws Throwable {
            int iIntValue;
            int i;
            ProgramChoosen programChoosen2 = programChoosen;
            Intrinsics.checkNotNullParameter(programChoosen2, "");
            ItemProgramChosenBinding itemProgramChosenBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            AppCompatTextView appCompatTextView = itemProgramChosenBinding.tvProgramTitle;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            int i2 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - TextUtils.getOffsetBefore("", 0)), 40 - (ViewConfiguration.getScrollBarSize() >> 8), Color.argb(0, 0, 0, 0) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j = -495;
            long j2 = -1;
            long j3 = 4558923404123424860L ^ j2;
            long jMyUid = Process.myUid();
            long j4 = ((j3 | (j2 ^ (-2461666229381465873L))) ^ j2) | ((j3 | jMyUid) ^ j2);
            long j5 = (j * 4558923404123424860L) + (j * (-2461666229381465873L)) + (((long) 992) * j4) + (((long) (-496)) * ((((jMyUid ^ j2) | (-11558341662869249L)) ^ j2) | j4)) + (((long) 496) * (jMyUid | (-2461666229381465873L)));
            int i4 = 0;
            long j6 = jLongValue;
            try {
                while (i4 != 10) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (TypedValue.complexToFloat(i2) > 0.0f ? 1 : (TypedValue.complexToFloat(i2) == 0.0f ? 0 : -1)) + 59, View.getDefaultSize(i2, i2) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                    int i6 = i2;
                    long j7 = j6;
                    while (true) {
                        for (int i7 = i2; i7 != 8; i7++) {
                            int i8 = i5;
                            i5 = (((((int) (j7 >> i7)) & 255) + (i8 << 6)) + (i8 << 16)) - i8;
                        }
                        i = i5;
                        if (i6 != 0) {
                            break;
                        }
                        i6++;
                        j7 = j5;
                        i5 = i;
                        i2 = 0;
                    }
                    if (i == i3) {
                        appCompatTextView.setText(programChoosen2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        itemProgramChosenBinding.imgProgram.setImageResource(programChoosen2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        return;
                    } else {
                        j6 -= 1024;
                        i4++;
                        i2 = 0;
                    }
                }
                Object[] objArr = {351278164};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46038 - TextUtils.getTrimmedLength("")), 1133 - MotionEvent.axisFromString(""), TextUtils.lastIndexOf("", '0', 0, 0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr2 = {Integer.valueOf(iIntValue), 0, 120061363, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int defaultSize = View.getDefaultSize(0, 0) + 1031;
                    int i9 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                    byte[] bArr = $$a;
                    byte b = bArr[7];
                    Object[] objArr3 = new Object[1];
                    a(b, b, bArr[5], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, defaultSize, i9, 1298546779, false, (String) objArr3[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1116 - MotionEvent.axisFromString(""), 17 - TextUtils.getOffsetAfter("", 0)), Boolean.TYPE});
                }
                Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr2);
                int i10 = ((int[]) objArr4[1])[0];
                int i11 = ((int[]) objArr4[3])[0];
                if (i11 != i10) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr4[0];
                    if (strArr != null) {
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
                }
                appCompatTextView.setText(programChoosen2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                itemProgramChosenBinding.imgProgram.setImageResource(programChoosen2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                return;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
            iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, programChoosen2)).intValue();
        }
    }
}
