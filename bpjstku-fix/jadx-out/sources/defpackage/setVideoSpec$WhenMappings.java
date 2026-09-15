package defpackage;

import com.rtchagas.pingplacepicker.viewmodel.Resource;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {2, 3, 0})
public final /* synthetic */ class setVideoSpec$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[Resource.Status.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[Resource.Status.LOADING.ordinal()] = 1;
        iArr[Resource.Status.SUCCESS.ordinal()] = 2;
        iArr[Resource.Status.ERROR.ordinal()] = 3;
        iArr[Resource.Status.NO_DATA.ordinal()] = 4;
        int[] iArr2 = new int[Resource.Status.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[Resource.Status.LOADING.ordinal()] = 1;
        iArr2[Resource.Status.SUCCESS.ordinal()] = 2;
        iArr2[Resource.Status.ERROR.ordinal()] = 3;
        iArr2[Resource.Status.NO_DATA.ordinal()] = 4;
    }
}
