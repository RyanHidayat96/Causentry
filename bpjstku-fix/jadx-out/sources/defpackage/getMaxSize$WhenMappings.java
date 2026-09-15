package defpackage;

import com.kennyc.view.MultiStateView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {2, 3, 0})
public final /* synthetic */ class getMaxSize$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;

    static {
        int[] iArr = new int[MultiStateView.ViewState.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[MultiStateView.ViewState.LOADING.ordinal()] = 1;
        iArr[MultiStateView.ViewState.CONTENT.ordinal()] = 2;
        iArr[MultiStateView.ViewState.EMPTY.ordinal()] = 3;
        iArr[MultiStateView.ViewState.ERROR.ordinal()] = 4;
        int[] iArr2 = new int[MultiStateView.ViewState.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[MultiStateView.ViewState.LOADING.ordinal()] = 1;
        iArr2[MultiStateView.ViewState.EMPTY.ordinal()] = 2;
        iArr2[MultiStateView.ViewState.ERROR.ordinal()] = 3;
        iArr2[MultiStateView.ViewState.CONTENT.ordinal()] = 4;
        int[] iArr3 = new int[MultiStateView.ViewState.values().length];
        $EnumSwitchMapping$2 = iArr3;
        iArr3[MultiStateView.ViewState.CONTENT.ordinal()] = 1;
        int[] iArr4 = new int[MultiStateView.ViewState.values().length];
        $EnumSwitchMapping$3 = iArr4;
        iArr4[MultiStateView.ViewState.LOADING.ordinal()] = 1;
        iArr4[MultiStateView.ViewState.EMPTY.ordinal()] = 2;
        iArr4[MultiStateView.ViewState.ERROR.ordinal()] = 3;
        iArr4[MultiStateView.ViewState.CONTENT.ordinal()] = 4;
    }
}
