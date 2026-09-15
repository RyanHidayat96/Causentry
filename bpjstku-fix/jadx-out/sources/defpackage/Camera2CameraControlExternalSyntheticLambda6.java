package defpackage;

import com.bpjstku.R;
import com.bpjstku.presentation.program.model.ProgramInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class Camera2CameraControlExternalSyntheticLambda6 {
    public static final ArrayList<ProgramInfo> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        String string = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.label_old_day_security);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ProgramInfo programInfo = new ProgramInfo("JHT", string, R.drawable.ic_old_day_security, false);
        String string2 = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.label_work_accident_security);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        ProgramInfo programInfo2 = new ProgramInfo("JKK", string2, R.drawable.ic_work_accident_security, false);
        String string3 = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.label_death_security);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        ProgramInfo programInfo3 = new ProgramInfo("JKM", string3, R.drawable.ic_death_security, false);
        String string4 = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.label_pension_security);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        ProgramInfo programInfo4 = new ProgramInfo("JP", string4, R.drawable.ic_pension_security, false);
        String string5 = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.label_lost_job_security);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        return CollectionsKt.arrayListOf(programInfo, programInfo2, programInfo3, programInfo4, new ProgramInfo("JKP", string5, R.drawable.ic_loss_job_security, false));
    }

    public static final List<ProgramInfo> TuitionPaymentFragmentbindingInflater1(List<ProgramInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList<ProgramInfo> arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (list.isEmpty()) {
            return arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i = 0;
        for (Object obj : arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ProgramInfo programInfo = (ProgramInfo) obj;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.equals(programInfo.b, ((ProgramInfo) it.next()).b, false)) {
                    arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault3.set(i, ProgramInfo.b(programInfo, null, null, 0, true, 7));
                }
            }
            i++;
        }
        return arrayListTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
