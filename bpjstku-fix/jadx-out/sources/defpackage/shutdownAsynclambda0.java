package defpackage;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class shutdownAsynclambda0 extends accesssetMCameraXConfigProviderp {
    public PlayerConstants.PlayerError TuitionPaymentFragmentbindingInflater1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public float b;

    @Override // defpackage.accesssetMCameraXConfigProviderp, defpackage.setContext
    public final void b(accessgetActiveConcurrentCameraInfos accessgetactiveconcurrentcamerainfos, PlayerConstants.PlayerState playerState) {
        Intrinsics.checkNotNullParameter(accessgetactiveconcurrentcamerainfos, "");
        Intrinsics.checkNotNullParameter(playerState, "");
        int i = shutdownAsynclambda0$TuitionPaymentFragmentspecialinlinedviewModeldefault3$WhenMappings.$EnumSwitchMapping$0[playerState.ordinal()];
        if (i == 1 || i == 2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
        } else {
            if (i != 3) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        }
    }

    @Override // defpackage.accesssetMCameraXConfigProviderp, defpackage.setContext
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(accessgetActiveConcurrentCameraInfos accessgetactiveconcurrentcamerainfos, PlayerConstants.PlayerError playerError) {
        Intrinsics.checkNotNullParameter(accessgetactiveconcurrentcamerainfos, "");
        Intrinsics.checkNotNullParameter(playerError, "");
        if (playerError == PlayerConstants.PlayerError.HTML_5_PLAYER) {
            this.TuitionPaymentFragmentbindingInflater1 = playerError;
        }
    }

    @Override // defpackage.accesssetMCameraXConfigProviderp, defpackage.setContext
    public final void b(accessgetActiveConcurrentCameraInfos accessgetactiveconcurrentcamerainfos, float f) {
        Intrinsics.checkNotNullParameter(accessgetactiveconcurrentcamerainfos, "");
        this.b = f;
    }

    @Override // defpackage.accesssetMCameraXConfigProviderp, defpackage.setContext
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(accessgetActiveConcurrentCameraInfos accessgetactiveconcurrentcamerainfos, String str) {
        Intrinsics.checkNotNullParameter(accessgetactiveconcurrentcamerainfos, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
    }
}
